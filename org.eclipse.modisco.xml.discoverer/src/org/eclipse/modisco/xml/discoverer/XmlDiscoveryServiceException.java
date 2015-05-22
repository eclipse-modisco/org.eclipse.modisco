/*********************************************************************************
 * Copyright (c) 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 464300 - To be able to discover XML models from a folder/project
 ********************************************************************************/
package org.eclipse.modisco.xml.discoverer;

/**
 * @since 0.13
 */
public class XmlDiscoveryServiceException extends Exception {

	private static final long serialVersionUID = 106125735413251362L;

	public XmlDiscoveryServiceException() {
		super();
	}

	public XmlDiscoveryServiceException(final String message) {
		super(message);
	}

	public XmlDiscoveryServiceException(final Throwable cause) {
		super(cause);
	}

	public XmlDiscoveryServiceException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
