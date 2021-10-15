/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.jee;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class JEEActivator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.modisco.jee"; //$NON-NLS-1$

	// The shared instance
	private static JEEActivator plugin;

	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		JEEActivator.plugin = this;
	}

	@Override
	public void stop(final BundleContext context) throws Exception {
		JEEActivator.plugin = null;
		super.stop(context);
	}

	public static JEEActivator getDefault() {
		return JEEActivator.plugin;
	}

}
