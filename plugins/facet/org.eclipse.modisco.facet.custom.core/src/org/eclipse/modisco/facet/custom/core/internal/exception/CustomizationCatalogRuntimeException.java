/**
 *  Copyright (c) 2011, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *  	Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *      Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 */
package org.eclipse.modisco.facet.custom.core.internal.exception;

/**
 * @noinstantiate This class is not intended to be instantiated by clients.
 * @author Gregoire Dupe
 *
 */
public final class CustomizationCatalogRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 6589838701903506569L;

	public CustomizationCatalogRuntimeException() {
		super();
	}

	public CustomizationCatalogRuntimeException(final String message) {
		super(message);
	}

	public CustomizationCatalogRuntimeException(final Throwable cause) {
		super(cause);
	}

	public CustomizationCatalogRuntimeException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
