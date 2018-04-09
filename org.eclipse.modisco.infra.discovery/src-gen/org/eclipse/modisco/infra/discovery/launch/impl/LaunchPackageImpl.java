/**
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Fabien Giquel (Mia-Software) - design and implementation
 * 
 */
package org.eclipse.modisco.infra.discovery.launch.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.facet.util.emf.catalog.CatalogPackage;

import org.eclipse.emf.facet.util.emf.core.serialization.model.serialization.SerializationPackage;

import org.eclipse.modisco.infra.discovery.catalog.impl.CatalogPackageImpl;

import org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration;
import org.eclipse.modisco.infra.discovery.launch.LaunchFactory;
import org.eclipse.modisco.infra.discovery.launch.LaunchPackage;
import org.eclipse.modisco.infra.discovery.launch.ParameterValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LaunchPackageImpl extends EPackageImpl implements LaunchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass launchConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueEClass = null;

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
	 * @see org.eclipse.modisco.infra.discovery.launch.LaunchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LaunchPackageImpl() {
		super(eNS_URI, LaunchFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LaunchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LaunchPackage init() {
		if (isInited) return (LaunchPackage)EPackage.Registry.INSTANCE.getEPackage(LaunchPackage.eNS_URI);

		// Obtain or create and register package
		LaunchPackageImpl theLaunchPackage = (LaunchPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LaunchPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LaunchPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CatalogPackage.eINSTANCE.eClass();
		SerializationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CatalogPackageImpl theCatalogPackage_1 = (CatalogPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.eclipse.modisco.infra.discovery.catalog.CatalogPackage.eNS_URI) instanceof CatalogPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.eclipse.modisco.infra.discovery.catalog.CatalogPackage.eNS_URI) : org.eclipse.modisco.infra.discovery.catalog.CatalogPackage.eINSTANCE);

		// Create package meta-data objects
		theLaunchPackage.createPackageContents();
		theCatalogPackage_1.createPackageContents();

		// Initialize created meta-data
		theLaunchPackage.initializePackageContents();
		theCatalogPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLaunchPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LaunchPackage.eNS_URI, theLaunchPackage);
		return theLaunchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLaunchConfiguration() {
		return launchConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaunchConfiguration_Source() {
		return (EAttribute)launchConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLaunchConfiguration_ParameterValues() {
		return (EReference)launchConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLaunchConfiguration_Discoverer() {
		return (EReference)launchConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLaunchConfiguration_OpenModelAfterDiscovery() {
		return (EAttribute)launchConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValue() {
		return parameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_Parameter() {
		return (EReference)parameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValue_Value() {
		return (EAttribute)parameterValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaunchFactory getLaunchFactory() {
		return (LaunchFactory)getEFactoryInstance();
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
		launchConfigurationEClass = createEClass(LAUNCH_CONFIGURATION);
		createEAttribute(launchConfigurationEClass, LAUNCH_CONFIGURATION__SOURCE);
		createEReference(launchConfigurationEClass, LAUNCH_CONFIGURATION__PARAMETER_VALUES);
		createEReference(launchConfigurationEClass, LAUNCH_CONFIGURATION__DISCOVERER);
		createEAttribute(launchConfigurationEClass, LAUNCH_CONFIGURATION__OPEN_MODEL_AFTER_DISCOVERY);

		parameterValueEClass = createEClass(PARAMETER_VALUE);
		createEReference(parameterValueEClass, PARAMETER_VALUE__PARAMETER);
		createEAttribute(parameterValueEClass, PARAMETER_VALUE__VALUE);
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
		SerializationPackage theSerializationPackage = (SerializationPackage)EPackage.Registry.INSTANCE.getEPackage(SerializationPackage.eNS_URI);
		org.eclipse.modisco.infra.discovery.catalog.CatalogPackage theCatalogPackage_1 = (org.eclipse.modisco.infra.discovery.catalog.CatalogPackage)EPackage.Registry.INSTANCE.getEPackage(org.eclipse.modisco.infra.discovery.catalog.CatalogPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(launchConfigurationEClass, LaunchConfiguration.class, "LaunchConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLaunchConfiguration_Source(), theSerializationPackage.getExtensibleSerializableJavaObject(), "source", null, 0, 1, LaunchConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLaunchConfiguration_ParameterValues(), this.getParameterValue(), null, "parameterValues", null, 0, -1, LaunchConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLaunchConfiguration_Discoverer(), theCatalogPackage_1.getDiscovererDescription(), null, "discoverer", null, 1, 1, LaunchConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLaunchConfiguration_OpenModelAfterDiscovery(), ecorePackage.getEBoolean(), "openModelAfterDiscovery", null, 0, 1, LaunchConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterValueEClass, ParameterValue.class, "ParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterValue_Parameter(), theCatalogPackage_1.getDiscovererParameter(), null, "parameter", null, 1, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterValue_Value(), theSerializationPackage.getExtensibleSerializableJavaObject(), "value", null, 0, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LaunchPackageImpl
