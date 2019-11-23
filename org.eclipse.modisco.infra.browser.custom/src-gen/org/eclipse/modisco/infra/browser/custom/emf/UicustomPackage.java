/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.browser.custom.emf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomFactory
 * @model kind="package"
 * @generated
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
@SuppressWarnings("all")
public interface UicustomPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "custom";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/infra/browser/custom/0.8";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uicustom";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UicustomPackage eINSTANCE = org.eclipse.modisco.infra.browser.custom.emf.impl.UicustomPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.browser.custom.emf.impl.MetamodelViewImpl <em>Metamodel View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.MetamodelViewImpl
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.UicustomPackageImpl#getMetamodelView()
	 * @generated
	 */
	int METAMODEL_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VIEW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VIEW__TYPES = 1;

	/**
	 * The feature id for the '<em><b>Metamodel URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VIEW__METAMODEL_URI = 2;

	/**
	 * The feature id for the '<em><b>All Query Sets Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VIEW__ALL_QUERY_SETS_AVAILABLE = 3;

	/**
	 * The feature id for the '<em><b>Available Query Sets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VIEW__AVAILABLE_QUERY_SETS = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VIEW__LOCATION = 5;

	/**
	 * The number of structural features of the '<em>Metamodel View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_VIEW_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.browser.custom.emf.impl.CustomViewImpl <em>Custom View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.CustomViewImpl
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.UicustomPackageImpl#getCustomView()
	 * @generated
	 */
	int CUSTOM_VIEW = 4;

	/**
	 * The feature id for the '<em><b>Customized Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW__CUSTOMIZED_FEATURES = 0;

	/**
	 * The number of structural features of the '<em>Custom View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.browser.custom.emf.impl.TypeViewImpl <em>Type View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.TypeViewImpl
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.UicustomPackageImpl#getTypeView()
	 * @generated
	 */
	int TYPE_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Customized Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VIEW__CUSTOMIZED_FEATURES = CUSTOM_VIEW__CUSTOMIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Metaclass Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VIEW__METACLASS_NAME = CUSTOM_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applies To Sub Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VIEW__APPLIES_TO_SUB_INSTANCES = CUSTOM_VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VIEW__ATTRIBUTES = CUSTOM_VIEW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VIEW__REFERENCES = CUSTOM_VIEW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Metamodel View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VIEW__METAMODEL_VIEW = CUSTOM_VIEW_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Type View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VIEW_FEATURE_COUNT = CUSTOM_VIEW_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.browser.custom.emf.impl.AttributeViewImpl <em>Attribute View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.AttributeViewImpl
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.UicustomPackageImpl#getAttributeView()
	 * @generated
	 */
	int ATTRIBUTE_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Customized Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VIEW__CUSTOMIZED_FEATURES = CUSTOM_VIEW__CUSTOMIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VIEW__ATTRIBUTE_NAME = CUSTOM_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VIEW__TYPE = CUSTOM_VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VIEW_FEATURE_COUNT = CUSTOM_VIEW_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.browser.custom.emf.impl.ReferenceViewImpl <em>Reference View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.ReferenceViewImpl
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.UicustomPackageImpl#getReferenceView()
	 * @generated
	 */
	int REFERENCE_VIEW = 3;

	/**
	 * The feature id for the '<em><b>Customized Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VIEW__CUSTOMIZED_FEATURES = CUSTOM_VIEW__CUSTOMIZED_FEATURES;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VIEW__REFERENCE_NAME = CUSTOM_VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VIEW__TYPE = CUSTOM_VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_VIEW_FEATURE_COUNT = CUSTOM_VIEW_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.browser.custom.emf.impl.CustomViewFeatureImpl <em>Custom View Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.CustomViewFeatureImpl
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.UicustomPackageImpl#getCustomViewFeature()
	 * @generated
	 */
	int CUSTOM_VIEW_FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Customized Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW_FEATURE__CUSTOMIZED_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Value Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW_FEATURE__VALUE_CASES = 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW_FEATURE__DEFAULT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Custom View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW_FEATURE__CUSTOM_VIEW = 3;

	/**
	 * The number of structural features of the '<em>Custom View Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_VIEW_FEATURE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.browser.custom.emf.impl.FeatureValueCaseImpl <em>Feature Value Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.FeatureValueCaseImpl
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.UicustomPackageImpl#getFeatureValueCase()
	 * @generated
	 */
	int FEATURE_VALUE_CASE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_CASE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_CASE__FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_CASE__CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Feature Value Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_CASE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.browser.custom.emf.impl.FeatureValueImpl <em>Feature Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.FeatureValueImpl
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.UicustomPackageImpl#getFeatureValue()
	 * @generated
	 */
	int FEATURE_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Case</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE__CASE = 1;

	/**
	 * The number of structural features of the '<em>Feature Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.browser.custom.emf.impl.StaticFeatureValueImpl <em>Static Feature Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.StaticFeatureValueImpl
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.UicustomPackageImpl#getStaticFeatureValue()
	 * @generated
	 */
	int STATIC_FEATURE_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FEATURE_VALUE__FEATURE = FEATURE_VALUE__FEATURE;

	/**
	 * The feature id for the '<em><b>Case</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FEATURE_VALUE__CASE = FEATURE_VALUE__CASE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FEATURE_VALUE__VALUE = FEATURE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static Feature Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FEATURE_VALUE_FEATURE_COUNT = FEATURE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.browser.custom.emf.impl.DerivedFeatureValueImpl <em>Derived Feature Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.DerivedFeatureValueImpl
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.UicustomPackageImpl#getDerivedFeatureValue()
	 * @generated
	 */
	int DERIVED_FEATURE_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURE_VALUE__FEATURE = FEATURE_VALUE__FEATURE;

	/**
	 * The feature id for the '<em><b>Case</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURE_VALUE__CASE = FEATURE_VALUE__CASE;

	/**
	 * The feature id for the '<em><b>Value Calculator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURE_VALUE__VALUE_CALCULATOR = FEATURE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Feature Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURE_VALUE_FEATURE_COUNT = FEATURE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.browser.custom.CustomizableFeatures <em>Customizable Features</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.browser.custom.CustomizableFeatures
	 * @see org.eclipse.modisco.infra.browser.custom.emf.impl.UicustomPackageImpl#getCustomizableFeatures()
	 * @generated
	 */
	int CUSTOMIZABLE_FEATURES = 10;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.browser.custom.MetamodelView <em>Metamodel View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel View</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.MetamodelView
	 * @generated
	 */
	EClass getMetamodelView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.browser.custom.MetamodelView#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.MetamodelView#getName()
	 * @see #getMetamodelView()
	 * @generated
	 */
	EAttribute getMetamodelView_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.browser.custom.MetamodelView#getMetamodelURI <em>Metamodel URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel URI</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.MetamodelView#getMetamodelURI()
	 * @see #getMetamodelView()
	 * @generated
	 */
	EAttribute getMetamodelView_MetamodelURI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.browser.custom.MetamodelView#isAllQuerySetsAvailable <em>All Query Sets Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Query Sets Available</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.MetamodelView#isAllQuerySetsAvailable()
	 * @see #getMetamodelView()
	 * @generated
	 */
	EAttribute getMetamodelView_AllQuerySetsAvailable();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.modisco.infra.browser.custom.MetamodelView#getAvailableQuerySets <em>Available Query Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Available Query Sets</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.MetamodelView#getAvailableQuerySets()
	 * @see #getMetamodelView()
	 * @generated
	 */
	EAttribute getMetamodelView_AvailableQuerySets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.browser.custom.MetamodelView#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.MetamodelView#getLocation()
	 * @see #getMetamodelView()
	 * @generated
	 */
	EAttribute getMetamodelView_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.browser.custom.MetamodelView#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.MetamodelView#getTypes()
	 * @see #getMetamodelView()
	 * @generated
	 */
	EReference getMetamodelView_Types();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.browser.custom.TypeView <em>Type View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type View</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.TypeView
	 * @generated
	 */
	EClass getTypeView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.browser.custom.TypeView#getMetaclassName <em>Metaclass Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metaclass Name</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.TypeView#getMetaclassName()
	 * @see #getTypeView()
	 * @generated
	 */
	EAttribute getTypeView_MetaclassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.browser.custom.TypeView#isAppliesToSubInstances <em>Applies To Sub Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applies To Sub Instances</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.TypeView#isAppliesToSubInstances()
	 * @see #getTypeView()
	 * @generated
	 */
	EAttribute getTypeView_AppliesToSubInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.browser.custom.TypeView#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.TypeView#getAttributes()
	 * @see #getTypeView()
	 * @generated
	 */
	EReference getTypeView_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.browser.custom.TypeView#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.TypeView#getReferences()
	 * @see #getTypeView()
	 * @generated
	 */
	EReference getTypeView_References();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.modisco.infra.browser.custom.TypeView#getMetamodelView <em>Metamodel View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Metamodel View</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.TypeView#getMetamodelView()
	 * @see #getTypeView()
	 * @generated
	 */
	EReference getTypeView_MetamodelView();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.browser.custom.AttributeView <em>Attribute View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute View</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.AttributeView
	 * @generated
	 */
	EClass getAttributeView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.browser.custom.AttributeView#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.AttributeView#getAttributeName()
	 * @see #getAttributeView()
	 * @generated
	 */
	EAttribute getAttributeView_AttributeName();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.modisco.infra.browser.custom.AttributeView#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.AttributeView#getType()
	 * @see #getAttributeView()
	 * @generated
	 */
	EReference getAttributeView_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.browser.custom.ReferenceView <em>Reference View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference View</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.ReferenceView
	 * @generated
	 */
	EClass getReferenceView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.browser.custom.ReferenceView#getReferenceName <em>Reference Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Name</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.ReferenceView#getReferenceName()
	 * @see #getReferenceView()
	 * @generated
	 */
	EAttribute getReferenceView_ReferenceName();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.modisco.infra.browser.custom.ReferenceView#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.ReferenceView#getType()
	 * @see #getReferenceView()
	 * @generated
	 */
	EReference getReferenceView_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.browser.custom.CustomView <em>Custom View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom View</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.CustomView
	 * @generated
	 */
	EClass getCustomView();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.browser.custom.CustomView#getCustomizedFeatures <em>Customized Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customized Features</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.CustomView#getCustomizedFeatures()
	 * @see #getCustomView()
	 * @generated
	 */
	EReference getCustomView_CustomizedFeatures();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.browser.custom.CustomViewFeature <em>Custom View Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom View Feature</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.CustomViewFeature
	 * @generated
	 */
	EClass getCustomViewFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.browser.custom.CustomViewFeature#getCustomizedFeature <em>Customized Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customized Feature</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.CustomViewFeature#getCustomizedFeature()
	 * @see #getCustomViewFeature()
	 * @generated
	 */
	EAttribute getCustomViewFeature_CustomizedFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.browser.custom.CustomViewFeature#getValueCases <em>Value Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Cases</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.CustomViewFeature#getValueCases()
	 * @see #getCustomViewFeature()
	 * @generated
	 */
	EReference getCustomViewFeature_ValueCases();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.infra.browser.custom.CustomViewFeature#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.CustomViewFeature#getDefaultValue()
	 * @see #getCustomViewFeature()
	 * @generated
	 */
	EReference getCustomViewFeature_DefaultValue();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.modisco.infra.browser.custom.CustomViewFeature#getCustomView <em>Custom View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Custom View</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.CustomViewFeature#getCustomView()
	 * @see #getCustomViewFeature()
	 * @generated
	 */
	EReference getCustomViewFeature_CustomView();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.browser.custom.FeatureValueCase <em>Feature Value Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Value Case</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.FeatureValueCase
	 * @generated
	 */
	EClass getFeatureValueCase();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.infra.browser.custom.FeatureValueCase#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.FeatureValueCase#getCondition()
	 * @see #getFeatureValueCase()
	 * @generated
	 */
	EReference getFeatureValueCase_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.infra.browser.custom.FeatureValueCase#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.FeatureValueCase#getValue()
	 * @see #getFeatureValueCase()
	 * @generated
	 */
	EReference getFeatureValueCase_Value();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.modisco.infra.browser.custom.FeatureValueCase#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Feature</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.FeatureValueCase#getFeature()
	 * @see #getFeatureValueCase()
	 * @generated
	 */
	EReference getFeatureValueCase_Feature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.browser.custom.FeatureValue <em>Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Value</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.FeatureValue
	 * @generated
	 */
	EClass getFeatureValue();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.modisco.infra.browser.custom.FeatureValue#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Feature</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.FeatureValue#getFeature()
	 * @see #getFeatureValue()
	 * @generated
	 */
	EReference getFeatureValue_Feature();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.modisco.infra.browser.custom.FeatureValue#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Case</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.FeatureValue#getCase()
	 * @see #getFeatureValue()
	 * @generated
	 */
	EReference getFeatureValue_Case();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.browser.custom.StaticFeatureValue <em>Static Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Feature Value</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.StaticFeatureValue
	 * @generated
	 */
	EClass getStaticFeatureValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.browser.custom.StaticFeatureValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.StaticFeatureValue#getValue()
	 * @see #getStaticFeatureValue()
	 * @generated
	 */
	EAttribute getStaticFeatureValue_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.browser.custom.DerivedFeatureValue <em>Derived Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Feature Value</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.DerivedFeatureValue
	 * @generated
	 */
	EClass getDerivedFeatureValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.infra.browser.custom.DerivedFeatureValue#getValueCalculator <em>Value Calculator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Calculator</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.DerivedFeatureValue#getValueCalculator()
	 * @see #getDerivedFeatureValue()
	 * @generated
	 */
	EReference getDerivedFeatureValue_ValueCalculator();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.infra.browser.custom.CustomizableFeatures <em>Customizable Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Customizable Features</em>'.
	 * @see org.eclipse.modisco.infra.browser.custom.CustomizableFeatures
	 * @generated
	 */
	EEnum getCustomizableFeatures();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UicustomFactory getUicustomFactory();

} //UicustomPackage
