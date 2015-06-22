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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngine;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngineProxy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Engine Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowEngineProxyImpl#getTargetEngine <em>Target Engine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class WorkflowEngineProxyImpl extends WorkflowEngineImpl implements WorkflowEngineProxy {
	/**
	 * The cached value of the '{@link #getTargetEngine() <em>Target Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEngine()
	 * @generated
	 * @ordered
	 */
	protected WorkflowEngine targetEngine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowEngineProxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.WORKFLOW_ENGINE_PROXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowEngine getTargetEngine() {
		if (targetEngine != null && targetEngine.eIsProxy()) {
			InternalEObject oldTargetEngine = (InternalEObject)targetEngine;
			targetEngine = (WorkflowEngine)eResolveProxy(oldTargetEngine);
			if (targetEngine != oldTargetEngine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.WORKFLOW_ENGINE_PROXY__TARGET_ENGINE, oldTargetEngine, targetEngine));
			}
		}
		return targetEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowEngine basicGetTargetEngine() {
		return targetEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEngine(WorkflowEngine newTargetEngine) {
		WorkflowEngine oldTargetEngine = targetEngine;
		targetEngine = newTargetEngine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_ENGINE_PROXY__TARGET_ENGINE, oldTargetEngine, targetEngine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.WORKFLOW_ENGINE_PROXY__TARGET_ENGINE:
				if (resolve) return getTargetEngine();
				return basicGetTargetEngine();
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
			case RuntimePackage.WORKFLOW_ENGINE_PROXY__TARGET_ENGINE:
				setTargetEngine((WorkflowEngine)newValue);
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
			case RuntimePackage.WORKFLOW_ENGINE_PROXY__TARGET_ENGINE:
				setTargetEngine((WorkflowEngine)null);
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
			case RuntimePackage.WORKFLOW_ENGINE_PROXY__TARGET_ENGINE:
				return targetEngine != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkflowEngineProxyImpl
