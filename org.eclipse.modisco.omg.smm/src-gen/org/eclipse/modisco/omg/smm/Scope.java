/**
 * Copyright (c) 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.omg.smm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.Scope#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Scope#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Scope#getRecognizerQuery <em>Recognizer Query</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.Scope#getBreakCondition <em>Break Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.omg.smm.SmmPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends AbstractMeasureElement {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getScope_Class()
	 * @model required="true"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Scope#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getScope_Elements()
	 * @model
	 * @generated
	 */
	EList<EObject> getElements();

	/**
	 * Returns the value of the '<em><b>Recognizer Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recognizer Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recognizer Query</em>' reference.
	 * @see #setRecognizerQuery(Operation)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getScope_RecognizerQuery()
	 * @model
	 * @generated
	 */
	Operation getRecognizerQuery();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Scope#getRecognizerQuery <em>Recognizer Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recognizer Query</em>' reference.
	 * @see #getRecognizerQuery()
	 * @generated
	 */
	void setRecognizerQuery(Operation value);

	/**
	 * Returns the value of the '<em><b>Break Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Break Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break Condition</em>' reference.
	 * @see #setBreakCondition(Operation)
	 * @see org.eclipse.modisco.omg.smm.SmmPackage#getScope_BreakCondition()
	 * @model
	 * @generated
	 */
	Operation getBreakCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.omg.smm.Scope#getBreakCondition <em>Break Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Break Condition</em>' reference.
	 * @see #getBreakCondition()
	 * @generated
	 */
	void setBreakCondition(Operation value);

} // Scope
