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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.IfStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.IfStatement#getThenBody <em>Then Body</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.IfStatement#getElseBody <em>Else Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getIfStatement_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.IfStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Then Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Body</em>' containment reference.
	 * @see #setThenBody(Statement)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getIfStatement_ThenBody()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getThenBody();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.IfStatement#getThenBody <em>Then Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Body</em>' containment reference.
	 * @see #getThenBody()
	 * @generated
	 */
	void setThenBody(Statement value);

	/**
	 * Returns the value of the '<em><b>Else Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Body</em>' containment reference.
	 * @see #setElseBody(Statement)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getIfStatement_ElseBody()
	 * @model containment="true"
	 * @generated
	 */
	Statement getElseBody();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.IfStatement#getElseBody <em>Else Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Body</em>' containment reference.
	 * @see #getElseBody()
	 * @generated
	 */
	void setElseBody(Statement value);

} // IfStatement
