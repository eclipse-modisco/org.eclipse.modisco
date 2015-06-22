/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Frederic Madiot (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.manifest.discoverer;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 * @deprecated Will become internal cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470609
 */
@Deprecated
public class Activator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.modisco.manifest.discoverer"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
		// nothing
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
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
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void stop(final BundleContext context) throws Exception {
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

}
