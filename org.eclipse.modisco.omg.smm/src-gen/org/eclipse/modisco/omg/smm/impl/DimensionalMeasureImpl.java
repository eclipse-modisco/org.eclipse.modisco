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

import org.eclipse.modisco.omg.smm.Base1MeasureRelationship;
import org.eclipse.modisco.omg.smm.Base2MeasureRelationship;
import org.eclipse.modisco.omg.smm.BaseMeasureRelationship;
import org.eclipse.modisco.omg.smm.DimensionalMeasure;
import org.eclipse.modisco.omg.smm.RankingMeasureRelationship;
import org.eclipse.modisco.omg.smm.RescaleMeasureRelationship;
import org.eclipse.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimensional Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.DimensionalMeasureImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.DimensionalMeasureImpl#getBaseMeasureFrom <em>Base Measure From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.DimensionalMeasureImpl#getBaseMeasure1From <em>Base Measure1 From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.DimensionalMeasureImpl#getBaseMeasure2From <em>Base Measure2 From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.DimensionalMeasureImpl#getRescaleTo <em>Rescale To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.DimensionalMeasureImpl#getRankingFrom <em>Ranking From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionalMeasureImpl extends MeasureImpl implements DimensionalMeasure {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaseMeasureFrom() <em>Base Measure From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasureFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseMeasureRelationship> baseMeasureFrom;

	/**
	 * The cached value of the '{@link #getBaseMeasure1From() <em>Base Measure1 From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasure1From()
	 * @generated
	 * @ordered
	 */
	protected EList<Base1MeasureRelationship> baseMeasure1From;

	/**
	 * The cached value of the '{@link #getBaseMeasure2From() <em>Base Measure2 From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasure2From()
	 * @generated
	 * @ordered
	 */
	protected EList<Base2MeasureRelationship> baseMeasure2From;

	/**
	 * The cached value of the '{@link #getRescaleTo() <em>Rescale To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRescaleTo()
	 * @generated
	 * @ordered
	 */
	protected RescaleMeasureRelationship rescaleTo;

	/**
	 * The cached value of the '{@link #getRankingFrom() <em>Ranking From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRankingFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<RankingMeasureRelationship> rankingFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionalMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.DIMENSIONAL_MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.DIMENSIONAL_MEASURE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseMeasureRelationship> getBaseMeasureFrom() {
		if (baseMeasureFrom == null) {
			baseMeasureFrom = new EObjectWithInverseResolvingEList<BaseMeasureRelationship>(BaseMeasureRelationship.class, this, SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE_FROM, SmmPackage.BASE_MEASURE_RELATIONSHIP__TO);
		}
		return baseMeasureFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Base1MeasureRelationship> getBaseMeasure1From() {
		if (baseMeasure1From == null) {
			baseMeasure1From = new EObjectWithInverseResolvingEList<Base1MeasureRelationship>(Base1MeasureRelationship.class, this, SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM, SmmPackage.BASE1_MEASURE_RELATIONSHIP__TO);
		}
		return baseMeasure1From;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Base2MeasureRelationship> getBaseMeasure2From() {
		if (baseMeasure2From == null) {
			baseMeasure2From = new EObjectWithInverseResolvingEList<Base2MeasureRelationship>(Base2MeasureRelationship.class, this, SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM, SmmPackage.BASE2_MEASURE_RELATIONSHIP__TO);
		}
		return baseMeasure2From;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RescaleMeasureRelationship getRescaleTo() {
		if (rescaleTo != null && rescaleTo.eIsProxy()) {
			InternalEObject oldRescaleTo = (InternalEObject)rescaleTo;
			rescaleTo = (RescaleMeasureRelationship)eResolveProxy(oldRescaleTo);
			if (rescaleTo != oldRescaleTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.DIMENSIONAL_MEASURE__RESCALE_TO, oldRescaleTo, rescaleTo));
			}
		}
		return rescaleTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RescaleMeasureRelationship basicGetRescaleTo() {
		return rescaleTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRescaleTo(RescaleMeasureRelationship newRescaleTo, NotificationChain msgs) {
		RescaleMeasureRelationship oldRescaleTo = rescaleTo;
		rescaleTo = newRescaleTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmmPackage.DIMENSIONAL_MEASURE__RESCALE_TO, oldRescaleTo, newRescaleTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRescaleTo(RescaleMeasureRelationship newRescaleTo) {
		if (newRescaleTo != rescaleTo) {
			NotificationChain msgs = null;
			if (rescaleTo != null)
				msgs = ((InternalEObject)rescaleTo).eInverseRemove(this, SmmPackage.RESCALE_MEASURE_RELATIONSHIP__FROM, RescaleMeasureRelationship.class, msgs);
			if (newRescaleTo != null)
				msgs = ((InternalEObject)newRescaleTo).eInverseAdd(this, SmmPackage.RESCALE_MEASURE_RELATIONSHIP__FROM, RescaleMeasureRelationship.class, msgs);
			msgs = basicSetRescaleTo(newRescaleTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.DIMENSIONAL_MEASURE__RESCALE_TO, newRescaleTo, newRescaleTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RankingMeasureRelationship> getRankingFrom() {
		if (rankingFrom == null) {
			rankingFrom = new EObjectWithInverseResolvingEList<RankingMeasureRelationship>(RankingMeasureRelationship.class, this, SmmPackage.DIMENSIONAL_MEASURE__RANKING_FROM, SmmPackage.RANKING_MEASURE_RELATIONSHIP__TO);
		}
		return rankingFrom;
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
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBaseMeasureFrom()).basicAdd(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBaseMeasure1From()).basicAdd(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBaseMeasure2From()).basicAdd(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASURE__RESCALE_TO:
				if (rescaleTo != null)
					msgs = ((InternalEObject)rescaleTo).eInverseRemove(this, SmmPackage.RESCALE_MEASURE_RELATIONSHIP__FROM, RescaleMeasureRelationship.class, msgs);
				return basicSetRescaleTo((RescaleMeasureRelationship)otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASURE__RANKING_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRankingFrom()).basicAdd(otherEnd, msgs);
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
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE_FROM:
				return ((InternalEList<?>)getBaseMeasureFrom()).basicRemove(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM:
				return ((InternalEList<?>)getBaseMeasure1From()).basicRemove(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM:
				return ((InternalEList<?>)getBaseMeasure2From()).basicRemove(otherEnd, msgs);
			case SmmPackage.DIMENSIONAL_MEASURE__RESCALE_TO:
				return basicSetRescaleTo(null, msgs);
			case SmmPackage.DIMENSIONAL_MEASURE__RANKING_FROM:
				return ((InternalEList<?>)getRankingFrom()).basicRemove(otherEnd, msgs);
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
			case SmmPackage.DIMENSIONAL_MEASURE__UNIT:
				return getUnit();
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE_FROM:
				return getBaseMeasureFrom();
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM:
				return getBaseMeasure1From();
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM:
				return getBaseMeasure2From();
			case SmmPackage.DIMENSIONAL_MEASURE__RESCALE_TO:
				if (resolve) return getRescaleTo();
				return basicGetRescaleTo();
			case SmmPackage.DIMENSIONAL_MEASURE__RANKING_FROM:
				return getRankingFrom();
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
			case SmmPackage.DIMENSIONAL_MEASURE__UNIT:
				setUnit((String)newValue);
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE_FROM:
				getBaseMeasureFrom().clear();
				getBaseMeasureFrom().addAll((Collection<? extends BaseMeasureRelationship>)newValue);
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM:
				getBaseMeasure1From().clear();
				getBaseMeasure1From().addAll((Collection<? extends Base1MeasureRelationship>)newValue);
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM:
				getBaseMeasure2From().clear();
				getBaseMeasure2From().addAll((Collection<? extends Base2MeasureRelationship>)newValue);
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__RESCALE_TO:
				setRescaleTo((RescaleMeasureRelationship)newValue);
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__RANKING_FROM:
				getRankingFrom().clear();
				getRankingFrom().addAll((Collection<? extends RankingMeasureRelationship>)newValue);
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
			case SmmPackage.DIMENSIONAL_MEASURE__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE_FROM:
				getBaseMeasureFrom().clear();
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM:
				getBaseMeasure1From().clear();
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM:
				getBaseMeasure2From().clear();
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__RESCALE_TO:
				setRescaleTo((RescaleMeasureRelationship)null);
				return;
			case SmmPackage.DIMENSIONAL_MEASURE__RANKING_FROM:
				getRankingFrom().clear();
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
			case SmmPackage.DIMENSIONAL_MEASURE__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE_FROM:
				return baseMeasureFrom != null && !baseMeasureFrom.isEmpty();
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE1_FROM:
				return baseMeasure1From != null && !baseMeasure1From.isEmpty();
			case SmmPackage.DIMENSIONAL_MEASURE__BASE_MEASURE2_FROM:
				return baseMeasure2From != null && !baseMeasure2From.isEmpty();
			case SmmPackage.DIMENSIONAL_MEASURE__RESCALE_TO:
				return rescaleTo != null;
			case SmmPackage.DIMENSIONAL_MEASURE__RANKING_FROM:
				return rankingFrom != null && !rankingFrom.isEmpty();
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
		result.append(" (unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //DimensionalMeasureImpl
