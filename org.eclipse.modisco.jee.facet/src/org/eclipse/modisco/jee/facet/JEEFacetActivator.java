/**
 * *******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 * 	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 */
package org.eclipse.modisco.jee.facet;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class JEEFacetActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.modisco.jee.facet"; //$NON-NLS-1$

	// The shared instance
	private static JEEFacetActivator plugin;

	/**
	 * The constructor
	 */
	public JEEFacetActivator() {
		//
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
		JEEFacetActivator.plugin = this;
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
		JEEFacetActivator.plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static JEEFacetActivator getDefault() {
		return JEEFacetActivator.plugin;
	}

}
