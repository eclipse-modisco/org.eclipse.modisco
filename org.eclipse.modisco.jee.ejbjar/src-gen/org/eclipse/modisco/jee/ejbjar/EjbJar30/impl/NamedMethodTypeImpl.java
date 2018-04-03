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
package org.eclipse.modisco.jee.ejbjar.EjbJar30.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodParamsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.NamedMethodType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Method Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.NamedMethodTypeImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.NamedMethodTypeImpl#getMethodParams <em>Method Params</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.NamedMethodTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedMethodTypeImpl extends EObjectImpl implements NamedMethodType {
	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.ejbjar.EjbJar30.String methodName;

	/**
	 * The cached value of the '{@link #getMethodParams() <em>Method Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodParams()
	 * @generated
	 * @ordered
	 */
	protected MethodParamsType methodParams;

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
	protected NamedMethodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar30Package.eINSTANCE.getNamedMethodType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.ejbjar.EjbJar30.String getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodName(org.eclipse.modisco.jee.ejbjar.EjbJar30.String newMethodName, NotificationChain msgs) {
		org.eclipse.modisco.jee.ejbjar.EjbJar30.String oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.NAMED_METHOD_TYPE__METHOD_NAME, oldMethodName, newMethodName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(org.eclipse.modisco.jee.ejbjar.EjbJar30.String newMethodName) {
		if (newMethodName != methodName) {
			NotificationChain msgs = null;
			if (methodName != null)
				msgs = ((InternalEObject)methodName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.NAMED_METHOD_TYPE__METHOD_NAME, null, msgs);
			if (newMethodName != null)
				msgs = ((InternalEObject)newMethodName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.NAMED_METHOD_TYPE__METHOD_NAME, null, msgs);
			msgs = basicSetMethodName(newMethodName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.NAMED_METHOD_TYPE__METHOD_NAME, newMethodName, newMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodParamsType getMethodParams() {
		return methodParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodParams(MethodParamsType newMethodParams, NotificationChain msgs) {
		MethodParamsType oldMethodParams = methodParams;
		methodParams = newMethodParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.NAMED_METHOD_TYPE__METHOD_PARAMS, oldMethodParams, newMethodParams);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodParams(MethodParamsType newMethodParams) {
		if (newMethodParams != methodParams) {
			NotificationChain msgs = null;
			if (methodParams != null)
				msgs = ((InternalEObject)methodParams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.NAMED_METHOD_TYPE__METHOD_PARAMS, null, msgs);
			if (newMethodParams != null)
				msgs = ((InternalEObject)newMethodParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.NAMED_METHOD_TYPE__METHOD_PARAMS, null, msgs);
			msgs = basicSetMethodParams(newMethodParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.NAMED_METHOD_TYPE__METHOD_PARAMS, newMethodParams, newMethodParams));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.NAMED_METHOD_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar30Package.NAMED_METHOD_TYPE__METHOD_NAME:
				return basicSetMethodName(null, msgs);
			case EjbJar30Package.NAMED_METHOD_TYPE__METHOD_PARAMS:
				return basicSetMethodParams(null, msgs);
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
			case EjbJar30Package.NAMED_METHOD_TYPE__METHOD_NAME:
				return getMethodName();
			case EjbJar30Package.NAMED_METHOD_TYPE__METHOD_PARAMS:
				return getMethodParams();
			case EjbJar30Package.NAMED_METHOD_TYPE__ID:
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
			case EjbJar30Package.NAMED_METHOD_TYPE__METHOD_NAME:
				setMethodName((org.eclipse.modisco.jee.ejbjar.EjbJar30.String)newValue);
				return;
			case EjbJar30Package.NAMED_METHOD_TYPE__METHOD_PARAMS:
				setMethodParams((MethodParamsType)newValue);
				return;
			case EjbJar30Package.NAMED_METHOD_TYPE__ID:
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
			case EjbJar30Package.NAMED_METHOD_TYPE__METHOD_NAME:
				setMethodName((org.eclipse.modisco.jee.ejbjar.EjbJar30.String)null);
				return;
			case EjbJar30Package.NAMED_METHOD_TYPE__METHOD_PARAMS:
				setMethodParams((MethodParamsType)null);
				return;
			case EjbJar30Package.NAMED_METHOD_TYPE__ID:
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
			case EjbJar30Package.NAMED_METHOD_TYPE__METHOD_NAME:
				return methodName != null;
			case EjbJar30Package.NAMED_METHOD_TYPE__METHOD_PARAMS:
				return methodParams != null;
			case EjbJar30Package.NAMED_METHOD_TYPE__ID:
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

} //NamedMethodTypeImpl
