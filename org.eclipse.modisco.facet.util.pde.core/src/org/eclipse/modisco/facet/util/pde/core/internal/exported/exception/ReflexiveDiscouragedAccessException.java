/*******************************************************************************
 * Copyright (c) 2013, 2019 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Fabien Treguer (Soft-Maint) - Bug 418565 - [Unit Test Failure] Missing dependencies during tests, target platform creation and load
 ******************************************************************************/
package org.eclipse.modisco.facet.util.pde.core.internal.exported.exception;

public class ReflexiveDiscouragedAccessException extends Exception {

	private static final long serialVersionUID = -7462304304846835284L;

	public ReflexiveDiscouragedAccessException() {
		super();
	}

	public ReflexiveDiscouragedAccessException(final String message) {
		super(message);
	}

	public ReflexiveDiscouragedAccessException(final Throwable cause) {
		super(cause);
	}

	public ReflexiveDiscouragedAccessException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
