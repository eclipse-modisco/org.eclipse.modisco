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
 * A representation of the model object '<em><b>Defined Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.code.DefinedType#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.code.DefinedType#getCodeElement <em>Code Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodePackage#getDefinedType()
 * @model abstract="true"
 * @generated
 */
public interface DefinedType extends Datatype {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Datatype)
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodePackage#getDefinedType_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Datatype getType();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.kdm.code.DefinedType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Datatype value);

	/**
	 * Returns the value of the '<em><b>Code Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Element</em>' containment reference.
	 * @see #setCodeElement(Datatype)
	 * @see org.eclipse.gmt.modisco.omg.kdm.code.CodePackage#getDefinedType_CodeElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Datatype getCodeElement();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.kdm.code.DefinedType#getCodeElement <em>Code Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Element</em>' containment reference.
	 * @see #getCodeElement()
	 * @generated
	 */
	void setCodeElement(Datatype value);

} // DefinedType
