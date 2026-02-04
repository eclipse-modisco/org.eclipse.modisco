/**
 * *******************************************************************************
 * Copyright (c) 2008, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.event;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.omg.kdm.action.ActionElement;
import org.eclipse.modisco.omg.kdm.code.AbstractCodeElement;
import org.eclipse.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.modisco.omg.kdm.source.SourceRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Event Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.event.AbstractEventElement#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.event.AbstractEventElement#getEventRelation <em>Event Relation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.event.AbstractEventElement#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.event.AbstractEventElement#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.event.EventPackage#getAbstractEventElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractEventElement extends KDMEntity {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.source.SourceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.event.EventPackage#getAbstractEventElement_Source()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceRef> getSource();

	/**
	 * Returns the value of the '<em><b>Event Relation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.event.AbstractEventRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Relation</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.event.EventPackage#getAbstractEventElement_EventRelation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractEventRelationship> getEventRelation();

	/**
	 * Returns the value of the '<em><b>Abstraction</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.action.ActionElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstraction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstraction</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.event.EventPackage#getAbstractEventElement_Abstraction()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionElement> getAbstraction();

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.code.AbstractCodeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference list.
	 * @see org.eclipse.modisco.omg.kdm.event.EventPackage#getAbstractEventElement_Implementation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AbstractCodeElement> getImplementation();

} // AbstractEventElement
