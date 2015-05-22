/*********************************************************************************
 * Copyright (c) 2011, 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 464300 - To be able to discover XML models from a folder/project
 ********************************************************************************/
package org.eclipse.modisco.xml.discoverer.internal;

import java.io.File;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.xml.discoverer.IXmlDiscoveryService;
import org.eclipse.modisco.xml.discoverer.XMLModelDiscoverer;
import org.eclipse.modisco.xml.discoverer.XmlDiscoveryServiceException;

@SuppressWarnings("deprecation")
/*
 * @SuppressWarnings("deprecation") gdupe> XMLModelDiscoverer has been 
 * deprecated because is must me moved to the internal package. The 
 * implementation is still usable by internal code.
 */
public class XmlDiscoveryService implements IXmlDiscoveryService {

	public void discover(final File file, final boolean ignoreWhitespace,
			final boolean lightweightModel, final IProgressMonitor monitor)
			throws XmlDiscoveryServiceException {
		try {
			final XMLModelDiscoverer discoverer = new XMLModelDiscoverer();
			discoverer.setIgnoreWhitespace(ignoreWhitespace);
			discoverer.setLightweightModel(lightweightModel);
			discoverer.discoverElement(file, monitor);
		} catch (DiscoveryException e) {
			throw new XmlDiscoveryServiceException(e);
		}

	}

	public void discover(final IContainer container, final boolean ignoreWhitespace,
			final boolean lightweightModel, final IProgressMonitor monitor)
			throws XmlDiscoveryServiceException {
		try {
			final XMLModelDiscovererFromContainer discoverer = new XMLModelDiscovererFromContainer();
			discoverer.setIgnoreWhitespace(ignoreWhitespace);
			discoverer.setLightweightModel(lightweightModel);
			discoverer.discoverElement(container, monitor);
		} catch (DiscoveryException e) {
			throw new XmlDiscoveryServiceException(e);
		}
	}

}
