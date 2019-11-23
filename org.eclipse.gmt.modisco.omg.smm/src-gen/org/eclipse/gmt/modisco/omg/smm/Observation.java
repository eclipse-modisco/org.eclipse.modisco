/**
 * *******************************************************************************
 * Copyright (c) 2008 Castor Technologies Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Alain Picard (Castor Technologies Inc) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.smm;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Observation#getObserver <em>Observer</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Observation#getTool <em>Tool</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Observation#getWhenObserved <em>When Observed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getObservation()
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
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getObservation_Observer()
	 * @model
	 * @generated
	 */
	String getObserver();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.Observation#getObserver <em>Observer</em>}' attribute.
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
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getObservation_Tool()
	 * @model
	 * @generated
	 */
	String getTool();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.Observation#getTool <em>Tool</em>}' attribute.
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
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getObservation_WhenObserved()
	 * @model dataType="org.eclipse.gmt.modisco.omg.smm.Date"
	 * @generated
	 */
	Date getWhenObserved();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.Observation#getWhenObserved <em>When Observed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Observed</em>' attribute.
	 * @see #getWhenObserved()
	 * @generated
	 */
	void setWhenObserved(Date value);

} // Observation
