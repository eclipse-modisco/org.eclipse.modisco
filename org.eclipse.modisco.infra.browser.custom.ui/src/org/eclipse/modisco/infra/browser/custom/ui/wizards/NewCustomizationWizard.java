/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.custom.ui.wizards;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.modisco.infra.browser.custom.core.CustomizationsCatalog;
import org.eclipse.modisco.infra.browser.custom.emf.UicustomFactory;
import org.eclipse.modisco.infra.browser.custom.ui.Activator;
import org.eclipse.modisco.infra.browser.custom.ui.Messages;
import org.eclipse.modisco.infra.browser.custom.ui.controls.QuerySetsSelectionControl;
import org.eclipse.modisco.infra.common.core.internal.utils.BuildPropertiesUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.PluginUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/** An Eclipse wizard to create a new customization. */
public class NewCustomizationWizard extends Wizard implements INewWizard {

	private IStructuredSelection fSelection;
	private NewCustomizationFilePage newCustomizationFilePage;
	private SelectMetamodelsPage selectMetamodelsFilePage;
	private SelectQuerySetsPage selectQuerySetsPage;

	public NewCustomizationWizard() {
		setWindowTitle(Messages.NewCustomizationWizard_newBrowserCustomization);
	}

	@Override
	public void addPages() {
		this.newCustomizationFilePage = new NewCustomizationFilePage(this.fSelection);
		addPage(this.newCustomizationFilePage);
		this.selectMetamodelsFilePage = new SelectMetamodelsPage();
		addPage(this.selectMetamodelsFilePage);
		this.selectQuerySetsPage = new SelectQuerySetsPage();
		addPage(this.selectQuerySetsPage);
	}

	public void init(final IWorkbench workbench, final IStructuredSelection selection) {
		this.fSelection = selection;
	}

	@Override
	public boolean performFinish() {
		final IFile file = this.newCustomizationFilePage.createNewFile();
		if (file == null) {
			return false;
		}
		try {
			getContainer().run(false, false, new IRunnableWithProgress() {
				public void run(final IProgressMonitor monitor) throws InvocationTargetException,
						InterruptedException {
					createCustomization(file);
					try {
						BuildPropertiesUtils.addToBuild(file);
					} catch (Exception e) {
						MoDiscoLogger.logError("Error adding file " + file.getFullPath() //$NON-NLS-1$
								+ " to the build.properties", Activator.getDefault()); //$NON-NLS-1$
					}
					PluginUtils.register(file,
							CustomizationsCatalog.REGISTRATION_EXTENSION_POINT_ID,
							"browserCustomization"); //$NON-NLS-1$
				}
			});
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		return true;
	}

	private void createCustomization(final IFile file) {
		// create the MetamodelView model, based on wizard information
		final MetamodelView metamodelView = UicustomFactory.eINSTANCE.createMetamodelView();

		final String selectedMetamodel = this.selectMetamodelsFilePage.getSelectedMetamodel();
		metamodelView.setMetamodelURI(selectedMetamodel);

		// set available query sets
		final QuerySetsSelectionControl querySetsSelectionControl = this.selectQuerySetsPage
				.getQuerySetsSelectionControl();
		metamodelView
				.setAllQuerySetsAvailable(querySetsSelectionControl.getAllQuerySetsAvailable());
		final String[] selectedQuerySets = querySetsSelectionControl.getSelectedQuerySets();
		for (final String selectedQuerySet : selectedQuerySets) {
			metamodelView.getAvailableQuerySets().add(selectedQuerySet);
		}

		// save it to the user-chosen file
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("uiCustom", new XMIResourceFactoryImpl()); //$NON-NLS-1$
		final Resource resource = resourceSet.createResource(URI.createURI(file.getLocationURI()
				.toString()));

		resource.getContents().add(metamodelView);

		try {
			resource.save(null);
		} catch (final IOException e) {
			Activator.logException(e);
		}

		try {
			// synchronize changes with Workspace
			file.refreshLocal(IResource.DEPTH_ZERO, null);
		} catch (final CoreException e) {
			Activator.logException(e);
		}

		// open newly created customization in editor
		try {
			IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(),
					file, Activator.CUSTOMIZATION_EDITOR_ID);
		} catch (final Exception e) {
			Activator.logException(e);
		}
	}
}
