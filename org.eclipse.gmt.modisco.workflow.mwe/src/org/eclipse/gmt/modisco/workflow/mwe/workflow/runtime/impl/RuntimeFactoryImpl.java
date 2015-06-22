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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter;
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
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class RuntimeFactoryImpl extends EFactoryImpl implements RuntimeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RuntimeFactory init() {
		try {
			RuntimeFactory theRuntimeFactory = (RuntimeFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/gmt/modisco/workflow/mwe/workflow/runtime");  //$NON-NLS-1$
			if (theRuntimeFactory != null) {
				return theRuntimeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RuntimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(final EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RuntimePackage.WORKFLOW_CONTEXT: return createWorkflowContext();
			case RuntimePackage.WORKFLOW_ENGINE: return createWorkflowEngine();
			case RuntimePackage.WORKFLOW_STATE_MAP: return (EObject)createWorkflowStateMap();
			case RuntimePackage.WORKFLOW_PARAMETER_MAP: return (EObject)createWorkflowParameterMap();
			case RuntimePackage.WORKFLOW_STATE_RESOLUTION_STRATEGY: return createWorkflowStateResolutionStrategy();
			case RuntimePackage.WORKFLOW_RUNNABLE: return (EObject)createWorkflowRunnable();
			case RuntimePackage.WORKFLOW_RUNNER: return createWorkflowRunner();
			case RuntimePackage.WORKFLOW_STATE_RESETTER: return createWorkflowStateResetter();
			case RuntimePackage.WORKFLOW_LOG: return createWorkflowLog();
			case RuntimePackage.WORKFLOW_LOG_ENTRY: return createWorkflowLogEntry();
			case RuntimePackage.WORKFLOW_LOG_MAP: return (EObject)createWorkflowLogMap();
			case RuntimePackage.WORKFLOW_LOG_RESETTER: return createWorkflowLogResetter();
			case RuntimePackage.WORKFLOW_ENGINE_PROXY: return createWorkflowEngineProxy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); 
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(final EDataType eDataType, final String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RuntimePackage.WORKFLOW_LOG_ENTRY_TYPE:
				return createWorkflowLogEntryTypeFromString(eDataType, initialValue);
			case RuntimePackage.EXECUTOR_SERVICE:
				return createExecutorServiceFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(final EDataType eDataType, final Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RuntimePackage.WORKFLOW_LOG_ENTRY_TYPE:
				return convertWorkflowLogEntryTypeToString(eDataType, instanceValue);
			case RuntimePackage.EXECUTOR_SERVICE:
				return convertExecutorServiceToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowContext createWorkflowContext() {
		WorkflowContextImpl workflowContext = new WorkflowContextImpl();
		return workflowContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowEngine createWorkflowEngine() {
		WorkflowEngineImpl workflowEngine = new WorkflowEngineImpl();
		return workflowEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<WorkflowComponent, WorkflowState> createWorkflowStateMap() {
		WorkflowStateMapImpl workflowStateMap = new WorkflowStateMapImpl();
		return workflowStateMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<WorkflowParameter, EObject> createWorkflowParameterMap() {
		WorkflowParameterMapImpl workflowParameterMap = new WorkflowParameterMapImpl();
		return workflowParameterMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowStateResolutionStrategy createWorkflowStateResolutionStrategy() {
		WorkflowStateResolutionStrategyImpl workflowStateResolutionStrategy = new WorkflowStateResolutionStrategyImpl();
		return workflowStateResolutionStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Runnable createWorkflowRunnable() {
		WorkflowRunnableImpl workflowRunnable = new WorkflowRunnableImpl();
		return workflowRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowRunner createWorkflowRunner() {
		WorkflowRunnerImpl workflowRunner = new WorkflowRunnerImpl();
		return workflowRunner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowStateResetter createWorkflowStateResetter() {
		WorkflowStateResetterImpl workflowStateResetter = new WorkflowStateResetterImpl();
		return workflowStateResetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowLog createWorkflowLog() {
		WorkflowLogImpl workflowLog = new WorkflowLogImpl();
		return workflowLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowLogEntry createWorkflowLogEntry() {
		WorkflowLogEntryImpl workflowLogEntry = new WorkflowLogEntryImpl();
		return workflowLogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<WorkflowComponent, WorkflowLog> createWorkflowLogMap() {
		WorkflowLogMapImpl workflowLogMap = new WorkflowLogMapImpl();
		return workflowLogMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowLogResetter createWorkflowLogResetter() {
		WorkflowLogResetterImpl workflowLogResetter = new WorkflowLogResetterImpl();
		return workflowLogResetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowEngineProxy createWorkflowEngineProxy() {
		WorkflowEngineProxyImpl workflowEngineProxy = new WorkflowEngineProxyImpl();
		return workflowEngineProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowLogEntryType createWorkflowLogEntryTypeFromString(final EDataType eDataType, final String initialValue) {
		WorkflowLogEntryType result = WorkflowLogEntryType.get(initialValue);
		if (result == null)
		 {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkflowLogEntryTypeToString(final EDataType eDataType, final Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutorService createExecutorServiceFromString(final EDataType eDataType, final String initialValue) {
		return (ExecutorService)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutorServiceToString(final EDataType eDataType, final Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimePackage getRuntimePackage() {
		return (RuntimePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RuntimePackage getPackage() {
		return RuntimePackage.eINSTANCE;
	}

} //RuntimeFactoryImpl
