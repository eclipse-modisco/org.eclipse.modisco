/*******************************************************************************
 * Copyright (c) 2012, 2019 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 374941 - To be able to customize overlay icons on EClass
 *    Nicolas Bros (Mia-Software) - Bug 375388 - Cell editor for IImage
 *    Nicolas Rault (Soft-Maint) - Bug 412565 - Need an URIImage Constructor
 *******************************************************************************/
package org.eclipse.modisco.facet.custom.ui;

import org.eclipse.modisco.facet.custom.metamodel.custompt.IImage;
import org.eclipse.modisco.facet.custom.ui.internal.custompt.ImageWrapper;
import org.eclipse.modisco.facet.custom.ui.internal.custompt.URIImage;
import org.eclipse.swt.graphics.Image;

/**
 * @since 0.2
 */
public final class ImageUtils {

	private ImageUtils() {
		// Must not be used
	}

	/** Creates an {@link IImage} that wraps the given SWT {@link Image} */
	public static IImage wrap(final Image image) {
		return new ImageWrapper(image);
	}

	/**
	 * Returns the SWT {@link Image} represented by this {@link IImage}
	 * 
	 * @param image
	 *            the image to unwrap
	 * @return the SWT image, or <code>null</code> if the {@link IImage} doesn't wrap a SWT image
	 */
	public static Image unwrap(final IImage image) {
		Image result = null;
		if (image instanceof ImageWrapper) {
			final ImageWrapper imageWrapper = (ImageWrapper) image;
			result = imageWrapper.getImage();
		}
		return result;
	}
	
	/** 
	 * Creates an {@link IImage} that wraps the given uri 
	 * @since 0.4
	 */
	public static IImage wrap(final String uri) {
		return new URIImage(uri);
	}	
}
