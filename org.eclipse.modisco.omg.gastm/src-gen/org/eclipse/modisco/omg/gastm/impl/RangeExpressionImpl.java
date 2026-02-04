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

import org.eclipse.modisco.omg.gastm.Expression;
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.RangeExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.RangeExpressionImpl#getFromExpression <em>From Expression</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.RangeExpressionImpl#getToExpression <em>To Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RangeExpressionImpl extends ExpressionImpl implements RangeExpression {
	/**
	 * The cached value of the '{@link #getFromExpression() <em>From Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression fromExpression;

	/**
	 * The cached value of the '{@link #getToExpression() <em>To Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression toExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getRangeExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getFromExpression() {
		return fromExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromExpression(Expression newFromExpression, NotificationChain msgs) {
		Expression oldFromExpression = fromExpression;
		fromExpression = newFromExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.RANGE_EXPRESSION__FROM_EXPRESSION, oldFromExpression, newFromExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromExpression(Expression newFromExpression) {
		if (newFromExpression != fromExpression) {
			NotificationChain msgs = null;
			if (fromExpression != null)
				msgs = ((InternalEObject)fromExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.RANGE_EXPRESSION__FROM_EXPRESSION, null, msgs);
			if (newFromExpression != null)
				msgs = ((InternalEObject)newFromExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.RANGE_EXPRESSION__FROM_EXPRESSION, null, msgs);
			msgs = basicSetFromExpression(newFromExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.RANGE_EXPRESSION__FROM_EXPRESSION, newFromExpression, newFromExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getToExpression() {
		return toExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToExpression(Expression newToExpression, NotificationChain msgs) {
		Expression oldToExpression = toExpression;
		toExpression = newToExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.RANGE_EXPRESSION__TO_EXPRESSION, oldToExpression, newToExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToExpression(Expression newToExpression) {
		if (newToExpression != toExpression) {
			NotificationChain msgs = null;
			if (toExpression != null)
				msgs = ((InternalEObject)toExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.RANGE_EXPRESSION__TO_EXPRESSION, null, msgs);
			if (newToExpression != null)
				msgs = ((InternalEObject)newToExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.RANGE_EXPRESSION__TO_EXPRESSION, null, msgs);
			msgs = basicSetToExpression(newToExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.RANGE_EXPRESSION__TO_EXPRESSION, newToExpression, newToExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.RANGE_EXPRESSION__FROM_EXPRESSION:
				return basicSetFromExpression(null, msgs);
			case GASTMPackage.RANGE_EXPRESSION__TO_EXPRESSION:
				return basicSetToExpression(null, msgs);
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
			case GASTMPackage.RANGE_EXPRESSION__FROM_EXPRESSION:
				return getFromExpression();
			case GASTMPackage.RANGE_EXPRESSION__TO_EXPRESSION:
				return getToExpression();
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
			case GASTMPackage.RANGE_EXPRESSION__FROM_EXPRESSION:
				setFromExpression((Expression)newValue);
				return;
			case GASTMPackage.RANGE_EXPRESSION__TO_EXPRESSION:
				setToExpression((Expression)newValue);
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
			case GASTMPackage.RANGE_EXPRESSION__FROM_EXPRESSION:
				setFromExpression((Expression)null);
				return;
			case GASTMPackage.RANGE_EXPRESSION__TO_EXPRESSION:
				setToExpression((Expression)null);
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
			case GASTMPackage.RANGE_EXPRESSION__FROM_EXPRESSION:
				return fromExpression != null;
			case GASTMPackage.RANGE_EXPRESSION__TO_EXPRESSION:
				return toExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //RangeExpressionImpl
