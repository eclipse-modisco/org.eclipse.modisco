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

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.MethodRefParameter;
import org.eclipse.modisco.java.TypeAccess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.MethodRef#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.MethodRef#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.MethodRef#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.emf.JavaPackage#getMethodRef()
 * @model
 * @generated
 */
public interface MethodRef extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.AbstractMethodDeclaration#getUsagesInDocComments <em>Usages In Doc Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(AbstractMethodDeclaration)
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getMethodRef_Method()
	 * @see org.eclipse.modisco.java.AbstractMethodDeclaration#getUsagesInDocComments
	 * @model opposite="usagesInDocComments" required="true" ordered="false"
	 * @generated
	 */
	AbstractMethodDeclaration getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.MethodRef#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(AbstractMethodDeclaration value);

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
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getMethodRef_Qualifier()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	TypeAccess getQualifier();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.MethodRef#getQualifier <em>Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' containment reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(TypeAccess value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.MethodRefParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.modisco.java.emf.JavaPackage#getMethodRef_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodRefParameter> getParameters();

} // MethodRef
