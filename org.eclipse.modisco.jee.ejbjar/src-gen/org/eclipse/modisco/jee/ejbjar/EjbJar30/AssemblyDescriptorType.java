/**
 * Copyright (c) 2010, 2019 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar30;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Descriptor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The assembly-descriptorType defines
 * 	application-assembly information.
 * 
 * 	The application-assembly information consists of the
 * 	following parts: the definition of security roles, the
 * 	definition of method permissions, the definition of
 * 	transaction attributes for enterprise beans with
 * 	container-managed transaction demarcation, the definition
 *         of interceptor bindings, a list of
 * 	methods to be excluded from being invoked, and a list of
 *         exception types that should be treated as application exceptions.
 * 
 * 	All the parts are optional in the sense that they are
 * 	omitted if the lists represented by them are empty.
 * 
 * 	Providing an assembly-descriptor in the deployment
 * 	descriptor is optional for the ejb-jar file producer.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getSecurityRole <em>Security Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getMethodPermission <em>Method Permission</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getContainerTransaction <em>Container Transaction</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getInterceptorBinding <em>Interceptor Binding</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getMessageDestination <em>Message Destination</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getExcludeList <em>Exclude List</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getApplicationException <em>Application Exception</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getAssemblyDescriptorType()
 * @model extendedMetaData="name='assembly-descriptorType' kind='elementOnly'"
 * @generated
 */
public interface AssemblyDescriptorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Role</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getAssemblyDescriptorType_SecurityRole()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security-role' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<SecurityRoleType> getSecurityRole();

	/**
	 * Returns the value of the '<em><b>Method Permission</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Permission</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Permission</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getAssemblyDescriptorType_MethodPermission()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='method-permission' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<MethodPermissionType> getMethodPermission();

	/**
	 * Returns the value of the '<em><b>Container Transaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ContainerTransactionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Transaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Transaction</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getAssemblyDescriptorType_ContainerTransaction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='container-transaction' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<ContainerTransactionType> getContainerTransaction();

	/**
	 * Returns the value of the '<em><b>Interceptor Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interceptor Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interceptor Binding</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getAssemblyDescriptorType_InterceptorBinding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interceptor-binding' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<InterceptorBindingType> getInterceptorBinding();

	/**
	 * Returns the value of the '<em><b>Message Destination</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Destination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Destination</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getAssemblyDescriptorType_MessageDestination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='message-destination' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<MessageDestinationType> getMessageDestination();

	/**
	 * Returns the value of the '<em><b>Exclude List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude List</em>' containment reference.
	 * @see #setExcludeList(ExcludeListType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getAssemblyDescriptorType_ExcludeList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude-list' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	ExcludeListType getExcludeList();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getExcludeList <em>Exclude List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude List</em>' containment reference.
	 * @see #getExcludeList()
	 * @generated
	 */
	void setExcludeList(ExcludeListType value);

	/**
	 * Returns the value of the '<em><b>Application Exception</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Exception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Exception</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getAssemblyDescriptorType_ApplicationException()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='application-exception' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<ApplicationExceptionType> getApplicationException();

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getAssemblyDescriptorType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // AssemblyDescriptorType
