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
package org.eclipse.modisco.jee.webapp.webapp22.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.webapp.webapp22.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp22.EjbLinkType;
import org.eclipse.modisco.jee.webapp.webapp22.EjbRefNameType;
import org.eclipse.modisco.jee.webapp.webapp22.EjbRefType;
import org.eclipse.modisco.jee.webapp.webapp22.EjbRefTypeType;
import org.eclipse.modisco.jee.webapp.webapp22.HomeType;
import org.eclipse.modisco.jee.webapp.webapp22.RemoteType;
import org.eclipse.modisco.jee.webapp.webapp22.Webapp22Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ejb Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefTypeImpl#getEjbRefName <em>Ejb Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefTypeImpl#getEjbRefType <em>Ejb Ref Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefTypeImpl#getHome <em>Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefTypeImpl#getRemote <em>Remote</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefTypeImpl#getEjbLink <em>Ejb Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp22.impl.EjbRefTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EjbRefTypeImpl extends EObjectImpl implements EjbRefType {
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
	 * The cached value of the '{@link #getEjbRefName() <em>Ejb Ref Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbRefName()
	 * @generated
	 * @ordered
	 */
	protected EjbRefNameType ejbRefName;

	/**
	 * The cached value of the '{@link #getEjbRefType() <em>Ejb Ref Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbRefType()
	 * @generated
	 * @ordered
	 */
	protected EjbRefTypeType ejbRefType;

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
	 * The cached value of the '{@link #getEjbLink() <em>Ejb Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbLink()
	 * @generated
	 * @ordered
	 */
	protected EjbLinkType ejbLink;

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
	protected EjbRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp22Package.Literals.EJB_REF_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp22Package.EJB_REF_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp22Package.EJB_REF_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp22Package.EJB_REF_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp22Package.EJB_REF_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefNameType getEjbRefName() {
		return ejbRefName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRefName(EjbRefNameType newEjbRefName, NotificationChain msgs) {
		EjbRefNameType oldEjbRefName = ejbRefName;
		ejbRefName = newEjbRefName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp22Package.EJB_REF_TYPE__EJB_REF_NAME, oldEjbRefName, newEjbRefName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRefName(EjbRefNameType newEjbRefName) {
		if (newEjbRefName != ejbRefName) {
			NotificationChain msgs = null;
			if (ejbRefName != null)
				msgs = ((InternalEObject)ejbRefName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp22Package.EJB_REF_TYPE__EJB_REF_NAME, null, msgs);
			if (newEjbRefName != null)
				msgs = ((InternalEObject)newEjbRefName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp22Package.EJB_REF_TYPE__EJB_REF_NAME, null, msgs);
			msgs = basicSetEjbRefName(newEjbRefName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp22Package.EJB_REF_TYPE__EJB_REF_NAME, newEjbRefName, newEjbRefName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRefTypeType getEjbRefType() {
		return ejbRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRefType(EjbRefTypeType newEjbRefType, NotificationChain msgs) {
		EjbRefTypeType oldEjbRefType = ejbRefType;
		ejbRefType = newEjbRefType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp22Package.EJB_REF_TYPE__EJB_REF_TYPE, oldEjbRefType, newEjbRefType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRefType(EjbRefTypeType newEjbRefType) {
		if (newEjbRefType != ejbRefType) {
			NotificationChain msgs = null;
			if (ejbRefType != null)
				msgs = ((InternalEObject)ejbRefType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp22Package.EJB_REF_TYPE__EJB_REF_TYPE, null, msgs);
			if (newEjbRefType != null)
				msgs = ((InternalEObject)newEjbRefType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp22Package.EJB_REF_TYPE__EJB_REF_TYPE, null, msgs);
			msgs = basicSetEjbRefType(newEjbRefType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp22Package.EJB_REF_TYPE__EJB_REF_TYPE, newEjbRefType, newEjbRefType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp22Package.EJB_REF_TYPE__HOME, oldHome, newHome);
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
				msgs = ((InternalEObject)home).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp22Package.EJB_REF_TYPE__HOME, null, msgs);
			if (newHome != null)
				msgs = ((InternalEObject)newHome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp22Package.EJB_REF_TYPE__HOME, null, msgs);
			msgs = basicSetHome(newHome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp22Package.EJB_REF_TYPE__HOME, newHome, newHome));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp22Package.EJB_REF_TYPE__REMOTE, oldRemote, newRemote);
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
				msgs = ((InternalEObject)remote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp22Package.EJB_REF_TYPE__REMOTE, null, msgs);
			if (newRemote != null)
				msgs = ((InternalEObject)newRemote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp22Package.EJB_REF_TYPE__REMOTE, null, msgs);
			msgs = basicSetRemote(newRemote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp22Package.EJB_REF_TYPE__REMOTE, newRemote, newRemote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbLinkType getEjbLink() {
		return ejbLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbLink(EjbLinkType newEjbLink, NotificationChain msgs) {
		EjbLinkType oldEjbLink = ejbLink;
		ejbLink = newEjbLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp22Package.EJB_REF_TYPE__EJB_LINK, oldEjbLink, newEjbLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbLink(EjbLinkType newEjbLink) {
		if (newEjbLink != ejbLink) {
			NotificationChain msgs = null;
			if (ejbLink != null)
				msgs = ((InternalEObject)ejbLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp22Package.EJB_REF_TYPE__EJB_LINK, null, msgs);
			if (newEjbLink != null)
				msgs = ((InternalEObject)newEjbLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp22Package.EJB_REF_TYPE__EJB_LINK, null, msgs);
			msgs = basicSetEjbLink(newEjbLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp22Package.EJB_REF_TYPE__EJB_LINK, newEjbLink, newEjbLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp22Package.EJB_REF_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp22Package.EJB_REF_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case Webapp22Package.EJB_REF_TYPE__EJB_REF_NAME:
				return basicSetEjbRefName(null, msgs);
			case Webapp22Package.EJB_REF_TYPE__EJB_REF_TYPE:
				return basicSetEjbRefType(null, msgs);
			case Webapp22Package.EJB_REF_TYPE__HOME:
				return basicSetHome(null, msgs);
			case Webapp22Package.EJB_REF_TYPE__REMOTE:
				return basicSetRemote(null, msgs);
			case Webapp22Package.EJB_REF_TYPE__EJB_LINK:
				return basicSetEjbLink(null, msgs);
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
			case Webapp22Package.EJB_REF_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp22Package.EJB_REF_TYPE__EJB_REF_NAME:
				return getEjbRefName();
			case Webapp22Package.EJB_REF_TYPE__EJB_REF_TYPE:
				return getEjbRefType();
			case Webapp22Package.EJB_REF_TYPE__HOME:
				return getHome();
			case Webapp22Package.EJB_REF_TYPE__REMOTE:
				return getRemote();
			case Webapp22Package.EJB_REF_TYPE__EJB_LINK:
				return getEjbLink();
			case Webapp22Package.EJB_REF_TYPE__ID:
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
			case Webapp22Package.EJB_REF_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case Webapp22Package.EJB_REF_TYPE__EJB_REF_NAME:
				setEjbRefName((EjbRefNameType)newValue);
				return;
			case Webapp22Package.EJB_REF_TYPE__EJB_REF_TYPE:
				setEjbRefType((EjbRefTypeType)newValue);
				return;
			case Webapp22Package.EJB_REF_TYPE__HOME:
				setHome((HomeType)newValue);
				return;
			case Webapp22Package.EJB_REF_TYPE__REMOTE:
				setRemote((RemoteType)newValue);
				return;
			case Webapp22Package.EJB_REF_TYPE__EJB_LINK:
				setEjbLink((EjbLinkType)newValue);
				return;
			case Webapp22Package.EJB_REF_TYPE__ID:
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
			case Webapp22Package.EJB_REF_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case Webapp22Package.EJB_REF_TYPE__EJB_REF_NAME:
				setEjbRefName((EjbRefNameType)null);
				return;
			case Webapp22Package.EJB_REF_TYPE__EJB_REF_TYPE:
				setEjbRefType((EjbRefTypeType)null);
				return;
			case Webapp22Package.EJB_REF_TYPE__HOME:
				setHome((HomeType)null);
				return;
			case Webapp22Package.EJB_REF_TYPE__REMOTE:
				setRemote((RemoteType)null);
				return;
			case Webapp22Package.EJB_REF_TYPE__EJB_LINK:
				setEjbLink((EjbLinkType)null);
				return;
			case Webapp22Package.EJB_REF_TYPE__ID:
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
			case Webapp22Package.EJB_REF_TYPE__DESCRIPTION:
				return description != null;
			case Webapp22Package.EJB_REF_TYPE__EJB_REF_NAME:
				return ejbRefName != null;
			case Webapp22Package.EJB_REF_TYPE__EJB_REF_TYPE:
				return ejbRefType != null;
			case Webapp22Package.EJB_REF_TYPE__HOME:
				return home != null;
			case Webapp22Package.EJB_REF_TYPE__REMOTE:
				return remote != null;
			case Webapp22Package.EJB_REF_TYPE__EJB_LINK:
				return ejbLink != null;
			case Webapp22Package.EJB_REF_TYPE__ID:
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

} //EjbRefTypeImpl
