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

import java.lang.Boolean;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.Statement;
import org.eclipse.modisco.omg.gastm.SwitchCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.SwitchCaseImpl#getIsEvaluateAllCases <em>Is Evaluate All Cases</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.SwitchCaseImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchCaseImpl extends MinorSyntaxObjectImpl implements SwitchCase {
	/**
	 * The default value of the '{@link #getIsEvaluateAllCases() <em>Is Evaluate All Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEvaluateAllCases()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_EVALUATE_ALL_CASES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsEvaluateAllCases() <em>Is Evaluate All Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEvaluateAllCases()
	 * @generated
	 * @ordered
	 */
	protected Boolean isEvaluateAllCases = IS_EVALUATE_ALL_CASES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getSwitchCase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsEvaluateAllCases() {
		return isEvaluateAllCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEvaluateAllCases(Boolean newIsEvaluateAllCases) {
		Boolean oldIsEvaluateAllCases = isEvaluateAllCases;
		isEvaluateAllCases = newIsEvaluateAllCases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.SWITCH_CASE__IS_EVALUATE_ALL_CASES, oldIsEvaluateAllCases, isEvaluateAllCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getBody() {
		if (body == null) {
			body = new EObjectResolvingEList<Statement>(Statement.class, this, GASTMPackage.SWITCH_CASE__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GASTMPackage.SWITCH_CASE__IS_EVALUATE_ALL_CASES:
				return getIsEvaluateAllCases();
			case GASTMPackage.SWITCH_CASE__BODY:
				return getBody();
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
			case GASTMPackage.SWITCH_CASE__IS_EVALUATE_ALL_CASES:
				setIsEvaluateAllCases((Boolean)newValue);
				return;
			case GASTMPackage.SWITCH_CASE__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends Statement>)newValue);
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
			case GASTMPackage.SWITCH_CASE__IS_EVALUATE_ALL_CASES:
				setIsEvaluateAllCases(IS_EVALUATE_ALL_CASES_EDEFAULT);
				return;
			case GASTMPackage.SWITCH_CASE__BODY:
				getBody().clear();
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
			case GASTMPackage.SWITCH_CASE__IS_EVALUATE_ALL_CASES:
				return IS_EVALUATE_ALL_CASES_EDEFAULT == null ? isEvaluateAllCases != null : !IS_EVALUATE_ALL_CASES_EDEFAULT.equals(isEvaluateAllCases);
			case GASTMPackage.SWITCH_CASE__BODY:
				return body != null && !body.isEmpty();
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
		result.append(" (isEvaluateAllCases: "); //$NON-NLS-1$
		result.append(isEvaluateAllCases);
		result.append(')');
		return result.toString();
	}

} //SwitchCaseImpl
