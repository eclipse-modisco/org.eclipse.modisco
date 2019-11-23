/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.editorInputs.ResourceEditorInput;
import org.eclipse.modisco.infra.discovery.ui.Activator;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

public final class ModelUtils {

	private ModelUtils() {
		//
	}

	/**
	 * A utility service for opening a model in the MoDisco model editor, if
	 * present, or otherwise in another appropriate editor.
	 *
	 * @param source
	 *            a {@link Resource} instance
	 */
	public static void openEditor(final IFile source) {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				FileEditorInput editorInput = new FileEditorInput(source);
				ModelUtils.openEditor(editorInput);
			}
		});
	}

	/**
	 * A utility service for opening a model in the MoDisco model editor.
	 *
	 * @param model
	 *            a {@link Resource} instance
	 */
	public static void openEditor(final Resource model) {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				ResourceEditorInput editorInput = new ResourceEditorInput(model);

				if (model.getResourceSet() == null) {
					// necessary for modisco browser
					ResourceSet resourceSet = new ResourceSetImpl();
					resourceSet.getResources().add(model);
				}

				ModelUtils.openEditor(editorInput);

			}
		});
	}

	/**
	 * A utility service to schedule the opening of a model in the MoDisco model
	 * editor, if present, or otherwise in another appropriate editor. This
	 * service reuses {@link #openEditor(IFile)}.
	 *
	 * @param source
	 *            a {@link Resource} instance
	 * @param job
	 *            the model will be opened in the model editor when this job
	 *            terminates
	 */
	public static void scheduleEditorOpening(final IFile source, final Job job) {
		job.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(final IJobChangeEvent event) {
				if (event.getJob().getResult().isOK()) {
					ModelUtils.openEditor(source);
				}
			}
		});
	}

	/**
	 * A utility service to schedule the opening of a model in the MoDisco model
	 * editor. This service reuses {@link #openEditor(Resource)}.
	 *
	 * @param source
	 *            a {@link Resource} instance
	 * @param job
	 *            the model will be opened in the model editor when this job
	 *            terminates
	 */

	public static void scheduleEditorOpening(final Resource model, final Job job) {
		job.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(final IJobChangeEvent event) {
				if (event.getJob().getResult().isOK()) {
					ModelUtils.openEditor(model);
				}
			}
		});
	}

	private static void openEditor(final IEditorInput editorInput) {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

		// We must close a previous editor opened
		IEditorPart existingEditorOnResource = page.findEditor(editorInput);
		if (existingEditorOnResource != null) {
			page.closeEditor(existingEditorOnResource, true);
		}

		IEditorDescriptor editDesc = PlatformUI.getWorkbench().getEditorRegistry()
				.findEditor("org.eclipse.gmt.modisco.infra.browser.editorID"); //$NON-NLS-1$

		if (editDesc != null) {
			try {
				IDE.openEditor(page, editorInput, editDesc.getId());
			} catch (PartInitException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
	}

}
