/**
 * 
 * Copyright (c) 2009 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.source.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl;
import org.eclipse.modisco.omg.kdm.source.AbstractInventoryElement;
import org.eclipse.modisco.omg.kdm.source.AbstractInventoryRelationship;
import org.eclipse.modisco.omg.kdm.source.SourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Inventory Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.source.impl.AbstractInventoryElementImpl#getInventoryRelationship <em>Inventory Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractInventoryElementImpl extends KDMEntityImpl implements AbstractInventoryElement {
	/**
	 * The cached value of the '{@link #getInventoryRelationship() <em>Inventory Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInventoryRelationship> inventoryRelationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractInventoryElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourcePackage.Literals.ABSTRACT_INVENTORY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInventoryRelationship> getInventoryRelationship() {
		if (inventoryRelationship == null) {
			inventoryRelationship = new EObjectContainmentEList<AbstractInventoryRelationship>(AbstractInventoryRelationship.class, this, SourcePackage.ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATIONSHIP);
		}
		return inventoryRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SourcePackage.ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATIONSHIP:
				return ((InternalEList<?>)getInventoryRelationship()).basicRemove(otherEnd, msgs);
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
			case SourcePackage.ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATIONSHIP:
				return getInventoryRelationship();
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
			case SourcePackage.ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATIONSHIP:
				getInventoryRelationship().clear();
				getInventoryRelationship().addAll((Collection<? extends AbstractInventoryRelationship>)newValue);
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
			case SourcePackage.ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATIONSHIP:
				getInventoryRelationship().clear();
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
			case SourcePackage.ABSTRACT_INVENTORY_ELEMENT__INVENTORY_RELATIONSHIP:
				return inventoryRelationship != null && !inventoryRelationship.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractInventoryElementImpl
