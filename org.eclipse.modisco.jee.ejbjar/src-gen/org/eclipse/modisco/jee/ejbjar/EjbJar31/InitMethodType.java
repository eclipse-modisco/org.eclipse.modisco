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
 * A representation of the model object '<em><b>Init Method Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.InitMethodType#getCreateMethod <em>Create Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.InitMethodType#getBeanMethod <em>Bean Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.InitMethodType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getInitMethodType()
 * @model extendedMetaData="name='init-methodType' kind='elementOnly'"
 * @generated
 */
public interface InitMethodType extends EObject {
	/**
	 * Returns the value of the '<em><b>Create Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Method</em>' containment reference.
	 * @see #setCreateMethod(NamedMethodType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getInitMethodType_CreateMethod()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='create-method' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	NamedMethodType getCreateMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.InitMethodType#getCreateMethod <em>Create Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Method</em>' containment reference.
	 * @see #getCreateMethod()
	 * @generated
	 */
	void setCreateMethod(NamedMethodType value);

	/**
	 * Returns the value of the '<em><b>Bean Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bean Method</em>' containment reference.
	 * @see #setBeanMethod(NamedMethodType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getInitMethodType_BeanMethod()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bean-method' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	NamedMethodType getBeanMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.InitMethodType#getBeanMethod <em>Bean Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean Method</em>' containment reference.
	 * @see #getBeanMethod()
	 * @generated
	 */
	void setBeanMethod(NamedMethodType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getInitMethodType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.InitMethodType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // InitMethodType
