/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gr�goire Dup� (Mia-Software) - Bug 365808 - [Unit Test Failure][0.2/4.2][0.2/3.8] org.eclipse.modisco.facet.widgets.nattable.tests.NatTableAPITests
 *    Gr�goire Dup� (Mia-Software) - Bug 367153 - synchronization utilities
 *******************************************************************************/
package org.eclipse.modisco.facet.util.ui.internal.exported.displaysync;

class DisplaySyncRuntimeException extends RuntimeException {

	private static final long serialVersionUID = -4424355632936609905L;

	public DisplaySyncRuntimeException() {
		super();
	}

	public DisplaySyncRuntimeException(final String message) {
		super(message);
	}

	public DisplaySyncRuntimeException(final Throwable cause) {
		super(cause);
	}

	public DisplaySyncRuntimeException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
