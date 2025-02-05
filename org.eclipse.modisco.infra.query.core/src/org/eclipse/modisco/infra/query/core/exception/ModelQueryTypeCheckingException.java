/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.infra.query.core.exception;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class ModelQueryTypeCheckingException extends ModelQueryException {

	private static final long serialVersionUID = -9064274334817642819L;

	public ModelQueryTypeCheckingException(final String message) {
		super(message);
	}

	public ModelQueryTypeCheckingException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public ModelQueryTypeCheckingException(final Throwable cause) {
		super(cause);
	}
}
