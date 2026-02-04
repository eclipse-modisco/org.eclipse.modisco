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
package org.eclipse.modisco.jee.webapp.webapp25.impl;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.jee.webapp.webapp25.DispatcherType;
import org.eclipse.modisco.jee.webapp.webapp25.FilterMappingType;
import org.eclipse.modisco.jee.webapp.webapp25.FilterNameType;
import org.eclipse.modisco.jee.webapp.webapp25.ServletNameType;
import org.eclipse.modisco.jee.webapp.webapp25.UrlPatternType;
import org.eclipse.modisco.jee.webapp.webapp25.Webapp25Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.FilterMappingTypeImpl#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.FilterMappingTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.FilterMappingTypeImpl#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.FilterMappingTypeImpl#getServletName <em>Servlet Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.FilterMappingTypeImpl#getDispatcher <em>Dispatcher</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp25.impl.FilterMappingTypeImpl#getId <em>Id</em>}</li>
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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
		return Webapp25Package.Literals.FILTER_MAPPING_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp25Package.FILTER_MAPPING_TYPE__FILTER_NAME, oldFilterName, newFilterName);
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
				msgs = ((InternalEObject)filterName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.FILTER_MAPPING_TYPE__FILTER_NAME, null, msgs);
			if (newFilterName != null)
				msgs = ((InternalEObject)newFilterName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp25Package.FILTER_MAPPING_TYPE__FILTER_NAME, null, msgs);
			msgs = basicSetFilterName(newFilterName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.FILTER_MAPPING_TYPE__FILTER_NAME, newFilterName, newFilterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Webapp25Package.FILTER_MAPPING_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UrlPatternType> getUrlPattern() {
		return getGroup().list(Webapp25Package.Literals.FILTER_MAPPING_TYPE__URL_PATTERN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServletNameType> getServletName() {
		return getGroup().list(Webapp25Package.Literals.FILTER_MAPPING_TYPE__SERVLET_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DispatcherType> getDispatcher() {
		if (dispatcher == null) {
			dispatcher = new EObjectContainmentEList<DispatcherType>(DispatcherType.class, this, Webapp25Package.FILTER_MAPPING_TYPE__DISPATCHER);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp25Package.FILTER_MAPPING_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp25Package.FILTER_MAPPING_TYPE__FILTER_NAME:
				return basicSetFilterName(null, msgs);
			case Webapp25Package.FILTER_MAPPING_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Webapp25Package.FILTER_MAPPING_TYPE__URL_PATTERN:
				return ((InternalEList<?>)getUrlPattern()).basicRemove(otherEnd, msgs);
			case Webapp25Package.FILTER_MAPPING_TYPE__SERVLET_NAME:
				return ((InternalEList<?>)getServletName()).basicRemove(otherEnd, msgs);
			case Webapp25Package.FILTER_MAPPING_TYPE__DISPATCHER:
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
			case Webapp25Package.FILTER_MAPPING_TYPE__FILTER_NAME:
				return getFilterName();
			case Webapp25Package.FILTER_MAPPING_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Webapp25Package.FILTER_MAPPING_TYPE__URL_PATTERN:
				return getUrlPattern();
			case Webapp25Package.FILTER_MAPPING_TYPE__SERVLET_NAME:
				return getServletName();
			case Webapp25Package.FILTER_MAPPING_TYPE__DISPATCHER:
				return getDispatcher();
			case Webapp25Package.FILTER_MAPPING_TYPE__ID:
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
			case Webapp25Package.FILTER_MAPPING_TYPE__FILTER_NAME:
				setFilterName((FilterNameType)newValue);
				return;
			case Webapp25Package.FILTER_MAPPING_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Webapp25Package.FILTER_MAPPING_TYPE__URL_PATTERN:
				getUrlPattern().clear();
				getUrlPattern().addAll((Collection<? extends UrlPatternType>)newValue);
				return;
			case Webapp25Package.FILTER_MAPPING_TYPE__SERVLET_NAME:
				getServletName().clear();
				getServletName().addAll((Collection<? extends ServletNameType>)newValue);
				return;
			case Webapp25Package.FILTER_MAPPING_TYPE__DISPATCHER:
				getDispatcher().clear();
				getDispatcher().addAll((Collection<? extends DispatcherType>)newValue);
				return;
			case Webapp25Package.FILTER_MAPPING_TYPE__ID:
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
			case Webapp25Package.FILTER_MAPPING_TYPE__FILTER_NAME:
				setFilterName((FilterNameType)null);
				return;
			case Webapp25Package.FILTER_MAPPING_TYPE__GROUP:
				getGroup().clear();
				return;
			case Webapp25Package.FILTER_MAPPING_TYPE__URL_PATTERN:
				getUrlPattern().clear();
				return;
			case Webapp25Package.FILTER_MAPPING_TYPE__SERVLET_NAME:
				getServletName().clear();
				return;
			case Webapp25Package.FILTER_MAPPING_TYPE__DISPATCHER:
				getDispatcher().clear();
				return;
			case Webapp25Package.FILTER_MAPPING_TYPE__ID:
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
			case Webapp25Package.FILTER_MAPPING_TYPE__FILTER_NAME:
				return filterName != null;
			case Webapp25Package.FILTER_MAPPING_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Webapp25Package.FILTER_MAPPING_TYPE__URL_PATTERN:
				return !getUrlPattern().isEmpty();
			case Webapp25Package.FILTER_MAPPING_TYPE__SERVLET_NAME:
				return !getServletName().isEmpty();
			case Webapp25Package.FILTER_MAPPING_TYPE__DISPATCHER:
				return dispatcher != null && !dispatcher.isEmpty();
			case Webapp25Package.FILTER_MAPPING_TYPE__ID:
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
		result.append(" (group: "); //$NON-NLS-1$
		result.append(group);
		result.append(", id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //FilterMappingTypeImpl
