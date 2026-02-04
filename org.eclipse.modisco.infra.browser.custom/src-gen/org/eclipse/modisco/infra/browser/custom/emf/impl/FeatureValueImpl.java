/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.browser.custom.emf.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.modisco.infra.browser.custom.CustomViewFeature;
import org.eclipse.modisco.infra.browser.custom.FeatureValue;
import org.eclipse.modisco.infra.browser.custom.FeatureValueCase;
import org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.emf.impl.FeatureValueImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.emf.impl.FeatureValueImpl#getCase <em>Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public abstract class FeatureValueImpl extends EObjectImpl implements FeatureValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UicustomPackage.eINSTANCE.getFeatureValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomViewFeature getFeature() {
		if (eContainerFeatureID() != UicustomPackage.FEATURE_VALUE__FEATURE) return null;
		return (CustomViewFeature)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValueCase getCase() {
		if (eContainerFeatureID() != UicustomPackage.FEATURE_VALUE__CASE) return null;
		return (FeatureValueCase)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UicustomPackage.FEATURE_VALUE__FEATURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, UicustomPackage.FEATURE_VALUE__FEATURE, msgs);
			case UicustomPackage.FEATURE_VALUE__CASE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, UicustomPackage.FEATURE_VALUE__CASE, msgs);
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
			case UicustomPackage.FEATURE_VALUE__FEATURE:
				return eBasicSetContainer(null, UicustomPackage.FEATURE_VALUE__FEATURE, msgs);
			case UicustomPackage.FEATURE_VALUE__CASE:
				return eBasicSetContainer(null, UicustomPackage.FEATURE_VALUE__CASE, msgs);
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
			case UicustomPackage.FEATURE_VALUE__FEATURE:
				return eInternalContainer().eInverseRemove(this, UicustomPackage.CUSTOM_VIEW_FEATURE__DEFAULT_VALUE, CustomViewFeature.class, msgs);
			case UicustomPackage.FEATURE_VALUE__CASE:
				return eInternalContainer().eInverseRemove(this, UicustomPackage.FEATURE_VALUE_CASE__VALUE, FeatureValueCase.class, msgs);
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
			case UicustomPackage.FEATURE_VALUE__FEATURE:
				return getFeature();
			case UicustomPackage.FEATURE_VALUE__CASE:
				return getCase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UicustomPackage.FEATURE_VALUE__FEATURE:
				return getFeature() != null;
			case UicustomPackage.FEATURE_VALUE__CASE:
				return getCase() != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureValueImpl
