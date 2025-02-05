/**
 *  Copyright (c) 2011, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *     Grégoire Dupé (Mia-Software) - Design
 *     Nicolas Guyomar (Mia-Software) - Implementation
 *     Emmanuelle Rouillé (Mia-Software) - Bug 352618 - To be able to use non-derived facet structural features and save their values.
 *     Nicolas Bros (Mia-Software) - Bug 370110 - Rename efacetcatalog2.ecore
 *     Grégoire Dupé (Mia-Software) - Bug 361817 - [Restructuring] Dynamic load to the facet catalog
 *     Grégoire Dupé (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model
 */
package org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacetcatalog;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacetcatalog.EfacetcatalogPackage
 * @generated
 */
@Deprecated
public interface EfacetcatalogFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EfacetcatalogFactory eINSTANCE = org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacetcatalog.impl.EfacetcatalogFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Facet Set Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facet Set Catalog</em>'.
	 * @generated
	 */
	FacetSetCatalog createFacetSetCatalog();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EfacetcatalogPackage getEfacetcatalogPackage();

} //EfacetcatalogFactory
