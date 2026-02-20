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
package org.eclipse.modisco.jee.webapp.webapp23.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.webapp.webapp23.ListenerClass;
import org.eclipse.modisco.jee.webapp.webapp23.ListenerClassType;
import org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Listener Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ListenerClassImpl#getListenerClass <em>Listener Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListenerClassImpl extends EObjectImpl implements ListenerClass {
	/**
	 * The cached value of the '{@link #getListenerClass() <em>Listener Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListenerClass()
	 * @generated
	 * @ordered
	 */
	protected ListenerClassType listenerClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListenerClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp23Package.Literals.LISTENER_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListenerClassType getListenerClass() {
		return listenerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListenerClass(ListenerClassType newListenerClass, NotificationChain msgs) {
		ListenerClassType oldListenerClass = listenerClass;
		listenerClass = newListenerClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.LISTENER_CLASS__LISTENER_CLASS, oldListenerClass, newListenerClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListenerClass(ListenerClassType newListenerClass) {
		if (newListenerClass != listenerClass) {
			NotificationChain msgs = null;
			if (listenerClass != null)
				msgs = ((InternalEObject)listenerClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.LISTENER_CLASS__LISTENER_CLASS, null, msgs);
			if (newListenerClass != null)
				msgs = ((InternalEObject)newListenerClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.LISTENER_CLASS__LISTENER_CLASS, null, msgs);
			msgs = basicSetListenerClass(newListenerClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.LISTENER_CLASS__LISTENER_CLASS, newListenerClass, newListenerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp23Package.LISTENER_CLASS__LISTENER_CLASS:
				return basicSetListenerClass(null, msgs);
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
			case Webapp23Package.LISTENER_CLASS__LISTENER_CLASS:
				return getListenerClass();
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
			case Webapp23Package.LISTENER_CLASS__LISTENER_CLASS:
				setListenerClass((ListenerClassType)newValue);
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
			case Webapp23Package.LISTENER_CLASS__LISTENER_CLASS:
				setListenerClass((ListenerClassType)null);
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
			case Webapp23Package.LISTENER_CLASS__LISTENER_CLASS:
				return listenerClass != null;
		}
		return super.eIsSet(featureID);
	}

} //ListenerClassImpl
