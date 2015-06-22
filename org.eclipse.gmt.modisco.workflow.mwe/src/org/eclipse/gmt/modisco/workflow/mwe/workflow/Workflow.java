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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.Workflow#getComponents <em>Components</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.Workflow#getEngines <em>Engines</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflow()
 * @model
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface Workflow extends EObject {
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
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflow_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkflowComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Engines</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engines</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflow_Engines()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkflowEngine> getEngines();

} // Workflow
