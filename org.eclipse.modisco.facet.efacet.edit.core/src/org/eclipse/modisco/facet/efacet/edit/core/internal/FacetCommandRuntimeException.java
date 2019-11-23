/*******************************************************************************
 * Copyright (c) 2015, 2019 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Jonathan Pepin (Soft-Maint) - Bug 474418 - Edit Facet features with Properties View and Commands
 *******************************************************************************/

package org.eclipse.modisco.facet.efacet.edit.core.internal;

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
