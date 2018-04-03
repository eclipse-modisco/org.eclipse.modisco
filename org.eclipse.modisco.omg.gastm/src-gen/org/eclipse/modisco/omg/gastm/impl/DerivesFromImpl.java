/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.omg.gastm.AccessKind;
import org.eclipse.modisco.omg.gastm.DerivesFrom;
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.NamedTypeReference;
import org.eclipse.modisco.omg.gastm.VirtualSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derives From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.DerivesFromImpl#getVirtualSpecifier <em>Virtual Specifier</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.DerivesFromImpl#getAccessKind <em>Access Kind</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.DerivesFromImpl#getClassName <em>Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DerivesFromImpl extends MinorSyntaxObjectImpl implements DerivesFrom {
	/**
	 * The cached value of the '{@link #getVirtualSpecifier() <em>Virtual Specifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSpecifier()
	 * @generated
	 * @ordered
	 */
	protected VirtualSpecification virtualSpecifier;

	/**
	 * The cached value of the '{@link #getAccessKind() <em>Access Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessKind()
	 * @generated
	 * @ordered
	 */
	protected AccessKind accessKind;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected NamedTypeReference className;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivesFromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getDerivesFrom();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSpecification getVirtualSpecifier() {
		return virtualSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVirtualSpecifier(VirtualSpecification newVirtualSpecifier, NotificationChain msgs) {
		VirtualSpecification oldVirtualSpecifier = virtualSpecifier;
		virtualSpecifier = newVirtualSpecifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.DERIVES_FROM__VIRTUAL_SPECIFIER, oldVirtualSpecifier, newVirtualSpecifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualSpecifier(VirtualSpecification newVirtualSpecifier) {
		if (newVirtualSpecifier != virtualSpecifier) {
			NotificationChain msgs = null;
			if (virtualSpecifier != null)
				msgs = ((InternalEObject)virtualSpecifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DERIVES_FROM__VIRTUAL_SPECIFIER, null, msgs);
			if (newVirtualSpecifier != null)
				msgs = ((InternalEObject)newVirtualSpecifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DERIVES_FROM__VIRTUAL_SPECIFIER, null, msgs);
			msgs = basicSetVirtualSpecifier(newVirtualSpecifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.DERIVES_FROM__VIRTUAL_SPECIFIER, newVirtualSpecifier, newVirtualSpecifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessKind getAccessKind() {
		return accessKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessKind(AccessKind newAccessKind, NotificationChain msgs) {
		AccessKind oldAccessKind = accessKind;
		accessKind = newAccessKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.DERIVES_FROM__ACCESS_KIND, oldAccessKind, newAccessKind);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessKind(AccessKind newAccessKind) {
		if (newAccessKind != accessKind) {
			NotificationChain msgs = null;
			if (accessKind != null)
				msgs = ((InternalEObject)accessKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DERIVES_FROM__ACCESS_KIND, null, msgs);
			if (newAccessKind != null)
				msgs = ((InternalEObject)newAccessKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DERIVES_FROM__ACCESS_KIND, null, msgs);
			msgs = basicSetAccessKind(newAccessKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.DERIVES_FROM__ACCESS_KIND, newAccessKind, newAccessKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedTypeReference getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassName(NamedTypeReference newClassName, NotificationChain msgs) {
		NamedTypeReference oldClassName = className;
		className = newClassName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.DERIVES_FROM__CLASS_NAME, oldClassName, newClassName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(NamedTypeReference newClassName) {
		if (newClassName != className) {
			NotificationChain msgs = null;
			if (className != null)
				msgs = ((InternalEObject)className).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DERIVES_FROM__CLASS_NAME, null, msgs);
			if (newClassName != null)
				msgs = ((InternalEObject)newClassName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DERIVES_FROM__CLASS_NAME, null, msgs);
			msgs = basicSetClassName(newClassName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.DERIVES_FROM__CLASS_NAME, newClassName, newClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.DERIVES_FROM__VIRTUAL_SPECIFIER:
				return basicSetVirtualSpecifier(null, msgs);
			case GASTMPackage.DERIVES_FROM__ACCESS_KIND:
				return basicSetAccessKind(null, msgs);
			case GASTMPackage.DERIVES_FROM__CLASS_NAME:
				return basicSetClassName(null, msgs);
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
			case GASTMPackage.DERIVES_FROM__VIRTUAL_SPECIFIER:
				return getVirtualSpecifier();
			case GASTMPackage.DERIVES_FROM__ACCESS_KIND:
				return getAccessKind();
			case GASTMPackage.DERIVES_FROM__CLASS_NAME:
				return getClassName();
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
			case GASTMPackage.DERIVES_FROM__VIRTUAL_SPECIFIER:
				setVirtualSpecifier((VirtualSpecification)newValue);
				return;
			case GASTMPackage.DERIVES_FROM__ACCESS_KIND:
				setAccessKind((AccessKind)newValue);
				return;
			case GASTMPackage.DERIVES_FROM__CLASS_NAME:
				setClassName((NamedTypeReference)newValue);
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
			case GASTMPackage.DERIVES_FROM__VIRTUAL_SPECIFIER:
				setVirtualSpecifier((VirtualSpecification)null);
				return;
			case GASTMPackage.DERIVES_FROM__ACCESS_KIND:
				setAccessKind((AccessKind)null);
				return;
			case GASTMPackage.DERIVES_FROM__CLASS_NAME:
				setClassName((NamedTypeReference)null);
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
			case GASTMPackage.DERIVES_FROM__VIRTUAL_SPECIFIER:
				return virtualSpecifier != null;
			case GASTMPackage.DERIVES_FROM__ACCESS_KIND:
				return accessKind != null;
			case GASTMPackage.DERIVES_FROM__CLASS_NAME:
				return className != null;
		}
		return super.eIsSet(featureID);
	}

} //DerivesFromImpl
