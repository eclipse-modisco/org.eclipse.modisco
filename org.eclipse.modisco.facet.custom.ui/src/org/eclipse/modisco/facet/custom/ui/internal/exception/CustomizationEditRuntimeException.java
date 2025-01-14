
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
package org.eclipse.modisco.facet.custom.ui.internal.exception;

public class CustomizationEditRuntimeException extends RuntimeException {

	private static final long serialVersionUID = -632229513667261515L;

	public CustomizationEditRuntimeException() {
		super();
	}

	public CustomizationEditRuntimeException(final String message) {
		super(message);
	}

	public CustomizationEditRuntimeException(final Throwable cause) {
		super(cause);
	}

	public CustomizationEditRuntimeException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
