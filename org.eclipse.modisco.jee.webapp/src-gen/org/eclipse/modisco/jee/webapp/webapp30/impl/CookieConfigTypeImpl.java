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
package org.eclipse.modisco.jee.webapp.webapp30.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.webapp.webapp30.CookieCommentType;
import org.eclipse.modisco.jee.webapp.webapp30.CookieConfigType;
import org.eclipse.modisco.jee.webapp.webapp30.CookieDomainType;
import org.eclipse.modisco.jee.webapp.webapp30.CookieNameType;
import org.eclipse.modisco.jee.webapp.webapp30.CookiePathType;
import org.eclipse.modisco.jee.webapp.webapp30.TrueFalseType;
import org.eclipse.modisco.jee.webapp.webapp30.Webapp30Package;
import org.eclipse.modisco.jee.webapp.webapp30.XsdIntegerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cookie Config Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.CookieConfigTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.CookieConfigTypeImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.CookieConfigTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.CookieConfigTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.CookieConfigTypeImpl#getHttpOnly <em>Http Only</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.CookieConfigTypeImpl#getSecure <em>Secure</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.CookieConfigTypeImpl#getMaxAge <em>Max Age</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp30.impl.CookieConfigTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CookieConfigTypeImpl extends EObjectImpl implements CookieConfigType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected CookieNameType name;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected CookieDomainType domain;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected CookiePathType path;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected CookieCommentType comment;

	/**
	 * The cached value of the '{@link #getHttpOnly() <em>Http Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpOnly()
	 * @generated
	 * @ordered
	 */
	protected TrueFalseType httpOnly;

	/**
	 * The cached value of the '{@link #getSecure() <em>Secure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecure()
	 * @generated
	 * @ordered
	 */
	protected TrueFalseType secure;

	/**
	 * The cached value of the '{@link #getMaxAge() <em>Max Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAge()
	 * @generated
	 * @ordered
	 */
	protected XsdIntegerType maxAge;

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
	protected CookieConfigTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp30Package.eINSTANCE.getCookieConfigType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookieNameType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(CookieNameType newName, NotificationChain msgs) {
		CookieNameType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.COOKIE_CONFIG_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(CookieNameType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.COOKIE_CONFIG_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.COOKIE_CONFIG_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.COOKIE_CONFIG_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookieDomainType getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(CookieDomainType newDomain, NotificationChain msgs) {
		CookieDomainType oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.COOKIE_CONFIG_TYPE__DOMAIN, oldDomain, newDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(CookieDomainType newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.COOKIE_CONFIG_TYPE__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.COOKIE_CONFIG_TYPE__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.COOKIE_CONFIG_TYPE__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookiePathType getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(CookiePathType newPath, NotificationChain msgs) {
		CookiePathType oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.COOKIE_CONFIG_TYPE__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(CookiePathType newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.COOKIE_CONFIG_TYPE__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.COOKIE_CONFIG_TYPE__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.COOKIE_CONFIG_TYPE__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookieCommentType getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(CookieCommentType newComment, NotificationChain msgs) {
		CookieCommentType oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.COOKIE_CONFIG_TYPE__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(CookieCommentType newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.COOKIE_CONFIG_TYPE__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.COOKIE_CONFIG_TYPE__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.COOKIE_CONFIG_TYPE__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType getHttpOnly() {
		return httpOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHttpOnly(TrueFalseType newHttpOnly, NotificationChain msgs) {
		TrueFalseType oldHttpOnly = httpOnly;
		httpOnly = newHttpOnly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.COOKIE_CONFIG_TYPE__HTTP_ONLY, oldHttpOnly, newHttpOnly);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpOnly(TrueFalseType newHttpOnly) {
		if (newHttpOnly != httpOnly) {
			NotificationChain msgs = null;
			if (httpOnly != null)
				msgs = ((InternalEObject)httpOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.COOKIE_CONFIG_TYPE__HTTP_ONLY, null, msgs);
			if (newHttpOnly != null)
				msgs = ((InternalEObject)newHttpOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.COOKIE_CONFIG_TYPE__HTTP_ONLY, null, msgs);
			msgs = basicSetHttpOnly(newHttpOnly, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.COOKIE_CONFIG_TYPE__HTTP_ONLY, newHttpOnly, newHttpOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType getSecure() {
		return secure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecure(TrueFalseType newSecure, NotificationChain msgs) {
		TrueFalseType oldSecure = secure;
		secure = newSecure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.COOKIE_CONFIG_TYPE__SECURE, oldSecure, newSecure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecure(TrueFalseType newSecure) {
		if (newSecure != secure) {
			NotificationChain msgs = null;
			if (secure != null)
				msgs = ((InternalEObject)secure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.COOKIE_CONFIG_TYPE__SECURE, null, msgs);
			if (newSecure != null)
				msgs = ((InternalEObject)newSecure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.COOKIE_CONFIG_TYPE__SECURE, null, msgs);
			msgs = basicSetSecure(newSecure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.COOKIE_CONFIG_TYPE__SECURE, newSecure, newSecure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdIntegerType getMaxAge() {
		return maxAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxAge(XsdIntegerType newMaxAge, NotificationChain msgs) {
		XsdIntegerType oldMaxAge = maxAge;
		maxAge = newMaxAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp30Package.COOKIE_CONFIG_TYPE__MAX_AGE, oldMaxAge, newMaxAge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAge(XsdIntegerType newMaxAge) {
		if (newMaxAge != maxAge) {
			NotificationChain msgs = null;
			if (maxAge != null)
				msgs = ((InternalEObject)maxAge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.COOKIE_CONFIG_TYPE__MAX_AGE, null, msgs);
			if (newMaxAge != null)
				msgs = ((InternalEObject)newMaxAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp30Package.COOKIE_CONFIG_TYPE__MAX_AGE, null, msgs);
			msgs = basicSetMaxAge(newMaxAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.COOKIE_CONFIG_TYPE__MAX_AGE, newMaxAge, newMaxAge));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp30Package.COOKIE_CONFIG_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp30Package.COOKIE_CONFIG_TYPE__NAME:
				return basicSetName(null, msgs);
			case Webapp30Package.COOKIE_CONFIG_TYPE__DOMAIN:
				return basicSetDomain(null, msgs);
			case Webapp30Package.COOKIE_CONFIG_TYPE__PATH:
				return basicSetPath(null, msgs);
			case Webapp30Package.COOKIE_CONFIG_TYPE__COMMENT:
				return basicSetComment(null, msgs);
			case Webapp30Package.COOKIE_CONFIG_TYPE__HTTP_ONLY:
				return basicSetHttpOnly(null, msgs);
			case Webapp30Package.COOKIE_CONFIG_TYPE__SECURE:
				return basicSetSecure(null, msgs);
			case Webapp30Package.COOKIE_CONFIG_TYPE__MAX_AGE:
				return basicSetMaxAge(null, msgs);
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
			case Webapp30Package.COOKIE_CONFIG_TYPE__NAME:
				return getName();
			case Webapp30Package.COOKIE_CONFIG_TYPE__DOMAIN:
				return getDomain();
			case Webapp30Package.COOKIE_CONFIG_TYPE__PATH:
				return getPath();
			case Webapp30Package.COOKIE_CONFIG_TYPE__COMMENT:
				return getComment();
			case Webapp30Package.COOKIE_CONFIG_TYPE__HTTP_ONLY:
				return getHttpOnly();
			case Webapp30Package.COOKIE_CONFIG_TYPE__SECURE:
				return getSecure();
			case Webapp30Package.COOKIE_CONFIG_TYPE__MAX_AGE:
				return getMaxAge();
			case Webapp30Package.COOKIE_CONFIG_TYPE__ID:
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
			case Webapp30Package.COOKIE_CONFIG_TYPE__NAME:
				setName((CookieNameType)newValue);
				return;
			case Webapp30Package.COOKIE_CONFIG_TYPE__DOMAIN:
				setDomain((CookieDomainType)newValue);
				return;
			case Webapp30Package.COOKIE_CONFIG_TYPE__PATH:
				setPath((CookiePathType)newValue);
				return;
			case Webapp30Package.COOKIE_CONFIG_TYPE__COMMENT:
				setComment((CookieCommentType)newValue);
				return;
			case Webapp30Package.COOKIE_CONFIG_TYPE__HTTP_ONLY:
				setHttpOnly((TrueFalseType)newValue);
				return;
			case Webapp30Package.COOKIE_CONFIG_TYPE__SECURE:
				setSecure((TrueFalseType)newValue);
				return;
			case Webapp30Package.COOKIE_CONFIG_TYPE__MAX_AGE:
				setMaxAge((XsdIntegerType)newValue);
				return;
			case Webapp30Package.COOKIE_CONFIG_TYPE__ID:
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
			case Webapp30Package.COOKIE_CONFIG_TYPE__NAME:
				setName((CookieNameType)null);
				return;
			case Webapp30Package.COOKIE_CONFIG_TYPE__DOMAIN:
				setDomain((CookieDomainType)null);
				return;
			case Webapp30Package.COOKIE_CONFIG_TYPE__PATH:
				setPath((CookiePathType)null);
				return;
			case Webapp30Package.COOKIE_CONFIG_TYPE__COMMENT:
				setComment((CookieCommentType)null);
				return;
			case Webapp30Package.COOKIE_CONFIG_TYPE__HTTP_ONLY:
				setHttpOnly((TrueFalseType)null);
				return;
			case Webapp30Package.COOKIE_CONFIG_TYPE__SECURE:
				setSecure((TrueFalseType)null);
				return;
			case Webapp30Package.COOKIE_CONFIG_TYPE__MAX_AGE:
				setMaxAge((XsdIntegerType)null);
				return;
			case Webapp30Package.COOKIE_CONFIG_TYPE__ID:
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
			case Webapp30Package.COOKIE_CONFIG_TYPE__NAME:
				return name != null;
			case Webapp30Package.COOKIE_CONFIG_TYPE__DOMAIN:
				return domain != null;
			case Webapp30Package.COOKIE_CONFIG_TYPE__PATH:
				return path != null;
			case Webapp30Package.COOKIE_CONFIG_TYPE__COMMENT:
				return comment != null;
			case Webapp30Package.COOKIE_CONFIG_TYPE__HTTP_ONLY:
				return httpOnly != null;
			case Webapp30Package.COOKIE_CONFIG_TYPE__SECURE:
				return secure != null;
			case Webapp30Package.COOKIE_CONFIG_TYPE__MAX_AGE:
				return maxAge != null;
			case Webapp30Package.COOKIE_CONFIG_TYPE__ID:
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

} //CookieConfigTypeImpl
