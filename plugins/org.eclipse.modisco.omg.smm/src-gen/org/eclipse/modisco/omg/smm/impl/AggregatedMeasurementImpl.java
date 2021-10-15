/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.omg.smm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.modisco.omg.smm.AggregatedMeasurement;
import org.eclipse.modisco.omg.smm.DimensionalMeasurement;
import org.eclipse.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregated Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.AggregatedMeasurementImpl#isIsBaseSuppled <em>Is Base Suppled</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.AggregatedMeasurementImpl#getBaseMeasurement <em>Base Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregatedMeasurementImpl extends DimensionalMeasurementImpl implements AggregatedMeasurement {
	/**
	 * The default value of the '{@link #isIsBaseSuppled() <em>Is Base Suppled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBaseSuppled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BASE_SUPPLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBaseSuppled() <em>Is Base Suppled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBaseSuppled()
	 * @generated
	 * @ordered
	 */
	protected boolean isBaseSuppled = IS_BASE_SUPPLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaseMeasurement() <em>Base Measurement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasurement()
	 * @generated
	 * @ordered
	 */
	protected EList<DimensionalMeasurement> baseMeasurement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregatedMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.AGGREGATED_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBaseSuppled() {
		return isBaseSuppled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBaseSuppled(boolean newIsBaseSuppled) {
		boolean oldIsBaseSuppled = isBaseSuppled;
		isBaseSuppled = newIsBaseSuppled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.AGGREGATED_MEASUREMENT__IS_BASE_SUPPLED, oldIsBaseSuppled, isBaseSuppled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DimensionalMeasurement> getBaseMeasurement() {
		if (baseMeasurement == null) {
			baseMeasurement = new EObjectResolvingEList<DimensionalMeasurement>(DimensionalMeasurement.class, this, SmmPackage.AGGREGATED_MEASUREMENT__BASE_MEASUREMENT);
		}
		return baseMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmmPackage.AGGREGATED_MEASUREMENT__IS_BASE_SUPPLED:
				return isIsBaseSuppled();
			case SmmPackage.AGGREGATED_MEASUREMENT__BASE_MEASUREMENT:
				return getBaseMeasurement();
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
			case SmmPackage.AGGREGATED_MEASUREMENT__IS_BASE_SUPPLED:
				setIsBaseSuppled((Boolean)newValue);
				return;
			case SmmPackage.AGGREGATED_MEASUREMENT__BASE_MEASUREMENT:
				getBaseMeasurement().clear();
				getBaseMeasurement().addAll((Collection<? extends DimensionalMeasurement>)newValue);
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
			case SmmPackage.AGGREGATED_MEASUREMENT__IS_BASE_SUPPLED:
				setIsBaseSuppled(IS_BASE_SUPPLED_EDEFAULT);
				return;
			case SmmPackage.AGGREGATED_MEASUREMENT__BASE_MEASUREMENT:
				getBaseMeasurement().clear();
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
			case SmmPackage.AGGREGATED_MEASUREMENT__IS_BASE_SUPPLED:
				return isBaseSuppled != IS_BASE_SUPPLED_EDEFAULT;
			case SmmPackage.AGGREGATED_MEASUREMENT__BASE_MEASUREMENT:
				return baseMeasurement != null && !baseMeasurement.isEmpty();
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
		result.append(" (isBaseSuppled: ");
		result.append(isBaseSuppled);
		result.append(')');
		return result.toString();
	}

} //AggregatedMeasurementImpl
