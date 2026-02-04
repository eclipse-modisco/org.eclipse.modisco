/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
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

import org.eclipse.modisco.omg.smm.MeasureLibrary;
import org.eclipse.modisco.omg.smm.Observation;
import org.eclipse.modisco.omg.smm.SmmModel;
import org.eclipse.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.SmmModelImpl#getObservations <em>Observations</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.SmmModelImpl#getLibrairies <em>Librairies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SmmModelImpl extends SmmElementImpl implements SmmModel {
	/**
	 * The cached value of the '{@link #getObservations() <em>Observations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservations()
	 * @generated
	 * @ordered
	 */
	protected EList<Observation> observations;

	/**
	 * The cached value of the '{@link #getLibrairies() <em>Librairies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrairies()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureLibrary> librairies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmmModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.SMM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Observation> getObservations() {
		if (observations == null) {
			observations = new EObjectContainmentEList<Observation>(Observation.class, this, SmmPackage.SMM_MODEL__OBSERVATIONS);
		}
		return observations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureLibrary> getLibrairies() {
		if (librairies == null) {
			librairies = new EObjectContainmentEList<MeasureLibrary>(MeasureLibrary.class, this, SmmPackage.SMM_MODEL__LIBRAIRIES);
		}
		return librairies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.SMM_MODEL__OBSERVATIONS:
				return ((InternalEList<?>)getObservations()).basicRemove(otherEnd, msgs);
			case SmmPackage.SMM_MODEL__LIBRAIRIES:
				return ((InternalEList<?>)getLibrairies()).basicRemove(otherEnd, msgs);
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
			case SmmPackage.SMM_MODEL__OBSERVATIONS:
				return getObservations();
			case SmmPackage.SMM_MODEL__LIBRAIRIES:
				return getLibrairies();
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
			case SmmPackage.SMM_MODEL__OBSERVATIONS:
				getObservations().clear();
				getObservations().addAll((Collection<? extends Observation>)newValue);
				return;
			case SmmPackage.SMM_MODEL__LIBRAIRIES:
				getLibrairies().clear();
				getLibrairies().addAll((Collection<? extends MeasureLibrary>)newValue);
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
			case SmmPackage.SMM_MODEL__OBSERVATIONS:
				getObservations().clear();
				return;
			case SmmPackage.SMM_MODEL__LIBRAIRIES:
				getLibrairies().clear();
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
			case SmmPackage.SMM_MODEL__OBSERVATIONS:
				return observations != null && !observations.isEmpty();
			case SmmPackage.SMM_MODEL__LIBRAIRIES:
				return librairies != null && !librairies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SmmModelImpl
