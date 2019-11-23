/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Frederic Madiot (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.eclipseplugin.discoverer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.pde.core.project.IBundleProjectDescription;

public class DiscoverEclipsePluginFromProject extends AbstractModelDiscoverer<IProject> {

	public boolean isApplicableTo(final IProject project) {
		try {
			return project.isAccessible() && project.getNature(JavaCore.NATURE_ID) != null
					&& project.getNature(IBundleProjectDescription.PLUGIN_NATURE) != null;
		} catch (CoreException e) {
			return false;
		}
	}

	@Override
	protected void basicDiscoverElement(final IProject project, final IProgressMonitor monitor)
			throws DiscoveryException {
		IJavaProject javaProject = JavaCore.create(project);
		DiscoverEclipsePluginFromJavaProject2 delegateDiscoverer = new DiscoverEclipsePluginFromJavaProject2();
		delegateDiscoverer.setTargetURI(getTargetURI());
		delegateDiscoverer.setSerializeTarget(isTargetSerializationChosen());
		delegateDiscoverer.setRefreshSourceBeforeDiscovery(getRefreshSourceBeforeDiscovery());
		delegateDiscoverer.setTargetModel(getTargetModel());
		delegateDiscoverer.discoverElement(javaProject, monitor);
		setTargetModel(delegateDiscoverer.getTargetModel());
	}
}
