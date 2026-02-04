/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - meta-model design
 *     Gregoire DUPE (Mia-Software) - design and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.query;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclipse.modisco.infra.query.QueryFactory
 * @model kind="package"
 * @generated
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public interface QueryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "query"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/infra/query/0.8.incubation"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "query"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryPackage eINSTANCE = org.eclipse.modisco.infra.query.impl.QueryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.query.impl.ModelQuerySetImpl <em>Model Query Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.query.impl.ModelQuerySetImpl
	 * @see org.eclipse.modisco.infra.query.impl.QueryPackageImpl#getModelQuerySet()
	 * @generated
	 */
	int MODEL_QUERY_SET = 0;

	/**
	 * The feature id for the '<em><b>Associated Metamodels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_SET__ASSOCIATED_METAMODELS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_SET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_SET__IS_EDITABLE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_SET__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_SET__QUERIES = 4;

	/**
	 * The number of structural features of the '<em>Model Query Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_SET_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.query.impl.ModelQueryImpl <em>Model Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.query.impl.ModelQueryImpl
	 * @see org.eclipse.modisco.infra.query.impl.QueryPackageImpl#getModelQuery()
	 * @generated
	 */
	int MODEL_QUERY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__RETURN_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__SCOPE = 3;

	/**
	 * The feature id for the '<em><b>Model Query Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__MODEL_QUERY_SET = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__PARAMETERS = 5;

	/**
	 * The feature id for the '<em><b>Is External Context Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__IS_EXTERNAL_CONTEXT_DEPENDENT = 6;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__UPPER_BOUND = 7;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY__LOWER_BOUND = 8;

	/**
	 * The number of structural features of the '<em>Model Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.query.impl.JavaModelQueryImpl <em>Java Model Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.query.impl.JavaModelQueryImpl
	 * @see org.eclipse.modisco.infra.query.impl.QueryPackageImpl#getJavaModelQuery()
	 * @generated
	 */
	int JAVA_MODEL_QUERY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MODEL_QUERY__NAME = MODEL_QUERY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MODEL_QUERY__DESCRIPTION = MODEL_QUERY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MODEL_QUERY__RETURN_TYPE = MODEL_QUERY__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MODEL_QUERY__SCOPE = MODEL_QUERY__SCOPE;

	/**
	 * The feature id for the '<em><b>Model Query Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MODEL_QUERY__MODEL_QUERY_SET = MODEL_QUERY__MODEL_QUERY_SET;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MODEL_QUERY__PARAMETERS = MODEL_QUERY__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Is External Context Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MODEL_QUERY__IS_EXTERNAL_CONTEXT_DEPENDENT = MODEL_QUERY__IS_EXTERNAL_CONTEXT_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MODEL_QUERY__UPPER_BOUND = MODEL_QUERY__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MODEL_QUERY__LOWER_BOUND = MODEL_QUERY__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Implementation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MODEL_QUERY__IMPLEMENTATION_CLASS_NAME = MODEL_QUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Model Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_MODEL_QUERY_FEATURE_COUNT = MODEL_QUERY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.query.impl.ModelQueryParameterImpl <em>Model Query Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.query.impl.ModelQueryParameterImpl
	 * @see org.eclipse.modisco.infra.query.impl.QueryPackageImpl#getModelQueryParameter()
	 * @generated
	 */
	int MODEL_QUERY_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_PARAMETER__UPPER_BOUND = 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_PARAMETER__LOWER_BOUND = 3;

	/**
	 * The number of structural features of the '<em>Model Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_QUERY_PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.query.impl.OCLModelQueryImpl <em>OCL Model Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.query.impl.OCLModelQueryImpl
	 * @see org.eclipse.modisco.infra.query.impl.QueryPackageImpl#getOCLModelQuery()
	 * @generated
	 */
	int OCL_MODEL_QUERY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_QUERY__NAME = MODEL_QUERY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_QUERY__DESCRIPTION = MODEL_QUERY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_QUERY__RETURN_TYPE = MODEL_QUERY__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_QUERY__SCOPE = MODEL_QUERY__SCOPE;

	/**
	 * The feature id for the '<em><b>Model Query Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_QUERY__MODEL_QUERY_SET = MODEL_QUERY__MODEL_QUERY_SET;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_QUERY__PARAMETERS = MODEL_QUERY__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Is External Context Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_QUERY__IS_EXTERNAL_CONTEXT_DEPENDENT = MODEL_QUERY__IS_EXTERNAL_CONTEXT_DEPENDENT;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_QUERY__UPPER_BOUND = MODEL_QUERY__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_QUERY__LOWER_BOUND = MODEL_QUERY__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_QUERY__QUERY = MODEL_QUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Model Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_QUERY_FEATURE_COUNT = MODEL_QUERY_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.query.ModelQuerySet <em>Model Query Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Query Set</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQuerySet
	 * @generated
	 */
	EClass getModelQuerySet();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.infra.query.ModelQuerySet#getAssociatedMetamodels <em>Associated Metamodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associated Metamodels</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQuerySet#getAssociatedMetamodels()
	 * @see #getModelQuerySet()
	 * @generated
	 */
	EReference getModelQuerySet_AssociatedMetamodels();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.query.ModelQuerySet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQuerySet#getName()
	 * @see #getModelQuerySet()
	 * @generated
	 */
	EAttribute getModelQuerySet_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.query.ModelQuerySet#isIsEditable <em>Is Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Editable</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQuerySet#isIsEditable()
	 * @see #getModelQuerySet()
	 * @generated
	 */
	EAttribute getModelQuerySet_IsEditable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.query.ModelQuerySet#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQuerySet#getDescription()
	 * @see #getModelQuerySet()
	 * @generated
	 */
	EAttribute getModelQuerySet_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.query.ModelQuerySet#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queries</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQuerySet#getQueries()
	 * @see #getModelQuerySet()
	 * @generated
	 */
	EReference getModelQuerySet_Queries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.query.ModelQuery <em>Model Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Query</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQuery
	 * @generated
	 */
	EClass getModelQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.query.ModelQuery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQuery#getName()
	 * @see #getModelQuery()
	 * @generated
	 */
	EAttribute getModelQuery_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.query.ModelQuery#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQuery#getDescription()
	 * @see #getModelQuery()
	 * @generated
	 */
	EAttribute getModelQuery_Description();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.infra.query.ModelQuery#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQuery#getReturnType()
	 * @see #getModelQuery()
	 * @generated
	 */
	EReference getModelQuery_ReturnType();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.infra.query.ModelQuery#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scope</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQuery#getScope()
	 * @see #getModelQuery()
	 * @generated
	 */
	EReference getModelQuery_Scope();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.modisco.infra.query.ModelQuery#getModelQuerySet <em>Model Query Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model Query Set</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQuery#getModelQuerySet()
	 * @see #getModelQuery()
	 * @generated
	 */
	EReference getModelQuery_ModelQuerySet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.query.ModelQuery#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQuery#getParameters()
	 * @see #getModelQuery()
	 * @generated
	 */
	EReference getModelQuery_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.query.ModelQuery#isIsExternalContextDependent <em>Is External Context Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is External Context Dependent</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQuery#isIsExternalContextDependent()
	 * @see #getModelQuery()
	 * @generated
	 */
	EAttribute getModelQuery_IsExternalContextDependent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.query.ModelQuery#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQuery#getUpperBound()
	 * @see #getModelQuery()
	 * @generated
	 */
	EAttribute getModelQuery_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.query.ModelQuery#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQuery#getLowerBound()
	 * @see #getModelQuery()
	 * @generated
	 */
	EAttribute getModelQuery_LowerBound();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.query.JavaModelQuery <em>Java Model Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Model Query</em>'.
	 * @see org.eclipse.modisco.infra.query.JavaModelQuery
	 * @generated
	 */
	EClass getJavaModelQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.query.JavaModelQuery#getImplementationClassName <em>Implementation Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Class Name</em>'.
	 * @see org.eclipse.modisco.infra.query.JavaModelQuery#getImplementationClassName()
	 * @see #getJavaModelQuery()
	 * @generated
	 */
	EAttribute getJavaModelQuery_ImplementationClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.query.ModelQueryParameter <em>Model Query Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Query Parameter</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQueryParameter
	 * @generated
	 */
	EClass getModelQueryParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.query.ModelQueryParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQueryParameter#getName()
	 * @see #getModelQueryParameter()
	 * @generated
	 */
	EAttribute getModelQueryParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.infra.query.ModelQueryParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQueryParameter#getType()
	 * @see #getModelQueryParameter()
	 * @generated
	 */
	EReference getModelQueryParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.query.ModelQueryParameter#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQueryParameter#getUpperBound()
	 * @see #getModelQueryParameter()
	 * @generated
	 */
	EAttribute getModelQueryParameter_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.query.ModelQueryParameter#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.eclipse.modisco.infra.query.ModelQueryParameter#getLowerBound()
	 * @see #getModelQueryParameter()
	 * @generated
	 */
	EAttribute getModelQueryParameter_LowerBound();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.query.OCLModelQuery <em>OCL Model Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Model Query</em>'.
	 * @see org.eclipse.modisco.infra.query.OCLModelQuery
	 * @generated
	 */
	EClass getOCLModelQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.query.OCLModelQuery#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.eclipse.modisco.infra.query.OCLModelQuery#getQuery()
	 * @see #getOCLModelQuery()
	 * @generated
	 */
	EAttribute getOCLModelQuery_Query();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QueryFactory getQueryFactory();

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
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.query.impl.ModelQuerySetImpl <em>Model Query Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.query.impl.ModelQuerySetImpl
		 * @see org.eclipse.modisco.infra.query.impl.QueryPackageImpl#getModelQuerySet()
		 * @generated
		 */
		EClass MODEL_QUERY_SET = eINSTANCE.getModelQuerySet();

		/**
		 * The meta object literal for the '<em><b>Associated Metamodels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_QUERY_SET__ASSOCIATED_METAMODELS = eINSTANCE.getModelQuerySet_AssociatedMetamodels();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY_SET__NAME = eINSTANCE.getModelQuerySet_Name();

		/**
		 * The meta object literal for the '<em><b>Is Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY_SET__IS_EDITABLE = eINSTANCE.getModelQuerySet_IsEditable();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY_SET__DESCRIPTION = eINSTANCE.getModelQuerySet_Description();

		/**
		 * The meta object literal for the '<em><b>Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_QUERY_SET__QUERIES = eINSTANCE.getModelQuerySet_Queries();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.query.impl.ModelQueryImpl <em>Model Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.query.impl.ModelQueryImpl
		 * @see org.eclipse.modisco.infra.query.impl.QueryPackageImpl#getModelQuery()
		 * @generated
		 */
		EClass MODEL_QUERY = eINSTANCE.getModelQuery();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY__NAME = eINSTANCE.getModelQuery_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY__DESCRIPTION = eINSTANCE.getModelQuery_Description();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_QUERY__RETURN_TYPE = eINSTANCE.getModelQuery_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_QUERY__SCOPE = eINSTANCE.getModelQuery_Scope();

		/**
		 * The meta object literal for the '<em><b>Model Query Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_QUERY__MODEL_QUERY_SET = eINSTANCE.getModelQuery_ModelQuerySet();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_QUERY__PARAMETERS = eINSTANCE.getModelQuery_Parameters();

		/**
		 * The meta object literal for the '<em><b>Is External Context Dependent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY__IS_EXTERNAL_CONTEXT_DEPENDENT = eINSTANCE.getModelQuery_IsExternalContextDependent();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY__UPPER_BOUND = eINSTANCE.getModelQuery_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY__LOWER_BOUND = eINSTANCE.getModelQuery_LowerBound();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.query.impl.JavaModelQueryImpl <em>Java Model Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.query.impl.JavaModelQueryImpl
		 * @see org.eclipse.modisco.infra.query.impl.QueryPackageImpl#getJavaModelQuery()
		 * @generated
		 */
		EClass JAVA_MODEL_QUERY = eINSTANCE.getJavaModelQuery();

		/**
		 * The meta object literal for the '<em><b>Implementation Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_MODEL_QUERY__IMPLEMENTATION_CLASS_NAME = eINSTANCE.getJavaModelQuery_ImplementationClassName();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.query.impl.ModelQueryParameterImpl <em>Model Query Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.query.impl.ModelQueryParameterImpl
		 * @see org.eclipse.modisco.infra.query.impl.QueryPackageImpl#getModelQueryParameter()
		 * @generated
		 */
		EClass MODEL_QUERY_PARAMETER = eINSTANCE.getModelQueryParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY_PARAMETER__NAME = eINSTANCE.getModelQueryParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_QUERY_PARAMETER__TYPE = eINSTANCE.getModelQueryParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY_PARAMETER__UPPER_BOUND = eINSTANCE.getModelQueryParameter_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_QUERY_PARAMETER__LOWER_BOUND = eINSTANCE.getModelQueryParameter_LowerBound();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.query.impl.OCLModelQueryImpl <em>OCL Model Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.query.impl.OCLModelQueryImpl
		 * @see org.eclipse.modisco.infra.query.impl.QueryPackageImpl#getOCLModelQuery()
		 * @generated
		 */
		EClass OCL_MODEL_QUERY = eINSTANCE.getOCLModelQuery();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_MODEL_QUERY__QUERY = eINSTANCE.getOCLModelQuery_Query();

	}

} //QueryPackage
