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
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DataSourceType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbLocalRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EnvEntryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.FullyQualifiedClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.InterceptorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.LifecycleCallbackType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MessageDestinationRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PersistenceContextRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.PersistenceUnitRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResourceEnvRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResourceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ServiceRefType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interceptor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getInterceptorClass <em>Interceptor Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getAroundInvoke <em>Around Invoke</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getAroundTimeout <em>Around Timeout</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getServiceRef <em>Service Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getMessageDestinationRef <em>Message Destination Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getPersistenceContextRef <em>Persistence Context Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getPersistenceUnitRef <em>Persistence Unit Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getPostConstruct <em>Post Construct</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getPreDestroy <em>Pre Destroy</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getPostActivate <em>Post Activate</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getPrePassivate <em>Pre Passivate</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterceptorTypeImpl extends EObjectImpl implements InterceptorType {
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
	 * The cached value of the '{@link #getInterceptorClass() <em>Interceptor Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterceptorClass()
	 * @generated
	 * @ordered
	 */
	protected FullyQualifiedClassType interceptorClass;

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
	protected InterceptorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar31Package.eINSTANCE.getInterceptorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, EjbJar31Package.INTERCEPTOR_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedClassType getInterceptorClass() {
		return interceptorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterceptorClass(FullyQualifiedClassType newInterceptorClass, NotificationChain msgs) {
		FullyQualifiedClassType oldInterceptorClass = interceptorClass;
		interceptorClass = newInterceptorClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.INTERCEPTOR_TYPE__INTERCEPTOR_CLASS, oldInterceptorClass, newInterceptorClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterceptorClass(FullyQualifiedClassType newInterceptorClass) {
		if (newInterceptorClass != interceptorClass) {
			NotificationChain msgs = null;
			if (interceptorClass != null)
				msgs = ((InternalEObject)interceptorClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.INTERCEPTOR_TYPE__INTERCEPTOR_CLASS, null, msgs);
			if (newInterceptorClass != null)
				msgs = ((InternalEObject)newInterceptorClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.INTERCEPTOR_TYPE__INTERCEPTOR_CLASS, null, msgs);
			msgs = basicSetInterceptorClass(newInterceptorClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.INTERCEPTOR_TYPE__INTERCEPTOR_CLASS, newInterceptorClass, newInterceptorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AroundInvokeType> getAroundInvoke() {
		if (aroundInvoke == null) {
			aroundInvoke = new EObjectContainmentEList<AroundInvokeType>(AroundInvokeType.class, this, EjbJar31Package.INTERCEPTOR_TYPE__AROUND_INVOKE);
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
			aroundTimeout = new EObjectContainmentEList<AroundTimeoutType>(AroundTimeoutType.class, this, EjbJar31Package.INTERCEPTOR_TYPE__AROUND_TIMEOUT);
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
			envEntry = new EObjectContainmentEList<EnvEntryType>(EnvEntryType.class, this, EjbJar31Package.INTERCEPTOR_TYPE__ENV_ENTRY);
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
			ejbRef = new EObjectContainmentEList<EjbRefType>(EjbRefType.class, this, EjbJar31Package.INTERCEPTOR_TYPE__EJB_REF);
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
			ejbLocalRef = new EObjectContainmentEList<EjbLocalRefType>(EjbLocalRefType.class, this, EjbJar31Package.INTERCEPTOR_TYPE__EJB_LOCAL_REF);
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
			serviceRef = new EObjectContainmentEList<ServiceRefType>(ServiceRefType.class, this, EjbJar31Package.INTERCEPTOR_TYPE__SERVICE_REF);
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
			resourceRef = new EObjectContainmentEList<ResourceRefType>(ResourceRefType.class, this, EjbJar31Package.INTERCEPTOR_TYPE__RESOURCE_REF);
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
			resourceEnvRef = new EObjectContainmentEList<ResourceEnvRefType>(ResourceEnvRefType.class, this, EjbJar31Package.INTERCEPTOR_TYPE__RESOURCE_ENV_REF);
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
			messageDestinationRef = new EObjectContainmentEList<MessageDestinationRefType>(MessageDestinationRefType.class, this, EjbJar31Package.INTERCEPTOR_TYPE__MESSAGE_DESTINATION_REF);
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
			persistenceContextRef = new EObjectContainmentEList<PersistenceContextRefType>(PersistenceContextRefType.class, this, EjbJar31Package.INTERCEPTOR_TYPE__PERSISTENCE_CONTEXT_REF);
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
			persistenceUnitRef = new EObjectContainmentEList<PersistenceUnitRefType>(PersistenceUnitRefType.class, this, EjbJar31Package.INTERCEPTOR_TYPE__PERSISTENCE_UNIT_REF);
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
			postConstruct = new EObjectContainmentEList<LifecycleCallbackType>(LifecycleCallbackType.class, this, EjbJar31Package.INTERCEPTOR_TYPE__POST_CONSTRUCT);
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
			preDestroy = new EObjectContainmentEList<LifecycleCallbackType>(LifecycleCallbackType.class, this, EjbJar31Package.INTERCEPTOR_TYPE__PRE_DESTROY);
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
			dataSource = new EObjectContainmentEList<DataSourceType>(DataSourceType.class, this, EjbJar31Package.INTERCEPTOR_TYPE__DATA_SOURCE);
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
			postActivate = new EObjectContainmentEList<LifecycleCallbackType>(LifecycleCallbackType.class, this, EjbJar31Package.INTERCEPTOR_TYPE__POST_ACTIVATE);
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
			prePassivate = new EObjectContainmentEList<LifecycleCallbackType>(LifecycleCallbackType.class, this, EjbJar31Package.INTERCEPTOR_TYPE__PRE_PASSIVATE);
		}
		return prePassivate;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.INTERCEPTOR_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar31Package.INTERCEPTOR_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_TYPE__INTERCEPTOR_CLASS:
				return basicSetInterceptorClass(null, msgs);
			case EjbJar31Package.INTERCEPTOR_TYPE__AROUND_INVOKE:
				return ((InternalEList<?>)getAroundInvoke()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_TYPE__AROUND_TIMEOUT:
				return ((InternalEList<?>)getAroundTimeout()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_TYPE__ENV_ENTRY:
				return ((InternalEList<?>)getEnvEntry()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_TYPE__EJB_REF:
				return ((InternalEList<?>)getEjbRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_TYPE__EJB_LOCAL_REF:
				return ((InternalEList<?>)getEjbLocalRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_TYPE__SERVICE_REF:
				return ((InternalEList<?>)getServiceRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_TYPE__RESOURCE_REF:
				return ((InternalEList<?>)getResourceRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_TYPE__RESOURCE_ENV_REF:
				return ((InternalEList<?>)getResourceEnvRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_TYPE__MESSAGE_DESTINATION_REF:
				return ((InternalEList<?>)getMessageDestinationRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_TYPE__PERSISTENCE_CONTEXT_REF:
				return ((InternalEList<?>)getPersistenceContextRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_TYPE__PERSISTENCE_UNIT_REF:
				return ((InternalEList<?>)getPersistenceUnitRef()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_TYPE__POST_CONSTRUCT:
				return ((InternalEList<?>)getPostConstruct()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_TYPE__PRE_DESTROY:
				return ((InternalEList<?>)getPreDestroy()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_TYPE__DATA_SOURCE:
				return ((InternalEList<?>)getDataSource()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_TYPE__POST_ACTIVATE:
				return ((InternalEList<?>)getPostActivate()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_TYPE__PRE_PASSIVATE:
				return ((InternalEList<?>)getPrePassivate()).basicRemove(otherEnd, msgs);
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
			case EjbJar31Package.INTERCEPTOR_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar31Package.INTERCEPTOR_TYPE__INTERCEPTOR_CLASS:
				return getInterceptorClass();
			case EjbJar31Package.INTERCEPTOR_TYPE__AROUND_INVOKE:
				return getAroundInvoke();
			case EjbJar31Package.INTERCEPTOR_TYPE__AROUND_TIMEOUT:
				return getAroundTimeout();
			case EjbJar31Package.INTERCEPTOR_TYPE__ENV_ENTRY:
				return getEnvEntry();
			case EjbJar31Package.INTERCEPTOR_TYPE__EJB_REF:
				return getEjbRef();
			case EjbJar31Package.INTERCEPTOR_TYPE__EJB_LOCAL_REF:
				return getEjbLocalRef();
			case EjbJar31Package.INTERCEPTOR_TYPE__SERVICE_REF:
				return getServiceRef();
			case EjbJar31Package.INTERCEPTOR_TYPE__RESOURCE_REF:
				return getResourceRef();
			case EjbJar31Package.INTERCEPTOR_TYPE__RESOURCE_ENV_REF:
				return getResourceEnvRef();
			case EjbJar31Package.INTERCEPTOR_TYPE__MESSAGE_DESTINATION_REF:
				return getMessageDestinationRef();
			case EjbJar31Package.INTERCEPTOR_TYPE__PERSISTENCE_CONTEXT_REF:
				return getPersistenceContextRef();
			case EjbJar31Package.INTERCEPTOR_TYPE__PERSISTENCE_UNIT_REF:
				return getPersistenceUnitRef();
			case EjbJar31Package.INTERCEPTOR_TYPE__POST_CONSTRUCT:
				return getPostConstruct();
			case EjbJar31Package.INTERCEPTOR_TYPE__PRE_DESTROY:
				return getPreDestroy();
			case EjbJar31Package.INTERCEPTOR_TYPE__DATA_SOURCE:
				return getDataSource();
			case EjbJar31Package.INTERCEPTOR_TYPE__POST_ACTIVATE:
				return getPostActivate();
			case EjbJar31Package.INTERCEPTOR_TYPE__PRE_PASSIVATE:
				return getPrePassivate();
			case EjbJar31Package.INTERCEPTOR_TYPE__ID:
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
			case EjbJar31Package.INTERCEPTOR_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__INTERCEPTOR_CLASS:
				setInterceptorClass((FullyQualifiedClassType)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__AROUND_INVOKE:
				getAroundInvoke().clear();
				getAroundInvoke().addAll((Collection<? extends AroundInvokeType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__AROUND_TIMEOUT:
				getAroundTimeout().clear();
				getAroundTimeout().addAll((Collection<? extends AroundTimeoutType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				getEnvEntry().addAll((Collection<? extends EnvEntryType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__EJB_REF:
				getEjbRef().clear();
				getEjbRef().addAll((Collection<? extends EjbRefType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				getEjbLocalRef().addAll((Collection<? extends EjbLocalRefType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__SERVICE_REF:
				getServiceRef().clear();
				getServiceRef().addAll((Collection<? extends ServiceRefType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				getResourceRef().addAll((Collection<? extends ResourceRefType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				getResourceEnvRef().addAll((Collection<? extends ResourceEnvRefType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__MESSAGE_DESTINATION_REF:
				getMessageDestinationRef().clear();
				getMessageDestinationRef().addAll((Collection<? extends MessageDestinationRefType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__PERSISTENCE_CONTEXT_REF:
				getPersistenceContextRef().clear();
				getPersistenceContextRef().addAll((Collection<? extends PersistenceContextRefType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__PERSISTENCE_UNIT_REF:
				getPersistenceUnitRef().clear();
				getPersistenceUnitRef().addAll((Collection<? extends PersistenceUnitRefType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__POST_CONSTRUCT:
				getPostConstruct().clear();
				getPostConstruct().addAll((Collection<? extends LifecycleCallbackType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__PRE_DESTROY:
				getPreDestroy().clear();
				getPreDestroy().addAll((Collection<? extends LifecycleCallbackType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__DATA_SOURCE:
				getDataSource().clear();
				getDataSource().addAll((Collection<? extends DataSourceType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__POST_ACTIVATE:
				getPostActivate().clear();
				getPostActivate().addAll((Collection<? extends LifecycleCallbackType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__PRE_PASSIVATE:
				getPrePassivate().clear();
				getPrePassivate().addAll((Collection<? extends LifecycleCallbackType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__ID:
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
			case EjbJar31Package.INTERCEPTOR_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__INTERCEPTOR_CLASS:
				setInterceptorClass((FullyQualifiedClassType)null);
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__AROUND_INVOKE:
				getAroundInvoke().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__AROUND_TIMEOUT:
				getAroundTimeout().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__EJB_REF:
				getEjbRef().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__SERVICE_REF:
				getServiceRef().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__MESSAGE_DESTINATION_REF:
				getMessageDestinationRef().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__PERSISTENCE_CONTEXT_REF:
				getPersistenceContextRef().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__PERSISTENCE_UNIT_REF:
				getPersistenceUnitRef().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__POST_CONSTRUCT:
				getPostConstruct().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__PRE_DESTROY:
				getPreDestroy().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__DATA_SOURCE:
				getDataSource().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__POST_ACTIVATE:
				getPostActivate().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__PRE_PASSIVATE:
				getPrePassivate().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_TYPE__ID:
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
			case EjbJar31Package.INTERCEPTOR_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case EjbJar31Package.INTERCEPTOR_TYPE__INTERCEPTOR_CLASS:
				return interceptorClass != null;
			case EjbJar31Package.INTERCEPTOR_TYPE__AROUND_INVOKE:
				return aroundInvoke != null && !aroundInvoke.isEmpty();
			case EjbJar31Package.INTERCEPTOR_TYPE__AROUND_TIMEOUT:
				return aroundTimeout != null && !aroundTimeout.isEmpty();
			case EjbJar31Package.INTERCEPTOR_TYPE__ENV_ENTRY:
				return envEntry != null && !envEntry.isEmpty();
			case EjbJar31Package.INTERCEPTOR_TYPE__EJB_REF:
				return ejbRef != null && !ejbRef.isEmpty();
			case EjbJar31Package.INTERCEPTOR_TYPE__EJB_LOCAL_REF:
				return ejbLocalRef != null && !ejbLocalRef.isEmpty();
			case EjbJar31Package.INTERCEPTOR_TYPE__SERVICE_REF:
				return serviceRef != null && !serviceRef.isEmpty();
			case EjbJar31Package.INTERCEPTOR_TYPE__RESOURCE_REF:
				return resourceRef != null && !resourceRef.isEmpty();
			case EjbJar31Package.INTERCEPTOR_TYPE__RESOURCE_ENV_REF:
				return resourceEnvRef != null && !resourceEnvRef.isEmpty();
			case EjbJar31Package.INTERCEPTOR_TYPE__MESSAGE_DESTINATION_REF:
				return messageDestinationRef != null && !messageDestinationRef.isEmpty();
			case EjbJar31Package.INTERCEPTOR_TYPE__PERSISTENCE_CONTEXT_REF:
				return persistenceContextRef != null && !persistenceContextRef.isEmpty();
			case EjbJar31Package.INTERCEPTOR_TYPE__PERSISTENCE_UNIT_REF:
				return persistenceUnitRef != null && !persistenceUnitRef.isEmpty();
			case EjbJar31Package.INTERCEPTOR_TYPE__POST_CONSTRUCT:
				return postConstruct != null && !postConstruct.isEmpty();
			case EjbJar31Package.INTERCEPTOR_TYPE__PRE_DESTROY:
				return preDestroy != null && !preDestroy.isEmpty();
			case EjbJar31Package.INTERCEPTOR_TYPE__DATA_SOURCE:
				return dataSource != null && !dataSource.isEmpty();
			case EjbJar31Package.INTERCEPTOR_TYPE__POST_ACTIVATE:
				return postActivate != null && !postActivate.isEmpty();
			case EjbJar31Package.INTERCEPTOR_TYPE__PRE_PASSIVATE:
				return prePassivate != null && !prePassivate.isEmpty();
			case EjbJar31Package.INTERCEPTOR_TYPE__ID:
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

} //InterceptorTypeImpl
