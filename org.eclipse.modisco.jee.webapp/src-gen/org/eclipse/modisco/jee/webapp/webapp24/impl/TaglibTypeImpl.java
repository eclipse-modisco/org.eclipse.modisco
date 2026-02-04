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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.webapp.webapp24.PathType;
import org.eclipse.modisco.jee.webapp.webapp24.TaglibType;
import org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Taglib Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.TaglibTypeImpl#getTaglibUri <em>Taglib Uri</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.TaglibTypeImpl#getTaglibLocation <em>Taglib Location</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.TaglibTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaglibTypeImpl extends EObjectImpl implements TaglibType {
	/**
	 * The cached value of the '{@link #getTaglibUri() <em>Taglib Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaglibUri()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.webapp.webapp24.String taglibUri;

	/**
	 * The cached value of the '{@link #getTaglibLocation() <em>Taglib Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaglibLocation()
	 * @generated
	 * @ordered
	 */
	protected PathType taglibLocation;

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
	protected TaglibTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp24Package.Literals.TAGLIB_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.webapp.webapp24.String getTaglibUri() {
		return taglibUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaglibUri(org.eclipse.modisco.jee.webapp.webapp24.String newTaglibUri, NotificationChain msgs) {
		org.eclipse.modisco.jee.webapp.webapp24.String oldTaglibUri = taglibUri;
		taglibUri = newTaglibUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.TAGLIB_TYPE__TAGLIB_URI, oldTaglibUri, newTaglibUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaglibUri(org.eclipse.modisco.jee.webapp.webapp24.String newTaglibUri) {
		if (newTaglibUri != taglibUri) {
			NotificationChain msgs = null;
			if (taglibUri != null)
				msgs = ((InternalEObject)taglibUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.TAGLIB_TYPE__TAGLIB_URI, null, msgs);
			if (newTaglibUri != null)
				msgs = ((InternalEObject)newTaglibUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.TAGLIB_TYPE__TAGLIB_URI, null, msgs);
			msgs = basicSetTaglibUri(newTaglibUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.TAGLIB_TYPE__TAGLIB_URI, newTaglibUri, newTaglibUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathType getTaglibLocation() {
		return taglibLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaglibLocation(PathType newTaglibLocation, NotificationChain msgs) {
		PathType oldTaglibLocation = taglibLocation;
		taglibLocation = newTaglibLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.TAGLIB_TYPE__TAGLIB_LOCATION, oldTaglibLocation, newTaglibLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaglibLocation(PathType newTaglibLocation) {
		if (newTaglibLocation != taglibLocation) {
			NotificationChain msgs = null;
			if (taglibLocation != null)
				msgs = ((InternalEObject)taglibLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.TAGLIB_TYPE__TAGLIB_LOCATION, null, msgs);
			if (newTaglibLocation != null)
				msgs = ((InternalEObject)newTaglibLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.TAGLIB_TYPE__TAGLIB_LOCATION, null, msgs);
			msgs = basicSetTaglibLocation(newTaglibLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.TAGLIB_TYPE__TAGLIB_LOCATION, newTaglibLocation, newTaglibLocation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.TAGLIB_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp24Package.TAGLIB_TYPE__TAGLIB_URI:
				return basicSetTaglibUri(null, msgs);
			case Webapp24Package.TAGLIB_TYPE__TAGLIB_LOCATION:
				return basicSetTaglibLocation(null, msgs);
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
			case Webapp24Package.TAGLIB_TYPE__TAGLIB_URI:
				return getTaglibUri();
			case Webapp24Package.TAGLIB_TYPE__TAGLIB_LOCATION:
				return getTaglibLocation();
			case Webapp24Package.TAGLIB_TYPE__ID:
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
			case Webapp24Package.TAGLIB_TYPE__TAGLIB_URI:
				setTaglibUri((org.eclipse.modisco.jee.webapp.webapp24.String)newValue);
				return;
			case Webapp24Package.TAGLIB_TYPE__TAGLIB_LOCATION:
				setTaglibLocation((PathType)newValue);
				return;
			case Webapp24Package.TAGLIB_TYPE__ID:
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
			case Webapp24Package.TAGLIB_TYPE__TAGLIB_URI:
				setTaglibUri((org.eclipse.modisco.jee.webapp.webapp24.String)null);
				return;
			case Webapp24Package.TAGLIB_TYPE__TAGLIB_LOCATION:
				setTaglibLocation((PathType)null);
				return;
			case Webapp24Package.TAGLIB_TYPE__ID:
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
			case Webapp24Package.TAGLIB_TYPE__TAGLIB_URI:
				return taglibUri != null;
			case Webapp24Package.TAGLIB_TYPE__TAGLIB_LOCATION:
				return taglibLocation != null;
			case Webapp24Package.TAGLIB_TYPE__ID:
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

} //TaglibTypeImpl
