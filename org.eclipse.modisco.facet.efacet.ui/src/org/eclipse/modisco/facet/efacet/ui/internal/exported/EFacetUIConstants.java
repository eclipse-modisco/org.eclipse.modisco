/*******************************************************************************
 * Copyright (c) 2012, 2019 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 372626 - Aggregates
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.ui.internal.exported;

public final class EFacetUIConstants {

	private static final String CATALOG_VIEW_ID = "org.eclipse.modisco.facet.efacet.ui.view.catalog"; //$NON-NLS-1$

	private EFacetUIConstants() {
		// utility class
	}

	public static String getFacetSetsCatalogViewId() {
		return EFacetUIConstants.CATALOG_VIEW_ID;
	}
}
