/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial implementation
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.ui.internal.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.modisco.infra.common.core.internal.MoDiscoProject;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.Messages;
import org.eclipse.modisco.infra.common.ui.internal.MoDiscoCommonUIPlugin;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * This operation creates a new project with MoDisco, Java and Plugin natures.
 * It initializes the Classpath and plugin configuration files with default
 * values.
 *
 */
public class NewProjectCreationOperation extends WorkspaceModifyOperation {
	private IPath projectLocation = null;
	private IProject project = null;

	public NewProjectCreationOperation(final IPath projectLocation, final IProject projectToCreate) {
		this.projectLocation = projectLocation;
		this.project = projectToCreate;
	}

	@Override
	protected void execute(final IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
		monitor.beginTask(Messages.NewProjectCreationOperation_MoDiscoProjectCreation,
				IProgressMonitor.UNKNOWN);
		if (!this.project.exists()) {
			IProjectDescription description = this.project.getWorkspace().newProjectDescription(
					this.project.getName());
			if (!Platform.getLocation().equals(this.projectLocation)) {
				description.setLocation(this.projectLocation);
			}
			this.project.create(monitor);
			this.project.open(monitor);
			monitor.subTask(Messages.NewProjectCreationOperation_AddingJavaNature);
			ProjectUtils.configureAsJavaProject(this.project, monitor);
			monitor.subTask(Messages.NewProjectCreationOperation_AddingPluginNature);
			ProjectUtils.configureAsPluginProject(this.project);
			ProjectUtils.addNature(this.project, monitor, MoDiscoProject.NATURE_ID);
			ProjectUtils.createBuildProperties(this.project);
		} else {
			MoDiscoLogger.logWarning("MoDisco project creation aborted: the project already exists", //$NON-NLS-1$
					MoDiscoCommonUIPlugin.getDefault());
		}
		monitor.done();
	}
}
