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

import java.util.concurrent.ExecutorService;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLogEntryType;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowContextImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowContextImpl#getThreadPool <em>Thread Pool</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowContextImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowContextImpl#getLog <em>Log</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowContextImpl#getLogLevel <em>Log Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class WorkflowContextImpl extends EObjectImpl implements WorkflowContext {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EMap<WorkflowParameter, EObject> parameters;

	/**
	 * The default value of the '{@link #getThreadPool() <em>Thread Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadPool()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutorService THREAD_POOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreadPool() <em>Thread Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadPool()
	 * @generated
	 * @ordered
	 */
	protected ExecutorService threadPool = THREAD_POOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EMap<WorkflowComponent, WorkflowState> states;

	/**
	 * The cached value of the '{@link #getLog() <em>Log</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLog()
	 * @generated
	 * @ordered
	 */
	protected EMap<WorkflowComponent, WorkflowLog> log;

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
	protected WorkflowContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.WORKFLOW_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<WorkflowParameter, EObject> getParameters() {
		if (parameters == null) {
			parameters = new EcoreEMap<WorkflowParameter,EObject>(RuntimePackage.Literals.WORKFLOW_PARAMETER_MAP, WorkflowParameterMapImpl.class, this, RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutorService getThreadPool() {
		return threadPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<WorkflowComponent, WorkflowState> getStates() {
		if (states == null) {
			states = new EcoreEMap<WorkflowComponent,WorkflowState>(RuntimePackage.Literals.WORKFLOW_STATE_MAP, WorkflowStateMapImpl.class, this, RuntimePackage.WORKFLOW_CONTEXT__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<WorkflowComponent, WorkflowLog> getLog() {
		if (log == null) {
			log = new EcoreEMap<WorkflowComponent,WorkflowLog>(RuntimePackage.Literals.WORKFLOW_LOG_MAP, WorkflowLogMapImpl.class, this, RuntimePackage.WORKFLOW_CONTEXT__LOG);
		}
		return log;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_CONTEXT__LOG_LEVEL, oldLogLevel, logLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reset(WorkflowComponent component) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resetState(WorkflowComponent component) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resetLog(WorkflowComponent component) {
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
			case RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case RuntimePackage.WORKFLOW_CONTEXT__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case RuntimePackage.WORKFLOW_CONTEXT__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS:
				if (coreType) return getParameters();
				else return getParameters().map();
			case RuntimePackage.WORKFLOW_CONTEXT__THREAD_POOL:
				return getThreadPool();
			case RuntimePackage.WORKFLOW_CONTEXT__STATES:
				if (coreType) return getStates();
				else return getStates().map();
			case RuntimePackage.WORKFLOW_CONTEXT__LOG:
				if (coreType) return getLog();
				else return getLog().map();
			case RuntimePackage.WORKFLOW_CONTEXT__LOG_LEVEL:
				return getLogLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS:
				((EStructuralFeature.Setting)getParameters()).set(newValue);
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__STATES:
				((EStructuralFeature.Setting)getStates()).set(newValue);
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__LOG:
				((EStructuralFeature.Setting)getLog()).set(newValue);
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__LOG_LEVEL:
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
			case RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS:
				getParameters().clear();
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__STATES:
				getStates().clear();
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__LOG:
				getLog().clear();
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__LOG_LEVEL:
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
			case RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case RuntimePackage.WORKFLOW_CONTEXT__THREAD_POOL:
				return THREAD_POOL_EDEFAULT == null ? threadPool != null : !THREAD_POOL_EDEFAULT.equals(threadPool);
			case RuntimePackage.WORKFLOW_CONTEXT__STATES:
				return states != null && !states.isEmpty();
			case RuntimePackage.WORKFLOW_CONTEXT__LOG:
				return log != null && !log.isEmpty();
			case RuntimePackage.WORKFLOW_CONTEXT__LOG_LEVEL:
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
		result.append(" (threadPool: "); //$NON-NLS-1$
		result.append(threadPool);
		result.append(", logLevel: "); //$NON-NLS-1$
		result.append(logLevel);
		result.append(')');
		return result.toString();
	}

} //WorkflowContextImpl
