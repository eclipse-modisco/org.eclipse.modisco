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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage;

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
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimeFactory
 * @model kind="package"
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface RuntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "runtime"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/gmt/modisco/workflow/mwe/workflow/runtime"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimePackage eINSTANCE = org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowContextImpl <em>Workflow Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowContextImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowContext()
	 * @generated
	 */
	int WORKFLOW_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CONTEXT__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Thread Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CONTEXT__THREAD_POOL = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CONTEXT__STATES = 2;

	/**
	 * The feature id for the '<em><b>Log</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CONTEXT__LOG = 3;

	/**
	 * The feature id for the '<em><b>Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CONTEXT__LOG_LEVEL = 4;

	/**
	 * The number of structural features of the '<em>Workflow Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CONTEXT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowRunnableImpl <em>Workflow Runnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowRunnableImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowRunnable()
	 * @generated
	 */
	int WORKFLOW_RUNNABLE = 5;

	/**
	 * The number of structural features of the '<em>Workflow Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUNNABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowEngineImpl <em>Workflow Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowEngineImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowEngine()
	 * @generated
	 */
	int WORKFLOW_ENGINE = 1;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ENGINE__WORKFLOW = WORKFLOW_RUNNABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ENGINE__CONTEXT = WORKFLOW_RUNNABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ENGINE__ENGINES = WORKFLOW_RUNNABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Workflow Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ENGINE_FEATURE_COUNT = WORKFLOW_RUNNABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowStateMapImpl <em>Workflow State Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowStateMapImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowStateMap()
	 * @generated
	 */
	int WORKFLOW_STATE_MAP = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STATE_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STATE_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Workflow State Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STATE_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowParameterMapImpl <em>Workflow Parameter Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowParameterMapImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowParameterMap()
	 * @generated
	 */
	int WORKFLOW_PARAMETER_MAP = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PARAMETER_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PARAMETER_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Workflow Parameter Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PARAMETER_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowStateResolutionStrategyImpl <em>Workflow State Resolution Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowStateResolutionStrategyImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowStateResolutionStrategy()
	 * @generated
	 */
	int WORKFLOW_STATE_RESOLUTION_STRATEGY = 4;

	/**
	 * The number of structural features of the '<em>Workflow State Resolution Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STATE_RESOLUTION_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowRunnerImpl <em>Workflow Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowRunnerImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowRunner()
	 * @generated
	 */
	int WORKFLOW_RUNNER = 6;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUNNER__CONTEXT = WORKFLOW_RUNNABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUNNER__COMPONENT = WORKFLOW_RUNNABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workflow Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUNNER_FEATURE_COUNT = WORKFLOW_RUNNABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowStateResetterImpl <em>Workflow State Resetter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowStateResetterImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowStateResetter()
	 * @generated
	 */
	int WORKFLOW_STATE_RESETTER = 7;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STATE_RESETTER__CONTEXT = WorkflowPackage.IWORKFLOW_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow State Resetter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STATE_RESETTER_FEATURE_COUNT = WorkflowPackage.IWORKFLOW_VISITOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogImpl <em>Workflow Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowLog()
	 * @generated
	 */
	int WORKFLOW_LOG = 8;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LOG__ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Errors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LOG__ERRORS = 1;

	/**
	 * The feature id for the '<em><b>Warnings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LOG__WARNINGS = 2;

	/**
	 * The feature id for the '<em><b>Infos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LOG__INFOS = 3;

	/**
	 * The feature id for the '<em><b>Debugs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LOG__DEBUGS = 4;

	/**
	 * The feature id for the '<em><b>Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LOG__LOG_LEVEL = 5;

	/**
	 * The number of structural features of the '<em>Workflow Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LOG_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogEntryImpl <em>Workflow Log Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogEntryImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowLogEntry()
	 * @generated
	 */
	int WORKFLOW_LOG_ENTRY = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LOG_ENTRY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LOG_ENTRY__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LOG_ENTRY__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Workflow Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LOG_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogMapImpl <em>Workflow Log Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogMapImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowLogMap()
	 * @generated
	 */
	int WORKFLOW_LOG_MAP = 10;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LOG_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LOG_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Workflow Log Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LOG_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogResetterImpl <em>Workflow Log Resetter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogResetterImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowLogResetter()
	 * @generated
	 */
	int WORKFLOW_LOG_RESETTER = 11;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LOG_RESETTER__CONTEXT = WorkflowPackage.IWORKFLOW_VISITOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow Log Resetter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LOG_RESETTER_FEATURE_COUNT = WorkflowPackage.IWORKFLOW_VISITOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowEngineProxyImpl <em>Workflow Engine Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowEngineProxyImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowEngineProxy()
	 * @generated
	 */
	int WORKFLOW_ENGINE_PROXY = 12;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ENGINE_PROXY__WORKFLOW = WORKFLOW_ENGINE__WORKFLOW;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ENGINE_PROXY__CONTEXT = WORKFLOW_ENGINE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ENGINE_PROXY__ENGINES = WORKFLOW_ENGINE__ENGINES;

	/**
	 * The feature id for the '<em><b>Target Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ENGINE_PROXY__TARGET_ENGINE = WORKFLOW_ENGINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow Engine Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ENGINE_PROXY_FEATURE_COUNT = WORKFLOW_ENGINE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntryType <em>Workflow Log Entry Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntryType
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowLogEntryType()
	 * @generated
	 */
	int WORKFLOW_LOG_ENTRY_TYPE = 13;

	/**
	 * The meta object id for the '<em>Executor Service</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.ExecutorService
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getExecutorService()
	 * @generated
	 */
	int EXECUTOR_SERVICE = 14;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext <em>Workflow Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Context</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext
	 * @generated
	 */
	EClass getWorkflowContext();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Parameters</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext#getParameters()
	 * @see #getWorkflowContext()
	 * @generated
	 */
	EReference getWorkflowContext_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext#getThreadPool <em>Thread Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Pool</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext#getThreadPool()
	 * @see #getWorkflowContext()
	 * @generated
	 */
	EAttribute getWorkflowContext_ThreadPool();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>States</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext#getStates()
	 * @see #getWorkflowContext()
	 * @generated
	 */
	EReference getWorkflowContext_States();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Log</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext#getLog()
	 * @see #getWorkflowContext()
	 * @generated
	 */
	EReference getWorkflowContext_Log();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext#getLogLevel <em>Log Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Level</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext#getLogLevel()
	 * @see #getWorkflowContext()
	 * @generated
	 */
	EAttribute getWorkflowContext_LogLevel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngine <em>Workflow Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Engine</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngine
	 * @generated
	 */
	EClass getWorkflowEngine();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngine#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Workflow</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngine#getWorkflow()
	 * @see #getWorkflowEngine()
	 * @generated
	 */
	EReference getWorkflowEngine_Workflow();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngine#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngine#getContext()
	 * @see #getWorkflowEngine()
	 * @generated
	 */
	EReference getWorkflowEngine_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngine#getEngines <em>Engines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Engines</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngine#getEngines()
	 * @see #getWorkflowEngine()
	 * @generated
	 */
	EReference getWorkflowEngine_Engines();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Workflow State Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow State Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent" keyRequired="true"
	 *        valueType="org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowState" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	EClass getWorkflowStateMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowStateMap()
	 * @generated
	 */
	EReference getWorkflowStateMap_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowStateMap()
	 * @generated
	 */
	EReference getWorkflowStateMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Workflow Parameter Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Parameter Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter" keyRequired="true"
	 *        valueType="org.eclipse.emf.ecore.EObject" valueContainment="true"
	 * @generated
	 */
	EClass getWorkflowParameterMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowParameterMap()
	 * @generated
	 */
	EReference getWorkflowParameterMap_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowParameterMap()
	 * @generated
	 */
	EReference getWorkflowParameterMap_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowStateResolutionStrategy <em>Workflow State Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow State Resolution Strategy</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowStateResolutionStrategy
	 * @generated
	 */
	EClass getWorkflowStateResolutionStrategy();

	/**
	 * Returns the meta object for class '{@link java.lang.Runnable <em>Workflow Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Runnable</em>'.
	 * @see java.lang.Runnable
	 * @model instanceClass="java.lang.Runnable"
	 * @generated
	 */
	EClass getWorkflowRunnable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowRunner <em>Workflow Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Runner</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowRunner
	 * @generated
	 */
	EClass getWorkflowRunner();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowRunner#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowRunner#getContext()
	 * @see #getWorkflowRunner()
	 * @generated
	 */
	EReference getWorkflowRunner_Context();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowRunner#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowRunner#getComponent()
	 * @see #getWorkflowRunner()
	 * @generated
	 */
	EReference getWorkflowRunner_Component();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowStateResetter <em>Workflow State Resetter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow State Resetter</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowStateResetter
	 * @generated
	 */
	EClass getWorkflowStateResetter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowStateResetter#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowStateResetter#getContext()
	 * @see #getWorkflowStateResetter()
	 * @generated
	 */
	EReference getWorkflowStateResetter_Context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog <em>Workflow Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Log</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog
	 * @generated
	 */
	EClass getWorkflowLog();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Entries</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getEntries()
	 * @see #getWorkflowLog()
	 * @generated
	 */
	EAttribute getWorkflowLog_Entries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Errors</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getErrors()
	 * @see #getWorkflowLog()
	 * @generated
	 */
	EReference getWorkflowLog_Errors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getWarnings <em>Warnings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Warnings</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getWarnings()
	 * @see #getWorkflowLog()
	 * @generated
	 */
	EReference getWorkflowLog_Warnings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getInfos <em>Infos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infos</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getInfos()
	 * @see #getWorkflowLog()
	 * @generated
	 */
	EReference getWorkflowLog_Infos();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getDebugs <em>Debugs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Debugs</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getDebugs()
	 * @see #getWorkflowLog()
	 * @generated
	 */
	EReference getWorkflowLog_Debugs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getLogLevel <em>Log Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Level</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getLogLevel()
	 * @see #getWorkflowLog()
	 * @generated
	 */
	EAttribute getWorkflowLog_LogLevel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntry <em>Workflow Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Log Entry</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntry
	 * @generated
	 */
	EClass getWorkflowLogEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntry#getType()
	 * @see #getWorkflowLogEntry()
	 * @generated
	 */
	EAttribute getWorkflowLogEntry_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntry#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntry#getTimestamp()
	 * @see #getWorkflowLogEntry()
	 * @generated
	 */
	EAttribute getWorkflowLogEntry_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntry#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntry#getMessage()
	 * @see #getWorkflowLogEntry()
	 * @generated
	 */
	EAttribute getWorkflowLogEntry_Message();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Workflow Log Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Log Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent" keyRequired="true"
	 *        valueType="org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	EClass getWorkflowLogMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowLogMap()
	 * @generated
	 */
	EReference getWorkflowLogMap_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getWorkflowLogMap()
	 * @generated
	 */
	EReference getWorkflowLogMap_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogResetter <em>Workflow Log Resetter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Log Resetter</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogResetter
	 * @generated
	 */
	EClass getWorkflowLogResetter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogResetter#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogResetter#getContext()
	 * @see #getWorkflowLogResetter()
	 * @generated
	 */
	EReference getWorkflowLogResetter_Context();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngineProxy <em>Workflow Engine Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Engine Proxy</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngineProxy
	 * @generated
	 */
	EClass getWorkflowEngineProxy();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngineProxy#getTargetEngine <em>Target Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Engine</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngineProxy#getTargetEngine()
	 * @see #getWorkflowEngineProxy()
	 * @generated
	 */
	EReference getWorkflowEngineProxy_TargetEngine();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntryType <em>Workflow Log Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Workflow Log Entry Type</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntryType
	 * @generated
	 */
	EEnum getWorkflowLogEntryType();

	/**
	 * Returns the meta object for data type '{@link java.util.concurrent.ExecutorService <em>Executor Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Executor Service</em>'.
	 * @see java.util.concurrent.ExecutorService
	 * @model instanceClass="java.util.concurrent.ExecutorService"
	 * @generated
	 */
	EDataType getExecutorService();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RuntimeFactory getRuntimeFactory();

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
	 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
	 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
	 */
	@Deprecated
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowContextImpl <em>Workflow Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowContextImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowContext()
		 * @generated
		 */
		EClass WORKFLOW_CONTEXT = eINSTANCE.getWorkflowContext();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_CONTEXT__PARAMETERS = eINSTANCE.getWorkflowContext_Parameters();

		/**
		 * The meta object literal for the '<em><b>Thread Pool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_CONTEXT__THREAD_POOL = eINSTANCE.getWorkflowContext_ThreadPool();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_CONTEXT__STATES = eINSTANCE.getWorkflowContext_States();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_CONTEXT__LOG = eINSTANCE.getWorkflowContext_Log();

		/**
		 * The meta object literal for the '<em><b>Log Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_CONTEXT__LOG_LEVEL = eINSTANCE.getWorkflowContext_LogLevel();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowEngineImpl <em>Workflow Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowEngineImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowEngine()
		 * @generated
		 */
		EClass WORKFLOW_ENGINE = eINSTANCE.getWorkflowEngine();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_ENGINE__WORKFLOW = eINSTANCE.getWorkflowEngine_Workflow();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_ENGINE__CONTEXT = eINSTANCE.getWorkflowEngine_Context();

		/**
		 * The meta object literal for the '<em><b>Engines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_ENGINE__ENGINES = eINSTANCE.getWorkflowEngine_Engines();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowStateMapImpl <em>Workflow State Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowStateMapImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowStateMap()
		 * @generated
		 */
		EClass WORKFLOW_STATE_MAP = eINSTANCE.getWorkflowStateMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_STATE_MAP__KEY = eINSTANCE.getWorkflowStateMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_STATE_MAP__VALUE = eINSTANCE.getWorkflowStateMap_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowParameterMapImpl <em>Workflow Parameter Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowParameterMapImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowParameterMap()
		 * @generated
		 */
		EClass WORKFLOW_PARAMETER_MAP = eINSTANCE.getWorkflowParameterMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_PARAMETER_MAP__KEY = eINSTANCE.getWorkflowParameterMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_PARAMETER_MAP__VALUE = eINSTANCE.getWorkflowParameterMap_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowStateResolutionStrategyImpl <em>Workflow State Resolution Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowStateResolutionStrategyImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowStateResolutionStrategy()
		 * @generated
		 */
		EClass WORKFLOW_STATE_RESOLUTION_STRATEGY = eINSTANCE.getWorkflowStateResolutionStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowRunnableImpl <em>Workflow Runnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowRunnableImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowRunnable()
		 * @generated
		 */
		EClass WORKFLOW_RUNNABLE = eINSTANCE.getWorkflowRunnable();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowRunnerImpl <em>Workflow Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowRunnerImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowRunner()
		 * @generated
		 */
		EClass WORKFLOW_RUNNER = eINSTANCE.getWorkflowRunner();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_RUNNER__CONTEXT = eINSTANCE.getWorkflowRunner_Context();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_RUNNER__COMPONENT = eINSTANCE.getWorkflowRunner_Component();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowStateResetterImpl <em>Workflow State Resetter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowStateResetterImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowStateResetter()
		 * @generated
		 */
		EClass WORKFLOW_STATE_RESETTER = eINSTANCE.getWorkflowStateResetter();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_STATE_RESETTER__CONTEXT = eINSTANCE.getWorkflowStateResetter_Context();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogImpl <em>Workflow Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowLog()
		 * @generated
		 */
		EClass WORKFLOW_LOG = eINSTANCE.getWorkflowLog();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_LOG__ENTRIES = eINSTANCE.getWorkflowLog_Entries();

		/**
		 * The meta object literal for the '<em><b>Errors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_LOG__ERRORS = eINSTANCE.getWorkflowLog_Errors();

		/**
		 * The meta object literal for the '<em><b>Warnings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_LOG__WARNINGS = eINSTANCE.getWorkflowLog_Warnings();

		/**
		 * The meta object literal for the '<em><b>Infos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_LOG__INFOS = eINSTANCE.getWorkflowLog_Infos();

		/**
		 * The meta object literal for the '<em><b>Debugs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_LOG__DEBUGS = eINSTANCE.getWorkflowLog_Debugs();

		/**
		 * The meta object literal for the '<em><b>Log Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_LOG__LOG_LEVEL = eINSTANCE.getWorkflowLog_LogLevel();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogEntryImpl <em>Workflow Log Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogEntryImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowLogEntry()
		 * @generated
		 */
		EClass WORKFLOW_LOG_ENTRY = eINSTANCE.getWorkflowLogEntry();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_LOG_ENTRY__TYPE = eINSTANCE.getWorkflowLogEntry_Type();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_LOG_ENTRY__TIMESTAMP = eINSTANCE.getWorkflowLogEntry_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_LOG_ENTRY__MESSAGE = eINSTANCE.getWorkflowLogEntry_Message();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogMapImpl <em>Workflow Log Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogMapImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowLogMap()
		 * @generated
		 */
		EClass WORKFLOW_LOG_MAP = eINSTANCE.getWorkflowLogMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_LOG_MAP__KEY = eINSTANCE.getWorkflowLogMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_LOG_MAP__VALUE = eINSTANCE.getWorkflowLogMap_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogResetterImpl <em>Workflow Log Resetter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogResetterImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowLogResetter()
		 * @generated
		 */
		EClass WORKFLOW_LOG_RESETTER = eINSTANCE.getWorkflowLogResetter();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_LOG_RESETTER__CONTEXT = eINSTANCE.getWorkflowLogResetter_Context();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowEngineProxyImpl <em>Workflow Engine Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowEngineProxyImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowEngineProxy()
		 * @generated
		 */
		EClass WORKFLOW_ENGINE_PROXY = eINSTANCE.getWorkflowEngineProxy();

		/**
		 * The meta object literal for the '<em><b>Target Engine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_ENGINE_PROXY__TARGET_ENGINE = eINSTANCE.getWorkflowEngineProxy_TargetEngine();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntryType <em>Workflow Log Entry Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntryType
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getWorkflowLogEntryType()
		 * @generated
		 */
		EEnum WORKFLOW_LOG_ENTRY_TYPE = eINSTANCE.getWorkflowLogEntryType();

		/**
		 * The meta object literal for the '<em>Executor Service</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.ExecutorService
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl#getExecutorService()
		 * @generated
		 */
		EDataType EXECUTOR_SERVICE = eINSTANCE.getExecutorService();

	}

} //RuntimePackage
