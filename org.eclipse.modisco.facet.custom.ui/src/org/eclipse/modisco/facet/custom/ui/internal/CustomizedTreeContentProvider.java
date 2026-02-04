/*******************************************************************************
 * Copyright (c) 2012, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 379683 - customizable Tree content provider
 *    Grégoire Dupé (Mia-Software) - Bug 385292 - [CustomizedTreeContentProvider] StackOverFlow when refreshing a TreeViewer with ICustomizedTreeContentProvider
 *    Grégoire Dupé (Mia-Software) - Bug 386387 - [CustomizedTreeContentProvider] The TreeElements are not preserved between two calls to getElements()
 *    Thomas Cicognani (Soft-Maint) - Bug 441321 - isVisible customization doesn't work after refreshing a tree
 *    Grégoire Dupé (Mia-Software) - Bug 441570 - Children custom property
 *    Grégoire Dupé (Mia-Software) - Bug 506334 - Need to know which TreeElement has been updated
 *    Grégoire Dupé (Mia-Software) - Bug 506929 - Refresh problems after CustomizedTreeContentProvider.dispose()
 *******************************************************************************/
package org.eclipse.modisco.facet.custom.ui.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.modisco.facet.custom.core.ICustomizationManager;
import org.eclipse.modisco.facet.custom.core.exception.CustomizationException;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EAttributeTreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EReferenceTreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EStructuralFeatureTreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyFactory;
import org.eclipse.modisco.facet.custom.ui.IContentPropertiesHandler;
import org.eclipse.modisco.facet.custom.ui.IContentPropertiesHandlerFactory;
import org.eclipse.modisco.facet.custom.ui.ICustomizedTreeContentProvider;
import org.eclipse.modisco.facet.custom.ui.ICustomizedContentProviderFactory.IContentListener;
import org.eclipse.modisco.facet.efacet.core.FacetUtils;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.core.IFacetManagerListener;
import org.eclipse.modisco.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.modisco.facet.util.core.Logger;

@SuppressWarnings("deprecation")
// @SuppressWarnings("deprecation") : Bug 380229 - [deprecated] ICustomizedContentProvider
public class CustomizedTreeContentProvider implements ICustomizedTreeContentProvider {

	private final ICustomizationManager customManager;
	private final IContentPropertiesHandler contentHandler;
	private Object previousInput;
	private Object[] rootElements = new Object[0];
	private final List<TreeElementAdapter> adapters;
	private IContentListener contentListener;

	public CustomizedTreeContentProvider(final ICustomizationManager customManager,
			final IContentListener contentListener) {
		this.adapters =  new ArrayList<TreeElementAdapter>();
		this.customManager = customManager;
		this.customManager.getFacetManager().addListener(new IFacetManagerListener() {
			public void facetManagerChanged() {
				CustomizedTreeContentProvider.this.dispose();
			}
		});
		this.contentHandler = IContentPropertiesHandlerFactory.DEFAULT.createIContentPropertiesHandler(customManager);
		this.contentListener = contentListener;
	}

	private static Object[] getRootElements(final Object inputElement) {
		Object[] result;
		if (inputElement == null) {
			result = new Object[0];
		} else if (inputElement instanceof EObject) {
			result = new EObject[] { (EObject) inputElement };
		} else if (inputElement instanceof Collection<?>) {
			result = ((Collection<?>) inputElement).toArray();
		} else if (inputElement instanceof EObject[]) {
			result = (EObject[]) inputElement;
		} else {
			throw new IllegalArgumentException("Unhandled input element type: " + inputElement.getClass().getSimpleName()); //$NON-NLS-1$
		}
		return result;
	}

	public Object[] getElements(final Object inputElement) {
		Object[] result;
		if (this.previousInput == inputElement) {
			result = this.rootElements;
		} else {
			this.previousInput = inputElement;
			final Object[] elements = getRootElements(inputElement);
			final List<Object> elementList = new ArrayList<Object>();
			for (final Object element : elements) {
				if (!isVisible(element, null)) {
					continue;
				}
				if (element instanceof EObject) {
					final EObjectTreeElement eObjectProxy = createEObjectProxy(element, null);
					elementList.add(eObjectProxy);
				} else {
					elementList.add(element);
				}
			}
			result = elementList.toArray();
			this.rootElements = result;
		}
		return result;
	}

	protected EObjectTreeElement createEObjectProxy(final Object element,
			final TreeElement parent) {
		final EObject eObject = (EObject) element;
		final EObjectTreeElement eObjectProxy = TreeproxyFactory.eINSTANCE.createEObjectTreeElement();
		eObjectProxy.setEObject(eObject);
		eObjectProxy.setParent(parent);
		/*
		 * The TreeElementAdapter is used to clear the content of
		 * eObjectProxy.setParent() when the eObject is updated.
		 */
		final TreeElementAdapter adapter = new TreeElementAdapter(eObjectProxy,
				this.contentListener);
		eObject.eAdapters().add(adapter);
		this.adapters.add(adapter);
		return eObjectProxy;
	}

	public Object[] getChildren(final Object parentElement) {
		Object[] result = null;
		if (parentElement == null) {
			result = new Object[0];
		} else if (parentElement instanceof TreeElement) {
			final TreeElement treeElt = (TreeElement) parentElement;
			if (parentElement instanceof EAttributeTreeElement) {
				final EAttributeTreeElement attributeProxy = (EAttributeTreeElement) parentElement;
				result = getChildren(attributeProxy);
			} else {
				/*
				 * treeElt.getChildren() is cleared by the TreeElementAdapter 
				 * instances when the eObject is updated.
				 */
				final List<? extends TreeElement> cachedChildren = treeElt.getChildren();
				if (cachedChildren == null || cachedChildren.isEmpty()) {
					if (parentElement instanceof EObjectTreeElement) {
						final EObjectTreeElement eObjectProxy = (EObjectTreeElement) parentElement;
						result = filter(getChildren(eObjectProxy));
					} else  if (parentElement instanceof EReferenceTreeElement) {
						final EReferenceTreeElement referenceProxy = (EReferenceTreeElement) parentElement;
						result = filter(getChildren(referenceProxy));
					}
				} else {
					result = filter(cachedChildren);
				}
			}
		} 
		if (result == null) {
			@SuppressWarnings("null")
			/* 
			 * @SuppressWarnings("null"): gdupe> parentElement cannot be null, 
			 * this is tested by the first if of this method
			 */
			final Class<? extends Object> unexpectedClass = parentElement.getClass();
			Logger.logError("Unknown element in tree: " + unexpectedClass,  //$NON-NLS-1$
					Activator.getDefault());
			result = new Object[0];
		}
		return result;
	}

	private Object[] filter(final List<? extends TreeElement> notFilteredResult) {
		final List<TreeElement> filteredChildren = new ArrayList<TreeElement>();
		for (TreeElement child : notFilteredResult) {
			EObject eObject = null;
			EStructuralFeature eStructFeature = null;
			if (child instanceof EStructuralFeatureTreeElement) {
				final EStructuralFeatureTreeElement sfTreeElt = (EStructuralFeatureTreeElement) child;
				eObject = ((EObjectTreeElement) sfTreeElt.getParent()).getEObject();
				eStructFeature = sfTreeElt.getEStructuralFeature();
			} else if (child instanceof EObjectTreeElement) {
				final EObjectTreeElement eObjTreeElt = (EObjectTreeElement) child;
				eObject = eObjTreeElt.getEObject();
			}
			if (isVisible(eObject, eStructFeature)) {
				filteredChildren.add(child);
			}
		}
		return filteredChildren.toArray();
	}

	private List<TreeElement> getChildren(final EObjectTreeElement treeElement) {
		List<TreeElement> children = treeElement.getChildren();
		children.clear();
		final List<ETypedElement> customChildren = getCustomChildren(treeElement.getEObject(), null);
		if (customChildren == null) {
			children = new ArrayList<TreeElement>();
			children.addAll(createAttributes(treeElement));
			children.addAll(createReferences(treeElement));
		} else {
			for (ETypedElement customChild : customChildren) {
				if (customChild instanceof EAttribute) {
					final EAttribute eAttribute = (EAttribute) customChild;
					children.add(createAttributeProxy(eAttribute, treeElement));
				} else if (customChild instanceof EReference) {
					final EReference eReference = (EReference) customChild;
					children.addAll(getReferenceChildren(treeElement, eReference, treeElement.getEObject()));
				}
			}
		}
		return children;
	}

	public Object[] getChildren(final EAttributeTreeElement attributeProxy) {
		final List<Object> children = new ArrayList<Object>();
		final EAttribute eAttribute = attributeProxy.getEAttribute();
		if (eAttribute.isMany()) {
			final TreeElement parent = attributeProxy.getParent();
			if (!(parent instanceof EObjectTreeElement)) {
				throw new IllegalStateException("An attribute should appear only under a model element"); //$NON-NLS-1$
			}
			final EObjectTreeElement parentProxy = (EObjectTreeElement) parent;
			final EObject eObject = parentProxy.getEObject();
			try {
				final IFacetManager facetManager = this.customManager.getFacetManager();
				final List<Object> result = facetManager.getOrInvokeMultiValued(eObject, eAttribute, null);
				for (final Object object : result) {
					if (object instanceof EObject) {
						final EObject childEObject = (EObject) object;
						children.add(createEObjectProxy(childEObject, attributeProxy));
					}
					children.add(object);
				}
			} catch (final FacetManagerException e) {
				Logger.logError(e, Activator.getDefault());
			}
		}
		return children.toArray();
	}

	public List<? extends TreeElement> getChildren(final EReferenceTreeElement referenceProxy) {
		List<? extends TreeElement> result;
		final EReference eReference = referenceProxy.getEReference();
		final TreeElement parent = referenceProxy.getParent();
		if (!(parent instanceof EObjectTreeElement)) {
			throw new IllegalStateException("A reference should appear only under a model element"); //$NON-NLS-1$
		}
		final EObjectTreeElement parentProxy = (EObjectTreeElement) parent;
		final EObject eObject = parentProxy.getEObject();
		result = getReferenceChildren(referenceProxy, eReference, eObject);
		return result;
	}

	private List<? extends TreeElement> getReferenceChildren(
			final TreeElement parent,
			final EReference eReference, final EObject eObject) {
		List<? extends TreeElement> result;
		if (eReference.isMany()) {
			result = getMultiValuedReferenceChildren(eReference, eObject, parent);
		} else {
			final EObjectTreeElement child = getSingleValuedReferenceChild(eReference, eObject, parent);
			if (child == null) {
				result = Collections.emptyList();
			} else {
				result = Collections.singletonList(child);
			}
		}
		return result;
	}

	private EObjectTreeElement getSingleValuedReferenceChild(final EReference eReference,
			final EObject eObject, final TreeElement parent) {
		EObjectTreeElement child = null;
		try {
			final IFacetManager facetManager = this.customManager
					.getFacetManager();
			final EObject referedEObject = facetManager.getOrInvoke(
					eObject, eReference, EObject.class);
			if (referedEObject != null) {
				child = createEObjectProxy(referedEObject, parent);
			}
		} catch (final FacetManagerException e) {
			Logger.logError(e, Activator.getDefault());
		}
		return child;
	}

	private List<EObjectTreeElement> getMultiValuedReferenceChildren(
			final EReference eReference, final EObject eObject,
			final TreeElement parent) {
		final List<EObjectTreeElement> children = new ArrayList<EObjectTreeElement>();
		try {
			final IFacetManager facetManager = this.customManager
					.getFacetManager();
			final List<Object> result = facetManager
					.getOrInvokeMultiValued(eObject, eReference, null);
			for (final Object object : result) {
				if (object instanceof EObject) {
					final EObject childEObject = (EObject) object;
					children.add(createEObjectProxy(childEObject, parent));
				}
			}
		} catch (final FacetManagerException e) {
			Logger.logError(e, Activator.getDefault());
		}
		return children;
	}

	private Collection<EAttributeTreeElement> createAttributes(final EObjectTreeElement treeElement) {
		final EObject eObject = treeElement.getEObject();
		final EClass eClass = eObject.eClass();
		final IFacetManager facetManager = this.customManager.getFacetManager();
		final List<EAttribute> allAttributes = new ArrayList<EAttribute>();
		allAttributes.addAll(eClass.getEAllAttributes());
		try {
			final Set<EAttribute> facetAttributes = FacetUtils.getETypedElements(eObject, EAttribute.class, facetManager);
			allAttributes.addAll(facetAttributes);
		} catch (final FacetManagerException e) {
			Logger.logError(e, Activator.getDefault());
		}
		return createAttributeProxies(allAttributes, treeElement);
	}

	private static Collection<EAttributeTreeElement> createAttributeProxies(
			final List<EAttribute> allAttributes,
			final EObjectTreeElement parent) {
		final List<EAttributeTreeElement> result = new ArrayList<EAttributeTreeElement>();
		for (final EAttribute eAttribute : allAttributes) {
			result.add(createAttributeProxy(eAttribute, parent));
		}
		return result;
	}

	private static EAttributeTreeElement createAttributeProxy(
			final EAttribute eAttribute, final EObjectTreeElement parent) {
		final EAttributeTreeElement attributeProxy = TreeproxyFactory.eINSTANCE
				.createEAttributeTreeElement();
		attributeProxy.setEStructuralFeature(eAttribute);
		attributeProxy.setParent(parent);
		return attributeProxy;
	}

	private Collection<EReferenceTreeElement> createReferences(final EObjectTreeElement treeElement) {
		final EObject eObject = treeElement.getEObject();
		final EClass eClass = eObject.eClass();
		final IFacetManager facetManager = this.customManager.getFacetManager();
		final List<EReference> allReferences = new ArrayList<EReference>();
		allReferences.addAll(eClass.getEAllReferences());
		try {
			final Set<EReference> facetReferences = FacetUtils.getETypedElements(eObject, EReference.class, facetManager);
			allReferences.addAll(facetReferences);
		} catch (final FacetManagerException e) {
			Logger.logError(e, Activator.getDefault());
		}
		return createReferenceProxies(allReferences, treeElement);
	}

	private static Collection<EReferenceTreeElement> createReferenceProxies(final List<EReference> allReferences, final EObjectTreeElement parent) {
		final List<EReferenceTreeElement> result = new ArrayList<EReferenceTreeElement>();
		for (final EReference eReference : allReferences) {
			final EReferenceTreeElement referenceProxy = TreeproxyFactory.eINSTANCE
					.createEReferenceTreeElement();
			referenceProxy.setEStructuralFeature(eReference);
			referenceProxy.setParent(parent);
			result.add(referenceProxy);
		}
		return result;
	}

	public Object getParent(final Object element) {
		Object result = null;
		if (element instanceof TreeElement) {
			final TreeElement treeElement = (TreeElement) element;
			result = treeElement.eContainer();
		}
		return result;
	}

	public boolean hasChildren(final Object element) {
		return getChildren(element).length > 0;
	}

	public void dispose() {
		final List<Object> rootList = Arrays.asList(this.rootElements);
		/* gdupe> I copy the list to avoid ConcurrentModificationException */
		final Collection<TreeElementAdapter> adaptersCopy = Collections
				.unmodifiableCollection(this.adapters);
		for (TreeElementAdapter adapter : adaptersCopy) {
			final EObjectTreeElement treeElement = adapter.getTreeElement();
			if (!rootList.contains(treeElement)) {
				final Notifier target = adapter.getTarget();
				final EList<Adapter> eAdapters = target.eAdapters();
				eAdapters.remove(adapter);
			}
			treeElement.getChildren().clear();
		}
		for (Object rootElt : this.rootElements) {
			this.contentListener.onUpdate(rootElt);
		}
	}

	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		if (newInput == null || !newInput.equals(newInput)) {
			dispose();
		}
	}

	public ICustomizationManager getCustomizationManager() {
		return this.customManager;
	}

	public boolean isVisible(final Object object, final ETypedElement eTypedElement) {
		Boolean result = Boolean.TRUE;
		if (object instanceof EObject) {
			final EObject eObject = (EObject) object;
			try {
				result = this.customManager.getCustomValueOf(eObject, eTypedElement, this.contentHandler.getIsVisible(), Boolean.class);
			} catch (final CustomizationException e) {
				Logger.logError(e, Activator.getDefault());
			}
		}
		return result.booleanValue();
	}
	
	public List<ETypedElement> getCustomChildren(final Object object, final ETypedElement eTypedElement) {
		List<ETypedElement> result = null;
		if (object instanceof EObject) {
			final EObject eObject = (EObject) object;
			try {
				final List<?> tmpresult = this.customManager.getCustomValueOf(eObject, eTypedElement, this.contentHandler.getChildren(), List.class);
				if (tmpresult != null && !tmpresult.isEmpty()) {
					result = new ArrayList<ETypedElement>();
					for (Object tmpObject :tmpresult) {
						if (tmpObject instanceof ETypedElement) {
							final ETypedElement resultElt = (ETypedElement) tmpObject;
							result.add(resultElt);
						}
					}
				}
			} catch (final CustomizationException e) {
				Logger.logError(e, Activator.getDefault());
			}
		}
		return result;
	}
}
