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

import org.eclipse.modisco.jee.ejbjar.EjbJar31.AddressingResponsesType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.AddressingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TrueFalseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addressing Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.AddressingTypeImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.AddressingTypeImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.AddressingTypeImpl#getResponses <em>Responses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressingTypeImpl extends EObjectImpl implements AddressingType {
	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected TrueFalseType enabled;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected TrueFalseType required;

	/**
	 * The cached value of the '{@link #getResponses() <em>Responses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponses()
	 * @generated
	 * @ordered
	 */
	protected AddressingResponsesType responses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar31Package.eINSTANCE.getAddressingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnabled(TrueFalseType newEnabled, NotificationChain msgs) {
		TrueFalseType oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.ADDRESSING_TYPE__ENABLED, oldEnabled, newEnabled);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(TrueFalseType newEnabled) {
		if (newEnabled != enabled) {
			NotificationChain msgs = null;
			if (enabled != null)
				msgs = ((InternalEObject)enabled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ADDRESSING_TYPE__ENABLED, null, msgs);
			if (newEnabled != null)
				msgs = ((InternalEObject)newEnabled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ADDRESSING_TYPE__ENABLED, null, msgs);
			msgs = basicSetEnabled(newEnabled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ADDRESSING_TYPE__ENABLED, newEnabled, newEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequired(TrueFalseType newRequired, NotificationChain msgs) {
		TrueFalseType oldRequired = required;
		required = newRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.ADDRESSING_TYPE__REQUIRED, oldRequired, newRequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(TrueFalseType newRequired) {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ADDRESSING_TYPE__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ADDRESSING_TYPE__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ADDRESSING_TYPE__REQUIRED, newRequired, newRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressingResponsesType getResponses() {
		return responses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponses(AddressingResponsesType newResponses, NotificationChain msgs) {
		AddressingResponsesType oldResponses = responses;
		responses = newResponses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.ADDRESSING_TYPE__RESPONSES, oldResponses, newResponses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponses(AddressingResponsesType newResponses) {
		if (newResponses != responses) {
			NotificationChain msgs = null;
			if (responses != null)
				msgs = ((InternalEObject)responses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ADDRESSING_TYPE__RESPONSES, null, msgs);
			if (newResponses != null)
				msgs = ((InternalEObject)newResponses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.ADDRESSING_TYPE__RESPONSES, null, msgs);
			msgs = basicSetResponses(newResponses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.ADDRESSING_TYPE__RESPONSES, newResponses, newResponses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar31Package.ADDRESSING_TYPE__ENABLED:
				return basicSetEnabled(null, msgs);
			case EjbJar31Package.ADDRESSING_TYPE__REQUIRED:
				return basicSetRequired(null, msgs);
			case EjbJar31Package.ADDRESSING_TYPE__RESPONSES:
				return basicSetResponses(null, msgs);
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
			case EjbJar31Package.ADDRESSING_TYPE__ENABLED:
				return getEnabled();
			case EjbJar31Package.ADDRESSING_TYPE__REQUIRED:
				return getRequired();
			case EjbJar31Package.ADDRESSING_TYPE__RESPONSES:
				return getResponses();
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
			case EjbJar31Package.ADDRESSING_TYPE__ENABLED:
				setEnabled((TrueFalseType)newValue);
				return;
			case EjbJar31Package.ADDRESSING_TYPE__REQUIRED:
				setRequired((TrueFalseType)newValue);
				return;
			case EjbJar31Package.ADDRESSING_TYPE__RESPONSES:
				setResponses((AddressingResponsesType)newValue);
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
			case EjbJar31Package.ADDRESSING_TYPE__ENABLED:
				setEnabled((TrueFalseType)null);
				return;
			case EjbJar31Package.ADDRESSING_TYPE__REQUIRED:
				setRequired((TrueFalseType)null);
				return;
			case EjbJar31Package.ADDRESSING_TYPE__RESPONSES:
				setResponses((AddressingResponsesType)null);
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
			case EjbJar31Package.ADDRESSING_TYPE__ENABLED:
				return enabled != null;
			case EjbJar31Package.ADDRESSING_TYPE__REQUIRED:
				return required != null;
			case EjbJar31Package.ADDRESSING_TYPE__RESPONSES:
				return responses != null;
		}
		return super.eIsSet(featureID);
	}

} //AddressingTypeImpl
