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
 * A representation of the model object '<em><b>Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.NumberType#getIsSigned <em>Is Signed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getNumberType()
 * @model abstract="true"
 * @generated
 */
public interface NumberType extends PrimitiveType {
	/**
	 * Returns the value of the '<em><b>Is Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Signed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Signed</em>' attribute.
	 * @see #setIsSigned(Boolean)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getNumberType_IsSigned()
	 * @model
	 * @generated
	 */
	Boolean getIsSigned();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.NumberType#getIsSigned <em>Is Signed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Signed</em>' attribute.
	 * @see #getIsSigned()
	 * @generated
	 */
	void setIsSigned(Boolean value);

} // NumberType
