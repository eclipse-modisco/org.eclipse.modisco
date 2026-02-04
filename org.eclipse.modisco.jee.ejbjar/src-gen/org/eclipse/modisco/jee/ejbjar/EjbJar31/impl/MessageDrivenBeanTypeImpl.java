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
package org.eclipse.modisco.jee.ejbjar.EjbJar31.impl;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.jee.ejbjar.EjbJar31.ActivationConfigType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.AroundInvokeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.AroundTimeoutType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DataSourceType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DisplayNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbLocalRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EnvEntryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.FullyQualifiedClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.IconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.LifecycleCallbackType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MessageDestinationLinkType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MessageDestinationRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MessageDestinationTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MessageDrivenBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.NamedMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PersistenceContextRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PersistenceUnitRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResourceEnvRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResourceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.SecurityIdentityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.SecurityRoleRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ServiceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TransactionTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.XsdStringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Driven Bean Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getMessagingType <em>Messaging Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getTimeoutMethod <em>Timeout Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getTimer <em>Timer</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getMessageDestinationType <em>Message Destination Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getMessageDestinationLink <em>Message Destination Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getActivationConfig <em>Activation Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getAroundInvoke <em>Around Invoke</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getAroundTimeout <em>Around Timeout</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getServiceRef <em>Service Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getMessageDestinationRef <em>Message Destination Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getPersistenceContextRef <em>Persistence Context Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getPersistenceUnitRef <em>Persistence Unit Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getPostConstruct <em>Post Construct</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getPreDestroy <em>Pre Destroy</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getSecurityRoleRef <em>Security Role Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getSecurityIdentity <em>Security Identity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.MessageDrivenBeanTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageDrivenBeanTypeImpl extends EObjectImpl implements MessageDrivenBeanType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<DescriptionType> description;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected EList<DisplayNameType> displayName;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected EList<IconType> icon;

	/**
	 * The cached value of the '{@link #getEjbName() <em>Ejb Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbName()
	 * @generated
	 * @ordered
	 */
	protected EjbNameType ejbName;

	/**
	 * The cached value of the '{@link #getMappedName() <em>Mapped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedName()
	 * @generated
	 * @ordered
	 */
	protected XsdStringType mappedName;

	/**
	 * The cached value of the '{@link #getEjbClass() <em>Ejb Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbClass()
	 * @generated
	 * @ordered
	 */
	protected EjbClassType ejbClass;

	/**
	 * The cached value of the '{@link #getMessagingType() <em>Messaging Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagingType()
	 * @generated
	 * @ordered
	 */
	protected FullyQualifiedClassType messagingType;

	/**
	 * The cached value of the '{@link #getTimeoutMethod() <em>Timeout Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutMethod()
	 * @generated
	 * @ordered
	 */
	protected NamedMethodType timeoutMethod;

	/**
	 * The cached value of the '{@link #getTimer() <em>Timer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer()
	 * @generated
	 * @ordered
	 */
	protected EList<TimerType> timer;

	/**
	 * The cached value of the '{@link #getTransactionType() <em>Transaction Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionType()
	 * @generated
	 * @ordered
	 */
	protected TransactionTypeType transactionType;

	/**
	 * The cached value of the '{@link #getMessageDestinationType() <em>Message Destination Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDestinationType()
	 * @generated
	 * @ordered
	 */
	protected MessageDestinationTypeType messageDestinationType;

	/**
	 * The cached value of the '{@link #getMessageDestinationLink() <em>Message Destination Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDestinationLink()
	 * @generated
	 * @ordered
	 */
	protected MessageDestinationLinkType messageDestinationLink;

	/**
	 * The cached value of the '{@link #getActivationConfig() <em>Activation Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationConfig()
	 * @generated
	 * @ordered
	 */
	protected ActivationConfigType activationConfig;

	/**
	 * The cached value of the '{@link #getAroundInvoke() <em>Around Invoke</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAroundInvoke()
	 * @generated
	 * @ordered
	 */
	protected EList<AroundInvokeType> aroundInvoke;

	/**
	 * The cached value of the '{@link #getAroundTimeout() <em>Around Timeout</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAroundTimeout()
	 * @generated
	 * @ordered
	 */
	protected EList<AroundTimeoutType> aroundTimeout;

	/**
	 * The cached value of the '{@link #getEnvEntry() <em>Env Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvEntryType> envEntry;

	/**
	 * The cached value of the '{@link #getEjbRef() <em>Ejb Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbRef()
	 * @generated
	 * @ordered
	 */
	protected EList<EjbRefType> ejbRef;

	/**
	 * The cached value of the '{@link #getEjbLocalRef() <em>Ejb Local Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbLocalRef()
	 * @generated
	 * @ordered
	 */
	protected EList<EjbLocalRefType> ejbLocalRef;

	/**
	 * The cached value of the '{@link #getServiceRef() <em>Service Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceRefType> serviceRef;

	/**
	 * The cached value of the '{@link #getResourceRef() <em>Resource Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceRefType> resourceRef;

	/**
	 * The cached value of the '{@link #getResourceEnvRef() <em>Resource Env Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceEnvRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceEnvRefType> resourceEnvRef;

	/**
	 * The cached value of the '{@link #getMessageDestinationRef() <em>Message Destination Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDestinationRef()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageDestinationRefType> messageDestinationRef;

	/**
	 * The cached value of the '{@link #getPersistenceContextRef() <em>Persistence Context Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceContextRef()
	 * @generated
	 * @ordered
	 */
	protected EList<PersistenceContextRefType> persistenceContextRef;

	/**
	 * The cached value of the '{@link #getPersistenceUnitRef() <em>Persistence Unit Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceUnitRef()
	 * @generated
	 * @ordered
	 */
	protected EList<PersistenceUnitRefType> persistenceUnitRef;

	/**
	 * The cached value of the '{@link #getPostConstruct() <em>Post Construct</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostConstruct()
	 * @generated
	 * @ordered
	 */
	protected EList<LifecycleCallbackType> postConstruct;

	/**
	 * The cached value of the '{@link #getPreDestroy() <em>Pre Destroy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreDestroy()
	 * @generated
	 * @ordered
	 */
	protected EList<LifecycleCallbackType> preDestroy;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSourceType> dataSource;

	/**
	 * The cached value of the '{@link #getSecurityRoleRef() <em>Security Role Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRoleRef()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRoleRefType> securityRoleRef;

	/**
	 * The cached value of the '{@link #getSecurityIdentity() <em>Security Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityIdentity()
	 * @generated
	 * @ordered
	 */
	protected SecurityIdentityType securityIdentity;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageDrivenBeanTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar31Package.eINSTANCE.getMessageDrivenBeanType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisplayNameType> getDisplayName() {
		if (displayName == null) {
			displayName = new EObjectContainmentEList<DisplayNameType>(DisplayNameType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DISPLAY_NAME);
		}
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IconType> getIcon() {
		if (icon == null) {
			icon = new EObjectContainmentEList<IconType>(IconType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ICON);
		}
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbNameType getEjbName() {
		return ejbName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbName(EjbNameType newEjbName, NotificationChain msgs) {
		EjbNameType oldEjbName = ejbName;
		ejbName = newEjbName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_NAME, oldEjbName, newEjbName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbName(EjbNameType newEjbName) {
		if (newEjbName != ejbName) {
			NotificationChain msgs = null;
			if (ejbName != null)
				msgs = ((InternalEObject)ejbName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_NAME, null, msgs);
			if (newEjbName != null)
				msgs = ((InternalEObject)newEjbName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_NAME, null, msgs);
			msgs = basicSetEjbName(newEjbName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_NAME, newEjbName, newEjbName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdStringType getMappedName() {
		return mappedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappedName(XsdStringType newMappedName, NotificationChain msgs) {
		XsdStringType oldMappedName = mappedName;
		mappedName = newMappedName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MAPPED_NAME, oldMappedName, newMappedName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedName(XsdStringType newMappedName) {
		if (newMappedName != mappedName) {
			NotificationChain msgs = null;
			if (mappedName != null)
				msgs = ((InternalEObject)mappedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MAPPED_NAME, null, msgs);
			if (newMappedName != null)
				msgs = ((InternalEObject)newMappedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MAPPED_NAME, null, msgs);
			msgs = basicSetMappedName(newMappedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MAPPED_NAME, newMappedName, newMappedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbClassType getEjbClass() {
		return ejbClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbClass(EjbClassType newEjbClass, NotificationChain msgs) {
		EjbClassType oldEjbClass = ejbClass;
		ejbClass = newEjbClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_CLASS, oldEjbClass, newEjbClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbClass(EjbClassType newEjbClass) {
		if (newEjbClass != ejbClass) {
			NotificationChain msgs = null;
			if (ejbClass != null)
				msgs = ((InternalEObject)ejbClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_CLASS, null, msgs);
			if (newEjbClass != null)
				msgs = ((InternalEObject)newEjbClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_CLASS, null, msgs);
			msgs = basicSetEjbClass(newEjbClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_CLASS, newEjbClass, newEjbClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedClassType getMessagingType() {
		return messagingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessagingType(FullyQualifiedClassType newMessagingType, NotificationChain msgs) {
		FullyQualifiedClassType oldMessagingType = messagingType;
		messagingType = newMessagingType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGING_TYPE, oldMessagingType, newMessagingType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessagingType(FullyQualifiedClassType newMessagingType) {
		if (newMessagingType != messagingType) {
			NotificationChain msgs = null;
			if (messagingType != null)
				msgs = ((InternalEObject)messagingType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGING_TYPE, null, msgs);
			if (newMessagingType != null)
				msgs = ((InternalEObject)newMessagingType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGING_TYPE, null, msgs);
			msgs = basicSetMessagingType(newMessagingType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGING_TYPE, newMessagingType, newMessagingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedMethodType getTimeoutMethod() {
		return timeoutMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeoutMethod(NamedMethodType newTimeoutMethod, NotificationChain msgs) {
		NamedMethodType oldTimeoutMethod = timeoutMethod;
		timeoutMethod = newTimeoutMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TIMEOUT_METHOD, oldTimeoutMethod, newTimeoutMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeoutMethod(NamedMethodType newTimeoutMethod) {
		if (newTimeoutMethod != timeoutMethod) {
			NotificationChain msgs = null;
			if (timeoutMethod != null)
				msgs = ((InternalEObject)timeoutMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TIMEOUT_METHOD, null, msgs);
			if (newTimeoutMethod != null)
				msgs = ((InternalEObject)newTimeoutMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TIMEOUT_METHOD, null, msgs);
			msgs = basicSetTimeoutMethod(newTimeoutMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TIMEOUT_METHOD, newTimeoutMethod, newTimeoutMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimerType> getTimer() {
		if (timer == null) {
			timer = new EObjectContainmentEList<TimerType>(TimerType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TIMER);
		}
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeType getTransactionType() {
		return transactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionType(TransactionTypeType newTransactionType, NotificationChain msgs) {
		TransactionTypeType oldTransactionType = transactionType;
		transactionType = newTransactionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TRANSACTION_TYPE, oldTransactionType, newTransactionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionType(TransactionTypeType newTransactionType) {
		if (newTransactionType != transactionType) {
			NotificationChain msgs = null;
			if (transactionType != null)
				msgs = ((InternalEObject)transactionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TRANSACTION_TYPE, null, msgs);
			if (newTransactionType != null)
				msgs = ((InternalEObject)newTransactionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TRANSACTION_TYPE, null, msgs);
			msgs = basicSetTransactionType(newTransactionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TRANSACTION_TYPE, newTransactionType, newTransactionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationTypeType getMessageDestinationType() {
		return messageDestinationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageDestinationType(MessageDestinationTypeType newMessageDestinationType, NotificationChain msgs) {
		MessageDestinationTypeType oldMessageDestinationType = messageDestinationType;
		messageDestinationType = newMessageDestinationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_TYPE, oldMessageDestinationType, newMessageDestinationType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDestinationType(MessageDestinationTypeType newMessageDestinationType) {
		if (newMessageDestinationType != messageDestinationType) {
			NotificationChain msgs = null;
			if (messageDestinationType != null)
				msgs = ((InternalEObject)messageDestinationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_TYPE, null, msgs);
			if (newMessageDestinationType != null)
				msgs = ((InternalEObject)newMessageDestinationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_TYPE, null, msgs);
			msgs = basicSetMessageDestinationType(newMessageDestinationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_TYPE, newMessageDestinationType, newMessageDestinationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationLinkType getMessageDestinationLink() {
		return messageDestinationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageDestinationLink(MessageDestinationLinkType newMessageDestinationLink, NotificationChain msgs) {
		MessageDestinationLinkType oldMessageDestinationLink = messageDestinationLink;
		messageDestinationLink = newMessageDestinationLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_LINK, oldMessageDestinationLink, newMessageDestinationLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDestinationLink(MessageDestinationLinkType newMessageDestinationLink) {
		if (newMessageDestinationLink != messageDestinationLink) {
			NotificationChain msgs = null;
			if (messageDestinationLink != null)
				msgs = ((InternalEObject)messageDestinationLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_LINK, null, msgs);
			if (newMessageDestinationLink != null)
				msgs = ((InternalEObject)newMessageDestinationLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_LINK, null, msgs);
			msgs = basicSetMessageDestinationLink(newMessageDestinationLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_LINK, newMessageDestinationLink, newMessageDestinationLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationConfigType getActivationConfig() {
		return activationConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivationConfig(ActivationConfigType newActivationConfig, NotificationChain msgs) {
		ActivationConfigType oldActivationConfig = activationConfig;
		activationConfig = newActivationConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ACTIVATION_CONFIG, oldActivationConfig, newActivationConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationConfig(ActivationConfigType newActivationConfig) {
		if (newActivationConfig != activationConfig) {
			NotificationChain msgs = null;
			if (activationConfig != null)
				msgs = ((InternalEObject)activationConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ACTIVATION_CONFIG, null, msgs);
			if (newActivationConfig != null)
				msgs = ((InternalEObject)newActivationConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ACTIVATION_CONFIG, null, msgs);
			msgs = basicSetActivationConfig(newActivationConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ACTIVATION_CONFIG, newActivationConfig, newActivationConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AroundInvokeType> getAroundInvoke() {
		if (aroundInvoke == null) {
			aroundInvoke = new EObjectContainmentEList<AroundInvokeType>(AroundInvokeType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__AROUND_INVOKE);
		}
		return aroundInvoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AroundTimeoutType> getAroundTimeout() {
		if (aroundTimeout == null) {
			aroundTimeout = new EObjectContainmentEList<AroundTimeoutType>(AroundTimeoutType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__AROUND_TIMEOUT);
		}
		return aroundTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvEntryType> getEnvEntry() {
		if (envEntry == null) {
			envEntry = new EObjectContainmentEList<EnvEntryType>(EnvEntryType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ENV_ENTRY);
		}
		return envEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EjbRefType> getEjbRef() {
		if (ejbRef == null) {
			ejbRef = new EObjectContainmentEList<EjbRefType>(EjbRefType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_REF);
		}
		return ejbRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EjbLocalRefType> getEjbLocalRef() {
		if (ejbLocalRef == null) {
			ejbLocalRef = new EObjectContainmentEList<EjbLocalRefType>(EjbLocalRefType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_LOCAL_REF);
		}
		return ejbLocalRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceRefType> getServiceRef() {
		if (serviceRef == null) {
			serviceRef = new EObjectContainmentEList<ServiceRefType>(ServiceRefType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SERVICE_REF);
		}
		return serviceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceRefType> getResourceRef() {
		if (resourceRef == null) {
			resourceRef = new EObjectContainmentEList<ResourceRefType>(ResourceRefType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_REF);
		}
		return resourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceEnvRefType> getResourceEnvRef() {
		if (resourceEnvRef == null) {
			resourceEnvRef = new EObjectContainmentEList<ResourceEnvRefType>(ResourceEnvRefType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_ENV_REF);
		}
		return resourceEnvRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageDestinationRefType> getMessageDestinationRef() {
		if (messageDestinationRef == null) {
			messageDestinationRef = new EObjectContainmentEList<MessageDestinationRefType>(MessageDestinationRefType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_REF);
		}
		return messageDestinationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersistenceContextRefType> getPersistenceContextRef() {
		if (persistenceContextRef == null) {
			persistenceContextRef = new EObjectContainmentEList<PersistenceContextRefType>(PersistenceContextRefType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PERSISTENCE_CONTEXT_REF);
		}
		return persistenceContextRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersistenceUnitRefType> getPersistenceUnitRef() {
		if (persistenceUnitRef == null) {
			persistenceUnitRef = new EObjectContainmentEList<PersistenceUnitRefType>(PersistenceUnitRefType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PERSISTENCE_UNIT_REF);
		}
		return persistenceUnitRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LifecycleCallbackType> getPostConstruct() {
		if (postConstruct == null) {
			postConstruct = new EObjectContainmentEList<LifecycleCallbackType>(LifecycleCallbackType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__POST_CONSTRUCT);
		}
		return postConstruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LifecycleCallbackType> getPreDestroy() {
		if (preDestroy == null) {
			preDestroy = new EObjectContainmentEList<LifecycleCallbackType>(LifecycleCallbackType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PRE_DESTROY);
		}
		return preDestroy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSourceType> getDataSource() {
		if (dataSource == null) {
			dataSource = new EObjectContainmentEList<DataSourceType>(DataSourceType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DATA_SOURCE);
		}
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRoleRefType> getSecurityRoleRef() {
		if (securityRoleRef == null) {
			securityRoleRef = new EObjectContainmentEList<SecurityRoleRefType>(SecurityRoleRefType.class, this, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_ROLE_REF);
		}
		return securityRoleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityIdentityType getSecurityIdentity() {
		return securityIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityIdentity(SecurityIdentityType newSecurityIdentity, NotificationChain msgs) {
		SecurityIdentityType oldSecurityIdentity = securityIdentity;
		securityIdentity = newSecurityIdentity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_IDENTITY, oldSecurityIdentity, newSecurityIdentity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityIdentity(SecurityIdentityType newSecurityIdentity) {
		if (newSecurityIdentity != securityIdentity) {
			NotificationChain msgs = null;
			if (securityIdentity != null)
				msgs = ((InternalEObject)securityIdentity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_IDENTITY, null, msgs);
			if (newSecurityIdentity != null)
				msgs = ((InternalEObject)newSecurityIdentity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_IDENTITY, null, msgs);
			msgs = basicSetSecurityIdentity(newSecurityIdentity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_IDENTITY, newSecurityIdentity, newSecurityIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DISPLAY_NAME:
				return ((InternalEList<?>)getDisplayName()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ICON:
				return ((InternalEList<?>)getIcon()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_NAME:
				return basicSetEjbName(null, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MAPPED_NAME:
				return basicSetMappedName(null, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_CLASS:
				return basicSetEjbClass(null, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGING_TYPE:
				return basicSetMessagingType(null, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TIMEOUT_METHOD:
				return basicSetTimeoutMethod(null, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TIMER:
				return ((InternalEList<?>)getTimer()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TRANSACTION_TYPE:
				return basicSetTransactionType(null, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_TYPE:
				return basicSetMessageDestinationType(null, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_LINK:
				return basicSetMessageDestinationLink(null, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ACTIVATION_CONFIG:
				return basicSetActivationConfig(null, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__AROUND_INVOKE:
				return ((InternalEList<?>)getAroundInvoke()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__AROUND_TIMEOUT:
				return ((InternalEList<?>)getAroundTimeout()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ENV_ENTRY:
				return ((InternalEList<?>)getEnvEntry()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_REF:
				return ((InternalEList<?>)getEjbRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_LOCAL_REF:
				return ((InternalEList<?>)getEjbLocalRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SERVICE_REF:
				return ((InternalEList<?>)getServiceRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_REF:
				return ((InternalEList<?>)getResourceRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_ENV_REF:
				return ((InternalEList<?>)getResourceEnvRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_REF:
				return ((InternalEList<?>)getMessageDestinationRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PERSISTENCE_CONTEXT_REF:
				return ((InternalEList<?>)getPersistenceContextRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PERSISTENCE_UNIT_REF:
				return ((InternalEList<?>)getPersistenceUnitRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__POST_CONSTRUCT:
				return ((InternalEList<?>)getPostConstruct()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PRE_DESTROY:
				return ((InternalEList<?>)getPreDestroy()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DATA_SOURCE:
				return ((InternalEList<?>)getDataSource()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_ROLE_REF:
				return ((InternalEList<?>)getSecurityRoleRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_IDENTITY:
				return basicSetSecurityIdentity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ICON:
				return getIcon();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_NAME:
				return getEjbName();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MAPPED_NAME:
				return getMappedName();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_CLASS:
				return getEjbClass();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGING_TYPE:
				return getMessagingType();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TIMEOUT_METHOD:
				return getTimeoutMethod();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TIMER:
				return getTimer();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TRANSACTION_TYPE:
				return getTransactionType();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_TYPE:
				return getMessageDestinationType();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_LINK:
				return getMessageDestinationLink();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ACTIVATION_CONFIG:
				return getActivationConfig();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__AROUND_INVOKE:
				return getAroundInvoke();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__AROUND_TIMEOUT:
				return getAroundTimeout();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ENV_ENTRY:
				return getEnvEntry();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_REF:
				return getEjbRef();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_LOCAL_REF:
				return getEjbLocalRef();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SERVICE_REF:
				return getServiceRef();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_REF:
				return getResourceRef();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_ENV_REF:
				return getResourceEnvRef();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_REF:
				return getMessageDestinationRef();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PERSISTENCE_CONTEXT_REF:
				return getPersistenceContextRef();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PERSISTENCE_UNIT_REF:
				return getPersistenceUnitRef();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__POST_CONSTRUCT:
				return getPostConstruct();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PRE_DESTROY:
				return getPreDestroy();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DATA_SOURCE:
				return getDataSource();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_ROLE_REF:
				return getSecurityRoleRef();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_IDENTITY:
				return getSecurityIdentity();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				getDisplayName().addAll((Collection<? extends DisplayNameType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ICON:
				getIcon().clear();
				getIcon().addAll((Collection<? extends IconType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_NAME:
				setEjbName((EjbNameType)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MAPPED_NAME:
				setMappedName((XsdStringType)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_CLASS:
				setEjbClass((EjbClassType)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGING_TYPE:
				setMessagingType((FullyQualifiedClassType)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TIMEOUT_METHOD:
				setTimeoutMethod((NamedMethodType)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TIMER:
				getTimer().clear();
				getTimer().addAll((Collection<? extends TimerType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TRANSACTION_TYPE:
				setTransactionType((TransactionTypeType)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_TYPE:
				setMessageDestinationType((MessageDestinationTypeType)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_LINK:
				setMessageDestinationLink((MessageDestinationLinkType)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ACTIVATION_CONFIG:
				setActivationConfig((ActivationConfigType)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__AROUND_INVOKE:
				getAroundInvoke().clear();
				getAroundInvoke().addAll((Collection<? extends AroundInvokeType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__AROUND_TIMEOUT:
				getAroundTimeout().clear();
				getAroundTimeout().addAll((Collection<? extends AroundTimeoutType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				getEnvEntry().addAll((Collection<? extends EnvEntryType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_REF:
				getEjbRef().clear();
				getEjbRef().addAll((Collection<? extends EjbRefType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				getEjbLocalRef().addAll((Collection<? extends EjbLocalRefType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SERVICE_REF:
				getServiceRef().clear();
				getServiceRef().addAll((Collection<? extends ServiceRefType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				getResourceRef().addAll((Collection<? extends ResourceRefType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				getResourceEnvRef().addAll((Collection<? extends ResourceEnvRefType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_REF:
				getMessageDestinationRef().clear();
				getMessageDestinationRef().addAll((Collection<? extends MessageDestinationRefType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PERSISTENCE_CONTEXT_REF:
				getPersistenceContextRef().clear();
				getPersistenceContextRef().addAll((Collection<? extends PersistenceContextRefType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PERSISTENCE_UNIT_REF:
				getPersistenceUnitRef().clear();
				getPersistenceUnitRef().addAll((Collection<? extends PersistenceUnitRefType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__POST_CONSTRUCT:
				getPostConstruct().clear();
				getPostConstruct().addAll((Collection<? extends LifecycleCallbackType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PRE_DESTROY:
				getPreDestroy().clear();
				getPreDestroy().addAll((Collection<? extends LifecycleCallbackType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DATA_SOURCE:
				getDataSource().clear();
				getDataSource().addAll((Collection<? extends DataSourceType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_ROLE_REF:
				getSecurityRoleRef().clear();
				getSecurityRoleRef().addAll((Collection<? extends SecurityRoleRefType>)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_IDENTITY:
				setSecurityIdentity((SecurityIdentityType)newValue);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ID:
				setId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ICON:
				getIcon().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_NAME:
				setEjbName((EjbNameType)null);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MAPPED_NAME:
				setMappedName((XsdStringType)null);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_CLASS:
				setEjbClass((EjbClassType)null);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGING_TYPE:
				setMessagingType((FullyQualifiedClassType)null);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TIMEOUT_METHOD:
				setTimeoutMethod((NamedMethodType)null);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TIMER:
				getTimer().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TRANSACTION_TYPE:
				setTransactionType((TransactionTypeType)null);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_TYPE:
				setMessageDestinationType((MessageDestinationTypeType)null);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_LINK:
				setMessageDestinationLink((MessageDestinationLinkType)null);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ACTIVATION_CONFIG:
				setActivationConfig((ActivationConfigType)null);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__AROUND_INVOKE:
				getAroundInvoke().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__AROUND_TIMEOUT:
				getAroundTimeout().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_REF:
				getEjbRef().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SERVICE_REF:
				getServiceRef().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_REF:
				getMessageDestinationRef().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PERSISTENCE_CONTEXT_REF:
				getPersistenceContextRef().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PERSISTENCE_UNIT_REF:
				getPersistenceUnitRef().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__POST_CONSTRUCT:
				getPostConstruct().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PRE_DESTROY:
				getPreDestroy().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DATA_SOURCE:
				getDataSource().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_ROLE_REF:
				getSecurityRoleRef().clear();
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_IDENTITY:
				setSecurityIdentity((SecurityIdentityType)null);
				return;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DISPLAY_NAME:
				return displayName != null && !displayName.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ICON:
				return icon != null && !icon.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_NAME:
				return ejbName != null;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MAPPED_NAME:
				return mappedName != null;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_CLASS:
				return ejbClass != null;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGING_TYPE:
				return messagingType != null;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TIMEOUT_METHOD:
				return timeoutMethod != null;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TIMER:
				return timer != null && !timer.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__TRANSACTION_TYPE:
				return transactionType != null;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_TYPE:
				return messageDestinationType != null;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_LINK:
				return messageDestinationLink != null;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ACTIVATION_CONFIG:
				return activationConfig != null;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__AROUND_INVOKE:
				return aroundInvoke != null && !aroundInvoke.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__AROUND_TIMEOUT:
				return aroundTimeout != null && !aroundTimeout.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ENV_ENTRY:
				return envEntry != null && !envEntry.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_REF:
				return ejbRef != null && !ejbRef.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__EJB_LOCAL_REF:
				return ejbLocalRef != null && !ejbLocalRef.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SERVICE_REF:
				return serviceRef != null && !serviceRef.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_REF:
				return resourceRef != null && !resourceRef.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__RESOURCE_ENV_REF:
				return resourceEnvRef != null && !resourceEnvRef.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__MESSAGE_DESTINATION_REF:
				return messageDestinationRef != null && !messageDestinationRef.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PERSISTENCE_CONTEXT_REF:
				return persistenceContextRef != null && !persistenceContextRef.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PERSISTENCE_UNIT_REF:
				return persistenceUnitRef != null && !persistenceUnitRef.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__POST_CONSTRUCT:
				return postConstruct != null && !postConstruct.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__PRE_DESTROY:
				return preDestroy != null && !preDestroy.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__DATA_SOURCE:
				return dataSource != null && !dataSource.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_ROLE_REF:
				return securityRoleRef != null && !securityRoleRef.isEmpty();
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__SECURITY_IDENTITY:
				return securityIdentity != null;
			case EjbJar31Package.MESSAGE_DRIVEN_BEAN_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //MessageDrivenBeanTypeImpl
