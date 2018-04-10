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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refinement Measurement Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getRefinementMeasurementRelationship()
 * @model
 * @generated
 */
public interface RefinementMeasurementRelationship extends MeasurementRelationship {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.Measurement#getRefinementTo <em>Refinement To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Measurement)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getRefinementMeasurementRelationship_From()
	 * @see org.eclipse.modisco.omg.smm.Measurement#getRefinementTo
	 * @model opposite="refinementTo" required="true"
	 * @generated
	 */
	Measurement getFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Measurement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.Measurement#getRefinementFrom <em>Refinement From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Measurement)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getRefinementMeasurementRelationship_To()
	 * @see org.eclipse.modisco.omg.smm.Measurement#getRefinementFrom
	 * @model opposite="refinementFrom" required="true"
	 * @generated
	 */
	Measurement getTo();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Measurement value);

} // RefinementMeasurementRelationship
