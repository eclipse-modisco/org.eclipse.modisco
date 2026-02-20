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
package org.eclipse.modisco.jee.webapp.webapp30.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.webapp.webapp30.MultipartConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multipart Config Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.MultipartConfigTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.MultipartConfigTypeImpl#getMaxFileSize <em>Max File Size</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.MultipartConfigTypeImpl#getMaxRequestSize <em>Max Request Size</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.MultipartConfigTypeImpl#getFileSizeThreshold <em>File Size Threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultipartConfigTypeImpl extends EObjectImpl implements MultipartConfigType {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.webapp.webapp30.String location;

	/**
	 * The default value of the '{@link #getMaxFileSize() <em>Max File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFileSize()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_FILE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxFileSize() <em>Max File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFileSize()
	 * @generated
	 * @ordered
	 */
	protected long maxFileSize = MAX_FILE_SIZE_EDEFAULT;

	/**
	 * This is true if the Max File Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxFileSizeESet;

	/**
	 * The default value of the '{@link #getMaxRequestSize() <em>Max Request Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRequestSize()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_REQUEST_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxRequestSize() <em>Max Request Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRequestSize()
	 * @generated
	 * @ordered
	 */
	protected long maxRequestSize = MAX_REQUEST_SIZE_EDEFAULT;

	/**
	 * This is true if the Max Request Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxRequestSizeESet;

	/**
	 * The default value of the '{@link #getFileSizeThreshold() <em>File Size Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSizeThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FILE_SIZE_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileSizeThreshold() <em>File Size Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSizeThreshold()
	 * @generated
	 * @ordered
	 */
	protected BigInteger fileSizeThreshold = FILE_SIZE_THRESHOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipartConfigTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp30Package.eINSTANCE.getMultipartConfigType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.webapp.webapp30.String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(org.eclipse.modisco.jee.webapp.webapp30.String newLocation, NotificationChain msgs) {
		org.eclipse.modisco.jee.webapp.webapp30.String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.MULTIPART_CONFIG_TYPE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(org.eclipse.modisco.jee.webapp.webapp30.String newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.MULTIPART_CONFIG_TYPE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.MULTIPART_CONFIG_TYPE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.MULTIPART_CONFIG_TYPE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxFileSize() {
		return maxFileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxFileSize(long newMaxFileSize) {
		long oldMaxFileSize = maxFileSize;
		maxFileSize = newMaxFileSize;
		boolean oldMaxFileSizeESet = maxFileSizeESet;
		maxFileSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.MULTIPART_CONFIG_TYPE__MAX_FILE_SIZE, oldMaxFileSize, maxFileSize, !oldMaxFileSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxFileSize() {
		long oldMaxFileSize = maxFileSize;
		boolean oldMaxFileSizeESet = maxFileSizeESet;
		maxFileSize = MAX_FILE_SIZE_EDEFAULT;
		maxFileSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Webapp30Package.MULTIPART_CONFIG_TYPE__MAX_FILE_SIZE, oldMaxFileSize, MAX_FILE_SIZE_EDEFAULT, oldMaxFileSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxFileSize() {
		return maxFileSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxRequestSize() {
		return maxRequestSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRequestSize(long newMaxRequestSize) {
		long oldMaxRequestSize = maxRequestSize;
		maxRequestSize = newMaxRequestSize;
		boolean oldMaxRequestSizeESet = maxRequestSizeESet;
		maxRequestSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.MULTIPART_CONFIG_TYPE__MAX_REQUEST_SIZE, oldMaxRequestSize, maxRequestSize, !oldMaxRequestSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxRequestSize() {
		long oldMaxRequestSize = maxRequestSize;
		boolean oldMaxRequestSizeESet = maxRequestSizeESet;
		maxRequestSize = MAX_REQUEST_SIZE_EDEFAULT;
		maxRequestSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Webapp30Package.MULTIPART_CONFIG_TYPE__MAX_REQUEST_SIZE, oldMaxRequestSize, MAX_REQUEST_SIZE_EDEFAULT, oldMaxRequestSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxRequestSize() {
		return maxRequestSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFileSizeThreshold() {
		return fileSizeThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileSizeThreshold(BigInteger newFileSizeThreshold) {
		BigInteger oldFileSizeThreshold = fileSizeThreshold;
		fileSizeThreshold = newFileSizeThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.MULTIPART_CONFIG_TYPE__FILE_SIZE_THRESHOLD, oldFileSizeThreshold, fileSizeThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp30Package.MULTIPART_CONFIG_TYPE__LOCATION:
				return basicSetLocation(null, msgs);
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
			case Webapp30Package.MULTIPART_CONFIG_TYPE__LOCATION:
				return getLocation();
			case Webapp30Package.MULTIPART_CONFIG_TYPE__MAX_FILE_SIZE:
				return getMaxFileSize();
			case Webapp30Package.MULTIPART_CONFIG_TYPE__MAX_REQUEST_SIZE:
				return getMaxRequestSize();
			case Webapp30Package.MULTIPART_CONFIG_TYPE__FILE_SIZE_THRESHOLD:
				return getFileSizeThreshold();
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
			case Webapp30Package.MULTIPART_CONFIG_TYPE__LOCATION:
				setLocation((org.eclipse.modisco.jee.webapp.webapp30.String)newValue);
				return;
			case Webapp30Package.MULTIPART_CONFIG_TYPE__MAX_FILE_SIZE:
				setMaxFileSize((Long)newValue);
				return;
			case Webapp30Package.MULTIPART_CONFIG_TYPE__MAX_REQUEST_SIZE:
				setMaxRequestSize((Long)newValue);
				return;
			case Webapp30Package.MULTIPART_CONFIG_TYPE__FILE_SIZE_THRESHOLD:
				setFileSizeThreshold((BigInteger)newValue);
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
			case Webapp30Package.MULTIPART_CONFIG_TYPE__LOCATION:
				setLocation((org.eclipse.modisco.jee.webapp.webapp30.String)null);
				return;
			case Webapp30Package.MULTIPART_CONFIG_TYPE__MAX_FILE_SIZE:
				unsetMaxFileSize();
				return;
			case Webapp30Package.MULTIPART_CONFIG_TYPE__MAX_REQUEST_SIZE:
				unsetMaxRequestSize();
				return;
			case Webapp30Package.MULTIPART_CONFIG_TYPE__FILE_SIZE_THRESHOLD:
				setFileSizeThreshold(FILE_SIZE_THRESHOLD_EDEFAULT);
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
			case Webapp30Package.MULTIPART_CONFIG_TYPE__LOCATION:
				return location != null;
			case Webapp30Package.MULTIPART_CONFIG_TYPE__MAX_FILE_SIZE:
				return isSetMaxFileSize();
			case Webapp30Package.MULTIPART_CONFIG_TYPE__MAX_REQUEST_SIZE:
				return isSetMaxRequestSize();
			case Webapp30Package.MULTIPART_CONFIG_TYPE__FILE_SIZE_THRESHOLD:
				return FILE_SIZE_THRESHOLD_EDEFAULT == null ? fileSizeThreshold != null : !FILE_SIZE_THRESHOLD_EDEFAULT.equals(fileSizeThreshold);
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
		result.append(" (maxFileSize: "); //$NON-NLS-1$
		if (maxFileSizeESet) result.append(maxFileSize); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", maxRequestSize: "); //$NON-NLS-1$
		if (maxRequestSizeESet) result.append(maxRequestSize); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", fileSizeThreshold: "); //$NON-NLS-1$
		result.append(fileSizeThreshold);
		result.append(')');
		return result.toString();
	}

} //MultipartConfigTypeImpl
