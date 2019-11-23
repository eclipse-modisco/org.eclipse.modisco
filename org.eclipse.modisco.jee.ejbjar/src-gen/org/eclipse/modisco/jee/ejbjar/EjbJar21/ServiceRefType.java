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
package org.eclipse.modisco.jee.ejbjar.EjbJar21;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The service-ref element declares a reference to a Web
 * 	service. It contains optional description, display name and
 * 	icons, a declaration of the required Service interface,
 * 	an optional WSDL document location, an optional set
 * 	of JAX-RPC mappings, an optional QName for the service element,
 * 	an optional set of Service Endpoint Interfaces to be resolved
 * 	by the container to a WSDL port, and an optional set of handlers.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getServiceRefName <em>Service Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getServiceInterface <em>Service Interface</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getWsdlFile <em>Wsdl File</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getJaxrpcMappingFile <em>Jaxrpc Mapping File</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getServiceQname <em>Service Qname</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getPortComponentRef <em>Port Component Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getHandler <em>Handler</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getServiceRefType()
 * @model extendedMetaData="name='service-refType' kind='elementOnly'"
 * @generated
 */
public interface ServiceRefType extends EObject {
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getServiceRefType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar21.DisplayNameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getServiceRefType_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<DisplayNameType> getDisplayName();

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar21.IconType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getServiceRefType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='icon' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<IconType> getIcon();

	/**
	 * Returns the value of the '<em><b>Service Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The service-ref-name element declares logical name that the
	 * 	    components in the module use to look up the Web service. It
	 * 	    is recommended that all service reference names start with
	 * 	    "service/".
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Ref Name</em>' containment reference.
	 * @see #setServiceRefName(JndiNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getServiceRefType_ServiceRefName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='service-ref-name' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	JndiNameType getServiceRefName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getServiceRefName <em>Service Ref Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Ref Name</em>' containment reference.
	 * @see #getServiceRefName()
	 * @generated
	 */
	void setServiceRefName(JndiNameType value);

	/**
	 * Returns the value of the '<em><b>Service Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The service-interface element declares the fully qualified class
	 * 	    name of the JAX-RPC Service interface the client depends on.
	 * 	    In most cases the value will be javax.xml.rpc.Service.  A JAX-RPC
	 * 	    generated Service Interface class may also be specified.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Interface</em>' containment reference.
	 * @see #setServiceInterface(FullyQualifiedClassType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getServiceRefType_ServiceInterface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='service-interface' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	FullyQualifiedClassType getServiceInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getServiceInterface <em>Service Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Interface</em>' containment reference.
	 * @see #getServiceInterface()
	 * @generated
	 */
	void setServiceInterface(FullyQualifiedClassType value);

	/**
	 * Returns the value of the '<em><b>Wsdl File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The wsdl-file element contains the URI location of a WSDL
	 * 	    file. The location is relative to the root of the module.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wsdl File</em>' containment reference.
	 * @see #setWsdlFile(XsdAnyURIType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getServiceRefType_WsdlFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wsdl-file' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	XsdAnyURIType getWsdlFile();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getWsdlFile <em>Wsdl File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdl File</em>' containment reference.
	 * @see #getWsdlFile()
	 * @generated
	 */
	void setWsdlFile(XsdAnyURIType value);

	/**
	 * Returns the value of the '<em><b>Jaxrpc Mapping File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The jaxrpc-mapping-file element contains the name of a file that
	 * 	    describes the JAX-RPC mapping between the Java interaces used by
	 * 	    the application and the WSDL description in the wsdl-file.  The
	 * 	    file name is a relative path within the module file.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jaxrpc Mapping File</em>' containment reference.
	 * @see #setJaxrpcMappingFile(PathType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getServiceRefType_JaxrpcMappingFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jaxrpc-mapping-file' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	PathType getJaxrpcMappingFile();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getJaxrpcMappingFile <em>Jaxrpc Mapping File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jaxrpc Mapping File</em>' containment reference.
	 * @see #getJaxrpcMappingFile()
	 * @generated
	 */
	void setJaxrpcMappingFile(PathType value);

	/**
	 * Returns the value of the '<em><b>Service Qname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The service-qname element declares the specific WSDL service
	 * 	    element that is being refered to.  It is not specified if no
	 * 	    wsdl-file is declared.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Qname</em>' containment reference.
	 * @see #setServiceQname(XsdQNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getServiceRefType_ServiceQname()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='service-qname' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	XsdQNameType getServiceQname();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getServiceQname <em>Service Qname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Qname</em>' containment reference.
	 * @see #getServiceQname()
	 * @generated
	 */
	void setServiceQname(XsdQNameType value);

	/**
	 * Returns the value of the '<em><b>Port Component Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar21.PortComponentRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The port-component-ref element declares a client dependency
	 * 	    on the container for resolving a Service Endpoint Interface
	 * 	    to a WSDL port. It optionally associates the Service Endpoint
	 * 	    Interface with a particular port-component. This is only used
	 * 	    by the container for a Service.getPort(Class) method call.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Component Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getServiceRefType_PortComponentRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='port-component-ref' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<PortComponentRefType> getPortComponentRef();

	/**
	 * Returns the value of the '<em><b>Handler</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefHandlerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    Declares the handler for a port-component. Handlers can
	 * 	    access the init-param name/value pairs using the
	 * 	    HandlerInfo interface. If port-name is not specified, the
	 * 	    handler is assumed to be associated with all ports of the
	 * 	    service.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handler</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getServiceRefType_Handler()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='handler' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<ServiceRefHandlerType> getHandler();

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package#getServiceRefType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.ServiceRefType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ServiceRefType
