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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class StateFactoryImpl extends EFactoryImpl implements StateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateFactory init() {
		try {
			StateFactory theStateFactory = (StateFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/gmt/modisco/workflow/mwe/workflow/runtime/state");  //$NON-NLS-1$
			if (theStateFactory != null) {
				return theStateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateFactoryImpl() {
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
			case StatePackage.WORKFLOW_IDLE_STATE: return createWorkflowIdleState();
			case StatePackage.WORKFLOW_RUNNING_STATE: return createWorkflowRunningState();
			case StatePackage.WORKFLOW_DONE_STATE: return createWorkflowDoneState();
			case StatePackage.WORKFLOW_SUCCESS_STATE: return createWorkflowSuccessState();
			case StatePackage.WORKFLOW_FAILED_STATE: return createWorkflowFailedState();
			case StatePackage.WORKFLOW_ERROR_STATE: return createWorkflowErrorState();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowIdleState createWorkflowIdleState() {
		WorkflowIdleStateImpl workflowIdleState = new WorkflowIdleStateImpl();
		return workflowIdleState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowRunningState createWorkflowRunningState() {
		WorkflowRunningStateImpl workflowRunningState = new WorkflowRunningStateImpl();
		return workflowRunningState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowDoneState createWorkflowDoneState() {
		WorkflowDoneStateImpl workflowDoneState = new WorkflowDoneStateImpl();
		return workflowDoneState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowSuccessState createWorkflowSuccessState() {
		WorkflowSuccessStateImpl workflowSuccessState = new WorkflowSuccessStateImpl();
		return workflowSuccessState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowFailedState createWorkflowFailedState() {
		WorkflowFailedStateImpl workflowFailedState = new WorkflowFailedStateImpl();
		return workflowFailedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowErrorState createWorkflowErrorState() {
		WorkflowErrorStateImpl workflowErrorState = new WorkflowErrorStateImpl();
		return workflowErrorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatePackage getStatePackage() {
		return (StatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatePackage getPackage() {
		return StatePackage.eINSTANCE;
	}

} //StateFactoryImpl
