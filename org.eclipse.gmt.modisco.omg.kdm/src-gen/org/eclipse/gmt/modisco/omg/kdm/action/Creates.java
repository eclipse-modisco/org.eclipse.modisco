/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.action;

import org.eclipse.gmt.modisco.omg.kdm.code.Datatype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.action.Creates#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.action.Creates#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.action.ActionPackage#getCreates()
 * @model
 * @generated
 */
public interface Creates extends AbstractActionRelationship {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Datatype)
	 * @see org.eclipse.gmt.modisco.omg.kdm.action.ActionPackage#getCreates_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Datatype getTo();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.kdm.action.Creates#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Datatype value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ActionElement)
	 * @see org.eclipse.gmt.modisco.omg.kdm.action.ActionPackage#getCreates_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActionElement getFrom();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.kdm.action.Creates#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ActionElement value);

} // Creates
