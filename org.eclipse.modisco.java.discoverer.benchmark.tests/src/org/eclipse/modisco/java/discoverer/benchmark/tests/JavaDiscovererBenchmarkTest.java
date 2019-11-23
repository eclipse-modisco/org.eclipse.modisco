/*******************************************************************************
 * Copyright (c) 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *    Gregoire Dupe (Mia-Software) - Bug 346087 - Regression of the report of the Java discoverer benchmark
 *    Gregoire Dupe (Mia-Software) - Bug 511745 - [Unit Test Failure] org.eclipse.modisco.java.discoverer.benchmark.tests.JavaDiscovererBenchmarkTest.test001
 *******************************************************************************/
package org.eclipse.modisco.java.discoverer.benchmark.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.acceleo.engine.AcceleoEnginePlugin;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILogListener;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.infra.common.core.internal.utils.FileUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.modisco.java.discoverer.benchmark.Report;
import org.eclipse.modisco.java.discoverer.benchmark.RunBenchmark;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class JavaDiscovererBenchmarkTest {
	private static final String PROJECT_NAME = "benchmark_discovery"; //$NON-NLS-1$
	private ILogListener listener;
	protected List<IStatus> loggedErrorWarningStatus = new ArrayList<IStatus>();

	@Before
	public void before() {
		this.listener = new ILogListener() {

			public void logging(final IStatus status, final String plugin) {
				if (status.getSeverity() != IStatus.OK && status.getSeverity() != IStatus.INFO) {
					JavaDiscovererBenchmarkTest.this.loggedErrorWarningStatus.add(status);
				}

			}
		};
		AcceleoEnginePlugin.getDefault().getLog().addLogListener(this.listener);
	}

	@Ignore // FIXME Bug 552989
	@Test(timeout = 25 * 60 * 1000)
	public void test001() throws CoreException, IOException {
		if (Boolean.parseBoolean(System.getenv().get("skip.long.junit.tests"))) {
			throw new RuntimeException("skipped");
		}

		IWorkspace ws = ResourcesPlugin.getWorkspace();
		IProject iProject = ws.getRoot().getProject(
				JavaDiscovererBenchmarkTest.PROJECT_NAME);
		ProjectUtils.create(iProject, new NullProgressMonitor());
		String filePath = "src/" + this.getClass().getName().replace('.', '/') + ".java"; //$NON-NLS-1$ //$NON-NLS-2$
		FileUtils.copyFileFromBundle(filePath, iProject, filePath, Activator
				.getDefault().getBundle());
		RunBenchmark benchmark = new RunBenchmark();
		IJavaProject aJavaProject = JavaCore.create(iProject);
		benchmark.createReport(aJavaProject, new NullProgressMonitor());
		File reportFile = benchmark.getStatProject()
				.getFile(Report.HTMLREPORT_FILE_NAME).getLocation().toFile();

		Assert.assertTrue("Following output file has not been found : " //$NON-NLS-1$
				+ reportFile.toString(), reportFile.exists());
	}

	@After
	public void after() throws CoreException {
		org.eclipse.acceleo.engine.AcceleoEnginePlugin.getDefault().getLog().removeLogListener(this.listener);
		if (this.loggedErrorWarningStatus.size() > 0) {
			IStatus multiStatus = new MultiStatus(Activator.PLUGIN_ID,
					IStatus.ERROR,
					this.loggedErrorWarningStatus.toArray(new IStatus[] {}),
					"Some error or warning messages have been logged.",
					new Exception());
			throw new CoreException(multiStatus);
		}

	}
}
