/**
 * Copyright (c) 2010 Mia-Software.
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Component Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The port-component-ref element declares a client dependency
 * 	on the container for resolving a Service Endpoint Interface
 * 	to a WSDL port. It optionally associates the Service Endpoint
 * 	Interface with a particular port-component. This is only used
 * 	by the container for a Service.getPort(Class) method call.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.PortComponentRefType#getServiceEndpointInterface <em>Service Endpoint Interface</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.PortComponentRefType#getPortComponentLink <em>Port Component Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.PortComponentRefType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getPortComponentRefType()
 * @model extendedMetaData="name='port-component-refType' kind='elementOnly'"
 * @generated
 */
public interface PortComponentRefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Endpoint Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The service-endpoint-interface element defines a fully qualified
	 * 	    Java class that represents the Service Endpoint Interface of a
	 * 	    WSDL port.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Endpoint Interface</em>' containment reference.
	 * @see #setServiceEndpointInterface(FullyQualifiedClassType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getPortComponentRefType_ServiceEndpointInterface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='service-endpoint-interface' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	FullyQualifiedClassType getServiceEndpointInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.PortComponentRefType#getServiceEndpointInterface <em>Service Endpoint Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Endpoint Interface</em>' containment reference.
	 * @see #getServiceEndpointInterface()
	 * @generated
	 */
	void setServiceEndpointInterface(FullyQualifiedClassType value);

	/**
	 * Returns the value of the '<em><b>Port Component Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The port-component-link element links a port-component-ref
	 * 	    to a specific port-component required to be made available
	 * 	    by a service reference.
	 * 
	 * 	    The value of a port-component-link must be the
	 * 	    port-component-name of a port-component in the same module
	 * 	    or another module in the same application unit. The syntax
	 * 	    for specification follows the syntax defined for ejb-link
	 * 	    in the EJB 2.0 specification.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Component Link</em>' containment reference.
	 * @see #setPortComponentLink(org.eclipse.modisco.jee.ejbjar.EjbJar21.String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getPortComponentRefType_PortComponentLink()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='port-component-link' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.ejbjar.EjbJar21.String getPortComponentLink();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.PortComponentRefType#getPortComponentLink <em>Port Component Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Component Link</em>' containment reference.
	 * @see #getPortComponentLink()
	 * @generated
	 */
	void setPortComponentLink(org.eclipse.modisco.jee.ejbjar.EjbJar21.String value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getPortComponentRefType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.PortComponentRefType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // PortComponentRefType
