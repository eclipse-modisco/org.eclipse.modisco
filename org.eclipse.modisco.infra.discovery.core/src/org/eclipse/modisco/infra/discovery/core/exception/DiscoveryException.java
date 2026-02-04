/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.infra.discovery.core.exception;

public class DiscoveryException extends Exception {

	private static final long serialVersionUID = -8431452420121092314L;

	public DiscoveryException(final String message) {
		super(message);
	}

	public DiscoveryException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public DiscoveryException(final Throwable cause) {
		super(cause);
	}
}
