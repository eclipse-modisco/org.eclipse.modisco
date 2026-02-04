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

import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.SourceFile;
import org.eclipse.modisco.omg.gastm.SourceFileReference;
import org.eclipse.modisco.omg.gastm.SourceLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source File Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.SourceFileReferenceImpl#getLocationInfo <em>Location Info</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.SourceFileReferenceImpl#getOfSourceFile <em>Of Source File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceFileReferenceImpl extends SourceFileImpl implements SourceFileReference {
	/**
	 * The cached value of the '{@link #getLocationInfo() <em>Location Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationInfo()
	 * @generated
	 * @ordered
	 */
	protected SourceLocation locationInfo;

	/**
	 * The cached value of the '{@link #getOfSourceFile() <em>Of Source File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfSourceFile()
	 * @generated
	 * @ordered
	 */
	protected SourceFile ofSourceFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceFileReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getSourceFileReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceLocation getLocationInfo() {
		return locationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationInfo(SourceLocation newLocationInfo, NotificationChain msgs) {
		SourceLocation oldLocationInfo = locationInfo;
		locationInfo = newLocationInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.SOURCE_FILE_REFERENCE__LOCATION_INFO, oldLocationInfo, newLocationInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationInfo(SourceLocation newLocationInfo) {
		if (newLocationInfo != locationInfo) {
			NotificationChain msgs = null;
			if (locationInfo != null)
				msgs = ((InternalEObject)locationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.SOURCE_FILE_REFERENCE__LOCATION_INFO, null, msgs);
			if (newLocationInfo != null)
				msgs = ((InternalEObject)newLocationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.SOURCE_FILE_REFERENCE__LOCATION_INFO, null, msgs);
			msgs = basicSetLocationInfo(newLocationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.SOURCE_FILE_REFERENCE__LOCATION_INFO, newLocationInfo, newLocationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFile getOfSourceFile() {
		if (ofSourceFile != null && ofSourceFile.eIsProxy()) {
			InternalEObject oldOfSourceFile = (InternalEObject)ofSourceFile;
			ofSourceFile = (SourceFile)eResolveProxy(oldOfSourceFile);
			if (ofSourceFile != oldOfSourceFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GASTMPackage.SOURCE_FILE_REFERENCE__OF_SOURCE_FILE, oldOfSourceFile, ofSourceFile));
			}
		}
		return ofSourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceFile basicGetOfSourceFile() {
		return ofSourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOfSourceFile(SourceFile newOfSourceFile) {
		SourceFile oldOfSourceFile = ofSourceFile;
		ofSourceFile = newOfSourceFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.SOURCE_FILE_REFERENCE__OF_SOURCE_FILE, oldOfSourceFile, ofSourceFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.SOURCE_FILE_REFERENCE__LOCATION_INFO:
				return basicSetLocationInfo(null, msgs);
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
			case GASTMPackage.SOURCE_FILE_REFERENCE__LOCATION_INFO:
				return getLocationInfo();
			case GASTMPackage.SOURCE_FILE_REFERENCE__OF_SOURCE_FILE:
				if (resolve) return getOfSourceFile();
				return basicGetOfSourceFile();
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
			case GASTMPackage.SOURCE_FILE_REFERENCE__LOCATION_INFO:
				setLocationInfo((SourceLocation)newValue);
				return;
			case GASTMPackage.SOURCE_FILE_REFERENCE__OF_SOURCE_FILE:
				setOfSourceFile((SourceFile)newValue);
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
			case GASTMPackage.SOURCE_FILE_REFERENCE__LOCATION_INFO:
				setLocationInfo((SourceLocation)null);
				return;
			case GASTMPackage.SOURCE_FILE_REFERENCE__OF_SOURCE_FILE:
				setOfSourceFile((SourceFile)null);
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
			case GASTMPackage.SOURCE_FILE_REFERENCE__LOCATION_INFO:
				return locationInfo != null;
			case GASTMPackage.SOURCE_FILE_REFERENCE__OF_SOURCE_FILE:
				return ofSourceFile != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceFileReferenceImpl
