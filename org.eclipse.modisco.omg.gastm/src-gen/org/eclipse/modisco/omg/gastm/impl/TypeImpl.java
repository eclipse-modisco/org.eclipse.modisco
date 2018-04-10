/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm.impl;

import java.lang.Boolean;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.TypeImpl#getIsConst <em>Is Const</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeImpl extends GASTMSyntaxObjectImpl implements Type {
	/**
	 * The default value of the '{@link #getIsConst() <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConst()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsConst() <em>Is Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConst()
	 * @generated
	 * @ordered
	 */
	protected Boolean isConst = IS_CONST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsConst() {
		return isConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConst(Boolean newIsConst) {
		Boolean oldIsConst = isConst;
		isConst = newIsConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.TYPE__IS_CONST, oldIsConst, isConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GASTMPackage.TYPE__IS_CONST:
				return getIsConst();
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
			case GASTMPackage.TYPE__IS_CONST:
				setIsConst((Boolean)newValue);
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
			case GASTMPackage.TYPE__IS_CONST:
				setIsConst(IS_CONST_EDEFAULT);
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
			case GASTMPackage.TYPE__IS_CONST:
				return IS_CONST_EDEFAULT == null ? isConst != null : !IS_CONST_EDEFAULT.equals(isConst);
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
		result.append(" (isConst: "); //$NON-NLS-1$
		result.append(isConst);
		result.append(')');
		return result.toString();
	}

} //TypeImpl
