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
 * A representation of the model object '<em><b>Session Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getSmallIcon <em>Small Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getLargeIcon <em>Large Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getHome <em>Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getRemote <em>Remote</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getLocalHome <em>Local Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getLocal <em>Local</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getSessionType <em>Session Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getSecurityRoleRef <em>Security Role Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getSecurityIdentity <em>Security Identity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType()
 * @model extendedMetaData="name='session_._type' kind='elementOnly'"
 * @generated
 */
public interface SessionType extends EObject {
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getDescription <em>Description</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_DisplayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display-name' namespace='##targetNamespace'"
	 * @generated
	 */
	DisplayNameType getDisplayName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getDisplayName <em>Display Name</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_SmallIcon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='small-icon' namespace='##targetNamespace'"
	 * @generated
	 */
	SmallIconType getSmallIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getSmallIcon <em>Small Icon</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_LargeIcon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='large-icon' namespace='##targetNamespace'"
	 * @generated
	 */
	LargeIconType getLargeIcon();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getLargeIcon <em>Large Icon</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_EjbName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ejb-name' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbNameType getEjbName();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getEjbName <em>Ejb Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Name</em>' containment reference.
	 * @see #getEjbName()
	 * @generated
	 */
	void setEjbName(EjbNameType value);

	/**
	 * Returns the value of the '<em><b>Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home</em>' containment reference.
	 * @see #setHome(HomeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_Home()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='home' namespace='##targetNamespace'"
	 * @generated
	 */
	HomeType getHome();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getHome <em>Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home</em>' containment reference.
	 * @see #getHome()
	 * @generated
	 */
	void setHome(HomeType value);

	/**
	 * Returns the value of the '<em><b>Remote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote</em>' containment reference.
	 * @see #setRemote(RemoteType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_Remote()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remote' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoteType getRemote();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getRemote <em>Remote</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote</em>' containment reference.
	 * @see #getRemote()
	 * @generated
	 */
	void setRemote(RemoteType value);

	/**
	 * Returns the value of the '<em><b>Local Home</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Home</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Home</em>' containment reference.
	 * @see #setLocalHome(LocalHomeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_LocalHome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='local-home' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalHomeType getLocalHome();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getLocalHome <em>Local Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Home</em>' containment reference.
	 * @see #getLocalHome()
	 * @generated
	 */
	void setLocalHome(LocalHomeType value);

	/**
	 * Returns the value of the '<em><b>Local</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' containment reference.
	 * @see #setLocal(LocalType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_Local()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='local' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalType getLocal();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getLocal <em>Local</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' containment reference.
	 * @see #getLocal()
	 * @generated
	 */
	void setLocal(LocalType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_EjbClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ejb-class' namespace='##targetNamespace'"
	 * @generated
	 */
	EjbClassType getEjbClass();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getEjbClass <em>Ejb Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Class</em>' containment reference.
	 * @see #getEjbClass()
	 * @generated
	 */
	void setEjbClass(EjbClassType value);

	/**
	 * Returns the value of the '<em><b>Session Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Type</em>' containment reference.
	 * @see #setSessionType(SessionTypeType)
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_SessionType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='session-type' namespace='##targetNamespace'"
	 * @generated
	 */
	SessionTypeType getSessionType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getSessionType <em>Session Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Type</em>' containment reference.
	 * @see #getSessionType()
	 * @generated
	 */
	void setSessionType(SessionTypeType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_TransactionType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='transaction-type' namespace='##targetNamespace'"
	 * @generated
	 */
	TransactionTypeType getTransactionType();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getTransactionType <em>Transaction Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Type</em>' containment reference.
	 * @see #getTransactionType()
	 * @generated
	 */
	void setTransactionType(TransactionTypeType value);

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_EnvEntry()
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_EjbRef()
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_EjbLocalRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ejb-local-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EjbLocalRefType> getEjbLocalRef();

	/**
	 * Returns the value of the '<em><b>Security Role Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Role Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Role Ref</em>' containment reference list.
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_SecurityRoleRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security-role-ref' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SecurityRoleRefType> getSecurityRoleRef();

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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_SecurityIdentity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='security-identity' namespace='##targetNamespace'"
	 * @generated
	 */
	SecurityIdentityType getSecurityIdentity();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getSecurityIdentity <em>Security Identity</em>}' containment reference.
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_ResourceRef()
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_ResourceEnvRef()
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
	 * @see org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package#getSessionType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // SessionType
