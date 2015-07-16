/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software)
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.gmt.modisco.java.discoverer.benchmark.tests;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.RunBenchmark;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererEMFMinimalEObject;
import org.eclipse.gmt.modisco.java.discoverer.benchmark.emf.client.JavaDiscovererIncrementalEMF;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.modisco.infra.discovery.benchmark.Discovery;
import org.eclipse.modisco.infra.discovery.benchmark.MultiProjectBenchmark;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.Bundle;

/**
 * @deprecated Will be removed,
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public class JavaScalabilityTest {

	private static final int EXPECTED_MEM_INCR_MAXIMUM = 70;
	private static final int EXPECTED_MEM_MAXIMUM = 100;
	private static final String PROJECT_NAME = "benchmark_testScalability"; //$NON-NLS-1$
	private IProject sourceCodeProject = null;

	@Before
	public void initResource() throws CoreException, IOException,
			InterruptedException {
		
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
			deepCopy("/workspace/scalabilityTest/", newSourceProject, "/"); //$NON-NLS-1$ //$NON-NLS-2$
			IJavaProject javaProject = JavaCore.create(newSourceProject);
			addSystemLibraries(javaProject);
			newSourceProject.refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());
			Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, null);
			Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD, null);
			Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_REFRESH,
					null);
			Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, null);

			this.sourceCodeProject = newSourceProject;

		}
	}

	/**
	 * A basic memory usage test, for standard and incremental Java discoverer
	 * 
	 * @throws CoreException
	 * @throws IOException
	 */
	@Test(timeout=30*60*1000)
	public void testMemoryUsed() throws CoreException, IOException {
		
		if (Boolean.parseBoolean(System.getenv().get("skip.long.junit.tests"))) { 
		    throw new RuntimeException("skipped"); 
		}
		
		Assert.assertTrue(JavaScalabilityTest.PROJECT_NAME
				+ " project has not been initialized for benchmark.", //$NON-NLS-1$
				this.sourceCodeProject.exists());

		MultiProjectBenchmark benchmarkModel = new RunBenchmark().createReport(JavaCore
				.create(this.sourceCodeProject));

		for (Discovery aConfig : benchmarkModel.getProjects().get(0).getDiscoveries()) {
			if (aConfig.getDiscovererClassName().equals(
					JavaDiscovererIncrementalEMF.class.getName())) {
				long memoryUsed = aConfig.getMaxUsedMemoryInBytes();
				Assert.assertTrue(
						"Abnormal memory use for " //$NON-NLS-1$
								+ aConfig.getDiscovererClassName()
								+ "\n " + memoryUsed //$NON-NLS-1$
								+ " > " + JavaScalabilityTest.EXPECTED_MEM_INCR_MAXIMUM, //$NON-NLS-1$
						memoryUsed < JavaScalabilityTest.EXPECTED_MEM_INCR_MAXIMUM);
			}

			if (aConfig.getDiscovererClassName().equals(
					JavaDiscovererEMFMinimalEObject.class.getName())) {
				long memoryUsed = aConfig.getMaxUsedMemoryInBytes();
				Assert.assertTrue("Abnormal memory use for " //$NON-NLS-1$
						+ aConfig.getDiscovererClassName() + "\n " + memoryUsed //$NON-NLS-1$
						+ " > " + JavaScalabilityTest.EXPECTED_MEM_MAXIMUM, //$NON-NLS-1$
						memoryUsed < JavaScalabilityTest.EXPECTED_MEM_MAXIMUM);
			}
		}

	}

	private final void addSystemLibraries(final IJavaProject javaProject)
			throws JavaModelException {
		IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaRuntime
				.getDefaultJREContainerEntry();
		javaProject.setRawClasspath(newEntries, null);
	}

	/**
	 * @param path
	 * @param project
	 * @param destinationPath
	 * @throws CoreException
	 * @throws IOException
	 */
	private void deepCopy(final String path, final IProject project,
			final String destinationPath) throws CoreException, IOException {
		Bundle bundle = Activator.getDefault().getBundle();
		Enumeration<?> e = bundle.getEntryPaths(path);
		if (e == null) {
			try {
				InputStream source = bundle.getEntry(path).openStream();
				IFile javaFile = project.getFile(destinationPath);
				if (javaFile.exists()) {
					javaFile.delete(true, new NullProgressMonitor());
				}
				javaFile.create(source, true, new NullProgressMonitor());
				// System.out.println("Success: " + path + " -> "
				// + destinationPath);
			} catch (Exception e1) {
				Status status2 = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
						e1.getMessage(), e1);
				Activator.getDefault().getLog().log(status2);
			}
		} else {
			String subDestinationPath = "/"; //$NON-NLS-1$
			if (!destinationPath.equals("/")) { //$NON-NLS-1$
				IFolder folder = project.getFolder(destinationPath);
				if (!folder.exists()) {
					try {
						folder.create(true, true, new NullProgressMonitor());
					} catch (Exception e1) {
						Status status2 = new Status(IStatus.ERROR,
								Activator.PLUGIN_ID, e1.getMessage(), e1);
						Activator.getDefault().getLog().log(status2);
					}
				}
				subDestinationPath = folder.getProjectRelativePath().toString();
			}
			while (e.hasMoreElements()) {
				Object object = e.nextElement();
				if (object instanceof String) {
					String subpath = (String) object;
					if (!subpath.matches(".*/\\.svn/")) { //$NON-NLS-1$
						String dest = subDestinationPath
								+ subpath.substring(path.length() - 1);
						deepCopy(subpath, project, dest);
					}
				} else {
					throw new RuntimeException("Unexpected element type"); //$NON-NLS-1$
				}
			}
		}

	}

}
