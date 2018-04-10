/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.omg.gastm.ClassType;
import org.eclipse.modisco.omg.gastm.DerivesFrom;
import org.eclipse.modisco.omg.gastm.GASTMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.ClassTypeImpl#getDerivesFrom <em>Derives From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassTypeImpl extends AggregateTypeImpl implements ClassType {
	/**
	 * The cached value of the '{@link #getDerivesFrom() <em>Derives From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivesFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<DerivesFrom> derivesFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getClassType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DerivesFrom> getDerivesFrom() {
		if (derivesFrom == null) {
			derivesFrom = new EObjectContainmentEList<DerivesFrom>(DerivesFrom.class, this, GASTMPackage.CLASS_TYPE__DERIVES_FROM);
		}
		return derivesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.CLASS_TYPE__DERIVES_FROM:
				return ((InternalEList<?>)getDerivesFrom()).basicRemove(otherEnd, msgs);
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
			case GASTMPackage.CLASS_TYPE__DERIVES_FROM:
				return getDerivesFrom();
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
			case GASTMPackage.CLASS_TYPE__DERIVES_FROM:
				getDerivesFrom().clear();
				getDerivesFrom().addAll((Collection<? extends DerivesFrom>)newValue);
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
			case GASTMPackage.CLASS_TYPE__DERIVES_FROM:
				getDerivesFrom().clear();
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
			case GASTMPackage.CLASS_TYPE__DERIVES_FROM:
				return derivesFrom != null && !derivesFrom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassTypeImpl
