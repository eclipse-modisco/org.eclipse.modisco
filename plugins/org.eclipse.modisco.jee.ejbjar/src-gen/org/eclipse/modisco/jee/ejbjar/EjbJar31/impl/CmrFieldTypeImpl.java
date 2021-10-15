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
package org.eclipse.modisco.jee.ejbjar.EjbJar31.impl;

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

import org.eclipse.modisco.jee.ejbjar.EjbJar31.CmrFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.CmrFieldTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cmr Field Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.CmrFieldTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.CmrFieldTypeImpl#getCmrFieldName <em>Cmr Field Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.CmrFieldTypeImpl#getCmrFieldType <em>Cmr Field Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.CmrFieldTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CmrFieldTypeImpl extends EObjectImpl implements CmrFieldType {
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
	 * The cached value of the '{@link #getCmrFieldName() <em>Cmr Field Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmrFieldName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.ejbjar.EjbJar31.String cmrFieldName;

	/**
	 * The cached value of the '{@link #getCmrFieldType() <em>Cmr Field Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmrFieldType()
	 * @generated
	 * @ordered
	 */
	protected CmrFieldTypeType cmrFieldType;

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
	protected CmrFieldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar31Package.eINSTANCE.getCmrFieldType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, EjbJar31Package.CMR_FIELD_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.ejbjar.EjbJar31.String getCmrFieldName() {
		return cmrFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmrFieldName(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newCmrFieldName, NotificationChain msgs) {
		org.eclipse.modisco.jee.ejbjar.EjbJar31.String oldCmrFieldName = cmrFieldName;
		cmrFieldName = newCmrFieldName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_NAME, oldCmrFieldName, newCmrFieldName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmrFieldName(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newCmrFieldName) {
		if (newCmrFieldName != cmrFieldName) {
			NotificationChain msgs = null;
			if (cmrFieldName != null)
				msgs = ((InternalEObject)cmrFieldName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_NAME, null, msgs);
			if (newCmrFieldName != null)
				msgs = ((InternalEObject)newCmrFieldName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_NAME, null, msgs);
			msgs = basicSetCmrFieldName(newCmrFieldName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_NAME, newCmrFieldName, newCmrFieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmrFieldTypeType getCmrFieldType() {
		return cmrFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmrFieldType(CmrFieldTypeType newCmrFieldType, NotificationChain msgs) {
		CmrFieldTypeType oldCmrFieldType = cmrFieldType;
		cmrFieldType = newCmrFieldType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_TYPE, oldCmrFieldType, newCmrFieldType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmrFieldType(CmrFieldTypeType newCmrFieldType) {
		if (newCmrFieldType != cmrFieldType) {
			NotificationChain msgs = null;
			if (cmrFieldType != null)
				msgs = ((InternalEObject)cmrFieldType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_TYPE, null, msgs);
			if (newCmrFieldType != null)
				msgs = ((InternalEObject)newCmrFieldType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_TYPE, null, msgs);
			msgs = basicSetCmrFieldType(newCmrFieldType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_TYPE, newCmrFieldType, newCmrFieldType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.CMR_FIELD_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar31Package.CMR_FIELD_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_NAME:
				return basicSetCmrFieldName(null, msgs);
			case EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_TYPE:
				return basicSetCmrFieldType(null, msgs);
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
			case EjbJar31Package.CMR_FIELD_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_NAME:
				return getCmrFieldName();
			case EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_TYPE:
				return getCmrFieldType();
			case EjbJar31Package.CMR_FIELD_TYPE__ID:
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
			case EjbJar31Package.CMR_FIELD_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_NAME:
				setCmrFieldName((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)newValue);
				return;
			case EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_TYPE:
				setCmrFieldType((CmrFieldTypeType)newValue);
				return;
			case EjbJar31Package.CMR_FIELD_TYPE__ID:
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
			case EjbJar31Package.CMR_FIELD_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_NAME:
				setCmrFieldName((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)null);
				return;
			case EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_TYPE:
				setCmrFieldType((CmrFieldTypeType)null);
				return;
			case EjbJar31Package.CMR_FIELD_TYPE__ID:
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
			case EjbJar31Package.CMR_FIELD_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_NAME:
				return cmrFieldName != null;
			case EjbJar31Package.CMR_FIELD_TYPE__CMR_FIELD_TYPE:
				return cmrFieldType != null;
			case EjbJar31Package.CMR_FIELD_TYPE__ID:
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

} //CmrFieldTypeImpl
