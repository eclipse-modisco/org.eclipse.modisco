/**
 *   Copyright (c) 2010, 2019 Mia-Software.
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
import org.eclipse.modisco.jee.webapp.webapp24.EjbLinkType;
import org.eclipse.modisco.jee.webapp.webapp24.EjbLocalRefType;
import org.eclipse.modisco.jee.webapp.webapp24.EjbRefNameType;
import org.eclipse.modisco.jee.webapp.webapp24.EjbRefTypeType;
import org.eclipse.modisco.jee.webapp.webapp24.LocalHomeType;
import org.eclipse.modisco.jee.webapp.webapp24.LocalType;
import org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ejb Local Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EjbLocalRefTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EjbLocalRefTypeImpl#getEjbRefName <em>Ejb Ref Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EjbLocalRefTypeImpl#getEjbRefType <em>Ejb Ref Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EjbLocalRefTypeImpl#getLocalHome <em>Local Home</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EjbLocalRefTypeImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EjbLocalRefTypeImpl#getEjbLink <em>Ejb Link</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.EjbLocalRefTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EjbLocalRefTypeImpl extends EObjectImpl implements EjbLocalRefType {
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
	protected EjbLocalRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp24Package.Literals.EJB_LOCAL_REF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, Webapp24Package.EJB_LOCAL_REF_TYPE__DESCRIPTION);
		}
		return description;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_NAME, oldEjbRefName, newEjbRefName);
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
				msgs = ((InternalEObject)ejbRefName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_NAME, null, msgs);
			if (newEjbRefName != null)
				msgs = ((InternalEObject)newEjbRefName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_NAME, null, msgs);
			msgs = basicSetEjbRefName(newEjbRefName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_NAME, newEjbRefName, newEjbRefName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_TYPE, oldEjbRefType, newEjbRefType);
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
				msgs = ((InternalEObject)ejbRefType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_TYPE, null, msgs);
			if (newEjbRefType != null)
				msgs = ((InternalEObject)newEjbRefType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_TYPE, null, msgs);
			msgs = basicSetEjbRefType(newEjbRefType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_TYPE, newEjbRefType, newEjbRefType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL_HOME, oldLocalHome, newLocalHome);
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
				msgs = ((InternalEObject)localHome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL_HOME, null, msgs);
			if (newLocalHome != null)
				msgs = ((InternalEObject)newLocalHome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL_HOME, null, msgs);
			msgs = basicSetLocalHome(newLocalHome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL_HOME, newLocalHome, newLocalHome));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL, oldLocal, newLocal);
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
				msgs = ((InternalEObject)local).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL, null, msgs);
			if (newLocal != null)
				msgs = ((InternalEObject)newLocal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL, null, msgs);
			msgs = basicSetLocal(newLocal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL, newLocal, newLocal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_LINK, oldEjbLink, newEjbLink);
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
				msgs = ((InternalEObject)ejbLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_LINK, null, msgs);
			if (newEjbLink != null)
				msgs = ((InternalEObject)newEjbLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_LINK, null, msgs);
			msgs = basicSetEjbLink(newEjbLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_LINK, newEjbLink, newEjbLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.EJB_LOCAL_REF_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp24Package.EJB_LOCAL_REF_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_NAME:
				return basicSetEjbRefName(null, msgs);
			case Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_TYPE:
				return basicSetEjbRefType(null, msgs);
			case Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL_HOME:
				return basicSetLocalHome(null, msgs);
			case Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL:
				return basicSetLocal(null, msgs);
			case Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_LINK:
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
			case Webapp24Package.EJB_LOCAL_REF_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_NAME:
				return getEjbRefName();
			case Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_TYPE:
				return getEjbRefType();
			case Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL_HOME:
				return getLocalHome();
			case Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL:
				return getLocal();
			case Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_LINK:
				return getEjbLink();
			case Webapp24Package.EJB_LOCAL_REF_TYPE__ID:
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
			case Webapp24Package.EJB_LOCAL_REF_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_NAME:
				setEjbRefName((EjbRefNameType)newValue);
				return;
			case Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_TYPE:
				setEjbRefType((EjbRefTypeType)newValue);
				return;
			case Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL_HOME:
				setLocalHome((LocalHomeType)newValue);
				return;
			case Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL:
				setLocal((LocalType)newValue);
				return;
			case Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_LINK:
				setEjbLink((EjbLinkType)newValue);
				return;
			case Webapp24Package.EJB_LOCAL_REF_TYPE__ID:
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
			case Webapp24Package.EJB_LOCAL_REF_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_NAME:
				setEjbRefName((EjbRefNameType)null);
				return;
			case Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_TYPE:
				setEjbRefType((EjbRefTypeType)null);
				return;
			case Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL_HOME:
				setLocalHome((LocalHomeType)null);
				return;
			case Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL:
				setLocal((LocalType)null);
				return;
			case Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_LINK:
				setEjbLink((EjbLinkType)null);
				return;
			case Webapp24Package.EJB_LOCAL_REF_TYPE__ID:
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
			case Webapp24Package.EJB_LOCAL_REF_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_NAME:
				return ejbRefName != null;
			case Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_REF_TYPE:
				return ejbRefType != null;
			case Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL_HOME:
				return localHome != null;
			case Webapp24Package.EJB_LOCAL_REF_TYPE__LOCAL:
				return local != null;
			case Webapp24Package.EJB_LOCAL_REF_TYPE__EJB_LINK:
				return ejbLink != null;
			case Webapp24Package.EJB_LOCAL_REF_TYPE__ID:
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

} //EjbLocalRefTypeImpl
