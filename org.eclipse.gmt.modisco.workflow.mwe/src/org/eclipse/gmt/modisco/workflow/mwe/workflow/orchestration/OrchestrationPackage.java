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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.OrchestrationFactory
 * @model kind="package"
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface OrchestrationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "orchestration"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/gmt/modisco/workflow/mwe/workflow/orchestration"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrchestrationPackage eINSTANCE = org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowCompositeOrchestrationStrategyImpl <em>Workflow Composite Orchestration Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowCompositeOrchestrationStrategyImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl#getWorkflowCompositeOrchestrationStrategy()
	 * @generated
	 */
	int WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY = 2;

	/**
	 * The number of structural features of the '<em>Workflow Composite Orchestration Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowSerialOrchestrationStrategyImpl <em>Workflow Serial Orchestration Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowSerialOrchestrationStrategyImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl#getWorkflowSerialOrchestrationStrategy()
	 * @generated
	 */
	int WORKFLOW_SERIAL_ORCHESTRATION_STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Workflow Serial Orchestration Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_SERIAL_ORCHESTRATION_STRATEGY_FEATURE_COUNT = WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowParallelOrchestrationStrategyImpl <em>Workflow Parallel Orchestration Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowParallelOrchestrationStrategyImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl#getWorkflowParallelOrchestrationStrategy()
	 * @generated
	 */
	int WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY = 1;

	/**
	 * The number of structural features of the '<em>Workflow Parallel Orchestration Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY_FEATURE_COUNT = WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowComponentOrchestrationStrategyImpl <em>Workflow Component Orchestration Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowComponentOrchestrationStrategyImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl#getWorkflowComponentOrchestrationStrategy()
	 * @generated
	 */
	int WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY = 3;

	/**
	 * The number of structural features of the '<em>Workflow Component Orchestration Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowConditionalComponentOrchestrationStrategyImpl <em>Workflow Conditional Component Orchestration Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowConditionalComponentOrchestrationStrategyImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl#getWorkflowConditionalComponentOrchestrationStrategy()
	 * @generated
	 */
	int WORKFLOW_CONDITIONAL_COMPONENT_ORCHESTRATION_STRATEGY = 4;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CONDITIONAL_COMPONENT_ORCHESTRATION_STRATEGY__CONDITIONS = WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow Conditional Component Orchestration Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CONDITIONAL_COMPONENT_ORCHESTRATION_STRATEGY_FEATURE_COUNT = WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowExecutionPredicateImpl <em>Workflow Execution Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowExecutionPredicateImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl#getWorkflowExecutionPredicate()
	 * @generated
	 */
	int WORKFLOW_EXECUTION_PREDICATE = 5;

	/**
	 * The number of structural features of the '<em>Workflow Execution Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_EXECUTION_PREDICATE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowRerunPredicateImpl <em>Workflow Rerun Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowRerunPredicateImpl
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl#getWorkflowRerunPredicate()
	 * @generated
	 */
	int WORKFLOW_RERUN_PREDICATE = 6;

	/**
	 * The number of structural features of the '<em>Workflow Rerun Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RERUN_PREDICATE_FEATURE_COUNT = WORKFLOW_EXECUTION_PREDICATE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowSerialOrchestrationStrategy <em>Workflow Serial Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Serial Orchestration Strategy</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowSerialOrchestrationStrategy
	 * @generated
	 */
	EClass getWorkflowSerialOrchestrationStrategy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowParallelOrchestrationStrategy <em>Workflow Parallel Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Parallel Orchestration Strategy</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowParallelOrchestrationStrategy
	 * @generated
	 */
	EClass getWorkflowParallelOrchestrationStrategy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowCompositeOrchestrationStrategy <em>Workflow Composite Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Composite Orchestration Strategy</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowCompositeOrchestrationStrategy
	 * @generated
	 */
	EClass getWorkflowCompositeOrchestrationStrategy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowComponentOrchestrationStrategy <em>Workflow Component Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Component Orchestration Strategy</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowComponentOrchestrationStrategy
	 * @generated
	 */
	EClass getWorkflowComponentOrchestrationStrategy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowConditionalComponentOrchestrationStrategy <em>Workflow Conditional Component Orchestration Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Conditional Component Orchestration Strategy</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowConditionalComponentOrchestrationStrategy
	 * @generated
	 */
	EClass getWorkflowConditionalComponentOrchestrationStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowConditionalComponentOrchestrationStrategy#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowConditionalComponentOrchestrationStrategy#getConditions()
	 * @see #getWorkflowConditionalComponentOrchestrationStrategy()
	 * @generated
	 */
	EReference getWorkflowConditionalComponentOrchestrationStrategy_Conditions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowExecutionPredicate <em>Workflow Execution Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Execution Predicate</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowExecutionPredicate
	 * @generated
	 */
	EClass getWorkflowExecutionPredicate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowRerunPredicate <em>Workflow Rerun Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Rerun Predicate</em>'.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowRerunPredicate
	 * @generated
	 */
	EClass getWorkflowRerunPredicate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrchestrationFactory getOrchestrationFactory();

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
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowSerialOrchestrationStrategyImpl <em>Workflow Serial Orchestration Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowSerialOrchestrationStrategyImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl#getWorkflowSerialOrchestrationStrategy()
		 * @generated
		 */
		EClass WORKFLOW_SERIAL_ORCHESTRATION_STRATEGY = eINSTANCE.getWorkflowSerialOrchestrationStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowParallelOrchestrationStrategyImpl <em>Workflow Parallel Orchestration Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowParallelOrchestrationStrategyImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl#getWorkflowParallelOrchestrationStrategy()
		 * @generated
		 */
		EClass WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY = eINSTANCE.getWorkflowParallelOrchestrationStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowCompositeOrchestrationStrategyImpl <em>Workflow Composite Orchestration Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowCompositeOrchestrationStrategyImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl#getWorkflowCompositeOrchestrationStrategy()
		 * @generated
		 */
		EClass WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY = eINSTANCE.getWorkflowCompositeOrchestrationStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowComponentOrchestrationStrategyImpl <em>Workflow Component Orchestration Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowComponentOrchestrationStrategyImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl#getWorkflowComponentOrchestrationStrategy()
		 * @generated
		 */
		EClass WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY = eINSTANCE.getWorkflowComponentOrchestrationStrategy();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowConditionalComponentOrchestrationStrategyImpl <em>Workflow Conditional Component Orchestration Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowConditionalComponentOrchestrationStrategyImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl#getWorkflowConditionalComponentOrchestrationStrategy()
		 * @generated
		 */
		EClass WORKFLOW_CONDITIONAL_COMPONENT_ORCHESTRATION_STRATEGY = eINSTANCE.getWorkflowConditionalComponentOrchestrationStrategy();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_CONDITIONAL_COMPONENT_ORCHESTRATION_STRATEGY__CONDITIONS = eINSTANCE.getWorkflowConditionalComponentOrchestrationStrategy_Conditions();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowExecutionPredicateImpl <em>Workflow Execution Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowExecutionPredicateImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl#getWorkflowExecutionPredicate()
		 * @generated
		 */
		EClass WORKFLOW_EXECUTION_PREDICATE = eINSTANCE.getWorkflowExecutionPredicate();

		/**
		 * The meta object literal for the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowRerunPredicateImpl <em>Workflow Rerun Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.WorkflowRerunPredicateImpl
		 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl.OrchestrationPackageImpl#getWorkflowRerunPredicate()
		 * @generated
		 */
		EClass WORKFLOW_RERUN_PREDICATE = eINSTANCE.getWorkflowRerunPredicate();

	}

} //OrchestrationPackage
