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

import org.eclipse.modisco.jee.webapp.webapp24.AuthConstraintType;
import org.eclipse.modisco.jee.webapp.webapp24.DisplayNameType;
import org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType;
import org.eclipse.modisco.jee.webapp.webapp24.UserDataConstraintType;
import org.eclipse.modisco.jee.webapp.webapp24.WebResourceCollectionType;
import org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.SecurityConstraintTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.SecurityConstraintTypeImpl#getWebResourceCollection <em>Web Resource Collection</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.SecurityConstraintTypeImpl#getAuthConstraint <em>Auth Constraint</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.SecurityConstraintTypeImpl#getUserDataConstraint <em>User Data Constraint</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.SecurityConstraintTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityConstraintTypeImpl extends EObjectImpl implements SecurityConstraintType {
	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected EList<DisplayNameType> displayName;

	/**
	 * The cached value of the '{@link #getWebResourceCollection() <em>Web Resource Collection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebResourceCollection()
	 * @generated
	 * @ordered
	 */
	protected EList<WebResourceCollectionType> webResourceCollection;

	/**
	 * The cached value of the '{@link #getAuthConstraint() <em>Auth Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthConstraint()
	 * @generated
	 * @ordered
	 */
	protected AuthConstraintType authConstraint;

	/**
	 * The cached value of the '{@link #getUserDataConstraint() <em>User Data Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataConstraint()
	 * @generated
	 * @ordered
	 */
	protected UserDataConstraintType userDataConstraint;

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
	protected SecurityConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp24Package.Literals.SECURITY_CONSTRAINT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisplayNameType> getDisplayName() {
		if (displayName == null) {
			displayName = new EObjectContainmentEList<DisplayNameType>(DisplayNameType.class, this, Webapp24Package.SECURITY_CONSTRAINT_TYPE__DISPLAY_NAME);
		}
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WebResourceCollectionType> getWebResourceCollection() {
		if (webResourceCollection == null) {
			webResourceCollection = new EObjectContainmentEList<WebResourceCollectionType>(WebResourceCollectionType.class, this, Webapp24Package.SECURITY_CONSTRAINT_TYPE__WEB_RESOURCE_COLLECTION);
		}
		return webResourceCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthConstraintType getAuthConstraint() {
		return authConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthConstraint(AuthConstraintType newAuthConstraint, NotificationChain msgs) {
		AuthConstraintType oldAuthConstraint = authConstraint;
		authConstraint = newAuthConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.SECURITY_CONSTRAINT_TYPE__AUTH_CONSTRAINT, oldAuthConstraint, newAuthConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthConstraint(AuthConstraintType newAuthConstraint) {
		if (newAuthConstraint != authConstraint) {
			NotificationChain msgs = null;
			if (authConstraint != null)
				msgs = ((InternalEObject)authConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.SECURITY_CONSTRAINT_TYPE__AUTH_CONSTRAINT, null, msgs);
			if (newAuthConstraint != null)
				msgs = ((InternalEObject)newAuthConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.SECURITY_CONSTRAINT_TYPE__AUTH_CONSTRAINT, null, msgs);
			msgs = basicSetAuthConstraint(newAuthConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.SECURITY_CONSTRAINT_TYPE__AUTH_CONSTRAINT, newAuthConstraint, newAuthConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDataConstraintType getUserDataConstraint() {
		return userDataConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserDataConstraint(UserDataConstraintType newUserDataConstraint, NotificationChain msgs) {
		UserDataConstraintType oldUserDataConstraint = userDataConstraint;
		userDataConstraint = newUserDataConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.SECURITY_CONSTRAINT_TYPE__USER_DATA_CONSTRAINT, oldUserDataConstraint, newUserDataConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDataConstraint(UserDataConstraintType newUserDataConstraint) {
		if (newUserDataConstraint != userDataConstraint) {
			NotificationChain msgs = null;
			if (userDataConstraint != null)
				msgs = ((InternalEObject)userDataConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.SECURITY_CONSTRAINT_TYPE__USER_DATA_CONSTRAINT, null, msgs);
			if (newUserDataConstraint != null)
				msgs = ((InternalEObject)newUserDataConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.SECURITY_CONSTRAINT_TYPE__USER_DATA_CONSTRAINT, null, msgs);
			msgs = basicSetUserDataConstraint(newUserDataConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.SECURITY_CONSTRAINT_TYPE__USER_DATA_CONSTRAINT, newUserDataConstraint, newUserDataConstraint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.SECURITY_CONSTRAINT_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__DISPLAY_NAME:
				return ((InternalEList<?>)getDisplayName()).basicRemove(otherEnd, msgs);
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__WEB_RESOURCE_COLLECTION:
				return ((InternalEList<?>)getWebResourceCollection()).basicRemove(otherEnd, msgs);
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__AUTH_CONSTRAINT:
				return basicSetAuthConstraint(null, msgs);
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__USER_DATA_CONSTRAINT:
				return basicSetUserDataConstraint(null, msgs);
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
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__WEB_RESOURCE_COLLECTION:
				return getWebResourceCollection();
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__AUTH_CONSTRAINT:
				return getAuthConstraint();
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__USER_DATA_CONSTRAINT:
				return getUserDataConstraint();
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__ID:
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
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				getDisplayName().addAll((Collection<? extends DisplayNameType>)newValue);
				return;
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__WEB_RESOURCE_COLLECTION:
				getWebResourceCollection().clear();
				getWebResourceCollection().addAll((Collection<? extends WebResourceCollectionType>)newValue);
				return;
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__AUTH_CONSTRAINT:
				setAuthConstraint((AuthConstraintType)newValue);
				return;
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__USER_DATA_CONSTRAINT:
				setUserDataConstraint((UserDataConstraintType)newValue);
				return;
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__ID:
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
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				return;
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__WEB_RESOURCE_COLLECTION:
				getWebResourceCollection().clear();
				return;
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__AUTH_CONSTRAINT:
				setAuthConstraint((AuthConstraintType)null);
				return;
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__USER_DATA_CONSTRAINT:
				setUserDataConstraint((UserDataConstraintType)null);
				return;
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__ID:
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
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__DISPLAY_NAME:
				return displayName != null && !displayName.isEmpty();
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__WEB_RESOURCE_COLLECTION:
				return webResourceCollection != null && !webResourceCollection.isEmpty();
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__AUTH_CONSTRAINT:
				return authConstraint != null;
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__USER_DATA_CONSTRAINT:
				return userDataConstraint != null;
			case Webapp24Package.SECURITY_CONSTRAINT_TYPE__ID:
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

} //SecurityConstraintTypeImpl
