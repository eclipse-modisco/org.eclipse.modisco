/**
 * Copyright (c) 2009 Mia-Software and others.
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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.infra.browser.custom.CustomView;
import org.eclipse.modisco.infra.browser.custom.CustomViewFeature;
import org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.emf.impl.CustomViewImpl#getCustomizedFeatures <em>Customized Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public abstract class CustomViewImpl extends EObjectImpl implements CustomView {
	/**
	 * The cached value of the '{@link #getCustomizedFeatures() <em>Customized Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomizedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomViewFeature> customizedFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UicustomPackage.eINSTANCE.getCustomView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomViewFeature> getCustomizedFeatures() {
		if (customizedFeatures == null) {
			customizedFeatures = new EObjectContainmentWithInverseEList<CustomViewFeature>(CustomViewFeature.class, this, UicustomPackage.CUSTOM_VIEW__CUSTOMIZED_FEATURES, UicustomPackage.CUSTOM_VIEW_FEATURE__CUSTOM_VIEW);
		}
		return customizedFeatures;
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
			case UicustomPackage.CUSTOM_VIEW__CUSTOMIZED_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCustomizedFeatures()).basicAdd(otherEnd, msgs);
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
			case UicustomPackage.CUSTOM_VIEW__CUSTOMIZED_FEATURES:
				return ((InternalEList<?>)getCustomizedFeatures()).basicRemove(otherEnd, msgs);
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
			case UicustomPackage.CUSTOM_VIEW__CUSTOMIZED_FEATURES:
				return getCustomizedFeatures();
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
			case UicustomPackage.CUSTOM_VIEW__CUSTOMIZED_FEATURES:
				getCustomizedFeatures().clear();
				getCustomizedFeatures().addAll((Collection<? extends CustomViewFeature>)newValue);
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
			case UicustomPackage.CUSTOM_VIEW__CUSTOMIZED_FEATURES:
				getCustomizedFeatures().clear();
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
			case UicustomPackage.CUSTOM_VIEW__CUSTOMIZED_FEATURES:
				return customizedFeatures != null && !customizedFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CustomViewImpl
