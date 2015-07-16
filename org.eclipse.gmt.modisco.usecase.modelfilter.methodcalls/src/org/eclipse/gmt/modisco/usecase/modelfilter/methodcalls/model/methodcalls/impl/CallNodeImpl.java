/**
 * *******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *     
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodCall;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodcallsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Call Node</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.CallNodeImpl#getMethodCalls
 * <em>Method Calls</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.CallNodeImpl#getSubMethods
 * <em>Sub Methods</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.CallNodeImpl#getJavaMethod
 * <em>Java Method</em>}</li>
 * <li>
 * {@link org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.impl.CallNodeImpl#getName
 * <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public class CallNodeImpl extends EObjectImpl implements CallNode {
	/**
	 * The cached value of the '{@link #getMethodCalls() <em>Method Calls</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMethodCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodCall> methodCalls;

	/**
	 * The cached value of the '{@link #getSubMethods() <em>Sub Methods</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSubMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<CallNode> subMethods;

	/**
	 * The cached value of the '{@link #getJavaMethod() <em>Java Method</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getJavaMethod()
	 * @generated
	 * @ordered
	 */
	protected AbstractMethodDeclaration javaMethod;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CallNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MethodcallsPackage.Literals.CALL_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MethodCall> getMethodCalls() {
		if (methodCalls == null) {
			methodCalls = new EObjectContainmentWithInverseEList<MethodCall>(MethodCall.class,
					this, MethodcallsPackage.CALL_NODE__METHOD_CALLS,
					MethodcallsPackage.METHOD_CALL__PARENT);
		}
		return methodCalls;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CallNode> getSubMethods() {
		if (subMethods == null) {
			subMethods = new EObjectResolvingEList<CallNode>(CallNode.class, this,
					MethodcallsPackage.CALL_NODE__SUB_METHODS);
		}
		return subMethods;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AbstractMethodDeclaration getJavaMethod() {
		if (javaMethod != null && javaMethod.eIsProxy()) {
			InternalEObject oldJavaMethod = (InternalEObject) javaMethod;
			javaMethod = (AbstractMethodDeclaration) eResolveProxy(oldJavaMethod);
			if (javaMethod != oldJavaMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MethodcallsPackage.CALL_NODE__JAVA_METHOD, oldJavaMethod, javaMethod));
			}
		}
		return javaMethod;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AbstractMethodDeclaration basicGetJavaMethod() {
		return javaMethod;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setJavaMethod(AbstractMethodDeclaration newJavaMethod) {
		AbstractMethodDeclaration oldJavaMethod = javaMethod;
		javaMethod = newJavaMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MethodcallsPackage.CALL_NODE__JAVA_METHOD, oldJavaMethod, javaMethod));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MethodcallsPackage.CALL_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case MethodcallsPackage.CALL_NODE__METHOD_CALLS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMethodCalls()).basicAdd(
					otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case MethodcallsPackage.CALL_NODE__METHOD_CALLS:
			return ((InternalEList<?>) getMethodCalls()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MethodcallsPackage.CALL_NODE__METHOD_CALLS:
			return getMethodCalls();
		case MethodcallsPackage.CALL_NODE__SUB_METHODS:
			return getSubMethods();
		case MethodcallsPackage.CALL_NODE__JAVA_METHOD:
			if (resolve)
				return getJavaMethod();
			return basicGetJavaMethod();
		case MethodcallsPackage.CALL_NODE__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MethodcallsPackage.CALL_NODE__METHOD_CALLS:
			getMethodCalls().clear();
			getMethodCalls().addAll((Collection<? extends MethodCall>) newValue);
			return;
		case MethodcallsPackage.CALL_NODE__SUB_METHODS:
			getSubMethods().clear();
			getSubMethods().addAll((Collection<? extends CallNode>) newValue);
			return;
		case MethodcallsPackage.CALL_NODE__JAVA_METHOD:
			setJavaMethod((AbstractMethodDeclaration) newValue);
			return;
		case MethodcallsPackage.CALL_NODE__NAME:
			setName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MethodcallsPackage.CALL_NODE__METHOD_CALLS:
			getMethodCalls().clear();
			return;
		case MethodcallsPackage.CALL_NODE__SUB_METHODS:
			getSubMethods().clear();
			return;
		case MethodcallsPackage.CALL_NODE__JAVA_METHOD:
			setJavaMethod((AbstractMethodDeclaration) null);
			return;
		case MethodcallsPackage.CALL_NODE__NAME:
			setName(NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MethodcallsPackage.CALL_NODE__METHOD_CALLS:
			return methodCalls != null && !methodCalls.isEmpty();
		case MethodcallsPackage.CALL_NODE__SUB_METHODS:
			return subMethods != null && !subMethods.isEmpty();
		case MethodcallsPackage.CALL_NODE__JAVA_METHOD:
			return javaMethod != null;
		case MethodcallsPackage.CALL_NODE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // CallNodeImpl
