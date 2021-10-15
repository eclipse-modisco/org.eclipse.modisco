/**
 * Copyright (c) 2012, 2019 INRIA and Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *      Guillaume Doux (INRIA) - Initial API and implementation
 *      Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage
 *      Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer
 */
package org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl;

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

import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Benchmark</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkImpl#getJvmMaxHeapInMiB <em>Jvm Max Heap In Mi B</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkImpl#getProcessorName <em>Processor Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkImpl#getProcessorDescription <em>Processor Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkImpl#getProcessorCount <em>Processor Count</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkImpl#getProcessorCacheSize <em>Processor Cache Size</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkImpl#getSystemMemory <em>System Memory</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkImpl#getOsName <em>Os Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkImpl#getOsVersion <em>Os Version</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkImpl#getOsArchitecture <em>Os Architecture</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkImpl#getDiscoveries <em>Discoveries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BenchmarkImpl extends EObjectImpl implements Benchmark {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2012, 2015 INRIA and Mia-Software.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v2.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v20.html\r\n\r\nContributors:\r\n     Guillaume Doux (INRIA) - Initial API and implementation\r\n     Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage\r\n     Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer\r\n";

	/**
	 * The default value of the '{@link #getJvmMaxHeapInMiB() <em>Jvm Max Heap In Mi B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJvmMaxHeapInMiB()
	 * @generated
	 * @ordered
	 */
	protected static final long JVM_MAX_HEAP_IN_MI_B_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getJvmMaxHeapInMiB() <em>Jvm Max Heap In Mi B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJvmMaxHeapInMiB()
	 * @generated
	 * @ordered
	 */
	protected long jvmMaxHeapInMiB = JVM_MAX_HEAP_IN_MI_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessorName() <em>Processor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessorName() <em>Processor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorName()
	 * @generated
	 * @ordered
	 */
	protected String processorName = PROCESSOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessorDescription() <em>Processor Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSOR_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessorDescription() <em>Processor Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorDescription()
	 * @generated
	 * @ordered
	 */
	protected String processorDescription = PROCESSOR_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessorCount() <em>Processor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PROCESSOR_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProcessorCount() <em>Processor Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorCount()
	 * @generated
	 * @ordered
	 */
	protected int processorCount = PROCESSOR_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessorCacheSize() <em>Processor Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorCacheSize()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSOR_CACHE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessorCacheSize() <em>Processor Cache Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorCacheSize()
	 * @generated
	 * @ordered
	 */
	protected String processorCacheSize = PROCESSOR_CACHE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemMemory() <em>System Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemMemory()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_MEMORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemMemory() <em>System Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemMemory()
	 * @generated
	 * @ordered
	 */
	protected String systemMemory = SYSTEM_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsName() <em>Os Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsName()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsName() <em>Os Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsName()
	 * @generated
	 * @ordered
	 */
	protected String osName = OS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsVersion() <em>Os Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsVersion() <em>Os Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsVersion()
	 * @generated
	 * @ordered
	 */
	protected String osVersion = OS_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsArchitecture() <em>Os Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_ARCHITECTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsArchitecture() <em>Os Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsArchitecture()
	 * @generated
	 * @ordered
	 */
	protected String osArchitecture = OS_ARCHITECTURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> projects;

	/**
	 * The cached value of the '{@link #getDiscoveries() <em>Discoveries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveries()
	 * @generated
	 * @ordered
	 */
	protected EList<Discovery> discoveries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BenchmarkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BenchmarkPackage.Literals.BENCHMARK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getJvmMaxHeapInMiB() {
		return jvmMaxHeapInMiB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJvmMaxHeapInMiB(long newJvmMaxHeapInMiB) {
		long oldJvmMaxHeapInMiB = jvmMaxHeapInMiB;
		jvmMaxHeapInMiB = newJvmMaxHeapInMiB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.BENCHMARK__JVM_MAX_HEAP_IN_MI_B, oldJvmMaxHeapInMiB, jvmMaxHeapInMiB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessorName() {
		return processorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorName(String newProcessorName) {
		String oldProcessorName = processorName;
		processorName = newProcessorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.BENCHMARK__PROCESSOR_NAME, oldProcessorName, processorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessorDescription() {
		return processorDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorDescription(String newProcessorDescription) {
		String oldProcessorDescription = processorDescription;
		processorDescription = newProcessorDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.BENCHMARK__PROCESSOR_DESCRIPTION, oldProcessorDescription, processorDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProcessorCount() {
		return processorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorCount(int newProcessorCount) {
		int oldProcessorCount = processorCount;
		processorCount = newProcessorCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.BENCHMARK__PROCESSOR_COUNT, oldProcessorCount, processorCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessorCacheSize() {
		return processorCacheSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorCacheSize(String newProcessorCacheSize) {
		String oldProcessorCacheSize = processorCacheSize;
		processorCacheSize = newProcessorCacheSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.BENCHMARK__PROCESSOR_CACHE_SIZE, oldProcessorCacheSize, processorCacheSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemMemory() {
		return systemMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemMemory(String newSystemMemory) {
		String oldSystemMemory = systemMemory;
		systemMemory = newSystemMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.BENCHMARK__SYSTEM_MEMORY, oldSystemMemory, systemMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsName() {
		return osName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsName(String newOsName) {
		String oldOsName = osName;
		osName = newOsName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.BENCHMARK__OS_NAME, oldOsName, osName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsVersion() {
		return osVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsVersion(String newOsVersion) {
		String oldOsVersion = osVersion;
		osVersion = newOsVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.BENCHMARK__OS_VERSION, oldOsVersion, osVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsArchitecture() {
		return osArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsArchitecture(String newOsArchitecture) {
		String oldOsArchitecture = osArchitecture;
		osArchitecture = newOsArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.BENCHMARK__OS_ARCHITECTURE, oldOsArchitecture, osArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getProjects() {
		if (projects == null) {
			projects = new EObjectContainmentEList<Resource>(Resource.class, this, BenchmarkPackage.BENCHMARK__PROJECTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Discovery> getDiscoveries() {
		if (discoveries == null) {
			discoveries = new EObjectContainmentEList<Discovery>(Discovery.class, this, BenchmarkPackage.BENCHMARK__DISCOVERIES);
		}
		return discoveries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BenchmarkPackage.BENCHMARK__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case BenchmarkPackage.BENCHMARK__DISCOVERIES:
				return ((InternalEList<?>)getDiscoveries()).basicRemove(otherEnd, msgs);
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
			case BenchmarkPackage.BENCHMARK__JVM_MAX_HEAP_IN_MI_B:
				return getJvmMaxHeapInMiB();
			case BenchmarkPackage.BENCHMARK__PROCESSOR_NAME:
				return getProcessorName();
			case BenchmarkPackage.BENCHMARK__PROCESSOR_DESCRIPTION:
				return getProcessorDescription();
			case BenchmarkPackage.BENCHMARK__PROCESSOR_COUNT:
				return getProcessorCount();
			case BenchmarkPackage.BENCHMARK__PROCESSOR_CACHE_SIZE:
				return getProcessorCacheSize();
			case BenchmarkPackage.BENCHMARK__SYSTEM_MEMORY:
				return getSystemMemory();
			case BenchmarkPackage.BENCHMARK__OS_NAME:
				return getOsName();
			case BenchmarkPackage.BENCHMARK__OS_VERSION:
				return getOsVersion();
			case BenchmarkPackage.BENCHMARK__OS_ARCHITECTURE:
				return getOsArchitecture();
			case BenchmarkPackage.BENCHMARK__PROJECTS:
				return getProjects();
			case BenchmarkPackage.BENCHMARK__DISCOVERIES:
				return getDiscoveries();
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
			case BenchmarkPackage.BENCHMARK__JVM_MAX_HEAP_IN_MI_B:
				setJvmMaxHeapInMiB((Long)newValue);
				return;
			case BenchmarkPackage.BENCHMARK__PROCESSOR_NAME:
				setProcessorName((String)newValue);
				return;
			case BenchmarkPackage.BENCHMARK__PROCESSOR_DESCRIPTION:
				setProcessorDescription((String)newValue);
				return;
			case BenchmarkPackage.BENCHMARK__PROCESSOR_COUNT:
				setProcessorCount((Integer)newValue);
				return;
			case BenchmarkPackage.BENCHMARK__PROCESSOR_CACHE_SIZE:
				setProcessorCacheSize((String)newValue);
				return;
			case BenchmarkPackage.BENCHMARK__SYSTEM_MEMORY:
				setSystemMemory((String)newValue);
				return;
			case BenchmarkPackage.BENCHMARK__OS_NAME:
				setOsName((String)newValue);
				return;
			case BenchmarkPackage.BENCHMARK__OS_VERSION:
				setOsVersion((String)newValue);
				return;
			case BenchmarkPackage.BENCHMARK__OS_ARCHITECTURE:
				setOsArchitecture((String)newValue);
				return;
			case BenchmarkPackage.BENCHMARK__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Resource>)newValue);
				return;
			case BenchmarkPackage.BENCHMARK__DISCOVERIES:
				getDiscoveries().clear();
				getDiscoveries().addAll((Collection<? extends Discovery>)newValue);
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
			case BenchmarkPackage.BENCHMARK__JVM_MAX_HEAP_IN_MI_B:
				setJvmMaxHeapInMiB(JVM_MAX_HEAP_IN_MI_B_EDEFAULT);
				return;
			case BenchmarkPackage.BENCHMARK__PROCESSOR_NAME:
				setProcessorName(PROCESSOR_NAME_EDEFAULT);
				return;
			case BenchmarkPackage.BENCHMARK__PROCESSOR_DESCRIPTION:
				setProcessorDescription(PROCESSOR_DESCRIPTION_EDEFAULT);
				return;
			case BenchmarkPackage.BENCHMARK__PROCESSOR_COUNT:
				setProcessorCount(PROCESSOR_COUNT_EDEFAULT);
				return;
			case BenchmarkPackage.BENCHMARK__PROCESSOR_CACHE_SIZE:
				setProcessorCacheSize(PROCESSOR_CACHE_SIZE_EDEFAULT);
				return;
			case BenchmarkPackage.BENCHMARK__SYSTEM_MEMORY:
				setSystemMemory(SYSTEM_MEMORY_EDEFAULT);
				return;
			case BenchmarkPackage.BENCHMARK__OS_NAME:
				setOsName(OS_NAME_EDEFAULT);
				return;
			case BenchmarkPackage.BENCHMARK__OS_VERSION:
				setOsVersion(OS_VERSION_EDEFAULT);
				return;
			case BenchmarkPackage.BENCHMARK__OS_ARCHITECTURE:
				setOsArchitecture(OS_ARCHITECTURE_EDEFAULT);
				return;
			case BenchmarkPackage.BENCHMARK__PROJECTS:
				getProjects().clear();
				return;
			case BenchmarkPackage.BENCHMARK__DISCOVERIES:
				getDiscoveries().clear();
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
			case BenchmarkPackage.BENCHMARK__JVM_MAX_HEAP_IN_MI_B:
				return jvmMaxHeapInMiB != JVM_MAX_HEAP_IN_MI_B_EDEFAULT;
			case BenchmarkPackage.BENCHMARK__PROCESSOR_NAME:
				return PROCESSOR_NAME_EDEFAULT == null ? processorName != null : !PROCESSOR_NAME_EDEFAULT.equals(processorName);
			case BenchmarkPackage.BENCHMARK__PROCESSOR_DESCRIPTION:
				return PROCESSOR_DESCRIPTION_EDEFAULT == null ? processorDescription != null : !PROCESSOR_DESCRIPTION_EDEFAULT.equals(processorDescription);
			case BenchmarkPackage.BENCHMARK__PROCESSOR_COUNT:
				return processorCount != PROCESSOR_COUNT_EDEFAULT;
			case BenchmarkPackage.BENCHMARK__PROCESSOR_CACHE_SIZE:
				return PROCESSOR_CACHE_SIZE_EDEFAULT == null ? processorCacheSize != null : !PROCESSOR_CACHE_SIZE_EDEFAULT.equals(processorCacheSize);
			case BenchmarkPackage.BENCHMARK__SYSTEM_MEMORY:
				return SYSTEM_MEMORY_EDEFAULT == null ? systemMemory != null : !SYSTEM_MEMORY_EDEFAULT.equals(systemMemory);
			case BenchmarkPackage.BENCHMARK__OS_NAME:
				return OS_NAME_EDEFAULT == null ? osName != null : !OS_NAME_EDEFAULT.equals(osName);
			case BenchmarkPackage.BENCHMARK__OS_VERSION:
				return OS_VERSION_EDEFAULT == null ? osVersion != null : !OS_VERSION_EDEFAULT.equals(osVersion);
			case BenchmarkPackage.BENCHMARK__OS_ARCHITECTURE:
				return OS_ARCHITECTURE_EDEFAULT == null ? osArchitecture != null : !OS_ARCHITECTURE_EDEFAULT.equals(osArchitecture);
			case BenchmarkPackage.BENCHMARK__PROJECTS:
				return projects != null && !projects.isEmpty();
			case BenchmarkPackage.BENCHMARK__DISCOVERIES:
				return discoveries != null && !discoveries.isEmpty();
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
		result.append(" (jvmMaxHeapInMiB: ");
		result.append(jvmMaxHeapInMiB);
		result.append(", processorName: ");
		result.append(processorName);
		result.append(", processorDescription: ");
		result.append(processorDescription);
		result.append(", processorCount: ");
		result.append(processorCount);
		result.append(", processorCacheSize: ");
		result.append(processorCacheSize);
		result.append(", systemMemory: ");
		result.append(systemMemory);
		result.append(", osName: ");
		result.append(osName);
		result.append(", osVersion: ");
		result.append(osVersion);
		result.append(", osArchitecture: ");
		result.append(osArchitecture);
		result.append(')');
		return result.toString();
	}

} //BenchmarkImpl
