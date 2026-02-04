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
package org.eclipse.modisco.jee.ejbjar.EjbJar20.impl;

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

import org.eclipse.modisco.jee.ejbjar.EjbJar20.AcknowledgeModeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.DisplayNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.LargeIconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenDestinationType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageDrivenType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MessageSelectorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityIdentityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SmallIconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.TransactionTypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Driven Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl#getSmallIcon <em>Small Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl#getLargeIcon <em>Large Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl#getMessageSelector <em>Message Selector</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl#getAcknowledgeMode <em>Acknowledge Mode</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl#getMessageDrivenDestination <em>Message Driven Destination</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl#getSecurityIdentity <em>Security Identity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.MessageDrivenTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageDrivenTypeImpl extends EObjectImpl implements MessageDrivenType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DescriptionType description;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected DisplayNameType displayName;

	/**
	 * The cached value of the '{@link #getSmallIcon() <em>Small Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallIcon()
	 * @generated
	 * @ordered
	 */
	protected SmallIconType smallIcon;

	/**
	 * The cached value of the '{@link #getLargeIcon() <em>Large Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeIcon()
	 * @generated
	 * @ordered
	 */
	protected LargeIconType largeIcon;

	/**
	 * The cached value of the '{@link #getEjbName() <em>Ejb Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbName()
	 * @generated
	 * @ordered
	 */
	protected EjbNameType ejbName;

	/**
	 * The cached value of the '{@link #getEjbClass() <em>Ejb Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbClass()
	 * @generated
	 * @ordered
	 */
	protected EjbClassType ejbClass;

	/**
	 * The cached value of the '{@link #getTransactionType() <em>Transaction Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionType()
	 * @generated
	 * @ordered
	 */
	protected TransactionTypeType transactionType;

	/**
	 * The cached value of the '{@link #getMessageSelector() <em>Message Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSelector()
	 * @generated
	 * @ordered
	 */
	protected MessageSelectorType messageSelector;

	/**
	 * The cached value of the '{@link #getAcknowledgeMode() <em>Acknowledge Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcknowledgeMode()
	 * @generated
	 * @ordered
	 */
	protected AcknowledgeModeType acknowledgeMode;

	/**
	 * The cached value of the '{@link #getMessageDrivenDestination() <em>Message Driven Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDrivenDestination()
	 * @generated
	 * @ordered
	 */
	protected MessageDrivenDestinationType messageDrivenDestination;

	/**
	 * The cached value of the '{@link #getEnvEntry() <em>Env Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvEntryType> envEntry;

	/**
	 * The cached value of the '{@link #getEjbRef() <em>Ejb Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbRef()
	 * @generated
	 * @ordered
	 */
	protected EList<EjbRefType> ejbRef;

	/**
	 * The cached value of the '{@link #getEjbLocalRef() <em>Ejb Local Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbLocalRef()
	 * @generated
	 * @ordered
	 */
	protected EList<EjbLocalRefType> ejbLocalRef;

	/**
	 * The cached value of the '{@link #getSecurityIdentity() <em>Security Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityIdentity()
	 * @generated
	 * @ordered
	 */
	protected SecurityIdentityType securityIdentity;

	/**
	 * The cached value of the '{@link #getResourceRef() <em>Resource Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceRefType> resourceRef;

	/**
	 * The cached value of the '{@link #getResourceEnvRef() <em>Resource Env Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceEnvRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceEnvRefType> resourceEnvRef;

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
	protected MessageDrivenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar20Package.Literals.MESSAGE_DRIVEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		DescriptionType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayNameType getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayName(DisplayNameType newDisplayName, NotificationChain msgs) {
		DisplayNameType oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__DISPLAY_NAME, oldDisplayName, newDisplayName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(DisplayNameType newDisplayName) {
		if (newDisplayName != displayName) {
			NotificationChain msgs = null;
			if (displayName != null)
				msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__DISPLAY_NAME, null, msgs);
			if (newDisplayName != null)
				msgs = ((InternalEObject)newDisplayName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__DISPLAY_NAME, null, msgs);
			msgs = basicSetDisplayName(newDisplayName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__DISPLAY_NAME, newDisplayName, newDisplayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallIconType getSmallIcon() {
		return smallIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSmallIcon(SmallIconType newSmallIcon, NotificationChain msgs) {
		SmallIconType oldSmallIcon = smallIcon;
		smallIcon = newSmallIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__SMALL_ICON, oldSmallIcon, newSmallIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmallIcon(SmallIconType newSmallIcon) {
		if (newSmallIcon != smallIcon) {
			NotificationChain msgs = null;
			if (smallIcon != null)
				msgs = ((InternalEObject)smallIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__SMALL_ICON, null, msgs);
			if (newSmallIcon != null)
				msgs = ((InternalEObject)newSmallIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__SMALL_ICON, null, msgs);
			msgs = basicSetSmallIcon(newSmallIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__SMALL_ICON, newSmallIcon, newSmallIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeIconType getLargeIcon() {
		return largeIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeIcon(LargeIconType newLargeIcon, NotificationChain msgs) {
		LargeIconType oldLargeIcon = largeIcon;
		largeIcon = newLargeIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__LARGE_ICON, oldLargeIcon, newLargeIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeIcon(LargeIconType newLargeIcon) {
		if (newLargeIcon != largeIcon) {
			NotificationChain msgs = null;
			if (largeIcon != null)
				msgs = ((InternalEObject)largeIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__LARGE_ICON, null, msgs);
			if (newLargeIcon != null)
				msgs = ((InternalEObject)newLargeIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__LARGE_ICON, null, msgs);
			msgs = basicSetLargeIcon(newLargeIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__LARGE_ICON, newLargeIcon, newLargeIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbNameType getEjbName() {
		return ejbName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbName(EjbNameType newEjbName, NotificationChain msgs) {
		EjbNameType oldEjbName = ejbName;
		ejbName = newEjbName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_NAME, oldEjbName, newEjbName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbName(EjbNameType newEjbName) {
		if (newEjbName != ejbName) {
			NotificationChain msgs = null;
			if (ejbName != null)
				msgs = ((InternalEObject)ejbName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_NAME, null, msgs);
			if (newEjbName != null)
				msgs = ((InternalEObject)newEjbName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_NAME, null, msgs);
			msgs = basicSetEjbName(newEjbName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_NAME, newEjbName, newEjbName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbClassType getEjbClass() {
		return ejbClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbClass(EjbClassType newEjbClass, NotificationChain msgs) {
		EjbClassType oldEjbClass = ejbClass;
		ejbClass = newEjbClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_CLASS, oldEjbClass, newEjbClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbClass(EjbClassType newEjbClass) {
		if (newEjbClass != ejbClass) {
			NotificationChain msgs = null;
			if (ejbClass != null)
				msgs = ((InternalEObject)ejbClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_CLASS, null, msgs);
			if (newEjbClass != null)
				msgs = ((InternalEObject)newEjbClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_CLASS, null, msgs);
			msgs = basicSetEjbClass(newEjbClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_CLASS, newEjbClass, newEjbClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionTypeType getTransactionType() {
		return transactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionType(TransactionTypeType newTransactionType, NotificationChain msgs) {
		TransactionTypeType oldTransactionType = transactionType;
		transactionType = newTransactionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__TRANSACTION_TYPE, oldTransactionType, newTransactionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionType(TransactionTypeType newTransactionType) {
		if (newTransactionType != transactionType) {
			NotificationChain msgs = null;
			if (transactionType != null)
				msgs = ((InternalEObject)transactionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__TRANSACTION_TYPE, null, msgs);
			if (newTransactionType != null)
				msgs = ((InternalEObject)newTransactionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__TRANSACTION_TYPE, null, msgs);
			msgs = basicSetTransactionType(newTransactionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__TRANSACTION_TYPE, newTransactionType, newTransactionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSelectorType getMessageSelector() {
		return messageSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageSelector(MessageSelectorType newMessageSelector, NotificationChain msgs) {
		MessageSelectorType oldMessageSelector = messageSelector;
		messageSelector = newMessageSelector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_SELECTOR, oldMessageSelector, newMessageSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageSelector(MessageSelectorType newMessageSelector) {
		if (newMessageSelector != messageSelector) {
			NotificationChain msgs = null;
			if (messageSelector != null)
				msgs = ((InternalEObject)messageSelector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_SELECTOR, null, msgs);
			if (newMessageSelector != null)
				msgs = ((InternalEObject)newMessageSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_SELECTOR, null, msgs);
			msgs = basicSetMessageSelector(newMessageSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_SELECTOR, newMessageSelector, newMessageSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcknowledgeModeType getAcknowledgeMode() {
		return acknowledgeMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcknowledgeMode(AcknowledgeModeType newAcknowledgeMode, NotificationChain msgs) {
		AcknowledgeModeType oldAcknowledgeMode = acknowledgeMode;
		acknowledgeMode = newAcknowledgeMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__ACKNOWLEDGE_MODE, oldAcknowledgeMode, newAcknowledgeMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcknowledgeMode(AcknowledgeModeType newAcknowledgeMode) {
		if (newAcknowledgeMode != acknowledgeMode) {
			NotificationChain msgs = null;
			if (acknowledgeMode != null)
				msgs = ((InternalEObject)acknowledgeMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__ACKNOWLEDGE_MODE, null, msgs);
			if (newAcknowledgeMode != null)
				msgs = ((InternalEObject)newAcknowledgeMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__ACKNOWLEDGE_MODE, null, msgs);
			msgs = basicSetAcknowledgeMode(newAcknowledgeMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__ACKNOWLEDGE_MODE, newAcknowledgeMode, newAcknowledgeMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDrivenDestinationType getMessageDrivenDestination() {
		return messageDrivenDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageDrivenDestination(MessageDrivenDestinationType newMessageDrivenDestination, NotificationChain msgs) {
		MessageDrivenDestinationType oldMessageDrivenDestination = messageDrivenDestination;
		messageDrivenDestination = newMessageDrivenDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_DRIVEN_DESTINATION, oldMessageDrivenDestination, newMessageDrivenDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDrivenDestination(MessageDrivenDestinationType newMessageDrivenDestination) {
		if (newMessageDrivenDestination != messageDrivenDestination) {
			NotificationChain msgs = null;
			if (messageDrivenDestination != null)
				msgs = ((InternalEObject)messageDrivenDestination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_DRIVEN_DESTINATION, null, msgs);
			if (newMessageDrivenDestination != null)
				msgs = ((InternalEObject)newMessageDrivenDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_DRIVEN_DESTINATION, null, msgs);
			msgs = basicSetMessageDrivenDestination(newMessageDrivenDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_DRIVEN_DESTINATION, newMessageDrivenDestination, newMessageDrivenDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvEntryType> getEnvEntry() {
		if (envEntry == null) {
			envEntry = new EObjectContainmentEList<EnvEntryType>(EnvEntryType.class, this, EjbJar20Package.MESSAGE_DRIVEN_TYPE__ENV_ENTRY);
		}
		return envEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EjbRefType> getEjbRef() {
		if (ejbRef == null) {
			ejbRef = new EObjectContainmentEList<EjbRefType>(EjbRefType.class, this, EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_REF);
		}
		return ejbRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EjbLocalRefType> getEjbLocalRef() {
		if (ejbLocalRef == null) {
			ejbLocalRef = new EObjectContainmentEList<EjbLocalRefType>(EjbLocalRefType.class, this, EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_LOCAL_REF);
		}
		return ejbLocalRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityIdentityType getSecurityIdentity() {
		return securityIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityIdentity(SecurityIdentityType newSecurityIdentity, NotificationChain msgs) {
		SecurityIdentityType oldSecurityIdentity = securityIdentity;
		securityIdentity = newSecurityIdentity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__SECURITY_IDENTITY, oldSecurityIdentity, newSecurityIdentity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityIdentity(SecurityIdentityType newSecurityIdentity) {
		if (newSecurityIdentity != securityIdentity) {
			NotificationChain msgs = null;
			if (securityIdentity != null)
				msgs = ((InternalEObject)securityIdentity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__SECURITY_IDENTITY, null, msgs);
			if (newSecurityIdentity != null)
				msgs = ((InternalEObject)newSecurityIdentity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.MESSAGE_DRIVEN_TYPE__SECURITY_IDENTITY, null, msgs);
			msgs = basicSetSecurityIdentity(newSecurityIdentity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__SECURITY_IDENTITY, newSecurityIdentity, newSecurityIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceRefType> getResourceRef() {
		if (resourceRef == null) {
			resourceRef = new EObjectContainmentEList<ResourceRefType>(ResourceRefType.class, this, EjbJar20Package.MESSAGE_DRIVEN_TYPE__RESOURCE_REF);
		}
		return resourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceEnvRefType> getResourceEnvRef() {
		if (resourceEnvRef == null) {
			resourceEnvRef = new EObjectContainmentEList<ResourceEnvRefType>(ResourceEnvRefType.class, this, EjbJar20Package.MESSAGE_DRIVEN_TYPE__RESOURCE_ENV_REF);
		}
		return resourceEnvRef;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.MESSAGE_DRIVEN_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__DISPLAY_NAME:
				return basicSetDisplayName(null, msgs);
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__SMALL_ICON:
				return basicSetSmallIcon(null, msgs);
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__LARGE_ICON:
				return basicSetLargeIcon(null, msgs);
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_NAME:
				return basicSetEjbName(null, msgs);
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_CLASS:
				return basicSetEjbClass(null, msgs);
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__TRANSACTION_TYPE:
				return basicSetTransactionType(null, msgs);
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_SELECTOR:
				return basicSetMessageSelector(null, msgs);
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__ACKNOWLEDGE_MODE:
				return basicSetAcknowledgeMode(null, msgs);
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_DRIVEN_DESTINATION:
				return basicSetMessageDrivenDestination(null, msgs);
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__ENV_ENTRY:
				return ((InternalEList<?>)getEnvEntry()).basicRemove(otherEnd, msgs);
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_REF:
				return ((InternalEList<?>)getEjbRef()).basicRemove(otherEnd, msgs);
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_LOCAL_REF:
				return ((InternalEList<?>)getEjbLocalRef()).basicRemove(otherEnd, msgs);
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__SECURITY_IDENTITY:
				return basicSetSecurityIdentity(null, msgs);
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__RESOURCE_REF:
				return ((InternalEList<?>)getResourceRef()).basicRemove(otherEnd, msgs);
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__RESOURCE_ENV_REF:
				return ((InternalEList<?>)getResourceEnvRef()).basicRemove(otherEnd, msgs);
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
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__SMALL_ICON:
				return getSmallIcon();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__LARGE_ICON:
				return getLargeIcon();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_NAME:
				return getEjbName();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_CLASS:
				return getEjbClass();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__TRANSACTION_TYPE:
				return getTransactionType();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_SELECTOR:
				return getMessageSelector();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__ACKNOWLEDGE_MODE:
				return getAcknowledgeMode();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_DRIVEN_DESTINATION:
				return getMessageDrivenDestination();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__ENV_ENTRY:
				return getEnvEntry();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_REF:
				return getEjbRef();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_LOCAL_REF:
				return getEjbLocalRef();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__SECURITY_IDENTITY:
				return getSecurityIdentity();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__RESOURCE_REF:
				return getResourceRef();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__RESOURCE_ENV_REF:
				return getResourceEnvRef();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__ID:
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
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__DISPLAY_NAME:
				setDisplayName((DisplayNameType)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__SMALL_ICON:
				setSmallIcon((SmallIconType)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__LARGE_ICON:
				setLargeIcon((LargeIconType)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_NAME:
				setEjbName((EjbNameType)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_CLASS:
				setEjbClass((EjbClassType)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__TRANSACTION_TYPE:
				setTransactionType((TransactionTypeType)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_SELECTOR:
				setMessageSelector((MessageSelectorType)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__ACKNOWLEDGE_MODE:
				setAcknowledgeMode((AcknowledgeModeType)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_DRIVEN_DESTINATION:
				setMessageDrivenDestination((MessageDrivenDestinationType)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				getEnvEntry().addAll((Collection<? extends EnvEntryType>)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_REF:
				getEjbRef().clear();
				getEjbRef().addAll((Collection<? extends EjbRefType>)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				getEjbLocalRef().addAll((Collection<? extends EjbLocalRefType>)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__SECURITY_IDENTITY:
				setSecurityIdentity((SecurityIdentityType)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				getResourceRef().addAll((Collection<? extends ResourceRefType>)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				getResourceEnvRef().addAll((Collection<? extends ResourceEnvRefType>)newValue);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__ID:
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
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__DISPLAY_NAME:
				setDisplayName((DisplayNameType)null);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__SMALL_ICON:
				setSmallIcon((SmallIconType)null);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__LARGE_ICON:
				setLargeIcon((LargeIconType)null);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_NAME:
				setEjbName((EjbNameType)null);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_CLASS:
				setEjbClass((EjbClassType)null);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__TRANSACTION_TYPE:
				setTransactionType((TransactionTypeType)null);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_SELECTOR:
				setMessageSelector((MessageSelectorType)null);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__ACKNOWLEDGE_MODE:
				setAcknowledgeMode((AcknowledgeModeType)null);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_DRIVEN_DESTINATION:
				setMessageDrivenDestination((MessageDrivenDestinationType)null);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_REF:
				getEjbRef().clear();
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__SECURITY_IDENTITY:
				setSecurityIdentity((SecurityIdentityType)null);
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				return;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__ID:
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
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__DESCRIPTION:
				return description != null;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__DISPLAY_NAME:
				return displayName != null;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__SMALL_ICON:
				return smallIcon != null;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__LARGE_ICON:
				return largeIcon != null;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_NAME:
				return ejbName != null;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_CLASS:
				return ejbClass != null;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__TRANSACTION_TYPE:
				return transactionType != null;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_SELECTOR:
				return messageSelector != null;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__ACKNOWLEDGE_MODE:
				return acknowledgeMode != null;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__MESSAGE_DRIVEN_DESTINATION:
				return messageDrivenDestination != null;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__ENV_ENTRY:
				return envEntry != null && !envEntry.isEmpty();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_REF:
				return ejbRef != null && !ejbRef.isEmpty();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__EJB_LOCAL_REF:
				return ejbLocalRef != null && !ejbLocalRef.isEmpty();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__SECURITY_IDENTITY:
				return securityIdentity != null;
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__RESOURCE_REF:
				return resourceRef != null && !resourceRef.isEmpty();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__RESOURCE_ENV_REF:
				return resourceEnvRef != null && !resourceEnvRef.isEmpty();
			case EjbJar20Package.MESSAGE_DRIVEN_TYPE__ID:
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

} //MessageDrivenTypeImpl
