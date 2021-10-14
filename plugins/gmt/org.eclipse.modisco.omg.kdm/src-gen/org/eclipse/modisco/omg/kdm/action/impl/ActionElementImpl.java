/**
 * *******************************************************************************
 * Copyright (c) 2008, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.action.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.omg.kdm.action.AbstractActionRelationship;
import org.eclipse.modisco.omg.kdm.action.ActionElement;
import org.eclipse.modisco.omg.kdm.action.ActionPackage;
import org.eclipse.modisco.omg.kdm.code.AbstractCodeElement;
import org.eclipse.modisco.omg.kdm.code.impl.AbstractCodeElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.action.impl.ActionElementImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.action.impl.ActionElementImpl#getCodeElement <em>Code Element</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.action.impl.ActionElementImpl#getActionRelation <em>Action Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionElementImpl extends AbstractCodeElementImpl implements ActionElement {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCodeElement() <em>Code Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCodeElement> codeElement;

	/**
	 * The cached value of the '{@link #getActionRelation() <em>Action Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractActionRelationship> actionRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionPackage.Literals.ACTION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.ACTION_ELEMENT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractCodeElement> getCodeElement() {
		if (codeElement == null) {
			codeElement = new EObjectContainmentEList<AbstractCodeElement>(AbstractCodeElement.class, this, ActionPackage.ACTION_ELEMENT__CODE_ELEMENT);
		}
		return codeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractActionRelationship> getActionRelation() {
		if (actionRelation == null) {
			actionRelation = new EObjectContainmentEList<AbstractActionRelationship>(AbstractActionRelationship.class, this, ActionPackage.ACTION_ELEMENT__ACTION_RELATION);
		}
		return actionRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionPackage.ACTION_ELEMENT__CODE_ELEMENT:
				return ((InternalEList<?>)getCodeElement()).basicRemove(otherEnd, msgs);
			case ActionPackage.ACTION_ELEMENT__ACTION_RELATION:
				return ((InternalEList<?>)getActionRelation()).basicRemove(otherEnd, msgs);
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
			case ActionPackage.ACTION_ELEMENT__KIND:
				return getKind();
			case ActionPackage.ACTION_ELEMENT__CODE_ELEMENT:
				return getCodeElement();
			case ActionPackage.ACTION_ELEMENT__ACTION_RELATION:
				return getActionRelation();
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
			case ActionPackage.ACTION_ELEMENT__KIND:
				setKind((String)newValue);
				return;
			case ActionPackage.ACTION_ELEMENT__CODE_ELEMENT:
				getCodeElement().clear();
				getCodeElement().addAll((Collection<? extends AbstractCodeElement>)newValue);
				return;
			case ActionPackage.ACTION_ELEMENT__ACTION_RELATION:
				getActionRelation().clear();
				getActionRelation().addAll((Collection<? extends AbstractActionRelationship>)newValue);
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
			case ActionPackage.ACTION_ELEMENT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case ActionPackage.ACTION_ELEMENT__CODE_ELEMENT:
				getCodeElement().clear();
				return;
			case ActionPackage.ACTION_ELEMENT__ACTION_RELATION:
				getActionRelation().clear();
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
			case ActionPackage.ACTION_ELEMENT__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case ActionPackage.ACTION_ELEMENT__CODE_ELEMENT:
				return codeElement != null && !codeElement.isEmpty();
			case ActionPackage.ACTION_ELEMENT__ACTION_RELATION:
				return actionRelation != null && !actionRelation.isEmpty();
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
		result.append(" (kind: "); //$NON-NLS-1$
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //ActionElementImpl
