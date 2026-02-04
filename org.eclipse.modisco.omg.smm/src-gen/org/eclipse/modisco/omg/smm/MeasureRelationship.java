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
package org.eclipse.modisco.omg.smm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.MeasureRelationship#getMeasurandQuery <em>Measurand Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasureRelationship()
 * @model abstract="true"
 * @generated
 */
public interface MeasureRelationship extends SmmRelationship {
	/**
	 * Returns the value of the '<em><b>Measurand Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurand Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurand Query</em>' reference.
	 * @see #setMeasurandQuery(Operation)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasureRelationship_MeasurandQuery()
	 * @model
	 * @generated
	 */
	Operation getMeasurandQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.MeasureRelationship#getMeasurandQuery <em>Measurand Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurand Query</em>' reference.
	 * @see #getMeasurandQuery()
	 * @generated
	 */
	void setMeasurandQuery(Operation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Measure getTo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Measure getFrom();

} // MeasureRelationship
