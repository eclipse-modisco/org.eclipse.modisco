/**
 *   Copyright (c) 2010, 2019 Mia-Software and others.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp24.impl;

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

import org.eclipse.modisco.jee.webapp.webapp24.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp24.DisplayNameType;
import org.eclipse.modisco.jee.webapp.webapp24.IconType;
import org.eclipse.modisco.jee.webapp.webapp24.MessageDestinationType;
import org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Destination Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationTypeImpl#getMessageDestinationName <em>Message Destination Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.MessageDestinationTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageDestinationTypeImpl extends EObjectImpl implements MessageDestinationType {
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
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected EList<DisplayNameType> displayName;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected EList<IconType> icon;

	/**
	 * The cached value of the '{@link #getMessageDestinationName() <em>Message Destination Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDestinationName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.webapp.webapp24.String messageDestinationName;

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
	protected MessageDestinationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp24Package.Literals.MESSAGE_DESTINATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, Webapp24Package.MESSAGE_DESTINATION_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisplayNameType> getDisplayName() {
		if (displayName == null) {
			displayName = new EObjectContainmentEList<DisplayNameType>(DisplayNameType.class, this, Webapp24Package.MESSAGE_DESTINATION_TYPE__DISPLAY_NAME);
		}
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IconType> getIcon() {
		if (icon == null) {
			icon = new EObjectContainmentEList<IconType>(IconType.class, this, Webapp24Package.MESSAGE_DESTINATION_TYPE__ICON);
		}
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.webapp.webapp24.String getMessageDestinationName() {
		return messageDestinationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageDestinationName(org.eclipse.modisco.jee.webapp.webapp24.String newMessageDestinationName, NotificationChain msgs) {
		org.eclipse.modisco.jee.webapp.webapp24.String oldMessageDestinationName = messageDestinationName;
		messageDestinationName = newMessageDestinationName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.MESSAGE_DESTINATION_TYPE__MESSAGE_DESTINATION_NAME, oldMessageDestinationName, newMessageDestinationName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDestinationName(org.eclipse.modisco.jee.webapp.webapp24.String newMessageDestinationName) {
		if (newMessageDestinationName != messageDestinationName) {
			NotificationChain msgs = null;
			if (messageDestinationName != null)
				msgs = ((InternalEObject)messageDestinationName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.MESSAGE_DESTINATION_TYPE__MESSAGE_DESTINATION_NAME, null, msgs);
			if (newMessageDestinationName != null)
				msgs = ((InternalEObject)newMessageDestinationName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.MESSAGE_DESTINATION_TYPE__MESSAGE_DESTINATION_NAME, null, msgs);
			msgs = basicSetMessageDestinationName(newMessageDestinationName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.MESSAGE_DESTINATION_TYPE__MESSAGE_DESTINATION_NAME, newMessageDestinationName, newMessageDestinationName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.MESSAGE_DESTINATION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__DISPLAY_NAME:
				return ((InternalEList<?>)getDisplayName()).basicRemove(otherEnd, msgs);
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__ICON:
				return ((InternalEList<?>)getIcon()).basicRemove(otherEnd, msgs);
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__MESSAGE_DESTINATION_NAME:
				return basicSetMessageDestinationName(null, msgs);
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
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__ICON:
				return getIcon();
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__MESSAGE_DESTINATION_NAME:
				return getMessageDestinationName();
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__ID:
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
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				getDisplayName().addAll((Collection<? extends DisplayNameType>)newValue);
				return;
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__ICON:
				getIcon().clear();
				getIcon().addAll((Collection<? extends IconType>)newValue);
				return;
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__MESSAGE_DESTINATION_NAME:
				setMessageDestinationName((org.eclipse.modisco.jee.webapp.webapp24.String)newValue);
				return;
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__ID:
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
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__DISPLAY_NAME:
				getDisplayName().clear();
				return;
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__ICON:
				getIcon().clear();
				return;
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__MESSAGE_DESTINATION_NAME:
				setMessageDestinationName((org.eclipse.modisco.jee.webapp.webapp24.String)null);
				return;
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__ID:
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
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__DISPLAY_NAME:
				return displayName != null && !displayName.isEmpty();
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__ICON:
				return icon != null && !icon.isEmpty();
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__MESSAGE_DESTINATION_NAME:
				return messageDestinationName != null;
			case Webapp24Package.MESSAGE_DESTINATION_TYPE__ID:
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //MessageDestinationTypeImpl
