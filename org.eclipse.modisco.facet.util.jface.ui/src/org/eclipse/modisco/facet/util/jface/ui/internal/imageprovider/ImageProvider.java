/*******************************************************************************
 * Copyright (c) 2013 Soft-Maint.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 424416 - Plug-in for JFace Utilities
 ******************************************************************************/

package org.eclipse.modisco.facet.util.jface.ui.internal.imageprovider;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.modisco.facet.util.jface.ui.imageprovider.IImageProvider;
import org.eclipse.modisco.facet.util.swt.imageprovider.IImageProviderFactory;
import org.eclipse.swt.graphics.Image;

@Deprecated
public final class ImageProvider implements IImageProvider {

	private final org.eclipse.modisco.facet.util.swt.imageprovider.IImageProvider delegate;

	ImageProvider(final Plugin plugin) {
		this.delegate = IImageProviderFactory.DEFAULT
				.createIImageProvider(plugin);
	}

	public Image getImage(final DecorationOverlayIcon imgDescriptor) {
		return this.delegate.getImage(imgDescriptor);
	}

	public Image getImage(final String path) {
		return this.delegate.getImage(path);
	}

	public ImageDescriptor createImageDescriptor(final String resourcePath) {
		return this.delegate.createImageDescriptor(resourcePath);
	}

	public Image getImage(final ImageDescriptor imgDescriptor) {
		return this.delegate.getImage(imgDescriptor);
	}
}
