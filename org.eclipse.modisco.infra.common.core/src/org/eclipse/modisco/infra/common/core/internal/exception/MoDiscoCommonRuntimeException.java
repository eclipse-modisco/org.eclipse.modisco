/*******************************************************************************
 * Copyright (c) 2013, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software) - Bug 367497 - [Unit Test Failure] org.eclipse.modisco.infra.browser.custom.examples.java.jdk.tests.Tests.bug308991
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.exception;

public class MoDiscoCommonRuntimeException extends RuntimeException {

	private static final long serialVersionUID = -1350857942870483924L;

	public MoDiscoCommonRuntimeException() {
	}

	public MoDiscoCommonRuntimeException(final String message) {
		super(message);
	}

	public MoDiscoCommonRuntimeException(final Throwable cause) {
		super(cause);
	}

	public MoDiscoCommonRuntimeException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
