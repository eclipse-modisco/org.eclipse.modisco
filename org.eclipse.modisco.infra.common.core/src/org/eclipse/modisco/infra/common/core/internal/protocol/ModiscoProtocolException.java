/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.protocol;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * Modisco Protocol Exception
 *
 * @author Gregoire DUPE (Mia-Software)
 *
 */
public class ModiscoProtocolException extends IOException implements Resource.Diagnostic {

	private static final long serialVersionUID = -1170752099301820884L;

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.IOException#IOException()
	 */
	public ModiscoProtocolException() {
		super();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.IOException#IOException(String)
	 */
	public ModiscoProtocolException(final String message) {
		super(message);
	}

	// /* (non-Javadoc)
	// * @see java.lang.IOException#IOException(Throwable)
	// */
	// public ModiscoProtocolException(final Throwable cause) {
	// super(cause);
	// }
	//
	// /* (non-Javadoc)
	// * @see java.lang.IOException#IOException(String, Throwable)
	// */
	// public ModiscoProtocolException(final String message, final Throwable
	// cause) {
	// super(message, cause);
	// }

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getColumn()
	 */
	public int getColumn() {
		return 0;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getLine()
	 */
	public int getLine() {
		return 0;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getLocation()
	 */
	public String getLocation() {
		return null;
	}

}
