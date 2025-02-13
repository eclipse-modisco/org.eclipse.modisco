/**
 * Copyright (c) 2011, 2019 Mia-Software and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * 	Gregoire Dupe (Mia-Software) - Bug 333553 - The user has not to deal with two files to create a facet
 */
package org.eclipse.modisco.facet.efacet.core.internal;

import org.eclipse.osgi.util.NLS;

@SuppressWarnings("PMD")
public final class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.facet.efacet.core.internal.messages"; //$NON-NLS-1$
	public static String EFacetCatalogManager_FacetSetCatalogName;
	public static String EFacetCatalogManager_QuerySetCatalogName;
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
