/*******************************************************************************
 * Copyright (c) 2013, 2019 Mia-Software.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 406569 - Image provider factory
 *    Grégoire Dupé (Mia-Software) - Bug 423611 - ImageProvider doesn't use singleton instance
 *    Grégoire Dupé (Mia-Software) - Bug 424122 - [Table] Images, fonts and colors are not shared between the instances of table
 *    Grégoire Dupé (Mia-Software) - Bug 478270 - Error message are missing ImageProvider
 ******************************************************************************/

package org.eclipse.modisco.facet.util.swt.internal.imageprovider;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.modisco.facet.util.core.DebugUtils;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.facet.util.swt.imageprovider.IImageProvider;
import org.eclipse.modisco.facet.util.swt.internal.Activator;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;

public final class ImageProvider implements IImageProvider {

	private static final boolean DEBUG = DebugUtils.getDebugStatus(Activator.getDefault());
	private final Map<Object, Image> map = new HashMap<Object, Image>();
	private final Plugin activator;

	/**
	 * @param activator must not be null.
	 */
	ImageProvider(final Plugin activator) {
		if (activator == null) {
			throw new IllegalArgumentException("The parameter 'activator' must no be null"); //$NON-NLS-1$
		}
		this.activator = activator;
	}

	public ImageDescriptor createImageDescriptor(final String resourcePath) {
		ImageDescriptor result;
		final Bundle bundle = this.activator.getBundle();
		final URL url = bundle.getResource(resourcePath);
		if (url == null) {
			final String message = NLS.bind("Resource not found: {0}", //$NON-NLS-1$
					resourcePath);
			Logger.logError(message, this.activator);
			result = ImageDescriptor.getMissingImageDescriptor();
		} else {
			result = ImageDescriptor.createFromURL(url);
		}
		return result;
	}

	public Image getImage(final String path) {
		Image result = this.map.get(path);
		if (result == null) {
			result = createImageDescriptor(path).createImage();
			this.map.put(path, result);
			if (DEBUG) {
				final Bundle bundle = this.activator.getBundle();
				final String bundleId = bundle.getSymbolicName();
				final String message = String.format("New image loaded: %s:%s", //$NON-NLS-1$
						bundleId, path);
				DebugUtils.debug(message);
			}
		}
		return result;
	}

	public Image getImage(final ImageDescriptor imgDescriptor) {
		Image result = this.map.get(imgDescriptor);
		if (result == null) {
			result = imgDescriptor.createImage();
			this.map.put(imgDescriptor, result);
			if (DEBUG) {
				final Bundle bundle = this.activator.getBundle();
				final String bundleId = bundle.getSymbolicName();
				final String message = String.format("New image loaded from an image descriptor (bundle=%s)", //$NON-NLS-1$
						bundleId);
				DebugUtils.debug(message);
			}
		}
		return result;
	}

}
