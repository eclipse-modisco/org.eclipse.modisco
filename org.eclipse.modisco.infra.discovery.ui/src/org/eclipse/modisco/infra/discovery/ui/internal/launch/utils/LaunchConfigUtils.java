/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.launch.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.launch.LaunchConfiguration;
import org.eclipse.modisco.infra.discovery.ui.Activator;
import org.eclipse.modisco.infra.discovery.ui.internal.util.LaunchModelUtils;

/**
 * This class manages the serialization of a discovery launch model into one
 * {@link ILaunchConfiguration}.
 *
 */
public final class LaunchConfigUtils {

	private static final String ENCODING = "UTF-8"; //$NON-NLS-1$
	private static final String COULD_NOT_DESERIALIZE_MSG = "Could not deserialize discovery launch configuration"; //$NON-NLS-1$
	private static final String COULD_NOT_SERIALIZE_MSG = "Could not serialize discovery launch configuration"; //$NON-NLS-1$

	private LaunchConfigUtils() {
		// utility class
	}

	public static LaunchConfiguration getConfigurationModel(final ILaunchConfiguration launchConfig) {
		LaunchConfiguration configurationModel = LaunchConfigUtils
				.loadConfigurationModel(launchConfig);
		if (configurationModel != null) {
			return configurationModel;
		}
		return LaunchModelUtils.createLaunchConfigurationModel();
	}

	public static LaunchConfiguration loadConfigurationModel(final ILaunchConfiguration launchConfig) {
		String launchModelSerialized = null;
		try {
			launchModelSerialized = launchConfig.getAttribute(
					LaunchModelUtils.DISCOVERER_LAUNCH_MODEL, ""); //$NON-NLS-1$

			if (launchModelSerialized != null && launchModelSerialized.trim().length() > 0) {
				Resource launchResource = LaunchModelUtils.createLaunchResource();
				byte[] bytes = launchModelSerialized.getBytes(LaunchConfigUtils.ENCODING);
				InputStream input = new ByteArrayInputStream(bytes);
				launchResource.load(input, null);
				if (launchResource.getContents().size() > 0) {
					LaunchConfiguration launchConfiguration = (LaunchConfiguration) launchResource
							.getContents().get(0);
					return launchConfiguration;
				}
				MoDiscoLogger.logWarning(LaunchConfigUtils.COULD_NOT_DESERIALIZE_MSG
						+ " : empty resource", //$NON-NLS-1$
						Activator.getDefault());
			}
		} catch (UnsupportedEncodingException e) {
			MoDiscoLogger.logWarning(e, LaunchConfigUtils.COULD_NOT_DESERIALIZE_MSG,
					Activator.getDefault());
		} catch (CoreException e) {
			MoDiscoLogger.logWarning(e, LaunchConfigUtils.COULD_NOT_DESERIALIZE_MSG,
					Activator.getDefault());
		} catch (IOException e) {
			MoDiscoLogger.logWarning(e, LaunchConfigUtils.COULD_NOT_DESERIALIZE_MSG,
					Activator.getDefault());
		}
		return null;
	}

	/** Serialize the given launch model in the given launch configuration. */
	public static void saveConfigurationModel(final LaunchConfiguration configurationModel,
			final ILaunchConfigurationWorkingCopy launchConfig) {
		try {
			ByteArrayOutputStream outStream = new ByteArrayOutputStream();
			configurationModel.eResource().save(outStream, null);

			String launchModelSerialized = new String(outStream.toByteArray(),
					LaunchConfigUtils.ENCODING);

			launchConfig.setAttribute(LaunchModelUtils.DISCOVERER_LAUNCH_MODEL,
					launchModelSerialized);
		} catch (UnsupportedEncodingException e) {
			MoDiscoLogger.logWarning(e, LaunchConfigUtils.COULD_NOT_SERIALIZE_MSG,
					Activator.getDefault());
		} catch (IOException e) {
			MoDiscoLogger.logWarning(e, LaunchConfigUtils.COULD_NOT_SERIALIZE_MSG,
					Activator.getDefault());
		}
	}

}
