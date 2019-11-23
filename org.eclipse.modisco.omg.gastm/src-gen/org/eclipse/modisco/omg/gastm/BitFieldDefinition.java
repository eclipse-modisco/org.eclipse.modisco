/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
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
 * A representation of the model object '<em><b>Bit Field Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.BitFieldDefinition#getBitFieldSize <em>Bit Field Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getBitFieldDefinition()
 * @model
 * @generated
 */
public interface BitFieldDefinition extends DataDefinition {
	/**
	 * Returns the value of the '<em><b>Bit Field Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Field Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Field Size</em>' containment reference.
	 * @see #setBitFieldSize(Expression)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getBitFieldDefinition_BitFieldSize()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getBitFieldSize();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.BitFieldDefinition#getBitFieldSize <em>Bit Field Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Field Size</em>' containment reference.
	 * @see #getBitFieldSize()
	 * @generated
	 */
	void setBitFieldSize(Expression value);

} // BitFieldDefinition
