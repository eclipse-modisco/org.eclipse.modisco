/**
 * *******************************************************************************
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 * *******************************************************************************
 */
package org.eclipse.modisco.java;

import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.PrefixExpressionKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.PrefixExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.PrefixExpression#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getPrefixExpression()
 * @model
 * @generated
 */
public interface PrefixExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.modisco.java.PrefixExpressionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.eclipse.modisco.java.PrefixExpressionKind
	 * @see #setOperator(PrefixExpressionKind)
	 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getPrefixExpression_Operator()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	PrefixExpressionKind getOperator();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.PrefixExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.eclipse.modisco.java.PrefixExpressionKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(PrefixExpressionKind value);

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(Expression)
	 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getPrefixExpression_Operand()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getOperand();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.PrefixExpression#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(Expression value);

} // PrefixExpression
