/*********************************************************************************
 * Copyright (c) 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 464300 - To be able to discover XML models from a folder/project
 ********************************************************************************/
package org.eclipse.modisco.xml.discoverer;

import java.io.File;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.modisco.xml.discoverer.internal.XmlDiscoveryService;

/**
 * @since 0.13
 */
public interface IXmlDiscoveryService {

	IXmlDiscoveryService DEFAULT = new XmlDiscoveryService();

	/**
	 * @param file
	 *            an XML file
	 * @param ignoreWhitespace
	 * @param lightweightModel
	 * @param monitor
	 */
	void discover(File file, boolean ignoreWhitespace, boolean lightweightModel,
			IProgressMonitor monitor) throws XmlDiscoveryServiceException;

	void discover(IContainer projet, boolean ignoreWhitespace, boolean lightweightModel,
			IProgressMonitor monitor) throws XmlDiscoveryServiceException;

}
