/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.ui.internal.util;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @author Gregoire DUPE
 *
 */
public final class ImageUtils {
	private static AdapterFactory composedAdapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	private ImageUtils() {
		// Nothing to do
	}

	/**
	 * Returns an image for the given model element from the EMF global
	 * registry.
	 *
	 * @return an image or <code>null</code> if none was found for the given
	 *         element
	 */
	public static Image getImage(final Object object) {
		Image result = null;
		if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			IItemLabelProvider itemLabelProvider = (IItemLabelProvider) ImageUtils.composedAdapterFactory
					.adapt(eObject, IItemLabelProvider.class);
			if (itemLabelProvider != null) {
				Object image = itemLabelProvider.getImage(eObject);
				result = ExtendedImageRegistry.getInstance().getImage(image);
			}
		}
		return result;
	}
}
