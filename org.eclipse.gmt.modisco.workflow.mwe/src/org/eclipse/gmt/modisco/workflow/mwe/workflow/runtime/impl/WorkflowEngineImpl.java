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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowEngine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Engine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowEngineImpl#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowEngineImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowEngineImpl#getEngines <em>Engines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class WorkflowEngineImpl extends WorkflowRunnableImpl implements WorkflowEngine {
	/**
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected WorkflowComponent workflow;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected WorkflowContext context;

	/**
	 * The cached value of the '{@link #getEngines() <em>Engines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngines()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowEngine> engines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowEngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.WORKFLOW_ENGINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowComponent getWorkflow() {
		if (workflow != null && workflow.eIsProxy()) {
			InternalEObject oldWorkflow = (InternalEObject)workflow;
			workflow = (WorkflowComponent)eResolveProxy(oldWorkflow);
			if (workflow != oldWorkflow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.WORKFLOW_ENGINE__WORKFLOW, oldWorkflow, workflow));
			}
		}
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowComponent basicGetWorkflow() {
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflow(WorkflowComponent newWorkflow) {
		WorkflowComponent oldWorkflow = workflow;
		workflow = newWorkflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_ENGINE__WORKFLOW, oldWorkflow, workflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowContext getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(WorkflowContext newContext, NotificationChain msgs) {
		WorkflowContext oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_ENGINE__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(WorkflowContext newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.WORKFLOW_ENGINE__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.WORKFLOW_ENGINE__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_ENGINE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkflowEngine> getEngines() {
		if (engines == null) {
			engines = new EObjectContainmentEList<WorkflowEngine>(WorkflowEngine.class, this, RuntimePackage.WORKFLOW_ENGINE__ENGINES);
		}
		return engines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reset() {
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
			case RuntimePackage.WORKFLOW_ENGINE__CONTEXT:
				return basicSetContext(null, msgs);
			case RuntimePackage.WORKFLOW_ENGINE__ENGINES:
				return ((InternalEList<?>)getEngines()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.WORKFLOW_ENGINE__WORKFLOW:
				if (resolve) return getWorkflow();
				return basicGetWorkflow();
			case RuntimePackage.WORKFLOW_ENGINE__CONTEXT:
				return getContext();
			case RuntimePackage.WORKFLOW_ENGINE__ENGINES:
				return getEngines();
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
			case RuntimePackage.WORKFLOW_ENGINE__WORKFLOW:
				setWorkflow((WorkflowComponent)newValue);
				return;
			case RuntimePackage.WORKFLOW_ENGINE__CONTEXT:
				setContext((WorkflowContext)newValue);
				return;
			case RuntimePackage.WORKFLOW_ENGINE__ENGINES:
				getEngines().clear();
				getEngines().addAll((Collection<? extends WorkflowEngine>)newValue);
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
			case RuntimePackage.WORKFLOW_ENGINE__WORKFLOW:
				setWorkflow((WorkflowComponent)null);
				return;
			case RuntimePackage.WORKFLOW_ENGINE__CONTEXT:
				setContext((WorkflowContext)null);
				return;
			case RuntimePackage.WORKFLOW_ENGINE__ENGINES:
				getEngines().clear();
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
			case RuntimePackage.WORKFLOW_ENGINE__WORKFLOW:
				return workflow != null;
			case RuntimePackage.WORKFLOW_ENGINE__CONTEXT:
				return context != null;
			case RuntimePackage.WORKFLOW_ENGINE__ENGINES:
				return engines != null && !engines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkflowEngineImpl
