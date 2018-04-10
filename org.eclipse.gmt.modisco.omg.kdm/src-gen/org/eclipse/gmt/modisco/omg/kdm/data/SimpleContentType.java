/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.kdm.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.data.SimpleContentType#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.data.SimpleContentType#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.data.DataPackage#getSimpleContentType()
 * @model
 * @generated
 */
public interface SimpleContentType extends ComplexContentType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.data.ComplexContentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.data.DataPackage#getSimpleContentType_Type()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ComplexContentType> getType();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see org.eclipse.gmt.modisco.omg.kdm.data.DataPackage#getSimpleContentType_Kind()
	 * @model dataType="org.eclipse.gmt.modisco.omg.kdm.core.String"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.kdm.data.SimpleContentType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

} // SimpleContentType
