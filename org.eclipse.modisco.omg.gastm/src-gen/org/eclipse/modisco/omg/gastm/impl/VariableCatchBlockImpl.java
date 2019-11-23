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

import org.eclipse.modisco.omg.gastm.DataDefinition;
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.VariableCatchBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Catch Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.VariableCatchBlockImpl#getExceptionVariable <em>Exception Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableCatchBlockImpl extends CatchBlockImpl implements VariableCatchBlock {
	/**
	 * The cached value of the '{@link #getExceptionVariable() <em>Exception Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionVariable()
	 * @generated
	 * @ordered
	 */
	protected DataDefinition exceptionVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableCatchBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getVariableCatchBlock();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDefinition getExceptionVariable() {
		return exceptionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionVariable(DataDefinition newExceptionVariable, NotificationChain msgs) {
		DataDefinition oldExceptionVariable = exceptionVariable;
		exceptionVariable = newExceptionVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.VARIABLE_CATCH_BLOCK__EXCEPTION_VARIABLE, oldExceptionVariable, newExceptionVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionVariable(DataDefinition newExceptionVariable) {
		if (newExceptionVariable != exceptionVariable) {
			NotificationChain msgs = null;
			if (exceptionVariable != null)
				msgs = ((InternalEObject)exceptionVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.VARIABLE_CATCH_BLOCK__EXCEPTION_VARIABLE, null, msgs);
			if (newExceptionVariable != null)
				msgs = ((InternalEObject)newExceptionVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.VARIABLE_CATCH_BLOCK__EXCEPTION_VARIABLE, null, msgs);
			msgs = basicSetExceptionVariable(newExceptionVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.VARIABLE_CATCH_BLOCK__EXCEPTION_VARIABLE, newExceptionVariable, newExceptionVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.VARIABLE_CATCH_BLOCK__EXCEPTION_VARIABLE:
				return basicSetExceptionVariable(null, msgs);
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
			case GASTMPackage.VARIABLE_CATCH_BLOCK__EXCEPTION_VARIABLE:
				return getExceptionVariable();
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
			case GASTMPackage.VARIABLE_CATCH_BLOCK__EXCEPTION_VARIABLE:
				setExceptionVariable((DataDefinition)newValue);
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
			case GASTMPackage.VARIABLE_CATCH_BLOCK__EXCEPTION_VARIABLE:
				setExceptionVariable((DataDefinition)null);
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
			case GASTMPackage.VARIABLE_CATCH_BLOCK__EXCEPTION_VARIABLE:
				return exceptionVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableCatchBlockImpl
