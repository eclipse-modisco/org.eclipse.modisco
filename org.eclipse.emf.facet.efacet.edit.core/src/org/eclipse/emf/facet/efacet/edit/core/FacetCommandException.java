/*******************************************************************************
 * Copyright (c) 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jonathan Pepin (Soft-Maint) - Bug 474418 - Edit Facet features with Properties View and Commands
 *******************************************************************************/

package org.eclipse.emf.facet.efacet.edit.core;

/**
 * @noextend This class is not intended to be extended by clients.
 * @noinstantiate This class is not intended to be instantiated by clients.
 */

public class FacetCommandException extends Exception {

	private static final long serialVersionUID = -733596720669335025L;

	public FacetCommandException() {
		super();
	}

	public FacetCommandException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public FacetCommandException(final String message) {
		super(message);
	}

	public FacetCommandException(final Throwable cause) {
		super(cause);
	}

}
