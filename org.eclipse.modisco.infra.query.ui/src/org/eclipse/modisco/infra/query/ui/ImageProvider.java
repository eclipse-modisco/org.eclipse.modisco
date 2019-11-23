/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.query.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * @author Gregoire DUPE (Mia-Software)
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public final class ImageProvider {
	//	private static final String MODEL_QUERY_SET = "icons/modelQuerySet.png"; //$NON-NLS-1$
	//	private static final String MODEL_QUERY = "icons/modelQuery.png"; //$NON-NLS-1$
	private static final String REMOVE = "icons/remove.gif"; //$NON-NLS-1$
	private static final String REMOVE_ALL = "icons/removeAll.gif"; //$NON-NLS-1$

	private static ImageProvider singleton;

	// private Image modelQuerySet;
	// private Image modelQuery;
	// private Image remove;
	// private Image removeAll;

	private ImageProvider() {
		// This method must not be instantiated
	}

	/**
	 * Create an image descriptor from a resource
	 *
	 * @param resourcePath
	 *            the path of the resource (in the bundle)
	 * @return the image descriptor
	 */
	private ImageDescriptor createImageDescriptor(final String resourcePath) {
		ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(
				Activator.PLUGIN_ID, resourcePath);
		if (imageDescriptor == null) {
			MoDiscoLogger.logError(NLS.bind("Resource not found: {0}", resourcePath), Activator //$NON-NLS-1$
					.getDefault());
			return ImageDescriptor.getMissingImageDescriptor();
		}
		return imageDescriptor;
	}

	public static ImageProvider getInstance() {
		if (ImageProvider.singleton == null) {
			ImageProvider.singleton = new ImageProvider();
		}
		return ImageProvider.singleton;
	}

	// public Image getModelQuerySet() {
	// if (this.modelQuerySet == null) {
	// this.modelQuerySet =
	// createImageDescriptor(ImageProvider.MODEL_QUERY_SET).createImage();
	// }
	// return this.modelQuerySet;
	// }
	//
	// public Image getModelQuery() {
	// if (this.modelQuery == null) {
	// this.modelQuery =
	// createImageDescriptor(ImageProvider.MODEL_QUERY).createImage();
	// }
	// return this.modelQuery;
	// }

	// public Image getRemove() {
	// if (this.remove == null) {
	// this.remove = createImageDescriptor(ImageProvider.REMOVE).createImage();
	// }
	// return this.remove;
	// }
	//
	// public Image getRemoveAll() {
	// if (this.removeAll == null) {
	// this.removeAll =
	// createImageDescriptor(ImageProvider.REMOVE_ALL).createImage();
	// }
	// return this.removeAll;
	// }

	public ImageDescriptor getRemoveImageDescriptor() {
		return createImageDescriptor(ImageProvider.REMOVE);
	}

	public ImageDescriptor getRemoveAllImageDescriptor() {
		return createImageDescriptor(ImageProvider.REMOVE_ALL);
	}
}
