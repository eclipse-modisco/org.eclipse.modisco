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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Runner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowRunner#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowRunner#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowRunner()
 * @model superTypes="org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowRunnable"
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface WorkflowRunner extends EObject, Runnable {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(WorkflowContext)
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowRunner_Context()
	 * @model required="true"
	 * @generated
	 */
	WorkflowContext getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowRunner#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(WorkflowContext value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(WorkflowComponent)
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowRunner_Component()
	 * @model required="true"
	 * @generated
	 */
	WorkflowComponent getComponent();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowRunner#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(WorkflowComponent value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run();

} // WorkflowRunner
