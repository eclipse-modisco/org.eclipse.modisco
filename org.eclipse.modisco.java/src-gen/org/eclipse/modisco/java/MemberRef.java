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

import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.NamedElement;
import org.eclipse.modisco.java.TypeAccess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.MemberRef#getMember <em>Member</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.MemberRef#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getMemberRef()
 * @model
 * @generated
 */
public interface MemberRef extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(NamedElement)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getMemberRef_Member()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamedElement getMember();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.MemberRef#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference.
	 * @see #setQualifier(TypeAccess)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getMemberRef_Qualifier()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	TypeAccess getQualifier();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.MemberRef#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(TypeAccess value);

} // MemberRef
