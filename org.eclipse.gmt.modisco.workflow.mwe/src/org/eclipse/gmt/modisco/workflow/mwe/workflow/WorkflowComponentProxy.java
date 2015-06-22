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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponentProxy#getTargetComponent <em>Target Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowComponentProxy()
 * @model
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface WorkflowComponentProxy extends WorkflowComponent {
	/**
	 * Returns the value of the '<em><b>Target Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Component</em>' reference.
	 * @see #setTargetComponent(WorkflowComponent)
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowComponentProxy_TargetComponent()
	 * @model required="true"
	 * @generated
	 */
	WorkflowComponent getTargetComponent();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponentProxy#getTargetComponent <em>Target Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Component</em>' reference.
	 * @see #getTargetComponent()
	 * @generated
	 */
	void setTargetComponent(WorkflowComponent value);

} // WorkflowComponentProxy
