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

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Of Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowUnitOfWork#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowUnitOfWork()
 * @model
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface WorkflowUnitOfWork extends WorkflowComponent {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowUnitOfWork_Parameters()
	 * @model containment="true"
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

} // WorkflowUnitOfWork
