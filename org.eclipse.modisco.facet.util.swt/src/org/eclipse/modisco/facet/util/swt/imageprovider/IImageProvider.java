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
 *    Gregoire Dupe (Mia-Software) - Bug 424122 - [Table] Images, fonts and colors are not shared between the instances of table
 ******************************************************************************/

package org.eclipse.modisco.facet.util.swt.imageprovider;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

public interface IImageProvider {

	Image getImage(String path);

	ImageDescriptor createImageDescriptor(String resourcePath);

	Image getImage(ImageDescriptor imgDescriptor);

}
