/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.infra.browser.custom.emf.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
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
import org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomFactory;
import org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomPackage;
import org.eclipse.gmt.modisco.infra.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
@SuppressWarnings("all")
public class UicustomPackageImpl extends EPackageImpl implements UicustomPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customViewFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureValueCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticFeatureValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedFeatureValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum customizableFeaturesEEnum = null;

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
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UicustomPackageImpl() {
		super(eNS_URI, UicustomFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UicustomPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UicustomPackage init() {
		if (isInited) return (UicustomPackage)EPackage.Registry.INSTANCE.getEPackage(UicustomPackage.eNS_URI);

		// Obtain or create and register package
		UicustomPackageImpl theUicustomPackage = (UicustomPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UicustomPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UicustomPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		QueryPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUicustomPackage.createPackageContents();

		// Initialize created meta-data
		theUicustomPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUicustomPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UicustomPackage.eNS_URI, theUicustomPackage);
		return theUicustomPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelView() {
		return metamodelViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelView_Name() {
		return (EAttribute)metamodelViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelView_MetamodelURI() {
		return (EAttribute)metamodelViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelView_AllQuerySetsAvailable() {
		return (EAttribute)metamodelViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelView_AvailableQuerySets() {
		return (EAttribute)metamodelViewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelView_Location() {
		return (EAttribute)metamodelViewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetamodelView_Types() {
		return (EReference)metamodelViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeView() {
		return typeViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeView_MetaclassName() {
		return (EAttribute)typeViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeView_AppliesToSubInstances() {
		return (EAttribute)typeViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeView_Attributes() {
		return (EReference)typeViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeView_References() {
		return (EReference)typeViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeView_MetamodelView() {
		return (EReference)typeViewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeView() {
		return attributeViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeView_AttributeName() {
		return (EAttribute)attributeViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeView_Type() {
		return (EReference)attributeViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceView() {
		return referenceViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceView_ReferenceName() {
		return (EAttribute)referenceViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceView_Type() {
		return (EReference)referenceViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomView() {
		return customViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomView_CustomizedFeatures() {
		return (EReference)customViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomViewFeature() {
		return customViewFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomViewFeature_CustomizedFeature() {
		return (EAttribute)customViewFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomViewFeature_ValueCases() {
		return (EReference)customViewFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomViewFeature_DefaultValue() {
		return (EReference)customViewFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomViewFeature_CustomView() {
		return (EReference)customViewFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureValueCase() {
		return featureValueCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValueCase_Condition() {
		return (EReference)featureValueCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValueCase_Value() {
		return (EReference)featureValueCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValueCase_Feature() {
		return (EReference)featureValueCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureValue() {
		return featureValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_Feature() {
		return (EReference)featureValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValue_Case() {
		return (EReference)featureValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticFeatureValue() {
		return staticFeatureValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticFeatureValue_Value() {
		return (EAttribute)staticFeatureValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedFeatureValue() {
		return derivedFeatureValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedFeatureValue_ValueCalculator() {
		return (EReference)derivedFeatureValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCustomizableFeatures() {
		return customizableFeaturesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UicustomFactory getUicustomFactory() {
		return (UicustomFactory)getEFactoryInstance();
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
		metamodelViewEClass = createEClass(METAMODEL_VIEW);
		createEAttribute(metamodelViewEClass, METAMODEL_VIEW__NAME);
		createEReference(metamodelViewEClass, METAMODEL_VIEW__TYPES);
		createEAttribute(metamodelViewEClass, METAMODEL_VIEW__METAMODEL_URI);
		createEAttribute(metamodelViewEClass, METAMODEL_VIEW__ALL_QUERY_SETS_AVAILABLE);
		createEAttribute(metamodelViewEClass, METAMODEL_VIEW__AVAILABLE_QUERY_SETS);
		createEAttribute(metamodelViewEClass, METAMODEL_VIEW__LOCATION);

		typeViewEClass = createEClass(TYPE_VIEW);
		createEAttribute(typeViewEClass, TYPE_VIEW__METACLASS_NAME);
		createEAttribute(typeViewEClass, TYPE_VIEW__APPLIES_TO_SUB_INSTANCES);
		createEReference(typeViewEClass, TYPE_VIEW__ATTRIBUTES);
		createEReference(typeViewEClass, TYPE_VIEW__REFERENCES);
		createEReference(typeViewEClass, TYPE_VIEW__METAMODEL_VIEW);

		attributeViewEClass = createEClass(ATTRIBUTE_VIEW);
		createEAttribute(attributeViewEClass, ATTRIBUTE_VIEW__ATTRIBUTE_NAME);
		createEReference(attributeViewEClass, ATTRIBUTE_VIEW__TYPE);

		referenceViewEClass = createEClass(REFERENCE_VIEW);
		createEAttribute(referenceViewEClass, REFERENCE_VIEW__REFERENCE_NAME);
		createEReference(referenceViewEClass, REFERENCE_VIEW__TYPE);

		customViewEClass = createEClass(CUSTOM_VIEW);
		createEReference(customViewEClass, CUSTOM_VIEW__CUSTOMIZED_FEATURES);

		customViewFeatureEClass = createEClass(CUSTOM_VIEW_FEATURE);
		createEAttribute(customViewFeatureEClass, CUSTOM_VIEW_FEATURE__CUSTOMIZED_FEATURE);
		createEReference(customViewFeatureEClass, CUSTOM_VIEW_FEATURE__VALUE_CASES);
		createEReference(customViewFeatureEClass, CUSTOM_VIEW_FEATURE__DEFAULT_VALUE);
		createEReference(customViewFeatureEClass, CUSTOM_VIEW_FEATURE__CUSTOM_VIEW);

		featureValueCaseEClass = createEClass(FEATURE_VALUE_CASE);
		createEReference(featureValueCaseEClass, FEATURE_VALUE_CASE__VALUE);
		createEReference(featureValueCaseEClass, FEATURE_VALUE_CASE__FEATURE);
		createEReference(featureValueCaseEClass, FEATURE_VALUE_CASE__CONDITION);

		featureValueEClass = createEClass(FEATURE_VALUE);
		createEReference(featureValueEClass, FEATURE_VALUE__FEATURE);
		createEReference(featureValueEClass, FEATURE_VALUE__CASE);

		staticFeatureValueEClass = createEClass(STATIC_FEATURE_VALUE);
		createEAttribute(staticFeatureValueEClass, STATIC_FEATURE_VALUE__VALUE);

		derivedFeatureValueEClass = createEClass(DERIVED_FEATURE_VALUE);
		createEReference(derivedFeatureValueEClass, DERIVED_FEATURE_VALUE__VALUE_CALCULATOR);

		// Create enums
		customizableFeaturesEEnum = createEEnum(CUSTOMIZABLE_FEATURES);
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
		QueryPackage theQueryPackage = (QueryPackage)EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeViewEClass.getESuperTypes().add(this.getCustomView());
		attributeViewEClass.getESuperTypes().add(this.getCustomView());
		referenceViewEClass.getESuperTypes().add(this.getCustomView());
		staticFeatureValueEClass.getESuperTypes().add(this.getFeatureValue());
		derivedFeatureValueEClass.getESuperTypes().add(this.getFeatureValue());

		// Initialize classes and features; add operations and parameters
		initEClass(metamodelViewEClass, MetamodelView.class, "MetamodelView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetamodelView_Name(), ecorePackage.getEString(), "name", null, 1, 1, MetamodelView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMetamodelView_Types(), this.getTypeView(), this.getTypeView_MetamodelView(), "types", null, 0, -1, MetamodelView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetamodelView_MetamodelURI(), ecorePackage.getEString(), "metamodelURI", null, 0, 1, MetamodelView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetamodelView_AllQuerySetsAvailable(), ecorePackage.getEBoolean(), "allQuerySetsAvailable", "true", 1, 1, MetamodelView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetamodelView_AvailableQuerySets(), ecorePackage.getEString(), "availableQuerySets", null, 0, -1, MetamodelView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetamodelView_Location(), ecorePackage.getEString(), "location", null, 0, 1, MetamodelView.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeViewEClass, TypeView.class, "TypeView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeView_MetaclassName(), ecorePackage.getEString(), "metaclassName", null, 0, 1, TypeView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeView_AppliesToSubInstances(), ecorePackage.getEBoolean(), "appliesToSubInstances", "true", 0, 1, TypeView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeView_Attributes(), this.getAttributeView(), this.getAttributeView_Type(), "attributes", null, 0, -1, TypeView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeView_References(), this.getReferenceView(), this.getReferenceView_Type(), "references", null, 0, -1, TypeView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeView_MetamodelView(), this.getMetamodelView(), this.getMetamodelView_Types(), "metamodelView", null, 1, 1, TypeView.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeViewEClass, AttributeView.class, "AttributeView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeView_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, AttributeView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeView_Type(), this.getTypeView(), this.getTypeView_Attributes(), "type", null, 1, 1, AttributeView.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceViewEClass, ReferenceView.class, "ReferenceView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceView_ReferenceName(), ecorePackage.getEString(), "referenceName", null, 0, 1, ReferenceView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceView_Type(), this.getTypeView(), this.getTypeView_References(), "type", null, 1, 1, ReferenceView.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customViewEClass, CustomView.class, "CustomView", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomView_CustomizedFeatures(), this.getCustomViewFeature(), this.getCustomViewFeature_CustomView(), "customizedFeatures", null, 0, -1, CustomView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customViewFeatureEClass, CustomViewFeature.class, "CustomViewFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomViewFeature_CustomizedFeature(), this.getCustomizableFeatures(), "customizedFeature", null, 0, 1, CustomViewFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomViewFeature_ValueCases(), this.getFeatureValueCase(), this.getFeatureValueCase_Feature(), "valueCases", null, 0, -1, CustomViewFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomViewFeature_DefaultValue(), this.getFeatureValue(), this.getFeatureValue_Feature(), "defaultValue", null, 0, 1, CustomViewFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomViewFeature_CustomView(), this.getCustomView(), this.getCustomView_CustomizedFeatures(), "customView", null, 1, 1, CustomViewFeature.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureValueCaseEClass, FeatureValueCase.class, "FeatureValueCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureValueCase_Value(), this.getFeatureValue(), this.getFeatureValue_Case(), "value", null, 1, 1, FeatureValueCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureValueCase_Feature(), this.getCustomViewFeature(), this.getCustomViewFeature_ValueCases(), "feature", null, 1, 1, FeatureValueCase.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureValueCase_Condition(), theQueryPackage.getModelQuery(), null, "condition", null, 1, 1, FeatureValueCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureValueEClass, FeatureValue.class, "FeatureValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureValue_Feature(), this.getCustomViewFeature(), this.getCustomViewFeature_DefaultValue(), "feature", null, 0, 1, FeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureValue_Case(), this.getFeatureValueCase(), this.getFeatureValueCase_Value(), "case", null, 0, 1, FeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticFeatureValueEClass, StaticFeatureValue.class, "StaticFeatureValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticFeatureValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StaticFeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedFeatureValueEClass, DerivedFeatureValue.class, "DerivedFeatureValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedFeatureValue_ValueCalculator(), theQueryPackage.getModelQuery(), null, "valueCalculator", null, 1, 1, DerivedFeatureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(customizableFeaturesEEnum, CustomizableFeatures.class, "CustomizableFeatures");
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.VISIBLE);
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.LABEL);
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.FONT_NAME);
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.COLOR);
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.BACKGROUND_COLOR);
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.ICON);
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.BOLD);
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.ITALIC);
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.UNDERLINED);
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.STRUCKTHROUGH);
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.HIDE_METACLASS_NAME);
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.FACET_MAIN_ICON);
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.FACET_OVERLAY_ICON);
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.METACLASS_VISIBLE);
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.COLLAPSE_LINK);
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.METACLASS_ICON);
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.INSTANCE_ICON);
		addEEnumLiteral(customizableFeaturesEEnum, CustomizableFeatures.STICKER_ICON);

		// Create resource
		createResource(eNS_URI);
	}

} //UicustomPackageImpl
