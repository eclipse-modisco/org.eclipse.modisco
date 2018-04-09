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
package org.eclipse.gmt.modisco.omg.kdm.conceptual.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.AbstractConceptualElement;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualModel;
import org.eclipse.gmt.modisco.omg.kdm.conceptual.ConceptualPackage;
import org.eclipse.gmt.modisco.omg.kdm.kdm.impl.KDMModelImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.kdm.conceptual.impl.ConceptualModelImpl#getConceptualElement <em>Conceptual Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptualModelImpl extends KDMModelImpl implements ConceptualModel {
	/**
	 * The cached value of the '{@link #getConceptualElement() <em>Conceptual Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptualElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConceptualElement> conceptualElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualPackage.Literals.CONCEPTUAL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConceptualElement> getConceptualElement() {
		if (conceptualElement == null) {
			conceptualElement = new EObjectContainmentEList<AbstractConceptualElement>(AbstractConceptualElement.class, this, ConceptualPackage.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT);
		}
		return conceptualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptualPackage.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT:
				return ((InternalEList<?>)getConceptualElement()).basicRemove(otherEnd, msgs);
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
			case ConceptualPackage.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT:
				return getConceptualElement();
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
			case ConceptualPackage.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT:
				getConceptualElement().clear();
				getConceptualElement().addAll((Collection<? extends AbstractConceptualElement>)newValue);
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
			case ConceptualPackage.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT:
				getConceptualElement().clear();
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
			case ConceptualPackage.CONCEPTUAL_MODEL__CONCEPTUAL_ELEMENT:
				return conceptualElement != null && !conceptualElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptualModelImpl
