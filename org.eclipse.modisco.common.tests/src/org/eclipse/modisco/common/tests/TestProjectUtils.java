/*******************************************************************************
 * Copyright (c) 2008, 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Guyomar (Mia-Software) - Bug 340339 - Need some Utils class for Folder/File/Project management
 *    Nicolas Guyomar (Mia-Software) - Bug 342451 - To be able to edit derived facet attributes and derived facet references in a table
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Thomas Cicognani (Soft-Maint) - Bug 398079 - org.eclipse.modisco.facet.util.core.internal.exported.FileUtils.copyFolderFromBundle 
 *    E.D.Willink de-duplicate
 *******************************************************************************/
package org.eclipse.modisco.common.tests;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.modisco.common.core.files.FileUtils;
import org.eclipse.modisco.common.core.files.ProjectUtils;
import org.eclipse.modisco.infra.common.core.internal.MoDiscoProject;
import org.osgi.framework.Bundle;

/**
 * @since 0.2
 */
public final class TestProjectUtils extends ProjectUtils
{
	private static final String JAVA_VERSION = "JavaSE-1.8"; //$NON-NLS-1$
	
	private static class MoDiscoCommonRuntimeException extends RuntimeException {
	
		private static final long serialVersionUID = -1350857942870483924L;
	
	/*	public MoDiscoCommonRuntimeException() {
		}
	
		public MoDiscoCommonRuntimeException(final String message) {
			super(message);
		}
	
		public MoDiscoCommonRuntimeException(final Throwable cause) {
			super(cause);
		} */
	
		public MoDiscoCommonRuntimeException(final String message, final Throwable cause) {
			super(message, cause);
		}
	
	}
	
	/**
	 * Add the regular system library entries to javaProject if vmId is null, else add corresponding
	 * entries for a probably bogus/erroneous specified VM.
	 */
	public static final void addSystemLibraries(final IJavaProject javaProject, String vmId) throws JavaModelException {
		IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		IClasspathEntry defaultJREContainerEntry;
		if (vmId == null) {
			defaultJREContainerEntry = JavaRuntime.getDefaultJREContainerEntry();
		}
		else {
			defaultJREContainerEntry = JavaCore.newContainerEntry(JavaRuntime.newJREContainerPath(vmId, vmId));
		}
		newEntries[oldEntries.length] = defaultJREContainerEntry;
		javaProject.setRawClasspath(newEntries, null);
	}

	/**
	 * Create MoDisco project
	 *
	 * @param project
	 * @param monitor
	 * @throws CoreException
	 */
	public static void create(final IProject project, final IProgressMonitor monitor)
			throws CoreException {
		createPluginProject(project, monitor, false);
		addNature(project, monitor, MoDiscoProject.NATURE_ID);
		monitor.done();
	}

	public static IProject createTestPluginProject(final String projectName,
			final Bundle bundleContainingResources, final String resourceFolder) throws Exception {
		return createTestProject(projectName, bundleContainingResources,
				resourceFolder, false);
	}

	public static IProject createTestProject(final String projectName,
			final Bundle bundleContainingResources, final String resourceFolder) throws Exception {
		return createTestProject(projectName, bundleContainingResources,
				resourceFolder, true);
	}

	public static IProject createTestProject(final String projectName,
			final Bundle bundleContainingResources, final String resourceFolder,
			final boolean isMoDisco) throws Exception {
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		ws.getRoot().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		IProject projectToCreate = ws.getRoot().getProject(projectName);
		if (projectToCreate.exists()) {
			projectToCreate.delete(true, true, new NullProgressMonitor());
		}
		if (!projectToCreate.exists()) {
			if (isMoDisco) {
				create(projectToCreate, new NullProgressMonitor());
			} else {
				createPluginProject(projectToCreate, new NullProgressMonitor(), true);
			}
		} else {
			throw new Exception(projectName + " project already exists"); //$NON-NLS-1$
		}
		String manifestLocation = "resources/" + resourceFolder //$NON-NLS-1$
				+ "/MANIFEST.MF_" + projectName; //$NON-NLS-1$
		if (bundleContainingResources.getResource(manifestLocation) != null) {
			FileUtils.copyFileFromBundle(bundleContainingResources, manifestLocation,
					projectToCreate, "META-INF/MANIFEST.MF"); //$NON-NLS-1$
		}
		return projectToCreate;
	}

/*	public static IProject importPlugin(final Bundle bundle) throws CoreException, IOException {
		return importPlugin(bundle, new IFilter() {
			@Override
			public boolean filter(final Object fileName) {
				return true;
			}
		});
	} */


	private TestProjectUtils() {
		throw new IllegalStateException();
	}
}
