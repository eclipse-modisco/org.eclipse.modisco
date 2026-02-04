/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.browser.custom.emf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.modisco.infra.browser.custom.DerivedFeatureValue;
import org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage;
import org.eclipse.modisco.infra.query.ModelQuery;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Feature Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.emf.impl.DerivedFeatureValueImpl#getValueCalculator <em>Value Calculator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class DerivedFeatureValueImpl extends FeatureValueImpl implements DerivedFeatureValue {
	/**
	 * The cached value of the '{@link #getValueCalculator() <em>Value Calculator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCalculator()
	 * @generated
	 * @ordered
	 */
	protected ModelQuery valueCalculator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedFeatureValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UicustomPackage.eINSTANCE.getDerivedFeatureValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelQuery getValueCalculator() {
		if (valueCalculator != null && valueCalculator.eIsProxy()) {
			InternalEObject oldValueCalculator = (InternalEObject)valueCalculator;
			valueCalculator = (ModelQuery)eResolveProxy(oldValueCalculator);
			if (valueCalculator != oldValueCalculator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UicustomPackage.DERIVED_FEATURE_VALUE__VALUE_CALCULATOR, oldValueCalculator, valueCalculator));
			}
		}
		return valueCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelQuery basicGetValueCalculator() {
		return valueCalculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueCalculator(ModelQuery newValueCalculator) {
		ModelQuery oldValueCalculator = valueCalculator;
		valueCalculator = newValueCalculator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UicustomPackage.DERIVED_FEATURE_VALUE__VALUE_CALCULATOR, oldValueCalculator, valueCalculator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UicustomPackage.DERIVED_FEATURE_VALUE__VALUE_CALCULATOR:
				if (resolve) return getValueCalculator();
				return basicGetValueCalculator();
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
			case UicustomPackage.DERIVED_FEATURE_VALUE__VALUE_CALCULATOR:
				setValueCalculator((ModelQuery)newValue);
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
			case UicustomPackage.DERIVED_FEATURE_VALUE__VALUE_CALCULATOR:
				setValueCalculator((ModelQuery)null);
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
			case UicustomPackage.DERIVED_FEATURE_VALUE__VALUE_CALCULATOR:
				return valueCalculator != null;
		}
		return super.eIsSet(featureID);
	}

} //DerivedFeatureValueImpl
