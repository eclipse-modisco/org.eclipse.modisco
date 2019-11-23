/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.facet.core.exception;

/**
 * @author Gregoire DUPE (Mia-Software) {@inheritDoc}
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public class ModiscoFacetException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = -4130168457242723140L;

	/**
	 *
	 */
	public ModiscoFacetException() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	public ModiscoFacetException(final String message) {
		super(message);
	}

	/**
	 * {@inheritDoc}
	 */
	public ModiscoFacetException(final Throwable cause) {
		super(cause);
	}

	/**
	 * {@inheritDoc}
	 */
	public ModiscoFacetException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
