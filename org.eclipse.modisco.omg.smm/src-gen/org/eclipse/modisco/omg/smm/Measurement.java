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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measurement#getError <em>Error</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measurement#getMeasurand <em>Measurand</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measurement#getBreakValue <em>Break Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measurement#getRefinementTo <em>Refinement To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measurement#getRefinementFrom <em>Refinement From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measurement#getEquivalentTo <em>Equivalent To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measurement#getEquivalentFrom <em>Equivalent From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measurement#getRecursiveTo <em>Recursive To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measurement#getRecursiveFrom <em>Recursive From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Measurement#getMeasurementRelationships <em>Measurement Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasurement()
 * @model abstract="true"
 * @generated
 */
public interface Measurement extends SmmElement {
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
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasurement_Error()
	 * @model
	 * @generated
	 */
	String getError();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Measurement#getError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' attribute.
	 * @see #getError()
	 * @generated
	 */
	void setError(String value);

	/**
	 * Returns the value of the '<em><b>Measurand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurand</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurand</em>' reference.
	 * @see #setMeasurand(EObject)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasurement_Measurand()
	 * @model
	 * @generated
	 */
	EObject getMeasurand();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Measurement#getMeasurand <em>Measurand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurand</em>' reference.
	 * @see #getMeasurand()
	 * @generated
	 */
	void setMeasurand(EObject value);

	/**
	 * Returns the value of the '<em><b>Break Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Break Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break Value</em>' attribute.
	 * @see #setBreakValue(String)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasurement_BreakValue()
	 * @model
	 * @generated
	 */
	String getBreakValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Measurement#getBreakValue <em>Break Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Break Value</em>' attribute.
	 * @see #getBreakValue()
	 * @generated
	 */
	void setBreakValue(String value);

	/**
	 * Returns the value of the '<em><b>Refinement To</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement To</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasurement_RefinementTo()
	 * @see org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<RefinementMeasurementRelationship> getRefinementTo();

	/**
	 * Returns the value of the '<em><b>Refinement From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement From</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasurement_RefinementFrom()
	 * @see org.eclipse.modisco.omg.smm.RefinementMeasurementRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<RefinementMeasurementRelationship> getRefinementFrom();

	/**
	 * Returns the value of the '<em><b>Equivalent To</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.EquivalentMeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.EquivalentMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent To</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasurement_EquivalentTo()
	 * @see org.eclipse.modisco.omg.smm.EquivalentMeasurementRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<EquivalentMeasurementRelationship> getEquivalentTo();

	/**
	 * Returns the value of the '<em><b>Equivalent From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.EquivalentMeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.EquivalentMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent From</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasurement_EquivalentFrom()
	 * @see org.eclipse.modisco.omg.smm.EquivalentMeasurementRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<EquivalentMeasurementRelationship> getEquivalentFrom();

	/**
	 * Returns the value of the '<em><b>Recursive To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.RecursiveMeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recursive To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursive To</em>' reference.
	 * @see #setRecursiveTo(RecursiveMeasurementRelationship)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasurement_RecursiveTo()
	 * @see org.eclipse.modisco.omg.smm.RecursiveMeasurementRelationship#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	RecursiveMeasurementRelationship getRecursiveTo();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Measurement#getRecursiveTo <em>Recursive To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recursive To</em>' reference.
	 * @see #getRecursiveTo()
	 * @generated
	 */
	void setRecursiveTo(RecursiveMeasurementRelationship value);

	/**
	 * Returns the value of the '<em><b>Recursive From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.RecursiveMeasurementRelationship}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.RecursiveMeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recursive From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursive From</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasurement_RecursiveFrom()
	 * @see org.eclipse.modisco.omg.smm.RecursiveMeasurementRelationship#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<RecursiveMeasurementRelationship> getRecursiveFrom();

	/**
	 * Returns the value of the '<em><b>Measurement Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.MeasurementRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Relationships</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getMeasurement_MeasurementRelationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeasurementRelationship> getMeasurementRelationships();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getMeasureLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getMeasurementLabel();

} // Measurement
