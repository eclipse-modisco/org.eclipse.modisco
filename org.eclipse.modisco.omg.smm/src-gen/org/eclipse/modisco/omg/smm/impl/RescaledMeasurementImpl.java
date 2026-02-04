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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.omg.smm.RescaleMeasurementRelationship;
import org.eclipse.modisco.omg.smm.RescaledMeasurement;
import org.eclipse.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rescaled Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.RescaledMeasurementImpl#isIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.RescaledMeasurementImpl#getRescaleFrom <em>Rescale From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RescaledMeasurementImpl extends DimensionalMeasurementImpl implements RescaledMeasurement {
	/**
	 * The default value of the '{@link #isIsBaseSupplied() <em>Is Base Supplied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBaseSupplied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BASE_SUPPLIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBaseSupplied() <em>Is Base Supplied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBaseSupplied()
	 * @generated
	 * @ordered
	 */
	protected boolean isBaseSupplied = IS_BASE_SUPPLIED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRescaleFrom() <em>Rescale From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRescaleFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<RescaleMeasurementRelationship> rescaleFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RescaledMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.RESCALED_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBaseSupplied() {
		return isBaseSupplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBaseSupplied(boolean newIsBaseSupplied) {
		boolean oldIsBaseSupplied = isBaseSupplied;
		isBaseSupplied = newIsBaseSupplied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.RESCALED_MEASUREMENT__IS_BASE_SUPPLIED, oldIsBaseSupplied, isBaseSupplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RescaleMeasurementRelationship> getRescaleFrom() {
		if (rescaleFrom == null) {
			rescaleFrom = new EObjectWithInverseResolvingEList<RescaleMeasurementRelationship>(RescaleMeasurementRelationship.class, this, SmmPackage.RESCALED_MEASUREMENT__RESCALE_FROM, SmmPackage.RESCALE_MEASUREMENT_RELATIONSHIP__TO);
		}
		return rescaleFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.RESCALED_MEASUREMENT__RESCALE_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRescaleFrom()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.RESCALED_MEASUREMENT__RESCALE_FROM:
				return ((InternalEList<?>)getRescaleFrom()).basicRemove(otherEnd, msgs);
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
			case SmmPackage.RESCALED_MEASUREMENT__IS_BASE_SUPPLIED:
				return isIsBaseSupplied();
			case SmmPackage.RESCALED_MEASUREMENT__RESCALE_FROM:
				return getRescaleFrom();
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
			case SmmPackage.RESCALED_MEASUREMENT__IS_BASE_SUPPLIED:
				setIsBaseSupplied((Boolean)newValue);
				return;
			case SmmPackage.RESCALED_MEASUREMENT__RESCALE_FROM:
				getRescaleFrom().clear();
				getRescaleFrom().addAll((Collection<? extends RescaleMeasurementRelationship>)newValue);
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
			case SmmPackage.RESCALED_MEASUREMENT__IS_BASE_SUPPLIED:
				setIsBaseSupplied(IS_BASE_SUPPLIED_EDEFAULT);
				return;
			case SmmPackage.RESCALED_MEASUREMENT__RESCALE_FROM:
				getRescaleFrom().clear();
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
			case SmmPackage.RESCALED_MEASUREMENT__IS_BASE_SUPPLIED:
				return isBaseSupplied != IS_BASE_SUPPLIED_EDEFAULT;
			case SmmPackage.RESCALED_MEASUREMENT__RESCALE_FROM:
				return rescaleFrom != null && !rescaleFrom.isEmpty();
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
		result.append(" (isBaseSupplied: ");
		result.append(isBaseSupplied);
		result.append(')');
		return result.toString();
	}

} //RescaledMeasurementImpl
