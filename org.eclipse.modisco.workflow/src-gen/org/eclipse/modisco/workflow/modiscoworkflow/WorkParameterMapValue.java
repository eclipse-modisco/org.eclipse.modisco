/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 *******************************************************************************/
package org.eclipse.modisco.workflow.modiscoworkflow;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Work Parameter Map Value</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterMapValue#getEntryList
 * <em>Entry List</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getWorkParameterMapValue()
 * @model
 * @generated
 */
public interface WorkParameterMapValue extends WorkParameterValue {
	/**
	 * Returns the value of the '<em><b>Entry List</b></em>' map. The key is of
	 * type {@link java.lang.String}, and the value is of type
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterValue},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry List</em>' map isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entry List</em>' map.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getWorkParameterMapValue_EntryList()
	 * @model mapType=
	 *        "org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterEntryValue<org.eclipse.emf.ecore.EString, org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterValue>"
	 * @generated
	 */
	EMap<String, WorkParameterValue> getEntryList();

} // WorkParameterMapValue
