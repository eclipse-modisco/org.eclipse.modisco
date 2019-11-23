/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.ui.internal.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.Messages;
import org.eclipse.modisco.infra.common.ui.internal.MoDiscoCommonUIPlugin;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.part.ISetSelectionTarget;

/**
 * This wizard proposes to create a basic new MoDisco project.
 *
 */
public class NewProjectWizard extends Wizard implements INewWizard {

	private static final String NEW_PROJECT_CREATION_PAGE_NAME = "NewProjectCreationPage"; //$NON-NLS-1$
	private IWorkbench theWorkbench;
	private IProject project;
	private String projectName;
	private IPath projectLocation;

	public void init(final IWorkbench workbench, final IStructuredSelection selection) {
		this.theWorkbench = workbench;
		setWindowTitle(Messages.NewProjectWizard_modiscoProject);
	}

	@Override
	public void addPages() {
		WizardNewProjectCreationPage newProjectCreationPage = new WizardNewProjectCreationPage(
				NewProjectWizard.NEW_PROJECT_CREATION_PAGE_NAME) {
			@Override
			protected boolean validatePage() {
				NewProjectWizard.this.projectLocation = getLocationPath();
				NewProjectWizard.this.projectName = getProjectName();
				if (getProjectName() != null && getProjectName().length() > 0) {
					NewProjectWizard.this.project = ResourcesPlugin.getWorkspace().getRoot()
							.getProject(getProjectName());
				}

				return super.validatePage() && NewProjectWizard.this.canFinish();
			}
		};

		newProjectCreationPage.setInitialProjectName(this.projectName);
		newProjectCreationPage.setTitle(Messages.NewProjectWizard_modiscoProject);
		newProjectCreationPage.setDescription(Messages.NewProjectWizard_createMoDiscoProject);
		addPage(newProjectCreationPage);
	}

	@Override
	public boolean performFinish() {
		WorkspaceModifyOperation operation = new NewProjectCreationOperation(this.projectLocation,
				this.project);

		try {
			getContainer().run(false, false, operation);
		} catch (Exception e) {
			MoDiscoLogger.logError(e, MoDiscoCommonUIPlugin.getDefault());
			return false;
		}

		if (this.project != null) {
			IWorkbenchPage page = this.theWorkbench.getActiveWorkbenchWindow().getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(this.project);
				getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						((ISetSelectionTarget) activePart).selectReveal(targetSelection);
					}
				});
			}
		}

		return true;
	}

	@Override
	public boolean canFinish() {
		return (this.projectName != null) && (this.projectName.length() > 0)
				&& (this.project != null) && (!this.project.exists());
	}

}
