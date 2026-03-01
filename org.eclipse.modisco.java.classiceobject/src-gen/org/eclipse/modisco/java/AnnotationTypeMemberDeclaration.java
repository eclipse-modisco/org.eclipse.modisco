/**
 * *******************************************************************************
 * Copyright (c) 2009, 2018 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - Bug 533168 - (releng) OutOfMemory during quality postprocessing because large number of checkstyle warnings
 * *******************************************************************************
 */
package org.eclipse.modisco.java;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Type Member Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.AnnotationTypeMemberDeclaration#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.AnnotationTypeMemberDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.AnnotationTypeMemberDeclaration#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.java.emf.classic.JavaPackage#getAnnotationTypeMemberDeclaration()
 * @model
 * @generated
 */
public interface AnnotationTypeMemberDeclaration extends BodyDeclaration {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(Expression)
	 * @see org.eclipse.modisco.java.emf.classic.JavaPackage#getAnnotationTypeMemberDeclaration_Default()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.AnnotationTypeMemberDeclaration#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(Expression value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeAccess)
	 * @see org.eclipse.modisco.java.emf.classic.JavaPackage#getAnnotationTypeMemberDeclaration_Type()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TypeAccess getType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.AnnotationTypeMemberDeclaration#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeAccess value);

	/**
	 * Returns the value of the '<em><b>Usages</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.AnnotationMemberValuePair}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.AnnotationMemberValuePair#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' reference list.
	 * @see org.eclipse.modisco.java.emf.classic.JavaPackage#getAnnotationTypeMemberDeclaration_Usages()
	 * @see org.eclipse.modisco.java.AnnotationMemberValuePair#getMember
	 * @model opposite="member" ordered="false"
	 * @generated
	 */
	EList<AnnotationMemberValuePair> getUsages();

} // AnnotationTypeMemberDeclaration
