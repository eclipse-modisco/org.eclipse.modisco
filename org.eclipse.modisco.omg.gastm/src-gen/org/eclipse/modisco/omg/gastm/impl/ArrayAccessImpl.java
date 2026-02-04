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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.omg.gastm.ArrayAccess;
import org.eclipse.modisco.omg.gastm.Expression;
import org.eclipse.modisco.omg.gastm.GASTMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.ArrayAccessImpl#getArrayName <em>Array Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.ArrayAccessImpl#getSubscripts <em>Subscripts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayAccessImpl extends ExpressionImpl implements ArrayAccess {
	/**
	 * The cached value of the '{@link #getArrayName() <em>Array Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayName()
	 * @generated
	 * @ordered
	 */
	protected Expression arrayName;

	/**
	 * The cached value of the '{@link #getSubscripts() <em>Subscripts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscripts()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> subscripts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getArrayAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getArrayName() {
		return arrayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrayName(Expression newArrayName, NotificationChain msgs) {
		Expression oldArrayName = arrayName;
		arrayName = newArrayName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.ARRAY_ACCESS__ARRAY_NAME, oldArrayName, newArrayName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayName(Expression newArrayName) {
		if (newArrayName != arrayName) {
			NotificationChain msgs = null;
			if (arrayName != null)
				msgs = ((InternalEObject)arrayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.ARRAY_ACCESS__ARRAY_NAME, null, msgs);
			if (newArrayName != null)
				msgs = ((InternalEObject)newArrayName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.ARRAY_ACCESS__ARRAY_NAME, null, msgs);
			msgs = basicSetArrayName(newArrayName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.ARRAY_ACCESS__ARRAY_NAME, newArrayName, newArrayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getSubscripts() {
		if (subscripts == null) {
			subscripts = new EObjectContainmentEList<Expression>(Expression.class, this, GASTMPackage.ARRAY_ACCESS__SUBSCRIPTS);
		}
		return subscripts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.ARRAY_ACCESS__ARRAY_NAME:
				return basicSetArrayName(null, msgs);
			case GASTMPackage.ARRAY_ACCESS__SUBSCRIPTS:
				return ((InternalEList<?>)getSubscripts()).basicRemove(otherEnd, msgs);
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
			case GASTMPackage.ARRAY_ACCESS__ARRAY_NAME:
				return getArrayName();
			case GASTMPackage.ARRAY_ACCESS__SUBSCRIPTS:
				return getSubscripts();
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
			case GASTMPackage.ARRAY_ACCESS__ARRAY_NAME:
				setArrayName((Expression)newValue);
				return;
			case GASTMPackage.ARRAY_ACCESS__SUBSCRIPTS:
				getSubscripts().clear();
				getSubscripts().addAll((Collection<? extends Expression>)newValue);
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
			case GASTMPackage.ARRAY_ACCESS__ARRAY_NAME:
				setArrayName((Expression)null);
				return;
			case GASTMPackage.ARRAY_ACCESS__SUBSCRIPTS:
				getSubscripts().clear();
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
			case GASTMPackage.ARRAY_ACCESS__ARRAY_NAME:
				return arrayName != null;
			case GASTMPackage.ARRAY_ACCESS__SUBSCRIPTS:
				return subscripts != null && !subscripts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArrayAccessImpl
