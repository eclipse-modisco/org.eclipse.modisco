/*******************************************************************************
 * Copyright (c) 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Grégoire Dupé (Soft-Maint) - Bug 469959 - NullPointerException in SetStructuralFeatureInstanceResourceHandler.execute (42)
 *******************************************************************************/
package org.eclipse.emf.facet.efacet.ui.internal.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.IFacetManagerProvider;
import org.eclipse.emf.facet.util.ui.internal.exported.handler.HandlerUtils;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;

public final class Utils {

	private Utils() {
		// Must not be used
	}
	
	public static IFacetManager getFacetManager() {
		final IWorkbenchPart activePart = HandlerUtils.getActivePart();
		return getFacetManager(activePart);
	}

	public static IFacetManager getFacetManager(final ExecutionEvent event) {
		final IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
		return getFacetManager(activePart);
	}

	private static IFacetManager getFacetManager(final IWorkbenchPart activePart) {
		IFacetManager result = null;
		if (activePart != null) {
			final IFacetManagerProvider facetMgrProvider = (IFacetManagerProvider) activePart
					.getAdapter(IFacetManagerProvider.class);
			if (facetMgrProvider != null) {
				result = facetMgrProvider.getFacetManager();
			}
		}
		return result;
	}
	
}
