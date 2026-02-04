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

import org.eclipse.modisco.omg.smm.BaseMeasurementRelationship;
import org.eclipse.modisco.omg.smm.CollectiveMeasurement;
import org.eclipse.modisco.omg.smm.DimensionalMeasurement;
import org.eclipse.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Measurement Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.BaseMeasurementRelationshipImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.BaseMeasurementRelationshipImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseMeasurementRelationshipImpl extends MeasurementRelationshipImpl implements BaseMeasurementRelationship {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected CollectiveMeasurement from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected DimensionalMeasurement to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseMeasurementRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.BASE_MEASUREMENT_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectiveMeasurement getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (CollectiveMeasurement)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectiveMeasurement basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(CollectiveMeasurement newFrom, NotificationChain msgs) {
		CollectiveMeasurement oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(CollectiveMeasurement newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, SmmPackage.COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_TO, CollectiveMeasurement.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, SmmPackage.COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_TO, CollectiveMeasurement.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionalMeasurement getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (DimensionalMeasurement)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionalMeasurement basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(DimensionalMeasurement newTo, NotificationChain msgs) {
		DimensionalMeasurement oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(DimensionalMeasurement newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM, DimensionalMeasurement.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM, DimensionalMeasurement.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, SmmPackage.COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT_TO, CollectiveMeasurement.class, msgs);
				return basicSetFrom((CollectiveMeasurement)otherEnd, msgs);
			case SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, SmmPackage.DIMENSIONAL_MEASUREMENT__BASE_MEASUREMENT_FROM, DimensionalMeasurement.class, msgs);
				return basicSetTo((DimensionalMeasurement)otherEnd, msgs);
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
			case SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__FROM:
				return basicSetFrom(null, msgs);
			case SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__TO:
				return basicSetTo(null, msgs);
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
			case SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__FROM:
				setFrom((CollectiveMeasurement)newValue);
				return;
			case SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__TO:
				setTo((DimensionalMeasurement)newValue);
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
			case SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__FROM:
				setFrom((CollectiveMeasurement)null);
				return;
			case SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__TO:
				setTo((DimensionalMeasurement)null);
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
			case SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__FROM:
				return from != null;
			case SmmPackage.BASE_MEASUREMENT_RELATIONSHIP__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //BaseMeasurementRelationshipImpl
