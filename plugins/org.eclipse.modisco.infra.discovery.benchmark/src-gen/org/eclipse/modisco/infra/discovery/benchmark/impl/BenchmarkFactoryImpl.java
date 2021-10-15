/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
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
package org.eclipse.modisco.infra.discovery.benchmark.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.modisco.infra.discovery.benchmark.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BenchmarkFactoryImpl extends EFactoryImpl implements BenchmarkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BenchmarkFactory init() {
		try {
			BenchmarkFactory theBenchmarkFactory = (BenchmarkFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/Benchmark/0.9.0/benchmark"); 
			if (theBenchmarkFactory != null) {
				return theBenchmarkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BenchmarkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenchmarkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BenchmarkPackage.DISCOVERY: return createDiscovery();
			case BenchmarkPackage.PROJECT: return createProject();
			case BenchmarkPackage.FILE: return createFile();
			case BenchmarkPackage.MULTI_PROJECT_BENCHMARK: return createMultiProjectBenchmark();
			case BenchmarkPackage.MULTI_DISCOVERY_BENCHMARK: return createMultiDiscoveryBenchmark();
			case BenchmarkPackage.PROJECT_DISCOVERY: return createProjectDiscovery();
			case BenchmarkPackage.DISCOVERED_PROJECT: return createDiscoveredProject();
			case BenchmarkPackage.AVERAGED_MULTI_DISCOVERY_BENCHMARK: return createAveragedMultiDiscoveryBenchmark();
			case BenchmarkPackage.AVERAGED_PROJECT_DISCOVERY: return createAveragedProjectDiscovery();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discovery createDiscovery() {
		DiscoveryImpl discovery = new DiscoveryImpl();
		return discovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiProjectBenchmark createMultiProjectBenchmark() {
		MultiProjectBenchmarkImpl multiProjectBenchmark = new MultiProjectBenchmarkImpl();
		return multiProjectBenchmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiDiscoveryBenchmark createMultiDiscoveryBenchmark() {
		MultiDiscoveryBenchmarkImpl multiDiscoveryBenchmark = new MultiDiscoveryBenchmarkImpl();
		return multiDiscoveryBenchmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectDiscovery createProjectDiscovery() {
		ProjectDiscoveryImpl projectDiscovery = new ProjectDiscoveryImpl();
		return projectDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoveredProject createDiscoveredProject() {
		DiscoveredProjectImpl discoveredProject = new DiscoveredProjectImpl();
		return discoveredProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AveragedMultiDiscoveryBenchmark createAveragedMultiDiscoveryBenchmark() {
		AveragedMultiDiscoveryBenchmarkImpl averagedMultiDiscoveryBenchmark = new AveragedMultiDiscoveryBenchmarkImpl();
		return averagedMultiDiscoveryBenchmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AveragedProjectDiscovery createAveragedProjectDiscovery() {
		AveragedProjectDiscoveryImpl averagedProjectDiscovery = new AveragedProjectDiscoveryImpl();
		return averagedProjectDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenchmarkPackage getBenchmarkPackage() {
		return (BenchmarkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BenchmarkPackage getPackage() {
		return BenchmarkPackage.eINSTANCE;
	}

} //BenchmarkFactoryImpl
