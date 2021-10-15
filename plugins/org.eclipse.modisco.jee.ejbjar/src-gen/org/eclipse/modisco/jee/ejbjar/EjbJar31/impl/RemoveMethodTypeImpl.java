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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.NamedMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.RemoveMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TrueFalseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Method Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.RemoveMethodTypeImpl#getBeanMethod <em>Bean Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.RemoveMethodTypeImpl#getRetainIfException <em>Retain If Exception</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.RemoveMethodTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoveMethodTypeImpl extends EObjectImpl implements RemoveMethodType {
	/**
	 * The cached value of the '{@link #getBeanMethod() <em>Bean Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeanMethod()
	 * @generated
	 * @ordered
	 */
	protected NamedMethodType beanMethod;

	/**
	 * The cached value of the '{@link #getRetainIfException() <em>Retain If Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetainIfException()
	 * @generated
	 * @ordered
	 */
	protected TrueFalseType retainIfException;

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
	protected RemoveMethodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar31Package.eINSTANCE.getRemoveMethodType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedMethodType getBeanMethod() {
		return beanMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeanMethod(NamedMethodType newBeanMethod, NotificationChain msgs) {
		NamedMethodType oldBeanMethod = beanMethod;
		beanMethod = newBeanMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.REMOVE_METHOD_TYPE__BEAN_METHOD, oldBeanMethod, newBeanMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeanMethod(NamedMethodType newBeanMethod) {
		if (newBeanMethod != beanMethod) {
			NotificationChain msgs = null;
			if (beanMethod != null)
				msgs = ((InternalEObject)beanMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.REMOVE_METHOD_TYPE__BEAN_METHOD, null, msgs);
			if (newBeanMethod != null)
				msgs = ((InternalEObject)newBeanMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.REMOVE_METHOD_TYPE__BEAN_METHOD, null, msgs);
			msgs = basicSetBeanMethod(newBeanMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.REMOVE_METHOD_TYPE__BEAN_METHOD, newBeanMethod, newBeanMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType getRetainIfException() {
		return retainIfException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetainIfException(TrueFalseType newRetainIfException, NotificationChain msgs) {
		TrueFalseType oldRetainIfException = retainIfException;
		retainIfException = newRetainIfException;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.REMOVE_METHOD_TYPE__RETAIN_IF_EXCEPTION, oldRetainIfException, newRetainIfException);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetainIfException(TrueFalseType newRetainIfException) {
		if (newRetainIfException != retainIfException) {
			NotificationChain msgs = null;
			if (retainIfException != null)
				msgs = ((InternalEObject)retainIfException).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.REMOVE_METHOD_TYPE__RETAIN_IF_EXCEPTION, null, msgs);
			if (newRetainIfException != null)
				msgs = ((InternalEObject)newRetainIfException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.REMOVE_METHOD_TYPE__RETAIN_IF_EXCEPTION, null, msgs);
			msgs = basicSetRetainIfException(newRetainIfException, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.REMOVE_METHOD_TYPE__RETAIN_IF_EXCEPTION, newRetainIfException, newRetainIfException));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.REMOVE_METHOD_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar31Package.REMOVE_METHOD_TYPE__BEAN_METHOD:
				return basicSetBeanMethod(null, msgs);
			case EjbJar31Package.REMOVE_METHOD_TYPE__RETAIN_IF_EXCEPTION:
				return basicSetRetainIfException(null, msgs);
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
			case EjbJar31Package.REMOVE_METHOD_TYPE__BEAN_METHOD:
				return getBeanMethod();
			case EjbJar31Package.REMOVE_METHOD_TYPE__RETAIN_IF_EXCEPTION:
				return getRetainIfException();
			case EjbJar31Package.REMOVE_METHOD_TYPE__ID:
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
			case EjbJar31Package.REMOVE_METHOD_TYPE__BEAN_METHOD:
				setBeanMethod((NamedMethodType)newValue);
				return;
			case EjbJar31Package.REMOVE_METHOD_TYPE__RETAIN_IF_EXCEPTION:
				setRetainIfException((TrueFalseType)newValue);
				return;
			case EjbJar31Package.REMOVE_METHOD_TYPE__ID:
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
			case EjbJar31Package.REMOVE_METHOD_TYPE__BEAN_METHOD:
				setBeanMethod((NamedMethodType)null);
				return;
			case EjbJar31Package.REMOVE_METHOD_TYPE__RETAIN_IF_EXCEPTION:
				setRetainIfException((TrueFalseType)null);
				return;
			case EjbJar31Package.REMOVE_METHOD_TYPE__ID:
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
			case EjbJar31Package.REMOVE_METHOD_TYPE__BEAN_METHOD:
				return beanMethod != null;
			case EjbJar31Package.REMOVE_METHOD_TYPE__RETAIN_IF_EXCEPTION:
				return retainIfException != null;
			case EjbJar31Package.REMOVE_METHOD_TYPE__ID:
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

} //RemoveMethodTypeImpl
