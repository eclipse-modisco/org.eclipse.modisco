/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.browser.custom.emf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.modisco.infra.browser.custom.CustomViewFeature;
import org.eclipse.modisco.infra.browser.custom.FeatureValue;
import org.eclipse.modisco.infra.browser.custom.FeatureValueCase;
import org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage;
import org.eclipse.modisco.infra.query.ModelQuery;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Value Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.emf.impl.FeatureValueCaseImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.emf.impl.FeatureValueCaseImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.browser.custom.emf.impl.FeatureValueCaseImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class FeatureValueCaseImpl extends EObjectImpl implements FeatureValueCase {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected FeatureValue value;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ModelQuery condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureValueCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UicustomPackage.eINSTANCE.getFeatureValueCase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelQuery getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject)condition;
			condition = (ModelQuery)eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UicustomPackage.FEATURE_VALUE_CASE__CONDITION, oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelQuery basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(ModelQuery newCondition) {
		ModelQuery oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UicustomPackage.FEATURE_VALUE_CASE__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValue getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(FeatureValue newValue, NotificationChain msgs) {
		FeatureValue oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UicustomPackage.FEATURE_VALUE_CASE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(FeatureValue newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, UicustomPackage.FEATURE_VALUE__CASE, FeatureValue.class, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, UicustomPackage.FEATURE_VALUE__CASE, FeatureValue.class, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UicustomPackage.FEATURE_VALUE_CASE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomViewFeature getFeature() {
		if (eContainerFeatureID() != UicustomPackage.FEATURE_VALUE_CASE__FEATURE) return null;
		return (CustomViewFeature)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UicustomPackage.FEATURE_VALUE_CASE__VALUE:
				if (value != null)
					msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UicustomPackage.FEATURE_VALUE_CASE__VALUE, null, msgs);
				return basicSetValue((FeatureValue)otherEnd, msgs);
			case UicustomPackage.FEATURE_VALUE_CASE__FEATURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, UicustomPackage.FEATURE_VALUE_CASE__FEATURE, msgs);
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
			case UicustomPackage.FEATURE_VALUE_CASE__VALUE:
				return basicSetValue(null, msgs);
			case UicustomPackage.FEATURE_VALUE_CASE__FEATURE:
				return eBasicSetContainer(null, UicustomPackage.FEATURE_VALUE_CASE__FEATURE, msgs);
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
			case UicustomPackage.FEATURE_VALUE_CASE__FEATURE:
				return eInternalContainer().eInverseRemove(this, UicustomPackage.CUSTOM_VIEW_FEATURE__VALUE_CASES, CustomViewFeature.class, msgs);
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
			case UicustomPackage.FEATURE_VALUE_CASE__VALUE:
				return getValue();
			case UicustomPackage.FEATURE_VALUE_CASE__FEATURE:
				return getFeature();
			case UicustomPackage.FEATURE_VALUE_CASE__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
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
			case UicustomPackage.FEATURE_VALUE_CASE__VALUE:
				setValue((FeatureValue)newValue);
				return;
			case UicustomPackage.FEATURE_VALUE_CASE__CONDITION:
				setCondition((ModelQuery)newValue);
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
			case UicustomPackage.FEATURE_VALUE_CASE__VALUE:
				setValue((FeatureValue)null);
				return;
			case UicustomPackage.FEATURE_VALUE_CASE__CONDITION:
				setCondition((ModelQuery)null);
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
			case UicustomPackage.FEATURE_VALUE_CASE__VALUE:
				return value != null;
			case UicustomPackage.FEATURE_VALUE_CASE__FEATURE:
				return getFeature() != null;
			case UicustomPackage.FEATURE_VALUE_CASE__CONDITION:
				return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureValueCaseImpl
