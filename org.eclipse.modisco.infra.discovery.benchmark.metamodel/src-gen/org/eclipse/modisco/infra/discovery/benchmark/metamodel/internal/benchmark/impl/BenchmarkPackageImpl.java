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
package org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BeginEvent;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkFactory;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.DiscoveryIteration;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.EndEvent;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Event;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.EventType;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.File;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.MemoryMeasurement;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Project;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Resource;

import org.eclipse.modisco.infra.discovery.catalog.CatalogPackage;

import org.eclipse.modisco.infra.discovery.launch.LaunchPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BenchmarkPackageImpl extends EPackageImpl implements BenchmarkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2012, 2015 INRIA and Mia-Software.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v2.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v20.html\r\n\r\nContributors:\r\n     Guillaume Doux (INRIA) - Initial API and implementation\r\n     Grégoire Dupé (Mia-Software) - Bug 483292 - [Benchmark] long must be used to store memory usage\r\n     Grégoire Dupé (Mia-Software) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer\r\n";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beginEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass benchmarkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discoveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discoveryIterationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.BenchmarkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BenchmarkPackageImpl() {
		super(eNS_URI, BenchmarkFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BenchmarkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BenchmarkPackage init() {
		if (isInited) return (BenchmarkPackage)EPackage.Registry.INSTANCE.getEPackage(BenchmarkPackage.eNS_URI);

		// Obtain or create and register package
		BenchmarkPackageImpl theBenchmarkPackage = (BenchmarkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BenchmarkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BenchmarkPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CatalogPackage.eINSTANCE.eClass();
		LaunchPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBenchmarkPackage.createPackageContents();

		// Initialize created meta-data
		theBenchmarkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBenchmarkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BenchmarkPackage.eNS_URI, theBenchmarkPackage);
		return theBenchmarkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryMeasurement() {
		return memoryMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryMeasurement_MemoryUsed() {
		return (EAttribute)memoryMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Time() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_EventType() {
		return (EReference)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventType() {
		return eventTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventType_Name() {
		return (EAttribute)eventTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeginEvent() {
		return beginEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndEvent() {
		return endEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndEvent_Beginning() {
		return (EReference)endEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_SizeInBytes() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Lines() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Filepath() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Name() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_TotalSizeInBytes() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_TotalLines() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_AverageFileSizeInBytes() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_AverageLinesPerFile() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Files() {
		return (EReference)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_InputSize() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_InputSizeUnit() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBenchmark() {
		return benchmarkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBenchmark_JvmMaxHeapInMiB() {
		return (EAttribute)benchmarkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBenchmark_ProcessorName() {
		return (EAttribute)benchmarkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBenchmark_ProcessorDescription() {
		return (EAttribute)benchmarkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBenchmark_ProcessorCount() {
		return (EAttribute)benchmarkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBenchmark_ProcessorCacheSize() {
		return (EAttribute)benchmarkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBenchmark_SystemMemory() {
		return (EAttribute)benchmarkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBenchmark_OsName() {
		return (EAttribute)benchmarkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBenchmark_OsVersion() {
		return (EAttribute)benchmarkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBenchmark_OsArchitecture() {
		return (EAttribute)benchmarkEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBenchmark_Projects() {
		return (EReference)benchmarkEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBenchmark_Discoveries() {
		return (EReference)benchmarkEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscovery() {
		return discoveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_Name() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_DiscovererId() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_DiscovererClassName() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_DiscoveryTimeAverageInSeconds() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_SaveTimeAverageInSeconds() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_ExecutionTimeStandardDeviation() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_SaveTimeStandardDeviation() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_NumberOfModelElements() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_XmiSizeInBytes() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscovery_Project() {
		return (EReference)discoveryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscovery_Iterations() {
		return (EReference)discoveryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscovery_DiscovererLaunchConfiguration() {
		return (EReference)discoveryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscovery_CopyOfDiscovererDescription() {
		return (EReference)discoveryEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscoveryIteration() {
		return discoveryIterationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscoveryIteration_DiscoveryDate() {
		return (EAttribute)discoveryIterationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscoveryIteration_DiscoveryTimeInSeconds() {
		return (EAttribute)discoveryIterationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscoveryIteration_SaveTimeInSeconds() {
		return (EAttribute)discoveryIterationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscoveryIteration_MaxUsedMemoryInBytes() {
		return (EAttribute)discoveryIterationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscoveryIteration_DiscoveryErrors() {
		return (EAttribute)discoveryIterationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscoveryIteration_Events() {
		return (EReference)discoveryIterationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscoveryIteration_MemoryMeasurements() {
		return (EReference)discoveryIterationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenchmarkFactory getBenchmarkFactory() {
		return (BenchmarkFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		memoryMeasurementEClass = createEClass(MEMORY_MEASUREMENT);
		createEAttribute(memoryMeasurementEClass, MEMORY_MEASUREMENT__MEMORY_USED);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__TIME);
		createEReference(eventEClass, EVENT__EVENT_TYPE);

		eventTypeEClass = createEClass(EVENT_TYPE);
		createEAttribute(eventTypeEClass, EVENT_TYPE__NAME);

		beginEventEClass = createEClass(BEGIN_EVENT);

		endEventEClass = createEClass(END_EVENT);
		createEReference(endEventEClass, END_EVENT__BEGINNING);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__SIZE_IN_BYTES);
		createEAttribute(fileEClass, FILE__LINES);
		createEAttribute(fileEClass, FILE__FILEPATH);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__NAME);
		createEAttribute(resourceEClass, RESOURCE__TOTAL_SIZE_IN_BYTES);

		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__TOTAL_LINES);
		createEAttribute(projectEClass, PROJECT__AVERAGE_FILE_SIZE_IN_BYTES);
		createEAttribute(projectEClass, PROJECT__AVERAGE_LINES_PER_FILE);
		createEReference(projectEClass, PROJECT__FILES);
		createEAttribute(projectEClass, PROJECT__INPUT_SIZE);
		createEAttribute(projectEClass, PROJECT__INPUT_SIZE_UNIT);

		benchmarkEClass = createEClass(BENCHMARK);
		createEAttribute(benchmarkEClass, BENCHMARK__JVM_MAX_HEAP_IN_MI_B);
		createEAttribute(benchmarkEClass, BENCHMARK__PROCESSOR_NAME);
		createEAttribute(benchmarkEClass, BENCHMARK__PROCESSOR_DESCRIPTION);
		createEAttribute(benchmarkEClass, BENCHMARK__PROCESSOR_COUNT);
		createEAttribute(benchmarkEClass, BENCHMARK__PROCESSOR_CACHE_SIZE);
		createEAttribute(benchmarkEClass, BENCHMARK__SYSTEM_MEMORY);
		createEAttribute(benchmarkEClass, BENCHMARK__OS_NAME);
		createEAttribute(benchmarkEClass, BENCHMARK__OS_VERSION);
		createEAttribute(benchmarkEClass, BENCHMARK__OS_ARCHITECTURE);
		createEReference(benchmarkEClass, BENCHMARK__PROJECTS);
		createEReference(benchmarkEClass, BENCHMARK__DISCOVERIES);

		discoveryEClass = createEClass(DISCOVERY);
		createEAttribute(discoveryEClass, DISCOVERY__NAME);
		createEAttribute(discoveryEClass, DISCOVERY__DISCOVERER_ID);
		createEAttribute(discoveryEClass, DISCOVERY__DISCOVERER_CLASS_NAME);
		createEAttribute(discoveryEClass, DISCOVERY__DISCOVERY_TIME_AVERAGE_IN_SECONDS);
		createEAttribute(discoveryEClass, DISCOVERY__SAVE_TIME_AVERAGE_IN_SECONDS);
		createEAttribute(discoveryEClass, DISCOVERY__EXECUTION_TIME_STANDARD_DEVIATION);
		createEAttribute(discoveryEClass, DISCOVERY__SAVE_TIME_STANDARD_DEVIATION);
		createEAttribute(discoveryEClass, DISCOVERY__NUMBER_OF_MODEL_ELEMENTS);
		createEAttribute(discoveryEClass, DISCOVERY__XMI_SIZE_IN_BYTES);
		createEReference(discoveryEClass, DISCOVERY__PROJECT);
		createEReference(discoveryEClass, DISCOVERY__ITERATIONS);
		createEReference(discoveryEClass, DISCOVERY__DISCOVERER_LAUNCH_CONFIGURATION);
		createEReference(discoveryEClass, DISCOVERY__COPY_OF_DISCOVERER_DESCRIPTION);

		discoveryIterationEClass = createEClass(DISCOVERY_ITERATION);
		createEAttribute(discoveryIterationEClass, DISCOVERY_ITERATION__DISCOVERY_DATE);
		createEAttribute(discoveryIterationEClass, DISCOVERY_ITERATION__DISCOVERY_TIME_IN_SECONDS);
		createEAttribute(discoveryIterationEClass, DISCOVERY_ITERATION__SAVE_TIME_IN_SECONDS);
		createEAttribute(discoveryIterationEClass, DISCOVERY_ITERATION__MAX_USED_MEMORY_IN_BYTES);
		createEAttribute(discoveryIterationEClass, DISCOVERY_ITERATION__DISCOVERY_ERRORS);
		createEReference(discoveryIterationEClass, DISCOVERY_ITERATION__EVENTS);
		createEReference(discoveryIterationEClass, DISCOVERY_ITERATION__MEMORY_MEASUREMENTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		LaunchPackage theLaunchPackage = (LaunchPackage)EPackage.Registry.INSTANCE.getEPackage(LaunchPackage.eNS_URI);
		CatalogPackage theCatalogPackage = (CatalogPackage)EPackage.Registry.INSTANCE.getEPackage(CatalogPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		memoryMeasurementEClass.getESuperTypes().add(this.getEvent());
		beginEventEClass.getESuperTypes().add(this.getEvent());
		endEventEClass.getESuperTypes().add(this.getEvent());
		projectEClass.getESuperTypes().add(this.getResource());

		// Initialize classes and features; add operations and parameters
		initEClass(memoryMeasurementEClass, MemoryMeasurement.class, "MemoryMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryMeasurement_MemoryUsed(), ecorePackage.getELong(), "memoryUsed", null, 0, 1, MemoryMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Time(), ecorePackage.getELong(), "time", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_EventType(), this.getEventType(), null, "eventType", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventTypeEClass, EventType.class, "EventType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventType_Name(), ecorePackage.getEString(), "name", null, 0, 1, EventType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beginEventEClass, BeginEvent.class, "BeginEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endEventEClass, EndEvent.class, "EndEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndEvent_Beginning(), this.getBeginEvent(), null, "beginning", null, 1, 1, EndEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_SizeInBytes(), ecorePackage.getELong(), "sizeInBytes", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Lines(), ecorePackage.getELong(), "lines", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Filepath(), ecorePackage.getEString(), "filepath", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_TotalSizeInBytes(), ecorePackage.getELong(), "totalSizeInBytes", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_TotalLines(), ecorePackage.getELong(), "totalLines", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_AverageFileSizeInBytes(), ecorePackage.getELong(), "averageFileSizeInBytes", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_AverageLinesPerFile(), ecorePackage.getELong(), "averageLinesPerFile", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Files(), this.getFile(), null, "files", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_InputSize(), ecorePackage.getEDouble(), "inputSize", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_InputSizeUnit(), ecorePackage.getEString(), "inputSizeUnit", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(benchmarkEClass, Benchmark.class, "Benchmark", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBenchmark_JvmMaxHeapInMiB(), ecorePackage.getELong(), "jvmMaxHeapInMiB", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBenchmark_ProcessorName(), ecorePackage.getEString(), "processorName", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBenchmark_ProcessorDescription(), ecorePackage.getEString(), "processorDescription", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBenchmark_ProcessorCount(), ecorePackage.getEInt(), "processorCount", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBenchmark_ProcessorCacheSize(), ecorePackage.getEString(), "processorCacheSize", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBenchmark_SystemMemory(), ecorePackage.getEString(), "systemMemory", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBenchmark_OsName(), ecorePackage.getEString(), "osName", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBenchmark_OsVersion(), ecorePackage.getEString(), "osVersion", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBenchmark_OsArchitecture(), ecorePackage.getEString(), "osArchitecture", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBenchmark_Projects(), this.getResource(), null, "projects", null, 0, -1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBenchmark_Discoveries(), this.getDiscovery(), null, "discoveries", null, 0, -1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discoveryEClass, Discovery.class, "Discovery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscovery_Name(), ecorePackage.getEString(), "name", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_DiscovererId(), ecorePackage.getEString(), "discovererId", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_DiscovererClassName(), ecorePackage.getEString(), "discovererClassName", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_DiscoveryTimeAverageInSeconds(), ecorePackage.getEDouble(), "discoveryTimeAverageInSeconds", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_SaveTimeAverageInSeconds(), ecorePackage.getEDouble(), "saveTimeAverageInSeconds", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_ExecutionTimeStandardDeviation(), ecorePackage.getEDouble(), "executionTimeStandardDeviation", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_SaveTimeStandardDeviation(), ecorePackage.getEDouble(), "saveTimeStandardDeviation", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_NumberOfModelElements(), ecorePackage.getELong(), "numberOfModelElements", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_XmiSizeInBytes(), ecorePackage.getELong(), "xmiSizeInBytes", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscovery_Project(), this.getResource(), null, "project", null, 1, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscovery_Iterations(), this.getDiscoveryIteration(), null, "iterations", null, 0, -1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscovery_DiscovererLaunchConfiguration(), theLaunchPackage.getLaunchConfiguration(), null, "discovererLaunchConfiguration", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscovery_CopyOfDiscovererDescription(), theCatalogPackage.getDiscovererDescription(), null, "copyOfDiscovererDescription", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discoveryIterationEClass, DiscoveryIteration.class, "DiscoveryIteration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscoveryIteration_DiscoveryDate(), ecorePackage.getEDate(), "discoveryDate", null, 0, 1, DiscoveryIteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscoveryIteration_DiscoveryTimeInSeconds(), ecorePackage.getEDouble(), "discoveryTimeInSeconds", null, 0, 1, DiscoveryIteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscoveryIteration_SaveTimeInSeconds(), ecorePackage.getEDouble(), "saveTimeInSeconds", null, 0, 1, DiscoveryIteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscoveryIteration_MaxUsedMemoryInBytes(), ecorePackage.getELong(), "maxUsedMemoryInBytes", null, 0, 1, DiscoveryIteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscoveryIteration_DiscoveryErrors(), ecorePackage.getEString(), "discoveryErrors", null, 0, 1, DiscoveryIteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscoveryIteration_Events(), this.getEvent(), null, "events", null, 0, -1, DiscoveryIteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscoveryIteration_MemoryMeasurements(), this.getEvent(), null, "memoryMeasurements", null, 0, -1, DiscoveryIteration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// @Depreacted
		create_DepreactedAnnotations();
	}

	/**
	 * Initializes the annotations for <b>@Depreacted</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_DepreactedAnnotations() {
		String source = "@Depreacted";	
		addAnnotation
		  (getProject_TotalLines(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProject_AverageFileSizeInBytes(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProject_AverageLinesPerFile(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProject_Files(), 
		   source, 
		   new String[] {
		   });
	}

} //BenchmarkPackageImpl
