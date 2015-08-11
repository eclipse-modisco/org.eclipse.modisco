<<<<<<< HEAD   (3a7127 Bug 474680 - [Deprecated] org.eclipse.gmt.modisco.usecase.si)
=======
/*******************************************************************************
 * Copyright (c) 2008, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Hugo Bruneliere (INRIA) - initial API and implementation
 *    Sebastien Minguet (Mia-Software) - initial API and implementation
 *    Frederic Madiot (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.gmt.modisco.usecase.simpletransformationschain;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *  cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474680
 */
@Deprecated
public class ModelplexKnowledgeDiscoveryFrameworkPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.gmt.modisco.usecase.simpletransformationschain"; //$NON-NLS-1$

	// The shared instance
	private static ModelplexKnowledgeDiscoveryFrameworkPlugin plugin;

	/**
	 * The constructor
	 */
	public ModelplexKnowledgeDiscoveryFrameworkPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		ModelplexKnowledgeDiscoveryFrameworkPlugin.plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(final BundleContext context) throws Exception {
		ModelplexKnowledgeDiscoveryFrameworkPlugin.plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static ModelplexKnowledgeDiscoveryFrameworkPlugin getDefault() {
		return ModelplexKnowledgeDiscoveryFrameworkPlugin.plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in relative path
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(final String path) {
		return imageDescriptorFromPlugin(ModelplexKnowledgeDiscoveryFrameworkPlugin.PLUGIN_ID, path);
	}
}
>>>>>>> BRANCH (6b51ed Merge remote-tracking branch 'origin/maintenance-0.13')
