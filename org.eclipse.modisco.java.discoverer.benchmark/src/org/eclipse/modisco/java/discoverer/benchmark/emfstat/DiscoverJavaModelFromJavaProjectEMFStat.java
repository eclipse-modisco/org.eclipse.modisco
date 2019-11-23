/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Romain Dervaux (Mia-Software)
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *    Stephane Rousseau (Mia-Software) - Bug 339695 - H2 support in MoDisco Java discoverer benchmarks
 *******************************************************************************/

package org.eclipse.modisco.java.discoverer.benchmark.emfstat;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;

import com.ibm.icu.text.SimpleDateFormat;

public class DiscoverJavaModelFromJavaProjectEMFStat extends DiscoverJavaModelFromJavaProject {

	public static final int MEGA_BYTES = 1024 * 1024;
	public static final String STORAGE_KIND = "STORAGE_KIND"; //$NON-NLS-1$
	public static final String JAVA_PROJECT_NAME = "JAVA_PROJECT_NAME"; //$NON-NLS-1$
	public static final String DISCOVERER_CLASS_NAME = "DISCOVERER_CLASS_NAME"; //$NON-NLS-1$
	public static final String DISCOVERY_DATE = "DISCOVERY_DATE"; //$NON-NLS-1$
	public static final String XMX = "XMX"; //$NON-NLS-1$
	public static final String MM_VARIANT = "MM_VARIANT"; //$NON-NLS-1$
	public static final String ALGO_VARIANT = "ALGO_VARIANT"; //$NON-NLS-1$

	private Statistics statistics;
	private IJavaProject javaProject;
	private IProject statProject;

	@Override
	protected void basicDiscoverElement(final IJavaProject source, final IProgressMonitor monitor)
			throws DiscoveryException {
		this.javaProject = source;
		getStatistics().getProperties().put(
				DiscoverJavaModelFromJavaProjectEMFStat.JAVA_PROJECT_NAME,
				this.javaProject.getElementName());
		getStatistics().getProperties().put(
				DiscoverJavaModelFromJavaProjectEMFStat.DISCOVERER_CLASS_NAME,
				this.getClass().getName());
		getStatistics().getProperties().put(DiscoverJavaModelFromJavaProjectEMFStat.DISCOVERY_DATE,
				new Date().toString());
		getStatistics().getProperties().putAll(getProperties());
		getStatistics().begin();
		super.basicDiscoverElement(source, monitor);
		getStatistics().end();
	}

	@Override
	protected void saveTargetModel() throws IOException {
		getStatistics().beginSave();
		super.saveTargetModel();
		getStatistics().endSave();
	}

	@SuppressWarnings("static-method") // designed for override
	protected Properties getProperties() {
		Properties properties = new Properties();
		properties.put(DiscoverJavaModelFromJavaProjectEMFStat.STORAGE_KIND, "XMI"); //$NON-NLS-1$
		return properties;
	}

	@Override
	protected JavaReaderEMFStat getJavaReader(final java.util.Map<String, Object> elementOptions) {
		JavaReaderEMFStat javaReader = new JavaReaderEMFStat(getEFactory(), false);
		javaReader.setStatistics(getStatistics());
		return javaReader;
	}

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
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS"); //$NON-NLS-1$
			this.statistics = Statistics
					.getStatistics(
							getProject().getName() + "_" + formatter.format(System.currentTimeMillis()), statProjectFile); //$NON-NLS-1$
			this.statistics.getProperties().put(
					DiscoverJavaModelFromJavaProjectEMFStat.JAVA_PROJECT_NAME,
					getProject().getName());
			this.statistics.getProperties().put(
					DiscoverJavaModelFromJavaProjectEMFStat.DISCOVERER_CLASS_NAME,
					this.getClass().getName());
			this.statistics.getProperties().put(
					DiscoverJavaModelFromJavaProjectEMFStat.DISCOVERY_DATE, new Date().toString());
			this.statistics.getProperties().put(
					DiscoverJavaModelFromJavaProjectEMFStat.XMX,
					Runtime.getRuntime().maxMemory()
							/ DiscoverJavaModelFromJavaProjectEMFStat.MEGA_BYTES
							/ DiscoverJavaModelFromJavaProjectEMFStat.MEGA_BYTES + "MB"); //$NON-NLS-1$
		}
		return this.statistics;
	}

	public IProject getProject() {
		return this.javaProject.getProject();
	}
}
