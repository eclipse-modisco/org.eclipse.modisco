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
package org.eclipse.modisco.jee.webapp.webapp23.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.webapp.webapp23.AuthMethodType;
import org.eclipse.modisco.jee.webapp.webapp23.FormLoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp23.LoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp23.RealmNameType;
import org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Login Config Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.LoginConfigTypeImpl#getAuthMethod <em>Auth Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.LoginConfigTypeImpl#getRealmName <em>Realm Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.LoginConfigTypeImpl#getFormLoginConfig <em>Form Login Config</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.LoginConfigTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoginConfigTypeImpl extends EObjectImpl implements LoginConfigType {
	/**
	 * The cached value of the '{@link #getAuthMethod() <em>Auth Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthMethod()
	 * @generated
	 * @ordered
	 */
	protected AuthMethodType authMethod;

	/**
	 * The cached value of the '{@link #getRealmName() <em>Realm Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealmName()
	 * @generated
	 * @ordered
	 */
	protected RealmNameType realmName;

	/**
	 * The cached value of the '{@link #getFormLoginConfig() <em>Form Login Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormLoginConfig()
	 * @generated
	 * @ordered
	 */
	protected FormLoginConfigType formLoginConfig;

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
	protected LoginConfigTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp23Package.Literals.LOGIN_CONFIG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthMethodType getAuthMethod() {
		return authMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthMethod(AuthMethodType newAuthMethod, NotificationChain msgs) {
		AuthMethodType oldAuthMethod = authMethod;
		authMethod = newAuthMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.LOGIN_CONFIG_TYPE__AUTH_METHOD, oldAuthMethod, newAuthMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthMethod(AuthMethodType newAuthMethod) {
		if (newAuthMethod != authMethod) {
			NotificationChain msgs = null;
			if (authMethod != null)
				msgs = ((InternalEObject)authMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.LOGIN_CONFIG_TYPE__AUTH_METHOD, null, msgs);
			if (newAuthMethod != null)
				msgs = ((InternalEObject)newAuthMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.LOGIN_CONFIG_TYPE__AUTH_METHOD, null, msgs);
			msgs = basicSetAuthMethod(newAuthMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.LOGIN_CONFIG_TYPE__AUTH_METHOD, newAuthMethod, newAuthMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealmNameType getRealmName() {
		return realmName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealmName(RealmNameType newRealmName, NotificationChain msgs) {
		RealmNameType oldRealmName = realmName;
		realmName = newRealmName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.LOGIN_CONFIG_TYPE__REALM_NAME, oldRealmName, newRealmName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealmName(RealmNameType newRealmName) {
		if (newRealmName != realmName) {
			NotificationChain msgs = null;
			if (realmName != null)
				msgs = ((InternalEObject)realmName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.LOGIN_CONFIG_TYPE__REALM_NAME, null, msgs);
			if (newRealmName != null)
				msgs = ((InternalEObject)newRealmName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.LOGIN_CONFIG_TYPE__REALM_NAME, null, msgs);
			msgs = basicSetRealmName(newRealmName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.LOGIN_CONFIG_TYPE__REALM_NAME, newRealmName, newRealmName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormLoginConfigType getFormLoginConfig() {
		return formLoginConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormLoginConfig(FormLoginConfigType newFormLoginConfig, NotificationChain msgs) {
		FormLoginConfigType oldFormLoginConfig = formLoginConfig;
		formLoginConfig = newFormLoginConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.LOGIN_CONFIG_TYPE__FORM_LOGIN_CONFIG, oldFormLoginConfig, newFormLoginConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormLoginConfig(FormLoginConfigType newFormLoginConfig) {
		if (newFormLoginConfig != formLoginConfig) {
			NotificationChain msgs = null;
			if (formLoginConfig != null)
				msgs = ((InternalEObject)formLoginConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.LOGIN_CONFIG_TYPE__FORM_LOGIN_CONFIG, null, msgs);
			if (newFormLoginConfig != null)
				msgs = ((InternalEObject)newFormLoginConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.LOGIN_CONFIG_TYPE__FORM_LOGIN_CONFIG, null, msgs);
			msgs = basicSetFormLoginConfig(newFormLoginConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.LOGIN_CONFIG_TYPE__FORM_LOGIN_CONFIG, newFormLoginConfig, newFormLoginConfig));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.LOGIN_CONFIG_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp23Package.LOGIN_CONFIG_TYPE__AUTH_METHOD:
				return basicSetAuthMethod(null, msgs);
			case Webapp23Package.LOGIN_CONFIG_TYPE__REALM_NAME:
				return basicSetRealmName(null, msgs);
			case Webapp23Package.LOGIN_CONFIG_TYPE__FORM_LOGIN_CONFIG:
				return basicSetFormLoginConfig(null, msgs);
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
			case Webapp23Package.LOGIN_CONFIG_TYPE__AUTH_METHOD:
				return getAuthMethod();
			case Webapp23Package.LOGIN_CONFIG_TYPE__REALM_NAME:
				return getRealmName();
			case Webapp23Package.LOGIN_CONFIG_TYPE__FORM_LOGIN_CONFIG:
				return getFormLoginConfig();
			case Webapp23Package.LOGIN_CONFIG_TYPE__ID:
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
			case Webapp23Package.LOGIN_CONFIG_TYPE__AUTH_METHOD:
				setAuthMethod((AuthMethodType)newValue);
				return;
			case Webapp23Package.LOGIN_CONFIG_TYPE__REALM_NAME:
				setRealmName((RealmNameType)newValue);
				return;
			case Webapp23Package.LOGIN_CONFIG_TYPE__FORM_LOGIN_CONFIG:
				setFormLoginConfig((FormLoginConfigType)newValue);
				return;
			case Webapp23Package.LOGIN_CONFIG_TYPE__ID:
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
			case Webapp23Package.LOGIN_CONFIG_TYPE__AUTH_METHOD:
				setAuthMethod((AuthMethodType)null);
				return;
			case Webapp23Package.LOGIN_CONFIG_TYPE__REALM_NAME:
				setRealmName((RealmNameType)null);
				return;
			case Webapp23Package.LOGIN_CONFIG_TYPE__FORM_LOGIN_CONFIG:
				setFormLoginConfig((FormLoginConfigType)null);
				return;
			case Webapp23Package.LOGIN_CONFIG_TYPE__ID:
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
			case Webapp23Package.LOGIN_CONFIG_TYPE__AUTH_METHOD:
				return authMethod != null;
			case Webapp23Package.LOGIN_CONFIG_TYPE__REALM_NAME:
				return realmName != null;
			case Webapp23Package.LOGIN_CONFIG_TYPE__FORM_LOGIN_CONFIG:
				return formLoginConfig != null;
			case Webapp23Package.LOGIN_CONFIG_TYPE__ID:
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

} //LoginConfigTypeImpl
