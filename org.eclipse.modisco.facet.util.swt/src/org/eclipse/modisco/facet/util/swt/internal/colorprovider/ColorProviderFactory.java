/*******************************************************************************
 * Copyright (c) 2013, 2019 Mia-Software and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *      Grégoire Dupé (Mia-Software) - Bug 424122 - [Table] Images, fonts and colors are not shared between the instances of table
 ******************************************************************************/
package org.eclipse.modisco.facet.util.swt.internal.colorprovider;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.modisco.facet.util.swt.colorprovider.IColorProvider;
import org.eclipse.modisco.facet.util.swt.colorprovider.IColorProviderFactory;
import org.eclipse.swt.graphics.Device;

public class ColorProviderFactory implements IColorProviderFactory {

	private Map<Device, IColorProvider> cash = new HashMap<Device, IColorProvider>();

	public IColorProvider getOrCreateIColorProvider(final Device device) {
		IColorProvider result = this.cash.get(device);
		if (result == null) {
			result = new ColorProvider(device);
			this.cash.put(device, result);
		}
		return result;
	}

}
