/**
 * *******************************************************************************
 * Copyright (c) 2008 Castor Technologies Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Alain Picard (Castor Technologies Inc) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.omg.smm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmt.modisco.omg.smm.Measure;
import org.eclipse.gmt.modisco.omg.smm.Scope;
import org.eclipse.gmt.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.impl.ScopeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.impl.ScopeImpl#isEnumerated <em>Enumerated</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.impl.ScopeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.impl.ScopeImpl#getMeasures <em>Measures</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.omg.smm.impl.ScopeImpl#getRecognizer <em>Recognizer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopeImpl extends SmmElementImpl implements Scope {
	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnumerated() <em>Enumerated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnumerated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENUMERATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnumerated() <em>Enumerated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnumerated()
	 * @generated
	 * @ordered
	 */
	protected boolean enumerated = ENUMERATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasures() <em>Measures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> measures;

	/**
	 * The default value of the '{@link #getRecognizer() <em>Recognizer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecognizer()
	 * @generated
	 * @ordered
	 */
	protected static final String RECOGNIZER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecognizer() <em>Recognizer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecognizer()
	 * @generated
	 * @ordered
	 */
	protected String recognizer = RECOGNIZER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.SCOPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnumerated() {
		return enumerated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumerated(boolean newEnumerated) {
		boolean oldEnumerated = enumerated;
		enumerated = newEnumerated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.SCOPE__ENUMERATED, oldEnumerated, enumerated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.SCOPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getMeasures() {
		if (measures == null) {
			measures = new EObjectWithInverseResolvingEList<Measure>(Measure.class, this, SmmPackage.SCOPE__MEASURES, SmmPackage.MEASURE__SCOPE);
		}
		return measures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecognizer() {
		return recognizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecognizer(String newRecognizer) {
		String oldRecognizer = recognizer;
		recognizer = newRecognizer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.SCOPE__RECOGNIZER, oldRecognizer, recognizer));
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
			case SmmPackage.SCOPE__MEASURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasures()).basicAdd(otherEnd, msgs);
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
			case SmmPackage.SCOPE__MEASURES:
				return ((InternalEList<?>)getMeasures()).basicRemove(otherEnd, msgs);
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
			case SmmPackage.SCOPE__CLASS:
				return getClass_();
			case SmmPackage.SCOPE__ENUMERATED:
				return isEnumerated() ? Boolean.TRUE : Boolean.FALSE;
			case SmmPackage.SCOPE__NAME:
				return getName();
			case SmmPackage.SCOPE__MEASURES:
				return getMeasures();
			case SmmPackage.SCOPE__RECOGNIZER:
				return getRecognizer();
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
			case SmmPackage.SCOPE__CLASS:
				setClass((String)newValue);
				return;
			case SmmPackage.SCOPE__ENUMERATED:
				setEnumerated(((Boolean)newValue).booleanValue());
				return;
			case SmmPackage.SCOPE__NAME:
				setName((String)newValue);
				return;
			case SmmPackage.SCOPE__MEASURES:
				getMeasures().clear();
				getMeasures().addAll((Collection<? extends Measure>)newValue);
				return;
			case SmmPackage.SCOPE__RECOGNIZER:
				setRecognizer((String)newValue);
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
			case SmmPackage.SCOPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case SmmPackage.SCOPE__ENUMERATED:
				setEnumerated(ENUMERATED_EDEFAULT);
				return;
			case SmmPackage.SCOPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmmPackage.SCOPE__MEASURES:
				getMeasures().clear();
				return;
			case SmmPackage.SCOPE__RECOGNIZER:
				setRecognizer(RECOGNIZER_EDEFAULT);
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
			case SmmPackage.SCOPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case SmmPackage.SCOPE__ENUMERATED:
				return enumerated != ENUMERATED_EDEFAULT;
			case SmmPackage.SCOPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmmPackage.SCOPE__MEASURES:
				return measures != null && !measures.isEmpty();
			case SmmPackage.SCOPE__RECOGNIZER:
				return RECOGNIZER_EDEFAULT == null ? recognizer != null : !RECOGNIZER_EDEFAULT.equals(recognizer);
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
		result.append(" (class: "); //$NON-NLS-1$
		result.append(class_);
		result.append(", enumerated: "); //$NON-NLS-1$
		result.append(enumerated);
		result.append(", name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", recognizer: "); //$NON-NLS-1$
		result.append(recognizer);
		result.append(')');
		return result.toString();
	}

} //ScopeImpl
