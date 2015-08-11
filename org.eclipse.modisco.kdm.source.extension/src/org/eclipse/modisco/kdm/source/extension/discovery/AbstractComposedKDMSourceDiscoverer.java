/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.kdm.source.extension.discovery;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.kdm.source.discoverer.actions.DiscoverSourceModelFromJavaProject;
import org.eclipse.modisco.kdm.source.extension.Activator;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

/**
 * This abstract discoverer may be reused for writing composite discoverers where one kdm inventory
 * leaf model is involved in model composition.
 * 
 * It proposes a discovery process and some common code related to the kdm inventory model.
 * 
 * See Help Contents or http://wiki.eclipse.org/MoDisco/Components/KDMSourceExtension
 * 
 * @deprecated use AbstractComposedKDMSourceDiscoverer2 instead with the new discovery framework,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474729
 * 
 */
@Deprecated
public abstract class AbstractComposedKDMSourceDiscoverer implements Discoverer {

	private Resource kdmSourceModelResource = null;
	private ResourceSet resourceSet = null;
	
	protected Resource getKdmSourceModelResource() {
		return this.kdmSourceModelResource;
	}
	
	protected void setKdmSourceModelResource(final Resource kdmSourceModelResource) {
		this.kdmSourceModelResource = kdmSourceModelResource;
	}
	
	/**
	 * The global discovery process. Should not be overridden in most cases.
	 * 
	 * The process includes four steps : composite model initialization, kdm inventory model
	 * discovery, others leaf models discovery, composite model termination.
	 * 
	 * Creating links between models may be done during last step, or during leaf models discovery
	 * (e.g. using {@link SourceVisitListener})
	 * 
	 * The resulting model will be opened in a workbench editor if asked (
	 * {@link AbstractComposedKDMSourceDiscoverer#shouldOpenEditorOnResultModel()} )
	 */
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		Job job = new Job(getDiscoveryName()) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				IStatus resultStatus = Status.OK_STATUS;
				monitor.beginTask(Messages.AbstractComposedKDMSourceDiscoverer_0,
						IProgressMonitor.UNKNOWN);

				// Step 1
				initializeCompositeModel(source, parameters, monitor);
				if (monitor.isCanceled()) {
					resultStatus = Status.CANCEL_STATUS;
					return resultStatus;
				}
				monitor.worked(1);
				// Step 2
				discoverOtherLeafModels(source, parameters, monitor);
				if (monitor.isCanceled()) {
					resultStatus = Status.CANCEL_STATUS;
					return resultStatus;
				}
				monitor.worked(1);
				// Step 3
				discoverKDMSourceModel(source, monitor);
				if (monitor.isCanceled()) {
					resultStatus = Status.CANCEL_STATUS;
					return resultStatus;
				}
				monitor.worked(1);
				// Step 4
				completeModelsBuild(source, parameters, monitor);

				monitor.done();
				return resultStatus;
			}
		};

		scheduleEditorOpening(job);

		job.schedule();
		try {
			job.join();
		} catch (InterruptedException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}

	}

	/**
	 * The initialization should create some resource and root element for composite model. It might
	 * also initialize some {@link SourceVisitListener} instance if some of leaf discoverers
	 * implement {@link AbstractRegionDiscoverer}.
	 */
	protected abstract void initializeCompositeModel(final Object source,
			final Map<DiscoveryParameter, Object> parameters, final IProgressMonitor monitor);

	/**
	 * This should call leaf discoverers, retrieve the resulting resources and move them to the
	 * global resource set.
	 */
	protected abstract void discoverOtherLeafModels(final Object source,
			final Map<DiscoveryParameter, Object> parameters, final IProgressMonitor monitor);

	/**
	 * Optional termination operations (weaving, saving, ...)
	 */
	protected abstract void completeModelsBuild(final Object source,
			final Map<DiscoveryParameter, Object> parameters, final IProgressMonitor monitor);

	/**
	 * This method should return the name of the discovery.
	 */
	protected abstract String getDiscoveryName();

	/**
	 * This method should return the resource for composite model.
	 */
	protected abstract Resource getResultModel();

	/**
	 * The resulting model will be opened in a workbench editor if this method returns true.
	 */
	protected abstract boolean shouldOpenEditorOnResultModel();

	/**
	 * Standard process of kdm inventory model discovery.
	 */
	protected Resource discoverKDMSourceModel(final Object source, final IProgressMonitor monitor) {
		monitor.subTask(Messages.AbstractComposedKDMSourceDiscoverer_1);
		this.kdmSourceModelResource = null;
		DiscoverSourceModelFromJavaProject kdmSourceDiscoverer = new DiscoverSourceModelFromJavaProject();
		Map<DiscoveryParameter, Object> parameterForKDMSourceDiscovery = new HashMap<DiscoveryParameter, Object>();
		parameterForKDMSourceDiscovery.put(
				DiscoverSourceModelFromJavaProject.PARAMETER_SILENT_MODE, Boolean.TRUE);
		kdmSourceDiscoverer.discoverElement(source, parameterForKDMSourceDiscovery);

		if (parameterForKDMSourceDiscovery
				.get(kdmSourceDiscoverer.getDiscovererParameters().get(0)) != null) {
			this.kdmSourceModelResource = (Resource) parameterForKDMSourceDiscovery
					.get(kdmSourceDiscoverer.getDiscovererParameters().get(0));
			getResourceSet().getResources().add(this.kdmSourceModelResource);
		}

		return this.kdmSourceModelResource;
	}

	/**
	 * Global {@link ResourceSet} instance for managing involved models.
	 */
	protected final ResourceSet getResourceSet() {
		if (this.resourceSet == null) {
			this.resourceSet = new ResourceSetImpl();
		}
		return this.resourceSet;
	}

	private void scheduleEditorOpening(final Job job) {
		job.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(final IJobChangeEvent event) {
				if (shouldOpenEditorOnResultModel()) {
					if (event.getJob().getResult().isOK()) {
						if (getResultModel() != null && getResultModel().getURI() != null) {
							URI uri = getResultModel().getURI();
							IFile iFile = null;
							if (uri.isPlatformResource()) {
								iFile = ResourcesPlugin.getWorkspace().getRoot()
										.getFile(new Path(uri.toPlatformString(true)));
							} else if (uri.isFile()) {
								iFile = ResourcesPlugin.getWorkspace().getRoot()
										.getFileForLocation(new Path(uri.toFileString()));
							}
							openEditor(iFile);
						}
					}
				}
			}
		});
	}

	protected static final void openEditor(final IFile source) {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				try {

					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage();

					// We must close previous editor opened
					IEditorPart existingEditorOnResource = page.findEditor(new FileEditorInput(
							source));
					if (existingEditorOnResource != null) {
						page.closeEditor(existingEditorOnResource, true);
					}

					IEditorDescriptor editDesc = PlatformUI.getWorkbench().getEditorRegistry()
							.findEditor("org.eclipse.gmt.modisco.infra.browser.editorID"); //$NON-NLS-1$

					if (editDesc != null) {
						IDE.openEditor(page, source, editDesc.getId());
					} else {
						IDE.openEditor(page, source);
					}

				} catch (PartInitException e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
				}
			}
		});
	}

}
