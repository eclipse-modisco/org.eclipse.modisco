/**
 * *******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 
 *     Sebastien Minguet (Mia-Software) - initial API and implementation
 *     Frederic Madiot (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - initial API and implementation
 *     Erwan Breton (Sodifrance) - initial API and implementation
 *     Romain Dervaux (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.java.emf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Method Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.AbstractMethodInvocationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.AbstractMethodInvocationImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.eclipse.modisco.java.emf.impl.AbstractMethodInvocationImpl#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractMethodInvocationImpl extends ASTNodeImpl implements AbstractMethodInvocation {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected AbstractMethodDeclaration method;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> arguments;

	/**
	 * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAccess> typeArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMethodInvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaPackage.eINSTANCE.getAbstractMethodInvocation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMethodDeclaration getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject)method;
			method = (AbstractMethodDeclaration)eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaPackage.ABSTRACT_METHOD_INVOCATION__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMethodDeclaration basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(AbstractMethodDeclaration newMethod, NotificationChain msgs) {
		AbstractMethodDeclaration oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.ABSTRACT_METHOD_INVOCATION__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(AbstractMethodDeclaration newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, JavaPackage.ABSTRACT_METHOD_DECLARATION__USAGES, AbstractMethodDeclaration.class, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, JavaPackage.ABSTRACT_METHOD_DECLARATION__USAGES, AbstractMethodDeclaration.class, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.ABSTRACT_METHOD_INVOCATION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Expression>(Expression.class, this, JavaPackage.ABSTRACT_METHOD_INVOCATION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAccess> getTypeArguments() {
		if (typeArguments == null) {
			typeArguments = new EObjectContainmentEList<TypeAccess>(TypeAccess.class, this, JavaPackage.ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS);
		}
		return typeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaPackage.ABSTRACT_METHOD_INVOCATION__METHOD:
				if (method != null)
					msgs = ((InternalEObject)method).eInverseRemove(this, JavaPackage.ABSTRACT_METHOD_DECLARATION__USAGES, AbstractMethodDeclaration.class, msgs);
				return basicSetMethod((AbstractMethodDeclaration)otherEnd, msgs);
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
			case JavaPackage.ABSTRACT_METHOD_INVOCATION__METHOD:
				return basicSetMethod(null, msgs);
			case JavaPackage.ABSTRACT_METHOD_INVOCATION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case JavaPackage.ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS:
				return ((InternalEList<?>)getTypeArguments()).basicRemove(otherEnd, msgs);
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
			case JavaPackage.ABSTRACT_METHOD_INVOCATION__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
			case JavaPackage.ABSTRACT_METHOD_INVOCATION__ARGUMENTS:
				return getArguments();
			case JavaPackage.ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS:
				return getTypeArguments();
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
			case JavaPackage.ABSTRACT_METHOD_INVOCATION__METHOD:
				setMethod((AbstractMethodDeclaration)newValue);
				return;
			case JavaPackage.ABSTRACT_METHOD_INVOCATION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case JavaPackage.ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((Collection<? extends TypeAccess>)newValue);
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
			case JavaPackage.ABSTRACT_METHOD_INVOCATION__METHOD:
				setMethod((AbstractMethodDeclaration)null);
				return;
			case JavaPackage.ABSTRACT_METHOD_INVOCATION__ARGUMENTS:
				getArguments().clear();
				return;
			case JavaPackage.ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS:
				getTypeArguments().clear();
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
			case JavaPackage.ABSTRACT_METHOD_INVOCATION__METHOD:
				return method != null;
			case JavaPackage.ABSTRACT_METHOD_INVOCATION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case JavaPackage.ABSTRACT_METHOD_INVOCATION__TYPE_ARGUMENTS:
				return typeArguments != null && !typeArguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractMethodInvocationImpl
