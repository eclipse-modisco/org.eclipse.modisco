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

import org.eclipse.modisco.omg.gastm.AggregateType;
import org.eclipse.modisco.omg.gastm.AggregateTypeDefinition;
import org.eclipse.modisco.omg.gastm.GASTMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.AggregateTypeDefinitionImpl#getAggregateType <em>Aggregate Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregateTypeDefinitionImpl extends TypeDefinitionImpl implements AggregateTypeDefinition {
	/**
	 * The cached value of the '{@link #getAggregateType() <em>Aggregate Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateType()
	 * @generated
	 * @ordered
	 */
	protected AggregateType aggregateType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getAggregateTypeDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateType getAggregateType() {
		return aggregateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregateType(AggregateType newAggregateType, NotificationChain msgs) {
		AggregateType oldAggregateType = aggregateType;
		aggregateType = newAggregateType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.AGGREGATE_TYPE_DEFINITION__AGGREGATE_TYPE, oldAggregateType, newAggregateType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregateType(AggregateType newAggregateType) {
		if (newAggregateType != aggregateType) {
			NotificationChain msgs = null;
			if (aggregateType != null)
				msgs = ((InternalEObject)aggregateType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.AGGREGATE_TYPE_DEFINITION__AGGREGATE_TYPE, null, msgs);
			if (newAggregateType != null)
				msgs = ((InternalEObject)newAggregateType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.AGGREGATE_TYPE_DEFINITION__AGGREGATE_TYPE, null, msgs);
			msgs = basicSetAggregateType(newAggregateType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.AGGREGATE_TYPE_DEFINITION__AGGREGATE_TYPE, newAggregateType, newAggregateType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.AGGREGATE_TYPE_DEFINITION__AGGREGATE_TYPE:
				return basicSetAggregateType(null, msgs);
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
			case GASTMPackage.AGGREGATE_TYPE_DEFINITION__AGGREGATE_TYPE:
				return getAggregateType();
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
			case GASTMPackage.AGGREGATE_TYPE_DEFINITION__AGGREGATE_TYPE:
				setAggregateType((AggregateType)newValue);
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
			case GASTMPackage.AGGREGATE_TYPE_DEFINITION__AGGREGATE_TYPE:
				setAggregateType((AggregateType)null);
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
			case GASTMPackage.AGGREGATE_TYPE_DEFINITION__AGGREGATE_TYPE:
				return aggregateType != null;
		}
		return super.eIsSet(featureID);
	}

} //AggregateTypeDefinitionImpl
