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
import java.io.IOException;
import java.util.Date;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.modisco.java.discoverer.benchmark.emfstat.DiscoverJavaModelFromJavaProjectEMFStat;
import org.eclipse.modisco.java.discoverer.benchmark.emfstat.Statistics;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.composition.discoverer.DiscoverKDMSourceAndJavaModelFromJavaProject;

/**
 * This class extends the DiscoverKDMSourceAndJavaModelFromJavaProject to instrument it with
 * benchmark capabilities. Memory used during the discovery and saving steps are reported in an html
 * file
 */
public class DiscoverJavaApplicationModel2 extends DiscoverKDMSourceAndJavaModelFromJavaProject {

	private IProject project;

	@Override
	protected void basicDiscoverElement(final IJavaProject source, final IProgressMonitor monitor)
			throws DiscoveryException {
		this.project = source.getProject();
		getStatistics().begin();
		super.basicDiscoverElement(source, monitor);
		getStatistics().end();
	}

	public IProject getProject() {
		return this.project;
	}

	@Override
	protected void saveAllResources(final IProgressMonitor monitor) throws IOException {
		getStatistics().beginSave();
		super.saveAllResources(monitor);
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
