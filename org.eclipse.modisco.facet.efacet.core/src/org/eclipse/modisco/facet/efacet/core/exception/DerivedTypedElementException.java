/**
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Gregoire Dupe (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 362191 - [Restructuring] Query mechanism for eFacet2
 */
package org.eclipse.modisco.facet.efacet.core.exception;

import org.eclipse.modisco.facet.efacet.core.internal.exception.DerivedTypedElementEvaluationException;

/**
 * This exception is raised when something is wrong with a query, and there is not a more specific
 * sub-class to describe the error (e.g. {@link DerivedTypedElementEvaluationException} )
 * @since 0.2
 */
public class DerivedTypedElementException extends Exception {

	// This class is a copy of :
	// org.eclipse.modisco.facet.infra.query.core.exception.ModelQueryException

	private static final long serialVersionUID = -3203874059325745157L;

	public DerivedTypedElementException(final String message) {
		super(message);
	}

	public DerivedTypedElementException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public DerivedTypedElementException(final Throwable cause) {
		super(cause);
	}

}
