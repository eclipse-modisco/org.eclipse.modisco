/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.infra.query.core.internal;

import java.util.HashMap;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;

/**
 * The activator class controls the plug-in life cycle
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class Activator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.modisco.infra.query.core"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private final HashMap<String, Bundle> installedBundle = new HashMap<String, Bundle>();

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		Activator.plugin = this;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(final BundleContext context) throws Exception {
		uninstallTmpBundles();
		Activator.plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return Activator.plugin;
	}

	public void uninstallTmpBundles() {
		for (Bundle bundle : this.installedBundle.values()) {
			try {
				bundle.uninstall();
			} catch (BundleException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			}
		}
	}

	public Bundle installBundle(final IProject project) {
		Bundle bundle = null;

		try {
			String projectUri = project.getLocation().toFile().toURI().toString();
			// Bug 319673 - bundle fails to load if project name contains a space
			projectUri = projectUri.replaceAll("%20", " "); //$NON-NLS-1$ //$NON-NLS-2$
			if (this.installedBundle.containsKey(projectUri)) {
				this.installedBundle.get(projectUri).uninstall();
			} else {
				Bundle localBundle = Platform.getBundle(project.getName());
				if (localBundle != null) {
					localBundle.uninstall();
				}
			}
			bundle = Activator.getDefault().getBundle().getBundleContext()
					.installBundle(projectUri);
			if (bundle == null) {
				throw new RuntimeException();
			}

			this.installedBundle.put(projectUri, bundle);
			// bundle.start();
		} catch (Exception e) {
			final String message = "Failed to load bundle: " + project.getName(); //$NON-NLS-1$
			MoDiscoLogger.logError(e, message, Activator.getDefault());
		}
		MoDiscoLogger.logInfo("Bundle loaded: " + project.getName(), Activator.getDefault()); //$NON-NLS-1$
		return bundle;
	}
}
