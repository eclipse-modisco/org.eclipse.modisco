/*******************************************************************************
 * Copyright (c) 2012, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 386387 - [CustomizedTreeContentProvider] The TreeElements are not preserved between two calls to getElements()
 *******************************************************************************/
package org.eclipse.modisco.facet.custom.ui.internal.exception;

public class CustomizedContentProviderRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 6962461313131533003L;

	public CustomizedContentProviderRuntimeException() {
		super();
	}

	public CustomizedContentProviderRuntimeException(final String message) {
		super(message);
	}

	public CustomizedContentProviderRuntimeException(final Throwable cause) {
		super(cause);
	}

	public CustomizedContentProviderRuntimeException(final String message,
			final Throwable cause) {
		super(message, cause);
	}

}
