/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.workflow.modiscoworkflow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public interface ModiscoworkflowFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	ModiscoworkflowFactory eINSTANCE = org.eclipse.gmt.modisco.workflow.modiscoworkflow.impl.ModiscoworkflowFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Workflow</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Workflow</em>'.
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	Workflow createWorkflow();

	/**
	 * Returns a new object of class '<em>Work</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Work</em>'.
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	Work createWork();

	/**
	 * Returns a new object of class '<em>Work Parameter</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Work Parameter</em>'.
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	WorkParameter createWorkParameter();

	/**
	 * Returns a new object of class '<em>Work Parameter String Value</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Work Parameter String Value</em>'.
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	WorkParameterStringValue createWorkParameterStringValue();

	/**
	 * Returns a new object of class '<em>Work Parameter String List Value</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Work Parameter String List Value</em>'.
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	WorkParameterStringListValue createWorkParameterStringListValue();

	/**
	 * Returns a new object of class '<em>Work Parameter Boolean Value</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Work Parameter Boolean Value</em>'.
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	WorkParameterBooleanValue createWorkParameterBooleanValue();

	/**
	 * Returns a new object of class '<em>Work Parameter Integer Value</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Work Parameter Integer Value</em>'.
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	WorkParameterIntegerValue createWorkParameterIntegerValue();

	/**
	 * Returns a new object of class '<em>Work Parameter Map Value</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Work Parameter Map Value</em>'.
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	WorkParameterMapValue createWorkParameterMapValue();

	/**
	 * Returns a new object of class '<em>Export Infos</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Export Infos</em>'.
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	ExportInfos createExportInfos();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	ModiscoworkflowPackage getModiscoworkflowPackage();

} // ModiscoworkflowFactory
