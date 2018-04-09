/**
 * Copyright (c) 2012, 2015 INRIA and Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Guillaume Doux (INRIA) - Initial API and implementation
 *      Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage
 *      Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer
 */
package org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Event;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discovery Iteration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryIterationImpl#getDiscoveryDate <em>Discovery Date</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryIterationImpl#getDiscoveryTimeInSeconds <em>Discovery Time In Seconds</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryIterationImpl#getSaveTimeInSeconds <em>Save Time In Seconds</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryIterationImpl#getMaxUsedMemoryInBytes <em>Max Used Memory In Bytes</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryIterationImpl#getDiscoveryErrors <em>Discovery Errors</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryIterationImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryIterationImpl#getMemoryMeasurements <em>Memory Measurements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscoveryIterationImpl extends EObjectImpl implements DiscoveryIteration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2012, 2015 INRIA and Mia-Software.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n     Guillaume Doux (INRIA) - Initial API and implementation\r\n     Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage\r\n     Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer\r\n";

	/**
	 * The default value of the '{@link #getDiscoveryDate() <em>Discovery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DISCOVERY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscoveryDate() <em>Discovery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryDate()
	 * @generated
	 * @ordered
	 */
	protected Date discoveryDate = DISCOVERY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscoveryTimeInSeconds() <em>Discovery Time In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryTimeInSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final double DISCOVERY_TIME_IN_SECONDS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDiscoveryTimeInSeconds() <em>Discovery Time In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryTimeInSeconds()
	 * @generated
	 * @ordered
	 */
	protected double discoveryTimeInSeconds = DISCOVERY_TIME_IN_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSaveTimeInSeconds() <em>Save Time In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveTimeInSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final double SAVE_TIME_IN_SECONDS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSaveTimeInSeconds() <em>Save Time In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveTimeInSeconds()
	 * @generated
	 * @ordered
	 */
	protected double saveTimeInSeconds = SAVE_TIME_IN_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxUsedMemoryInBytes() <em>Max Used Memory In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUsedMemoryInBytes()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_USED_MEMORY_IN_BYTES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxUsedMemoryInBytes() <em>Max Used Memory In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUsedMemoryInBytes()
	 * @generated
	 * @ordered
	 */
	protected long maxUsedMemoryInBytes = MAX_USED_MEMORY_IN_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscoveryErrors() <em>Discovery Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryErrors()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCOVERY_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscoveryErrors() <em>Discovery Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryErrors()
	 * @generated
	 * @ordered
	 */
	protected String discoveryErrors = DISCOVERY_ERRORS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getMemoryMeasurements() <em>Memory Measurements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMeasurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> memoryMeasurements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscoveryIterationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BenchmarkPackage.Literals.DISCOVERY_ITERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDiscoveryDate() {
		return discoveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoveryDate(Date newDiscoveryDate) {
		Date oldDiscoveryDate = discoveryDate;
		discoveryDate = newDiscoveryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY_ITERATION__DISCOVERY_DATE, oldDiscoveryDate, discoveryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiscoveryTimeInSeconds() {
		return discoveryTimeInSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoveryTimeInSeconds(double newDiscoveryTimeInSeconds) {
		double oldDiscoveryTimeInSeconds = discoveryTimeInSeconds;
		discoveryTimeInSeconds = newDiscoveryTimeInSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY_ITERATION__DISCOVERY_TIME_IN_SECONDS, oldDiscoveryTimeInSeconds, discoveryTimeInSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSaveTimeInSeconds() {
		return saveTimeInSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaveTimeInSeconds(double newSaveTimeInSeconds) {
		double oldSaveTimeInSeconds = saveTimeInSeconds;
		saveTimeInSeconds = newSaveTimeInSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY_ITERATION__SAVE_TIME_IN_SECONDS, oldSaveTimeInSeconds, saveTimeInSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxUsedMemoryInBytes() {
		return maxUsedMemoryInBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxUsedMemoryInBytes(long newMaxUsedMemoryInBytes) {
		long oldMaxUsedMemoryInBytes = maxUsedMemoryInBytes;
		maxUsedMemoryInBytes = newMaxUsedMemoryInBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY_ITERATION__MAX_USED_MEMORY_IN_BYTES, oldMaxUsedMemoryInBytes, maxUsedMemoryInBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscoveryErrors() {
		return discoveryErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoveryErrors(String newDiscoveryErrors) {
		String oldDiscoveryErrors = discoveryErrors;
		discoveryErrors = newDiscoveryErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.DISCOVERY_ITERATION__DISCOVERY_ERRORS, oldDiscoveryErrors, discoveryErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, BenchmarkPackage.DISCOVERY_ITERATION__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getMemoryMeasurements() {
		if (memoryMeasurements == null) {
			memoryMeasurements = new EObjectResolvingEList<Event>(Event.class, this, BenchmarkPackage.DISCOVERY_ITERATION__MEMORY_MEASUREMENTS);
		}
		return memoryMeasurements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BenchmarkPackage.DISCOVERY_ITERATION__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
			case BenchmarkPackage.DISCOVERY_ITERATION__DISCOVERY_DATE:
				return getDiscoveryDate();
			case BenchmarkPackage.DISCOVERY_ITERATION__DISCOVERY_TIME_IN_SECONDS:
				return getDiscoveryTimeInSeconds();
			case BenchmarkPackage.DISCOVERY_ITERATION__SAVE_TIME_IN_SECONDS:
				return getSaveTimeInSeconds();
			case BenchmarkPackage.DISCOVERY_ITERATION__MAX_USED_MEMORY_IN_BYTES:
				return getMaxUsedMemoryInBytes();
			case BenchmarkPackage.DISCOVERY_ITERATION__DISCOVERY_ERRORS:
				return getDiscoveryErrors();
			case BenchmarkPackage.DISCOVERY_ITERATION__EVENTS:
				return getEvents();
			case BenchmarkPackage.DISCOVERY_ITERATION__MEMORY_MEASUREMENTS:
				return getMemoryMeasurements();
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
			case BenchmarkPackage.DISCOVERY_ITERATION__DISCOVERY_DATE:
				setDiscoveryDate((Date)newValue);
				return;
			case BenchmarkPackage.DISCOVERY_ITERATION__DISCOVERY_TIME_IN_SECONDS:
				setDiscoveryTimeInSeconds((Double)newValue);
				return;
			case BenchmarkPackage.DISCOVERY_ITERATION__SAVE_TIME_IN_SECONDS:
				setSaveTimeInSeconds((Double)newValue);
				return;
			case BenchmarkPackage.DISCOVERY_ITERATION__MAX_USED_MEMORY_IN_BYTES:
				setMaxUsedMemoryInBytes((Long)newValue);
				return;
			case BenchmarkPackage.DISCOVERY_ITERATION__DISCOVERY_ERRORS:
				setDiscoveryErrors((String)newValue);
				return;
			case BenchmarkPackage.DISCOVERY_ITERATION__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case BenchmarkPackage.DISCOVERY_ITERATION__MEMORY_MEASUREMENTS:
				getMemoryMeasurements().clear();
				getMemoryMeasurements().addAll((Collection<? extends Event>)newValue);
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
			case BenchmarkPackage.DISCOVERY_ITERATION__DISCOVERY_DATE:
				setDiscoveryDate(DISCOVERY_DATE_EDEFAULT);
				return;
			case BenchmarkPackage.DISCOVERY_ITERATION__DISCOVERY_TIME_IN_SECONDS:
				setDiscoveryTimeInSeconds(DISCOVERY_TIME_IN_SECONDS_EDEFAULT);
				return;
			case BenchmarkPackage.DISCOVERY_ITERATION__SAVE_TIME_IN_SECONDS:
				setSaveTimeInSeconds(SAVE_TIME_IN_SECONDS_EDEFAULT);
				return;
			case BenchmarkPackage.DISCOVERY_ITERATION__MAX_USED_MEMORY_IN_BYTES:
				setMaxUsedMemoryInBytes(MAX_USED_MEMORY_IN_BYTES_EDEFAULT);
				return;
			case BenchmarkPackage.DISCOVERY_ITERATION__DISCOVERY_ERRORS:
				setDiscoveryErrors(DISCOVERY_ERRORS_EDEFAULT);
				return;
			case BenchmarkPackage.DISCOVERY_ITERATION__EVENTS:
				getEvents().clear();
				return;
			case BenchmarkPackage.DISCOVERY_ITERATION__MEMORY_MEASUREMENTS:
				getMemoryMeasurements().clear();
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
			case BenchmarkPackage.DISCOVERY_ITERATION__DISCOVERY_DATE:
				return DISCOVERY_DATE_EDEFAULT == null ? discoveryDate != null : !DISCOVERY_DATE_EDEFAULT.equals(discoveryDate);
			case BenchmarkPackage.DISCOVERY_ITERATION__DISCOVERY_TIME_IN_SECONDS:
				return discoveryTimeInSeconds != DISCOVERY_TIME_IN_SECONDS_EDEFAULT;
			case BenchmarkPackage.DISCOVERY_ITERATION__SAVE_TIME_IN_SECONDS:
				return saveTimeInSeconds != SAVE_TIME_IN_SECONDS_EDEFAULT;
			case BenchmarkPackage.DISCOVERY_ITERATION__MAX_USED_MEMORY_IN_BYTES:
				return maxUsedMemoryInBytes != MAX_USED_MEMORY_IN_BYTES_EDEFAULT;
			case BenchmarkPackage.DISCOVERY_ITERATION__DISCOVERY_ERRORS:
				return DISCOVERY_ERRORS_EDEFAULT == null ? discoveryErrors != null : !DISCOVERY_ERRORS_EDEFAULT.equals(discoveryErrors);
			case BenchmarkPackage.DISCOVERY_ITERATION__EVENTS:
				return events != null && !events.isEmpty();
			case BenchmarkPackage.DISCOVERY_ITERATION__MEMORY_MEASUREMENTS:
				return memoryMeasurements != null && !memoryMeasurements.isEmpty();
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
		result.append(" (discoveryDate: ");
		result.append(discoveryDate);
		result.append(", discoveryTimeInSeconds: ");
		result.append(discoveryTimeInSeconds);
		result.append(", saveTimeInSeconds: ");
		result.append(saveTimeInSeconds);
		result.append(", maxUsedMemoryInBytes: ");
		result.append(maxUsedMemoryInBytes);
		result.append(", discoveryErrors: ");
		result.append(discoveryErrors);
		result.append(')');
		return result.toString();
	}

} //DiscoveryIterationImpl
