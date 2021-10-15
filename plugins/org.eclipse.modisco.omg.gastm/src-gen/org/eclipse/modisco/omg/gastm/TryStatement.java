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
 * A representation of the model object '<em><b>Try Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.TryStatement#getGuardedStatement <em>Guarded Statement</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.TryStatement#getCatchBlocks <em>Catch Blocks</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.TryStatement#getFinalStatement <em>Final Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getTryStatement()
 * @model
 * @generated
 */
public interface TryStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Guarded Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guarded Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guarded Statement</em>' containment reference.
	 * @see #setGuardedStatement(Statement)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getTryStatement_GuardedStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getGuardedStatement();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.TryStatement#getGuardedStatement <em>Guarded Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guarded Statement</em>' containment reference.
	 * @see #getGuardedStatement()
	 * @generated
	 */
	void setGuardedStatement(Statement value);

	/**
	 * Returns the value of the '<em><b>Catch Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.CatchBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Blocks</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getTryStatement_CatchBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<CatchBlock> getCatchBlocks();

	/**
	 * Returns the value of the '<em><b>Final Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Statement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Statement</em>' containment reference.
	 * @see #setFinalStatement(Statement)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getTryStatement_FinalStatement()
	 * @model containment="true"
	 * @generated
	 */
	Statement getFinalStatement();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.TryStatement#getFinalStatement <em>Final Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Statement</em>' containment reference.
	 * @see #getFinalStatement()
	 * @generated
	 */
	void setFinalStatement(Statement value);

} // TryStatement
