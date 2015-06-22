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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowComponent;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowCompositeComponent;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.orchestration.WorkflowCompositeOrchestrationStrategy;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowStateResolutionStrategy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowCompositeComponentImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowCompositeComponentImpl#getCompositeOrchestrationStrategy <em>Composite Orchestration Strategy</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowCompositeComponentImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowCompositeComponentImpl#getStateResolutionStrategy <em>State Resolution Strategy</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowCompositeComponentImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class WorkflowCompositeComponentImpl extends WorkflowComponentImpl implements WorkflowCompositeComponent {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowComponent> components;

	/**
	 * The cached value of the '{@link #getCompositeOrchestrationStrategy() <em>Composite Orchestration Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeOrchestrationStrategy()
	 * @generated
	 * @ordered
	 */
	protected WorkflowCompositeOrchestrationStrategy compositeOrchestrationStrategy;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowParameterConnection> connections;

	/**
	 * The cached value of the '{@link #getStateResolutionStrategy() <em>State Resolution Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateResolutionStrategy()
	 * @generated
	 * @ordered
	 */
	protected WorkflowStateResolutionStrategy stateResolutionStrategy;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowCompositeComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.WORKFLOW_COMPOSITE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkflowComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<WorkflowComponent>(WorkflowComponent.class, this, WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowCompositeOrchestrationStrategy getCompositeOrchestrationStrategy() {
		return compositeOrchestrationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeOrchestrationStrategy(WorkflowCompositeOrchestrationStrategy newCompositeOrchestrationStrategy, NotificationChain msgs) {
		WorkflowCompositeOrchestrationStrategy oldCompositeOrchestrationStrategy = compositeOrchestrationStrategy;
		compositeOrchestrationStrategy = newCompositeOrchestrationStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY, oldCompositeOrchestrationStrategy, newCompositeOrchestrationStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeOrchestrationStrategy(WorkflowCompositeOrchestrationStrategy newCompositeOrchestrationStrategy) {
		if (newCompositeOrchestrationStrategy != compositeOrchestrationStrategy) {
			NotificationChain msgs = null;
			if (compositeOrchestrationStrategy != null)
				msgs = ((InternalEObject)compositeOrchestrationStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY, null, msgs);
			if (newCompositeOrchestrationStrategy != null)
				msgs = ((InternalEObject)newCompositeOrchestrationStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY, null, msgs);
			msgs = basicSetCompositeOrchestrationStrategy(newCompositeOrchestrationStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY, newCompositeOrchestrationStrategy, newCompositeOrchestrationStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkflowParameterConnection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<WorkflowParameterConnection>(WorkflowParameterConnection.class, this, WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowStateResolutionStrategy getStateResolutionStrategy() {
		return stateResolutionStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateResolutionStrategy(WorkflowStateResolutionStrategy newStateResolutionStrategy, NotificationChain msgs) {
		WorkflowStateResolutionStrategy oldStateResolutionStrategy = stateResolutionStrategy;
		stateResolutionStrategy = newStateResolutionStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY, oldStateResolutionStrategy, newStateResolutionStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateResolutionStrategy(WorkflowStateResolutionStrategy newStateResolutionStrategy) {
		if (newStateResolutionStrategy != stateResolutionStrategy) {
			NotificationChain msgs = null;
			if (stateResolutionStrategy != null)
				msgs = ((InternalEObject)stateResolutionStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY, null, msgs);
			if (newStateResolutionStrategy != null)
				msgs = ((InternalEObject)newStateResolutionStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY, null, msgs);
			msgs = basicSetStateResolutionStrategy(newStateResolutionStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY, newStateResolutionStrategy, newStateResolutionStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkflowParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<WorkflowParameter>(WorkflowParameter.class, this, WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY:
				return basicSetCompositeOrchestrationStrategy(null, msgs);
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY:
				return basicSetStateResolutionStrategy(null, msgs);
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
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS:
				return getComponents();
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY:
				return getCompositeOrchestrationStrategy();
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS:
				return getConnections();
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY:
				return getStateResolutionStrategy();
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__PARAMETERS:
				return getParameters();
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
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends WorkflowComponent>)newValue);
				return;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY:
				setCompositeOrchestrationStrategy((WorkflowCompositeOrchestrationStrategy)newValue);
				return;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends WorkflowParameterConnection>)newValue);
				return;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY:
				setStateResolutionStrategy((WorkflowStateResolutionStrategy)newValue);
				return;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends WorkflowParameter>)newValue);
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
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS:
				getComponents().clear();
				return;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY:
				setCompositeOrchestrationStrategy((WorkflowCompositeOrchestrationStrategy)null);
				return;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS:
				getConnections().clear();
				return;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY:
				setStateResolutionStrategy((WorkflowStateResolutionStrategy)null);
				return;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__PARAMETERS:
				getParameters().clear();
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
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS:
				return components != null && !components.isEmpty();
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY:
				return compositeOrchestrationStrategy != null;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY:
				return stateResolutionStrategy != null;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkflowCompositeComponentImpl
