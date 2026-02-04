/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar31.impl;

import java.lang.String;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.jee.ejbjar.EjbJar31.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJar31Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.FullyQualifiedClassType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.InterceptorBindingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.InterceptorOrderType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.NamedMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.TrueFalseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interceptor Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorBindingTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorBindingTypeImpl#getEjbName <em>Ejb Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorBindingTypeImpl#getInterceptorClass <em>Interceptor Class</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorBindingTypeImpl#getInterceptorOrder <em>Interceptor Order</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorBindingTypeImpl#getExcludeDefaultInterceptors <em>Exclude Default Interceptors</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorBindingTypeImpl#getExcludeClassInterceptors <em>Exclude Class Interceptors</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorBindingTypeImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar31.impl.InterceptorBindingTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterceptorBindingTypeImpl extends EObjectImpl implements InterceptorBindingType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<DescriptionType> description;

	/**
	 * The cached value of the '{@link #getEjbName() <em>Ejb Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.modisco.jee.ejbjar.EjbJar31.String ejbName;

	/**
	 * The cached value of the '{@link #getInterceptorClass() <em>Interceptor Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterceptorClass()
	 * @generated
	 * @ordered
	 */
	protected EList<FullyQualifiedClassType> interceptorClass;

	/**
	 * The cached value of the '{@link #getInterceptorOrder() <em>Interceptor Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterceptorOrder()
	 * @generated
	 * @ordered
	 */
	protected InterceptorOrderType interceptorOrder;

	/**
	 * The cached value of the '{@link #getExcludeDefaultInterceptors() <em>Exclude Default Interceptors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeDefaultInterceptors()
	 * @generated
	 * @ordered
	 */
	protected TrueFalseType excludeDefaultInterceptors;

	/**
	 * The cached value of the '{@link #getExcludeClassInterceptors() <em>Exclude Class Interceptors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeClassInterceptors()
	 * @generated
	 * @ordered
	 */
	protected TrueFalseType excludeClassInterceptors;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected NamedMethodType method;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterceptorBindingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar31Package.eINSTANCE.getInterceptorBindingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		if (description == null) {
			description = new EObjectContainmentEList<DescriptionType>(DescriptionType.class, this, EjbJar31Package.INTERCEPTOR_BINDING_TYPE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.modisco.jee.ejbjar.EjbJar31.String getEjbName() {
		return ejbName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbName(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newEjbName, NotificationChain msgs) {
		org.eclipse.modisco.jee.ejbjar.EjbJar31.String oldEjbName = ejbName;
		ejbName = newEjbName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EJB_NAME, oldEjbName, newEjbName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbName(org.eclipse.modisco.jee.ejbjar.EjbJar31.String newEjbName) {
		if (newEjbName != ejbName) {
			NotificationChain msgs = null;
			if (ejbName != null)
				msgs = ((InternalEObject)ejbName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EJB_NAME, null, msgs);
			if (newEjbName != null)
				msgs = ((InternalEObject)newEjbName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EJB_NAME, null, msgs);
			msgs = basicSetEjbName(newEjbName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EJB_NAME, newEjbName, newEjbName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FullyQualifiedClassType> getInterceptorClass() {
		if (interceptorClass == null) {
			interceptorClass = new EObjectContainmentEList<FullyQualifiedClassType>(FullyQualifiedClassType.class, this, EjbJar31Package.INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_CLASS);
		}
		return interceptorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterceptorOrderType getInterceptorOrder() {
		return interceptorOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterceptorOrder(InterceptorOrderType newInterceptorOrder, NotificationChain msgs) {
		InterceptorOrderType oldInterceptorOrder = interceptorOrder;
		interceptorOrder = newInterceptorOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_ORDER, oldInterceptorOrder, newInterceptorOrder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterceptorOrder(InterceptorOrderType newInterceptorOrder) {
		if (newInterceptorOrder != interceptorOrder) {
			NotificationChain msgs = null;
			if (interceptorOrder != null)
				msgs = ((InternalEObject)interceptorOrder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_ORDER, null, msgs);
			if (newInterceptorOrder != null)
				msgs = ((InternalEObject)newInterceptorOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_ORDER, null, msgs);
			msgs = basicSetInterceptorOrder(newInterceptorOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_ORDER, newInterceptorOrder, newInterceptorOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType getExcludeDefaultInterceptors() {
		return excludeDefaultInterceptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcludeDefaultInterceptors(TrueFalseType newExcludeDefaultInterceptors, NotificationChain msgs) {
		TrueFalseType oldExcludeDefaultInterceptors = excludeDefaultInterceptors;
		excludeDefaultInterceptors = newExcludeDefaultInterceptors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_DEFAULT_INTERCEPTORS, oldExcludeDefaultInterceptors, newExcludeDefaultInterceptors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeDefaultInterceptors(TrueFalseType newExcludeDefaultInterceptors) {
		if (newExcludeDefaultInterceptors != excludeDefaultInterceptors) {
			NotificationChain msgs = null;
			if (excludeDefaultInterceptors != null)
				msgs = ((InternalEObject)excludeDefaultInterceptors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_DEFAULT_INTERCEPTORS, null, msgs);
			if (newExcludeDefaultInterceptors != null)
				msgs = ((InternalEObject)newExcludeDefaultInterceptors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_DEFAULT_INTERCEPTORS, null, msgs);
			msgs = basicSetExcludeDefaultInterceptors(newExcludeDefaultInterceptors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_DEFAULT_INTERCEPTORS, newExcludeDefaultInterceptors, newExcludeDefaultInterceptors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueFalseType getExcludeClassInterceptors() {
		return excludeClassInterceptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcludeClassInterceptors(TrueFalseType newExcludeClassInterceptors, NotificationChain msgs) {
		TrueFalseType oldExcludeClassInterceptors = excludeClassInterceptors;
		excludeClassInterceptors = newExcludeClassInterceptors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_CLASS_INTERCEPTORS, oldExcludeClassInterceptors, newExcludeClassInterceptors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeClassInterceptors(TrueFalseType newExcludeClassInterceptors) {
		if (newExcludeClassInterceptors != excludeClassInterceptors) {
			NotificationChain msgs = null;
			if (excludeClassInterceptors != null)
				msgs = ((InternalEObject)excludeClassInterceptors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_CLASS_INTERCEPTORS, null, msgs);
			if (newExcludeClassInterceptors != null)
				msgs = ((InternalEObject)newExcludeClassInterceptors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_CLASS_INTERCEPTORS, null, msgs);
			msgs = basicSetExcludeClassInterceptors(newExcludeClassInterceptors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_CLASS_INTERCEPTORS, newExcludeClassInterceptors, newExcludeClassInterceptors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedMethodType getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(NamedMethodType newMethod, NotificationChain msgs) {
		NamedMethodType oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar31Package.INTERCEPTOR_BINDING_TYPE__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(NamedMethodType newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.INTERCEPTOR_BINDING_TYPE__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar31Package.INTERCEPTOR_BINDING_TYPE__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.INTERCEPTOR_BINDING_TYPE__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar31Package.INTERCEPTOR_BINDING_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EJB_NAME:
				return basicSetEjbName(null, msgs);
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_CLASS:
				return ((InternalEList<?>)getInterceptorClass()).basicRemove(otherEnd, msgs);
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_ORDER:
				return basicSetInterceptorOrder(null, msgs);
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_DEFAULT_INTERCEPTORS:
				return basicSetExcludeDefaultInterceptors(null, msgs);
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_CLASS_INTERCEPTORS:
				return basicSetExcludeClassInterceptors(null, msgs);
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__METHOD:
				return basicSetMethod(null, msgs);
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
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EJB_NAME:
				return getEjbName();
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_CLASS:
				return getInterceptorClass();
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_ORDER:
				return getInterceptorOrder();
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_DEFAULT_INTERCEPTORS:
				return getExcludeDefaultInterceptors();
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_CLASS_INTERCEPTORS:
				return getExcludeClassInterceptors();
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__METHOD:
				return getMethod();
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__ID:
				return getId();
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
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EJB_NAME:
				setEjbName((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_CLASS:
				getInterceptorClass().clear();
				getInterceptorClass().addAll((Collection<? extends FullyQualifiedClassType>)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_ORDER:
				setInterceptorOrder((InterceptorOrderType)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_DEFAULT_INTERCEPTORS:
				setExcludeDefaultInterceptors((TrueFalseType)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_CLASS_INTERCEPTORS:
				setExcludeClassInterceptors((TrueFalseType)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__METHOD:
				setMethod((NamedMethodType)newValue);
				return;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__ID:
				setId((String)newValue);
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
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EJB_NAME:
				setEjbName((org.eclipse.modisco.jee.ejbjar.EjbJar31.String)null);
				return;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_CLASS:
				getInterceptorClass().clear();
				return;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_ORDER:
				setInterceptorOrder((InterceptorOrderType)null);
				return;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_DEFAULT_INTERCEPTORS:
				setExcludeDefaultInterceptors((TrueFalseType)null);
				return;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_CLASS_INTERCEPTORS:
				setExcludeClassInterceptors((TrueFalseType)null);
				return;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__METHOD:
				setMethod((NamedMethodType)null);
				return;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EJB_NAME:
				return ejbName != null;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_CLASS:
				return interceptorClass != null && !interceptorClass.isEmpty();
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__INTERCEPTOR_ORDER:
				return interceptorOrder != null;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_DEFAULT_INTERCEPTORS:
				return excludeDefaultInterceptors != null;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__EXCLUDE_CLASS_INTERCEPTORS:
				return excludeClassInterceptors != null;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__METHOD:
				return method != null;
			case EjbJar31Package.INTERCEPTOR_BINDING_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //InterceptorBindingTypeImpl
