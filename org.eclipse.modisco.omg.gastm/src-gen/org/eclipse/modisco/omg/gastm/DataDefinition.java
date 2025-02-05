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

import java.lang.Boolean;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.DataDefinition#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.DataDefinition#getIsMutable <em>Is Mutable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDataDefinition()
 * @model abstract="true"
 * @generated
 */
public interface DataDefinition extends Definition {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' containment reference.
	 * @see #setInitialValue(Expression)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDataDefinition_InitialValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitialValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.DataDefinition#getInitialValue <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' containment reference.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Is Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mutable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mutable</em>' attribute.
	 * @see #setIsMutable(Boolean)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDataDefinition_IsMutable()
	 * @model
	 * @generated
	 */
	Boolean getIsMutable();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.DataDefinition#getIsMutable <em>Is Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mutable</em>' attribute.
	 * @see #getIsMutable()
	 * @generated
	 */
	void setIsMutable(Boolean value);

} // DataDefinition
