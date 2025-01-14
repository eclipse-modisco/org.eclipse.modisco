/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé - Bug 365843 - [Unit Test Failure][0.2/3.8][0.2/4.2]org.eclipse.modisco.facet.widgets.nattable.tests.swtbot.Bug344925Test.testBug344925
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *******************************************************************************/
package org.eclipse.modisco.facet.util.emf.core.exception;

/**
 * @since 0.2
 */
public final class DebugRuntimeException extends RuntimeException {

	private static final long serialVersionUID = -2130942266962627760L;
	
	public DebugRuntimeException(final Throwable throwable) {
		super(throwable);
	}

}
