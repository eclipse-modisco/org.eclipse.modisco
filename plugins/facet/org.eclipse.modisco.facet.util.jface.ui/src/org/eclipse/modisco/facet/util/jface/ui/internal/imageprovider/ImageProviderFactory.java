/*******************************************************************************
 * Copyright (c) 2013, 2019 Soft-Maint.
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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.modisco.facet.util.jface.ui.imageprovider.IImageProvider;
import org.eclipse.modisco.facet.util.jface.ui.imageprovider.IImageProviderFactory;

@Deprecated
public class ImageProviderFactory implements IImageProviderFactory {

	private final Map<Plugin, IImageProvider> map = new HashMap<Plugin, IImageProvider>();
	
	public IImageProvider createIImageProvider(final Plugin plugin) {
		IImageProvider result = this.map.get(plugin);
		if (result == null) {
			result = new ImageProvider(plugin);
			this.map.put(plugin, result);
		}
		return result;
	}

}
