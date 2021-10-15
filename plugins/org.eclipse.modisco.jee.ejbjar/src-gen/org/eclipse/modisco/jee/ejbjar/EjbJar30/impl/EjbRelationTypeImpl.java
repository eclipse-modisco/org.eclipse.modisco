/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar30.impl;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbRelationshipRoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ejb Relation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbRelationTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbRelationTypeImpl#getEjbRelationName <em>Ejb Relation Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbRelationTypeImpl#getEjbRelationshipRole <em>Ejb Relationship Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbRelationTypeImpl#getEjbRelationshipRole1 <em>Ejb Relationship Role1</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.EjbRelationTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EjbRelationTypeImpl extends EObjectImpl implements EjbRelationType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<DescriptionType> description;

	/**
	 * The cached value of the '{@link #getEjbRelationName() <em>Ejb Relation Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbRelationName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.ejbjar.EjbJar30.String ejbRelationName;

	/**
	 * The cached value of the '{@link #getEjbRelationshipRole() <em>Ejb Relationship Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbRelationshipRole()
	 * @generated
	 * @ordered
	 */
	protected EjbRelationshipRoleType ejbRelationshipRole;

	/**
	 * The cached value of the '{@link #getEjbRelationshipRole1() <em>Ejb Relationship Role1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbRelationshipRole1()
	 * @generated
	 * @ordered
	 */
	protected EjbRelationshipRoleType ejbRelationshipRole1;

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
	protected EjbRelationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar30Package.eINSTANCE.getEjbRelationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, EjbJar30Package.EJB_RELATION_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.ejbjar.EjbJar30.String getEjbRelationName() {
		return ejbRelationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRelationName(org.eclipse.modisco.jee.ejbjar.EjbJar30.String newEjbRelationName, NotificationChain msgs) {
		org.eclipse.modisco.jee.ejbjar.EjbJar30.String oldEjbRelationName = ejbRelationName;
		ejbRelationName = newEjbRelationName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATION_NAME, oldEjbRelationName, newEjbRelationName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRelationName(org.eclipse.modisco.jee.ejbjar.EjbJar30.String newEjbRelationName) {
		if (newEjbRelationName != ejbRelationName) {
			NotificationChain msgs = null;
			if (ejbRelationName != null)
				msgs = ((InternalEObject)ejbRelationName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATION_NAME, null, msgs);
			if (newEjbRelationName != null)
				msgs = ((InternalEObject)newEjbRelationName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATION_NAME, null, msgs);
			msgs = basicSetEjbRelationName(newEjbRelationName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATION_NAME, newEjbRelationName, newEjbRelationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRelationshipRoleType getEjbRelationshipRole() {
		return ejbRelationshipRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRelationshipRole(EjbRelationshipRoleType newEjbRelationshipRole, NotificationChain msgs) {
		EjbRelationshipRoleType oldEjbRelationshipRole = ejbRelationshipRole;
		ejbRelationshipRole = newEjbRelationshipRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE, oldEjbRelationshipRole, newEjbRelationshipRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRelationshipRole(EjbRelationshipRoleType newEjbRelationshipRole) {
		if (newEjbRelationshipRole != ejbRelationshipRole) {
			NotificationChain msgs = null;
			if (ejbRelationshipRole != null)
				msgs = ((InternalEObject)ejbRelationshipRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE, null, msgs);
			if (newEjbRelationshipRole != null)
				msgs = ((InternalEObject)newEjbRelationshipRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE, null, msgs);
			msgs = basicSetEjbRelationshipRole(newEjbRelationshipRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE, newEjbRelationshipRole, newEjbRelationshipRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRelationshipRoleType getEjbRelationshipRole1() {
		return ejbRelationshipRole1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRelationshipRole1(EjbRelationshipRoleType newEjbRelationshipRole1, NotificationChain msgs) {
		EjbRelationshipRoleType oldEjbRelationshipRole1 = ejbRelationshipRole1;
		ejbRelationshipRole1 = newEjbRelationshipRole1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE1, oldEjbRelationshipRole1, newEjbRelationshipRole1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRelationshipRole1(EjbRelationshipRoleType newEjbRelationshipRole1) {
		if (newEjbRelationshipRole1 != ejbRelationshipRole1) {
			NotificationChain msgs = null;
			if (ejbRelationshipRole1 != null)
				msgs = ((InternalEObject)ejbRelationshipRole1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE1, null, msgs);
			if (newEjbRelationshipRole1 != null)
				msgs = ((InternalEObject)newEjbRelationshipRole1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE1, null, msgs);
			msgs = basicSetEjbRelationshipRole1(newEjbRelationshipRole1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE1, newEjbRelationshipRole1, newEjbRelationshipRole1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.EJB_RELATION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar30Package.EJB_RELATION_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATION_NAME:
				return basicSetEjbRelationName(null, msgs);
			case EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE:
				return basicSetEjbRelationshipRole(null, msgs);
			case EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE1:
				return basicSetEjbRelationshipRole1(null, msgs);
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
			case EjbJar30Package.EJB_RELATION_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATION_NAME:
				return getEjbRelationName();
			case EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE:
				return getEjbRelationshipRole();
			case EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE1:
				return getEjbRelationshipRole1();
			case EjbJar30Package.EJB_RELATION_TYPE__ID:
				return getId();
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
			case EjbJar30Package.EJB_RELATION_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATION_NAME:
				setEjbRelationName((org.eclipse.modisco.jee.ejbjar.EjbJar30.String)newValue);
				return;
			case EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE:
				setEjbRelationshipRole((EjbRelationshipRoleType)newValue);
				return;
			case EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE1:
				setEjbRelationshipRole1((EjbRelationshipRoleType)newValue);
				return;
			case EjbJar30Package.EJB_RELATION_TYPE__ID:
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
			case EjbJar30Package.EJB_RELATION_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATION_NAME:
				setEjbRelationName((org.eclipse.modisco.jee.ejbjar.EjbJar30.String)null);
				return;
			case EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE:
				setEjbRelationshipRole((EjbRelationshipRoleType)null);
				return;
			case EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE1:
				setEjbRelationshipRole1((EjbRelationshipRoleType)null);
				return;
			case EjbJar30Package.EJB_RELATION_TYPE__ID:
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
			case EjbJar30Package.EJB_RELATION_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATION_NAME:
				return ejbRelationName != null;
			case EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE:
				return ejbRelationshipRole != null;
			case EjbJar30Package.EJB_RELATION_TYPE__EJB_RELATIONSHIP_ROLE1:
				return ejbRelationshipRole1 != null;
			case EjbJar30Package.EJB_RELATION_TYPE__ID:
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

} //EjbRelationTypeImpl
