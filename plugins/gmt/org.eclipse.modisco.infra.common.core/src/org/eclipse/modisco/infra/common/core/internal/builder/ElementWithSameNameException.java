/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.modisco.infra.common.core.internal.builder;

public class ElementWithSameNameException extends OpenResourceException {

	private static final long serialVersionUID = 7149619504641182892L;

	public ElementWithSameNameException() {
		super();
	}

	public ElementWithSameNameException(final String message) {
		super(message);
	}

	public ElementWithSameNameException(final Throwable cause) {
		super(cause);
	}

	public ElementWithSameNameException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
