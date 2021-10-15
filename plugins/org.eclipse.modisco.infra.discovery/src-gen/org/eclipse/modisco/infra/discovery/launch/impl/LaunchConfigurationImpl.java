/**
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Fabien Giquel (Mia-Software) - design and implementation
 * 
 */
package org.eclipse.modisco.infra.discovery.launch.impl;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;

import org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration;
import org.eclipse.modisco.infra.discovery.launch.LaunchPackage;
import org.eclipse.modisco.infra.discovery.launch.ParameterValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.launch.impl.LaunchConfigurationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.launch.impl.LaunchConfigurationImpl#getParameterValues <em>Parameter Values</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.launch.impl.LaunchConfigurationImpl#getDiscoverer <em>Discoverer</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.launch.impl.LaunchConfigurationImpl#isOpenModelAfterDiscovery <em>Open Model After Discovery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LaunchConfigurationImpl extends EObjectImpl implements LaunchConfiguration {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final Object SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Object source = SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterValues() <em>Parameter Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValue> parameterValues;

	/**
	 * The cached value of the '{@link #getDiscoverer() <em>Discoverer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoverer()
	 * @generated
	 * @ordered
	 */
	protected DiscovererDescription discoverer;

	/**
	 * The default value of the '{@link #isOpenModelAfterDiscovery() <em>Open Model After Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpenModelAfterDiscovery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPEN_MODEL_AFTER_DISCOVERY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOpenModelAfterDiscovery() <em>Open Model After Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpenModelAfterDiscovery()
	 * @generated
	 * @ordered
	 */
	protected boolean openModelAfterDiscovery = OPEN_MODEL_AFTER_DISCOVERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaunchConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaunchPackage.Literals.LAUNCH_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Object newSource) {
		Object oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchPackage.LAUNCH_CONFIGURATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterValue> getParameterValues() {
		if (parameterValues == null) {
			parameterValues = new EObjectContainmentEList<ParameterValue>(ParameterValue.class, this, LaunchPackage.LAUNCH_CONFIGURATION__PARAMETER_VALUES);
		}
		return parameterValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscovererDescription getDiscoverer() {
		if (discoverer != null && discoverer.eIsProxy()) {
			InternalEObject oldDiscoverer = (InternalEObject)discoverer;
			discoverer = (DiscovererDescription)eResolveProxy(oldDiscoverer);
			if (discoverer != oldDiscoverer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LaunchPackage.LAUNCH_CONFIGURATION__DISCOVERER, oldDiscoverer, discoverer));
			}
		}
		return discoverer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscovererDescription basicGetDiscoverer() {
		return discoverer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoverer(DiscovererDescription newDiscoverer) {
		DiscovererDescription oldDiscoverer = discoverer;
		discoverer = newDiscoverer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchPackage.LAUNCH_CONFIGURATION__DISCOVERER, oldDiscoverer, discoverer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpenModelAfterDiscovery() {
		return openModelAfterDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenModelAfterDiscovery(boolean newOpenModelAfterDiscovery) {
		boolean oldOpenModelAfterDiscovery = openModelAfterDiscovery;
		openModelAfterDiscovery = newOpenModelAfterDiscovery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaunchPackage.LAUNCH_CONFIGURATION__OPEN_MODEL_AFTER_DISCOVERY, oldOpenModelAfterDiscovery, openModelAfterDiscovery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LaunchPackage.LAUNCH_CONFIGURATION__PARAMETER_VALUES:
				return ((InternalEList<?>)getParameterValues()).basicRemove(otherEnd, msgs);
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
			case LaunchPackage.LAUNCH_CONFIGURATION__SOURCE:
				return getSource();
			case LaunchPackage.LAUNCH_CONFIGURATION__PARAMETER_VALUES:
				return getParameterValues();
			case LaunchPackage.LAUNCH_CONFIGURATION__DISCOVERER:
				if (resolve) return getDiscoverer();
				return basicGetDiscoverer();
			case LaunchPackage.LAUNCH_CONFIGURATION__OPEN_MODEL_AFTER_DISCOVERY:
				return isOpenModelAfterDiscovery();
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
			case LaunchPackage.LAUNCH_CONFIGURATION__SOURCE:
				setSource(newValue);
				return;
			case LaunchPackage.LAUNCH_CONFIGURATION__PARAMETER_VALUES:
				getParameterValues().clear();
				getParameterValues().addAll((Collection<? extends ParameterValue>)newValue);
				return;
			case LaunchPackage.LAUNCH_CONFIGURATION__DISCOVERER:
				setDiscoverer((DiscovererDescription)newValue);
				return;
			case LaunchPackage.LAUNCH_CONFIGURATION__OPEN_MODEL_AFTER_DISCOVERY:
				setOpenModelAfterDiscovery((Boolean)newValue);
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
			case LaunchPackage.LAUNCH_CONFIGURATION__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case LaunchPackage.LAUNCH_CONFIGURATION__PARAMETER_VALUES:
				getParameterValues().clear();
				return;
			case LaunchPackage.LAUNCH_CONFIGURATION__DISCOVERER:
				setDiscoverer((DiscovererDescription)null);
				return;
			case LaunchPackage.LAUNCH_CONFIGURATION__OPEN_MODEL_AFTER_DISCOVERY:
				setOpenModelAfterDiscovery(OPEN_MODEL_AFTER_DISCOVERY_EDEFAULT);
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
			case LaunchPackage.LAUNCH_CONFIGURATION__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case LaunchPackage.LAUNCH_CONFIGURATION__PARAMETER_VALUES:
				return parameterValues != null && !parameterValues.isEmpty();
			case LaunchPackage.LAUNCH_CONFIGURATION__DISCOVERER:
				return discoverer != null;
			case LaunchPackage.LAUNCH_CONFIGURATION__OPEN_MODEL_AFTER_DISCOVERY:
				return openModelAfterDiscovery != OPEN_MODEL_AFTER_DISCOVERY_EDEFAULT;
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
		result.append(" (source: ");
		result.append(source);
		result.append(", openModelAfterDiscovery: ");
		result.append(openModelAfterDiscovery);
		result.append(')');
		return result.toString();
	}

} //LaunchConfigurationImpl
