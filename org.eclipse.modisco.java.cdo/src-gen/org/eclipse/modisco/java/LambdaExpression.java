/**
 * *******************************************************************************
 * Copyright (c) 2009, 2018 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - Bug 533168 - (releng) OutOfMemory during quality postprocessing because large number of checkstyle warnings
 * *******************************************************************************
 */
package org.eclipse.modisco.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lambda Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.LambdaExpression#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.LambdaExpression#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.java.cdo.meta.JavaPackage#getLambdaExpression()
 * @model
 * @generated
 */
public interface LambdaExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(ASTNode)
	 * @see org.eclipse.modisco.java.cdo.meta.JavaPackage#getLambdaExpression_Body()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ASTNode getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.LambdaExpression#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ASTNode value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.modisco.java.cdo.meta.JavaPackage#getLambdaExpression_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclaration> getParameters();

} // LambdaExpression
