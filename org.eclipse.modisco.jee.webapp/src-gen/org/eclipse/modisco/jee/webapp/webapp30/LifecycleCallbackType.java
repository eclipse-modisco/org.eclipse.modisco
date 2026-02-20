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
package org.eclipse.modisco.jee.webapp.webapp30;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifecycle Callback Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The lifecycle-callback type specifies a method on a
 *         class to be called when a lifecycle event occurs.
 *         Note that each class may have only one lifecycle callback
 *         method for any given event and that the method may not
 *         be overloaded.
 *         
 *         If the lifefycle-callback-class element is missing then
 *         the class defining the callback is assumed to be the
 *         component class in scope at the place in the descriptor
 *         in which the callback definition appears.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.LifecycleCallbackType#getLifecycleCallbackClass <em>Lifecycle Callback Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.LifecycleCallbackType#getLifecycleCallbackMethod <em>Lifecycle Callback Method</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getLifecycleCallbackType()
 * @model extendedMetaData="name='lifecycle-callbackType' kind='elementOnly'"
 * @generated
 */
public interface LifecycleCallbackType extends EObject {
	/**
	 * Returns the value of the '<em><b>Lifecycle Callback Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifecycle Callback Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle Callback Class</em>' containment reference.
	 * @see #setLifecycleCallbackClass(FullyQualifiedClassType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getLifecycleCallbackType_LifecycleCallbackClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lifecycle-callback-class' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	FullyQualifiedClassType getLifecycleCallbackClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.LifecycleCallbackType#getLifecycleCallbackClass <em>Lifecycle Callback Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle Callback Class</em>' containment reference.
	 * @see #getLifecycleCallbackClass()
	 * @generated
	 */
	void setLifecycleCallbackClass(FullyQualifiedClassType value);

	/**
	 * Returns the value of the '<em><b>Lifecycle Callback Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifecycle Callback Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle Callback Method</em>' containment reference.
	 * @see #setLifecycleCallbackMethod(JavaIdentifierType)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getLifecycleCallbackType_LifecycleCallbackMethod()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lifecycle-callback-method' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	JavaIdentifierType getLifecycleCallbackMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.LifecycleCallbackType#getLifecycleCallbackMethod <em>Lifecycle Callback Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle Callback Method</em>' containment reference.
	 * @see #getLifecycleCallbackMethod()
	 * @generated
	 */
	void setLifecycleCallbackMethod(JavaIdentifierType value);

} // LifecycleCallbackType
