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

package org.eclipse.emf.facet.efacet.edit.core.internal;

public class FacetCommandRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 5723089148270269294L;

	public FacetCommandRuntimeException() {
		super();
	}

	public FacetCommandRuntimeException(final String message,
			final Throwable cause) {
		super(message, cause);
	}

	public FacetCommandRuntimeException(final String message) {
		super(message);
	}

	public FacetCommandRuntimeException(final Throwable cause) {
		super(cause);
	}

}
