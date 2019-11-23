/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.omg.smm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.omg.smm.Measure;
import org.eclipse.modisco.omg.smm.MeasureCategory;
import org.eclipse.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.MeasureCategoryImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.MeasureCategoryImpl#getCategoryElement <em>Category Element</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.MeasureCategoryImpl#getCategoryMeasure <em>Category Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureCategoryImpl extends AbstractMeasureElementImpl implements MeasureCategory {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureCategory> category;

	/**
	 * The cached value of the '{@link #getCategoryElement() <em>Category Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryElement()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureCategory> categoryElement;

	/**
	 * The cached value of the '{@link #getCategoryMeasure() <em>Category Measure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> categoryMeasure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.MEASURE_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureCategory> getCategory() {
		if (category == null) {
			category = new EObjectWithInverseResolvingEList.ManyInverse<MeasureCategory>(MeasureCategory.class, this, SmmPackage.MEASURE_CATEGORY__CATEGORY, SmmPackage.MEASURE_CATEGORY__CATEGORY_ELEMENT);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureCategory> getCategoryElement() {
		if (categoryElement == null) {
			categoryElement = new EObjectWithInverseResolvingEList.ManyInverse<MeasureCategory>(MeasureCategory.class, this, SmmPackage.MEASURE_CATEGORY__CATEGORY_ELEMENT, SmmPackage.MEASURE_CATEGORY__CATEGORY);
		}
		return categoryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getCategoryMeasure() {
		if (categoryMeasure == null) {
			categoryMeasure = new EObjectWithInverseResolvingEList.ManyInverse<Measure>(Measure.class, this, SmmPackage.MEASURE_CATEGORY__CATEGORY_MEASURE, SmmPackage.MEASURE__CATEGORY);
		}
		return categoryMeasure;
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
			case SmmPackage.MEASURE_CATEGORY__CATEGORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategory()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASURE_CATEGORY__CATEGORY_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategoryElement()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASURE_CATEGORY__CATEGORY_MEASURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategoryMeasure()).basicAdd(otherEnd, msgs);
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
			case SmmPackage.MEASURE_CATEGORY__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASURE_CATEGORY__CATEGORY_ELEMENT:
				return ((InternalEList<?>)getCategoryElement()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASURE_CATEGORY__CATEGORY_MEASURE:
				return ((InternalEList<?>)getCategoryMeasure()).basicRemove(otherEnd, msgs);
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
			case SmmPackage.MEASURE_CATEGORY__CATEGORY:
				return getCategory();
			case SmmPackage.MEASURE_CATEGORY__CATEGORY_ELEMENT:
				return getCategoryElement();
			case SmmPackage.MEASURE_CATEGORY__CATEGORY_MEASURE:
				return getCategoryMeasure();
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
			case SmmPackage.MEASURE_CATEGORY__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends MeasureCategory>)newValue);
				return;
			case SmmPackage.MEASURE_CATEGORY__CATEGORY_ELEMENT:
				getCategoryElement().clear();
				getCategoryElement().addAll((Collection<? extends MeasureCategory>)newValue);
				return;
			case SmmPackage.MEASURE_CATEGORY__CATEGORY_MEASURE:
				getCategoryMeasure().clear();
				getCategoryMeasure().addAll((Collection<? extends Measure>)newValue);
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
			case SmmPackage.MEASURE_CATEGORY__CATEGORY:
				getCategory().clear();
				return;
			case SmmPackage.MEASURE_CATEGORY__CATEGORY_ELEMENT:
				getCategoryElement().clear();
				return;
			case SmmPackage.MEASURE_CATEGORY__CATEGORY_MEASURE:
				getCategoryMeasure().clear();
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
			case SmmPackage.MEASURE_CATEGORY__CATEGORY:
				return category != null && !category.isEmpty();
			case SmmPackage.MEASURE_CATEGORY__CATEGORY_ELEMENT:
				return categoryElement != null && !categoryElement.isEmpty();
			case SmmPackage.MEASURE_CATEGORY__CATEGORY_MEASURE:
				return categoryMeasure != null && !categoryMeasure.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureCategoryImpl
