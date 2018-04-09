/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.conceptual;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.omg.kdm.action.ActionElement;
import org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.gmt.modisco.omg.kdm.source.SourceRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Conceptual Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.conceptual.AbstractConceptualElement#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.conceptual.AbstractConceptualElement#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.conceptual.AbstractConceptualElement#getConceptualRelation <em>Conceptual Relation</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.conceptual.AbstractConceptualElement#getAbstraction <em>Abstraction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualPackage#getAbstractConceptualElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractConceptualElement extends KDMEntity {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.source.SourceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualPackage#getAbstractConceptualElement_Source()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceRef> getSource();

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.core.KDMEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualPackage#getAbstractConceptualElement_Implementation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<KDMEntity> getImplementation();

	/**
	 * Returns the value of the '<em><b>Conceptual Relation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.conceptual.AbstractConceptualRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conceptual Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conceptual Relation</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualPackage#getAbstractConceptualElement_ConceptualRelation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractConceptualRelationship> getConceptualRelation();

	/**
	 * Returns the value of the '<em><b>Abstraction</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.action.ActionElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstraction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstraction</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualPackage#getAbstractConceptualElement_Abstraction()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ActionElement> getAbstraction();

} // AbstractConceptualElement
