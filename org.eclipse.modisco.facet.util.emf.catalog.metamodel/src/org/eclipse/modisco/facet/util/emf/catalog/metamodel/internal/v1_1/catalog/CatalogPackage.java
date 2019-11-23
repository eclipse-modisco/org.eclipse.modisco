/**
 * Copyright (c) 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model
 */
package org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.CatalogFactory
 * @model kind="package"
 * @generated
 */
public interface CatalogPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "catalog";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/facet/catalog/1.1.0/internal/catalog/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "catalog";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatalogPackage eINSTANCE = org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.impl.CatalogPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.impl.InstallAndWokspaceCatalogImpl <em>Install And Wokspace Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.impl.InstallAndWokspaceCatalogImpl
	 * @see org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.impl.CatalogPackageImpl#getInstallAndWokspaceCatalog()
	 * @generated
	 */
	int INSTALL_AND_WOKSPACE_CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Installed Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_AND_WOKSPACE_CATALOG__INSTALLED_ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Workspace Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_AND_WOKSPACE_CATALOG__WORKSPACE_ENTRIES = 1;

	/**
	 * The number of structural features of the '<em>Install And Wokspace Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_AND_WOKSPACE_CATALOG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Install And Wokspace Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALL_AND_WOKSPACE_CATALOG_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.InstallAndWokspaceCatalog <em>Install And Wokspace Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Install And Wokspace Catalog</em>'.
	 * @see org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.InstallAndWokspaceCatalog
	 * @generated
	 */
	EClass getInstallAndWokspaceCatalog();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.InstallAndWokspaceCatalog#getInstalledEntries <em>Installed Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Installed Entries</em>'.
	 * @see org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.InstallAndWokspaceCatalog#getInstalledEntries()
	 * @see #getInstallAndWokspaceCatalog()
	 * @generated
	 */
	EReference getInstallAndWokspaceCatalog_InstalledEntries();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.InstallAndWokspaceCatalog#getWorkspaceEntries <em>Workspace Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workspace Entries</em>'.
	 * @see org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.InstallAndWokspaceCatalog#getWorkspaceEntries()
	 * @see #getInstallAndWokspaceCatalog()
	 * @generated
	 */
	EReference getInstallAndWokspaceCatalog_WorkspaceEntries();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CatalogFactory getCatalogFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.impl.InstallAndWokspaceCatalogImpl <em>Install And Wokspace Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.impl.InstallAndWokspaceCatalogImpl
		 * @see org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.impl.CatalogPackageImpl#getInstallAndWokspaceCatalog()
		 * @generated
		 */
		EClass INSTALL_AND_WOKSPACE_CATALOG = eINSTANCE.getInstallAndWokspaceCatalog();

		/**
		 * The meta object literal for the '<em><b>Installed Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALL_AND_WOKSPACE_CATALOG__INSTALLED_ENTRIES = eINSTANCE.getInstallAndWokspaceCatalog_InstalledEntries();

		/**
		 * The meta object literal for the '<em><b>Workspace Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALL_AND_WOKSPACE_CATALOG__WORKSPACE_ENTRIES = eINSTANCE.getInstallAndWokspaceCatalog_WorkspaceEntries();

	}

} //CatalogPackage
