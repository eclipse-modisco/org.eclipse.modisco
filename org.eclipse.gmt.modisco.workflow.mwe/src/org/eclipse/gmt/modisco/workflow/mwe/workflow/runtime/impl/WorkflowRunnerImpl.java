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
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.RuntimePackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowRunner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Runner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowRunnerImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.impl.WorkflowRunnerImpl#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class WorkflowRunnerImpl extends WorkflowRunnableImpl implements WorkflowRunner {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected WorkflowContext context;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected WorkflowComponent component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowRunnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.WORKFLOW_RUNNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowContext getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (WorkflowContext)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.WORKFLOW_RUNNER__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowContext basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(WorkflowContext newContext) {
		WorkflowContext oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_RUNNER__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowComponent getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (WorkflowComponent)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.WORKFLOW_RUNNER__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowComponent basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(WorkflowComponent newComponent) {
		WorkflowComponent oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_RUNNER__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.WORKFLOW_RUNNER__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case RuntimePackage.WORKFLOW_RUNNER__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
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
			case RuntimePackage.WORKFLOW_RUNNER__CONTEXT:
				setContext((WorkflowContext)newValue);
				return;
			case RuntimePackage.WORKFLOW_RUNNER__COMPONENT:
				setComponent((WorkflowComponent)newValue);
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
			case RuntimePackage.WORKFLOW_RUNNER__CONTEXT:
				setContext((WorkflowContext)null);
				return;
			case RuntimePackage.WORKFLOW_RUNNER__COMPONENT:
				setComponent((WorkflowComponent)null);
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
			case RuntimePackage.WORKFLOW_RUNNER__CONTEXT:
				return context != null;
			case RuntimePackage.WORKFLOW_RUNNER__COMPONENT:
				return component != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkflowRunnerImpl
