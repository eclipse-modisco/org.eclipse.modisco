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

import java.lang.Boolean;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Member Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.FunctionMemberAttributes#getIsFriend <em>Is Friend</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.FunctionMemberAttributes#getIsInLine <em>Is In Line</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.FunctionMemberAttributes#getIsThisConst <em>Is This Const</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.FunctionMemberAttributes#getVirtualSpecifier <em>Virtual Specifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getFunctionMemberAttributes()
 * @model
 * @generated
 */
public interface FunctionMemberAttributes extends MinorSyntaxObject {
	/**
	 * Returns the value of the '<em><b>Is Friend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Friend</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Friend</em>' attribute.
	 * @see #setIsFriend(Boolean)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getFunctionMemberAttributes_IsFriend()
	 * @model
	 * @generated
	 */
	Boolean getIsFriend();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.FunctionMemberAttributes#getIsFriend <em>Is Friend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Friend</em>' attribute.
	 * @see #getIsFriend()
	 * @generated
	 */
	void setIsFriend(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is In Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is In Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is In Line</em>' attribute.
	 * @see #setIsInLine(Boolean)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getFunctionMemberAttributes_IsInLine()
	 * @model
	 * @generated
	 */
	Boolean getIsInLine();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.FunctionMemberAttributes#getIsInLine <em>Is In Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is In Line</em>' attribute.
	 * @see #getIsInLine()
	 * @generated
	 */
	void setIsInLine(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is This Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is This Const</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is This Const</em>' attribute.
	 * @see #setIsThisConst(Boolean)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getFunctionMemberAttributes_IsThisConst()
	 * @model
	 * @generated
	 */
	Boolean getIsThisConst();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.FunctionMemberAttributes#getIsThisConst <em>Is This Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is This Const</em>' attribute.
	 * @see #getIsThisConst()
	 * @generated
	 */
	void setIsThisConst(Boolean value);

	/**
	 * Returns the value of the '<em><b>Virtual Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Specifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Specifier</em>' containment reference.
	 * @see #setVirtualSpecifier(VirtualSpecification)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getFunctionMemberAttributes_VirtualSpecifier()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VirtualSpecification getVirtualSpecifier();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.FunctionMemberAttributes#getVirtualSpecifier <em>Virtual Specifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Specifier</em>' containment reference.
	 * @see #getVirtualSpecifier()
	 * @generated
	 */
	void setVirtualSpecifier(VirtualSpecification value);

} // FunctionMemberAttributes
