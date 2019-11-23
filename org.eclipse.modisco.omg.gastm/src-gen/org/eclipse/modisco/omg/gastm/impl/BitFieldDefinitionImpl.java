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

import org.eclipse.modisco.omg.gastm.BitFieldDefinition;
import org.eclipse.modisco.omg.gastm.Expression;
import org.eclipse.modisco.omg.gastm.GASTMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bit Field Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.BitFieldDefinitionImpl#getBitFieldSize <em>Bit Field Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BitFieldDefinitionImpl extends DataDefinitionImpl implements BitFieldDefinition {
	/**
	 * The cached value of the '{@link #getBitFieldSize() <em>Bit Field Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitFieldSize()
	 * @generated
	 * @ordered
	 */
	protected Expression bitFieldSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitFieldDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getBitFieldDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getBitFieldSize() {
		return bitFieldSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBitFieldSize(Expression newBitFieldSize, NotificationChain msgs) {
		Expression oldBitFieldSize = bitFieldSize;
		bitFieldSize = newBitFieldSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.BIT_FIELD_DEFINITION__BIT_FIELD_SIZE, oldBitFieldSize, newBitFieldSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitFieldSize(Expression newBitFieldSize) {
		if (newBitFieldSize != bitFieldSize) {
			NotificationChain msgs = null;
			if (bitFieldSize != null)
				msgs = ((InternalEObject)bitFieldSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.BIT_FIELD_DEFINITION__BIT_FIELD_SIZE, null, msgs);
			if (newBitFieldSize != null)
				msgs = ((InternalEObject)newBitFieldSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.BIT_FIELD_DEFINITION__BIT_FIELD_SIZE, null, msgs);
			msgs = basicSetBitFieldSize(newBitFieldSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.BIT_FIELD_DEFINITION__BIT_FIELD_SIZE, newBitFieldSize, newBitFieldSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.BIT_FIELD_DEFINITION__BIT_FIELD_SIZE:
				return basicSetBitFieldSize(null, msgs);
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
			case GASTMPackage.BIT_FIELD_DEFINITION__BIT_FIELD_SIZE:
				return getBitFieldSize();
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
			case GASTMPackage.BIT_FIELD_DEFINITION__BIT_FIELD_SIZE:
				setBitFieldSize((Expression)newValue);
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
			case GASTMPackage.BIT_FIELD_DEFINITION__BIT_FIELD_SIZE:
				setBitFieldSize((Expression)null);
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
			case GASTMPackage.BIT_FIELD_DEFINITION__BIT_FIELD_SIZE:
				return bitFieldSize != null;
		}
		return super.eIsSet(featureID);
	}

} //BitFieldDefinitionImpl
