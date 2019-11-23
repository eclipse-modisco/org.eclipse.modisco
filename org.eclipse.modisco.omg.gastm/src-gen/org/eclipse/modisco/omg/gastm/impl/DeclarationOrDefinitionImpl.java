/**
 * <copyright>
 * Copyright (c) 2009, 2019 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
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
import org.eclipse.modisco.omg.gastm.DeclarationOrDefinition;
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.StorageSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration Or Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.DeclarationOrDefinitionImpl#getStorageSpecifiers <em>Storage Specifiers</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.DeclarationOrDefinitionImpl#getAccessKind <em>Access Kind</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.DeclarationOrDefinitionImpl#getLinkageSpecifier <em>Linkage Specifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DeclarationOrDefinitionImpl extends DefinitionObjectImpl implements DeclarationOrDefinition {
	/**
	 * The cached value of the '{@link #getStorageSpecifiers() <em>Storage Specifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageSpecifiers()
	 * @generated
	 * @ordered
	 */
	protected StorageSpecification storageSpecifiers;

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
	 * The default value of the '{@link #getLinkageSpecifier() <em>Linkage Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkageSpecifier()
	 * @generated
	 * @ordered
	 */
	protected static final String LINKAGE_SPECIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkageSpecifier() <em>Linkage Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkageSpecifier()
	 * @generated
	 * @ordered
	 */
	protected String linkageSpecifier = LINKAGE_SPECIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationOrDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getDeclarationOrDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageSpecification getStorageSpecifiers() {
		return storageSpecifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStorageSpecifiers(StorageSpecification newStorageSpecifiers, NotificationChain msgs) {
		StorageSpecification oldStorageSpecifiers = storageSpecifiers;
		storageSpecifiers = newStorageSpecifiers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS, oldStorageSpecifiers, newStorageSpecifiers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageSpecifiers(StorageSpecification newStorageSpecifiers) {
		if (newStorageSpecifiers != storageSpecifiers) {
			NotificationChain msgs = null;
			if (storageSpecifiers != null)
				msgs = ((InternalEObject)storageSpecifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS, null, msgs);
			if (newStorageSpecifiers != null)
				msgs = ((InternalEObject)newStorageSpecifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS, null, msgs);
			msgs = basicSetStorageSpecifiers(newStorageSpecifiers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS, newStorageSpecifiers, newStorageSpecifiers));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.DECLARATION_OR_DEFINITION__ACCESS_KIND, oldAccessKind, newAccessKind);
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
				msgs = ((InternalEObject)accessKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DECLARATION_OR_DEFINITION__ACCESS_KIND, null, msgs);
			if (newAccessKind != null)
				msgs = ((InternalEObject)newAccessKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DECLARATION_OR_DEFINITION__ACCESS_KIND, null, msgs);
			msgs = basicSetAccessKind(newAccessKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.DECLARATION_OR_DEFINITION__ACCESS_KIND, newAccessKind, newAccessKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkageSpecifier() {
		return linkageSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkageSpecifier(String newLinkageSpecifier) {
		String oldLinkageSpecifier = linkageSpecifier;
		linkageSpecifier = newLinkageSpecifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.DECLARATION_OR_DEFINITION__LINKAGE_SPECIFIER, oldLinkageSpecifier, linkageSpecifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS:
				return basicSetStorageSpecifiers(null, msgs);
			case GASTMPackage.DECLARATION_OR_DEFINITION__ACCESS_KIND:
				return basicSetAccessKind(null, msgs);
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
			case GASTMPackage.DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS:
				return getStorageSpecifiers();
			case GASTMPackage.DECLARATION_OR_DEFINITION__ACCESS_KIND:
				return getAccessKind();
			case GASTMPackage.DECLARATION_OR_DEFINITION__LINKAGE_SPECIFIER:
				return getLinkageSpecifier();
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
			case GASTMPackage.DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS:
				setStorageSpecifiers((StorageSpecification)newValue);
				return;
			case GASTMPackage.DECLARATION_OR_DEFINITION__ACCESS_KIND:
				setAccessKind((AccessKind)newValue);
				return;
			case GASTMPackage.DECLARATION_OR_DEFINITION__LINKAGE_SPECIFIER:
				setLinkageSpecifier((String)newValue);
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
			case GASTMPackage.DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS:
				setStorageSpecifiers((StorageSpecification)null);
				return;
			case GASTMPackage.DECLARATION_OR_DEFINITION__ACCESS_KIND:
				setAccessKind((AccessKind)null);
				return;
			case GASTMPackage.DECLARATION_OR_DEFINITION__LINKAGE_SPECIFIER:
				setLinkageSpecifier(LINKAGE_SPECIFIER_EDEFAULT);
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
			case GASTMPackage.DECLARATION_OR_DEFINITION__STORAGE_SPECIFIERS:
				return storageSpecifiers != null;
			case GASTMPackage.DECLARATION_OR_DEFINITION__ACCESS_KIND:
				return accessKind != null;
			case GASTMPackage.DECLARATION_OR_DEFINITION__LINKAGE_SPECIFIER:
				return LINKAGE_SPECIFIER_EDEFAULT == null ? linkageSpecifier != null : !LINKAGE_SPECIFIER_EDEFAULT.equals(linkageSpecifier);
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
		result.append(" (linkageSpecifier: "); //$NON-NLS-1$
		result.append(linkageSpecifier);
		result.append(')');
		return result.toString();
	}

} //DeclarationOrDefinitionImpl
