/*********************************************************************************
 * Copyright (c) 2009,2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - adapted to new discovery framework (Bug 335003)
 *********************************************************************************/
package org.eclipse.modisco.jee.jsp.discoverer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.jee.jsp.Model;

public class DiscoverJspModelFromJavaElement extends AbstractJspDiscoverer<IJavaElement> {

	public static final String ID = "org.eclipse.modisco.jee.jsp.discoverer.javaElement"; //$NON-NLS-1$

	public boolean isApplicableTo(final IJavaElement javaElement) {
		if (javaElement instanceof IJavaProject) {
			IJavaProject javaProject = (IJavaProject) javaElement;
			return javaProject.exists() && javaProject.getProject() != null
					&& javaProject.getProject().exists();
		}
		if (javaElement instanceof IPackageFragment) {
			IPackageFragment packageFragment = (IPackageFragment) javaElement;
			return packageFragment.exists() && packageFragment.getResource().exists()
					&& packageFragment.getResource() instanceof IContainer;
		}
		return false;
	}

	@Override
	protected void basicDiscoverElement(final IJavaElement javaElement,
			final IProgressMonitor monitor) throws DiscoveryException {
		monitor.beginTask(Messages.discoveringJspModel, IProgressMonitor.UNKNOWN);
		Model model = getEFactory().createModel();
		Resource targetModel = createTargetModel();
		targetModel.getContents().add(model);

		if (javaElement instanceof IJavaProject) {
			IJavaProject javaProject = (IJavaProject) javaElement;
			IProject project = javaProject.getProject();
			setDefaultTargetURI(URI.createPlatformResourceURI(
					project.getFullPath().append(project.getName()).toString()
							.concat(JSPDiscoveryConstants.JSP_MODEL_FILE_SUFFIX), true));
			discoverDirectory(project.getLocation().toFile(), model);
		} else if (javaElement instanceof IPackageFragment) {
			IPackageFragment packageFragment = (IPackageFragment) javaElement;
			IResource resource = packageFragment.getResource();
			if (resource instanceof IContainer) {
				IContainer container = (IContainer) resource;
				setDefaultTargetURI(URI.createPlatformResourceURI(
						container.getFullPath().append(container.getName()).toString()
								.concat(JSPDiscoveryConstants.JSP_MODEL_FILE_SUFFIX), true));
				discoverDirectory(container.getLocation().toFile(), model);
			} else {
				throw new IllegalArgumentException("Not a container"); //$NON-NLS-1$
			}
		} else {
			throw new IllegalArgumentException("Unhandled input"); //$NON-NLS-1$
		}
	}
}
