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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getErrors <em>Errors</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getWarnings <em>Warnings</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getInfos <em>Infos</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getDebugs <em>Debugs</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getLogLevel <em>Log Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowLog()
 * @model
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public interface WorkflowLog extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' attribute list.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowLog_Entries()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getEntries();

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Errors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowLog_Errors()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#entries'"
	 * @generated
	 */
	EList<WorkflowLogEntry> getErrors();

	/**
	 * Returns the value of the '<em><b>Warnings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warnings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warnings</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowLog_Warnings()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#entries'"
	 * @generated
	 */
	EList<WorkflowLogEntry> getWarnings();

	/**
	 * Returns the value of the '<em><b>Infos</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infos</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowLog_Infos()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#entries'"
	 * @generated
	 */
	EList<WorkflowLogEntry> getInfos();

	/**
	 * Returns the value of the '<em><b>Debugs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debugs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debugs</em>' containment reference list.
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowLog_Debugs()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#entries'"
	 * @generated
	 */
	EList<WorkflowLogEntry> getDebugs();

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
	 * @see org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage#getWorkflowLog_LogLevel()
	 * @model
	 * @generated
	 */
	WorkflowLogEntryType getLogLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog#getLogLevel <em>Log Level</em>}' attribute.
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
	void logError(String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void logWarning(String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void logInfo(String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void logDebug(String message);

} // WorkflowLog
