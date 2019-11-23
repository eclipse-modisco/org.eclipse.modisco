/**
 *  Copyright (c) 2011, 2015 Mia-Software, and Soft-Maint.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *     Gregoire Dupe (Mia-Software) - Design
 *     Nicolas Guyomar (Mia-Software) - Implementation
 *     Emmanuelle Rouillé (Mia-Software) - Bug 352618 - To be able to use non derived facet structural features and save them values. 
 *     Nicolas Bros (Mia-Software) - Bug 361823 - [Restructuring] eFacet2 meta-model
 *     Gregoire Dupe (Mia-Software) - Bug 366055 - NavigationQuery
 *     Gregoire Dupe (Mia-Software) - Bug 369673 - [Facet] IsOneOfQuery
 *     Olivier Remaud (Soft-Maint) - Bug 369824 - Add a simple way to return string literal constants from a customization query
 *     Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *     Gregoire Dupe (Mia-software) - Bug 364325 - [Restructuring] The user must be able to navigate into a model using the Facet.
 *     Nicolas Bros (Mia-Software) - Bug 372626 - [Facet] Aggregates
 *     Nicolas Bros (Mia-Software) - Bug 376941 - [EFacet] Facet operation arguments in Facet model
 *     Gregoire Dupe (Mia-Software) - Bug 376576 - [EFacet] Change the multiplicity of Facet::extendedFacet
 *     Jonathan Pepin (Soft-Maint) - Bug 463898 - Create FacetReference not derived, without query and with opposite mechanism
 */
package org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.serialization.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.serialization.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SerializationFactoryImpl extends EFactoryImpl implements SerializationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SerializationFactory init() {
		try {
			SerializationFactory theSerializationFactory = (SerializationFactory)EPackage.Registry.INSTANCE.getEFactory(SerializationPackage.eNS_URI);
			if (theSerializationFactory != null) {
				return theSerializationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SerializationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SerializationPackage.ABSTRACT_REFERENCE_INSTANCE: return createAbstractReferenceInstance();
			case SerializationPackage.MULTI_VALUED_CONTAINMENT_REFERENCE_INSTANCE: return createMultiValuedContainmentReferenceInstance();
			case SerializationPackage.MULTI_VALUED_REFERENCE_INSTANCE: return createMultiValuedReferenceInstance();
			case SerializationPackage.SINGLE_VALUED_ATTRIBUTE_INSTANCE: return createSingleValuedAttributeInstance();
			case SerializationPackage.EXTENDED_EOBJECT_REFERENCE: return createExtendedEObjectReference();
			case SerializationPackage.SINGLE_VALUED_CONTAINMENT_REFERENCE_INSTANCE: return createSingleValuedContainmentReferenceInstance();
			case SerializationPackage.SINGLE_VALUED_REFERENCE_INSTANCE: return createSingleValuedReferenceInstance();
			case SerializationPackage.MULTI_VALUED_ATTRIBUTE_INSTANCE: return createMultiValuedAttributeInstance();
			case SerializationPackage.ABSTRACT_ATTRIBUTE_INSTANCE: return createAbstractAttributeInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractReferenceInstance createAbstractReferenceInstance() {
		AbstractReferenceInstanceImpl abstractReferenceInstance = new AbstractReferenceInstanceImpl();
		return abstractReferenceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiValuedContainmentReferenceInstance createMultiValuedContainmentReferenceInstance() {
		MultiValuedContainmentReferenceInstanceImpl multiValuedContainmentReferenceInstance = new MultiValuedContainmentReferenceInstanceImpl();
		return multiValuedContainmentReferenceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiValuedReferenceInstance createMultiValuedReferenceInstance() {
		MultiValuedReferenceInstanceImpl multiValuedReferenceInstance = new MultiValuedReferenceInstanceImpl();
		return multiValuedReferenceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedAttributeInstance createSingleValuedAttributeInstance() {
		SingleValuedAttributeInstanceImpl singleValuedAttributeInstance = new SingleValuedAttributeInstanceImpl();
		return singleValuedAttributeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedEObjectReference createExtendedEObjectReference() {
		ExtendedEObjectReferenceImpl extendedEObjectReference = new ExtendedEObjectReferenceImpl();
		return extendedEObjectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedContainmentReferenceInstance createSingleValuedContainmentReferenceInstance() {
		SingleValuedContainmentReferenceInstanceImpl singleValuedContainmentReferenceInstance = new SingleValuedContainmentReferenceInstanceImpl();
		return singleValuedContainmentReferenceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedReferenceInstance createSingleValuedReferenceInstance() {
		SingleValuedReferenceInstanceImpl singleValuedReferenceInstance = new SingleValuedReferenceInstanceImpl();
		return singleValuedReferenceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiValuedAttributeInstance createMultiValuedAttributeInstance() {
		MultiValuedAttributeInstanceImpl multiValuedAttributeInstance = new MultiValuedAttributeInstanceImpl();
		return multiValuedAttributeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAttributeInstance createAbstractAttributeInstance() {
		AbstractAttributeInstanceImpl abstractAttributeInstance = new AbstractAttributeInstanceImpl();
		return abstractAttributeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializationPackage getSerializationPackage() {
		return (SerializationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SerializationPackage getPackage() {
		return SerializationPackage.eINSTANCE;
	}

} //SerializationFactoryImpl
