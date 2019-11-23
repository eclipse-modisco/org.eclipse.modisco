/**
 * *******************************************************************************
 * Copyright (c) 2008, 2019 Castor Technologies Inc and others.
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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Characteristic#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Characteristic#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.Characteristic#getCharacteristics <em>Characteristics</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCharacteristic()
 * @model
 * @generated
 */
public interface Characteristic extends SmmElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCharacteristic_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.Characteristic#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Characteristic)
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCharacteristic_Parent()
	 * @model
	 * @generated
	 */
	Characteristic getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.smm.Characteristic#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Characteristic value);

	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.smm.Measure}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.omg.smm.Measure#getTrait <em>Trait</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristics</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.smm.SmmPackage#getCharacteristic_Characteristics()
	 * @see org.eclipse.gmt.modisco.omg.smm.Measure#getTrait
	 * @model opposite="trait"
	 * @generated
	 */
	EList<Measure> getCharacteristics();

} // Characteristic
