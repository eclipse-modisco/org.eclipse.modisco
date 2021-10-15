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
package org.eclipse.modisco.jee.ejbjar.EjbJar11.impl;

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

import org.eclipse.modisco.jee.ejbjar.EjbJar11.AssemblyDescriptorType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.ContainerTransactionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJar11Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.MethodPermissionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar11.SecurityRoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Descriptor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.AssemblyDescriptorTypeImpl#getSecurityRole <em>Security Role</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.AssemblyDescriptorTypeImpl#getMethodPermission <em>Method Permission</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.AssemblyDescriptorTypeImpl#getContainerTransaction <em>Container Transaction</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar11.impl.AssemblyDescriptorTypeImpl#getId <em>Id</em>}</li>
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
		return EjbJar11Package.Literals.ASSEMBLY_DESCRIPTOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRoleType> getSecurityRole() {
		if (securityRole == null) {
			securityRole = new EObjectContainmentEList<SecurityRoleType>(SecurityRoleType.class, this, EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__SECURITY_ROLE);
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
			methodPermission = new EObjectContainmentEList<MethodPermissionType>(MethodPermissionType.class, this, EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__METHOD_PERMISSION);
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
			containerTransaction = new EObjectContainmentEList<ContainerTransactionType>(ContainerTransactionType.class, this, EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__CONTAINER_TRANSACTION);
		}
		return containerTransaction;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__SECURITY_ROLE:
				return ((InternalEList<?>)getSecurityRole()).basicRemove(otherEnd, msgs);
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__METHOD_PERMISSION:
				return ((InternalEList<?>)getMethodPermission()).basicRemove(otherEnd, msgs);
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__CONTAINER_TRANSACTION:
				return ((InternalEList<?>)getContainerTransaction()).basicRemove(otherEnd, msgs);
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
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__SECURITY_ROLE:
				return getSecurityRole();
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__METHOD_PERMISSION:
				return getMethodPermission();
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__CONTAINER_TRANSACTION:
				return getContainerTransaction();
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__ID:
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
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__SECURITY_ROLE:
				getSecurityRole().clear();
				getSecurityRole().addAll((Collection<? extends SecurityRoleType>)newValue);
				return;
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__METHOD_PERMISSION:
				getMethodPermission().clear();
				getMethodPermission().addAll((Collection<? extends MethodPermissionType>)newValue);
				return;
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__CONTAINER_TRANSACTION:
				getContainerTransaction().clear();
				getContainerTransaction().addAll((Collection<? extends ContainerTransactionType>)newValue);
				return;
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__ID:
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
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__SECURITY_ROLE:
				getSecurityRole().clear();
				return;
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__METHOD_PERMISSION:
				getMethodPermission().clear();
				return;
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__CONTAINER_TRANSACTION:
				getContainerTransaction().clear();
				return;
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__ID:
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
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__SECURITY_ROLE:
				return securityRole != null && !securityRole.isEmpty();
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__METHOD_PERMISSION:
				return methodPermission != null && !methodPermission.isEmpty();
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__CONTAINER_TRANSACTION:
				return containerTransaction != null && !containerTransaction.isEmpty();
			case EjbJar11Package.ASSEMBLY_DESCRIPTOR_TYPE__ID:
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
