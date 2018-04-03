/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
 * A representation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.EnumType#getEnumLiterals <em>Enum Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getEnumType()
 * @model
 * @generated
 */
public interface EnumType extends DataType {
	/**
	 * Returns the value of the '<em><b>Enum Literals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.EnumLiteralDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Literals</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getEnumType_EnumLiterals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnumLiteralDefinition> getEnumLiterals();

} // EnumType
