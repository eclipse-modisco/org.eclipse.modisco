/*******************************************************************************
 * Copyright (c) 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 482672 - Benchmark command line interface
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal.impl;

public class ReportUtilsException extends Exception {

	private static final long serialVersionUID = -9187774011235005068L;

	public ReportUtilsException() {
		super();
	}

	public ReportUtilsException(final String message) {
		super(message);
	}

	public ReportUtilsException(final Throwable cause) {
		super(cause);
	}

	public ReportUtilsException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
