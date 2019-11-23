/**
 * Copyright (c) 2010, 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - metamodel design and initial implementation
 *     Grégoire Dupé (Mia-Software) - Bug 480183 - The manifest.mf discoverer should manage 'Export-Package' 
 */
package org.eclipse.modisco.manifest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.modisco.manifest.Bundle;
import org.eclipse.modisco.manifest.ExportedPackage;
import org.eclipse.modisco.manifest.ManifestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exported Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.manifest.impl.ExportedPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.impl.ExportedPackageImpl#getXFriends <em>XFriends</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.impl.ExportedPackageImpl#isXInternal <em>XInternal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExportedPackageImpl extends EObjectImpl implements ExportedPackage {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXFriends() <em>XFriends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXFriends()
	 * @generated
	 * @ordered
	 */
	protected EList<Bundle> xFriends;

	/**
	 * The default value of the '{@link #isXInternal() <em>XInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXInternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean XINTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isXInternal() <em>XInternal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isXInternal()
	 * @generated
	 * @ordered
	 */
	protected boolean xInternal = XINTERNAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportedPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.EXPORTED_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.EXPORTED_PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bundle> getXFriends() {
		if (xFriends == null) {
			xFriends = new EObjectResolvingEList<Bundle>(Bundle.class, this, ManifestPackage.EXPORTED_PACKAGE__XFRIENDS);
		}
		return xFriends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isXInternal() {
		return xInternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXInternal(boolean newXInternal) {
		boolean oldXInternal = xInternal;
		xInternal = newXInternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.EXPORTED_PACKAGE__XINTERNAL, oldXInternal, xInternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManifestPackage.EXPORTED_PACKAGE__NAME:
				return getName();
			case ManifestPackage.EXPORTED_PACKAGE__XFRIENDS:
				return getXFriends();
			case ManifestPackage.EXPORTED_PACKAGE__XINTERNAL:
				return isXInternal();
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
			case ManifestPackage.EXPORTED_PACKAGE__NAME:
				setName((String)newValue);
				return;
			case ManifestPackage.EXPORTED_PACKAGE__XFRIENDS:
				getXFriends().clear();
				getXFriends().addAll((Collection<? extends Bundle>)newValue);
				return;
			case ManifestPackage.EXPORTED_PACKAGE__XINTERNAL:
				setXInternal((Boolean)newValue);
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
			case ManifestPackage.EXPORTED_PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ManifestPackage.EXPORTED_PACKAGE__XFRIENDS:
				getXFriends().clear();
				return;
			case ManifestPackage.EXPORTED_PACKAGE__XINTERNAL:
				setXInternal(XINTERNAL_EDEFAULT);
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
			case ManifestPackage.EXPORTED_PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ManifestPackage.EXPORTED_PACKAGE__XFRIENDS:
				return xFriends != null && !xFriends.isEmpty();
			case ManifestPackage.EXPORTED_PACKAGE__XINTERNAL:
				return xInternal != XINTERNAL_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", xInternal: ");
		result.append(xInternal);
		result.append(')');
		return result.toString();
	}

} //ExportedPackageImpl
