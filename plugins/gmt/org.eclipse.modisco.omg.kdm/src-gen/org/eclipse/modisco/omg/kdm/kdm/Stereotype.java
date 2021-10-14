/**
 * 
 * Copyright (c) 2009, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.kdm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.omg.kdm.core.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.kdm.Stereotype#getTag <em>Tag</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.kdm.Stereotype#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.kdm.Stereotype#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.kdm.KdmPackage#getStereotype()
 * @model
 * @generated
 */
public interface Stereotype extends Element {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.kdm.TagDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.kdm.KdmPackage#getStereotype_Tag()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TagDefinition> getTag();

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
	 * @see org.eclipse.modisco.omg.kdm.kdm.KdmPackage#getStereotype_Name()
	 * @model dataType=org.eclipse.modisco.omg.kdm.core.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.kdm.kdm.Stereotype#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.modisco.omg.kdm.kdm.KdmPackage#getStereotype_Type()
	 * @model dataType=org.eclipse.modisco.omg.kdm.core.String"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.kdm.kdm.Stereotype#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Stereotype
