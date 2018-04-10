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
package org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage
 * @generated
 */
public interface BenchmarkFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012, 2015 INRIA and Mia-Software.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n     Guillaume Doux (INRIA) - Initial API and implementation\r\n     Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage\r\n     Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer\r\n";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BenchmarkFactory eINSTANCE = org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Memory Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Measurement</em>'.
	 * @generated
	 */
	MemoryMeasurement createMemoryMeasurement();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Type</em>'.
	 * @generated
	 */
	EventType createEventType();

	/**
	 * Returns a new object of class '<em>Begin Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Begin Event</em>'.
	 * @generated
	 */
	BeginEvent createBeginEvent();

	/**
	 * Returns a new object of class '<em>End Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Event</em>'.
	 * @generated
	 */
	EndEvent createEndEvent();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Benchmark</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Benchmark</em>'.
	 * @generated
	 */
	Benchmark createBenchmark();

	/**
	 * Returns a new object of class '<em>Discovery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discovery</em>'.
	 * @generated
	 */
	Discovery createDiscovery();

	/**
	 * Returns a new object of class '<em>Discovery Iteration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discovery Iteration</em>'.
	 * @generated
	 */
	DiscoveryIteration createDiscoveryIteration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BenchmarkPackage getBenchmarkPackage();

} //BenchmarkFactory
