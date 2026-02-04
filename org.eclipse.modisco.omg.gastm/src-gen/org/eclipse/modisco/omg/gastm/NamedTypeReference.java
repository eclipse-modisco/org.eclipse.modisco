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
 * A representation of the model object '<em><b>Named Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.NamedTypeReference#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.NamedTypeReference#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getNamedTypeReference()
 * @model
 * @generated
 */
public interface NamedTypeReference extends TypeReference {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' containment reference.
	 * @see #setTypeName(Name)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getNamedTypeReference_TypeName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Name getTypeName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.NamedTypeReference#getTypeName <em>Type Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' containment reference.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(Name value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeDefinition)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getNamedTypeReference_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeDefinition getType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.NamedTypeReference#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDefinition value);

} // NamedTypeReference
