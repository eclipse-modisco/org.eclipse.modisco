/**
 *   Copyright (c) 2010, 2019 Mia-Software and others.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp23;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Listener Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.ListenerClass#getListenerClass <em>Listener Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getListenerClass()
 * @model extendedMetaData="name='listener-class' kind='elementOnly'"
 * @generated
 */
public interface ListenerClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Listener Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listener Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listener Class</em>' containment reference.
	 * @see #setListenerClass(ListenerClassType)
	 * @see org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package#getListenerClass_ListenerClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='listener-class' namespace='##targetNamespace'"
	 * @generated
	 */
	ListenerClassType getListenerClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp23.ListenerClass#getListenerClass <em>Listener Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listener Class</em>' containment reference.
	 * @see #getListenerClass()
	 * @generated
	 */
	void setListenerClass(ListenerClassType value);

} // ListenerClass
