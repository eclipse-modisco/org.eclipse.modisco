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

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Conditional Component Orchestration Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowConditionalComponentOrchestrationStrategy#getConditions <em>Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.OrchestrationPackage#getWorkflowConditionalComponentOrchestrationStrategy()
 * @model
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface WorkflowConditionalComponentOrchestrationStrategy extends WorkflowComponentOrchestrationStrategy {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowExecutionPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.OrchestrationPackage#getWorkflowConditionalComponentOrchestrationStrategy_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkflowExecutionPredicate> getConditions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run(WorkflowComponent component, WorkflowContext context);

} // WorkflowConditionalComponentOrchestrationStrategy
