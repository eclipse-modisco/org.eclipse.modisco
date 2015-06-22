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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Engine Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngineProxy#getTargetEngine <em>Target Engine</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowEngineProxy()
 * @model
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface WorkflowEngineProxy extends WorkflowEngine {
	/**
	 * Returns the value of the '<em><b>Target Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Engine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Engine</em>' reference.
	 * @see #setTargetEngine(WorkflowEngine)
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowEngineProxy_TargetEngine()
	 * @model required="true"
	 * @generated
	 */
	WorkflowEngine getTargetEngine();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngineProxy#getTargetEngine <em>Target Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Engine</em>' reference.
	 * @see #getTargetEngine()
	 * @generated
	 */
	void setTargetEngine(WorkflowEngine value);

} // WorkflowEngineProxy
