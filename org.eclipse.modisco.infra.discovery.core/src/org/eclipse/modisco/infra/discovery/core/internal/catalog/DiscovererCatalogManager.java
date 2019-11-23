/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core.internal.catalog;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.facet.util.emf.catalog.CatalogSet;
import org.eclipse.modisco.facet.util.emf.core.ICatalogManager;

public class DiscovererCatalogManager implements ICatalogManager {

	public boolean canBeManaged(final EObject root) {
		// Discoverers are not registered through models until now
		return false;
	}

	public void manage(final EObject root) {
		// Discoverers are not registered through models until now
	}

	public void setCatalogSet(final CatalogSet catalogSet) {
		catalogSet.getCatalogs().add(DiscovererRegistry.INSTANCE.getDiscovererCatalog());
	}

}
