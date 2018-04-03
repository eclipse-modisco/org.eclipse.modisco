/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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

import org.eclipse.modisco.omg.smm.Accumulator;
import org.eclipse.modisco.omg.smm.BaseMeasurementRelationship;
import org.eclipse.modisco.omg.smm.CollectiveMeasurement;
import org.eclipse.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collective Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.CollectiveMeasurementImpl#getAccumulator <em>Accumulator</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.CollectiveMeasurementImpl#isIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.CollectiveMeasurementImpl#getBaseMeasurementTo <em>Base Measurement To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectiveMeasurementImpl extends DimensionalMeasurementImpl implements CollectiveMeasurement {
	/**
	 * The default value of the '{@link #getAccumulator() <em>Accumulator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccumulator()
	 * @generated
	 * @ordered
	 */
	protected static final Accumulator ACCUMULATOR_EDEFAULT = Accumulator.SUM;

	/**
	 * The cached value of the '{@link #getAccumulator() <em>Accumulator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccumulator()
	 * @generated
	 * @ordered
	 */
	protected Accumulator accumulator = ACCUMULATOR_EDEFAULT;

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
	 * The cached value of the '{@link #getBaseMeasurementTo() <em>Base Measurement To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasurementTo()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseMeasurementRelationship> baseMeasurementTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectiveMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.COLLECTIVE_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accumulator getAccumulator() {
		return accumulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccumulator(Accumulator newAccumulator) {
		Accumulator oldAccumulator = accumulator;
		accumulator = newAccumulator == null ? ACCUMULATOR_EDEFAULT : newAccumulator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.COLLECTIVE_MEASUREMENT__ACCUMULATOR, oldAccumulator, accumulator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.COLLECTIVE_MEASUREMENT__IS_BASE_SUPPLIED, oldIsBaseSupplied, isBaseSupplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseMeasurementRelationship> getBaseMeasurementTo() {
		if (baseMeasurementTo == null) {
			baseMeasurementTo = new EObjectWithInverseResolvingEList<BaseMeasurementRelationship>(BaseMeasurementRelationship.class, this, SmmPackage.COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_TO, SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__FROM);
		}
		return baseMeasurementTo;
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
			case SmmPackage.COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBaseMeasurementTo()).basicAdd(otherEnd, msgs);
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
			case SmmPackage.COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_TO:
				return ((InternalEList<?>)getBaseMeasurementTo()).basicRemove(otherEnd, msgs);
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
			case SmmPackage.COLLECTIVE_MEASUREMENT__ACCUMULATOR:
				return getAccumulator();
			case SmmPackage.COLLECTIVE_MEASUREMENT__IS_BASE_SUPPLIED:
				return isIsBaseSupplied();
			case SmmPackage.COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_TO:
				return getBaseMeasurementTo();
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
			case SmmPackage.COLLECTIVE_MEASUREMENT__ACCUMULATOR:
				setAccumulator((Accumulator)newValue);
				return;
			case SmmPackage.COLLECTIVE_MEASUREMENT__IS_BASE_SUPPLIED:
				setIsBaseSupplied((Boolean)newValue);
				return;
			case SmmPackage.COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_TO:
				getBaseMeasurementTo().clear();
				getBaseMeasurementTo().addAll((Collection<? extends BaseMeasurementRelationship>)newValue);
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
			case SmmPackage.COLLECTIVE_MEASUREMENT__ACCUMULATOR:
				setAccumulator(ACCUMULATOR_EDEFAULT);
				return;
			case SmmPackage.COLLECTIVE_MEASUREMENT__IS_BASE_SUPPLIED:
				setIsBaseSupplied(IS_BASE_SUPPLIED_EDEFAULT);
				return;
			case SmmPackage.COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_TO:
				getBaseMeasurementTo().clear();
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
			case SmmPackage.COLLECTIVE_MEASUREMENT__ACCUMULATOR:
				return accumulator != ACCUMULATOR_EDEFAULT;
			case SmmPackage.COLLECTIVE_MEASUREMENT__IS_BASE_SUPPLIED:
				return isBaseSupplied != IS_BASE_SUPPLIED_EDEFAULT;
			case SmmPackage.COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_TO:
				return baseMeasurementTo != null && !baseMeasurementTo.isEmpty();
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
		result.append(" (accumulator: ");
		result.append(accumulator);
		result.append(", isBaseSupplied: ");
		result.append(isBaseSupplied);
		result.append(')');
		return result.toString();
	}

} //CollectiveMeasurementImpl
