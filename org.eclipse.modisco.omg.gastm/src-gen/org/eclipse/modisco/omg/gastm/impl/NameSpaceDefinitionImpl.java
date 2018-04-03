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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.omg.gastm.DefinitionObject;
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.Name;
import org.eclipse.modisco.omg.gastm.NameSpaceDefinition;
import org.eclipse.modisco.omg.gastm.NameSpaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Space Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.NameSpaceDefinitionImpl#getNameSpace <em>Name Space</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.NameSpaceDefinitionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.NameSpaceDefinitionImpl#getNameSpaceType <em>Name Space Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameSpaceDefinitionImpl extends DefinitionObjectImpl implements NameSpaceDefinition {
	/**
	 * The cached value of the '{@link #getNameSpace() <em>Name Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpace()
	 * @generated
	 * @ordered
	 */
	protected Name nameSpace;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinitionObject> body;

	/**
	 * The cached value of the '{@link #getNameSpaceType() <em>Name Space Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpaceType()
	 * @generated
	 * @ordered
	 */
	protected NameSpaceType nameSpaceType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameSpaceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getNameSpaceDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getNameSpace() {
		return nameSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameSpace(Name newNameSpace, NotificationChain msgs) {
		Name oldNameSpace = nameSpace;
		nameSpace = newNameSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE, oldNameSpace, newNameSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSpace(Name newNameSpace) {
		if (newNameSpace != nameSpace) {
			NotificationChain msgs = null;
			if (nameSpace != null)
				msgs = ((InternalEObject)nameSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE, null, msgs);
			if (newNameSpace != null)
				msgs = ((InternalEObject)newNameSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE, null, msgs);
			msgs = basicSetNameSpace(newNameSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE, newNameSpace, newNameSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefinitionObject> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<DefinitionObject>(DefinitionObject.class, this, GASTMPackage.NAME_SPACE_DEFINITION__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameSpaceType getNameSpaceType() {
		return nameSpaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameSpaceType(NameSpaceType newNameSpaceType, NotificationChain msgs) {
		NameSpaceType oldNameSpaceType = nameSpaceType;
		nameSpaceType = newNameSpaceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE_TYPE, oldNameSpaceType, newNameSpaceType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSpaceType(NameSpaceType newNameSpaceType) {
		if (newNameSpaceType != nameSpaceType) {
			NotificationChain msgs = null;
			if (nameSpaceType != null)
				msgs = ((InternalEObject)nameSpaceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE_TYPE, null, msgs);
			if (newNameSpaceType != null)
				msgs = ((InternalEObject)newNameSpaceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE_TYPE, null, msgs);
			msgs = basicSetNameSpaceType(newNameSpaceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE_TYPE, newNameSpaceType, newNameSpaceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE:
				return basicSetNameSpace(null, msgs);
			case GASTMPackage.NAME_SPACE_DEFINITION__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
			case GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE_TYPE:
				return basicSetNameSpaceType(null, msgs);
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
			case GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE:
				return getNameSpace();
			case GASTMPackage.NAME_SPACE_DEFINITION__BODY:
				return getBody();
			case GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE_TYPE:
				return getNameSpaceType();
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
			case GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE:
				setNameSpace((Name)newValue);
				return;
			case GASTMPackage.NAME_SPACE_DEFINITION__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends DefinitionObject>)newValue);
				return;
			case GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE_TYPE:
				setNameSpaceType((NameSpaceType)newValue);
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
			case GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE:
				setNameSpace((Name)null);
				return;
			case GASTMPackage.NAME_SPACE_DEFINITION__BODY:
				getBody().clear();
				return;
			case GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE_TYPE:
				setNameSpaceType((NameSpaceType)null);
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
			case GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE:
				return nameSpace != null;
			case GASTMPackage.NAME_SPACE_DEFINITION__BODY:
				return body != null && !body.isEmpty();
			case GASTMPackage.NAME_SPACE_DEFINITION__NAME_SPACE_TYPE:
				return nameSpaceType != null;
		}
		return super.eIsSet(featureID);
	}

} //NameSpaceDefinitionImpl
