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
 * A representation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.FunctionType#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.FunctionType#getParameterTypes <em>Parameter Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getFunctionType()
 * @model
 * @generated
 */
public interface FunctionType extends Type {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(TypeReference)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getFunctionType_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getReturnType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.FunctionType#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Parameter Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.FormalParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Types</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getFunctionType_ParameterTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormalParameterType> getParameterTypes();

} // FunctionType
