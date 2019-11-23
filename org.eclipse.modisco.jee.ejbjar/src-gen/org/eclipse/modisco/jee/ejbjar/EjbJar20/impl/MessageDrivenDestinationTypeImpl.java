/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.ejbjar.EjbJar20.DestinationTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SubscriptionDurabilityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Driven Destination Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenDestinationTypeImpl#getDestinationType <em>Destination Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenDestinationTypeImpl#getSubscriptionDurability <em>Subscription Durability</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenDestinationTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageDrivenDestinationTypeImpl extends EObjectImpl implements MessageDrivenDestinationType {
	/**
	 * The cached value of the '{@link #getDestinationType() <em>Destination Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationType()
	 * @generated
	 * @ordered
	 */
	protected DestinationTypeType destinationType;

	/**
	 * The cached value of the '{@link #getSubscriptionDurability() <em>Subscription Durability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionDurability()
	 * @generated
	 * @ordered
	 */
	protected SubscriptionDurabilityType subscriptionDurability;

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
	protected MessageDrivenDestinationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar20Package.Literals.MESSAGE_DRIVEN_DESTINATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationTypeType getDestinationType() {
		return destinationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestinationType(DestinationTypeType newDestinationType, NotificationChain msgs) {
		DestinationTypeType oldDestinationType = destinationType;
		destinationType = newDestinationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__DESTINATION_TYPE, oldDestinationType, newDestinationType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationType(DestinationTypeType newDestinationType) {
		if (newDestinationType != destinationType) {
			NotificationChain msgs = null;
			if (destinationType != null)
				msgs = ((InternalEObject)destinationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__DESTINATION_TYPE, null, msgs);
			if (newDestinationType != null)
				msgs = ((InternalEObject)newDestinationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__DESTINATION_TYPE, null, msgs);
			msgs = basicSetDestinationType(newDestinationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__DESTINATION_TYPE, newDestinationType, newDestinationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionDurabilityType getSubscriptionDurability() {
		return subscriptionDurability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscriptionDurability(SubscriptionDurabilityType newSubscriptionDurability, NotificationChain msgs) {
		SubscriptionDurabilityType oldSubscriptionDurability = subscriptionDurability;
		subscriptionDurability = newSubscriptionDurability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__SUBSCRIPTION_DURABILITY, oldSubscriptionDurability, newSubscriptionDurability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriptionDurability(SubscriptionDurabilityType newSubscriptionDurability) {
		if (newSubscriptionDurability != subscriptionDurability) {
			NotificationChain msgs = null;
			if (subscriptionDurability != null)
				msgs = ((InternalEObject)subscriptionDurability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__SUBSCRIPTION_DURABILITY, null, msgs);
			if (newSubscriptionDurability != null)
				msgs = ((InternalEObject)newSubscriptionDurability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__SUBSCRIPTION_DURABILITY, null, msgs);
			msgs = basicSetSubscriptionDurability(newSubscriptionDurability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__SUBSCRIPTION_DURABILITY, newSubscriptionDurability, newSubscriptionDurability));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__DESTINATION_TYPE:
				return basicSetDestinationType(null, msgs);
			case EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__SUBSCRIPTION_DURABILITY:
				return basicSetSubscriptionDurability(null, msgs);
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
			case EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__DESTINATION_TYPE:
				return getDestinationType();
			case EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__SUBSCRIPTION_DURABILITY:
				return getSubscriptionDurability();
			case EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__ID:
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
			case EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__DESTINATION_TYPE:
				setDestinationType((DestinationTypeType)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__SUBSCRIPTION_DURABILITY:
				setSubscriptionDurability((SubscriptionDurabilityType)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__ID:
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
			case EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__DESTINATION_TYPE:
				setDestinationType((DestinationTypeType)null);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__SUBSCRIPTION_DURABILITY:
				setSubscriptionDurability((SubscriptionDurabilityType)null);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__ID:
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
			case EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__DESTINATION_TYPE:
				return destinationType != null;
			case EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__SUBSCRIPTION_DURABILITY:
				return subscriptionDurability != null;
			case EjbJar20Package.MESSAGE_DRIVEN_DESTINATION_TYPE__ID:
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

} //MessageDrivenDestinationTypeImpl
