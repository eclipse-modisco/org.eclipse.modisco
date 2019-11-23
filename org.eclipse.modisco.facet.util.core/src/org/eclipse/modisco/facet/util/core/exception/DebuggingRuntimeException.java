/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *******************************************************************************/
package org.eclipse.modisco.facet.util.core.exception;

public class DebuggingRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 6192755421845020464L;

	public DebuggingRuntimeException() {
		super();
	}

	public DebuggingRuntimeException(final String message) {
		super(message);
	}

	public DebuggingRuntimeException(final Throwable cause) {
		super(cause);
	}

	public DebuggingRuntimeException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
