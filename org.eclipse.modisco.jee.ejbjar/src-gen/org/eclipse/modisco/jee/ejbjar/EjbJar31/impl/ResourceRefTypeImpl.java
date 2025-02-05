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

import org.eclipse.modisco.jee.ejbjar.EjbJar31.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.FullyQualifiedClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.InjectionTargetType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.JndiNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResAuthType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResSharingScopeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.ResourceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.XsdStringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.ResourceRefTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.ResourceRefTypeImpl#getResRefName <em>Res Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.ResourceRefTypeImpl#getResType <em>Res Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.ResourceRefTypeImpl#getResAuth <em>Res Auth</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.ResourceRefTypeImpl#getResSharingScope <em>Res Sharing Scope</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.ResourceRefTypeImpl#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.ResourceRefTypeImpl#getInjectionTarget <em>Injection Target</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.ResourceRefTypeImpl#getLookupName <em>Lookup Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.ResourceRefTypeImpl#getId <em>Id</em>}</li>
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
		return EjbJar31Package.eINSTANCE.getResourceRefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, EjbJar31Package.RESOURCE_REF_TYPE__DESCRIPTION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.RESOURCE_REF_TYPE__RES_REF_NAME, oldResRefName, newResRefName);
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
				msgs = ((InternalEObject)resRefName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.RESOURCE_REF_TYPE__RES_REF_NAME, null, msgs);
			if (newResRefName != null)
				msgs = ((InternalEObject)newResRefName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.RESOURCE_REF_TYPE__RES_REF_NAME, null, msgs);
			msgs = basicSetResRefName(newResRefName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.RESOURCE_REF_TYPE__RES_REF_NAME, newResRefName, newResRefName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.RESOURCE_REF_TYPE__RES_TYPE, oldResType, newResType);
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
				msgs = ((InternalEObject)resType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.RESOURCE_REF_TYPE__RES_TYPE, null, msgs);
			if (newResType != null)
				msgs = ((InternalEObject)newResType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.RESOURCE_REF_TYPE__RES_TYPE, null, msgs);
			msgs = basicSetResType(newResType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.RESOURCE_REF_TYPE__RES_TYPE, newResType, newResType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.RESOURCE_REF_TYPE__RES_AUTH, oldResAuth, newResAuth);
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
				msgs = ((InternalEObject)resAuth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.RESOURCE_REF_TYPE__RES_AUTH, null, msgs);
			if (newResAuth != null)
				msgs = ((InternalEObject)newResAuth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.RESOURCE_REF_TYPE__RES_AUTH, null, msgs);
			msgs = basicSetResAuth(newResAuth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.RESOURCE_REF_TYPE__RES_AUTH, newResAuth, newResAuth));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE, oldResSharingScope, newResSharingScope);
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
				msgs = ((InternalEObject)resSharingScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE, null, msgs);
			if (newResSharingScope != null)
				msgs = ((InternalEObject)newResSharingScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE, null, msgs);
			msgs = basicSetResSharingScope(newResSharingScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE, newResSharingScope, newResSharingScope));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.RESOURCE_REF_TYPE__MAPPED_NAME, oldMappedName, newMappedName);
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
				msgs = ((InternalEObject)mappedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.RESOURCE_REF_TYPE__MAPPED_NAME, null, msgs);
			if (newMappedName != null)
				msgs = ((InternalEObject)newMappedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.RESOURCE_REF_TYPE__MAPPED_NAME, null, msgs);
			msgs = basicSetMappedName(newMappedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.RESOURCE_REF_TYPE__MAPPED_NAME, newMappedName, newMappedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InjectionTargetType> getInjectionTarget() {
		if (injectionTarget == null) {
			injectionTarget = new EObjectContainmentEList<InjectionTargetType>(InjectionTargetType.class, this, EjbJar31Package.RESOURCE_REF_TYPE__INJECTION_TARGET);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.RESOURCE_REF_TYPE__LOOKUP_NAME, oldLookupName, newLookupName);
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
				msgs = ((InternalEObject)lookupName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.RESOURCE_REF_TYPE__LOOKUP_NAME, null, msgs);
			if (newLookupName != null)
				msgs = ((InternalEObject)newLookupName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.RESOURCE_REF_TYPE__LOOKUP_NAME, null, msgs);
			msgs = basicSetLookupName(newLookupName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.RESOURCE_REF_TYPE__LOOKUP_NAME, newLookupName, newLookupName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.RESOURCE_REF_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar31Package.RESOURCE_REF_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_REF_NAME:
				return basicSetResRefName(null, msgs);
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_TYPE:
				return basicSetResType(null, msgs);
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_AUTH:
				return basicSetResAuth(null, msgs);
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE:
				return basicSetResSharingScope(null, msgs);
			case EjbJar31Package.RESOURCE_REF_TYPE__MAPPED_NAME:
				return basicSetMappedName(null, msgs);
			case EjbJar31Package.RESOURCE_REF_TYPE__INJECTION_TARGET:
				return ((InternalEList<?>)getInjectionTarget()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.RESOURCE_REF_TYPE__LOOKUP_NAME:
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
			case EjbJar31Package.RESOURCE_REF_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_REF_NAME:
				return getResRefName();
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_TYPE:
				return getResType();
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_AUTH:
				return getResAuth();
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE:
				return getResSharingScope();
			case EjbJar31Package.RESOURCE_REF_TYPE__MAPPED_NAME:
				return getMappedName();
			case EjbJar31Package.RESOURCE_REF_TYPE__INJECTION_TARGET:
				return getInjectionTarget();
			case EjbJar31Package.RESOURCE_REF_TYPE__LOOKUP_NAME:
				return getLookupName();
			case EjbJar31Package.RESOURCE_REF_TYPE__ID:
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
			case EjbJar31Package.RESOURCE_REF_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_REF_NAME:
				setResRefName((JndiNameType)newValue);
				return;
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_TYPE:
				setResType((FullyQualifiedClassType)newValue);
				return;
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_AUTH:
				setResAuth((ResAuthType)newValue);
				return;
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE:
				setResSharingScope((ResSharingScopeType)newValue);
				return;
			case EjbJar31Package.RESOURCE_REF_TYPE__MAPPED_NAME:
				setMappedName((XsdStringType)newValue);
				return;
			case EjbJar31Package.RESOURCE_REF_TYPE__INJECTION_TARGET:
				getInjectionTarget().clear();
				getInjectionTarget().addAll((Collection<? extends InjectionTargetType>)newValue);
				return;
			case EjbJar31Package.RESOURCE_REF_TYPE__LOOKUP_NAME:
				setLookupName((XsdStringType)newValue);
				return;
			case EjbJar31Package.RESOURCE_REF_TYPE__ID:
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
			case EjbJar31Package.RESOURCE_REF_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_REF_NAME:
				setResRefName((JndiNameType)null);
				return;
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_TYPE:
				setResType((FullyQualifiedClassType)null);
				return;
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_AUTH:
				setResAuth((ResAuthType)null);
				return;
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE:
				setResSharingScope((ResSharingScopeType)null);
				return;
			case EjbJar31Package.RESOURCE_REF_TYPE__MAPPED_NAME:
				setMappedName((XsdStringType)null);
				return;
			case EjbJar31Package.RESOURCE_REF_TYPE__INJECTION_TARGET:
				getInjectionTarget().clear();
				return;
			case EjbJar31Package.RESOURCE_REF_TYPE__LOOKUP_NAME:
				setLookupName((XsdStringType)null);
				return;
			case EjbJar31Package.RESOURCE_REF_TYPE__ID:
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
			case EjbJar31Package.RESOURCE_REF_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_REF_NAME:
				return resRefName != null;
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_TYPE:
				return resType != null;
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_AUTH:
				return resAuth != null;
			case EjbJar31Package.RESOURCE_REF_TYPE__RES_SHARING_SCOPE:
				return resSharingScope != null;
			case EjbJar31Package.RESOURCE_REF_TYPE__MAPPED_NAME:
				return mappedName != null;
			case EjbJar31Package.RESOURCE_REF_TYPE__INJECTION_TARGET:
				return injectionTarget != null && !injectionTarget.isEmpty();
			case EjbJar31Package.RESOURCE_REF_TYPE__LOOKUP_NAME:
				return lookupName != null;
			case EjbJar31Package.RESOURCE_REF_TYPE__ID:
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
