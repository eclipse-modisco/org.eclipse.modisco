/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.java.discoverer.tests.utils;

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
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.internal.JavaActivator;
import org.eclipse.modisco.java.discoverer.tests.Activator;
import org.junit.Before;
import org.osgi.framework.Bundle;

/** TODO merge with JavaProjectFactory. */
public abstract class AbstractDiscoverTest {

	private Resource resource;
	private Model model;

	public AbstractDiscoverTest() {
		super();
	}

	protected abstract String getTargetProjectName();

	protected abstract String getSourcesReferencePath();

	@Before
	public void initResource() throws Exception {
		if (this.resource == null) {

			IProject project = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(getTargetProjectName());
			if (project.exists()) {
				project.delete(true, true, new NullProgressMonitor());
			}
			project.create(new NullProgressMonitor());
			project.open(new NullProgressMonitor());
			deepCopy(getSourcesReferencePath(), project, "/"); //$NON-NLS-1$
			IJavaProject javaProject = JavaCore.create(project);
			addSystemLibraries(javaProject);
			project.refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());
			Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, null);
			Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD, null);
			Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_REFRESH,
					null);
			Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, null);
			loadResource(javaProject);
			EList<EObject> i = this.resource.getContents();
			for (Iterator<EObject> iterator = i.iterator(); iterator.hasNext()
					&& this.model == null;) {
				EObject eobject = iterator.next();
				if (eobject instanceof Model) {
					this.model = (Model) eobject;
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

	/**
	 * @param path
	 * @param project
	 * @param destinationPath
	 * @throws CoreException
	 * @throws IOException
	 */
	private void deepCopy(final String path, final IProject project,
			final String destinationPath) throws CoreException, IOException {
		// System.out.println("Deep copy: " + path + " -> " + destinationPath);
		Bundle bundle = Activator.getDefault().getBundle();
		Enumeration<?> e = bundle.getEntryPaths(path);
		if (e == null) {
			try {
				// System.out.println("Try: " + path + " -> " +
				// destinationPath);
				InputStream source = bundle.getEntry(path).openStream();
				IFile javaFile = project.getFile(destinationPath);
				if (javaFile.exists()) {
					javaFile.delete(true, new NullProgressMonitor());
				}
				javaFile.create(source, true, new NullProgressMonitor());
				// System.out.println("Success: " + path + " -> "
				// + destinationPath);
			} catch (Exception e1) {
				Status status2 = new Status(IStatus.ERROR,
						JavaActivator.PLUGIN_ID, e1.getMessage(), e1);
				Activator.getDefault().getLog().log(status2);
			}
		} else {
			// System.out.println("Create folder: " + destinationPath);
			String subDestinationPath = "/"; //$NON-NLS-1$
			if (!destinationPath.equals("/")) { //$NON-NLS-1$
				IFolder folder = project.getFolder(destinationPath);
				if (!folder.exists()) {
					try {
						folder.create(true, true, new NullProgressMonitor());
					} catch (Exception e1) {
						Status status2 = new Status(IStatus.ERROR,
								JavaActivator.PLUGIN_ID, e1.getMessage(), e1);
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

	protected void loadResource(final IJavaProject javaProject)
			throws Exception {
		DiscoverJavaModelFromJavaProject discoverer = new DiscoverJavaModelFromJavaProject();
		discoverer.setSerializeTarget(false);
		discoverer.discoverElement(javaProject, new NullProgressMonitor());
		this.resource = discoverer.getTargetModel();
	}

	protected Resource getResource() {
		return this.resource;
	}

	protected void setResource(final Resource resource) {
		this.resource = resource;
	}

	protected Model getModel() {
		return this.model;
	}

	protected void setModel(final Model model) {
		this.model = model;
	}

}