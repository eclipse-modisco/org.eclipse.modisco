/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.omg.smm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.eclipse.modisco.omg.smm.SmmFactory
 * @model kind="package"
 * @generated
 */
public interface SmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/SMM/1.0.Beta2/smm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmmPackage eINSTANCE = org.eclipse.modisco.omg.smm.impl.SmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.SmmElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.SmmElementImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getSmmElement()
	 * @generated
	 */
	int SMM_ELEMENT = 54;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT__SHORT_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT__REQUESTED_OBSERVATIONS = 5;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.AbstractMeasureElementImpl <em>Abstract Measure Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.AbstractMeasureElementImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getAbstractMeasureElement()
	 * @generated
	 */
	int ABSTRACT_MEASURE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASURE_ELEMENT__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASURE_ELEMENT__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASURE_ELEMENT__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASURE_ELEMENT__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASURE_ELEMENT__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASURE_ELEMENT__REQUESTED_OBSERVATIONS = SMM_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASURE_ELEMENT__IN_CATEGORY = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Measure Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.AnnotationImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__REQUESTED_OBSERVATIONS = SMM_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TEXT = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.ArgumentImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__REQUESTED_OBSERVATIONS = SMM_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__TYPE = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__VALUE = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.AttributeImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REQUESTED_OBSERVATIONS = SMM_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TAG = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.MeasurementImpl <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.MeasurementImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 30;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__REQUESTED_OBSERVATIONS = SMM_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__ERROR = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MEASURAND = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__BREAK_VALUE = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__REFINEMENT_TO = SMM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__REFINEMENT_FROM = SMM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__EQUIVALENT_TO = SMM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__EQUIVALENT_FROM = SMM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__RECURSIVE_TO = SMM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__RECURSIVE_FROM = SMM_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MEASUREMENT_RELATIONSHIPS = SMM_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.DimensionalMeasurementImpl <em>Dimensional Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.DimensionalMeasurementImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getDimensionalMeasurement()
	 * @generated
	 */
	int DIMENSIONAL_MEASUREMENT = 20;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__ATTRIBUTE = MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__ANNOTATION = MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__SHORT_DESCRIPTION = MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__DESCRIPTION = MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__REQUESTED_OBSERVATIONS = MEASUREMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__ERROR = MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__MEASURAND = MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__BREAK_VALUE = MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__REFINEMENT_TO = MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__REFINEMENT_FROM = MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__EQUIVALENT_TO = MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__EQUIVALENT_FROM = MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__RECURSIVE_TO = MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__RECURSIVE_FROM = MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__MEASUREMENT_RELATIONSHIPS = MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__VALUE = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Measurement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM = MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM = MEASUREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__RESCALE_TO = MEASUREMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__RANKING_FROM = MEASUREMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dimensional Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.AggregatedMeasurementImpl <em>Aggregated Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.AggregatedMeasurementImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getAggregatedMeasurement()
	 * @generated
	 */
	int AGGREGATED_MEASUREMENT = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__ATTRIBUTE = DIMENSIONAL_MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__ANNOTATION = DIMENSIONAL_MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__NAME = DIMENSIONAL_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__SHORT_DESCRIPTION = DIMENSIONAL_MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__DESCRIPTION = DIMENSIONAL_MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__REQUESTED_OBSERVATIONS = DIMENSIONAL_MEASUREMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__MEASURAND = DIMENSIONAL_MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__BREAK_VALUE = DIMENSIONAL_MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__REFINEMENT_TO = DIMENSIONAL_MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__REFINEMENT_FROM = DIMENSIONAL_MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__EQUIVALENT_TO = DIMENSIONAL_MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__EQUIVALENT_FROM = DIMENSIONAL_MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__RECURSIVE_TO = DIMENSIONAL_MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__RECURSIVE_FROM = DIMENSIONAL_MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__MEASUREMENT_RELATIONSHIPS = DIMENSIONAL_MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Base Measurement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__BASE_MEASUREMENT_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__BASE_MEASUREMENT1_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__BASE_MEASUREMENT2_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__RESCALE_TO = DIMENSIONAL_MEASUREMENT__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__RANKING_FROM = DIMENSIONAL_MEASUREMENT__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Is Base Suppled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__IS_BASE_SUPPLED = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__BASE_MEASUREMENT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregated Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.SmmRelationship <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.SmmRelationship
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getSmmRelationship()
	 * @generated
	 */
	int SMM_RELATIONSHIP = 56;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP__REQUESTED_OBSERVATIONS = SMM_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.MeasurementRelationshipImpl <em>Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.MeasurementRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getMeasurementRelationship()
	 * @generated
	 */
	int MEASUREMENT_RELATIONSHIP = 31;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP__ATTRIBUTE = SMM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP__ANNOTATION = SMM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP__NAME = SMM_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = SMM_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP__DESCRIPTION = SMM_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP__REQUESTED_OBSERVATIONS = SMM_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The number of structural features of the '<em>Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = SMM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.Base1MeasurementRelationshipImpl <em>Base1 Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.Base1MeasurementRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getBase1MeasurementRelationship()
	 * @generated
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP__ATTRIBUTE = MEASUREMENT_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP__ANNOTATION = MEASUREMENT_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP__NAME = MEASUREMENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP__DESCRIPTION = MEASUREMENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP__REQUESTED_OBSERVATIONS = MEASUREMENT_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP__FROM = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP__TO = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Base1 Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.MeasureRelationshipImpl <em>Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.MeasureRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getMeasureRelationship()
	 * @generated
	 */
	int MEASURE_RELATIONSHIP = 29;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__ATTRIBUTE = SMM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__ANNOTATION = SMM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__NAME = SMM_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = SMM_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__DESCRIPTION = SMM_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__REQUESTED_OBSERVATIONS = SMM_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__MEASURAND_QUERY = SMM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP_FEATURE_COUNT = SMM_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.Base1MeasureRelationshipImpl <em>Base1 Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.Base1MeasureRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getBase1MeasureRelationship()
	 * @generated
	 */
	int BASE1_MEASURE_RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP__ATTRIBUTE = MEASURE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP__ANNOTATION = MEASURE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP__NAME = MEASURE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = MEASURE_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP__DESCRIPTION = MEASURE_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP__REQUESTED_OBSERVATIONS = MEASURE_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP__MEASURAND_QUERY = MEASURE_RELATIONSHIP__MEASURAND_QUERY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP__FROM = MEASURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP__TO = MEASURE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Base1 Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE1_MEASURE_RELATIONSHIP_FEATURE_COUNT = MEASURE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.Base2MeasurementRelationshipImpl <em>Base2 Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.Base2MeasurementRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getBase2MeasurementRelationship()
	 * @generated
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP = 7;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP__ATTRIBUTE = MEASUREMENT_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP__ANNOTATION = MEASUREMENT_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP__NAME = MEASUREMENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP__DESCRIPTION = MEASUREMENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP__REQUESTED_OBSERVATIONS = MEASUREMENT_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>From</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP__FROM = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP__TO = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Base2 Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.Base2MeasureRelationshipImpl <em>Base2 Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.Base2MeasureRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getBase2MeasureRelationship()
	 * @generated
	 */
	int BASE2_MEASURE_RELATIONSHIP = 8;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP__ATTRIBUTE = MEASURE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP__ANNOTATION = MEASURE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP__NAME = MEASURE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = MEASURE_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP__DESCRIPTION = MEASURE_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP__REQUESTED_OBSERVATIONS = MEASURE_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP__MEASURAND_QUERY = MEASURE_RELATIONSHIP__MEASURAND_QUERY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP__FROM = MEASURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP__TO = MEASURE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Base2 Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE2_MEASURE_RELATIONSHIP_FEATURE_COUNT = MEASURE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.BaseMeasurementRelationshipImpl <em>Base Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.BaseMeasurementRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getBaseMeasurementRelationship()
	 * @generated
	 */
	int BASE_MEASUREMENT_RELATIONSHIP = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP__ATTRIBUTE = MEASUREMENT_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP__ANNOTATION = MEASUREMENT_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP__NAME = MEASUREMENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP__DESCRIPTION = MEASUREMENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP__REQUESTED_OBSERVATIONS = MEASUREMENT_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP__FROM = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP__TO = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Base Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.BaseMeasureRelationshipImpl <em>Base Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.BaseMeasureRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getBaseMeasureRelationship()
	 * @generated
	 */
	int BASE_MEASURE_RELATIONSHIP = 10;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP__ATTRIBUTE = MEASURE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP__ANNOTATION = MEASURE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP__NAME = MEASURE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = MEASURE_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP__DESCRIPTION = MEASURE_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP__REQUESTED_OBSERVATIONS = MEASURE_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP__MEASURAND_QUERY = MEASURE_RELATIONSHIP__MEASURAND_QUERY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP__FROM = MEASURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP__TO = MEASURE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Base Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASURE_RELATIONSHIP_FEATURE_COUNT = MEASURE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.MeasureImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 26;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__ATTRIBUTE = ABSTRACT_MEASURE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__ANNOTATION = ABSTRACT_MEASURE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__NAME = ABSTRACT_MEASURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__SHORT_DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__REQUESTED_OBSERVATIONS = ABSTRACT_MEASURE_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__IN_CATEGORY = ABSTRACT_MEASURE_ELEMENT__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__CATEGORY = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__TRAIT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__SCOPE = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__MEASURE_LABEL_FORMAT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__REFINEMENT_TO = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__REFINEMENT_FROM = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__EQUIVALENT_TO = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__EQUIVALENT_FROM = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__RECURSIVE_TO = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__RECURSIVE_FROM = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__MEASUREMENT_LABEL_FORMAT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__VISIBLE = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__MEASURE_RELATIONSHIPS = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__DEFAULT_QUERY = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.DimensionalMeasureImpl <em>Dimensional Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.DimensionalMeasureImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getDimensionalMeasure()
	 * @generated
	 */
	int DIMENSIONAL_MEASURE = 19;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__ATTRIBUTE = MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__ANNOTATION = MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__SHORT_DESCRIPTION = MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__DESCRIPTION = MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__REQUESTED_OBSERVATIONS = MEASURE__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__IN_CATEGORY = MEASURE__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__CATEGORY = MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__TRAIT = MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__SCOPE = MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__MEASURE_LABEL_FORMAT = MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__REFINEMENT_TO = MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__REFINEMENT_FROM = MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__EQUIVALENT_TO = MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__EQUIVALENT_FROM = MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__RECURSIVE_TO = MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__RECURSIVE_FROM = MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__MEASUREMENT_LABEL_FORMAT = MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__VISIBLE = MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__MEASURE_RELATIONSHIPS = MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__DEFAULT_QUERY = MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__UNIT = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Measure From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__BASE_MEASURE_FROM = MEASURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Measure1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM = MEASURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Measure2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM = MEASURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__RESCALE_TO = MEASURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__RANKING_FROM = MEASURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dimensional Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.BinaryMeasureImpl <em>Binary Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.BinaryMeasureImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getBinaryMeasure()
	 * @generated
	 */
	int BINARY_MEASURE = 11;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__ATTRIBUTE = DIMENSIONAL_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__ANNOTATION = DIMENSIONAL_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__SHORT_DESCRIPTION = DIMENSIONAL_MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__DESCRIPTION = DIMENSIONAL_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__REQUESTED_OBSERVATIONS = DIMENSIONAL_MEASURE__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__IN_CATEGORY = DIMENSIONAL_MEASURE__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__MEASURE_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__REFINEMENT_TO = DIMENSIONAL_MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__REFINEMENT_FROM = DIMENSIONAL_MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__EQUIVALENT_TO = DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__RECURSIVE_TO = DIMENSIONAL_MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__RECURSIVE_FROM = DIMENSIONAL_MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__MEASUREMENT_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__VISIBLE = DIMENSIONAL_MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__MEASURE_RELATIONSHIPS = DIMENSIONAL_MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__DEFAULT_QUERY = DIMENSIONAL_MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__BASE_MEASURE_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__BASE_MEASURE1_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__BASE_MEASURE2_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__RESCALE_TO = DIMENSIONAL_MEASURE__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__RANKING_FROM = DIMENSIONAL_MEASURE__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Functor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__FUNCTOR = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Measure1 To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__BASE_MEASURE1_TO = DIMENSIONAL_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Measure2 To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__BASE_MEASURE2_TO = DIMENSIONAL_MEASURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.BinaryMeasurementImpl <em>Binary Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.BinaryMeasurementImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getBinaryMeasurement()
	 * @generated
	 */
	int BINARY_MEASUREMENT = 12;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__ATTRIBUTE = DIMENSIONAL_MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__ANNOTATION = DIMENSIONAL_MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__NAME = DIMENSIONAL_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__SHORT_DESCRIPTION = DIMENSIONAL_MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__DESCRIPTION = DIMENSIONAL_MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__REQUESTED_OBSERVATIONS = DIMENSIONAL_MEASUREMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__MEASURAND = DIMENSIONAL_MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__BREAK_VALUE = DIMENSIONAL_MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__REFINEMENT_TO = DIMENSIONAL_MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__REFINEMENT_FROM = DIMENSIONAL_MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__EQUIVALENT_TO = DIMENSIONAL_MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__EQUIVALENT_FROM = DIMENSIONAL_MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__RECURSIVE_TO = DIMENSIONAL_MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__RECURSIVE_FROM = DIMENSIONAL_MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__MEASUREMENT_RELATIONSHIPS = DIMENSIONAL_MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Base Measurement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__BASE_MEASUREMENT_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__BASE_MEASUREMENT1_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__BASE_MEASUREMENT2_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__RESCALE_TO = DIMENSIONAL_MEASUREMENT__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__RANKING_FROM = DIMENSIONAL_MEASUREMENT__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement1 To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__BASE_MEASUREMENT1_TO = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Measurement2 To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__BASE_MEASUREMENT2_TO = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT__IS_BASE_SUPPLIED = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.CategoryRelationshipImpl <em>Category Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.CategoryRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getCategoryRelationship()
	 * @generated
	 */
	int CATEGORY_RELATIONSHIP = 13;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__ATTRIBUTE = SMM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__ANNOTATION = SMM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__NAME = SMM_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__SHORT_DESCRIPTION = SMM_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__DESCRIPTION = SMM_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__REQUESTED_OBSERVATIONS = SMM_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__FROM = SMM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__TO = SMM_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP_FEATURE_COUNT = SMM_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.CharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.CharacteristicImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getCharacteristic()
	 * @generated
	 */
	int CHARACTERISTIC = 14;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__ATTRIBUTE = ABSTRACT_MEASURE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__ANNOTATION = ABSTRACT_MEASURE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__NAME = ABSTRACT_MEASURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__SHORT_DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__REQUESTED_OBSERVATIONS = ABSTRACT_MEASURE_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__IN_CATEGORY = ABSTRACT_MEASURE_ELEMENT__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__PARENT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_FEATURE_COUNT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.CollectiveMeasureImpl <em>Collective Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.CollectiveMeasureImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getCollectiveMeasure()
	 * @generated
	 */
	int COLLECTIVE_MEASURE = 15;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__ATTRIBUTE = DIMENSIONAL_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__ANNOTATION = DIMENSIONAL_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__SHORT_DESCRIPTION = DIMENSIONAL_MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__DESCRIPTION = DIMENSIONAL_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__REQUESTED_OBSERVATIONS = DIMENSIONAL_MEASURE__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__IN_CATEGORY = DIMENSIONAL_MEASURE__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__MEASURE_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__REFINEMENT_TO = DIMENSIONAL_MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__REFINEMENT_FROM = DIMENSIONAL_MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__EQUIVALENT_TO = DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__RECURSIVE_TO = DIMENSIONAL_MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__RECURSIVE_FROM = DIMENSIONAL_MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__MEASUREMENT_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__VISIBLE = DIMENSIONAL_MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__MEASURE_RELATIONSHIPS = DIMENSIONAL_MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__DEFAULT_QUERY = DIMENSIONAL_MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__BASE_MEASURE_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__BASE_MEASURE1_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__BASE_MEASURE2_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__RESCALE_TO = DIMENSIONAL_MEASURE__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__RANKING_FROM = DIMENSIONAL_MEASURE__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__ACCUMULATOR = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Measure To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__BASE_MEASURE_TO = DIMENSIONAL_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collective Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.CollectiveMeasurementImpl <em>Collective Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.CollectiveMeasurementImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getCollectiveMeasurement()
	 * @generated
	 */
	int COLLECTIVE_MEASUREMENT = 16;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__ATTRIBUTE = DIMENSIONAL_MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__ANNOTATION = DIMENSIONAL_MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__NAME = DIMENSIONAL_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__SHORT_DESCRIPTION = DIMENSIONAL_MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__DESCRIPTION = DIMENSIONAL_MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__REQUESTED_OBSERVATIONS = DIMENSIONAL_MEASUREMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__MEASURAND = DIMENSIONAL_MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__BREAK_VALUE = DIMENSIONAL_MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__REFINEMENT_TO = DIMENSIONAL_MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__REFINEMENT_FROM = DIMENSIONAL_MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__EQUIVALENT_TO = DIMENSIONAL_MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__EQUIVALENT_FROM = DIMENSIONAL_MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__RECURSIVE_TO = DIMENSIONAL_MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__RECURSIVE_FROM = DIMENSIONAL_MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__MEASUREMENT_RELATIONSHIPS = DIMENSIONAL_MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Base Measurement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT1_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT2_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__RESCALE_TO = DIMENSIONAL_MEASUREMENT__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__RANKING_FROM = DIMENSIONAL_MEASUREMENT__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__ACCUMULATOR = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__IS_BASE_SUPPLIED = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Measurement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_TO = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Collective Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.DirectMeasurementImpl <em>Direct Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.DirectMeasurementImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getDirectMeasurement()
	 * @generated
	 */
	int DIRECT_MEASUREMENT = 22;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__ATTRIBUTE = DIMENSIONAL_MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__ANNOTATION = DIMENSIONAL_MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__NAME = DIMENSIONAL_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__SHORT_DESCRIPTION = DIMENSIONAL_MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__DESCRIPTION = DIMENSIONAL_MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__REQUESTED_OBSERVATIONS = DIMENSIONAL_MEASUREMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__MEASURAND = DIMENSIONAL_MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__BREAK_VALUE = DIMENSIONAL_MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__REFINEMENT_TO = DIMENSIONAL_MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__REFINEMENT_FROM = DIMENSIONAL_MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__EQUIVALENT_TO = DIMENSIONAL_MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__EQUIVALENT_FROM = DIMENSIONAL_MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__RECURSIVE_TO = DIMENSIONAL_MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__RECURSIVE_FROM = DIMENSIONAL_MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__MEASUREMENT_RELATIONSHIPS = DIMENSIONAL_MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Base Measurement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__BASE_MEASUREMENT_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__BASE_MEASUREMENT1_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__BASE_MEASUREMENT2_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__RESCALE_TO = DIMENSIONAL_MEASUREMENT__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__RANKING_FROM = DIMENSIONAL_MEASUREMENT__RANKING_FROM;

	/**
	 * The number of structural features of the '<em>Direct Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.CountImpl <em>Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.CountImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getCount()
	 * @generated
	 */
	int COUNT = 17;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__ATTRIBUTE = DIRECT_MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__ANNOTATION = DIRECT_MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__NAME = DIRECT_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__SHORT_DESCRIPTION = DIRECT_MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__DESCRIPTION = DIRECT_MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__REQUESTED_OBSERVATIONS = DIRECT_MEASUREMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__ERROR = DIRECT_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__MEASURAND = DIRECT_MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__BREAK_VALUE = DIRECT_MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__REFINEMENT_TO = DIRECT_MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__REFINEMENT_FROM = DIRECT_MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__EQUIVALENT_TO = DIRECT_MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__EQUIVALENT_FROM = DIRECT_MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__RECURSIVE_TO = DIRECT_MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__RECURSIVE_FROM = DIRECT_MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__MEASUREMENT_RELATIONSHIPS = DIRECT_MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__VALUE = DIRECT_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Base Measurement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__BASE_MEASUREMENT_FROM = DIRECT_MEASUREMENT__BASE_MEASUREMENT_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__BASE_MEASUREMENT1_FROM = DIRECT_MEASUREMENT__BASE_MEASUREMENT1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__BASE_MEASUREMENT2_FROM = DIRECT_MEASUREMENT__BASE_MEASUREMENT2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__RESCALE_TO = DIRECT_MEASUREMENT__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__RANKING_FROM = DIRECT_MEASUREMENT__RANKING_FROM;

	/**
	 * The number of structural features of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FEATURE_COUNT = DIRECT_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.DirectMeasureImpl <em>Direct Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.DirectMeasureImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getDirectMeasure()
	 * @generated
	 */
	int DIRECT_MEASURE = 21;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__ATTRIBUTE = DIMENSIONAL_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__ANNOTATION = DIMENSIONAL_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__SHORT_DESCRIPTION = DIMENSIONAL_MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__DESCRIPTION = DIMENSIONAL_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__REQUESTED_OBSERVATIONS = DIMENSIONAL_MEASURE__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__IN_CATEGORY = DIMENSIONAL_MEASURE__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__MEASURE_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__REFINEMENT_TO = DIMENSIONAL_MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__REFINEMENT_FROM = DIMENSIONAL_MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__EQUIVALENT_TO = DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__RECURSIVE_TO = DIMENSIONAL_MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__RECURSIVE_FROM = DIMENSIONAL_MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__MEASUREMENT_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__VISIBLE = DIMENSIONAL_MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__MEASURE_RELATIONSHIPS = DIMENSIONAL_MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__DEFAULT_QUERY = DIMENSIONAL_MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__BASE_MEASURE_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__BASE_MEASURE1_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__BASE_MEASURE2_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__RESCALE_TO = DIMENSIONAL_MEASURE__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__RANKING_FROM = DIMENSIONAL_MEASURE__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__OPERATION = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Direct Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.CountingImpl <em>Counting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.CountingImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getCounting()
	 * @generated
	 */
	int COUNTING = 18;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__ATTRIBUTE = DIRECT_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__ANNOTATION = DIRECT_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__NAME = DIRECT_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__SHORT_DESCRIPTION = DIRECT_MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__DESCRIPTION = DIRECT_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__REQUESTED_OBSERVATIONS = DIRECT_MEASURE__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__IN_CATEGORY = DIRECT_MEASURE__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__CATEGORY = DIRECT_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__TRAIT = DIRECT_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__SCOPE = DIRECT_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__MEASURE_LABEL_FORMAT = DIRECT_MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__REFINEMENT_TO = DIRECT_MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__REFINEMENT_FROM = DIRECT_MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__EQUIVALENT_TO = DIRECT_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__EQUIVALENT_FROM = DIRECT_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__RECURSIVE_TO = DIRECT_MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__RECURSIVE_FROM = DIRECT_MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__MEASUREMENT_LABEL_FORMAT = DIRECT_MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__VISIBLE = DIRECT_MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__MEASURE_RELATIONSHIPS = DIRECT_MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__DEFAULT_QUERY = DIRECT_MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__UNIT = DIRECT_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__BASE_MEASURE_FROM = DIRECT_MEASURE__BASE_MEASURE_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__BASE_MEASURE1_FROM = DIRECT_MEASURE__BASE_MEASURE1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__BASE_MEASURE2_FROM = DIRECT_MEASURE__BASE_MEASURE2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__RESCALE_TO = DIRECT_MEASURE__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__RANKING_FROM = DIRECT_MEASURE__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__OPERATION = DIRECT_MEASURE__OPERATION;

	/**
	 * The number of structural features of the '<em>Counting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING_FEATURE_COUNT = DIRECT_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.EquivalentMeasureRelationshipImpl <em>Equivalent Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.EquivalentMeasureRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getEquivalentMeasureRelationship()
	 * @generated
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP = 23;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__ATTRIBUTE = MEASURE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__ANNOTATION = MEASURE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__NAME = MEASURE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = MEASURE_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__DESCRIPTION = MEASURE_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__REQUESTED_OBSERVATIONS = MEASURE_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__MEASURAND_QUERY = MEASURE_RELATIONSHIP__MEASURAND_QUERY;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__MAPPING = MEASURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__FROM = MEASURE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP__TO = MEASURE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Equivalent Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASURE_RELATIONSHIP_FEATURE_COUNT = MEASURE_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.EquivalentMeasurementRelationshipImpl <em>Equivalent Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.EquivalentMeasurementRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getEquivalentMeasurementRelationship()
	 * @generated
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP = 24;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP__ATTRIBUTE = MEASUREMENT_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP__ANNOTATION = MEASUREMENT_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP__NAME = MEASUREMENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP__DESCRIPTION = MEASUREMENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP__REQUESTED_OBSERVATIONS = MEASUREMENT_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP__FROM = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP__TO = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equivalent Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIVALENT_MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.GradeImpl <em>Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.GradeImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getGrade()
	 * @generated
	 */
	int GRADE = 25;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__ATTRIBUTE = MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__ANNOTATION = MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__SHORT_DESCRIPTION = MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__DESCRIPTION = MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__REQUESTED_OBSERVATIONS = MEASUREMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__ERROR = MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__MEASURAND = MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__BREAK_VALUE = MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__REFINEMENT_TO = MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__REFINEMENT_FROM = MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__EQUIVALENT_TO = MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__EQUIVALENT_FROM = MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__RECURSIVE_TO = MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__RECURSIVE_FROM = MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__MEASUREMENT_RELATIONSHIPS = MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Base Measurement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__BASE_MEASUREMENT = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__IS_BASE_SUPPLIED = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__VALUE = MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ranking To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__RANKING_TO = MEASUREMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.MeasureCategoryImpl <em>Measure Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.MeasureCategoryImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getMeasureCategory()
	 * @generated
	 */
	int MEASURE_CATEGORY = 27;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__ATTRIBUTE = ABSTRACT_MEASURE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__ANNOTATION = ABSTRACT_MEASURE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__NAME = ABSTRACT_MEASURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__SHORT_DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__REQUESTED_OBSERVATIONS = ABSTRACT_MEASURE_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__IN_CATEGORY = ABSTRACT_MEASURE_ELEMENT__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__CATEGORY = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__CATEGORY_ELEMENT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY__CATEGORY_MEASURE = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Measure Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_CATEGORY_FEATURE_COUNT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.MeasureLibraryImpl <em>Measure Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.MeasureLibraryImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getMeasureLibrary()
	 * @generated
	 */
	int MEASURE_LIBRARY = 28;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY__REQUESTED_OBSERVATIONS = SMM_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Measure Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY__MEASURE_ELEMENTS = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Measure Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_LIBRARY_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.NamedMeasureImpl <em>Named Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.NamedMeasureImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getNamedMeasure()
	 * @generated
	 */
	int NAMED_MEASURE = 32;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__ATTRIBUTE = DIMENSIONAL_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__ANNOTATION = DIMENSIONAL_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__SHORT_DESCRIPTION = DIMENSIONAL_MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__DESCRIPTION = DIMENSIONAL_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__REQUESTED_OBSERVATIONS = DIMENSIONAL_MEASURE__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__IN_CATEGORY = DIMENSIONAL_MEASURE__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__MEASURE_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__REFINEMENT_TO = DIMENSIONAL_MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__REFINEMENT_FROM = DIMENSIONAL_MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__EQUIVALENT_TO = DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__RECURSIVE_TO = DIMENSIONAL_MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__RECURSIVE_FROM = DIMENSIONAL_MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__MEASUREMENT_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__VISIBLE = DIMENSIONAL_MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__MEASURE_RELATIONSHIPS = DIMENSIONAL_MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__DEFAULT_QUERY = DIMENSIONAL_MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__BASE_MEASURE_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__BASE_MEASURE1_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__BASE_MEASURE2_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__RESCALE_TO = DIMENSIONAL_MEASURE__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__RANKING_FROM = DIMENSIONAL_MEASURE__RANKING_FROM;

	/**
	 * The number of structural features of the '<em>Named Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.NamedMeasurementImpl <em>Named Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.NamedMeasurementImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getNamedMeasurement()
	 * @generated
	 */
	int NAMED_MEASUREMENT = 33;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__ATTRIBUTE = DIMENSIONAL_MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__ANNOTATION = DIMENSIONAL_MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__NAME = DIMENSIONAL_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__SHORT_DESCRIPTION = DIMENSIONAL_MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__DESCRIPTION = DIMENSIONAL_MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__REQUESTED_OBSERVATIONS = DIMENSIONAL_MEASUREMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__MEASURAND = DIMENSIONAL_MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__BREAK_VALUE = DIMENSIONAL_MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__REFINEMENT_TO = DIMENSIONAL_MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__REFINEMENT_FROM = DIMENSIONAL_MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__EQUIVALENT_TO = DIMENSIONAL_MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__EQUIVALENT_FROM = DIMENSIONAL_MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__RECURSIVE_TO = DIMENSIONAL_MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__RECURSIVE_FROM = DIMENSIONAL_MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__MEASUREMENT_RELATIONSHIPS = DIMENSIONAL_MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Base Measurement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__BASE_MEASUREMENT_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__BASE_MEASUREMENT1_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__BASE_MEASUREMENT2_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__RESCALE_TO = DIMENSIONAL_MEASUREMENT__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__RANKING_FROM = DIMENSIONAL_MEASUREMENT__RANKING_FROM;

	/**
	 * The number of structural features of the '<em>Named Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.ObservationImpl <em>Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.ObservationImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getObservation()
	 * @generated
	 */
	int OBSERVATION = 34;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__REQUESTED_OBSERVATIONS = SMM_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__OBSERVER = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__TOOL = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>When Observed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__WHEN_OBSERVED = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__SCOPES = SMM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Observed Measures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__OBSERVED_MEASURES = SMM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Requested Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__REQUESTED_MEASURES = SMM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Measurement Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__MEASUREMENT_RELATIONS = SMM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__ARGUMENTS = SMM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.ObservationScopeImpl <em>Observation Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.ObservationScopeImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getObservationScope()
	 * @generated
	 */
	int OBSERVATION_SCOPE = 35;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_SCOPE__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_SCOPE__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_SCOPE__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_SCOPE__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_SCOPE__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_SCOPE__REQUESTED_OBSERVATIONS = SMM_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Scope Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_SCOPE__SCOPE_URI = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Observation Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_SCOPE_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.ObservedMeasureImpl <em>Observed Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.ObservedMeasureImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getObservedMeasure()
	 * @generated
	 */
	int OBSERVED_MEASURE = 36;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE__ATTRIBUTE = SMM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE__ANNOTATION = SMM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE__NAME = SMM_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE__SHORT_DESCRIPTION = SMM_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE__DESCRIPTION = SMM_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE__REQUESTED_OBSERVATIONS = SMM_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE__MEASURE = SMM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE__MEASUREMENTS = SMM_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Observed Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVED_MEASURE_FEATURE_COUNT = SMM_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.OCLOperationImpl <em>OCL Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.OCLOperationImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getOCLOperation()
	 * @generated
	 */
	int OCL_OPERATION = 37;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__ATTRIBUTE = ABSTRACT_MEASURE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__ANNOTATION = ABSTRACT_MEASURE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__NAME = ABSTRACT_MEASURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__SHORT_DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__REQUESTED_OBSERVATIONS = ABSTRACT_MEASURE_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__IN_CATEGORY = ABSTRACT_MEASURE_ELEMENT__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__CONTEXT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION__BODY = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OCL Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_OPERATION_FEATURE_COUNT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.OperationImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 38;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ATTRIBUTE = ABSTRACT_MEASURE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ANNOTATION = ABSTRACT_MEASURE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = ABSTRACT_MEASURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SHORT_DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REQUESTED_OBSERVATIONS = ABSTRACT_MEASURE_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IN_CATEGORY = ABSTRACT_MEASURE_ELEMENT__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LANGUAGE = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.RankingImpl <em>Ranking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.RankingImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRanking()
	 * @generated
	 */
	int RANKING = 39;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__ATTRIBUTE = MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__ANNOTATION = MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__SHORT_DESCRIPTION = MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__DESCRIPTION = MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__REQUESTED_OBSERVATIONS = MEASURE__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__IN_CATEGORY = MEASURE__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__CATEGORY = MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__TRAIT = MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__SCOPE = MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__MEASURE_LABEL_FORMAT = MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__REFINEMENT_TO = MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__REFINEMENT_FROM = MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__EQUIVALENT_TO = MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__EQUIVALENT_FROM = MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__RECURSIVE_TO = MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__RECURSIVE_FROM = MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__MEASUREMENT_LABEL_FORMAT = MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__VISIBLE = MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__MEASURE_RELATIONSHIPS = MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__DEFAULT_QUERY = MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__INTERVAL = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ranking To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__RANKING_TO = MEASURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.RankingIntervalImpl <em>Ranking Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.RankingIntervalImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRankingInterval()
	 * @generated
	 */
	int RANKING_INTERVAL = 40;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__REQUESTED_OBSERVATIONS = SMM_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__RANK = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__MAXIMUM_ENDPOINT = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__MAXIMUM_OPEN = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minimum Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__MINIMUM_ENDPOINT = SMM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Minimum Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__MINIMUM_OPEN = SMM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__SYMBOL = SMM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ranking Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.RankingMeasureRelationshipImpl <em>Ranking Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.RankingMeasureRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRankingMeasureRelationship()
	 * @generated
	 */
	int RANKING_MEASURE_RELATIONSHIP = 41;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP__ATTRIBUTE = MEASURE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP__ANNOTATION = MEASURE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP__NAME = MEASURE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = MEASURE_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP__DESCRIPTION = MEASURE_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP__REQUESTED_OBSERVATIONS = MEASURE_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP__MEASURAND_QUERY = MEASURE_RELATIONSHIP__MEASURAND_QUERY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP__FROM = MEASURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP__TO = MEASURE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ranking Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASURE_RELATIONSHIP_FEATURE_COUNT = MEASURE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.RankingMeasurementRelationshipImpl <em>Ranking Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.RankingMeasurementRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRankingMeasurementRelationship()
	 * @generated
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP = 42;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP__ATTRIBUTE = MEASUREMENT_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP__ANNOTATION = MEASUREMENT_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP__NAME = MEASUREMENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP__DESCRIPTION = MEASUREMENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP__REQUESTED_OBSERVATIONS = MEASUREMENT_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP__FROM = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP__TO = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ranking Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.RatioMeasureImpl <em>Ratio Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.RatioMeasureImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRatioMeasure()
	 * @generated
	 */
	int RATIO_MEASURE = 43;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__ATTRIBUTE = BINARY_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__ANNOTATION = BINARY_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__NAME = BINARY_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__SHORT_DESCRIPTION = BINARY_MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__DESCRIPTION = BINARY_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__REQUESTED_OBSERVATIONS = BINARY_MEASURE__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__IN_CATEGORY = BINARY_MEASURE__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__CATEGORY = BINARY_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__TRAIT = BINARY_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__SCOPE = BINARY_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__MEASURE_LABEL_FORMAT = BINARY_MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__REFINEMENT_TO = BINARY_MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__REFINEMENT_FROM = BINARY_MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__EQUIVALENT_TO = BINARY_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__EQUIVALENT_FROM = BINARY_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__RECURSIVE_TO = BINARY_MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__RECURSIVE_FROM = BINARY_MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__MEASUREMENT_LABEL_FORMAT = BINARY_MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__VISIBLE = BINARY_MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__MEASURE_RELATIONSHIPS = BINARY_MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__DEFAULT_QUERY = BINARY_MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__UNIT = BINARY_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__BASE_MEASURE_FROM = BINARY_MEASURE__BASE_MEASURE_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__BASE_MEASURE1_FROM = BINARY_MEASURE__BASE_MEASURE1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__BASE_MEASURE2_FROM = BINARY_MEASURE__BASE_MEASURE2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__RESCALE_TO = BINARY_MEASURE__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__RANKING_FROM = BINARY_MEASURE__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Functor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__FUNCTOR = BINARY_MEASURE__FUNCTOR;

	/**
	 * The feature id for the '<em><b>Base Measure1 To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__BASE_MEASURE1_TO = BINARY_MEASURE__BASE_MEASURE1_TO;

	/**
	 * The feature id for the '<em><b>Base Measure2 To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__BASE_MEASURE2_TO = BINARY_MEASURE__BASE_MEASURE2_TO;

	/**
	 * The number of structural features of the '<em>Ratio Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE_FEATURE_COUNT = BINARY_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.RatioMeasurementImpl <em>Ratio Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.RatioMeasurementImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRatioMeasurement()
	 * @generated
	 */
	int RATIO_MEASUREMENT = 44;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__ATTRIBUTE = BINARY_MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__ANNOTATION = BINARY_MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__NAME = BINARY_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__SHORT_DESCRIPTION = BINARY_MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__DESCRIPTION = BINARY_MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__REQUESTED_OBSERVATIONS = BINARY_MEASUREMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__ERROR = BINARY_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__MEASURAND = BINARY_MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__BREAK_VALUE = BINARY_MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__REFINEMENT_TO = BINARY_MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__REFINEMENT_FROM = BINARY_MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__EQUIVALENT_TO = BINARY_MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__EQUIVALENT_FROM = BINARY_MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__RECURSIVE_TO = BINARY_MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__RECURSIVE_FROM = BINARY_MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__MEASUREMENT_RELATIONSHIPS = BINARY_MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__VALUE = BINARY_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Base Measurement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__BASE_MEASUREMENT_FROM = BINARY_MEASUREMENT__BASE_MEASUREMENT_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__BASE_MEASUREMENT1_FROM = BINARY_MEASUREMENT__BASE_MEASUREMENT1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__BASE_MEASUREMENT2_FROM = BINARY_MEASUREMENT__BASE_MEASUREMENT2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__RESCALE_TO = BINARY_MEASUREMENT__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__RANKING_FROM = BINARY_MEASUREMENT__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement1 To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__BASE_MEASUREMENT1_TO = BINARY_MEASUREMENT__BASE_MEASUREMENT1_TO;

	/**
	 * The feature id for the '<em><b>Base Measurement2 To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__BASE_MEASUREMENT2_TO = BINARY_MEASUREMENT__BASE_MEASUREMENT2_TO;

	/**
	 * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT__IS_BASE_SUPPLIED = BINARY_MEASUREMENT__IS_BASE_SUPPLIED;

	/**
	 * The number of structural features of the '<em>Ratio Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASUREMENT_FEATURE_COUNT = BINARY_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.RecursiveMeasureRelationshipImpl <em>Recursive Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.RecursiveMeasureRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRecursiveMeasureRelationship()
	 * @generated
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP = 45;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP__ATTRIBUTE = MEASURE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP__ANNOTATION = MEASURE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP__NAME = MEASURE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = MEASURE_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP__DESCRIPTION = MEASURE_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP__REQUESTED_OBSERVATIONS = MEASURE_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP__MEASURAND_QUERY = MEASURE_RELATIONSHIP__MEASURAND_QUERY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP__FROM = MEASURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP__TO = MEASURE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Recursive Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASURE_RELATIONSHIP_FEATURE_COUNT = MEASURE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.RecursiveMeasurementRelationshipImpl <em>Recursive Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.RecursiveMeasurementRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRecursiveMeasurementRelationship()
	 * @generated
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP = 46;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP__ATTRIBUTE = MEASUREMENT_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP__ANNOTATION = MEASUREMENT_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP__NAME = MEASUREMENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP__DESCRIPTION = MEASUREMENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP__REQUESTED_OBSERVATIONS = MEASUREMENT_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP__FROM = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP__TO = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Recursive Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECURSIVE_MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.RefinementMeasureRelationshipImpl <em>Refinement Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.RefinementMeasureRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRefinementMeasureRelationship()
	 * @generated
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP = 47;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP__ATTRIBUTE = MEASURE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP__ANNOTATION = MEASURE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP__NAME = MEASURE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = MEASURE_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP__DESCRIPTION = MEASURE_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP__REQUESTED_OBSERVATIONS = MEASURE_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP__MEASURAND_QUERY = MEASURE_RELATIONSHIP__MEASURAND_QUERY;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP__FROM = MEASURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP__TO = MEASURE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Refinement Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASURE_RELATIONSHIP_FEATURE_COUNT = MEASURE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.RefinementMeasurementRelationshipImpl <em>Refinement Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.RefinementMeasurementRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRefinementMeasurementRelationship()
	 * @generated
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP = 48;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP__ATTRIBUTE = MEASUREMENT_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP__ANNOTATION = MEASUREMENT_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP__NAME = MEASUREMENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP__DESCRIPTION = MEASUREMENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP__REQUESTED_OBSERVATIONS = MEASUREMENT_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP__FROM = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP__TO = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Refinement Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.RescaledMeasureImpl <em>Rescaled Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.RescaledMeasureImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRescaledMeasure()
	 * @generated
	 */
	int RESCALED_MEASURE = 49;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__ATTRIBUTE = DIMENSIONAL_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__ANNOTATION = DIMENSIONAL_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__SHORT_DESCRIPTION = DIMENSIONAL_MEASURE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__DESCRIPTION = DIMENSIONAL_MEASURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__REQUESTED_OBSERVATIONS = DIMENSIONAL_MEASURE__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__IN_CATEGORY = DIMENSIONAL_MEASURE__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Measure Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__MEASURE_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASURE_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__REFINEMENT_TO = DIMENSIONAL_MEASURE__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__REFINEMENT_FROM = DIMENSIONAL_MEASURE__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__EQUIVALENT_TO = DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__RECURSIVE_TO = DIMENSIONAL_MEASURE__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__RECURSIVE_FROM = DIMENSIONAL_MEASURE__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Label Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__MEASUREMENT_LABEL_FORMAT = DIMENSIONAL_MEASURE__MEASUREMENT_LABEL_FORMAT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__VISIBLE = DIMENSIONAL_MEASURE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Measure Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__MEASURE_RELATIONSHIPS = DIMENSIONAL_MEASURE__MEASURE_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Default Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__DEFAULT_QUERY = DIMENSIONAL_MEASURE__DEFAULT_QUERY;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__BASE_MEASURE_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__BASE_MEASURE1_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measure2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__BASE_MEASURE2_FROM = DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__RESCALE_TO = DIMENSIONAL_MEASURE__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__RANKING_FROM = DIMENSIONAL_MEASURE__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__FORMULA = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rescale From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__RESCALE_FROM = DIMENSIONAL_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rescaled Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.RescaleMeasureRelationshipImpl <em>Rescale Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.RescaleMeasureRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRescaleMeasureRelationship()
	 * @generated
	 */
	int RESCALE_MEASURE_RELATIONSHIP = 50;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP__ATTRIBUTE = MEASURE_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP__ANNOTATION = MEASURE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP__NAME = MEASURE_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP__SHORT_DESCRIPTION = MEASURE_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP__DESCRIPTION = MEASURE_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP__REQUESTED_OBSERVATIONS = MEASURE_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP__MEASURAND_QUERY = MEASURE_RELATIONSHIP__MEASURAND_QUERY;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP__TO = MEASURE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP__FROM = MEASURE_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rescale Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASURE_RELATIONSHIP_FEATURE_COUNT = MEASURE_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.RescaledMeasurementImpl <em>Rescaled Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.RescaledMeasurementImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRescaledMeasurement()
	 * @generated
	 */
	int RESCALED_MEASUREMENT = 51;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__ATTRIBUTE = DIMENSIONAL_MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__ANNOTATION = DIMENSIONAL_MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__NAME = DIMENSIONAL_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__SHORT_DESCRIPTION = DIMENSIONAL_MEASUREMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__DESCRIPTION = DIMENSIONAL_MEASUREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__REQUESTED_OBSERVATIONS = DIMENSIONAL_MEASUREMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__MEASURAND = DIMENSIONAL_MEASUREMENT__MEASURAND;

	/**
	 * The feature id for the '<em><b>Break Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__BREAK_VALUE = DIMENSIONAL_MEASUREMENT__BREAK_VALUE;

	/**
	 * The feature id for the '<em><b>Refinement To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__REFINEMENT_TO = DIMENSIONAL_MEASUREMENT__REFINEMENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__REFINEMENT_FROM = DIMENSIONAL_MEASUREMENT__REFINEMENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__EQUIVALENT_TO = DIMENSIONAL_MEASUREMENT__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__EQUIVALENT_FROM = DIMENSIONAL_MEASUREMENT__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Recursive To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__RECURSIVE_TO = DIMENSIONAL_MEASUREMENT__RECURSIVE_TO;

	/**
	 * The feature id for the '<em><b>Recursive From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__RECURSIVE_FROM = DIMENSIONAL_MEASUREMENT__RECURSIVE_FROM;

	/**
	 * The feature id for the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__MEASUREMENT_RELATIONSHIPS = DIMENSIONAL_MEASUREMENT__MEASUREMENT_RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Base Measurement From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__BASE_MEASUREMENT_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement1 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__BASE_MEASUREMENT1_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM;

	/**
	 * The feature id for the '<em><b>Base Measurement2 From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__BASE_MEASUREMENT2_FROM = DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM;

	/**
	 * The feature id for the '<em><b>Rescale To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__RESCALE_TO = DIMENSIONAL_MEASUREMENT__RESCALE_TO;

	/**
	 * The feature id for the '<em><b>Ranking From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__RANKING_FROM = DIMENSIONAL_MEASUREMENT__RANKING_FROM;

	/**
	 * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__IS_BASE_SUPPLIED = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rescale From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT__RESCALE_FROM = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rescaled Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.RescaleMeasurementRelationshipImpl <em>Rescale Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.RescaleMeasurementRelationshipImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRescaleMeasurementRelationship()
	 * @generated
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP = 52;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP__ATTRIBUTE = MEASUREMENT_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP__ANNOTATION = MEASUREMENT_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP__NAME = MEASUREMENT_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION = MEASUREMENT_RELATIONSHIP__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP__DESCRIPTION = MEASUREMENT_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP__REQUESTED_OBSERVATIONS = MEASUREMENT_RELATIONSHIP__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP__TO = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP__FROM = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rescale Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALE_MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = MEASUREMENT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.ScopeImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 53;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ATTRIBUTE = ABSTRACT_MEASURE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ANNOTATION = ABSTRACT_MEASURE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__NAME = ABSTRACT_MEASURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__SHORT_DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__DESCRIPTION = ABSTRACT_MEASURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__REQUESTED_OBSERVATIONS = ABSTRACT_MEASURE_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__IN_CATEGORY = ABSTRACT_MEASURE_ELEMENT__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__CLASS = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ELEMENTS = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Recognizer Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__RECOGNIZER_QUERY = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Break Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__BREAK_CONDITION = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.impl.SmmModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.impl.SmmModelImpl
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getSmmModel()
	 * @generated
	 */
	int SMM_MODEL = 55;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__NAME = SMM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__SHORT_DESCRIPTION = SMM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__DESCRIPTION = SMM_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__REQUESTED_OBSERVATIONS = SMM_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>Observations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__OBSERVATIONS = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Librairies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__LIBRAIRIES = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.omg.smm.Accumulator <em>Accumulator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.omg.smm.Accumulator
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getAccumulator()
	 * @generated
	 */
	int ACCUMULATOR = 57;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 58;

	/**
	 * The meta object id for the '<em>Timestamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.Timestamp
	 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getTimestamp()
	 * @generated
	 */
	int TIMESTAMP = 59;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.AbstractMeasureElement <em>Abstract Measure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Measure Element</em>'.
	 * @see org.eclipse.modisco.omg.smm.AbstractMeasureElement
	 * @generated
	 */
	EClass getAbstractMeasureElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.AbstractMeasureElement#getInCategory <em>In Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Category</em>'.
	 * @see org.eclipse.modisco.omg.smm.AbstractMeasureElement#getInCategory()
	 * @see #getAbstractMeasureElement()
	 * @generated
	 */
	EReference getAbstractMeasureElement_InCategory();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see org.eclipse.modisco.omg.smm.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.modisco.omg.smm.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see org.eclipse.modisco.omg.smm.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Argument#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.modisco.omg.smm.Argument#getType()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Argument#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.omg.smm.Argument#getValue()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.eclipse.modisco.omg.smm.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Attribute#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see org.eclipse.modisco.omg.smm.Attribute#getTag()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Tag();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.omg.smm.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.AggregatedMeasurement <em>Aggregated Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregated Measurement</em>'.
	 * @see org.eclipse.modisco.omg.smm.AggregatedMeasurement
	 * @generated
	 */
	EClass getAggregatedMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.AggregatedMeasurement#isIsBaseSuppled <em>Is Base Suppled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Base Suppled</em>'.
	 * @see org.eclipse.modisco.omg.smm.AggregatedMeasurement#isIsBaseSuppled()
	 * @see #getAggregatedMeasurement()
	 * @generated
	 */
	EAttribute getAggregatedMeasurement_IsBaseSuppled();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.AggregatedMeasurement#getBaseMeasurement <em>Base Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measurement</em>'.
	 * @see org.eclipse.modisco.omg.smm.AggregatedMeasurement#getBaseMeasurement()
	 * @see #getAggregatedMeasurement()
	 * @generated
	 */
	EReference getAggregatedMeasurement_BaseMeasurement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.Base1MeasurementRelationship <em>Base1 Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base1 Measurement Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.Base1MeasurementRelationship
	 * @generated
	 */
	EClass getBase1MeasurementRelationship();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.modisco.omg.smm.Base1MeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.smm.Base1MeasurementRelationship#getFrom()
	 * @see #getBase1MeasurementRelationship()
	 * @generated
	 */
	EReference getBase1MeasurementRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Base1MeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.smm.Base1MeasurementRelationship#getTo()
	 * @see #getBase1MeasurementRelationship()
	 * @generated
	 */
	EReference getBase1MeasurementRelationship_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.Base1MeasureRelationship <em>Base1 Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base1 Measure Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.Base1MeasureRelationship
	 * @generated
	 */
	EClass getBase1MeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Base1MeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.smm.Base1MeasureRelationship#getFrom()
	 * @see #getBase1MeasureRelationship()
	 * @generated
	 */
	EReference getBase1MeasureRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Base1MeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.smm.Base1MeasureRelationship#getTo()
	 * @see #getBase1MeasureRelationship()
	 * @generated
	 */
	EReference getBase1MeasureRelationship_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.Base2MeasurementRelationship <em>Base2 Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base2 Measurement Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.Base2MeasurementRelationship
	 * @generated
	 */
	EClass getBase2MeasurementRelationship();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.modisco.omg.smm.Base2MeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.smm.Base2MeasurementRelationship#getFrom()
	 * @see #getBase2MeasurementRelationship()
	 * @generated
	 */
	EReference getBase2MeasurementRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Base2MeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.smm.Base2MeasurementRelationship#getTo()
	 * @see #getBase2MeasurementRelationship()
	 * @generated
	 */
	EReference getBase2MeasurementRelationship_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.Base2MeasureRelationship <em>Base2 Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base2 Measure Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.Base2MeasureRelationship
	 * @generated
	 */
	EClass getBase2MeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Base2MeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.smm.Base2MeasureRelationship#getFrom()
	 * @see #getBase2MeasureRelationship()
	 * @generated
	 */
	EReference getBase2MeasureRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Base2MeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.smm.Base2MeasureRelationship#getTo()
	 * @see #getBase2MeasureRelationship()
	 * @generated
	 */
	EReference getBase2MeasureRelationship_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.BaseMeasurementRelationship <em>Base Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Measurement Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.BaseMeasurementRelationship
	 * @generated
	 */
	EClass getBaseMeasurementRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.BaseMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.smm.BaseMeasurementRelationship#getFrom()
	 * @see #getBaseMeasurementRelationship()
	 * @generated
	 */
	EReference getBaseMeasurementRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.BaseMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.smm.BaseMeasurementRelationship#getTo()
	 * @see #getBaseMeasurementRelationship()
	 * @generated
	 */
	EReference getBaseMeasurementRelationship_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.BaseMeasureRelationship <em>Base Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Measure Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.BaseMeasureRelationship
	 * @generated
	 */
	EClass getBaseMeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.BaseMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.smm.BaseMeasureRelationship#getFrom()
	 * @see #getBaseMeasureRelationship()
	 * @generated
	 */
	EReference getBaseMeasureRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.BaseMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.smm.BaseMeasureRelationship#getTo()
	 * @see #getBaseMeasureRelationship()
	 * @generated
	 */
	EReference getBaseMeasureRelationship_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.BinaryMeasure <em>Binary Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Measure</em>'.
	 * @see org.eclipse.modisco.omg.smm.BinaryMeasure
	 * @generated
	 */
	EClass getBinaryMeasure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.BinaryMeasure#getFunctor <em>Functor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functor</em>'.
	 * @see org.eclipse.modisco.omg.smm.BinaryMeasure#getFunctor()
	 * @see #getBinaryMeasure()
	 * @generated
	 */
	EAttribute getBinaryMeasure_Functor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.BinaryMeasure#getBaseMeasure1To <em>Base Measure1 To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Measure1 To</em>'.
	 * @see org.eclipse.modisco.omg.smm.BinaryMeasure#getBaseMeasure1To()
	 * @see #getBinaryMeasure()
	 * @generated
	 */
	EReference getBinaryMeasure_BaseMeasure1To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.BinaryMeasure#getBaseMeasure2To <em>Base Measure2 To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Measure2 To</em>'.
	 * @see org.eclipse.modisco.omg.smm.BinaryMeasure#getBaseMeasure2To()
	 * @see #getBinaryMeasure()
	 * @generated
	 */
	EReference getBinaryMeasure_BaseMeasure2To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.BinaryMeasurement <em>Binary Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Measurement</em>'.
	 * @see org.eclipse.modisco.omg.smm.BinaryMeasurement
	 * @generated
	 */
	EClass getBinaryMeasurement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.omg.smm.BinaryMeasurement#getBaseMeasurement1To <em>Base Measurement1 To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Measurement1 To</em>'.
	 * @see org.eclipse.modisco.omg.smm.BinaryMeasurement#getBaseMeasurement1To()
	 * @see #getBinaryMeasurement()
	 * @generated
	 */
	EReference getBinaryMeasurement_BaseMeasurement1To();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.omg.smm.BinaryMeasurement#getBaseMeasurement2To <em>Base Measurement2 To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Measurement2 To</em>'.
	 * @see org.eclipse.modisco.omg.smm.BinaryMeasurement#getBaseMeasurement2To()
	 * @see #getBinaryMeasurement()
	 * @generated
	 */
	EReference getBinaryMeasurement_BaseMeasurement2To();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.BinaryMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Base Supplied</em>'.
	 * @see org.eclipse.modisco.omg.smm.BinaryMeasurement#isIsBaseSupplied()
	 * @see #getBinaryMeasurement()
	 * @generated
	 */
	EAttribute getBinaryMeasurement_IsBaseSupplied();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.CategoryRelationship <em>Category Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.CategoryRelationship
	 * @generated
	 */
	EClass getCategoryRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.CategoryRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.smm.CategoryRelationship#getFrom()
	 * @see #getCategoryRelationship()
	 * @generated
	 */
	EReference getCategoryRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.CategoryRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.smm.CategoryRelationship#getTo()
	 * @see #getCategoryRelationship()
	 * @generated
	 */
	EReference getCategoryRelationship_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see org.eclipse.modisco.omg.smm.Characteristic
	 * @generated
	 */
	EClass getCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Characteristic#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.eclipse.modisco.omg.smm.Characteristic#getParent()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EReference getCharacteristic_Parent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.CollectiveMeasure <em>Collective Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collective Measure</em>'.
	 * @see org.eclipse.modisco.omg.smm.CollectiveMeasure
	 * @generated
	 */
	EClass getCollectiveMeasure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.CollectiveMeasure#getAccumulator <em>Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accumulator</em>'.
	 * @see org.eclipse.modisco.omg.smm.CollectiveMeasure#getAccumulator()
	 * @see #getCollectiveMeasure()
	 * @generated
	 */
	EAttribute getCollectiveMeasure_Accumulator();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.CollectiveMeasure#getBaseMeasureTo <em>Base Measure To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measure To</em>'.
	 * @see org.eclipse.modisco.omg.smm.CollectiveMeasure#getBaseMeasureTo()
	 * @see #getCollectiveMeasure()
	 * @generated
	 */
	EReference getCollectiveMeasure_BaseMeasureTo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.CollectiveMeasurement <em>Collective Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collective Measurement</em>'.
	 * @see org.eclipse.modisco.omg.smm.CollectiveMeasurement
	 * @generated
	 */
	EClass getCollectiveMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.CollectiveMeasurement#getAccumulator <em>Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accumulator</em>'.
	 * @see org.eclipse.modisco.omg.smm.CollectiveMeasurement#getAccumulator()
	 * @see #getCollectiveMeasurement()
	 * @generated
	 */
	EAttribute getCollectiveMeasurement_Accumulator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.CollectiveMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Base Supplied</em>'.
	 * @see org.eclipse.modisco.omg.smm.CollectiveMeasurement#isIsBaseSupplied()
	 * @see #getCollectiveMeasurement()
	 * @generated
	 */
	EAttribute getCollectiveMeasurement_IsBaseSupplied();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.CollectiveMeasurement#getBaseMeasurementTo <em>Base Measurement To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measurement To</em>'.
	 * @see org.eclipse.modisco.omg.smm.CollectiveMeasurement#getBaseMeasurementTo()
	 * @see #getCollectiveMeasurement()
	 * @generated
	 */
	EReference getCollectiveMeasurement_BaseMeasurementTo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count</em>'.
	 * @see org.eclipse.modisco.omg.smm.Count
	 * @generated
	 */
	EClass getCount();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.Counting <em>Counting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counting</em>'.
	 * @see org.eclipse.modisco.omg.smm.Counting
	 * @generated
	 */
	EClass getCounting();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.DimensionalMeasure <em>Dimensional Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimensional Measure</em>'.
	 * @see org.eclipse.modisco.omg.smm.DimensionalMeasure
	 * @generated
	 */
	EClass getDimensionalMeasure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.DimensionalMeasure#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.modisco.omg.smm.DimensionalMeasure#getUnit()
	 * @see #getDimensionalMeasure()
	 * @generated
	 */
	EAttribute getDimensionalMeasure_Unit();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.DimensionalMeasure#getBaseMeasureFrom <em>Base Measure From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measure From</em>'.
	 * @see org.eclipse.modisco.omg.smm.DimensionalMeasure#getBaseMeasureFrom()
	 * @see #getDimensionalMeasure()
	 * @generated
	 */
	EReference getDimensionalMeasure_BaseMeasureFrom();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.DimensionalMeasure#getBaseMeasure1From <em>Base Measure1 From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measure1 From</em>'.
	 * @see org.eclipse.modisco.omg.smm.DimensionalMeasure#getBaseMeasure1From()
	 * @see #getDimensionalMeasure()
	 * @generated
	 */
	EReference getDimensionalMeasure_BaseMeasure1From();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.DimensionalMeasure#getBaseMeasure2From <em>Base Measure2 From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measure2 From</em>'.
	 * @see org.eclipse.modisco.omg.smm.DimensionalMeasure#getBaseMeasure2From()
	 * @see #getDimensionalMeasure()
	 * @generated
	 */
	EReference getDimensionalMeasure_BaseMeasure2From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.DimensionalMeasure#getRescaleTo <em>Rescale To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rescale To</em>'.
	 * @see org.eclipse.modisco.omg.smm.DimensionalMeasure#getRescaleTo()
	 * @see #getDimensionalMeasure()
	 * @generated
	 */
	EReference getDimensionalMeasure_RescaleTo();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.DimensionalMeasure#getRankingFrom <em>Ranking From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ranking From</em>'.
	 * @see org.eclipse.modisco.omg.smm.DimensionalMeasure#getRankingFrom()
	 * @see #getDimensionalMeasure()
	 * @generated
	 */
	EReference getDimensionalMeasure_RankingFrom();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.DimensionalMeasurement <em>Dimensional Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimensional Measurement</em>'.
	 * @see org.eclipse.modisco.omg.smm.DimensionalMeasurement
	 * @generated
	 */
	EClass getDimensionalMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.DimensionalMeasurement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.omg.smm.DimensionalMeasurement#getValue()
	 * @see #getDimensionalMeasurement()
	 * @generated
	 */
	EAttribute getDimensionalMeasurement_Value();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.DimensionalMeasurement#getBaseMeasurementFrom <em>Base Measurement From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measurement From</em>'.
	 * @see org.eclipse.modisco.omg.smm.DimensionalMeasurement#getBaseMeasurementFrom()
	 * @see #getDimensionalMeasurement()
	 * @generated
	 */
	EReference getDimensionalMeasurement_BaseMeasurementFrom();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.DimensionalMeasurement#getBaseMeasurement1From <em>Base Measurement1 From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measurement1 From</em>'.
	 * @see org.eclipse.modisco.omg.smm.DimensionalMeasurement#getBaseMeasurement1From()
	 * @see #getDimensionalMeasurement()
	 * @generated
	 */
	EReference getDimensionalMeasurement_BaseMeasurement1From();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.DimensionalMeasurement#getBaseMeasurement2From <em>Base Measurement2 From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measurement2 From</em>'.
	 * @see org.eclipse.modisco.omg.smm.DimensionalMeasurement#getBaseMeasurement2From()
	 * @see #getDimensionalMeasurement()
	 * @generated
	 */
	EReference getDimensionalMeasurement_BaseMeasurement2From();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.DimensionalMeasurement#getRescaleTo <em>Rescale To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rescale To</em>'.
	 * @see org.eclipse.modisco.omg.smm.DimensionalMeasurement#getRescaleTo()
	 * @see #getDimensionalMeasurement()
	 * @generated
	 */
	EReference getDimensionalMeasurement_RescaleTo();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.DimensionalMeasurement#getRankingFrom <em>Ranking From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ranking From</em>'.
	 * @see org.eclipse.modisco.omg.smm.DimensionalMeasurement#getRankingFrom()
	 * @see #getDimensionalMeasurement()
	 * @generated
	 */
	EReference getDimensionalMeasurement_RankingFrom();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.DirectMeasure <em>Direct Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Measure</em>'.
	 * @see org.eclipse.modisco.omg.smm.DirectMeasure
	 * @generated
	 */
	EClass getDirectMeasure();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.DirectMeasure#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see org.eclipse.modisco.omg.smm.DirectMeasure#getOperation()
	 * @see #getDirectMeasure()
	 * @generated
	 */
	EReference getDirectMeasure_Operation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.DirectMeasurement <em>Direct Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Measurement</em>'.
	 * @see org.eclipse.modisco.omg.smm.DirectMeasurement
	 * @generated
	 */
	EClass getDirectMeasurement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.EquivalentMeasureRelationship <em>Equivalent Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Measure Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.EquivalentMeasureRelationship
	 * @generated
	 */
	EClass getEquivalentMeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.EquivalentMeasureRelationship#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping</em>'.
	 * @see org.eclipse.modisco.omg.smm.EquivalentMeasureRelationship#getMapping()
	 * @see #getEquivalentMeasureRelationship()
	 * @generated
	 */
	EReference getEquivalentMeasureRelationship_Mapping();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.EquivalentMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.smm.EquivalentMeasureRelationship#getFrom()
	 * @see #getEquivalentMeasureRelationship()
	 * @generated
	 */
	EReference getEquivalentMeasureRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.EquivalentMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.smm.EquivalentMeasureRelationship#getTo()
	 * @see #getEquivalentMeasureRelationship()
	 * @generated
	 */
	EReference getEquivalentMeasureRelationship_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.EquivalentMeasurementRelationship <em>Equivalent Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equivalent Measurement Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.EquivalentMeasurementRelationship
	 * @generated
	 */
	EClass getEquivalentMeasurementRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.EquivalentMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.smm.EquivalentMeasurementRelationship#getFrom()
	 * @see #getEquivalentMeasurementRelationship()
	 * @generated
	 */
	EReference getEquivalentMeasurementRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.EquivalentMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.smm.EquivalentMeasurementRelationship#getTo()
	 * @see #getEquivalentMeasurementRelationship()
	 * @generated
	 */
	EReference getEquivalentMeasurementRelationship_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grade</em>'.
	 * @see org.eclipse.modisco.omg.smm.Grade
	 * @generated
	 */
	EClass getGrade();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Grade#getBaseMeasurement <em>Base Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Measurement</em>'.
	 * @see org.eclipse.modisco.omg.smm.Grade#getBaseMeasurement()
	 * @see #getGrade()
	 * @generated
	 */
	EReference getGrade_BaseMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Grade#isIsBaseSupplied <em>Is Base Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Base Supplied</em>'.
	 * @see org.eclipse.modisco.omg.smm.Grade#isIsBaseSupplied()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_IsBaseSupplied();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Grade#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.modisco.omg.smm.Grade#getValue()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_Value();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Grade#getRankingTo <em>Ranking To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ranking To</em>'.
	 * @see org.eclipse.modisco.omg.smm.Grade#getRankingTo()
	 * @see #getGrade()
	 * @generated
	 */
	EReference getGrade_RankingTo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.Measure#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measure#getCategory()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Category();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Measure#getTrait <em>Trait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trait</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measure#getTrait()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Trait();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Measure#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measure#getScope()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Measure#getMeasureLabelFormat <em>Measure Label Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure Label Format</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measure#getMeasureLabelFormat()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_MeasureLabelFormat();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.Measure#getRefinementTo <em>Refinement To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refinement To</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measure#getRefinementTo()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_RefinementTo();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.Measure#getRefinementFrom <em>Refinement From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refinement From</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measure#getRefinementFrom()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_RefinementFrom();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.Measure#getEquivalentTo <em>Equivalent To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent To</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measure#getEquivalentTo()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_EquivalentTo();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.Measure#getEquivalentFrom <em>Equivalent From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent From</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measure#getEquivalentFrom()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_EquivalentFrom();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Measure#getRecursiveTo <em>Recursive To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recursive To</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measure#getRecursiveTo()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_RecursiveTo();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Measure#getRecursiveFrom <em>Recursive From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recursive From</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measure#getRecursiveFrom()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_RecursiveFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Measure#getMeasurementLabelFormat <em>Measurement Label Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement Label Format</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measure#getMeasurementLabelFormat()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_MeasurementLabelFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Measure#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measure#isVisible()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Visible();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.smm.Measure#getMeasureRelationships <em>Measure Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Relationships</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measure#getMeasureRelationships()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_MeasureRelationships();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Measure#getDefaultQuery <em>Default Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Query</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measure#getDefaultQuery()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_DefaultQuery();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.MeasureCategory <em>Measure Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Category</em>'.
	 * @see org.eclipse.modisco.omg.smm.MeasureCategory
	 * @generated
	 */
	EClass getMeasureCategory();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.MeasureCategory#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see org.eclipse.modisco.omg.smm.MeasureCategory#getCategory()
	 * @see #getMeasureCategory()
	 * @generated
	 */
	EReference getMeasureCategory_Category();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.MeasureCategory#getCategoryElement <em>Category Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category Element</em>'.
	 * @see org.eclipse.modisco.omg.smm.MeasureCategory#getCategoryElement()
	 * @see #getMeasureCategory()
	 * @generated
	 */
	EReference getMeasureCategory_CategoryElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.MeasureCategory#getCategoryMeasure <em>Category Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category Measure</em>'.
	 * @see org.eclipse.modisco.omg.smm.MeasureCategory#getCategoryMeasure()
	 * @see #getMeasureCategory()
	 * @generated
	 */
	EReference getMeasureCategory_CategoryMeasure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.MeasureLibrary <em>Measure Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Library</em>'.
	 * @see org.eclipse.modisco.omg.smm.MeasureLibrary
	 * @generated
	 */
	EClass getMeasureLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.smm.MeasureLibrary#getMeasureElements <em>Measure Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measure Elements</em>'.
	 * @see org.eclipse.modisco.omg.smm.MeasureLibrary#getMeasureElements()
	 * @see #getMeasureLibrary()
	 * @generated
	 */
	EReference getMeasureLibrary_MeasureElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.smm.MeasureLibrary#getCategoryRelationships <em>Category Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category Relationships</em>'.
	 * @see org.eclipse.modisco.omg.smm.MeasureLibrary#getCategoryRelationships()
	 * @see #getMeasureLibrary()
	 * @generated
	 */
	EReference getMeasureLibrary_CategoryRelationships();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.MeasureRelationship <em>Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.MeasureRelationship
	 * @generated
	 */
	EClass getMeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.MeasureRelationship#getMeasurandQuery <em>Measurand Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurand Query</em>'.
	 * @see org.eclipse.modisco.omg.smm.MeasureRelationship#getMeasurandQuery()
	 * @see #getMeasureRelationship()
	 * @generated
	 */
	EReference getMeasureRelationship_MeasurandQuery();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measurement
	 * @generated
	 */
	EClass getMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Measurement#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measurement#getError()
	 * @see #getMeasurement()
	 * @generated
	 */
	EAttribute getMeasurement_Error();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Measurement#getMeasurand <em>Measurand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurand</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measurement#getMeasurand()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Measurand();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Measurement#getBreakValue <em>Break Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Break Value</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measurement#getBreakValue()
	 * @see #getMeasurement()
	 * @generated
	 */
	EAttribute getMeasurement_BreakValue();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.Measurement#getRefinementTo <em>Refinement To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refinement To</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measurement#getRefinementTo()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_RefinementTo();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.Measurement#getRefinementFrom <em>Refinement From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refinement From</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measurement#getRefinementFrom()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_RefinementFrom();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.Measurement#getEquivalentTo <em>Equivalent To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent To</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measurement#getEquivalentTo()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_EquivalentTo();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.Measurement#getEquivalentFrom <em>Equivalent From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent From</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measurement#getEquivalentFrom()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_EquivalentFrom();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Measurement#getRecursiveTo <em>Recursive To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recursive To</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measurement#getRecursiveTo()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_RecursiveTo();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.Measurement#getRecursiveFrom <em>Recursive From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recursive From</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measurement#getRecursiveFrom()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_RecursiveFrom();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.smm.Measurement#getMeasurementRelationships <em>Measurement Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurement Relationships</em>'.
	 * @see org.eclipse.modisco.omg.smm.Measurement#getMeasurementRelationships()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_MeasurementRelationships();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.MeasurementRelationship <em>Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.MeasurementRelationship
	 * @generated
	 */
	EClass getMeasurementRelationship();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.NamedMeasure <em>Named Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Measure</em>'.
	 * @see org.eclipse.modisco.omg.smm.NamedMeasure
	 * @generated
	 */
	EClass getNamedMeasure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.NamedMeasurement <em>Named Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Measurement</em>'.
	 * @see org.eclipse.modisco.omg.smm.NamedMeasurement
	 * @generated
	 */
	EClass getNamedMeasurement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation</em>'.
	 * @see org.eclipse.modisco.omg.smm.Observation
	 * @generated
	 */
	EClass getObservation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Observation#getObserver <em>Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observer</em>'.
	 * @see org.eclipse.modisco.omg.smm.Observation#getObserver()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_Observer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Observation#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool</em>'.
	 * @see org.eclipse.modisco.omg.smm.Observation#getTool()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_Tool();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Observation#getWhenObserved <em>When Observed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When Observed</em>'.
	 * @see org.eclipse.modisco.omg.smm.Observation#getWhenObserved()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_WhenObserved();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.smm.Observation#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scopes</em>'.
	 * @see org.eclipse.modisco.omg.smm.Observation#getScopes()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Scopes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.smm.Observation#getObservedMeasures <em>Observed Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Observed Measures</em>'.
	 * @see org.eclipse.modisco.omg.smm.Observation#getObservedMeasures()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_ObservedMeasures();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.Observation#getRequestedMeasures <em>Requested Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requested Measures</em>'.
	 * @see org.eclipse.modisco.omg.smm.Observation#getRequestedMeasures()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_RequestedMeasures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.smm.Observation#getMeasurementRelations <em>Measurement Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurement Relations</em>'.
	 * @see org.eclipse.modisco.omg.smm.Observation#getMeasurementRelations()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_MeasurementRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.smm.Observation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.eclipse.modisco.omg.smm.Observation#getArguments()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Arguments();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.ObservationScope <em>Observation Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation Scope</em>'.
	 * @see org.eclipse.modisco.omg.smm.ObservationScope
	 * @generated
	 */
	EClass getObservationScope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.ObservationScope#getScopeUri <em>Scope Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope Uri</em>'.
	 * @see org.eclipse.modisco.omg.smm.ObservationScope#getScopeUri()
	 * @see #getObservationScope()
	 * @generated
	 */
	EAttribute getObservationScope_ScopeUri();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.ObservedMeasure <em>Observed Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observed Measure</em>'.
	 * @see org.eclipse.modisco.omg.smm.ObservedMeasure
	 * @generated
	 */
	EClass getObservedMeasure();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.ObservedMeasure#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measure</em>'.
	 * @see org.eclipse.modisco.omg.smm.ObservedMeasure#getMeasure()
	 * @see #getObservedMeasure()
	 * @generated
	 */
	EReference getObservedMeasure_Measure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.smm.ObservedMeasure#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurements</em>'.
	 * @see org.eclipse.modisco.omg.smm.ObservedMeasure#getMeasurements()
	 * @see #getObservedMeasure()
	 * @generated
	 */
	EReference getObservedMeasure_Measurements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.OCLOperation <em>OCL Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Operation</em>'.
	 * @see org.eclipse.modisco.omg.smm.OCLOperation
	 * @generated
	 */
	EClass getOCLOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.OCLOperation#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see org.eclipse.modisco.omg.smm.OCLOperation#getContext()
	 * @see #getOCLOperation()
	 * @generated
	 */
	EAttribute getOCLOperation_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.OCLOperation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.modisco.omg.smm.OCLOperation#getBody()
	 * @see #getOCLOperation()
	 * @generated
	 */
	EAttribute getOCLOperation_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.eclipse.modisco.omg.smm.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Operation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.eclipse.modisco.omg.smm.Operation#getLanguage()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Operation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.modisco.omg.smm.Operation#getBody()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.Ranking <em>Ranking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking</em>'.
	 * @see org.eclipse.modisco.omg.smm.Ranking
	 * @generated
	 */
	EClass getRanking();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.smm.Ranking#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interval</em>'.
	 * @see org.eclipse.modisco.omg.smm.Ranking#getInterval()
	 * @see #getRanking()
	 * @generated
	 */
	EReference getRanking_Interval();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Ranking#getRankingTo <em>Ranking To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ranking To</em>'.
	 * @see org.eclipse.modisco.omg.smm.Ranking#getRankingTo()
	 * @see #getRanking()
	 * @generated
	 */
	EReference getRanking_RankingTo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.RankingInterval <em>Ranking Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking Interval</em>'.
	 * @see org.eclipse.modisco.omg.smm.RankingInterval
	 * @generated
	 */
	EClass getRankingInterval();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.modisco.omg.smm.RankingInterval#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rank</em>'.
	 * @see org.eclipse.modisco.omg.smm.RankingInterval#getRank()
	 * @see #getRankingInterval()
	 * @generated
	 */
	EReference getRankingInterval_Rank();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.RankingInterval#getMaximumEndpoint <em>Maximum Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Endpoint</em>'.
	 * @see org.eclipse.modisco.omg.smm.RankingInterval#getMaximumEndpoint()
	 * @see #getRankingInterval()
	 * @generated
	 */
	EAttribute getRankingInterval_MaximumEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.RankingInterval#isMaximumOpen <em>Maximum Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Open</em>'.
	 * @see org.eclipse.modisco.omg.smm.RankingInterval#isMaximumOpen()
	 * @see #getRankingInterval()
	 * @generated
	 */
	EAttribute getRankingInterval_MaximumOpen();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.RankingInterval#getMinimumEndpoint <em>Minimum Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Endpoint</em>'.
	 * @see org.eclipse.modisco.omg.smm.RankingInterval#getMinimumEndpoint()
	 * @see #getRankingInterval()
	 * @generated
	 */
	EAttribute getRankingInterval_MinimumEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.RankingInterval#isMinimumOpen <em>Minimum Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Open</em>'.
	 * @see org.eclipse.modisco.omg.smm.RankingInterval#isMinimumOpen()
	 * @see #getRankingInterval()
	 * @generated
	 */
	EAttribute getRankingInterval_MinimumOpen();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.RankingInterval#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see org.eclipse.modisco.omg.smm.RankingInterval#getSymbol()
	 * @see #getRankingInterval()
	 * @generated
	 */
	EAttribute getRankingInterval_Symbol();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.RankingMeasureRelationship <em>Ranking Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking Measure Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.RankingMeasureRelationship
	 * @generated
	 */
	EClass getRankingMeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.RankingMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.smm.RankingMeasureRelationship#getFrom()
	 * @see #getRankingMeasureRelationship()
	 * @generated
	 */
	EReference getRankingMeasureRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.RankingMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.smm.RankingMeasureRelationship#getTo()
	 * @see #getRankingMeasureRelationship()
	 * @generated
	 */
	EReference getRankingMeasureRelationship_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.RankingMeasurementRelationship <em>Ranking Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking Measurement Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.RankingMeasurementRelationship
	 * @generated
	 */
	EClass getRankingMeasurementRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.RankingMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.smm.RankingMeasurementRelationship#getFrom()
	 * @see #getRankingMeasurementRelationship()
	 * @generated
	 */
	EReference getRankingMeasurementRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.RankingMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.smm.RankingMeasurementRelationship#getTo()
	 * @see #getRankingMeasurementRelationship()
	 * @generated
	 */
	EReference getRankingMeasurementRelationship_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.RatioMeasure <em>Ratio Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio Measure</em>'.
	 * @see org.eclipse.modisco.omg.smm.RatioMeasure
	 * @generated
	 */
	EClass getRatioMeasure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.RatioMeasurement <em>Ratio Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio Measurement</em>'.
	 * @see org.eclipse.modisco.omg.smm.RatioMeasurement
	 * @generated
	 */
	EClass getRatioMeasurement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.RecursiveMeasureRelationship <em>Recursive Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recursive Measure Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.RecursiveMeasureRelationship
	 * @generated
	 */
	EClass getRecursiveMeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.RecursiveMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.smm.RecursiveMeasureRelationship#getFrom()
	 * @see #getRecursiveMeasureRelationship()
	 * @generated
	 */
	EReference getRecursiveMeasureRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.RecursiveMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.smm.RecursiveMeasureRelationship#getTo()
	 * @see #getRecursiveMeasureRelationship()
	 * @generated
	 */
	EReference getRecursiveMeasureRelationship_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.RecursiveMeasurementRelationship <em>Recursive Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recursive Measurement Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.RecursiveMeasurementRelationship
	 * @generated
	 */
	EClass getRecursiveMeasurementRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.RecursiveMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.smm.RecursiveMeasurementRelationship#getFrom()
	 * @see #getRecursiveMeasurementRelationship()
	 * @generated
	 */
	EReference getRecursiveMeasurementRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.RecursiveMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.smm.RecursiveMeasurementRelationship#getTo()
	 * @see #getRecursiveMeasurementRelationship()
	 * @generated
	 */
	EReference getRecursiveMeasurementRelationship_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.RefinementMeasureRelationship <em>Refinement Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement Measure Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.RefinementMeasureRelationship
	 * @generated
	 */
	EClass getRefinementMeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.RefinementMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.smm.RefinementMeasureRelationship#getFrom()
	 * @see #getRefinementMeasureRelationship()
	 * @generated
	 */
	EReference getRefinementMeasureRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.RefinementMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.smm.RefinementMeasureRelationship#getTo()
	 * @see #getRefinementMeasureRelationship()
	 * @generated
	 */
	EReference getRefinementMeasureRelationship_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship <em>Refinement Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement Measurement Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship
	 * @generated
	 */
	EClass getRefinementMeasurementRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship#getFrom()
	 * @see #getRefinementMeasurementRelationship()
	 * @generated
	 */
	EReference getRefinementMeasurementRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship#getTo()
	 * @see #getRefinementMeasurementRelationship()
	 * @generated
	 */
	EReference getRefinementMeasurementRelationship_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.RescaledMeasure <em>Rescaled Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rescaled Measure</em>'.
	 * @see org.eclipse.modisco.omg.smm.RescaledMeasure
	 * @generated
	 */
	EClass getRescaledMeasure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.RescaledMeasure#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see org.eclipse.modisco.omg.smm.RescaledMeasure#getFormula()
	 * @see #getRescaledMeasure()
	 * @generated
	 */
	EAttribute getRescaledMeasure_Formula();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.RescaledMeasure#getRescaleFrom <em>Rescale From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rescale From</em>'.
	 * @see org.eclipse.modisco.omg.smm.RescaledMeasure#getRescaleFrom()
	 * @see #getRescaledMeasure()
	 * @generated
	 */
	EReference getRescaledMeasure_RescaleFrom();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.RescaleMeasureRelationship <em>Rescale Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rescale Measure Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.RescaleMeasureRelationship
	 * @generated
	 */
	EClass getRescaleMeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.RescaleMeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.smm.RescaleMeasureRelationship#getTo()
	 * @see #getRescaleMeasureRelationship()
	 * @generated
	 */
	EReference getRescaleMeasureRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.RescaleMeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.smm.RescaleMeasureRelationship#getFrom()
	 * @see #getRescaleMeasureRelationship()
	 * @generated
	 */
	EReference getRescaleMeasureRelationship_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.RescaledMeasurement <em>Rescaled Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rescaled Measurement</em>'.
	 * @see org.eclipse.modisco.omg.smm.RescaledMeasurement
	 * @generated
	 */
	EClass getRescaledMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.RescaledMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Base Supplied</em>'.
	 * @see org.eclipse.modisco.omg.smm.RescaledMeasurement#isIsBaseSupplied()
	 * @see #getRescaledMeasurement()
	 * @generated
	 */
	EAttribute getRescaledMeasurement_IsBaseSupplied();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.RescaledMeasurement#getRescaleFrom <em>Rescale From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rescale From</em>'.
	 * @see org.eclipse.modisco.omg.smm.RescaledMeasurement#getRescaleFrom()
	 * @see #getRescaledMeasurement()
	 * @generated
	 */
	EReference getRescaledMeasurement_RescaleFrom();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.RescaleMeasurementRelationship <em>Rescale Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rescale Measurement Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.RescaleMeasurementRelationship
	 * @generated
	 */
	EClass getRescaleMeasurementRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.RescaleMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.modisco.omg.smm.RescaleMeasurementRelationship#getTo()
	 * @see #getRescaleMeasurementRelationship()
	 * @generated
	 */
	EReference getRescaleMeasurementRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.RescaleMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.modisco.omg.smm.RescaleMeasurementRelationship#getFrom()
	 * @see #getRescaleMeasurementRelationship()
	 * @generated
	 */
	EReference getRescaleMeasurementRelationship_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see org.eclipse.modisco.omg.smm.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.Scope#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.modisco.omg.smm.Scope#getClass_()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_Class();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.Scope#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.eclipse.modisco.omg.smm.Scope#getElements()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Elements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Scope#getRecognizerQuery <em>Recognizer Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recognizer Query</em>'.
	 * @see org.eclipse.modisco.omg.smm.Scope#getRecognizerQuery()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_RecognizerQuery();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.omg.smm.Scope#getBreakCondition <em>Break Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Break Condition</em>'.
	 * @see org.eclipse.modisco.omg.smm.Scope#getBreakCondition()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_BreakCondition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.SmmElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.modisco.omg.smm.SmmElement
	 * @generated
	 */
	EClass getSmmElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.smm.SmmElement#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.eclipse.modisco.omg.smm.SmmElement#getAttribute()
	 * @see #getSmmElement()
	 * @generated
	 */
	EReference getSmmElement_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.smm.SmmElement#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.eclipse.modisco.omg.smm.SmmElement#getAnnotation()
	 * @see #getSmmElement()
	 * @generated
	 */
	EReference getSmmElement_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.SmmElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.omg.smm.SmmElement#getName()
	 * @see #getSmmElement()
	 * @generated
	 */
	EAttribute getSmmElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.SmmElement#getShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Description</em>'.
	 * @see org.eclipse.modisco.omg.smm.SmmElement#getShortDescription()
	 * @see #getSmmElement()
	 * @generated
	 */
	EAttribute getSmmElement_ShortDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.omg.smm.SmmElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.modisco.omg.smm.SmmElement#getDescription()
	 * @see #getSmmElement()
	 * @generated
	 */
	EAttribute getSmmElement_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.omg.smm.SmmElement#getRequestedObservations <em>Requested Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requested Observations</em>'.
	 * @see org.eclipse.modisco.omg.smm.SmmElement#getRequestedObservations()
	 * @see #getSmmElement()
	 * @generated
	 */
	EReference getSmmElement_RequestedObservations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.SmmModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.modisco.omg.smm.SmmModel
	 * @generated
	 */
	EClass getSmmModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.smm.SmmModel#getObservations <em>Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Observations</em>'.
	 * @see org.eclipse.modisco.omg.smm.SmmModel#getObservations()
	 * @see #getSmmModel()
	 * @generated
	 */
	EReference getSmmModel_Observations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.omg.smm.SmmModel#getLibrairies <em>Librairies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Librairies</em>'.
	 * @see org.eclipse.modisco.omg.smm.SmmModel#getLibrairies()
	 * @see #getSmmModel()
	 * @generated
	 */
	EReference getSmmModel_Librairies();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.omg.smm.SmmRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.eclipse.modisco.omg.smm.SmmRelationship
	 * @generated
	 */
	EClass getSmmRelationship();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.modisco.omg.smm.Accumulator <em>Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Accumulator</em>'.
	 * @see org.eclipse.modisco.omg.smm.Accumulator
	 * @generated
	 */
	EEnum getAccumulator();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the meta object for data type '{@link java.sql.Timestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timestamp</em>'.
	 * @see java.sql.Timestamp
	 * @model instanceClass="java.sql.Timestamp"
	 * @generated
	 */
	EDataType getTimestamp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmmFactory getSmmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.AbstractMeasureElementImpl <em>Abstract Measure Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.AbstractMeasureElementImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getAbstractMeasureElement()
		 * @generated
		 */
		EClass ABSTRACT_MEASURE_ELEMENT = eINSTANCE.getAbstractMeasureElement();

		/**
		 * The meta object literal for the '<em><b>In Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MEASURE_ELEMENT__IN_CATEGORY = eINSTANCE.getAbstractMeasureElement_InCategory();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.AnnotationImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.ArgumentImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__TYPE = eINSTANCE.getArgument_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__VALUE = eINSTANCE.getArgument_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.AttributeImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TAG = eINSTANCE.getAttribute_Tag();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.AggregatedMeasurementImpl <em>Aggregated Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.AggregatedMeasurementImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getAggregatedMeasurement()
		 * @generated
		 */
		EClass AGGREGATED_MEASUREMENT = eINSTANCE.getAggregatedMeasurement();

		/**
		 * The meta object literal for the '<em><b>Is Base Suppled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_MEASUREMENT__IS_BASE_SUPPLED = eINSTANCE.getAggregatedMeasurement_IsBaseSuppled();

		/**
		 * The meta object literal for the '<em><b>Base Measurement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_MEASUREMENT__BASE_MEASUREMENT = eINSTANCE.getAggregatedMeasurement_BaseMeasurement();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.Base1MeasurementRelationshipImpl <em>Base1 Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.Base1MeasurementRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getBase1MeasurementRelationship()
		 * @generated
		 */
		EClass BASE1_MEASUREMENT_RELATIONSHIP = eINSTANCE.getBase1MeasurementRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE1_MEASUREMENT_RELATIONSHIP__FROM = eINSTANCE.getBase1MeasurementRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE1_MEASUREMENT_RELATIONSHIP__TO = eINSTANCE.getBase1MeasurementRelationship_To();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.Base1MeasureRelationshipImpl <em>Base1 Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.Base1MeasureRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getBase1MeasureRelationship()
		 * @generated
		 */
		EClass BASE1_MEASURE_RELATIONSHIP = eINSTANCE.getBase1MeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE1_MEASURE_RELATIONSHIP__FROM = eINSTANCE.getBase1MeasureRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE1_MEASURE_RELATIONSHIP__TO = eINSTANCE.getBase1MeasureRelationship_To();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.Base2MeasurementRelationshipImpl <em>Base2 Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.Base2MeasurementRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getBase2MeasurementRelationship()
		 * @generated
		 */
		EClass BASE2_MEASUREMENT_RELATIONSHIP = eINSTANCE.getBase2MeasurementRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE2_MEASUREMENT_RELATIONSHIP__FROM = eINSTANCE.getBase2MeasurementRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE2_MEASUREMENT_RELATIONSHIP__TO = eINSTANCE.getBase2MeasurementRelationship_To();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.Base2MeasureRelationshipImpl <em>Base2 Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.Base2MeasureRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getBase2MeasureRelationship()
		 * @generated
		 */
		EClass BASE2_MEASURE_RELATIONSHIP = eINSTANCE.getBase2MeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE2_MEASURE_RELATIONSHIP__FROM = eINSTANCE.getBase2MeasureRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE2_MEASURE_RELATIONSHIP__TO = eINSTANCE.getBase2MeasureRelationship_To();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.BaseMeasurementRelationshipImpl <em>Base Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.BaseMeasurementRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getBaseMeasurementRelationship()
		 * @generated
		 */
		EClass BASE_MEASUREMENT_RELATIONSHIP = eINSTANCE.getBaseMeasurementRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_MEASUREMENT_RELATIONSHIP__FROM = eINSTANCE.getBaseMeasurementRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_MEASUREMENT_RELATIONSHIP__TO = eINSTANCE.getBaseMeasurementRelationship_To();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.BaseMeasureRelationshipImpl <em>Base Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.BaseMeasureRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getBaseMeasureRelationship()
		 * @generated
		 */
		EClass BASE_MEASURE_RELATIONSHIP = eINSTANCE.getBaseMeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_MEASURE_RELATIONSHIP__FROM = eINSTANCE.getBaseMeasureRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_MEASURE_RELATIONSHIP__TO = eINSTANCE.getBaseMeasureRelationship_To();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.BinaryMeasureImpl <em>Binary Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.BinaryMeasureImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getBinaryMeasure()
		 * @generated
		 */
		EClass BINARY_MEASURE = eINSTANCE.getBinaryMeasure();

		/**
		 * The meta object literal for the '<em><b>Functor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_MEASURE__FUNCTOR = eINSTANCE.getBinaryMeasure_Functor();

		/**
		 * The meta object literal for the '<em><b>Base Measure1 To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_MEASURE__BASE_MEASURE1_TO = eINSTANCE.getBinaryMeasure_BaseMeasure1To();

		/**
		 * The meta object literal for the '<em><b>Base Measure2 To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_MEASURE__BASE_MEASURE2_TO = eINSTANCE.getBinaryMeasure_BaseMeasure2To();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.BinaryMeasurementImpl <em>Binary Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.BinaryMeasurementImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getBinaryMeasurement()
		 * @generated
		 */
		EClass BINARY_MEASUREMENT = eINSTANCE.getBinaryMeasurement();

		/**
		 * The meta object literal for the '<em><b>Base Measurement1 To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_MEASUREMENT__BASE_MEASUREMENT1_TO = eINSTANCE.getBinaryMeasurement_BaseMeasurement1To();

		/**
		 * The meta object literal for the '<em><b>Base Measurement2 To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_MEASUREMENT__BASE_MEASUREMENT2_TO = eINSTANCE.getBinaryMeasurement_BaseMeasurement2To();

		/**
		 * The meta object literal for the '<em><b>Is Base Supplied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_MEASUREMENT__IS_BASE_SUPPLIED = eINSTANCE.getBinaryMeasurement_IsBaseSupplied();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.CategoryRelationshipImpl <em>Category Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.CategoryRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getCategoryRelationship()
		 * @generated
		 */
		EClass CATEGORY_RELATIONSHIP = eINSTANCE.getCategoryRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_RELATIONSHIP__FROM = eINSTANCE.getCategoryRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_RELATIONSHIP__TO = eINSTANCE.getCategoryRelationship_To();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.CharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.CharacteristicImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getCharacteristic()
		 * @generated
		 */
		EClass CHARACTERISTIC = eINSTANCE.getCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC__PARENT = eINSTANCE.getCharacteristic_Parent();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.CollectiveMeasureImpl <em>Collective Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.CollectiveMeasureImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getCollectiveMeasure()
		 * @generated
		 */
		EClass COLLECTIVE_MEASURE = eINSTANCE.getCollectiveMeasure();

		/**
		 * The meta object literal for the '<em><b>Accumulator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTIVE_MEASURE__ACCUMULATOR = eINSTANCE.getCollectiveMeasure_Accumulator();

		/**
		 * The meta object literal for the '<em><b>Base Measure To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTIVE_MEASURE__BASE_MEASURE_TO = eINSTANCE.getCollectiveMeasure_BaseMeasureTo();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.CollectiveMeasurementImpl <em>Collective Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.CollectiveMeasurementImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getCollectiveMeasurement()
		 * @generated
		 */
		EClass COLLECTIVE_MEASUREMENT = eINSTANCE.getCollectiveMeasurement();

		/**
		 * The meta object literal for the '<em><b>Accumulator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTIVE_MEASUREMENT__ACCUMULATOR = eINSTANCE.getCollectiveMeasurement_Accumulator();

		/**
		 * The meta object literal for the '<em><b>Is Base Supplied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTIVE_MEASUREMENT__IS_BASE_SUPPLIED = eINSTANCE.getCollectiveMeasurement_IsBaseSupplied();

		/**
		 * The meta object literal for the '<em><b>Base Measurement To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_TO = eINSTANCE.getCollectiveMeasurement_BaseMeasurementTo();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.CountImpl <em>Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.CountImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getCount()
		 * @generated
		 */
		EClass COUNT = eINSTANCE.getCount();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.CountingImpl <em>Counting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.CountingImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getCounting()
		 * @generated
		 */
		EClass COUNTING = eINSTANCE.getCounting();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.DimensionalMeasureImpl <em>Dimensional Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.DimensionalMeasureImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getDimensionalMeasure()
		 * @generated
		 */
		EClass DIMENSIONAL_MEASURE = eINSTANCE.getDimensionalMeasure();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSIONAL_MEASURE__UNIT = eINSTANCE.getDimensionalMeasure_Unit();

		/**
		 * The meta object literal for the '<em><b>Base Measure From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASURE__BASE_MEASURE_FROM = eINSTANCE.getDimensionalMeasure_BaseMeasureFrom();

		/**
		 * The meta object literal for the '<em><b>Base Measure1 From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM = eINSTANCE.getDimensionalMeasure_BaseMeasure1From();

		/**
		 * The meta object literal for the '<em><b>Base Measure2 From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM = eINSTANCE.getDimensionalMeasure_BaseMeasure2From();

		/**
		 * The meta object literal for the '<em><b>Rescale To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASURE__RESCALE_TO = eINSTANCE.getDimensionalMeasure_RescaleTo();

		/**
		 * The meta object literal for the '<em><b>Ranking From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASURE__RANKING_FROM = eINSTANCE.getDimensionalMeasure_RankingFrom();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.DimensionalMeasurementImpl <em>Dimensional Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.DimensionalMeasurementImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getDimensionalMeasurement()
		 * @generated
		 */
		EClass DIMENSIONAL_MEASUREMENT = eINSTANCE.getDimensionalMeasurement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSIONAL_MEASUREMENT__VALUE = eINSTANCE.getDimensionalMeasurement_Value();

		/**
		 * The meta object literal for the '<em><b>Base Measurement From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM = eINSTANCE.getDimensionalMeasurement_BaseMeasurementFrom();

		/**
		 * The meta object literal for the '<em><b>Base Measurement1 From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT1_FROM = eINSTANCE.getDimensionalMeasurement_BaseMeasurement1From();

		/**
		 * The meta object literal for the '<em><b>Base Measurement2 From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT2_FROM = eINSTANCE.getDimensionalMeasurement_BaseMeasurement2From();

		/**
		 * The meta object literal for the '<em><b>Rescale To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASUREMENT__RESCALE_TO = eINSTANCE.getDimensionalMeasurement_RescaleTo();

		/**
		 * The meta object literal for the '<em><b>Ranking From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_MEASUREMENT__RANKING_FROM = eINSTANCE.getDimensionalMeasurement_RankingFrom();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.DirectMeasureImpl <em>Direct Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.DirectMeasureImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getDirectMeasure()
		 * @generated
		 */
		EClass DIRECT_MEASURE = eINSTANCE.getDirectMeasure();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECT_MEASURE__OPERATION = eINSTANCE.getDirectMeasure_Operation();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.DirectMeasurementImpl <em>Direct Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.DirectMeasurementImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getDirectMeasurement()
		 * @generated
		 */
		EClass DIRECT_MEASUREMENT = eINSTANCE.getDirectMeasurement();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.EquivalentMeasureRelationshipImpl <em>Equivalent Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.EquivalentMeasureRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getEquivalentMeasureRelationship()
		 * @generated
		 */
		EClass EQUIVALENT_MEASURE_RELATIONSHIP = eINSTANCE.getEquivalentMeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_MEASURE_RELATIONSHIP__MAPPING = eINSTANCE.getEquivalentMeasureRelationship_Mapping();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_MEASURE_RELATIONSHIP__FROM = eINSTANCE.getEquivalentMeasureRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_MEASURE_RELATIONSHIP__TO = eINSTANCE.getEquivalentMeasureRelationship_To();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.EquivalentMeasurementRelationshipImpl <em>Equivalent Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.EquivalentMeasurementRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getEquivalentMeasurementRelationship()
		 * @generated
		 */
		EClass EQUIVALENT_MEASUREMENT_RELATIONSHIP = eINSTANCE.getEquivalentMeasurementRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_MEASUREMENT_RELATIONSHIP__FROM = eINSTANCE.getEquivalentMeasurementRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIVALENT_MEASUREMENT_RELATIONSHIP__TO = eINSTANCE.getEquivalentMeasurementRelationship_To();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.GradeImpl <em>Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.GradeImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getGrade()
		 * @generated
		 */
		EClass GRADE = eINSTANCE.getGrade();

		/**
		 * The meta object literal for the '<em><b>Base Measurement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADE__BASE_MEASUREMENT = eINSTANCE.getGrade_BaseMeasurement();

		/**
		 * The meta object literal for the '<em><b>Is Base Supplied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__IS_BASE_SUPPLIED = eINSTANCE.getGrade_IsBaseSupplied();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__VALUE = eINSTANCE.getGrade_Value();

		/**
		 * The meta object literal for the '<em><b>Ranking To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADE__RANKING_TO = eINSTANCE.getGrade_RankingTo();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.MeasureImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__CATEGORY = eINSTANCE.getMeasure_Category();

		/**
		 * The meta object literal for the '<em><b>Trait</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__TRAIT = eINSTANCE.getMeasure_Trait();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__SCOPE = eINSTANCE.getMeasure_Scope();

		/**
		 * The meta object literal for the '<em><b>Measure Label Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__MEASURE_LABEL_FORMAT = eINSTANCE.getMeasure_MeasureLabelFormat();

		/**
		 * The meta object literal for the '<em><b>Refinement To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__REFINEMENT_TO = eINSTANCE.getMeasure_RefinementTo();

		/**
		 * The meta object literal for the '<em><b>Refinement From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__REFINEMENT_FROM = eINSTANCE.getMeasure_RefinementFrom();

		/**
		 * The meta object literal for the '<em><b>Equivalent To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__EQUIVALENT_TO = eINSTANCE.getMeasure_EquivalentTo();

		/**
		 * The meta object literal for the '<em><b>Equivalent From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__EQUIVALENT_FROM = eINSTANCE.getMeasure_EquivalentFrom();

		/**
		 * The meta object literal for the '<em><b>Recursive To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__RECURSIVE_TO = eINSTANCE.getMeasure_RecursiveTo();

		/**
		 * The meta object literal for the '<em><b>Recursive From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__RECURSIVE_FROM = eINSTANCE.getMeasure_RecursiveFrom();

		/**
		 * The meta object literal for the '<em><b>Measurement Label Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__MEASUREMENT_LABEL_FORMAT = eINSTANCE.getMeasure_MeasurementLabelFormat();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__VISIBLE = eINSTANCE.getMeasure_Visible();

		/**
		 * The meta object literal for the '<em><b>Measure Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__MEASURE_RELATIONSHIPS = eINSTANCE.getMeasure_MeasureRelationships();

		/**
		 * The meta object literal for the '<em><b>Default Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__DEFAULT_QUERY = eINSTANCE.getMeasure_DefaultQuery();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.MeasureCategoryImpl <em>Measure Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.MeasureCategoryImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getMeasureCategory()
		 * @generated
		 */
		EClass MEASURE_CATEGORY = eINSTANCE.getMeasureCategory();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_CATEGORY__CATEGORY = eINSTANCE.getMeasureCategory_Category();

		/**
		 * The meta object literal for the '<em><b>Category Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_CATEGORY__CATEGORY_ELEMENT = eINSTANCE.getMeasureCategory_CategoryElement();

		/**
		 * The meta object literal for the '<em><b>Category Measure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_CATEGORY__CATEGORY_MEASURE = eINSTANCE.getMeasureCategory_CategoryMeasure();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.MeasureLibraryImpl <em>Measure Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.MeasureLibraryImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getMeasureLibrary()
		 * @generated
		 */
		EClass MEASURE_LIBRARY = eINSTANCE.getMeasureLibrary();

		/**
		 * The meta object literal for the '<em><b>Measure Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_LIBRARY__MEASURE_ELEMENTS = eINSTANCE.getMeasureLibrary_MeasureElements();

		/**
		 * The meta object literal for the '<em><b>Category Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS = eINSTANCE.getMeasureLibrary_CategoryRelationships();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.MeasureRelationshipImpl <em>Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.MeasureRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getMeasureRelationship()
		 * @generated
		 */
		EClass MEASURE_RELATIONSHIP = eINSTANCE.getMeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>Measurand Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_RELATIONSHIP__MEASURAND_QUERY = eINSTANCE.getMeasureRelationship_MeasurandQuery();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.MeasurementImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getMeasurement()
		 * @generated
		 */
		EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT__ERROR = eINSTANCE.getMeasurement_Error();

		/**
		 * The meta object literal for the '<em><b>Measurand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__MEASURAND = eINSTANCE.getMeasurement_Measurand();

		/**
		 * The meta object literal for the '<em><b>Break Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT__BREAK_VALUE = eINSTANCE.getMeasurement_BreakValue();

		/**
		 * The meta object literal for the '<em><b>Refinement To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__REFINEMENT_TO = eINSTANCE.getMeasurement_RefinementTo();

		/**
		 * The meta object literal for the '<em><b>Refinement From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__REFINEMENT_FROM = eINSTANCE.getMeasurement_RefinementFrom();

		/**
		 * The meta object literal for the '<em><b>Equivalent To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__EQUIVALENT_TO = eINSTANCE.getMeasurement_EquivalentTo();

		/**
		 * The meta object literal for the '<em><b>Equivalent From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__EQUIVALENT_FROM = eINSTANCE.getMeasurement_EquivalentFrom();

		/**
		 * The meta object literal for the '<em><b>Recursive To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__RECURSIVE_TO = eINSTANCE.getMeasurement_RecursiveTo();

		/**
		 * The meta object literal for the '<em><b>Recursive From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__RECURSIVE_FROM = eINSTANCE.getMeasurement_RecursiveFrom();

		/**
		 * The meta object literal for the '<em><b>Measurement Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__MEASUREMENT_RELATIONSHIPS = eINSTANCE.getMeasurement_MeasurementRelationships();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.MeasurementRelationshipImpl <em>Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.MeasurementRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getMeasurementRelationship()
		 * @generated
		 */
		EClass MEASUREMENT_RELATIONSHIP = eINSTANCE.getMeasurementRelationship();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.NamedMeasureImpl <em>Named Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.NamedMeasureImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getNamedMeasure()
		 * @generated
		 */
		EClass NAMED_MEASURE = eINSTANCE.getNamedMeasure();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.NamedMeasurementImpl <em>Named Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.NamedMeasurementImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getNamedMeasurement()
		 * @generated
		 */
		EClass NAMED_MEASUREMENT = eINSTANCE.getNamedMeasurement();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.ObservationImpl <em>Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.ObservationImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getObservation()
		 * @generated
		 */
		EClass OBSERVATION = eINSTANCE.getObservation();

		/**
		 * The meta object literal for the '<em><b>Observer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVATION__OBSERVER = eINSTANCE.getObservation_Observer();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVATION__TOOL = eINSTANCE.getObservation_Tool();

		/**
		 * The meta object literal for the '<em><b>When Observed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVATION__WHEN_OBSERVED = eINSTANCE.getObservation_WhenObserved();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__SCOPES = eINSTANCE.getObservation_Scopes();

		/**
		 * The meta object literal for the '<em><b>Observed Measures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__OBSERVED_MEASURES = eINSTANCE.getObservation_ObservedMeasures();

		/**
		 * The meta object literal for the '<em><b>Requested Measures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__REQUESTED_MEASURES = eINSTANCE.getObservation_RequestedMeasures();

		/**
		 * The meta object literal for the '<em><b>Measurement Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__MEASUREMENT_RELATIONS = eINSTANCE.getObservation_MeasurementRelations();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__ARGUMENTS = eINSTANCE.getObservation_Arguments();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.ObservationScopeImpl <em>Observation Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.ObservationScopeImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getObservationScope()
		 * @generated
		 */
		EClass OBSERVATION_SCOPE = eINSTANCE.getObservationScope();

		/**
		 * The meta object literal for the '<em><b>Scope Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVATION_SCOPE__SCOPE_URI = eINSTANCE.getObservationScope_ScopeUri();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.ObservedMeasureImpl <em>Observed Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.ObservedMeasureImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getObservedMeasure()
		 * @generated
		 */
		EClass OBSERVED_MEASURE = eINSTANCE.getObservedMeasure();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVED_MEASURE__MEASURE = eINSTANCE.getObservedMeasure_Measure();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVED_MEASURE__MEASUREMENTS = eINSTANCE.getObservedMeasure_Measurements();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.OCLOperationImpl <em>OCL Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.OCLOperationImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getOCLOperation()
		 * @generated
		 */
		EClass OCL_OPERATION = eINSTANCE.getOCLOperation();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_OPERATION__CONTEXT = eINSTANCE.getOCLOperation_Context();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_OPERATION__BODY = eINSTANCE.getOCLOperation_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.OperationImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__LANGUAGE = eINSTANCE.getOperation_Language();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__BODY = eINSTANCE.getOperation_Body();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.RankingImpl <em>Ranking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.RankingImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRanking()
		 * @generated
		 */
		EClass RANKING = eINSTANCE.getRanking();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING__INTERVAL = eINSTANCE.getRanking_Interval();

		/**
		 * The meta object literal for the '<em><b>Ranking To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING__RANKING_TO = eINSTANCE.getRanking_RankingTo();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.RankingIntervalImpl <em>Ranking Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.RankingIntervalImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRankingInterval()
		 * @generated
		 */
		EClass RANKING_INTERVAL = eINSTANCE.getRankingInterval();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_INTERVAL__RANK = eINSTANCE.getRankingInterval_Rank();

		/**
		 * The meta object literal for the '<em><b>Maximum Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_INTERVAL__MAXIMUM_ENDPOINT = eINSTANCE.getRankingInterval_MaximumEndpoint();

		/**
		 * The meta object literal for the '<em><b>Maximum Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_INTERVAL__MAXIMUM_OPEN = eINSTANCE.getRankingInterval_MaximumOpen();

		/**
		 * The meta object literal for the '<em><b>Minimum Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_INTERVAL__MINIMUM_ENDPOINT = eINSTANCE.getRankingInterval_MinimumEndpoint();

		/**
		 * The meta object literal for the '<em><b>Minimum Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_INTERVAL__MINIMUM_OPEN = eINSTANCE.getRankingInterval_MinimumOpen();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_INTERVAL__SYMBOL = eINSTANCE.getRankingInterval_Symbol();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.RankingMeasureRelationshipImpl <em>Ranking Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.RankingMeasureRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRankingMeasureRelationship()
		 * @generated
		 */
		EClass RANKING_MEASURE_RELATIONSHIP = eINSTANCE.getRankingMeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_MEASURE_RELATIONSHIP__FROM = eINSTANCE.getRankingMeasureRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_MEASURE_RELATIONSHIP__TO = eINSTANCE.getRankingMeasureRelationship_To();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.RankingMeasurementRelationshipImpl <em>Ranking Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.RankingMeasurementRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRankingMeasurementRelationship()
		 * @generated
		 */
		EClass RANKING_MEASUREMENT_RELATIONSHIP = eINSTANCE.getRankingMeasurementRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_MEASUREMENT_RELATIONSHIP__FROM = eINSTANCE.getRankingMeasurementRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_MEASUREMENT_RELATIONSHIP__TO = eINSTANCE.getRankingMeasurementRelationship_To();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.RatioMeasureImpl <em>Ratio Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.RatioMeasureImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRatioMeasure()
		 * @generated
		 */
		EClass RATIO_MEASURE = eINSTANCE.getRatioMeasure();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.RatioMeasurementImpl <em>Ratio Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.RatioMeasurementImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRatioMeasurement()
		 * @generated
		 */
		EClass RATIO_MEASUREMENT = eINSTANCE.getRatioMeasurement();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.RecursiveMeasureRelationshipImpl <em>Recursive Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.RecursiveMeasureRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRecursiveMeasureRelationship()
		 * @generated
		 */
		EClass RECURSIVE_MEASURE_RELATIONSHIP = eINSTANCE.getRecursiveMeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURSIVE_MEASURE_RELATIONSHIP__FROM = eINSTANCE.getRecursiveMeasureRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURSIVE_MEASURE_RELATIONSHIP__TO = eINSTANCE.getRecursiveMeasureRelationship_To();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.RecursiveMeasurementRelationshipImpl <em>Recursive Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.RecursiveMeasurementRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRecursiveMeasurementRelationship()
		 * @generated
		 */
		EClass RECURSIVE_MEASUREMENT_RELATIONSHIP = eINSTANCE.getRecursiveMeasurementRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURSIVE_MEASUREMENT_RELATIONSHIP__FROM = eINSTANCE.getRecursiveMeasurementRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECURSIVE_MEASUREMENT_RELATIONSHIP__TO = eINSTANCE.getRecursiveMeasurementRelationship_To();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.RefinementMeasureRelationshipImpl <em>Refinement Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.RefinementMeasureRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRefinementMeasureRelationship()
		 * @generated
		 */
		EClass REFINEMENT_MEASURE_RELATIONSHIP = eINSTANCE.getRefinementMeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT_MEASURE_RELATIONSHIP__FROM = eINSTANCE.getRefinementMeasureRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT_MEASURE_RELATIONSHIP__TO = eINSTANCE.getRefinementMeasureRelationship_To();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.RefinementMeasurementRelationshipImpl <em>Refinement Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.RefinementMeasurementRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRefinementMeasurementRelationship()
		 * @generated
		 */
		EClass REFINEMENT_MEASUREMENT_RELATIONSHIP = eINSTANCE.getRefinementMeasurementRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT_MEASUREMENT_RELATIONSHIP__FROM = eINSTANCE.getRefinementMeasurementRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT_MEASUREMENT_RELATIONSHIP__TO = eINSTANCE.getRefinementMeasurementRelationship_To();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.RescaledMeasureImpl <em>Rescaled Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.RescaledMeasureImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRescaledMeasure()
		 * @generated
		 */
		EClass RESCALED_MEASURE = eINSTANCE.getRescaledMeasure();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESCALED_MEASURE__FORMULA = eINSTANCE.getRescaledMeasure_Formula();

		/**
		 * The meta object literal for the '<em><b>Rescale From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESCALED_MEASURE__RESCALE_FROM = eINSTANCE.getRescaledMeasure_RescaleFrom();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.RescaleMeasureRelationshipImpl <em>Rescale Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.RescaleMeasureRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRescaleMeasureRelationship()
		 * @generated
		 */
		EClass RESCALE_MEASURE_RELATIONSHIP = eINSTANCE.getRescaleMeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESCALE_MEASURE_RELATIONSHIP__TO = eINSTANCE.getRescaleMeasureRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESCALE_MEASURE_RELATIONSHIP__FROM = eINSTANCE.getRescaleMeasureRelationship_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.RescaledMeasurementImpl <em>Rescaled Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.RescaledMeasurementImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRescaledMeasurement()
		 * @generated
		 */
		EClass RESCALED_MEASUREMENT = eINSTANCE.getRescaledMeasurement();

		/**
		 * The meta object literal for the '<em><b>Is Base Supplied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESCALED_MEASUREMENT__IS_BASE_SUPPLIED = eINSTANCE.getRescaledMeasurement_IsBaseSupplied();

		/**
		 * The meta object literal for the '<em><b>Rescale From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESCALED_MEASUREMENT__RESCALE_FROM = eINSTANCE.getRescaledMeasurement_RescaleFrom();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.RescaleMeasurementRelationshipImpl <em>Rescale Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.RescaleMeasurementRelationshipImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getRescaleMeasurementRelationship()
		 * @generated
		 */
		EClass RESCALE_MEASUREMENT_RELATIONSHIP = eINSTANCE.getRescaleMeasurementRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESCALE_MEASUREMENT_RELATIONSHIP__TO = eINSTANCE.getRescaleMeasurementRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESCALE_MEASUREMENT_RELATIONSHIP__FROM = eINSTANCE.getRescaleMeasurementRelationship_From();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.ScopeImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__CLASS = eINSTANCE.getScope_Class();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__ELEMENTS = eINSTANCE.getScope_Elements();

		/**
		 * The meta object literal for the '<em><b>Recognizer Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__RECOGNIZER_QUERY = eINSTANCE.getScope_RecognizerQuery();

		/**
		 * The meta object literal for the '<em><b>Break Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__BREAK_CONDITION = eINSTANCE.getScope_BreakCondition();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.SmmElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.SmmElementImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getSmmElement()
		 * @generated
		 */
		EClass SMM_ELEMENT = eINSTANCE.getSmmElement();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMM_ELEMENT__ATTRIBUTE = eINSTANCE.getSmmElement_Attribute();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMM_ELEMENT__ANNOTATION = eINSTANCE.getSmmElement_Annotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMM_ELEMENT__NAME = eINSTANCE.getSmmElement_Name();

		/**
		 * The meta object literal for the '<em><b>Short Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMM_ELEMENT__SHORT_DESCRIPTION = eINSTANCE.getSmmElement_ShortDescription();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMM_ELEMENT__DESCRIPTION = eINSTANCE.getSmmElement_Description();

		/**
		 * The meta object literal for the '<em><b>Requested Observations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMM_ELEMENT__REQUESTED_OBSERVATIONS = eINSTANCE.getSmmElement_RequestedObservations();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.impl.SmmModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.impl.SmmModelImpl
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getSmmModel()
		 * @generated
		 */
		EClass SMM_MODEL = eINSTANCE.getSmmModel();

		/**
		 * The meta object literal for the '<em><b>Observations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMM_MODEL__OBSERVATIONS = eINSTANCE.getSmmModel_Observations();

		/**
		 * The meta object literal for the '<em><b>Librairies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMM_MODEL__LIBRAIRIES = eINSTANCE.getSmmModel_Librairies();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.SmmRelationship <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.SmmRelationship
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getSmmRelationship()
		 * @generated
		 */
		EClass SMM_RELATIONSHIP = eINSTANCE.getSmmRelationship();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.omg.smm.Accumulator <em>Accumulator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.omg.smm.Accumulator
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getAccumulator()
		 * @generated
		 */
		EEnum ACCUMULATOR = eINSTANCE.getAccumulator();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em>Timestamp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.Timestamp
		 * @see org.eclipse.modisco.omg.smm.impl.SmmPackageImpl#getTimestamp()
		 * @generated
		 */
		EDataType TIMESTAMP = eINSTANCE.getTimestamp();

	}

} //SmmPackage
