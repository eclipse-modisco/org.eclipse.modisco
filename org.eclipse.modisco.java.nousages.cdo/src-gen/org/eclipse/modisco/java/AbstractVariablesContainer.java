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
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 * *******************************************************************************
 */
package org.eclipse.modisco.java;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.VariableDeclarationFragment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Variables Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.AbstractVariablesContainer#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.AbstractVariablesContainer#getFragments <em>Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getAbstractVariablesContainer()
 * @model abstract="true"
 * @generated
 */
public interface AbstractVariablesContainer extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeAccess)
	 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getAbstractVariablesContainer_Type()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	TypeAccess getType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.AbstractVariablesContainer#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeAccess value);

	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.VariableDeclarationFragment}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.VariableDeclarationFragment#getVariablesContainer <em>Variables Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getAbstractVariablesContainer_Fragments()
	 * @see org.eclipse.modisco.java.VariableDeclarationFragment#getVariablesContainer
	 * @model opposite="variablesContainer" containment="true"
	 * @generated
	 */
	EList<VariableDeclarationFragment> getFragments();

} // AbstractVariablesContainer
