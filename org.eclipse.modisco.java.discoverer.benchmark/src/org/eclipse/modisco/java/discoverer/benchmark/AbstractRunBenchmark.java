/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *     Stephane Rousseau (Mia-Software) - Bug 339695 - H2 support in MoDisco Java discoverer benchmarks
 */
package org.eclipse.modisco.java.discoverer.benchmark;

import java.io.IOException;
import java.text.SimpleDateFormat;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.common.cdo.derby.DerbyCDOServer;
import org.eclipse.modisco.infra.common.cdo.server.Server;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.benchmark.Benchmark;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.benchmark.cdo.client.BenchmarkJavaDiscovererCDO;
import org.eclipse.modisco.java.discoverer.benchmark.cdo.client.nousage.JavaDiscovererCDONoUsages;
import org.eclipse.modisco.java.discoverer.benchmark.cdo.server.DerbyCDOServerNoAudits;
import org.eclipse.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererClassicalEMF;
import org.eclipse.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererEMFMinimalEObject;
import org.eclipse.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererEMFNoUsages;
import org.eclipse.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererIncrementalEMF;
import org.eclipse.modisco.java.discoverer.benchmark.emfstat.DiscoverJavaModelFromJavaProjectEMFStat;
import org.eclipse.modisco.java.discoverer.benchmark.emfstat.Statistics;

public abstract class AbstractRunBenchmark implements IDiscoverer<IJavaProject> {

	private static final int SERVER_WAITING_INTERVAL = 100;

	private static final int INITIAL_PORT = 2036;

	private int port = AbstractRunBenchmark.INITIAL_PORT;
	protected static final String LAUNCHTYPE = "org.eclipse.pde.ui.RuntimeWorkbench"; //$NON-NLS-1$
	private IProject statProject;

	public Benchmark createReport(final IJavaProject source, final IProgressMonitor monitor) throws CoreException, IOException {
		initStatProject(source);

		// CDO+Derby, No audits, With usages
		serverAndDisco(source, DerbyCDOServerNoAudits.class, BenchmarkJavaDiscovererCDO.class, monitor);
		// CDO+Derby, No audits, Without usages
		serverAndDisco(source, DerbyCDOServerNoAudits.class, JavaDiscovererCDONoUsages.class, monitor);
		// CDO+Derby, with audits, With usages
		serverAndDisco(source, DerbyCDOServer.class, BenchmarkJavaDiscovererCDO.class, monitor);
		// XMI, incremental
		disco(source, JavaDiscovererIncrementalEMF.class, monitor);
		// XMI, Without usages
		disco(source, JavaDiscovererEMFNoUsages.class, monitor);
		// XMI, MinimalEObject
		disco(source, JavaDiscovererEMFMinimalEObject.class, monitor);
		// Reference discoverer
		disco(source, JavaDiscovererClassicalEMF.class, monitor);
		// // CDO+MySQL, No audits, With usages
		// serverAndDisco(source, MySQLCDOServer.class,
		// BenchmarkJavaDiscovererCDO.class);
		Statistics.copyLog(this.statProject.getLocation().toFile());
		Report aReport = new Report(this.statProject);
		Benchmark benchmarkModel = aReport.generate();
		return benchmarkModel;
	}

	public IProject getStatProject() {
		return this.statProject;
	}

	public int getPort() {
		return this.port;
	}

	@Override
	public boolean isApplicableTo(final IJavaProject source) {
		return source.getProject().isAccessible();
	}

	@Override
	public void discoverElement(final IJavaProject source, final IProgressMonitor monitor)
			throws DiscoveryException {
		try {
			createReport(source, monitor);
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	protected void disco(final IJavaProject source,
			final Class<? extends DiscoverJavaModelFromJavaProjectEMFStat> discovererClass, final IProgressMonitor monitor) {
		DiscoverJavaModelFromJavaProjectEMFStat discoverer;
		try {
			discoverer = discovererClass.newInstance();
			discoverer.setStatProject(this.statProject);
			discoverer.discoverElement(source, monitor);
		} catch (Exception e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		}

	}

	protected void serverAndDisco(final IJavaProject source, final Class<? extends Server> serverClass,
			final Class<? extends BenchmarkJavaDiscovererCDO> discovererClass, final IProgressMonitor monitor) {
		try {
			IStatus status = new Status(IStatus.INFO, Activator.PLUGIN_ID,
					"Starting server: " + serverClass.getSimpleName()); //$NON-NLS-1$
			Activator.getDefault().getLog().log(status);
			this.port++;
			Server server = serverClass.newInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS"); //$NON-NLS-1$
			server.start("db" + formatter.format(System.currentTimeMillis()), this.port); //$NON-NLS-1$
			// ILaunch iLaunch = launch(serverClass.getSimpleName(), port);
			// Thread.sleep(AbstractCDOServer.SLEEP_TIME_AFTER_LAUNCHE);
			synchronized (server) {
				long before = System.currentTimeMillis();
				while (!server.isStarted()) {
					server.wait(AbstractRunBenchmark.SERVER_WAITING_INTERVAL);
				}
				System.out
						.println("server took " + (System.currentTimeMillis() - before) + " ms to start"); //$NON-NLS-1$ //$NON-NLS-2$
			}
			IStatus status2 = new Status(IStatus.INFO, Activator.PLUGIN_ID, "Starting discovery"); //$NON-NLS-1$
			Activator.getDefault().getLog().log(status2);
			BenchmarkJavaDiscovererCDO discoverer = discovererClass.newInstance();
			discoverer.setStatProject(this.statProject);
			discoverer.setPort(this.port);
			discoverer.setServerDescription(server.getDescription());
			discoverer.discoverElement(source, monitor);
			IStatus status3 = new Status(IStatus.INFO, Activator.PLUGIN_ID, "Stopping server"); //$NON-NLS-1$
			Activator.getDefault().getLog().log(status3);
			// iLaunch.terminate();
			server.stop();
		} catch (Exception e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
		}
	}



	protected void initStatProject(final IJavaProject sourceProject) {
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS"); //$NON-NLS-1$
		this.statProject = ws.getRoot().getProject(
				"statistics_" + formatter.format(System.currentTimeMillis())); //$NON-NLS-1$
		try {
			this.statProject.create(new NullProgressMonitor());
			this.statProject.open(new NullProgressMonitor());
		} catch (CoreException e) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
			this.statProject = null;
		}
	}

	public ILaunch launch(final String application) throws Exception {
		String name = ""; //$NON-NLS-1$
		ILaunchConfigurationType type = DebugPlugin.getDefault().getLaunchManager()
				.getLaunchConfigurationType(AbstractRunBenchmark.LAUNCHTYPE);
		ILaunchConfiguration launchConfiguration = null;
		launchConfiguration = type.newInstance(null, name);
		launchConfiguration = launchConfiguration.getWorkingCopy().getParent().doSave();
		ILaunchConfigurationWorkingCopy copy = launchConfiguration.getWorkingCopy();
		initAttribute(copy, Activator.PLUGIN_ID + "." + application); //$NON-NLS-1$
		launchConfiguration = copy.doSave();
		ILaunch iLaunch = launchConfiguration.launch(ILaunchManager.RUN_MODE,
				new NullProgressMonitor());
		return iLaunch;
	}

	protected void initAttribute(final ILaunchConfigurationWorkingCopy copy,
			final String application) {
		copy.setAttribute("append.args", true); //$NON-NLS-1$
		copy.setAttribute("application", application); //$NON-NLS-1$
		copy.setAttribute("askclear", true); //$NON-NLS-1$
		copy.setAttribute("automaticAdd", true); //$NON-NLS-1$
		copy.setAttribute("automaticValidate", false); //$NON-NLS-1$
		copy.setAttribute("bootstrap", ""); //$NON-NLS-1$ //$NON-NLS-2$
		copy.setAttribute("checked", "[NONE]"); //$NON-NLS-1$ //$NON-NLS-2$
		copy.setAttribute("clearConfig", false); //$NON-NLS-1$
		copy.setAttribute("clearws", false); //$NON-NLS-1$
		copy.setAttribute("clearwslog", false); //$NON-NLS-1$
		copy.setAttribute("configLocation", //$NON-NLS-1$
				"${workspace_loc}/.metadata/.plugins/org.eclipse.pde.core/New_configuration"); //$NON-NLS-1$

		copy.setAttribute("includeOptional", true); //$NON-NLS-1$
		copy.setAttribute("location", //$NON-NLS-1$
				"${workspace_loc}/../runtime-New_configuration"); //$NON-NLS-1$
		copy.setAttribute("org.eclipse.jdt.launching.PROGRAM_ARGUMENTS", //$NON-NLS-1$
				"-os ${target.os} -ws ${target.ws} -arch ${target.arch} -nl ${target.nl} -consoleLog -port " //$NON-NLS-1$
						+ this.port);
		copy.setAttribute("org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER", //$NON-NLS-1$
				"org.eclipse.pde.ui.workbenchClasspathProvider"); //$NON-NLS-1$
		copy.setAttribute("org.eclipse.jdt.launching.VM_ARGUMENTS", //$NON-NLS-1$
				"-Xms40m -Xmx512m"); //$NON-NLS-1$
		copy.setAttribute("pde.version", "3.3"); //$NON-NLS-1$ //$NON-NLS-2$
		copy.setAttribute("product", "org.eclipse.platform.ide"); //$NON-NLS-1$ //$NON-NLS-2$
		copy.setAttribute("show_selected_only", false); //$NON-NLS-1$
		copy.setAttribute("templateConfig", //$NON-NLS-1$
				"${target_home}\\configuration\\config.ini"); //$NON-NLS-1$
		copy.setAttribute("tracing", false); //$NON-NLS-1$
		copy.setAttribute("useDefaultConfig", true); //$NON-NLS-1$
		copy.setAttribute("useDefaultConfigArea", true); //$NON-NLS-1$
		copy.setAttribute("useProduct", false); //$NON-NLS-1$
		copy.setAttribute("usefeatures", false); //$NON-NLS-1$
		copy.setAttribute("default", true); // true if getting ws plugins //$NON-NLS-1$
	}
}
