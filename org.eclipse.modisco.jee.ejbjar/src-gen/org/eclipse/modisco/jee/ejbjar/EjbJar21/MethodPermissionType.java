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
package org.eclipse.modisco.jee.ejbjar.EjbJar21;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Permission Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The method-permissionType specifies that one or more
 * 	security roles are allowed to invoke one or more enterprise
 * 	bean methods. The method-permissionType consists of an
 * 	optional description, a list of security role names or an
 * 	indicator to state that the method is unchecked for
 * 	authorization, and a list of method elements.
 * 
 * 	The security roles used in the method-permissionType
 * 	must be defined in the security-role elements of the
 * 	deployment descriptor, and the methods must be methods
 * 	defined in the enterprise bean's home, component and/or web
 * 	service endpoint interfaces.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType#getUnchecked <em>Unchecked</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getMethodPermissionType()
 * @model extendedMetaData="name='method-permissionType' kind='elementOnly'"
 * @generated
 */
public interface MethodPermissionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar21.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getMethodPermissionType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Role Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar21.RoleNameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Name</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getMethodPermissionType_RoleName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='role-name' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<RoleNameType> getRoleName();

	/**
	 * Returns the value of the '<em><b>Unchecked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	      The unchecked element specifies that a method is
	 * 	      not checked for authorization by the container
	 * 	      prior to invocation of the method.
	 * 
	 * 	    
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unchecked</em>' containment reference.
	 * @see #setUnchecked(EmptyType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getMethodPermissionType_Unchecked()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unchecked' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EmptyType getUnchecked();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType#getUnchecked <em>Unchecked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unchecked</em>' containment reference.
	 * @see #getUnchecked()
	 * @generated
	 */
	void setUnchecked(EmptyType value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getMethodPermissionType_Method()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='method' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<MethodType> getMethod();

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getMethodPermissionType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.MethodPermissionType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // MethodPermissionType
