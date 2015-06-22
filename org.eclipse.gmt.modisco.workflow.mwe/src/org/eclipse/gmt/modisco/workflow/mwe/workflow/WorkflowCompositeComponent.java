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
package org.eclipse.gmt.modisco.workflow.mwe.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowCompositeOrchestrationStrategy;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowStateResolutionStrategy;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent#getComponents <em>Components</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent#getCompositeOrchestrationStrategy <em>Composite Orchestration Strategy</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent#getStateResolutionStrategy <em>State Resolution Strategy</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowCompositeComponent()
 * @model
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface WorkflowCompositeComponent extends WorkflowComponent {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowCompositeComponent_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkflowComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Composite Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Orchestration Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Orchestration Strategy</em>' containment reference.
	 * @see #setCompositeOrchestrationStrategy(WorkflowCompositeOrchestrationStrategy)
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowCompositeComponent_CompositeOrchestrationStrategy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	WorkflowCompositeOrchestrationStrategy getCompositeOrchestrationStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent#getCompositeOrchestrationStrategy <em>Composite Orchestration Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Orchestration Strategy</em>' containment reference.
	 * @see #getCompositeOrchestrationStrategy()
	 * @generated
	 */
	void setCompositeOrchestrationStrategy(WorkflowCompositeOrchestrationStrategy value);

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowCompositeComponent_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkflowParameterConnection> getConnections();

	/**
	 * Returns the value of the '<em><b>State Resolution Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Resolution Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Resolution Strategy</em>' containment reference.
	 * @see #setStateResolutionStrategy(WorkflowStateResolutionStrategy)
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowCompositeComponent_StateResolutionStrategy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	WorkflowStateResolutionStrategy getStateResolutionStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent#getStateResolutionStrategy <em>State Resolution Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Resolution Strategy</em>' containment reference.
	 * @see #getStateResolutionStrategy()
	 * @generated
	 */
	void setStateResolutionStrategy(WorkflowStateResolutionStrategy value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowCompositeComponent_Parameters()
	 * @model
	 * @generated
	 */
	EList<WorkflowParameter> getParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accept(IWorkflowVisitor visitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	WorkflowState run(WorkflowContext context);

} // WorkflowCompositeComponent
