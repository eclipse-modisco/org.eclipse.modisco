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
package org.eclipse.modisco.jee.ejbjar.EjbJar30;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Ref Handler Chains Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 *       The handler-chains element defines the handlerchains associated with this
 *       service or service endpoint.
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainsType#getHandlerChain <em>Handler Chain</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainsType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getServiceRefHandlerChainsType()
 * @model extendedMetaData="name='service-ref_handler-chainsType' kind='elementOnly'"
 * @generated
 */
public interface ServiceRefHandlerChainsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Handler Chain</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler Chain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler Chain</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getServiceRefHandlerChainsType_HandlerChain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='handler-chain' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<ServiceRefHandlerChainType> getHandlerChain();

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getServiceRefHandlerChainsType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefHandlerChainsType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ServiceRefHandlerChainsType
