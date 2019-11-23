/**
 * Copyright (c) 2015, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model
 */
package org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.CatalogPackage;
import org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.InstallAndWokspaceCatalog;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Install And Wokspace Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.impl.InstallAndWokspaceCatalogImpl#getInstalledEntries <em>Installed Entries</em>}</li>
 *   <li>{@link org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.impl.InstallAndWokspaceCatalogImpl#getWorkspaceEntries <em>Workspace Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstallAndWokspaceCatalogImpl extends MinimalEObjectImpl.Container implements InstallAndWokspaceCatalog {
	/**
	 * The cached value of the '{@link #getInstalledEntries() <em>Installed Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalledEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> installedEntries;

	/**
	 * The cached value of the '{@link #getWorkspaceEntries() <em>Workspace Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkspaceEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> workspaceEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstallAndWokspaceCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.INSTALL_AND_WOKSPACE_CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInstalledEntries() {
		if (installedEntries == null) {
			installedEntries = new EObjectResolvingEList<EObject>(EObject.class, this, CatalogPackage.INSTALL_AND_WOKSPACE_CATALOG__INSTALLED_ENTRIES);
		}
		return installedEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getWorkspaceEntries() {
		if (workspaceEntries == null) {
			workspaceEntries = new EObjectResolvingEList<EObject>(EObject.class, this, CatalogPackage.INSTALL_AND_WOKSPACE_CATALOG__WORKSPACE_ENTRIES);
		}
		return workspaceEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CatalogPackage.INSTALL_AND_WOKSPACE_CATALOG__INSTALLED_ENTRIES:
				return getInstalledEntries();
			case CatalogPackage.INSTALL_AND_WOKSPACE_CATALOG__WORKSPACE_ENTRIES:
				return getWorkspaceEntries();
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
			case CatalogPackage.INSTALL_AND_WOKSPACE_CATALOG__INSTALLED_ENTRIES:
				getInstalledEntries().clear();
				getInstalledEntries().addAll((Collection<? extends EObject>)newValue);
				return;
			case CatalogPackage.INSTALL_AND_WOKSPACE_CATALOG__WORKSPACE_ENTRIES:
				getWorkspaceEntries().clear();
				getWorkspaceEntries().addAll((Collection<? extends EObject>)newValue);
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
			case CatalogPackage.INSTALL_AND_WOKSPACE_CATALOG__INSTALLED_ENTRIES:
				getInstalledEntries().clear();
				return;
			case CatalogPackage.INSTALL_AND_WOKSPACE_CATALOG__WORKSPACE_ENTRIES:
				getWorkspaceEntries().clear();
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
			case CatalogPackage.INSTALL_AND_WOKSPACE_CATALOG__INSTALLED_ENTRIES:
				return installedEntries != null && !installedEntries.isEmpty();
			case CatalogPackage.INSTALL_AND_WOKSPACE_CATALOG__WORKSPACE_ENTRIES:
				return workspaceEntries != null && !workspaceEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstallAndWokspaceCatalogImpl
