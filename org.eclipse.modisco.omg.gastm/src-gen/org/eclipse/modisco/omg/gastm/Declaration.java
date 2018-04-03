/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.Declaration#getDefRef <em>Def Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.Declaration#getIdentifierName <em>Identifier Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.Declaration#getDeclarationType <em>Declaration Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface Declaration extends DeclarationOrDefinition {
	/**
	 * Returns the value of the '<em><b>Def Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def Ref</em>' reference.
	 * @see #setDefRef(Definition)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDeclaration_DefRef()
	 * @model required="true"
	 * @generated
	 */
	Definition getDefRef();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.Declaration#getDefRef <em>Def Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def Ref</em>' reference.
	 * @see #getDefRef()
	 * @generated
	 */
	void setDefRef(Definition value);

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
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDeclaration_IdentifierName()
	 * @model containment="true"
	 * @generated
	 */
	Name getIdentifierName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.Declaration#getIdentifierName <em>Identifier Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier Name</em>' containment reference.
	 * @see #getIdentifierName()
	 * @generated
	 */
	void setIdentifierName(Name value);

	/**
	 * Returns the value of the '<em><b>Declaration Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration Type</em>' containment reference.
	 * @see #setDeclarationType(TypeReference)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDeclaration_DeclarationType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeReference getDeclarationType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.Declaration#getDeclarationType <em>Declaration Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration Type</em>' containment reference.
	 * @see #getDeclarationType()
	 * @generated
	 */
	void setDeclarationType(TypeReference value);

} // Declaration
