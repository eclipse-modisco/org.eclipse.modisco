/**
 *   Copyright (c) 2010 Mia-Software.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.webapp.webapp23.impl;

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

import org.eclipse.modisco.jee.webapp.webapp23.DescriptionType;
import org.eclipse.modisco.jee.webapp.webapp23.DisplayNameType;
import org.eclipse.modisco.jee.webapp.webapp23.FilterClassType;
import org.eclipse.modisco.jee.webapp.webapp23.FilterNameType;
import org.eclipse.modisco.jee.webapp.webapp23.FilterType;
import org.eclipse.modisco.jee.webapp.webapp23.IconType;
import org.eclipse.modisco.jee.webapp.webapp23.InitParamType;
import org.eclipse.modisco.jee.webapp.webapp23.Webapp23Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FilterTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FilterTypeImpl#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FilterTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FilterTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FilterTypeImpl#getFilterClass <em>Filter Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FilterTypeImpl#getInitParam <em>Init Param</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.webapp.webapp23.impl.FilterTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterTypeImpl extends EObjectImpl implements FilterType {
	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected IconType icon;

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
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected DisplayNameType displayName;

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
	 * The cached value of the '{@link #getFilterClass() <em>Filter Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterClass()
	 * @generated
	 * @ordered
	 */
	protected FilterClassType filterClass;

	/**
	 * The cached value of the '{@link #getInitParam() <em>Init Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitParam()
	 * @generated
	 * @ordered
	 */
	protected EList<InitParamType> initParam;

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
	protected FilterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp23Package.Literals.FILTER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconType getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(IconType newIcon, NotificationChain msgs) {
		IconType oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.FILTER_TYPE__ICON, oldIcon, newIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(IconType newIcon) {
		if (newIcon != icon) {
			NotificationChain msgs = null;
			if (icon != null)
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.FILTER_TYPE__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.FILTER_TYPE__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.FILTER_TYPE__ICON, newIcon, newIcon));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.FILTER_TYPE__FILTER_NAME, oldFilterName, newFilterName);
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
				msgs = ((InternalEObject)filterName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.FILTER_TYPE__FILTER_NAME, null, msgs);
			if (newFilterName != null)
				msgs = ((InternalEObject)newFilterName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.FILTER_TYPE__FILTER_NAME, null, msgs);
			msgs = basicSetFilterName(newFilterName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.FILTER_TYPE__FILTER_NAME, newFilterName, newFilterName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.FILTER_TYPE__DISPLAY_NAME, oldDisplayName, newDisplayName);
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
				msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.FILTER_TYPE__DISPLAY_NAME, null, msgs);
			if (newDisplayName != null)
				msgs = ((InternalEObject)newDisplayName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.FILTER_TYPE__DISPLAY_NAME, null, msgs);
			msgs = basicSetDisplayName(newDisplayName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.FILTER_TYPE__DISPLAY_NAME, newDisplayName, newDisplayName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.FILTER_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.FILTER_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.FILTER_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.FILTER_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterClassType getFilterClass() {
		return filterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterClass(FilterClassType newFilterClass, NotificationChain msgs) {
		FilterClassType oldFilterClass = filterClass;
		filterClass = newFilterClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Webapp23Package.FILTER_TYPE__FILTER_CLASS, oldFilterClass, newFilterClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterClass(FilterClassType newFilterClass) {
		if (newFilterClass != filterClass) {
			NotificationChain msgs = null;
			if (filterClass != null)
				msgs = ((InternalEObject)filterClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.FILTER_TYPE__FILTER_CLASS, null, msgs);
			if (newFilterClass != null)
				msgs = ((InternalEObject)newFilterClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Webapp23Package.FILTER_TYPE__FILTER_CLASS, null, msgs);
			msgs = basicSetFilterClass(newFilterClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.FILTER_TYPE__FILTER_CLASS, newFilterClass, newFilterClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InitParamType> getInitParam() {
		if (initParam == null) {
			initParam = new EObjectContainmentEList<InitParamType>(InitParamType.class, this, Webapp23Package.FILTER_TYPE__INIT_PARAM);
		}
		return initParam;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp23Package.FILTER_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Webapp23Package.FILTER_TYPE__ICON:
				return basicSetIcon(null, msgs);
			case Webapp23Package.FILTER_TYPE__FILTER_NAME:
				return basicSetFilterName(null, msgs);
			case Webapp23Package.FILTER_TYPE__DISPLAY_NAME:
				return basicSetDisplayName(null, msgs);
			case Webapp23Package.FILTER_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case Webapp23Package.FILTER_TYPE__FILTER_CLASS:
				return basicSetFilterClass(null, msgs);
			case Webapp23Package.FILTER_TYPE__INIT_PARAM:
				return ((InternalEList<?>)getInitParam()).basicRemove(otherEnd, msgs);
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
			case Webapp23Package.FILTER_TYPE__ICON:
				return getIcon();
			case Webapp23Package.FILTER_TYPE__FILTER_NAME:
				return getFilterName();
			case Webapp23Package.FILTER_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case Webapp23Package.FILTER_TYPE__DESCRIPTION:
				return getDescription();
			case Webapp23Package.FILTER_TYPE__FILTER_CLASS:
				return getFilterClass();
			case Webapp23Package.FILTER_TYPE__INIT_PARAM:
				return getInitParam();
			case Webapp23Package.FILTER_TYPE__ID:
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
			case Webapp23Package.FILTER_TYPE__ICON:
				setIcon((IconType)newValue);
				return;
			case Webapp23Package.FILTER_TYPE__FILTER_NAME:
				setFilterName((FilterNameType)newValue);
				return;
			case Webapp23Package.FILTER_TYPE__DISPLAY_NAME:
				setDisplayName((DisplayNameType)newValue);
				return;
			case Webapp23Package.FILTER_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case Webapp23Package.FILTER_TYPE__FILTER_CLASS:
				setFilterClass((FilterClassType)newValue);
				return;
			case Webapp23Package.FILTER_TYPE__INIT_PARAM:
				getInitParam().clear();
				getInitParam().addAll((Collection<? extends InitParamType>)newValue);
				return;
			case Webapp23Package.FILTER_TYPE__ID:
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
			case Webapp23Package.FILTER_TYPE__ICON:
				setIcon((IconType)null);
				return;
			case Webapp23Package.FILTER_TYPE__FILTER_NAME:
				setFilterName((FilterNameType)null);
				return;
			case Webapp23Package.FILTER_TYPE__DISPLAY_NAME:
				setDisplayName((DisplayNameType)null);
				return;
			case Webapp23Package.FILTER_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case Webapp23Package.FILTER_TYPE__FILTER_CLASS:
				setFilterClass((FilterClassType)null);
				return;
			case Webapp23Package.FILTER_TYPE__INIT_PARAM:
				getInitParam().clear();
				return;
			case Webapp23Package.FILTER_TYPE__ID:
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
			case Webapp23Package.FILTER_TYPE__ICON:
				return icon != null;
			case Webapp23Package.FILTER_TYPE__FILTER_NAME:
				return filterName != null;
			case Webapp23Package.FILTER_TYPE__DISPLAY_NAME:
				return displayName != null;
			case Webapp23Package.FILTER_TYPE__DESCRIPTION:
				return description != null;
			case Webapp23Package.FILTER_TYPE__FILTER_CLASS:
				return filterClass != null;
			case Webapp23Package.FILTER_TYPE__INIT_PARAM:
				return initParam != null && !initParam.isEmpty();
			case Webapp23Package.FILTER_TYPE__ID:
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

} //FilterTypeImpl
