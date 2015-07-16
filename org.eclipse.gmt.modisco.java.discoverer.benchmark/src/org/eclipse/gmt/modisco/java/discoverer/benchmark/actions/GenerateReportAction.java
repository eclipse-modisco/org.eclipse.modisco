/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.gmt.modisco.java.discoverer.benchmark.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.Activator;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.Report;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emfstat.Statistics;

/**
 * @deprecated Will be removed,
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public class GenerateReportAction implements Discoverer {

	@Deprecated
	public Resource discoverElement(final Object source, final URI target) {
		throw new RuntimeException("Should not be used"); //$NON-NLS-1$
	}

	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		if (isApplicableTo(source)) {
			IProject project = (IProject) source;
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
		} else {
			throw new IllegalArgumentException();
		}
	}

	public List<DiscoveryParameter> getDiscovererParameters() {
		return Collections.unmodifiableList(new ArrayList<DiscoveryParameter>());
	}

	public boolean isApplicableTo(final Object source) {
		if (source instanceof IProject) {
			IProject project = (IProject) source;
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
		}
		return false;
	}
}
