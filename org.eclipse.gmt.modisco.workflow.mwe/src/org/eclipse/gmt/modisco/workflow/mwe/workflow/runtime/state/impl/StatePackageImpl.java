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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.OrchestrationPackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.StateFactory;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.StatePackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowDoneState;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowErrorState;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowFailedState;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowIdleState;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowRunningState;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowState;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowSuccessState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class StatePackageImpl extends EPackageImpl implements StatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowIdleStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowRunningStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowDoneStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowSuccessStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowFailedStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowErrorStateEClass = null;

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
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.StatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatePackageImpl() {
		super(eNS_URI, StateFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatePackage init() {
		if (isInited) return (StatePackage)EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI);

		// Obtain or create and register package
		StatePackageImpl theStatePackage = (StatePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		WorkflowPackageImpl theWorkflowPackage = (WorkflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) instanceof WorkflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) : WorkflowPackage.eINSTANCE);
		OrchestrationPackageImpl theOrchestrationPackage = (OrchestrationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) instanceof OrchestrationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) : OrchestrationPackage.eINSTANCE);
		RuntimePackageImpl theRuntimePackage = (RuntimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) instanceof RuntimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) : RuntimePackage.eINSTANCE);

		// Create package meta-data objects
		theStatePackage.createPackageContents();
		theWorkflowPackage.createPackageContents();
		theOrchestrationPackage.createPackageContents();
		theRuntimePackage.createPackageContents();

		// Initialize created meta-data
		theStatePackage.initializePackageContents();
		theWorkflowPackage.initializePackageContents();
		theOrchestrationPackage.initializePackageContents();
		theRuntimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatePackage.eNS_URI, theStatePackage);
		return theStatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowState() {
		return workflowStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowIdleState() {
		return workflowIdleStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowRunningState() {
		return workflowRunningStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowDoneState() {
		return workflowDoneStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowSuccessState() {
		return workflowSuccessStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowFailedState() {
		return workflowFailedStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowErrorState() {
		return workflowErrorStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateFactory getStateFactory() {
		return (StateFactory)getEFactoryInstance();
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
		workflowStateEClass = createEClass(WORKFLOW_STATE);

		workflowIdleStateEClass = createEClass(WORKFLOW_IDLE_STATE);

		workflowRunningStateEClass = createEClass(WORKFLOW_RUNNING_STATE);

		workflowDoneStateEClass = createEClass(WORKFLOW_DONE_STATE);

		workflowSuccessStateEClass = createEClass(WORKFLOW_SUCCESS_STATE);

		workflowFailedStateEClass = createEClass(WORKFLOW_FAILED_STATE);

		workflowErrorStateEClass = createEClass(WORKFLOW_ERROR_STATE);
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
		workflowIdleStateEClass.getESuperTypes().add(this.getWorkflowState());
		workflowRunningStateEClass.getESuperTypes().add(this.getWorkflowState());
		workflowDoneStateEClass.getESuperTypes().add(this.getWorkflowState());
		workflowSuccessStateEClass.getESuperTypes().add(this.getWorkflowDoneState());
		workflowFailedStateEClass.getESuperTypes().add(this.getWorkflowDoneState());
		workflowErrorStateEClass.getESuperTypes().add(this.getWorkflowDoneState());

		// Initialize classes and features; add operations and parameters
		initEClass(workflowStateEClass, WorkflowState.class, "WorkflowState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(workflowStateEClass, ecorePackage.getEString(), "getDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowIdleStateEClass, WorkflowIdleState.class, "WorkflowIdleState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(workflowIdleStateEClass, ecorePackage.getEString(), "getDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowRunningStateEClass, WorkflowRunningState.class, "WorkflowRunningState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(workflowRunningStateEClass, ecorePackage.getEString(), "getDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowDoneStateEClass, WorkflowDoneState.class, "WorkflowDoneState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(workflowDoneStateEClass, ecorePackage.getEString(), "getDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowSuccessStateEClass, WorkflowSuccessState.class, "WorkflowSuccessState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(workflowSuccessStateEClass, ecorePackage.getEString(), "getDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowFailedStateEClass, WorkflowFailedState.class, "WorkflowFailedState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(workflowFailedStateEClass, ecorePackage.getEString(), "getDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowErrorStateEClass, WorkflowErrorState.class, "WorkflowErrorState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(workflowErrorStateEClass, ecorePackage.getEString(), "getDisplayName", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
	}

} //StatePackageImpl
