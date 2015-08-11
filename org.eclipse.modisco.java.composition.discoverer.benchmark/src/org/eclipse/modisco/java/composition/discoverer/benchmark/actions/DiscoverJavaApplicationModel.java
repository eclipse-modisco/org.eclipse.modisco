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
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *********************************************************************************/
package org.eclipse.modisco.java.composition.discoverer.benchmark.actions;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emfstat.DiscoverJavaModelFromJavaProjectEMFStat;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emfstat.Statistics;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.java.composition.discoverer.DiscoverKDMSourceAndJavaModel;

/**
 * This class extends the DiscoverKDMSourceAndJavaModel to instrument it with benchmark
 * capabilities. Memory used during the discovery and saving steps are reported in an html file
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=474718
 */
@Deprecated
public class DiscoverJavaApplicationModel extends DiscoverKDMSourceAndJavaModel {

	private IProject project;

	@Override
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		if (source instanceof IJavaProject) {
			this.project = ((IJavaProject) source).getProject();
		} else if (source instanceof IProject) {
			this.project = (IProject) source;
		}
		getStatistics().begin();
		super.discoverElement(source, parameters);
		getStatistics().end();
	}

	public IProject getProject() {
		return this.project;
	}

	@Override
	public void saveAllResource(final IProgressMonitor monitor) throws IOException {
		getStatistics().beginSave();
		super.saveAllResource(monitor);
		getStatistics().endSave();
	}

	// //////////////////////// TRACING /////////////////////////

	private IProject statProject;
	private Statistics statistics;

	public void setStatProject(final IProject statProject) {
		this.statProject = statProject;
	}

	protected IProject getStatProject() {
		if (this.statProject == null) {
			File projectFile = Statistics.getDefaultStatProject(getProject()).getLocation()
					.toFile();
			this.statProject = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(projectFile.getName());
		}
		return this.statProject;
	}

	protected Statistics getStatistics() {
		if (this.statistics == null) {
			File statProjectFile = getStatProject().getLocation().toFile();
			this.statistics = Statistics.getStatistics(
					getProject().getName() + "_" + System.currentTimeMillis(), statProjectFile); //$NON-NLS-1$
			getStatistics().getProperties().put(
					DiscoverJavaModelFromJavaProjectEMFStat.JAVA_PROJECT_NAME,
					getProject().getName());
			getStatistics().getProperties().put(
					DiscoverJavaModelFromJavaProjectEMFStat.DISCOVERER_CLASS_NAME,
					this.getClass().getName());
			getStatistics().getProperties().put(
					DiscoverJavaModelFromJavaProjectEMFStat.DISCOVERY_DATE, new Date().toString());
			getStatistics().getProperties().put(
					DiscoverJavaModelFromJavaProjectEMFStat.XMX,
					Runtime.getRuntime().maxMemory()
							/ DiscoverJavaModelFromJavaProjectEMFStat.MEGA_BYTES
							/ DiscoverJavaModelFromJavaProjectEMFStat.MEGA_BYTES + "MB"); //$NON-NLS-1$		

			getStatistics().getProperties().put(DiscoverJavaModelFromJavaProjectEMFStat.MM_VARIANT,
					"Java Composite"); //$NON-NLS-1$
		}
		return this.statistics;
	}

	private boolean generateReport = true;

	public void setGenerateReport(final boolean generateReport) {
		this.generateReport = generateReport;
	}

	protected boolean getGenerateReport() {
		return this.generateReport;
	}

}
