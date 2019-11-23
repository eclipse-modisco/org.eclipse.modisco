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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.omg.gastm.Expression;
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.SwitchCase;
import org.eclipse.modisco.omg.gastm.SwitchStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.SwitchStatementImpl#getSwitchExpression <em>Switch Expression</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.SwitchStatementImpl#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchStatementImpl extends StatementImpl implements SwitchStatement {
	/**
	 * The cached value of the '{@link #getSwitchExpression() <em>Switch Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitchExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression switchExpression;

	/**
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
	protected SwitchCase cases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getSwitchStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSwitchExpression() {
		return switchExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitchExpression(Expression newSwitchExpression, NotificationChain msgs) {
		Expression oldSwitchExpression = switchExpression;
		switchExpression = newSwitchExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION, oldSwitchExpression, newSwitchExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitchExpression(Expression newSwitchExpression) {
		if (newSwitchExpression != switchExpression) {
			NotificationChain msgs = null;
			if (switchExpression != null)
				msgs = ((InternalEObject)switchExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION, null, msgs);
			if (newSwitchExpression != null)
				msgs = ((InternalEObject)newSwitchExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION, null, msgs);
			msgs = basicSetSwitchExpression(newSwitchExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION, newSwitchExpression, newSwitchExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchCase getCases() {
		if (cases != null && cases.eIsProxy()) {
			InternalEObject oldCases = (InternalEObject)cases;
			cases = (SwitchCase)eResolveProxy(oldCases);
			if (cases != oldCases) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GASTMPackage.SWITCH_STATEMENT__CASES, oldCases, cases));
			}
		}
		return cases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchCase basicGetCases() {
		return cases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCases(SwitchCase newCases) {
		SwitchCase oldCases = cases;
		cases = newCases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.SWITCH_STATEMENT__CASES, oldCases, cases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION:
				return basicSetSwitchExpression(null, msgs);
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
			case GASTMPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION:
				return getSwitchExpression();
			case GASTMPackage.SWITCH_STATEMENT__CASES:
				if (resolve) return getCases();
				return basicGetCases();
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
			case GASTMPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION:
				setSwitchExpression((Expression)newValue);
				return;
			case GASTMPackage.SWITCH_STATEMENT__CASES:
				setCases((SwitchCase)newValue);
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
			case GASTMPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION:
				setSwitchExpression((Expression)null);
				return;
			case GASTMPackage.SWITCH_STATEMENT__CASES:
				setCases((SwitchCase)null);
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
			case GASTMPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION:
				return switchExpression != null;
			case GASTMPackage.SWITCH_STATEMENT__CASES:
				return cases != null;
		}
		return super.eIsSet(featureID);
	}

} //SwitchStatementImpl
