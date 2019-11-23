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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.omg.smm.AbstractMeasureElement;
import org.eclipse.modisco.omg.smm.CategoryRelationship;
import org.eclipse.modisco.omg.smm.MeasureLibrary;
import org.eclipse.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.MeasureLibraryImpl#getMeasureElements <em>Measure Elements</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.MeasureLibraryImpl#getCategoryRelationships <em>Category Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureLibraryImpl extends SmmElementImpl implements MeasureLibrary {
	/**
	 * The cached value of the '{@link #getMeasureElements() <em>Measure Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMeasureElement> measureElements;

	/**
	 * The cached value of the '{@link #getCategoryRelationships() <em>Category Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryRelationship> categoryRelationships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.MEASURE_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractMeasureElement> getMeasureElements() {
		if (measureElements == null) {
			measureElements = new EObjectContainmentEList<AbstractMeasureElement>(AbstractMeasureElement.class, this, SmmPackage.MEASURE_LIBRARY__MEASURE_ELEMENTS);
		}
		return measureElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryRelationship> getCategoryRelationships() {
		if (categoryRelationships == null) {
			categoryRelationships = new EObjectContainmentEList<CategoryRelationship>(CategoryRelationship.class, this, SmmPackage.MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS);
		}
		return categoryRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractMeasureElement> getOperations() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractMeasureElement> getOclOperations() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.MEASURE_LIBRARY__MEASURE_ELEMENTS:
				return ((InternalEList<?>)getMeasureElements()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS:
				return ((InternalEList<?>)getCategoryRelationships()).basicRemove(otherEnd, msgs);
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
			case SmmPackage.MEASURE_LIBRARY__MEASURE_ELEMENTS:
				return getMeasureElements();
			case SmmPackage.MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS:
				return getCategoryRelationships();
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
			case SmmPackage.MEASURE_LIBRARY__MEASURE_ELEMENTS:
				getMeasureElements().clear();
				getMeasureElements().addAll((Collection<? extends AbstractMeasureElement>)newValue);
				return;
			case SmmPackage.MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS:
				getCategoryRelationships().clear();
				getCategoryRelationships().addAll((Collection<? extends CategoryRelationship>)newValue);
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
			case SmmPackage.MEASURE_LIBRARY__MEASURE_ELEMENTS:
				getMeasureElements().clear();
				return;
			case SmmPackage.MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS:
				getCategoryRelationships().clear();
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
			case SmmPackage.MEASURE_LIBRARY__MEASURE_ELEMENTS:
				return measureElements != null && !measureElements.isEmpty();
			case SmmPackage.MEASURE_LIBRARY__CATEGORY_RELATIONSHIPS:
				return categoryRelationships != null && !categoryRelationships.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureLibraryImpl
