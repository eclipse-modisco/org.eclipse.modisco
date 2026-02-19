/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.examples.generation.popup.actions;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.infra.browser.custom.AttributeView;
import org.eclipse.modisco.infra.browser.custom.CustomView;
import org.eclipse.modisco.infra.browser.custom.CustomViewFeature;
import org.eclipse.modisco.infra.browser.custom.CustomizableFeatures;
import org.eclipse.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.modisco.infra.browser.custom.ReferenceView;
import org.eclipse.modisco.infra.browser.custom.StaticFeatureValue;
import org.eclipse.modisco.infra.browser.custom.TypeView;
import org.eclipse.modisco.infra.browser.custom.emf.UicustomFactory;
import org.eclipse.modisco.infra.browser.custom.examples.generation.Activator;
import org.eclipse.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class HideAllReferencesAction implements IObjectActionDelegate {

	private ISelection fSelection;

	public HideAllReferencesAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(final IAction action) {
		if (this.fSelection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) this.fSelection;
			Iterator<?> iterator = structuredSelection.iterator();
			while (iterator.hasNext()) {
				Object selectedObject = iterator.next();
				if (selectedObject instanceof IFile) {
					IFile file = (IFile) selectedObject;
					handleSelectedFile(file);
				}
			}
		}
	}

	private void handleSelectedFile(final IFile file) {
		MetamodelView metamodelView = loadResource(file);
		if (metamodelView != null) {
			transformUiCustom(metamodelView);
			saveResource(metamodelView);
		}
	}

	private void saveResource(final MetamodelView metamodelView) {
		Resource resource = metamodelView.eResource();
		try {
			resource.save(null);
		} catch (IOException e) {
			Logger.logError(e, Activator.getDefault());
		}
	}

	protected void transformUiCustom(final MetamodelView metamodelView) {
		String metamodelURI = metamodelView.getMetamodelURI();
		final EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(metamodelURI);
		if (ePackage == null) {
			Logger.logError(
					"Cannot find customization metamodel: " + metamodelURI, Activator.getDefault()); //$NON-NLS-1$
			return;
		}

		EList<EClassifier> eClassifiers = ePackage.getEClassifiers();
		for (EClassifier eClassifier : eClassifiers) {
			if (eClassifier instanceof EClass) {
				EClass eClass = (EClass) eClassifier;
				EList<EReference> eAllReferences = eClass.getEAllReferences();
				for (EReference eReference : eAllReferences) {
					addReferenceCustomization(eClass, eReference, metamodelView);
				}
			}
		}
	}

	/**
	 * Adds a customization that sets <code>visible</code> to <code>false</code>
	 * for the given {@link EReference} from the given {@link EClass}, so that
	 * it is hidden.
	 */
	private void addReferenceCustomization(final EClass eClass, final EReference eReference,
			final MetamodelView metamodelView) {
		ReferenceView referenceView = findOrCreateReferenceView(eClass, eReference, metamodelView);
		CustomViewFeature customViewFeature = findOrCreateCustomizedFeature(referenceView,
				CustomizableFeatures.VISIBLE);
		final StaticFeatureValue featureValue = UicustomFactory.eINSTANCE
				.createStaticFeatureValue();
		featureValue.setValue("false"); //$NON-NLS-1$
		customViewFeature.setDefaultValue(featureValue);

	}

	/**
	 * Find an existing {@link TypeView} for the given {@link EClass}, or create
	 * it if it doesn't exist yet
	 */
	protected static TypeView findOrCreateTypeView(final EClass eClass,
			final MetamodelView metamodelView) {
		final String className = ModelUtils.getMetaclassQualifiedName(eClass);
		if (className == null) {
			return null;
		}
		final EList<TypeView> types = metamodelView.getTypes();
		for (final TypeView typeView : types) {
			if (className.equals(typeView.getMetaclassName())) {
				return typeView;
			}
		}
		final TypeView typeView = UicustomFactory.eINSTANCE.createTypeView();
		typeView.setMetaclassName(className);
		metamodelView.getTypes().add(typeView);
		return typeView;
	}

	/**
	 * Find an existing {@link AttributeView} for the given {@link EAttribute},
	 * or create it if it doesn't exist yet
	 */
	protected static AttributeView findOrCreateAttributeView(final EClass eClass,
			final EAttribute attribute, final MetamodelView metamodelView) {
		final TypeView typeView = findOrCreateTypeView(eClass, metamodelView);

		final String attributeName = attribute.getName();
		final EList<AttributeView> attributeViews = typeView.getAttributes();
		for (final AttributeView attributeView : attributeViews) {
			if (attributeName.equals(attributeView.getAttributeName())) {
				return attributeView;
			}
		}
		final AttributeView attributeView = UicustomFactory.eINSTANCE.createAttributeView();
		attributeView.setAttributeName(attributeName);
		typeView.getAttributes().add(attributeView);
		return attributeView;
	}

	/**
	 * Find an existing {@link CustomViewFeature} which customizes the given
	 * <code>customizableFeature</code> for the given {@link CustomView}, or
	 * create it if it doesn't exist yet
	 */
	protected static CustomViewFeature findOrCreateCustomizedFeature(final CustomView customView,
			final CustomizableFeatures customizableFeature) {

		EList<CustomViewFeature> customizedFeatures = customView.getCustomizedFeatures();
		for (CustomViewFeature customViewFeature : customizedFeatures) {
			if (customViewFeature.getCustomizedFeature() == customizableFeature) {
				return customViewFeature;
			}
		}

		final CustomViewFeature customViewFeature = UicustomFactory.eINSTANCE
				.createCustomViewFeature();
		customizedFeatures.add(customViewFeature);
		customViewFeature.setCustomizedFeature(customizableFeature);

		return customViewFeature;
	}

	/**
	 * Find an existing {@link ReferenceView} for the given {@link EReference},
	 * or create it if it doesn't exist yet
	 */
	protected static ReferenceView findOrCreateReferenceView(final EClass eClass,
			final EReference reference, final MetamodelView metamodelView) {
		final TypeView typeView = findOrCreateTypeView(eClass, metamodelView);

		final String referenceName = reference.getName();
		final EList<ReferenceView> referenceViews = typeView.getReferences();
		for (final ReferenceView referenceView : referenceViews) {
			if (referenceName.equals(referenceView.getReferenceName())) {
				return referenceView;
			}
		}
		final ReferenceView referenceView = UicustomFactory.eINSTANCE.createReferenceView();
		referenceView.setReferenceName(referenceName);
		typeView.getReferences().add(referenceView);
		return referenceView;
	}

	/**
	 * Loads the MetamodelView (root of the UiCustom metamodel) from the given
	 * workspace file
	 */
	private MetamodelView loadResource(final IFile file) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("uiCustom", new XMIResourceFactoryImpl()); //$NON-NLS-1$
		final URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		final Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
		} catch (final IOException e) {
			Logger.logError(e, Activator.getDefault());
		}

		EList<EObject> contents = resource.getContents();
		if (contents.size() == 0) {
			Logger.logError("Resource is empty", Activator.getDefault()); //$NON-NLS-1$
			return null;
		}

		EObject eObject = contents.get(0);
		if (eObject instanceof MetamodelView) {
			return (MetamodelView) eObject;
		}
		Logger.logError("Resource does not contain a MetamodelView", Activator.getDefault()); //$NON-NLS-1$
		return null;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(final IAction action, final ISelection selection) {
		this.fSelection = selection;
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(final IAction action, final IWorkbenchPart targetPart) {
		// nothing
	}

}
