/**
 * *******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 
 *     Sebastien Minguet (Mia-Software) - initial API and implementation
 *     Frederic Madiot (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - initial API and implementation
 *     Erwan Breton (Sodifrance) - initial API and implementation
 *     Romain Dervaux (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.java;

import org.eclipse.modisco.java.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.StringLiteral#getEscapedValue <em>Escaped Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getStringLiteral()
 * @model
 * @generated
 */
public interface StringLiteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Escaped Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escaped Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escaped Value</em>' attribute.
	 * @see #setEscapedValue(String)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getStringLiteral_EscapedValue()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getEscapedValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.StringLiteral#getEscapedValue <em>Escaped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escaped Value</em>' attribute.
	 * @see #getEscapedValue()
	 * @generated
	 */
	void setEscapedValue(String value);

} // StringLiteral
