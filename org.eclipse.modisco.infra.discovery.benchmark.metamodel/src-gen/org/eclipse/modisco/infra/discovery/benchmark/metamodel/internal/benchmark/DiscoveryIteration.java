/**
 * Copyright (c) 2012, 2015 INRIA and Mia-Software and others.
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
package org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discovery Iteration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getDiscoveryDate <em>Discovery Date</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getDiscoveryTimeInSeconds <em>Discovery Time In Seconds</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getSaveTimeInSeconds <em>Save Time In Seconds</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getMaxUsedMemoryInBytes <em>Max Used Memory In Bytes</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getDiscoveryErrors <em>Discovery Errors</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getEvents <em>Events</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getMemoryMeasurements <em>Memory Measurements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscoveryIteration()
 * @model
 * @generated
 */
public interface DiscoveryIteration extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012, 2015 INRIA and Mia-Software.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v2.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v20.html\r\n\r\nContributors:\r\n     Guillaume Doux (INRIA) - Initial API and implementation\r\n     Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage\r\n     Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer\r\n";

	/**
	 * Returns the value of the '<em><b>Discovery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discovery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovery Date</em>' attribute.
	 * @see #setDiscoveryDate(Date)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscoveryIteration_DiscoveryDate()
	 * @model
	 * @generated
	 */
	Date getDiscoveryDate();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getDiscoveryDate <em>Discovery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovery Date</em>' attribute.
	 * @see #getDiscoveryDate()
	 * @generated
	 */
	void setDiscoveryDate(Date value);

	/**
	 * Returns the value of the '<em><b>Discovery Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discovery Time In Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovery Time In Seconds</em>' attribute.
	 * @see #setDiscoveryTimeInSeconds(double)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscoveryIteration_DiscoveryTimeInSeconds()
	 * @model
	 * @generated
	 */
	double getDiscoveryTimeInSeconds();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getDiscoveryTimeInSeconds <em>Discovery Time In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovery Time In Seconds</em>' attribute.
	 * @see #getDiscoveryTimeInSeconds()
	 * @generated
	 */
	void setDiscoveryTimeInSeconds(double value);

	/**
	 * Returns the value of the '<em><b>Save Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Save Time In Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Save Time In Seconds</em>' attribute.
	 * @see #setSaveTimeInSeconds(double)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscoveryIteration_SaveTimeInSeconds()
	 * @model
	 * @generated
	 */
	double getSaveTimeInSeconds();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getSaveTimeInSeconds <em>Save Time In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Save Time In Seconds</em>' attribute.
	 * @see #getSaveTimeInSeconds()
	 * @generated
	 */
	void setSaveTimeInSeconds(double value);

	/**
	 * Returns the value of the '<em><b>Max Used Memory In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Used Memory In Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Used Memory In Bytes</em>' attribute.
	 * @see #setMaxUsedMemoryInBytes(long)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscoveryIteration_MaxUsedMemoryInBytes()
	 * @model
	 * @generated
	 */
	long getMaxUsedMemoryInBytes();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getMaxUsedMemoryInBytes <em>Max Used Memory In Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Used Memory In Bytes</em>' attribute.
	 * @see #getMaxUsedMemoryInBytes()
	 * @generated
	 */
	void setMaxUsedMemoryInBytes(long value);

	/**
	 * Returns the value of the '<em><b>Discovery Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discovery Errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovery Errors</em>' attribute.
	 * @see #setDiscoveryErrors(String)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscoveryIteration_DiscoveryErrors()
	 * @model
	 * @generated
	 */
	String getDiscoveryErrors();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getDiscoveryErrors <em>Discovery Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovery Errors</em>' attribute.
	 * @see #getDiscoveryErrors()
	 * @generated
	 */
	void setDiscoveryErrors(String value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscoveryIteration_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Memory Measurements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Measurements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Measurements</em>' reference list.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#getDiscoveryIteration_MemoryMeasurements()
	 * @model derived="true"
	 * @generated
	 */
	EList<Event> getMemoryMeasurements();

} // DiscoveryIteration
