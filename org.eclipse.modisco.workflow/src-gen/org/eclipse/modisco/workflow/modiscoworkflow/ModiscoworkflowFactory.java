/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 *******************************************************************************/
package org.eclipse.modisco.workflow.modiscoworkflow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage
 * @generated
 */
public interface ModiscoworkflowFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ModiscoworkflowFactory eINSTANCE = org.eclipse.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Workflow</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Workflow</em>'.
	 * @generated
	 */
	Workflow createWorkflow();

	/**
	 * Returns a new object of class '<em>Work</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Work</em>'.
	 * @generated
	 */
	Work createWork();

	/**
	 * Returns a new object of class '<em>Work Parameter</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Work Parameter</em>'.
	 * @generated
	 */
	WorkParameter createWorkParameter();

	/**
	 * Returns a new object of class '<em>Work Parameter String Value</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Work Parameter String Value</em>'.
	 * @generated
	 */
	WorkParameterStringValue createWorkParameterStringValue();

	/**
	 * Returns a new object of class '<em>Work Parameter String List Value</em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Work Parameter String List Value</em>
	 *         '.
	 * @generated
	 */
	WorkParameterStringListValue createWorkParameterStringListValue();

	/**
	 * Returns a new object of class '<em>Work Parameter Boolean Value</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Work Parameter Boolean Value</em>'.
	 * @generated
	 */
	WorkParameterBooleanValue createWorkParameterBooleanValue();

	/**
	 * Returns a new object of class '<em>Work Parameter Integer Value</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Work Parameter Integer Value</em>'.
	 * @generated
	 */
	WorkParameterIntegerValue createWorkParameterIntegerValue();

	/**
	 * Returns a new object of class '<em>Work Parameter Map Value</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Work Parameter Map Value</em>'.
	 * @generated
	 */
	WorkParameterMapValue createWorkParameterMapValue();

	/**
	 * Returns a new object of class '<em>Export Infos</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Export Infos</em>'.
	 * @generated
	 */
	ExportInfos createExportInfos();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModiscoworkflowPackage getModiscoworkflowPackage();

} // ModiscoworkflowFactory
