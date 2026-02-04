/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.core;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog;
import org.eclipse.modisco.infra.common.core.internal.builder.MoDiscoCatalogBuilder;

/**
 * A builder that feeds and updates the {@link CustomizationsCatalog} with the
 * customization files it finds
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class CustomizationsBuilder extends MoDiscoCatalogBuilder {

	protected static final String FILE_EXTENSION = "uiCustom"; //$NON-NLS-1$
	private static final String MARKER_TYPE = "org.eclipse.modisco.infra.browser.custom.problem"; //$NON-NLS-1$

	@Override
	protected AbstractMoDiscoCatalog getCatalog() {
		return CustomizationsCatalog.getInstance();
	}

	@Override
	protected String getElementType() {
		return Messages.CustomizationsBuilder_customization;
	}

	@Override
	protected String getRegistrationExtensionPoint() {
		return CustomizationsCatalog.REGISTRATION_EXTENSION_POINT_ID;
	}

	@Override
	protected String getMarkerType() {
		return CustomizationsBuilder.MARKER_TYPE;
	}

	@Override
	protected String getFileExtension() {
		return CustomizationsBuilder.FILE_EXTENSION;
	}

	@Override
	protected Plugin getActivator() {
		return Activator.getDefault();
	}
}
