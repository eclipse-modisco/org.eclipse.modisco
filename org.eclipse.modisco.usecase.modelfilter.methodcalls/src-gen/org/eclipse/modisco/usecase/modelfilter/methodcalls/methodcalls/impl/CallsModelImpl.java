/**
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Gabriel Barbier (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 */
package org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallNode;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallsModel;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodcallsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calls Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.impl.CallsModelImpl#getCallNodes <em>Call Nodes</em>}</li>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.impl.CallsModelImpl#getRootNodes <em>Root Nodes</em>}</li>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.impl.CallsModelImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallsModelImpl extends EObjectImpl implements CallsModel {
	/**
	 * The cached value of the '{@link #getCallNodes() <em>Call Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CallNode> callNodes;

	/**
	 * The cached value of the '{@link #getRootNodes() <em>Root Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CallNode> rootNodes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallsModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MethodcallsPackage.Literals.CALLS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallNode> getCallNodes() {
		if (callNodes == null) {
			callNodes = new EObjectContainmentEList<CallNode>(CallNode.class, this, MethodcallsPackage.CALLS_MODEL__CALL_NODES);
		}
		return callNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallNode> getRootNodes() {
		if (rootNodes == null) {
			rootNodes = new EObjectResolvingEList<CallNode>(CallNode.class, this, MethodcallsPackage.CALLS_MODEL__ROOT_NODES);
		}
		return rootNodes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MethodcallsPackage.CALLS_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MethodcallsPackage.CALLS_MODEL__CALL_NODES:
				return ((InternalEList<?>)getCallNodes()).basicRemove(otherEnd, msgs);
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
			case MethodcallsPackage.CALLS_MODEL__CALL_NODES:
				return getCallNodes();
			case MethodcallsPackage.CALLS_MODEL__ROOT_NODES:
				return getRootNodes();
			case MethodcallsPackage.CALLS_MODEL__NAME:
				return getName();
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
			case MethodcallsPackage.CALLS_MODEL__CALL_NODES:
				getCallNodes().clear();
				getCallNodes().addAll((Collection<? extends CallNode>)newValue);
				return;
			case MethodcallsPackage.CALLS_MODEL__ROOT_NODES:
				getRootNodes().clear();
				getRootNodes().addAll((Collection<? extends CallNode>)newValue);
				return;
			case MethodcallsPackage.CALLS_MODEL__NAME:
				setName((String)newValue);
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
			case MethodcallsPackage.CALLS_MODEL__CALL_NODES:
				getCallNodes().clear();
				return;
			case MethodcallsPackage.CALLS_MODEL__ROOT_NODES:
				getRootNodes().clear();
				return;
			case MethodcallsPackage.CALLS_MODEL__NAME:
				setName(NAME_EDEFAULT);
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
			case MethodcallsPackage.CALLS_MODEL__CALL_NODES:
				return callNodes != null && !callNodes.isEmpty();
			case MethodcallsPackage.CALLS_MODEL__ROOT_NODES:
				return rootNodes != null && !rootNodes.isEmpty();
			case MethodcallsPackage.CALLS_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CallsModelImpl
