/**
 *  Copyright (c) 2011, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 * 	Grégoire Dupé (Mia-Software) - Design
 * 	Nicolas Guyomar (Mia-Software) - Implementation
 * 	Grégoire Dupé (Mia-Software) - Bug 477657 - The catalog manager should be able to manage workspace model
 */
package org.eclipse.modisco.facet.util.emf.catalog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CatalogSet is a set of EMF Facet catalogs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.facet.util.emf.catalog.CatalogSet#getCatalogs <em>Catalogs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.facet.util.emf.catalog.CatalogPackage#getCatalogSet()
 * @model
 * @generated
 */
@Deprecated
public interface CatalogSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Catalogs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.modisco.facet.util.emf.catalog.Catalog}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalogs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "catalogs" reference references all the EMF Facet Catalog catalogs contained by a CatalogSet
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Catalogs</em>' containment reference list.
	 * @see org.eclipse.modisco.facet.util.emf.catalog.CatalogPackage#getCatalogSet_Catalogs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Catalog> getCatalogs();

} // CatalogSet
