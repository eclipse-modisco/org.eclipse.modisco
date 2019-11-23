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
 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkFactory
 * @model kind="package"
 * @generated
 */
public interface BenchmarkPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012, 2015 INRIA and Mia-Software.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v2.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v20.html\r\n\r\nContributors:\r\n     Guillaume Doux (INRIA) - Initial API and implementation\r\n     Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage\r\n     Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer\r\n";

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
	String eNS_URI = "http://www.eclipse.org/modisco/infra/discovery/benchmark/0.11.incubation/internal/benchmark";

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
	BenchmarkPackage eINSTANCE = org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.EventImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TIME = 0;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.MemoryMeasurementImpl <em>Memory Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.MemoryMeasurementImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getMemoryMeasurement()
	 * @generated
	 */
	int MEMORY_MEASUREMENT = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MEASUREMENT__TIME = EVENT__TIME;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MEASUREMENT__EVENT_TYPE = EVENT__EVENT_TYPE;

	/**
	 * The feature id for the '<em><b>Memory Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MEASUREMENT__MEMORY_USED = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Memory Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_MEASUREMENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.EventTypeImpl <em>Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.EventTypeImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BeginEventImpl <em>Begin Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BeginEventImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getBeginEvent()
	 * @generated
	 */
	int BEGIN_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_EVENT__TIME = EVENT__TIME;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_EVENT__EVENT_TYPE = EVENT__EVENT_TYPE;

	/**
	 * The number of structural features of the '<em>Begin Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.EndEventImpl <em>End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.EndEventImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getEndEvent()
	 * @generated
	 */
	int END_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__TIME = EVENT__TIME;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__EVENT_TYPE = EVENT__EVENT_TYPE;

	/**
	 * The feature id for the '<em><b>Beginning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__BEGINNING = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.FileImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 5;

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
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.ResourceImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Total Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TOTAL_SIZE_IN_BYTES = 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.ProjectImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Total Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TOTAL_SIZE_IN_BYTES = RESOURCE__TOTAL_SIZE_IN_BYTES;

	/**
	 * The feature id for the '<em><b>Total Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TOTAL_LINES = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Average File Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__AVERAGE_FILE_SIZE_IN_BYTES = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Average Lines Per File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__AVERAGE_LINES_PER_FILE = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FILES = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__INPUT_SIZE = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__INPUT_SIZE_UNIT = RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkImpl <em>Benchmark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getBenchmark()
	 * @generated
	 */
	int BENCHMARK = 8;

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
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCHMARK__PROJECTS = 9;

	/**
	 * The feature id for the '<em><b>Discoveries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCHMARK__DISCOVERIES = 10;

	/**
	 * The number of structural features of the '<em>Benchmark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENCHMARK_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryImpl <em>Discovery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getDiscovery()
	 * @generated
	 */
	int DISCOVERY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Discoverer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__DISCOVERER_ID = 1;

	/**
	 * The feature id for the '<em><b>Discoverer Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__DISCOVERER_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Discovery Time Average In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__DISCOVERY_TIME_AVERAGE_IN_SECONDS = 3;

	/**
	 * The feature id for the '<em><b>Save Time Average In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__SAVE_TIME_AVERAGE_IN_SECONDS = 4;

	/**
	 * The feature id for the '<em><b>Execution Time Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__EXECUTION_TIME_STANDARD_DEVIATION = 5;

	/**
	 * The feature id for the '<em><b>Save Time Standard Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__SAVE_TIME_STANDARD_DEVIATION = 6;

	/**
	 * The feature id for the '<em><b>Number Of Model Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__NUMBER_OF_MODEL_ELEMENTS = 7;

	/**
	 * The feature id for the '<em><b>Xmi Size In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__XMI_SIZE_IN_BYTES = 8;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__PROJECT = 9;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__ITERATIONS = 10;

	/**
	 * The feature id for the '<em><b>Discoverer Launch Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__DISCOVERER_LAUNCH_CONFIGURATION = 11;

	/**
	 * The feature id for the '<em><b>Copy Of Discoverer Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY__COPY_OF_DISCOVERER_DESCRIPTION = 12;

	/**
	 * The number of structural features of the '<em>Discovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryIterationImpl <em>Discovery Iteration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryIterationImpl
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getDiscoveryIteration()
	 * @generated
	 */
	int DISCOVERY_ITERATION = 10;

	/**
	 * The feature id for the '<em><b>Discovery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_ITERATION__DISCOVERY_DATE = 0;

	/**
	 * The feature id for the '<em><b>Discovery Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_ITERATION__DISCOVERY_TIME_IN_SECONDS = 1;

	/**
	 * The feature id for the '<em><b>Save Time In Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_ITERATION__SAVE_TIME_IN_SECONDS = 2;

	/**
	 * The feature id for the '<em><b>Max Used Memory In Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_ITERATION__MAX_USED_MEMORY_IN_BYTES = 3;

	/**
	 * The feature id for the '<em><b>Discovery Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_ITERATION__DISCOVERY_ERRORS = 4;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_ITERATION__EVENTS = 5;

	/**
	 * The feature id for the '<em><b>Memory Measurements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_ITERATION__MEMORY_MEASUREMENTS = 6;

	/**
	 * The number of structural features of the '<em>Discovery Iteration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_ITERATION_FEATURE_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.MemoryMeasurement <em>Memory Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Measurement</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.MemoryMeasurement
	 * @generated
	 */
	EClass getMemoryMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.MemoryMeasurement#getMemoryUsed <em>Memory Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Used</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.MemoryMeasurement#getMemoryUsed()
	 * @see #getMemoryMeasurement()
	 * @generated
	 */
	EAttribute getMemoryMeasurement_MemoryUsed();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Event#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Event#getTime()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Time();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Event#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Type</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Event#getEventType()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_EventType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.EventType
	 * @generated
	 */
	EClass getEventType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.EventType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.EventType#getName()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BeginEvent <em>Begin Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Begin Event</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BeginEvent
	 * @generated
	 */
	EClass getBeginEvent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.EndEvent
	 * @generated
	 */
	EClass getEndEvent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.EndEvent#getBeginning <em>Beginning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Beginning</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.EndEvent#getBeginning()
	 * @see #getEndEvent()
	 * @generated
	 */
	EReference getEndEvent_Beginning();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.File#getSizeInBytes <em>Size In Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size In Bytes</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.File#getSizeInBytes()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_SizeInBytes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.File#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lines</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.File#getLines()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Lines();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.File#getFilepath <em>Filepath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filepath</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.File#getFilepath()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Filepath();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Resource#getTotalSizeInBytes <em>Total Size In Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Size In Bytes</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Resource#getTotalSizeInBytes()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_TotalSizeInBytes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project#getTotalLines <em>Total Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Lines</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project#getTotalLines()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_TotalLines();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project#getAverageFileSizeInBytes <em>Average File Size In Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average File Size In Bytes</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project#getAverageFileSizeInBytes()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_AverageFileSizeInBytes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project#getAverageLinesPerFile <em>Average Lines Per File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Lines Per File</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project#getAverageLinesPerFile()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_AverageLinesPerFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project#getFiles()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Files();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project#getInputSize <em>Input Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Size</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project#getInputSize()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_InputSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project#getInputSizeUnit <em>Input Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Size Unit</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project#getInputSizeUnit()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_InputSizeUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark <em>Benchmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Benchmark</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark
	 * @generated
	 */
	EClass getBenchmark();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getJvmMaxHeapInMiB <em>Jvm Max Heap In Mi B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jvm Max Heap In Mi B</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getJvmMaxHeapInMiB()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_JvmMaxHeapInMiB();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getProcessorName <em>Processor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor Name</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getProcessorName()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_ProcessorName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getProcessorDescription <em>Processor Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor Description</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getProcessorDescription()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_ProcessorDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getProcessorCount <em>Processor Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor Count</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getProcessorCount()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_ProcessorCount();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getProcessorCacheSize <em>Processor Cache Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor Cache Size</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getProcessorCacheSize()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_ProcessorCacheSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getSystemMemory <em>System Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Memory</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getSystemMemory()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_SystemMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getOsName <em>Os Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Name</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getOsName()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_OsName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getOsVersion <em>Os Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Version</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getOsVersion()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_OsVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getOsArchitecture <em>Os Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Architecture</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getOsArchitecture()
	 * @see #getBenchmark()
	 * @generated
	 */
	EAttribute getBenchmark_OsArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getProjects()
	 * @see #getBenchmark()
	 * @generated
	 */
	EReference getBenchmark_Projects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getDiscoveries <em>Discoveries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Discoveries</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark#getDiscoveries()
	 * @see #getBenchmark()
	 * @generated
	 */
	EReference getBenchmark_Discoveries();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery <em>Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discovery</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery
	 * @generated
	 */
	EClass getDiscovery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getName()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getDiscovererId <em>Discoverer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discoverer Id</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getDiscovererId()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_DiscovererId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getDiscovererClassName <em>Discoverer Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discoverer Class Name</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getDiscovererClassName()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_DiscovererClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getDiscoveryTimeAverageInSeconds <em>Discovery Time Average In Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discovery Time Average In Seconds</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getDiscoveryTimeAverageInSeconds()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_DiscoveryTimeAverageInSeconds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getSaveTimeAverageInSeconds <em>Save Time Average In Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Save Time Average In Seconds</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getSaveTimeAverageInSeconds()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_SaveTimeAverageInSeconds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getExecutionTimeStandardDeviation <em>Execution Time Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Time Standard Deviation</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getExecutionTimeStandardDeviation()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_ExecutionTimeStandardDeviation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getSaveTimeStandardDeviation <em>Save Time Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Save Time Standard Deviation</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getSaveTimeStandardDeviation()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_SaveTimeStandardDeviation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getNumberOfModelElements <em>Number Of Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Model Elements</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getNumberOfModelElements()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_NumberOfModelElements();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getXmiSizeInBytes <em>Xmi Size In Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmi Size In Bytes</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getXmiSizeInBytes()
	 * @see #getDiscovery()
	 * @generated
	 */
	EAttribute getDiscovery_XmiSizeInBytes();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getProject()
	 * @see #getDiscovery()
	 * @generated
	 */
	EReference getDiscovery_Project();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getIterations <em>Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iterations</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getIterations()
	 * @see #getDiscovery()
	 * @generated
	 */
	EReference getDiscovery_Iterations();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getDiscovererLaunchConfiguration <em>Discoverer Launch Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discoverer Launch Configuration</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getDiscovererLaunchConfiguration()
	 * @see #getDiscovery()
	 * @generated
	 */
	EReference getDiscovery_DiscovererLaunchConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getCopyOfDiscovererDescription <em>Copy Of Discoverer Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copy Of Discoverer Description</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery#getCopyOfDiscovererDescription()
	 * @see #getDiscovery()
	 * @generated
	 */
	EReference getDiscovery_CopyOfDiscovererDescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration <em>Discovery Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discovery Iteration</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration
	 * @generated
	 */
	EClass getDiscoveryIteration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getDiscoveryDate <em>Discovery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discovery Date</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getDiscoveryDate()
	 * @see #getDiscoveryIteration()
	 * @generated
	 */
	EAttribute getDiscoveryIteration_DiscoveryDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getDiscoveryTimeInSeconds <em>Discovery Time In Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discovery Time In Seconds</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getDiscoveryTimeInSeconds()
	 * @see #getDiscoveryIteration()
	 * @generated
	 */
	EAttribute getDiscoveryIteration_DiscoveryTimeInSeconds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getSaveTimeInSeconds <em>Save Time In Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Save Time In Seconds</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getSaveTimeInSeconds()
	 * @see #getDiscoveryIteration()
	 * @generated
	 */
	EAttribute getDiscoveryIteration_SaveTimeInSeconds();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getMaxUsedMemoryInBytes <em>Max Used Memory In Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Used Memory In Bytes</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getMaxUsedMemoryInBytes()
	 * @see #getDiscoveryIteration()
	 * @generated
	 */
	EAttribute getDiscoveryIteration_MaxUsedMemoryInBytes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getDiscoveryErrors <em>Discovery Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discovery Errors</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getDiscoveryErrors()
	 * @see #getDiscoveryIteration()
	 * @generated
	 */
	EAttribute getDiscoveryIteration_DiscoveryErrors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getEvents()
	 * @see #getDiscoveryIteration()
	 * @generated
	 */
	EReference getDiscoveryIteration_Events();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getMemoryMeasurements <em>Memory Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Memory Measurements</em>'.
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration#getMemoryMeasurements()
	 * @see #getDiscoveryIteration()
	 * @generated
	 */
	EReference getDiscoveryIteration_MemoryMeasurements();

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
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.MemoryMeasurementImpl <em>Memory Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.MemoryMeasurementImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getMemoryMeasurement()
		 * @generated
		 */
		EClass MEMORY_MEASUREMENT = eINSTANCE.getMemoryMeasurement();

		/**
		 * The meta object literal for the '<em><b>Memory Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_MEASUREMENT__MEMORY_USED = eINSTANCE.getMemoryMeasurement_MemoryUsed();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.EventImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TIME = eINSTANCE.getEvent_Time();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__EVENT_TYPE = eINSTANCE.getEvent_EventType();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.EventTypeImpl <em>Event Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.EventTypeImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getEventType()
		 * @generated
		 */
		EClass EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TYPE__NAME = eINSTANCE.getEventType_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BeginEventImpl <em>Begin Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BeginEventImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getBeginEvent()
		 * @generated
		 */
		EClass BEGIN_EVENT = eINSTANCE.getBeginEvent();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.EndEventImpl <em>End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.EndEventImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getEndEvent()
		 * @generated
		 */
		EClass END_EVENT = eINSTANCE.getEndEvent();

		/**
		 * The meta object literal for the '<em><b>Beginning</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_EVENT__BEGINNING = eINSTANCE.getEndEvent_Beginning();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.FileImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getFile()
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
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.ResourceImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Total Size In Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TOTAL_SIZE_IN_BYTES = eINSTANCE.getResource_TotalSizeInBytes();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.ProjectImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Total Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__TOTAL_LINES = eINSTANCE.getProject_TotalLines();

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
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__FILES = eINSTANCE.getProject_Files();

		/**
		 * The meta object literal for the '<em><b>Input Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__INPUT_SIZE = eINSTANCE.getProject_InputSize();

		/**
		 * The meta object literal for the '<em><b>Input Size Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__INPUT_SIZE_UNIT = eINSTANCE.getProject_InputSizeUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkImpl <em>Benchmark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getBenchmark()
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
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BENCHMARK__PROJECTS = eINSTANCE.getBenchmark_Projects();

		/**
		 * The meta object literal for the '<em><b>Discoveries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BENCHMARK__DISCOVERIES = eINSTANCE.getBenchmark_Discoveries();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryImpl <em>Discovery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getDiscovery()
		 * @generated
		 */
		EClass DISCOVERY = eINSTANCE.getDiscovery();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__NAME = eINSTANCE.getDiscovery_Name();

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
		 * The meta object literal for the '<em><b>Discovery Time Average In Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__DISCOVERY_TIME_AVERAGE_IN_SECONDS = eINSTANCE.getDiscovery_DiscoveryTimeAverageInSeconds();

		/**
		 * The meta object literal for the '<em><b>Save Time Average In Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__SAVE_TIME_AVERAGE_IN_SECONDS = eINSTANCE.getDiscovery_SaveTimeAverageInSeconds();

		/**
		 * The meta object literal for the '<em><b>Execution Time Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__EXECUTION_TIME_STANDARD_DEVIATION = eINSTANCE.getDiscovery_ExecutionTimeStandardDeviation();

		/**
		 * The meta object literal for the '<em><b>Save Time Standard Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY__SAVE_TIME_STANDARD_DEVIATION = eINSTANCE.getDiscovery_SaveTimeStandardDeviation();

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
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVERY__PROJECT = eINSTANCE.getDiscovery_Project();

		/**
		 * The meta object literal for the '<em><b>Iterations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVERY__ITERATIONS = eINSTANCE.getDiscovery_Iterations();

		/**
		 * The meta object literal for the '<em><b>Discoverer Launch Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVERY__DISCOVERER_LAUNCH_CONFIGURATION = eINSTANCE.getDiscovery_DiscovererLaunchConfiguration();

		/**
		 * The meta object literal for the '<em><b>Copy Of Discoverer Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVERY__COPY_OF_DISCOVERER_DESCRIPTION = eINSTANCE.getDiscovery_CopyOfDiscovererDescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryIterationImpl <em>Discovery Iteration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.DiscoveryIterationImpl
		 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl.BenchmarkPackageImpl#getDiscoveryIteration()
		 * @generated
		 */
		EClass DISCOVERY_ITERATION = eINSTANCE.getDiscoveryIteration();

		/**
		 * The meta object literal for the '<em><b>Discovery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY_ITERATION__DISCOVERY_DATE = eINSTANCE.getDiscoveryIteration_DiscoveryDate();

		/**
		 * The meta object literal for the '<em><b>Discovery Time In Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY_ITERATION__DISCOVERY_TIME_IN_SECONDS = eINSTANCE.getDiscoveryIteration_DiscoveryTimeInSeconds();

		/**
		 * The meta object literal for the '<em><b>Save Time In Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY_ITERATION__SAVE_TIME_IN_SECONDS = eINSTANCE.getDiscoveryIteration_SaveTimeInSeconds();

		/**
		 * The meta object literal for the '<em><b>Max Used Memory In Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY_ITERATION__MAX_USED_MEMORY_IN_BYTES = eINSTANCE.getDiscoveryIteration_MaxUsedMemoryInBytes();

		/**
		 * The meta object literal for the '<em><b>Discovery Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY_ITERATION__DISCOVERY_ERRORS = eINSTANCE.getDiscoveryIteration_DiscoveryErrors();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVERY_ITERATION__EVENTS = eINSTANCE.getDiscoveryIteration_Events();

		/**
		 * The meta object literal for the '<em><b>Memory Measurements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVERY_ITERATION__MEMORY_MEASUREMENTS = eINSTANCE.getDiscoveryIteration_MemoryMeasurements();

	}

} //BenchmarkPackage
