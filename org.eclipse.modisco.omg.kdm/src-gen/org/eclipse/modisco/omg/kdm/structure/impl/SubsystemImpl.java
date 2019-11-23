/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.omg.kdm.core.AggregatedRelationship;
import org.eclipse.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl;
import org.eclipse.modisco.omg.kdm.structure.AbstractStructureElement;
import org.eclipse.modisco.omg.kdm.structure.AbstractStructureRelationship;
import org.eclipse.modisco.omg.kdm.structure.StructurePackage;
import org.eclipse.modisco.omg.kdm.structure.Subsystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subsystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.structure.impl.SubsystemImpl#getAggregated <em>Aggregated</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.structure.impl.SubsystemImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.structure.impl.SubsystemImpl#getStructureElement <em>Structure Element</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.structure.impl.SubsystemImpl#getStructureRelationship <em>Structure Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubsystemImpl extends KDMEntityImpl implements Subsystem {
	/**
	 * The cached value of the '{@link #getAggregated() <em>Aggregated</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregated()
	 * @generated
	 * @ordered
	 */
	protected EList<AggregatedRelationship> aggregated;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<KDMEntity> implementation;

	/**
	 * The cached value of the '{@link #getStructureElement() <em>Structure Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractStructureElement> structureElement;

	/**
	 * The cached value of the '{@link #getStructureRelationship() <em>Structure Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractStructureRelationship> structureRelationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubsystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.SUBSYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregatedRelationship> getAggregated() {
		if (aggregated == null) {
			aggregated = new EObjectContainmentEList<AggregatedRelationship>(AggregatedRelationship.class, this, StructurePackage.SUBSYSTEM__AGGREGATED);
		}
		return aggregated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<KDMEntity>(KDMEntity.class, this, StructurePackage.SUBSYSTEM__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractStructureElement> getStructureElement() {
		if (structureElement == null) {
			structureElement = new EObjectContainmentEList<AbstractStructureElement>(AbstractStructureElement.class, this, StructurePackage.SUBSYSTEM__STRUCTURE_ELEMENT);
		}
		return structureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractStructureRelationship> getStructureRelationship() {
		if (structureRelationship == null) {
			structureRelationship = new EObjectContainmentEList<AbstractStructureRelationship>(AbstractStructureRelationship.class, this, StructurePackage.SUBSYSTEM__STRUCTURE_RELATIONSHIP);
		}
		return structureRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.SUBSYSTEM__AGGREGATED:
				return ((InternalEList<?>)getAggregated()).basicRemove(otherEnd, msgs);
			case StructurePackage.SUBSYSTEM__STRUCTURE_ELEMENT:
				return ((InternalEList<?>)getStructureElement()).basicRemove(otherEnd, msgs);
			case StructurePackage.SUBSYSTEM__STRUCTURE_RELATIONSHIP:
				return ((InternalEList<?>)getStructureRelationship()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.SUBSYSTEM__AGGREGATED:
				return getAggregated();
			case StructurePackage.SUBSYSTEM__IMPLEMENTATION:
				return getImplementation();
			case StructurePackage.SUBSYSTEM__STRUCTURE_ELEMENT:
				return getStructureElement();
			case StructurePackage.SUBSYSTEM__STRUCTURE_RELATIONSHIP:
				return getStructureRelationship();
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
			case StructurePackage.SUBSYSTEM__AGGREGATED:
				getAggregated().clear();
				getAggregated().addAll((Collection<? extends AggregatedRelationship>)newValue);
				return;
			case StructurePackage.SUBSYSTEM__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends KDMEntity>)newValue);
				return;
			case StructurePackage.SUBSYSTEM__STRUCTURE_ELEMENT:
				getStructureElement().clear();
				getStructureElement().addAll((Collection<? extends AbstractStructureElement>)newValue);
				return;
			case StructurePackage.SUBSYSTEM__STRUCTURE_RELATIONSHIP:
				getStructureRelationship().clear();
				getStructureRelationship().addAll((Collection<? extends AbstractStructureRelationship>)newValue);
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
			case StructurePackage.SUBSYSTEM__AGGREGATED:
				getAggregated().clear();
				return;
			case StructurePackage.SUBSYSTEM__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case StructurePackage.SUBSYSTEM__STRUCTURE_ELEMENT:
				getStructureElement().clear();
				return;
			case StructurePackage.SUBSYSTEM__STRUCTURE_RELATIONSHIP:
				getStructureRelationship().clear();
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
			case StructurePackage.SUBSYSTEM__AGGREGATED:
				return aggregated != null && !aggregated.isEmpty();
			case StructurePackage.SUBSYSTEM__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case StructurePackage.SUBSYSTEM__STRUCTURE_ELEMENT:
				return structureElement != null && !structureElement.isEmpty();
			case StructurePackage.SUBSYSTEM__STRUCTURE_RELATIONSHIP:
				return structureRelationship != null && !structureRelationship.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubsystemImpl
