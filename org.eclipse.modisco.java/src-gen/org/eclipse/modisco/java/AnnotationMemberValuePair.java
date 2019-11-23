/**
 * *******************************************************************************
 * Copyright (c) 2009 Mia-Software and others.
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

import org.eclipse.modisco.java.AnnotationTypeMemberDeclaration;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Member Value Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.AnnotationMemberValuePair#getMember <em>Member</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.AnnotationMemberValuePair#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getAnnotationMemberValuePair()
 * @model
 * @generated
 */
public interface AnnotationMemberValuePair extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.AnnotationTypeMemberDeclaration#getUsages <em>Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(AnnotationTypeMemberDeclaration)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getAnnotationMemberValuePair_Member()
	 * @see org.eclipse.modisco.java.AnnotationTypeMemberDeclaration#getUsages
	 * @model opposite="usages" ordered="false"
	 * @generated
	 */
	AnnotationTypeMemberDeclaration getMember();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.AnnotationMemberValuePair#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(AnnotationTypeMemberDeclaration value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getAnnotationMemberValuePair_Value()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.AnnotationMemberValuePair#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // AnnotationMemberValuePair
