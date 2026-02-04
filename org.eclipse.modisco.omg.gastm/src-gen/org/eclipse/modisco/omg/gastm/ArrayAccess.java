/**
 * <copyright>
 * Copyright (c) 2009, 2019 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.ArrayAccess#getArrayName <em>Array Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.ArrayAccess#getSubscripts <em>Subscripts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getArrayAccess()
 * @model
 * @generated
 */
public interface ArrayAccess extends Expression {
	/**
	 * Returns the value of the '<em><b>Array Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Name</em>' containment reference.
	 * @see #setArrayName(Expression)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getArrayAccess_ArrayName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getArrayName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.ArrayAccess#getArrayName <em>Array Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Name</em>' containment reference.
	 * @see #getArrayName()
	 * @generated
	 */
	void setArrayName(Expression value);

	/**
	 * Returns the value of the '<em><b>Subscripts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscripts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscripts</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getArrayAccess_Subscripts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getSubscripts();

} // ArrayAccess
