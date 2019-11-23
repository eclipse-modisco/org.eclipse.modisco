/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.java.composition.discoverer.benchmark;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.benchmark.Report;
import org.eclipse.modisco.java.discoverer.benchmark.emfstat.Statistics;

/**
 * This class provides a way to monitor a Java Composition Discovery.
 */
public class Benchmark2 implements IDiscoverer<IJavaProject> {

	public boolean isApplicableTo(final IJavaProject source) {
		return source.getProject().isAccessible();
	}

	public void discoverElement(final IJavaProject source, final IProgressMonitor monitor)
			throws DiscoveryException {

		File projectFile = Statistics.getDefaultStatProject(source.getProject()).getLocation()
				.toFile();
		this.statProject = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectFile.getName());

		DiscoverJavaApplicationModel2 javaDiscoverer2 = new DiscoverJavaApplicationModel2();
		javaDiscoverer2.setStatProject(getStatProject());
		javaDiscoverer2.discoverElement(source, monitor);

		Statistics.copyLog(getStatProject().getLocation().toFile());

		// Create the Benchmark Report
		Report aReport = new Report(getStatProject());
		try {
			aReport.generate();
			getStatProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	// //////////////////////// TRACING /////////////////////////

	private IProject statProject;

	public void setStatProject(final IProject statProject) {
		this.statProject = statProject;
	}

	protected IProject getStatProject() {
		return this.statProject;
	}

}
