/**
 * *******************************************************************************
 * Copyright (c) 2008 Castor Technologies Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Alain Picard (Castor Technologies Inc) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.smm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Measurement#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Measurement#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Measurement#getError <em>Error</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Measurement#getOutMeasurement <em>Out Measurement</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Measurement#getInMeasurement <em>In Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasurement()
 * @model abstract="true"
 * @generated
 */
public interface Measurement extends SmmElement {
	/**
	 * Returns the value of the '<em><b>Measure</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.Measure#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' reference.
	 * @see #setMeasure(Measure)
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasurement_Measure()
	 * @see org.eclipse.gmt.modisco.omg.smm.Measure#getMeasurement
	 * @model opposite="measurement" required="true"
	 * @generated
	 */
	Measure getMeasure();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.Measurement#getMeasure <em>Measure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(Measure value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation</em>' reference.
	 * @see #setObservation(Observation)
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasurement_Observation()
	 * @model required="true"
	 * @generated
	 */
	Observation getObservation();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.Measurement#getObservation <em>Observation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation</em>' reference.
	 * @see #getObservation()
	 * @generated
	 */
	void setObservation(Observation value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' attribute.
	 * @see #setError(String)
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasurement_Error()
	 * @model
	 * @generated
	 */
	String getError();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.Measurement#getError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' attribute.
	 * @see #getError()
	 * @generated
	 */
	void setError(String value);

	/**
	 * Returns the value of the '<em><b>Out Measurement</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.smm.MeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.MeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Measurement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Measurement</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasurement_OutMeasurement()
	 * @see org.eclipse.gmt.modisco.omg.smm.MeasurementRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<MeasurementRelationship> getOutMeasurement();

	/**
	 * Returns the value of the '<em><b>In Measurement</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.smm.MeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.MeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Measurement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Measurement</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getMeasurement_InMeasurement()
	 * @see org.eclipse.gmt.modisco.omg.smm.MeasurementRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<MeasurementRelationship> getInMeasurement();

} // Measurement
