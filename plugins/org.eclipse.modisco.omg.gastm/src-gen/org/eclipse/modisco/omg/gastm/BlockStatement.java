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
 * A representation of the model object '<em><b>Block Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.BlockStatement#getSubStatements <em>Sub Statements</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.BlockStatement#getOpensScope <em>Opens Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getBlockStatement()
 * @model
 * @generated
 */
public interface BlockStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Sub Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Statements</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getBlockStatement_SubStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getSubStatements();

	/**
	 * Returns the value of the '<em><b>Opens Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opens Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opens Scope</em>' reference.
	 * @see #setOpensScope(BlockScope)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getBlockStatement_OpensScope()
	 * @model required="true"
	 * @generated
	 */
	BlockScope getOpensScope();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.BlockStatement#getOpensScope <em>Opens Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opens Scope</em>' reference.
	 * @see #getOpensScope()
	 * @generated
	 */
	void setOpensScope(BlockScope value);

} // BlockStatement
