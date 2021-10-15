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

import org.eclipse.modisco.jee.webapp.webapp24.DispatcherType;
import org.eclipse.modisco.jee.webapp.webapp24.FilterMappingType;
import org.eclipse.modisco.jee.webapp.webapp24.FilterNameType;
import org.eclipse.modisco.jee.webapp.webapp24.ServletNameType;
import org.eclipse.modisco.jee.webapp.webapp24.UrlPatternType;
import org.eclipse.modisco.jee.webapp.webapp24.Webapp24Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.FilterMappingTypeImpl#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.FilterMappingTypeImpl#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.FilterMappingTypeImpl#getServletName <em>Servlet Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.FilterMappingTypeImpl#getDispatcher <em>Dispatcher</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp24.impl.FilterMappingTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterMappingTypeImpl extends EObjectImpl implements FilterMappingType {
	/**
	 * The cached value of the '{@link #getFilterName() <em>Filter Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterName()
	 * @generated
	 * @ordered
	 */
	protected FilterNameType filterName;

	/**
	 * The cached value of the '{@link #getUrlPattern() <em>Url Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlPattern()
	 * @generated
	 * @ordered
	 */
	protected UrlPatternType urlPattern;

	/**
	 * The cached value of the '{@link #getServletName() <em>Servlet Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServletName()
	 * @generated
	 * @ordered
	 */
	protected ServletNameType servletName;

	/**
	 * The cached value of the '{@link #getDispatcher() <em>Dispatcher</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatcher()
	 * @generated
	 * @ordered
	 */
	protected EList<DispatcherType> dispatcher;

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
	protected FilterMappingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp24Package.Literals.FILTER_MAPPING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterNameType getFilterName() {
		return filterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterName(FilterNameType newFilterName, NotificationChain msgs) {
		FilterNameType oldFilterName = filterName;
		filterName = newFilterName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.FILTER_MAPPING_TYPE__FILTER_NAME, oldFilterName, newFilterName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterName(FilterNameType newFilterName) {
		if (newFilterName != filterName) {
			NotificationChain msgs = null;
			if (filterName != null)
				msgs = ((InternalEObject)filterName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.FILTER_MAPPING_TYPE__FILTER_NAME, null, msgs);
			if (newFilterName != null)
				msgs = ((InternalEObject)newFilterName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.FILTER_MAPPING_TYPE__FILTER_NAME, null, msgs);
			msgs = basicSetFilterName(newFilterName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.FILTER_MAPPING_TYPE__FILTER_NAME, newFilterName, newFilterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrlPatternType getUrlPattern() {
		return urlPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrlPattern(UrlPatternType newUrlPattern, NotificationChain msgs) {
		UrlPatternType oldUrlPattern = urlPattern;
		urlPattern = newUrlPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.FILTER_MAPPING_TYPE__URL_PATTERN, oldUrlPattern, newUrlPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlPattern(UrlPatternType newUrlPattern) {
		if (newUrlPattern != urlPattern) {
			NotificationChain msgs = null;
			if (urlPattern != null)
				msgs = ((InternalEObject)urlPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.FILTER_MAPPING_TYPE__URL_PATTERN, null, msgs);
			if (newUrlPattern != null)
				msgs = ((InternalEObject)newUrlPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.FILTER_MAPPING_TYPE__URL_PATTERN, null, msgs);
			msgs = basicSetUrlPattern(newUrlPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.FILTER_MAPPING_TYPE__URL_PATTERN, newUrlPattern, newUrlPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServletNameType getServletName() {
		return servletName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServletName(ServletNameType newServletName, NotificationChain msgs) {
		ServletNameType oldServletName = servletName;
		servletName = newServletName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp24Package.FILTER_MAPPING_TYPE__SERVLET_NAME, oldServletName, newServletName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServletName(ServletNameType newServletName) {
		if (newServletName != servletName) {
			NotificationChain msgs = null;
			if (servletName != null)
				msgs = ((InternalEObject)servletName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.FILTER_MAPPING_TYPE__SERVLET_NAME, null, msgs);
			if (newServletName != null)
				msgs = ((InternalEObject)newServletName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp24Package.FILTER_MAPPING_TYPE__SERVLET_NAME, null, msgs);
			msgs = basicSetServletName(newServletName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.FILTER_MAPPING_TYPE__SERVLET_NAME, newServletName, newServletName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DispatcherType> getDispatcher() {
		if (dispatcher == null) {
			dispatcher = new EObjectContainmentEList<DispatcherType>(DispatcherType.class, this, Webapp24Package.FILTER_MAPPING_TYPE__DISPATCHER);
		}
		return dispatcher;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp24Package.FILTER_MAPPING_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp24Package.FILTER_MAPPING_TYPE__FILTER_NAME:
				return basicSetFilterName(null, msgs);
			case Webapp24Package.FILTER_MAPPING_TYPE__URL_PATTERN:
				return basicSetUrlPattern(null, msgs);
			case Webapp24Package.FILTER_MAPPING_TYPE__SERVLET_NAME:
				return basicSetServletName(null, msgs);
			case Webapp24Package.FILTER_MAPPING_TYPE__DISPATCHER:
				return ((InternalEList<?>)getDispatcher()).basicRemove(otherEnd, msgs);
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
			case Webapp24Package.FILTER_MAPPING_TYPE__FILTER_NAME:
				return getFilterName();
			case Webapp24Package.FILTER_MAPPING_TYPE__URL_PATTERN:
				return getUrlPattern();
			case Webapp24Package.FILTER_MAPPING_TYPE__SERVLET_NAME:
				return getServletName();
			case Webapp24Package.FILTER_MAPPING_TYPE__DISPATCHER:
				return getDispatcher();
			case Webapp24Package.FILTER_MAPPING_TYPE__ID:
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
			case Webapp24Package.FILTER_MAPPING_TYPE__FILTER_NAME:
				setFilterName((FilterNameType)newValue);
				return;
			case Webapp24Package.FILTER_MAPPING_TYPE__URL_PATTERN:
				setUrlPattern((UrlPatternType)newValue);
				return;
			case Webapp24Package.FILTER_MAPPING_TYPE__SERVLET_NAME:
				setServletName((ServletNameType)newValue);
				return;
			case Webapp24Package.FILTER_MAPPING_TYPE__DISPATCHER:
				getDispatcher().clear();
				getDispatcher().addAll((Collection<? extends DispatcherType>)newValue);
				return;
			case Webapp24Package.FILTER_MAPPING_TYPE__ID:
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
			case Webapp24Package.FILTER_MAPPING_TYPE__FILTER_NAME:
				setFilterName((FilterNameType)null);
				return;
			case Webapp24Package.FILTER_MAPPING_TYPE__URL_PATTERN:
				setUrlPattern((UrlPatternType)null);
				return;
			case Webapp24Package.FILTER_MAPPING_TYPE__SERVLET_NAME:
				setServletName((ServletNameType)null);
				return;
			case Webapp24Package.FILTER_MAPPING_TYPE__DISPATCHER:
				getDispatcher().clear();
				return;
			case Webapp24Package.FILTER_MAPPING_TYPE__ID:
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
			case Webapp24Package.FILTER_MAPPING_TYPE__FILTER_NAME:
				return filterName != null;
			case Webapp24Package.FILTER_MAPPING_TYPE__URL_PATTERN:
				return urlPattern != null;
			case Webapp24Package.FILTER_MAPPING_TYPE__SERVLET_NAME:
				return servletName != null;
			case Webapp24Package.FILTER_MAPPING_TYPE__DISPATCHER:
				return dispatcher != null && !dispatcher.isEmpty();
			case Webapp24Package.FILTER_MAPPING_TYPE__ID:
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

} //FilterMappingTypeImpl
