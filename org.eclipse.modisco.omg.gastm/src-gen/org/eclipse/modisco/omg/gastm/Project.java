/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
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
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.Project#getFiles <em>Files</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.Project#getOuterScope <em>Outer Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends GASTMSemanticObject {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.CompilationUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getProject_Files()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CompilationUnit> getFiles();

	/**
	 * Returns the value of the '<em><b>Outer Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Scope</em>' reference.
	 * @see #setOuterScope(GlobalScope)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getProject_OuterScope()
	 * @model
	 * @generated
	 */
	GlobalScope getOuterScope();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.Project#getOuterScope <em>Outer Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Scope</em>' reference.
	 * @see #getOuterScope()
	 * @generated
	 */
	void setOuterScope(GlobalScope value);

} // Project
