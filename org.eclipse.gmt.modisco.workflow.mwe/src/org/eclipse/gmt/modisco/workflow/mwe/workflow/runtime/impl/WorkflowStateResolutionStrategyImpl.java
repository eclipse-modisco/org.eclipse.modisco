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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowStateResolutionStrategy;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow State Resolution Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class WorkflowStateResolutionStrategyImpl extends EObjectImpl implements WorkflowStateResolutionStrategy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowStateResolutionStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.WORKFLOW_STATE_RESOLUTION_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowState resolve(WorkflowCompositeComponent workflow, WorkflowContext context) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //WorkflowStateResolutionStrategyImpl
