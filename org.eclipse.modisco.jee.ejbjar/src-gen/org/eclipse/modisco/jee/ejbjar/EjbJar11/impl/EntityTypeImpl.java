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
package org.eclipse.modisco.jee.ejbjar.EjbJar11.impl;

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

import org.eclipse.modisco.jee.ejbjar.EjbJar11.CmpFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.DisplayNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EnvEntryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.HomeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.LargeIconType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.PersistenceTypeType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.PrimKeyClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.PrimkeyFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.ReentrantType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.RemoteType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.ResourceRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleRefType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.SmallIconType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getSmallIcon <em>Small Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getLargeIcon <em>Large Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getHome <em>Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getRemote <em>Remote</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getPrimKeyClass <em>Prim Key Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getReentrant <em>Reentrant</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getCmpField <em>Cmp Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getPrimkeyField <em>Primkey Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getEnvEntry <em>Env Entry</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getEjbRef <em>Ejb Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getSecurityRoleRef <em>Security Role Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.EntityTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityTypeImpl extends EObjectImpl implements EntityType {
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
	 * The cached value of the '{@link #getEjbClass() <em>Ejb Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbClass()
	 * @generated
	 * @ordered
	 */
	protected EjbClassType ejbClass;

	/**
	 * The cached value of the '{@link #getPersistenceType() <em>Persistence Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected PersistenceTypeType persistenceType;

	/**
	 * The cached value of the '{@link #getPrimKeyClass() <em>Prim Key Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimKeyClass()
	 * @generated
	 * @ordered
	 */
	protected PrimKeyClassType primKeyClass;

	/**
	 * The cached value of the '{@link #getReentrant() <em>Reentrant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReentrant()
	 * @generated
	 * @ordered
	 */
	protected ReentrantType reentrant;

	/**
	 * The cached value of the '{@link #getCmpField() <em>Cmp Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmpField()
	 * @generated
	 * @ordered
	 */
	protected EList<CmpFieldType> cmpField;

	/**
	 * The cached value of the '{@link #getPrimkeyField() <em>Primkey Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimkeyField()
	 * @generated
	 * @ordered
	 */
	protected PrimkeyFieldType primkeyField;

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
	 * The cached value of the '{@link #getSecurityRoleRef() <em>Security Role Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRoleRef()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRoleRefType> securityRoleRef;

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
	protected EntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar11Package.Literals.ENTITY_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__DISPLAY_NAME, oldDisplayName, newDisplayName);
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
				msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__DISPLAY_NAME, null, msgs);
			if (newDisplayName != null)
				msgs = ((InternalEObject)newDisplayName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__DISPLAY_NAME, null, msgs);
			msgs = basicSetDisplayName(newDisplayName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__DISPLAY_NAME, newDisplayName, newDisplayName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__SMALL_ICON, oldSmallIcon, newSmallIcon);
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
				msgs = ((InternalEObject)smallIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__SMALL_ICON, null, msgs);
			if (newSmallIcon != null)
				msgs = ((InternalEObject)newSmallIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__SMALL_ICON, null, msgs);
			msgs = basicSetSmallIcon(newSmallIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__SMALL_ICON, newSmallIcon, newSmallIcon));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__LARGE_ICON, oldLargeIcon, newLargeIcon);
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
				msgs = ((InternalEObject)largeIcon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__LARGE_ICON, null, msgs);
			if (newLargeIcon != null)
				msgs = ((InternalEObject)newLargeIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__LARGE_ICON, null, msgs);
			msgs = basicSetLargeIcon(newLargeIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__LARGE_ICON, newLargeIcon, newLargeIcon));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__EJB_NAME, oldEjbName, newEjbName);
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
				msgs = ((InternalEObject)ejbName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__EJB_NAME, null, msgs);
			if (newEjbName != null)
				msgs = ((InternalEObject)newEjbName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__EJB_NAME, null, msgs);
			msgs = basicSetEjbName(newEjbName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__EJB_NAME, newEjbName, newEjbName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__HOME, oldHome, newHome);
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
				msgs = ((InternalEObject)home).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__HOME, null, msgs);
			if (newHome != null)
				msgs = ((InternalEObject)newHome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__HOME, null, msgs);
			msgs = basicSetHome(newHome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__HOME, newHome, newHome));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__REMOTE, oldRemote, newRemote);
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
				msgs = ((InternalEObject)remote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__REMOTE, null, msgs);
			if (newRemote != null)
				msgs = ((InternalEObject)newRemote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__REMOTE, null, msgs);
			msgs = basicSetRemote(newRemote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__REMOTE, newRemote, newRemote));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__EJB_CLASS, oldEjbClass, newEjbClass);
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
				msgs = ((InternalEObject)ejbClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__EJB_CLASS, null, msgs);
			if (newEjbClass != null)
				msgs = ((InternalEObject)newEjbClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__EJB_CLASS, null, msgs);
			msgs = basicSetEjbClass(newEjbClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__EJB_CLASS, newEjbClass, newEjbClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceTypeType getPersistenceType() {
		return persistenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersistenceType(PersistenceTypeType newPersistenceType, NotificationChain msgs) {
		PersistenceTypeType oldPersistenceType = persistenceType;
		persistenceType = newPersistenceType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__PERSISTENCE_TYPE, oldPersistenceType, newPersistenceType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceType(PersistenceTypeType newPersistenceType) {
		if (newPersistenceType != persistenceType) {
			NotificationChain msgs = null;
			if (persistenceType != null)
				msgs = ((InternalEObject)persistenceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__PERSISTENCE_TYPE, null, msgs);
			if (newPersistenceType != null)
				msgs = ((InternalEObject)newPersistenceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__PERSISTENCE_TYPE, null, msgs);
			msgs = basicSetPersistenceType(newPersistenceType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__PERSISTENCE_TYPE, newPersistenceType, newPersistenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimKeyClassType getPrimKeyClass() {
		return primKeyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimKeyClass(PrimKeyClassType newPrimKeyClass, NotificationChain msgs) {
		PrimKeyClassType oldPrimKeyClass = primKeyClass;
		primKeyClass = newPrimKeyClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__PRIM_KEY_CLASS, oldPrimKeyClass, newPrimKeyClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimKeyClass(PrimKeyClassType newPrimKeyClass) {
		if (newPrimKeyClass != primKeyClass) {
			NotificationChain msgs = null;
			if (primKeyClass != null)
				msgs = ((InternalEObject)primKeyClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__PRIM_KEY_CLASS, null, msgs);
			if (newPrimKeyClass != null)
				msgs = ((InternalEObject)newPrimKeyClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__PRIM_KEY_CLASS, null, msgs);
			msgs = basicSetPrimKeyClass(newPrimKeyClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__PRIM_KEY_CLASS, newPrimKeyClass, newPrimKeyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReentrantType getReentrant() {
		return reentrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReentrant(ReentrantType newReentrant, NotificationChain msgs) {
		ReentrantType oldReentrant = reentrant;
		reentrant = newReentrant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__REENTRANT, oldReentrant, newReentrant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReentrant(ReentrantType newReentrant) {
		if (newReentrant != reentrant) {
			NotificationChain msgs = null;
			if (reentrant != null)
				msgs = ((InternalEObject)reentrant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__REENTRANT, null, msgs);
			if (newReentrant != null)
				msgs = ((InternalEObject)newReentrant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__REENTRANT, null, msgs);
			msgs = basicSetReentrant(newReentrant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__REENTRANT, newReentrant, newReentrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CmpFieldType> getCmpField() {
		if (cmpField == null) {
			cmpField = new EObjectContainmentEList<CmpFieldType>(CmpFieldType.class, this, EjbJar11Package.ENTITY_TYPE__CMP_FIELD);
		}
		return cmpField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimkeyFieldType getPrimkeyField() {
		return primkeyField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimkeyField(PrimkeyFieldType newPrimkeyField, NotificationChain msgs) {
		PrimkeyFieldType oldPrimkeyField = primkeyField;
		primkeyField = newPrimkeyField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__PRIMKEY_FIELD, oldPrimkeyField, newPrimkeyField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimkeyField(PrimkeyFieldType newPrimkeyField) {
		if (newPrimkeyField != primkeyField) {
			NotificationChain msgs = null;
			if (primkeyField != null)
				msgs = ((InternalEObject)primkeyField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__PRIMKEY_FIELD, null, msgs);
			if (newPrimkeyField != null)
				msgs = ((InternalEObject)newPrimkeyField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar11Package.ENTITY_TYPE__PRIMKEY_FIELD, null, msgs);
			msgs = basicSetPrimkeyField(newPrimkeyField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__PRIMKEY_FIELD, newPrimkeyField, newPrimkeyField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvEntryType> getEnvEntry() {
		if (envEntry == null) {
			envEntry = new EObjectContainmentEList<EnvEntryType>(EnvEntryType.class, this, EjbJar11Package.ENTITY_TYPE__ENV_ENTRY);
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
			ejbRef = new EObjectContainmentEList<EjbRefType>(EjbRefType.class, this, EjbJar11Package.ENTITY_TYPE__EJB_REF);
		}
		return ejbRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRoleRefType> getSecurityRoleRef() {
		if (securityRoleRef == null) {
			securityRoleRef = new EObjectContainmentEList<SecurityRoleRefType>(SecurityRoleRefType.class, this, EjbJar11Package.ENTITY_TYPE__SECURITY_ROLE_REF);
		}
		return securityRoleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceRefType> getResourceRef() {
		if (resourceRef == null) {
			resourceRef = new EObjectContainmentEList<ResourceRefType>(ResourceRefType.class, this, EjbJar11Package.ENTITY_TYPE__RESOURCE_REF);
		}
		return resourceRef;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.ENTITY_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar11Package.ENTITY_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EjbJar11Package.ENTITY_TYPE__DISPLAY_NAME:
				return basicSetDisplayName(null, msgs);
			case EjbJar11Package.ENTITY_TYPE__SMALL_ICON:
				return basicSetSmallIcon(null, msgs);
			case EjbJar11Package.ENTITY_TYPE__LARGE_ICON:
				return basicSetLargeIcon(null, msgs);
			case EjbJar11Package.ENTITY_TYPE__EJB_NAME:
				return basicSetEjbName(null, msgs);
			case EjbJar11Package.ENTITY_TYPE__HOME:
				return basicSetHome(null, msgs);
			case EjbJar11Package.ENTITY_TYPE__REMOTE:
				return basicSetRemote(null, msgs);
			case EjbJar11Package.ENTITY_TYPE__EJB_CLASS:
				return basicSetEjbClass(null, msgs);
			case EjbJar11Package.ENTITY_TYPE__PERSISTENCE_TYPE:
				return basicSetPersistenceType(null, msgs);
			case EjbJar11Package.ENTITY_TYPE__PRIM_KEY_CLASS:
				return basicSetPrimKeyClass(null, msgs);
			case EjbJar11Package.ENTITY_TYPE__REENTRANT:
				return basicSetReentrant(null, msgs);
			case EjbJar11Package.ENTITY_TYPE__CMP_FIELD:
				return ((InternalEList<?>)getCmpField()).basicRemove(otherEnd, msgs);
			case EjbJar11Package.ENTITY_TYPE__PRIMKEY_FIELD:
				return basicSetPrimkeyField(null, msgs);
			case EjbJar11Package.ENTITY_TYPE__ENV_ENTRY:
				return ((InternalEList<?>)getEnvEntry()).basicRemove(otherEnd, msgs);
			case EjbJar11Package.ENTITY_TYPE__EJB_REF:
				return ((InternalEList<?>)getEjbRef()).basicRemove(otherEnd, msgs);
			case EjbJar11Package.ENTITY_TYPE__SECURITY_ROLE_REF:
				return ((InternalEList<?>)getSecurityRoleRef()).basicRemove(otherEnd, msgs);
			case EjbJar11Package.ENTITY_TYPE__RESOURCE_REF:
				return ((InternalEList<?>)getResourceRef()).basicRemove(otherEnd, msgs);
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
			case EjbJar11Package.ENTITY_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar11Package.ENTITY_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case EjbJar11Package.ENTITY_TYPE__SMALL_ICON:
				return getSmallIcon();
			case EjbJar11Package.ENTITY_TYPE__LARGE_ICON:
				return getLargeIcon();
			case EjbJar11Package.ENTITY_TYPE__EJB_NAME:
				return getEjbName();
			case EjbJar11Package.ENTITY_TYPE__HOME:
				return getHome();
			case EjbJar11Package.ENTITY_TYPE__REMOTE:
				return getRemote();
			case EjbJar11Package.ENTITY_TYPE__EJB_CLASS:
				return getEjbClass();
			case EjbJar11Package.ENTITY_TYPE__PERSISTENCE_TYPE:
				return getPersistenceType();
			case EjbJar11Package.ENTITY_TYPE__PRIM_KEY_CLASS:
				return getPrimKeyClass();
			case EjbJar11Package.ENTITY_TYPE__REENTRANT:
				return getReentrant();
			case EjbJar11Package.ENTITY_TYPE__CMP_FIELD:
				return getCmpField();
			case EjbJar11Package.ENTITY_TYPE__PRIMKEY_FIELD:
				return getPrimkeyField();
			case EjbJar11Package.ENTITY_TYPE__ENV_ENTRY:
				return getEnvEntry();
			case EjbJar11Package.ENTITY_TYPE__EJB_REF:
				return getEjbRef();
			case EjbJar11Package.ENTITY_TYPE__SECURITY_ROLE_REF:
				return getSecurityRoleRef();
			case EjbJar11Package.ENTITY_TYPE__RESOURCE_REF:
				return getResourceRef();
			case EjbJar11Package.ENTITY_TYPE__ID:
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
			case EjbJar11Package.ENTITY_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case EjbJar11Package.ENTITY_TYPE__DISPLAY_NAME:
				setDisplayName((DisplayNameType)newValue);
				return;
			case EjbJar11Package.ENTITY_TYPE__SMALL_ICON:
				setSmallIcon((SmallIconType)newValue);
				return;
			case EjbJar11Package.ENTITY_TYPE__LARGE_ICON:
				setLargeIcon((LargeIconType)newValue);
				return;
			case EjbJar11Package.ENTITY_TYPE__EJB_NAME:
				setEjbName((EjbNameType)newValue);
				return;
			case EjbJar11Package.ENTITY_TYPE__HOME:
				setHome((HomeType)newValue);
				return;
			case EjbJar11Package.ENTITY_TYPE__REMOTE:
				setRemote((RemoteType)newValue);
				return;
			case EjbJar11Package.ENTITY_TYPE__EJB_CLASS:
				setEjbClass((EjbClassType)newValue);
				return;
			case EjbJar11Package.ENTITY_TYPE__PERSISTENCE_TYPE:
				setPersistenceType((PersistenceTypeType)newValue);
				return;
			case EjbJar11Package.ENTITY_TYPE__PRIM_KEY_CLASS:
				setPrimKeyClass((PrimKeyClassType)newValue);
				return;
			case EjbJar11Package.ENTITY_TYPE__REENTRANT:
				setReentrant((ReentrantType)newValue);
				return;
			case EjbJar11Package.ENTITY_TYPE__CMP_FIELD:
				getCmpField().clear();
				getCmpField().addAll((Collection<? extends CmpFieldType>)newValue);
				return;
			case EjbJar11Package.ENTITY_TYPE__PRIMKEY_FIELD:
				setPrimkeyField((PrimkeyFieldType)newValue);
				return;
			case EjbJar11Package.ENTITY_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				getEnvEntry().addAll((Collection<? extends EnvEntryType>)newValue);
				return;
			case EjbJar11Package.ENTITY_TYPE__EJB_REF:
				getEjbRef().clear();
				getEjbRef().addAll((Collection<? extends EjbRefType>)newValue);
				return;
			case EjbJar11Package.ENTITY_TYPE__SECURITY_ROLE_REF:
				getSecurityRoleRef().clear();
				getSecurityRoleRef().addAll((Collection<? extends SecurityRoleRefType>)newValue);
				return;
			case EjbJar11Package.ENTITY_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				getResourceRef().addAll((Collection<? extends ResourceRefType>)newValue);
				return;
			case EjbJar11Package.ENTITY_TYPE__ID:
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
			case EjbJar11Package.ENTITY_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case EjbJar11Package.ENTITY_TYPE__DISPLAY_NAME:
				setDisplayName((DisplayNameType)null);
				return;
			case EjbJar11Package.ENTITY_TYPE__SMALL_ICON:
				setSmallIcon((SmallIconType)null);
				return;
			case EjbJar11Package.ENTITY_TYPE__LARGE_ICON:
				setLargeIcon((LargeIconType)null);
				return;
			case EjbJar11Package.ENTITY_TYPE__EJB_NAME:
				setEjbName((EjbNameType)null);
				return;
			case EjbJar11Package.ENTITY_TYPE__HOME:
				setHome((HomeType)null);
				return;
			case EjbJar11Package.ENTITY_TYPE__REMOTE:
				setRemote((RemoteType)null);
				return;
			case EjbJar11Package.ENTITY_TYPE__EJB_CLASS:
				setEjbClass((EjbClassType)null);
				return;
			case EjbJar11Package.ENTITY_TYPE__PERSISTENCE_TYPE:
				setPersistenceType((PersistenceTypeType)null);
				return;
			case EjbJar11Package.ENTITY_TYPE__PRIM_KEY_CLASS:
				setPrimKeyClass((PrimKeyClassType)null);
				return;
			case EjbJar11Package.ENTITY_TYPE__REENTRANT:
				setReentrant((ReentrantType)null);
				return;
			case EjbJar11Package.ENTITY_TYPE__CMP_FIELD:
				getCmpField().clear();
				return;
			case EjbJar11Package.ENTITY_TYPE__PRIMKEY_FIELD:
				setPrimkeyField((PrimkeyFieldType)null);
				return;
			case EjbJar11Package.ENTITY_TYPE__ENV_ENTRY:
				getEnvEntry().clear();
				return;
			case EjbJar11Package.ENTITY_TYPE__EJB_REF:
				getEjbRef().clear();
				return;
			case EjbJar11Package.ENTITY_TYPE__SECURITY_ROLE_REF:
				getSecurityRoleRef().clear();
				return;
			case EjbJar11Package.ENTITY_TYPE__RESOURCE_REF:
				getResourceRef().clear();
				return;
			case EjbJar11Package.ENTITY_TYPE__ID:
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
			case EjbJar11Package.ENTITY_TYPE__DESCRIPTION:
				return description != null;
			case EjbJar11Package.ENTITY_TYPE__DISPLAY_NAME:
				return displayName != null;
			case EjbJar11Package.ENTITY_TYPE__SMALL_ICON:
				return smallIcon != null;
			case EjbJar11Package.ENTITY_TYPE__LARGE_ICON:
				return largeIcon != null;
			case EjbJar11Package.ENTITY_TYPE__EJB_NAME:
				return ejbName != null;
			case EjbJar11Package.ENTITY_TYPE__HOME:
				return home != null;
			case EjbJar11Package.ENTITY_TYPE__REMOTE:
				return remote != null;
			case EjbJar11Package.ENTITY_TYPE__EJB_CLASS:
				return ejbClass != null;
			case EjbJar11Package.ENTITY_TYPE__PERSISTENCE_TYPE:
				return persistenceType != null;
			case EjbJar11Package.ENTITY_TYPE__PRIM_KEY_CLASS:
				return primKeyClass != null;
			case EjbJar11Package.ENTITY_TYPE__REENTRANT:
				return reentrant != null;
			case EjbJar11Package.ENTITY_TYPE__CMP_FIELD:
				return cmpField != null && !cmpField.isEmpty();
			case EjbJar11Package.ENTITY_TYPE__PRIMKEY_FIELD:
				return primkeyField != null;
			case EjbJar11Package.ENTITY_TYPE__ENV_ENTRY:
				return envEntry != null && !envEntry.isEmpty();
			case EjbJar11Package.ENTITY_TYPE__EJB_REF:
				return ejbRef != null && !ejbRef.isEmpty();
			case EjbJar11Package.ENTITY_TYPE__SECURITY_ROLE_REF:
				return securityRoleRef != null && !securityRoleRef.isEmpty();
			case EjbJar11Package.ENTITY_TYPE__RESOURCE_REF:
				return resourceRef != null && !resourceRef.isEmpty();
			case EjbJar11Package.ENTITY_TYPE__ID:
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

} //EntityTypeImpl
