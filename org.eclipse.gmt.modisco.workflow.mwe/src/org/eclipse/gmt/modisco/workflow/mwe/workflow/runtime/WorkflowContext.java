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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime;

import java.util.concurrent.ExecutorService;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext#getThreadPool <em>Thread Pool</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext#getStates <em>States</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext#getLog <em>Log</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext#getLogLevel <em>Log Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowContext()
 * @model
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface WorkflowContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' map.
	 * The key is of type {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter},
	 * and the value is of type {@link org.eclipse.emf.ecore.EObject},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' map.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowContext_Parameters()
	 * @model mapType="org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowParameterMap<org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter, org.eclipse.emf.ecore.EObject>"
	 * @generated
	 */
	EMap<WorkflowParameter, EObject> getParameters();

	/**
	 * Returns the value of the '<em><b>Thread Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Pool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Pool</em>' attribute.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowContext_ThreadPool()
	 * @model dataType="org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.ExecutorService" transient="true" changeable="false"
	 * @generated
	 */
	ExecutorService getThreadPool();

	/**
	 * Returns the value of the '<em><b>States</b></em>' map.
	 * The key is of type {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent},
	 * and the value is of type {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowState},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' map.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowContext_States()
	 * @model mapType="org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowStateMap<org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent, org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowState>"
	 * @generated
	 */
	EMap<WorkflowComponent, WorkflowState> getStates();

	/**
	 * Returns the value of the '<em><b>Log</b></em>' map.
	 * The key is of type {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent},
	 * and the value is of type {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' map.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowContext_Log()
	 * @model mapType="org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogMap<org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent, org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog>"
	 * @generated
	 */
	EMap<WorkflowComponent, WorkflowLog> getLog();

	/**
	 * Returns the value of the '<em><b>Log Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Level</em>' attribute.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntryType
	 * @see #setLogLevel(WorkflowLogEntryType)
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowContext_LogLevel()
	 * @model
	 * @generated
	 */
	WorkflowLogEntryType getLogLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext#getLogLevel <em>Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Level</em>' attribute.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntryType
	 * @see #getLogLevel()
	 * @generated
	 */
	void setLogLevel(WorkflowLogEntryType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reset(WorkflowComponent component);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resetState(WorkflowComponent component);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resetLog(WorkflowComponent component);

} // WorkflowContext
