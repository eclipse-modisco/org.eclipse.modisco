/**
 * 
 * Copyright (c) 2009, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.omg.kdm.core.AggregatedRelationship;
import org.eclipse.modisco.omg.kdm.core.CoreFactory;
import org.eclipse.modisco.omg.kdm.core.CorePackage;
import org.eclipse.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.modisco.omg.kdm.core.KDMRelationship;
import org.eclipse.modisco.omg.kdm.kdm.KDMModel;
import org.eclipse.modisco.omg.kdm.kdm.KdmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KDM Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl#getOutbound <em>Outbound</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl#getInbound <em>Inbound</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl#getOwnedRelation <em>Owned Relation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl#getGroupedElement <em>Grouped Element</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl#getInAggregated <em>In Aggregated</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl#getOutAggregated <em>Out Aggregated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class KDMEntityImpl extends ModelElementImpl implements KDMEntity {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected KDMModel model;

	/**
	 * The cached value of the '{@link #getOwnedElement() <em>Owned Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<KDMEntity> ownedElement;

	/**
	 * The cached value of the '{@link #getOutbound() <em>Outbound</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutbound()
	 * @generated
	 * @ordered
	 */
	protected EList<KDMRelationship> outbound;

	/**
	 * The cached value of the '{@link #getInbound() <em>Inbound</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInbound()
	 * @generated
	 * @ordered
	 */
	protected EList<KDMRelationship> inbound;

	/**
	 * The cached value of the '{@link #getOwnedRelation() <em>Owned Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<KDMRelationship> ownedRelation;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<KDMEntity> group;

	/**
	 * The cached value of the '{@link #getGroupedElement() <em>Grouped Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<KDMEntity> groupedElement;

	/**
	 * The cached value of the '{@link #getInAggregated() <em>In Aggregated</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInAggregated()
	 * @generated
	 * @ordered
	 */
	protected EList<AggregatedRelationship> inAggregated;

	/**
	 * The cached value of the '{@link #getOutAggregated() <em>Out Aggregated</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutAggregated()
	 * @generated
	 * @ordered
	 */
	protected EList<AggregatedRelationship> outAggregated;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KDMEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.KDM_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.KDM_ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDMModel getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (KDMModel)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.KDM_ENTITY__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDMModel basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(KDMModel newModel, NotificationChain msgs) {
		KDMModel oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.KDM_ENTITY__MODEL, oldModel, newModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AggregatedRelationship createAggregation(KDMEntity otherEntity) {
		AggregatedRelationship result = CoreFactory.eINSTANCE.createAggregatedRelationship();
		
		result.setFrom(this);
		this.getOutAggregated().add(result);
		
		result.setTo(otherEntity);
		otherEntity.getInAggregated().add(result);
		
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void deleteAggregation(AggregatedRelationship aggregation) {
		if (this.getInAggregated().contains(aggregation)) {
			this.getInAggregated().remove(aggregation);
			aggregation.setTo(null);
			if (aggregation.getFrom() != null) {
				aggregation.getFrom().deleteAggregation(aggregation);
			}
		}
		if (this.getOutAggregated().contains(aggregation)) {
			this.getOutAggregated().remove(aggregation);
			aggregation.setFrom(null);
			if (aggregation.getTo() != null) {
				aggregation.getTo().deleteAggregation(aggregation);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMRelationship> getInbound() {
		if (inbound == null) {
			inbound = new EObjectResolvingEList<KDMRelationship>(KDMRelationship.class, this, CorePackage.KDM_ENTITY__INBOUND);
		}
		return inbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMRelationship> getOutbound() {
		if (outbound == null) {
			outbound = new EObjectResolvingEList<KDMRelationship>(KDMRelationship.class, this, CorePackage.KDM_ENTITY__OUTBOUND);
		}
		return outbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMRelationship> getOwnedRelation() {
		if (ownedRelation == null) {
			ownedRelation = new EObjectContainmentEList<KDMRelationship>(KDMRelationship.class, this, CorePackage.KDM_ENTITY__OWNED_RELATION);
		}
		return ownedRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregatedRelationship> getInAggregated() {
		if (inAggregated == null) {
			inAggregated = new EObjectWithInverseResolvingEList<AggregatedRelationship>(AggregatedRelationship.class, this, CorePackage.KDM_ENTITY__IN_AGGREGATED, CorePackage.AGGREGATED_RELATIONSHIP__TO);
		}
		return inAggregated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AggregatedRelationship> getOutAggregated() {
		if (outAggregated == null) {
			outAggregated = new EObjectWithInverseResolvingEList<AggregatedRelationship>(AggregatedRelationship.class, this, CorePackage.KDM_ENTITY__OUT_AGGREGATED, CorePackage.AGGREGATED_RELATIONSHIP__FROM);
		}
		return outAggregated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDMEntity getOwner() {
		if (eContainerFeatureID() != CorePackage.KDM_ENTITY__OWNER) return null;
		return (KDMEntity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getOwnedElement() {
		if (ownedElement == null) {
			ownedElement = new EObjectContainmentWithInverseEList<KDMEntity>(KDMEntity.class, this, CorePackage.KDM_ENTITY__OWNED_ELEMENT, CorePackage.KDM_ENTITY__OWNER);
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getGroup() {
		if (group == null) {
			group = new EObjectResolvingEList<KDMEntity>(KDMEntity.class, this, CorePackage.KDM_ENTITY__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getGroupedElement() {
		if (groupedElement == null) {
			groupedElement = new EObjectResolvingEList<KDMEntity>(KDMEntity.class, this, CorePackage.KDM_ENTITY__GROUPED_ELEMENT);
		}
		return groupedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.KDM_ENTITY__MODEL:
				if (model != null)
					msgs = ((InternalEObject)model).eInverseRemove(this, KdmPackage.KDM_MODEL__OWNED_ELEMENT, KDMModel.class, msgs);
				return basicSetModel((KDMModel)otherEnd, msgs);
			case CorePackage.KDM_ENTITY__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, CorePackage.KDM_ENTITY__OWNER, msgs);
			case CorePackage.KDM_ENTITY__OWNED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedElement()).basicAdd(otherEnd, msgs);
			case CorePackage.KDM_ENTITY__IN_AGGREGATED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInAggregated()).basicAdd(otherEnd, msgs);
			case CorePackage.KDM_ENTITY__OUT_AGGREGATED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutAggregated()).basicAdd(otherEnd, msgs);
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
			case CorePackage.KDM_ENTITY__MODEL:
				return basicSetModel(null, msgs);
			case CorePackage.KDM_ENTITY__OWNER:
				return eBasicSetContainer(null, CorePackage.KDM_ENTITY__OWNER, msgs);
			case CorePackage.KDM_ENTITY__OWNED_ELEMENT:
				return ((InternalEList<?>)getOwnedElement()).basicRemove(otherEnd, msgs);
			case CorePackage.KDM_ENTITY__OWNED_RELATION:
				return ((InternalEList<?>)getOwnedRelation()).basicRemove(otherEnd, msgs);
			case CorePackage.KDM_ENTITY__IN_AGGREGATED:
				return ((InternalEList<?>)getInAggregated()).basicRemove(otherEnd, msgs);
			case CorePackage.KDM_ENTITY__OUT_AGGREGATED:
				return ((InternalEList<?>)getOutAggregated()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CorePackage.KDM_ENTITY__OWNER:
				return eInternalContainer().eInverseRemove(this, CorePackage.KDM_ENTITY__OWNED_ELEMENT, KDMEntity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.KDM_ENTITY__NAME:
				return getName();
			case CorePackage.KDM_ENTITY__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case CorePackage.KDM_ENTITY__OWNER:
				return getOwner();
			case CorePackage.KDM_ENTITY__OWNED_ELEMENT:
				return getOwnedElement();
			case CorePackage.KDM_ENTITY__OUTBOUND:
				return getOutbound();
			case CorePackage.KDM_ENTITY__INBOUND:
				return getInbound();
			case CorePackage.KDM_ENTITY__OWNED_RELATION:
				return getOwnedRelation();
			case CorePackage.KDM_ENTITY__GROUP:
				return getGroup();
			case CorePackage.KDM_ENTITY__GROUPED_ELEMENT:
				return getGroupedElement();
			case CorePackage.KDM_ENTITY__IN_AGGREGATED:
				return getInAggregated();
			case CorePackage.KDM_ENTITY__OUT_AGGREGATED:
				return getOutAggregated();
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
			case CorePackage.KDM_ENTITY__NAME:
				setName((String)newValue);
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
			case CorePackage.KDM_ENTITY__NAME:
				setName(NAME_EDEFAULT);
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
			case CorePackage.KDM_ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.KDM_ENTITY__MODEL:
				return model != null;
			case CorePackage.KDM_ENTITY__OWNER:
				return getOwner() != null;
			case CorePackage.KDM_ENTITY__OWNED_ELEMENT:
				return ownedElement != null && !ownedElement.isEmpty();
			case CorePackage.KDM_ENTITY__OUTBOUND:
				return outbound != null && !outbound.isEmpty();
			case CorePackage.KDM_ENTITY__INBOUND:
				return inbound != null && !inbound.isEmpty();
			case CorePackage.KDM_ENTITY__OWNED_RELATION:
				return ownedRelation != null && !ownedRelation.isEmpty();
			case CorePackage.KDM_ENTITY__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.KDM_ENTITY__GROUPED_ELEMENT:
				return groupedElement != null && !groupedElement.isEmpty();
			case CorePackage.KDM_ENTITY__IN_AGGREGATED:
				return inAggregated != null && !inAggregated.isEmpty();
			case CorePackage.KDM_ENTITY__OUT_AGGREGATED:
				return outAggregated != null && !outAggregated.isEmpty();
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //KDMEntityImpl
