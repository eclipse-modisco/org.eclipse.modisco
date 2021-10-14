/*******************************************************************************
 * Copyright (c) 2008, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/

package org.eclipse.modisco.kdm.uml2converter.tests;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.m2m.atl.adt.AtlNature;
import org.eclipse.modisco.infra.common.core.internal.utils.FolderUtils;

public class AtlProjectFactory {

	private final IProject project;
	private final IFolder sourceFolder;
	private final IFolder referenceFolder;

	public AtlProjectFactory(final String projectName) throws CoreException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		this.project = root.getProject(projectName);
		if (this.project.exists() == false) {
			this.project.create(null);
			this.project.open(null);
			setATLNature();
		}
		// create folders reference, source and target
		this.sourceFolder = createFolder("source"); //$NON-NLS-1$
		this.referenceFolder = createFolder("reference"); //$NON-NLS-1$
		createFolder("target"); //$NON-NLS-1$

		this.project.refreshLocal(IResource.DEPTH_INFINITE, null);
	}

	public IProject getProject() {
		return this.project;
	}

	public void populateSourceFolder(final File src) throws CoreException, IOException {
		File target = this.sourceFolder.getLocation().toFile();
		if (target.exists()) {
			FolderUtils.copyDirectory(src, target);
		}
		this.project.refreshLocal(IResource.DEPTH_INFINITE, null);
	}

	public void populateReferenceFolder(final File src) throws CoreException, IOException {
		File target = this.referenceFolder.getLocation().toFile();
		if (target.exists()) {
			FolderUtils.copyDirectory(src, target);
		}
		this.project.refreshLocal(IResource.DEPTH_INFINITE, null);
	}

	public void dispose() throws CoreException {
		this.project.delete(true, true, null);
		this.project.getParent().refreshLocal(IResource.DEPTH_INFINITE, null);
	}

	private final void setATLNature() throws CoreException {
		IProjectDescription description = this.project.getDescription();
		description.setNatureIds(new String[] { AtlNature.ATL_NATURE_ID });
		this.project.setDescription(description, null);
	}

	private final IFolder createFolder(final String name) throws CoreException {
		IFolder folder = this.project.getFolder(name);
		if (!folder.exists()) {
			folder.create(false, true, null);
		}
		return folder;
	}

	public IFile getIFile(final String name) {
		return this.project.getFile(name);
	}
}
