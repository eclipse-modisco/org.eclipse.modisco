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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface RuntimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimeFactory eINSTANCE = org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.RuntimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Workflow Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Context</em>'.
	 * @generated
	 */
	WorkflowContext createWorkflowContext();

	/**
	 * Returns a new object of class '<em>Workflow Engine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Engine</em>'.
	 * @generated
	 */
	WorkflowEngine createWorkflowEngine();

	/**
	 * Returns a new object of class '<em>Workflow State Resolution Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow State Resolution Strategy</em>'.
	 * @generated
	 */
	WorkflowStateResolutionStrategy createWorkflowStateResolutionStrategy();

	/**
	 * Returns a new object of class '<em>Workflow Runnable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Runnable</em>'.
	 * @generated
	 */
	Runnable createWorkflowRunnable();

	/**
	 * Returns a new object of class '<em>Workflow Runner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Runner</em>'.
	 * @generated
	 */
	WorkflowRunner createWorkflowRunner();

	/**
	 * Returns a new object of class '<em>Workflow State Resetter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow State Resetter</em>'.
	 * @generated
	 */
	WorkflowStateResetter createWorkflowStateResetter();

	/**
	 * Returns a new object of class '<em>Workflow Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Log</em>'.
	 * @generated
	 */
	WorkflowLog createWorkflowLog();

	/**
	 * Returns a new object of class '<em>Workflow Log Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Log Entry</em>'.
	 * @generated
	 */
	WorkflowLogEntry createWorkflowLogEntry();

	/**
	 * Returns a new object of class '<em>Workflow Log Resetter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Log Resetter</em>'.
	 * @generated
	 */
	WorkflowLogResetter createWorkflowLogResetter();

	/**
	 * Returns a new object of class '<em>Workflow Engine Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Engine Proxy</em>'.
	 * @generated
	 */
	WorkflowEngineProxy createWorkflowEngineProxy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RuntimePackage getRuntimePackage();

} //RuntimeFactory
