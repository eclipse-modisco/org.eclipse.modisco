/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Work Parameter String List Value</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterStringListValue#getValue
 * <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getWorkParameterStringListValue()
 * @model
 * @generated
 */
public interface WorkParameterStringListValue extends WorkParameterValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list. The list
	 * contents are of type {@link java.lang.String}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getWorkParameterStringListValue_Value()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getValue();

} // WorkParameterStringListValue
