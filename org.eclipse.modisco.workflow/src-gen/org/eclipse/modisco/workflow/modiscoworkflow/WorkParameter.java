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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Work Parameter</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getName
 * <em>Name</em>}</li>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getDirection
 * <em>Direction</em>}</li>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getType
 * <em>Type</em>}</li>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#isRequired
 * <em>Required</em>}</li>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getValue
 * <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getWorkParameter()
 * @model
 * @generated
 */
public interface WorkParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getWorkParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute. The
	 * default value is <code>""</code>. The literals are from the enumeration
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.Direction}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.Direction
	 * @see #setDirection(Direction)
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getWorkParameter_Direction()
	 * @model default=""
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getDirection
	 * <em>Direction</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getWorkParameter_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getType
	 * <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getWorkParameter_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#isRequired
	 * <em>Required</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getWorkParameter_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getDescription
	 * <em>Description</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(WorkParameterValue)
	 * @see org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowPackage#getWorkParameter_Value()
	 * @model containment="true"
	 * @generated
	 */
	WorkParameterValue getValue();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.modisco.workflow.modiscoworkflow.WorkParameter#getValue
	 * <em>Value</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(WorkParameterValue value);

} // WorkParameter
