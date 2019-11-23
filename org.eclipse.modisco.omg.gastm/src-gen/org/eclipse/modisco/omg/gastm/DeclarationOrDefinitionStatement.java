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
 * A representation of the model object '<em><b>Declaration Or Definition Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.DeclarationOrDefinitionStatement#getDeclOrDefn <em>Decl Or Defn</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDeclarationOrDefinitionStatement()
 * @model
 * @generated
 */
public interface DeclarationOrDefinitionStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Decl Or Defn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decl Or Defn</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decl Or Defn</em>' containment reference.
	 * @see #setDeclOrDefn(DefinitionObject)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getDeclarationOrDefinitionStatement_DeclOrDefn()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DefinitionObject getDeclOrDefn();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.DeclarationOrDefinitionStatement#getDeclOrDefn <em>Decl Or Defn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decl Or Defn</em>' containment reference.
	 * @see #getDeclOrDefn()
	 * @generated
	 */
	void setDeclOrDefn(DefinitionObject value);

} // DeclarationOrDefinitionStatement
