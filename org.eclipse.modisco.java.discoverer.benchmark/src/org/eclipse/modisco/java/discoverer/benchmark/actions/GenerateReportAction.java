/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 */
package org.eclipse.modisco.java.discoverer.benchmark.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.benchmark.Activator;
import org.eclipse.modisco.java.discoverer.benchmark.Report;
import org.eclipse.modisco.java.discoverer.benchmark.emfstat.Statistics;

public class GenerateReportAction implements IDiscoverer<IProject> {

	public boolean isApplicableTo(final IProject source) {
		IProject project = source;
		if (project.isAccessible()) {
			try {
				for (IResource resource : project.members()) {
					if (resource instanceof IFile) {
						IFile file = (IFile) resource;
						if (file.getFileExtension().equals(Statistics.TSV_FILE_EXT)) {
							IResource propertiesFile = project.findMember(file.getName()
									.replaceAll("(.*)\\." //$NON-NLS-1$
											+ Statistics.TSV_FILE_EXT, "$1.") //$NON-NLS-1$
									+ Statistics.PROPERTIES_FILE_EXT);
							if (propertiesFile != null) {
								return true;
							}
						}
					}
				}
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
		return false;
	}

	public void discoverElement(final IProject source, final IProgressMonitor monitor)
			throws DiscoveryException {
		IProject project = source;
		try {
			new Report(project).generate();
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		try {
			project.refreshLocal(IResource.DEPTH_ONE, new NullProgressMonitor());
		} catch (CoreException e) {
			MoDiscoLogger.logWarning(e, Activator.getDefault());
		}
	}
}
