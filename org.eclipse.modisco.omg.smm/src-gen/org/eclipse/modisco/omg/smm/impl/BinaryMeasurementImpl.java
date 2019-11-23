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

import org.eclipse.modisco.omg.smm.Base1MeasurementRelationship;
import org.eclipse.modisco.omg.smm.Base2MeasurementRelationship;
import org.eclipse.modisco.omg.smm.BinaryMeasurement;
import org.eclipse.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.BinaryMeasurementImpl#getBaseMeasurement1To <em>Base Measurement1 To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.BinaryMeasurementImpl#getBaseMeasurement2To <em>Base Measurement2 To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.BinaryMeasurementImpl#isIsBaseSupplied <em>Is Base Supplied</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryMeasurementImpl extends DimensionalMeasurementImpl implements BinaryMeasurement {
	/**
	 * The cached value of the '{@link #getBaseMeasurement1To() <em>Base Measurement1 To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasurement1To()
	 * @generated
	 * @ordered
	 */
	protected Base1MeasurementRelationship baseMeasurement1To;

	/**
	 * The cached value of the '{@link #getBaseMeasurement2To() <em>Base Measurement2 To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMeasurement2To()
	 * @generated
	 * @ordered
	 */
	protected Base2MeasurementRelationship baseMeasurement2To;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.BINARY_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base1MeasurementRelationship getBaseMeasurement1To() {
		return baseMeasurement1To;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseMeasurement1To(Base1MeasurementRelationship newBaseMeasurement1To, NotificationChain msgs) {
		Base1MeasurementRelationship oldBaseMeasurement1To = baseMeasurement1To;
		baseMeasurement1To = newBaseMeasurement1To;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT1_TO, oldBaseMeasurement1To, newBaseMeasurement1To);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseMeasurement1To(Base1MeasurementRelationship newBaseMeasurement1To) {
		if (newBaseMeasurement1To != baseMeasurement1To) {
			NotificationChain msgs = null;
			if (baseMeasurement1To != null)
				msgs = ((InternalEObject)baseMeasurement1To).eInverseRemove(this, SmmPackage.BASE1_MEASUREMENT_RELATIONSHIP__FROM, Base1MeasurementRelationship.class, msgs);
			if (newBaseMeasurement1To != null)
				msgs = ((InternalEObject)newBaseMeasurement1To).eInverseAdd(this, SmmPackage.BASE1_MEASUREMENT_RELATIONSHIP__FROM, Base1MeasurementRelationship.class, msgs);
			msgs = basicSetBaseMeasurement1To(newBaseMeasurement1To, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT1_TO, newBaseMeasurement1To, newBaseMeasurement1To));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base2MeasurementRelationship getBaseMeasurement2To() {
		return baseMeasurement2To;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseMeasurement2To(Base2MeasurementRelationship newBaseMeasurement2To, NotificationChain msgs) {
		Base2MeasurementRelationship oldBaseMeasurement2To = baseMeasurement2To;
		baseMeasurement2To = newBaseMeasurement2To;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT2_TO, oldBaseMeasurement2To, newBaseMeasurement2To);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseMeasurement2To(Base2MeasurementRelationship newBaseMeasurement2To) {
		if (newBaseMeasurement2To != baseMeasurement2To) {
			NotificationChain msgs = null;
			if (baseMeasurement2To != null)
				msgs = ((InternalEObject)baseMeasurement2To).eInverseRemove(this, SmmPackage.BASE2_MEASUREMENT_RELATIONSHIP__FROM, Base2MeasurementRelationship.class, msgs);
			if (newBaseMeasurement2To != null)
				msgs = ((InternalEObject)newBaseMeasurement2To).eInverseAdd(this, SmmPackage.BASE2_MEASUREMENT_RELATIONSHIP__FROM, Base2MeasurementRelationship.class, msgs);
			msgs = basicSetBaseMeasurement2To(newBaseMeasurement2To, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT2_TO, newBaseMeasurement2To, newBaseMeasurement2To));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.BINARY_MEASUREMENT__IS_BASE_SUPPLIED, oldIsBaseSupplied, isBaseSupplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT1_TO:
				if (baseMeasurement1To != null)
					msgs = ((InternalEObject)baseMeasurement1To).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT1_TO, null, msgs);
				return basicSetBaseMeasurement1To((Base1MeasurementRelationship)otherEnd, msgs);
			case SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT2_TO:
				if (baseMeasurement2To != null)
					msgs = ((InternalEObject)baseMeasurement2To).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT2_TO, null, msgs);
				return basicSetBaseMeasurement2To((Base2MeasurementRelationship)otherEnd, msgs);
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
			case SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT1_TO:
				return basicSetBaseMeasurement1To(null, msgs);
			case SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT2_TO:
				return basicSetBaseMeasurement2To(null, msgs);
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
			case SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT1_TO:
				return getBaseMeasurement1To();
			case SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT2_TO:
				return getBaseMeasurement2To();
			case SmmPackage.BINARY_MEASUREMENT__IS_BASE_SUPPLIED:
				return isIsBaseSupplied();
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
			case SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT1_TO:
				setBaseMeasurement1To((Base1MeasurementRelationship)newValue);
				return;
			case SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT2_TO:
				setBaseMeasurement2To((Base2MeasurementRelationship)newValue);
				return;
			case SmmPackage.BINARY_MEASUREMENT__IS_BASE_SUPPLIED:
				setIsBaseSupplied((Boolean)newValue);
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
			case SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT1_TO:
				setBaseMeasurement1To((Base1MeasurementRelationship)null);
				return;
			case SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT2_TO:
				setBaseMeasurement2To((Base2MeasurementRelationship)null);
				return;
			case SmmPackage.BINARY_MEASUREMENT__IS_BASE_SUPPLIED:
				setIsBaseSupplied(IS_BASE_SUPPLIED_EDEFAULT);
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
			case SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT1_TO:
				return baseMeasurement1To != null;
			case SmmPackage.BINARY_MEASUREMENT__BASE_MEASUREMENT2_TO:
				return baseMeasurement2To != null;
			case SmmPackage.BINARY_MEASUREMENT__IS_BASE_SUPPLIED:
				return isBaseSupplied != IS_BASE_SUPPLIED_EDEFAULT;
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

} //BinaryMeasurementImpl
