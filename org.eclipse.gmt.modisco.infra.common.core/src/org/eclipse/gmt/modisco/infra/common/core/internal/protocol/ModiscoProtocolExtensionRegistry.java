/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.common.core.internal.protocol;

import java.util.HashMap;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.gmt.modisco.infra.common.core.internal.CommonModiscoActivator;

/**
 * This class offers methods to get the description of the MoDisco sub-protocol
 * registered through the org.eclipse.gmt.modisco.common.core.protocolext
 * extension point.
 *
 * @author Gregoire DUPE (Mia-Software)
 * @see ModiscoResourceFactoryImpl
 */
public final class ModiscoProtocolExtensionRegistry {

	private static final String EXTENTION_POINT_ID = "org.eclipse.gmt.modisco.common.core.protocolext"; //$NON-NLS-1$
	private static HashMap<String, IModiscoProtocolExtension> factoryExtMap = initMap();

	/**
	 * This must not be instantiated
	 */
	private ModiscoProtocolExtensionRegistry() {
		// Nothing to do
	}

	private static HashMap<String, IModiscoProtocolExtension> initMap() {
		HashMap<String, IModiscoProtocolExtension> localFactoryExtMap = new HashMap<String, IModiscoProtocolExtension>();
		IConfigurationElement[] configs = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(ModiscoProtocolExtensionRegistry.EXTENTION_POINT_ID);
		for (IConfigurationElement config : configs) {
			try {
				IModiscoProtocolExtension modiscoProtocolExtension = (IModiscoProtocolExtension) config
						.createExecutableExtension("class"); //$NON-NLS-1$
				localFactoryExtMap.put(modiscoProtocolExtension.getSchemeSpecificPart(),
						modiscoProtocolExtension);
			} catch (Exception e) {
				IStatus status = new Status(IStatus.ERROR, CommonModiscoActivator.PLUGIN_ID,
						"Failed to load " //$NON-NLS-1$
								+ IModiscoProtocolExtension.class.getSimpleName() + " for: " //$NON-NLS-1$
								+ config.getNamespaceIdentifier(), e);
				CommonModiscoActivator.getDefault().getLog().log(status);
			}
		}
		return localFactoryExtMap;
	}

	/**
	 *
	 * @return the map pointing to the class implementing
	 *         IModiscoProtocolExtension for each registered MoDisco
	 *         sub-protocol
	 */
	public static HashMap<String, IModiscoProtocolExtension> getFactoryExtMap() {
		return ModiscoProtocolExtensionRegistry.factoryExtMap;
	}

}