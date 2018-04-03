/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - Bug 341752 - Extract report metamodel from the benchmark plug-in to avoid Acceleo troubles.
 *     Nicolas Bros (Mia-Software) - extracted Java benchmark
 */
package org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.AbstractCDODiscovery;
import org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.JavaBenchmarkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract CDO Discovery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.AbstractCDODiscoveryImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.AbstractCDODiscoveryImpl#getRevisedLruCapacity <em>Revised Lru Capacity</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.AbstractCDODiscoveryImpl#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.AbstractCDODiscoveryImpl#getServerDescription <em>Server Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.AbstractCDODiscoveryImpl#getCurrentLruCapacity <em>Current Lru Capacity</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark.impl.AbstractCDODiscoveryImpl#getInitTimeInSeconds <em>Init Time In Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractCDODiscoveryImpl extends EObjectImpl implements AbstractCDODiscovery {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisedLruCapacity() <em>Revised Lru Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedLruCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int REVISED_LRU_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRevisedLruCapacity() <em>Revised Lru Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedLruCapacity()
	 * @generated
	 * @ordered
	 */
	protected int revisedLruCapacity = REVISED_LRU_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCacheType() <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheType()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheType() <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheType()
	 * @generated
	 * @ordered
	 */
	protected String cacheType = CACHE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerDescription() <em>Server Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerDescription() <em>Server Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerDescription()
	 * @generated
	 * @ordered
	 */
	protected String serverDescription = SERVER_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentLruCapacity() <em>Current Lru Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLruCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_LRU_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentLruCapacity() <em>Current Lru Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLruCapacity()
	 * @generated
	 * @ordered
	 */
	protected int currentLruCapacity = CURRENT_LRU_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitTimeInSeconds() <em>Init Time In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitTimeInSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final double INIT_TIME_IN_SECONDS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInitTimeInSeconds() <em>Init Time In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitTimeInSeconds()
	 * @generated
	 * @ordered
	 */
	protected double initTimeInSeconds = INIT_TIME_IN_SECONDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCDODiscoveryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaBenchmarkPackage.Literals.ABSTRACT_CDO_DISCOVERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRevisedLruCapacity() {
		return revisedLruCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisedLruCapacity(int newRevisedLruCapacity) {
		int oldRevisedLruCapacity = revisedLruCapacity;
		revisedLruCapacity = newRevisedLruCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__REVISED_LRU_CAPACITY, oldRevisedLruCapacity, revisedLruCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCacheType() {
		return cacheType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheType(String newCacheType) {
		String oldCacheType = cacheType;
		cacheType = newCacheType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__CACHE_TYPE, oldCacheType, cacheType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerDescription() {
		return serverDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerDescription(String newServerDescription) {
		String oldServerDescription = serverDescription;
		serverDescription = newServerDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__SERVER_DESCRIPTION, oldServerDescription, serverDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentLruCapacity() {
		return currentLruCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentLruCapacity(int newCurrentLruCapacity) {
		int oldCurrentLruCapacity = currentLruCapacity;
		currentLruCapacity = newCurrentLruCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__CURRENT_LRU_CAPACITY, oldCurrentLruCapacity, currentLruCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInitTimeInSeconds() {
		return initTimeInSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitTimeInSeconds(double newInitTimeInSeconds) {
		double oldInitTimeInSeconds = initTimeInSeconds;
		initTimeInSeconds = newInitTimeInSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__INIT_TIME_IN_SECONDS, oldInitTimeInSeconds, initTimeInSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__VERSION:
				return getVersion();
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__REVISED_LRU_CAPACITY:
				return getRevisedLruCapacity();
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__CACHE_TYPE:
				return getCacheType();
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__SERVER_DESCRIPTION:
				return getServerDescription();
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__CURRENT_LRU_CAPACITY:
				return getCurrentLruCapacity();
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__INIT_TIME_IN_SECONDS:
				return getInitTimeInSeconds();
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
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__VERSION:
				setVersion((String)newValue);
				return;
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__REVISED_LRU_CAPACITY:
				setRevisedLruCapacity((Integer)newValue);
				return;
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__CACHE_TYPE:
				setCacheType((String)newValue);
				return;
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__SERVER_DESCRIPTION:
				setServerDescription((String)newValue);
				return;
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__CURRENT_LRU_CAPACITY:
				setCurrentLruCapacity((Integer)newValue);
				return;
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__INIT_TIME_IN_SECONDS:
				setInitTimeInSeconds((Double)newValue);
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
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__REVISED_LRU_CAPACITY:
				setRevisedLruCapacity(REVISED_LRU_CAPACITY_EDEFAULT);
				return;
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__CACHE_TYPE:
				setCacheType(CACHE_TYPE_EDEFAULT);
				return;
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__SERVER_DESCRIPTION:
				setServerDescription(SERVER_DESCRIPTION_EDEFAULT);
				return;
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__CURRENT_LRU_CAPACITY:
				setCurrentLruCapacity(CURRENT_LRU_CAPACITY_EDEFAULT);
				return;
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__INIT_TIME_IN_SECONDS:
				setInitTimeInSeconds(INIT_TIME_IN_SECONDS_EDEFAULT);
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
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__REVISED_LRU_CAPACITY:
				return revisedLruCapacity != REVISED_LRU_CAPACITY_EDEFAULT;
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__CACHE_TYPE:
				return CACHE_TYPE_EDEFAULT == null ? cacheType != null : !CACHE_TYPE_EDEFAULT.equals(cacheType);
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__SERVER_DESCRIPTION:
				return SERVER_DESCRIPTION_EDEFAULT == null ? serverDescription != null : !SERVER_DESCRIPTION_EDEFAULT.equals(serverDescription);
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__CURRENT_LRU_CAPACITY:
				return currentLruCapacity != CURRENT_LRU_CAPACITY_EDEFAULT;
			case JavaBenchmarkPackage.ABSTRACT_CDO_DISCOVERY__INIT_TIME_IN_SECONDS:
				return initTimeInSeconds != INIT_TIME_IN_SECONDS_EDEFAULT;
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
		result.append(" (version: ");
		result.append(version);
		result.append(", revisedLruCapacity: ");
		result.append(revisedLruCapacity);
		result.append(", cacheType: ");
		result.append(cacheType);
		result.append(", serverDescription: ");
		result.append(serverDescription);
		result.append(", currentLruCapacity: ");
		result.append(currentLruCapacity);
		result.append(", initTimeInSeconds: ");
		result.append(initTimeInSeconds);
		result.append(')');
		return result.toString();
	}

} //AbstractCDODiscoveryImpl
