/**
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.query.jxpath;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.modisco.infra.query.QueryPackage;

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
 * @see org.eclipse.modisco.infra.query.jxpath.JxpathFactory
 * @model kind="package"
 * @generated
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public interface JxpathPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jxpath"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/infra/query/jxpath/0.8.incubation"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jxpath"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JxpathPackage eINSTANCE = org.eclipse.modisco.infra.query.jxpath.impl.JxpathPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.query.jxpath.impl.JXPathModelQueryImpl <em>JX Path Model Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.query.jxpath.impl.JXPathModelQueryImpl
	 * @see org.eclipse.modisco.infra.query.jxpath.impl.JxpathPackageImpl#getJXPathModelQuery()
	 * @generated
	 */
	int JX_PATH_MODEL_QUERY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JX_PATH_MODEL_QUERY__NAME = QueryPackage.MODEL_QUERY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JX_PATH_MODEL_QUERY__DESCRIPTION = QueryPackage.MODEL_QUERY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JX_PATH_MODEL_QUERY__RETURN_TYPE = QueryPackage.MODEL_QUERY__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JX_PATH_MODEL_QUERY__SCOPE = QueryPackage.MODEL_QUERY__SCOPE;

	/**
	 * The feature id for the '<em><b>Model Query Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JX_PATH_MODEL_QUERY__MODEL_QUERY_SET = QueryPackage.MODEL_QUERY__MODEL_QUERY_SET;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JX_PATH_MODEL_QUERY__PARAMETERS = QueryPackage.MODEL_QUERY__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Is External Context Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JX_PATH_MODEL_QUERY__IS_EXTERNAL_CONTEXT_DEPENDENT = QueryPackage.MODEL_QUERY__IS_EXTERNAL_CONTEXT_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JX_PATH_MODEL_QUERY__UPPER_BOUND = QueryPackage.MODEL_QUERY__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JX_PATH_MODEL_QUERY__LOWER_BOUND = QueryPackage.MODEL_QUERY__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JX_PATH_MODEL_QUERY__QUERY = QueryPackage.MODEL_QUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JX Path Model Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JX_PATH_MODEL_QUERY_FEATURE_COUNT = QueryPackage.MODEL_QUERY_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.query.jxpath.JXPathModelQuery <em>JX Path Model Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JX Path Model Query</em>'.
	 * @see org.eclipse.modisco.infra.query.jxpath.JXPathModelQuery
	 * @generated
	 */
	EClass getJXPathModelQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.query.jxpath.JXPathModelQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.eclipse.modisco.infra.query.jxpath.JXPathModelQuery#getQuery()
	 * @see #getJXPathModelQuery()
	 * @generated
	 */
	EAttribute getJXPathModelQuery_Query();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JxpathFactory getJxpathFactory();

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
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.query.jxpath.impl.JXPathModelQueryImpl <em>JX Path Model Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.query.jxpath.impl.JXPathModelQueryImpl
		 * @see org.eclipse.modisco.infra.query.jxpath.impl.JxpathPackageImpl#getJXPathModelQuery()
		 * @generated
		 */
		EClass JX_PATH_MODEL_QUERY = eINSTANCE.getJXPathModelQuery();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JX_PATH_MODEL_QUERY__QUERY = eINSTANCE.getJXPathModelQuery_Query();

	}

} //JxpathPackage
