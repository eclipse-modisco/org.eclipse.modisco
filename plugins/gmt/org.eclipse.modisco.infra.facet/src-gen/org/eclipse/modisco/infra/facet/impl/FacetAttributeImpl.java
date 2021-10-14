/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - meta-model design
 *     Gregoire DUPE (Mia-Software) - design and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.facet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.modisco.infra.facet.FacetAttribute;
import org.eclipse.modisco.infra.facet.FacetPackage;
import org.eclipse.modisco.infra.facet.FacetStructuralFeature;
import org.eclipse.modisco.infra.query.ModelQuery;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.facet.impl.FacetAttributeImpl#getValueQuery <em>Value Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public class FacetAttributeImpl extends EAttributeImpl implements FacetAttribute {
	/**
	 * The cached value of the '{@link #getValueQuery() <em>Value Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueQuery()
	 * @generated
	 * @ordered
	 */
	protected ModelQuery valueQuery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacetPackage.Literals.FACET_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelQuery getValueQuery() {
		if (valueQuery != null && valueQuery.eIsProxy()) {
			InternalEObject oldValueQuery = (InternalEObject)valueQuery;
			valueQuery = (ModelQuery)eResolveProxy(oldValueQuery);
			if (valueQuery != oldValueQuery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacetPackage.FACET_ATTRIBUTE__VALUE_QUERY, oldValueQuery, valueQuery));
			}
		}
		return valueQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelQuery basicGetValueQuery() {
		return valueQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueQuery(ModelQuery newValueQuery) {
		ModelQuery oldValueQuery = valueQuery;
		valueQuery = newValueQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacetPackage.FACET_ATTRIBUTE__VALUE_QUERY, oldValueQuery, valueQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacetPackage.FACET_ATTRIBUTE__VALUE_QUERY:
				if (resolve) return getValueQuery();
				return basicGetValueQuery();
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
			case FacetPackage.FACET_ATTRIBUTE__VALUE_QUERY:
				setValueQuery((ModelQuery)newValue);
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
			case FacetPackage.FACET_ATTRIBUTE__VALUE_QUERY:
				setValueQuery((ModelQuery)null);
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
			case FacetPackage.FACET_ATTRIBUTE__VALUE_QUERY:
				return valueQuery != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FacetStructuralFeature.class) {
			switch (derivedFeatureID) {
				case FacetPackage.FACET_ATTRIBUTE__VALUE_QUERY: return FacetPackage.FACET_STRUCTURAL_FEATURE__VALUE_QUERY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FacetStructuralFeature.class) {
			switch (baseFeatureID) {
				case FacetPackage.FACET_STRUCTURAL_FEATURE__VALUE_QUERY: return FacetPackage.FACET_ATTRIBUTE__VALUE_QUERY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FacetAttributeImpl
