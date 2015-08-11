/*********************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 
 * 	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - 342856 - improve Discoverers implementation
 * ******************************************************************************/
package org.eclipse.modisco.java.composition.discoverer.benchmark;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.Report;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emfstat.Statistics;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.java.composition.discoverer.benchmark.actions.DiscoverJavaApplicationModel;

/**
 * This class provides a way to monitor a Java Composition Discovery.
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474718
 */
@Deprecated
public class Benchmark implements Discoverer {

	private static List<DiscoveryParameter> parametersKeys = null;

	/**
	 * Return true if this discoverer can be applied on the source
	 */
	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		if (source instanceof IJavaProject) {
			result = true;
		} else if (source instanceof IProject) {
			IProject project = (IProject) source;
			try {
				if (project.hasNature(JavaCore.NATURE_ID)) {
					result = true;
				}
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
		return result;
	}

	/**
	 * Discoverer Java and KDM Source Model Weave those two models. Attaches a
	 * Statistic project to the discovery, monitors it and generates a report
	 * with the results
	 */
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		IProject project;
		if (source instanceof IJavaProject) {
			project = ((IJavaProject) source).getProject();
		} else if (source instanceof IProject) {
			project = (IProject) source;
		} else {
			throw new IllegalArgumentException("'source' should be an IJavaProject or IProject"); //$NON-NLS-1$
		}

		File projectFile = Statistics.getDefaultStatProject(project).getLocation().toFile();
		this.statProject = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectFile.getName());

		parameters.put(DefaultDiscoverer.PARAMETER_SILENT_MODE, new Boolean(true));

		DiscoverJavaApplicationModel javaDiscoverer2 = new DiscoverJavaApplicationModel();
		javaDiscoverer2.setStatProject(getStatProject());
		javaDiscoverer2.discoverElement(source, parameters);

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

	public List<DiscoveryParameter> getDiscovererParameters() {
		if (Benchmark.parametersKeys == null) {
			Benchmark.parametersKeys = new ArrayList<DiscoveryParameter>();
			Benchmark.parametersKeys.add(DefaultDiscoverer.PARAMETER_SILENT_MODE);
			Benchmark.parametersKeys.add(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
		}
		return Benchmark.parametersKeys;
	}

	@Deprecated
	public Resource discoverElement(final Object source, final URI target) {
		throw new RuntimeException("Should not be used."); //$NON-NLS-1$
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
