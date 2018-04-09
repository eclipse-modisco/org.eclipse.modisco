/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.omg.smm.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.modisco.omg.smm.AbstractMeasureElement;
import org.eclipse.modisco.omg.smm.CategoryRelationship;
import org.eclipse.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Measure Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.AbstractMeasureElementImpl#getInCategory <em>In Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractMeasureElementImpl extends SmmElementImpl implements AbstractMeasureElement {
	/**
	 * The cached value of the '{@link #getInCategory() <em>In Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryRelationship> inCategory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMeasureElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.ABSTRACT_MEASURE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryRelationship> getInCategory() {
		if (inCategory == null) {
			inCategory = new EObjectResolvingEList<CategoryRelationship>(CategoryRelationship.class, this, SmmPackage.ABSTRACT_MEASURE_ELEMENT__IN_CATEGORY);
		}
		return inCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmmPackage.ABSTRACT_MEASURE_ELEMENT__IN_CATEGORY:
				return getInCategory();
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
			case SmmPackage.ABSTRACT_MEASURE_ELEMENT__IN_CATEGORY:
				getInCategory().clear();
				getInCategory().addAll((Collection<? extends CategoryRelationship>)newValue);
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
			case SmmPackage.ABSTRACT_MEASURE_ELEMENT__IN_CATEGORY:
				getInCategory().clear();
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
			case SmmPackage.ABSTRACT_MEASURE_ELEMENT__IN_CATEGORY:
				return inCategory != null && !inCategory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractMeasureElementImpl
