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
package org.eclipse.gmt.modisco.omg.kdm.kdm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.omg.kdm.core.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.kdm.ExtensionFamily#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.kdm.ExtensionFamily#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.kdm.KdmPackage#getExtensionFamily()
 * @model
 * @generated
 */
public interface ExtensionFamily extends Element {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.kdm.Stereotype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.kdm.KdmPackage#getExtensionFamily_Stereotype()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Stereotype> getStereotype();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gmt.modisco.omg.kdm.kdm.KdmPackage#getExtensionFamily_Name()
	 * @model dataType="org.eclipse.gmt.modisco.omg.kdm.core.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.kdm.kdm.ExtensionFamily#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ExtensionFamily
