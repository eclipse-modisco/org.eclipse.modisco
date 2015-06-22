/*******************************************************************************
 * Copyright (c) 2009, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 341222 - customization on feature defined in another metamodel
 *******************************************************************************/

package org.eclipse.gmt.modisco.infra.browser.uicore.internal.customization;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.browser.custom.AttributeView;
import org.eclipse.gmt.modisco.infra.browser.custom.CustomView;
import org.eclipse.gmt.modisco.infra.browser.custom.CustomViewFeature;
import org.eclipse.gmt.modisco.infra.browser.custom.CustomizableFeatures;
import org.eclipse.gmt.modisco.infra.browser.custom.DerivedFeatureValue;
import org.eclipse.gmt.modisco.infra.browser.custom.FeatureValue;
import org.eclipse.gmt.modisco.infra.browser.custom.FeatureValueCase;
import org.eclipse.gmt.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.gmt.modisco.infra.browser.custom.ReferenceView;
import org.eclipse.gmt.modisco.infra.browser.custom.StaticFeatureValue;
import org.eclipse.gmt.modisco.infra.browser.custom.TypeView;
import org.eclipse.gmt.modisco.infra.browser.custom.core.CustomizationsCatalog;
import org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomFactory;
import org.eclipse.gmt.modisco.infra.browser.custom.util.OverlayIconInfo;
import org.eclipse.gmt.modisco.infra.browser.custom.util.UicustomUtil;
import org.eclipse.gmt.modisco.infra.browser.uicore.ChangeListener;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.Activator;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.Messages;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.util.EMFUtil;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.util.QueryUtil;
import org.eclipse.gmt.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog.ModiscoCatalogChangeListener;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.PathUtils;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.facet.Facet;
import org.eclipse.gmt.modisco.infra.facet.core.FacetSetCatalog;
import org.eclipse.gmt.modisco.infra.query.ModelQuery;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

/**
 * The customization engine reads customization models (that come from uiCustom files) and stores
 * them in a form that is more efficient at runtime. The model browser then calls it to customize
 * the display properties of model elements.
 * <p>
 * The following operations are done ahead of time (when <code>addCustomization</code> is called),
 * for performance reasons:
 * <ul>
 * <li>for each metaclass, build a list of its own and inherited features (when a metaclass has the
 * option "apply to sub-instances")
 * <li>build "metaclass -> customization", "attribute -> customization" and
 * "reference -> customization" {@link HashMap}s
 * <li>wrap the list of customized features in {@link EngineElementView}, to allow for constant time
 * access, and the "apply to sub-instances" option on metaclasses
 * <li>images, colors and fonts are decoded once and then kept in cache
 * </ul>
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class CustomizationEngine {

	private final Map<EClass, EngineElementView> engineTypeViews = new HashMap<EClass, EngineElementView>();
	private final Map<FeatureKey, EngineElementView> engineAttributeViews = new HashMap<FeatureKey, EngineElementView>();
	private final Map<FeatureKey, EngineElementView> engineReferenceViews = new HashMap<FeatureKey, EngineElementView>();

	private final Map<String, Color> colorsCache = new HashMap<String, Color>();
	private final Map<String, Font> fontsCache = new HashMap<String, Font>();
	private final Map<String, Image> iconsCache = new HashMap<String, Image>();

	/**
	 * Customizations that have been registered with the engine, but might not be loaded yet
	 */
	private List<MetamodelView> fRegisteredCustomizations = new ArrayList<MetamodelView>();
	private final List<String> fRegisteredMetamodels = new ArrayList<String>();

	/** Listens on customization changes to reload modified customizations */
	private ModiscoCatalogChangeListener customizationChangeListener;

	/**
	 * Wraps a CustomView to provide constant time access to its customized features, and allow for
	 * inheriting features from super-classes, and overriding features in subclasses
	 */
	private static class EngineElementView {
		private final List<CustomViewFeature> boldFeature = new ArrayList<CustomViewFeature>();
		private final List<CustomViewFeature> colorFeature = new ArrayList<CustomViewFeature>();
		private final List<CustomViewFeature> backgroundColorFeature = new ArrayList<CustomViewFeature>();
		private final List<CustomViewFeature> fontNameFeature = new ArrayList<CustomViewFeature>();
		private final List<CustomViewFeature> iconFeature = new ArrayList<CustomViewFeature>();
		private final List<CustomViewFeature> facetMainIconFeature = new ArrayList<CustomViewFeature>();
		private final List<CustomViewFeature> facetOverlayIconFeature = new ArrayList<CustomViewFeature>();
		private final List<CustomViewFeature> metaclassIconFeature = new ArrayList<CustomViewFeature>();
		private final List<CustomViewFeature> instanceIconFeature = new ArrayList<CustomViewFeature>();
		private final List<CustomViewFeature> stickerIconFeature = new ArrayList<CustomViewFeature>();
		private final List<CustomViewFeature> italicFeature = new ArrayList<CustomViewFeature>();
		private final List<CustomViewFeature> labelFeature = new ArrayList<CustomViewFeature>();
		private final List<CustomViewFeature> strikethroughFeature = new ArrayList<CustomViewFeature>();
		private final List<CustomViewFeature> underlinedFeature = new ArrayList<CustomViewFeature>();
		private final List<CustomViewFeature> visibleFeature = new ArrayList<CustomViewFeature>();
		private final List<CustomViewFeature> hideMetaclassNameFeature = new ArrayList<CustomViewFeature>();
		private final List<CustomViewFeature> metaclassVisibleFeature = new ArrayList<CustomViewFeature>();
		private final List<CustomViewFeature> linkCollapsedFeature = new ArrayList<CustomViewFeature>();

		/**
		 * Adds the features from the given customView. Existing features of the same type are
		 * overridden.
		 */
		public void addFeatures(final CustomView customView) {
			final EList<CustomViewFeature> customizedFeatures = customView.getCustomizedFeatures();
			for (final CustomViewFeature customViewFeature : customizedFeatures) {
				switch (customViewFeature.getCustomizedFeature()) {
				case BOLD:
					this.boldFeature.add(customViewFeature);
					break;
				case COLOR:
					this.colorFeature.add(customViewFeature);
					break;
				case BACKGROUND_COLOR:
					this.backgroundColorFeature.add(customViewFeature);
					break;
				case FONT_NAME:
					this.fontNameFeature.add(customViewFeature);
					break;
				case ICON:
					this.iconFeature.add(customViewFeature);
					break;
				case FACET_MAIN_ICON:
					this.facetMainIconFeature.add(customViewFeature);
					break;
				case FACET_OVERLAY_ICON:
					this.facetOverlayIconFeature.add(customViewFeature);
					break;
				case METACLASS_ICON:
					this.metaclassIconFeature.add(customViewFeature);
					break;
				case INSTANCE_ICON:
					this.instanceIconFeature.add(customViewFeature);
					break;
				case STICKER_ICON:
					this.stickerIconFeature.add(customViewFeature);
					break;
				case ITALIC:
					this.italicFeature.add(customViewFeature);
					break;
				case LABEL:
					this.labelFeature.add(customViewFeature);
					break;
				case STRUCKTHROUGH:
					this.strikethroughFeature.add(customViewFeature);
					break;
				case UNDERLINED:
					this.underlinedFeature.add(customViewFeature);
					break;
				case VISIBLE:
					this.visibleFeature.add(customViewFeature);
					break;
				case HIDE_METACLASS_NAME:
					this.hideMetaclassNameFeature.add(customViewFeature);
					break;
				case METACLASS_VISIBLE:
					this.metaclassVisibleFeature.add(customViewFeature);
					break;
				case COLLAPSE_LINK:
					this.linkCollapsedFeature.add(customViewFeature);
					break;
				default:
					MoDiscoLogger.logError("unhandled feature type in CustomizationEngine: " //$NON-NLS-1$
							+ customViewFeature, Activator.getDefault());
				}
			}
		}

		public List<CustomViewFeature> getBoldFeature() {
			return this.boldFeature;
		}

		public List<CustomViewFeature> getColorFeature() {
			return this.colorFeature;
		}

		public List<CustomViewFeature> getBackgroundColorFeature() {
			return this.backgroundColorFeature;
		}

		public List<CustomViewFeature> getFontNameFeature() {
			return this.fontNameFeature;
		}

		@Deprecated
		public List<CustomViewFeature> getIconFeature() {
			return this.iconFeature;
		}

		public List<CustomViewFeature> getInstanceIconFeature() {
			return this.instanceIconFeature;
		}

		public List<CustomViewFeature> getMetaclassIconFeature() {
			return this.metaclassIconFeature;
		}

		public List<CustomViewFeature> getStickerIconFeature() {
			return this.stickerIconFeature;
		}

		@Deprecated
		public List<CustomViewFeature> getFacetMainIconFeature() {
			return this.facetMainIconFeature;
		}

		public List<CustomViewFeature> getFacetOverlayIconFeature() {
			return this.facetOverlayIconFeature;
		}

		public List<CustomViewFeature> getItalicFeature() {
			return this.italicFeature;
		}

		public List<CustomViewFeature> getLabelFeature() {
			return this.labelFeature;
		}

		public List<CustomViewFeature> getStrikethroughFeature() {
			return this.strikethroughFeature;
		}

		public List<CustomViewFeature> getUnderlinedFeature() {
			return this.underlinedFeature;
		}

		public List<CustomViewFeature> getVisibleFeature() {
			return this.visibleFeature;
		}

		public List<CustomViewFeature> getHideMetaclassNameFeature() {
			return this.hideMetaclassNameFeature;
		}

		public List<CustomViewFeature> getMetaclassVisibleFeature() {
			return this.metaclassVisibleFeature;
		}

		public List<CustomViewFeature> getLinkCollapsedFeature() {
			return this.linkCollapsedFeature;
		}
	}

	/** A key for attributes or references in Maps */
	private static class FeatureKey {
		public FeatureKey(final EClass eClass, final String featureName) {
			this.eClass = eClass;
			this.featureName = featureName;
		}

		private final EClass eClass;
		private final String featureName;

		@Override
		public boolean equals(final Object obj) {
			if (obj instanceof FeatureKey) {
				final FeatureKey other = (FeatureKey) obj;
				return other.eClass.equals(this.eClass)
						&& other.featureName.equals(this.featureName);
			}
			return false;
		}

		@Override
		public int hashCode() {
			final int hashPrime1 = 37;
			final int hashPrime2 = 31;
			return this.eClass.hashCode() * hashPrime2 + this.featureName.hashCode() + hashPrime1;
		}
	}

	private final List<ChangeListener> changeListeners = new ArrayList<ChangeListener>();

	public void addChangeListener(final ChangeListener listener) {
		if (!this.changeListeners.contains(listener)) {
			this.changeListeners.add(listener);
		}
	}

	public void removeChangeListener(final ChangeListener listener) {
		this.changeListeners.remove(listener);
	}

	private void notifyChangeListeners() {
		for (final ChangeListener changeListener : this.changeListeners) {
			changeListener.changed();
		}
	}

	/** Removes all customizations from the engine */
	public void clear() {
		this.fRegisteredCustomizations.clear();
		this.fRegisteredMetamodels.clear();
		clearInternal();
	}

	private void clearInternal() {
		this.engineTypeViews.clear();
		this.engineAttributeViews.clear();
		this.engineReferenceViews.clear();
	}

	/**
	 * Adds the given customization to the engine. Once all customizations are added,
	 * {@link CustomizationEngine#loadCustomizations()} must be called to effectively load the
	 * registered customizations.
	 */
	public void registerCustomization(final MetamodelView metamodelView) {
		if (metamodelView == null) {
			throw new IllegalArgumentException("argument must not be null"); //$NON-NLS-1$
		}
		if (!this.fRegisteredCustomizations.contains(metamodelView)) {
			this.fRegisteredCustomizations.add(metamodelView);
		}
	}

	public List<MetamodelView> getRegisteredCustomizations() {
		return this.fRegisteredCustomizations;
	}

	public void registerMetamodel(final String metamodelURI) {
		if (metamodelURI == null) {
			throw new IllegalArgumentException("argument must not be null"); //$NON-NLS-1$
		}
		if (!this.fRegisteredMetamodels.contains(metamodelURI)) {
			this.fRegisteredMetamodels.add(metamodelURI);
		}
	}

	public List<String> getRegisteredMetamodels() {
		return this.fRegisteredMetamodels;
	}

	/**
	 * Loads or reloads the customizations registered by
	 * {@link CustomizationEngine#registerCustomization(MetamodelView)}.
	 */
	public void loadCustomizations() {
		clearInternal();
		for (final MetamodelView registeredCustomization : new ArrayList<MetamodelView>(
				this.fRegisteredCustomizations)) {
			loadCustomization(registeredCustomization, false);
		}
		// notify listeners once all customizations have been loaded
		notifyChangeListeners();

		if (this.customizationChangeListener != null) {
			CustomizationsCatalog.getInstance().removeChangeListener(
					this.customizationChangeListener);
		}

		/*
		 * Reload customizations when a customization is changed in the workspace
		 */
		this.customizationChangeListener = new ModiscoCatalogChangeListener() {
			public void changed(final EObject eObject, final IFile file) {
				final List<MetamodelView> newRegisteredCustomizations = new ArrayList<MetamodelView>();
				for (final MetamodelView registeredCustomization : CustomizationEngine.this.fRegisteredCustomizations) {
					// the catalog removed the customization from its resource
					if (registeredCustomization.eResource() == null) {
						if (!newRegisteredCustomizations.contains(eObject)) {
							newRegisteredCustomizations.add((MetamodelView) eObject);
							Display.getDefault().asyncExec(new Runnable() {
								public void run() {
									// reload all customizations
									loadCustomizations();
								}
							});
						}
					} else {
						newRegisteredCustomizations.add(registeredCustomization);
					}
				}
				CustomizationEngine.this.fRegisteredCustomizations = newRegisteredCustomizations;
			}

			public void added(final EObject eObject, final IFile file) {
				// nothing
			}

			public void removed(final IFile file) {
				// nothing
			}

		};
		CustomizationsCatalog.getInstance().addChangeListener(this.customizationChangeListener);

	}

	private void loadCustomization(final MetamodelView metamodelView, final boolean notifyListeners) {

		// make sure facets are loaded
		FacetSetCatalog.getSingleton();

		final String metamodelURI = metamodelView.getMetamodelURI();
		if (metamodelURI == null) {
			MoDiscoLogger.logError(
					NLS.bind(Messages.CustomizationEngine_couldNotFindMetamodel,
							metamodelView.getMetamodelURI()), Activator.getDefault());
			return;
		}

		List<String> otherMetamodels = new ArrayList<String>(getRegisteredMetamodels());
		otherMetamodels.remove(metamodelURI);

		final Set<EClass> metaclasses = new LinkedHashSet<EClass>();
		for (String registeredMetamodel : otherMetamodels) {
			List<EClass> otherMetaclasses = getMetaclasses(registeredMetamodel);
			if (otherMetaclasses != null) {
				metaclasses.addAll(otherMetaclasses);
			}
		}

		List<EClass> mainMetaclasses = getMetaclasses(metamodelURI);
		if (mainMetaclasses == null) {
			return;
		}
		metaclasses.addAll(mainMetaclasses);

		List<TypeView> types = new ArrayList<TypeView>(metamodelView.getTypes());
		final Map<String, TypeView> typeViewMap = new HashMap<String, TypeView>();
		for (TypeView typeView : types) {
			typeViewMap.put(typeView.getMetaclassName(), typeView);
		}

		final Map<String, EClass> metaclassMap = new HashMap<String, EClass>();
		/*
		 * create a type view for each metaclass, so that subtypes can inherit the customized
		 * features of their supertypes
		 */
		for (final EClass eClass : metaclasses) {
			String metaclassQualifiedName = ModelUtils.getMetaclassQualifiedName(eClass);
			metaclassMap.put(metaclassQualifiedName, eClass);
			if (typeViewMap.get(metaclassQualifiedName) == null) {
				final TypeView typeView = UicustomFactory.eINSTANCE.createTypeView();
				typeView.setMetaclassName(metaclassQualifiedName);
				types.add(typeView);
				typeViewMap.put(metaclassQualifiedName, typeView);
			}
		}

		// type views
		for (final TypeView type : new ArrayList<TypeView>(types)) {
			EClass eClass = metaclassMap.get(type.getMetaclassName());
			associateEClassAndStructuralFeatures(eClass, type, types, typeViewMap);
		}

		if (notifyListeners) {
			notifyChangeListeners();
		}
	}

	private boolean associateEClassAndStructuralFeatures(final EClass eClass, final TypeView type,
			final List<TypeView> types, final Map<String, TypeView> typeViewMap) {
		if (eClass == null) {
			MoDiscoLogger.logError(
					NLS.bind(Messages.CustomizationEngine_coundNotFindEclass,
							type.getMetaclassName()), Activator.getDefault());
			return false;
		}

		addTypeView(eClass, type, types, typeViewMap);

		final EList<EClass> eAllSuperTypes = new BasicEList<EClass>(eClass.getEAllSuperTypes());
		Collections.reverse(eAllSuperTypes);

		// direct attribute and reference views
		addAttributeViews(eClass, type);
		addReferenceViews(eClass, type);

		// inherited attribute and reference views
		// apply from most specific to most general, because the first one is
		// chosen
		for (EClass eSuperType : eAllSuperTypes) {
			final TypeView superTypeView = typeViewMap.get(ModelUtils
					.getMetaclassQualifiedName(eSuperType));
			if (superTypeView != null && superTypeView.isAppliesToSubInstances()) {
				addAttributeViews(eClass, superTypeView);
				addReferenceViews(eClass, superTypeView);
			}
		}

		return true;
	}

	private void addAttributeViews(final EClass eClass, final TypeView type) {

		final EList<AttributeView> attributes = type.getAttributes();
		for (final AttributeView attribute : attributes) {
			final FeatureKey featureKey = new FeatureKey(eClass, attribute.getAttributeName());
			EngineElementView engineElementView = this.engineAttributeViews.get(featureKey);
			if (engineElementView == null) {
				engineElementView = new EngineElementView();
			}
			engineElementView.addFeatures(attribute);
			this.engineAttributeViews.put(featureKey, engineElementView);
		}
	}

	private void addReferenceViews(final EClass eClass, final TypeView type) {
		// reference views
		final EList<ReferenceView> references = type.getReferences();
		for (final ReferenceView reference : references) {
			final FeatureKey featureKey = new FeatureKey(eClass, reference.getReferenceName());
			EngineElementView engineElementView = this.engineReferenceViews.get(featureKey);
			if (engineElementView == null) {
				engineElementView = new EngineElementView();
			}
			engineElementView.addFeatures(reference);
			this.engineReferenceViews.put(featureKey, engineElementView);
		}
	}

	/**
	 * Add the given type view to the engine type views
	 * 
	 * @param eClass
	 *            the metaclass corresponding to the typeView
	 * @param typeView
	 *            the type view to add
	 * @param types
	 *            list of all type views in the customization
	 * @param typeViewMap
	 */
	private void addTypeView(final EClass eClass, final TypeView typeView,
			final List<TypeView> types, final Map<String, TypeView> typeViewMap) {
		EngineElementView engineElementView = this.engineTypeViews.get(eClass);
		if (engineElementView == null) {
			engineElementView = new EngineElementView();
		}

		/*
		 * for each superclass with "applies to sub-instances" set to true, apply the superclass
		 * features to this subclass (from most specific to most generic, to respect the order of
		 * evaluation)
		 * 
		 * So we have to reverse the order of super type hierarchy
		 */
		engineElementView.addFeatures(typeView);
		final EList<EClass> eAllSuperTypes = new BasicEList<EClass>(eClass.getEAllSuperTypes());
		Collections.reverse(eAllSuperTypes);
		for (final EClass eSuperType : eAllSuperTypes) {
			final TypeView superTypeView = typeViewMap.get(ModelUtils
					.getMetaclassQualifiedName(eSuperType));
			if (superTypeView != null && superTypeView.isAppliesToSubInstances()) {
				engineElementView.addFeatures(superTypeView);
			}
		}

		this.engineTypeViews.put(eClass, engineElementView);
	}

	/**
	 * @return a list of metaclasses from the given metamodel or <code>null</code> if the metamodel
	 *         cannot be found in the EMF registry
	 */
	private List<EClass> getMetaclasses(final String metamodelURI) {
		final EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(metamodelURI);
		if (ePackage == null) {
			MoDiscoLogger.logError(
					NLS.bind(Messages.CustomizationEngine_metamodelNotFound, metamodelURI),
					Activator.getDefault());
			return null;
		}
		final Resource resource = ePackage.eResource();
		if (resource == null) {
			throw new RuntimeException(NLS.bind(Messages.CustomizationEngine_resourceMustNotBeNull,
					metamodelURI));
		}
		final List<EClass> eClasses = new ArrayList<EClass>();
		final TreeIterator<EObject> allContents = resource.getAllContents();
		while (allContents.hasNext()) {
			final EObject eObject = allContents.next();
			if (eObject instanceof EClass) {
				final EClass eClass = (EClass) eObject;
				eClasses.add(eClass);
			}
		}
		return eClasses;
	}

	private EngineElementView getAttributeView(final EClass eClass, final String name) {
		final FeatureKey featureKey = new FeatureKey(eClass, name);
		final EngineElementView elementView = this.engineAttributeViews.get(featureKey);
		return elementView;
	}

	private EngineElementView getReferenceView(final EClass eClass, final String name) {
		final FeatureKey featureKey = new FeatureKey(eClass, name);
		final EngineElementView elementView = this.engineReferenceViews.get(featureKey);
		return elementView;
	}

	/** @return the customized visibility for the given model element */
	public boolean isTypeVisible(final EClass eClass, final EObject context) {
		final EngineElementView elementView = this.engineTypeViews.get(eClass);
		return isVisible(elementView, context);
	}

	/** @return the customized visibility for the given attribute */
	public boolean isAttributeVisible(final EClass eClass, final String name, final EObject context) {
		return isVisible(getAttributeView(eClass, name), context);
	}

	/** @return the customized visibility for the given reference */
	public boolean isReferenceVisible(final EClass eClass, final String name, final EObject context) {
		return isVisible(getReferenceView(eClass, name), context);
	}

	private boolean isVisible(final EngineElementView elementView, final EObject context) {
		if (elementView != null) {
			final List<CustomViewFeature> visibleFeature = elementView.getVisibleFeature();
			if (visibleFeature != null) {
				final Object value = getValue(visibleFeature, context);
				if (value instanceof Boolean) {
					final Boolean result = (Boolean) value;
					return result.booleanValue();
				}
			}
		}
		return getDefaultVisibility();
	}

	private boolean getDefaultVisibility() {
		return true;
	}

	/** @return the customized visibility for the given metaclass */
	public boolean isMetaclassVisible(final EClass eClass) {
		final EngineElementView elementView = this.engineTypeViews.get(eClass);
		return isMetaclassVisible(elementView);
	}

	private boolean isMetaclassVisible(final EngineElementView elementView) {
		if (elementView != null) {
			final List<CustomViewFeature> visibleFeature = elementView.getMetaclassVisibleFeature();
			if (visibleFeature != null) {
				final Object value = getValue(visibleFeature, null);
				if (value instanceof Boolean) {
					final Boolean result = (Boolean) value;
					return result.booleanValue();
				}
			}
		}
		return getDefaultMetaclassVisibility();
	}

	private boolean getDefaultMetaclassVisibility() {
		return true;
	}

	public boolean isHideMetaclassName(final EClass eClass, final EObject context) {
		final EngineElementView elementView = this.engineTypeViews.get(eClass);
		if (elementView != null) {
			final List<CustomViewFeature> feature = elementView.getHideMetaclassNameFeature();
			if (feature != null) {
				final Object value = getValue(feature, context);
				if (value instanceof Boolean) {
					final Boolean result = (Boolean) value;
					return result.booleanValue();
				}
			}
		}
		return getDefaultHideMetaclassName();
	}

	private boolean getDefaultHideMetaclassName() {
		return false;
	}

	public boolean isLinkCollapsed(final EClass eClass, final EReference eReference) {
		EngineElementView referenceView = getReferenceView(eClass, eReference.getName());
		if (referenceView != null) {
			List<CustomViewFeature> feature = referenceView.getLinkCollapsedFeature();
			if (feature != null) {
				final Object value = getValue(feature, null);
				if (value instanceof Boolean) {
					final Boolean result = (Boolean) value;
					return result.booleanValue();
				}
			}
		}
		return getDefaultLinkCollapsed();
	}

	private boolean getDefaultLinkCollapsed() {
		return false;
	}

	/** @return a new list of elements in which only visible items are present */
	public ArrayList<Object> filterVisible(final List<?> childrenList) {
		final ArrayList<Object> visibleElements = new ArrayList<Object>();
		for (final Object object : childrenList) {
			if (object instanceof EObject) {
				EObject eObject = (EObject) object;
				if (isTypeVisible(eObject.eClass(), eObject)) {
					visibleElements.add(eObject);
				}
			} else {
				// not an EObject => cannot be customized => always visible
				visibleElements.add(object);
			}
		}
		return visibleElements;
	}

	/** add visible elements from the first list to the second one */
	public void filterVisible(final Collection<EObject> elements,
			final Collection<EObject> visibleElements) {
		for (final EObject eObject : elements) {
			if ((eObject != null) && (isTypeVisible(eObject.eClass(), eObject))) {
				visibleElements.add(eObject);
			}
		}
	}

	/** @return the customized color for the given model element */
	public Color getTypeColor(final EObject eObject) {
		final EngineElementView elementView = this.engineTypeViews.get(eObject.eClass());
		return getColor(elementView, eObject);
	}

	/** @return the customized color for the given attribute */
	public Color getAttributeColor(final EClass eClass, final String name, final EObject context) {
		return getColor(getAttributeView(eClass, name), context);
	}

	/** @return the customized color for the given reference */
	public Color getReferenceColor(final EClass eClass, final String name, final EObject context) {
		return getColor(getReferenceView(eClass, name), context);
	}

	private Color getColor(final EngineElementView elementView, final EObject context) {
		if (elementView != null) {
			final List<CustomViewFeature> colorFeature = elementView.getColorFeature();
			if (colorFeature != null) {
				final Object value = getValue(colorFeature, context);
				if (value instanceof Color) {
					final Color result = (Color) value;
					return result;
				}
			}
		}
		return getDefaultColor();
	}

	private Color getDefaultColor() {
		return null;
	}

	/** @return the customized background color for the given model element */
	public Color getTypeBackgroundColor(final EObject eObject) {
		final EngineElementView elementView = this.engineTypeViews.get(eObject.eClass());
		return getBackgroundColor(elementView, eObject);
	}

	/** @return the customized background color for the given attribute */
	public Color getAttributeBackgroundColor(final EClass eClass, final String name,
			final EObject context) {
		return getBackgroundColor(getAttributeView(eClass, name), context);
	}

	/** @return the customized background color for the given reference */
	public Color getReferenceBackgroundColor(final EClass eClass, final String name,
			final EObject context) {
		return getBackgroundColor(getReferenceView(eClass, name), context);
	}

	private Color getBackgroundColor(final EngineElementView elementView, final EObject context) {
		if (elementView != null) {
			final List<CustomViewFeature> colorFeature = elementView.getBackgroundColorFeature();
			if (colorFeature != null) {
				final Object value = getValue(colorFeature, context);
				if (value instanceof Color) {
					final Color result = (Color) value;
					return result;
				}
			}
		}
		return getDefaultBackgroundColor();
	}

	private Color getDefaultBackgroundColor() {
		return null;
	}

	/** @return the customized label for the given model element */
	public String getTypeLabel(final EObject eObject) {
		final EngineElementView elementView = this.engineTypeViews.get(eObject.eClass());
		return getLabel(elementView, eObject);
	}

	/** @return the customized label for the given attribute */
	public String getAttributeLabel(final EClass eClass, final String name, final EObject context) {
		return getLabel(getAttributeView(eClass, name), context);
	}

	/** @return the customized label for the given reference */
	public String getReferenceLabel(final EClass eClass, final String name, final EObject context) {
		return getLabel(getReferenceView(eClass, name), context);
	}

	private String getLabel(final EngineElementView elementView, final EObject context) {
		if (elementView != null) {
			final List<CustomViewFeature> feature = elementView.getLabelFeature();
			if (feature != null) {
				final Object value = getValue(feature, context);
				if (value instanceof String) {
					final String result = (String) value;
					return result;
				}
			}
		}
		return getDefaultLabel();
	}

	private String getDefaultLabel() {
		return null;
	}

	/**
	 * Get a customized icon for a type.
	 * 
	 * @param context
	 *            the context that is passed to condition queries (may be <code>null</code>)
	 * @param eClass
	 *            the {@link EClass} for which to get an icon (may not be the same as
	 *            <code>context.eClass()</code>: can be a {@link Facet})
	 * @return the customized icon for the given {@link EClass}
	 * 
	 * @deprecated replaced by instanceIcon, metaclassIcon, stickerIcon (see Bug 328473)
	 * */
	@Deprecated
	public Image getTypeIcon(final EObject context, final EClass eClass) {
		final EngineElementView elementView = this.engineTypeViews.get(eClass);
		return getIcon(elementView, context);
	}

	/**
	 * Get a customized icon for an instance.
	 * 
	 * @param context
	 *            the context that is passed to condition queries (may be <code>null</code>)
	 * @param eClass
	 *            the {@link EClass} for which to get an icon (may not be the same as
	 *            <code>context.eClass()</code>: can be a {@link Facet})
	 * @return the customized icon for the given {@link EClass}
	 * */
	public Image getInstanceIcon(final EObject context, final EClass eClass) {
		final EngineElementView elementView = this.engineTypeViews.get(eClass);
		return getInstanceIcon(elementView, context);
	}

	public Image getMetaclassIcon(final EObject context, final EClass eClass) {
		final EngineElementView elementView = this.engineTypeViews.get(eClass);
		return getMetaclassIcon(elementView, context);
	}

	public Image getStickerIcon(final EObject context, final EClass eClass) {
		final EngineElementView elementView = this.engineTypeViews.get(eClass);
		return getStickerIcon(elementView, context);
	}

	/** @return the customized icon for the given attribute */
	public Image getAttributeIcon(final EClass eClass, final String name, final EObject context) {
		return getInstanceIcon(getAttributeView(eClass, name), context);
	}

	/** @return the customized icon for the given reference */
	public Image getReferenceIcon(final EClass eClass, final String name, final EObject context) {
		return getInstanceIcon(getReferenceView(eClass, name), context);
	}

	private Image getInstanceIcon(final EngineElementView elementView, final EObject context) {
		if (elementView != null) {
			final List<CustomViewFeature> feature = elementView.getInstanceIconFeature();
			return getIcon(context, feature);
		}
		return getDefaultIcon();
	}

	private Image getMetaclassIcon(final EngineElementView elementView, final EObject context) {
		if (elementView != null) {
			final List<CustomViewFeature> feature = elementView.getMetaclassIconFeature();
			return getIcon(context, feature);
		}
		return getDefaultIcon();
	}

	private Image getStickerIcon(final EngineElementView elementView, final EObject context) {
		if (elementView != null) {
			final List<CustomViewFeature> feature = elementView.getStickerIconFeature();
			return getIcon(context, feature);
		}
		return getDefaultIcon();
	}

	@Deprecated
	private Image getIcon(final EngineElementView elementView, final EObject context) {
		if (elementView != null) {
			final List<CustomViewFeature> feature = elementView.getIconFeature();
			return getIcon(context, feature);
		}
		return getDefaultIcon();
	}

	private Image getIcon(final EObject context, final List<CustomViewFeature> feature) {
		if (feature != null) {
			final Object value = getValue(feature, context);
			if (value instanceof Image) {
				final Image result = (Image) value;
				return result;
			}
		}
		return null;
	}

	private Image getDefaultIcon() {
		return null;
	}

	/**
	 * @return the customized icon for the given model element and facet.
	 */
	@Deprecated
	public Image getFacetMainIcon(final EObject eObject, final EClass facet) {
		final EngineElementView elementView = this.engineTypeViews.get(facet);
		if (elementView != null) {
			List<CustomViewFeature> facetMainIconFeature = elementView.getFacetMainIconFeature();
			return getIcon(eObject, facetMainIconFeature);
		}
		return null;
	}

	/**
	 * @return the customized overlay icon for the given model element and facet.
	 */
	public OverlayIconImageInfo getFacetOverlayIcon(final EObject eObject, final EClass facet) {
		final EngineElementView elementView = this.engineTypeViews.get(facet);
		if (elementView != null) {
			List<CustomViewFeature> facetOverlayIconFeature = elementView
					.getFacetOverlayIconFeature();
			return getOverlayIcon(eObject, facetOverlayIconFeature);
		}
		return null;
	}

	private OverlayIconImageInfo getOverlayIcon(final EObject context,
			final List<CustomViewFeature> facetOverlayIconFeature) {
		if (facetOverlayIconFeature != null) {
			final Object value = getValue(facetOverlayIconFeature, context);
			if (value instanceof OverlayIconImageInfo) {
				final OverlayIconImageInfo result = (OverlayIconImageInfo) value;
				return result;
			}
		}
		return null;
	}

	/** @return the customized underline for the given model element */
	public boolean isTypeUnderlined(final EClass eClass, final EObject context) {
		final EngineElementView elementView = this.engineTypeViews.get(eClass);
		return isUnderlined(elementView, context);
	}

	/** @return the customized underline for the given attribute */
	public boolean isAttributeUnderlined(final EClass eClass, final String name,
			final EObject context) {
		return isUnderlined(getAttributeView(eClass, name), context);
	}

	/** @return the customized underline for the given reference */
	public boolean isReferenceUnderlined(final EClass eClass, final String name,
			final EObject context) {
		return isUnderlined(getReferenceView(eClass, name), context);
	}

	private boolean isUnderlined(final EngineElementView elementView, final EObject context) {
		if (elementView != null) {
			final List<CustomViewFeature> feature = elementView.getUnderlinedFeature();
			if (feature != null) {
				final Object value = getValue(feature, context);
				if (value instanceof Boolean) {
					final Boolean result = (Boolean) value;
					return result.booleanValue();
				}
			}
		}
		return getDefaultUnderlined();
	}

	private boolean getDefaultUnderlined() {
		return false;
	}

	/** @return the customized strikethrough for the given model element */
	public boolean isTypeStruckthrough(final EClass eClass, final EObject context) {
		final EngineElementView elementView = this.engineTypeViews.get(eClass);
		return isStruckthrough(elementView, context);
	}

	/** @return the customized strikethrough for the given attribute */
	public boolean isAttributeStruckthrough(final EClass eClass, final String name,
			final EObject context) {
		return isStruckthrough(getAttributeView(eClass, name), context);
	}

	/** @return the customized strikethrough for the given reference */
	public boolean isReferenceStruckthrough(final EClass eClass, final String name,
			final EObject context) {
		return isStruckthrough(getReferenceView(eClass, name), context);
	}

	private boolean isStruckthrough(final EngineElementView elementView, final EObject context) {
		if (elementView != null) {
			final List<CustomViewFeature> feature = elementView.getStrikethroughFeature();
			if (feature != null) {
				final Object value = getValue(feature, context);
				if (value instanceof Boolean) {
					final Boolean result = (Boolean) value;
					return result.booleanValue();
				}
			}
		}
		return getDefaultStruckthrough();
	}

	private boolean getDefaultStruckthrough() {
		return false;
	}

	// /** @return the customized italic property for the given model element */
	// public boolean isItalic(EObject eObject) {
	// EngineElementView elementView = engineTypeViews.get(eObject.eClass());
	// return isItalic(elementView);
	// }
	//
	// /** @return the customized italic property for the given attribute */
	// public boolean isAttributeItalic(EClass eClass, String name) {
	// return isItalic(getAttributeView(eClass, name));
	// }
	//
	// /** @return the customized italic property for the given reference */
	// public boolean isReferenceItalic(EClass eClass, String name) {
	// return isItalic(getReferenceView(eClass, name));
	// }

	private boolean isItalic(final EngineElementView elementView, final EObject context) {
		if (elementView != null) {
			final List<CustomViewFeature> italicFeature = elementView.getItalicFeature();
			if (italicFeature != null) {
				final Object value = getValue(italicFeature, context);
				if (value instanceof Boolean) {
					final Boolean result = (Boolean) value;
					return result.booleanValue();
				}
			}
		}
		return getDefaultItalic();
	}

	private boolean getDefaultItalic() {
		return false;
	}

	// /** @return the customized bold property for the given model element */
	// public boolean isBold(EObject eObject) {
	// EngineElementView elementView = engineTypeViews.get(eObject.eClass());
	// if (elementView != null) {
	// CustomViewFeature boldFeature = elementView.getBoldFeature();
	// if (boldFeature != null) {
	// Object value = getValue(boldFeature);
	// if (value instanceof Boolean) {
	// Boolean result = (Boolean) value;
	// return result;
	// }
	// }
	// }
	// return getDefaultBold();
	// }

	/** @return the customized bold property for the given model element */
	private boolean isBold(final EngineElementView elementView, final EObject context) {
		if (elementView != null) {
			final List<CustomViewFeature> boldFeature = elementView.getBoldFeature();
			if (boldFeature != null) {
				final Object value = getValue(boldFeature, context);
				if (value instanceof Boolean) {
					final Boolean result = (Boolean) value;
					return result.booleanValue();
				}
			}
		}
		return getDefaultBold();
	}

	private boolean getDefaultBold() {
		return false;
	}

	// /** @return the customized font name property for the given model element
	// */
	// public String getFontName(EObject eObject) {
	// EngineElementView elementView = engineTypeViews.get(eObject.eClass());
	// if (elementView != null) {
	// CustomViewFeature fontNameFeature = elementView.getFontNameFeature();
	// if (fontNameFeature != null) {
	// Object value = getValue(fontNameFeature);
	// if (value instanceof String) {
	// String result = (String) value;
	// return result;
	// }
	// }
	// }
	// return getDefaultFontName();
	// }

	/** @return the customized font name property for the given model element */
	private String getFontName(final EngineElementView elementView, final EObject context) {
		if (elementView != null) {
			final List<CustomViewFeature> fontNameFeature = elementView.getFontNameFeature();
			if (fontNameFeature != null) {
				final Object value = getValue(fontNameFeature, context);
				if (value instanceof String) {
					final String result = (String) value;
					return result;
				}
			}
		}
		return getDefaultFontName();
	}

	private String getDefaultFontName() {
		return null;
	}

	/** @return the customized font for the given model element */
	public Font getCustomizedTypeFont(final EObject eObject, final Font baseFont) {
		final EngineElementView elementView = this.engineTypeViews.get(eObject.eClass());
		return getCustomizedFont(elementView, baseFont, eObject);
	}

	/** @return the customized icon for the given attribute */
	public Font getCustomizedAttributeFont(final EClass eClass, final String name,
			final Font baseFont, final EObject context) {
		return getCustomizedFont(getAttributeView(eClass, name), baseFont, context);
	}

	/** @return the customized icon for the given reference */
	public Font getCustomizedReferenceFont(final EClass eClass, final String name,
			final Font baseFont, final EObject context) {
		return getCustomizedFont(getReferenceView(eClass, name), baseFont, context);
	}

	/**
	 * @return the baseFont with added customized styles or <code>null</code> if no styles are
	 *         customized
	 */
	private Font getCustomizedFont(final EngineElementView elementView, final Font baseFont,
			final EObject context) {
		final boolean italic = isItalic(elementView, context);
		final boolean bold = isBold(elementView, context);
		final String fontName = getFontName(elementView, context);

		if (italic || bold || (fontName != null)) {
			FontDescriptor descriptor;
			if (fontName != null) {
				final FontData fontData = baseFont.getFontData()[0];
				descriptor = FontDescriptor.createFrom(fontName, fontData.getHeight(),
						fontData.getStyle());
			} else {
				descriptor = FontDescriptor.createFrom(baseFont);
			}

			// descriptor = descriptor.setStyle((italic ? SWT.ITALIC : 0) |
			// (bold ? SWT.BOLD : 0));
			if (italic && bold) {
				descriptor = descriptor.setStyle(SWT.ITALIC | SWT.BOLD);
			} else if (italic) {
				descriptor = descriptor.setStyle(SWT.ITALIC);
			} else if (bold) {
				descriptor = descriptor.setStyle(SWT.BOLD);
			} else {
				descriptor = descriptor.setStyle(SWT.NONE);
			}
			return getFont(descriptor);
		}
		return null;
	}

	/**
	 * @return the {@link Font} corresponding to the given font descriptor. Fonts are kept in cache
	 *         to minimize use of resources and achieve better performance.
	 */
	private Font getFont(final FontDescriptor descriptor) {
		final FontData fontData = descriptor.getFontData()[0];
		final String key = fontData.getName() + "$" + fontData.getHeight() + "$" //$NON-NLS-1$ //$NON-NLS-2$
				+ fontData.getStyle();

		Font font = this.fontsCache.get(key);
		if (font == null) {
			font = descriptor.createFont(Display.getDefault());
			this.fontsCache.put(key, font);
		}
		return font;
	}

	/**
	 * @return the value of the given features collection, or <code>null</code> if it is not
	 *         specified (default value)
	 */
	private Object getValue(final List<CustomViewFeature> features, final EObject context) {
		Object result = null;
		for (CustomViewFeature feature : features) {
			result = getValue(feature, context);
			if (result != null) {
				// we have a value, no need to compute further conditions
				break;
			}
		}
		return result;
	}

	/**
	 * @return the value of the given feature, or <code>null</code>
	 */
	private Object getValue(final CustomViewFeature feature, final EObject context) {
		final EList<FeatureValueCase> valueCases = feature.getValueCases();
		// return the value of the first case evaluating to true
		for (final FeatureValueCase featureValueCase : valueCases) {
			final ModelQuery conditionQuery = featureValueCase.getCondition();
			if (EMFUtil.tryResolve(conditionQuery)) {
				// no sense in calling a condition query with a null context
				if (context != null) {
					final String querySetName = conditionQuery.getModelQuerySet().getName();
					final String queryName = conditionQuery.getName();
					final Object conditionResult = QueryUtil.basicEvaluate(conditionQuery, context);
					if (conditionResult == null) {
						continue;
					}
					if (conditionResult instanceof Boolean) {
						final Boolean boolResult = (Boolean) conditionResult;
						if (boolResult.booleanValue()) {
							final FeatureValue value = featureValueCase.getValue();
							return evaluate(context, value);
						}
					} else {
						MoDiscoLogger.logError(NLS.bind(
								Messages.CustomizationEngine_conditionQueryWrongReturnType,
								new Object[] { queryName, querySetName,
										conditionResult.getClass().getSimpleName() }), Activator
								.getDefault());
						continue;
					}
				}
			} else {
				MoDiscoLogger.logError(
						NLS.bind(Messages.CustomizationEngine_unresolvedConditionQuery,
								EMFUtil.proxyURI(conditionQuery)), Activator.getDefault());
			}
		}

		// if all cases evaluated to false (or there was no case)
		final FeatureValue defaultValue = feature.getDefaultValue();
		if (defaultValue != null) {
			return evaluate(context, defaultValue);
		}

		return null;
	}

	private Object evaluate(final EObject context, final FeatureValue featureValue) {
		if (featureValue instanceof StaticFeatureValue) {
			final StaticFeatureValue staticFeatureValue = (StaticFeatureValue) featureValue;
			final String strValue = staticFeatureValue.getValue();
			if (strValue != null) {
				return decodeStaticValue(strValue,
						UicustomUtil.getCustomizedFeature(staticFeatureValue));
			}
		} else if (featureValue instanceof DerivedFeatureValue) {
			final DerivedFeatureValue derivedFeatureValue = (DerivedFeatureValue) featureValue;
			final ModelQuery query = derivedFeatureValue.getValueCalculator();
			if (!EMFUtil.tryResolve(query)) {
				MoDiscoLogger.logError(NLS.bind(Messages.unresolvedQuery, EMFUtil.proxyURI(query)),
						Activator.getDefault());
			}
			final Object modelQueryResult = QueryUtil.basicEvaluate(query, context);
			return decodeDerivedValue(modelQueryResult,
					UicustomUtil.getCustomizedFeature(derivedFeatureValue), query.getName());
		}
		return null;
	}

	/**
	 * @return the Object corresponding to the given string encoding the value, for the given
	 *         feature type
	 */
	private Object decodeStaticValue(final String strValue, final CustomizableFeatures featureType) {
		switch (featureType) {
		case BOLD:
		case ITALIC:
		case STRUCKTHROUGH:
		case UNDERLINED:
		case VISIBLE:
		case HIDE_METACLASS_NAME:
		case METACLASS_VISIBLE:
		case COLLAPSE_LINK:
			return Boolean.valueOf(strValue);
		case COLOR:
		case BACKGROUND_COLOR:
			return decodeColor(strValue);
		case FONT_NAME:
			return decodeFont(strValue);
		case ICON:
		case FACET_MAIN_ICON:
		case METACLASS_ICON:
		case INSTANCE_ICON:
		case STICKER_ICON:
			return decodeIcon(strValue);
		case FACET_OVERLAY_ICON:
			return decodeOverlayIcon(strValue);
		case LABEL:
			return strValue;
		default:
			MoDiscoLogger.logError("unhandled feature type in CustomizationEngine:" //$NON-NLS-1$
					+ featureType.getName(), Activator.getDefault());
		}
		return null;
	}

	private Object decodeDerivedValue(final Object modelQueryResult,
			final CustomizableFeatures featureType, final String queryName) {
		switch (featureType) {
		case BOLD:
		case ITALIC:
		case STRUCKTHROUGH:
		case UNDERLINED:
		case VISIBLE:
		case METACLASS_VISIBLE:
		case HIDE_METACLASS_NAME:
		case FONT_NAME:
		case LABEL:
		case COLLAPSE_LINK:
			// no decoding necessary
			return modelQueryResult;
		case COLOR:
		case BACKGROUND_COLOR:
			if (!(modelQueryResult instanceof String)) {
				MoDiscoLogger.logError(
						NLS.bind(Messages.CustomizationEngine_errorColorString, queryName),
						Activator.getDefault());
				return null;
			}
			final String strColor = (String) modelQueryResult;
			return decodeColor(strColor);
		case ICON:
		case METACLASS_ICON:
		case INSTANCE_ICON:
		case STICKER_ICON:
		case FACET_MAIN_ICON:
			if (!(modelQueryResult instanceof String)) {
				MoDiscoLogger.logError(
						NLS.bind(Messages.CustomizationEngine_errorIconString, queryName),
						Activator.getDefault());
				return null;
			}
			final String strIcon = (String) modelQueryResult;
			return decodeIcon(strIcon);
		case FACET_OVERLAY_ICON:
			if (!(modelQueryResult instanceof String)) {
				MoDiscoLogger
						.logError(
								NLS.bind(
										"Customized overlay icon should be expressed " //$NON-NLS-1$
												+ "as a String (\"path:position\") in query \"{0}\"", queryName), Activator.getDefault()); //$NON-NLS-1$
				return null;
			}
			final String strOverlayIcon = (String) modelQueryResult;
			return decodeOverlayIcon(strOverlayIcon);
		default:
			MoDiscoLogger.logError("unhandled feature type in CustomizationEngine: " //$NON-NLS-1$
					+ featureType.getName(), Activator.getDefault());
		}
		return null;
	}

	/**
	 * @return the {@link Color} corresponding to the given color string encoded as "(R,G,B)".
	 *         Colors are kept in cache to minimize use of resources and achieve better performance.
	 */
	private Color decodeColor(final String strValue) {
		Color color = this.colorsCache.get(strValue);
		if (color == null) {
			final RGB decodedColor = UicustomUtil.decodeColor(strValue);
			color = new Color(Display.getCurrent(), decodedColor);
			this.colorsCache.put(strValue, color);
		}
		return color;

	}

	private String decodeFont(final String strValue) {
		return strValue;
	}

	/**
	 * @return the {@link Image} corresponding to the given resource. Icons are kept in cache to
	 *         minimize use of resources and achieve better performance.
	 */
	private Image decodeIcon(final String strValue) {
		Image icon = this.iconsCache.get(strValue);
		if (icon == null) {
			try {
				final InputStream inputStream = PathUtils.getResourceStream(new Path(strValue));
				if (inputStream == null) {
					MoDiscoLogger.logError(NLS.bind(
							Messages.CustomizationEngine_errorOpeningCustomizationResource,
							strValue), Activator.getDefault());
					return null;
				}
				icon = new Image(Display.getCurrent(), inputStream);
				inputStream.close();
			} catch (final Exception e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
				return null;
			}
			this.iconsCache.put(strValue, icon);
		}
		return icon;
	}

	private OverlayIconImageInfo decodeOverlayIcon(final String strValue) {
		OverlayIconInfo overlayIconInfo = UicustomUtil.decodeOverlayIcon(strValue);
		Image image = decodeIcon(overlayIconInfo.getPath());
		if (image != null) {
			return new OverlayIconImageInfo(image, overlayIconInfo.getIconPosition());
		}
		return null;
	}

	/**
	 * Must be called when the engine is not needed anymore, to free system resources
	 */
	public void dispose() {
		for (final Color color : this.colorsCache.values()) {
			color.dispose();
		}

		for (final Font font : this.fontsCache.values()) {
			font.dispose();
		}

		for (final Image image : this.iconsCache.values()) {
			image.dispose();
		}

		this.changeListeners.clear();

		if (this.customizationChangeListener != null) {
			CustomizationsCatalog.getInstance().removeChangeListener(
					this.customizationChangeListener);
		}
	}

	// private Map<Attribute, EngineAttributeView> typeViews;
	// private Map<EClass, Boolean> typeViews;
	// private Map<EClass, QueryRef> metaclassesDynamicVisibility;

}
