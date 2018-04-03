/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.kdm.source.extension;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.omg.kdm.source.SourceFile;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Code Unit2 File</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.kdm.source.extension.CodeUnit2File#getFile <em>File</em>}</li>
 *   <li>{@link org.eclipse.modisco.kdm.source.extension.CodeUnit2File#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.modisco.kdm.source.extension.CodeUnit2File#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.kdm.source.extension.ExtensionPackage#getCodeUnit2File()
 * @model
 * @generated
 */
public interface CodeUnit2File extends EObject {
	/**
	 * Returns the value of the '<em><b>File</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>File</em>' reference.
	 * @see #setFile(SourceFile)
	 * @see org.eclipse.modisco.kdm.source.extension.ExtensionPackage#getCodeUnit2File_File()
	 * @model required="true"
	 * @generated
	 */
	SourceFile getFile();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.kdm.source.extension.CodeUnit2File#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(SourceFile value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.modisco.kdm.source.extension.ExtensionPackage#getCodeUnit2File_Children()
	 * @see org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ASTNodeSourceRegion> getChildren();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(EObject)
	 * @see org.eclipse.modisco.kdm.source.extension.ExtensionPackage#getCodeUnit2File_Unit()
	 * @model required="true"
	 * @generated
	 */
	EObject getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.kdm.source.extension.CodeUnit2File#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(EObject value);

} // CodeUnit2File
