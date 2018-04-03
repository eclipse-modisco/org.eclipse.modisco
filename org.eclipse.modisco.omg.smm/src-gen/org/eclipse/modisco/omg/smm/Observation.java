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

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.Observation#getObserver <em>Observer</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Observation#getTool <em>Tool</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Observation#getWhenObserved <em>When Observed</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Observation#getScopes <em>Scopes</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Observation#getObservedMeasures <em>Observed Measures</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Observation#getRequestedMeasures <em>Requested Measures</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Observation#getMeasurementRelations <em>Measurement Relations</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Observation#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getObservation()
 * @model
 * @generated
 */
public interface Observation extends SmmElement {
	/**
	 * Returns the value of the '<em><b>Observer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observer</em>' attribute.
	 * @see #setObserver(String)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getObservation_Observer()
	 * @model
	 * @generated
	 */
	String getObserver();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Observation#getObserver <em>Observer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observer</em>' attribute.
	 * @see #getObserver()
	 * @generated
	 */
	void setObserver(String value);

	/**
	 * Returns the value of the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' attribute.
	 * @see #setTool(String)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getObservation_Tool()
	 * @model
	 * @generated
	 */
	String getTool();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Observation#getTool <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool</em>' attribute.
	 * @see #getTool()
	 * @generated
	 */
	void setTool(String value);

	/**
	 * Returns the value of the '<em><b>When Observed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Observed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Observed</em>' attribute.
	 * @see #setWhenObserved(Date)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getObservation_WhenObserved()
	 * @model dataType="org.eclipse.modisco.omg.smm.Date"
	 * @generated
	 */
	Date getWhenObserved();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Observation#getWhenObserved <em>When Observed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Observed</em>' attribute.
	 * @see #getWhenObserved()
	 * @generated
	 */
	void setWhenObserved(Date value);

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.ObservationScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scopes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getObservation_Scopes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObservationScope> getScopes();

	/**
	 * Returns the value of the '<em><b>Observed Measures</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.ObservedMeasure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observed Measures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observed Measures</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getObservation_ObservedMeasures()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObservedMeasure> getObservedMeasures();

	/**
	 * Returns the value of the '<em><b>Requested Measures</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.SmmElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.omg.smm.SmmElement#getRequestedObservations <em>Requested Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested Measures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Measures</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getObservation_RequestedMeasures()
	 * @see org.eclipse.modisco.omg.smm.SmmElement#getRequestedObservations
	 * @model opposite="requestedObservations"
	 * @generated
	 */
	EList<SmmElement> getRequestedMeasures();

	/**
	 * Returns the value of the '<em><b>Measurement Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.SmmRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Relations</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getObservation_MeasurementRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<SmmRelationship> getMeasurementRelations();

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getObservation_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

} // Observation
