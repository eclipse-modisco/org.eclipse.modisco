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

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Work Parameter String Value</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterStringValue#getValue
 * <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getWorkParameterStringValue()
 * @model
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public interface WorkParameterStringValue extends WorkParameterValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.gmt.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getWorkParameterStringValue_Value()
	 * @model
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	String getValue();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.gmt.modisco.workflow.modiscoworkflow.WorkParameterStringValue#getValue
	 * <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 * @deprecated
	 */
	@Deprecated
	void setValue(String value);

} // WorkParameterStringValue
