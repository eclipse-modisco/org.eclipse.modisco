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
package org.eclipse.modisco.jee.ejbjar.EjbJar21.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.ejbjar.EjbJar21.ActivationConfigPropertyType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJar21Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.XsdStringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activation Config Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ActivationConfigPropertyTypeImpl#getActivationConfigPropertyName <em>Activation Config Property Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ActivationConfigPropertyTypeImpl#getActivationConfigPropertyValue <em>Activation Config Property Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar21.impl.ActivationConfigPropertyTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivationConfigPropertyTypeImpl extends EObjectImpl implements ActivationConfigPropertyType {
	/**
	 * The cached value of the '{@link #getActivationConfigPropertyName() <em>Activation Config Property Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationConfigPropertyName()
	 * @generated
	 * @ordered
	 */
	protected XsdStringType activationConfigPropertyName;

	/**
	 * The cached value of the '{@link #getActivationConfigPropertyValue() <em>Activation Config Property Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationConfigPropertyValue()
	 * @generated
	 * @ordered
	 */
	protected XsdStringType activationConfigPropertyValue;

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
	protected ActivationConfigPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar21Package.Literals.ACTIVATION_CONFIG_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdStringType getActivationConfigPropertyName() {
		return activationConfigPropertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivationConfigPropertyName(XsdStringType newActivationConfigPropertyName, NotificationChain msgs) {
		XsdStringType oldActivationConfigPropertyName = activationConfigPropertyName;
		activationConfigPropertyName = newActivationConfigPropertyName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_NAME, oldActivationConfigPropertyName, newActivationConfigPropertyName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationConfigPropertyName(XsdStringType newActivationConfigPropertyName) {
		if (newActivationConfigPropertyName != activationConfigPropertyName) {
			NotificationChain msgs = null;
			if (activationConfigPropertyName != null)
				msgs = ((InternalEObject)activationConfigPropertyName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_NAME, null, msgs);
			if (newActivationConfigPropertyName != null)
				msgs = ((InternalEObject)newActivationConfigPropertyName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_NAME, null, msgs);
			msgs = basicSetActivationConfigPropertyName(newActivationConfigPropertyName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_NAME, newActivationConfigPropertyName, newActivationConfigPropertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdStringType getActivationConfigPropertyValue() {
		return activationConfigPropertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivationConfigPropertyValue(XsdStringType newActivationConfigPropertyValue, NotificationChain msgs) {
		XsdStringType oldActivationConfigPropertyValue = activationConfigPropertyValue;
		activationConfigPropertyValue = newActivationConfigPropertyValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_VALUE, oldActivationConfigPropertyValue, newActivationConfigPropertyValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationConfigPropertyValue(XsdStringType newActivationConfigPropertyValue) {
		if (newActivationConfigPropertyValue != activationConfigPropertyValue) {
			NotificationChain msgs = null;
			if (activationConfigPropertyValue != null)
				msgs = ((InternalEObject)activationConfigPropertyValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_VALUE, null, msgs);
			if (newActivationConfigPropertyValue != null)
				msgs = ((InternalEObject)newActivationConfigPropertyValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_VALUE, null, msgs);
			msgs = basicSetActivationConfigPropertyValue(newActivationConfigPropertyValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_VALUE, newActivationConfigPropertyValue, newActivationConfigPropertyValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_NAME:
				return basicSetActivationConfigPropertyName(null, msgs);
			case EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_VALUE:
				return basicSetActivationConfigPropertyValue(null, msgs);
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
			case EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_NAME:
				return getActivationConfigPropertyName();
			case EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_VALUE:
				return getActivationConfigPropertyValue();
			case EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ID:
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
			case EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_NAME:
				setActivationConfigPropertyName((XsdStringType)newValue);
				return;
			case EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_VALUE:
				setActivationConfigPropertyValue((XsdStringType)newValue);
				return;
			case EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ID:
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
			case EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_NAME:
				setActivationConfigPropertyName((XsdStringType)null);
				return;
			case EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_VALUE:
				setActivationConfigPropertyValue((XsdStringType)null);
				return;
			case EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ID:
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
			case EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_NAME:
				return activationConfigPropertyName != null;
			case EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ACTIVATION_CONFIG_PROPERTY_VALUE:
				return activationConfigPropertyValue != null;
			case EjbJar21Package.ACTIVATION_CONFIG_PROPERTY_TYPE__ID:
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

} //ActivationConfigPropertyTypeImpl
