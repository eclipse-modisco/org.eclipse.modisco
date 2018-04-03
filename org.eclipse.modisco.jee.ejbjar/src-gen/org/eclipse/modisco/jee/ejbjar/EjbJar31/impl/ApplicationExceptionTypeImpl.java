/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v1.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar31.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.ejbjar.EjbJar31.ApplicationExceptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.FullyQualifiedClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TrueFalseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Exception Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.ApplicationExceptionTypeImpl#getExceptionClass <em>Exception Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.ApplicationExceptionTypeImpl#getRollback <em>Rollback</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.ApplicationExceptionTypeImpl#getInherited <em>Inherited</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.ApplicationExceptionTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationExceptionTypeImpl extends EObjectImpl implements ApplicationExceptionType {
	/**
	 * The cached value of the '{@link #getExceptionClass() <em>Exception Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionClass()
	 * @generated
	 * @ordered
	 */
	protected FullyQualifiedClassType exceptionClass;

	/**
	 * The cached value of the '{@link #getRollback() <em>Rollback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollback()
	 * @generated
	 * @ordered
	 */
	protected TrueFalseType rollback;

	/**
	 * The cached value of the '{@link #getInherited() <em>Inherited</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInherited()
	 * @generated
	 * @ordered
	 */
	protected TrueFalseType inherited;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationExceptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar31Package.eINSTANCE.getApplicationExceptionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedClassType getExceptionClass() {
		return exceptionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionClass(FullyQualifiedClassType newExceptionClass, NotificationChain msgs) {
		FullyQualifiedClassType oldExceptionClass = exceptionClass;
		exceptionClass = newExceptionClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.APPLICATION_EXCEPTION_TYPE__EXCEPTION_CLASS, oldExceptionClass, newExceptionClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionClass(FullyQualifiedClassType newExceptionClass) {
		if (newExceptionClass != exceptionClass) {
			NotificationChain msgs = null;
			if (exceptionClass != null)
				msgs = ((InternalEObject)exceptionClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.APPLICATION_EXCEPTION_TYPE__EXCEPTION_CLASS, null, msgs);
			if (newExceptionClass != null)
				msgs = ((InternalEObject)newExceptionClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.APPLICATION_EXCEPTION_TYPE__EXCEPTION_CLASS, null, msgs);
			msgs = basicSetExceptionClass(newExceptionClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.APPLICATION_EXCEPTION_TYPE__EXCEPTION_CLASS, newExceptionClass, newExceptionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType getRollback() {
		return rollback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollback(TrueFalseType newRollback, NotificationChain msgs) {
		TrueFalseType oldRollback = rollback;
		rollback = newRollback;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.APPLICATION_EXCEPTION_TYPE__ROLLBACK, oldRollback, newRollback);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRollback(TrueFalseType newRollback) {
		if (newRollback != rollback) {
			NotificationChain msgs = null;
			if (rollback != null)
				msgs = ((InternalEObject)rollback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.APPLICATION_EXCEPTION_TYPE__ROLLBACK, null, msgs);
			if (newRollback != null)
				msgs = ((InternalEObject)newRollback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.APPLICATION_EXCEPTION_TYPE__ROLLBACK, null, msgs);
			msgs = basicSetRollback(newRollback, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.APPLICATION_EXCEPTION_TYPE__ROLLBACK, newRollback, newRollback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType getInherited() {
		return inherited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInherited(TrueFalseType newInherited, NotificationChain msgs) {
		TrueFalseType oldInherited = inherited;
		inherited = newInherited;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.APPLICATION_EXCEPTION_TYPE__INHERITED, oldInherited, newInherited);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInherited(TrueFalseType newInherited) {
		if (newInherited != inherited) {
			NotificationChain msgs = null;
			if (inherited != null)
				msgs = ((InternalEObject)inherited).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.APPLICATION_EXCEPTION_TYPE__INHERITED, null, msgs);
			if (newInherited != null)
				msgs = ((InternalEObject)newInherited).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.APPLICATION_EXCEPTION_TYPE__INHERITED, null, msgs);
			msgs = basicSetInherited(newInherited, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.APPLICATION_EXCEPTION_TYPE__INHERITED, newInherited, newInherited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.APPLICATION_EXCEPTION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__EXCEPTION_CLASS:
				return basicSetExceptionClass(null, msgs);
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__ROLLBACK:
				return basicSetRollback(null, msgs);
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__INHERITED:
				return basicSetInherited(null, msgs);
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
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__EXCEPTION_CLASS:
				return getExceptionClass();
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__ROLLBACK:
				return getRollback();
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__INHERITED:
				return getInherited();
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__ID:
				return getId();
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
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__EXCEPTION_CLASS:
				setExceptionClass((FullyQualifiedClassType)newValue);
				return;
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__ROLLBACK:
				setRollback((TrueFalseType)newValue);
				return;
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__INHERITED:
				setInherited((TrueFalseType)newValue);
				return;
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__ID:
				setId((String)newValue);
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
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__EXCEPTION_CLASS:
				setExceptionClass((FullyQualifiedClassType)null);
				return;
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__ROLLBACK:
				setRollback((TrueFalseType)null);
				return;
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__INHERITED:
				setInherited((TrueFalseType)null);
				return;
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__EXCEPTION_CLASS:
				return exceptionClass != null;
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__ROLLBACK:
				return rollback != null;
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__INHERITED:
				return inherited != null;
			case EjbJar31Package.APPLICATION_EXCEPTION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ApplicationExceptionTypeImpl
