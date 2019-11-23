/**
 * Copyright (c) 2010 Mia-Software.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar30.impl;

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

import org.eclipse.modisco.jee.ejbjar.EjbJar30.ApplicationExceptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.AssemblyDescriptorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ContainerTransactionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ExcludeListType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.InterceptorBindingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDestinationType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.MethodPermissionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.SecurityRoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Descriptor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.AssemblyDescriptorTypeImpl#getSecurityRole <em>Security Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.AssemblyDescriptorTypeImpl#getMethodPermission <em>Method Permission</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.AssemblyDescriptorTypeImpl#getContainerTransaction <em>Container Transaction</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.AssemblyDescriptorTypeImpl#getInterceptorBinding <em>Interceptor Binding</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.AssemblyDescriptorTypeImpl#getMessageDestination <em>Message Destination</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.AssemblyDescriptorTypeImpl#getExcludeList <em>Exclude List</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.AssemblyDescriptorTypeImpl#getApplicationException <em>Application Exception</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.AssemblyDescriptorTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblyDescriptorTypeImpl extends EObjectImpl implements AssemblyDescriptorType {
	/**
	 * The cached value of the '{@link #getSecurityRole() <em>Security Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRole()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRoleType> securityRole;

	/**
	 * The cached value of the '{@link #getMethodPermission() <em>Method Permission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodPermission()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodPermissionType> methodPermission;

	/**
	 * The cached value of the '{@link #getContainerTransaction() <em>Container Transaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerTransaction()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerTransactionType> containerTransaction;

	/**
	 * The cached value of the '{@link #getInterceptorBinding() <em>Interceptor Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterceptorBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<InterceptorBindingType> interceptorBinding;

	/**
	 * The cached value of the '{@link #getMessageDestination() <em>Message Destination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDestination()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageDestinationType> messageDestination;

	/**
	 * The cached value of the '{@link #getExcludeList() <em>Exclude List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeList()
	 * @generated
	 * @ordered
	 */
	protected ExcludeListType excludeList;

	/**
	 * The cached value of the '{@link #getApplicationException() <em>Application Exception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationException()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationExceptionType> applicationException;

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
	protected AssemblyDescriptorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar30Package.eINSTANCE.getAssemblyDescriptorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRoleType> getSecurityRole() {
		if (securityRole == null) {
			securityRole = new EObjectContainmentEList<SecurityRoleType>(SecurityRoleType.class, this, EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__SECURITY_ROLE);
		}
		return securityRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodPermissionType> getMethodPermission() {
		if (methodPermission == null) {
			methodPermission = new EObjectContainmentEList<MethodPermissionType>(MethodPermissionType.class, this, EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__METHOD_PERMISSION);
		}
		return methodPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerTransactionType> getContainerTransaction() {
		if (containerTransaction == null) {
			containerTransaction = new EObjectContainmentEList<ContainerTransactionType>(ContainerTransactionType.class, this, EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__CONTAINER_TRANSACTION);
		}
		return containerTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterceptorBindingType> getInterceptorBinding() {
		if (interceptorBinding == null) {
			interceptorBinding = new EObjectContainmentEList<InterceptorBindingType>(InterceptorBindingType.class, this, EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__INTERCEPTOR_BINDING);
		}
		return interceptorBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageDestinationType> getMessageDestination() {
		if (messageDestination == null) {
			messageDestination = new EObjectContainmentEList<MessageDestinationType>(MessageDestinationType.class, this, EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__MESSAGE_DESTINATION);
		}
		return messageDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeListType getExcludeList() {
		return excludeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcludeList(ExcludeListType newExcludeList, NotificationChain msgs) {
		ExcludeListType oldExcludeList = excludeList;
		excludeList = newExcludeList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__EXCLUDE_LIST, oldExcludeList, newExcludeList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeList(ExcludeListType newExcludeList) {
		if (newExcludeList != excludeList) {
			NotificationChain msgs = null;
			if (excludeList != null)
				msgs = ((InternalEObject)excludeList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__EXCLUDE_LIST, null, msgs);
			if (newExcludeList != null)
				msgs = ((InternalEObject)newExcludeList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__EXCLUDE_LIST, null, msgs);
			msgs = basicSetExcludeList(newExcludeList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__EXCLUDE_LIST, newExcludeList, newExcludeList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationExceptionType> getApplicationException() {
		if (applicationException == null) {
			applicationException = new EObjectContainmentEList<ApplicationExceptionType>(ApplicationExceptionType.class, this, EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__APPLICATION_EXCEPTION);
		}
		return applicationException;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__SECURITY_ROLE:
				return ((InternalEList<?>)getSecurityRole()).basicRemove(otherEnd, msgs);
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__METHOD_PERMISSION:
				return ((InternalEList<?>)getMethodPermission()).basicRemove(otherEnd, msgs);
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__CONTAINER_TRANSACTION:
				return ((InternalEList<?>)getContainerTransaction()).basicRemove(otherEnd, msgs);
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__INTERCEPTOR_BINDING:
				return ((InternalEList<?>)getInterceptorBinding()).basicRemove(otherEnd, msgs);
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__MESSAGE_DESTINATION:
				return ((InternalEList<?>)getMessageDestination()).basicRemove(otherEnd, msgs);
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__EXCLUDE_LIST:
				return basicSetExcludeList(null, msgs);
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__APPLICATION_EXCEPTION:
				return ((InternalEList<?>)getApplicationException()).basicRemove(otherEnd, msgs);
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
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__SECURITY_ROLE:
				return getSecurityRole();
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__METHOD_PERMISSION:
				return getMethodPermission();
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__CONTAINER_TRANSACTION:
				return getContainerTransaction();
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__INTERCEPTOR_BINDING:
				return getInterceptorBinding();
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__MESSAGE_DESTINATION:
				return getMessageDestination();
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__EXCLUDE_LIST:
				return getExcludeList();
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__APPLICATION_EXCEPTION:
				return getApplicationException();
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__ID:
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
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__SECURITY_ROLE:
				getSecurityRole().clear();
				getSecurityRole().addAll((Collection<? extends SecurityRoleType>)newValue);
				return;
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__METHOD_PERMISSION:
				getMethodPermission().clear();
				getMethodPermission().addAll((Collection<? extends MethodPermissionType>)newValue);
				return;
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__CONTAINER_TRANSACTION:
				getContainerTransaction().clear();
				getContainerTransaction().addAll((Collection<? extends ContainerTransactionType>)newValue);
				return;
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__INTERCEPTOR_BINDING:
				getInterceptorBinding().clear();
				getInterceptorBinding().addAll((Collection<? extends InterceptorBindingType>)newValue);
				return;
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__MESSAGE_DESTINATION:
				getMessageDestination().clear();
				getMessageDestination().addAll((Collection<? extends MessageDestinationType>)newValue);
				return;
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__EXCLUDE_LIST:
				setExcludeList((ExcludeListType)newValue);
				return;
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__APPLICATION_EXCEPTION:
				getApplicationException().clear();
				getApplicationException().addAll((Collection<? extends ApplicationExceptionType>)newValue);
				return;
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__ID:
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
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__SECURITY_ROLE:
				getSecurityRole().clear();
				return;
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__METHOD_PERMISSION:
				getMethodPermission().clear();
				return;
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__CONTAINER_TRANSACTION:
				getContainerTransaction().clear();
				return;
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__INTERCEPTOR_BINDING:
				getInterceptorBinding().clear();
				return;
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__MESSAGE_DESTINATION:
				getMessageDestination().clear();
				return;
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__EXCLUDE_LIST:
				setExcludeList((ExcludeListType)null);
				return;
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__APPLICATION_EXCEPTION:
				getApplicationException().clear();
				return;
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__ID:
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
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__SECURITY_ROLE:
				return securityRole != null && !securityRole.isEmpty();
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__METHOD_PERMISSION:
				return methodPermission != null && !methodPermission.isEmpty();
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__CONTAINER_TRANSACTION:
				return containerTransaction != null && !containerTransaction.isEmpty();
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__INTERCEPTOR_BINDING:
				return interceptorBinding != null && !interceptorBinding.isEmpty();
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__MESSAGE_DESTINATION:
				return messageDestination != null && !messageDestination.isEmpty();
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__EXCLUDE_LIST:
				return excludeList != null;
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__APPLICATION_EXCEPTION:
				return applicationException != null && !applicationException.isEmpty();
			case EjbJar30Package.ASSEMBLY_DESCRIPTOR_TYPE__ID:
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

} //AssemblyDescriptorTypeImpl
