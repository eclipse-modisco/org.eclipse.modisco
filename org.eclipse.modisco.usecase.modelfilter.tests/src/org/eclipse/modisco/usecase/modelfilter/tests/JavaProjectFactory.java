/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.modisco.usecase.modelfilter.tests;

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
		this.addSystemLibraries();

		this.project.refreshLocal(IResource.DEPTH_INFINITE, null);
	}

	public IJavaProject getJavaProject() {
		return this.javaProject;
	}

	public void populateSourceFolder(final String src) throws CoreException {
		if (this.sourceFolder == null) {
			this.sourceFolder = createSourceFolder();
		}

		try {
			FolderUtils.copyFolderFromBundle(src, Activator.getDefault(),
					"/" + this.srcPath, this.project); //$NON-NLS-1$
		} catch (IOException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
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
			MoDiscoLogger.logError(e, Activator.getDefault());
		} catch (InterruptedException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
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

	private final void addSystemLibraries() throws JavaModelException {
		IClasspathEntry[] oldEntries = this.javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaRuntime
				.getDefaultJREContainerEntry();
		this.javaProject.setRawClasspath(newEntries, null);
	}

}
