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
import org.eclipse.gmt.modisco.omg.kdm.core.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KDM Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.kdm.KDMFramework#getAudit <em>Audit</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.kdm.KDMFramework#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.kdm.KDMFramework#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.omg.kdm.kdm.KdmPackage#getKDMFramework()
 * @model abstract="true"
 * @generated
 */
public interface KDMFramework extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Audit</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.kdm.Audit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audit</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.kdm.KdmPackage#getKDMFramework_Audit()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Audit> getAudit();

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.omg.kdm.kdm.ExtensionFamily}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.omg.kdm.kdm.KdmPackage#getKDMFramework_Extension()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ExtensionFamily> getExtension();

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
	 * @see org.eclipse.gmt.modisco.omg.kdm.kdm.KdmPackage#getKDMFramework_Name()
	 * @model dataType="org.eclipse.gmt.modisco.omg.kdm.core.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.omg.kdm.kdm.KDMFramework#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // KDMFramework
