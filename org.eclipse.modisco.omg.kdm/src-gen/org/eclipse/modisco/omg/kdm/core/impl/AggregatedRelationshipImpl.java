/**
 * *******************************************************************************
 * Copyright (c) 2008, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.modisco.omg.kdm.core.AggregatedRelationship;
import org.eclipse.modisco.omg.kdm.core.CorePackage;
import org.eclipse.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.modisco.omg.kdm.core.KDMRelationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregated Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.core.impl.AggregatedRelationshipImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.core.impl.AggregatedRelationshipImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.core.impl.AggregatedRelationshipImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.core.impl.AggregatedRelationshipImpl#getDensity <em>Density</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregatedRelationshipImpl extends ModelElementImpl implements AggregatedRelationship {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected KDMEntity from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected KDMEntity to;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<KDMRelationship> relation;

	/**
	 * The default value of the '{@link #getDensity() <em>Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDensity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DENSITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDensity() <em>Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDensity()
	 * @generated
	 * @ordered
	 */
	protected Integer density = DENSITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregatedRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.AGGREGATED_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDMEntity getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (KDMEntity)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.AGGREGATED_RELATIONSHIP__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDMEntity basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(KDMEntity newFrom, NotificationChain msgs) {
		KDMEntity oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.AGGREGATED_RELATIONSHIP__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(KDMEntity newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, CorePackage.KDM_ENTITY__OUT_AGGREGATED, KDMEntity.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, CorePackage.KDM_ENTITY__OUT_AGGREGATED, KDMEntity.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.AGGREGATED_RELATIONSHIP__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDMEntity getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (KDMEntity)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.AGGREGATED_RELATIONSHIP__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDMEntity basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(KDMEntity newTo, NotificationChain msgs) {
		KDMEntity oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.AGGREGATED_RELATIONSHIP__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(KDMEntity newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, CorePackage.KDM_ENTITY__IN_AGGREGATED, KDMEntity.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, CorePackage.KDM_ENTITY__IN_AGGREGATED, KDMEntity.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.AGGREGATED_RELATIONSHIP__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMRelationship> getRelation() {
		if (relation == null) {
			relation = new EObjectResolvingEList<KDMRelationship>(KDMRelationship.class, this, CorePackage.AGGREGATED_RELATIONSHIP__RELATION);
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDensity() {
		return density;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDensity(Integer newDensity) {
		Integer oldDensity = density;
		density = newDensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.AGGREGATED_RELATIONSHIP__DENSITY, oldDensity, density));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.AGGREGATED_RELATIONSHIP__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, CorePackage.KDM_ENTITY__OUT_AGGREGATED, KDMEntity.class, msgs);
				return basicSetFrom((KDMEntity)otherEnd, msgs);
			case CorePackage.AGGREGATED_RELATIONSHIP__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, CorePackage.KDM_ENTITY__IN_AGGREGATED, KDMEntity.class, msgs);
				return basicSetTo((KDMEntity)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.AGGREGATED_RELATIONSHIP__FROM:
				return basicSetFrom(null, msgs);
			case CorePackage.AGGREGATED_RELATIONSHIP__TO:
				return basicSetTo(null, msgs);
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
			case CorePackage.AGGREGATED_RELATIONSHIP__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case CorePackage.AGGREGATED_RELATIONSHIP__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case CorePackage.AGGREGATED_RELATIONSHIP__RELATION:
				return getRelation();
			case CorePackage.AGGREGATED_RELATIONSHIP__DENSITY:
				return getDensity();
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
			case CorePackage.AGGREGATED_RELATIONSHIP__FROM:
				setFrom((KDMEntity)newValue);
				return;
			case CorePackage.AGGREGATED_RELATIONSHIP__TO:
				setTo((KDMEntity)newValue);
				return;
			case CorePackage.AGGREGATED_RELATIONSHIP__RELATION:
				getRelation().clear();
				getRelation().addAll((Collection<? extends KDMRelationship>)newValue);
				return;
			case CorePackage.AGGREGATED_RELATIONSHIP__DENSITY:
				setDensity((Integer)newValue);
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
			case CorePackage.AGGREGATED_RELATIONSHIP__FROM:
				setFrom((KDMEntity)null);
				return;
			case CorePackage.AGGREGATED_RELATIONSHIP__TO:
				setTo((KDMEntity)null);
				return;
			case CorePackage.AGGREGATED_RELATIONSHIP__RELATION:
				getRelation().clear();
				return;
			case CorePackage.AGGREGATED_RELATIONSHIP__DENSITY:
				setDensity(DENSITY_EDEFAULT);
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
			case CorePackage.AGGREGATED_RELATIONSHIP__FROM:
				return from != null;
			case CorePackage.AGGREGATED_RELATIONSHIP__TO:
				return to != null;
			case CorePackage.AGGREGATED_RELATIONSHIP__RELATION:
				return relation != null && !relation.isEmpty();
			case CorePackage.AGGREGATED_RELATIONSHIP__DENSITY:
				return DENSITY_EDEFAULT == null ? density != null : !DENSITY_EDEFAULT.equals(density);
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
		result.append(" (density: "); //$NON-NLS-1$
		result.append(density);
		result.append(')');
		return result.toString();
	}

} //AggregatedRelationshipImpl
