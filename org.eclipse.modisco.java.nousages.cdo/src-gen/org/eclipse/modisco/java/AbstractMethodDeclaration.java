/**
 * *******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 * *******************************************************************************
 */
package org.eclipse.modisco.java;

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.java.Block;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.AbstractMethodDeclaration#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.AbstractMethodDeclaration#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.AbstractMethodDeclaration#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.AbstractMethodDeclaration#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getAbstractMethodDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface AbstractMethodDeclaration extends BodyDeclaration {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Block)
	 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getAbstractMethodDeclaration_Body()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Block getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.AbstractMethodDeclaration#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Block value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.SingleVariableDeclaration}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.SingleVariableDeclaration#getMethodDeclaration <em>Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getAbstractMethodDeclaration_Parameters()
	 * @see org.eclipse.modisco.java.SingleVariableDeclaration#getMethodDeclaration
	 * @model opposite="methodDeclaration" containment="true"
	 * @generated
	 */
	EList<SingleVariableDeclaration> getParameters();

	/**
	 * Returns the value of the '<em><b>Thrown Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.TypeAccess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thrown Exceptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thrown Exceptions</em>' containment reference list.
	 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getAbstractMethodDeclaration_ThrownExceptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeAccess> getThrownExceptions();

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.TypeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getAbstractMethodDeclaration_TypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeParameter> getTypeParameters();

} // AbstractMethodDeclaration
