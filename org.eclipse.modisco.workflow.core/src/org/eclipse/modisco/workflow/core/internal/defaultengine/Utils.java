/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 */
package org.eclipse.modisco.workflow.core.internal.defaultengine;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.modisco.workflow.core.internal.Activator;

public final class Utils {

	private Utils() {
		// utility class
	}

	/**
	 * Allows to find the good INSTANCE of LaunchConfiguration corresponding at
	 * name
	 *
	 * @param configName
	 *            Name of LaunchConfiguration
	 * @return An INSTANCE of launchConfiguration corresponding at name
	 */
	public static ILaunchConfiguration getLaunchConfigurationFromName(final String configName) {
		ILaunchConfiguration configuration = null;
		try {
			for (ILaunchConfiguration config : DebugPlugin.getDefault().getLaunchManager()
					.getLaunchConfigurations()) {
				if (config.getName().equals(configName)) {
					configuration = config;
					break;
				}
			}
		} catch (CoreException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Unknown error", e); //$NON-NLS-1$
			Activator.getDefault().getLog().log(status);
		}
		return configuration;
	}

}
