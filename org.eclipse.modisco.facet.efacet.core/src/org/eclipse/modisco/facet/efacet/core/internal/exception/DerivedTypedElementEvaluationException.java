/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire Dupe (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 362191 - [Restructuring] Query mechanism for eFacet2
 */
package org.eclipse.modisco.facet.efacet.core.internal.exception;

import org.eclipse.modisco.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.modisco.facet.util.core.internal.ErrorHandlingUtils;

/**
 * This exception occurs when something goes wrong during the execution of a query.
 *
 * @since 0.2
 */
public class DerivedTypedElementEvaluationException extends DerivedTypedElementException {
	// This class is a copy of
	// org.eclipse.modisco.facet.infra.query.core.ModelQueryExecutionException

	private static final long serialVersionUID = -8464252257666617685L;

	public DerivedTypedElementEvaluationException(final String message) {
		super(message);
	}

	public DerivedTypedElementEvaluationException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public DerivedTypedElementEvaluationException(final Throwable cause) {
		super(cause);
	}

	/** Constructor for evaluation exception due to wrong type */
	public DerivedTypedElementEvaluationException(final String message, final Class<?> expectedType, final Object resultElement) {
		super(ErrorHandlingUtils.buildWrongTypeMessage(message, expectedType, resultElement));
	}
}
