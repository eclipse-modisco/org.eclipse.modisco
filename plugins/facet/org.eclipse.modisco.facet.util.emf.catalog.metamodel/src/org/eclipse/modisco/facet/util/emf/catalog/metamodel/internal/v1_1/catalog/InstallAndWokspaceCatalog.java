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
package org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Install And Wokspace Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A EMF Facet Catalog catalog is a way to references sets of EObject.
 * It has to be subclassed for each user catalog, especially to create derived links to access elements with their right type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.InstallAndWokspaceCatalog#getInstalledEntries <em>Installed Entries</em>}</li>
 *   <li>{@link org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.InstallAndWokspaceCatalog#getWorkspaceEntries <em>Workspace Entries</em>}</li>
 * </ul>
 *
 * @see org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.CatalogPackage#getInstallAndWokspaceCatalog()
 * @model
 * @generated
 */
public interface InstallAndWokspaceCatalog extends EObject {
	/**
	 * Returns the value of the '<em><b>Installed Entries</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "installedEntries" represents all the EObject initially registered through the registration extension point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Installed Entries</em>' reference list.
	 * @see org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.CatalogPackage#getInstallAndWokspaceCatalog_InstalledEntries()
	 * @model transient="true"
	 * @generated
	 */
	EList<EObject> getInstalledEntries();

	/**
	 * Returns the value of the '<em><b>Workspace Entries</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "installedEntries" represents all the EObject initially registered through the registration extension point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Workspace Entries</em>' reference list.
	 * @see org.eclipse.modisco.facet.util.emf.catalog.metamodel.internal.v1_1.catalog.CatalogPackage#getInstallAndWokspaceCatalog_WorkspaceEntries()
	 * @model
	 * @generated
	 */
	EList<EObject> getWorkspaceEntries();

} // InstallAndWokspaceCatalog
