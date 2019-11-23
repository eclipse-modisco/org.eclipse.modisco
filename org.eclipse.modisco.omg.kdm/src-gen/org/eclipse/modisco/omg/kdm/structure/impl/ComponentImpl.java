/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
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
import org.eclipse.modisco.omg.kdm.structure.Component;
import org.eclipse.modisco.omg.kdm.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.structure.impl.ComponentImpl#getAggregated <em>Aggregated</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.structure.impl.ComponentImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.structure.impl.ComponentImpl#getStructureElement <em>Structure Element</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.structure.impl.ComponentImpl#getStructureRelationship <em>Structure Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends KDMEntityImpl implements Component {
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
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregatedRelationship> getAggregated() {
		if (aggregated == null) {
			aggregated = new EObjectContainmentEList<AggregatedRelationship>(AggregatedRelationship.class, this, StructurePackage.COMPONENT__AGGREGATED);
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
			implementation = new EObjectResolvingEList<KDMEntity>(KDMEntity.class, this, StructurePackage.COMPONENT__IMPLEMENTATION);
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
			structureElement = new EObjectContainmentEList<AbstractStructureElement>(AbstractStructureElement.class, this, StructurePackage.COMPONENT__STRUCTURE_ELEMENT);
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
			structureRelationship = new EObjectContainmentEList<AbstractStructureRelationship>(AbstractStructureRelationship.class, this, StructurePackage.COMPONENT__STRUCTURE_RELATIONSHIP);
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
			case StructurePackage.COMPONENT__AGGREGATED:
				return ((InternalEList<?>)getAggregated()).basicRemove(otherEnd, msgs);
			case StructurePackage.COMPONENT__STRUCTURE_ELEMENT:
				return ((InternalEList<?>)getStructureElement()).basicRemove(otherEnd, msgs);
			case StructurePackage.COMPONENT__STRUCTURE_RELATIONSHIP:
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
			case StructurePackage.COMPONENT__AGGREGATED:
				return getAggregated();
			case StructurePackage.COMPONENT__IMPLEMENTATION:
				return getImplementation();
			case StructurePackage.COMPONENT__STRUCTURE_ELEMENT:
				return getStructureElement();
			case StructurePackage.COMPONENT__STRUCTURE_RELATIONSHIP:
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
			case StructurePackage.COMPONENT__AGGREGATED:
				getAggregated().clear();
				getAggregated().addAll((Collection<? extends AggregatedRelationship>)newValue);
				return;
			case StructurePackage.COMPONENT__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends KDMEntity>)newValue);
				return;
			case StructurePackage.COMPONENT__STRUCTURE_ELEMENT:
				getStructureElement().clear();
				getStructureElement().addAll((Collection<? extends AbstractStructureElement>)newValue);
				return;
			case StructurePackage.COMPONENT__STRUCTURE_RELATIONSHIP:
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
			case StructurePackage.COMPONENT__AGGREGATED:
				getAggregated().clear();
				return;
			case StructurePackage.COMPONENT__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case StructurePackage.COMPONENT__STRUCTURE_ELEMENT:
				getStructureElement().clear();
				return;
			case StructurePackage.COMPONENT__STRUCTURE_RELATIONSHIP:
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
			case StructurePackage.COMPONENT__AGGREGATED:
				return aggregated != null && !aggregated.isEmpty();
			case StructurePackage.COMPONENT__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case StructurePackage.COMPONENT__STRUCTURE_ELEMENT:
				return structureElement != null && !structureElement.isEmpty();
			case StructurePackage.COMPONENT__STRUCTURE_RELATIONSHIP:
				return structureRelationship != null && !structureRelationship.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
