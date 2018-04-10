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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.webapp.webapp30.FormLoginConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.WarPathType;
import org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Login Config Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.FormLoginConfigTypeImpl#getFormLoginPage <em>Form Login Page</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.FormLoginConfigTypeImpl#getFormErrorPage <em>Form Error Page</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.FormLoginConfigTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormLoginConfigTypeImpl extends EObjectImpl implements FormLoginConfigType {
	/**
	 * The cached value of the '{@link #getFormLoginPage() <em>Form Login Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormLoginPage()
	 * @generated
	 * @ordered
	 */
	protected WarPathType formLoginPage;

	/**
	 * The cached value of the '{@link #getFormErrorPage() <em>Form Error Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormErrorPage()
	 * @generated
	 * @ordered
	 */
	protected WarPathType formErrorPage;

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
	protected FormLoginConfigTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp30Package.eINSTANCE.getFormLoginConfigType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarPathType getFormLoginPage() {
		return formLoginPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormLoginPage(WarPathType newFormLoginPage, NotificationChain msgs) {
		WarPathType oldFormLoginPage = formLoginPage;
		formLoginPage = newFormLoginPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_LOGIN_PAGE, oldFormLoginPage, newFormLoginPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormLoginPage(WarPathType newFormLoginPage) {
		if (newFormLoginPage != formLoginPage) {
			NotificationChain msgs = null;
			if (formLoginPage != null)
				msgs = ((InternalEObject)formLoginPage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_LOGIN_PAGE, null, msgs);
			if (newFormLoginPage != null)
				msgs = ((InternalEObject)newFormLoginPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_LOGIN_PAGE, null, msgs);
			msgs = basicSetFormLoginPage(newFormLoginPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_LOGIN_PAGE, newFormLoginPage, newFormLoginPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarPathType getFormErrorPage() {
		return formErrorPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormErrorPage(WarPathType newFormErrorPage, NotificationChain msgs) {
		WarPathType oldFormErrorPage = formErrorPage;
		formErrorPage = newFormErrorPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_ERROR_PAGE, oldFormErrorPage, newFormErrorPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormErrorPage(WarPathType newFormErrorPage) {
		if (newFormErrorPage != formErrorPage) {
			NotificationChain msgs = null;
			if (formErrorPage != null)
				msgs = ((InternalEObject)formErrorPage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_ERROR_PAGE, null, msgs);
			if (newFormErrorPage != null)
				msgs = ((InternalEObject)newFormErrorPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_ERROR_PAGE, null, msgs);
			msgs = basicSetFormErrorPage(newFormErrorPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_ERROR_PAGE, newFormErrorPage, newFormErrorPage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.FORM_LOGIN_CONFIG_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_LOGIN_PAGE:
				return basicSetFormLoginPage(null, msgs);
			case Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_ERROR_PAGE:
				return basicSetFormErrorPage(null, msgs);
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
			case Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_LOGIN_PAGE:
				return getFormLoginPage();
			case Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_ERROR_PAGE:
				return getFormErrorPage();
			case Webapp30Package.FORM_LOGIN_CONFIG_TYPE__ID:
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
			case Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_LOGIN_PAGE:
				setFormLoginPage((WarPathType)newValue);
				return;
			case Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_ERROR_PAGE:
				setFormErrorPage((WarPathType)newValue);
				return;
			case Webapp30Package.FORM_LOGIN_CONFIG_TYPE__ID:
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
			case Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_LOGIN_PAGE:
				setFormLoginPage((WarPathType)null);
				return;
			case Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_ERROR_PAGE:
				setFormErrorPage((WarPathType)null);
				return;
			case Webapp30Package.FORM_LOGIN_CONFIG_TYPE__ID:
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
			case Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_LOGIN_PAGE:
				return formLoginPage != null;
			case Webapp30Package.FORM_LOGIN_CONFIG_TYPE__FORM_ERROR_PAGE:
				return formErrorPage != null;
			case Webapp30Package.FORM_LOGIN_CONFIG_TYPE__ID:
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

} //FormLoginConfigTypeImpl
