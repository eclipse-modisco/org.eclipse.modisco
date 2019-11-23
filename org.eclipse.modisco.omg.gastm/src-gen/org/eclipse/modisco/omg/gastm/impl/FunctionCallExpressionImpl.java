/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.omg.gastm.ActualParameter;
import org.eclipse.modisco.omg.gastm.Expression;
import org.eclipse.modisco.omg.gastm.FunctionCallExpression;
import org.eclipse.modisco.omg.gastm.GASTMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.FunctionCallExpressionImpl#getCalledFunction <em>Called Function</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.FunctionCallExpressionImpl#getActualParams <em>Actual Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionCallExpressionImpl extends ExpressionImpl implements FunctionCallExpression {
	/**
	 * The cached value of the '{@link #getCalledFunction() <em>Called Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledFunction()
	 * @generated
	 * @ordered
	 */
	protected Expression calledFunction;

	/**
	 * The cached value of the '{@link #getActualParams() <em>Actual Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualParams()
	 * @generated
	 * @ordered
	 */
	protected EList<ActualParameter> actualParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getFunctionCallExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCalledFunction() {
		return calledFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalledFunction(Expression newCalledFunction, NotificationChain msgs) {
		Expression oldCalledFunction = calledFunction;
		calledFunction = newCalledFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION, oldCalledFunction, newCalledFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledFunction(Expression newCalledFunction) {
		if (newCalledFunction != calledFunction) {
			NotificationChain msgs = null;
			if (calledFunction != null)
				msgs = ((InternalEObject)calledFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION, null, msgs);
			if (newCalledFunction != null)
				msgs = ((InternalEObject)newCalledFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION, null, msgs);
			msgs = basicSetCalledFunction(newCalledFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION, newCalledFunction, newCalledFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActualParameter> getActualParams() {
		if (actualParams == null) {
			actualParams = new EObjectContainmentEList<ActualParameter>(ActualParameter.class, this, GASTMPackage.FUNCTION_CALL_EXPRESSION__ACTUAL_PARAMS);
		}
		return actualParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION:
				return basicSetCalledFunction(null, msgs);
			case GASTMPackage.FUNCTION_CALL_EXPRESSION__ACTUAL_PARAMS:
				return ((InternalEList<?>)getActualParams()).basicRemove(otherEnd, msgs);
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
			case GASTMPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION:
				return getCalledFunction();
			case GASTMPackage.FUNCTION_CALL_EXPRESSION__ACTUAL_PARAMS:
				return getActualParams();
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
			case GASTMPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION:
				setCalledFunction((Expression)newValue);
				return;
			case GASTMPackage.FUNCTION_CALL_EXPRESSION__ACTUAL_PARAMS:
				getActualParams().clear();
				getActualParams().addAll((Collection<? extends ActualParameter>)newValue);
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
			case GASTMPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION:
				setCalledFunction((Expression)null);
				return;
			case GASTMPackage.FUNCTION_CALL_EXPRESSION__ACTUAL_PARAMS:
				getActualParams().clear();
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
			case GASTMPackage.FUNCTION_CALL_EXPRESSION__CALLED_FUNCTION:
				return calledFunction != null;
			case GASTMPackage.FUNCTION_CALL_EXPRESSION__ACTUAL_PARAMS:
				return actualParams != null && !actualParams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionCallExpressionImpl
