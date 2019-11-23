/**
 * 
 * Copyright (c) 2009 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.code.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.modisco.omg.kdm.code.CodePackage;
import org.eclipse.modisco.omg.kdm.code.Datatype;
import org.eclipse.modisco.omg.kdm.code.DefinedType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defined Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.code.impl.DefinedTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.code.impl.DefinedTypeImpl#getCodeElement <em>Code Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DefinedTypeImpl extends DatatypeImpl implements DefinedType {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Datatype type;

	/**
	 * The cached value of the '{@link #getCodeElement() <em>Code Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeElement()
	 * @generated
	 * @ordered
	 */
	protected Datatype codeElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackage.Literals.DEFINED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Datatype)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.DEFINED_TYPE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Datatype newType) {
		Datatype oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.DEFINED_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype getCodeElement() {
		return codeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeElement(Datatype newCodeElement, NotificationChain msgs) {
		Datatype oldCodeElement = codeElement;
		codeElement = newCodeElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.DEFINED_TYPE__CODE_ELEMENT, oldCodeElement, newCodeElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeElement(Datatype newCodeElement) {
		if (newCodeElement != codeElement) {
			NotificationChain msgs = null;
			if (codeElement != null)
				msgs = ((InternalEObject)codeElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.DEFINED_TYPE__CODE_ELEMENT, null, msgs);
			if (newCodeElement != null)
				msgs = ((InternalEObject)newCodeElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.DEFINED_TYPE__CODE_ELEMENT, null, msgs);
			msgs = basicSetCodeElement(newCodeElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.DEFINED_TYPE__CODE_ELEMENT, newCodeElement, newCodeElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodePackage.DEFINED_TYPE__CODE_ELEMENT:
				return basicSetCodeElement(null, msgs);
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
			case CodePackage.DEFINED_TYPE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CodePackage.DEFINED_TYPE__CODE_ELEMENT:
				return getCodeElement();
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
			case CodePackage.DEFINED_TYPE__TYPE:
				setType((Datatype)newValue);
				return;
			case CodePackage.DEFINED_TYPE__CODE_ELEMENT:
				setCodeElement((Datatype)newValue);
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
			case CodePackage.DEFINED_TYPE__TYPE:
				setType((Datatype)null);
				return;
			case CodePackage.DEFINED_TYPE__CODE_ELEMENT:
				setCodeElement((Datatype)null);
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
			case CodePackage.DEFINED_TYPE__TYPE:
				return type != null;
			case CodePackage.DEFINED_TYPE__CODE_ELEMENT:
				return codeElement != null;
		}
		return super.eIsSet(featureID);
	}

} //DefinedTypeImpl
