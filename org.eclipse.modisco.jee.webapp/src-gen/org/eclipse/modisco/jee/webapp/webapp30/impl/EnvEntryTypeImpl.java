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
package org.eclipse.modisco.jee.webapp.webapp30.impl;

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

import org.eclipse.modisco.jee.webapp.webapp30.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType;
import org.eclipse.modisco.jee.webapp.webapp30.EnvEntryTypeValuesType;
import org.eclipse.modisco.jee.webapp.webapp30.InjectionTargetType;
import org.eclipse.modisco.jee.webapp.webapp30.JndiNameType;
import org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package;
import org.eclipse.modisco.jee.webapp.webapp30.XsdStringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Env Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.EnvEntryTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.EnvEntryTypeImpl#getEnvEntryName <em>Env Entry Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.EnvEntryTypeImpl#getEnvEntryType <em>Env Entry Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.EnvEntryTypeImpl#getEnvEntryValue <em>Env Entry Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.EnvEntryTypeImpl#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.EnvEntryTypeImpl#getInjectionTarget <em>Injection Target</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.EnvEntryTypeImpl#getLookupName <em>Lookup Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.EnvEntryTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvEntryTypeImpl extends EObjectImpl implements EnvEntryType {
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
	 * The cached value of the '{@link #getEnvEntryName() <em>Env Entry Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvEntryName()
	 * @generated
	 * @ordered
	 */
	protected JndiNameType envEntryName;

	/**
	 * The cached value of the '{@link #getEnvEntryType() <em>Env Entry Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvEntryType()
	 * @generated
	 * @ordered
	 */
	protected EnvEntryTypeValuesType envEntryType;

	/**
	 * The cached value of the '{@link #getEnvEntryValue() <em>Env Entry Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvEntryValue()
	 * @generated
	 * @ordered
	 */
	protected XsdStringType envEntryValue;

	/**
	 * The cached value of the '{@link #getMappedName() <em>Mapped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedName()
	 * @generated
	 * @ordered
	 */
	protected XsdStringType mappedName;

	/**
	 * The cached value of the '{@link #getInjectionTarget() <em>Injection Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjectionTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<InjectionTargetType> injectionTarget;

	/**
	 * The cached value of the '{@link #getLookupName() <em>Lookup Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookupName()
	 * @generated
	 * @ordered
	 */
	protected XsdStringType lookupName;

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
	protected EnvEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp30Package.eINSTANCE.getEnvEntryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, Webapp30Package.ENV_ENTRY_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JndiNameType getEnvEntryName() {
		return envEntryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntryName(JndiNameType newEnvEntryName, NotificationChain msgs) {
		JndiNameType oldEnvEntryName = envEntryName;
		envEntryName = newEnvEntryName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME, oldEnvEntryName, newEnvEntryName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntryName(JndiNameType newEnvEntryName) {
		if (newEnvEntryName != envEntryName) {
			NotificationChain msgs = null;
			if (envEntryName != null)
				msgs = ((InternalEObject)envEntryName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME, null, msgs);
			if (newEnvEntryName != null)
				msgs = ((InternalEObject)newEnvEntryName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME, null, msgs);
			msgs = basicSetEnvEntryName(newEnvEntryName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME, newEnvEntryName, newEnvEntryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvEntryTypeValuesType getEnvEntryType() {
		return envEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntryType(EnvEntryTypeValuesType newEnvEntryType, NotificationChain msgs) {
		EnvEntryTypeValuesType oldEnvEntryType = envEntryType;
		envEntryType = newEnvEntryType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE, oldEnvEntryType, newEnvEntryType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntryType(EnvEntryTypeValuesType newEnvEntryType) {
		if (newEnvEntryType != envEntryType) {
			NotificationChain msgs = null;
			if (envEntryType != null)
				msgs = ((InternalEObject)envEntryType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE, null, msgs);
			if (newEnvEntryType != null)
				msgs = ((InternalEObject)newEnvEntryType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE, null, msgs);
			msgs = basicSetEnvEntryType(newEnvEntryType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE, newEnvEntryType, newEnvEntryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdStringType getEnvEntryValue() {
		return envEntryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvEntryValue(XsdStringType newEnvEntryValue, NotificationChain msgs) {
		XsdStringType oldEnvEntryValue = envEntryValue;
		envEntryValue = newEnvEntryValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE, oldEnvEntryValue, newEnvEntryValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvEntryValue(XsdStringType newEnvEntryValue) {
		if (newEnvEntryValue != envEntryValue) {
			NotificationChain msgs = null;
			if (envEntryValue != null)
				msgs = ((InternalEObject)envEntryValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE, null, msgs);
			if (newEnvEntryValue != null)
				msgs = ((InternalEObject)newEnvEntryValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE, null, msgs);
			msgs = basicSetEnvEntryValue(newEnvEntryValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE, newEnvEntryValue, newEnvEntryValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdStringType getMappedName() {
		return mappedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappedName(XsdStringType newMappedName, NotificationChain msgs) {
		XsdStringType oldMappedName = mappedName;
		mappedName = newMappedName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.ENV_ENTRY_TYPE__MAPPED_NAME, oldMappedName, newMappedName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedName(XsdStringType newMappedName) {
		if (newMappedName != mappedName) {
			NotificationChain msgs = null;
			if (mappedName != null)
				msgs = ((InternalEObject)mappedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.ENV_ENTRY_TYPE__MAPPED_NAME, null, msgs);
			if (newMappedName != null)
				msgs = ((InternalEObject)newMappedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.ENV_ENTRY_TYPE__MAPPED_NAME, null, msgs);
			msgs = basicSetMappedName(newMappedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.ENV_ENTRY_TYPE__MAPPED_NAME, newMappedName, newMappedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InjectionTargetType> getInjectionTarget() {
		if (injectionTarget == null) {
			injectionTarget = new EObjectContainmentEList<InjectionTargetType>(InjectionTargetType.class, this, Webapp30Package.ENV_ENTRY_TYPE__INJECTION_TARGET);
		}
		return injectionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdStringType getLookupName() {
		return lookupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLookupName(XsdStringType newLookupName, NotificationChain msgs) {
		XsdStringType oldLookupName = lookupName;
		lookupName = newLookupName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.ENV_ENTRY_TYPE__LOOKUP_NAME, oldLookupName, newLookupName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLookupName(XsdStringType newLookupName) {
		if (newLookupName != lookupName) {
			NotificationChain msgs = null;
			if (lookupName != null)
				msgs = ((InternalEObject)lookupName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.ENV_ENTRY_TYPE__LOOKUP_NAME, null, msgs);
			if (newLookupName != null)
				msgs = ((InternalEObject)newLookupName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.ENV_ENTRY_TYPE__LOOKUP_NAME, null, msgs);
			msgs = basicSetLookupName(newLookupName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.ENV_ENTRY_TYPE__LOOKUP_NAME, newLookupName, newLookupName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.ENV_ENTRY_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp30Package.ENV_ENTRY_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME:
				return basicSetEnvEntryName(null, msgs);
			case Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE:
				return basicSetEnvEntryType(null, msgs);
			case Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE:
				return basicSetEnvEntryValue(null, msgs);
			case Webapp30Package.ENV_ENTRY_TYPE__MAPPED_NAME:
				return basicSetMappedName(null, msgs);
			case Webapp30Package.ENV_ENTRY_TYPE__INJECTION_TARGET:
				return ((InternalEList<?>)getInjectionTarget()).basicRemove(otherEnd, msgs);
			case Webapp30Package.ENV_ENTRY_TYPE__LOOKUP_NAME:
				return basicSetLookupName(null, msgs);
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
			case Webapp30Package.ENV_ENTRY_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME:
				return getEnvEntryName();
			case Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE:
				return getEnvEntryType();
			case Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE:
				return getEnvEntryValue();
			case Webapp30Package.ENV_ENTRY_TYPE__MAPPED_NAME:
				return getMappedName();
			case Webapp30Package.ENV_ENTRY_TYPE__INJECTION_TARGET:
				return getInjectionTarget();
			case Webapp30Package.ENV_ENTRY_TYPE__LOOKUP_NAME:
				return getLookupName();
			case Webapp30Package.ENV_ENTRY_TYPE__ID:
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
			case Webapp30Package.ENV_ENTRY_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME:
				setEnvEntryName((JndiNameType)newValue);
				return;
			case Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE:
				setEnvEntryType((EnvEntryTypeValuesType)newValue);
				return;
			case Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE:
				setEnvEntryValue((XsdStringType)newValue);
				return;
			case Webapp30Package.ENV_ENTRY_TYPE__MAPPED_NAME:
				setMappedName((XsdStringType)newValue);
				return;
			case Webapp30Package.ENV_ENTRY_TYPE__INJECTION_TARGET:
				getInjectionTarget().clear();
				getInjectionTarget().addAll((Collection<? extends InjectionTargetType>)newValue);
				return;
			case Webapp30Package.ENV_ENTRY_TYPE__LOOKUP_NAME:
				setLookupName((XsdStringType)newValue);
				return;
			case Webapp30Package.ENV_ENTRY_TYPE__ID:
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
			case Webapp30Package.ENV_ENTRY_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME:
				setEnvEntryName((JndiNameType)null);
				return;
			case Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE:
				setEnvEntryType((EnvEntryTypeValuesType)null);
				return;
			case Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE:
				setEnvEntryValue((XsdStringType)null);
				return;
			case Webapp30Package.ENV_ENTRY_TYPE__MAPPED_NAME:
				setMappedName((XsdStringType)null);
				return;
			case Webapp30Package.ENV_ENTRY_TYPE__INJECTION_TARGET:
				getInjectionTarget().clear();
				return;
			case Webapp30Package.ENV_ENTRY_TYPE__LOOKUP_NAME:
				setLookupName((XsdStringType)null);
				return;
			case Webapp30Package.ENV_ENTRY_TYPE__ID:
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
			case Webapp30Package.ENV_ENTRY_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_NAME:
				return envEntryName != null;
			case Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_TYPE:
				return envEntryType != null;
			case Webapp30Package.ENV_ENTRY_TYPE__ENV_ENTRY_VALUE:
				return envEntryValue != null;
			case Webapp30Package.ENV_ENTRY_TYPE__MAPPED_NAME:
				return mappedName != null;
			case Webapp30Package.ENV_ENTRY_TYPE__INJECTION_TARGET:
				return injectionTarget != null && !injectionTarget.isEmpty();
			case Webapp30Package.ENV_ENTRY_TYPE__LOOKUP_NAME:
				return lookupName != null;
			case Webapp30Package.ENV_ENTRY_TYPE__ID:
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

} //EnvEntryTypeImpl
