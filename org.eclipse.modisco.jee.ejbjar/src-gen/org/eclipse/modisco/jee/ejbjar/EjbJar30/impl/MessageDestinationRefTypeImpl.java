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
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InjectionTargetType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.JndiNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationLinkType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationUsageType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdStringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Destination Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationRefTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationRefTypeImpl#getMessageDestinationRefName <em>Message Destination Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationRefTypeImpl#getMessageDestinationType <em>Message Destination Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationRefTypeImpl#getMessageDestinationUsage <em>Message Destination Usage</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationRefTypeImpl#getMessageDestinationLink <em>Message Destination Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationRefTypeImpl#getMappedName <em>Mapped Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationRefTypeImpl#getInjectionTarget <em>Injection Target</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.MessageDestinationRefTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageDestinationRefTypeImpl extends EObjectImpl implements MessageDestinationRefType {
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
	 * The cached value of the '{@link #getMessageDestinationRefName() <em>Message Destination Ref Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDestinationRefName()
	 * @generated
	 * @ordered
	 */
	protected JndiNameType messageDestinationRefName;

	/**
	 * The cached value of the '{@link #getMessageDestinationType() <em>Message Destination Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDestinationType()
	 * @generated
	 * @ordered
	 */
	protected MessageDestinationTypeType messageDestinationType;

	/**
	 * The cached value of the '{@link #getMessageDestinationUsage() <em>Message Destination Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDestinationUsage()
	 * @generated
	 * @ordered
	 */
	protected MessageDestinationUsageType messageDestinationUsage;

	/**
	 * The cached value of the '{@link #getMessageDestinationLink() <em>Message Destination Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDestinationLink()
	 * @generated
	 * @ordered
	 */
	protected MessageDestinationLinkType messageDestinationLink;

	/**
	 * The cached value of the '{@link #getMappedName() <em>Mapped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedName()
	 * @generated
	 * @ordered
	 */
	protected XsdStringType mappedName;

	/**
	 * The cached value of the '{@link #getInjectionTarget() <em>Injection Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInjectionTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<InjectionTargetType> injectionTarget;

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
	protected MessageDestinationRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar30Package.eINSTANCE.getMessageDestinationRefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JndiNameType getMessageDestinationRefName() {
		return messageDestinationRefName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageDestinationRefName(JndiNameType newMessageDestinationRefName, NotificationChain msgs) {
		JndiNameType oldMessageDestinationRefName = messageDestinationRefName;
		messageDestinationRefName = newMessageDestinationRefName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_REF_NAME, oldMessageDestinationRefName, newMessageDestinationRefName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDestinationRefName(JndiNameType newMessageDestinationRefName) {
		if (newMessageDestinationRefName != messageDestinationRefName) {
			NotificationChain msgs = null;
			if (messageDestinationRefName != null)
				msgs = ((InternalEObject)messageDestinationRefName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_REF_NAME, null, msgs);
			if (newMessageDestinationRefName != null)
				msgs = ((InternalEObject)newMessageDestinationRefName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_REF_NAME, null, msgs);
			msgs = basicSetMessageDestinationRefName(newMessageDestinationRefName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_REF_NAME, newMessageDestinationRefName, newMessageDestinationRefName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationTypeType getMessageDestinationType() {
		return messageDestinationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageDestinationType(MessageDestinationTypeType newMessageDestinationType, NotificationChain msgs) {
		MessageDestinationTypeType oldMessageDestinationType = messageDestinationType;
		messageDestinationType = newMessageDestinationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_TYPE, oldMessageDestinationType, newMessageDestinationType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDestinationType(MessageDestinationTypeType newMessageDestinationType) {
		if (newMessageDestinationType != messageDestinationType) {
			NotificationChain msgs = null;
			if (messageDestinationType != null)
				msgs = ((InternalEObject)messageDestinationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_TYPE, null, msgs);
			if (newMessageDestinationType != null)
				msgs = ((InternalEObject)newMessageDestinationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_TYPE, null, msgs);
			msgs = basicSetMessageDestinationType(newMessageDestinationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_TYPE, newMessageDestinationType, newMessageDestinationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationUsageType getMessageDestinationUsage() {
		return messageDestinationUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageDestinationUsage(MessageDestinationUsageType newMessageDestinationUsage, NotificationChain msgs) {
		MessageDestinationUsageType oldMessageDestinationUsage = messageDestinationUsage;
		messageDestinationUsage = newMessageDestinationUsage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_USAGE, oldMessageDestinationUsage, newMessageDestinationUsage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDestinationUsage(MessageDestinationUsageType newMessageDestinationUsage) {
		if (newMessageDestinationUsage != messageDestinationUsage) {
			NotificationChain msgs = null;
			if (messageDestinationUsage != null)
				msgs = ((InternalEObject)messageDestinationUsage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_USAGE, null, msgs);
			if (newMessageDestinationUsage != null)
				msgs = ((InternalEObject)newMessageDestinationUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_USAGE, null, msgs);
			msgs = basicSetMessageDestinationUsage(newMessageDestinationUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_USAGE, newMessageDestinationUsage, newMessageDestinationUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDestinationLinkType getMessageDestinationLink() {
		return messageDestinationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageDestinationLink(MessageDestinationLinkType newMessageDestinationLink, NotificationChain msgs) {
		MessageDestinationLinkType oldMessageDestinationLink = messageDestinationLink;
		messageDestinationLink = newMessageDestinationLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_LINK, oldMessageDestinationLink, newMessageDestinationLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDestinationLink(MessageDestinationLinkType newMessageDestinationLink) {
		if (newMessageDestinationLink != messageDestinationLink) {
			NotificationChain msgs = null;
			if (messageDestinationLink != null)
				msgs = ((InternalEObject)messageDestinationLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_LINK, null, msgs);
			if (newMessageDestinationLink != null)
				msgs = ((InternalEObject)newMessageDestinationLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_LINK, null, msgs);
			msgs = basicSetMessageDestinationLink(newMessageDestinationLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_LINK, newMessageDestinationLink, newMessageDestinationLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdStringType getMappedName() {
		return mappedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappedName(XsdStringType newMappedName, NotificationChain msgs) {
		XsdStringType oldMappedName = mappedName;
		mappedName = newMappedName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MAPPED_NAME, oldMappedName, newMappedName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedName(XsdStringType newMappedName) {
		if (newMappedName != mappedName) {
			NotificationChain msgs = null;
			if (mappedName != null)
				msgs = ((InternalEObject)mappedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MAPPED_NAME, null, msgs);
			if (newMappedName != null)
				msgs = ((InternalEObject)newMappedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MAPPED_NAME, null, msgs);
			msgs = basicSetMappedName(newMappedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MAPPED_NAME, newMappedName, newMappedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InjectionTargetType> getInjectionTarget() {
		if (injectionTarget == null) {
			injectionTarget = new EObjectContainmentEList<InjectionTargetType>(InjectionTargetType.class, this, EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__INJECTION_TARGET);
		}
		return injectionTarget;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_REF_NAME:
				return basicSetMessageDestinationRefName(null, msgs);
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_TYPE:
				return basicSetMessageDestinationType(null, msgs);
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_USAGE:
				return basicSetMessageDestinationUsage(null, msgs);
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_LINK:
				return basicSetMessageDestinationLink(null, msgs);
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MAPPED_NAME:
				return basicSetMappedName(null, msgs);
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__INJECTION_TARGET:
				return ((InternalEList<?>)getInjectionTarget()).basicRemove(otherEnd, msgs);
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
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_REF_NAME:
				return getMessageDestinationRefName();
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_TYPE:
				return getMessageDestinationType();
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_USAGE:
				return getMessageDestinationUsage();
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_LINK:
				return getMessageDestinationLink();
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MAPPED_NAME:
				return getMappedName();
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__INJECTION_TARGET:
				return getInjectionTarget();
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__ID:
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
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_REF_NAME:
				setMessageDestinationRefName((JndiNameType)newValue);
				return;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_TYPE:
				setMessageDestinationType((MessageDestinationTypeType)newValue);
				return;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_USAGE:
				setMessageDestinationUsage((MessageDestinationUsageType)newValue);
				return;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_LINK:
				setMessageDestinationLink((MessageDestinationLinkType)newValue);
				return;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MAPPED_NAME:
				setMappedName((XsdStringType)newValue);
				return;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__INJECTION_TARGET:
				getInjectionTarget().clear();
				getInjectionTarget().addAll((Collection<? extends InjectionTargetType>)newValue);
				return;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__ID:
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
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_REF_NAME:
				setMessageDestinationRefName((JndiNameType)null);
				return;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_TYPE:
				setMessageDestinationType((MessageDestinationTypeType)null);
				return;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_USAGE:
				setMessageDestinationUsage((MessageDestinationUsageType)null);
				return;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_LINK:
				setMessageDestinationLink((MessageDestinationLinkType)null);
				return;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MAPPED_NAME:
				setMappedName((XsdStringType)null);
				return;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__INJECTION_TARGET:
				getInjectionTarget().clear();
				return;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__ID:
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
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_REF_NAME:
				return messageDestinationRefName != null;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_TYPE:
				return messageDestinationType != null;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_USAGE:
				return messageDestinationUsage != null;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MESSAGE_DESTINATION_LINK:
				return messageDestinationLink != null;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__MAPPED_NAME:
				return mappedName != null;
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__INJECTION_TARGET:
				return injectionTarget != null && !injectionTarget.isEmpty();
			case EjbJar30Package.MESSAGE_DESTINATION_REF_TYPE__ID:
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

} //MessageDestinationRefTypeImpl
