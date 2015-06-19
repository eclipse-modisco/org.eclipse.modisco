/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - meta-model design
 *     Gregoire DUPE (Mia-Software) - design and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.infra.query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.modisco.infra.query.ModelQuery;
import org.eclipse.gmt.modisco.infra.query.ModelQuerySet;
import org.eclipse.gmt.modisco.infra.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Query Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.infra.query.impl.ModelQuerySetImpl#getAssociatedMetamodels <em>Associated Metamodels</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.query.impl.ModelQuerySetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.query.impl.ModelQuerySetImpl#isIsEditable <em>Is Editable</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.query.impl.ModelQuerySetImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.query.impl.ModelQuerySetImpl#getQueries <em>Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class ModelQuerySetImpl extends EObjectImpl implements ModelQuerySet {
	/**
	 * The cached value of the '{@link #getAssociatedMetamodels() <em>Associated Metamodels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedMetamodels()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> associatedMetamodels;

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
	 * The default value of the '{@link #isIsEditable() <em>Is Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEditable() <em>Is Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean isEditable = IS_EDITABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQueries() <em>Queries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueries()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelQuery> queries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelQuerySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.MODEL_QUERY_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPackage> getAssociatedMetamodels() {
		if (associatedMetamodels == null) {
			associatedMetamodels = new EObjectResolvingEList<EPackage>(EPackage.class, this, QueryPackage.MODEL_QUERY_SET__ASSOCIATED_METAMODELS);
		}
		return associatedMetamodels;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.MODEL_QUERY_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEditable() {
		return isEditable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEditable(boolean newIsEditable) {
		boolean oldIsEditable = isEditable;
		isEditable = newIsEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.MODEL_QUERY_SET__IS_EDITABLE, oldIsEditable, isEditable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.MODEL_QUERY_SET__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelQuery> getQueries() {
		if (queries == null) {
			queries = new EObjectContainmentWithInverseEList<ModelQuery>(ModelQuery.class, this, QueryPackage.MODEL_QUERY_SET__QUERIES, QueryPackage.MODEL_QUERY__MODEL_QUERY_SET);
		}
		return queries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ModelQuery getQuery(String name) {
		if (name == null) {
			return null;
		}
		ModelQuery result = null;
		for (ModelQuery query : this.getQueries()) {
			if (name.equals(query.getName())) {
				result = query;
				break;
			}
		}
		return result;
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
			case QueryPackage.MODEL_QUERY_SET__QUERIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQueries()).basicAdd(otherEnd, msgs);
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
			case QueryPackage.MODEL_QUERY_SET__QUERIES:
				return ((InternalEList<?>)getQueries()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.MODEL_QUERY_SET__ASSOCIATED_METAMODELS:
				return getAssociatedMetamodels();
			case QueryPackage.MODEL_QUERY_SET__NAME:
				return getName();
			case QueryPackage.MODEL_QUERY_SET__IS_EDITABLE:
				return isIsEditable();
			case QueryPackage.MODEL_QUERY_SET__DESCRIPTION:
				return getDescription();
			case QueryPackage.MODEL_QUERY_SET__QUERIES:
				return getQueries();
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
			case QueryPackage.MODEL_QUERY_SET__ASSOCIATED_METAMODELS:
				getAssociatedMetamodels().clear();
				getAssociatedMetamodels().addAll((Collection<? extends EPackage>)newValue);
				return;
			case QueryPackage.MODEL_QUERY_SET__NAME:
				setName((String)newValue);
				return;
			case QueryPackage.MODEL_QUERY_SET__IS_EDITABLE:
				setIsEditable((Boolean)newValue);
				return;
			case QueryPackage.MODEL_QUERY_SET__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case QueryPackage.MODEL_QUERY_SET__QUERIES:
				getQueries().clear();
				getQueries().addAll((Collection<? extends ModelQuery>)newValue);
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
			case QueryPackage.MODEL_QUERY_SET__ASSOCIATED_METAMODELS:
				getAssociatedMetamodels().clear();
				return;
			case QueryPackage.MODEL_QUERY_SET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QueryPackage.MODEL_QUERY_SET__IS_EDITABLE:
				setIsEditable(IS_EDITABLE_EDEFAULT);
				return;
			case QueryPackage.MODEL_QUERY_SET__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case QueryPackage.MODEL_QUERY_SET__QUERIES:
				getQueries().clear();
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
			case QueryPackage.MODEL_QUERY_SET__ASSOCIATED_METAMODELS:
				return associatedMetamodels != null && !associatedMetamodels.isEmpty();
			case QueryPackage.MODEL_QUERY_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QueryPackage.MODEL_QUERY_SET__IS_EDITABLE:
				return isEditable != IS_EDITABLE_EDEFAULT;
			case QueryPackage.MODEL_QUERY_SET__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case QueryPackage.MODEL_QUERY_SET__QUERIES:
				return queries != null && !queries.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isEditable: ");
		result.append(isEditable);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ModelQuerySetImpl
