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

import org.eclipse.emf.common.util.EList;
import org.eclipse.modisco.facet.util.emf.catalog.Catalog;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discoverer Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.DiscovererCatalog#getInstalledDiscoverers <em>Installed Discoverers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererCatalog()
 * @model
 * @generated
 */
public interface DiscovererCatalog extends Catalog {
	/**
	 * Returns the value of the '<em><b>Installed Discoverers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installed Discoverers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installed Discoverers</em>' reference list.
	 * @see org.eclipse.modisco.infra.discovery.catalog.CatalogPackage#getDiscovererCatalog_InstalledDiscoverers()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<DiscovererDescription> getInstalledDiscoverers();

} // DiscovererCatalog
