/**
 * 
 * Copyright (c) 2009 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.code;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.code.DerivedType#getItemUnit <em>Item Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodePackage#getDerivedType()
 * @model
 * @generated
 */
public interface DerivedType extends Datatype {
	/**
	 * Returns the value of the '<em><b>Item Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Unit</em>' containment reference.
	 * @see #setItemUnit(ItemUnit)
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodePackage#getDerivedType_ItemUnit()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ItemUnit getItemUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.kdm.code.DerivedType#getItemUnit <em>Item Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Unit</em>' containment reference.
	 * @see #getItemUnit()
	 * @generated
	 */
	void setItemUnit(ItemUnit value);

} // DerivedType
