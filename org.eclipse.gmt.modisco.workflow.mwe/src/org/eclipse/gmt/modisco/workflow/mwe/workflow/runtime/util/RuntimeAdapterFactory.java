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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.IWorkflowVisitor;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.*;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowState;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class RuntimeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RuntimePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RuntimePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeSwitch<Adapter> modelSwitch =
		new RuntimeSwitch<Adapter>() {
			@Override
			public Adapter caseWorkflowContext(WorkflowContext object) {
				return createWorkflowContextAdapter();
			}
			@Override
			public Adapter caseWorkflowEngine(WorkflowEngine object) {
				return createWorkflowEngineAdapter();
			}
			@Override
			public Adapter caseWorkflowStateMap(Map.Entry<WorkflowComponent, WorkflowState> object) {
				return createWorkflowStateMapAdapter();
			}
			@Override
			public Adapter caseWorkflowParameterMap(Map.Entry<WorkflowParameter, EObject> object) {
				return createWorkflowParameterMapAdapter();
			}
			@Override
			public Adapter caseWorkflowStateResolutionStrategy(WorkflowStateResolutionStrategy object) {
				return createWorkflowStateResolutionStrategyAdapter();
			}
			@Override
			public Adapter caseWorkflowRunnable(Runnable object) {
				return createWorkflowRunnableAdapter();
			}
			@Override
			public Adapter caseWorkflowRunner(WorkflowRunner object) {
				return createWorkflowRunnerAdapter();
			}
			@Override
			public Adapter caseWorkflowStateResetter(WorkflowStateResetter object) {
				return createWorkflowStateResetterAdapter();
			}
			@Override
			public Adapter caseWorkflowLog(WorkflowLog object) {
				return createWorkflowLogAdapter();
			}
			@Override
			public Adapter caseWorkflowLogEntry(WorkflowLogEntry object) {
				return createWorkflowLogEntryAdapter();
			}
			@Override
			public Adapter caseWorkflowLogMap(Map.Entry<WorkflowComponent, WorkflowLog> object) {
				return createWorkflowLogMapAdapter();
			}
			@Override
			public Adapter caseWorkflowLogResetter(WorkflowLogResetter object) {
				return createWorkflowLogResetterAdapter();
			}
			@Override
			public Adapter caseWorkflowEngineProxy(WorkflowEngineProxy object) {
				return createWorkflowEngineProxyAdapter();
			}
			@Override
			public Adapter caseIWorkflowVisitor(IWorkflowVisitor object) {
				return createIWorkflowVisitorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext <em>Workflow Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext
	 * @generated
	 */
	public Adapter createWorkflowContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngine <em>Workflow Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngine
	 * @generated
	 */
	public Adapter createWorkflowEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Workflow State Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createWorkflowStateMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Workflow Parameter Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createWorkflowParameterMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowStateResolutionStrategy <em>Workflow State Resolution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowStateResolutionStrategy
	 * @generated
	 */
	public Adapter createWorkflowStateResolutionStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.Runnable <em>Workflow Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Runnable
	 * @generated
	 */
	public Adapter createWorkflowRunnableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowRunner <em>Workflow Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowRunner
	 * @generated
	 */
	public Adapter createWorkflowRunnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowStateResetter <em>Workflow State Resetter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowStateResetter
	 * @generated
	 */
	public Adapter createWorkflowStateResetterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog <em>Workflow Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog
	 * @generated
	 */
	public Adapter createWorkflowLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntry <em>Workflow Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntry
	 * @generated
	 */
	public Adapter createWorkflowLogEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Workflow Log Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createWorkflowLogMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogResetter <em>Workflow Log Resetter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogResetter
	 * @generated
	 */
	public Adapter createWorkflowLogResetterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngineProxy <em>Workflow Engine Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngineProxy
	 * @generated
	 */
	public Adapter createWorkflowEngineProxyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.IWorkflowVisitor <em>IWorkflow Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.IWorkflowVisitor
	 * @generated
	 */
	public Adapter createIWorkflowVisitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RuntimeAdapterFactory
