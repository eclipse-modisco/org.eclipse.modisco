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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.ejbjar.EjbJar31.AroundTimeoutType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.FullyQualifiedClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.JavaIdentifierType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Around Timeout Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.AroundTimeoutTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.AroundTimeoutTypeImpl#getMethodName <em>Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AroundTimeoutTypeImpl extends EObjectImpl implements AroundTimeoutType {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected FullyQualifiedClassType class_;

	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected JavaIdentifierType methodName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AroundTimeoutTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar31Package.eINSTANCE.getAroundTimeoutType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedClassType getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(FullyQualifiedClassType newClass, NotificationChain msgs) {
		FullyQualifiedClassType oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.AROUND_TIMEOUT_TYPE__CLASS, oldClass, newClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(FullyQualifiedClassType newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.AROUND_TIMEOUT_TYPE__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.AROUND_TIMEOUT_TYPE__CLASS, null, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.AROUND_TIMEOUT_TYPE__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaIdentifierType getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodName(JavaIdentifierType newMethodName, NotificationChain msgs) {
		JavaIdentifierType oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.AROUND_TIMEOUT_TYPE__METHOD_NAME, oldMethodName, newMethodName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(JavaIdentifierType newMethodName) {
		if (newMethodName != methodName) {
			NotificationChain msgs = null;
			if (methodName != null)
				msgs = ((InternalEObject)methodName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.AROUND_TIMEOUT_TYPE__METHOD_NAME, null, msgs);
			if (newMethodName != null)
				msgs = ((InternalEObject)newMethodName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.AROUND_TIMEOUT_TYPE__METHOD_NAME, null, msgs);
			msgs = basicSetMethodName(newMethodName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.AROUND_TIMEOUT_TYPE__METHOD_NAME, newMethodName, newMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar31Package.AROUND_TIMEOUT_TYPE__CLASS:
				return basicSetClass(null, msgs);
			case EjbJar31Package.AROUND_TIMEOUT_TYPE__METHOD_NAME:
				return basicSetMethodName(null, msgs);
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
			case EjbJar31Package.AROUND_TIMEOUT_TYPE__CLASS:
				return getClass_();
			case EjbJar31Package.AROUND_TIMEOUT_TYPE__METHOD_NAME:
				return getMethodName();
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
			case EjbJar31Package.AROUND_TIMEOUT_TYPE__CLASS:
				setClass((FullyQualifiedClassType)newValue);
				return;
			case EjbJar31Package.AROUND_TIMEOUT_TYPE__METHOD_NAME:
				setMethodName((JavaIdentifierType)newValue);
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
			case EjbJar31Package.AROUND_TIMEOUT_TYPE__CLASS:
				setClass((FullyQualifiedClassType)null);
				return;
			case EjbJar31Package.AROUND_TIMEOUT_TYPE__METHOD_NAME:
				setMethodName((JavaIdentifierType)null);
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
			case EjbJar31Package.AROUND_TIMEOUT_TYPE__CLASS:
				return class_ != null;
			case EjbJar31Package.AROUND_TIMEOUT_TYPE__METHOD_NAME:
				return methodName != null;
		}
		return super.eIsSet(featureID);
	}

} //AroundTimeoutTypeImpl
