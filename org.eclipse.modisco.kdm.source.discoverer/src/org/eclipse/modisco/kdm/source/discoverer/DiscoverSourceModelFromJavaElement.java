/*******************************************************************************
 * Copyright (c) 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *    Fabien Giquel (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.kdm.source.discoverer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.kdm.source.discoverer.internal.KDMSourceDiscoverer;

/**
 * A discoverer for building a model conforming to kdm.source metamodel from a
 * java container ({@link IJavaElement} instance).
 */
public class DiscoverSourceModelFromJavaElement extends AbstractModelDiscoverer<IJavaElement> {

	public boolean isApplicableTo(final IJavaElement javaElement) {
		if (javaElement instanceof IJavaProject) {
			IJavaProject javaProject = (IJavaProject) javaElement;
			return javaProject.exists() && javaProject.getProject() != null
					&& javaProject.getProject().isAccessible();
		}
		if (javaElement instanceof IPackageFragment) {
			IPackageFragment packageFragment = (IPackageFragment) javaElement;
			return packageFragment.exists() && packageFragment.getResource().isAccessible()
					&& packageFragment.getResource() instanceof IContainer;
		}
		return false;
	}

	@Override
	protected void basicDiscoverElement(final IJavaElement javaElement,
			final IProgressMonitor monitor) throws DiscoveryException {
		final KDMSourceDiscoverer disco = new KDMSourceDiscoverer();
		final Resource model;

		if (javaElement instanceof IJavaProject) {
			IJavaProject javaProject = (IJavaProject) javaElement;
			IProject project = javaProject.getProject();
			setDefaultTargetURI(URI.createPlatformResourceURI(
					project.getFullPath().append(project.getName()).toString()
							.concat(IKDMDiscoveryConstants.KDM_MODEL_FILE_SUFFIX), true));
			model = disco.getKDMModelFromProject(javaProject.getProject());
		} else if (javaElement instanceof IPackageFragment) {
			IPackageFragment packageFragment = (IPackageFragment) javaElement;
			IContainer container = (IContainer) packageFragment.getResource();
			setDefaultTargetURI(URI.createPlatformResourceURI(
					container.getFullPath().append(container.getName()).toString()
							.concat(IKDMDiscoveryConstants.KDM_MODEL_FILE_SUFFIX), true));
			model = disco.getKDMModelFromContainer(container);
		} else {
			throw new IllegalArgumentException(javaElement.getClass().getName() + " not handled"); //$NON-NLS-1$
		}

		getResourceSet().getResources().add(model);
		setTargetModel(model);
	}
}
