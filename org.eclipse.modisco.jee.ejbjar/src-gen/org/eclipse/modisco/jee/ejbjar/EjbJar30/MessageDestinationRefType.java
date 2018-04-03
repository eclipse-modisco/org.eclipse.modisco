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
package org.eclipse.modisco.jee.ejbjar.EjbJar30;

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
 * 		  - an optional message destination type
 * 		  - an optional specification as to whether
 * 		    the destination is used for
 * 		    consuming or producing messages, or both.
 * 		    if not specified, "both" is assumed.
 * 		  - an optional link to the message destination
 * 		  - optional injection targets
 * 
 * 	  The message destination type must be supplied unless an
 * 	  injection target is specified, in which case the type
 * 	  of the target is used.  If both are specified, the type
 * 	  must be assignment compatible with the type of the injection
 * 	  target.
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
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMessageDestinationRefName <em>Message Destination Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMessageDestinationType <em>Message Destination Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMessageDestinationUsage <em>Message Destination Usage</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMessageDestinationLink <em>Message Destination Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getInjectionTarget <em>Injection Target</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDestinationRefType()
 * @model extendedMetaData="name='message-destination-refType' kind='elementOnly'"
 * @generated
 */
public interface MessageDestinationRefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDestinationRefType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/javaee'"
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDestinationRefType_MessageDestinationRefName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='message-destination-ref-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	JndiNameType getMessageDestinationRefName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMessageDestinationRefName <em>Message Destination Ref Name</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDestinationRefType_MessageDestinationType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='message-destination-type' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	MessageDestinationTypeType getMessageDestinationType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMessageDestinationType <em>Message Destination Type</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDestinationRefType_MessageDestinationUsage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='message-destination-usage' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	MessageDestinationUsageType getMessageDestinationUsage();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMessageDestinationUsage <em>Message Destination Usage</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDestinationRefType_MessageDestinationLink()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='message-destination-link' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	MessageDestinationLinkType getMessageDestinationLink();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMessageDestinationLink <em>Message Destination Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Destination Link</em>' containment reference.
	 * @see #getMessageDestinationLink()
	 * @generated
	 */
	void setMessageDestinationLink(MessageDestinationLinkType value);

	/**
	 * Returns the value of the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 	    <![CDATA[
	 * 
	 * 	      A product specific name that this resource should be
	 * 	      mapped to.  The name of this resource, as defined by the
	 * 	      resource's name element or defaulted, is a name that is
	 * 	      local to the application component using the resource.
	 * 	      (It's a name in the JNDI java:comp/env namespace.)  Many
	 * 	      application servers provide a way to map these local
	 * 	      names to names of resources known to the application
	 * 	      server.  This mapped name is often a global JNDI name,
	 * 	      but may be a name of any form.
	 * 
	 * 	      Application servers are not required to support any
	 * 	      particular form or type of mapped name, nor the ability
	 * 	      to use mapped names.  The mapped name is
	 * 	      product-dependent and often installation-dependent.  No
	 * 	      use of a mapped name is portable.
	 * 
	 * 	      ]]>
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapped Name</em>' containment reference.
	 * @see #setMappedName(XsdStringType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDestinationRefType_MappedName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mapped-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdStringType getMappedName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getMappedName <em>Mapped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Name</em>' containment reference.
	 * @see #getMappedName()
	 * @generated
	 */
	void setMappedName(XsdStringType value);

	/**
	 * Returns the value of the '<em><b>Injection Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.InjectionTargetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Injection Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injection Target</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDestinationRefType_InjectionTarget()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='injection-target' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<InjectionTargetType> getInjectionTarget();

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDestinationRefType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // MessageDestinationRefType
