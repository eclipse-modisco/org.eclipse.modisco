/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar31;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concurrent Method Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The concurrent-methodType specifies information about a method
 *         of a bean with container managed concurrency.
 *         
 *         The optional lock element specifies the kind of concurrency 
 *         lock asssociated with the method.
 *         
 *         The optional access-timeout element specifies the amount of
 *         time (in a given time unit) the container should wait for a
 *         concurrency lock before throwing an exception to the client.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrentMethodType#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrentMethodType#getLock <em>Lock</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrentMethodType#getAccessTimeout <em>Access Timeout</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrentMethodType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getConcurrentMethodType()
 * @model extendedMetaData="name='concurrent-methodType' kind='elementOnly'"
 * @generated
 */
public interface ConcurrentMethodType extends EObject {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(NamedMethodType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getConcurrentMethodType_Method()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='method' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	NamedMethodType getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrentMethodType#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(NamedMethodType value);

	/**
	 * Returns the value of the '<em><b>Lock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lock</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock</em>' containment reference.
	 * @see #setLock(ConcurrentLockTypeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getConcurrentMethodType_Lock()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lock' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	ConcurrentLockTypeType getLock();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrentMethodType#getLock <em>Lock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock</em>' containment reference.
	 * @see #getLock()
	 * @generated
	 */
	void setLock(ConcurrentLockTypeType value);

	/**
	 * Returns the value of the '<em><b>Access Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Timeout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Timeout</em>' containment reference.
	 * @see #setAccessTimeout(AccessTimeoutType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getConcurrentMethodType_AccessTimeout()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='access-timeout' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	AccessTimeoutType getAccessTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrentMethodType#getAccessTimeout <em>Access Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Timeout</em>' containment reference.
	 * @see #getAccessTimeout()
	 * @generated
	 */
	void setAccessTimeout(AccessTimeoutType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getConcurrentMethodType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrentMethodType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ConcurrentMethodType
