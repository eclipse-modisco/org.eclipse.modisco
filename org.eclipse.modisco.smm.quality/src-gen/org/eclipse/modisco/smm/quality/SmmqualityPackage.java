/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.smm.quality;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.modisco.omg.smm.SmmPackage;

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
 * @see org.eclipse.modisco.smm.quality.SmmqualityFactory
 * @model kind="package"
 * @generated
 */
public interface SmmqualityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smmquality";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/SMMQuality/0.9/smmquality";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smmquality";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmmqualityPackage eINSTANCE = org.eclipse.modisco.smm.quality.impl.SmmqualityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.smm.quality.impl.QualityScopeImpl <em>Quality Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.smm.quality.impl.QualityScopeImpl
	 * @see org.eclipse.modisco.smm.quality.impl.SmmqualityPackageImpl#getQualityScope()
	 * @generated
	 */
	int QUALITY_SCOPE = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCOPE__ATTRIBUTE = SmmPackage.SCOPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCOPE__ANNOTATION = SmmPackage.SCOPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCOPE__NAME = SmmPackage.SCOPE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCOPE__SHORT_DESCRIPTION = SmmPackage.SCOPE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCOPE__DESCRIPTION = SmmPackage.SCOPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCOPE__REQUESTED_OBSERVATIONS = SmmPackage.SCOPE__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCOPE__IN_CATEGORY = SmmPackage.SCOPE__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCOPE__CLASS = SmmPackage.SCOPE__CLASS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCOPE__ELEMENTS = SmmPackage.SCOPE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Recognizer Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCOPE__RECOGNIZER_QUERY = SmmPackage.SCOPE__RECOGNIZER_QUERY;

	/**
	 * The feature id for the '<em><b>Break Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCOPE__BREAK_CONDITION = SmmPackage.SCOPE__BREAK_CONDITION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCOPE__CHILDREN = SmmPackage.SCOPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCOPE__PARENT = SmmPackage.SCOPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quality Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCOPE_FEATURE_COUNT = SmmPackage.SCOPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.smm.quality.impl.MeasurandImpl <em>Measurand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.smm.quality.impl.MeasurandImpl
	 * @see org.eclipse.modisco.smm.quality.impl.SmmqualityPackageImpl#getMeasurand()
	 * @generated
	 */
	int MEASURAND = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURAND__ATTRIBUTE = SmmPackage.ABSTRACT_MEASURE_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURAND__ANNOTATION = SmmPackage.ABSTRACT_MEASURE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURAND__NAME = SmmPackage.ABSTRACT_MEASURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURAND__SHORT_DESCRIPTION = SmmPackage.ABSTRACT_MEASURE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURAND__DESCRIPTION = SmmPackage.ABSTRACT_MEASURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requested Observations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURAND__REQUESTED_OBSERVATIONS = SmmPackage.ABSTRACT_MEASURE_ELEMENT__REQUESTED_OBSERVATIONS;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURAND__IN_CATEGORY = SmmPackage.ABSTRACT_MEASURE_ELEMENT__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURAND__QUALIFIED_NAME = SmmPackage.ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURAND__PATH = SmmPackage.ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Measurand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURAND_FEATURE_COUNT = SmmPackage.ABSTRACT_MEASURE_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.smm.quality.QualityScope <em>Quality Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Scope</em>'.
	 * @see org.eclipse.modisco.smm.quality.QualityScope
	 * @generated
	 */
	EClass getQualityScope();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.smm.quality.QualityScope#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.eclipse.modisco.smm.quality.QualityScope#getChildren()
	 * @see #getQualityScope()
	 * @generated
	 */
	EReference getQualityScope_Children();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.smm.quality.QualityScope#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.eclipse.modisco.smm.quality.QualityScope#getParent()
	 * @see #getQualityScope()
	 * @generated
	 */
	EReference getQualityScope_Parent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.smm.quality.Measurand <em>Measurand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurand</em>'.
	 * @see org.eclipse.modisco.smm.quality.Measurand
	 * @generated
	 */
	EClass getMeasurand();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.smm.quality.Measurand#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see org.eclipse.modisco.smm.quality.Measurand#getQualifiedName()
	 * @see #getMeasurand()
	 * @generated
	 */
	EAttribute getMeasurand_QualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.smm.quality.Measurand#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.eclipse.modisco.smm.quality.Measurand#getPath()
	 * @see #getMeasurand()
	 * @generated
	 */
	EAttribute getMeasurand_Path();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmmqualityFactory getSmmqualityFactory();

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
		 * The meta object literal for the '{@link org.eclipse.modisco.smm.quality.impl.QualityScopeImpl <em>Quality Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.smm.quality.impl.QualityScopeImpl
		 * @see org.eclipse.modisco.smm.quality.impl.SmmqualityPackageImpl#getQualityScope()
		 * @generated
		 */
		EClass QUALITY_SCOPE = eINSTANCE.getQualityScope();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_SCOPE__CHILDREN = eINSTANCE.getQualityScope_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_SCOPE__PARENT = eINSTANCE.getQualityScope_Parent();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.smm.quality.impl.MeasurandImpl <em>Measurand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.smm.quality.impl.MeasurandImpl
		 * @see org.eclipse.modisco.smm.quality.impl.SmmqualityPackageImpl#getMeasurand()
		 * @generated
		 */
		EClass MEASURAND = eINSTANCE.getMeasurand();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURAND__QUALIFIED_NAME = eINSTANCE.getMeasurand_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURAND__PATH = eINSTANCE.getMeasurand_Path();

	}

} //SmmqualityPackage
