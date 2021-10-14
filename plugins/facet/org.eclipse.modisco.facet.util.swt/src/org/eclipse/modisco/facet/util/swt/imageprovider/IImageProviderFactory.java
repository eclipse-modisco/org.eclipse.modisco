/*******************************************************************************
 * Copyright (c) 2013, 2019 Mia-Software and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 406569 - Image provider factory
 ******************************************************************************/
package org.eclipse.modisco.facet.util.swt.imageprovider;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.modisco.facet.util.swt.internal.imageprovider.ImageProviderFactory;

public interface IImageProviderFactory {

	IImageProviderFactory DEFAULT = new ImageProviderFactory();
	
	IImageProvider createIImageProvider(Plugin plugin);
}
