/**
 * Copyright (c) 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Fabien Giquel (Mia-Software) - design and implementation
 * 
 */
package org.eclipse.modisco.infra.discovery.catalog.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectEList.Unsettable;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.modisco.infra.discovery.catalog.CatalogPackage;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererCatalog;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Discoverer Catalog</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererCatalogImpl#getInstalledEntries <em>Installed Entries</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererCatalogImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererCatalogImpl#getInstalledDiscoverers <em>Installed Discoverers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscovererCatalogImpl extends EObjectImpl implements
		DiscovererCatalog {
	/**
	 * The cached value of the '{@link #getInstalledEntries() <em>Installed Entries</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getInstalledEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> installedEntries;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscovererCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.DISCOVERER_CATALOG;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInstalledEntries() {
		if (installedEntries == null) {
			installedEntries = new EObjectResolvingEList<EObject>(EObject.class, this, CatalogPackage.DISCOVERER_CATALOG__INSTALLED_ENTRIES);
		}
		return installedEntries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DISCOVERER_CATALOG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<DiscovererDescription> getInstalledDiscoverers() {
		Unsettable<DiscovererDescription> unsettableList = new EObjectEList.Unsettable<DiscovererDescription>(
				DiscovererDescription.class, this, CatalogPackage.eINSTANCE
						.getDiscovererCatalog_InstalledDiscoverers()
						.getFeatureID());
		for (Object object : this.getInstalledEntries()) {
			if (object instanceof DiscovererDescription) {
				DiscovererDescription querySetImpl = (DiscovererDescription) object;
				unsettableList.add(querySetImpl);
			}
		}
		return unsettableList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CatalogPackage.DISCOVERER_CATALOG__INSTALLED_ENTRIES:
				return getInstalledEntries();
			case CatalogPackage.DISCOVERER_CATALOG__NAME:
				return getName();
			case CatalogPackage.DISCOVERER_CATALOG__INSTALLED_DISCOVERERS:
				return getInstalledDiscoverers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CatalogPackage.DISCOVERER_CATALOG__INSTALLED_ENTRIES:
				getInstalledEntries().clear();
				getInstalledEntries().addAll((Collection<? extends EObject>)newValue);
				return;
			case CatalogPackage.DISCOVERER_CATALOG__NAME:
				setName((String)newValue);
				return;
			case CatalogPackage.DISCOVERER_CATALOG__INSTALLED_DISCOVERERS:
				getInstalledDiscoverers().clear();
				getInstalledDiscoverers().addAll((Collection<? extends DiscovererDescription>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CatalogPackage.DISCOVERER_CATALOG__INSTALLED_ENTRIES:
				getInstalledEntries().clear();
				return;
			case CatalogPackage.DISCOVERER_CATALOG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CatalogPackage.DISCOVERER_CATALOG__INSTALLED_DISCOVERERS:
				getInstalledDiscoverers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CatalogPackage.DISCOVERER_CATALOG__INSTALLED_ENTRIES:
				return installedEntries != null && !installedEntries.isEmpty();
			case CatalogPackage.DISCOVERER_CATALOG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CatalogPackage.DISCOVERER_CATALOG__INSTALLED_DISCOVERERS:
				return !getInstalledDiscoverers().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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

} // DiscovererCatalogImpl
