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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#isRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getValueStrategy <em>Value Strategy</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowParameter()
 * @model
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface WorkflowParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowParameter_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference.
	 * @see #setConnection(WorkflowParameterConnection)
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowParameter_Connection()
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection#getInputs
	 * @model opposite="inputs"
	 * @generated
	 */
	WorkflowParameterConnection getConnection();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(WorkflowParameterConnection value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowParameter_Required()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Value Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Strategy</em>' containment reference.
	 * @see #setValueStrategy(WorkflowParameterValueStrategy)
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowParameter_ValueStrategy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	WorkflowParameterValueStrategy getValueStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getValueStrategy <em>Value Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Strategy</em>' containment reference.
	 * @see #getValueStrategy()
	 * @generated
	 */
	void setValueStrategy(WorkflowParameterValueStrategy value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowParameter_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.Direction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.Direction
	 * @see #setDirection(Direction)
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage#getWorkflowParameter_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object getValue(WorkflowContext context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setValue(WorkflowContext context, Object value);

} // WorkflowParameter
