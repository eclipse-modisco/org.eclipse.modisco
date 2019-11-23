/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas BROS (Mia-Software)
 */
package org.eclipse.modisco.infra.facet.core.internal;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog;
import org.eclipse.modisco.infra.common.core.internal.builder.MoDiscoCatalogBuilder;
import org.eclipse.modisco.infra.facet.core.FacetSetCatalog;

/**
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public class FacetBuilder extends MoDiscoCatalogBuilder {

	protected static final String FILE_EXTENSION = "facetSet"; //$NON-NLS-1$
	private static final String MARKER_TYPE = "org.eclipse.gmt.modisco.infra.facet.problem"; //$NON-NLS-1$

	@Override
	protected AbstractMoDiscoCatalog getCatalog() {
		return FacetSetCatalog.getSingleton();
	}

	@Override
	protected String getElementType() {
		return Messages.FacetBuilder_facetSet;
	}

	@Override
	protected String getRegistrationExtensionPoint() {
		return FacetSetCatalog.REGISTRATION_EXTENSION_POINT_ID;
	}

	@Override
	protected String getMarkerType() {
		return FacetBuilder.MARKER_TYPE;
	}

	@Override
	protected String getFileExtension() {
		return FacetBuilder.FILE_EXTENSION;
	}

	@Override
	protected Plugin getActivator() {
		return Activator.getDefault();
	}

}
