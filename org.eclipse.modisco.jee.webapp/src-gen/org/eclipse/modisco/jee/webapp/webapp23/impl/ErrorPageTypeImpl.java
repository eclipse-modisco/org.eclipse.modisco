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

import org.eclipse.modisco.jee.webapp.webapp23.ErrorCodeType;
import org.eclipse.modisco.jee.webapp.webapp23.ErrorPageType;
import org.eclipse.modisco.jee.webapp.webapp23.ExceptionTypeType;
import org.eclipse.modisco.jee.webapp.webapp23.LocationType;
import org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Page Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ErrorPageTypeImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ErrorPageTypeImpl#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ErrorPageTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.ErrorPageTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorPageTypeImpl extends EObjectImpl implements ErrorPageType {
	/**
	 * The cached value of the '{@link #getErrorCode() <em>Error Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected ErrorCodeType errorCode;

	/**
	 * The cached value of the '{@link #getExceptionType() <em>Exception Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionType()
	 * @generated
	 * @ordered
	 */
	protected ExceptionTypeType exceptionType;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected LocationType location;

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
	protected ErrorPageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp23Package.Literals.ERROR_PAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeType getErrorCode() {
		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorCode(ErrorCodeType newErrorCode, NotificationChain msgs) {
		ErrorCodeType oldErrorCode = errorCode;
		errorCode = newErrorCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.ERROR_PAGE_TYPE__ERROR_CODE, oldErrorCode, newErrorCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorCode(ErrorCodeType newErrorCode) {
		if (newErrorCode != errorCode) {
			NotificationChain msgs = null;
			if (errorCode != null)
				msgs = ((InternalEObject)errorCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.ERROR_PAGE_TYPE__ERROR_CODE, null, msgs);
			if (newErrorCode != null)
				msgs = ((InternalEObject)newErrorCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.ERROR_PAGE_TYPE__ERROR_CODE, null, msgs);
			msgs = basicSetErrorCode(newErrorCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.ERROR_PAGE_TYPE__ERROR_CODE, newErrorCode, newErrorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionTypeType getExceptionType() {
		return exceptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionType(ExceptionTypeType newExceptionType, NotificationChain msgs) {
		ExceptionTypeType oldExceptionType = exceptionType;
		exceptionType = newExceptionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE, oldExceptionType, newExceptionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionType(ExceptionTypeType newExceptionType) {
		if (newExceptionType != exceptionType) {
			NotificationChain msgs = null;
			if (exceptionType != null)
				msgs = ((InternalEObject)exceptionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE, null, msgs);
			if (newExceptionType != null)
				msgs = ((InternalEObject)newExceptionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE, null, msgs);
			msgs = basicSetExceptionType(newExceptionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE, newExceptionType, newExceptionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LocationType newLocation, NotificationChain msgs) {
		LocationType oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.ERROR_PAGE_TYPE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(LocationType newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.ERROR_PAGE_TYPE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.ERROR_PAGE_TYPE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.ERROR_PAGE_TYPE__LOCATION, newLocation, newLocation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.ERROR_PAGE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp23Package.ERROR_PAGE_TYPE__ERROR_CODE:
				return basicSetErrorCode(null, msgs);
			case Webapp23Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE:
				return basicSetExceptionType(null, msgs);
			case Webapp23Package.ERROR_PAGE_TYPE__LOCATION:
				return basicSetLocation(null, msgs);
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
			case Webapp23Package.ERROR_PAGE_TYPE__ERROR_CODE:
				return getErrorCode();
			case Webapp23Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE:
				return getExceptionType();
			case Webapp23Package.ERROR_PAGE_TYPE__LOCATION:
				return getLocation();
			case Webapp23Package.ERROR_PAGE_TYPE__ID:
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
			case Webapp23Package.ERROR_PAGE_TYPE__ERROR_CODE:
				setErrorCode((ErrorCodeType)newValue);
				return;
			case Webapp23Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE:
				setExceptionType((ExceptionTypeType)newValue);
				return;
			case Webapp23Package.ERROR_PAGE_TYPE__LOCATION:
				setLocation((LocationType)newValue);
				return;
			case Webapp23Package.ERROR_PAGE_TYPE__ID:
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
			case Webapp23Package.ERROR_PAGE_TYPE__ERROR_CODE:
				setErrorCode((ErrorCodeType)null);
				return;
			case Webapp23Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE:
				setExceptionType((ExceptionTypeType)null);
				return;
			case Webapp23Package.ERROR_PAGE_TYPE__LOCATION:
				setLocation((LocationType)null);
				return;
			case Webapp23Package.ERROR_PAGE_TYPE__ID:
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
			case Webapp23Package.ERROR_PAGE_TYPE__ERROR_CODE:
				return errorCode != null;
			case Webapp23Package.ERROR_PAGE_TYPE__EXCEPTION_TYPE:
				return exceptionType != null;
			case Webapp23Package.ERROR_PAGE_TYPE__LOCATION:
				return location != null;
			case Webapp23Package.ERROR_PAGE_TYPE__ID:
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

} //ErrorPageTypeImpl
