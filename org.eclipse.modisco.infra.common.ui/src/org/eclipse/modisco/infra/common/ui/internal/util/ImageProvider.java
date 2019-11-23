/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software)
 *    Gregore Dupe (Mia-Software) - Bug 376699 - Eclipse 4.2 crash when creating a new facet model
 *******************************************************************************/
package org.eclipse.modisco.infra.common.ui.internal.util;

import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.MoDiscoCommonUIPlugin;
import org.eclipse.swt.graphics.Image;

public class ImageProvider {
	private static final String MODISCO_LOGO = "icons/logoMoDiscoMini.gif"; //$NON-NLS-1$
	protected static final String CATALOG_ICON_URL = "/icons/catalog.png"; //$NON-NLS-1$
	protected static final String ERROR_ICON_URL = "/icons/error.png"; //$NON-NLS-1$

	private static ImageProvider instance = new ImageProvider();
	private Image modiscoLogo;
	private Image catalog = null;

	public static ImageProvider getInstance() {
		return ImageProvider.instance;
	}

	/**
	 * Create an image descriptor from a resource
	 *
	 * @param resourcePath
	 *            the path of the resource (in the bundle)
	 * @return the image descriptor
	 */
	private ImageDescriptor createImageDescriptor(final String resourcePath) {
		final URL url = MoDiscoCommonUIPlugin.getDefault().getBundle().getResource(resourcePath);
		if (url == null) {
			MoDiscoLogger.logError("resource not found: " + resourcePath, MoDiscoCommonUIPlugin //$NON-NLS-1$
					.getDefault());
			return ImageDescriptor.getMissingImageDescriptor();
		}
		return ImageDescriptor.createFromURL(url);
	}

	public Image getModiscoLogo() {
		if (this.modiscoLogo == null) {
			this.modiscoLogo = createImageDescriptor(ImageProvider.MODISCO_LOGO).createImage();
		}
		return this.modiscoLogo;
	}

	public ImageDescriptor getModiscoLogoDescriptor() {
		return createImageDescriptor(ImageProvider.MODISCO_LOGO);
	}

	/** Return the icon representing a bidirectional link */
	public Image getCatalogIcon() {
		if (this.catalog == null) {
			this.catalog = createImageDescriptor(ImageProvider.CATALOG_ICON_URL).createImage();
		}
		return this.catalog;
	}

	/** Return the icon representing a red cross */
	public Image getErrorIcon() {
		if (this.catalog == null) {
			this.catalog = createImageDescriptor(ImageProvider.ERROR_ICON_URL).createImage();
		}
		return this.catalog;
	}
}
