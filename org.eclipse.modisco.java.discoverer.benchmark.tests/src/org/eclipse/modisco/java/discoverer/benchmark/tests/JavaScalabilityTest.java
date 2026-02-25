/*******************************************************************************
 * Copyright (c) 2010, 2026 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software)
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *    Fabien Giquel (Mia-Software) - 342856 - improve Discoverers implementation
 *******************************************************************************/
package org.eclipse.modisco.java.discoverer.benchmark.tests;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.common.core.files.ProjectUtils;
import org.eclipse.modisco.common.tests.TestFileUtils;
import org.eclipse.modisco.common.tests.TestProjectUtils;
import org.eclipse.modisco.infra.discovery.benchmark.Discovery;
import org.eclipse.modisco.infra.discovery.benchmark.MultiProjectBenchmark;
import org.eclipse.modisco.java.discoverer.benchmark.RunBenchmark;
import org.eclipse.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererEMFMinimalEObject;
import org.eclipse.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererIncrementalEMF;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JavaScalabilityTest {

	private static final int EXPECTED_MEM_INCR_MAXIMUM = 70;
	private static final int EXPECTED_MEM_MAXIMUM = 100;
	private static final String PROJECT_NAME = "benchmark_testScalability"; //$NON-NLS-1$
	private IProject sourceCodeProject = null;

	@Before
	public void initResource() throws Exception {

		if (Boolean.parseBoolean(System.getenv().get("skip.long.junit.tests"))) {
		    throw new RuntimeException("skipped");
		}

		if (this.sourceCodeProject == null) {

			IProject newSourceProject = ResourcesPlugin.getWorkspace()
					.getRoot().getProject(JavaScalabilityTest.PROJECT_NAME);
			if (newSourceProject.exists()) {
				newSourceProject.delete(true, true, new NullProgressMonitor());
			}
			newSourceProject.create(new NullProgressMonitor());
			newSourceProject.open(new NullProgressMonitor());
			TestFileUtils.deepCopy(Activator.getDefault().getBundle(), "/workspace/scalabilityTest/", newSourceProject, "/"); //$NON-NLS-1$ //$NON-NLS-2$
			IJavaProject javaProject = JavaCore.create(newSourceProject);
			TestProjectUtils.addSystemLibraries(javaProject, null);
			ProjectUtils.refresh(newSourceProject);
			this.sourceCodeProject = newSourceProject;
		}
	}

	/**
	 * A basic memory usage test, for standard and incremental Java discoverer
	 *
	 * @throws CoreException
	 * @throws IOException
	 */
//	@Ignore
	@Test(timeout=30*60*1000)
	public void testMemoryUsed() throws CoreException, IOException {

		if (Boolean.parseBoolean(System.getenv().get("skip.long.junit.tests"))) {
		    throw new RuntimeException("skipped");
		}

		Assert.assertTrue(JavaScalabilityTest.PROJECT_NAME
				+ " project has not been initialized for benchmark.", //$NON-NLS-1$
				this.sourceCodeProject.exists());

		MultiProjectBenchmark benchmarkModel = new RunBenchmark().createReport(JavaCore
				.create(this.sourceCodeProject), new NullProgressMonitor());

		for (Discovery aConfig : benchmarkModel.getProjects().get(0).getDiscoveries()) {
			if (aConfig.getDiscovererClassName().equals(
					JavaDiscovererIncrementalEMF.class.getName())) {
				long memoryUsed = aConfig.getMaxUsedMemoryInBytes();
			/*	Assert.assertTrue(
						"Abnormal memory use for " //$NON-NLS-1$
								+ aConfig.getDiscovererClassName()
								+ "\n " + memoryUsed //$NON-NLS-1$
								+ " > " + JavaScalabilityTest.EXPECTED_MEM_INCR_MAXIMUM, //$NON-NLS-1$
						memoryUsed < JavaScalabilityTest.EXPECTED_MEM_INCR_MAXIMUM); */
				System.err.println(
						"Issue 1108: Unchecked memory use for " //$NON-NLS-1$
								+ aConfig.getDiscovererClassName()
								+ "\n " + memoryUsed //$NON-NLS-1$
								+ " > " + JavaScalabilityTest.EXPECTED_MEM_INCR_MAXIMUM);
			}

			if (aConfig.getDiscovererClassName().equals(
					JavaDiscovererEMFMinimalEObject.class.getName())) {
				long memoryUsed = aConfig.getMaxUsedMemoryInBytes();
			/*	Assert.assertTrue("Abnormal memory use for " //$NON-NLS-1$
						+ aConfig.getDiscovererClassName() + "\n " + memoryUsed //$NON-NLS-1$
						+ " > " + JavaScalabilityTest.EXPECTED_MEM_MAXIMUM, //$NON-NLS-1$
						memoryUsed < JavaScalabilityTest.EXPECTED_MEM_MAXIMUM); */
				System.err.println("Issue 1108: Unchecked memory use for " //$NON-NLS-1$
						+ aConfig.getDiscovererClassName() + "\n " + memoryUsed //$NON-NLS-1$
						+ " > " + JavaScalabilityTest.EXPECTED_MEM_MAXIMUM);
			}
		}

	}
}
