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
package org.eclipse.modisco.omg.kdm.structure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.omg.kdm.core.AggregatedRelationship;
import org.eclipse.modisco.omg.kdm.core.KDMEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Structure Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.structure.AbstractStructureElement#getAggregated <em>Aggregated</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.structure.AbstractStructureElement#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.structure.AbstractStructureElement#getStructureElement <em>Structure Element</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.structure.AbstractStructureElement#getStructureRelationship <em>Structure Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.structure.StructurePackage#getAbstractStructureElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractStructureElement extends KDMEntity {
	/**
	 * Returns the value of the '<em><b>Aggregated</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.core.AggregatedRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregated</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.structure.StructurePackage#getAbstractStructureElement_Aggregated()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AggregatedRelationship> getAggregated();

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.core.KDMEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference list.
	 * @see org.eclipse.modisco.omg.kdm.structure.StructurePackage#getAbstractStructureElement_Implementation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<KDMEntity> getImplementation();

	/**
	 * Returns the value of the '<em><b>Structure Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.structure.AbstractStructureElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Element</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.structure.StructurePackage#getAbstractStructureElement_StructureElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractStructureElement> getStructureElement();

	/**
	 * Returns the value of the '<em><b>Structure Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.structure.AbstractStructureRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Relationship</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.structure.StructurePackage#getAbstractStructureElement_StructureRelationship()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AbstractStructureRelationship> getStructureRelationship();

} // AbstractStructureElement
