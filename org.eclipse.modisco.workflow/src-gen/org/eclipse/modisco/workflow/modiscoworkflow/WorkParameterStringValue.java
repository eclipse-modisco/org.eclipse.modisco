/*******************************************************************************
 * Copyright (c) 2011 Mia-Software and others.
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

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Work Parameter String Value</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterStringValue#getValue
 * <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getWorkParameterStringValue()
 * @model
 * @generated
 */
public interface WorkParameterStringValue extends WorkParameterValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getWorkParameterStringValue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameterStringValue#getValue
	 * <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // WorkParameterStringValue
