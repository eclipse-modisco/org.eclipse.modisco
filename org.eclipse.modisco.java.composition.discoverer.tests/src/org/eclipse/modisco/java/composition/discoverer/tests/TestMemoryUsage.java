/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *    Grégoire Dupé (Mia-Software) - Bug 479339 - [Unit Test Failure] org.eclipse.modisco.java.composition.discoverer.tests.TestMemoryUsage.test002
 *******************************************************************************/
package org.eclipse.modisco.java.composition.discoverer.tests;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.composition.discoverer.DiscoverKDMSourceAndJavaModelFromJavaProject;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.eclipse.modisco.java.discoverer.tests.Activator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.Bundle;

import org.junit.Assert;

public class TestMemoryUsage {

	private static final long MAX_MEM_AWAITED = 540;	// See Bug 553390
	private static final int KILO = 1024;
	private static final String PROJECT_NAME = JUnitPlugin.PLUGIN_ID
			+ "_test001"; //$NON-NLS-1$

	private static Resource resource = null;
	private static JavaApplication model;

	private long memoryUsed;
	private IProject project = null;

	@Before
	public void initResource() throws CoreException, IOException,
			InterruptedException, DiscoveryException {
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		long oldTotalMemory = runtime.totalMemory();
		this.project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(TestMemoryUsage.PROJECT_NAME);
		if (this.project.exists()) {
			this.project.delete(true, true, new NullProgressMonitor());
		}
		this.project.create(new NullProgressMonitor());
		this.project.open(new NullProgressMonitor());
		deepCopy("/workspace/test001/", this.project, "/"); //$NON-NLS-1$ //$NON-NLS-2$
		final IJavaProject javaProject = JavaCore.create(this.project);
		addSystemLibraries(javaProject);
		this.project.refreshLocal(IResource.DEPTH_INFINITE,
				new NullProgressMonitor());
		Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, null);
		Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD, null);
		Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_REFRESH, null);
		Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, null);
		discoverResource(javaProject);
		final EList<EObject> roots = TestMemoryUsage.getResource().getContents();
		for (final Iterator<EObject> iterator = roots.iterator(); iterator.hasNext()
				&& TestMemoryUsage.model == null;) {
			final EObject eobject = iterator.next();
			if (eobject instanceof JavaApplication) {
				TestMemoryUsage.model = (JavaApplication) eobject;
			}
		}
		runtime.gc();
		long newTotalMemory = runtime.totalMemory();
		final long deltaMem = newTotalMemory - oldTotalMemory;
		this.memoryUsed = deltaMem / KILO / KILO;
		System.out.println("Memory used: " + deltaMem + " = " + newTotalMemory + " - " + oldTotalMemory);
	}

	@After
	public void finaly() throws CoreException {
		if (this.project.exists()) {
			this.project.delete(true, true, new NullProgressMonitor());
		}
	}

	@Test
	public void test002() {
		final String message = String.format(
				"Abnormal memory use for Java Composition Discoverer: %s > %s", //$NON-NLS-1$
				Long.toString(this.memoryUsed),
				Long.toString(TestMemoryUsage.MAX_MEM_AWAITED));
		Assert.assertTrue(
				message,
				this.memoryUsed < TestMemoryUsage.MAX_MEM_AWAITED);
	}

	private static void discoverResource(final IJavaProject javaProject)
			throws DiscoveryException {
		final DiscoverKDMSourceAndJavaModelFromJavaProject discoverer =
				new DiscoverKDMSourceAndJavaModelFromJavaProject();
		discoverer.discoverElement(javaProject, new NullProgressMonitor());
		TestMemoryUsage.resource = discoverer.getTargetModel();
	}

	private void deepCopy(final String path, final IProject projectTarget,
			final String destPath) throws CoreException, IOException {
		final Bundle bundle = Activator.getDefault().getBundle();
		final Enumeration<?> entityPath = Activator.getDefault().getBundle()
				.getEntryPaths(path);
		if (entityPath == null) {
			try {
				// destinationPath);
				InputStream source = bundle.getEntry(path).openStream();
				final IFile javaFile = projectTarget.getFile(destPath);
				if (javaFile.exists()) {
					javaFile.delete(true, new NullProgressMonitor());
				}
				javaFile.create(source, true, new NullProgressMonitor());
				// + destinationPath);
			} catch (Exception e1) {
				Logger.logError(e1, JUnitPlugin.getDefault());
			}
		} else {
			String subDestPath = "/"; //$NON-NLS-1$
			if (!"/".equals(destPath)) { //$NON-NLS-1$
				final IFolder folder = projectTarget.getFolder(destPath);
				if (!folder.exists()) {
					try {
						folder.create(true, true, new NullProgressMonitor());
					} catch (Exception e1) {
						Logger.logError(e1, JUnitPlugin.getDefault());
					}
				}
				subDestPath = folder.getProjectRelativePath().toString();
			}
			while (entityPath.hasMoreElements()) {
				final Object object = entityPath.nextElement();
				if (object instanceof String) {
					final String subpath = (String) object;
					if (!subpath.matches(".*/\\.svn/")) { //$NON-NLS-1$
						final String dest = subDestPath
								+ subpath.substring(path.length() - 1);
						deepCopy(subpath, projectTarget, dest);
					}
				} else {
					throw new RuntimeException("Unexpected element type"); //$NON-NLS-1$
				}
			}
		}
	}

	private static void addSystemLibraries(final IJavaProject javaProject)
			throws JavaModelException {
		final IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
		final IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaRuntime
				.getDefaultJREContainerEntry();
		javaProject.setRawClasspath(newEntries, null);
	}

	public static Resource getResource() {
		return TestMemoryUsage.resource;
	}
}
