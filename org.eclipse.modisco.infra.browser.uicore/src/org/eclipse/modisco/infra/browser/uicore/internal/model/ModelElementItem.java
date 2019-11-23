/*******************************************************************************
 * Copyright (c) 2008, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 336502 - Browser customization: is Visible and collapse link attributes are not taken into account for a facet
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.uicore.internal.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.EMFEditPlugin;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.modisco.infra.browser.uicore.internal.Activator;
import org.eclipse.modisco.infra.browser.uicore.internal.AppearanceConfiguration;
import org.eclipse.modisco.infra.browser.uicore.internal.adapters.ElementID;
import org.eclipse.modisco.infra.browser.uicore.internal.adapters.ElementIDAdapterFactory;
import org.eclipse.modisco.infra.browser.uicore.internal.customization.CustomizationEngine;
import org.eclipse.modisco.infra.browser.uicore.internal.extensions.IconProvidersRegistry;
import org.eclipse.modisco.infra.browser.uicore.internal.extensions.NameProvidersRegistry;
import org.eclipse.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.StringUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.FacetAttribute;
import org.eclipse.modisco.infra.facet.FacetReference;
import org.eclipse.modisco.infra.facet.FacetStructuralFeature;
import org.eclipse.modisco.infra.facet.Shortcut;
import org.eclipse.modisco.infra.facet.core.FacetContext;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryException;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

/**
 * Represents a model element ({@link EObject}). Uses reflection on the Ecore metamodel.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class ModelElementItem implements ITreeElement, IAdaptable {

	/** The configuration of the way elements are displayed */
	private final AppearanceConfiguration appearanceConfiguration;

	/** The model element */
	private final EObject fModelElement;
	/** The parent tree item */
	private ITreeElement treeParent;

	/** The position of this element in its parent reference (-1 if not set) */
	private int order = -1;

	/** <strong>must be created using the {@link ItemsFactory factory}</strong> */
	public ModelElementItem(final EObject eObject, final ITreeElement treeParent,
			final AppearanceConfiguration appearanceConfiguration) {
		if (eObject == null) {
			throw new IllegalArgumentException("eObject is null"); //$NON-NLS-1$
		}
		this.fModelElement = eObject;
		this.treeParent = treeParent;
		this.appearanceConfiguration = appearanceConfiguration;
		this.facetContext = appearanceConfiguration.getFacetContext();
	}

	/**
	 * Cache the link item providers so that the same {@link LinkItem} objects are always used. This
	 * allows the viewers to restore the selection (using the physical identity of the objects)
	 */
	private final HashMap<EReference, LinkItem> linkItems = new HashMap<EReference, LinkItem>();

	/**
	 * Cache the attribute items so that the same {@link AttributeItem} objects are always used.
	 * This allows the viewers to restore the selection (using the physical identity of the objects)
	 */
	private final HashMap<EAttribute, AttributeItem> attributeItems = new HashMap<EAttribute, AttributeItem>();

	/**
	 * Cache the {@link ContainerLink} so that the same physical object is always used.
	 */
	private ContainerLink containmentLinkItem = null;
	/** The container associated with the cached {@link ContainerLink} */
	private EObject oldContainer = null;

	/**
	 * Cache the {@link URIAttribute} so that the same physical object is always used.
	 */
	private URIAttribute uriAttribute = null;

	private final FacetContext facetContext;

	private int cachedChildrenModCount = -1;
	private List<Object> cachedChildren = null;

	public synchronized List<Object> getChildren() {
		if (this.cachedChildren == null
				|| this.cachedChildrenModCount != this.appearanceConfiguration.getModCount()) {

			this.cachedChildren = new ArrayList<Object>();

			// show a link for the container
			if (this.appearanceConfiguration.isShowContainer()) {
				addContainer(this.fModelElement, this.cachedChildren);
			}

			// show a virtual attribute for the URI
			if (this.appearanceConfiguration.isShowURI()) {
				addURIAttribute(this.cachedChildren);
			}

			addVirtualElements(this.cachedChildren);

			if (this.appearanceConfiguration.isShowAttributes()) {
				final List<AttributeItem> attributes = createAttributes();
				// sort attributes by name
				// TODO: separate preference for attributes?
				if (this.appearanceConfiguration.isSortLinks()) {
					sortAttributes(attributes);
				}
				this.cachedChildren.addAll(attributes);
			}

			final ArrayList<Object> elementsInCollapsedLinks = new ArrayList<Object>();
			final ArrayList<LinkItem> links = createLinks(elementsInCollapsedLinks);
			final CustomizationEngine customizationEngine = this.appearanceConfiguration
					.getCustomizationEngine();
			// filter out invisible elements
			// cf Bug 329037 - [UICustom] "Collapse Link" option does not
			// exploit the "Visible" option
			ListIterator<Object> listIterator = elementsInCollapsedLinks.listIterator();
			while (listIterator.hasNext()) {
				Object next = listIterator.next();
				if (next instanceof ModelElementItem) {
					ModelElementItem modelElementItem = (ModelElementItem) next;
					EObject eObject = modelElementItem.getEObject();
					if (!customizationEngine.isTypeVisible(eObject.eClass(), eObject)) {
						listIterator.remove();
					}
				}
			}
			if (this.appearanceConfiguration.isSortInstances()) {
				BigListItem.sortElements(elementsInCollapsedLinks);
			}
			this.cachedChildren.addAll(elementsInCollapsedLinks);

			// sort links by name
			if (this.appearanceConfiguration.isSortLinks()) {
				sortLinks(links);
			}
			if (this.appearanceConfiguration.isSortLinksByType()) {
				// counting on the fact that sorting preserves the order of
				// equal elements
				sortLinksByType(links);
			}
			this.cachedChildren.addAll(links);
			this.cachedChildrenModCount = this.appearanceConfiguration.getModCount();
		}
		return this.cachedChildren;
	}

	/**
	 * Override this method to add more virtual elements.
	 *
	 * @param children
	 *            can add more children to this list
	 */
	protected void addVirtualElements(final List<Object> children) {
		// can be overloaded to add more virtual elements
	}

	/**
	 * Create attribute elements corresponding to model attributes for the given {@link EObject}
	 *
	 * @return the list of attributes elements created for representing the attributes visually in
	 *         the model browser
	 */
	private List<AttributeItem> createAttributes() {
		final ArrayList<AttributeItem> attributes = new ArrayList<AttributeItem>();
		/*
		 * For each attribute, create an AttributeItem that will represent the attribute as an
		 * element under the current element containing the attribute
		 */
		final EClass eClass = this.fModelElement.eClass();
		final EList<EAttribute> allAttributes = new BasicEList<EAttribute>();
		allAttributes.addAll(eClass.getEAllAttributes());
		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();
		try {
			final EList<EAttribute> allAttributes2 = this.facetContext
					.getAttributes(this.fModelElement);
			allAttributes.addAll(allAttributes2);
		} catch (final ModelQueryException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		for (final EAttribute attribute : allAttributes) {
			EClass containingEClass;
			if (attribute instanceof FacetAttribute) {
				containingEClass = attribute.getEContainingClass();
			} else {
				containingEClass = eClass;
			}

			if (!customizationEngine.isAttributeVisible(containingEClass, attribute.getName(),
					this.fModelElement)) {
				continue;
			}

			boolean empty = false;
			if (!this.appearanceConfiguration.isShowEmptyAttributes()) {
				final Object value = localEGet(attribute);
				if (attribute.isMany()) {
					empty = ((List<?>) value).size() == 0;
				} else {
					empty = value == null;
				}
			}

			if (this.appearanceConfiguration.isShowEmptyAttributes() || !empty) {
				// try to get an already existing AttributeItemProvider from the
				// cache
				AttributeItem attributeItem = this.attributeItems.get(attribute);
				if (attributeItem == null) {
					attributeItem = new AttributeItem(this.fModelElement, this, attribute,
							this.appearanceConfiguration);
					this.attributeItems.put(attribute, attributeItem);
				}

				attributes.add(attributeItem);
			}
		}
		return attributes;
	}

	/**
	 * Create the links corresponding to references for the given {@link EObject}
	 *
	 * @param elementsInCollapsedLinks
	 *            elements that are under links that are set to 'collapsed' through a customization
	 *            will be added to this list
	 *
	 * @return the list of links created for representing the references in the model browser
	 */
	private ArrayList<LinkItem> createLinks(final List<Object> elementsInCollapsedLinks) {

		final ArrayList<LinkItem> links = new ArrayList<LinkItem>();
		final EClass eClass = this.fModelElement.eClass();
		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();

		/*
		 * For each reference, create a LinkItem that will represent the reference visually
		 */
		final List<EReference> allReferences = new ArrayList<EReference>();
		allReferences.addAll(eClass.getEAllReferences());
		try {
			allReferences.addAll(this.facetContext.getReferences(this.fModelElement));
		} catch (final ModelQueryException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		for (final EReference reference : allReferences) {
			EClass containingEClass;
			if (reference instanceof FacetReference) {
				containingEClass = reference.getEContainingClass();
			} else {
				containingEClass = this.fModelElement.eClass();
			}

			if (customizationEngine.isLinkCollapsed(containingEClass, reference)) {
				// get the object(s) referenced
				final Object ref = localEGet(reference);
				if (reference.isMany()) {
					@SuppressWarnings("unchecked")
					final List<EObject> childrenList = (List<EObject>) ref;
					if (childrenList != null) {
						for (EObject eObject : childrenList) {
							ModelElementItem modelElementItem = this.appearanceConfiguration
									.getItemsFactory().createModelElementItem(eObject, this,
											this.appearanceConfiguration);
							elementsInCollapsedLinks.add(modelElementItem);
						}
					}
				} else {
					if (ref instanceof EObject) {
						EObject eObject = (EObject) ref;
						ModelElementItem modelElementItem = this.appearanceConfiguration
								.getItemsFactory().createModelElementItem(eObject, this,
										this.appearanceConfiguration);
						elementsInCollapsedLinks.add(modelElementItem);
					}
				}
			} else {
				if (!customizationEngine.isReferenceVisible(containingEClass, reference.getName(),
						this.fModelElement)) {
					continue;
				}

				// filtered out by the user?
				if (reference.isDerived() && !this.appearanceConfiguration.isShowDerivedLinks()) {
					continue;
				}

				// try to get an already existing LinkItem from the cache
				LinkItem linkItem = this.linkItems.get(reference);
				if (linkItem == null) {
					linkItem = this.appearanceConfiguration.getItemsFactory().createLinkItem(
							this.fModelElement, this, reference, this.appearanceConfiguration);
					this.linkItems.put(reference, linkItem);
				}

				// filtered out by the user?
				if (!this.appearanceConfiguration.isShowEmptyLinks() && !linkItem.hasChildren()) {
					continue;
				}

				links.add(linkItem);
			}
		}
		return links;
	}

	/** Adds the container of the given {@link EObject} to the children list */
	private void addContainer(final EObject eObject, final List<Object> children) {
		if (eObject.eContainer() != null) {
			if (this.containmentLinkItem == null || this.oldContainer != eObject.eContainer()) {
				this.containmentLinkItem = new ContainerLink(eObject, this, eObject.eContainer(),
						this.appearanceConfiguration);
				this.oldContainer = eObject.eContainer();
			}
			children.add(this.containmentLinkItem);
		} else if (this.appearanceConfiguration.isShowEmptyLinks()) {
			// create a ContainmentLinkItemProvider for an empty link
			this.containmentLinkItem = new ContainerLink(eObject, this, null,
					this.appearanceConfiguration);
			this.oldContainer = null;
			children.add(this.containmentLinkItem);
		}
	}

	/**
	 * Adds the {@link URIAttribute} to the children list
	 */
	private void addURIAttribute(final List<Object> children) {
		if (this.uriAttribute == null) {
			this.uriAttribute = new URIAttribute(this.fModelElement, this.treeParent,
					this.appearanceConfiguration);
		}
		children.add(this.uriAttribute);
	}

	/** Sort links by name */
	private void sortLinks(final List<LinkItem> links) {
		Collections.sort(links, new Comparator<LinkItem>() {
			public int compare(final LinkItem o1, final LinkItem o2) {
				final String name1 = o1.getReference().getName();
				final String name2 = o2.getReference().getName();
				return name1.compareTo(name2);
			}
		});
	}

	/** Sort links by type */
	private void sortLinksByType(final List<LinkItem> links) {
		Collections.sort(links, new Comparator<LinkItem>() {
			public int compare(final LinkItem o1, final LinkItem o2) {
				final int r1 = getReferenceRank(o1.getReference());
				final int r2 = getReferenceRank(o2.getReference());
				return r1 - r2;
			}
		});
	}

	/** @return the rank of the given reference, used for sorting */
	public static int getReferenceRank(final EReference reference) {
		final EReference opposite = reference.getEOpposite();
		int rank;

		final int rankContainmentAndOpposite = 0;
		final int rankContainment = 10;
		final int rankOppositeContainment = 20;
		final int rankOpposite = 30;
		final int rankOther = 40;

		if (reference.isContainment()) {
			if (opposite != null) {
				rank = rankContainmentAndOpposite;
			} else {
				rank = rankContainment;
			}
		} else {
			if (opposite != null) {
				if (opposite.isContainment()) {
					rank = rankOppositeContainment;
				} else {
					rank = rankOpposite;
				}
			} else {
				rank = rankOther;
			}
		}

		if (reference.isDerived()) {
			rank++;
		}

		return rank;
	}

	/** Sort attributes by name */
	private void sortAttributes(final List<AttributeItem> attributes) {
		Collections.sort(attributes, new Comparator<AttributeItem>() {
			public int compare(final AttributeItem o1, final AttributeItem o2) {
				final String name1 = o1.getAttribute().getName();
				final String name2 = o2.getAttribute().getName();
				return name1.compareTo(name2);
			}
		});
	}

	public String getText() {
		final EClass eClass = this.fModelElement.eClass();

		String label;
		if (this.appearanceConfiguration.isShowFullQualifiedNames()) {
			label = ModelUtils.getMetaclassQualifiedName(eClass);
		} else {
			label = eClass.getName();
		}

		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();
		final boolean hideMetaclassName = customizationEngine.isHideMetaclassName(eClass,
				this.fModelElement);

		String ordering;
		if (this.appearanceConfiguration.isShowOrdering() && this.order != -1) {
			ordering = " [" + this.order + "]"; //$NON-NLS-1$ //$NON-NLS-2$
		} else {
			ordering = ""; //$NON-NLS-1$
		}

		String id;
		if (this.appearanceConfiguration.isShowElementIDs()) {
			id = " {" + getElementID() + "}"; //$NON-NLS-1$ //$NON-NLS-2$
			//id = " {" + Long.toHexString(elementID.getID()) + "}"; //$NON-NLS-1$ //$NON-NLS-2$
			//id = " {" + EcoreUtil.getURI(this.fModelElement) + "}"; //$NON-NLS-1$ //$NON-NLS-2$
		} else {
			id = ""; //$NON-NLS-1$
		}

		String metaclass;
		if (!hideMetaclassName) {
			metaclass = "[" + label + "] "; //$NON-NLS-1$ //$NON-NLS-2$
		} else {
			metaclass = ""; //$NON-NLS-1$
		}
		return metaclass + getName() + ordering + id;
	}

	/** Returns a unique ID associated to the element by the browser */
	public long getElementID() {
		ElementID elementID = (ElementID) ElementIDAdapterFactory.getInstance().adapt(
				this.fModelElement, ElementID.class);
		return elementID.getID();
	}

	/** Return just the name that will be displayed (without the metaclass) */
	public String getName() {
		return getDisplayName(this.fModelElement, this.appearanceConfiguration);
	}

	/**
	 * Return the display name of the given model element (without the metaclass)
	 */
	public static String getDisplayName(final EObject eObject,
			final AppearanceConfiguration appearanceConfiguration) {
		final CustomizationEngine customizationEngine = appearanceConfiguration
				.getCustomizationEngine();
		final String customizedLabel = customizationEngine.getTypeLabel(eObject);
		if (customizedLabel != null) {
			return customizedLabel;
		}

		final String providedName = getProvidedName(eObject);
		if (providedName != null) {
			return providedName;
		}

		final String nameFromRegistry = getNameFromAdapter(eObject,
				appearanceConfiguration.getAdapterFactory());
		if (nameFromRegistry != null) {
			return nameFromRegistry;
		}

		return ModelUtils.getDefaultName(eObject);
	}

	/**
	 * @return a name for the associated {@link EObject} provided by an adapter registered in the
	 *         registry
	 */
	public static String getNameFromAdapter(final EObject eObject, final AdapterFactory adapter) {
		final IItemLabelProvider itemLabelProvider;
		// synchronized because the adapter is added to the EObject
		synchronized (eObject) {
			itemLabelProvider = (IItemLabelProvider) adapter.adapt(eObject,
					IItemLabelProvider.class);
		}

		// This Adapter prefixes names with the metaclass name.
		// We don't want that!
		if (itemLabelProvider instanceof ReflectiveItemProvider) {
			return null;
		}

		if (itemLabelProvider != null /* && itemLabelProvider != this */) {
			return itemLabelProvider.getText(eObject);
		}
		return null;
	}

	/**
	 * @return the name that was provided through a registered name provider for the given
	 *         {@link EObject}
	 */
	public static String getProvidedName(final EObject eObject) {
		final NameProvidersRegistry nameProvidersRegistry = NameProvidersRegistry.getInstance();
		final String name = nameProvidersRegistry.getName(eObject);
		if (name != null) {
			return StringUtils.truncateBeforeNewline(name);
		}
		return null;
	}

	public boolean hasChildren() {
		/*
		 * Always return true so that there is no need to compute all children. Side effect: ghost
		 * (+) in the tree which disappears when it is clicked if the element doesn't have children.
		 * The alternative is to compute all children to determine whether there are any, which is
		 * too costly.
		 */
		return true;
	}

	public Color getForeground() {
		// apply potential color customization
		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();
		final Color color = customizationEngine.getTypeColor(this.fModelElement);
		if (color != null) {
			return color;
		}

		return null;
	}

	public Color getBackground() {
		// apply potential color customization
		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();
		final Color color = customizationEngine.getTypeBackgroundColor(this.fModelElement);
		if (color != null) {
			return color;
		}
		return null;
	}

	public Font getFont() {
		// apply potential font customization
		final CustomizationEngine customizationEngine = this.appearanceConfiguration
				.getCustomizationEngine();
		final Font customizedFont = customizationEngine.getCustomizedTypeFont(this.fModelElement,
				this.appearanceConfiguration.getCustomFont());
		if (customizedFont != null) {
			return customizedFont;
		}
		return null;
	}

	public Image getImage() {
		// TODO: cache image? (the icon is starting to become expensive to
		// retrieve)
		Image image = getImageFor(this.fModelElement, this.appearanceConfiguration);
		if (image != null) {
			return image;
		}

		// return a generated default image
		final String className = this.fModelElement.eClass().getName();
		final URI imageURI = URI.createURI(EMFEditPlugin.INSTANCE.getImage("full/obj16/Item") //$NON-NLS-1$
				.toString() + "#" + className); //$NON-NLS-1$
		return ExtendedImageRegistry.getInstance().getImage(imageURI);
	}

	/**
	 * Returns the icon for the given model element. It can be either:
	 * <ul>
	 * <li>an icon defined in a browser customization (uiCustom)
	 * <li>an icon provided by a registered icon provider
	 * <li>an icon provided by an adapter factory from the EMF registry
	 * <ul>
	 *
	 * @return an icon for the element or <code>null</code> if no icon is provided
	 */
	public static Image getImageFor(final EObject eObject,
			final AppearanceConfiguration appearanceConfiguration) {
		try {
			final CustomizationEngine customizationEngine = appearanceConfiguration
					.getCustomizationEngine();

			// Facet icon customization
			for (final Facet facet : appearanceConfiguration.getFacetContext().getFacets(eObject)) {
				Image customizedIcon = customizationEngine.getInstanceIcon(eObject, facet);
				if (customizedIcon != null) {
					// first one wins
					return customizedIcon;
				}

				// XXX deprecated but still supported
				Image customizedIcon2 = customizationEngine.getFacetMainIcon(eObject, facet);
				if (customizedIcon2 != null) {
					// first one wins
					return customizedIcon2;
				}
			}

			// Customization
			final Image customizedIcon = customizationEngine.getInstanceIcon(eObject,
					eObject.eClass());
			if (customizedIcon != null) {
				return customizedIcon;
			}
			// XXX deprecated but still supported
			final Image customizedIcon2 = customizationEngine
					.getTypeIcon(eObject, eObject.eClass());
			if (customizedIcon2 != null) {
				return customizedIcon2;
			}

			// See if an icon provider is registered
			final IconProvidersRegistry iconProvidersRegistry = IconProvidersRegistry.getInstance();
			final Image icon = iconProvidersRegistry.getIcon(eObject);
			if (icon != null) {
				return icon;
			}

			// See if an image is provided by an adapter factory from the
			// registry
			final IItemLabelProvider itemLabelProvider = (IItemLabelProvider) appearanceConfiguration
					.getAdapterFactory().adapt(eObject, IItemLabelProvider.class);

			if (itemLabelProvider != null) {
				final Object image = itemLabelProvider.getImage(eObject);
				return ExtendedImageRegistry.getInstance().getImage(image);
			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e, "Error retrieving image", Activator.getDefault()); //$NON-NLS-1$
		}

		return null;
	}

	public ITreeElement getTreeParent() {
		return this.treeParent;
	}

	public void setTreeParent(final ITreeElement treeParent) {
		this.treeParent = treeParent;
	}

	public EObject getEObject() {
		return this.fModelElement;
	}

	/**
	 * equals and hashCode are used to restore the selection in the JFace viewer
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof ModelElementItem) {
			final ModelElementItem other = (ModelElementItem) obj;
			return this.fModelElement.equals(other.fModelElement);
		}
		return false;
	}

	/**
	 * equals and hashCode are used to restore the selection in the JFace viewer
	 */
	@Override
	public int hashCode() {
		return this.fModelElement.hashCode();
	}

	public int getOrder() {
		return this.order;
	}

	public void setOrder(final int order) {
		this.order = order;
	}

	private Object localEGet(final EStructuralFeature structuralFeature) {
		Object result = null;
		if (structuralFeature instanceof FacetStructuralFeature
				|| structuralFeature instanceof Shortcut) {
			try {
				result = this.facetContext.get(this.fModelElement, structuralFeature);
			} catch (final Exception e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
				result = null;
			}
		} else {
			try {
				synchronized (this.fModelElement.eResource()) {
					result = this.fModelElement.eGet(structuralFeature);
				}
			} catch (Exception e) {
				MoDiscoLogger.logError("Error getting value of feature '" //$NON-NLS-1$
						+ ((ENamedElement) structuralFeature.eContainer()).getName() + "::" //$NON-NLS-1$
						+ structuralFeature.getName() + "' on instance of '" //$NON-NLS-1$
						+ this.fModelElement.eClass().getName() + "'", Activator.getDefault()); //$NON-NLS-1$
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	public Object getAdapter(final Class adapter) {
		if (adapter == EObject.class) {
			return this.fModelElement;
		}
		return null;
	}

	public AppearanceConfiguration getAppearanceConfiguration() {
		return this.appearanceConfiguration;
	}

	@Override
	public String toString() {
		return ModelElementItem.class.getSimpleName() + "(" + getText() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}
}