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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.infra.browser.custom.CustomView;
import org.eclipse.modisco.infra.browser.custom.CustomViewFeature;
import org.eclipse.modisco.infra.browser.custom.CustomizableFeatures;
import org.eclipse.modisco.infra.browser.custom.FeatureValue;
import org.eclipse.modisco.infra.browser.custom.FeatureValueCase;
import org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom View Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.emf.impl.CustomViewFeatureImpl#getCustomizedFeature <em>Customized Feature</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.emf.impl.CustomViewFeatureImpl#getValueCases <em>Value Cases</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.emf.impl.CustomViewFeatureImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.emf.impl.CustomViewFeatureImpl#getCustomView <em>Custom View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class CustomViewFeatureImpl extends EObjectImpl implements CustomViewFeature {
	/**
	 * The default value of the '{@link #getCustomizedFeature() <em>Customized Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomizedFeature()
	 * @generated
	 * @ordered
	 */
	protected static final CustomizableFeatures CUSTOMIZED_FEATURE_EDEFAULT = CustomizableFeatures.VISIBLE;

	/**
	 * The cached value of the '{@link #getCustomizedFeature() <em>Customized Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomizedFeature()
	 * @generated
	 * @ordered
	 */
	protected CustomizableFeatures customizedFeature = CUSTOMIZED_FEATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueCases() <em>Value Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueCases()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureValueCase> valueCases;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected FeatureValue defaultValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomViewFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UicustomPackage.eINSTANCE.getCustomViewFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomizableFeatures getCustomizedFeature() {
		return customizedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomizedFeature(CustomizableFeatures newCustomizedFeature) {
		CustomizableFeatures oldCustomizedFeature = customizedFeature;
		customizedFeature = newCustomizedFeature == null ? CUSTOMIZED_FEATURE_EDEFAULT : newCustomizedFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UicustomPackage.CUSTOM_VIEW_FEATURE__CUSTOMIZED_FEATURE, oldCustomizedFeature, customizedFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureValueCase> getValueCases() {
		if (valueCases == null) {
			valueCases = new EObjectContainmentWithInverseEList<FeatureValueCase>(FeatureValueCase.class, this, UicustomPackage.CUSTOM_VIEW_FEATURE__VALUE_CASES, UicustomPackage.FEATURE_VALUE_CASE__FEATURE);
		}
		return valueCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValue getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(FeatureValue newDefaultValue, NotificationChain msgs) {
		FeatureValue oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UicustomPackage.CUSTOM_VIEW_FEATURE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(FeatureValue newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, UicustomPackage.FEATURE_VALUE__FEATURE, FeatureValue.class, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, UicustomPackage.FEATURE_VALUE__FEATURE, FeatureValue.class, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UicustomPackage.CUSTOM_VIEW_FEATURE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomView getCustomView() {
		if (eContainerFeatureID() != UicustomPackage.CUSTOM_VIEW_FEATURE__CUSTOM_VIEW) return null;
		return (CustomView)eContainer();
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
			case UicustomPackage.CUSTOM_VIEW_FEATURE__VALUE_CASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValueCases()).basicAdd(otherEnd, msgs);
			case UicustomPackage.CUSTOM_VIEW_FEATURE__DEFAULT_VALUE:
				if (defaultValue != null)
					msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UicustomPackage.CUSTOM_VIEW_FEATURE__DEFAULT_VALUE, null, msgs);
				return basicSetDefaultValue((FeatureValue)otherEnd, msgs);
			case UicustomPackage.CUSTOM_VIEW_FEATURE__CUSTOM_VIEW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, UicustomPackage.CUSTOM_VIEW_FEATURE__CUSTOM_VIEW, msgs);
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
			case UicustomPackage.CUSTOM_VIEW_FEATURE__VALUE_CASES:
				return ((InternalEList<?>)getValueCases()).basicRemove(otherEnd, msgs);
			case UicustomPackage.CUSTOM_VIEW_FEATURE__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case UicustomPackage.CUSTOM_VIEW_FEATURE__CUSTOM_VIEW:
				return eBasicSetContainer(null, UicustomPackage.CUSTOM_VIEW_FEATURE__CUSTOM_VIEW, msgs);
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
			case UicustomPackage.CUSTOM_VIEW_FEATURE__CUSTOM_VIEW:
				return eInternalContainer().eInverseRemove(this, UicustomPackage.CUSTOM_VIEW__CUSTOMIZED_FEATURES, CustomView.class, msgs);
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
			case UicustomPackage.CUSTOM_VIEW_FEATURE__CUSTOMIZED_FEATURE:
				return getCustomizedFeature();
			case UicustomPackage.CUSTOM_VIEW_FEATURE__VALUE_CASES:
				return getValueCases();
			case UicustomPackage.CUSTOM_VIEW_FEATURE__DEFAULT_VALUE:
				return getDefaultValue();
			case UicustomPackage.CUSTOM_VIEW_FEATURE__CUSTOM_VIEW:
				return getCustomView();
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
			case UicustomPackage.CUSTOM_VIEW_FEATURE__CUSTOMIZED_FEATURE:
				setCustomizedFeature((CustomizableFeatures)newValue);
				return;
			case UicustomPackage.CUSTOM_VIEW_FEATURE__VALUE_CASES:
				getValueCases().clear();
				getValueCases().addAll((Collection<? extends FeatureValueCase>)newValue);
				return;
			case UicustomPackage.CUSTOM_VIEW_FEATURE__DEFAULT_VALUE:
				setDefaultValue((FeatureValue)newValue);
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
			case UicustomPackage.CUSTOM_VIEW_FEATURE__CUSTOMIZED_FEATURE:
				setCustomizedFeature(CUSTOMIZED_FEATURE_EDEFAULT);
				return;
			case UicustomPackage.CUSTOM_VIEW_FEATURE__VALUE_CASES:
				getValueCases().clear();
				return;
			case UicustomPackage.CUSTOM_VIEW_FEATURE__DEFAULT_VALUE:
				setDefaultValue((FeatureValue)null);
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
			case UicustomPackage.CUSTOM_VIEW_FEATURE__CUSTOMIZED_FEATURE:
				return customizedFeature != CUSTOMIZED_FEATURE_EDEFAULT;
			case UicustomPackage.CUSTOM_VIEW_FEATURE__VALUE_CASES:
				return valueCases != null && !valueCases.isEmpty();
			case UicustomPackage.CUSTOM_VIEW_FEATURE__DEFAULT_VALUE:
				return defaultValue != null;
			case UicustomPackage.CUSTOM_VIEW_FEATURE__CUSTOM_VIEW:
				return getCustomView() != null;
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
		result.append(" (customizedFeature: ");
		result.append(customizedFeature);
		result.append(')');
		return result.toString();
	}

} //CustomViewFeatureImpl
