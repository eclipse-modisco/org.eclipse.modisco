/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.LabelAccess;
import org.eclipse.modisco.omg.gastm.LabelDefinition;
import org.eclipse.modisco.omg.gastm.Name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.LabelAccessImpl#getLabelName <em>Label Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.LabelAccessImpl#getLabelDefinition <em>Label Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelAccessImpl extends ExpressionImpl implements LabelAccess {
	/**
	 * The cached value of the '{@link #getLabelName() <em>Label Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelName()
	 * @generated
	 * @ordered
	 */
	protected Name labelName;

	/**
	 * The cached value of the '{@link #getLabelDefinition() <em>Label Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelDefinition()
	 * @generated
	 * @ordered
	 */
	protected LabelDefinition labelDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getLabelAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getLabelName() {
		return labelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelName(Name newLabelName, NotificationChain msgs) {
		Name oldLabelName = labelName;
		labelName = newLabelName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.LABEL_ACCESS__LABEL_NAME, oldLabelName, newLabelName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelName(Name newLabelName) {
		if (newLabelName != labelName) {
			NotificationChain msgs = null;
			if (labelName != null)
				msgs = ((InternalEObject)labelName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.LABEL_ACCESS__LABEL_NAME, null, msgs);
			if (newLabelName != null)
				msgs = ((InternalEObject)newLabelName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.LABEL_ACCESS__LABEL_NAME, null, msgs);
			msgs = basicSetLabelName(newLabelName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.LABEL_ACCESS__LABEL_NAME, newLabelName, newLabelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelDefinition getLabelDefinition() {
		if (labelDefinition != null && labelDefinition.eIsProxy()) {
			InternalEObject oldLabelDefinition = (InternalEObject)labelDefinition;
			labelDefinition = (LabelDefinition)eResolveProxy(oldLabelDefinition);
			if (labelDefinition != oldLabelDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GASTMPackage.LABEL_ACCESS__LABEL_DEFINITION, oldLabelDefinition, labelDefinition));
			}
		}
		return labelDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelDefinition basicGetLabelDefinition() {
		return labelDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelDefinition(LabelDefinition newLabelDefinition) {
		LabelDefinition oldLabelDefinition = labelDefinition;
		labelDefinition = newLabelDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.LABEL_ACCESS__LABEL_DEFINITION, oldLabelDefinition, labelDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.LABEL_ACCESS__LABEL_NAME:
				return basicSetLabelName(null, msgs);
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
			case GASTMPackage.LABEL_ACCESS__LABEL_NAME:
				return getLabelName();
			case GASTMPackage.LABEL_ACCESS__LABEL_DEFINITION:
				if (resolve) return getLabelDefinition();
				return basicGetLabelDefinition();
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
			case GASTMPackage.LABEL_ACCESS__LABEL_NAME:
				setLabelName((Name)newValue);
				return;
			case GASTMPackage.LABEL_ACCESS__LABEL_DEFINITION:
				setLabelDefinition((LabelDefinition)newValue);
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
			case GASTMPackage.LABEL_ACCESS__LABEL_NAME:
				setLabelName((Name)null);
				return;
			case GASTMPackage.LABEL_ACCESS__LABEL_DEFINITION:
				setLabelDefinition((LabelDefinition)null);
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
			case GASTMPackage.LABEL_ACCESS__LABEL_NAME:
				return labelName != null;
			case GASTMPackage.LABEL_ACCESS__LABEL_DEFINITION:
				return labelDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //LabelAccessImpl
