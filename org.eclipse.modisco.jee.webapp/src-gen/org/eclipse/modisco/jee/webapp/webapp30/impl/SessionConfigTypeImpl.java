/**
 *   Copyright (c) 2010 Mia-Software.
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

import org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.SessionConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.TrackingModeType;
import org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package;
import org.eclipse.modisco.jee.webapp.webapp30.XsdIntegerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session Config Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.SessionConfigTypeImpl#getSessionTimeout <em>Session Timeout</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.SessionConfigTypeImpl#getCookieConfig <em>Cookie Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.SessionConfigTypeImpl#getTrackingMode <em>Tracking Mode</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.SessionConfigTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SessionConfigTypeImpl extends EObjectImpl implements SessionConfigType {
	/**
	 * The cached value of the '{@link #getSessionTimeout() <em>Session Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionTimeout()
	 * @generated
	 * @ordered
	 */
	protected XsdIntegerType sessionTimeout;

	/**
	 * The cached value of the '{@link #getCookieConfig() <em>Cookie Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookieConfig()
	 * @generated
	 * @ordered
	 */
	protected CookieConfigType cookieConfig;

	/**
	 * The cached value of the '{@link #getTrackingMode() <em>Tracking Mode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingMode()
	 * @generated
	 * @ordered
	 */
	protected EList<TrackingModeType> trackingMode;

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
	protected SessionConfigTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp30Package.eINSTANCE.getSessionConfigType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdIntegerType getSessionTimeout() {
		return sessionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessionTimeout(XsdIntegerType newSessionTimeout, NotificationChain msgs) {
		XsdIntegerType oldSessionTimeout = sessionTimeout;
		sessionTimeout = newSessionTimeout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.SESSION_CONFIG_TYPE__SESSION_TIMEOUT, oldSessionTimeout, newSessionTimeout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionTimeout(XsdIntegerType newSessionTimeout) {
		if (newSessionTimeout != sessionTimeout) {
			NotificationChain msgs = null;
			if (sessionTimeout != null)
				msgs = ((InternalEObject)sessionTimeout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.SESSION_CONFIG_TYPE__SESSION_TIMEOUT, null, msgs);
			if (newSessionTimeout != null)
				msgs = ((InternalEObject)newSessionTimeout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.SESSION_CONFIG_TYPE__SESSION_TIMEOUT, null, msgs);
			msgs = basicSetSessionTimeout(newSessionTimeout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.SESSION_CONFIG_TYPE__SESSION_TIMEOUT, newSessionTimeout, newSessionTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookieConfigType getCookieConfig() {
		return cookieConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCookieConfig(CookieConfigType newCookieConfig, NotificationChain msgs) {
		CookieConfigType oldCookieConfig = cookieConfig;
		cookieConfig = newCookieConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.SESSION_CONFIG_TYPE__COOKIE_CONFIG, oldCookieConfig, newCookieConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCookieConfig(CookieConfigType newCookieConfig) {
		if (newCookieConfig != cookieConfig) {
			NotificationChain msgs = null;
			if (cookieConfig != null)
				msgs = ((InternalEObject)cookieConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.SESSION_CONFIG_TYPE__COOKIE_CONFIG, null, msgs);
			if (newCookieConfig != null)
				msgs = ((InternalEObject)newCookieConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.SESSION_CONFIG_TYPE__COOKIE_CONFIG, null, msgs);
			msgs = basicSetCookieConfig(newCookieConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.SESSION_CONFIG_TYPE__COOKIE_CONFIG, newCookieConfig, newCookieConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrackingModeType> getTrackingMode() {
		if (trackingMode == null) {
			trackingMode = new EObjectContainmentEList<TrackingModeType>(TrackingModeType.class, this, Webapp30Package.SESSION_CONFIG_TYPE__TRACKING_MODE);
		}
		return trackingMode;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.SESSION_CONFIG_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp30Package.SESSION_CONFIG_TYPE__SESSION_TIMEOUT:
				return basicSetSessionTimeout(null, msgs);
			case Webapp30Package.SESSION_CONFIG_TYPE__COOKIE_CONFIG:
				return basicSetCookieConfig(null, msgs);
			case Webapp30Package.SESSION_CONFIG_TYPE__TRACKING_MODE:
				return ((InternalEList<?>)getTrackingMode()).basicRemove(otherEnd, msgs);
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
			case Webapp30Package.SESSION_CONFIG_TYPE__SESSION_TIMEOUT:
				return getSessionTimeout();
			case Webapp30Package.SESSION_CONFIG_TYPE__COOKIE_CONFIG:
				return getCookieConfig();
			case Webapp30Package.SESSION_CONFIG_TYPE__TRACKING_MODE:
				return getTrackingMode();
			case Webapp30Package.SESSION_CONFIG_TYPE__ID:
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
			case Webapp30Package.SESSION_CONFIG_TYPE__SESSION_TIMEOUT:
				setSessionTimeout((XsdIntegerType)newValue);
				return;
			case Webapp30Package.SESSION_CONFIG_TYPE__COOKIE_CONFIG:
				setCookieConfig((CookieConfigType)newValue);
				return;
			case Webapp30Package.SESSION_CONFIG_TYPE__TRACKING_MODE:
				getTrackingMode().clear();
				getTrackingMode().addAll((Collection<? extends TrackingModeType>)newValue);
				return;
			case Webapp30Package.SESSION_CONFIG_TYPE__ID:
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
			case Webapp30Package.SESSION_CONFIG_TYPE__SESSION_TIMEOUT:
				setSessionTimeout((XsdIntegerType)null);
				return;
			case Webapp30Package.SESSION_CONFIG_TYPE__COOKIE_CONFIG:
				setCookieConfig((CookieConfigType)null);
				return;
			case Webapp30Package.SESSION_CONFIG_TYPE__TRACKING_MODE:
				getTrackingMode().clear();
				return;
			case Webapp30Package.SESSION_CONFIG_TYPE__ID:
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
			case Webapp30Package.SESSION_CONFIG_TYPE__SESSION_TIMEOUT:
				return sessionTimeout != null;
			case Webapp30Package.SESSION_CONFIG_TYPE__COOKIE_CONFIG:
				return cookieConfig != null;
			case Webapp30Package.SESSION_CONFIG_TYPE__TRACKING_MODE:
				return trackingMode != null && !trackingMode.isEmpty();
			case Webapp30Package.SESSION_CONFIG_TYPE__ID:
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

} //SessionConfigTypeImpl
