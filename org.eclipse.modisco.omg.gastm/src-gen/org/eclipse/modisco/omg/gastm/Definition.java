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
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.Definition#getIdentifierName <em>Identifier Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.Definition#getDefinitionType <em>Definition Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDefinition()
 * @model abstract="true"
 * @generated
 */
public interface Definition extends DeclarationOrDefinition {
	/**
	 * Returns the value of the '<em><b>Identifier Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier Name</em>' containment reference.
	 * @see #setIdentifierName(Name)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDefinition_IdentifierName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Name getIdentifierName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.Definition#getIdentifierName <em>Identifier Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier Name</em>' containment reference.
	 * @see #getIdentifierName()
	 * @generated
	 */
	void setIdentifierName(Name value);

	/**
	 * Returns the value of the '<em><b>Definition Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Type</em>' containment reference.
	 * @see #setDefinitionType(TypeReference)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDefinition_DefinitionType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getDefinitionType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.Definition#getDefinitionType <em>Definition Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Type</em>' containment reference.
	 * @see #getDefinitionType()
	 * @generated
	 */
	void setDefinitionType(TypeReference value);

} // Definition
