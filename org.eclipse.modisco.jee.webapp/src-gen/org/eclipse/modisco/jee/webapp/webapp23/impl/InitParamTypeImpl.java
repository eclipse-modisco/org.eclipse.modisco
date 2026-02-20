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

import org.eclipse.modisco.jee.webapp.webapp23.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp23.InitParamType;
import org.eclipse.modisco.jee.webapp.webapp23.ParamNameType;
import org.eclipse.modisco.jee.webapp.webapp23.ParamValueType;
import org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init Param Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.InitParamTypeImpl#getParamName <em>Param Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.InitParamTypeImpl#getParamValue <em>Param Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.InitParamTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.InitParamTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitParamTypeImpl extends EObjectImpl implements InitParamType {
	/**
	 * The cached value of the '{@link #getParamName() <em>Param Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamName()
	 * @generated
	 * @ordered
	 */
	protected ParamNameType paramName;

	/**
	 * The cached value of the '{@link #getParamValue() <em>Param Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamValue()
	 * @generated
	 * @ordered
	 */
	protected ParamValueType paramValue;

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
	protected InitParamTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp23Package.Literals.INIT_PARAM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamNameType getParamName() {
		return paramName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParamName(ParamNameType newParamName, NotificationChain msgs) {
		ParamNameType oldParamName = paramName;
		paramName = newParamName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.INIT_PARAM_TYPE__PARAM_NAME, oldParamName, newParamName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamName(ParamNameType newParamName) {
		if (newParamName != paramName) {
			NotificationChain msgs = null;
			if (paramName != null)
				msgs = ((InternalEObject)paramName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.INIT_PARAM_TYPE__PARAM_NAME, null, msgs);
			if (newParamName != null)
				msgs = ((InternalEObject)newParamName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.INIT_PARAM_TYPE__PARAM_NAME, null, msgs);
			msgs = basicSetParamName(newParamName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.INIT_PARAM_TYPE__PARAM_NAME, newParamName, newParamName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamValueType getParamValue() {
		return paramValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParamValue(ParamValueType newParamValue, NotificationChain msgs) {
		ParamValueType oldParamValue = paramValue;
		paramValue = newParamValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.INIT_PARAM_TYPE__PARAM_VALUE, oldParamValue, newParamValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamValue(ParamValueType newParamValue) {
		if (newParamValue != paramValue) {
			NotificationChain msgs = null;
			if (paramValue != null)
				msgs = ((InternalEObject)paramValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.INIT_PARAM_TYPE__PARAM_VALUE, null, msgs);
			if (newParamValue != null)
				msgs = ((InternalEObject)newParamValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.INIT_PARAM_TYPE__PARAM_VALUE, null, msgs);
			msgs = basicSetParamValue(newParamValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.INIT_PARAM_TYPE__PARAM_VALUE, newParamValue, newParamValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.INIT_PARAM_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.INIT_PARAM_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.INIT_PARAM_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.INIT_PARAM_TYPE__DESCRIPTION, newDescription, newDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.INIT_PARAM_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp23Package.INIT_PARAM_TYPE__PARAM_NAME:
				return basicSetParamName(null, msgs);
			case Webapp23Package.INIT_PARAM_TYPE__PARAM_VALUE:
				return basicSetParamValue(null, msgs);
			case Webapp23Package.INIT_PARAM_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case Webapp23Package.INIT_PARAM_TYPE__PARAM_NAME:
				return getParamName();
			case Webapp23Package.INIT_PARAM_TYPE__PARAM_VALUE:
				return getParamValue();
			case Webapp23Package.INIT_PARAM_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp23Package.INIT_PARAM_TYPE__ID:
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
			case Webapp23Package.INIT_PARAM_TYPE__PARAM_NAME:
				setParamName((ParamNameType)newValue);
				return;
			case Webapp23Package.INIT_PARAM_TYPE__PARAM_VALUE:
				setParamValue((ParamValueType)newValue);
				return;
			case Webapp23Package.INIT_PARAM_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case Webapp23Package.INIT_PARAM_TYPE__ID:
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
			case Webapp23Package.INIT_PARAM_TYPE__PARAM_NAME:
				setParamName((ParamNameType)null);
				return;
			case Webapp23Package.INIT_PARAM_TYPE__PARAM_VALUE:
				setParamValue((ParamValueType)null);
				return;
			case Webapp23Package.INIT_PARAM_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case Webapp23Package.INIT_PARAM_TYPE__ID:
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
			case Webapp23Package.INIT_PARAM_TYPE__PARAM_NAME:
				return paramName != null;
			case Webapp23Package.INIT_PARAM_TYPE__PARAM_VALUE:
				return paramValue != null;
			case Webapp23Package.INIT_PARAM_TYPE__DESCRIPTION:
				return description != null;
			case Webapp23Package.INIT_PARAM_TYPE__ID:
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //InitParamTypeImpl
