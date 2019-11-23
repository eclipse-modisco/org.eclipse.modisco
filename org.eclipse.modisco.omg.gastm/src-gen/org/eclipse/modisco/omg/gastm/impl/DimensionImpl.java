/**
 * <copyright>
 * Copyright (c) 2009, 2019 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.omg.gastm.Dimension;
import org.eclipse.modisco.omg.gastm.Expression;
import org.eclipse.modisco.omg.gastm.GASTMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.DimensionImpl#getLowBound <em>Low Bound</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.DimensionImpl#getHighBound <em>High Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionImpl extends MinorSyntaxObjectImpl implements Dimension {
	/**
	 * The cached value of the '{@link #getLowBound() <em>Low Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowBound()
	 * @generated
	 * @ordered
	 */
	protected Expression lowBound;

	/**
	 * The cached value of the '{@link #getHighBound() <em>High Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighBound()
	 * @generated
	 * @ordered
	 */
	protected Expression highBound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getDimension();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLowBound() {
		return lowBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowBound(Expression newLowBound, NotificationChain msgs) {
		Expression oldLowBound = lowBound;
		lowBound = newLowBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.DIMENSION__LOW_BOUND, oldLowBound, newLowBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowBound(Expression newLowBound) {
		if (newLowBound != lowBound) {
			NotificationChain msgs = null;
			if (lowBound != null)
				msgs = ((InternalEObject)lowBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DIMENSION__LOW_BOUND, null, msgs);
			if (newLowBound != null)
				msgs = ((InternalEObject)newLowBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DIMENSION__LOW_BOUND, null, msgs);
			msgs = basicSetLowBound(newLowBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.DIMENSION__LOW_BOUND, newLowBound, newLowBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getHighBound() {
		return highBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHighBound(Expression newHighBound, NotificationChain msgs) {
		Expression oldHighBound = highBound;
		highBound = newHighBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.DIMENSION__HIGH_BOUND, oldHighBound, newHighBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighBound(Expression newHighBound) {
		if (newHighBound != highBound) {
			NotificationChain msgs = null;
			if (highBound != null)
				msgs = ((InternalEObject)highBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DIMENSION__HIGH_BOUND, null, msgs);
			if (newHighBound != null)
				msgs = ((InternalEObject)newHighBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DIMENSION__HIGH_BOUND, null, msgs);
			msgs = basicSetHighBound(newHighBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.DIMENSION__HIGH_BOUND, newHighBound, newHighBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.DIMENSION__LOW_BOUND:
				return basicSetLowBound(null, msgs);
			case GASTMPackage.DIMENSION__HIGH_BOUND:
				return basicSetHighBound(null, msgs);
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
			case GASTMPackage.DIMENSION__LOW_BOUND:
				return getLowBound();
			case GASTMPackage.DIMENSION__HIGH_BOUND:
				return getHighBound();
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
			case GASTMPackage.DIMENSION__LOW_BOUND:
				setLowBound((Expression)newValue);
				return;
			case GASTMPackage.DIMENSION__HIGH_BOUND:
				setHighBound((Expression)newValue);
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
			case GASTMPackage.DIMENSION__LOW_BOUND:
				setLowBound((Expression)null);
				return;
			case GASTMPackage.DIMENSION__HIGH_BOUND:
				setHighBound((Expression)null);
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
			case GASTMPackage.DIMENSION__LOW_BOUND:
				return lowBound != null;
			case GASTMPackage.DIMENSION__HIGH_BOUND:
				return highBound != null;
		}
		return super.eIsSet(featureID);
	}

} //DimensionImpl
