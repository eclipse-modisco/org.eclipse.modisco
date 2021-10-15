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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.omg.smm.DimensionalMeasurement;
import org.eclipse.modisco.omg.smm.Grade;
import org.eclipse.modisco.omg.smm.RankingMeasurementRelationship;
import org.eclipse.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.GradeImpl#getBaseMeasurement <em>Base Measurement</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.GradeImpl#isIsBaseSupplied <em>Is Base Supplied</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.GradeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.GradeImpl#getRankingTo <em>Ranking To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GradeImpl extends MeasurementImpl implements Grade {
	/**
	 * The cached value of the '{@link #getBaseMeasurement() <em>Base Measurement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasurement()
	 * @generated
	 * @ordered
	 */
	protected DimensionalMeasurement baseMeasurement;

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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRankingTo() <em>Ranking To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRankingTo()
	 * @generated
	 * @ordered
	 */
	protected RankingMeasurementRelationship rankingTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.GRADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionalMeasurement getBaseMeasurement() {
		if (baseMeasurement != null && baseMeasurement.eIsProxy()) {
			InternalEObject oldBaseMeasurement = (InternalEObject)baseMeasurement;
			baseMeasurement = (DimensionalMeasurement)eResolveProxy(oldBaseMeasurement);
			if (baseMeasurement != oldBaseMeasurement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.GRADE__BASE_MEASUREMENT, oldBaseMeasurement, baseMeasurement));
			}
		}
		return baseMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionalMeasurement basicGetBaseMeasurement() {
		return baseMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseMeasurement(DimensionalMeasurement newBaseMeasurement) {
		DimensionalMeasurement oldBaseMeasurement = baseMeasurement;
		baseMeasurement = newBaseMeasurement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.GRADE__BASE_MEASUREMENT, oldBaseMeasurement, baseMeasurement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.GRADE__IS_BASE_SUPPLIED, oldIsBaseSupplied, isBaseSupplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.GRADE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RankingMeasurementRelationship getRankingTo() {
		if (rankingTo != null && rankingTo.eIsProxy()) {
			InternalEObject oldRankingTo = (InternalEObject)rankingTo;
			rankingTo = (RankingMeasurementRelationship)eResolveProxy(oldRankingTo);
			if (rankingTo != oldRankingTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.GRADE__RANKING_TO, oldRankingTo, rankingTo));
			}
		}
		return rankingTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RankingMeasurementRelationship basicGetRankingTo() {
		return rankingTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRankingTo(RankingMeasurementRelationship newRankingTo, NotificationChain msgs) {
		RankingMeasurementRelationship oldRankingTo = rankingTo;
		rankingTo = newRankingTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmmPackage.GRADE__RANKING_TO, oldRankingTo, newRankingTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRankingTo(RankingMeasurementRelationship newRankingTo) {
		if (newRankingTo != rankingTo) {
			NotificationChain msgs = null;
			if (rankingTo != null)
				msgs = ((InternalEObject)rankingTo).eInverseRemove(this, SmmPackage.RANKING_MEASUREMENT_RELATIONSHIP__FROM, RankingMeasurementRelationship.class, msgs);
			if (newRankingTo != null)
				msgs = ((InternalEObject)newRankingTo).eInverseAdd(this, SmmPackage.RANKING_MEASUREMENT_RELATIONSHIP__FROM, RankingMeasurementRelationship.class, msgs);
			msgs = basicSetRankingTo(newRankingTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.GRADE__RANKING_TO, newRankingTo, newRankingTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.GRADE__RANKING_TO:
				if (rankingTo != null)
					msgs = ((InternalEObject)rankingTo).eInverseRemove(this, SmmPackage.RANKING_MEASUREMENT_RELATIONSHIP__FROM, RankingMeasurementRelationship.class, msgs);
				return basicSetRankingTo((RankingMeasurementRelationship)otherEnd, msgs);
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
			case SmmPackage.GRADE__RANKING_TO:
				return basicSetRankingTo(null, msgs);
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
			case SmmPackage.GRADE__BASE_MEASUREMENT:
				if (resolve) return getBaseMeasurement();
				return basicGetBaseMeasurement();
			case SmmPackage.GRADE__IS_BASE_SUPPLIED:
				return isIsBaseSupplied();
			case SmmPackage.GRADE__VALUE:
				return getValue();
			case SmmPackage.GRADE__RANKING_TO:
				if (resolve) return getRankingTo();
				return basicGetRankingTo();
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
			case SmmPackage.GRADE__BASE_MEASUREMENT:
				setBaseMeasurement((DimensionalMeasurement)newValue);
				return;
			case SmmPackage.GRADE__IS_BASE_SUPPLIED:
				setIsBaseSupplied((Boolean)newValue);
				return;
			case SmmPackage.GRADE__VALUE:
				setValue((String)newValue);
				return;
			case SmmPackage.GRADE__RANKING_TO:
				setRankingTo((RankingMeasurementRelationship)newValue);
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
			case SmmPackage.GRADE__BASE_MEASUREMENT:
				setBaseMeasurement((DimensionalMeasurement)null);
				return;
			case SmmPackage.GRADE__IS_BASE_SUPPLIED:
				setIsBaseSupplied(IS_BASE_SUPPLIED_EDEFAULT);
				return;
			case SmmPackage.GRADE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SmmPackage.GRADE__RANKING_TO:
				setRankingTo((RankingMeasurementRelationship)null);
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
			case SmmPackage.GRADE__BASE_MEASUREMENT:
				return baseMeasurement != null;
			case SmmPackage.GRADE__IS_BASE_SUPPLIED:
				return isBaseSupplied != IS_BASE_SUPPLIED_EDEFAULT;
			case SmmPackage.GRADE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SmmPackage.GRADE__RANKING_TO:
				return rankingTo != null;
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
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //GradeImpl
