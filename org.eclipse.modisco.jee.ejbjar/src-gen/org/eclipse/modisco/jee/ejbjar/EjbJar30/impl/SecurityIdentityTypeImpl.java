/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v1.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar30.impl;

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

import org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EmptyType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.RunAsType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityIdentityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Identity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.SecurityIdentityTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.SecurityIdentityTypeImpl#getUseCallerIdentity <em>Use Caller Identity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.SecurityIdentityTypeImpl#getRunAs <em>Run As</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.SecurityIdentityTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecurityIdentityTypeImpl extends EObjectImpl implements SecurityIdentityType {
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
	 * The cached value of the '{@link #getUseCallerIdentity() <em>Use Caller Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCallerIdentity()
	 * @generated
	 * @ordered
	 */
	protected EmptyType useCallerIdentity;

	/**
	 * The cached value of the '{@link #getRunAs() <em>Run As</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunAs()
	 * @generated
	 * @ordered
	 */
	protected RunAsType runAs;

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
	protected SecurityIdentityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar30Package.eINSTANCE.getSecurityIdentityType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, EjbJar30Package.SECURITY_IDENTITY_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyType getUseCallerIdentity() {
		return useCallerIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseCallerIdentity(EmptyType newUseCallerIdentity, NotificationChain msgs) {
		EmptyType oldUseCallerIdentity = useCallerIdentity;
		useCallerIdentity = newUseCallerIdentity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.SECURITY_IDENTITY_TYPE__USE_CALLER_IDENTITY, oldUseCallerIdentity, newUseCallerIdentity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCallerIdentity(EmptyType newUseCallerIdentity) {
		if (newUseCallerIdentity != useCallerIdentity) {
			NotificationChain msgs = null;
			if (useCallerIdentity != null)
				msgs = ((InternalEObject)useCallerIdentity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.SECURITY_IDENTITY_TYPE__USE_CALLER_IDENTITY, null, msgs);
			if (newUseCallerIdentity != null)
				msgs = ((InternalEObject)newUseCallerIdentity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.SECURITY_IDENTITY_TYPE__USE_CALLER_IDENTITY, null, msgs);
			msgs = basicSetUseCallerIdentity(newUseCallerIdentity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.SECURITY_IDENTITY_TYPE__USE_CALLER_IDENTITY, newUseCallerIdentity, newUseCallerIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunAsType getRunAs() {
		return runAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunAs(RunAsType newRunAs, NotificationChain msgs) {
		RunAsType oldRunAs = runAs;
		runAs = newRunAs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.SECURITY_IDENTITY_TYPE__RUN_AS, oldRunAs, newRunAs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunAs(RunAsType newRunAs) {
		if (newRunAs != runAs) {
			NotificationChain msgs = null;
			if (runAs != null)
				msgs = ((InternalEObject)runAs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.SECURITY_IDENTITY_TYPE__RUN_AS, null, msgs);
			if (newRunAs != null)
				msgs = ((InternalEObject)newRunAs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.SECURITY_IDENTITY_TYPE__RUN_AS, null, msgs);
			msgs = basicSetRunAs(newRunAs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.SECURITY_IDENTITY_TYPE__RUN_AS, newRunAs, newRunAs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.SECURITY_IDENTITY_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__USE_CALLER_IDENTITY:
				return basicSetUseCallerIdentity(null, msgs);
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__RUN_AS:
				return basicSetRunAs(null, msgs);
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
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__USE_CALLER_IDENTITY:
				return getUseCallerIdentity();
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__RUN_AS:
				return getRunAs();
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__ID:
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
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__USE_CALLER_IDENTITY:
				setUseCallerIdentity((EmptyType)newValue);
				return;
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__RUN_AS:
				setRunAs((RunAsType)newValue);
				return;
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__ID:
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
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__USE_CALLER_IDENTITY:
				setUseCallerIdentity((EmptyType)null);
				return;
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__RUN_AS:
				setRunAs((RunAsType)null);
				return;
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__ID:
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
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__USE_CALLER_IDENTITY:
				return useCallerIdentity != null;
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__RUN_AS:
				return runAs != null;
			case EjbJar30Package.SECURITY_IDENTITY_TYPE__ID:
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

} //SecurityIdentityTypeImpl
