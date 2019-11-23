/**
 * Copyright (c) 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.smm.quality.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.modisco.omg.smm.SmmPackage;

import org.eclipse.modisco.smm.quality.Measurand;
import org.eclipse.modisco.smm.quality.QualityScope;
import org.eclipse.modisco.smm.quality.SmmqualityFactory;
import org.eclipse.modisco.smm.quality.SmmqualityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmmqualityPackageImpl extends EPackageImpl implements SmmqualityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurandEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.modisco.smm.quality.SmmqualityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SmmqualityPackageImpl() {
		super(eNS_URI, SmmqualityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SmmqualityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SmmqualityPackage init() {
		if (isInited) return (SmmqualityPackage)EPackage.Registry.INSTANCE.getEPackage(SmmqualityPackage.eNS_URI);

		// Obtain or create and register package
		SmmqualityPackageImpl theSmmqualityPackage = (SmmqualityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SmmqualityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SmmqualityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SmmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSmmqualityPackage.createPackageContents();

		// Initialize created meta-data
		theSmmqualityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSmmqualityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SmmqualityPackage.eNS_URI, theSmmqualityPackage);
		return theSmmqualityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityScope() {
		return qualityScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityScope_Children() {
		return (EReference)qualityScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityScope_Parent() {
		return (EReference)qualityScopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurand() {
		return measurandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurand_QualifiedName() {
		return (EAttribute)measurandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurand_Path() {
		return (EAttribute)measurandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmmqualityFactory getSmmqualityFactory() {
		return (SmmqualityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		qualityScopeEClass = createEClass(QUALITY_SCOPE);
		createEReference(qualityScopeEClass, QUALITY_SCOPE__CHILDREN);
		createEReference(qualityScopeEClass, QUALITY_SCOPE__PARENT);

		measurandEClass = createEClass(MEASURAND);
		createEAttribute(measurandEClass, MEASURAND__QUALIFIED_NAME);
		createEAttribute(measurandEClass, MEASURAND__PATH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SmmPackage theSmmPackage = (SmmPackage)EPackage.Registry.INSTANCE.getEPackage(SmmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		qualityScopeEClass.getESuperTypes().add(theSmmPackage.getScope());
		measurandEClass.getESuperTypes().add(theSmmPackage.getAbstractMeasureElement());

		// Initialize classes and features; add operations and parameters
		initEClass(qualityScopeEClass, QualityScope.class, "QualityScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityScope_Children(), this.getQualityScope(), this.getQualityScope_Parent(), "children", null, 0, -1, QualityScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityScope_Parent(), this.getQualityScope(), this.getQualityScope_Children(), "parent", null, 0, 1, QualityScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurandEClass, Measurand.class, "Measurand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasurand_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, Measurand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurand_Path(), ecorePackage.getEString(), "path", null, 0, 1, Measurand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SmmqualityPackageImpl
