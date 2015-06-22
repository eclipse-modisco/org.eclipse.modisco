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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.StatePackage
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface StateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StateFactory eINSTANCE = org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.impl.StateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Workflow Idle State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Idle State</em>'.
	 * @generated
	 */
	WorkflowIdleState createWorkflowIdleState();

	/**
	 * Returns a new object of class '<em>Workflow Running State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Running State</em>'.
	 * @generated
	 */
	WorkflowRunningState createWorkflowRunningState();

	/**
	 * Returns a new object of class '<em>Workflow Done State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Done State</em>'.
	 * @generated
	 */
	WorkflowDoneState createWorkflowDoneState();

	/**
	 * Returns a new object of class '<em>Workflow Success State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Success State</em>'.
	 * @generated
	 */
	WorkflowSuccessState createWorkflowSuccessState();

	/**
	 * Returns a new object of class '<em>Workflow Failed State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Failed State</em>'.
	 * @generated
	 */
	WorkflowFailedState createWorkflowFailedState();

	/**
	 * Returns a new object of class '<em>Workflow Error State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Error State</em>'.
	 * @generated
	 */
	WorkflowErrorState createWorkflowErrorState();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatePackage getStatePackage();

} //StateFactory
