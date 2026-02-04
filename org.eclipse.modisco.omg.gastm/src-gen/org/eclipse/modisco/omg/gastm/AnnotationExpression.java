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
 * A representation of the model object '<em><b>Annotation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.AnnotationExpression#getAnnotationType <em>Annotation Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.AnnotationExpression#getMemberValues <em>Member Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getAnnotationExpression()
 * @model
 * @generated
 */
public interface AnnotationExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Annotation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Type</em>' containment reference.
	 * @see #setAnnotationType(TypeReference)
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getAnnotationExpression_AnnotationType()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getAnnotationType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.gastm.AnnotationExpression#getAnnotationType <em>Annotation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Type</em>' containment reference.
	 * @see #getAnnotationType()
	 * @generated
	 */
	void setAnnotationType(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Member Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.omg.gastm.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Values</em>' containment reference list.
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#getAnnotationExpression_MemberValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getMemberValues();

} // AnnotationExpression
