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

import org.eclipse.modisco.omg.gastm.Declaration;
import org.eclipse.modisco.omg.gastm.Definition;
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.Name;
import org.eclipse.modisco.omg.gastm.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.DeclarationImpl#getDefRef <em>Def Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.DeclarationImpl#getIdentifierName <em>Identifier Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.DeclarationImpl#getDeclarationType <em>Declaration Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DeclarationImpl extends DeclarationOrDefinitionImpl implements Declaration {
	/**
	 * The cached value of the '{@link #getDefRef() <em>Def Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefRef()
	 * @generated
	 * @ordered
	 */
	protected Definition defRef;

	/**
	 * The cached value of the '{@link #getIdentifierName() <em>Identifier Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierName()
	 * @generated
	 * @ordered
	 */
	protected Name identifierName;

	/**
	 * The cached value of the '{@link #getDeclarationType() <em>Declaration Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationType()
	 * @generated
	 * @ordered
	 */
	protected TypeReference declarationType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition getDefRef() {
		if (defRef != null && defRef.eIsProxy()) {
			InternalEObject oldDefRef = (InternalEObject)defRef;
			defRef = (Definition)eResolveProxy(oldDefRef);
			if (defRef != oldDefRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GASTMPackage.DECLARATION__DEF_REF, oldDefRef, defRef));
			}
		}
		return defRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition basicGetDefRef() {
		return defRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefRef(Definition newDefRef) {
		Definition oldDefRef = defRef;
		defRef = newDefRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.DECLARATION__DEF_REF, oldDefRef, defRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getIdentifierName() {
		return identifierName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifierName(Name newIdentifierName, NotificationChain msgs) {
		Name oldIdentifierName = identifierName;
		identifierName = newIdentifierName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.DECLARATION__IDENTIFIER_NAME, oldIdentifierName, newIdentifierName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifierName(Name newIdentifierName) {
		if (newIdentifierName != identifierName) {
			NotificationChain msgs = null;
			if (identifierName != null)
				msgs = ((InternalEObject)identifierName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DECLARATION__IDENTIFIER_NAME, null, msgs);
			if (newIdentifierName != null)
				msgs = ((InternalEObject)newIdentifierName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DECLARATION__IDENTIFIER_NAME, null, msgs);
			msgs = basicSetIdentifierName(newIdentifierName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.DECLARATION__IDENTIFIER_NAME, newIdentifierName, newIdentifierName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getDeclarationType() {
		return declarationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclarationType(TypeReference newDeclarationType, NotificationChain msgs) {
		TypeReference oldDeclarationType = declarationType;
		declarationType = newDeclarationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.DECLARATION__DECLARATION_TYPE, oldDeclarationType, newDeclarationType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclarationType(TypeReference newDeclarationType) {
		if (newDeclarationType != declarationType) {
			NotificationChain msgs = null;
			if (declarationType != null)
				msgs = ((InternalEObject)declarationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DECLARATION__DECLARATION_TYPE, null, msgs);
			if (newDeclarationType != null)
				msgs = ((InternalEObject)newDeclarationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.DECLARATION__DECLARATION_TYPE, null, msgs);
			msgs = basicSetDeclarationType(newDeclarationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.DECLARATION__DECLARATION_TYPE, newDeclarationType, newDeclarationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.DECLARATION__IDENTIFIER_NAME:
				return basicSetIdentifierName(null, msgs);
			case GASTMPackage.DECLARATION__DECLARATION_TYPE:
				return basicSetDeclarationType(null, msgs);
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
			case GASTMPackage.DECLARATION__DEF_REF:
				if (resolve) return getDefRef();
				return basicGetDefRef();
			case GASTMPackage.DECLARATION__IDENTIFIER_NAME:
				return getIdentifierName();
			case GASTMPackage.DECLARATION__DECLARATION_TYPE:
				return getDeclarationType();
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
			case GASTMPackage.DECLARATION__DEF_REF:
				setDefRef((Definition)newValue);
				return;
			case GASTMPackage.DECLARATION__IDENTIFIER_NAME:
				setIdentifierName((Name)newValue);
				return;
			case GASTMPackage.DECLARATION__DECLARATION_TYPE:
				setDeclarationType((TypeReference)newValue);
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
			case GASTMPackage.DECLARATION__DEF_REF:
				setDefRef((Definition)null);
				return;
			case GASTMPackage.DECLARATION__IDENTIFIER_NAME:
				setIdentifierName((Name)null);
				return;
			case GASTMPackage.DECLARATION__DECLARATION_TYPE:
				setDeclarationType((TypeReference)null);
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
			case GASTMPackage.DECLARATION__DEF_REF:
				return defRef != null;
			case GASTMPackage.DECLARATION__IDENTIFIER_NAME:
				return identifierName != null;
			case GASTMPackage.DECLARATION__DECLARATION_TYPE:
				return declarationType != null;
		}
		return super.eIsSet(featureID);
	}

} //DeclarationImpl
