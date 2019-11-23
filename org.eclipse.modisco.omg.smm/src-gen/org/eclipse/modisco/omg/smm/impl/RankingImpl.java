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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.omg.smm.Ranking;
import org.eclipse.modisco.omg.smm.RankingInterval;
import org.eclipse.modisco.omg.smm.RankingMeasureRelationship;
import org.eclipse.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ranking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.RankingImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.RankingImpl#getRankingTo <em>Ranking To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RankingImpl extends MeasureImpl implements Ranking {
	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected EList<RankingInterval> interval;

	/**
	 * The cached value of the '{@link #getRankingTo() <em>Ranking To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRankingTo()
	 * @generated
	 * @ordered
	 */
	protected RankingMeasureRelationship rankingTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RankingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.RANKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RankingInterval> getInterval() {
		if (interval == null) {
			interval = new EObjectContainmentWithInverseEList<RankingInterval>(RankingInterval.class, this, SmmPackage.RANKING__INTERVAL, SmmPackage.RANKING_INTERVAL__RANK);
		}
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RankingMeasureRelationship getRankingTo() {
		if (rankingTo != null && rankingTo.eIsProxy()) {
			InternalEObject oldRankingTo = (InternalEObject)rankingTo;
			rankingTo = (RankingMeasureRelationship)eResolveProxy(oldRankingTo);
			if (rankingTo != oldRankingTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.RANKING__RANKING_TO, oldRankingTo, rankingTo));
			}
		}
		return rankingTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RankingMeasureRelationship basicGetRankingTo() {
		return rankingTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRankingTo(RankingMeasureRelationship newRankingTo, NotificationChain msgs) {
		RankingMeasureRelationship oldRankingTo = rankingTo;
		rankingTo = newRankingTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmmPackage.RANKING__RANKING_TO, oldRankingTo, newRankingTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRankingTo(RankingMeasureRelationship newRankingTo) {
		if (newRankingTo != rankingTo) {
			NotificationChain msgs = null;
			if (rankingTo != null)
				msgs = ((InternalEObject)rankingTo).eInverseRemove(this, SmmPackage.RANKING_MEASURE_RELATIONSHIP__FROM, RankingMeasureRelationship.class, msgs);
			if (newRankingTo != null)
				msgs = ((InternalEObject)newRankingTo).eInverseAdd(this, SmmPackage.RANKING_MEASURE_RELATIONSHIP__FROM, RankingMeasureRelationship.class, msgs);
			msgs = basicSetRankingTo(newRankingTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.RANKING__RANKING_TO, newRankingTo, newRankingTo));
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
			case SmmPackage.RANKING__INTERVAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterval()).basicAdd(otherEnd, msgs);
			case SmmPackage.RANKING__RANKING_TO:
				if (rankingTo != null)
					msgs = ((InternalEObject)rankingTo).eInverseRemove(this, SmmPackage.RANKING_MEASURE_RELATIONSHIP__FROM, RankingMeasureRelationship.class, msgs);
				return basicSetRankingTo((RankingMeasureRelationship)otherEnd, msgs);
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
			case SmmPackage.RANKING__INTERVAL:
				return ((InternalEList<?>)getInterval()).basicRemove(otherEnd, msgs);
			case SmmPackage.RANKING__RANKING_TO:
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
			case SmmPackage.RANKING__INTERVAL:
				return getInterval();
			case SmmPackage.RANKING__RANKING_TO:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmmPackage.RANKING__INTERVAL:
				getInterval().clear();
				getInterval().addAll((Collection<? extends RankingInterval>)newValue);
				return;
			case SmmPackage.RANKING__RANKING_TO:
				setRankingTo((RankingMeasureRelationship)newValue);
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
			case SmmPackage.RANKING__INTERVAL:
				getInterval().clear();
				return;
			case SmmPackage.RANKING__RANKING_TO:
				setRankingTo((RankingMeasureRelationship)null);
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
			case SmmPackage.RANKING__INTERVAL:
				return interval != null && !interval.isEmpty();
			case SmmPackage.RANKING__RANKING_TO:
				return rankingTo != null;
		}
		return super.eIsSet(featureID);
	}

} //RankingImpl
