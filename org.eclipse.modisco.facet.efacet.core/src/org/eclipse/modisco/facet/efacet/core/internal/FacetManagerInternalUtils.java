/*******************************************************************************
 * Copyright (c) 2015, 2019 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Jonathan Pepin (Soft-Maint) - Bug 473673 - Applying facet inferred from fopposite reference
 *******************************************************************************/

package org.eclipse.modisco.facet.efacet.core.internal;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.modisco.facet.efacet.core.FacetUtils;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;

public final class FacetManagerInternalUtils {

	private FacetManagerInternalUtils() {
		// Must not be used
	}

	public static void loadParentFacetSet(final EStructuralFeature sFeature,
			final IFacetManager facetManager) {
		final FacetSet facetSet = FacetUtils.getFacetSet(sFeature);
		if (!facetManager.getManagedFacetSets().contains(facetSet)) {
			facetManager.getManagedFacetSets().add(facetSet);
		}
	}

}
