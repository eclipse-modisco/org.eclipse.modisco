/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.smm.quality;

import org.eclipse.emf.common.util.EList;

import org.eclipse.modisco.omg.smm.Scope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.smm.quality.QualityScope#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.modisco.smm.quality.QualityScope#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.smm.quality.SmmqualityPackage#getQualityScope()
 * @model
 * @generated
 */
public interface QualityScope extends Scope {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.smm.quality.QualityScope}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.smm.quality.QualityScope#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.eclipse.modisco.smm.quality.SmmqualityPackage#getQualityScope_Children()
	 * @see org.eclipse.modisco.smm.quality.QualityScope#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<QualityScope> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.modisco.smm.quality.QualityScope#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(QualityScope)
	 * @see org.eclipse.modisco.smm.quality.SmmqualityPackage#getQualityScope_Parent()
	 * @see org.eclipse.modisco.smm.quality.QualityScope#getChildren
	 * @model opposite="children"
	 * @generated
	 */
	QualityScope getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.smm.quality.QualityScope#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(QualityScope value);

} // QualityScope
