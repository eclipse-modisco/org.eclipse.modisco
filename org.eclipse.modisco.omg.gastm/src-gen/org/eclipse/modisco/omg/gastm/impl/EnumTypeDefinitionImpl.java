/**
 * <copyright>
 * Copyright (c) 2009, 2019 Open Canarias, S.L.
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

import org.eclipse.modisco.omg.gastm.EnumType;
import org.eclipse.modisco.omg.gastm.EnumTypeDefinition;
import org.eclipse.modisco.omg.gastm.GASTMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.EnumTypeDefinitionImpl#getDefinitionType <em>Definition Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumTypeDefinitionImpl extends TypeDefinitionImpl implements EnumTypeDefinition {
	/**
	 * The cached value of the '{@link #getDefinitionType() <em>Definition Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionType()
	 * @generated
	 * @ordered
	 */
	protected EnumType definitionType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getEnumTypeDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumType getDefinitionType() {
		return definitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionType(EnumType newDefinitionType, NotificationChain msgs) {
		EnumType oldDefinitionType = definitionType;
		definitionType = newDefinitionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.ENUM_TYPE_DEFINITION__DEFINITION_TYPE, oldDefinitionType, newDefinitionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionType(EnumType newDefinitionType) {
		if (newDefinitionType != definitionType) {
			NotificationChain msgs = null;
			if (definitionType != null)
				msgs = ((InternalEObject)definitionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.ENUM_TYPE_DEFINITION__DEFINITION_TYPE, null, msgs);
			if (newDefinitionType != null)
				msgs = ((InternalEObject)newDefinitionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.ENUM_TYPE_DEFINITION__DEFINITION_TYPE, null, msgs);
			msgs = basicSetDefinitionType(newDefinitionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.ENUM_TYPE_DEFINITION__DEFINITION_TYPE, newDefinitionType, newDefinitionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.ENUM_TYPE_DEFINITION__DEFINITION_TYPE:
				return basicSetDefinitionType(null, msgs);
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
			case GASTMPackage.ENUM_TYPE_DEFINITION__DEFINITION_TYPE:
				return getDefinitionType();
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
			case GASTMPackage.ENUM_TYPE_DEFINITION__DEFINITION_TYPE:
				setDefinitionType((EnumType)newValue);
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
			case GASTMPackage.ENUM_TYPE_DEFINITION__DEFINITION_TYPE:
				setDefinitionType((EnumType)null);
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
			case GASTMPackage.ENUM_TYPE_DEFINITION__DEFINITION_TYPE:
				return definitionType != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumTypeDefinitionImpl
