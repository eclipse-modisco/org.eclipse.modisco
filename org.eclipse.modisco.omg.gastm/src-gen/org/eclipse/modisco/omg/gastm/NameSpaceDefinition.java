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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Space Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.NameSpaceDefinition#getNameSpace <em>Name Space</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.NameSpaceDefinition#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.NameSpaceDefinition#getNameSpaceType <em>Name Space Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getNameSpaceDefinition()
 * @model
 * @generated
 */
public interface NameSpaceDefinition extends DefinitionObject {
	/**
	 * Returns the value of the '<em><b>Name Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Space</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Space</em>' containment reference.
	 * @see #setNameSpace(Name)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getNameSpaceDefinition_NameSpace()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Name getNameSpace();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.NameSpaceDefinition#getNameSpace <em>Name Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space</em>' containment reference.
	 * @see #getNameSpace()
	 * @generated
	 */
	void setNameSpace(Name value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.DefinitionObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getNameSpaceDefinition_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DefinitionObject> getBody();

	/**
	 * Returns the value of the '<em><b>Name Space Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Space Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Space Type</em>' containment reference.
	 * @see #setNameSpaceType(NameSpaceType)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getNameSpaceDefinition_NameSpaceType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NameSpaceType getNameSpaceType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.NameSpaceDefinition#getNameSpaceType <em>Name Space Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space Type</em>' containment reference.
	 * @see #getNameSpaceType()
	 * @generated
	 */
	void setNameSpaceType(NameSpaceType value);

} // NameSpaceDefinition
