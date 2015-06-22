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
package org.eclipse.gmt.modisco.workflow.mwe.workflow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponentProxy;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowComponentProxyImpl#getTargetComponent <em>Target Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class WorkflowComponentProxyImpl extends WorkflowComponentImpl implements WorkflowComponentProxy {
	/**
	 * The cached value of the '{@link #getTargetComponent() <em>Target Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetComponent()
	 * @generated
	 * @ordered
	 */
	protected WorkflowComponent targetComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowComponentProxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.WORKFLOW_COMPONENT_PROXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowComponent getTargetComponent() {
		if (targetComponent != null && targetComponent.eIsProxy()) {
			InternalEObject oldTargetComponent = (InternalEObject)targetComponent;
			targetComponent = (WorkflowComponent)eResolveProxy(oldTargetComponent);
			if (targetComponent != oldTargetComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT, oldTargetComponent, targetComponent));
			}
		}
		return targetComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowComponent basicGetTargetComponent() {
		return targetComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetComponent(WorkflowComponent newTargetComponent) {
		WorkflowComponent oldTargetComponent = targetComponent;
		targetComponent = newTargetComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT, oldTargetComponent, targetComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT:
				if (resolve) return getTargetComponent();
				return basicGetTargetComponent();
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
			case WorkflowPackage.WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT:
				setTargetComponent((WorkflowComponent)newValue);
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
			case WorkflowPackage.WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT:
				setTargetComponent((WorkflowComponent)null);
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
			case WorkflowPackage.WORKFLOW_COMPONENT_PROXY__TARGET_COMPONENT:
				return targetComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkflowComponentProxyImpl
