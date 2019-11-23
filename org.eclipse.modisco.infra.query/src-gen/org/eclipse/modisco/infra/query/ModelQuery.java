/**
 * Copyright (c) 2009 Mia-Software and others.
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ModelQuery is an abstract class representing a query.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.query.ModelQuery#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.ModelQuery#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.ModelQuery#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.ModelQuery#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.ModelQuery#getModelQuerySet <em>Model Query Set</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.ModelQuery#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.ModelQuery#isIsExternalContextDependent <em>Is External Context Dependent</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.ModelQuery#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.ModelQuery#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.query.QueryPackage#getModelQuery()
 * @model abstract="true"
 * @generated
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public interface ModelQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ModelQuery::name is the query name. In each query set the query names must be unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.modisco.infra.query.QueryPackage#getModelQuery_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.query.ModelQuery#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.modisco.infra.query.QueryPackage#getModelQuery_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.query.ModelQuery#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ModelQuery::returnType is an ecore::DataType representing the query return type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(EClassifier)
	 * @see org.eclipse.modisco.infra.query.QueryPackage#getModelQuery_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	EClassifier getReturnType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.query.ModelQuery#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(EClassifier value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ModelQuery::scope is the set of type on which the query is applicable. Those types are represented by ecore::DataType instances
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' reference list.
	 * @see org.eclipse.modisco.infra.query.QueryPackage#getModelQuery_Scope()
	 * @model
	 * @generated
	 */
	EList<EClass> getScope();

	/**
	 * Returns the value of the '<em><b>Model Query Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.infra.query.ModelQuerySet#getQueries <em>Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Query Set</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Query Set</em>' container reference.
	 * @see #setModelQuerySet(ModelQuerySet)
	 * @see org.eclipse.modisco.infra.query.QueryPackage#getModelQuery_ModelQuerySet()
	 * @see org.eclipse.modisco.infra.query.ModelQuerySet#getQueries
	 * @model opposite="queries" transient="false"
	 * @generated
	 */
	ModelQuerySet getModelQuerySet();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.query.ModelQuery#getModelQuerySet <em>Model Query Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Query Set</em>' container reference.
	 * @see #getModelQuerySet()
	 * @generated
	 */
	void setModelQuerySet(ModelQuerySet value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.infra.query.ModelQueryParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ModelQuery::parameters a set of ModelQueryParameter instance describing the query parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.modisco.infra.query.QueryPackage#getModelQuery_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelQueryParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Is External Context Dependent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is External Context Dependent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ModelQuery::isExternalContextDependent must be true if two evaluations of the same query with the same context and parameters can return different results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is External Context Dependent</em>' attribute.
	 * @see #setIsExternalContextDependent(boolean)
	 * @see org.eclipse.modisco.infra.query.QueryPackage#getModelQuery_IsExternalContextDependent()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsExternalContextDependent();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.query.ModelQuery#isIsExternalContextDependent <em>Is External Context Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is External Context Dependent</em>' attribute.
	 * @see #isIsExternalContextDependent()
	 * @generated
	 */
	void setIsExternalContextDependent(boolean value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see org.eclipse.modisco.infra.query.QueryPackage#getModelQuery_UpperBound()
	 * @model default="1"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.query.ModelQuery#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see org.eclipse.modisco.infra.query.QueryPackage#getModelQuery_LowerBound()
	 * @model default="0"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.query.ModelQuery#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

} // ModelQuery
