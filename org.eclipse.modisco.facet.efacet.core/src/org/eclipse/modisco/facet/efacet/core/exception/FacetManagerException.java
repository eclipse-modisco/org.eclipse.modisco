/**
 *  Copyright (c) 2012, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *  	Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 */
package org.eclipse.modisco.facet.efacet.core.exception;

/**
 * @since 0.2
 */
public class FacetManagerException extends Exception {

	private static final long serialVersionUID = -4670132391244495825L;

	public FacetManagerException() {
		super();
	}

	public FacetManagerException(final String message) {
		super(message);
	}

	public FacetManagerException(final Throwable cause) {
		super(cause);
	}

	public FacetManagerException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
