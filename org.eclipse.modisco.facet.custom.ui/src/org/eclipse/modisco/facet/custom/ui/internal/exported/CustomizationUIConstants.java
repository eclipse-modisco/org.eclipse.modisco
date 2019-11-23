/*******************************************************************************
 * Copyright (c) 2012 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 372626 - Aggregates
 *******************************************************************************/
package org.eclipse.modisco.facet.custom.ui.internal.exported;

/**
 * @since 0.2
 */
public final class CustomizationUIConstants {

	private static final String CATALOG_VIEW_ID = "org.eclipse.modisco.facet.custom.ui.view.catalog"; //$NON-NLS-1$

	private CustomizationUIConstants() {
		// utility class
	}

	public static String getCustomizationCatalogViewId() {
		return CustomizationUIConstants.CATALOG_VIEW_ID;
	}
}
