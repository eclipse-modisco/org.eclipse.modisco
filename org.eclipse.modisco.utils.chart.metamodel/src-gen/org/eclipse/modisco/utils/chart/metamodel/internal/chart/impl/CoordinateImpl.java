/**
 * *******************************************************************************
 *  * Copyright (c) 2012 INRIA. All rights reserved. This program and the
 *  * accompanying materials are made available under the terms of the Eclipse
 *  * Public License v1.0 which accompanies this distribution, and is available at
 *  * http://www.eclipse.org/legal/epl-v10.html
 *  * 
 *  * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *  * 
 *  ******************************************************************************
 * 
 */
package org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.utils.chart.metamodel.internal.chart.Axe;
import org.eclipse.modisco.utils.chart.metamodel.internal.chart.ChartPackage;
import org.eclipse.modisco.utils.chart.metamodel.internal.chart.Coordinate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.CoordinateImpl#getAxe <em>Axe</em>}</li>
 *   <li>{@link org.eclipse.modisco.utils.chart.metamodel.internal.chart.impl.CoordinateImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinateImpl extends EObjectImpl implements Coordinate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "*******************************************************************************\r\n * Copyright (c) 2012 INRIA. All rights reserved. This program and the\r\n * accompanying materials are made available under the terms of the Eclipse\r\n * Public License v1.0 which accompanies this distribution, and is available at\r\n * http://www.eclipse.org/legal/epl-v10.html\r\n * \r\n * Contributors: Guillaume Doux - INRIA - Initial API and implementation\r\n * \r\n ******************************************************************************\r\n";

	/**
	 * The cached value of the '{@link #getAxe() <em>Axe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxe()
	 * @generated
	 * @ordered
	 */
	protected Axe axe;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartPackage.Literals.COORDINATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axe getAxe() {
		if (axe != null && axe.eIsProxy()) {
			InternalEObject oldAxe = (InternalEObject)axe;
			axe = (Axe)eResolveProxy(oldAxe);
			if (axe != oldAxe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChartPackage.COORDINATE__AXE, oldAxe, axe));
			}
		}
		return axe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axe basicGetAxe() {
		return axe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxe(Axe newAxe) {
		Axe oldAxe = axe;
		axe = newAxe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.COORDINATE__AXE, oldAxe, axe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.COORDINATE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChartPackage.COORDINATE__AXE:
				if (resolve) return getAxe();
				return basicGetAxe();
			case ChartPackage.COORDINATE__VALUE:
				return getValue();
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
			case ChartPackage.COORDINATE__AXE:
				setAxe((Axe)newValue);
				return;
			case ChartPackage.COORDINATE__VALUE:
				setValue((Double)newValue);
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
			case ChartPackage.COORDINATE__AXE:
				setAxe((Axe)null);
				return;
			case ChartPackage.COORDINATE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case ChartPackage.COORDINATE__AXE:
				return axe != null;
			case ChartPackage.COORDINATE__VALUE:
				return value != VALUE_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //CoordinateImpl
