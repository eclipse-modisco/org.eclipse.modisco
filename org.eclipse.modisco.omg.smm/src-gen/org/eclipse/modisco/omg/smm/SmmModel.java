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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.SmmModel#getObservations <em>Observations</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.SmmModel#getLibrairies <em>Librairies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getSmmModel()
 * @model
 * @generated
 */
public interface SmmModel extends SmmElement {
	/**
	 * Returns the value of the '<em><b>Observations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.Observation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observations</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getSmmModel_Observations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Observation> getObservations();

	/**
	 * Returns the value of the '<em><b>Librairies</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.smm.MeasureLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Librairies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Librairies</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getSmmModel_Librairies()
	 * @model containment="true"
	 * @generated
	 */
	EList<MeasureLibrary> getLibrairies();

} // SmmModel
