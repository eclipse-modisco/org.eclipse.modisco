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
package org.eclipse.modisco.omg.kdm.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.code.DataElement#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.code.DataElement#getExt <em>Ext</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.code.DataElement#getSize <em>Size</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.code.DataElement#getCodeElement <em>Code Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.code.CodePackage#getDataElement()
 * @model
 * @generated
 */
public interface DataElement extends ComputationalObject {
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
	 * @see org.eclipse.modisco.omg.kdm.code.CodePackage#getDataElement_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Datatype getType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.kdm.code.DataElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Datatype value);

	/**
	 * Returns the value of the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext</em>' attribute.
	 * @see #setExt(String)
	 * @see org.eclipse.modisco.omg.kdm.code.CodePackage#getDataElement_Ext()
	 * @model dataType=org.eclipse.modisco.omg.kdm.core.String"
	 * @generated
	 */
	String getExt();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.kdm.code.DataElement#getExt <em>Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext</em>' attribute.
	 * @see #getExt()
	 * @generated
	 */
	void setExt(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Integer)
	 * @see org.eclipse.modisco.omg.kdm.code.CodePackage#getDataElement_Size()
	 * @model dataType=org.eclipse.modisco.omg.kdm.core.Integer"
	 * @generated
	 */
	Integer getSize();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.kdm.code.DataElement#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Code Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.kdm.code.Datatype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Element</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.kdm.code.CodePackage#getDataElement_CodeElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Datatype> getCodeElement();

} // DataElement
