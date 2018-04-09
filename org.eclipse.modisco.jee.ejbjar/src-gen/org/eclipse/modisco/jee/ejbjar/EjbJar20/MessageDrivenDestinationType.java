/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v1.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar20;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Driven Destination Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType#getDestinationType <em>Destination Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType#getSubscriptionDurability <em>Subscription Durability</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenDestinationType()
 * @model extendedMetaData="name='message-driven-destination_._type' kind='elementOnly'"
 * @generated
 */
public interface MessageDrivenDestinationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Destination Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Type</em>' containment reference.
	 * @see #setDestinationType(DestinationTypeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenDestinationType_DestinationType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='destination-type' namespace='##targetNamespace'"
	 * @generated
	 */
	DestinationTypeType getDestinationType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType#getDestinationType <em>Destination Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Type</em>' containment reference.
	 * @see #getDestinationType()
	 * @generated
	 */
	void setDestinationType(DestinationTypeType value);

	/**
	 * Returns the value of the '<em><b>Subscription Durability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Durability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Durability</em>' containment reference.
	 * @see #setSubscriptionDurability(SubscriptionDurabilityType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenDestinationType_SubscriptionDurability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subscription-durability' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscriptionDurabilityType getSubscriptionDurability();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType#getSubscriptionDurability <em>Subscription Durability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Durability</em>' containment reference.
	 * @see #getSubscriptionDurability()
	 * @generated
	 */
	void setSubscriptionDurability(SubscriptionDurabilityType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenDestinationType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // MessageDrivenDestinationType
