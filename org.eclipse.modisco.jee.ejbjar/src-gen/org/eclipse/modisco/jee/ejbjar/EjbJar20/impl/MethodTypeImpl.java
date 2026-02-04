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
package org.eclipse.modisco.jee.ejbjar.EjbJar20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.ejbjar.EjbJar20.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodIntfType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodParamsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MethodType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodTypeImpl#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodTypeImpl#getMethodIntf <em>Method Intf</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodTypeImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodTypeImpl#getMethodParams <em>Method Params</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MethodTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodTypeImpl extends EObjectImpl implements MethodType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DescriptionType description;

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
	 * The cached value of the '{@link #getMethodIntf() <em>Method Intf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodIntf()
	 * @generated
	 * @ordered
	 */
	protected MethodIntfType methodIntf;

	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected MethodNameType methodName;

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
	protected MethodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar20Package.Literals.METHOD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		DescriptionType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.METHOD_TYPE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.METHOD_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.METHOD_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.METHOD_TYPE__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.METHOD_TYPE__EJB_NAME, oldEjbName, newEjbName);
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
				msgs = ((InternalEObject)ejbName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.METHOD_TYPE__EJB_NAME, null, msgs);
			if (newEjbName != null)
				msgs = ((InternalEObject)newEjbName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.METHOD_TYPE__EJB_NAME, null, msgs);
			msgs = basicSetEjbName(newEjbName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.METHOD_TYPE__EJB_NAME, newEjbName, newEjbName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodIntfType getMethodIntf() {
		return methodIntf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodIntf(MethodIntfType newMethodIntf, NotificationChain msgs) {
		MethodIntfType oldMethodIntf = methodIntf;
		methodIntf = newMethodIntf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.METHOD_TYPE__METHOD_INTF, oldMethodIntf, newMethodIntf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodIntf(MethodIntfType newMethodIntf) {
		if (newMethodIntf != methodIntf) {
			NotificationChain msgs = null;
			if (methodIntf != null)
				msgs = ((InternalEObject)methodIntf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.METHOD_TYPE__METHOD_INTF, null, msgs);
			if (newMethodIntf != null)
				msgs = ((InternalEObject)newMethodIntf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.METHOD_TYPE__METHOD_INTF, null, msgs);
			msgs = basicSetMethodIntf(newMethodIntf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.METHOD_TYPE__METHOD_INTF, newMethodIntf, newMethodIntf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodNameType getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodName(MethodNameType newMethodName, NotificationChain msgs) {
		MethodNameType oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.METHOD_TYPE__METHOD_NAME, oldMethodName, newMethodName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(MethodNameType newMethodName) {
		if (newMethodName != methodName) {
			NotificationChain msgs = null;
			if (methodName != null)
				msgs = ((InternalEObject)methodName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.METHOD_TYPE__METHOD_NAME, null, msgs);
			if (newMethodName != null)
				msgs = ((InternalEObject)newMethodName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.METHOD_TYPE__METHOD_NAME, null, msgs);
			msgs = basicSetMethodName(newMethodName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.METHOD_TYPE__METHOD_NAME, newMethodName, newMethodName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.METHOD_TYPE__METHOD_PARAMS, oldMethodParams, newMethodParams);
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
				msgs = ((InternalEObject)methodParams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.METHOD_TYPE__METHOD_PARAMS, null, msgs);
			if (newMethodParams != null)
				msgs = ((InternalEObject)newMethodParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.METHOD_TYPE__METHOD_PARAMS, null, msgs);
			msgs = basicSetMethodParams(newMethodParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.METHOD_TYPE__METHOD_PARAMS, newMethodParams, newMethodParams));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.METHOD_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar20Package.METHOD_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EjbJar20Package.METHOD_TYPE__EJB_NAME:
				return basicSetEjbName(null, msgs);
			case EjbJar20Package.METHOD_TYPE__METHOD_INTF:
				return basicSetMethodIntf(null, msgs);
			case EjbJar20Package.METHOD_TYPE__METHOD_NAME:
				return basicSetMethodName(null, msgs);
			case EjbJar20Package.METHOD_TYPE__METHOD_PARAMS:
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
			case EjbJar20Package.METHOD_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar20Package.METHOD_TYPE__EJB_NAME:
				return getEjbName();
			case EjbJar20Package.METHOD_TYPE__METHOD_INTF:
				return getMethodIntf();
			case EjbJar20Package.METHOD_TYPE__METHOD_NAME:
				return getMethodName();
			case EjbJar20Package.METHOD_TYPE__METHOD_PARAMS:
				return getMethodParams();
			case EjbJar20Package.METHOD_TYPE__ID:
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
			case EjbJar20Package.METHOD_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case EjbJar20Package.METHOD_TYPE__EJB_NAME:
				setEjbName((EjbNameType)newValue);
				return;
			case EjbJar20Package.METHOD_TYPE__METHOD_INTF:
				setMethodIntf((MethodIntfType)newValue);
				return;
			case EjbJar20Package.METHOD_TYPE__METHOD_NAME:
				setMethodName((MethodNameType)newValue);
				return;
			case EjbJar20Package.METHOD_TYPE__METHOD_PARAMS:
				setMethodParams((MethodParamsType)newValue);
				return;
			case EjbJar20Package.METHOD_TYPE__ID:
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
			case EjbJar20Package.METHOD_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case EjbJar20Package.METHOD_TYPE__EJB_NAME:
				setEjbName((EjbNameType)null);
				return;
			case EjbJar20Package.METHOD_TYPE__METHOD_INTF:
				setMethodIntf((MethodIntfType)null);
				return;
			case EjbJar20Package.METHOD_TYPE__METHOD_NAME:
				setMethodName((MethodNameType)null);
				return;
			case EjbJar20Package.METHOD_TYPE__METHOD_PARAMS:
				setMethodParams((MethodParamsType)null);
				return;
			case EjbJar20Package.METHOD_TYPE__ID:
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
			case EjbJar20Package.METHOD_TYPE__DESCRIPTION:
				return description != null;
			case EjbJar20Package.METHOD_TYPE__EJB_NAME:
				return ejbName != null;
			case EjbJar20Package.METHOD_TYPE__METHOD_INTF:
				return methodIntf != null;
			case EjbJar20Package.METHOD_TYPE__METHOD_NAME:
				return methodName != null;
			case EjbJar20Package.METHOD_TYPE__METHOD_PARAMS:
				return methodParams != null;
			case EjbJar20Package.METHOD_TYPE__ID:
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

} //MethodTypeImpl
