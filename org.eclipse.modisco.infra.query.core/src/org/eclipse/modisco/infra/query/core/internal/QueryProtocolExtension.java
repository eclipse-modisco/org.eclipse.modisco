/**
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.infra.query.core.internal;

import org.eclipse.emf.common.util.URI;
import org.eclipse.modisco.infra.common.core.internal.protocol.IModiscoProtocolExtension;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class QueryProtocolExtension implements IModiscoProtocolExtension {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.modisco.infra.common.core.IModiscoResourceFactoryExt#
	 * getSchemeSpecificPart()
	 */
	public String getSchemeSpecificPart() {
		return "query"; //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.modisco.infra.common.core.internal.IModiscoResourceFactoryExt
	 * #getURI (java.lang.String)
	 */
	public URI getURI(final String name) {
		return ModelQuerySetCatalog.getSingleton().getURI(name);
	}
}