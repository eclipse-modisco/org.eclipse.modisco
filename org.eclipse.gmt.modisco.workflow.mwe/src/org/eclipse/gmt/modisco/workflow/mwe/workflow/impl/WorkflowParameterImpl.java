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

import org.eclipse.gmt.modisco.workflow.mwe.workflow.Direction;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowPackage;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameter;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterConnection;
import org.eclipse.gmt.modisco.workflow.mwe.workflow.WorkflowParameterValueStrategy;

import org.eclipse.gmt.modisco.workflow.mwe.workflow.runtime.WorkflowContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterImpl#getValueStrategy <em>Value Strategy</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.workflow.mwe.workflow.impl.WorkflowParameterImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class WorkflowParameterImpl extends EObjectImpl implements WorkflowParameter {
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
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameterConnection connection;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueStrategy() <em>Value Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueStrategy()
	 * @generated
	 * @ordered
	 */
	protected WorkflowParameterValueStrategy valueStrategy;

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
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.WORKFLOW_PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameterConnection getConnection() {
		if (connection != null && connection.eIsProxy()) {
			InternalEObject oldConnection = (InternalEObject)connection;
			connection = (WorkflowParameterConnection)eResolveProxy(oldConnection);
			if (connection != oldConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION, oldConnection, connection));
			}
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameterConnection basicGetConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnection(WorkflowParameterConnection newConnection, NotificationChain msgs) {
		WorkflowParameterConnection oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION, oldConnection, newConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(WorkflowParameterConnection newConnection) {
		if (newConnection != connection) {
			NotificationChain msgs = null;
			if (connection != null)
				msgs = ((InternalEObject)connection).eInverseRemove(this, WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__INPUTS, WorkflowParameterConnection.class, msgs);
			if (newConnection != null)
				msgs = ((InternalEObject)newConnection).eInverseAdd(this, WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__INPUTS, WorkflowParameterConnection.class, msgs);
			msgs = basicSetConnection(newConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION, newConnection, newConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameterValueStrategy getValueStrategy() {
		return valueStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueStrategy(WorkflowParameterValueStrategy newValueStrategy, NotificationChain msgs) {
		WorkflowParameterValueStrategy oldValueStrategy = valueStrategy;
		valueStrategy = newValueStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY, oldValueStrategy, newValueStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueStrategy(WorkflowParameterValueStrategy newValueStrategy) {
		if (newValueStrategy != valueStrategy) {
			NotificationChain msgs = null;
			if (valueStrategy != null)
				msgs = ((InternalEObject)valueStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY, null, msgs);
			if (newValueStrategy != null)
				msgs = ((InternalEObject)newValueStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY, null, msgs);
			msgs = basicSetValueStrategy(newValueStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY, newValueStrategy, newValueStrategy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Direction newDirection) {
		Direction oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_PARAMETER__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue(WorkflowContext context) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(WorkflowContext context, Object value) {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION:
				if (connection != null)
					msgs = ((InternalEObject)connection).eInverseRemove(this, WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION__INPUTS, WorkflowParameterConnection.class, msgs);
				return basicSetConnection((WorkflowParameterConnection)otherEnd, msgs);
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
			case WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION:
				return basicSetConnection(null, msgs);
			case WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY:
				return basicSetValueStrategy(null, msgs);
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
			case WorkflowPackage.WORKFLOW_PARAMETER__NAME:
				return getName();
			case WorkflowPackage.WORKFLOW_PARAMETER__DESCRIPTION:
				return getDescription();
			case WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION:
				if (resolve) return getConnection();
				return basicGetConnection();
			case WorkflowPackage.WORKFLOW_PARAMETER__REQUIRED:
				return isRequired();
			case WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY:
				return getValueStrategy();
			case WorkflowPackage.WORKFLOW_PARAMETER__TYPE:
				return getType();
			case WorkflowPackage.WORKFLOW_PARAMETER__DIRECTION:
				return getDirection();
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
			case WorkflowPackage.WORKFLOW_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION:
				setConnection((WorkflowParameterConnection)newValue);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY:
				setValueStrategy((WorkflowParameterValueStrategy)newValue);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__TYPE:
				setType((String)newValue);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__DIRECTION:
				setDirection((Direction)newValue);
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
			case WorkflowPackage.WORKFLOW_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION:
				setConnection((WorkflowParameterConnection)null);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY:
				setValueStrategy((WorkflowParameterValueStrategy)null);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_PARAMETER__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case WorkflowPackage.WORKFLOW_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.WORKFLOW_PARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WorkflowPackage.WORKFLOW_PARAMETER__CONNECTION:
				return connection != null;
			case WorkflowPackage.WORKFLOW_PARAMETER__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case WorkflowPackage.WORKFLOW_PARAMETER__VALUE_STRATEGY:
				return valueStrategy != null;
			case WorkflowPackage.WORKFLOW_PARAMETER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case WorkflowPackage.WORKFLOW_PARAMETER__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
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
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(", required: "); //$NON-NLS-1$
		result.append(required);
		result.append(", type: "); //$NON-NLS-1$
		result.append(type);
		result.append(", direction: "); //$NON-NLS-1$
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //WorkflowParameterImpl
