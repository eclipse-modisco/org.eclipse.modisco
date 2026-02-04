/**
 * <copyright>
 * Copyright (c) 2009, 2019 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.CompilationUnit#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.CompilationUnit#getFragments <em>Fragments</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.CompilationUnit#getOpensScope <em>Opens Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getCompilationUnit()
 * @model
 * @generated
 */
public interface CompilationUnit extends SourceFile {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getCompilationUnit_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.CompilationUnit#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.DefinitionObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getCompilationUnit_Fragments()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefinitionObject> getFragments();

	/**
	 * Returns the value of the '<em><b>Opens Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opens Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opens Scope</em>' reference.
	 * @see #setOpensScope(ProgramScope)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getCompilationUnit_OpensScope()
	 * @model
	 * @generated
	 */
	ProgramScope getOpensScope();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.CompilationUnit#getOpensScope <em>Opens Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opens Scope</em>' reference.
	 * @see #getOpensScope()
	 * @generated
	 */
	void setOpensScope(ProgramScope value);

} // CompilationUnit
