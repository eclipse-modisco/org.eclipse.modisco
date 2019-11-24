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

import java.lang.String;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Handler Chain Type</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *         The handler-chain element defines the handlerchain. 
 *         Handlerchain can be defined such that the handlers in the
 *         handlerchain operate,all ports of a service, on a specific
 *         port or on a list of protocol-bindings. The choice of elements
 *         service-name-pattern, port-name-pattern and protocol-bindings
 *         are used to specify whether the handlers in handler-chain are
 *         for a service, port or protocol binding. If none of these 
 *         choices are specified with the handler-chain element then the
 *         handlers specified in the handler-chain will be applied on 
 *         everything.
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getServiceNamePattern <em>Service Name Pattern</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getPortNamePattern <em>Port Name Pattern</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getProtocolBindings <em>Protocol Bindings</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getHandler <em>Handler</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getHandlerChainType()
 * @model extendedMetaData="name='handler-chainType' kind='elementOnly'"
 * @generated
 */
public interface HandlerChainType extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name Pattern</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name Pattern</em>' attribute.
	 * @see #setServiceNamePattern(String)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getHandlerChainType_ServiceNamePattern()
	 * @model dataType="org.eclipse.modisco.jee.webapp.webapp30.QnamePattern"
	 *        extendedMetaData="kind='element' name='service-name-pattern' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	String getServiceNamePattern();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getServiceNamePattern <em>Service Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Service Name Pattern</em>' attribute.
	 * @see #getServiceNamePattern()
	 * @generated
	 */
	void setServiceNamePattern(String value);

	/**
	 * Returns the value of the '<em><b>Port Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Name Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Name Pattern</em>' attribute.
	 * @see #setPortNamePattern(String)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getHandlerChainType_PortNamePattern()
	 * @model dataType="org.eclipse.modisco.jee.webapp.webapp30.QnamePattern"
	 *        extendedMetaData="kind='element' name='port-name-pattern' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	String getPortNamePattern();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getPortNamePattern <em>Port Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Port Name Pattern</em>' attribute.
	 * @see #getPortNamePattern()
	 * @generated
	 */
	void setPortNamePattern(String value);

	/**
	 * Returns the value of the '<em><b>Protocol Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol Bindings</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Bindings</em>' attribute.
	 * @see #setProtocolBindings(List)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getHandlerChainType_ProtocolBindings()
	 * @model dataType="org.eclipse.modisco.jee.webapp.webapp30.ProtocolBindingListType" many="false"
	 *        extendedMetaData="kind='element' name='protocol-bindings' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	List<String> getProtocolBindings();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getProtocolBindings <em>Protocol Bindings</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Protocol Bindings</em>' attribute.
	 * @see #getProtocolBindings()
	 * @generated
	 */
	void setProtocolBindings(List<String> value);

	/**
	 * Returns the value of the '<em><b>Handler</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.eclipse.modisco.jee.webapp.webapp30.HandlerType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Handler</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getHandlerChainType_Handler()
	 * @model containment="true" required="true" extendedMetaData=
	 *        "kind='element' name='handler' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HandlerType> getHandler();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package#getHandlerChainType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp30.HandlerChainType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // HandlerChainType
