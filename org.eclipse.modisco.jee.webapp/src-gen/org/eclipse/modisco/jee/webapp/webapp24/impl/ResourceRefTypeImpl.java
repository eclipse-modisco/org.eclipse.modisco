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
import org.eclipse.modisco.jee.webapp.webapp24.FullyQualifiedClassType;
import org.eclipse.modisco.jee.webapp.webapp24.JndiNameType;
import org.eclipse.modisco.jee.webapp.webapp24.ResAuthType;
import org.eclipse.modisco.jee.webapp.webapp24.ResSharingScopeType;
import org.eclipse.modisco.jee.webapp.webapp24.ResourceRefType;
import org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ResourceRefTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ResourceRefTypeImpl#getResRefName <em>Res Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ResourceRefTypeImpl#getResType <em>Res Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ResourceRefTypeImpl#getResAuth <em>Res Auth</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ResourceRefTypeImpl#getResSharingScope <em>Res Sharing Scope</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.ResourceRefTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceRefTypeImpl extends EObjectImpl implements ResourceRefType {
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
	 * The cached value of the '{@link #getResRefName() <em>Res Ref Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResRefName()
	 * @generated
	 * @ordered
	 */
	protected JndiNameType resRefName;

	/**
	 * The cached value of the '{@link #getResType() <em>Res Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResType()
	 * @generated
	 * @ordered
	 */
	protected FullyQualifiedClassType resType;

	/**
	 * The cached value of the '{@link #getResAuth() <em>Res Auth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResAuth()
	 * @generated
	 * @ordered
	 */
	protected ResAuthType resAuth;

	/**
	 * The cached value of the '{@link #getResSharingScope() <em>Res Sharing Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResSharingScope()
	 * @generated
	 * @ordered
	 */
	protected ResSharingScopeType resSharingScope;

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
	protected ResourceRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp24Package.Literals.RESOURCE_REF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, Webapp24Package.RESOURCE_REF_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JndiNameType getResRefName() {
		return resRefName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResRefName(JndiNameType newResRefName, NotificationChain msgs) {
		JndiNameType oldResRefName = resRefName;
		resRefName = newResRefName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.RESOURCE_REF_TYPE__RES_REF_NAME, oldResRefName, newResRefName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResRefName(JndiNameType newResRefName) {
		if (newResRefName != resRefName) {
			NotificationChain msgs = null;
			if (resRefName != null)
				msgs = ((InternalEObject)resRefName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.RESOURCE_REF_TYPE__RES_REF_NAME, null, msgs);
			if (newResRefName != null)
				msgs = ((InternalEObject)newResRefName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.RESOURCE_REF_TYPE__RES_REF_NAME, null, msgs);
			msgs = basicSetResRefName(newResRefName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.RESOURCE_REF_TYPE__RES_REF_NAME, newResRefName, newResRefName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedClassType getResType() {
		return resType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResType(FullyQualifiedClassType newResType, NotificationChain msgs) {
		FullyQualifiedClassType oldResType = resType;
		resType = newResType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.RESOURCE_REF_TYPE__RES_TYPE, oldResType, newResType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResType(FullyQualifiedClassType newResType) {
		if (newResType != resType) {
			NotificationChain msgs = null;
			if (resType != null)
				msgs = ((InternalEObject)resType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.RESOURCE_REF_TYPE__RES_TYPE, null, msgs);
			if (newResType != null)
				msgs = ((InternalEObject)newResType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.RESOURCE_REF_TYPE__RES_TYPE, null, msgs);
			msgs = basicSetResType(newResType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.RESOURCE_REF_TYPE__RES_TYPE, newResType, newResType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResAuthType getResAuth() {
		return resAuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResAuth(ResAuthType newResAuth, NotificationChain msgs) {
		ResAuthType oldResAuth = resAuth;
		resAuth = newResAuth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.RESOURCE_REF_TYPE__RES_AUTH, oldResAuth, newResAuth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResAuth(ResAuthType newResAuth) {
		if (newResAuth != resAuth) {
			NotificationChain msgs = null;
			if (resAuth != null)
				msgs = ((InternalEObject)resAuth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.RESOURCE_REF_TYPE__RES_AUTH, null, msgs);
			if (newResAuth != null)
				msgs = ((InternalEObject)newResAuth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.RESOURCE_REF_TYPE__RES_AUTH, null, msgs);
			msgs = basicSetResAuth(newResAuth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.RESOURCE_REF_TYPE__RES_AUTH, newResAuth, newResAuth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResSharingScopeType getResSharingScope() {
		return resSharingScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResSharingScope(ResSharingScopeType newResSharingScope, NotificationChain msgs) {
		ResSharingScopeType oldResSharingScope = resSharingScope;
		resSharingScope = newResSharingScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE, oldResSharingScope, newResSharingScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResSharingScope(ResSharingScopeType newResSharingScope) {
		if (newResSharingScope != resSharingScope) {
			NotificationChain msgs = null;
			if (resSharingScope != null)
				msgs = ((InternalEObject)resSharingScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE, null, msgs);
			if (newResSharingScope != null)
				msgs = ((InternalEObject)newResSharingScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE, null, msgs);
			msgs = basicSetResSharingScope(newResSharingScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE, newResSharingScope, newResSharingScope));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.RESOURCE_REF_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp24Package.RESOURCE_REF_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case Webapp24Package.RESOURCE_REF_TYPE__RES_REF_NAME:
				return basicSetResRefName(null, msgs);
			case Webapp24Package.RESOURCE_REF_TYPE__RES_TYPE:
				return basicSetResType(null, msgs);
			case Webapp24Package.RESOURCE_REF_TYPE__RES_AUTH:
				return basicSetResAuth(null, msgs);
			case Webapp24Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE:
				return basicSetResSharingScope(null, msgs);
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
			case Webapp24Package.RESOURCE_REF_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp24Package.RESOURCE_REF_TYPE__RES_REF_NAME:
				return getResRefName();
			case Webapp24Package.RESOURCE_REF_TYPE__RES_TYPE:
				return getResType();
			case Webapp24Package.RESOURCE_REF_TYPE__RES_AUTH:
				return getResAuth();
			case Webapp24Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE:
				return getResSharingScope();
			case Webapp24Package.RESOURCE_REF_TYPE__ID:
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
			case Webapp24Package.RESOURCE_REF_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case Webapp24Package.RESOURCE_REF_TYPE__RES_REF_NAME:
				setResRefName((JndiNameType)newValue);
				return;
			case Webapp24Package.RESOURCE_REF_TYPE__RES_TYPE:
				setResType((FullyQualifiedClassType)newValue);
				return;
			case Webapp24Package.RESOURCE_REF_TYPE__RES_AUTH:
				setResAuth((ResAuthType)newValue);
				return;
			case Webapp24Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE:
				setResSharingScope((ResSharingScopeType)newValue);
				return;
			case Webapp24Package.RESOURCE_REF_TYPE__ID:
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
			case Webapp24Package.RESOURCE_REF_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case Webapp24Package.RESOURCE_REF_TYPE__RES_REF_NAME:
				setResRefName((JndiNameType)null);
				return;
			case Webapp24Package.RESOURCE_REF_TYPE__RES_TYPE:
				setResType((FullyQualifiedClassType)null);
				return;
			case Webapp24Package.RESOURCE_REF_TYPE__RES_AUTH:
				setResAuth((ResAuthType)null);
				return;
			case Webapp24Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE:
				setResSharingScope((ResSharingScopeType)null);
				return;
			case Webapp24Package.RESOURCE_REF_TYPE__ID:
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
			case Webapp24Package.RESOURCE_REF_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case Webapp24Package.RESOURCE_REF_TYPE__RES_REF_NAME:
				return resRefName != null;
			case Webapp24Package.RESOURCE_REF_TYPE__RES_TYPE:
				return resType != null;
			case Webapp24Package.RESOURCE_REF_TYPE__RES_AUTH:
				return resAuth != null;
			case Webapp24Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE:
				return resSharingScope != null;
			case Webapp24Package.RESOURCE_REF_TYPE__ID:
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

} //ResourceRefTypeImpl
