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
package org.eclipse.modisco.jee.webapp.webapp24;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Destination Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 	<![CDATA[
 * 
 * 	  The message-destination-ref element contains a declaration
 * 	  of Deployment Component's reference to a message destination
 * 	  associated with a resource in Deployment Component's
 * 	  environment. It consists of:
 * 
 * 		  - an optional description
 * 		  - the message destination reference name
 * 		  - the message destination type
 * 		  - a specification as to whether the
 * 		    destination is used for
 * 		    consuming or producing messages, or both
 * 		  - a link to the message destination
 * 
 * 	  Examples:
 * 
 * 	  <message-destination-ref>
 * 		  <message-destination-ref-name>jms/StockQueue
 * 		  </message-destination-ref-name>
 * 		  <message-destination-type>javax.jms.Queue
 * 		  </message-destination-type>
 * 		  <message-destination-usage>Consumes
 * 		  </message-destination-usage>
 * 		  <message-destination-link>CorporateStocks
 * 		  </message-destination-link>
 * 	  </message-destination-ref>
 * 
 * 	  ]]>
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getMessageDestinationRefName <em>Message Destination Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getMessageDestinationType <em>Message Destination Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getMessageDestinationUsage <em>Message Destination Usage</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getMessageDestinationLink <em>Message Destination Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getMessageDestinationRefType()
 * @model extendedMetaData="name='message-destination-refType' kind='elementOnly'"
 * @generated
 */
public interface MessageDestinationRefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.webapp.webapp24.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getMessageDestinationRefType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Message Destination Ref Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The message-destination-ref-name element specifies
	 * 	    the name of a message destination reference; its
	 * 	    value is the environment entry name used in
	 * 	    Deployment Component code.  The name is a JNDI name
	 * 	    relative to the java:comp/env context and must be
	 * 	    unique within an ejb-jar (for enterprise beans) or a
	 * 	    Deployment File (for others).
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Destination Ref Name</em>' containment reference.
	 * @see #setMessageDestinationRefName(JndiNameType)
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getMessageDestinationRefType_MessageDestinationRefName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='message-destination-ref-name' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	JndiNameType getMessageDestinationRefName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getMessageDestinationRefName <em>Message Destination Ref Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Destination Ref Name</em>' containment reference.
	 * @see #getMessageDestinationRefName()
	 * @generated
	 */
	void setMessageDestinationRefName(JndiNameType value);

	/**
	 * Returns the value of the '<em><b>Message Destination Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Destination Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Destination Type</em>' containment reference.
	 * @see #setMessageDestinationType(MessageDestinationTypeType)
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getMessageDestinationRefType_MessageDestinationType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='message-destination-type' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	MessageDestinationTypeType getMessageDestinationType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getMessageDestinationType <em>Message Destination Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Destination Type</em>' containment reference.
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	void setMessageDestinationType(MessageDestinationTypeType value);

	/**
	 * Returns the value of the '<em><b>Message Destination Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Destination Usage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Destination Usage</em>' containment reference.
	 * @see #setMessageDestinationUsage(MessageDestinationUsageType)
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getMessageDestinationRefType_MessageDestinationUsage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='message-destination-usage' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	MessageDestinationUsageType getMessageDestinationUsage();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getMessageDestinationUsage <em>Message Destination Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Destination Usage</em>' containment reference.
	 * @see #getMessageDestinationUsage()
	 * @generated
	 */
	void setMessageDestinationUsage(MessageDestinationUsageType value);

	/**
	 * Returns the value of the '<em><b>Message Destination Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Destination Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Destination Link</em>' containment reference.
	 * @see #setMessageDestinationLink(MessageDestinationLinkType)
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getMessageDestinationRefType_MessageDestinationLink()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='message-destination-link' namespace='http://java.sun.com/xml/ns/j2ee'"
	 * @generated
	 */
	MessageDestinationLinkType getMessageDestinationLink();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getMessageDestinationLink <em>Message Destination Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Destination Link</em>' containment reference.
	 * @see #getMessageDestinationLink()
	 * @generated
	 */
	void setMessageDestinationLink(MessageDestinationLinkType value);

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
	 * @see org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package#getMessageDestinationRefType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationRefType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // MessageDestinationRefType
