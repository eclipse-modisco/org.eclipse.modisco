/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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

import org.eclipse.modisco.omg.gastm.AggregateScope;
import org.eclipse.modisco.omg.gastm.AggregateType;
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.MemberObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.AggregateTypeImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.AggregateTypeImpl#getOpensScope <em>Opens Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AggregateTypeImpl extends DataTypeImpl implements AggregateType {
	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<MemberObject> members;

	/**
	 * The cached value of the '{@link #getOpensScope() <em>Opens Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpensScope()
	 * @generated
	 * @ordered
	 */
	protected AggregateScope opensScope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getAggregateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemberObject> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<MemberObject>(MemberObject.class, this, GASTMPackage.AGGREGATE_TYPE__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateScope getOpensScope() {
		if (opensScope != null && opensScope.eIsProxy()) {
			InternalEObject oldOpensScope = (InternalEObject)opensScope;
			opensScope = (AggregateScope)eResolveProxy(oldOpensScope);
			if (opensScope != oldOpensScope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GASTMPackage.AGGREGATE_TYPE__OPENS_SCOPE, oldOpensScope, opensScope));
			}
		}
		return opensScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateScope basicGetOpensScope() {
		return opensScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpensScope(AggregateScope newOpensScope) {
		AggregateScope oldOpensScope = opensScope;
		opensScope = newOpensScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.AGGREGATE_TYPE__OPENS_SCOPE, oldOpensScope, opensScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.AGGREGATE_TYPE__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
			case GASTMPackage.AGGREGATE_TYPE__MEMBERS:
				return getMembers();
			case GASTMPackage.AGGREGATE_TYPE__OPENS_SCOPE:
				if (resolve) return getOpensScope();
				return basicGetOpensScope();
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
			case GASTMPackage.AGGREGATE_TYPE__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends MemberObject>)newValue);
				return;
			case GASTMPackage.AGGREGATE_TYPE__OPENS_SCOPE:
				setOpensScope((AggregateScope)newValue);
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
			case GASTMPackage.AGGREGATE_TYPE__MEMBERS:
				getMembers().clear();
				return;
			case GASTMPackage.AGGREGATE_TYPE__OPENS_SCOPE:
				setOpensScope((AggregateScope)null);
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
			case GASTMPackage.AGGREGATE_TYPE__MEMBERS:
				return members != null && !members.isEmpty();
			case GASTMPackage.AGGREGATE_TYPE__OPENS_SCOPE:
				return opensScope != null;
		}
		return super.eIsSet(featureID);
	}

} //AggregateTypeImpl
