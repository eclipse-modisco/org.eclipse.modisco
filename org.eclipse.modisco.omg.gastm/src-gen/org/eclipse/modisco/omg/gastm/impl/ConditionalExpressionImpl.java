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

import org.eclipse.modisco.omg.gastm.ConditionalExpression;
import org.eclipse.modisco.omg.gastm.Expression;
import org.eclipse.modisco.omg.gastm.GASTMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.ConditionalExpressionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.ConditionalExpressionImpl#getOnTrueOperand <em>On True Operand</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.ConditionalExpressionImpl#getOnFalseOperand <em>On False Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalExpressionImpl extends ExpressionImpl implements ConditionalExpression {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getOnTrueOperand() <em>On True Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTrueOperand()
	 * @generated
	 * @ordered
	 */
	protected Expression onTrueOperand;

	/**
	 * The cached value of the '{@link #getOnFalseOperand() <em>On False Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnFalseOperand()
	 * @generated
	 * @ordered
	 */
	protected Expression onFalseOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getConditionalExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.CONDITIONAL_EXPRESSION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.CONDITIONAL_EXPRESSION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.CONDITIONAL_EXPRESSION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.CONDITIONAL_EXPRESSION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOnTrueOperand() {
		return onTrueOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnTrueOperand(Expression newOnTrueOperand, NotificationChain msgs) {
		Expression oldOnTrueOperand = onTrueOperand;
		onTrueOperand = newOnTrueOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.CONDITIONAL_EXPRESSION__ON_TRUE_OPERAND, oldOnTrueOperand, newOnTrueOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnTrueOperand(Expression newOnTrueOperand) {
		if (newOnTrueOperand != onTrueOperand) {
			NotificationChain msgs = null;
			if (onTrueOperand != null)
				msgs = ((InternalEObject)onTrueOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.CONDITIONAL_EXPRESSION__ON_TRUE_OPERAND, null, msgs);
			if (newOnTrueOperand != null)
				msgs = ((InternalEObject)newOnTrueOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.CONDITIONAL_EXPRESSION__ON_TRUE_OPERAND, null, msgs);
			msgs = basicSetOnTrueOperand(newOnTrueOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.CONDITIONAL_EXPRESSION__ON_TRUE_OPERAND, newOnTrueOperand, newOnTrueOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOnFalseOperand() {
		return onFalseOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnFalseOperand(Expression newOnFalseOperand, NotificationChain msgs) {
		Expression oldOnFalseOperand = onFalseOperand;
		onFalseOperand = newOnFalseOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.CONDITIONAL_EXPRESSION__ON_FALSE_OPERAND, oldOnFalseOperand, newOnFalseOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnFalseOperand(Expression newOnFalseOperand) {
		if (newOnFalseOperand != onFalseOperand) {
			NotificationChain msgs = null;
			if (onFalseOperand != null)
				msgs = ((InternalEObject)onFalseOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.CONDITIONAL_EXPRESSION__ON_FALSE_OPERAND, null, msgs);
			if (newOnFalseOperand != null)
				msgs = ((InternalEObject)newOnFalseOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.CONDITIONAL_EXPRESSION__ON_FALSE_OPERAND, null, msgs);
			msgs = basicSetOnFalseOperand(newOnFalseOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.CONDITIONAL_EXPRESSION__ON_FALSE_OPERAND, newOnFalseOperand, newOnFalseOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.CONDITIONAL_EXPRESSION__CONDITION:
				return basicSetCondition(null, msgs);
			case GASTMPackage.CONDITIONAL_EXPRESSION__ON_TRUE_OPERAND:
				return basicSetOnTrueOperand(null, msgs);
			case GASTMPackage.CONDITIONAL_EXPRESSION__ON_FALSE_OPERAND:
				return basicSetOnFalseOperand(null, msgs);
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
			case GASTMPackage.CONDITIONAL_EXPRESSION__CONDITION:
				return getCondition();
			case GASTMPackage.CONDITIONAL_EXPRESSION__ON_TRUE_OPERAND:
				return getOnTrueOperand();
			case GASTMPackage.CONDITIONAL_EXPRESSION__ON_FALSE_OPERAND:
				return getOnFalseOperand();
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
			case GASTMPackage.CONDITIONAL_EXPRESSION__CONDITION:
				setCondition((Expression)newValue);
				return;
			case GASTMPackage.CONDITIONAL_EXPRESSION__ON_TRUE_OPERAND:
				setOnTrueOperand((Expression)newValue);
				return;
			case GASTMPackage.CONDITIONAL_EXPRESSION__ON_FALSE_OPERAND:
				setOnFalseOperand((Expression)newValue);
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
			case GASTMPackage.CONDITIONAL_EXPRESSION__CONDITION:
				setCondition((Expression)null);
				return;
			case GASTMPackage.CONDITIONAL_EXPRESSION__ON_TRUE_OPERAND:
				setOnTrueOperand((Expression)null);
				return;
			case GASTMPackage.CONDITIONAL_EXPRESSION__ON_FALSE_OPERAND:
				setOnFalseOperand((Expression)null);
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
			case GASTMPackage.CONDITIONAL_EXPRESSION__CONDITION:
				return condition != null;
			case GASTMPackage.CONDITIONAL_EXPRESSION__ON_TRUE_OPERAND:
				return onTrueOperand != null;
			case GASTMPackage.CONDITIONAL_EXPRESSION__ON_FALSE_OPERAND:
				return onFalseOperand != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalExpressionImpl
