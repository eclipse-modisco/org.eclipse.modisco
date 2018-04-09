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

import org.eclipse.modisco.jee.ejbjar.EjbJar31.AroundInvokeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.AroundTimeoutType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.AsyncMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrencyManagementTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrentMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DataSourceType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DependsOnType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DisplayNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbLocalRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EmptyType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EnvEntryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.FullyQualifiedClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.HomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.IconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.InitMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.LifecycleCallbackType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.LocalHomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.LocalType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MessageDestinationRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.NamedMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PersistenceContextRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PersistenceUnitRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.RemoteType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.RemoveMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResourceEnvRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResourceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.SecurityIdentityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.SecurityRoleRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ServiceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.StatefulTimeoutType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TimerType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TransactionTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TrueFalseType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.XsdStringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session Bean Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getHome <em>Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getRemote <em>Remote</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getLocalHome <em>Local Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getBusinessLocal <em>Business Local</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getBusinessRemote <em>Business Remote</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getLocalBean <em>Local Bean</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getServiceEndpoint <em>Service Endpoint</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getSessionType <em>Session Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getStatefulTimeout <em>Stateful Timeout</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getTimeoutMethod <em>Timeout Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getTimer <em>Timer</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getInitOnStartup <em>Init On Startup</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getConcurrencyManagementType <em>Concurrency Management Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getConcurrentMethod <em>Concurrent Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getInitMethod <em>Init Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getRemoveMethod <em>Remove Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getAsyncMethod <em>Async Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getAfterBeginMethod <em>After Begin Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getBeforeCompletionMethod <em>Before Completion Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getAfterCompletionMethod <em>After Completion Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getAroundInvoke <em>Around Invoke</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getAroundTimeout <em>Around Timeout</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getServiceRef <em>Service Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getMessageDestinationRef <em>Message Destination Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getPersistenceContextRef <em>Persistence Context Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getPersistenceUnitRef <em>Persistence Unit Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getPostConstruct <em>Post Construct</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getPreDestroy <em>Pre Destroy</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getPostActivate <em>Post Activate</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getPrePassivate <em>Pre Passivate</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getSecurityRoleRef <em>Security Role Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getSecurityIdentity <em>Security Identity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.SessionBeanTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SessionBeanTypeImpl extends EObjectImpl implements SessionBeanType {
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
	 * The cached value of the '{@link #getHome() <em>Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome()
	 * @generated
	 * @ordered
	 */
	protected HomeType home;

	/**
	 * The cached value of the '{@link #getRemote() <em>Remote</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemote()
	 * @generated
	 * @ordered
	 */
	protected RemoteType remote;

	/**
	 * The cached value of the '{@link #getLocalHome() <em>Local Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalHome()
	 * @generated
	 * @ordered
	 */
	protected LocalHomeType localHome;

	/**
	 * The cached value of the '{@link #getLocal() <em>Local</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected LocalType local;

	/**
	 * The cached value of the '{@link #getBusinessLocal() <em>Business Local</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessLocal()
	 * @generated
	 * @ordered
	 */
	protected EList<FullyQualifiedClassType> businessLocal;

	/**
	 * The cached value of the '{@link #getBusinessRemote() <em>Business Remote</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessRemote()
	 * @generated
	 * @ordered
	 */
	protected EList<FullyQualifiedClassType> businessRemote;

	/**
	 * The cached value of the '{@link #getLocalBean() <em>Local Bean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalBean()
	 * @generated
	 * @ordered
	 */
	protected EmptyType localBean;

	/**
	 * The cached value of the '{@link #getServiceEndpoint() <em>Service Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceEndpoint()
	 * @generated
	 * @ordered
	 */
	protected FullyQualifiedClassType serviceEndpoint;

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
	 * The cached value of the '{@link #getSessionType() <em>Session Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionType()
	 * @generated
	 * @ordered
	 */
	protected SessionTypeType sessionType;

	/**
	 * The cached value of the '{@link #getStatefulTimeout() <em>Stateful Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatefulTimeout()
	 * @generated
	 * @ordered
	 */
	protected StatefulTimeoutType statefulTimeout;

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
	 * The cached value of the '{@link #getInitOnStartup() <em>Init On Startup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitOnStartup()
	 * @generated
	 * @ordered
	 */
	protected TrueFalseType initOnStartup;

	/**
	 * The cached value of the '{@link #getConcurrencyManagementType() <em>Concurrency Management Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrencyManagementType()
	 * @generated
	 * @ordered
	 */
	protected ConcurrencyManagementTypeType concurrencyManagementType;

	/**
	 * The cached value of the '{@link #getConcurrentMethod() <em>Concurrent Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrentMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcurrentMethodType> concurrentMethod;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected DependsOnType dependsOn;

	/**
	 * The cached value of the '{@link #getInitMethod() <em>Init Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<InitMethodType> initMethod;

	/**
	 * The cached value of the '{@link #getRemoveMethod() <em>Remove Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<RemoveMethodType> removeMethod;

	/**
	 * The cached value of the '{@link #getAsyncMethod() <em>Async Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsyncMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<AsyncMethodType> asyncMethod;

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
	 * The cached value of the '{@link #getAfterBeginMethod() <em>After Begin Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterBeginMethod()
	 * @generated
	 * @ordered
	 */
	protected NamedMethodType afterBeginMethod;

	/**
	 * The cached value of the '{@link #getBeforeCompletionMethod() <em>Before Completion Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeCompletionMethod()
	 * @generated
	 * @ordered
	 */
	protected NamedMethodType beforeCompletionMethod;

	/**
	 * The cached value of the '{@link #getAfterCompletionMethod() <em>After Completion Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterCompletionMethod()
	 * @generated
	 * @ordered
	 */
	protected NamedMethodType afterCompletionMethod;

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
	 * The cached value of the '{@link #getPostActivate() <em>Post Activate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostActivate()
	 * @generated
	 * @ordered
	 */
	protected EList<LifecycleCallbackType> postActivate;

	/**
	 * The cached value of the '{@link #getPrePassivate() <em>Pre Passivate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrePassivate()
	 * @generated
	 * @ordered
	 */
	protected EList<LifecycleCallbackType> prePassivate;

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
	protected SessionBeanTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar31Package.eINSTANCE.getSessionBeanType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__DESCRIPTION);
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
			displayName = new EObjectContainmentEList<DisplayNameType>(DisplayNameType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__DISPLAY_NAME);
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
			icon = new EObjectContainmentEList<IconType>(IconType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__ICON);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__EJB_NAME, oldEjbName, newEjbName);
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
				msgs = ((InternalEObject)ejbName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__EJB_NAME, null, msgs);
			if (newEjbName != null)
				msgs = ((InternalEObject)newEjbName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__EJB_NAME, null, msgs);
			msgs = basicSetEjbName(newEjbName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__EJB_NAME, newEjbName, newEjbName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__MAPPED_NAME, oldMappedName, newMappedName);
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
				msgs = ((InternalEObject)mappedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__MAPPED_NAME, null, msgs);
			if (newMappedName != null)
				msgs = ((InternalEObject)newMappedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__MAPPED_NAME, null, msgs);
			msgs = basicSetMappedName(newMappedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__MAPPED_NAME, newMappedName, newMappedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeType getHome() {
		return home;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHome(HomeType newHome, NotificationChain msgs) {
		HomeType oldHome = home;
		home = newHome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__HOME, oldHome, newHome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome(HomeType newHome) {
		if (newHome != home) {
			NotificationChain msgs = null;
			if (home != null)
				msgs = ((InternalEObject)home).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__HOME, null, msgs);
			if (newHome != null)
				msgs = ((InternalEObject)newHome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__HOME, null, msgs);
			msgs = basicSetHome(newHome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__HOME, newHome, newHome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteType getRemote() {
		return remote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemote(RemoteType newRemote, NotificationChain msgs) {
		RemoteType oldRemote = remote;
		remote = newRemote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__REMOTE, oldRemote, newRemote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemote(RemoteType newRemote) {
		if (newRemote != remote) {
			NotificationChain msgs = null;
			if (remote != null)
				msgs = ((InternalEObject)remote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__REMOTE, null, msgs);
			if (newRemote != null)
				msgs = ((InternalEObject)newRemote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__REMOTE, null, msgs);
			msgs = basicSetRemote(newRemote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__REMOTE, newRemote, newRemote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalHomeType getLocalHome() {
		return localHome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalHome(LocalHomeType newLocalHome, NotificationChain msgs) {
		LocalHomeType oldLocalHome = localHome;
		localHome = newLocalHome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_HOME, oldLocalHome, newLocalHome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalHome(LocalHomeType newLocalHome) {
		if (newLocalHome != localHome) {
			NotificationChain msgs = null;
			if (localHome != null)
				msgs = ((InternalEObject)localHome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_HOME, null, msgs);
			if (newLocalHome != null)
				msgs = ((InternalEObject)newLocalHome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_HOME, null, msgs);
			msgs = basicSetLocalHome(newLocalHome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_HOME, newLocalHome, newLocalHome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalType getLocal() {
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocal(LocalType newLocal, NotificationChain msgs) {
		LocalType oldLocal = local;
		local = newLocal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__LOCAL, oldLocal, newLocal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(LocalType newLocal) {
		if (newLocal != local) {
			NotificationChain msgs = null;
			if (local != null)
				msgs = ((InternalEObject)local).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__LOCAL, null, msgs);
			if (newLocal != null)
				msgs = ((InternalEObject)newLocal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__LOCAL, null, msgs);
			msgs = basicSetLocal(newLocal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__LOCAL, newLocal, newLocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FullyQualifiedClassType> getBusinessLocal() {
		if (businessLocal == null) {
			businessLocal = new EObjectContainmentEList<FullyQualifiedClassType>(FullyQualifiedClassType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__BUSINESS_LOCAL);
		}
		return businessLocal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FullyQualifiedClassType> getBusinessRemote() {
		if (businessRemote == null) {
			businessRemote = new EObjectContainmentEList<FullyQualifiedClassType>(FullyQualifiedClassType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__BUSINESS_REMOTE);
		}
		return businessRemote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyType getLocalBean() {
		return localBean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalBean(EmptyType newLocalBean, NotificationChain msgs) {
		EmptyType oldLocalBean = localBean;
		localBean = newLocalBean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_BEAN, oldLocalBean, newLocalBean);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalBean(EmptyType newLocalBean) {
		if (newLocalBean != localBean) {
			NotificationChain msgs = null;
			if (localBean != null)
				msgs = ((InternalEObject)localBean).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_BEAN, null, msgs);
			if (newLocalBean != null)
				msgs = ((InternalEObject)newLocalBean).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_BEAN, null, msgs);
			msgs = basicSetLocalBean(newLocalBean, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_BEAN, newLocalBean, newLocalBean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedClassType getServiceEndpoint() {
		return serviceEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceEndpoint(FullyQualifiedClassType newServiceEndpoint, NotificationChain msgs) {
		FullyQualifiedClassType oldServiceEndpoint = serviceEndpoint;
		serviceEndpoint = newServiceEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__SERVICE_ENDPOINT, oldServiceEndpoint, newServiceEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceEndpoint(FullyQualifiedClassType newServiceEndpoint) {
		if (newServiceEndpoint != serviceEndpoint) {
			NotificationChain msgs = null;
			if (serviceEndpoint != null)
				msgs = ((InternalEObject)serviceEndpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__SERVICE_ENDPOINT, null, msgs);
			if (newServiceEndpoint != null)
				msgs = ((InternalEObject)newServiceEndpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__SERVICE_ENDPOINT, null, msgs);
			msgs = basicSetServiceEndpoint(newServiceEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__SERVICE_ENDPOINT, newServiceEndpoint, newServiceEndpoint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__EJB_CLASS, oldEjbClass, newEjbClass);
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
				msgs = ((InternalEObject)ejbClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__EJB_CLASS, null, msgs);
			if (newEjbClass != null)
				msgs = ((InternalEObject)newEjbClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__EJB_CLASS, null, msgs);
			msgs = basicSetEjbClass(newEjbClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__EJB_CLASS, newEjbClass, newEjbClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionTypeType getSessionType() {
		return sessionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessionType(SessionTypeType newSessionType, NotificationChain msgs) {
		SessionTypeType oldSessionType = sessionType;
		sessionType = newSessionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__SESSION_TYPE, oldSessionType, newSessionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionType(SessionTypeType newSessionType) {
		if (newSessionType != sessionType) {
			NotificationChain msgs = null;
			if (sessionType != null)
				msgs = ((InternalEObject)sessionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__SESSION_TYPE, null, msgs);
			if (newSessionType != null)
				msgs = ((InternalEObject)newSessionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__SESSION_TYPE, null, msgs);
			msgs = basicSetSessionType(newSessionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__SESSION_TYPE, newSessionType, newSessionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatefulTimeoutType getStatefulTimeout() {
		return statefulTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatefulTimeout(StatefulTimeoutType newStatefulTimeout, NotificationChain msgs) {
		StatefulTimeoutType oldStatefulTimeout = statefulTimeout;
		statefulTimeout = newStatefulTimeout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__STATEFUL_TIMEOUT, oldStatefulTimeout, newStatefulTimeout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatefulTimeout(StatefulTimeoutType newStatefulTimeout) {
		if (newStatefulTimeout != statefulTimeout) {
			NotificationChain msgs = null;
			if (statefulTimeout != null)
				msgs = ((InternalEObject)statefulTimeout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__STATEFUL_TIMEOUT, null, msgs);
			if (newStatefulTimeout != null)
				msgs = ((InternalEObject)newStatefulTimeout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__STATEFUL_TIMEOUT, null, msgs);
			msgs = basicSetStatefulTimeout(newStatefulTimeout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__STATEFUL_TIMEOUT, newStatefulTimeout, newStatefulTimeout));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__TIMEOUT_METHOD, oldTimeoutMethod, newTimeoutMethod);
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
				msgs = ((InternalEObject)timeoutMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__TIMEOUT_METHOD, null, msgs);
			if (newTimeoutMethod != null)
				msgs = ((InternalEObject)newTimeoutMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__TIMEOUT_METHOD, null, msgs);
			msgs = basicSetTimeoutMethod(newTimeoutMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__TIMEOUT_METHOD, newTimeoutMethod, newTimeoutMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimerType> getTimer() {
		if (timer == null) {
			timer = new EObjectContainmentEList<TimerType>(TimerType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__TIMER);
		}
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType getInitOnStartup() {
		return initOnStartup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitOnStartup(TrueFalseType newInitOnStartup, NotificationChain msgs) {
		TrueFalseType oldInitOnStartup = initOnStartup;
		initOnStartup = newInitOnStartup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__INIT_ON_STARTUP, oldInitOnStartup, newInitOnStartup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitOnStartup(TrueFalseType newInitOnStartup) {
		if (newInitOnStartup != initOnStartup) {
			NotificationChain msgs = null;
			if (initOnStartup != null)
				msgs = ((InternalEObject)initOnStartup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__INIT_ON_STARTUP, null, msgs);
			if (newInitOnStartup != null)
				msgs = ((InternalEObject)newInitOnStartup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__INIT_ON_STARTUP, null, msgs);
			msgs = basicSetInitOnStartup(newInitOnStartup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__INIT_ON_STARTUP, newInitOnStartup, newInitOnStartup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrencyManagementTypeType getConcurrencyManagementType() {
		return concurrencyManagementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcurrencyManagementType(ConcurrencyManagementTypeType newConcurrencyManagementType, NotificationChain msgs) {
		ConcurrencyManagementTypeType oldConcurrencyManagementType = concurrencyManagementType;
		concurrencyManagementType = newConcurrencyManagementType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__CONCURRENCY_MANAGEMENT_TYPE, oldConcurrencyManagementType, newConcurrencyManagementType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrencyManagementType(ConcurrencyManagementTypeType newConcurrencyManagementType) {
		if (newConcurrencyManagementType != concurrencyManagementType) {
			NotificationChain msgs = null;
			if (concurrencyManagementType != null)
				msgs = ((InternalEObject)concurrencyManagementType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__CONCURRENCY_MANAGEMENT_TYPE, null, msgs);
			if (newConcurrencyManagementType != null)
				msgs = ((InternalEObject)newConcurrencyManagementType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__CONCURRENCY_MANAGEMENT_TYPE, null, msgs);
			msgs = basicSetConcurrencyManagementType(newConcurrencyManagementType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__CONCURRENCY_MANAGEMENT_TYPE, newConcurrencyManagementType, newConcurrencyManagementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcurrentMethodType> getConcurrentMethod() {
		if (concurrentMethod == null) {
			concurrentMethod = new EObjectContainmentEList<ConcurrentMethodType>(ConcurrentMethodType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__CONCURRENT_METHOD);
		}
		return concurrentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependsOnType getDependsOn() {
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependsOn(DependsOnType newDependsOn, NotificationChain msgs) {
		DependsOnType oldDependsOn = dependsOn;
		dependsOn = newDependsOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__DEPENDS_ON, oldDependsOn, newDependsOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependsOn(DependsOnType newDependsOn) {
		if (newDependsOn != dependsOn) {
			NotificationChain msgs = null;
			if (dependsOn != null)
				msgs = ((InternalEObject)dependsOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__DEPENDS_ON, null, msgs);
			if (newDependsOn != null)
				msgs = ((InternalEObject)newDependsOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__DEPENDS_ON, null, msgs);
			msgs = basicSetDependsOn(newDependsOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__DEPENDS_ON, newDependsOn, newDependsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InitMethodType> getInitMethod() {
		if (initMethod == null) {
			initMethod = new EObjectContainmentEList<InitMethodType>(InitMethodType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__INIT_METHOD);
		}
		return initMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RemoveMethodType> getRemoveMethod() {
		if (removeMethod == null) {
			removeMethod = new EObjectContainmentEList<RemoveMethodType>(RemoveMethodType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__REMOVE_METHOD);
		}
		return removeMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AsyncMethodType> getAsyncMethod() {
		if (asyncMethod == null) {
			asyncMethod = new EObjectContainmentEList<AsyncMethodType>(AsyncMethodType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__ASYNC_METHOD);
		}
		return asyncMethod;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__TRANSACTION_TYPE, oldTransactionType, newTransactionType);
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
				msgs = ((InternalEObject)transactionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__TRANSACTION_TYPE, null, msgs);
			if (newTransactionType != null)
				msgs = ((InternalEObject)newTransactionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__TRANSACTION_TYPE, null, msgs);
			msgs = basicSetTransactionType(newTransactionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__TRANSACTION_TYPE, newTransactionType, newTransactionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedMethodType getAfterBeginMethod() {
		return afterBeginMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAfterBeginMethod(NamedMethodType newAfterBeginMethod, NotificationChain msgs) {
		NamedMethodType oldAfterBeginMethod = afterBeginMethod;
		afterBeginMethod = newAfterBeginMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__AFTER_BEGIN_METHOD, oldAfterBeginMethod, newAfterBeginMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterBeginMethod(NamedMethodType newAfterBeginMethod) {
		if (newAfterBeginMethod != afterBeginMethod) {
			NotificationChain msgs = null;
			if (afterBeginMethod != null)
				msgs = ((InternalEObject)afterBeginMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__AFTER_BEGIN_METHOD, null, msgs);
			if (newAfterBeginMethod != null)
				msgs = ((InternalEObject)newAfterBeginMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__AFTER_BEGIN_METHOD, null, msgs);
			msgs = basicSetAfterBeginMethod(newAfterBeginMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__AFTER_BEGIN_METHOD, newAfterBeginMethod, newAfterBeginMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedMethodType getBeforeCompletionMethod() {
		return beforeCompletionMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeforeCompletionMethod(NamedMethodType newBeforeCompletionMethod, NotificationChain msgs) {
		NamedMethodType oldBeforeCompletionMethod = beforeCompletionMethod;
		beforeCompletionMethod = newBeforeCompletionMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__BEFORE_COMPLETION_METHOD, oldBeforeCompletionMethod, newBeforeCompletionMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeCompletionMethod(NamedMethodType newBeforeCompletionMethod) {
		if (newBeforeCompletionMethod != beforeCompletionMethod) {
			NotificationChain msgs = null;
			if (beforeCompletionMethod != null)
				msgs = ((InternalEObject)beforeCompletionMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__BEFORE_COMPLETION_METHOD, null, msgs);
			if (newBeforeCompletionMethod != null)
				msgs = ((InternalEObject)newBeforeCompletionMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__BEFORE_COMPLETION_METHOD, null, msgs);
			msgs = basicSetBeforeCompletionMethod(newBeforeCompletionMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__BEFORE_COMPLETION_METHOD, newBeforeCompletionMethod, newBeforeCompletionMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedMethodType getAfterCompletionMethod() {
		return afterCompletionMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAfterCompletionMethod(NamedMethodType newAfterCompletionMethod, NotificationChain msgs) {
		NamedMethodType oldAfterCompletionMethod = afterCompletionMethod;
		afterCompletionMethod = newAfterCompletionMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__AFTER_COMPLETION_METHOD, oldAfterCompletionMethod, newAfterCompletionMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterCompletionMethod(NamedMethodType newAfterCompletionMethod) {
		if (newAfterCompletionMethod != afterCompletionMethod) {
			NotificationChain msgs = null;
			if (afterCompletionMethod != null)
				msgs = ((InternalEObject)afterCompletionMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__AFTER_COMPLETION_METHOD, null, msgs);
			if (newAfterCompletionMethod != null)
				msgs = ((InternalEObject)newAfterCompletionMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__AFTER_COMPLETION_METHOD, null, msgs);
			msgs = basicSetAfterCompletionMethod(newAfterCompletionMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__AFTER_COMPLETION_METHOD, newAfterCompletionMethod, newAfterCompletionMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AroundInvokeType> getAroundInvoke() {
		if (aroundInvoke == null) {
			aroundInvoke = new EObjectContainmentEList<AroundInvokeType>(AroundInvokeType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__AROUND_INVOKE);
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
			aroundTimeout = new EObjectContainmentEList<AroundTimeoutType>(AroundTimeoutType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__AROUND_TIMEOUT);
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
			envEntry = new EObjectContainmentEList<EnvEntryType>(EnvEntryType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__ENV_ENTRY);
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
			ejbRef = new EObjectContainmentEList<EjbRefType>(EjbRefType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__EJB_REF);
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
			ejbLocalRef = new EObjectContainmentEList<EjbLocalRefType>(EjbLocalRefType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__EJB_LOCAL_REF);
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
			serviceRef = new EObjectContainmentEList<ServiceRefType>(ServiceRefType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__SERVICE_REF);
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
			resourceRef = new EObjectContainmentEList<ResourceRefType>(ResourceRefType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__RESOURCE_REF);
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
			resourceEnvRef = new EObjectContainmentEList<ResourceEnvRefType>(ResourceEnvRefType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__RESOURCE_ENV_REF);
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
			messageDestinationRef = new EObjectContainmentEList<MessageDestinationRefType>(MessageDestinationRefType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__MESSAGE_DESTINATION_REF);
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
			persistenceContextRef = new EObjectContainmentEList<PersistenceContextRefType>(PersistenceContextRefType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__PERSISTENCE_CONTEXT_REF);
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
			persistenceUnitRef = new EObjectContainmentEList<PersistenceUnitRefType>(PersistenceUnitRefType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__PERSISTENCE_UNIT_REF);
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
			postConstruct = new EObjectContainmentEList<LifecycleCallbackType>(LifecycleCallbackType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__POST_CONSTRUCT);
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
			preDestroy = new EObjectContainmentEList<LifecycleCallbackType>(LifecycleCallbackType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__PRE_DESTROY);
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
			dataSource = new EObjectContainmentEList<DataSourceType>(DataSourceType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__DATA_SOURCE);
		}
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LifecycleCallbackType> getPostActivate() {
		if (postActivate == null) {
			postActivate = new EObjectContainmentEList<LifecycleCallbackType>(LifecycleCallbackType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__POST_ACTIVATE);
		}
		return postActivate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LifecycleCallbackType> getPrePassivate() {
		if (prePassivate == null) {
			prePassivate = new EObjectContainmentEList<LifecycleCallbackType>(LifecycleCallbackType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__PRE_PASSIVATE);
		}
		return prePassivate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRoleRefType> getSecurityRoleRef() {
		if (securityRoleRef == null) {
			securityRoleRef = new EObjectContainmentEList<SecurityRoleRefType>(SecurityRoleRefType.class, this, EjbJar31Package.SESSION_BEAN_TYPE__SECURITY_ROLE_REF);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__SECURITY_IDENTITY, oldSecurityIdentity, newSecurityIdentity);
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
				msgs = ((InternalEObject)securityIdentity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__SECURITY_IDENTITY, null, msgs);
			if (newSecurityIdentity != null)
				msgs = ((InternalEObject)newSecurityIdentity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.SESSION_BEAN_TYPE__SECURITY_IDENTITY, null, msgs);
			msgs = basicSetSecurityIdentity(newSecurityIdentity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__SECURITY_IDENTITY, newSecurityIdentity, newSecurityIdentity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.SESSION_BEAN_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar31Package.SESSION_BEAN_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__DISPLAY_NAME:
				return ((InternalEList<?>)getDisplayName()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__ICON:
				return ((InternalEList<?>)getIcon()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_NAME:
				return basicSetEjbName(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__MAPPED_NAME:
				return basicSetMappedName(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__HOME:
				return basicSetHome(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__REMOTE:
				return basicSetRemote(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_HOME:
				return basicSetLocalHome(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__LOCAL:
				return basicSetLocal(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__BUSINESS_LOCAL:
				return ((InternalEList<?>)getBusinessLocal()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__BUSINESS_REMOTE:
				return ((InternalEList<?>)getBusinessRemote()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_BEAN:
				return basicSetLocalBean(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__SERVICE_ENDPOINT:
				return basicSetServiceEndpoint(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_CLASS:
				return basicSetEjbClass(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__SESSION_TYPE:
				return basicSetSessionType(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__STATEFUL_TIMEOUT:
				return basicSetStatefulTimeout(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__TIMEOUT_METHOD:
				return basicSetTimeoutMethod(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__TIMER:
				return ((InternalEList<?>)getTimer()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__INIT_ON_STARTUP:
				return basicSetInitOnStartup(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__CONCURRENCY_MANAGEMENT_TYPE:
				return basicSetConcurrencyManagementType(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__CONCURRENT_METHOD:
				return ((InternalEList<?>)getConcurrentMethod()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__DEPENDS_ON:
				return basicSetDependsOn(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__INIT_METHOD:
				return ((InternalEList<?>)getInitMethod()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__REMOVE_METHOD:
				return ((InternalEList<?>)getRemoveMethod()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__ASYNC_METHOD:
				return ((InternalEList<?>)getAsyncMethod()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__TRANSACTION_TYPE:
				return basicSetTransactionType(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__AFTER_BEGIN_METHOD:
				return basicSetAfterBeginMethod(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__BEFORE_COMPLETION_METHOD:
				return basicSetBeforeCompletionMethod(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__AFTER_COMPLETION_METHOD:
				return basicSetAfterCompletionMethod(null, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__AROUND_INVOKE:
				return ((InternalEList<?>)getAroundInvoke()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__AROUND_TIMEOUT:
				return ((InternalEList<?>)getAroundTimeout()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__ENV_ENTRY:
				return ((InternalEList<?>)getEnvEntry()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_REF:
				return ((InternalEList<?>)getEjbRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_LOCAL_REF:
				return ((InternalEList<?>)getEjbLocalRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__SERVICE_REF:
				return ((InternalEList<?>)getServiceRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__RESOURCE_REF:
				return ((InternalEList<?>)getResourceRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__RESOURCE_ENV_REF:
				return ((InternalEList<?>)getResourceEnvRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__MESSAGE_DESTINATION_REF:
				return ((InternalEList<?>)getMessageDestinationRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__PERSISTENCE_CONTEXT_REF:
				return ((InternalEList<?>)getPersistenceContextRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__PERSISTENCE_UNIT_REF:
				return ((InternalEList<?>)getPersistenceUnitRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__POST_CONSTRUCT:
				return ((InternalEList<?>)getPostConstruct()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__PRE_DESTROY:
				return ((InternalEList<?>)getPreDestroy()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__DATA_SOURCE:
				return ((InternalEList<?>)getDataSource()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__POST_ACTIVATE:
				return ((InternalEList<?>)getPostActivate()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__PRE_PASSIVATE:
				return ((InternalEList<?>)getPrePassivate()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__SECURITY_ROLE_REF:
				return ((InternalEList<?>)getSecurityRoleRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.SESSION_BEAN_TYPE__SECURITY_IDENTITY:
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
			case EjbJar31Package.SESSION_BEAN_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar31Package.SESSION_BEAN_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case EjbJar31Package.SESSION_BEAN_TYPE__ICON:
				return getIcon();
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_NAME:
				return getEjbName();
			case EjbJar31Package.SESSION_BEAN_TYPE__MAPPED_NAME:
				return getMappedName();
			case EjbJar31Package.SESSION_BEAN_TYPE__HOME:
				return getHome();
			case EjbJar31Package.SESSION_BEAN_TYPE__REMOTE:
				return getRemote();
			case EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_HOME:
				return getLocalHome();
			case EjbJar31Package.SESSION_BEAN_TYPE__LOCAL:
				return getLocal();
			case EjbJar31Package.SESSION_BEAN_TYPE__BUSINESS_LOCAL:
				return getBusinessLocal();
			case EjbJar31Package.SESSION_BEAN_TYPE__BUSINESS_REMOTE:
				return getBusinessRemote();
			case EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_BEAN:
				return getLocalBean();
			case EjbJar31Package.SESSION_BEAN_TYPE__SERVICE_ENDPOINT:
				return getServiceEndpoint();
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_CLASS:
				return getEjbClass();
			case EjbJar31Package.SESSION_BEAN_TYPE__SESSION_TYPE:
				return getSessionType();
			case EjbJar31Package.SESSION_BEAN_TYPE__STATEFUL_TIMEOUT:
				return getStatefulTimeout();
			case EjbJar31Package.SESSION_BEAN_TYPE__TIMEOUT_METHOD:
				return getTimeoutMethod();
			case EjbJar31Package.SESSION_BEAN_TYPE__TIMER:
				return getTimer();
			case EjbJar31Package.SESSION_BEAN_TYPE__INIT_ON_STARTUP:
				return getInitOnStartup();
			case EjbJar31Package.SESSION_BEAN_TYPE__CONCURRENCY_MANAGEMENT_TYPE:
				return getConcurrencyManagementType();
			case EjbJar31Package.SESSION_BEAN_TYPE__CONCURRENT_METHOD:
				return getConcurrentMethod();
			case EjbJar31Package.SESSION_BEAN_TYPE__DEPENDS_ON:
				return getDependsOn();
			case EjbJar31Package.SESSION_BEAN_TYPE__INIT_METHOD:
				return getInitMethod();
			case EjbJar31Package.SESSION_BEAN_TYPE__REMOVE_METHOD:
				return getRemoveMethod();
			case EjbJar31Package.SESSION_BEAN_TYPE__ASYNC_METHOD:
				return getAsyncMethod();
			case EjbJar31Package.SESSION_BEAN_TYPE__TRANSACTION_TYPE:
				return getTransactionType();
			case EjbJar31Package.SESSION_BEAN_TYPE__AFTER_BEGIN_METHOD:
				return getAfterBeginMethod();
			case EjbJar31Package.SESSION_BEAN_TYPE__BEFORE_COMPLETION_METHOD:
				return getBeforeCompletionMethod();
			case EjbJar31Package.SESSION_BEAN_TYPE__AFTER_COMPLETION_METHOD:
				return getAfterCompletionMethod();
			case EjbJar31Package.SESSION_BEAN_TYPE__AROUND_INVOKE:
				return getAroundInvoke();
			case EjbJar31Package.SESSION_BEAN_TYPE__AROUND_TIMEOUT:
				return getAroundTimeout();
			case EjbJar31Package.SESSION_BEAN_TYPE__ENV_ENTRY:
				return getEnvEntry();
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_REF:
				return getEjbRef();
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_LOCAL_REF:
				return getEjbLocalRef();
			case EjbJar31Package.SESSION_BEAN_TYPE__SERVICE_REF:
				return getServiceRef();
			case EjbJar31Package.SESSION_BEAN_TYPE__RESOURCE_REF:
				return getResourceRef();
			case EjbJar31Package.SESSION_BEAN_TYPE__RESOURCE_ENV_REF:
				return getResourceEnvRef();
			case EjbJar31Package.SESSION_BEAN_TYPE__MESSAGE_DESTINATION_REF:
				return getMessageDestinationRef();
			case EjbJar31Package.SESSION_BEAN_TYPE__PERSISTENCE_CONTEXT_REF:
				return getPersistenceContextRef();
			case EjbJar31Package.SESSION_BEAN_TYPE__PERSISTENCE_UNIT_REF:
				return getPersistenceUnitRef();
			case EjbJar31Package.SESSION_BEAN_TYPE__POST_CONSTRUCT:
				return getPostConstruct();
			case EjbJar31Package.SESSION_BEAN_TYPE__PRE_DESTROY:
				return getPreDestroy();
			case EjbJar31Package.SESSION_BEAN_TYPE__DATA_SOURCE:
				return getDataSource();
			case EjbJar31Package.SESSION_BEAN_TYPE__POST_ACTIVATE:
				return getPostActivate();
			case EjbJar31Package.SESSION_BEAN_TYPE__PRE_PASSIVATE:
				return getPrePassivate();
			case EjbJar31Package.SESSION_BEAN_TYPE__SECURITY_ROLE_REF:
				return getSecurityRoleRef();
			case EjbJar31Package.SESSION_BEAN_TYPE__SECURITY_IDENTITY:
				return getSecurityIdentity();
			case EjbJar31Package.SESSION_BEAN_TYPE__ID:
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
			case EjbJar31Package.SESSION_BEAN_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				getDisplayName().addAll((Collection<? extends DisplayNameType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__ICON:
				getIcon().clear();
				getIcon().addAll((Collection<? extends IconType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_NAME:
				setEjbName((EjbNameType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__MAPPED_NAME:
				setMappedName((XsdStringType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__HOME:
				setHome((HomeType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__REMOTE:
				setRemote((RemoteType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_HOME:
				setLocalHome((LocalHomeType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__LOCAL:
				setLocal((LocalType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__BUSINESS_LOCAL:
				getBusinessLocal().clear();
				getBusinessLocal().addAll((Collection<? extends FullyQualifiedClassType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__BUSINESS_REMOTE:
				getBusinessRemote().clear();
				getBusinessRemote().addAll((Collection<? extends FullyQualifiedClassType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_BEAN:
				setLocalBean((EmptyType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__SERVICE_ENDPOINT:
				setServiceEndpoint((FullyQualifiedClassType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_CLASS:
				setEjbClass((EjbClassType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__SESSION_TYPE:
				setSessionType((SessionTypeType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__STATEFUL_TIMEOUT:
				setStatefulTimeout((StatefulTimeoutType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__TIMEOUT_METHOD:
				setTimeoutMethod((NamedMethodType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__TIMER:
				getTimer().clear();
				getTimer().addAll((Collection<? extends TimerType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__INIT_ON_STARTUP:
				setInitOnStartup((TrueFalseType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__CONCURRENCY_MANAGEMENT_TYPE:
				setConcurrencyManagementType((ConcurrencyManagementTypeType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__CONCURRENT_METHOD:
				getConcurrentMethod().clear();
				getConcurrentMethod().addAll((Collection<? extends ConcurrentMethodType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__DEPENDS_ON:
				setDependsOn((DependsOnType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__INIT_METHOD:
				getInitMethod().clear();
				getInitMethod().addAll((Collection<? extends InitMethodType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__REMOVE_METHOD:
				getRemoveMethod().clear();
				getRemoveMethod().addAll((Collection<? extends RemoveMethodType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__ASYNC_METHOD:
				getAsyncMethod().clear();
				getAsyncMethod().addAll((Collection<? extends AsyncMethodType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__TRANSACTION_TYPE:
				setTransactionType((TransactionTypeType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__AFTER_BEGIN_METHOD:
				setAfterBeginMethod((NamedMethodType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__BEFORE_COMPLETION_METHOD:
				setBeforeCompletionMethod((NamedMethodType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__AFTER_COMPLETION_METHOD:
				setAfterCompletionMethod((NamedMethodType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__AROUND_INVOKE:
				getAroundInvoke().clear();
				getAroundInvoke().addAll((Collection<? extends AroundInvokeType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__AROUND_TIMEOUT:
				getAroundTimeout().clear();
				getAroundTimeout().addAll((Collection<? extends AroundTimeoutType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				getEnvEntry().addAll((Collection<? extends EnvEntryType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_REF:
				getEjbRef().clear();
				getEjbRef().addAll((Collection<? extends EjbRefType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				getEjbLocalRef().addAll((Collection<? extends EjbLocalRefType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__SERVICE_REF:
				getServiceRef().clear();
				getServiceRef().addAll((Collection<? extends ServiceRefType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				getResourceRef().addAll((Collection<? extends ResourceRefType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				getResourceEnvRef().addAll((Collection<? extends ResourceEnvRefType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__MESSAGE_DESTINATION_REF:
				getMessageDestinationRef().clear();
				getMessageDestinationRef().addAll((Collection<? extends MessageDestinationRefType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__PERSISTENCE_CONTEXT_REF:
				getPersistenceContextRef().clear();
				getPersistenceContextRef().addAll((Collection<? extends PersistenceContextRefType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__PERSISTENCE_UNIT_REF:
				getPersistenceUnitRef().clear();
				getPersistenceUnitRef().addAll((Collection<? extends PersistenceUnitRefType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__POST_CONSTRUCT:
				getPostConstruct().clear();
				getPostConstruct().addAll((Collection<? extends LifecycleCallbackType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__PRE_DESTROY:
				getPreDestroy().clear();
				getPreDestroy().addAll((Collection<? extends LifecycleCallbackType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__DATA_SOURCE:
				getDataSource().clear();
				getDataSource().addAll((Collection<? extends DataSourceType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__POST_ACTIVATE:
				getPostActivate().clear();
				getPostActivate().addAll((Collection<? extends LifecycleCallbackType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__PRE_PASSIVATE:
				getPrePassivate().clear();
				getPrePassivate().addAll((Collection<? extends LifecycleCallbackType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__SECURITY_ROLE_REF:
				getSecurityRoleRef().clear();
				getSecurityRoleRef().addAll((Collection<? extends SecurityRoleRefType>)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__SECURITY_IDENTITY:
				setSecurityIdentity((SecurityIdentityType)newValue);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__ID:
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
			case EjbJar31Package.SESSION_BEAN_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__ICON:
				getIcon().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_NAME:
				setEjbName((EjbNameType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__MAPPED_NAME:
				setMappedName((XsdStringType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__HOME:
				setHome((HomeType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__REMOTE:
				setRemote((RemoteType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_HOME:
				setLocalHome((LocalHomeType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__LOCAL:
				setLocal((LocalType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__BUSINESS_LOCAL:
				getBusinessLocal().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__BUSINESS_REMOTE:
				getBusinessRemote().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_BEAN:
				setLocalBean((EmptyType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__SERVICE_ENDPOINT:
				setServiceEndpoint((FullyQualifiedClassType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_CLASS:
				setEjbClass((EjbClassType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__SESSION_TYPE:
				setSessionType((SessionTypeType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__STATEFUL_TIMEOUT:
				setStatefulTimeout((StatefulTimeoutType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__TIMEOUT_METHOD:
				setTimeoutMethod((NamedMethodType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__TIMER:
				getTimer().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__INIT_ON_STARTUP:
				setInitOnStartup((TrueFalseType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__CONCURRENCY_MANAGEMENT_TYPE:
				setConcurrencyManagementType((ConcurrencyManagementTypeType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__CONCURRENT_METHOD:
				getConcurrentMethod().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__DEPENDS_ON:
				setDependsOn((DependsOnType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__INIT_METHOD:
				getInitMethod().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__REMOVE_METHOD:
				getRemoveMethod().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__ASYNC_METHOD:
				getAsyncMethod().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__TRANSACTION_TYPE:
				setTransactionType((TransactionTypeType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__AFTER_BEGIN_METHOD:
				setAfterBeginMethod((NamedMethodType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__BEFORE_COMPLETION_METHOD:
				setBeforeCompletionMethod((NamedMethodType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__AFTER_COMPLETION_METHOD:
				setAfterCompletionMethod((NamedMethodType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__AROUND_INVOKE:
				getAroundInvoke().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__AROUND_TIMEOUT:
				getAroundTimeout().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_REF:
				getEjbRef().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__SERVICE_REF:
				getServiceRef().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__MESSAGE_DESTINATION_REF:
				getMessageDestinationRef().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__PERSISTENCE_CONTEXT_REF:
				getPersistenceContextRef().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__PERSISTENCE_UNIT_REF:
				getPersistenceUnitRef().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__POST_CONSTRUCT:
				getPostConstruct().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__PRE_DESTROY:
				getPreDestroy().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__DATA_SOURCE:
				getDataSource().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__POST_ACTIVATE:
				getPostActivate().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__PRE_PASSIVATE:
				getPrePassivate().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__SECURITY_ROLE_REF:
				getSecurityRoleRef().clear();
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__SECURITY_IDENTITY:
				setSecurityIdentity((SecurityIdentityType)null);
				return;
			case EjbJar31Package.SESSION_BEAN_TYPE__ID:
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
			case EjbJar31Package.SESSION_BEAN_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__DISPLAY_NAME:
				return displayName != null && !displayName.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__ICON:
				return icon != null && !icon.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_NAME:
				return ejbName != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__MAPPED_NAME:
				return mappedName != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__HOME:
				return home != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__REMOTE:
				return remote != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_HOME:
				return localHome != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__LOCAL:
				return local != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__BUSINESS_LOCAL:
				return businessLocal != null && !businessLocal.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__BUSINESS_REMOTE:
				return businessRemote != null && !businessRemote.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__LOCAL_BEAN:
				return localBean != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__SERVICE_ENDPOINT:
				return serviceEndpoint != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_CLASS:
				return ejbClass != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__SESSION_TYPE:
				return sessionType != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__STATEFUL_TIMEOUT:
				return statefulTimeout != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__TIMEOUT_METHOD:
				return timeoutMethod != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__TIMER:
				return timer != null && !timer.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__INIT_ON_STARTUP:
				return initOnStartup != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__CONCURRENCY_MANAGEMENT_TYPE:
				return concurrencyManagementType != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__CONCURRENT_METHOD:
				return concurrentMethod != null && !concurrentMethod.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__DEPENDS_ON:
				return dependsOn != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__INIT_METHOD:
				return initMethod != null && !initMethod.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__REMOVE_METHOD:
				return removeMethod != null && !removeMethod.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__ASYNC_METHOD:
				return asyncMethod != null && !asyncMethod.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__TRANSACTION_TYPE:
				return transactionType != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__AFTER_BEGIN_METHOD:
				return afterBeginMethod != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__BEFORE_COMPLETION_METHOD:
				return beforeCompletionMethod != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__AFTER_COMPLETION_METHOD:
				return afterCompletionMethod != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__AROUND_INVOKE:
				return aroundInvoke != null && !aroundInvoke.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__AROUND_TIMEOUT:
				return aroundTimeout != null && !aroundTimeout.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__ENV_ENTRY:
				return envEntry != null && !envEntry.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_REF:
				return ejbRef != null && !ejbRef.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__EJB_LOCAL_REF:
				return ejbLocalRef != null && !ejbLocalRef.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__SERVICE_REF:
				return serviceRef != null && !serviceRef.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__RESOURCE_REF:
				return resourceRef != null && !resourceRef.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__RESOURCE_ENV_REF:
				return resourceEnvRef != null && !resourceEnvRef.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__MESSAGE_DESTINATION_REF:
				return messageDestinationRef != null && !messageDestinationRef.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__PERSISTENCE_CONTEXT_REF:
				return persistenceContextRef != null && !persistenceContextRef.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__PERSISTENCE_UNIT_REF:
				return persistenceUnitRef != null && !persistenceUnitRef.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__POST_CONSTRUCT:
				return postConstruct != null && !postConstruct.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__PRE_DESTROY:
				return preDestroy != null && !preDestroy.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__DATA_SOURCE:
				return dataSource != null && !dataSource.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__POST_ACTIVATE:
				return postActivate != null && !postActivate.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__PRE_PASSIVATE:
				return prePassivate != null && !prePassivate.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__SECURITY_ROLE_REF:
				return securityRoleRef != null && !securityRoleRef.isEmpty();
			case EjbJar31Package.SESSION_BEAN_TYPE__SECURITY_IDENTITY:
				return securityIdentity != null;
			case EjbJar31Package.SESSION_BEAN_TYPE__ID:
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

} //SessionBeanTypeImpl
