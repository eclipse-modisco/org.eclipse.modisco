/**
 * Copyright (c) 2009, 2011 Mia-Software and others.
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.modisco.infra.discovery.benchmark.AveragedMultiDiscoveryBenchmark;
import org.eclipse.modisco.infra.discovery.benchmark.AveragedProjectDiscovery;
import org.eclipse.modisco.infra.discovery.benchmark.Benchmark;
import org.eclipse.modisco.infra.discovery.benchmark.BenchmarkFactory;
import org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage;
import org.eclipse.modisco.infra.discovery.benchmark.DiscoveredProject;
import org.eclipse.modisco.infra.discovery.benchmark.Discovery;
import org.eclipse.modisco.infra.discovery.benchmark.File;
import org.eclipse.modisco.infra.discovery.benchmark.MultiDiscoveryBenchmark;
import org.eclipse.modisco.infra.discovery.benchmark.MultiProjectBenchmark;
import org.eclipse.modisco.infra.discovery.benchmark.Project;
import org.eclipse.modisco.infra.discovery.benchmark.ProjectDiscovery;

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
	private EClass projectEClass = null;

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
	private EClass multiProjectBenchmarkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiDiscoveryBenchmarkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectDiscoveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discoveredProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass averagedMultiDiscoveryBenchmarkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass averagedProjectDiscoveryEClass = null;

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
	 * @see org.eclipse.modisco.infra.discovery.benchmark.BenchmarkPackage#eNS_URI
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
	public EClass getDiscovery() {
		return discoveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_DicoveryDate() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_AlgorithmVariant() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_DiscovererId() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_DiscovererClassName() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_SaveTimeInSeconds() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_TotalExecutionTimeInSeconds() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_MetaModelVariant() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_MaxUsedMemoryInBytes() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_NumberOfModelElements() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_XmiSizeInBytes() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_Name() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscovery_DiscoveryError() {
		return (EAttribute)discoveryEClass.getEStructuralFeatures().get(11);
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
	public EAttribute getProject_Name() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_TotalLines() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Files() {
		return (EReference)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_AverageFileSizeInBytes() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_AverageLinesPerFile() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_TotalSizeInBytes() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(5);
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
	public EClass getMultiProjectBenchmark() {
		return multiProjectBenchmarkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiProjectBenchmark_Projects() {
		return (EReference)multiProjectBenchmarkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiDiscoveryBenchmark() {
		return multiDiscoveryBenchmarkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiDiscoveryBenchmark_Discoveries() {
		return (EReference)multiDiscoveryBenchmarkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectDiscovery() {
		return projectDiscoveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectDiscovery_Projects() {
		return (EReference)projectDiscoveryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscoveredProject() {
		return discoveredProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiscoveredProject_Discoveries() {
		return (EReference)discoveredProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAveragedMultiDiscoveryBenchmark() {
		return averagedMultiDiscoveryBenchmarkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAveragedMultiDiscoveryBenchmark_Discoveries() {
		return (EReference)averagedMultiDiscoveryBenchmarkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAveragedProjectDiscovery() {
		return averagedProjectDiscoveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAveragedProjectDiscovery_AverageExecutionTimeInSeconds() {
		return (EAttribute)averagedProjectDiscoveryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAveragedProjectDiscovery_AverageSaveTimeInSeconds() {
		return (EAttribute)averagedProjectDiscoveryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAveragedProjectDiscovery_ExecutionTimeStandardDeviation() {
		return (EAttribute)averagedProjectDiscoveryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAveragedProjectDiscovery_SaveTimeStandardDeviation() {
		return (EAttribute)averagedProjectDiscoveryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAveragedProjectDiscovery_Occurrences() {
		return (EReference)averagedProjectDiscoveryEClass.getEStructuralFeatures().get(4);
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

		discoveryEClass = createEClass(DISCOVERY);
		createEAttribute(discoveryEClass, DISCOVERY__DICOVERY_DATE);
		createEAttribute(discoveryEClass, DISCOVERY__ALGORITHM_VARIANT);
		createEAttribute(discoveryEClass, DISCOVERY__DISCOVERER_ID);
		createEAttribute(discoveryEClass, DISCOVERY__DISCOVERER_CLASS_NAME);
		createEAttribute(discoveryEClass, DISCOVERY__SAVE_TIME_IN_SECONDS);
		createEAttribute(discoveryEClass, DISCOVERY__TOTAL_EXECUTION_TIME_IN_SECONDS);
		createEAttribute(discoveryEClass, DISCOVERY__META_MODEL_VARIANT);
		createEAttribute(discoveryEClass, DISCOVERY__MAX_USED_MEMORY_IN_BYTES);
		createEAttribute(discoveryEClass, DISCOVERY__NUMBER_OF_MODEL_ELEMENTS);
		createEAttribute(discoveryEClass, DISCOVERY__XMI_SIZE_IN_BYTES);
		createEAttribute(discoveryEClass, DISCOVERY__NAME);
		createEAttribute(discoveryEClass, DISCOVERY__DISCOVERY_ERROR);

		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEAttribute(projectEClass, PROJECT__TOTAL_LINES);
		createEReference(projectEClass, PROJECT__FILES);
		createEAttribute(projectEClass, PROJECT__AVERAGE_FILE_SIZE_IN_BYTES);
		createEAttribute(projectEClass, PROJECT__AVERAGE_LINES_PER_FILE);
		createEAttribute(projectEClass, PROJECT__TOTAL_SIZE_IN_BYTES);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__SIZE_IN_BYTES);
		createEAttribute(fileEClass, FILE__LINES);
		createEAttribute(fileEClass, FILE__FILEPATH);

		multiProjectBenchmarkEClass = createEClass(MULTI_PROJECT_BENCHMARK);
		createEReference(multiProjectBenchmarkEClass, MULTI_PROJECT_BENCHMARK__PROJECTS);

		multiDiscoveryBenchmarkEClass = createEClass(MULTI_DISCOVERY_BENCHMARK);
		createEReference(multiDiscoveryBenchmarkEClass, MULTI_DISCOVERY_BENCHMARK__DISCOVERIES);

		projectDiscoveryEClass = createEClass(PROJECT_DISCOVERY);
		createEReference(projectDiscoveryEClass, PROJECT_DISCOVERY__PROJECTS);

		discoveredProjectEClass = createEClass(DISCOVERED_PROJECT);
		createEReference(discoveredProjectEClass, DISCOVERED_PROJECT__DISCOVERIES);

		averagedMultiDiscoveryBenchmarkEClass = createEClass(AVERAGED_MULTI_DISCOVERY_BENCHMARK);
		createEReference(averagedMultiDiscoveryBenchmarkEClass, AVERAGED_MULTI_DISCOVERY_BENCHMARK__DISCOVERIES);

		averagedProjectDiscoveryEClass = createEClass(AVERAGED_PROJECT_DISCOVERY);
		createEAttribute(averagedProjectDiscoveryEClass, AVERAGED_PROJECT_DISCOVERY__AVERAGE_EXECUTION_TIME_IN_SECONDS);
		createEAttribute(averagedProjectDiscoveryEClass, AVERAGED_PROJECT_DISCOVERY__AVERAGE_SAVE_TIME_IN_SECONDS);
		createEAttribute(averagedProjectDiscoveryEClass, AVERAGED_PROJECT_DISCOVERY__EXECUTION_TIME_STANDARD_DEVIATION);
		createEAttribute(averagedProjectDiscoveryEClass, AVERAGED_PROJECT_DISCOVERY__SAVE_TIME_STANDARD_DEVIATION);
		createEReference(averagedProjectDiscoveryEClass, AVERAGED_PROJECT_DISCOVERY__OCCURRENCES);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		multiProjectBenchmarkEClass.getESuperTypes().add(this.getBenchmark());
		multiDiscoveryBenchmarkEClass.getESuperTypes().add(this.getBenchmark());
		projectDiscoveryEClass.getESuperTypes().add(this.getDiscovery());
		discoveredProjectEClass.getESuperTypes().add(this.getProject());
		averagedMultiDiscoveryBenchmarkEClass.getESuperTypes().add(this.getBenchmark());

		// Initialize classes and features; add operations and parameters
		initEClass(benchmarkEClass, Benchmark.class, "Benchmark", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBenchmark_JvmMaxHeapInMiB(), ecorePackage.getELong(), "jvmMaxHeapInMiB", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBenchmark_ProcessorName(), ecorePackage.getEString(), "processorName", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBenchmark_ProcessorDescription(), ecorePackage.getEString(), "processorDescription", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBenchmark_ProcessorCount(), ecorePackage.getEInt(), "processorCount", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBenchmark_ProcessorCacheSize(), ecorePackage.getEString(), "processorCacheSize", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBenchmark_SystemMemory(), ecorePackage.getEString(), "systemMemory", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBenchmark_OsName(), ecorePackage.getEString(), "osName", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBenchmark_OsVersion(), ecorePackage.getEString(), "osVersion", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBenchmark_OsArchitecture(), ecorePackage.getEString(), "osArchitecture", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discoveryEClass, Discovery.class, "Discovery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscovery_DicoveryDate(), ecorePackage.getEDate(), "dicoveryDate", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_AlgorithmVariant(), ecorePackage.getEString(), "algorithmVariant", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_DiscovererId(), ecorePackage.getEString(), "discovererId", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_DiscovererClassName(), ecorePackage.getEString(), "discovererClassName", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_SaveTimeInSeconds(), ecorePackage.getEDouble(), "saveTimeInSeconds", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_TotalExecutionTimeInSeconds(), ecorePackage.getEDouble(), "totalExecutionTimeInSeconds", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_MetaModelVariant(), ecorePackage.getEString(), "metaModelVariant", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_MaxUsedMemoryInBytes(), ecorePackage.getELong(), "maxUsedMemoryInBytes", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_NumberOfModelElements(), ecorePackage.getELong(), "numberOfModelElements", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_XmiSizeInBytes(), ecorePackage.getELong(), "xmiSizeInBytes", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_Name(), ecorePackage.getEString(), "name", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscovery_DiscoveryError(), ecorePackage.getEString(), "discoveryError", null, 0, 1, Discovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_TotalLines(), ecorePackage.getELong(), "totalLines", null, 0, 1, Project.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Files(), this.getFile(), null, "files", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_AverageFileSizeInBytes(), ecorePackage.getELong(), "averageFileSizeInBytes", null, 0, 1, Project.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_AverageLinesPerFile(), ecorePackage.getELong(), "averageLinesPerFile", null, 0, 1, Project.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_TotalSizeInBytes(), ecorePackage.getELong(), "totalSizeInBytes", null, 0, 1, Project.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_SizeInBytes(), ecorePackage.getELong(), "sizeInBytes", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Lines(), ecorePackage.getELong(), "lines", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Filepath(), ecorePackage.getEString(), "filepath", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiProjectBenchmarkEClass, MultiProjectBenchmark.class, "MultiProjectBenchmark", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiProjectBenchmark_Projects(), this.getDiscoveredProject(), null, "projects", null, 0, -1, MultiProjectBenchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiDiscoveryBenchmarkEClass, MultiDiscoveryBenchmark.class, "MultiDiscoveryBenchmark", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiDiscoveryBenchmark_Discoveries(), this.getProjectDiscovery(), null, "discoveries", null, 0, -1, MultiDiscoveryBenchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectDiscoveryEClass, ProjectDiscovery.class, "ProjectDiscovery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProjectDiscovery_Projects(), this.getProject(), null, "projects", null, 0, -1, ProjectDiscovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discoveredProjectEClass, DiscoveredProject.class, "DiscoveredProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscoveredProject_Discoveries(), this.getDiscovery(), null, "discoveries", null, 0, -1, DiscoveredProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(averagedMultiDiscoveryBenchmarkEClass, AveragedMultiDiscoveryBenchmark.class, "AveragedMultiDiscoveryBenchmark", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAveragedMultiDiscoveryBenchmark_Discoveries(), this.getAveragedProjectDiscovery(), null, "discoveries", null, 0, -1, AveragedMultiDiscoveryBenchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(averagedProjectDiscoveryEClass, AveragedProjectDiscovery.class, "AveragedProjectDiscovery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAveragedProjectDiscovery_AverageExecutionTimeInSeconds(), ecorePackage.getEDouble(), "averageExecutionTimeInSeconds", null, 0, 1, AveragedProjectDiscovery.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAveragedProjectDiscovery_AverageSaveTimeInSeconds(), ecorePackage.getEDouble(), "averageSaveTimeInSeconds", null, 0, 1, AveragedProjectDiscovery.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAveragedProjectDiscovery_ExecutionTimeStandardDeviation(), ecorePackage.getEDouble(), "executionTimeStandardDeviation", null, 0, 1, AveragedProjectDiscovery.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAveragedProjectDiscovery_SaveTimeStandardDeviation(), ecorePackage.getEDouble(), "saveTimeStandardDeviation", null, 0, 1, AveragedProjectDiscovery.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAveragedProjectDiscovery_Occurrences(), this.getProjectDiscovery(), null, "occurrences", null, 0, -1, AveragedProjectDiscovery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BenchmarkPackageImpl
