/**
 * Copyright (c) 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model
 */
package org.eclipse.emf.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogFactoryImpl extends EFactoryImpl implements CatalogFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CatalogFactory init() {
		try {
			CatalogFactory theCatalogFactory = (CatalogFactory)EPackage.Registry.INSTANCE.getEFactory(CatalogPackage.eNS_URI);
			if (theCatalogFactory != null) {
				return theCatalogFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CatalogFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CatalogPackage.INSTALL_AND_WOKSPACE_CATALOG: return createInstallAndWokspaceCatalog();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstallAndWokspaceCatalog createInstallAndWokspaceCatalog() {
		InstallAndWokspaceCatalogImpl installAndWokspaceCatalog = new InstallAndWokspaceCatalogImpl();
		return installAndWokspaceCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogPackage getCatalogPackage() {
		return (CatalogPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CatalogPackage getPackage() {
		return CatalogPackage.eINSTANCE;
	}

} //CatalogFactoryImpl
