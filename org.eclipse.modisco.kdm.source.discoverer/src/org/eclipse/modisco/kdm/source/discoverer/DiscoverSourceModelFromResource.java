/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
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

import java.io.File;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.kdm.source.discoverer.internal.KDMSourceDiscoverer;

/**
 * A discoverer for building a model conforming to kdm.source metamodel from a
 * files container ( {@link IContainer} instance or {@link File} instance.
 */
public class DiscoverSourceModelFromResource extends AbstractModelDiscoverer<IResource> {

	public boolean isApplicableTo(final IResource resource) {
		if (resource instanceof IProject) {
			IProject project = (IProject) resource;
			return project.isAccessible();
		}
		if (resource instanceof IContainer) {
			IContainer container = (IContainer) resource;
			return container.isAccessible();
		}
		return false;
	}

	/**
	 * Alternate discoverer service with File as input instead of IFile. If you
	 * want to discover an {@link IFile}, use
	 * {@link IDiscoverer#discoverElement(Object, IProgressMonitor)} instead
	 *
	 * @param directory
	 *            the directory to discover
	 * @param monitor
	 *            a {@link IProgressMonitor progress monitor} (may be a
	 *            {@link NullProgressMonitor} if progress monitoring is not
	 *            desired)
	 * @throws DiscoveryException
	 */
	public void discoverElement(final File directory, final IProgressMonitor monitor)
			throws DiscoveryException {

		if (!directory.isDirectory()) {
			throw new IllegalArgumentException("not a directory"); //$NON-NLS-1$
		}

		setDefaultTargetURI(URI.createFileURI(directory.getPath().concat(
				"/" + directory.getName() + IKDMDiscoveryConstants.KDM_MODEL_FILE_SUFFIX))); //$NON-NLS-1$

		checkParameterValues();

		final KDMSourceDiscoverer disco = new KDMSourceDiscoverer();
		final Resource model = disco.getKDMModelFromDirectory(directory);

		getResourceSet().getResources().add(model);
		setTargetModel(model);

		if (isTargetSerializationChosen()) {
			try {
				saveTargetModel();
			} catch (Exception e) {
				throw new DiscoveryException("Error saving discovery result model", e); //$NON-NLS-1$
			}
		}
	}

	@Override
	protected void basicDiscoverElement(final IResource resource, final IProgressMonitor monitor)
			throws DiscoveryException {
		final KDMSourceDiscoverer disco = new KDMSourceDiscoverer();
		final Resource model;

		if (resource instanceof IProject) {
			IProject project = (IProject) resource;
			setDefaultTargetURI(URI.createPlatformResourceURI(
					project.getFullPath().append(project.getName()).toString()
							.concat(IKDMDiscoveryConstants.KDM_MODEL_FILE_SUFFIX), true));

			model = disco.getKDMModelFromProject(project);
		} else if (resource instanceof IContainer) {
			IContainer container = (IContainer) resource;
			setDefaultTargetURI(URI.createPlatformResourceURI(
					container.getFullPath().append(container.getName()).toString()
							.concat(IKDMDiscoveryConstants.KDM_MODEL_FILE_SUFFIX), true));
			model = disco.getKDMModelFromContainer(container);
		} else {
			throw new IllegalArgumentException(resource.getClass().getName() + " not handled"); //$NON-NLS-1$
		}

		getResourceSet().getResources().add(model);
		setTargetModel(model);
	}
}
