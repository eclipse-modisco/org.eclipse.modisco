/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - metamodel design and initial implementation
 *     Gr�goire Dup� (Mia-Software) - Bug 480183 - The manifest.mf discoverer should manage 'Export-Package' 
 */
package org.eclipse.modisco.manifest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exported Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.manifest.ExportedPackage#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.ExportedPackage#getXFriends <em>XFriends</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.ExportedPackage#isXInternal <em>XInternal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.manifest.ManifestPackage#getExportedPackage()
 * @model
 * @generated
 */
public interface ExportedPackage extends EObject {
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
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getExportedPackage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.manifest.ExportedPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>XFriends</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.manifest.Bundle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XFriends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XFriends</em>' reference list.
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getExportedPackage_XFriends()
	 * @model
	 * @generated
	 */
	EList<Bundle> getXFriends();

	/**
	 * Returns the value of the '<em><b>XInternal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XInternal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XInternal</em>' attribute.
	 * @see #setXInternal(boolean)
	 * @see org.eclipse.modisco.manifest.ManifestPackage#getExportedPackage_XInternal()
	 * @model required="true"
	 * @generated
	 */
	boolean isXInternal();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.manifest.ExportedPackage#isXInternal <em>XInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XInternal</em>' attribute.
	 * @see #isXInternal()
	 * @generated
	 */
	void setXInternal(boolean value);

} // ExportedPackage
