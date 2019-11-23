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
package org.eclipse.modisco.infra.discovery.catalog;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage
 * @generated
 */
public interface CatalogFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatalogFactory eINSTANCE = org.eclipse.modisco.infra.discovery.catalog.impl.CatalogFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Discoverer Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discoverer Description</em>'.
	 * @generated
	 */
	DiscovererDescription createDiscovererDescription();

	/**
	 * Returns a new object of class '<em>Discoverer Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discoverer Parameter</em>'.
	 * @generated
	 */
	DiscovererParameter createDiscovererParameter();

	/**
	 * Returns a new object of class '<em>Discoverer Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discoverer Catalog</em>'.
	 * @generated
	 */
	DiscovererCatalog createDiscovererCatalog();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CatalogPackage getCatalogPackage();

} //CatalogFactory
