/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.modisco.infra.common.core.internal.utils.PluginUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.discovery.core.internal.catalog.DiscovererRegistry;
import org.eclipse.modisco.infra.discovery.ui.Activator;
import org.eclipse.modisco.infra.discovery.ui.Messages;
import org.eclipse.modisco.infra.discovery.ui.internal.registry.DiscovererUIRegistry;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

/** A wizard to create a new MoDisco Discoverer */
public class NewDiscovererWizard extends Wizard implements INewWizard {

	private NewDiscovererMainWizardPage mainPage;
	private IStructuredSelection fSelection;

	public NewDiscovererWizard() {
		setWindowTitle(Messages.NewDiscovererWizard_newMoDiscoDiscoverer);
	}

	public void init(final IWorkbench workbench, final IStructuredSelection selection) {
		this.fSelection = selection;
	}

	@Override
	public void addPages() {
		super.addPages();
		if (this.mainPage == null) {
			this.mainPage = new NewDiscovererMainWizardPage();
			this.mainPage.init(this.fSelection);
		}
		addPage(this.mainPage);
	}

	protected NewDiscovererMainWizardPage getMainPage() {
		return this.mainPage;
	}

	@Override
	public boolean performFinish() {
		if (!this.mainPage.isPageComplete()) {
			return false;
		}

		try {
			getMainPage().preFinishPage();
			getContainer().run(true, true, new IRunnableWithProgress() {
				public void run(final IProgressMonitor monitor) throws InvocationTargetException,
						InterruptedException {
					getMainPage().finishPage(monitor);
				}
			});

			IProject project = getMainPage().getJavaProject().getProject();
			List<String> requiredBundles = new ArrayList<String>();
			requiredBundles.add("org.eclipse.modisco.infra.discovery.core"); //$NON-NLS-1$
			// requiredBundles.add("org.eclipse.core.runtime"); //$NON-NLS-1$
			requiredBundles.add("org.eclipse.emf.ecore"); //$NON-NLS-1$
			if (getMainPage().getInputType().startsWith("org.eclipse.core.resources.")) { //$NON-NLS-1$
				requiredBundles.add("org.eclipse.core.resources"); //$NON-NLS-1$
			}
			if (this.mainPage.isRegisterPopupMenu()) {
				requiredBundles
						.add(DiscovererUIRegistry.getInstance().getExtensionPointNamespace());
			}
			PluginUtils.addRequiredBundles(project, requiredBundles);
			PluginUtils.registerInPluginXML(project, DiscovererRegistry.DISCOVERER_EXTENSION_POINT,
					"discoverer", new String[] { "class", "id" }, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					new String[] { this.mainPage.getCreatedType().getFullyQualifiedName(),
							this.mainPage.getDiscovererName() });

			if (this.mainPage.isRegisterPopupMenu()) {
				PluginUtils.registerInPluginXML(project,
						DiscovererUIRegistry.getInstance().getExtensionPointNamespace()
								+ "." + DiscovererUIRegistry.getInstance().getExtensionPointName(), //$NON-NLS-1$
						"discoverer", new String[] { "discovererID", "label" }, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						new String[] { this.mainPage.getDiscovererName(),
								this.mainPage.getDiscovererLabel() });
			}

			// must be singleton because we added extensions
			PluginUtils.makeSingleton(project);
			ProjectUtils.enableAPT(project);

			IResource resource = this.mainPage.getModifiedResource();
			if (resource != null) {
				BasicNewResourceWizard.selectAndReveal(resource, PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow());
				openResource((IFile) resource);
			}
		} catch (Exception e) {
			Logger.logError(e, Activator.getDefault());
		}

		return true;
	}

	protected void openResource(final IFile resource) {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window == null) {
			return;
		}
		final IWorkbenchPage activePage = window.getActivePage();
		if (activePage == null) {
			return;
		}
		final Display display = getShell().getDisplay();
		if (display == null) {
			return;
		}
		display.asyncExec(new Runnable() {
			public void run() {
				try {
					IDE.openEditor(activePage, resource, true);
				} catch (PartInitException e) {
					Logger.logError(e, Activator.getDefault());
				}
			}
		});
	}
}
