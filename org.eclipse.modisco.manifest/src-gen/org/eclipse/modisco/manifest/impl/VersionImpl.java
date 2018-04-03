/**
 * Copyright (c) 2010, 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - metamodel design and initial implementation
 *     Grégoire Dupé (Mia-Software) - Bug 480183 - The manifest.mf discoverer should manage 'Export-Package' 
 */
package org.eclipse.modisco.manifest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.manifest.ManifestPackage;
import org.eclipse.modisco.manifest.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.manifest.impl.VersionImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.impl.VersionImpl#isMinimumIsInclusive <em>Minimum Is Inclusive</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.impl.VersionImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link org.eclipse.modisco.manifest.impl.VersionImpl#isMaximumIsInclusive <em>Maximum Is Inclusive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionImpl extends EObjectImpl implements Version {
	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected String minimum = MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #isMinimumIsInclusive() <em>Minimum Is Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinimumIsInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MINIMUM_IS_INCLUSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMinimumIsInclusive() <em>Minimum Is Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinimumIsInclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean minimumIsInclusive = MINIMUM_IS_INCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected String maximum = MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #isMaximumIsInclusive() <em>Maximum Is Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaximumIsInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAXIMUM_IS_INCLUSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaximumIsInclusive() <em>Maximum Is Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaximumIsInclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean maximumIsInclusive = MAXIMUM_IS_INCLUSIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManifestPackage.Literals.VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(String newMinimum) {
		String oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.VERSION__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMinimumIsInclusive() {
		return minimumIsInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumIsInclusive(boolean newMinimumIsInclusive) {
		boolean oldMinimumIsInclusive = minimumIsInclusive;
		minimumIsInclusive = newMinimumIsInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.VERSION__MINIMUM_IS_INCLUSIVE, oldMinimumIsInclusive, minimumIsInclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(String newMaximum) {
		String oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.VERSION__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaximumIsInclusive() {
		return maximumIsInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumIsInclusive(boolean newMaximumIsInclusive) {
		boolean oldMaximumIsInclusive = maximumIsInclusive;
		maximumIsInclusive = newMaximumIsInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.VERSION__MAXIMUM_IS_INCLUSIVE, oldMaximumIsInclusive, maximumIsInclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManifestPackage.VERSION__MINIMUM:
				return getMinimum();
			case ManifestPackage.VERSION__MINIMUM_IS_INCLUSIVE:
				return isMinimumIsInclusive();
			case ManifestPackage.VERSION__MAXIMUM:
				return getMaximum();
			case ManifestPackage.VERSION__MAXIMUM_IS_INCLUSIVE:
				return isMaximumIsInclusive();
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
			case ManifestPackage.VERSION__MINIMUM:
				setMinimum((String)newValue);
				return;
			case ManifestPackage.VERSION__MINIMUM_IS_INCLUSIVE:
				setMinimumIsInclusive((Boolean)newValue);
				return;
			case ManifestPackage.VERSION__MAXIMUM:
				setMaximum((String)newValue);
				return;
			case ManifestPackage.VERSION__MAXIMUM_IS_INCLUSIVE:
				setMaximumIsInclusive((Boolean)newValue);
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
			case ManifestPackage.VERSION__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case ManifestPackage.VERSION__MINIMUM_IS_INCLUSIVE:
				setMinimumIsInclusive(MINIMUM_IS_INCLUSIVE_EDEFAULT);
				return;
			case ManifestPackage.VERSION__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case ManifestPackage.VERSION__MAXIMUM_IS_INCLUSIVE:
				setMaximumIsInclusive(MAXIMUM_IS_INCLUSIVE_EDEFAULT);
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
			case ManifestPackage.VERSION__MINIMUM:
				return MINIMUM_EDEFAULT == null ? minimum != null : !MINIMUM_EDEFAULT.equals(minimum);
			case ManifestPackage.VERSION__MINIMUM_IS_INCLUSIVE:
				return minimumIsInclusive != MINIMUM_IS_INCLUSIVE_EDEFAULT;
			case ManifestPackage.VERSION__MAXIMUM:
				return MAXIMUM_EDEFAULT == null ? maximum != null : !MAXIMUM_EDEFAULT.equals(maximum);
			case ManifestPackage.VERSION__MAXIMUM_IS_INCLUSIVE:
				return maximumIsInclusive != MAXIMUM_IS_INCLUSIVE_EDEFAULT;
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
		result.append(" (minimum: ");
		result.append(minimum);
		result.append(", minimumIsInclusive: ");
		result.append(minimumIsInclusive);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", maximumIsInclusive: ");
		result.append(maximumIsInclusive);
		result.append(')');
		return result.toString();
	}

} //VersionImpl
