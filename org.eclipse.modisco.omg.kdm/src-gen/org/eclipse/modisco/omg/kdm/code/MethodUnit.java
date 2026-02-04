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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.code.MethodUnit#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.code.MethodUnit#getExport <em>Export</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.kdm.code.CodePackage#getMethodUnit()
 * @model
 * @generated
 */
public interface MethodUnit extends ControlElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.modisco.omg.kdm.code.MethodKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.modisco.omg.kdm.code.MethodKind
	 * @see #setKind(MethodKind)
	 * @see org.eclipse.modisco.omg.kdm.code.CodePackage#getMethodUnit_Kind()
	 * @model
	 * @generated
	 */
	MethodKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.kdm.code.MethodUnit#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.modisco.omg.kdm.code.MethodKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MethodKind value);

	/**
	 * Returns the value of the '<em><b>Export</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.modisco.omg.kdm.code.ExportKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export</em>' attribute.
	 * @see org.eclipse.modisco.omg.kdm.code.ExportKind
	 * @see #setExport(ExportKind)
	 * @see org.eclipse.modisco.omg.kdm.code.CodePackage#getMethodUnit_Export()
	 * @model
	 * @generated
	 */
	ExportKind getExport();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.kdm.code.MethodUnit#getExport <em>Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export</em>' attribute.
	 * @see org.eclipse.modisco.omg.kdm.code.ExportKind
	 * @see #getExport()
	 * @generated
	 */
	void setExport(ExportKind value);

} // MethodUnit
