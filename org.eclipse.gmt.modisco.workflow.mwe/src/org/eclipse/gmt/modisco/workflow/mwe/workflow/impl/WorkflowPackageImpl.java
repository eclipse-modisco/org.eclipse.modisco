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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.Direction;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.IWorkflowVisitor;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.Workflow;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponentMinimalist;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponentProxy;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowFactory;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterSimpleValueStrategy;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterValueStrategy;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowUnitOfWork;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.OrchestrationPackage;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl;

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
public class WorkflowPackageImpl extends EPackageImpl implements WorkflowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowCompositeComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowUnitOfWorkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowParameterValueStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowParameterConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowParameterSimpleValueStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iWorkflowVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowComponentProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowComponentMinimalistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

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
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WorkflowPackageImpl() {
		super(eNS_URI, WorkflowFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WorkflowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WorkflowPackage init() {
		if (isInited) return (WorkflowPackage)EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI);

		// Obtain or create and register package
		WorkflowPackageImpl theWorkflowPackage = (WorkflowPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WorkflowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WorkflowPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OrchestrationPackageImpl theOrchestrationPackage = (OrchestrationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) instanceof OrchestrationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI) : OrchestrationPackage.eINSTANCE);
		RuntimePackageImpl theRuntimePackage = (RuntimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) instanceof RuntimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) : RuntimePackage.eINSTANCE);
		StatePackageImpl theStatePackage = (StatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) instanceof StatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI) : StatePackage.eINSTANCE);

		// Create package meta-data objects
		theWorkflowPackage.createPackageContents();
		theOrchestrationPackage.createPackageContents();
		theRuntimePackage.createPackageContents();
		theStatePackage.createPackageContents();

		// Initialize created meta-data
		theWorkflowPackage.initializePackageContents();
		theOrchestrationPackage.initializePackageContents();
		theRuntimePackage.initializePackageContents();
		theStatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWorkflowPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WorkflowPackage.eNS_URI, theWorkflowPackage);
		return theWorkflowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflow() {
		return workflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Components() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Engines() {
		return (EReference)workflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowComponent() {
		return workflowComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowComponent_Name() {
		return (EAttribute)workflowComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowComponent_Type() {
		return (EAttribute)workflowComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowComponent_Description() {
		return (EAttribute)workflowComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowComponent_ComponentOrchestrationStrategy() {
		return (EReference)workflowComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowCompositeComponent() {
		return workflowCompositeComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowCompositeComponent_Components() {
		return (EReference)workflowCompositeComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowCompositeComponent_CompositeOrchestrationStrategy() {
		return (EReference)workflowCompositeComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowCompositeComponent_Connections() {
		return (EReference)workflowCompositeComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowCompositeComponent_StateResolutionStrategy() {
		return (EReference)workflowCompositeComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowCompositeComponent_Parameters() {
		return (EReference)workflowCompositeComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowUnitOfWork() {
		return workflowUnitOfWorkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowUnitOfWork_Parameters() {
		return (EReference)workflowUnitOfWorkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowParameter() {
		return workflowParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowParameter_Name() {
		return (EAttribute)workflowParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowParameter_Description() {
		return (EAttribute)workflowParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowParameter_Connection() {
		return (EReference)workflowParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowParameter_Required() {
		return (EAttribute)workflowParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowParameter_ValueStrategy() {
		return (EReference)workflowParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowParameter_Type() {
		return (EAttribute)workflowParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkflowParameter_Direction() {
		return (EAttribute)workflowParameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowParameterValueStrategy() {
		return workflowParameterValueStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowParameterConnection() {
		return workflowParameterConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowParameterConnection_Output() {
		return (EReference)workflowParameterConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowParameterConnection_Inputs() {
		return (EReference)workflowParameterConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowParameterSimpleValueStrategy() {
		return workflowParameterSimpleValueStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIWorkflowVisitor() {
		return iWorkflowVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowComponentProxy() {
		return workflowComponentProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowComponentProxy_TargetComponent() {
		return (EReference)workflowComponentProxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowComponentMinimalist() {
		return workflowComponentMinimalistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowFactory getWorkflowFactory() {
		return (WorkflowFactory)getEFactoryInstance();
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
		workflowEClass = createEClass(WORKFLOW);
		createEReference(workflowEClass, WORKFLOW__COMPONENTS);
		createEReference(workflowEClass, WORKFLOW__ENGINES);

		workflowComponentEClass = createEClass(WORKFLOW_COMPONENT);
		createEAttribute(workflowComponentEClass, WORKFLOW_COMPONENT__NAME);
		createEAttribute(workflowComponentEClass, WORKFLOW_COMPONENT__TYPE);
		createEAttribute(workflowComponentEClass, WORKFLOW_COMPONENT__DESCRIPTION);
		createEReference(workflowComponentEClass, WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY);

		workflowCompositeComponentEClass = createEClass(WORKFLOW_COMPOSITE_COMPONENT);
		createEReference(workflowCompositeComponentEClass, WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS);
		createEReference(workflowCompositeComponentEClass, WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY);
		createEReference(workflowCompositeComponentEClass, WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS);
		createEReference(workflowCompositeComponentEClass, WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY);
		createEReference(workflowCompositeComponentEClass, WORKFLOW_COMPOSITE_COMPONENT__PARAMETERS);

		workflowUnitOfWorkEClass = createEClass(WORKFLOW_UNIT_OF_WORK);
		createEReference(workflowUnitOfWorkEClass, WORKFLOW_UNIT_OF_WORK__PARAMETERS);

		workflowParameterEClass = createEClass(WORKFLOW_PARAMETER);
		createEAttribute(workflowParameterEClass, WORKFLOW_PARAMETER__NAME);
		createEAttribute(workflowParameterEClass, WORKFLOW_PARAMETER__DESCRIPTION);
		createEReference(workflowParameterEClass, WORKFLOW_PARAMETER__CONNECTION);
		createEAttribute(workflowParameterEClass, WORKFLOW_PARAMETER__REQUIRED);
		createEReference(workflowParameterEClass, WORKFLOW_PARAMETER__VALUE_STRATEGY);
		createEAttribute(workflowParameterEClass, WORKFLOW_PARAMETER__TYPE);
		createEAttribute(workflowParameterEClass, WORKFLOW_PARAMETER__DIRECTION);

		workflowParameterValueStrategyEClass = createEClass(WORKFLOW_PARAMETER_VALUE_STRATEGY);

		workflowParameterConnectionEClass = createEClass(WORKFLOW_PARAMETER_CONNECTION);
		createEReference(workflowParameterConnectionEClass, WORKFLOW_PARAMETER_CONNECTION__OUTPUT);
		createEReference(workflowParameterConnectionEClass, WORKFLOW_PARAMETER_CONNECTION__INPUTS);

		workflowParameterSimpleValueStrategyEClass = createEClass(WORKFLOW_PARAMETER_SIMPLE_VALUE_STRATEGY);

		iWorkflowVisitorEClass = createEClass(IWORKFLOW_VISITOR);

		workflowComponentProxyEClass = createEClass(WORKFLOW_COMPONENT_PROXY);
		createEReference(workflowComponentProxyEClass, WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT);

		workflowComponentMinimalistEClass = createEClass(WORKFLOW_COMPONENT_MINIMALIST);

		// Create enums
		directionEEnum = createEEnum(DIRECTION);
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
		OrchestrationPackage theOrchestrationPackage = (OrchestrationPackage)EPackage.Registry.INSTANCE.getEPackage(OrchestrationPackage.eNS_URI);
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);
		StatePackage theStatePackage = (StatePackage)EPackage.Registry.INSTANCE.getEPackage(StatePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theOrchestrationPackage);
		getESubpackages().add(theRuntimePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workflowCompositeComponentEClass.getESuperTypes().add(this.getWorkflowComponent());
		workflowUnitOfWorkEClass.getESuperTypes().add(this.getWorkflowComponent());
		workflowParameterSimpleValueStrategyEClass.getESuperTypes().add(this.getWorkflowParameterValueStrategy());
		workflowComponentProxyEClass.getESuperTypes().add(this.getWorkflowComponent());
		workflowComponentMinimalistEClass.getESuperTypes().add(this.getWorkflowComponent());

		// Initialize classes and features; add operations and parameters
		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWorkflow_Components(), this.getWorkflowComponent(), null, "components", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflow_Engines(), theRuntimePackage.getWorkflowEngine(), null, "engines", null, 0, -1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowComponentEClass, WorkflowComponent.class, "WorkflowComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getWorkflowComponent_Name(), ecorePackage.getEString(), "name", null, 1, 1, WorkflowComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWorkflowComponent_Type(), ecorePackage.getEString(), "type", null, 1, 1, WorkflowComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWorkflowComponent_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkflowComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowComponent_ComponentOrchestrationStrategy(), theOrchestrationPackage.getWorkflowComponentOrchestrationStrategy(), null, "componentOrchestrationStrategy", null, 0, 1, WorkflowComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(workflowComponentEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getIWorkflowVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowComponentEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowComponentEClass, theStatePackage.getWorkflowState(), "run", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowComponentEClass, theRuntimePackage.getWorkflowLog(), "logError", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowCompositeComponentEClass, WorkflowCompositeComponent.class, "WorkflowCompositeComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWorkflowCompositeComponent_Components(), this.getWorkflowComponent(), null, "components", null, 0, -1, WorkflowCompositeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowCompositeComponent_CompositeOrchestrationStrategy(), theOrchestrationPackage.getWorkflowCompositeOrchestrationStrategy(), null, "compositeOrchestrationStrategy", null, 1, 1, WorkflowCompositeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowCompositeComponent_Connections(), this.getWorkflowParameterConnection(), null, "connections", null, 0, -1, WorkflowCompositeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowCompositeComponent_StateResolutionStrategy(), theRuntimePackage.getWorkflowStateResolutionStrategy(), null, "stateResolutionStrategy", null, 1, 1, WorkflowCompositeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowCompositeComponent_Parameters(), this.getWorkflowParameter(), null, "parameters", null, 0, -1, WorkflowCompositeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowCompositeComponentEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getIWorkflowVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowCompositeComponentEClass, theStatePackage.getWorkflowState(), "run", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowUnitOfWorkEClass, WorkflowUnitOfWork.class, "WorkflowUnitOfWork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWorkflowUnitOfWork_Parameters(), this.getWorkflowParameter(), null, "parameters", null, 0, -1, WorkflowUnitOfWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowUnitOfWorkEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getIWorkflowVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowUnitOfWorkEClass, theStatePackage.getWorkflowState(), "run", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowParameterEClass, WorkflowParameter.class, "WorkflowParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getWorkflowParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, WorkflowParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWorkflowParameter_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkflowParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowParameter_Connection(), this.getWorkflowParameterConnection(), this.getWorkflowParameterConnection_Inputs(), "connection", null, 0, 1, WorkflowParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWorkflowParameter_Required(), ecorePackage.getEBoolean(), "required", "true", 1, 1, WorkflowParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getWorkflowParameter_ValueStrategy(), this.getWorkflowParameterValueStrategy(), null, "valueStrategy", null, 1, 1, WorkflowParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWorkflowParameter_Type(), theEcorePackage.getEString(), "type", null, 0, 1, WorkflowParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getWorkflowParameter_Direction(), this.getDirection(), "direction", null, 0, 1, WorkflowParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowParameterEClass, ecorePackage.getEJavaObject(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowParameterEClass, null, "setValue", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowParameterValueStrategyEClass, WorkflowParameterValueStrategy.class, "WorkflowParameterValueStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = addEOperation(workflowParameterValueStrategyEClass, ecorePackage.getEJavaObject(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getWorkflowParameter(), "parameter", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowParameterValueStrategyEClass, null, "setValue", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getWorkflowParameter(), "parameter", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowParameterConnectionEClass, WorkflowParameterConnection.class, "WorkflowParameterConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWorkflowParameterConnection_Output(), this.getWorkflowParameter(), null, "output", null, 1, 1, WorkflowParameterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getWorkflowParameterConnection_Inputs(), this.getWorkflowParameter(), this.getWorkflowParameter_Connection(), "inputs", null, 1, -1, WorkflowParameterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowParameterSimpleValueStrategyEClass, WorkflowParameterSimpleValueStrategy.class, "WorkflowParameterSimpleValueStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = addEOperation(workflowParameterSimpleValueStrategyEClass, ecorePackage.getEJavaObject(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getWorkflowParameter(), "parameter", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(workflowParameterSimpleValueStrategyEClass, null, "setValue", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theRuntimePackage.getWorkflowContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getWorkflowParameter(), "parameter", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(iWorkflowVisitorEClass, IWorkflowVisitor.class, "IWorkflowVisitor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		op = addEOperation(iWorkflowVisitorEClass, null, "visitUnitOfWork", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getWorkflowUnitOfWork(), "unitOfWork", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(iWorkflowVisitorEClass, null, "visitComposite", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getWorkflowCompositeComponent(), "composite", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowComponentProxyEClass, WorkflowComponentProxy.class, "WorkflowComponentProxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getWorkflowComponentProxy_TargetComponent(), this.getWorkflowComponent(), null, "targetComponent", null, 1, 1, WorkflowComponentProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(workflowComponentMinimalistEClass, WorkflowComponentMinimalist.class, "WorkflowComponentMinimalist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(directionEEnum, Direction.class, "Direction"); //$NON-NLS-1$
		addEEnumLiteral(directionEEnum, Direction.IN);
		addEEnumLiteral(directionEEnum, Direction.OUT);
		addEEnumLiteral(directionEEnum, Direction.INOUT);

		// Create resource
		createResource(eNS_URI);
	}

} //WorkflowPackageImpl
