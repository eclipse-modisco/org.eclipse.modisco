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
package org.eclipse.modisco.jee.webapp.webapp30.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.webapp.webapp30.FullyQualifiedClassType;
import org.eclipse.modisco.jee.webapp.webapp30.InjectionTargetType;
import org.eclipse.modisco.jee.webapp.webapp30.JavaIdentifierType;
import org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Injection Target Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.InjectionTargetTypeImpl#getInjectionTargetClass <em>Injection Target Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.InjectionTargetTypeImpl#getInjectionTargetName <em>Injection Target Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InjectionTargetTypeImpl extends EObjectImpl implements InjectionTargetType {
	/**
	 * The cached value of the '{@link #getInjectionTargetClass() <em>Injection Target Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjectionTargetClass()
	 * @generated
	 * @ordered
	 */
	protected FullyQualifiedClassType injectionTargetClass;

	/**
	 * The cached value of the '{@link #getInjectionTargetName() <em>Injection Target Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjectionTargetName()
	 * @generated
	 * @ordered
	 */
	protected JavaIdentifierType injectionTargetName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InjectionTargetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp30Package.eINSTANCE.getInjectionTargetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedClassType getInjectionTargetClass() {
		return injectionTargetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInjectionTargetClass(FullyQualifiedClassType newInjectionTargetClass, NotificationChain msgs) {
		FullyQualifiedClassType oldInjectionTargetClass = injectionTargetClass;
		injectionTargetClass = newInjectionTargetClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_CLASS, oldInjectionTargetClass, newInjectionTargetClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInjectionTargetClass(FullyQualifiedClassType newInjectionTargetClass) {
		if (newInjectionTargetClass != injectionTargetClass) {
			NotificationChain msgs = null;
			if (injectionTargetClass != null)
				msgs = ((InternalEObject)injectionTargetClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_CLASS, null, msgs);
			if (newInjectionTargetClass != null)
				msgs = ((InternalEObject)newInjectionTargetClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_CLASS, null, msgs);
			msgs = basicSetInjectionTargetClass(newInjectionTargetClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_CLASS, newInjectionTargetClass, newInjectionTargetClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaIdentifierType getInjectionTargetName() {
		return injectionTargetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInjectionTargetName(JavaIdentifierType newInjectionTargetName, NotificationChain msgs) {
		JavaIdentifierType oldInjectionTargetName = injectionTargetName;
		injectionTargetName = newInjectionTargetName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_NAME, oldInjectionTargetName, newInjectionTargetName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInjectionTargetName(JavaIdentifierType newInjectionTargetName) {
		if (newInjectionTargetName != injectionTargetName) {
			NotificationChain msgs = null;
			if (injectionTargetName != null)
				msgs = ((InternalEObject)injectionTargetName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_NAME, null, msgs);
			if (newInjectionTargetName != null)
				msgs = ((InternalEObject)newInjectionTargetName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_NAME, null, msgs);
			msgs = basicSetInjectionTargetName(newInjectionTargetName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_NAME, newInjectionTargetName, newInjectionTargetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_CLASS:
				return basicSetInjectionTargetClass(null, msgs);
			case Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_NAME:
				return basicSetInjectionTargetName(null, msgs);
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
			case Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_CLASS:
				return getInjectionTargetClass();
			case Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_NAME:
				return getInjectionTargetName();
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
			case Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_CLASS:
				setInjectionTargetClass((FullyQualifiedClassType)newValue);
				return;
			case Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_NAME:
				setInjectionTargetName((JavaIdentifierType)newValue);
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
			case Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_CLASS:
				setInjectionTargetClass((FullyQualifiedClassType)null);
				return;
			case Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_NAME:
				setInjectionTargetName((JavaIdentifierType)null);
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
			case Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_CLASS:
				return injectionTargetClass != null;
			case Webapp30Package.INJECTION_TARGET_TYPE__INJECTION_TARGET_NAME:
				return injectionTargetName != null;
		}
		return super.eIsSet(featureID);
	}

} //InjectionTargetTypeImpl
