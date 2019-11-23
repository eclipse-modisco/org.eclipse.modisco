/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.query.core.exception;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class MissingBundleException extends ModelQueryException {

	private static final long serialVersionUID = -8404816241040395882L;
	private final String bundleName;

	public String getBundleName() {
		return this.bundleName;
	}

	public MissingBundleException(final String bundleName) {
		super("The bundle " + bundleName //$NON-NLS-1$
				+ " is missing. The bundle has to be installed, it will not be hot loaded."); //$NON-NLS-1$
		this.bundleName = bundleName;
	}

}
