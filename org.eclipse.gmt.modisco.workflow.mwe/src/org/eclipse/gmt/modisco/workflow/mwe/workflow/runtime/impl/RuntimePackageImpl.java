/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Nicolas Payneau (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl;

import java.util.Map;

import java.util.concurrent.ExecutorService;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.OrchestrationPackage;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimeFactory;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngine;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngineProxy;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntry;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntryType;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogResetter;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowRunner;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowStateResetter;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowStateResolutionStrategy;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.StatePackage;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.StatePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class RuntimePackageImpl extends EPackageImpl implements RuntimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowStateMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowParameterMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowStateResolutionStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowRunnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowRunnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowStateResetterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowLogEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowLogMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowLogResetterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEngineProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workflowLogEntryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType executorServiceEDataType = null;

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
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RuntimePackageImpl() {
		super(eNS_URI, RuntimeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RuntimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RuntimePackage init() {
		if (isInited) return (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Obtain or create and register package
		RuntimePackageImpl theRuntimePackage = (RuntimePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RuntimePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RuntimePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		WorkflowPackageImpl theWorkflowPackage = (WorkflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) instanceof WorkflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) : WorkflowPackage.eINSTANCE);
		OrchestrationPackageImpl theOrchestrationPackage = (OrchestrationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) instanceof OrchestrationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) : OrchestrationPackage.eINSTANCE);
		StatePackageImpl theStatePackage = (StatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);

		// Create package meta-data objects
		theRuntimePackage.createPackageContents();
		theWorkflowPackage.createPackageContents();
		theOrchestrationPackage.createPackageContents();
		theStatePackage.createPackageContents();

		// Initialize created meta-data
		theRuntimePackage.initializePackageContents();
		theWorkflowPackage.initializePackageContents();
		theOrchestrationPackage.initializePackageContents();
		theStatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRuntimePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RuntimePackage.eNS_URI, theRuntimePackage);
		return theRuntimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowContext() {
		return workflowContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowContext_Parameters() {
		return (EReference)workflowContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowContext_ThreadPool() {
		return (EAttribute)workflowContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowContext_States() {
		return (EReference)workflowContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowContext_Log() {
		return (EReference)workflowContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowContext_LogLevel() {
		return (EAttribute)workflowContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowEngine() {
		return workflowEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowEngine_Workflow() {
		return (EReference)workflowEngineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowEngine_Context() {
		return (EReference)workflowEngineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowEngine_Engines() {
		return (EReference)workflowEngineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowStateMap() {
		return workflowStateMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowStateMap_Key() {
		return (EReference)workflowStateMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowStateMap_Value() {
		return (EReference)workflowStateMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowParameterMap() {
		return workflowParameterMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowParameterMap_Key() {
		return (EReference)workflowParameterMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowParameterMap_Value() {
		return (EReference)workflowParameterMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowStateResolutionStrategy() {
		return workflowStateResolutionStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowRunnable() {
		return workflowRunnableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowRunner() {
		return workflowRunnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowRunner_Context() {
		return (EReference)workflowRunnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowRunner_Component() {
		return (EReference)workflowRunnerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowStateResetter() {
		return workflowStateResetterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowStateResetter_Context() {
		return (EReference)workflowStateResetterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowLog() {
		return workflowLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowLog_Entries() {
		return (EAttribute)workflowLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowLog_Errors() {
		return (EReference)workflowLogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowLog_Warnings() {
		return (EReference)workflowLogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowLog_Infos() {
		return (EReference)workflowLogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowLog_Debugs() {
		return (EReference)workflowLogEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowLog_LogLevel() {
		return (EAttribute)workflowLogEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowLogEntry() {
		return workflowLogEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowLogEntry_Type() {
		return (EAttribute)workflowLogEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowLogEntry_Timestamp() {
		return (EAttribute)workflowLogEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowLogEntry_Message() {
		return (EAttribute)workflowLogEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowLogMap() {
		return workflowLogMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowLogMap_Key() {
		return (EReference)workflowLogMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowLogMap_Value() {
		return (EReference)workflowLogMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowLogResetter() {
		return workflowLogResetterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowLogResetter_Context() {
		return (EReference)workflowLogResetterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowEngineProxy() {
		return workflowEngineProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowEngineProxy_TargetEngine() {
		return (EReference)workflowEngineProxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkflowLogEntryType() {
		return workflowLogEntryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExecutorService() {
		return executorServiceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeFactory getRuntimeFactory() {
		return (RuntimeFactory)getEFactoryInstance();
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
		workflowContextEClass = createEClass(WORKFLOW_CONTEXT);
		createEReference(workflowContextEClass, WORKFLOW_CONTEXT__PARAMETERS);
		createEAttribute(workflowContextEClass, WORKFLOW_CONTEXT__THREAD_POOL);
		createEReference(workflowContextEClass, WORKFLOW_CONTEXT__STATES);
		createEReference(workflowContextEClass, WORKFLOW_CONTEXT__LOG);
		createEAttribute(workflowContextEClass, WORKFLOW_CONTEXT__LOG_LEVEL);

		workflowEngineEClass = createEClass(WORKFLOW_ENGINE);
		createEReference(workflowEngineEClass, WORKFLOW_ENGINE__WORKFLOW);
		createEReference(workflowEngineEClass, WORKFLOW_ENGINE__CONTEXT);
		createEReference(workflowEngineEClass, WORKFLOW_ENGINE__ENGINES);

		workflowStateMapEClass = createEClass(WORKFLOW_STATE_MAP);
		createEReference(workflowStateMapEClass, WORKFLOW_STATE_MAP__KEY);
		createEReference(workflowStateMapEClass, WORKFLOW_STATE_MAP__VALUE);

		workflowParameterMapEClass = createEClass(WORKFLOW_PARAMETER_MAP);
		createEReference(workflowParameterMapEClass, WORKFLOW_PARAMETER_MAP__KEY);
		createEReference(workflowParameterMapEClass, WORKFLOW_PARAMETER_MAP__VALUE);

		workflowStateResolutionStrategyEClass = createEClass(WORKFLOW_STATE_RESOLUTION_STRATEGY);

		workflowRunnableEClass = createEClass(WORKFLOW_RUNNABLE);

		workflowRunnerEClass = createEClass(WORKFLOW_RUNNER);
		createEReference(workflowRunnerEClass, WORKFLOW_RUNNER__CONTEXT);
		createEReference(workflowRunnerEClass, WORKFLOW_RUNNER__COMPONENT);

		workflowStateResetterEClass = createEClass(WORKFLOW_STATE_RESETTER);
		createEReference(workflowStateResetterEClass, WORKFLOW_STATE_RESETTER__CONTEXT);

		workflowLogEClass = createEClass(WORKFLOW_LOG);
		createEAttribute(workflowLogEClass, WORKFLOW_LOG__ENTRIES);
		createEReference(workflowLogEClass, WORKFLOW_LOG__ERRORS);
		createEReference(workflowLogEClass, WORKFLOW_LOG__WARNINGS);
		createEReference(workflowLogEClass, WORKFLOW_LOG__INFOS);
		createEReference(workflowLogEClass, WORKFLOW_LOG__DEBUGS);
		createEAttribute(workflowLogEClass, WORKFLOW_LOG__LOG_LEVEL);

		workflowLogEntryEClass = createEClass(WORKFLOW_LOG_ENTRY);
		createEAttribute(workflowLogEntryEClass, WORKFLOW_LOG_ENTRY__TYPE);
		createEAttribute(workflowLogEntryEClass, WORKFLOW_LOG_ENTRY__TIMESTAMP);
		createEAttribute(workflowLogEntryEClass, WORKFLOW_LOG_ENTRY__MESSAGE);

		workflowLogMapEClass = createEClass(WORKFLOW_LOG_MAP);
		createEReference(workflowLogMapEClass, WORKFLOW_LOG_MAP__KEY);
		createEReference(workflowLogMapEClass, WORKFLOW_LOG_MAP__VALUE);

		workflowLogResetterEClass = createEClass(WORKFLOW_LOG_RESETTER);
		createEReference(workflowLogResetterEClass, WORKFLOW_LOG_RESETTER__CONTEXT);

		workflowEngineProxyEClass = createEClass(WORKFLOW_ENGINE_PROXY);
		createEReference(workflowEngineProxyEClass, WORKFLOW_ENGINE_PROXY__TARGET_ENGINE);

		// Create enums
		workflowLogEntryTypeEEnum = createEEnum(WORKFLOW_LOG_ENTRY_TYPE);

		// Create data types
		executorServiceEDataType = createEDataType(EXECUTOR_SERVICE);
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
		StatePackage theStatePackage = (StatePackage)EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI);
		WorkflowPackage theWorkflowPackage = (WorkflowPackage)EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStatePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workflowEngineEClass.getESuperTypes().add(this.getWorkflowRunnable());
		workflowRunnerEClass.getESuperTypes().add(this.getWorkflowRunnable());
		workflowStateResetterEClass.getESuperTypes().add(theWorkflowPackage.getIWorkflowVisitor());
		workflowLogResetterEClass.getESuperTypes().add(theWorkflowPackage.getIWorkflowVisitor());
		workflowEngineProxyEClass.getESuperTypes().add(this.getWorkflowEngine());

		// Initialize classes and features; add operations and parameters
		initEClass(workflowContextEClass, WorkflowContext.class, "WorkflowContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWorkflowContext_Parameters(), this.getWorkflowParameterMap(), null, "parameters", null, 0, -1, WorkflowContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWorkflowContext_ThreadPool(), this.getExecutorService(), "threadPool", null, 0, 1, WorkflowContext.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowContext_States(), this.getWorkflowStateMap(), null, "states", null, 0, -1, WorkflowContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowContext_Log(), this.getWorkflowLogMap(), null, "log", null, 0, -1, WorkflowContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWorkflowContext_LogLevel(), this.getWorkflowLogEntryType(), "logLevel", null, 0, 1, WorkflowContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(workflowContextEClass, null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowContextEClass, null, "resetState", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowContextEClass, null, "resetLog", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowEngineEClass, WorkflowEngine.class, "WorkflowEngine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWorkflowEngine_Workflow(), theWorkflowPackage.getWorkflowComponent(), null, "workflow", null, 1, 1, WorkflowEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowEngine_Context(), this.getWorkflowContext(), null, "context", null, 1, 1, WorkflowEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowEngine_Engines(), this.getWorkflowEngine(), null, "engines", null, 0, -1, WorkflowEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(workflowEngineEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(workflowEngineEClass, null, "reset", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowStateMapEClass, Map.Entry.class, "WorkflowStateMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWorkflowStateMap_Key(), theWorkflowPackage.getWorkflowComponent(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowStateMap_Value(), theStatePackage.getWorkflowState(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowParameterMapEClass, Map.Entry.class, "WorkflowParameterMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWorkflowParameterMap_Key(), theWorkflowPackage.getWorkflowParameter(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowParameterMap_Value(), theEcorePackage.getEObject(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowStateResolutionStrategyEClass, WorkflowStateResolutionStrategy.class, "WorkflowStateResolutionStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = addEOperation(workflowStateResolutionStrategyEClass, theStatePackage.getWorkflowState(), "resolve", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theWorkflowPackage.getWorkflowCompositeComponent(), "workflow", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowRunnableEClass, Runnable.class, "WorkflowRunnable", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(workflowRunnableEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowRunnerEClass, WorkflowRunner.class, "WorkflowRunner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWorkflowRunner_Context(), this.getWorkflowContext(), null, "context", null, 1, 1, WorkflowRunner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowRunner_Component(), theWorkflowPackage.getWorkflowComponent(), null, "component", null, 1, 1, WorkflowRunner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(workflowRunnerEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowStateResetterEClass, WorkflowStateResetter.class, "WorkflowStateResetter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWorkflowStateResetter_Context(), this.getWorkflowContext(), null, "context", null, 1, 1, WorkflowStateResetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowStateResetterEClass, null, "visitUnitOfWork", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theWorkflowPackage.getWorkflowUnitOfWork(), "unitOfWork", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowStateResetterEClass, null, "visitComposite", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theWorkflowPackage.getWorkflowCompositeComponent(), "composite", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowLogEClass, WorkflowLog.class, "WorkflowLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getWorkflowLog_Entries(), ecorePackage.getEFeatureMapEntry(), "entries", null, 0, -1, WorkflowLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowLog_Errors(), this.getWorkflowLogEntry(), null, "errors", null, 0, -1, WorkflowLog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowLog_Warnings(), this.getWorkflowLogEntry(), null, "warnings", null, 0, -1, WorkflowLog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowLog_Infos(), this.getWorkflowLogEntry(), null, "infos", null, 0, -1, WorkflowLog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowLog_Debugs(), this.getWorkflowLogEntry(), null, "debugs", null, 0, -1, WorkflowLog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWorkflowLog_LogLevel(), this.getWorkflowLogEntryType(), "logLevel", null, 0, 1, WorkflowLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowLogEClass, null, "logError", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowLogEClass, null, "logWarning", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowLogEClass, null, "logInfo", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowLogEClass, null, "logDebug", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowLogEntryEClass, WorkflowLogEntry.class, "WorkflowLogEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getWorkflowLogEntry_Type(), this.getWorkflowLogEntryType(), "type", null, 1, 1, WorkflowLogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWorkflowLogEntry_Timestamp(), theEcorePackage.getELong(), "timestamp", null, 0, 1, WorkflowLogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWorkflowLogEntry_Message(), theEcorePackage.getEString(), "message", null, 1, 1, WorkflowLogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowLogMapEClass, Map.Entry.class, "WorkflowLogMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWorkflowLogMap_Key(), theWorkflowPackage.getWorkflowComponent(), null, "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowLogMap_Value(), this.getWorkflowLog(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowLogResetterEClass, WorkflowLogResetter.class, "WorkflowLogResetter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWorkflowLogResetter_Context(), this.getWorkflowContext(), null, "context", null, 1, 1, WorkflowLogResetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowLogResetterEClass, null, "visitUnitOfWork", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theWorkflowPackage.getWorkflowUnitOfWork(), "unitOfWork", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowLogResetterEClass, null, "visitComposite", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theWorkflowPackage.getWorkflowCompositeComponent(), "composite", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowEngineProxyEClass, WorkflowEngineProxy.class, "WorkflowEngineProxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWorkflowEngineProxy_TargetEngine(), this.getWorkflowEngine(), null, "targetEngine", null, 1, 1, WorkflowEngineProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(workflowLogEntryTypeEEnum, WorkflowLogEntryType.class, "WorkflowLogEntryType"); //$NON-NLS-1$
		addEEnumLiteral(workflowLogEntryTypeEEnum, WorkflowLogEntryType.ERROR);
		addEEnumLiteral(workflowLogEntryTypeEEnum, WorkflowLogEntryType.WARNING);
		addEEnumLiteral(workflowLogEntryTypeEEnum, WorkflowLogEntryType.INFO);
		addEEnumLiteral(workflowLogEntryTypeEEnum, WorkflowLogEntryType.DEBUG);

		// Initialize data types
		initEDataType(executorServiceEDataType, ExecutorService.class, "ExecutorService", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		 //$NON-NLS-1$
		addAnnotation
		  (getWorkflowLog_Entries(), 
		   source, 
		   new String[] {
			 "kind", "group" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWorkflowLog_Errors(), 
		   source, 
		   new String[] {
			 "group", "#entries" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWorkflowLog_Warnings(), 
		   source, 
		   new String[] {
			 "group", "#entries" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWorkflowLog_Infos(), 
		   source, 
		   new String[] {
			 "group", "#entries" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getWorkflowLog_Debugs(), 
		   source, 
		   new String[] {
			 "group", "#entries" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //RuntimePackageImpl
