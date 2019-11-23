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
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.NewExpression;
import org.eclipse.modisco.omg.gastm.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.NewExpressionImpl#getNewType <em>New Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.NewExpressionImpl#getActualParams <em>Actual Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewExpressionImpl extends ExpressionImpl implements NewExpression {
	/**
	 * The cached value of the '{@link #getNewType() <em>New Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewType()
	 * @generated
	 * @ordered
	 */
	protected TypeReference newType;

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
	protected NewExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getNewExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getNewType() {
		return newType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewType(TypeReference newNewType, NotificationChain msgs) {
		TypeReference oldNewType = newType;
		newType = newNewType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.NEW_EXPRESSION__NEW_TYPE, oldNewType, newNewType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewType(TypeReference newNewType) {
		if (newNewType != newType) {
			NotificationChain msgs = null;
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.NEW_EXPRESSION__NEW_TYPE, null, msgs);
			if (newNewType != null)
				msgs = ((InternalEObject)newNewType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.NEW_EXPRESSION__NEW_TYPE, null, msgs);
			msgs = basicSetNewType(newNewType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.NEW_EXPRESSION__NEW_TYPE, newNewType, newNewType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActualParameter> getActualParams() {
		if (actualParams == null) {
			actualParams = new EObjectContainmentEList<ActualParameter>(ActualParameter.class, this, GASTMPackage.NEW_EXPRESSION__ACTUAL_PARAMS);
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
			case GASTMPackage.NEW_EXPRESSION__NEW_TYPE:
				return basicSetNewType(null, msgs);
			case GASTMPackage.NEW_EXPRESSION__ACTUAL_PARAMS:
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
			case GASTMPackage.NEW_EXPRESSION__NEW_TYPE:
				return getNewType();
			case GASTMPackage.NEW_EXPRESSION__ACTUAL_PARAMS:
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
			case GASTMPackage.NEW_EXPRESSION__NEW_TYPE:
				setNewType((TypeReference)newValue);
				return;
			case GASTMPackage.NEW_EXPRESSION__ACTUAL_PARAMS:
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
			case GASTMPackage.NEW_EXPRESSION__NEW_TYPE:
				setNewType((TypeReference)null);
				return;
			case GASTMPackage.NEW_EXPRESSION__ACTUAL_PARAMS:
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
			case GASTMPackage.NEW_EXPRESSION__NEW_TYPE:
				return newType != null;
			case GASTMPackage.NEW_EXPRESSION__ACTUAL_PARAMS:
				return actualParams != null && !actualParams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NewExpressionImpl
