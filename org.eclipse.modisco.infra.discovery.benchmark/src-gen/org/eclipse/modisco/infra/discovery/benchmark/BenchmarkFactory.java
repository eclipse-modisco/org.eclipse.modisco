/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - Bug 341752 - Extract report metamodel from the benchmark plug-in to avoid Acceleo troubles.
 *     Nicolas Bros (Mia-Software)
 * 
 */
package org.eclipse.modisco.infra.discovery.benchmark;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage
 * @generated
 */
public interface BenchmarkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BenchmarkFactory eINSTANCE = org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Discovery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discovery</em>'.
	 * @generated
	 */
	Discovery createDiscovery();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Multi Project Benchmark</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Project Benchmark</em>'.
	 * @generated
	 */
	MultiProjectBenchmark createMultiProjectBenchmark();

	/**
	 * Returns a new object of class '<em>Multi Discovery Benchmark</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Discovery Benchmark</em>'.
	 * @generated
	 */
	MultiDiscoveryBenchmark createMultiDiscoveryBenchmark();

	/**
	 * Returns a new object of class '<em>Project Discovery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Discovery</em>'.
	 * @generated
	 */
	ProjectDiscovery createProjectDiscovery();

	/**
	 * Returns a new object of class '<em>Discovered Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discovered Project</em>'.
	 * @generated
	 */
	DiscoveredProject createDiscoveredProject();

	/**
	 * Returns a new object of class '<em>Averaged Multi Discovery Benchmark</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Averaged Multi Discovery Benchmark</em>'.
	 * @generated
	 */
	AveragedMultiDiscoveryBenchmark createAveragedMultiDiscoveryBenchmark();

	/**
	 * Returns a new object of class '<em>Averaged Project Discovery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Averaged Project Discovery</em>'.
	 * @generated
	 */
	AveragedProjectDiscovery createAveragedProjectDiscovery();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BenchmarkPackage getBenchmarkPackage();

} //BenchmarkFactory
