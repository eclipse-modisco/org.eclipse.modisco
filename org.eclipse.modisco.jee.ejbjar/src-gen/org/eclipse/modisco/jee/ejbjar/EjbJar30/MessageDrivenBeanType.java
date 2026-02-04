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
 * A representation of the model object '<em><b>Message Driven Bean Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 	The message-driven element declares a message-driven
 * 	bean. The declaration consists of:
 * 
 * 	    - an optional description
 * 	    - an optional display name
 * 	    - an optional icon element that contains a small and a large
 * 	      icon file name.
 * 	    - a name assigned to the enterprise bean in
 * 	      the deployment descriptor
 *             - an optional mapped-name element that can be used to provide
 *               vendor-specific deployment information such as the physical
 *               jndi-name of destination from which this message-driven bean
 *               should consume.  This element is not required to be supported
 *               by all implementations.  Any use of this element is non-portable.
 * 	    - the message-driven bean's implementation class
 * 	    - an optional declaration of the bean's messaging
 * 	      type
 *             - an optional declaration of the bean's timeout method.
 * 	    - the optional message-driven bean's transaction management
 *               type. If it is not defined, it is defaulted to Container.
 * 	    - an optional declaration of the bean's
 * 	      message-destination-type
 * 	    - an optional declaration of the bean's
 * 	      message-destination-link
 * 	    - an optional declaration of the message-driven bean's
 * 	      activation configuration properties
 *             - an optional list of the message-driven bean class and/or
 *               superclass around-invoke methods.
 * 	    - an optional declaration of the bean's environment
 * 	      entries
 * 	    - an optional declaration of the bean's EJB references
 * 	    - an optional declaration of the bean's local EJB
 * 	      references
 * 	    - an optional declaration of the bean's web service
 * 	      references
 * 	    - an optional declaration of the security
 * 	      identity to be used for the execution of the bean's
 * 	      methods
 * 	    - an optional declaration of the bean's
 * 	      resource manager connection factory
 * 	      references
 * 	    - an optional declaration of the bean's resource
 * 	      environment references.
 * 	    - an optional declaration of the bean's message
 * 	      destination references
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMessagingType <em>Messaging Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getTimeoutMethod <em>Timeout Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMessageDestinationType <em>Message Destination Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMessageDestinationLink <em>Message Destination Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getActivationConfig <em>Activation Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getAroundInvoke <em>Around Invoke</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getServiceRef <em>Service Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMessageDestinationRef <em>Message Destination Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getPersistenceContextRef <em>Persistence Context Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getPersistenceUnitRef <em>Persistence Unit Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getPostConstruct <em>Post Construct</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getPreDestroy <em>Pre Destroy</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getSecurityIdentity <em>Security Identity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType()
 * @model extendedMetaData="name='message-driven-beanType' kind='elementOnly'"
 * @generated
 */
public interface MessageDrivenBeanType extends EObject {
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DescriptionType> getDescription();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.DisplayNameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<DisplayNameType> getDisplayName();

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.IconType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='icon' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<IconType> getIcon();

	/**
	 * Returns the value of the '<em><b>Ejb Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Name</em>' containment reference.
	 * @see #setEjbName(EjbNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_EjbName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ejb-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EjbNameType getEjbName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getEjbName <em>Ejb Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Name</em>' containment reference.
	 * @see #getEjbName()
	 * @generated
	 */
	void setEjbName(EjbNameType value);

	/**
	 * Returns the value of the '<em><b>Mapped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Name</em>' containment reference.
	 * @see #setMappedName(XsdStringType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_MappedName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mapped-name' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	XsdStringType getMappedName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMappedName <em>Mapped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Name</em>' containment reference.
	 * @see #getMappedName()
	 * @generated
	 */
	void setMappedName(XsdStringType value);

	/**
	 * Returns the value of the '<em><b>Ejb Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 *              The ejb-class element specifies the fully qualified name
	 *              of the bean class for this ejb.  It is required unless
	 *              there is a component-defining annotation for the same
	 *              ejb-name.
	 * 
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ejb Class</em>' containment reference.
	 * @see #setEjbClass(EjbClassType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_EjbClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ejb-class' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EjbClassType getEjbClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getEjbClass <em>Ejb Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Class</em>' containment reference.
	 * @see #getEjbClass()
	 * @generated
	 */
	void setEjbClass(EjbClassType value);

	/**
	 * Returns the value of the '<em><b>Messaging Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * 	    The messaging-type element specifies the message
	 * 	    listener interface of the message-driven bean.
	 * 
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Messaging Type</em>' containment reference.
	 * @see #setMessagingType(FullyQualifiedClassType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_MessagingType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='messaging-type' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	FullyQualifiedClassType getMessagingType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMessagingType <em>Messaging Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Messaging Type</em>' containment reference.
	 * @see #getMessagingType()
	 * @generated
	 */
	void setMessagingType(FullyQualifiedClassType value);

	/**
	 * Returns the value of the '<em><b>Timeout Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Method</em>' containment reference.
	 * @see #setTimeoutMethod(NamedMethodType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_TimeoutMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeout-method' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	NamedMethodType getTimeoutMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getTimeoutMethod <em>Timeout Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Method</em>' containment reference.
	 * @see #getTimeoutMethod()
	 * @generated
	 */
	void setTimeoutMethod(NamedMethodType value);

	/**
	 * Returns the value of the '<em><b>Transaction Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Type</em>' containment reference.
	 * @see #setTransactionType(TransactionTypeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_TransactionType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transaction-type' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	TransactionTypeType getTransactionType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getTransactionType <em>Transaction Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Type</em>' containment reference.
	 * @see #getTransactionType()
	 * @generated
	 */
	void setTransactionType(TransactionTypeType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_MessageDestinationType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='message-destination-type' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	MessageDestinationTypeType getMessageDestinationType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMessageDestinationType <em>Message Destination Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Destination Type</em>' containment reference.
	 * @see #getMessageDestinationType()
	 * @generated
	 */
	void setMessageDestinationType(MessageDestinationTypeType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_MessageDestinationLink()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='message-destination-link' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	MessageDestinationLinkType getMessageDestinationLink();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getMessageDestinationLink <em>Message Destination Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Destination Link</em>' containment reference.
	 * @see #getMessageDestinationLink()
	 * @generated
	 */
	void setMessageDestinationLink(MessageDestinationLinkType value);

	/**
	 * Returns the value of the '<em><b>Activation Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Config</em>' containment reference.
	 * @see #setActivationConfig(ActivationConfigType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_ActivationConfig()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='activation-config' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	ActivationConfigType getActivationConfig();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getActivationConfig <em>Activation Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Config</em>' containment reference.
	 * @see #getActivationConfig()
	 * @generated
	 */
	void setActivationConfig(ActivationConfigType value);

	/**
	 * Returns the value of the '<em><b>Around Invoke</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.AroundInvokeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Around Invoke</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Around Invoke</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_AroundInvoke()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='around-invoke' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<AroundInvokeType> getAroundInvoke();

	/**
	 * Returns the value of the '<em><b>Env Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EnvEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Entry</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_EnvEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='env-entry' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<EnvEntryType> getEnvEntry();

	/**
	 * Returns the value of the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_EjbRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ejb-ref' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<EjbRefType> getEjbRef();

	/**
	 * Returns the value of the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbLocalRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Local Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Local Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_EjbLocalRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ejb-local-ref' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<EjbLocalRefType> getEjbLocalRef();

	/**
	 * Returns the value of the '<em><b>Service Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ServiceRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_ServiceRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='service-ref' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<ServiceRefType> getServiceRef();

	/**
	 * Returns the value of the '<em><b>Resource Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_ResourceRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource-ref' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<ResourceRefType> getResourceRef();

	/**
	 * Returns the value of the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.ResourceEnvRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Env Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Env Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_ResourceEnvRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource-env-ref' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<ResourceEnvRefType> getResourceEnvRef();

	/**
	 * Returns the value of the '<em><b>Message Destination Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Destination Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Destination Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_MessageDestinationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='message-destination-ref' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<MessageDestinationRefType> getMessageDestinationRef();

	/**
	 * Returns the value of the '<em><b>Persistence Context Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceContextRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Context Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Context Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_PersistenceContextRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='persistence-context-ref' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<PersistenceContextRefType> getPersistenceContextRef();

	/**
	 * Returns the value of the '<em><b>Persistence Unit Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.PersistenceUnitRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence Unit Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Unit Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_PersistenceUnitRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='persistence-unit-ref' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<PersistenceUnitRefType> getPersistenceUnitRef();

	/**
	 * Returns the value of the '<em><b>Post Construct</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.LifecycleCallbackType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Construct</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Construct</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_PostConstruct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='post-construct' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<LifecycleCallbackType> getPostConstruct();

	/**
	 * Returns the value of the '<em><b>Pre Destroy</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar30.LifecycleCallbackType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Destroy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Destroy</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_PreDestroy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pre-destroy' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	EList<LifecycleCallbackType> getPreDestroy();

	/**
	 * Returns the value of the '<em><b>Security Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Identity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Identity</em>' containment reference.
	 * @see #setSecurityIdentity(SecurityIdentityType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_SecurityIdentity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security-identity' namespace='http://java.sun.com/xml/ns/javaee'"
	 * @generated
	 */
	SecurityIdentityType getSecurityIdentity();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getSecurityIdentity <em>Security Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Identity</em>' containment reference.
	 * @see #getSecurityIdentity()
	 * @generated
	 */
	void setSecurityIdentity(SecurityIdentityType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package#getMessageDrivenBeanType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // MessageDrivenBeanType
