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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface WorkflowFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowFactory eINSTANCE = org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow</em>'.
	 * @generated
	 */
	Workflow createWorkflow();

	/**
	 * Returns a new object of class '<em>Composite Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Component</em>'.
	 * @generated
	 */
	WorkflowCompositeComponent createWorkflowCompositeComponent();

	/**
	 * Returns a new object of class '<em>Unit Of Work</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Of Work</em>'.
	 * @generated
	 */
	WorkflowUnitOfWork createWorkflowUnitOfWork();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	WorkflowParameter createWorkflowParameter();

	/**
	 * Returns a new object of class '<em>Parameter Value Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Value Strategy</em>'.
	 * @generated
	 */
	WorkflowParameterValueStrategy createWorkflowParameterValueStrategy();

	/**
	 * Returns a new object of class '<em>Parameter Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Connection</em>'.
	 * @generated
	 */
	WorkflowParameterConnection createWorkflowParameterConnection();

	/**
	 * Returns a new object of class '<em>Parameter Simple Value Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Simple Value Strategy</em>'.
	 * @generated
	 */
	WorkflowParameterSimpleValueStrategy createWorkflowParameterSimpleValueStrategy();

	/**
	 * Returns a new object of class '<em>Component Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Proxy</em>'.
	 * @generated
	 */
	WorkflowComponentProxy createWorkflowComponentProxy();

	/**
	 * Returns a new object of class '<em>Component Minimalist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Minimalist</em>'.
	 * @generated
	 */
	WorkflowComponentMinimalist createWorkflowComponentMinimalist();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WorkflowPackage getWorkflowPackage();

} //WorkflowFactory
