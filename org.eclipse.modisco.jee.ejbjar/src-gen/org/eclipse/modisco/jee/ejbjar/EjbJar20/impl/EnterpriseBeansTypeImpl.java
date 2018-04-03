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
package org.eclipse.modisco.jee.ejbjar.EjbJar20.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enterprise Beans Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnterpriseBeansTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnterpriseBeansTypeImpl#getSession <em>Session</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnterpriseBeansTypeImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnterpriseBeansTypeImpl#getMessageDriven <em>Message Driven</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EnterpriseBeansTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnterpriseBeansTypeImpl extends EObjectImpl implements EnterpriseBeansType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	protected EnterpriseBeansTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar20Package.Literals.ENTERPRISE_BEANS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, EjbJar20Package.ENTERPRISE_BEANS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SessionType> getSession() {
		return getGroup().list(EjbJar20Package.Literals.ENTERPRISE_BEANS_TYPE__SESSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getEntity() {
		return getGroup().list(EjbJar20Package.Literals.ENTERPRISE_BEANS_TYPE__ENTITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageDrivenType> getMessageDriven() {
		return getGroup().list(EjbJar20Package.Literals.ENTERPRISE_BEANS_TYPE__MESSAGE_DRIVEN);
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.ENTERPRISE_BEANS_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__SESSION:
				return ((InternalEList<?>)getSession()).basicRemove(otherEnd, msgs);
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__MESSAGE_DRIVEN:
				return ((InternalEList<?>)getMessageDriven()).basicRemove(otherEnd, msgs);
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
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__SESSION:
				return getSession();
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__ENTITY:
				return getEntity();
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__MESSAGE_DRIVEN:
				return getMessageDriven();
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__ID:
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
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__SESSION:
				getSession().clear();
				getSession().addAll((Collection<? extends SessionType>)newValue);
				return;
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends EntityType>)newValue);
				return;
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__MESSAGE_DRIVEN:
				getMessageDriven().clear();
				getMessageDriven().addAll((Collection<? extends MessageDrivenType>)newValue);
				return;
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__ID:
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
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__GROUP:
				getGroup().clear();
				return;
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__SESSION:
				getSession().clear();
				return;
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__ENTITY:
				getEntity().clear();
				return;
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__MESSAGE_DRIVEN:
				getMessageDriven().clear();
				return;
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__ID:
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
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__SESSION:
				return !getSession().isEmpty();
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__ENTITY:
				return !getEntity().isEmpty();
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__MESSAGE_DRIVEN:
				return !getMessageDriven().isEmpty();
			case EjbJar20Package.ENTERPRISE_BEANS_TYPE__ID:
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
		result.append(" (group: "); //$NON-NLS-1$
		result.append(group);
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EnterpriseBeansTypeImpl
