/**
 * Copyright (c) 2011 Mia-Software and others.
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallNode;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodCall;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.MethodcallsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.impl.MethodCallImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.impl.MethodCallImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.impl.MethodCallImpl#getCallee <em>Callee</em>}</li>
 *   <li>{@link org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.impl.MethodCallImpl#getFilteredSubMethods <em>Filtered Sub Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodCallImpl extends EObjectImpl implements MethodCall {
	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCallee() <em>Callee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallee()
	 * @generated
	 * @ordered
	 */
	protected CallNode callee;

	/**
	 * The cached value of the '{@link #getFilteredSubMethods() <em>Filtered Sub Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilteredSubMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<CallNode> filteredSubMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MethodcallsPackage.Literals.METHOD_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MethodcallsPackage.METHOD_CALL__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallNode getParent() {
		if (eContainerFeatureID() != MethodcallsPackage.METHOD_CALL__PARENT) return null;
		return (CallNode)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(CallNode newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, MethodcallsPackage.METHOD_CALL__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(CallNode newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != MethodcallsPackage.METHOD_CALL__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, MethodcallsPackage.CALL_NODE__METHOD_CALLS, CallNode.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MethodcallsPackage.METHOD_CALL__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallNode getCallee() {
		if (callee != null && callee.eIsProxy()) {
			InternalEObject oldCallee = (InternalEObject)callee;
			callee = (CallNode)eResolveProxy(oldCallee);
			if (callee != oldCallee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MethodcallsPackage.METHOD_CALL__CALLEE, oldCallee, callee));
			}
		}
		return callee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallNode basicGetCallee() {
		return callee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallee(CallNode newCallee) {
		CallNode oldCallee = callee;
		callee = newCallee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MethodcallsPackage.METHOD_CALL__CALLEE, oldCallee, callee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallNode> getFilteredSubMethods() {
		if (filteredSubMethods == null) {
			filteredSubMethods = new EObjectResolvingEList<CallNode>(CallNode.class, this, MethodcallsPackage.METHOD_CALL__FILTERED_SUB_METHODS);
		}
		return filteredSubMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MethodcallsPackage.METHOD_CALL__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((CallNode)otherEnd, msgs);
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
			case MethodcallsPackage.METHOD_CALL__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MethodcallsPackage.METHOD_CALL__PARENT:
				return eInternalContainer().eInverseRemove(this, MethodcallsPackage.CALL_NODE__METHOD_CALLS, CallNode.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MethodcallsPackage.METHOD_CALL__ORDER:
				return getOrder();
			case MethodcallsPackage.METHOD_CALL__PARENT:
				return getParent();
			case MethodcallsPackage.METHOD_CALL__CALLEE:
				if (resolve) return getCallee();
				return basicGetCallee();
			case MethodcallsPackage.METHOD_CALL__FILTERED_SUB_METHODS:
				return getFilteredSubMethods();
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
			case MethodcallsPackage.METHOD_CALL__ORDER:
				setOrder((Integer)newValue);
				return;
			case MethodcallsPackage.METHOD_CALL__PARENT:
				setParent((CallNode)newValue);
				return;
			case MethodcallsPackage.METHOD_CALL__CALLEE:
				setCallee((CallNode)newValue);
				return;
			case MethodcallsPackage.METHOD_CALL__FILTERED_SUB_METHODS:
				getFilteredSubMethods().clear();
				getFilteredSubMethods().addAll((Collection<? extends CallNode>)newValue);
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
			case MethodcallsPackage.METHOD_CALL__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case MethodcallsPackage.METHOD_CALL__PARENT:
				setParent((CallNode)null);
				return;
			case MethodcallsPackage.METHOD_CALL__CALLEE:
				setCallee((CallNode)null);
				return;
			case MethodcallsPackage.METHOD_CALL__FILTERED_SUB_METHODS:
				getFilteredSubMethods().clear();
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
			case MethodcallsPackage.METHOD_CALL__ORDER:
				return order != ORDER_EDEFAULT;
			case MethodcallsPackage.METHOD_CALL__PARENT:
				return getParent() != null;
			case MethodcallsPackage.METHOD_CALL__CALLEE:
				return callee != null;
			case MethodcallsPackage.METHOD_CALL__FILTERED_SUB_METHODS:
				return filteredSubMethods != null && !filteredSubMethods.isEmpty();
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
		result.append(" (order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //MethodCallImpl
