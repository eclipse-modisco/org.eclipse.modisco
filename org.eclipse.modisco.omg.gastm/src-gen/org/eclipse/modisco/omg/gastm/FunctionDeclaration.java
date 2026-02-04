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
 * A representation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.FunctionDeclaration#getFormalParameters <em>Formal Parameters</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.FunctionDeclaration#getFunctionMemberAttributes <em>Function Member Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getFunctionDeclaration()
 * @model
 * @generated
 */
public interface FunctionDeclaration extends Declaration {
	/**
	 * Returns the value of the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.FormalParameterDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameters</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getFunctionDeclaration_FormalParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormalParameterDeclaration> getFormalParameters();

	/**
	 * Returns the value of the '<em><b>Function Member Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Member Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Member Attributes</em>' containment reference.
	 * @see #setFunctionMemberAttributes(FunctionMemberAttributes)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getFunctionDeclaration_FunctionMemberAttributes()
	 * @model containment="true"
	 * @generated
	 */
	FunctionMemberAttributes getFunctionMemberAttributes();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.FunctionDeclaration#getFunctionMemberAttributes <em>Function Member Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Member Attributes</em>' containment reference.
	 * @see #getFunctionMemberAttributes()
	 * @generated
	 */
	void setFunctionMemberAttributes(FunctionMemberAttributes value);

} // FunctionDeclaration
