/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.tests;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @deprecated Will become internal cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470609
 */
@Deprecated
public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return Activator.context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(final BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(final BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
