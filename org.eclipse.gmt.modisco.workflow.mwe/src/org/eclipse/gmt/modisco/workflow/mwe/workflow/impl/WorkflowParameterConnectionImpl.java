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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterConnectionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterConnectionImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class WorkflowParameterConnectionImpl extends EObjectImpl implements WorkflowParameterConnection {
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameter output;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowParameter> inputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowParameterConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.WORKFLOW_PARAMETER_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameter getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (WorkflowParameter)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameter basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(WorkflowParameter newOutput) {
		WorkflowParameter oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkflowParameter> getInputs() {
		if (inputs == null) {
			inputs = new EObjectWithInverseResolvingEList<WorkflowParameter>(WorkflowParameter.class, this, WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__INPUTS, WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__INPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__INPUTS:
				return getInputs();
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
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__OUTPUT:
				setOutput((WorkflowParameter)newValue);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends WorkflowParameter>)newValue);
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
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__OUTPUT:
				setOutput((WorkflowParameter)null);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__INPUTS:
				getInputs().clear();
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
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__OUTPUT:
				return output != null;
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__INPUTS:
				return inputs != null && !inputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkflowParameterConnectionImpl
