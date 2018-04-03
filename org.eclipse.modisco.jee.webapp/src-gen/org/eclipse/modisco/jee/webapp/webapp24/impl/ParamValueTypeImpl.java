/**
 *   Copyright (c) 2010 Mia-Software.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp24.impl;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.jee.webapp.webapp24.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp24.ParamValueType;
import org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package;
import org.eclipse.modisco.jee.webapp.webapp24.XsdStringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ParamValueTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ParamValueTypeImpl#getParamName <em>Param Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ParamValueTypeImpl#getParamValue <em>Param Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ParamValueTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamValueTypeImpl extends EObjectImpl implements ParamValueType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<DescriptionType> description;

	/**
	 * The cached value of the '{@link #getParamName() <em>Param Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.webapp.webapp24.String paramName;

	/**
	 * The cached value of the '{@link #getParamValue() <em>Param Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamValue()
	 * @generated
	 * @ordered
	 */
	protected XsdStringType paramValue;

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
	protected ParamValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp24Package.Literals.PARAM_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, Webapp24Package.PARAM_VALUE_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.webapp.webapp24.String getParamName() {
		return paramName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParamName(org.eclipse.modisco.jee.webapp.webapp24.String newParamName, NotificationChain msgs) {
		org.eclipse.modisco.jee.webapp.webapp24.String oldParamName = paramName;
		paramName = newParamName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.PARAM_VALUE_TYPE__PARAM_NAME, oldParamName, newParamName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamName(org.eclipse.modisco.jee.webapp.webapp24.String newParamName) {
		if (newParamName != paramName) {
			NotificationChain msgs = null;
			if (paramName != null)
				msgs = ((InternalEObject)paramName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.PARAM_VALUE_TYPE__PARAM_NAME, null, msgs);
			if (newParamName != null)
				msgs = ((InternalEObject)newParamName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.PARAM_VALUE_TYPE__PARAM_NAME, null, msgs);
			msgs = basicSetParamName(newParamName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.PARAM_VALUE_TYPE__PARAM_NAME, newParamName, newParamName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdStringType getParamValue() {
		return paramValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParamValue(XsdStringType newParamValue, NotificationChain msgs) {
		XsdStringType oldParamValue = paramValue;
		paramValue = newParamValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.PARAM_VALUE_TYPE__PARAM_VALUE, oldParamValue, newParamValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamValue(XsdStringType newParamValue) {
		if (newParamValue != paramValue) {
			NotificationChain msgs = null;
			if (paramValue != null)
				msgs = ((InternalEObject)paramValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.PARAM_VALUE_TYPE__PARAM_VALUE, null, msgs);
			if (newParamValue != null)
				msgs = ((InternalEObject)newParamValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.PARAM_VALUE_TYPE__PARAM_VALUE, null, msgs);
			msgs = basicSetParamValue(newParamValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.PARAM_VALUE_TYPE__PARAM_VALUE, newParamValue, newParamValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.PARAM_VALUE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp24Package.PARAM_VALUE_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case Webapp24Package.PARAM_VALUE_TYPE__PARAM_NAME:
				return basicSetParamName(null, msgs);
			case Webapp24Package.PARAM_VALUE_TYPE__PARAM_VALUE:
				return basicSetParamValue(null, msgs);
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
			case Webapp24Package.PARAM_VALUE_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp24Package.PARAM_VALUE_TYPE__PARAM_NAME:
				return getParamName();
			case Webapp24Package.PARAM_VALUE_TYPE__PARAM_VALUE:
				return getParamValue();
			case Webapp24Package.PARAM_VALUE_TYPE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Webapp24Package.PARAM_VALUE_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case Webapp24Package.PARAM_VALUE_TYPE__PARAM_NAME:
				setParamName((org.eclipse.modisco.jee.webapp.webapp24.String)newValue);
				return;
			case Webapp24Package.PARAM_VALUE_TYPE__PARAM_VALUE:
				setParamValue((XsdStringType)newValue);
				return;
			case Webapp24Package.PARAM_VALUE_TYPE__ID:
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
			case Webapp24Package.PARAM_VALUE_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case Webapp24Package.PARAM_VALUE_TYPE__PARAM_NAME:
				setParamName((org.eclipse.modisco.jee.webapp.webapp24.String)null);
				return;
			case Webapp24Package.PARAM_VALUE_TYPE__PARAM_VALUE:
				setParamValue((XsdStringType)null);
				return;
			case Webapp24Package.PARAM_VALUE_TYPE__ID:
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
			case Webapp24Package.PARAM_VALUE_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case Webapp24Package.PARAM_VALUE_TYPE__PARAM_NAME:
				return paramName != null;
			case Webapp24Package.PARAM_VALUE_TYPE__PARAM_VALUE:
				return paramValue != null;
			case Webapp24Package.PARAM_VALUE_TYPE__ID:
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

} //ParamValueTypeImpl
