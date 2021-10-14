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
import org.eclipse.modisco.java.AbstractVariablesContainer;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.Modifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.VariableDeclarationExpression#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.VariableDeclarationExpression#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getVariableDeclarationExpression()
 * @model
 * @generated
 */
public interface VariableDeclarationExpression extends Expression, AbstractVariablesContainer {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.java.Modifier#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference.
	 * @see #setModifier(Modifier)
	 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getVariableDeclarationExpression_Modifier()
	 * @see org.eclipse.modisco.java.Modifier#getVariableDeclarationExpression
	 * @model opposite="variableDeclarationExpression" containment="true" ordered="false"
	 * @generated
	 */
	Modifier getModifier();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.java.VariableDeclarationExpression#getModifier <em>Modifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modifier</em>' containment reference.
	 * @see #getModifier()
	 * @generated
	 */
	void setModifier(Modifier value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.java.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage#getVariableDeclarationExpression_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

} // VariableDeclarationExpression
