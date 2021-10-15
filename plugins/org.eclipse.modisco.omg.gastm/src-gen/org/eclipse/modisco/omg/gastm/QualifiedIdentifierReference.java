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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Identifier Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.QualifiedIdentifierReference#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.QualifiedIdentifierReference#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getQualifiedIdentifierReference()
 * @model abstract="true"
 * @generated
 */
public interface QualifiedIdentifierReference extends NameReference {
	/**
	 * Returns the value of the '<em><b>Qualifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifiers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifiers</em>' containment reference.
	 * @see #setQualifiers(Expression)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getQualifiedIdentifierReference_Qualifiers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getQualifiers();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.QualifiedIdentifierReference#getQualifiers <em>Qualifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifiers</em>' containment reference.
	 * @see #getQualifiers()
	 * @generated
	 */
	void setQualifiers(Expression value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference.
	 * @see #setMember(IdentifierReference)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getQualifiedIdentifierReference_Member()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IdentifierReference getMember();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.QualifiedIdentifierReference#getMember <em>Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' containment reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(IdentifierReference value);

} // QualifiedIdentifierReference
