/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Gabriel Barbier (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.common.core.internal.utils;

import org.eclipse.emf.common.util.URI;

/**
 * @author Gabriel Barbier
 */
public final class UriUtils {

	private UriUtils() {
		// make uninstantiable
	}

	/** Creates a URI from the given String, escaping characters. */
	public static final URI createUri(final String uri) {
		final String escapedUri = uri.replaceAll(" ", "%20"); //$NON-NLS-1$ //$NON-NLS-2$
		return URI.createURI(escapedUri);
	}

	public static final String toString(final URI uri) {
		return URI.decode(uri.toString());
	}
}
