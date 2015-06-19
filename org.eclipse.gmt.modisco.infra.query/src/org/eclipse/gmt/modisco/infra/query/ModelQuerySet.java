/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - meta-model design
 *     Gregoire DUPE (Mia-Software) - design and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.infra.query;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Query Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ModelQuerySet is the root of query model. One root per query model is expected.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.infra.query.ModelQuerySet#getAssociatedMetamodels <em>Associated Metamodels</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.query.ModelQuerySet#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.query.ModelQuerySet#isIsEditable <em>Is Editable</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.query.ModelQuerySet#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.query.ModelQuerySet#getQueries <em>Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.infra.query.QueryPackage#getModelQuerySet()
 * @model
 * @generated
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public interface ModelQuerySet extends EObject {
	/**
	 * Returns the value of the '<em><b>Associated Metamodels</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Metamodels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ModelQuerySet::associatedMetamodels points to the meta-models used by the contained queries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Associated Metamodels</em>' reference list.
	 * @see org.eclipse.gmt.modisco.infra.query.QueryPackage#getModelQuerySet_AssociatedMetamodels()
	 * @model
	 * @generated
	 */
	EList<EPackage> getAssociatedMetamodels();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ModelQuerySet::name must be unique (in the Eclipse platform) and equal to the containing file name. We recommend to use a name prefix with a name space, for example: org.eclipse.gmt.modisco.example1.querySet1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gmt.modisco.infra.query.QueryPackage#getModelQuerySet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.infra.query.ModelQuerySet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ModelQuerySet::isEditable is true if the query can be edited. If the query is stored into a compiled file ModelQuerySet::isEditable is false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Editable</em>' attribute.
	 * @see #setIsEditable(boolean)
	 * @see org.eclipse.gmt.modisco.infra.query.QueryPackage#getModelQuerySet_IsEditable()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsEditable();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.infra.query.ModelQuerySet#isIsEditable <em>Is Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Editable</em>' attribute.
	 * @see #isIsEditable()
	 * @generated
	 */
	void setIsEditable(boolean value);

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
	 * @see org.eclipse.gmt.modisco.infra.query.QueryPackage#getModelQuerySet_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.infra.query.ModelQuerySet#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.infra.query.ModelQuery}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.infra.query.ModelQuery#getModelQuerySet <em>Model Query Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ModelQuerySet::queries refers to the contained queries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queries</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.infra.query.QueryPackage#getModelQuerySet_Queries()
	 * @see org.eclipse.gmt.modisco.infra.query.ModelQuery#getModelQuerySet
	 * @model opposite="modelQuerySet" containment="true"
	 * @generated
	 */
	EList<ModelQuery> getQueries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ModelQuerySet::getQuery(EString) returns the contained ModelQuery having the requested name.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	ModelQuery getQuery(String name);

} // ModelQuerySet
