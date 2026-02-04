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
 * A representation of the model object '<em><b>Port Component Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The port-component-ref element declares a client dependency
 *         on the container for resolving a Service Endpoint Interface
 *         to a WSDL port. It optionally associates the Service Endpoint
 *         Interface with a particular port-component. This is only used
 *         by the container for a Service.getPort(Class) method call.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.PortComponentRefType#getServiceEndpointInterface <em>Service Endpoint Interface</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.PortComponentRefType#getEnableMtom <em>Enable Mtom</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.PortComponentRefType#getMtomThreshold <em>Mtom Threshold</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.PortComponentRefType#getAddressing <em>Addressing</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.PortComponentRefType#getRespectBinding <em>Respect Binding</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.PortComponentRefType#getPortComponentLink <em>Port Component Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.PortComponentRefType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getPortComponentRefType()
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
	 *             The service-endpoint-interface element defines a fully qualified
	 *             Java class that represents the Service Endpoint Interface of a
	 *             WSDL port.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Endpoint Interface</em>' containment reference.
	 * @see #setServiceEndpointInterface(FullyQualifiedClassType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getPortComponentRefType_ServiceEndpointInterface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='service-endpoint-interface' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	FullyQualifiedClassType getServiceEndpointInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.PortComponentRefType#getServiceEndpointInterface <em>Service Endpoint Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Endpoint Interface</em>' containment reference.
	 * @see #getServiceEndpointInterface()
	 * @generated
	 */
	void setServiceEndpointInterface(FullyQualifiedClassType value);

	/**
	 * Returns the value of the '<em><b>Enable Mtom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Used to enable or disable SOAP MTOM/XOP mechanism on the client
	 *             side for a port-component. 
	 *             
	 *             Not to be specified for JAX-RPC runtime
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enable Mtom</em>' containment reference.
	 * @see #setEnableMtom(TrueFalseType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getPortComponentRefType_EnableMtom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enable-mtom' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TrueFalseType getEnableMtom();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.PortComponentRefType#getEnableMtom <em>Enable Mtom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Mtom</em>' containment reference.
	 * @see #getEnableMtom()
	 * @generated
	 */
	void setEnableMtom(TrueFalseType value);

	/**
	 * Returns the value of the '<em><b>Mtom Threshold</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             When MTOM is enabled, binary data above this size in bytes
	 *             should be XOP encoded or sent as attachment. Default value is 0.
	 *             
	 *             Not to be specified for JAX-RPC runtime
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mtom Threshold</em>' containment reference.
	 * @see #setMtomThreshold(XsdNonNegativeIntegerType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getPortComponentRefType_MtomThreshold()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mtom-threshold' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdNonNegativeIntegerType getMtomThreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.PortComponentRefType#getMtomThreshold <em>Mtom Threshold</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mtom Threshold</em>' containment reference.
	 * @see #getMtomThreshold()
	 * @generated
	 */
	void setMtomThreshold(XsdNonNegativeIntegerType value);

	/**
	 * Returns the value of the '<em><b>Addressing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             This specifies the WS-Addressing requirements for a JAX-WS
	 *             web service. It corresponds to javax.xml.ws.soap.Addressing
	 *             annotation or its feature javax.xml.ws.soap.AddressingFeature.
	 *             
	 *             See the addressingType for more information.
	 *             
	 *             Not to be specified for JAX-RPC runtime
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addressing</em>' containment reference.
	 * @see #setAddressing(AddressingType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getPortComponentRefType_Addressing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addressing' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	AddressingType getAddressing();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.PortComponentRefType#getAddressing <em>Addressing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addressing</em>' containment reference.
	 * @see #getAddressing()
	 * @generated
	 */
	void setAddressing(AddressingType value);

	/**
	 * Returns the value of the '<em><b>Respect Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             Corresponds to the javax.xml.ws.RespectBinding annotation
	 *             or its corresponding javax.xml.ws.RespectBindingFeature web
	 *             service feature. This is used to control whether a JAX-WS
	 *             implementation must respect/honor the contents of the
	 *             wsdl:binding in the WSDL that is associated with the service.
	 *             
	 *             Not to be specified for JAX-RPC runtime
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Respect Binding</em>' containment reference.
	 * @see #setRespectBinding(RespectBindingType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getPortComponentRefType_RespectBinding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='respect-binding' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	RespectBindingType getRespectBinding();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.PortComponentRefType#getRespectBinding <em>Respect Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Respect Binding</em>' containment reference.
	 * @see #getRespectBinding()
	 * @generated
	 */
	void setRespectBinding(RespectBindingType value);

	/**
	 * Returns the value of the '<em><b>Port Component Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *             The port-component-link element links a port-component-ref
	 *             to a specific port-component required to be made available
	 *             by a service reference.
	 *             
	 *             The value of a port-component-link must be the
	 *             port-component-name of a port-component in the same module
	 *             or another module in the same application unit. The syntax
	 *             for specification follows the syntax defined for ejb-link
	 *             in the EJB 2.0 specification.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Component Link</em>' containment reference.
	 * @see #setPortComponentLink(org.eclipse.modisco.jee.ejbjar.EjbJar31.String)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getPortComponentRefType_PortComponentLink()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='port-component-link' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	org.eclipse.modisco.jee.ejbjar.EjbJar31.String getPortComponentLink();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.PortComponentRefType#getPortComponentLink <em>Port Component Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Component Link</em>' containment reference.
	 * @see #getPortComponentLink()
	 * @generated
	 */
	void setPortComponentLink(org.eclipse.modisco.jee.ejbjar.EjbJar31.String value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package#getPortComponentRefType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.PortComponentRefType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // PortComponentRefType
