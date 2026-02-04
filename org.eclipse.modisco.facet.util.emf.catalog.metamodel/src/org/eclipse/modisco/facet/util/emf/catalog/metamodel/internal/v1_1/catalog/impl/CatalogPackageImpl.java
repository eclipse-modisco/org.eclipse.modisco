/**
 * Copyright (c) 2015, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *    Gr�goire Dup� (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model
 */
package org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.CatalogFactory;
import org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.CatalogPackage;
import org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.InstallAndWokspaceCatalog;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogPackageImpl extends EPackageImpl implements CatalogPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass installAndWokspaceCatalogEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.CatalogPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CatalogPackageImpl() {
		super(eNS_URI, CatalogFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CatalogPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CatalogPackage init() {
		if (isInited) return (CatalogPackage)EPackage.Registry.INSTANCE.getEPackage(CatalogPackage.eNS_URI);

		// Obtain or create and register package
		CatalogPackageImpl theCatalogPackage = (CatalogPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CatalogPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CatalogPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCatalogPackage.createPackageContents();

		// Initialize created meta-data
		theCatalogPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCatalogPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CatalogPackage.eNS_URI, theCatalogPackage);
		return theCatalogPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstallAndWokspaceCatalog() {
		return installAndWokspaceCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstallAndWokspaceCatalog_InstalledEntries() {
		return (EReference)installAndWokspaceCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstallAndWokspaceCatalog_WorkspaceEntries() {
		return (EReference)installAndWokspaceCatalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogFactory getCatalogFactory() {
		return (CatalogFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		installAndWokspaceCatalogEClass = createEClass(INSTALL_AND_WOKSPACE_CATALOG);
		createEReference(installAndWokspaceCatalogEClass, INSTALL_AND_WOKSPACE_CATALOG__INSTALLED_ENTRIES);
		createEReference(installAndWokspaceCatalogEClass, INSTALL_AND_WOKSPACE_CATALOG__WORKSPACE_ENTRIES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(installAndWokspaceCatalogEClass, InstallAndWokspaceCatalog.class, "InstallAndWokspaceCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstallAndWokspaceCatalog_InstalledEntries(), ecorePackage.getEObject(), null, "installedEntries", null, 0, -1, InstallAndWokspaceCatalog.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstallAndWokspaceCatalog_WorkspaceEntries(), ecorePackage.getEObject(), null, "workspaceEntries", null, 0, -1, InstallAndWokspaceCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CatalogPackageImpl
