/*******************************************************************************
 * Copyright (c) 2011, 2016 Mia-Software, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	   Emmanuelle Rouillé (Mia-Software) - Bug 352618 - To be able to use non derived facet structural features and save them values.
 *     Nicolas Bros (Mia-Software) - Bug 361612 - New core for new version of the Facet metamodel
 *     Grégoire Dupé (Mia-Software) - Bug 361612 - [Restructuring] New core for new version of the Facet metamodel
 *     Jonathan Pepin (Soft-Maint) - Bug 463898 - Create FacetReference not derived, without query and with opposite mechanism
 *     Jonathan Pepin (Soft-Maint) - Bug 463907 - Command for load and save Facet serialization
 *     Jonathan Pepin (Soft-Maint) - Bug 464069 - Applying facet inferred from attribute and reference instances contained in facet serialisation model
 *     Grégoire Dupé (Mia-Software) - Bug 464069 - Applying facet inferred from attribute and reference instances contained in facet serialisation model
 *     Jonathan Pepin (Soft-Maint) - Bug 473217 - On SerializationManager getMultiValuedStructuralFeature create ExtendedEObjectReference despite empty instances
 *     Jonathan Pepin (Soft-Maint) - Bug 473673 - Applying facet inferred from fopposite reference
 *     Jonathan Pepin (Soft-Maint) - Bug 509427 - Facet attribute always returned null instead of default value
 *     Jonathan Pepin (Soft-Maint) - Bug 509605 - NullPointerException on SerializationManager getSingleValuedStructuralFeature
 *     Jonathan Pepin (Soft-Maint) - Bug 510034 - Null value is wrongly casted in a new list
 *******************************************************************************/
package org.eclipse.emf.facet.efacet.core.internal.serialization;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.internal.CastUtils;
import org.eclipse.emf.facet.efacet.core.internal.FacetManagerInternalUtils;
import org.eclipse.emf.facet.efacet.core.internal.exception.SaveStructuralFeatureInstanceModelException;
import org.eclipse.emf.facet.efacet.core.internal.exception.UnmatchingExpectedTypeException;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.serialization.AbstractAttributeInstance;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.serialization.AbstractReferenceInstance;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.serialization.ExtendedEObjectReference;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.serialization.MultiValuedAttributeInstance;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.serialization.MultiValuedContainmentReferenceInstance;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.serialization.MultiValuedReferenceInstance;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.serialization.SerializationFactory;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.serialization.SingleValuedAttributeInstance;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.serialization.SingleValuedContainmentReferenceInstance;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.serialization.SingleValuedReferenceInstance;

public class SerializationManager {

	private Resource sfInstResource;
	private final IFacetManager facetManager;

	public SerializationManager(
			final Resource sfInstResource,
			final IFacetManager facetManager) {
		this.facetManager = facetManager;
		setSerializationResource(sfInstResource);
	}

	/**
	 * This method creates a ReferenceInstance in the given {@link ExtendedEObjectReference} with
	 * the reference {@link EStructuralFeature} and the value {@link Object}.
	 */
	private static MultiValuedContainmentReferenceInstance createMultiValuedContainmentReferenceInstance(final EReference reference,
			final List<EObject> values,
			final ExtendedEObjectReference extendedEObjRef) {
		final MultiValuedContainmentReferenceInstance containmentRI = SerializationFactory.eINSTANCE
				.createMultiValuedContainmentReferenceInstance();
		containmentRI.setEReference(reference);
		if (values != null) {
			containmentRI.getOwnedElements().addAll(values);
		}
		extendedEObjRef.getReferenceInstances().add(containmentRI);
		return containmentRI;
	}

	/**
	 * This method returns the {@link ExtendedEObjectReference} associated with the given
	 * {@link EObject} if it exists or <code>null</code> if it does not exist.
	 */
	private static ExtendedEObjectReference getExtendedEObjectReference(final EObject eObject) {
		ExtendedEObjectReference result = null;
		for (final Adapter adapter : eObject.eAdapters()) {
			if (adapter.isAdapterForType(ILinkToExtendedEObjectReference.class)) {
				final LinkToExtendedEObjectReferenceAdapter castedAdapter = (LinkToExtendedEObjectReferenceAdapter) adapter;
				result = castedAdapter.getExtendedEObjectReference();
				break;
			}
		}
		return result;
	}

	/**
	 * This method creates an AttributeInstance in the given {@link ExtendedEObjectReference} with
	 * the attribute {@link EStructuralFeature} and the value {@link Object}.
	 */
	private static MultiValuedAttributeInstance createMultiValuedAttributeInstance(final EAttribute attribute, final List<Object> values,
			final ExtendedEObjectReference extendedEObjRef) {
		final MultiValuedAttributeInstance attributeInstance = SerializationFactory.eINSTANCE.createMultiValuedAttributeInstance();
		attributeInstance.setEAttribute(attribute);
		if (values != null) {
			attributeInstance.getValues().addAll(values);
		}
		final EList<AbstractAttributeInstance> attInstances = extendedEObjRef
				.getAttributeInstances();
		attInstances.add(attributeInstance);
		return attributeInstance;
	}

	/**
	 * This method creates a ReferenceInstance in the given {@link ExtendedEObjectReference} with
	 * the reference {@link EStructuralFeature} and the value {@link Object}.
	 */
	private static MultiValuedReferenceInstance createMultiValuedReferenceInstance(
			final EReference reference, final Collection<EObject> values,
			final ExtendedEObjectReference extendedEObjRef) {
		final MultiValuedReferenceInstance referenceInstance = SerializationFactory.eINSTANCE
				.createMultiValuedReferenceInstance();
		referenceInstance.setEReference(reference);
		if (values != null) {
			referenceInstance.getReferencedElements().addAll(values);
		}
		extendedEObjRef.getReferenceInstances().add(referenceInstance);
		return referenceInstance;
	}

	private static SingleValuedAttributeInstance getSingleValuedAttributeInstance(
			final ExtendedEObjectReference extendedEObjRef,
			final EAttribute eAttribute) {
		SingleValuedAttributeInstance result = null;
		final EList<AbstractAttributeInstance> attInstances = extendedEObjRef.getAttributeInstances();
		for (final AbstractAttributeInstance attributeInstance : attInstances) {
			if (eAttribute.equals(attributeInstance.getEAttribute())) {
				if (attributeInstance instanceof SingleValuedAttributeInstance) {
					result = (SingleValuedAttributeInstance) attributeInstance;
					break;
				}
				throw new IllegalStateException("single valued attribute should be associated to an instance of SingleValuedAttributeInstance"); //$NON-NLS-1$
			}
		}
		return result;
	}

	private static MultiValuedAttributeInstance getMultiValuedAttributeInstance(
			final ExtendedEObjectReference extendedEObjRef,
			final EAttribute eAttribute) {
		MultiValuedAttributeInstance result = null;
		final EList<AbstractAttributeInstance> attInstances = extendedEObjRef.getAttributeInstances();
		for (final AbstractAttributeInstance attributeInstance : attInstances) {
			if (eAttribute.equals(attributeInstance.getEAttribute())) {
				if (attributeInstance instanceof MultiValuedAttributeInstance) {
					result = (MultiValuedAttributeInstance) attributeInstance;
					break;
				}
				throw new IllegalStateException("multi valued attribute should be associated to an instance of MultiValuedAttributeInstance"); //$NON-NLS-1$

			}
		}
		return result;
	}

	private static SingleValuedReferenceInstance getSingleValuedReferenceInstance(
			final ExtendedEObjectReference extendedEObjRef,
			final EReference eReference) {
		SingleValuedReferenceInstance result = null;
		final EList<AbstractReferenceInstance> refInstances = extendedEObjRef.getReferenceInstances();
		for (final AbstractReferenceInstance referenceInstance : refInstances) {
			if (eReference.equals(referenceInstance.getEReference())) {
				if (referenceInstance instanceof SingleValuedReferenceInstance) {
					result = (SingleValuedReferenceInstance) referenceInstance;
					break;
				}
				throw new IllegalStateException(
						"a single valued non-containment reference should be associated to an instance of SingleValuedReferenceInstance"); //$NON-NLS-1$
			}
		}
		return result;
	}

	private static SingleValuedContainmentReferenceInstance getSingleValuedContainmentReferenceInstance(
			final ExtendedEObjectReference extendedEObjRef,
			final EReference eReference) {
		SingleValuedContainmentReferenceInstance result = null;
		final EList<AbstractReferenceInstance> refInstances = extendedEObjRef.getReferenceInstances();
		for (final AbstractReferenceInstance referenceInstance : refInstances) {
			if (eReference.equals(referenceInstance.getEReference())) {
				if (referenceInstance instanceof SingleValuedContainmentReferenceInstance) {
					result = (SingleValuedContainmentReferenceInstance) referenceInstance;
					break;
				}
				throw new IllegalStateException(
						"a single valued containment reference should be associated to an instance of SingleValuedContainmentReferenceInstance"); //$NON-NLS-1$
			}
		}
		return result;
	}

	private static MultiValuedReferenceInstance getMultiValuedReferenceInstance(
			final ExtendedEObjectReference extendedEObjRef,
			final EReference eReference) {
		MultiValuedReferenceInstance result = null;
		final EList<AbstractReferenceInstance> refInstances = extendedEObjRef
				.getReferenceInstances();
		for (final AbstractReferenceInstance referenceInstance : refInstances) {
			if (eReference.equals(referenceInstance.getEReference())) {
				if (referenceInstance instanceof MultiValuedReferenceInstance) {
					result = (MultiValuedReferenceInstance) referenceInstance;
					break;
				}
				throw new IllegalStateException(
						"a multi valued non-containment reference should be associated to an instance of MultiValuedReferenceInstance"); //$NON-NLS-1$
			}
		}
		return result;
	}

	private static MultiValuedContainmentReferenceInstance getMultiValuedContainmentReferenceInstance(
			final ExtendedEObjectReference extendedEObjRef,
			final EReference eReference) {
		MultiValuedContainmentReferenceInstance result = null;
		final EList<AbstractReferenceInstance> refInstances = extendedEObjRef.getReferenceInstances();
		for (final AbstractReferenceInstance referenceInstance : refInstances) {
			if (eReference.equals(referenceInstance.getEReference())) {
				if (referenceInstance instanceof MultiValuedContainmentReferenceInstance) {
					result = (MultiValuedContainmentReferenceInstance) referenceInstance;
					break;
				}
				throw new IllegalStateException(
						"a multi valued containment reference should be associated to an instance of MultiValuedContainmentReferenceInstance"); //$NON-NLS-1$
			}
		}
		return result;
	}

	public void saveStructuralFeatureInstanceModel()
			throws SaveStructuralFeatureInstanceModelException {
		if (this.sfInstResource == null) {
			throw new SaveStructuralFeatureInstanceModelException("This facet manager has been initailized with a null structural feature instances resource"); //$NON-NLS-1$
		}
		try {
			this.sfInstResource.save(Collections.EMPTY_MAP);
		} catch (final IOException e) {
			throw new SaveStructuralFeatureInstanceModelException(e);
		}
	}

	/**
	 * This method returns the ExtendedEObjectReference associated with the given {@link EObject} if
	 * it exists or creates it if it does not exist.
	 */
	private ExtendedEObjectReference getOrCreateExtendedEObjectReference(final EObject eObject) {
		ExtendedEObjectReference extendedEObjRef = SerializationManager
				.getExtendedEObjectReference(eObject);
		if (extendedEObjRef == null) {
			extendedEObjRef = SerializationFactory.eINSTANCE.createExtendedEObjectReference();
			extendedEObjRef.setExtendedEObject(eObject);
			if (this.sfInstResource != null) {
				this.sfInstResource.getContents().add(extendedEObjRef);
			}
			final LinkToExtendedEObjectReferenceAdapter adapter = (LinkToExtendedEObjectReferenceAdapter) ILinkToExtendedEObjectReferenceAdapterFactory.INSTANCE
					.adapt(eObject, ILinkToExtendedEObjectReference.class);
			adapter.setExtendedEObjectReference(extendedEObjRef);
		}
		return extendedEObjRef;
	}

	public void setAttribute(final EObject eObject, final EAttribute attribute,
			final Object newValue) {
		final ExtendedEObjectReference extendedEObjRef = this
				.getOrCreateExtendedEObjectReference(eObject);
		if (attribute.isMany()) {
			if (newValue instanceof List) {
				// safe to cast
				@SuppressWarnings("unchecked")
				final List<Object> list = (List<Object>) newValue;
				final MultiValuedAttributeInstance attributeInstance = SerializationManager
						.getMultiValuedAttributeInstance(extendedEObjRef,
								attribute);
				if (attributeInstance == null) {
					SerializationManager.createMultiValuedAttributeInstance(
							attribute, list, extendedEObjRef);
				} else {
					attributeInstance.getValues().clear();
					attributeInstance.getValues().addAll(list);
				}
			} else {
				throw new IllegalArgumentException("The given FacetAttribute is multiplicity-many, so the value must be a List"); //$NON-NLS-1$
			}
		} else {
			final SingleValuedAttributeInstance attributeInstance = SerializationManager
					.getSingleValuedAttributeInstance(extendedEObjRef,
							attribute);
			if (attributeInstance == null) {
				createSingleValuedAttributeInstance(attribute, newValue,
						extendedEObjRef);
			} else {
				attributeInstance.setValue(newValue);
			}
		}

	}


	/**
	 * This method creates an AttributeInstance in the given {@link ExtendedEObjectReference} with
	 * the attribute {@link EStructuralFeature} and the value {@link Object}.
	 */
	private static SingleValuedAttributeInstance createSingleValuedAttributeInstance(final EAttribute attribute, final Object value,
			final ExtendedEObjectReference extendedEObjRef) {
		final SingleValuedAttributeInstance attributeInstance = SerializationFactory.eINSTANCE
				.createSingleValuedAttributeInstance();
		attributeInstance.setEAttribute(attribute);
		attributeInstance.setValue(value);
		extendedEObjRef.getAttributeInstances().add(attributeInstance);
		return attributeInstance;
	}

	/**
	 * This method creates a ReferenceInstance in the given {@link ExtendedEObjectReference} with
	 * the reference {@link EStructuralFeature} and the value {@link Object}.
	 */
	private static SingleValuedReferenceInstance createSingleValuedReferenceInstance(final EReference reference, final EObject value,
			final ExtendedEObjectReference extendedEObjRef) {
		final SingleValuedReferenceInstance referenceInstance = SerializationFactory.eINSTANCE
				.createSingleValuedReferenceInstance();
		referenceInstance.setEReference(reference);
		referenceInstance.setReferencedElement(value);
		final EList<AbstractReferenceInstance> refInstances = extendedEObjRef
				.getReferenceInstances();
		refInstances.add(referenceInstance);
		return referenceInstance;
	}

	public void clearReference(final EObject eObject, final EReference reference) {
		final ExtendedEObjectReference extendedEObjRef = this
				.getOrCreateExtendedEObjectReference(eObject);
		if (reference.isMany()) {
			final MultiValuedReferenceInstance mValuedRefInst = getMultiValuedReferenceInstance(
					extendedEObjRef, reference);
			if (mValuedRefInst != null) {
				mValuedRefInst.getReferencedElements().clear();
			}
		} else {
			if (reference.isContainment()) {
				final SingleValuedContainmentReferenceInstance referenceInstance = SerializationManager
						.getSingleValuedContainmentReferenceInstance(
								extendedEObjRef, reference);
				if (referenceInstance != null) {
					referenceInstance.setOwnedElement(null);
				}
			} else {
				final SingleValuedReferenceInstance referenceInstance = SerializationManager
						.getSingleValuedReferenceInstance(extendedEObjRef,
								reference);
				if (referenceInstance != null) {
					referenceInstance.setReferencedElement(null);
				}
			}
		}
	}

	public void setReference(final EObject eObject, final EReference reference, final Object newValue) {
		final ExtendedEObjectReference extendedEObjRef = this
				.getOrCreateExtendedEObjectReference(eObject);
		if (reference.isMany()) {
			Collection<EObject> newList;
			try {
				newList = CastUtils.castToExpectedListType(
						newValue, EObject.class, false);
			} catch (UnmatchingExpectedTypeException e) {
				final String message = String.format(
						"The reference %s.%s is multivaluted, that's why the new value must be a list of EObjet.", //$NON-NLS-1$
						reference.getName(),
						reference.getEContainingClass().getName());
				throw new IllegalArgumentException(message, e);
			}
			final MultiValuedReferenceInstance mValuedRefInst =
					getMultiValuedReferenceInstance(
						extendedEObjRef,
						reference);
			if (mValuedRefInst == null) {
				createMultiValuedReferenceInstance(reference, newList, extendedEObjRef);
			} else {
				mValuedRefInst.getReferencedElements().clear();
				mValuedRefInst.getReferencedElements().addAll(newList);
			}
		} else {
			if (newValue != null && !(newValue instanceof EObject)) {
				throw new IllegalArgumentException("newValue should be an EObject because eStructuralFeature is an EReference"); //$NON-NLS-1$	
			}
			final EObject newEObjectValue = (EObject) newValue;
			if (reference.isContainment()) {
				final SingleValuedContainmentReferenceInstance referenceInstance =
					SerializationManager.getSingleValuedContainmentReferenceInstance(
						extendedEObjRef,
						reference);
				if (referenceInstance == null) {
					createSingleValuedContainmentReferenceInstance(
						reference, newEObjectValue, extendedEObjRef);
				} else {
					referenceInstance.setOwnedElement(newEObjectValue);
				}
			} else {
				final SingleValuedReferenceInstance referenceInstance =
						SerializationManager.getSingleValuedReferenceInstance(
								extendedEObjRef, reference);
				if (referenceInstance == null) {
					createSingleValuedReferenceInstance(
						reference, newEObjectValue, extendedEObjRef);
				} else {
					referenceInstance.setReferencedElement(newEObjectValue);
				}
			}
		}
	}

	/**
	 * This method creates a ReferenceInstance in the given {@link ExtendedEObjectReference} with
	 * the reference {@link EStructuralFeature} and the value {@link Object}.
	 */
	private static SingleValuedContainmentReferenceInstance createSingleValuedContainmentReferenceInstance(final EReference reference,
			final EObject value,
			final ExtendedEObjectReference extendedEObjRef) {
		final SingleValuedContainmentReferenceInstance containmentRefI = SerializationFactory.eINSTANCE
				.createSingleValuedContainmentReferenceInstance();
		containmentRefI.setEReference(reference);
		containmentRefI.setOwnedElement(value);
		extendedEObjRef.getReferenceInstances().add(containmentRefI);
		return containmentRefI;
	}

	private static List<?> getMultiValuedStructuralFeature(
			final EObject eObject, final EStructuralFeature structuralFeature) {
		List<?> result = null;
		final ExtendedEObjectReference extendedEObjRef = SerializationManager.getExtendedEObjectReference(eObject);
		if (extendedEObjRef == null) {
			result = Collections.emptyList();
		} else {
			if (structuralFeature instanceof EAttribute) {
				final EAttribute eAttribute = (EAttribute) structuralFeature;
				final MultiValuedAttributeInstance attributeInstance = SerializationManager
						.getMultiValuedAttributeInstance(extendedEObjRef,
								eAttribute);
				if (attributeInstance != null) {
					result = attributeInstance.getValues();
				}
			} else if (structuralFeature instanceof EReference) {
				final EReference eReference = (EReference) structuralFeature;
				if (eReference.isContainment()) {
					MultiValuedContainmentReferenceInstance referenceInstance = SerializationManager
							.getMultiValuedContainmentReferenceInstance(
									extendedEObjRef, eReference);
					if (referenceInstance == null) {
						referenceInstance = SerializationManager
								.createMultiValuedContainmentReferenceInstance(
										eReference, null, extendedEObjRef);
						result = referenceInstance.getOwnedElements();
					} else {
						result = referenceInstance.getOwnedElements();
					}
				} else {
					MultiValuedReferenceInstance referenceInstance = SerializationManager
							.getMultiValuedReferenceInstance(extendedEObjRef,
									eReference);
					if (referenceInstance == null) {
						referenceInstance = SerializationManager
								.createMultiValuedReferenceInstance(eReference,
										null, extendedEObjRef);
						result = referenceInstance.getReferencedElements();
					} else {
						result = referenceInstance.getReferencedElements();
					}
				}
			} else {
				final String message = String.format(
						"Getting a structural feature of type '%s' is not implemented", //$NON-NLS-1$
						structuralFeature.getClass().getName());
				throw new UnsupportedOperationException(message);
			}
		}
		return result;
	}

	private static Object getSingleValuedStructuralFeature(final EObject eObject, final EStructuralFeature structuralFeature) {
		Object result = structuralFeature.getDefaultValue();
		final ExtendedEObjectReference extendedEObjRef = SerializationManager
				.getExtendedEObjectReference(eObject);
		if (extendedEObjRef != null) {
			if (structuralFeature instanceof EAttribute) {
				final EAttribute eAttribute = (EAttribute) structuralFeature;
				final SingleValuedAttributeInstance attributeInstance = SerializationManager
						.getSingleValuedAttributeInstance(extendedEObjRef,
								eAttribute);
				if (attributeInstance != null) {
					result = attributeInstance.getValue();
				}
			} else if (structuralFeature instanceof EReference) {
				final EReference eReference = (EReference) structuralFeature;
				if (eReference.isContainment()) {
					final SingleValuedContainmentReferenceInstance referenceInstance = SerializationManager
							.getSingleValuedContainmentReferenceInstance(
									extendedEObjRef, eReference);
					if (referenceInstance != null) {
						result = referenceInstance.getOwnedElement();
					}
				} else {
					final SingleValuedReferenceInstance referenceInstance = SerializationManager
							.getSingleValuedReferenceInstance(extendedEObjRef,
									eReference);
					if (referenceInstance != null) {
						result = referenceInstance.getReferencedElement();
					}
				}
			} else {
				throw new IllegalArgumentException("Unexpected structuralFeature kind"); //$NON-NLS-1$
			}
		}
		return result;
	}

	public static Object getNotDerivedValue(final EObject eObject,
			final EStructuralFeature structuralFeature) {
		Object result;
		if (structuralFeature.isMany()) {
			result = SerializationManager.getMultiValuedStructuralFeature(
					eObject, structuralFeature);
		} else {
			result = SerializationManager.getSingleValuedStructuralFeature(eObject, structuralFeature);
		}
		return result;
	}

	public Resource getSerializationResource() {
		return this.sfInstResource;
	}

	public final void setSerializationResource(final Resource resource) {
		this.sfInstResource = resource;
		if (this.sfInstResource != null) {
			final EList<EObject> contents = this.sfInstResource.getContents();
			for (EObject eObject : contents) {
				if (eObject instanceof ExtendedEObjectReference) {
					final ExtendedEObjectReference extendedEObjRef = (ExtendedEObjectReference) eObject;
					final EObject extendedEObject = extendedEObjRef.getExtendedEObject();
					final LinkToExtendedEObjectReferenceAdapter adapter = 
						(LinkToExtendedEObjectReferenceAdapter) ILinkToExtendedEObjectReferenceAdapterFactory
						.INSTANCE.adapt(
								extendedEObject,
								ILinkToExtendedEObjectReference.class);
					adapter.setExtendedEObjectReference(extendedEObjRef);
					final EList<AbstractAttributeInstance> attInstances = extendedEObjRef
							.getAttributeInstances();
					for (final AbstractAttributeInstance attributeInstance : attInstances) {
						final EAttribute attribute = attributeInstance
								.getEAttribute();
						FacetManagerInternalUtils.loadParentFacetSet(attribute,
								this.facetManager);
					}
					final EList<AbstractReferenceInstance> refInstances = extendedEObjRef
							.getReferenceInstances();
					for (final AbstractReferenceInstance referenceInstance : refInstances) {
						final EReference reference = referenceInstance
								.getEReference();
						FacetManagerInternalUtils.loadParentFacetSet(reference,
								this.facetManager);
					}
				}
			}
		}
	}

}
