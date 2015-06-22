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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection#getOutput <em>Output</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowParameterConnection()
 * @model
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface WorkflowParameterConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(WorkflowParameter)
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowParameterConnection_Output()
	 * @model required="true"
	 * @generated
	 */
	WorkflowParameter getOutput();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(WorkflowParameter value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowParameterConnection_Inputs()
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getConnection
	 * @model opposite="connection" required="true"
	 * @generated
	 */
	EList<WorkflowParameter> getInputs();

} // WorkflowParameterConnection
