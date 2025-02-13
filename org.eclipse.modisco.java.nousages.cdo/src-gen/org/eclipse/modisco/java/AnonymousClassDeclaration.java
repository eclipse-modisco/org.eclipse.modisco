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

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.AnonymousClassDeclaration#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.AnonymousClassDeclaration#getClassInstanceCreation <em>Class Instance Creation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getAnonymousClassDeclaration()
 * @model
 * @generated
 */
public interface AnonymousClassDeclaration extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Body Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.BodyDeclaration}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.BodyDeclaration#getAnonymousClassDeclarationOwner <em>Anonymous Class Declaration Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Declarations</em>' containment reference list.
	 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getAnonymousClassDeclaration_BodyDeclarations()
	 * @see org.eclipse.modisco.java.BodyDeclaration#getAnonymousClassDeclarationOwner
	 * @model opposite="anonymousClassDeclarationOwner" containment="true"
	 * @generated
	 */
	EList<BodyDeclaration> getBodyDeclarations();

	/**
	 * Returns the value of the '<em><b>Class Instance Creation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.ClassInstanceCreation#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Instance Creation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Instance Creation</em>' container reference.
	 * @see #setClassInstanceCreation(ClassInstanceCreation)
	 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getAnonymousClassDeclaration_ClassInstanceCreation()
	 * @see org.eclipse.modisco.java.ClassInstanceCreation#getAnonymousClassDeclaration
	 * @model opposite="anonymousClassDeclaration" transient="false" ordered="false"
	 * @generated
	 */
	ClassInstanceCreation getClassInstanceCreation();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.AnonymousClassDeclaration#getClassInstanceCreation <em>Class Instance Creation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Instance Creation</em>' container reference.
	 * @see #getClassInstanceCreation()
	 * @generated
	 */
	void setClassInstanceCreation(ClassInstanceCreation value);

} // AnonymousClassDeclaration
