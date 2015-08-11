/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Guyomar (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.java.composition.discoverer.tests.compatibility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import junit.framework.Assert;

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
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.modisco.java.discoverer.tests.Activator;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.modisco.java.composition.discoverer.DiscoverKDMSourceAndJavaModel;
import org.eclipse.modisco.java.composition.discoverer.tests.JUnitPlugin;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.Bundle;

/**
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474718
 */
@Deprecated
public class TestMemoryUsage {

	private static final String PROJECT_NAME = JUnitPlugin.PLUGIN_ID
			+ "_test001"; //$NON-NLS-1$

	private static Resource resource = null;
	private static JavaApplication model;

	private static final long AWAITED_MEM_MAXIMAL = 100;

	private long memoryUsed;
	private IProject project = null;

	private final int int1024 = 1024;

	@Before
	public void initResource() throws CoreException, IOException,
			InterruptedException {

		final long totalMemory = Runtime.getRuntime().totalMemory();

		this.project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(TestMemoryUsage.PROJECT_NAME);

		if (this.project.exists()) {
			this.project.delete(true, true, new NullProgressMonitor());
		}
		this.project.create(new NullProgressMonitor());
		this.project.open(new NullProgressMonitor());
		deepCopy("/workspace/test001/", this.project, "/"); //$NON-NLS-1$ //$NON-NLS-2$
		IJavaProject javaProject = JavaCore.create(this.project);
		addSystemLibraries(javaProject);
		this.project.refreshLocal(IResource.DEPTH_INFINITE,
				new NullProgressMonitor());
		Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, null);
		Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD, null);
		Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_REFRESH, null);
		Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, null);
		getResource(javaProject);
		EList<EObject> i = TestMemoryUsage.getResource().getContents();
		for (Iterator<EObject> iterator = i.iterator(); iterator.hasNext()
				&& TestMemoryUsage.model == null;) {
			EObject eobject = iterator.next();
			if (eobject instanceof JavaApplication) {
				TestMemoryUsage.model = (JavaApplication) eobject;
			}
		}

		this.memoryUsed = (Runtime.getRuntime().totalMemory() - totalMemory)
				/ this.int1024 / this.int1024;
	}

	@After
	public void finaly() throws CoreException {
		if (this.project.exists()) {
			this.project.delete(true, true, new NullProgressMonitor());
		}
	}

	@Test
	public void test002() {
		Assert.assertTrue(
				"Abnormal memory use for Java Composition Discoverer " + "\n " + this.memoryUsed //$NON-NLS-1$ //$NON-NLS-2$
						+ " > " + TestMemoryUsage.AWAITED_MEM_MAXIMAL, //$NON-NLS-1$
				this.memoryUsed < TestMemoryUsage.AWAITED_MEM_MAXIMAL);
	}

	protected static void getResource(final IJavaProject javaProject) {
		DiscoverKDMSourceAndJavaModel discoverer = new DiscoverKDMSourceAndJavaModel() {
			@Override
			protected Map<DiscoveryParameter, Object> getJavaParameters(
					final Map<DiscoveryParameter, Object> parameters) {

				Map<DiscoveryParameter, Object> parameterForJavaDiscovery = new HashMap<DiscoveryParameter, Object>();
				parameterForJavaDiscovery.put(
						DefaultDiscoverer.PARAMETER_SILENT_MODE, Boolean.TRUE);
				parameterForJavaDiscovery.put(
						DefaultDiscoverer.PARAMETER_BROWSE_RESULT,
						Boolean.FALSE);
				parameterForJavaDiscovery.put(
						DefaultDiscoverer.PARAMETER_TARGET_RESOURCE, null);

				return parameterForJavaDiscovery;

			}
		};

		Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
		parameters.put(DefaultDiscoverer.PARAMETER_SILENT_MODE, Boolean.TRUE);
		discoverer.discoverElement(javaProject, parameters);

		TestMemoryUsage.resource = (Resource) parameters
				.get(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
	}

	private void deepCopy(final String path, final IProject projectTarget,
			final String destinationPath) throws CoreException, IOException {
		Bundle bundle = Activator.getDefault().getBundle();
		Enumeration<?> e = Activator.getDefault().getBundle()
				.getEntryPaths(path);
		if (e == null) {
			try {
				// destinationPath);
				InputStream source = bundle.getEntry(path).openStream();
				IFile javaFile = projectTarget.getFile(destinationPath);
				if (javaFile.exists()) {
					javaFile.delete(true, new NullProgressMonitor());
				}
				javaFile.create(source, true, new NullProgressMonitor());
				// + destinationPath);
			} catch (Exception e1) {
				MoDiscoLogger.logError(e1, JUnitPlugin.getDefault());
			}
		} else {
			String subDestinationPath = "/"; //$NON-NLS-1$
			if (!destinationPath.equals("/")) { //$NON-NLS-1$
				IFolder folder = projectTarget.getFolder(destinationPath);
				if (!folder.exists()) {
					try {
						folder.create(true, true, new NullProgressMonitor());
					} catch (Exception e1) {
						MoDiscoLogger.logError(e1, JUnitPlugin.getDefault());
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
						deepCopy(subpath, projectTarget, dest);
					}
				} else {
					throw new RuntimeException("Unexpected element type"); //$NON-NLS-1$
				}
			}
		}
	}

	private static final void addSystemLibraries(final IJavaProject javaProject)
			throws JavaModelException {
		IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaRuntime
				.getDefaultJREContainerEntry();
		javaProject.setRawClasspath(newEntries, null);
	}

	public static Resource getResource() {
		return TestMemoryUsage.resource;
	}
}
