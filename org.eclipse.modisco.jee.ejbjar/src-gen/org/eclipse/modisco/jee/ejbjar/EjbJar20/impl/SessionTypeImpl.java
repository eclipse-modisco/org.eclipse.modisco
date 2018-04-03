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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.jee.ejbjar.EjbJar20.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.DisplayNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbLocalRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EnvEntryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.HomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.LargeIconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalHomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.LocalType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.RemoteType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceEnvRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.ResourceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityIdentityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SecurityRoleRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SmallIconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.TransactionTypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getSmallIcon <em>Small Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getLargeIcon <em>Large Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getHome <em>Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getRemote <em>Remote</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getLocalHome <em>Local Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getSessionType <em>Session Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getTransactionType <em>Transaction Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getEjbLocalRef <em>Ejb Local Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getSecurityRoleRef <em>Security Role Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getSecurityIdentity <em>Security Identity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getResourceEnvRef <em>Resource Env Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.SessionTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SessionTypeImpl extends EObjectImpl implements SessionType {
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
	 * The cached value of the '{@link #getHome() <em>Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome()
	 * @generated
	 * @ordered
	 */
	protected HomeType home;

	/**
	 * The cached value of the '{@link #getRemote() <em>Remote</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemote()
	 * @generated
	 * @ordered
	 */
	protected RemoteType remote;

	/**
	 * The cached value of the '{@link #getLocalHome() <em>Local Home</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalHome()
	 * @generated
	 * @ordered
	 */
	protected LocalHomeType localHome;

	/**
	 * The cached value of the '{@link #getLocal() <em>Local</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected LocalType local;

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
	 * The cached value of the '{@link #getSessionType() <em>Session Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionType()
	 * @generated
	 * @ordered
	 */
	protected SessionTypeType sessionType;

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
	 * The cached value of the '{@link #getSecurityRoleRef() <em>Security Role Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRoleRef()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRoleRefType> securityRoleRef;

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
	protected SessionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar20Package.Literals.SESSION_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__DISPLAY_NAME, oldDisplayName, newDisplayName);
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
				msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__DISPLAY_NAME, null, msgs);
			if (newDisplayName != null)
				msgs = ((InternalEObject)newDisplayName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__DISPLAY_NAME, null, msgs);
			msgs = basicSetDisplayName(newDisplayName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__DISPLAY_NAME, newDisplayName, newDisplayName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__SMALL_ICON, oldSmallIcon, newSmallIcon);
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
				msgs = ((InternalEObject)smallIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__SMALL_ICON, null, msgs);
			if (newSmallIcon != null)
				msgs = ((InternalEObject)newSmallIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__SMALL_ICON, null, msgs);
			msgs = basicSetSmallIcon(newSmallIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__SMALL_ICON, newSmallIcon, newSmallIcon));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__LARGE_ICON, oldLargeIcon, newLargeIcon);
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
				msgs = ((InternalEObject)largeIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__LARGE_ICON, null, msgs);
			if (newLargeIcon != null)
				msgs = ((InternalEObject)newLargeIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__LARGE_ICON, null, msgs);
			msgs = basicSetLargeIcon(newLargeIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__LARGE_ICON, newLargeIcon, newLargeIcon));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__EJB_NAME, oldEjbName, newEjbName);
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
				msgs = ((InternalEObject)ejbName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__EJB_NAME, null, msgs);
			if (newEjbName != null)
				msgs = ((InternalEObject)newEjbName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__EJB_NAME, null, msgs);
			msgs = basicSetEjbName(newEjbName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__EJB_NAME, newEjbName, newEjbName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeType getHome() {
		return home;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHome(HomeType newHome, NotificationChain msgs) {
		HomeType oldHome = home;
		home = newHome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__HOME, oldHome, newHome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome(HomeType newHome) {
		if (newHome != home) {
			NotificationChain msgs = null;
			if (home != null)
				msgs = ((InternalEObject)home).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__HOME, null, msgs);
			if (newHome != null)
				msgs = ((InternalEObject)newHome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__HOME, null, msgs);
			msgs = basicSetHome(newHome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__HOME, newHome, newHome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteType getRemote() {
		return remote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemote(RemoteType newRemote, NotificationChain msgs) {
		RemoteType oldRemote = remote;
		remote = newRemote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__REMOTE, oldRemote, newRemote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemote(RemoteType newRemote) {
		if (newRemote != remote) {
			NotificationChain msgs = null;
			if (remote != null)
				msgs = ((InternalEObject)remote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__REMOTE, null, msgs);
			if (newRemote != null)
				msgs = ((InternalEObject)newRemote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__REMOTE, null, msgs);
			msgs = basicSetRemote(newRemote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__REMOTE, newRemote, newRemote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalHomeType getLocalHome() {
		return localHome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalHome(LocalHomeType newLocalHome, NotificationChain msgs) {
		LocalHomeType oldLocalHome = localHome;
		localHome = newLocalHome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__LOCAL_HOME, oldLocalHome, newLocalHome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalHome(LocalHomeType newLocalHome) {
		if (newLocalHome != localHome) {
			NotificationChain msgs = null;
			if (localHome != null)
				msgs = ((InternalEObject)localHome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__LOCAL_HOME, null, msgs);
			if (newLocalHome != null)
				msgs = ((InternalEObject)newLocalHome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__LOCAL_HOME, null, msgs);
			msgs = basicSetLocalHome(newLocalHome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__LOCAL_HOME, newLocalHome, newLocalHome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalType getLocal() {
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocal(LocalType newLocal, NotificationChain msgs) {
		LocalType oldLocal = local;
		local = newLocal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__LOCAL, oldLocal, newLocal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(LocalType newLocal) {
		if (newLocal != local) {
			NotificationChain msgs = null;
			if (local != null)
				msgs = ((InternalEObject)local).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__LOCAL, null, msgs);
			if (newLocal != null)
				msgs = ((InternalEObject)newLocal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__LOCAL, null, msgs);
			msgs = basicSetLocal(newLocal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__LOCAL, newLocal, newLocal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__EJB_CLASS, oldEjbClass, newEjbClass);
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
				msgs = ((InternalEObject)ejbClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__EJB_CLASS, null, msgs);
			if (newEjbClass != null)
				msgs = ((InternalEObject)newEjbClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__EJB_CLASS, null, msgs);
			msgs = basicSetEjbClass(newEjbClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__EJB_CLASS, newEjbClass, newEjbClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionTypeType getSessionType() {
		return sessionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessionType(SessionTypeType newSessionType, NotificationChain msgs) {
		SessionTypeType oldSessionType = sessionType;
		sessionType = newSessionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__SESSION_TYPE, oldSessionType, newSessionType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionType(SessionTypeType newSessionType) {
		if (newSessionType != sessionType) {
			NotificationChain msgs = null;
			if (sessionType != null)
				msgs = ((InternalEObject)sessionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__SESSION_TYPE, null, msgs);
			if (newSessionType != null)
				msgs = ((InternalEObject)newSessionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__SESSION_TYPE, null, msgs);
			msgs = basicSetSessionType(newSessionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__SESSION_TYPE, newSessionType, newSessionType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__TRANSACTION_TYPE, oldTransactionType, newTransactionType);
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
				msgs = ((InternalEObject)transactionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__TRANSACTION_TYPE, null, msgs);
			if (newTransactionType != null)
				msgs = ((InternalEObject)newTransactionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__TRANSACTION_TYPE, null, msgs);
			msgs = basicSetTransactionType(newTransactionType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__TRANSACTION_TYPE, newTransactionType, newTransactionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvEntryType> getEnvEntry() {
		if (envEntry == null) {
			envEntry = new EObjectContainmentEList<EnvEntryType>(EnvEntryType.class, this, EjbJar20Package.SESSION_TYPE__ENV_ENTRY);
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
			ejbRef = new EObjectContainmentEList<EjbRefType>(EjbRefType.class, this, EjbJar20Package.SESSION_TYPE__EJB_REF);
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
			ejbLocalRef = new EObjectContainmentEList<EjbLocalRefType>(EjbLocalRefType.class, this, EjbJar20Package.SESSION_TYPE__EJB_LOCAL_REF);
		}
		return ejbLocalRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRoleRefType> getSecurityRoleRef() {
		if (securityRoleRef == null) {
			securityRoleRef = new EObjectContainmentEList<SecurityRoleRefType>(SecurityRoleRefType.class, this, EjbJar20Package.SESSION_TYPE__SECURITY_ROLE_REF);
		}
		return securityRoleRef;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__SECURITY_IDENTITY, oldSecurityIdentity, newSecurityIdentity);
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
				msgs = ((InternalEObject)securityIdentity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__SECURITY_IDENTITY, null, msgs);
			if (newSecurityIdentity != null)
				msgs = ((InternalEObject)newSecurityIdentity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.SESSION_TYPE__SECURITY_IDENTITY, null, msgs);
			msgs = basicSetSecurityIdentity(newSecurityIdentity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__SECURITY_IDENTITY, newSecurityIdentity, newSecurityIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceRefType> getResourceRef() {
		if (resourceRef == null) {
			resourceRef = new EObjectContainmentEList<ResourceRefType>(ResourceRefType.class, this, EjbJar20Package.SESSION_TYPE__RESOURCE_REF);
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
			resourceEnvRef = new EObjectContainmentEList<ResourceEnvRefType>(ResourceEnvRefType.class, this, EjbJar20Package.SESSION_TYPE__RESOURCE_ENV_REF);
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.SESSION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar20Package.SESSION_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EjbJar20Package.SESSION_TYPE__DISPLAY_NAME:
				return basicSetDisplayName(null, msgs);
			case EjbJar20Package.SESSION_TYPE__SMALL_ICON:
				return basicSetSmallIcon(null, msgs);
			case EjbJar20Package.SESSION_TYPE__LARGE_ICON:
				return basicSetLargeIcon(null, msgs);
			case EjbJar20Package.SESSION_TYPE__EJB_NAME:
				return basicSetEjbName(null, msgs);
			case EjbJar20Package.SESSION_TYPE__HOME:
				return basicSetHome(null, msgs);
			case EjbJar20Package.SESSION_TYPE__REMOTE:
				return basicSetRemote(null, msgs);
			case EjbJar20Package.SESSION_TYPE__LOCAL_HOME:
				return basicSetLocalHome(null, msgs);
			case EjbJar20Package.SESSION_TYPE__LOCAL:
				return basicSetLocal(null, msgs);
			case EjbJar20Package.SESSION_TYPE__EJB_CLASS:
				return basicSetEjbClass(null, msgs);
			case EjbJar20Package.SESSION_TYPE__SESSION_TYPE:
				return basicSetSessionType(null, msgs);
			case EjbJar20Package.SESSION_TYPE__TRANSACTION_TYPE:
				return basicSetTransactionType(null, msgs);
			case EjbJar20Package.SESSION_TYPE__ENV_ENTRY:
				return ((InternalEList<?>)getEnvEntry()).basicRemove(otherEnd, msgs);
			case EjbJar20Package.SESSION_TYPE__EJB_REF:
				return ((InternalEList<?>)getEjbRef()).basicRemove(otherEnd, msgs);
			case EjbJar20Package.SESSION_TYPE__EJB_LOCAL_REF:
				return ((InternalEList<?>)getEjbLocalRef()).basicRemove(otherEnd, msgs);
			case EjbJar20Package.SESSION_TYPE__SECURITY_ROLE_REF:
				return ((InternalEList<?>)getSecurityRoleRef()).basicRemove(otherEnd, msgs);
			case EjbJar20Package.SESSION_TYPE__SECURITY_IDENTITY:
				return basicSetSecurityIdentity(null, msgs);
			case EjbJar20Package.SESSION_TYPE__RESOURCE_REF:
				return ((InternalEList<?>)getResourceRef()).basicRemove(otherEnd, msgs);
			case EjbJar20Package.SESSION_TYPE__RESOURCE_ENV_REF:
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
			case EjbJar20Package.SESSION_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar20Package.SESSION_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case EjbJar20Package.SESSION_TYPE__SMALL_ICON:
				return getSmallIcon();
			case EjbJar20Package.SESSION_TYPE__LARGE_ICON:
				return getLargeIcon();
			case EjbJar20Package.SESSION_TYPE__EJB_NAME:
				return getEjbName();
			case EjbJar20Package.SESSION_TYPE__HOME:
				return getHome();
			case EjbJar20Package.SESSION_TYPE__REMOTE:
				return getRemote();
			case EjbJar20Package.SESSION_TYPE__LOCAL_HOME:
				return getLocalHome();
			case EjbJar20Package.SESSION_TYPE__LOCAL:
				return getLocal();
			case EjbJar20Package.SESSION_TYPE__EJB_CLASS:
				return getEjbClass();
			case EjbJar20Package.SESSION_TYPE__SESSION_TYPE:
				return getSessionType();
			case EjbJar20Package.SESSION_TYPE__TRANSACTION_TYPE:
				return getTransactionType();
			case EjbJar20Package.SESSION_TYPE__ENV_ENTRY:
				return getEnvEntry();
			case EjbJar20Package.SESSION_TYPE__EJB_REF:
				return getEjbRef();
			case EjbJar20Package.SESSION_TYPE__EJB_LOCAL_REF:
				return getEjbLocalRef();
			case EjbJar20Package.SESSION_TYPE__SECURITY_ROLE_REF:
				return getSecurityRoleRef();
			case EjbJar20Package.SESSION_TYPE__SECURITY_IDENTITY:
				return getSecurityIdentity();
			case EjbJar20Package.SESSION_TYPE__RESOURCE_REF:
				return getResourceRef();
			case EjbJar20Package.SESSION_TYPE__RESOURCE_ENV_REF:
				return getResourceEnvRef();
			case EjbJar20Package.SESSION_TYPE__ID:
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
			case EjbJar20Package.SESSION_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__DISPLAY_NAME:
				setDisplayName((DisplayNameType)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__SMALL_ICON:
				setSmallIcon((SmallIconType)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__LARGE_ICON:
				setLargeIcon((LargeIconType)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__EJB_NAME:
				setEjbName((EjbNameType)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__HOME:
				setHome((HomeType)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__REMOTE:
				setRemote((RemoteType)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__LOCAL_HOME:
				setLocalHome((LocalHomeType)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__LOCAL:
				setLocal((LocalType)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__EJB_CLASS:
				setEjbClass((EjbClassType)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__SESSION_TYPE:
				setSessionType((SessionTypeType)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__TRANSACTION_TYPE:
				setTransactionType((TransactionTypeType)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				getEnvEntry().addAll((Collection<? extends EnvEntryType>)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__EJB_REF:
				getEjbRef().clear();
				getEjbRef().addAll((Collection<? extends EjbRefType>)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				getEjbLocalRef().addAll((Collection<? extends EjbLocalRefType>)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__SECURITY_ROLE_REF:
				getSecurityRoleRef().clear();
				getSecurityRoleRef().addAll((Collection<? extends SecurityRoleRefType>)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__SECURITY_IDENTITY:
				setSecurityIdentity((SecurityIdentityType)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				getResourceRef().addAll((Collection<? extends ResourceRefType>)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				getResourceEnvRef().addAll((Collection<? extends ResourceEnvRefType>)newValue);
				return;
			case EjbJar20Package.SESSION_TYPE__ID:
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
			case EjbJar20Package.SESSION_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case EjbJar20Package.SESSION_TYPE__DISPLAY_NAME:
				setDisplayName((DisplayNameType)null);
				return;
			case EjbJar20Package.SESSION_TYPE__SMALL_ICON:
				setSmallIcon((SmallIconType)null);
				return;
			case EjbJar20Package.SESSION_TYPE__LARGE_ICON:
				setLargeIcon((LargeIconType)null);
				return;
			case EjbJar20Package.SESSION_TYPE__EJB_NAME:
				setEjbName((EjbNameType)null);
				return;
			case EjbJar20Package.SESSION_TYPE__HOME:
				setHome((HomeType)null);
				return;
			case EjbJar20Package.SESSION_TYPE__REMOTE:
				setRemote((RemoteType)null);
				return;
			case EjbJar20Package.SESSION_TYPE__LOCAL_HOME:
				setLocalHome((LocalHomeType)null);
				return;
			case EjbJar20Package.SESSION_TYPE__LOCAL:
				setLocal((LocalType)null);
				return;
			case EjbJar20Package.SESSION_TYPE__EJB_CLASS:
				setEjbClass((EjbClassType)null);
				return;
			case EjbJar20Package.SESSION_TYPE__SESSION_TYPE:
				setSessionType((SessionTypeType)null);
				return;
			case EjbJar20Package.SESSION_TYPE__TRANSACTION_TYPE:
				setTransactionType((TransactionTypeType)null);
				return;
			case EjbJar20Package.SESSION_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				return;
			case EjbJar20Package.SESSION_TYPE__EJB_REF:
				getEjbRef().clear();
				return;
			case EjbJar20Package.SESSION_TYPE__EJB_LOCAL_REF:
				getEjbLocalRef().clear();
				return;
			case EjbJar20Package.SESSION_TYPE__SECURITY_ROLE_REF:
				getSecurityRoleRef().clear();
				return;
			case EjbJar20Package.SESSION_TYPE__SECURITY_IDENTITY:
				setSecurityIdentity((SecurityIdentityType)null);
				return;
			case EjbJar20Package.SESSION_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				return;
			case EjbJar20Package.SESSION_TYPE__RESOURCE_ENV_REF:
				getResourceEnvRef().clear();
				return;
			case EjbJar20Package.SESSION_TYPE__ID:
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
			case EjbJar20Package.SESSION_TYPE__DESCRIPTION:
				return description != null;
			case EjbJar20Package.SESSION_TYPE__DISPLAY_NAME:
				return displayName != null;
			case EjbJar20Package.SESSION_TYPE__SMALL_ICON:
				return smallIcon != null;
			case EjbJar20Package.SESSION_TYPE__LARGE_ICON:
				return largeIcon != null;
			case EjbJar20Package.SESSION_TYPE__EJB_NAME:
				return ejbName != null;
			case EjbJar20Package.SESSION_TYPE__HOME:
				return home != null;
			case EjbJar20Package.SESSION_TYPE__REMOTE:
				return remote != null;
			case EjbJar20Package.SESSION_TYPE__LOCAL_HOME:
				return localHome != null;
			case EjbJar20Package.SESSION_TYPE__LOCAL:
				return local != null;
			case EjbJar20Package.SESSION_TYPE__EJB_CLASS:
				return ejbClass != null;
			case EjbJar20Package.SESSION_TYPE__SESSION_TYPE:
				return sessionType != null;
			case EjbJar20Package.SESSION_TYPE__TRANSACTION_TYPE:
				return transactionType != null;
			case EjbJar20Package.SESSION_TYPE__ENV_ENTRY:
				return envEntry != null && !envEntry.isEmpty();
			case EjbJar20Package.SESSION_TYPE__EJB_REF:
				return ejbRef != null && !ejbRef.isEmpty();
			case EjbJar20Package.SESSION_TYPE__EJB_LOCAL_REF:
				return ejbLocalRef != null && !ejbLocalRef.isEmpty();
			case EjbJar20Package.SESSION_TYPE__SECURITY_ROLE_REF:
				return securityRoleRef != null && !securityRoleRef.isEmpty();
			case EjbJar20Package.SESSION_TYPE__SECURITY_IDENTITY:
				return securityIdentity != null;
			case EjbJar20Package.SESSION_TYPE__RESOURCE_REF:
				return resourceRef != null && !resourceRef.isEmpty();
			case EjbJar20Package.SESSION_TYPE__RESOURCE_ENV_REF:
				return resourceEnvRef != null && !resourceEnvRef.isEmpty();
			case EjbJar20Package.SESSION_TYPE__ID:
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

} //SessionTypeImpl
