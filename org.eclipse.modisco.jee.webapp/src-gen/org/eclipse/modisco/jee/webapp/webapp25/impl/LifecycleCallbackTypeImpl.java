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
package org.eclipse.modisco.jee.webapp.webapp25.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.webapp.webapp25.FullyQualifiedClassType;
import org.eclipse.modisco.jee.webapp.webapp25.JavaIdentifierType;
import org.eclipse.modisco.jee.webapp.webapp25.LifecycleCallbackType;
import org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifecycle Callback Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.LifecycleCallbackTypeImpl#getLifecycleCallbackClass <em>Lifecycle Callback Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.LifecycleCallbackTypeImpl#getLifecycleCallbackMethod <em>Lifecycle Callback Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LifecycleCallbackTypeImpl extends EObjectImpl implements LifecycleCallbackType {
	/**
	 * The cached value of the '{@link #getLifecycleCallbackClass() <em>Lifecycle Callback Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycleCallbackClass()
	 * @generated
	 * @ordered
	 */
	protected FullyQualifiedClassType lifecycleCallbackClass;

	/**
	 * The cached value of the '{@link #getLifecycleCallbackMethod() <em>Lifecycle Callback Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycleCallbackMethod()
	 * @generated
	 * @ordered
	 */
	protected JavaIdentifierType lifecycleCallbackMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifecycleCallbackTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp25Package.Literals.LIFECYCLE_CALLBACK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedClassType getLifecycleCallbackClass() {
		return lifecycleCallbackClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifecycleCallbackClass(FullyQualifiedClassType newLifecycleCallbackClass, NotificationChain msgs) {
		FullyQualifiedClassType oldLifecycleCallbackClass = lifecycleCallbackClass;
		lifecycleCallbackClass = newLifecycleCallbackClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_CLASS, oldLifecycleCallbackClass, newLifecycleCallbackClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifecycleCallbackClass(FullyQualifiedClassType newLifecycleCallbackClass) {
		if (newLifecycleCallbackClass != lifecycleCallbackClass) {
			NotificationChain msgs = null;
			if (lifecycleCallbackClass != null)
				msgs = ((InternalEObject)lifecycleCallbackClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_CLASS, null, msgs);
			if (newLifecycleCallbackClass != null)
				msgs = ((InternalEObject)newLifecycleCallbackClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_CLASS, null, msgs);
			msgs = basicSetLifecycleCallbackClass(newLifecycleCallbackClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_CLASS, newLifecycleCallbackClass, newLifecycleCallbackClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaIdentifierType getLifecycleCallbackMethod() {
		return lifecycleCallbackMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLifecycleCallbackMethod(JavaIdentifierType newLifecycleCallbackMethod, NotificationChain msgs) {
		JavaIdentifierType oldLifecycleCallbackMethod = lifecycleCallbackMethod;
		lifecycleCallbackMethod = newLifecycleCallbackMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_METHOD, oldLifecycleCallbackMethod, newLifecycleCallbackMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifecycleCallbackMethod(JavaIdentifierType newLifecycleCallbackMethod) {
		if (newLifecycleCallbackMethod != lifecycleCallbackMethod) {
			NotificationChain msgs = null;
			if (lifecycleCallbackMethod != null)
				msgs = ((InternalEObject)lifecycleCallbackMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_METHOD, null, msgs);
			if (newLifecycleCallbackMethod != null)
				msgs = ((InternalEObject)newLifecycleCallbackMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_METHOD, null, msgs);
			msgs = basicSetLifecycleCallbackMethod(newLifecycleCallbackMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_METHOD, newLifecycleCallbackMethod, newLifecycleCallbackMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_CLASS:
				return basicSetLifecycleCallbackClass(null, msgs);
			case Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_METHOD:
				return basicSetLifecycleCallbackMethod(null, msgs);
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
			case Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_CLASS:
				return getLifecycleCallbackClass();
			case Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_METHOD:
				return getLifecycleCallbackMethod();
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
			case Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_CLASS:
				setLifecycleCallbackClass((FullyQualifiedClassType)newValue);
				return;
			case Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_METHOD:
				setLifecycleCallbackMethod((JavaIdentifierType)newValue);
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
			case Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_CLASS:
				setLifecycleCallbackClass((FullyQualifiedClassType)null);
				return;
			case Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_METHOD:
				setLifecycleCallbackMethod((JavaIdentifierType)null);
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
			case Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_CLASS:
				return lifecycleCallbackClass != null;
			case Webapp25Package.LIFECYCLE_CALLBACK_TYPE__LIFECYCLE_CALLBACK_METHOD:
				return lifecycleCallbackMethod != null;
		}
		return super.eIsSet(featureID);
	}

} //LifecycleCallbackTypeImpl
