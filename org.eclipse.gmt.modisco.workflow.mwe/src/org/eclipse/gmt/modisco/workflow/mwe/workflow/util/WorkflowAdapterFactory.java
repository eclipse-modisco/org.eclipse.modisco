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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class WorkflowAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WorkflowPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WorkflowPackage.eINSTANCE;
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
	protected WorkflowSwitch<Adapter> modelSwitch =
		new WorkflowSwitch<Adapter>() {
			@Override
			public Adapter caseWorkflow(Workflow object) {
				return createWorkflowAdapter();
			}
			@Override
			public Adapter caseWorkflowComponent(WorkflowComponent object) {
				return createWorkflowComponentAdapter();
			}
			@Override
			public Adapter caseWorkflowCompositeComponent(WorkflowCompositeComponent object) {
				return createWorkflowCompositeComponentAdapter();
			}
			@Override
			public Adapter caseWorkflowUnitOfWork(WorkflowUnitOfWork object) {
				return createWorkflowUnitOfWorkAdapter();
			}
			@Override
			public Adapter caseWorkflowParameter(WorkflowParameter object) {
				return createWorkflowParameterAdapter();
			}
			@Override
			public Adapter caseWorkflowParameterValueStrategy(WorkflowParameterValueStrategy object) {
				return createWorkflowParameterValueStrategyAdapter();
			}
			@Override
			public Adapter caseWorkflowParameterConnection(WorkflowParameterConnection object) {
				return createWorkflowParameterConnectionAdapter();
			}
			@Override
			public Adapter caseWorkflowParameterSimpleValueStrategy(WorkflowParameterSimpleValueStrategy object) {
				return createWorkflowParameterSimpleValueStrategyAdapter();
			}
			@Override
			public Adapter caseIWorkflowVisitor(IWorkflowVisitor object) {
				return createIWorkflowVisitorAdapter();
			}
			@Override
			public Adapter caseWorkflowComponentProxy(WorkflowComponentProxy object) {
				return createWorkflowComponentProxyAdapter();
			}
			@Override
			public Adapter caseWorkflowComponentMinimalist(WorkflowComponentMinimalist object) {
				return createWorkflowComponentMinimalistAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent
	 * @generated
	 */
	public Adapter createWorkflowComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent <em>Composite Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent
	 * @generated
	 */
	public Adapter createWorkflowCompositeComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowUnitOfWork <em>Unit Of Work</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowUnitOfWork
	 * @generated
	 */
	public Adapter createWorkflowUnitOfWorkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter
	 * @generated
	 */
	public Adapter createWorkflowParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterValueStrategy <em>Parameter Value Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterValueStrategy
	 * @generated
	 */
	public Adapter createWorkflowParameterValueStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection <em>Parameter Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection
	 * @generated
	 */
	public Adapter createWorkflowParameterConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterSimpleValueStrategy <em>Parameter Simple Value Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterSimpleValueStrategy
	 * @generated
	 */
	public Adapter createWorkflowParameterSimpleValueStrategyAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponentProxy <em>Component Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponentProxy
	 * @generated
	 */
	public Adapter createWorkflowComponentProxyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponentMinimalist <em>Component Minimalist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponentMinimalist
	 * @generated
	 */
	public Adapter createWorkflowComponentMinimalistAdapter() {
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

} //WorkflowAdapterFactory
