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
 *******************************************************************************/
package org.eclipse.modisco.java.composition.discoverer.tests;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;

import org.junit.Assert;

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
import org.eclipse.modisco.java.discoverer.tests.Activator;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.java.composition.discoverer.DiscoverKDMSourceAndJavaModelFromJavaProject;
import org.eclipse.modisco.java.composition.javaapplication.Java2Directory;
import org.eclipse.modisco.java.composition.javaapplication.Java2File;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class TestJavaApp {

	private static final String PROJECT_NAME = JUnitPlugin.PLUGIN_ID
			+ "_test001"; //$NON-NLS-1$

	private static Resource resource = null;
	private static JavaApplication model;

	private final int int13 = 13;
	private final int int539 = 539;		// Beware - these drift as the copyright evolves in 
	private final int int566 = 566;		// org.eclipse.modisco.java.discoverer.tests/workspace/test001/src/annotations/MyAnnotatedClass2.java
	private IProject project = null;

	@Before
	public void initResource() throws Exception {

		this.project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(TestJavaApp.PROJECT_NAME);

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
		discoverResource(javaProject);
		EList<EObject> i = TestJavaApp.getResource().getContents();
		for (Iterator<EObject> iterator = i.iterator(); iterator.hasNext()
				&& TestJavaApp.model == null;) {
			EObject eobject = iterator.next();
			if (eobject instanceof JavaApplication) {
				TestJavaApp.model = (JavaApplication) eobject;
			}
		}

	}

	@After
	public void finaly() throws CoreException {
		if (this.project.exists()) {
			this.project.delete(true, true, new NullProgressMonitor());
		}
	}

	@SuppressWarnings("null")
	@Test
	public void test001() {

		Assert.assertNotNull(TestJavaApp.model);

		Assert.assertNotNull(TestJavaApp.model.getJavaModel());
		Assert.assertTrue(TestJavaApp.model
				.getJavaModel()
				.getName()
				.equalsIgnoreCase(
						"org.eclipse.modisco.java.composition.discoverer.tests_test001")); //$NON-NLS-1$

		Assert.assertNotNull(TestJavaApp.model.getDeploymentModel());
		Assert.assertTrue(TestJavaApp.model
				.getDeploymentModel()
				.getName()
				.equalsIgnoreCase(
						"org.eclipse.modisco.java.composition.discoverer.tests_test001")); //$NON-NLS-1$

		Assert.assertNotNull(TestJavaApp.model.getJava2DirectoryChildren());
		Assert.assertTrue(TestJavaApp.model.getJava2DirectoryChildren().size() > 0);

		Java2Directory java2Directory = TestJavaApp.model
				.getJava2DirectoryChildren().get(0);

		Assert.assertNotNull(java2Directory);
		Assert.assertTrue(java2Directory.getDirectory().get(0).getName()
				.equalsIgnoreCase("annotations")); //$NON-NLS-1$
		Assert.assertTrue(java2Directory.getJavaPackage().getName()
				.equalsIgnoreCase("annotations")); //$NON-NLS-1$

		Java2File java2file = null;
		for (Java2File child : java2Directory.getJava2FileChildren()) {
			if (child.getFile().getName()
					.equalsIgnoreCase("MyAnnotatedClass2.java")) { //$NON-NLS-1$
				java2file = child;
			}
		}
		Assert.assertNotNull(java2file);
		Assert.assertTrue(java2file.getFile().getLanguage()
				.equalsIgnoreCase("java")); //$NON-NLS-1$
		Assert.assertTrue(java2file.getJavaUnit().getName()
				.equalsIgnoreCase("MyAnnotatedClass2.java")); //$NON-NLS-1$

		Assert.assertNotNull(java2file.getChildren());
		Assert.assertNotNull(java2file.getChildren().get(0));
		ASTNodeSourceRegion javaNodeSourceRegion = java2file.getChildren().get(
				0);
		Assert.assertTrue(javaNodeSourceRegion.getStartLine().equals(
				new Integer(this.int13)));
		Assert.assertTrue(javaNodeSourceRegion.getStartPosition().equals(
				new Integer(this.int539)));
		Assert.assertTrue(javaNodeSourceRegion.getEndLine().equals(
				new Integer(this.int13)));
		Assert.assertTrue(javaNodeSourceRegion.getEndPosition().equals(
				new Integer(this.int566)));

	}

	private static void discoverResource(final IJavaProject javaProject)
			throws Exception {
		DiscoverKDMSourceAndJavaModelFromJavaProject discoverer = new DiscoverKDMSourceAndJavaModelFromJavaProject();
		discoverer.discoverElement(javaProject, new NullProgressMonitor());
		TestJavaApp.resource = discoverer.getTargetModel();
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
		return TestJavaApp.resource;
	}
}
