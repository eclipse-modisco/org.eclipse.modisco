/**
 *  Copyright (c) 2010 Mia-Software.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *  	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * 
 */
package org.eclipse.modisco.java.composition.browser.customization;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/** The activator class controls the plug-in life cycle */
public class Activator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.gmt.modisco.java.composition.browser.customization"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		Activator.plugin = this;
	}

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