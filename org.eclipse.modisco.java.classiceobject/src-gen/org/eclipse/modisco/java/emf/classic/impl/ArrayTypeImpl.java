/**
 * *******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.java.emf.classic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.emf.classic.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.emf.classic.impl.ArrayTypeImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.classic.impl.ArrayTypeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayTypeImpl extends TypeImpl implements ArrayType {
	/**
	 * The default value of the '{@link #getDimensions() <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final int DIMENSIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected int dimensions = DIMENSIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected TypeAccess elementType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getArrayType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDimensions() {
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(int newDimensions) {
		int oldDimensions = dimensions;
		dimensions = newDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.ARRAY_TYPE__DIMENSIONS, oldDimensions, dimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccess getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementType(TypeAccess newElementType, NotificationChain msgs) {
		TypeAccess oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.ARRAY_TYPE__ELEMENT_TYPE, oldElementType, newElementType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(TypeAccess newElementType) {
		if (newElementType != elementType) {
			NotificationChain msgs = null;
			if (elementType != null)
				msgs = ((InternalEObject)elementType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.ARRAY_TYPE__ELEMENT_TYPE, null, msgs);
			if (newElementType != null)
				msgs = ((InternalEObject)newElementType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.ARRAY_TYPE__ELEMENT_TYPE, null, msgs);
			msgs = basicSetElementType(newElementType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.ARRAY_TYPE__ELEMENT_TYPE, newElementType, newElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.ARRAY_TYPE__ELEMENT_TYPE:
				return basicSetElementType(null, msgs);
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
			case JavaPackage.ARRAY_TYPE__DIMENSIONS:
				return getDimensions();
			case JavaPackage.ARRAY_TYPE__ELEMENT_TYPE:
				return getElementType();
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
			case JavaPackage.ARRAY_TYPE__DIMENSIONS:
				setDimensions((Integer)newValue);
				return;
			case JavaPackage.ARRAY_TYPE__ELEMENT_TYPE:
				setElementType((TypeAccess)newValue);
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
			case JavaPackage.ARRAY_TYPE__DIMENSIONS:
				setDimensions(DIMENSIONS_EDEFAULT);
				return;
			case JavaPackage.ARRAY_TYPE__ELEMENT_TYPE:
				setElementType((TypeAccess)null);
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
			case JavaPackage.ARRAY_TYPE__DIMENSIONS:
				return dimensions != DIMENSIONS_EDEFAULT;
			case JavaPackage.ARRAY_TYPE__ELEMENT_TYPE:
				return elementType != null;
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
		result.append(" (dimensions: "); //$NON-NLS-1$
		result.append(dimensions);
		result.append(')');
		return result.toString();
	}

} //ArrayTypeImpl
