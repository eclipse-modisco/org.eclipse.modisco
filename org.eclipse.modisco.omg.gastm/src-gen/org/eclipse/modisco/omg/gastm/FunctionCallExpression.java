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
 * A representation of the model object '<em><b>Function Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.FunctionCallExpression#getCalledFunction <em>Called Function</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.FunctionCallExpression#getActualParams <em>Actual Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getFunctionCallExpression()
 * @model
 * @generated
 */
public interface FunctionCallExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Called Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Function</em>' containment reference.
	 * @see #setCalledFunction(Expression)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getFunctionCallExpression_CalledFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCalledFunction();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.FunctionCallExpression#getCalledFunction <em>Called Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Function</em>' containment reference.
	 * @see #getCalledFunction()
	 * @generated
	 */
	void setCalledFunction(Expression value);

	/**
	 * Returns the value of the '<em><b>Actual Params</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.ActualParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Params</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getFunctionCallExpression_ActualParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActualParameter> getActualParams();

} // FunctionCallExpression
