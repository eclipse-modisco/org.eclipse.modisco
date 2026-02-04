/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.catalog.DirectionKind;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.infra.discovery.core.internal.Activator;
import org.eclipse.modisco.infra.discovery.core.internal.DiscoveryManager;

/**
 * A base implementation of Discoverer, which proposes to centralize some
 * parameters properties and behaviors :
 *
 * <ul>
 * <li>
 * Control of source and parameters values at the beginning of a discovery
 * <li>
 * Usual tests of source type
 * <li>
 * Source refresh management
 * </ul>
 *
 * @param <T>
 *            the type of source of the discovery
 */
public abstract class AbstractDiscoverer<T> implements IDiscoverer<T> {

	private boolean refreshSourceBeforeDiscovery = false;

	@Parameter(name = "REFRESH_SOURCE_BEFORE", description = "Whether to refresh the source at the beginning of the discovery. Refresh behavior depends on the Discoverer implementation. The standard refresh behavior is to test if the source is an org.eclipse.core.resources.IResource and call its refreshLocal() method.")
	public void setRefreshSourceBeforeDiscovery(final boolean value) {
		this.refreshSourceBeforeDiscovery = value;
	}

	protected boolean getRefreshSourceBeforeDiscovery() {
		return this.refreshSourceBeforeDiscovery;
	}

	protected abstract void basicDiscoverElement(final T source, final IProgressMonitor monitor)
			throws DiscoveryException;

	public void discoverElement(final T source, final IProgressMonitor monitor)
			throws DiscoveryException {
		if (monitor.isCanceled()) {
			return;
		}
		monitor.subTask(Messages.AbstractDiscoverer_testingApplicability);
		if (!isApplicableTo(source)) {
			throw new DiscoveryException(
					"Cannot launch discoverer because it is not applicable to " //$NON-NLS-1$
							+ source.toString());
		}

		if (monitor.isCanceled()) {
			return;
		}
		monitor.subTask(Messages.AbstractDiscoverer_checkingParamValues);
		checkParameterValues();

		if (monitor.isCanceled()) {
			return;
		}
		if (this.refreshSourceBeforeDiscovery) {
			monitor.subTask(Messages.AbstractDiscoverer_refreshingSource);
			refreshSource(source);
		}

		if (monitor.isCanceled()) {
			return;
		}
		monitor.subTask(Messages.AbstractDiscoverer_discovering);
		basicDiscoverElement(source, monitor);
	}

	/**
	 * A default implementation for source refresh.
	 *
	 * It invokes the IResource.refreshLocal() service if the source is an
	 * instance of org.eclipse.core.resources.IResource
	 */
	protected static void refreshSource(final Object source) throws DiscoveryException {
		if (source instanceof IResource) {
			try {
				((IResource) source).refreshLocal(IResource.DEPTH_INFINITE,
						new NullProgressMonitor());
			} catch (CoreException e) {
				throw new DiscoveryException(e);
			}
		}
	}

	/**
	 * Utility service for usual isApplicableTo test.
	 *
	 * @return true if the source is an accessible instance of
	 *         {@link IJavaProject} or {@link IProject} with java nature.
	 */
	public static boolean isAJavaProject(final Object source) {
		boolean result = false;
		if (source instanceof IJavaProject) {
			result = ((IJavaProject) source).getProject().isAccessible();
		} else if (source instanceof IProject) {
			IProject project = (IProject) source;
			try {
				if ((project.isAccessible()) && (project.hasNature(JavaCore.NATURE_ID))) {
					result = true;
				}
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
		return result;
	}

	/**
	 * Utility service for usual isApplicableTo test.
	 *
	 * @return true if the source is an instance of {@link IFolder}
	 */
	public static boolean isAFolder(final Object source) {
		return source instanceof IFolder;
	}

	/**
	 * Utility service for usual isApplicableTo test.
	 *
	 * @return true if the source is an instance of {@link IProject}.
	 */
	public static boolean isAProject(final Object source) {
		return source instanceof IProject;
	}

	/**
	 * Utility service for usual isApplicableTo test.
	 *
	 * @param source
	 * @param fileExtension
	 *            the file extension to test. May be <code>null</code> to test
	 *            if there is no extension. May be empty to test if a file name
	 *            ends with a dot character.
	 * @return <code>true</code> if the source is an instance of {@link IFile}
	 *         with the given extension.
	 */
	public static boolean isAnIFileWithExtension(final Object source, final String fileExtension) {
		boolean result = false;
		if (source instanceof IFile) {
			IFile iFile = (IFile) source;
			String sourceExtension = iFile.getFileExtension();
			if (sourceExtension != null) {
				if (fileExtension.length() == 0 || fileExtension.charAt(0) != '.') {
					result = sourceExtension.equals(fileExtension);
				} else {
					result = sourceExtension.equals(fileExtension.substring(1));
				}
			} else {
				result = (fileExtension == null);
			}
		}
		return result;
	}

	protected void checkParameterValues() throws DiscoveryException {
		// We must retrieve the reflective description of discovery parameters
		// which are declared with annotations on subclasses
		DiscovererDescription discoDesc = DiscoveryManager
				.getDiscovererDescription(this.getClass());
		if (discoDesc != null) {
			for (DiscovererParameter aParameterDescription : discoDesc.getParameterDefinitions()) {
				if ((aParameterDescription.getDirection().equals(DirectionKind.IN) || aParameterDescription
						.getDirection().equals(DirectionKind.INOUT))
						&& aParameterDescription.isRequiredInput()) {
					if (IDiscoveryManager.INSTANCE.canRetrieveValue(aParameterDescription)) {
						Object parameterValue = null;
						try {
							parameterValue = IDiscoveryManager.INSTANCE.getValue(
									aParameterDescription, this);
						} catch (Exception e) {
							MoDiscoLogger.logWarning(e, Messages.AbstractDiscoverer_CannotCheck,
									Activator.getDefault());
							// Do not stop discovery
						}
						if (parameterValue == null) {
							throw new DiscoveryException(Messages.AbstractDiscoverer_CannotLaunch_2
									+ aParameterDescription.getId());
						}

					} else {
						assert true;
						// Developer of the discoverer did not declare an access
						// to the parameter value. We cannot check it.
					}
				}
			}
		}
	}

}
