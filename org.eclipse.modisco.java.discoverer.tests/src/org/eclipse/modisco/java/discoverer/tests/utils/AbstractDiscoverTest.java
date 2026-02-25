/*******************************************************************************
 * Copyright (c) 2010, 2026 Mia-Software and others.
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

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.common.tests.TestFileUtils;
import org.eclipse.modisco.common.tests.TestProjectUtils;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.tests.Activator;
import org.junit.Before;

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
			TestFileUtils.deepCopy(Activator.getDefault().getBundle(), getSourcesReferencePath(), project, "/"); //$NON-NLS-1$
			IJavaProject javaProject = JavaCore.create(project);
			TestProjectUtils.addSystemLibraries(javaProject, null);
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