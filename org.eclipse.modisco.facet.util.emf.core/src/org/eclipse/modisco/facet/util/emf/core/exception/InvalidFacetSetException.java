/**
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *   Nicolas Guyomar (Mia-Software) - Bug 338811 - A model registration method in the interface ICatalogSetManager
 *   Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 */
package org.eclipse.modisco.facet.util.emf.core.exception;

/**
 * This exception is raised when an invalid FacetSet is found
 * 
 * @since 0.2
 */
public final class InvalidFacetSetException extends Exception {

	private static final long serialVersionUID = -7684948344074635385L;

	public InvalidFacetSetException(final String message) {
		super(message);
	}

	public InvalidFacetSetException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public InvalidFacetSetException(final Throwable cause) {
		super(cause);
	}

}
