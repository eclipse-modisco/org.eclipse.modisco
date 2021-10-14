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
 *     Sebastien Minguet (Mia-Software) - initial API and implementation
 *     Frederic Madiot (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - initial API and implementation
 *     Erwan Breton (Sodifrance) - initial API and implementation
 *     Romain Dervaux (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.java;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.Comment;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.AbstractTypeDeclaration#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.AbstractTypeDeclaration#getCommentsBeforeBody <em>Comments Before Body</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.AbstractTypeDeclaration#getCommentsAfterBody <em>Comments After Body</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.AbstractTypeDeclaration#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.AbstractTypeDeclaration#getSuperInterfaces <em>Super Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getAbstractTypeDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTypeDeclaration extends BodyDeclaration, Type {
	/**
	 * Returns the value of the '<em><b>Body Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.BodyDeclaration}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.BodyDeclaration#getAbstractTypeDeclaration <em>Abstract Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Declarations</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getAbstractTypeDeclaration_BodyDeclarations()
	 * @see org.eclipse.modisco.java.BodyDeclaration#getAbstractTypeDeclaration
	 * @model opposite="abstractTypeDeclaration" containment="true"
	 * @generated
	 */
	EList<BodyDeclaration> getBodyDeclarations();

	/**
	 * Returns the value of the '<em><b>Comments Before Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments Before Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments Before Body</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getAbstractTypeDeclaration_CommentsBeforeBody()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getCommentsBeforeBody();

	/**
	 * Returns the value of the '<em><b>Comments After Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments After Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments After Body</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getAbstractTypeDeclaration_CommentsAfterBody()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getCommentsAfterBody();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.Package#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(org.eclipse.modisco.java.Package)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getAbstractTypeDeclaration_Package()
	 * @see org.eclipse.modisco.java.Package#getOwnedElements
	 * @model opposite="ownedElements" transient="false" ordered="false"
	 * @generated
	 */
	org.eclipse.modisco.java.Package getPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.AbstractTypeDeclaration#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(org.eclipse.modisco.java.Package value);

	/**
	 * Returns the value of the '<em><b>Super Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Interfaces</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getAbstractTypeDeclaration_SuperInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeAccess> getSuperInterfaces();

} // AbstractTypeDeclaration
