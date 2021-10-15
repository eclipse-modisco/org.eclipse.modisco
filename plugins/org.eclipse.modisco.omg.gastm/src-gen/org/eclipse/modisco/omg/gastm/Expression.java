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
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.Expression#getExpressionType <em>Expression Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends GASTMSyntaxObject {
	/**
	 * Returns the value of the '<em><b>Expression Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Type</em>' reference.
	 * @see #setExpressionType(TypeReference)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getExpression_ExpressionType()
	 * @model required="true"
	 * @generated
	 */
	TypeReference getExpressionType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.Expression#getExpressionType <em>Expression Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Type</em>' reference.
	 * @see #getExpressionType()
	 * @generated
	 */
	void setExpressionType(TypeReference value);

} // Expression
