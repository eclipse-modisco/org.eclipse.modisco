/**
 * *******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 * *******************************************************************************
 */
package org.eclipse.modisco.java;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.java.ClassFile;
import org.eclipse.modisco.java.Comment;
import org.eclipse.modisco.java.CompilationUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AST Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.ASTNode#getComments <em>Comments</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.ASTNode#getOriginalCompilationUnit <em>Original Compilation Unit</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.ASTNode#getOriginalClassFile <em>Original Class File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getASTNode()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ASTNode extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getASTNode_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * Returns the value of the '<em><b>Original Compilation Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Compilation Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Compilation Unit</em>' reference.
	 * @see #setOriginalCompilationUnit(CompilationUnit)
	 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getASTNode_OriginalCompilationUnit()
	 * @model ordered="false"
	 * @generated
	 */
	CompilationUnit getOriginalCompilationUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.ASTNode#getOriginalCompilationUnit <em>Original Compilation Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Compilation Unit</em>' reference.
	 * @see #getOriginalCompilationUnit()
	 * @generated
	 */
	void setOriginalCompilationUnit(CompilationUnit value);

	/**
	 * Returns the value of the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Class File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Class File</em>' reference.
	 * @see #setOriginalClassFile(ClassFile)
	 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getASTNode_OriginalClassFile()
	 * @model ordered="false"
	 * @generated
	 */
	ClassFile getOriginalClassFile();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.ASTNode#getOriginalClassFile <em>Original Class File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Class File</em>' reference.
	 * @see #getOriginalClassFile()
	 * @generated
	 */
	void setOriginalClassFile(ClassFile value);

} // ASTNode
