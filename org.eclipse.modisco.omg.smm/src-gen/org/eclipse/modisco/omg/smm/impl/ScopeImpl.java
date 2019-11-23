/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *      Nicolas Payneau (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.omg.smm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.modisco.omg.smm.Operation;
import org.eclipse.modisco.omg.smm.Scope;
import org.eclipse.modisco.omg.smm.SmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.ScopeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.ScopeImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.ScopeImpl#getRecognizerQuery <em>Recognizer Query</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.smm.impl.ScopeImpl#getBreakCondition <em>Break Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopeImpl extends AbstractMeasureElementImpl implements Scope {
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
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> elements;

	/**
	 * The cached value of the '{@link #getRecognizerQuery() <em>Recognizer Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecognizerQuery()
	 * @generated
	 * @ordered
	 */
	protected Operation recognizerQuery;

	/**
	 * The cached value of the '{@link #getBreakCondition() <em>Break Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakCondition()
	 * @generated
	 * @ordered
	 */
	protected Operation breakCondition;

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
	public EList<EObject> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<EObject>(EObject.class, this, SmmPackage.SCOPE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getRecognizerQuery() {
		if (recognizerQuery != null && recognizerQuery.eIsProxy()) {
			InternalEObject oldRecognizerQuery = (InternalEObject)recognizerQuery;
			recognizerQuery = (Operation)eResolveProxy(oldRecognizerQuery);
			if (recognizerQuery != oldRecognizerQuery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.SCOPE__RECOGNIZER_QUERY, oldRecognizerQuery, recognizerQuery));
			}
		}
		return recognizerQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetRecognizerQuery() {
		return recognizerQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecognizerQuery(Operation newRecognizerQuery) {
		Operation oldRecognizerQuery = recognizerQuery;
		recognizerQuery = newRecognizerQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.SCOPE__RECOGNIZER_QUERY, oldRecognizerQuery, recognizerQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getBreakCondition() {
		if (breakCondition != null && breakCondition.eIsProxy()) {
			InternalEObject oldBreakCondition = (InternalEObject)breakCondition;
			breakCondition = (Operation)eResolveProxy(oldBreakCondition);
			if (breakCondition != oldBreakCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.SCOPE__BREAK_CONDITION, oldBreakCondition, breakCondition));
			}
		}
		return breakCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetBreakCondition() {
		return breakCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakCondition(Operation newBreakCondition) {
		Operation oldBreakCondition = breakCondition;
		breakCondition = newBreakCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.SCOPE__BREAK_CONDITION, oldBreakCondition, breakCondition));
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
			case SmmPackage.SCOPE__ELEMENTS:
				return getElements();
			case SmmPackage.SCOPE__RECOGNIZER_QUERY:
				if (resolve) return getRecognizerQuery();
				return basicGetRecognizerQuery();
			case SmmPackage.SCOPE__BREAK_CONDITION:
				if (resolve) return getBreakCondition();
				return basicGetBreakCondition();
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
			case SmmPackage.SCOPE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends EObject>)newValue);
				return;
			case SmmPackage.SCOPE__RECOGNIZER_QUERY:
				setRecognizerQuery((Operation)newValue);
				return;
			case SmmPackage.SCOPE__BREAK_CONDITION:
				setBreakCondition((Operation)newValue);
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
			case SmmPackage.SCOPE__ELEMENTS:
				getElements().clear();
				return;
			case SmmPackage.SCOPE__RECOGNIZER_QUERY:
				setRecognizerQuery((Operation)null);
				return;
			case SmmPackage.SCOPE__BREAK_CONDITION:
				setBreakCondition((Operation)null);
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
			case SmmPackage.SCOPE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case SmmPackage.SCOPE__RECOGNIZER_QUERY:
				return recognizerQuery != null;
			case SmmPackage.SCOPE__BREAK_CONDITION:
				return breakCondition != null;
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
		result.append(" (class: ");
		result.append(class_);
		result.append(')');
		return result.toString();
	}

} //ScopeImpl
