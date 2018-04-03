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
package org.eclipse.modisco.infra.discovery.catalog.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import java.util.Map.Entry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.facet.util.emf.core.serialization.model.serialization.SerializationPackage;

import org.eclipse.modisco.infra.discovery.catalog.CatalogFactory;
import org.eclipse.modisco.infra.discovery.catalog.CatalogPackage;
import org.eclipse.modisco.infra.discovery.catalog.DirectionKind;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererCatalog;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;

import org.eclipse.modisco.infra.discovery.launch.LaunchPackage;

import org.eclipse.modisco.infra.discovery.launch.impl.LaunchPackageImpl;

import org.osgi.framework.Bundle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogPackageImpl extends EPackageImpl implements CatalogPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discovererDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discovererParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discovererCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eStringToObjectMapEntryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bundleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType methodEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fieldEDataType = null;

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
	 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CatalogPackageImpl() {
		super(eNS_URI, CatalogFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CatalogPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CatalogPackage init() {
		if (isInited) return (CatalogPackage)EPackage.Registry.INSTANCE.getEPackage(CatalogPackage.eNS_URI);

		// Obtain or create and register package
		CatalogPackageImpl theCatalogPackage = (CatalogPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CatalogPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CatalogPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		org.eclipse.emf.facet.util.emf.catalog.CatalogPackage.eINSTANCE.eClass();
		SerializationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		LaunchPackageImpl theLaunchPackage = (LaunchPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LaunchPackage.eNS_URI) instanceof LaunchPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LaunchPackage.eNS_URI) : LaunchPackage.eINSTANCE);

		// Create package meta-data objects
		theCatalogPackage.createPackageContents();
		theLaunchPackage.createPackageContents();

		// Initialize created meta-data
		theCatalogPackage.initializePackageContents();
		theLaunchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCatalogPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CatalogPackage.eNS_URI, theCatalogPackage);
		return theCatalogPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscovererDescription() {
		return discovererDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscovererDescription_ParameterDefinitions() {
		return (EReference)discovererDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovererDescription_Id() {
		return (EAttribute)discovererDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovererDescription_SourceType() {
		return (EAttribute)discovererDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovererDescription_ImplementationType() {
		return (EAttribute)discovererDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovererDescription_ImplementationBundle() {
		return (EAttribute)discovererDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscovererParameter() {
		return discovererParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscovererParameter_Discoverer() {
		return (EReference)discovererParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovererParameter_Id() {
		return (EAttribute)discovererParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovererParameter_Direction() {
		return (EAttribute)discovererParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovererParameter_Description() {
		return (EAttribute)discovererParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovererParameter_RequiredInput() {
		return (EAttribute)discovererParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovererParameter_Type() {
		return (EAttribute)discovererParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovererParameter_Field() {
		return (EAttribute)discovererParameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovererParameter_Getter() {
		return (EAttribute)discovererParameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovererParameter_Setter() {
		return (EAttribute)discovererParameterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovererParameter_Initializer() {
		return (EAttribute)discovererParameterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscovererCatalog() {
		return discovererCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscovererCatalog_InstalledDiscoverers() {
		return (EReference)discovererCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionKind() {
		return directionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEStringToObjectMapEntry() {
		return eStringToObjectMapEntryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBundle() {
		return bundleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMethod() {
		return methodEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getField() {
		return fieldEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogFactory getCatalogFactory() {
		return (CatalogFactory)getEFactoryInstance();
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
		discovererDescriptionEClass = createEClass(DISCOVERER_DESCRIPTION);
		createEReference(discovererDescriptionEClass, DISCOVERER_DESCRIPTION__PARAMETER_DEFINITIONS);
		createEAttribute(discovererDescriptionEClass, DISCOVERER_DESCRIPTION__ID);
		createEAttribute(discovererDescriptionEClass, DISCOVERER_DESCRIPTION__SOURCE_TYPE);
		createEAttribute(discovererDescriptionEClass, DISCOVERER_DESCRIPTION__IMPLEMENTATION_TYPE);
		createEAttribute(discovererDescriptionEClass, DISCOVERER_DESCRIPTION__IMPLEMENTATION_BUNDLE);

		discovererParameterEClass = createEClass(DISCOVERER_PARAMETER);
		createEReference(discovererParameterEClass, DISCOVERER_PARAMETER__DISCOVERER);
		createEAttribute(discovererParameterEClass, DISCOVERER_PARAMETER__ID);
		createEAttribute(discovererParameterEClass, DISCOVERER_PARAMETER__DIRECTION);
		createEAttribute(discovererParameterEClass, DISCOVERER_PARAMETER__DESCRIPTION);
		createEAttribute(discovererParameterEClass, DISCOVERER_PARAMETER__REQUIRED_INPUT);
		createEAttribute(discovererParameterEClass, DISCOVERER_PARAMETER__TYPE);
		createEAttribute(discovererParameterEClass, DISCOVERER_PARAMETER__FIELD);
		createEAttribute(discovererParameterEClass, DISCOVERER_PARAMETER__GETTER);
		createEAttribute(discovererParameterEClass, DISCOVERER_PARAMETER__SETTER);
		createEAttribute(discovererParameterEClass, DISCOVERER_PARAMETER__INITIALIZER);

		discovererCatalogEClass = createEClass(DISCOVERER_CATALOG);
		createEReference(discovererCatalogEClass, DISCOVERER_CATALOG__INSTALLED_DISCOVERERS);

		// Create enums
		directionKindEEnum = createEEnum(DIRECTION_KIND);

		// Create data types
		eStringToObjectMapEntryEDataType = createEDataType(ESTRING_TO_OBJECT_MAP_ENTRY);
		bundleEDataType = createEDataType(BUNDLE);
		methodEDataType = createEDataType(METHOD);
		fieldEDataType = createEDataType(FIELD);
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
		org.eclipse.emf.facet.util.emf.catalog.CatalogPackage theCatalogPackage_1 = (org.eclipse.emf.facet.util.emf.catalog.CatalogPackage)EPackage.Registry.INSTANCE.getEPackage(org.eclipse.emf.facet.util.emf.catalog.CatalogPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		discovererCatalogEClass.getESuperTypes().add(theCatalogPackage_1.getCatalog());

		// Initialize classes and features; add operations and parameters
		initEClass(discovererDescriptionEClass, DiscovererDescription.class, "DiscovererDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscovererDescription_ParameterDefinitions(), this.getDiscovererParameter(), this.getDiscovererParameter_Discoverer(), "parameterDefinitions", null, 0, -1, DiscovererDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovererDescription_Id(), ecorePackage.getEString(), "id", null, 1, 1, DiscovererDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getDiscovererDescription_SourceType(), g1, "sourceType", null, 1, 1, DiscovererDescription.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getDiscovererDescription_ImplementationType(), g1, "implementationType", null, 1, 1, DiscovererDescription.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovererDescription_ImplementationBundle(), this.getBundle(), "implementationBundle", null, 1, 1, DiscovererDescription.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(discovererDescriptionEClass, this.getDiscovererParameter(), "getParameterDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "parameterName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(discovererParameterEClass, DiscovererParameter.class, "DiscovererParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscovererParameter_Discoverer(), this.getDiscovererDescription(), this.getDiscovererDescription_ParameterDefinitions(), "discoverer", null, 1, 1, DiscovererParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovererParameter_Id(), ecorePackage.getEString(), "id", null, 1, 1, DiscovererParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovererParameter_Direction(), this.getDirectionKind(), "direction", null, 0, 1, DiscovererParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovererParameter_Description(), ecorePackage.getEString(), "description", null, 0, 1, DiscovererParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovererParameter_RequiredInput(), ecorePackage.getEBoolean(), "requiredInput", null, 0, 1, DiscovererParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getDiscovererParameter_Type(), g1, "type", null, 1, 1, DiscovererParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovererParameter_Field(), this.getField(), "field", null, 0, 1, DiscovererParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovererParameter_Getter(), this.getMethod(), "getter", null, 0, 1, DiscovererParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovererParameter_Setter(), this.getMethod(), "setter", null, 0, 1, DiscovererParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovererParameter_Initializer(), this.getMethod(), "initializer", null, 0, 1, DiscovererParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discovererCatalogEClass, DiscovererCatalog.class, "DiscovererCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscovererCatalog_InstalledDiscoverers(), this.getDiscovererDescription(), null, "installedDiscoverers", null, 0, -1, DiscovererCatalog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionKindEEnum, DirectionKind.class, "DirectionKind");
		addEEnumLiteral(directionKindEEnum, DirectionKind.IN);
		addEEnumLiteral(directionKindEEnum, DirectionKind.INOUT);
		addEEnumLiteral(directionKindEEnum, DirectionKind.OUT);

		// Initialize data types
		initEDataType(eStringToObjectMapEntryEDataType, Entry.class, "EStringToObjectMapEntry", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.Map.Entry<String, Object>");
		initEDataType(bundleEDataType, Bundle.class, "Bundle", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(methodEDataType, Method.class, "Method", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fieldEDataType, Field.class, "Field", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CatalogPackageImpl
