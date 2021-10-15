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
 * A representation of the model object '<em><b>Rescale Measurement Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.RescaleMeasurementRelationship#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.RescaleMeasurementRelationship#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getRescaleMeasurementRelationship()
 * @model
 * @generated
 */
public interface RescaleMeasurementRelationship extends MeasurementRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.RescaledMeasurement#getRescaleFrom <em>Rescale From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(RescaledMeasurement)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getRescaleMeasurementRelationship_To()
	 * @see org.eclipse.modisco.omg.smm.RescaledMeasurement#getRescaleFrom
	 * @model opposite="rescaleFrom" required="true"
	 * @generated
	 */
	RescaledMeasurement getTo();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.RescaleMeasurementRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(RescaledMeasurement value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.DimensionalMeasurement#getRescaleTo <em>Rescale To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(DimensionalMeasurement)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getRescaleMeasurementRelationship_From()
	 * @see org.eclipse.modisco.omg.smm.DimensionalMeasurement#getRescaleTo
	 * @model opposite="rescaleTo" required="true"
	 * @generated
	 */
	DimensionalMeasurement getFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.RescaleMeasurementRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(DimensionalMeasurement value);

} // RescaleMeasurementRelationship
