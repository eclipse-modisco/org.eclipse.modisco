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

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Simple Value Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowParameterSimpleValueStrategy()
 * @model
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface WorkflowParameterSimpleValueStrategy extends WorkflowParameterValueStrategy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object getValue(WorkflowContext context, WorkflowParameter parameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setValue(WorkflowContext context, WorkflowParameter parameter, Object value);

} // WorkflowParameterSimpleValueStrategy
