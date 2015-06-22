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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.IWorkflowVisitor;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowComponentOrchestrationStrategy;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowLog;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.state.WorkflowState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowComponentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowComponentImpl#getComponentOrchestrationStrategy <em>Component Orchestration Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public abstract class WorkflowComponentImpl extends EObjectImpl implements WorkflowComponent {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponentOrchestrationStrategy() <em>Component Orchestration Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentOrchestrationStrategy()
	 * @generated
	 * @ordered
	 */
	protected WorkflowComponentOrchestrationStrategy componentOrchestrationStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.WORKFLOW_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_COMPONENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_COMPONENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowComponentOrchestrationStrategy getComponentOrchestrationStrategy() {
		return componentOrchestrationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentOrchestrationStrategy(WorkflowComponentOrchestrationStrategy newComponentOrchestrationStrategy, NotificationChain msgs) {
		WorkflowComponentOrchestrationStrategy oldComponentOrchestrationStrategy = componentOrchestrationStrategy;
		componentOrchestrationStrategy = newComponentOrchestrationStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY, oldComponentOrchestrationStrategy, newComponentOrchestrationStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentOrchestrationStrategy(WorkflowComponentOrchestrationStrategy newComponentOrchestrationStrategy) {
		if (newComponentOrchestrationStrategy != componentOrchestrationStrategy) {
			NotificationChain msgs = null;
			if (componentOrchestrationStrategy != null)
				msgs = ((InternalEObject)componentOrchestrationStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY, null, msgs);
			if (newComponentOrchestrationStrategy != null)
				msgs = ((InternalEObject)newComponentOrchestrationStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY, null, msgs);
			msgs = basicSetComponentOrchestrationStrategy(newComponentOrchestrationStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY, newComponentOrchestrationStrategy, newComponentOrchestrationStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(IWorkflowVisitor visitor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void start(WorkflowContext context) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowState run(WorkflowContext context) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowLog logError(WorkflowContext context) {
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
			case WorkflowPackage.WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY:
				return basicSetComponentOrchestrationStrategy(null, msgs);
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
			case WorkflowPackage.WORKFLOW_COMPONENT__NAME:
				return getName();
			case WorkflowPackage.WORKFLOW_COMPONENT__TYPE:
				return getType();
			case WorkflowPackage.WORKFLOW_COMPONENT__DESCRIPTION:
				return getDescription();
			case WorkflowPackage.WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY:
				return getComponentOrchestrationStrategy();
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
			case WorkflowPackage.WORKFLOW_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.WORKFLOW_COMPONENT__TYPE:
				setType((String)newValue);
				return;
			case WorkflowPackage.WORKFLOW_COMPONENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WorkflowPackage.WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY:
				setComponentOrchestrationStrategy((WorkflowComponentOrchestrationStrategy)newValue);
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
			case WorkflowPackage.WORKFLOW_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_COMPONENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_COMPONENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY:
				setComponentOrchestrationStrategy((WorkflowComponentOrchestrationStrategy)null);
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
			case WorkflowPackage.WORKFLOW_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.WORKFLOW_COMPONENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case WorkflowPackage.WORKFLOW_COMPONENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WorkflowPackage.WORKFLOW_COMPONENT__COMPONENT_ORCHESTRATION_STRATEGY:
				return componentOrchestrationStrategy != null;
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", type: "); //$NON-NLS-1$
		result.append(type);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //WorkflowComponentImpl
