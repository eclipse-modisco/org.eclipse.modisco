/**
 * Copyright (c) 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.omg.smm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observed Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.ObservedMeasure#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.ObservedMeasure#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getObservedMeasure()
 * @model
 * @generated
 */
public interface ObservedMeasure extends SmmRelationship {
	/**
	 * Returns the value of the '<em><b>Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' reference.
	 * @see #setMeasure(Measure)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getObservedMeasure_Measure()
	 * @model required="true"
	 * @generated
	 */
	Measure getMeasure();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.ObservedMeasure#getMeasure <em>Measure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(Measure value);

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.Measurement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getObservedMeasure_Measurements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Measurement> getMeasurements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<EObject> getMeasureRefimentsObservedMeasures();

} // ObservedMeasure
