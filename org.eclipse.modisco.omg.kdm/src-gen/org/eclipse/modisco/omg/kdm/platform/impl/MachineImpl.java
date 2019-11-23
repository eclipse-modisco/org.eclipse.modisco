/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.omg.kdm.platform.DeployedComponent;
import org.eclipse.modisco.omg.kdm.platform.DeployedResource;
import org.eclipse.modisco.omg.kdm.platform.Machine;
import org.eclipse.modisco.omg.kdm.platform.PlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.platform.impl.MachineImpl#getDeployedComponent <em>Deployed Component</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.platform.impl.MachineImpl#getDeployedResource <em>Deployed Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MachineImpl extends AbstractPlatformElementImpl implements Machine {
	/**
	 * The cached value of the '{@link #getDeployedComponent() <em>Deployed Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployedComponent> deployedComponent;

	/**
	 * The cached value of the '{@link #getDeployedResource() <em>Deployed Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<DeployedResource> deployedResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployedComponent> getDeployedComponent() {
		if (deployedComponent == null) {
			deployedComponent = new EObjectContainmentEList<DeployedComponent>(DeployedComponent.class, this, PlatformPackage.MACHINE__DEPLOYED_COMPONENT);
		}
		return deployedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeployedResource> getDeployedResource() {
		if (deployedResource == null) {
			deployedResource = new EObjectContainmentEList<DeployedResource>(DeployedResource.class, this, PlatformPackage.MACHINE__DEPLOYED_RESOURCE);
		}
		return deployedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.MACHINE__DEPLOYED_COMPONENT:
				return ((InternalEList<?>)getDeployedComponent()).basicRemove(otherEnd, msgs);
			case PlatformPackage.MACHINE__DEPLOYED_RESOURCE:
				return ((InternalEList<?>)getDeployedResource()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.MACHINE__DEPLOYED_COMPONENT:
				return getDeployedComponent();
			case PlatformPackage.MACHINE__DEPLOYED_RESOURCE:
				return getDeployedResource();
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
			case PlatformPackage.MACHINE__DEPLOYED_COMPONENT:
				getDeployedComponent().clear();
				getDeployedComponent().addAll((Collection<? extends DeployedComponent>)newValue);
				return;
			case PlatformPackage.MACHINE__DEPLOYED_RESOURCE:
				getDeployedResource().clear();
				getDeployedResource().addAll((Collection<? extends DeployedResource>)newValue);
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
			case PlatformPackage.MACHINE__DEPLOYED_COMPONENT:
				getDeployedComponent().clear();
				return;
			case PlatformPackage.MACHINE__DEPLOYED_RESOURCE:
				getDeployedResource().clear();
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
			case PlatformPackage.MACHINE__DEPLOYED_COMPONENT:
				return deployedComponent != null && !deployedComponent.isEmpty();
			case PlatformPackage.MACHINE__DEPLOYED_RESOURCE:
				return deployedResource != null && !deployedResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MachineImpl
