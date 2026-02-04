/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/

package org.eclipse.modisco.java.discoverer.tests.utils;

import java.io.IOException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.modisco.infra.common.core.internal.utils.FolderUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;

/**
 * @author Gabriel Barbier
 *
 */
public class JavaProjectFactory {

	private IProject project;
	private IJavaProject javaProject;
	private IPackageFragmentRoot sourceFolder;

	private final String srcPath = "src"; //$NON-NLS-1$

	public JavaProjectFactory(final String projectName) throws CoreException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		this.project = root.getProject(projectName);
		if (!this.project.exists()) {
			this.project.create(null);
			this.project.open(null);
		}
		this.javaProject = JavaCore.create(this.project);
		IFolder binFolder = this.createBinFolder();
		this.setJavaNature();
		this.javaProject.setRawClasspath(new IClasspathEntry[0], null);
		this.createOutputFolder(binFolder);
		this.addSystemLibraries(null);

		this.project.refreshLocal(IResource.DEPTH_INFINITE, null);
	}

	public IJavaProject getJavaProject() {
		return this.javaProject;
	}

	public void populateSourceFolder(final String src, Plugin plugin) throws CoreException {
		if (this.sourceFolder == null) {
			this.sourceFolder = createSourceFolder();
		}

		try {
			FolderUtils.copyFolderFromBundle(src, plugin,
					"/" + this.srcPath, this.project); //$NON-NLS-1$
		} catch (IOException e) {
			MoDiscoLogger.logError(e, plugin);
		}

		// refresh will perform also the compilation ...
		this.project.refreshLocal(IResource.DEPTH_INFINITE,
				new NullProgressMonitor());
		try {
			Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD,
					new NullProgressMonitor());
			Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD,
					new NullProgressMonitor());
			Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_REFRESH,
					new NullProgressMonitor());
			Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD,
					new NullProgressMonitor());
		} catch (OperationCanceledException e) {
			MoDiscoLogger.logError(e, plugin);
		} catch (InterruptedException e) {
			MoDiscoLogger.logError(e, plugin);
		}

	}

	public void dispose() throws CoreException {
		this.project.delete(true, true, null);
		this.project.getParent().refreshLocal(IResource.DEPTH_INFINITE, null);
	}

	private final IFolder createBinFolder() throws CoreException {
		IFolder binFolder = this.project.getFolder("bin"); //$NON-NLS-1$
		if (!binFolder.exists()) {
			binFolder.create(false, true, null);
		}
		return binFolder;
	}

	private final void setJavaNature() throws CoreException {
		IProjectDescription description = this.project.getDescription();
		description.setNatureIds(new String[] { JavaCore.NATURE_ID });
		this.project.setDescription(description, null);
	}

	private final void createOutputFolder(final IFolder binFolder)
			throws JavaModelException {
		IPath outputLocation = binFolder.getFullPath();
		this.javaProject.setOutputLocation(outputLocation, null);
	}

	private final IPackageFragmentRoot createSourceFolder()
			throws CoreException {
		IFolder folder = this.project.getFolder(this.srcPath);
		if (!folder.exists()) {
			folder.create(false, true, null);
		}
		IPackageFragmentRoot root = this.javaProject
				.getPackageFragmentRoot(folder);

		IClasspathEntry[] oldEntries = this.javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaCore.newSourceEntry(root.getPath());
		this.javaProject.setRawClasspath(newEntries, null);
		return root;
	}

	private final void addSystemLibraries(String vmId) throws JavaModelException {
		IClasspathEntry[] oldEntries = this.javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		if (vmId == null) {
			newEntries[oldEntries.length] = JavaRuntime
				.getDefaultJREContainerEntry();
		} else {
			newEntries[oldEntries.length] = JavaCore.newContainerEntry(
					JavaRuntime.newJREContainerPath(vmId, vmId));
		}
		this.javaProject.setRawClasspath(newEntries, null);
	}

	/**
	 * when a java project try to set an unbound vm
	 * for its execution environment.
	 * For instance, if it try to use a jvm 1.6 and there is only an install of jvm 1.5
	 * @throws CoreException
	 */
	public void setExecutionEnvironmentWithUnboundVm() throws CoreException {
		IPath oldOutput = this.javaProject.getOutputLocation();
		this.javaProject.setRawClasspath(new IClasspathEntry[0], null);
		this.createSourceFolder();
		this.javaProject.setOutputLocation(oldOutput, null);
		this.addSystemLibraries("bug328143");	 //$NON-NLS-1$
		this.project.refreshLocal(IResource.DEPTH_INFINITE, null);
	}

}
