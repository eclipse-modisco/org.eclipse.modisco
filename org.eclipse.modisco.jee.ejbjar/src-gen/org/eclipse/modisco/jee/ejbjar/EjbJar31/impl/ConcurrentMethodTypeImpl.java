/**
 * Copyright (c) 2010, 2019 Mia-Software.
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.ejbjar.EjbJar31.AccessTimeoutType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrentLockTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ConcurrentMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.NamedMethodType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concurrent Method Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.ConcurrentMethodTypeImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.ConcurrentMethodTypeImpl#getLock <em>Lock</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.ConcurrentMethodTypeImpl#getAccessTimeout <em>Access Timeout</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.ConcurrentMethodTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcurrentMethodTypeImpl extends EObjectImpl implements ConcurrentMethodType {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected NamedMethodType method;

	/**
	 * The cached value of the '{@link #getLock() <em>Lock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLock()
	 * @generated
	 * @ordered
	 */
	protected ConcurrentLockTypeType lock;

	/**
	 * The cached value of the '{@link #getAccessTimeout() <em>Access Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessTimeout()
	 * @generated
	 * @ordered
	 */
	protected AccessTimeoutType accessTimeout;

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
	protected ConcurrentMethodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar31Package.eINSTANCE.getConcurrentMethodType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedMethodType getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(NamedMethodType newMethod, NotificationChain msgs) {
		NamedMethodType oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.CONCURRENT_METHOD_TYPE__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(NamedMethodType newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.CONCURRENT_METHOD_TYPE__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.CONCURRENT_METHOD_TYPE__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.CONCURRENT_METHOD_TYPE__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrentLockTypeType getLock() {
		return lock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLock(ConcurrentLockTypeType newLock, NotificationChain msgs) {
		ConcurrentLockTypeType oldLock = lock;
		lock = newLock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.CONCURRENT_METHOD_TYPE__LOCK, oldLock, newLock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLock(ConcurrentLockTypeType newLock) {
		if (newLock != lock) {
			NotificationChain msgs = null;
			if (lock != null)
				msgs = ((InternalEObject)lock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.CONCURRENT_METHOD_TYPE__LOCK, null, msgs);
			if (newLock != null)
				msgs = ((InternalEObject)newLock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.CONCURRENT_METHOD_TYPE__LOCK, null, msgs);
			msgs = basicSetLock(newLock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.CONCURRENT_METHOD_TYPE__LOCK, newLock, newLock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessTimeoutType getAccessTimeout() {
		return accessTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessTimeout(AccessTimeoutType newAccessTimeout, NotificationChain msgs) {
		AccessTimeoutType oldAccessTimeout = accessTimeout;
		accessTimeout = newAccessTimeout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.CONCURRENT_METHOD_TYPE__ACCESS_TIMEOUT, oldAccessTimeout, newAccessTimeout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessTimeout(AccessTimeoutType newAccessTimeout) {
		if (newAccessTimeout != accessTimeout) {
			NotificationChain msgs = null;
			if (accessTimeout != null)
				msgs = ((InternalEObject)accessTimeout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.CONCURRENT_METHOD_TYPE__ACCESS_TIMEOUT, null, msgs);
			if (newAccessTimeout != null)
				msgs = ((InternalEObject)newAccessTimeout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.CONCURRENT_METHOD_TYPE__ACCESS_TIMEOUT, null, msgs);
			msgs = basicSetAccessTimeout(newAccessTimeout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.CONCURRENT_METHOD_TYPE__ACCESS_TIMEOUT, newAccessTimeout, newAccessTimeout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.CONCURRENT_METHOD_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__METHOD:
				return basicSetMethod(null, msgs);
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__LOCK:
				return basicSetLock(null, msgs);
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__ACCESS_TIMEOUT:
				return basicSetAccessTimeout(null, msgs);
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
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__METHOD:
				return getMethod();
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__LOCK:
				return getLock();
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__ACCESS_TIMEOUT:
				return getAccessTimeout();
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__METHOD:
				setMethod((NamedMethodType)newValue);
				return;
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__LOCK:
				setLock((ConcurrentLockTypeType)newValue);
				return;
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__ACCESS_TIMEOUT:
				setAccessTimeout((AccessTimeoutType)newValue);
				return;
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__ID:
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
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__METHOD:
				setMethod((NamedMethodType)null);
				return;
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__LOCK:
				setLock((ConcurrentLockTypeType)null);
				return;
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__ACCESS_TIMEOUT:
				setAccessTimeout((AccessTimeoutType)null);
				return;
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__ID:
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
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__METHOD:
				return method != null;
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__LOCK:
				return lock != null;
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__ACCESS_TIMEOUT:
				return accessTimeout != null;
			case EjbJar31Package.CONCURRENT_METHOD_TYPE__ID:
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

} //ConcurrentMethodTypeImpl
