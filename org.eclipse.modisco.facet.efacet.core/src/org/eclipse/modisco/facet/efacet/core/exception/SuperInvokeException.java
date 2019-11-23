/**
 * Copyright (c) 2014 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire Dupe (Mia-Software) - Bug 443682 - Access to the super facet
 */
package org.eclipse.modisco.facet.efacet.core.exception;

/**
 * @since 1.0
 */
public class SuperInvokeException extends Exception {

	private static final long serialVersionUID = -2090554884512810064L;

	public SuperInvokeException() {
		super();
	}

	public SuperInvokeException(final String message) {
		super(message);
	}

	public SuperInvokeException(final Throwable cause) {
		super(cause);
	}

	public SuperInvokeException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
