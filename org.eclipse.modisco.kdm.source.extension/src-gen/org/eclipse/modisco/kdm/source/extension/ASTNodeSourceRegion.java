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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.omg.kdm.source.SourceRegion;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>AST Node Source Region</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.kdm.source.extension.ExtensionPackage#getASTNodeSourceRegion()
 * @model
 * @generated
 */
public interface ASTNodeSourceRegion extends SourceRegion {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(EObject)
	 * @see org.eclipse.modisco.kdm.source.extension.ExtensionPackage#getASTNodeSourceRegion_Node()
	 * @model required="true"
	 * @generated
	 */
	EObject getNode();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(EObject value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.kdm.source.extension.CodeUnit2File#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(CodeUnit2File)
	 * @see org.eclipse.modisco.kdm.source.extension.ExtensionPackage#getASTNodeSourceRegion_Parent()
	 * @see org.eclipse.modisco.kdm.source.extension.CodeUnit2File#getChildren
	 * @model opposite="children" required="true" transient="false"
	 * @generated
	 */
	CodeUnit2File getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CodeUnit2File value);

} // ASTNodeSourceRegion
