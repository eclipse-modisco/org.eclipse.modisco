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
 * A representation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.ConditionalExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.ConditionalExpression#getOnTrueOperand <em>On True Operand</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.ConditionalExpression#getOnFalseOperand <em>On False Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getConditionalExpression()
 * @model
 * @generated
 */
public interface ConditionalExpression extends Expression {
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
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getConditionalExpression_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.ConditionalExpression#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>On True Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On True Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On True Operand</em>' containment reference.
	 * @see #setOnTrueOperand(Expression)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getConditionalExpression_OnTrueOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getOnTrueOperand();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.ConditionalExpression#getOnTrueOperand <em>On True Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On True Operand</em>' containment reference.
	 * @see #getOnTrueOperand()
	 * @generated
	 */
	void setOnTrueOperand(Expression value);

	/**
	 * Returns the value of the '<em><b>On False Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On False Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On False Operand</em>' containment reference.
	 * @see #setOnFalseOperand(Expression)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getConditionalExpression_OnFalseOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getOnFalseOperand();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.ConditionalExpression#getOnFalseOperand <em>On False Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On False Operand</em>' containment reference.
	 * @see #getOnFalseOperand()
	 * @generated
	 */
	void setOnFalseOperand(Expression value);

} // ConditionalExpression
