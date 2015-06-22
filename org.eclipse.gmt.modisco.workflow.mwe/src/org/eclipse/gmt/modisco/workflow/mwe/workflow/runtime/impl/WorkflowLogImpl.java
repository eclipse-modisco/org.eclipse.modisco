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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntry;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogImpl#getErrors <em>Errors</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogImpl#getWarnings <em>Warnings</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogImpl#getInfos <em>Infos</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogImpl#getDebugs <em>Debugs</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowLogImpl#getLogLevel <em>Log Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class WorkflowLogImpl extends EObjectImpl implements WorkflowLog {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap entries;

	/**
	 * The default value of the '{@link #getLogLevel() <em>Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogLevel()
	 * @generated
	 * @ordered
	 */
	protected static final WorkflowLogEntryType LOG_LEVEL_EDEFAULT = WorkflowLogEntryType.ERROR;

	/**
	 * The cached value of the '{@link #getLogLevel() <em>Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogLevel()
	 * @generated
	 * @ordered
	 */
	protected WorkflowLogEntryType logLevel = LOG_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.WORKFLOW_LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getEntries() {
		if (entries == null) {
			entries = new BasicFeatureMap(this, RuntimePackage.WORKFLOW_LOG__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkflowLogEntry> getErrors() {
		return getEntries().list(RuntimePackage.Literals.WORKFLOW_LOG__ERRORS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkflowLogEntry> getWarnings() {
		return getEntries().list(RuntimePackage.Literals.WORKFLOW_LOG__WARNINGS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkflowLogEntry> getInfos() {
		return getEntries().list(RuntimePackage.Literals.WORKFLOW_LOG__INFOS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkflowLogEntry> getDebugs() {
		return getEntries().list(RuntimePackage.Literals.WORKFLOW_LOG__DEBUGS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowLogEntryType getLogLevel() {
		return logLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogLevel(WorkflowLogEntryType newLogLevel) {
		WorkflowLogEntryType oldLogLevel = logLevel;
		logLevel = newLogLevel == null ? LOG_LEVEL_EDEFAULT : newLogLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_LOG__LOG_LEVEL, oldLogLevel, logLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void logError(String message) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void logWarning(String message) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void logInfo(String message) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void logDebug(String message) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.WORKFLOW_LOG__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
			case RuntimePackage.WORKFLOW_LOG__ERRORS:
				return ((InternalEList<?>)getErrors()).basicRemove(otherEnd, msgs);
			case RuntimePackage.WORKFLOW_LOG__WARNINGS:
				return ((InternalEList<?>)getWarnings()).basicRemove(otherEnd, msgs);
			case RuntimePackage.WORKFLOW_LOG__INFOS:
				return ((InternalEList<?>)getInfos()).basicRemove(otherEnd, msgs);
			case RuntimePackage.WORKFLOW_LOG__DEBUGS:
				return ((InternalEList<?>)getDebugs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.WORKFLOW_LOG__ENTRIES:
				if (coreType) return getEntries();
				return ((FeatureMap.Internal)getEntries()).getWrapper();
			case RuntimePackage.WORKFLOW_LOG__ERRORS:
				return getErrors();
			case RuntimePackage.WORKFLOW_LOG__WARNINGS:
				return getWarnings();
			case RuntimePackage.WORKFLOW_LOG__INFOS:
				return getInfos();
			case RuntimePackage.WORKFLOW_LOG__DEBUGS:
				return getDebugs();
			case RuntimePackage.WORKFLOW_LOG__LOG_LEVEL:
				return getLogLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RuntimePackage.WORKFLOW_LOG__ENTRIES:
				((FeatureMap.Internal)getEntries()).set(newValue);
				return;
			case RuntimePackage.WORKFLOW_LOG__ERRORS:
				getErrors().clear();
				getErrors().addAll((Collection<? extends WorkflowLogEntry>)newValue);
				return;
			case RuntimePackage.WORKFLOW_LOG__WARNINGS:
				getWarnings().clear();
				getWarnings().addAll((Collection<? extends WorkflowLogEntry>)newValue);
				return;
			case RuntimePackage.WORKFLOW_LOG__INFOS:
				getInfos().clear();
				getInfos().addAll((Collection<? extends WorkflowLogEntry>)newValue);
				return;
			case RuntimePackage.WORKFLOW_LOG__DEBUGS:
				getDebugs().clear();
				getDebugs().addAll((Collection<? extends WorkflowLogEntry>)newValue);
				return;
			case RuntimePackage.WORKFLOW_LOG__LOG_LEVEL:
				setLogLevel((WorkflowLogEntryType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RuntimePackage.WORKFLOW_LOG__ENTRIES:
				getEntries().clear();
				return;
			case RuntimePackage.WORKFLOW_LOG__ERRORS:
				getErrors().clear();
				return;
			case RuntimePackage.WORKFLOW_LOG__WARNINGS:
				getWarnings().clear();
				return;
			case RuntimePackage.WORKFLOW_LOG__INFOS:
				getInfos().clear();
				return;
			case RuntimePackage.WORKFLOW_LOG__DEBUGS:
				getDebugs().clear();
				return;
			case RuntimePackage.WORKFLOW_LOG__LOG_LEVEL:
				setLogLevel(LOG_LEVEL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RuntimePackage.WORKFLOW_LOG__ENTRIES:
				return entries != null && !entries.isEmpty();
			case RuntimePackage.WORKFLOW_LOG__ERRORS:
				return !getErrors().isEmpty();
			case RuntimePackage.WORKFLOW_LOG__WARNINGS:
				return !getWarnings().isEmpty();
			case RuntimePackage.WORKFLOW_LOG__INFOS:
				return !getInfos().isEmpty();
			case RuntimePackage.WORKFLOW_LOG__DEBUGS:
				return !getDebugs().isEmpty();
			case RuntimePackage.WORKFLOW_LOG__LOG_LEVEL:
				return logLevel != LOG_LEVEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (entries: "); //$NON-NLS-1$
		result.append(entries);
		result.append(", logLevel: "); //$NON-NLS-1$
		result.append(logLevel);
		result.append(')');
		return result.toString();
	}

} //WorkflowLogImpl
