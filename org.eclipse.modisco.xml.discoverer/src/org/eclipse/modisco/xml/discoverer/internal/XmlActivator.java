/*********************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 **********************************************************************************/
package org.eclipse.modisco.xml.discoverer.internal;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class XmlActivator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.modisco.xml.discoverer"; //$NON-NLS-1$

	// The shared instance
	private static XmlActivator plugin;

	/**
	 * The constructor
	 */
	public XmlActivator() {
		// Nothing to do
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		XmlActivator.plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(final BundleContext context) throws Exception {
		XmlActivator.plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static XmlActivator getDefault() {
		return XmlActivator.plugin;
	}

}
