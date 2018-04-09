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
 *     Nicolas Bros (Mia-Software)
 * 
 */
package org.eclipse.modisco.infra.discovery.benchmark;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkFactory
 * @model kind="package"
 * @generated
 */
public interface BenchmarkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "benchmark";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/Benchmark/0.9.0/benchmark";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "benchmark";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BenchmarkPackage eINSTANCE = org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkImpl <em>Benchmark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getBenchmark()
	 * @generated
	 */
	int BENCHMARK = 0;

	/**
	 * The feature id for the '<em><b>Jvm Max Heap In Mi B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCHMARK__JVM_MAX_HEAP_IN_MI_B = 0;

	/**
	 * The feature id for the '<em><b>Processor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCHMARK__PROCESSOR_NAME = 1;

	/**
	 * The feature id for the '<em><b>Processor Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCHMARK__PROCESSOR_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Processor Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCHMARK__PROCESSOR_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Processor Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCHMARK__PROCESSOR_CACHE_SIZE = 4;

	/**
	 * The feature id for the '<em><b>System Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCHMARK__SYSTEM_MEMORY = 5;

	/**
	 * The feature id for the '<em><b>Os Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCHMARK__OS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCHMARK__OS_VERSION = 7;

	/**
	 * The feature id for the '<em><b>Os Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCHMARK__OS_ARCHITECTURE = 8;

	/**
	 * The number of structural features of the '<em>Benchmark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCHMARK_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.DiscoveryImpl <em>Discovery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.DiscoveryImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getDiscovery()
	 * @generated
	 */
	int DISCOVERY = 1;

	/**
	 * The feature id for the '<em><b>Dicovery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__DICOVERY_DATE = 0;

	/**
	 * The feature id for the '<em><b>Algorithm Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__ALGORITHM_VARIANT = 1;

	/**
	 * The feature id for the '<em><b>Discoverer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__DISCOVERER_ID = 2;

	/**
	 * The feature id for the '<em><b>Discoverer Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__DISCOVERER_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Save Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__SAVE_TIME_IN_SECONDS = 4;

	/**
	 * The feature id for the '<em><b>Total Execution Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__TOTAL_EXECUTION_TIME_IN_SECONDS = 5;

	/**
	 * The feature id for the '<em><b>Meta Model Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__META_MODEL_VARIANT = 6;

	/**
	 * The feature id for the '<em><b>Max Used Memory In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__MAX_USED_MEMORY_IN_BYTES = 7;

	/**
	 * The feature id for the '<em><b>Number Of Model Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__NUMBER_OF_MODEL_ELEMENTS = 8;

	/**
	 * The feature id for the '<em><b>Xmi Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__XMI_SIZE_IN_BYTES = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__NAME = 10;

	/**
	 * The feature id for the '<em><b>Discovery Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__DISCOVERY_ERROR = 11;

	/**
	 * The number of structural features of the '<em>Discovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.ProjectImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Total Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TOTAL_LINES = 1;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FILES = 2;

	/**
	 * The feature id for the '<em><b>Average File Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__AVERAGE_FILE_SIZE_IN_BYTES = 3;

	/**
	 * The feature id for the '<em><b>Average Lines Per File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__AVERAGE_LINES_PER_FILE = 4;

	/**
	 * The feature id for the '<em><b>Total Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TOTAL_SIZE_IN_BYTES = 5;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.FileImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 3;

	/**
	 * The feature id for the '<em><b>Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SIZE_IN_BYTES = 0;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__LINES = 1;

	/**
	 * The feature id for the '<em><b>Filepath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILEPATH = 2;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.MultiProjectBenchmarkImpl <em>Multi Project Benchmark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.MultiProjectBenchmarkImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getMultiProjectBenchmark()
	 * @generated
	 */
	int MULTI_PROJECT_BENCHMARK = 4;

	/**
	 * The feature id for the '<em><b>Jvm Max Heap In Mi B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROJECT_BENCHMARK__JVM_MAX_HEAP_IN_MI_B = BENCHMARK__JVM_MAX_HEAP_IN_MI_B;

	/**
	 * The feature id for the '<em><b>Processor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROJECT_BENCHMARK__PROCESSOR_NAME = BENCHMARK__PROCESSOR_NAME;

	/**
	 * The feature id for the '<em><b>Processor Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROJECT_BENCHMARK__PROCESSOR_DESCRIPTION = BENCHMARK__PROCESSOR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Processor Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROJECT_BENCHMARK__PROCESSOR_COUNT = BENCHMARK__PROCESSOR_COUNT;

	/**
	 * The feature id for the '<em><b>Processor Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROJECT_BENCHMARK__PROCESSOR_CACHE_SIZE = BENCHMARK__PROCESSOR_CACHE_SIZE;

	/**
	 * The feature id for the '<em><b>System Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROJECT_BENCHMARK__SYSTEM_MEMORY = BENCHMARK__SYSTEM_MEMORY;

	/**
	 * The feature id for the '<em><b>Os Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROJECT_BENCHMARK__OS_NAME = BENCHMARK__OS_NAME;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROJECT_BENCHMARK__OS_VERSION = BENCHMARK__OS_VERSION;

	/**
	 * The feature id for the '<em><b>Os Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROJECT_BENCHMARK__OS_ARCHITECTURE = BENCHMARK__OS_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROJECT_BENCHMARK__PROJECTS = BENCHMARK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Project Benchmark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PROJECT_BENCHMARK_FEATURE_COUNT = BENCHMARK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.MultiDiscoveryBenchmarkImpl <em>Multi Discovery Benchmark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.MultiDiscoveryBenchmarkImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getMultiDiscoveryBenchmark()
	 * @generated
	 */
	int MULTI_DISCOVERY_BENCHMARK = 5;

	/**
	 * The feature id for the '<em><b>Jvm Max Heap In Mi B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DISCOVERY_BENCHMARK__JVM_MAX_HEAP_IN_MI_B = BENCHMARK__JVM_MAX_HEAP_IN_MI_B;

	/**
	 * The feature id for the '<em><b>Processor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DISCOVERY_BENCHMARK__PROCESSOR_NAME = BENCHMARK__PROCESSOR_NAME;

	/**
	 * The feature id for the '<em><b>Processor Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DISCOVERY_BENCHMARK__PROCESSOR_DESCRIPTION = BENCHMARK__PROCESSOR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Processor Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DISCOVERY_BENCHMARK__PROCESSOR_COUNT = BENCHMARK__PROCESSOR_COUNT;

	/**
	 * The feature id for the '<em><b>Processor Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DISCOVERY_BENCHMARK__PROCESSOR_CACHE_SIZE = BENCHMARK__PROCESSOR_CACHE_SIZE;

	/**
	 * The feature id for the '<em><b>System Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DISCOVERY_BENCHMARK__SYSTEM_MEMORY = BENCHMARK__SYSTEM_MEMORY;

	/**
	 * The feature id for the '<em><b>Os Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DISCOVERY_BENCHMARK__OS_NAME = BENCHMARK__OS_NAME;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DISCOVERY_BENCHMARK__OS_VERSION = BENCHMARK__OS_VERSION;

	/**
	 * The feature id for the '<em><b>Os Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DISCOVERY_BENCHMARK__OS_ARCHITECTURE = BENCHMARK__OS_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Discoveries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DISCOVERY_BENCHMARK__DISCOVERIES = BENCHMARK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Discovery Benchmark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DISCOVERY_BENCHMARK_FEATURE_COUNT = BENCHMARK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.ProjectDiscoveryImpl <em>Project Discovery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.ProjectDiscoveryImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getProjectDiscovery()
	 * @generated
	 */
	int PROJECT_DISCOVERY = 6;

	/**
	 * The feature id for the '<em><b>Dicovery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DISCOVERY__DICOVERY_DATE = DISCOVERY__DICOVERY_DATE;

	/**
	 * The feature id for the '<em><b>Algorithm Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DISCOVERY__ALGORITHM_VARIANT = DISCOVERY__ALGORITHM_VARIANT;

	/**
	 * The feature id for the '<em><b>Discoverer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DISCOVERY__DISCOVERER_ID = DISCOVERY__DISCOVERER_ID;

	/**
	 * The feature id for the '<em><b>Discoverer Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DISCOVERY__DISCOVERER_CLASS_NAME = DISCOVERY__DISCOVERER_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Save Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DISCOVERY__SAVE_TIME_IN_SECONDS = DISCOVERY__SAVE_TIME_IN_SECONDS;

	/**
	 * The feature id for the '<em><b>Total Execution Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DISCOVERY__TOTAL_EXECUTION_TIME_IN_SECONDS = DISCOVERY__TOTAL_EXECUTION_TIME_IN_SECONDS;

	/**
	 * The feature id for the '<em><b>Meta Model Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DISCOVERY__META_MODEL_VARIANT = DISCOVERY__META_MODEL_VARIANT;

	/**
	 * The feature id for the '<em><b>Max Used Memory In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DISCOVERY__MAX_USED_MEMORY_IN_BYTES = DISCOVERY__MAX_USED_MEMORY_IN_BYTES;

	/**
	 * The feature id for the '<em><b>Number Of Model Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DISCOVERY__NUMBER_OF_MODEL_ELEMENTS = DISCOVERY__NUMBER_OF_MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Xmi Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DISCOVERY__XMI_SIZE_IN_BYTES = DISCOVERY__XMI_SIZE_IN_BYTES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DISCOVERY__NAME = DISCOVERY__NAME;

	/**
	 * The feature id for the '<em><b>Discovery Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DISCOVERY__DISCOVERY_ERROR = DISCOVERY__DISCOVERY_ERROR;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DISCOVERY__PROJECTS = DISCOVERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Project Discovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_DISCOVERY_FEATURE_COUNT = DISCOVERY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.DiscoveredProjectImpl <em>Discovered Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.DiscoveredProjectImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getDiscoveredProject()
	 * @generated
	 */
	int DISCOVERED_PROJECT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERED_PROJECT__NAME = PROJECT__NAME;

	/**
	 * The feature id for the '<em><b>Total Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERED_PROJECT__TOTAL_LINES = PROJECT__TOTAL_LINES;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERED_PROJECT__FILES = PROJECT__FILES;

	/**
	 * The feature id for the '<em><b>Average File Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERED_PROJECT__AVERAGE_FILE_SIZE_IN_BYTES = PROJECT__AVERAGE_FILE_SIZE_IN_BYTES;

	/**
	 * The feature id for the '<em><b>Average Lines Per File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERED_PROJECT__AVERAGE_LINES_PER_FILE = PROJECT__AVERAGE_LINES_PER_FILE;

	/**
	 * The feature id for the '<em><b>Total Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERED_PROJECT__TOTAL_SIZE_IN_BYTES = PROJECT__TOTAL_SIZE_IN_BYTES;

	/**
	 * The feature id for the '<em><b>Discoveries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERED_PROJECT__DISCOVERIES = PROJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discovered Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERED_PROJECT_FEATURE_COUNT = PROJECT_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.AveragedMultiDiscoveryBenchmarkImpl <em>Averaged Multi Discovery Benchmark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.AveragedMultiDiscoveryBenchmarkImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getAveragedMultiDiscoveryBenchmark()
	 * @generated
	 */
	int AVERAGED_MULTI_DISCOVERY_BENCHMARK = 8;

	/**
	 * The feature id for the '<em><b>Jvm Max Heap In Mi B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGED_MULTI_DISCOVERY_BENCHMARK__JVM_MAX_HEAP_IN_MI_B = BENCHMARK__JVM_MAX_HEAP_IN_MI_B;

	/**
	 * The feature id for the '<em><b>Processor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGED_MULTI_DISCOVERY_BENCHMARK__PROCESSOR_NAME = BENCHMARK__PROCESSOR_NAME;

	/**
	 * The feature id for the '<em><b>Processor Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGED_MULTI_DISCOVERY_BENCHMARK__PROCESSOR_DESCRIPTION = BENCHMARK__PROCESSOR_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Processor Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGED_MULTI_DISCOVERY_BENCHMARK__PROCESSOR_COUNT = BENCHMARK__PROCESSOR_COUNT;

	/**
	 * The feature id for the '<em><b>Processor Cache Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGED_MULTI_DISCOVERY_BENCHMARK__PROCESSOR_CACHE_SIZE = BENCHMARK__PROCESSOR_CACHE_SIZE;

	/**
	 * The feature id for the '<em><b>System Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGED_MULTI_DISCOVERY_BENCHMARK__SYSTEM_MEMORY = BENCHMARK__SYSTEM_MEMORY;

	/**
	 * The feature id for the '<em><b>Os Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGED_MULTI_DISCOVERY_BENCHMARK__OS_NAME = BENCHMARK__OS_NAME;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGED_MULTI_DISCOVERY_BENCHMARK__OS_VERSION = BENCHMARK__OS_VERSION;

	/**
	 * The feature id for the '<em><b>Os Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGED_MULTI_DISCOVERY_BENCHMARK__OS_ARCHITECTURE = BENCHMARK__OS_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Discoveries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGED_MULTI_DISCOVERY_BENCHMARK__DISCOVERIES = BENCHMARK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Averaged Multi Discovery Benchmark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGED_MULTI_DISCOVERY_BENCHMARK_FEATURE_COUNT = BENCHMARK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.AveragedProjectDiscoveryImpl <em>Averaged Project Discovery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.AveragedProjectDiscoveryImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getAveragedProjectDiscovery()
	 * @generated
	 */
	int AVERAGED_PROJECT_DISCOVERY = 9;

	/**
	 * The feature id for the '<em><b>Average Execution Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGED_PROJECT_DISCOVERY__AVERAGE_EXECUTION_TIME_IN_SECONDS = 0;

	/**
	 * The feature id for the '<em><b>Average Save Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGED_PROJECT_DISCOVERY__AVERAGE_SAVE_TIME_IN_SECONDS = 1;

	/**
	 * The feature id for the '<em><b>Execution Time Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGED_PROJECT_DISCOVERY__EXECUTION_TIME_STANDARD_DEVIATION = 2;

	/**
	 * The feature id for the '<em><b>Save Time Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGED_PROJECT_DISCOVERY__SAVE_TIME_STANDARD_DEVIATION = 3;

	/**
	 * The feature id for the '<em><b>Occurrences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGED_PROJECT_DISCOVERY__OCCURRENCES = 4;

	/**
	 * The number of structural features of the '<em>Averaged Project Discovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGED_PROJECT_DISCOVERY_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.Benchmark <em>Benchmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Benchmark</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Benchmark
	 * @generated
	 */
	EClass getBenchmark();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getJvmMaxHeapInMiB <em>Jvm Max Heap In Mi B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jvm Max Heap In Mi B</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getJvmMaxHeapInMiB()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_JvmMaxHeapInMiB();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getProcessorName <em>Processor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor Name</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getProcessorName()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_ProcessorName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getProcessorDescription <em>Processor Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor Description</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getProcessorDescription()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_ProcessorDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getProcessorCount <em>Processor Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor Count</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getProcessorCount()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_ProcessorCount();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getProcessorCacheSize <em>Processor Cache Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor Cache Size</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getProcessorCacheSize()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_ProcessorCacheSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getSystemMemory <em>System Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Memory</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getSystemMemory()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_SystemMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getOsName <em>Os Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Name</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getOsName()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_OsName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getOsVersion <em>Os Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Version</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getOsVersion()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_OsVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getOsArchitecture <em>Os Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Architecture</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Benchmark#getOsArchitecture()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_OsArchitecture();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery <em>Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discovery</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Discovery
	 * @generated
	 */
	EClass getDiscovery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getDicoveryDate <em>Dicovery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dicovery Date</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Discovery#getDicoveryDate()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_DicoveryDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getAlgorithmVariant <em>Algorithm Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm Variant</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Discovery#getAlgorithmVariant()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_AlgorithmVariant();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getDiscovererId <em>Discoverer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discoverer Id</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Discovery#getDiscovererId()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_DiscovererId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getDiscovererClassName <em>Discoverer Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discoverer Class Name</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Discovery#getDiscovererClassName()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_DiscovererClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getSaveTimeInSeconds <em>Save Time In Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Save Time In Seconds</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Discovery#getSaveTimeInSeconds()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_SaveTimeInSeconds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getTotalExecutionTimeInSeconds <em>Total Execution Time In Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Execution Time In Seconds</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Discovery#getTotalExecutionTimeInSeconds()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_TotalExecutionTimeInSeconds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getMetaModelVariant <em>Meta Model Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Model Variant</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Discovery#getMetaModelVariant()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_MetaModelVariant();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getMaxUsedMemoryInBytes <em>Max Used Memory In Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Used Memory In Bytes</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Discovery#getMaxUsedMemoryInBytes()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_MaxUsedMemoryInBytes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getNumberOfModelElements <em>Number Of Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Model Elements</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Discovery#getNumberOfModelElements()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_NumberOfModelElements();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getXmiSizeInBytes <em>Xmi Size In Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmi Size In Bytes</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Discovery#getXmiSizeInBytes()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_XmiSizeInBytes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Discovery#getName()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Discovery#getDiscoveryError <em>Discovery Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discovery Error</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Discovery#getDiscoveryError()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_DiscoveryError();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Project#getTotalLines <em>Total Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Lines</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Project#getTotalLines()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_TotalLines();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.discovery.benchmark.Project#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Project#getFiles()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Files();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Project#getAverageFileSizeInBytes <em>Average File Size In Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average File Size In Bytes</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Project#getAverageFileSizeInBytes()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_AverageFileSizeInBytes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Project#getAverageLinesPerFile <em>Average Lines Per File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Lines Per File</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Project#getAverageLinesPerFile()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_AverageLinesPerFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.Project#getTotalSizeInBytes <em>Total Size In Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Size In Bytes</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.Project#getTotalSizeInBytes()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_TotalSizeInBytes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.File#getSizeInBytes <em>Size In Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size In Bytes</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.File#getSizeInBytes()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_SizeInBytes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.File#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lines</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.File#getLines()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Lines();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.File#getFilepath <em>Filepath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filepath</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.File#getFilepath()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Filepath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.MultiProjectBenchmark <em>Multi Project Benchmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Project Benchmark</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.MultiProjectBenchmark
	 * @generated
	 */
	EClass getMultiProjectBenchmark();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.discovery.benchmark.MultiProjectBenchmark#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.MultiProjectBenchmark#getProjects()
	 * @see #getMultiProjectBenchmark()
	 * @generated
	 */
	EReference getMultiProjectBenchmark_Projects();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.MultiDiscoveryBenchmark <em>Multi Discovery Benchmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Discovery Benchmark</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.MultiDiscoveryBenchmark
	 * @generated
	 */
	EClass getMultiDiscoveryBenchmark();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.discovery.benchmark.MultiDiscoveryBenchmark#getDiscoveries <em>Discoveries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Discoveries</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.MultiDiscoveryBenchmark#getDiscoveries()
	 * @see #getMultiDiscoveryBenchmark()
	 * @generated
	 */
	EReference getMultiDiscoveryBenchmark_Discoveries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.ProjectDiscovery <em>Project Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Discovery</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.ProjectDiscovery
	 * @generated
	 */
	EClass getProjectDiscovery();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.discovery.benchmark.ProjectDiscovery#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.ProjectDiscovery#getProjects()
	 * @see #getProjectDiscovery()
	 * @generated
	 */
	EReference getProjectDiscovery_Projects();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.DiscoveredProject <em>Discovered Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discovered Project</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.DiscoveredProject
	 * @generated
	 */
	EClass getDiscoveredProject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.discovery.benchmark.DiscoveredProject#getDiscoveries <em>Discoveries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Discoveries</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.DiscoveredProject#getDiscoveries()
	 * @see #getDiscoveredProject()
	 * @generated
	 */
	EReference getDiscoveredProject_Discoveries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.AveragedMultiDiscoveryBenchmark <em>Averaged Multi Discovery Benchmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Averaged Multi Discovery Benchmark</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.AveragedMultiDiscoveryBenchmark
	 * @generated
	 */
	EClass getAveragedMultiDiscoveryBenchmark();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.discovery.benchmark.AveragedMultiDiscoveryBenchmark#getDiscoveries <em>Discoveries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Discoveries</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.AveragedMultiDiscoveryBenchmark#getDiscoveries()
	 * @see #getAveragedMultiDiscoveryBenchmark()
	 * @generated
	 */
	EReference getAveragedMultiDiscoveryBenchmark_Discoveries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery <em>Averaged Project Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Averaged Project Discovery</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery
	 * @generated
	 */
	EClass getAveragedProjectDiscovery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery#getAverageExecutionTimeInSeconds <em>Average Execution Time In Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Execution Time In Seconds</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery#getAverageExecutionTimeInSeconds()
	 * @see #getAveragedProjectDiscovery()
	 * @generated
	 */
	EAttribute getAveragedProjectDiscovery_AverageExecutionTimeInSeconds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery#getAverageSaveTimeInSeconds <em>Average Save Time In Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Save Time In Seconds</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery#getAverageSaveTimeInSeconds()
	 * @see #getAveragedProjectDiscovery()
	 * @generated
	 */
	EAttribute getAveragedProjectDiscovery_AverageSaveTimeInSeconds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery#getExecutionTimeStandardDeviation <em>Execution Time Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Time Standard Deviation</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery#getExecutionTimeStandardDeviation()
	 * @see #getAveragedProjectDiscovery()
	 * @generated
	 */
	EAttribute getAveragedProjectDiscovery_ExecutionTimeStandardDeviation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery#getSaveTimeStandardDeviation <em>Save Time Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Save Time Standard Deviation</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery#getSaveTimeStandardDeviation()
	 * @see #getAveragedProjectDiscovery()
	 * @generated
	 */
	EAttribute getAveragedProjectDiscovery_SaveTimeStandardDeviation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery#getOccurrences <em>Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Occurrences</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery#getOccurrences()
	 * @see #getAveragedProjectDiscovery()
	 * @generated
	 */
	EReference getAveragedProjectDiscovery_Occurrences();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BenchmarkFactory getBenchmarkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkImpl <em>Benchmark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getBenchmark()
		 * @generated
		 */
		EClass BENCHMARK = eINSTANCE.getBenchmark();

		/**
		 * The meta object literal for the '<em><b>Jvm Max Heap In Mi B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENCHMARK__JVM_MAX_HEAP_IN_MI_B = eINSTANCE.getBenchmark_JvmMaxHeapInMiB();

		/**
		 * The meta object literal for the '<em><b>Processor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENCHMARK__PROCESSOR_NAME = eINSTANCE.getBenchmark_ProcessorName();

		/**
		 * The meta object literal for the '<em><b>Processor Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENCHMARK__PROCESSOR_DESCRIPTION = eINSTANCE.getBenchmark_ProcessorDescription();

		/**
		 * The meta object literal for the '<em><b>Processor Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENCHMARK__PROCESSOR_COUNT = eINSTANCE.getBenchmark_ProcessorCount();

		/**
		 * The meta object literal for the '<em><b>Processor Cache Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENCHMARK__PROCESSOR_CACHE_SIZE = eINSTANCE.getBenchmark_ProcessorCacheSize();

		/**
		 * The meta object literal for the '<em><b>System Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENCHMARK__SYSTEM_MEMORY = eINSTANCE.getBenchmark_SystemMemory();

		/**
		 * The meta object literal for the '<em><b>Os Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENCHMARK__OS_NAME = eINSTANCE.getBenchmark_OsName();

		/**
		 * The meta object literal for the '<em><b>Os Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENCHMARK__OS_VERSION = eINSTANCE.getBenchmark_OsVersion();

		/**
		 * The meta object literal for the '<em><b>Os Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENCHMARK__OS_ARCHITECTURE = eINSTANCE.getBenchmark_OsArchitecture();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.DiscoveryImpl <em>Discovery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.DiscoveryImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getDiscovery()
		 * @generated
		 */
		EClass DISCOVERY = eINSTANCE.getDiscovery();

		/**
		 * The meta object literal for the '<em><b>Dicovery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__DICOVERY_DATE = eINSTANCE.getDiscovery_DicoveryDate();

		/**
		 * The meta object literal for the '<em><b>Algorithm Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__ALGORITHM_VARIANT = eINSTANCE.getDiscovery_AlgorithmVariant();

		/**
		 * The meta object literal for the '<em><b>Discoverer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__DISCOVERER_ID = eINSTANCE.getDiscovery_DiscovererId();

		/**
		 * The meta object literal for the '<em><b>Discoverer Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__DISCOVERER_CLASS_NAME = eINSTANCE.getDiscovery_DiscovererClassName();

		/**
		 * The meta object literal for the '<em><b>Save Time In Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__SAVE_TIME_IN_SECONDS = eINSTANCE.getDiscovery_SaveTimeInSeconds();

		/**
		 * The meta object literal for the '<em><b>Total Execution Time In Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__TOTAL_EXECUTION_TIME_IN_SECONDS = eINSTANCE.getDiscovery_TotalExecutionTimeInSeconds();

		/**
		 * The meta object literal for the '<em><b>Meta Model Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__META_MODEL_VARIANT = eINSTANCE.getDiscovery_MetaModelVariant();

		/**
		 * The meta object literal for the '<em><b>Max Used Memory In Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__MAX_USED_MEMORY_IN_BYTES = eINSTANCE.getDiscovery_MaxUsedMemoryInBytes();

		/**
		 * The meta object literal for the '<em><b>Number Of Model Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__NUMBER_OF_MODEL_ELEMENTS = eINSTANCE.getDiscovery_NumberOfModelElements();

		/**
		 * The meta object literal for the '<em><b>Xmi Size In Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__XMI_SIZE_IN_BYTES = eINSTANCE.getDiscovery_XmiSizeInBytes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__NAME = eINSTANCE.getDiscovery_Name();

		/**
		 * The meta object literal for the '<em><b>Discovery Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__DISCOVERY_ERROR = eINSTANCE.getDiscovery_DiscoveryError();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.ProjectImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Total Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__TOTAL_LINES = eINSTANCE.getProject_TotalLines();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__FILES = eINSTANCE.getProject_Files();

		/**
		 * The meta object literal for the '<em><b>Average File Size In Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__AVERAGE_FILE_SIZE_IN_BYTES = eINSTANCE.getProject_AverageFileSizeInBytes();

		/**
		 * The meta object literal for the '<em><b>Average Lines Per File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__AVERAGE_LINES_PER_FILE = eINSTANCE.getProject_AverageLinesPerFile();

		/**
		 * The meta object literal for the '<em><b>Total Size In Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__TOTAL_SIZE_IN_BYTES = eINSTANCE.getProject_TotalSizeInBytes();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.FileImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Size In Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__SIZE_IN_BYTES = eINSTANCE.getFile_SizeInBytes();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__LINES = eINSTANCE.getFile_Lines();

		/**
		 * The meta object literal for the '<em><b>Filepath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILEPATH = eINSTANCE.getFile_Filepath();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.MultiProjectBenchmarkImpl <em>Multi Project Benchmark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.MultiProjectBenchmarkImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getMultiProjectBenchmark()
		 * @generated
		 */
		EClass MULTI_PROJECT_BENCHMARK = eINSTANCE.getMultiProjectBenchmark();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PROJECT_BENCHMARK__PROJECTS = eINSTANCE.getMultiProjectBenchmark_Projects();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.MultiDiscoveryBenchmarkImpl <em>Multi Discovery Benchmark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.MultiDiscoveryBenchmarkImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getMultiDiscoveryBenchmark()
		 * @generated
		 */
		EClass MULTI_DISCOVERY_BENCHMARK = eINSTANCE.getMultiDiscoveryBenchmark();

		/**
		 * The meta object literal for the '<em><b>Discoveries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_DISCOVERY_BENCHMARK__DISCOVERIES = eINSTANCE.getMultiDiscoveryBenchmark_Discoveries();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.ProjectDiscoveryImpl <em>Project Discovery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.ProjectDiscoveryImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getProjectDiscovery()
		 * @generated
		 */
		EClass PROJECT_DISCOVERY = eINSTANCE.getProjectDiscovery();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_DISCOVERY__PROJECTS = eINSTANCE.getProjectDiscovery_Projects();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.DiscoveredProjectImpl <em>Discovered Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.DiscoveredProjectImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getDiscoveredProject()
		 * @generated
		 */
		EClass DISCOVERED_PROJECT = eINSTANCE.getDiscoveredProject();

		/**
		 * The meta object literal for the '<em><b>Discoveries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVERED_PROJECT__DISCOVERIES = eINSTANCE.getDiscoveredProject_Discoveries();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.AveragedMultiDiscoveryBenchmarkImpl <em>Averaged Multi Discovery Benchmark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.AveragedMultiDiscoveryBenchmarkImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getAveragedMultiDiscoveryBenchmark()
		 * @generated
		 */
		EClass AVERAGED_MULTI_DISCOVERY_BENCHMARK = eINSTANCE.getAveragedMultiDiscoveryBenchmark();

		/**
		 * The meta object literal for the '<em><b>Discoveries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVERAGED_MULTI_DISCOVERY_BENCHMARK__DISCOVERIES = eINSTANCE.getAveragedMultiDiscoveryBenchmark_Discoveries();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.impl.AveragedProjectDiscoveryImpl <em>Averaged Project Discovery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.AveragedProjectDiscoveryImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.impl.BenchmarkPackageImpl#getAveragedProjectDiscovery()
		 * @generated
		 */
		EClass AVERAGED_PROJECT_DISCOVERY = eINSTANCE.getAveragedProjectDiscovery();

		/**
		 * The meta object literal for the '<em><b>Average Execution Time In Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVERAGED_PROJECT_DISCOVERY__AVERAGE_EXECUTION_TIME_IN_SECONDS = eINSTANCE.getAveragedProjectDiscovery_AverageExecutionTimeInSeconds();

		/**
		 * The meta object literal for the '<em><b>Average Save Time In Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVERAGED_PROJECT_DISCOVERY__AVERAGE_SAVE_TIME_IN_SECONDS = eINSTANCE.getAveragedProjectDiscovery_AverageSaveTimeInSeconds();

		/**
		 * The meta object literal for the '<em><b>Execution Time Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVERAGED_PROJECT_DISCOVERY__EXECUTION_TIME_STANDARD_DEVIATION = eINSTANCE.getAveragedProjectDiscovery_ExecutionTimeStandardDeviation();

		/**
		 * The meta object literal for the '<em><b>Save Time Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVERAGED_PROJECT_DISCOVERY__SAVE_TIME_STANDARD_DEVIATION = eINSTANCE.getAveragedProjectDiscovery_SaveTimeStandardDeviation();

		/**
		 * The meta object literal for the '<em><b>Occurrences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVERAGED_PROJECT_DISCOVERY__OCCURRENCES = eINSTANCE.getAveragedProjectDiscovery_Occurrences();

	}

} //BenchmarkPackage
