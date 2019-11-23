/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.ejbjar.EjbJar20.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleLinkType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.RoleNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleRefType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Role Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SecurityRoleRefTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SecurityRoleRefTypeImpl#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SecurityRoleRefTypeImpl#getRoleLink <em>Role Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SecurityRoleRefTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecurityRoleRefTypeImpl extends EObjectImpl implements SecurityRoleRefType {
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
	 * The cached value of the '{@link #getRoleName() <em>Role Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleName()
	 * @generated
	 * @ordered
	 */
	protected RoleNameType roleName;

	/**
	 * The cached value of the '{@link #getRoleLink() <em>Role Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleLink()
	 * @generated
	 * @ordered
	 */
	protected RoleLinkType roleLink;

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
	protected SecurityRoleRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar20Package.Literals.SECURITY_ROLE_REF_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.SECURITY_ROLE_REF_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SECURITY_ROLE_REF_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SECURITY_ROLE_REF_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SECURITY_ROLE_REF_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleNameType getRoleName() {
		return roleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleName(RoleNameType newRoleName, NotificationChain msgs) {
		RoleNameType oldRoleName = roleName;
		roleName = newRoleName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_NAME, oldRoleName, newRoleName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleName(RoleNameType newRoleName) {
		if (newRoleName != roleName) {
			NotificationChain msgs = null;
			if (roleName != null)
				msgs = ((InternalEObject)roleName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_NAME, null, msgs);
			if (newRoleName != null)
				msgs = ((InternalEObject)newRoleName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_NAME, null, msgs);
			msgs = basicSetRoleName(newRoleName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_NAME, newRoleName, newRoleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleLinkType getRoleLink() {
		return roleLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleLink(RoleLinkType newRoleLink, NotificationChain msgs) {
		RoleLinkType oldRoleLink = roleLink;
		roleLink = newRoleLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_LINK, oldRoleLink, newRoleLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleLink(RoleLinkType newRoleLink) {
		if (newRoleLink != roleLink) {
			NotificationChain msgs = null;
			if (roleLink != null)
				msgs = ((InternalEObject)roleLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_LINK, null, msgs);
			if (newRoleLink != null)
				msgs = ((InternalEObject)newRoleLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_LINK, null, msgs);
			msgs = basicSetRoleLink(newRoleLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_LINK, newRoleLink, newRoleLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SECURITY_ROLE_REF_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_NAME:
				return basicSetRoleName(null, msgs);
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_LINK:
				return basicSetRoleLink(null, msgs);
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
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_NAME:
				return getRoleName();
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_LINK:
				return getRoleLink();
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__ID:
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
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_NAME:
				setRoleName((RoleNameType)newValue);
				return;
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_LINK:
				setRoleLink((RoleLinkType)newValue);
				return;
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__ID:
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
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_NAME:
				setRoleName((RoleNameType)null);
				return;
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_LINK:
				setRoleLink((RoleLinkType)null);
				return;
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__ID:
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
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__DESCRIPTION:
				return description != null;
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_NAME:
				return roleName != null;
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__ROLE_LINK:
				return roleLink != null;
			case EjbJar20Package.SECURITY_ROLE_REF_TYPE__ID:
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

} //SecurityRoleRefTypeImpl
