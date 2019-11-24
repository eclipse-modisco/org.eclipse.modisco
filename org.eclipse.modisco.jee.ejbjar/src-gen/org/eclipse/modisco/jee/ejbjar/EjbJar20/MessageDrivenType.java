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
package org.eclipse.modisco.jee.ejbjar.EjbJar20;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Driven Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getSmallIcon <em>Small Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getLargeIcon <em>Large Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getMessageSelector <em>Message Selector</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getAcknowledgeMode <em>Acknowledge Mode</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getMessageDrivenDestination <em>Message Driven Destination</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getSecurityIdentity <em>Security Identity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType()
 * @model extendedMetaData="name='message-driven_._type' kind='elementOnly'"
 * @generated
 */
public interface MessageDrivenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference.
	 * @see #setDisplayName(DisplayNameType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='##targetNamespace'"
	 * @generated
	 */
	DisplayNameType getDisplayName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' containment reference.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(DisplayNameType value);

	/**
	 * Returns the value of the '<em><b>Small Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Small Icon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Small Icon</em>' containment reference.
	 * @see #setSmallIcon(SmallIconType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType_SmallIcon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='small-icon' namespace='##targetNamespace'"
	 * @generated
	 */
	SmallIconType getSmallIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getSmallIcon <em>Small Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Small Icon</em>' containment reference.
	 * @see #getSmallIcon()
	 * @generated
	 */
	void setSmallIcon(SmallIconType value);

	/**
	 * Returns the value of the '<em><b>Large Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Large Icon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Large Icon</em>' containment reference.
	 * @see #setLargeIcon(LargeIconType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType_LargeIcon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='large-icon' namespace='##targetNamespace'"
	 * @generated
	 */
	LargeIconType getLargeIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getLargeIcon <em>Large Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Large Icon</em>' containment reference.
	 * @see #getLargeIcon()
	 * @generated
	 */
	void setLargeIcon(LargeIconType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType_EjbName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ejb-name' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbNameType getEjbName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getEjbName <em>Ejb Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Name</em>' containment reference.
	 * @see #getEjbName()
	 * @generated
	 */
	void setEjbName(EjbNameType value);

	/**
	 * Returns the value of the '<em><b>Ejb Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Class</em>' containment reference.
	 * @see #setEjbClass(EjbClassType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType_EjbClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ejb-class' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbClassType getEjbClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getEjbClass <em>Ejb Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Class</em>' containment reference.
	 * @see #getEjbClass()
	 * @generated
	 */
	void setEjbClass(EjbClassType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType_TransactionType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='transaction-type' namespace='##targetNamespace'"
	 * @generated
	 */
	TransactionTypeType getTransactionType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getTransactionType <em>Transaction Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Type</em>' containment reference.
	 * @see #getTransactionType()
	 * @generated
	 */
	void setTransactionType(TransactionTypeType value);

	/**
	 * Returns the value of the '<em><b>Message Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Selector</em>' containment reference.
	 * @see #setMessageSelector(MessageSelectorType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType_MessageSelector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='message-selector' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageSelectorType getMessageSelector();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getMessageSelector <em>Message Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Selector</em>' containment reference.
	 * @see #getMessageSelector()
	 * @generated
	 */
	void setMessageSelector(MessageSelectorType value);

	/**
	 * Returns the value of the '<em><b>Acknowledge Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acknowledge Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acknowledge Mode</em>' containment reference.
	 * @see #setAcknowledgeMode(AcknowledgeModeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType_AcknowledgeMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='acknowledge-mode' namespace='##targetNamespace'"
	 * @generated
	 */
	AcknowledgeModeType getAcknowledgeMode();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getAcknowledgeMode <em>Acknowledge Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acknowledge Mode</em>' containment reference.
	 * @see #getAcknowledgeMode()
	 * @generated
	 */
	void setAcknowledgeMode(AcknowledgeModeType value);

	/**
	 * Returns the value of the '<em><b>Message Driven Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Driven Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Driven Destination</em>' containment reference.
	 * @see #setMessageDrivenDestination(MessageDrivenDestinationType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType_MessageDrivenDestination()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='message-driven-destination' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageDrivenDestinationType getMessageDrivenDestination();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getMessageDrivenDestination <em>Message Driven Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Driven Destination</em>' containment reference.
	 * @see #getMessageDrivenDestination()
	 * @generated
	 */
	void setMessageDrivenDestination(MessageDrivenDestinationType value);

	/**
	 * Returns the value of the '<em><b>Env Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Entry</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType_EnvEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='env-entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnvEntryType> getEnvEntry();

	/**
	 * Returns the value of the '<em><b>Ejb Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType_EjbRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ejb-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EjbRefType> getEjbRef();

	/**
	 * Returns the value of the '<em><b>Ejb Local Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Local Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Local Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType_EjbLocalRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ejb-local-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EjbLocalRefType> getEjbLocalRef();

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType_SecurityIdentity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security-identity' namespace='##targetNamespace'"
	 * @generated
	 */
	SecurityIdentityType getSecurityIdentity();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getSecurityIdentity <em>Security Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Identity</em>' containment reference.
	 * @see #getSecurityIdentity()
	 * @generated
	 */
	void setSecurityIdentity(SecurityIdentityType value);

	/**
	 * Returns the value of the '<em><b>Resource Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType_ResourceRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResourceRefType> getResourceRef();

	/**
	 * Returns the value of the '<em><b>Resource Env Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Env Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Env Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType_ResourceEnvRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource-env-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResourceEnvRefType> getResourceEnvRef();

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getMessageDrivenType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // MessageDrivenType
