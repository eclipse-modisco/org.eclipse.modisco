/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.common.ui.internal.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmt.modisco.infra.common.core.internal.MoDiscoProject;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.common.ui.internal.MoDiscoCommonUIPlugin;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class ConvertToMoDiscoProjectAction implements IObjectActionDelegate {

	private ISelection fSelection;

	public void setActivePart(final IAction action, final IWorkbenchPart targetPart) {
		// nothing
	}

	public void run(final IAction action) {
		if (this.fSelection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) this.fSelection;
			Iterator<?> iterator = structuredSelection.iterator();
			while (iterator.hasNext()) {
				Object next = iterator.next();
				if (next instanceof IProject) {
					final IProject project = (IProject) next;
					BusyIndicator.showWhile(getDisplay(), new Runnable() {
						public void run() {
							convertProject(project);
						}
					});
				}
			}
		}
	}

	private void convertProject(final IProject project) {
		try {
			ProjectUtils.configureAsJavaProject(project, new NullProgressMonitor());
			ProjectUtils.configureAsPluginProject(project);
			ProjectUtils.addNature(project, new NullProgressMonitor(), MoDiscoProject.NATURE_ID);
			ProjectUtils.createBuildProperties(project);
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, MoDiscoCommonUIPlugin.getDefault());
		}
	}

	public void selectionChanged(final IAction action, final ISelection selection) {
		this.fSelection = selection;
	}

	private Display getDisplay() {
		Display display = Display.getCurrent();
		if (display == null) {
			display = Display.getDefault();
		}
		return display;
	}
}
