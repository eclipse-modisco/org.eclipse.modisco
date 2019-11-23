/*******************************************************************************
 * Copyright (c) 2015 Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Thomas Cicognani (Mia-Software) - Bug 472075 - Update API to create UI shortcuts to activate FacetSets 
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.ui;

import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.modisco.facet.efacet.core.IFacetManagerProvider;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;

/**
 * @since 1.1
 */
public interface IFacetManagerProvider2 extends IFacetManagerProvider {

	interface IFacetSetShortcut {
		FacetSet getFacetSet();

		String getLabel();

		ImageDescriptor getIcon();
	}

	List<IFacetSetShortcut> getFacetSetShortcuts();

}
