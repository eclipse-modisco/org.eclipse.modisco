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
 *    E.D.Willink refactor to share code, instrument a bit better
 *******************************************************************************/
package org.eclipse.modisco.java.composition.discoverer.tests;

import java.io.InputStream;
import java.util.Enumeration;

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
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.composition.discoverer.DiscoverKDMSourceAndJavaModelFromJavaProject;
import org.eclipse.modisco.java.composition.javaapplication.Java2Directory;
import org.eclipse.modisco.java.composition.javaapplication.Java2File;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.eclipse.modisco.java.discoverer.tests.Activator;
import org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion;
import org.eclipse.modisco.omg.kdm.source.InventoryModel;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class JavaProjectTests
{
	private static final String PROJECT_NAME = JUnitPlugin.PLUGIN_ID + "_test001"; //$NON-NLS-1$	
	private static final double MEGA = 1000000;
	private static final long MAX_MEM_MB_AWAITED = 360;	// See Issue 1108

	private static final void addSystemLibraries(final IJavaProject javaProject) throws JavaModelException {
		IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaRuntime
				.getDefaultJREContainerEntry();
		javaProject.setRawClasspath(newEntries, null);
	}
	
	protected static void wait(int delayTimeInMilliseconds) {
		IWorkbench workbench = PlatformUI.getWorkbench();
		Display display = workbench.getDisplay();
		int sleepQuantum = 50;
		for (int i = 0; i < delayTimeInMilliseconds; i += sleepQuantum) {
			for (int j = 0; j < 10; j++) {
				while (display.readAndDispatch()) {
					// Nothing to do
				}
			}
			try {
				Thread.sleep(sleepQuantum);
			} catch (InterruptedException e) {
				// Ignore
			}
		}
	}

	protected long checkMemory(String context, long startTotalMemory) {
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		long totalMemory = runtime.totalMemory();
		long memUsed = totalMemory - startTotalMemory;
	/*	System.out.printf("%s1: %4.2f\n", context, Double.valueOf(memUsed / MEGA));
		wait(180);
		runtime.gc();
		wait(180);
		totalMemory = runtime.totalMemory();
		memUsed = totalMemory - startTotalMemory;
		System.out.printf("%s2: %4.2f\n", context, Double.valueOf(memUsed / MEGA)); */
		return memUsed;
	}

	protected IJavaProject createProject(String projectName) throws Exception {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (project.exists()) {
			project.delete(true, true, new NullProgressMonitor());
		}
		project.create(new NullProgressMonitor());
		project.open(new NullProgressMonitor());
		deepCopy("/workspace/test001/", project, "/"); //$NON-NLS-1$ //$NON-NLS-2$
		IJavaProject javaProject = JavaCore.create(project);
		addSystemLibraries(javaProject);
		project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, null);
		Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD, null);
		Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_REFRESH, null);
		Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, null);
		return javaProject;
	}

	protected void deepCopy(final String path, final IProject projectTarget, final String destinationPath) throws Exception {
		Bundle bundle = Activator.getDefault().getBundle();
		System.out.println("deepCopy " + bundle.getSymbolicName() + "[" + path + "] to " + projectTarget.getName() + "[" + destinationPath + "]");
		Enumeration<?> e = bundle.getEntryPaths(path);
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
				Logger.logError(e1, JUnitPlugin.getDefault());
			}
		} else {
			String subDestinationPath = "/"; //$NON-NLS-1$
			if (!destinationPath.equals("/")) { //$NON-NLS-1$
				IFolder folder = projectTarget.getFolder(destinationPath);
				if (!folder.exists()) {
					try {
						folder.create(true, true, new NullProgressMonitor());
					} catch (Exception e1) {
						Logger.logError(e1, JUnitPlugin.getDefault());
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

	protected void deleteProject(IJavaProject javaProject) throws CoreException {
		IProject project = javaProject.getProject();
		if (project.exists()) {
			project.delete(true, true, new NullProgressMonitor());
		}
	}

	protected Resource discoverResource(IJavaProject javaProject) throws DiscoveryException {
		DiscoverKDMSourceAndJavaModelFromJavaProject discoverer = new DiscoverKDMSourceAndJavaModelFromJavaProject();
		discoverer.discoverElement(javaProject, new NullProgressMonitor());
		Resource resource = discoverer.getTargetModel();
		return resource;
	}

	protected JavaApplication getModel(Resource resource) throws Exception {
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof JavaApplication) {
				return (JavaApplication) eObject;
			}
		}
		return null;
	}

	@Test
	public void testJavaApp() throws Exception {
		IJavaProject javaProject = createProject(JavaProjectTests.PROJECT_NAME);
		Resource resource = discoverResource(javaProject);
		JavaApplication model = getModel(resource);

		Assert.assertNotNull(model);
		Model javaModel = model.getJavaModel();
		Assert.assertNotNull(javaModel);
		Assert.assertTrue(javaModel.getName()
				.equalsIgnoreCase(
						"org.eclipse.modisco.java.composition.discoverer.tests_test001")); //$NON-NLS-1$

		InventoryModel deploymentModel = model.getDeploymentModel();
		Assert.assertNotNull(deploymentModel);
		Assert.assertTrue(deploymentModel.getName()
				.equalsIgnoreCase(
						"org.eclipse.modisco.java.composition.discoverer.tests_test001")); //$NON-NLS-1$

		EList<Java2Directory> java2DirectoryChildren = model.getJava2DirectoryChildren();
		Assert.assertNotNull(java2DirectoryChildren);
		Assert.assertTrue(java2DirectoryChildren.size() > 0);

		Java2Directory java2Directory = java2DirectoryChildren.get(0);
		Assert.assertNotNull(java2Directory);
		Assert.assertTrue(java2Directory.getDirectory().get(0).getName().equalsIgnoreCase("annotations")); //$NON-NLS-1$
		Assert.assertTrue(java2Directory.getJavaPackage().getName().equalsIgnoreCase("annotations")); //$NON-NLS-1$

		Java2File java2file = null;
		for (Java2File child : java2Directory.getJava2FileChildren()) {
			if (child.getFile().getName().equalsIgnoreCase("MyAnnotatedClass2.java")) { //$NON-NLS-1$
				java2file = child;
			}
		}
		Assert.assertNotNull(java2file);
		Assert.assertTrue(java2file.getFile().getLanguage().equalsIgnoreCase("java")); //$NON-NLS-1$
		Assert.assertTrue(java2file.getJavaUnit().getName().equalsIgnoreCase("MyAnnotatedClass2.java")); //$NON-NLS-1$

		Assert.assertNotNull(java2file.getChildren());
		Assert.assertNotNull(java2file.getChildren().get(0));
		ASTNodeSourceRegion javaNodeSourceRegion = java2file.getChildren().get(0);
		Assert.assertTrue(javaNodeSourceRegion.getStartLine().equals(Integer.valueOf(13)));
		Assert.assertTrue(javaNodeSourceRegion.getStartPosition().equals(Integer.valueOf(539)));
		Assert.assertTrue(javaNodeSourceRegion.getEndLine().equals(Integer.valueOf(13)));
		Assert.assertTrue(javaNodeSourceRegion.getEndPosition().equals(Integer.valueOf(566)));

		deleteProject(javaProject);
	}

	@Test
	public void testMemoryUsage() throws Exception {
		final long startTotalMemory = checkMemory("testMemoryUsageA", 0);
		IJavaProject javaProject = createProject(PROJECT_NAME);
		Resource resource = discoverResource(javaProject);
		@SuppressWarnings("unused") JavaApplication model = getModel(resource);
		
		long memoryUsed = checkMemory("testMemoryUsageB", startTotalMemory);
		if (memoryUsed > MAX_MEM_MB_AWAITED) {
			final String message = String.format(
					"Abnormal memory use for Java Composition Discoverer: %4.2fMB > %dMB", //$NON-NLS-1$
					Double.valueOf(memoryUsed / MEGA), Long.valueOf(MAX_MEM_MB_AWAITED));
		//	Assert.fail(message);
			System.err.println("See Issue 1108: " + message);
		}
		deleteProject(javaProject);
		javaProject = null;
		resource = null;
		model = null;
		checkMemory("testMemoryUsageC", startTotalMemory);
	}
}
