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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.OrchestrationPackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowCompositeOrchestrationStrategy;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Composite Orchestration Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public abstract class WorkflowCompositeOrchestrationStrategyImpl extends EObjectImpl implements WorkflowCompositeOrchestrationStrategy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowCompositeOrchestrationStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrchestrationPackage.Literals.WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void run(WorkflowCompositeComponent composite, WorkflowContext context) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //WorkflowCompositeOrchestrationStrategyImpl
