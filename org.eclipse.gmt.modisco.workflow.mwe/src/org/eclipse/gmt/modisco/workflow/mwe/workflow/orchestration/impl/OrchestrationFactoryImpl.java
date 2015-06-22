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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class OrchestrationFactoryImpl extends EFactoryImpl implements OrchestrationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrchestrationFactory init() {
		try {
			OrchestrationFactory theOrchestrationFactory = (OrchestrationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/gmt/modisco/workflow/mwe/workflow/orchestration");  //$NON-NLS-1$
			if (theOrchestrationFactory != null) {
				return theOrchestrationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrchestrationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestrationFactoryImpl() {
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
			case OrchestrationPackage.WORKFLOW_SERIAL_ORCHESTRATION_STRATEGY: return createWorkflowSerialOrchestrationStrategy();
			case OrchestrationPackage.WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY: return createWorkflowParallelOrchestrationStrategy();
			case OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY: return createWorkflowComponentOrchestrationStrategy();
			case OrchestrationPackage.WORKFLOW_CONDITIONAL_COMPONENT_ORCHESTRATION_STRATEGY: return createWorkflowConditionalComponentOrchestrationStrategy();
			case OrchestrationPackage.WORKFLOW_RERUN_PREDICATE: return createWorkflowRerunPredicate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowSerialOrchestrationStrategy createWorkflowSerialOrchestrationStrategy() {
		WorkflowSerialOrchestrationStrategyImpl workflowSerialOrchestrationStrategy = new WorkflowSerialOrchestrationStrategyImpl();
		return workflowSerialOrchestrationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParallelOrchestrationStrategy createWorkflowParallelOrchestrationStrategy() {
		WorkflowParallelOrchestrationStrategyImpl workflowParallelOrchestrationStrategy = new WorkflowParallelOrchestrationStrategyImpl();
		return workflowParallelOrchestrationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowComponentOrchestrationStrategy createWorkflowComponentOrchestrationStrategy() {
		WorkflowComponentOrchestrationStrategyImpl workflowComponentOrchestrationStrategy = new WorkflowComponentOrchestrationStrategyImpl();
		return workflowComponentOrchestrationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowConditionalComponentOrchestrationStrategy createWorkflowConditionalComponentOrchestrationStrategy() {
		WorkflowConditionalComponentOrchestrationStrategyImpl workflowConditionalComponentOrchestrationStrategy = new WorkflowConditionalComponentOrchestrationStrategyImpl();
		return workflowConditionalComponentOrchestrationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowRerunPredicate createWorkflowRerunPredicate() {
		WorkflowRerunPredicateImpl workflowRerunPredicate = new WorkflowRerunPredicateImpl();
		return workflowRerunPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestrationPackage getOrchestrationPackage() {
		return (OrchestrationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OrchestrationPackage getPackage() {
		return OrchestrationPackage.eINSTANCE;
	}

} //OrchestrationFactoryImpl
