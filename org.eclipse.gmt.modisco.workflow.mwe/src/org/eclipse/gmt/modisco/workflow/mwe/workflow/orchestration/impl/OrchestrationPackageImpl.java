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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowPackageImpl;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.OrchestrationFactory;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.OrchestrationPackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowComponentOrchestrationStrategy;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowCompositeOrchestrationStrategy;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowConditionalComponentOrchestrationStrategy;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowExecutionPredicate;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowParallelOrchestrationStrategy;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowRerunPredicate;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowSerialOrchestrationStrategy;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimePackageImpl;

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
public class OrchestrationPackageImpl extends EPackageImpl implements OrchestrationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowSerialOrchestrationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowParallelOrchestrationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowCompositeOrchestrationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowComponentOrchestrationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowConditionalComponentOrchestrationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowExecutionPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowRerunPredicateEClass = null;

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
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.OrchestrationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrchestrationPackageImpl() {
		super(eNS_URI, OrchestrationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OrchestrationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OrchestrationPackage init() {
		if (isInited) return (OrchestrationPackage)EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI);

		// Obtain or create and register package
		OrchestrationPackageImpl theOrchestrationPackage = (OrchestrationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrchestrationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OrchestrationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		WorkflowPackageImpl theWorkflowPackage = (WorkflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) instanceof WorkflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) : WorkflowPackage.eINSTANCE);
		RuntimePackageImpl theRuntimePackage = (RuntimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) instanceof RuntimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) : RuntimePackage.eINSTANCE);
		StatePackageImpl theStatePackage = (StatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);

		// Create package meta-data objects
		theOrchestrationPackage.createPackageContents();
		theWorkflowPackage.createPackageContents();
		theRuntimePackage.createPackageContents();
		theStatePackage.createPackageContents();

		// Initialize created meta-data
		theOrchestrationPackage.initializePackageContents();
		theWorkflowPackage.initializePackageContents();
		theRuntimePackage.initializePackageContents();
		theStatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOrchestrationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OrchestrationPackage.eNS_URI, theOrchestrationPackage);
		return theOrchestrationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowSerialOrchestrationStrategy() {
		return workflowSerialOrchestrationStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowParallelOrchestrationStrategy() {
		return workflowParallelOrchestrationStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowCompositeOrchestrationStrategy() {
		return workflowCompositeOrchestrationStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowComponentOrchestrationStrategy() {
		return workflowComponentOrchestrationStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowConditionalComponentOrchestrationStrategy() {
		return workflowConditionalComponentOrchestrationStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowConditionalComponentOrchestrationStrategy_Conditions() {
		return (EReference)workflowConditionalComponentOrchestrationStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowExecutionPredicate() {
		return workflowExecutionPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowRerunPredicate() {
		return workflowRerunPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestrationFactory getOrchestrationFactory() {
		return (OrchestrationFactory)getEFactoryInstance();
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
		workflowSerialOrchestrationStrategyEClass = createEClass(WORKFLOW_SERIAL_ORCHESTRATION_STRATEGY);

		workflowParallelOrchestrationStrategyEClass = createEClass(WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY);

		workflowCompositeOrchestrationStrategyEClass = createEClass(WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY);

		workflowComponentOrchestrationStrategyEClass = createEClass(WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY);

		workflowConditionalComponentOrchestrationStrategyEClass = createEClass(WORKFLOW_CONDITIONAL_COMPONENT_ORCHESTRATION_STRATEGY);
		createEReference(workflowConditionalComponentOrchestrationStrategyEClass, WORKFLOW_CONDITIONAL_COMPONENT_ORCHESTRATION_STRATEGY__CONDITIONS);

		workflowExecutionPredicateEClass = createEClass(WORKFLOW_EXECUTION_PREDICATE);

		workflowRerunPredicateEClass = createEClass(WORKFLOW_RERUN_PREDICATE);
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
		WorkflowPackage theWorkflowPackage = (WorkflowPackage)EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI);
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workflowSerialOrchestrationStrategyEClass.getESuperTypes().add(this.getWorkflowCompositeOrchestrationStrategy());
		workflowParallelOrchestrationStrategyEClass.getESuperTypes().add(this.getWorkflowCompositeOrchestrationStrategy());
		workflowConditionalComponentOrchestrationStrategyEClass.getESuperTypes().add(this.getWorkflowComponentOrchestrationStrategy());
		workflowRerunPredicateEClass.getESuperTypes().add(this.getWorkflowExecutionPredicate());

		// Initialize classes and features; add operations and parameters
		initEClass(workflowSerialOrchestrationStrategyEClass, WorkflowSerialOrchestrationStrategy.class, "WorkflowSerialOrchestrationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		EOperation op = addEOperation(workflowSerialOrchestrationStrategyEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theWorkflowPackage.getWorkflowCompositeComponent(), "composite", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowParallelOrchestrationStrategyEClass, WorkflowParallelOrchestrationStrategy.class, "WorkflowParallelOrchestrationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = addEOperation(workflowParallelOrchestrationStrategyEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theWorkflowPackage.getWorkflowCompositeComponent(), "composite", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowCompositeOrchestrationStrategyEClass, WorkflowCompositeOrchestrationStrategy.class, "WorkflowCompositeOrchestrationStrategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = addEOperation(workflowCompositeOrchestrationStrategyEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theWorkflowPackage.getWorkflowCompositeComponent(), "composite", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowComponentOrchestrationStrategyEClass, WorkflowComponentOrchestrationStrategy.class, "WorkflowComponentOrchestrationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = addEOperation(workflowComponentOrchestrationStrategyEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowConditionalComponentOrchestrationStrategyEClass, WorkflowConditionalComponentOrchestrationStrategy.class, "WorkflowConditionalComponentOrchestrationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWorkflowConditionalComponentOrchestrationStrategy_Conditions(), this.getWorkflowExecutionPredicate(), null, "conditions", null, 0, -1, WorkflowConditionalComponentOrchestrationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowConditionalComponentOrchestrationStrategyEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowExecutionPredicateEClass, WorkflowExecutionPredicate.class, "WorkflowExecutionPredicate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = addEOperation(workflowExecutionPredicateEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowRerunPredicateEClass, WorkflowRerunPredicate.class, "WorkflowRerunPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = addEOperation(workflowRerunPredicateEClass, ecorePackage.getEBoolean(), "evaluate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theWorkflowPackage.getWorkflowComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
	}

} //OrchestrationPackageImpl
