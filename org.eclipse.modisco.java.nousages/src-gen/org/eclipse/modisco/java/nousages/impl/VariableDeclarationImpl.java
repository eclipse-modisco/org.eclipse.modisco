/**
 * *******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.java.nousages.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.SingleVariableAccess;
import org.eclipse.modisco.java.VariableDeclaration;
import org.eclipse.modisco.java.nousages.meta.JavaPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Variable Declaration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.modisco.java.nousages.impl.VariableDeclarationImpl#getExtraArrayDimensions
 * <em>Extra Array Dimensions</em>}</li>
 * <li>
 * {@link org.eclipse.modisco.java.nousages.impl.VariableDeclarationImpl#getInitializer
 * <em>Initializer</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class VariableDeclarationImpl extends NamedElementImpl
		implements VariableDeclaration {
	/**
	 * The default value of the '{@link #getExtraArrayDimensions()
	 * <em>Extra Array Dimensions</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getExtraArrayDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final int EXTRA_ARRAY_DIMENSIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExtraArrayDimensions()
	 * <em>Extra Array Dimensions</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getExtraArrayDimensions()
	 * @generated
	 * @ordered
	 */
	protected int extraArrayDimensions = EXTRA_ARRAY_DIMENSIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitializer() <em>Initializer</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected Expression initializer;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getVariableDeclaration();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getExtraArrayDimensions() {
		return extraArrayDimensions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExtraArrayDimensions(int newExtraArrayDimensions) {
		int oldExtraArrayDimensions = extraArrayDimensions;
		extraArrayDimensions = newExtraArrayDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JavaPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS,
					oldExtraArrayDimensions, extraArrayDimensions));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Expression getInitializer() {
		return initializer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetInitializer(Expression newInitializer,
			NotificationChain msgs) {
		Expression oldInitializer = initializer;
		initializer = newInitializer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					JavaPackage.VARIABLE_DECLARATION__INITIALIZER,
					oldInitializer, newInitializer);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setInitializer(Expression newInitializer) {
		if (newInitializer != initializer) {
			NotificationChain msgs = null;
			if (initializer != null)
				msgs = ((InternalEObject) initializer)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- JavaPackage.VARIABLE_DECLARATION__INITIALIZER,
								null, msgs);
			if (newInitializer != null)
				msgs = ((InternalEObject) newInitializer)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- JavaPackage.VARIABLE_DECLARATION__INITIALIZER,
								null, msgs);
			msgs = basicSetInitializer(newInitializer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JavaPackage.VARIABLE_DECLARATION__INITIALIZER,
					newInitializer, newInitializer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavaPackage.VARIABLE_DECLARATION__INITIALIZER:
			return basicSetInitializer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JavaPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
			return getExtraArrayDimensions();
		case JavaPackage.VARIABLE_DECLARATION__INITIALIZER:
			return getInitializer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JavaPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
			setExtraArrayDimensions((Integer) newValue);
			return;
		case JavaPackage.VARIABLE_DECLARATION__INITIALIZER:
			setInitializer((Expression) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case JavaPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
			setExtraArrayDimensions(EXTRA_ARRAY_DIMENSIONS_EDEFAULT);
			return;
		case JavaPackage.VARIABLE_DECLARATION__INITIALIZER:
			setInitializer((Expression) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case JavaPackage.VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS:
			return extraArrayDimensions != EXTRA_ARRAY_DIMENSIONS_EDEFAULT;
		case JavaPackage.VARIABLE_DECLARATION__INITIALIZER:
			return initializer != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (extraArrayDimensions: "); //$NON-NLS-1$
		result.append(extraArrayDimensions);
		result.append(')');
		return result.toString();
	}

} // VariableDeclarationImpl
