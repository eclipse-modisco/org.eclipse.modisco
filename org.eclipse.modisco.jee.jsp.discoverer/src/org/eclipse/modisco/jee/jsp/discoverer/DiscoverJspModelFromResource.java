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

import java.io.File;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.jee.jsp.Model;

public class DiscoverJspModelFromResource extends AbstractJspDiscoverer<IResource> {

	public static final String ID = "org.eclipse.modisco.jee.jsp.discoverer.resource"; //$NON-NLS-1$

	public boolean isApplicableTo(final IResource resource) {
		if (resource instanceof IFile) {
			IFile file = (IFile) resource;
			return file.exists() && file.getFileExtension() != null
					&& AbstractJspDiscoverer.isJspExtension(file.getFileExtension());
		}
		if (resource instanceof IContainer) {
			IContainer container = (IContainer) resource;
			return container.isAccessible();
		}
		return false;
	}

	/**
	 * Alternate discoverer service with File as input instead of IFile. If you want to discover an
	 * {@link IFile}, use {@link IDiscoverer#discoverElement(Object, IProgressMonitor)} instead
	 *
	 * @param file
	 *            the file to discover
	 * @param monitor
	 *            a {@link IProgressMonitor progress monitor} (may be a {@link NullProgressMonitor}
	 *            if progress monitoring is not desired)
	 * @throws DiscoveryException
	 */
	public void discoverElement(final File file, final IProgressMonitor monitor)
			throws DiscoveryException {

		checkParameterValues();
		setDefaultTargetURI(URI.createFileURI(file.getPath().concat(
				JSPDiscoveryConstants.JSP_MODEL_FILE_SUFFIX)));

		monitor.beginTask(Messages.discoveringJspModel, IProgressMonitor.UNKNOWN);
		Model model = getEFactory().createModel();
		Resource targetModel = createTargetModel();
		targetModel.getContents().add(model);

		discoverFile(file, model);

		monitor.setTaskName(Messages.DiscoverJspModelFromResource_savingDiscoveredModel);
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
		monitor.beginTask(Messages.discoveringJspModel, IProgressMonitor.UNKNOWN);
		Model model = getEFactory().createModel();
		Resource targetModel = createTargetModel();
		targetModel.getContents().add(model);

		if (resource instanceof IFile) {
			IFile file = (IFile) resource;
			setDefaultTargetURI(URI.createPlatformResourceURI(
					file.getFullPath().toString()
							.concat(JSPDiscoveryConstants.JSP_MODEL_FILE_SUFFIX), true));
			discoverFile(file.getLocation().toFile(), model);
		} else if (resource instanceof IContainer) {
			IContainer container = (IContainer) resource;
			setDefaultTargetURI(URI.createPlatformResourceURI(
					container.getFullPath().append(container.getName()).toString()
							.concat(JSPDiscoveryConstants.JSP_MODEL_FILE_SUFFIX), true));
			discoverDirectory(container.getLocation().toFile(), model);
		} else {
			throw new IllegalArgumentException(resource.getClass().getName() + " not handled"); //$NON-NLS-1$
		}
	}
}
