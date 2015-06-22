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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.StateFactory
 * @model kind="package"
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface StatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "state"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/gmt/modisco/workflow/mwe/workflow/runtime/state"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatePackage eINSTANCE = org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.StatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowStateImpl <em>Workflow State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowStateImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.StatePackageImpl#getWorkflowState()
	 * @generated
	 */
	int WORKFLOW_STATE = 0;

	/**
	 * The number of structural features of the '<em>Workflow State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STATE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowIdleStateImpl <em>Workflow Idle State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowIdleStateImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.StatePackageImpl#getWorkflowIdleState()
	 * @generated
	 */
	int WORKFLOW_IDLE_STATE = 1;

	/**
	 * The number of structural features of the '<em>Workflow Idle State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_IDLE_STATE_FEATURE_COUNT = WORKFLOW_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowRunningStateImpl <em>Workflow Running State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowRunningStateImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.StatePackageImpl#getWorkflowRunningState()
	 * @generated
	 */
	int WORKFLOW_RUNNING_STATE = 2;

	/**
	 * The number of structural features of the '<em>Workflow Running State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUNNING_STATE_FEATURE_COUNT = WORKFLOW_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowDoneStateImpl <em>Workflow Done State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowDoneStateImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.StatePackageImpl#getWorkflowDoneState()
	 * @generated
	 */
	int WORKFLOW_DONE_STATE = 3;

	/**
	 * The number of structural features of the '<em>Workflow Done State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DONE_STATE_FEATURE_COUNT = WORKFLOW_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowSuccessStateImpl <em>Workflow Success State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowSuccessStateImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.StatePackageImpl#getWorkflowSuccessState()
	 * @generated
	 */
	int WORKFLOW_SUCCESS_STATE = 4;

	/**
	 * The number of structural features of the '<em>Workflow Success State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_SUCCESS_STATE_FEATURE_COUNT = WORKFLOW_DONE_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowFailedStateImpl <em>Workflow Failed State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowFailedStateImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.StatePackageImpl#getWorkflowFailedState()
	 * @generated
	 */
	int WORKFLOW_FAILED_STATE = 5;

	/**
	 * The number of structural features of the '<em>Workflow Failed State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FAILED_STATE_FEATURE_COUNT = WORKFLOW_DONE_STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowErrorStateImpl <em>Workflow Error State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowErrorStateImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.StatePackageImpl#getWorkflowErrorState()
	 * @generated
	 */
	int WORKFLOW_ERROR_STATE = 6;

	/**
	 * The number of structural features of the '<em>Workflow Error State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ERROR_STATE_FEATURE_COUNT = WORKFLOW_DONE_STATE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowState <em>Workflow State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow State</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowState
	 * @generated
	 */
	EClass getWorkflowState();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowIdleState <em>Workflow Idle State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Idle State</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowIdleState
	 * @generated
	 */
	EClass getWorkflowIdleState();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowRunningState <em>Workflow Running State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Running State</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowRunningState
	 * @generated
	 */
	EClass getWorkflowRunningState();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowDoneState <em>Workflow Done State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Done State</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowDoneState
	 * @generated
	 */
	EClass getWorkflowDoneState();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowSuccessState <em>Workflow Success State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Success State</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowSuccessState
	 * @generated
	 */
	EClass getWorkflowSuccessState();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowFailedState <em>Workflow Failed State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Failed State</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowFailedState
	 * @generated
	 */
	EClass getWorkflowFailedState();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowErrorState <em>Workflow Error State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Error State</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowErrorState
	 * @generated
	 */
	EClass getWorkflowErrorState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StateFactory getStateFactory();

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
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowStateImpl <em>Workflow State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowStateImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.StatePackageImpl#getWorkflowState()
		 * @generated
		 */
		EClass WORKFLOW_STATE = eINSTANCE.getWorkflowState();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowIdleStateImpl <em>Workflow Idle State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowIdleStateImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.StatePackageImpl#getWorkflowIdleState()
		 * @generated
		 */
		EClass WORKFLOW_IDLE_STATE = eINSTANCE.getWorkflowIdleState();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowRunningStateImpl <em>Workflow Running State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowRunningStateImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.StatePackageImpl#getWorkflowRunningState()
		 * @generated
		 */
		EClass WORKFLOW_RUNNING_STATE = eINSTANCE.getWorkflowRunningState();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowDoneStateImpl <em>Workflow Done State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowDoneStateImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.StatePackageImpl#getWorkflowDoneState()
		 * @generated
		 */
		EClass WORKFLOW_DONE_STATE = eINSTANCE.getWorkflowDoneState();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowSuccessStateImpl <em>Workflow Success State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowSuccessStateImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.StatePackageImpl#getWorkflowSuccessState()
		 * @generated
		 */
		EClass WORKFLOW_SUCCESS_STATE = eINSTANCE.getWorkflowSuccessState();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowFailedStateImpl <em>Workflow Failed State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowFailedStateImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.StatePackageImpl#getWorkflowFailedState()
		 * @generated
		 */
		EClass WORKFLOW_FAILED_STATE = eINSTANCE.getWorkflowFailedState();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowErrorStateImpl <em>Workflow Error State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.WorkflowErrorStateImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.StatePackageImpl#getWorkflowErrorState()
		 * @generated
		 */
		EClass WORKFLOW_ERROR_STATE = eINSTANCE.getWorkflowErrorState();

	}

} //StatePackage
