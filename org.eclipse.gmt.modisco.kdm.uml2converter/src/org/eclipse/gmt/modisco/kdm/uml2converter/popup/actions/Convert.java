/*******************************************************************************
 * Copyright (c) 2008 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Hugues Dubourg (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.gmt.modisco.kdm.uml2converter.popup.actions;

import java.util.logging.Logger;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.gmt.modisco.infra.common.core.internal.logging.MoDiscoLogHandler;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.kdm.uml2converter.KdmToUml2Activator;
import org.eclipse.gmt.modisco.kdm.uml2converter.KdmToUmlConverter;
import org.eclipse.gmt.modisco.kdm.uml2converter.Messages;
import org.eclipse.gmt.modisco.kdm.uml2converter.impl.KdmtoUmlConverterImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.common.ATLLogger;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

/**
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474827
 */
@Deprecated
public class Convert implements IObjectActionDelegate {

	private final Logger logger = Logger.getLogger(ATLLogger.LOGGER_ID);
	private IFile kdmFile;
	private IWorkbenchPart workbench;

	/**
	 * Constructor for Action1.
	 */
	public Convert() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(final IAction action,
			final IWorkbenchPart targetPart) {
		this.workbench = targetPart;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(final IAction action) {
		final IPath kdmModelPath = this.kdmFile.getFullPath();
		final IPath umlModelPath = this.kdmFile.getFullPath()
				.removeFileExtension().addFileExtension("uml"); //$NON-NLS-1$

		Job job = new Job(Messages.Convert_0 + umlModelPath.lastSegment()) {

			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				IStatus result = null;
				MoDiscoLogHandler logHandler = new MoDiscoLogHandler(
						umlModelPath.toString() + ".log"); //$NON-NLS-1$
				Convert.this.logger.addHandler(logHandler);
				try {
					KdmToUmlConverter transfo = new KdmtoUmlConverterImpl();
					Resource kdmModel = new XMIResourceImpl();
					kdmModel.setURI(URI.createPlatformResourceURI(
							kdmModelPath.toString(), true));
					URI outputURI = URI.createPlatformResourceURI(
							umlModelPath.toString(), true);

					transfo.getUML2ModelFromKDMModel(kdmModel, false, outputURI);

					result = Status.OK_STATUS;
				} catch (Exception e) {
					result = Status.CANCEL_STATUS;
				} finally {
					Convert.this.logger.removeHandler(logHandler);
					logHandler.close();
					try {
						Convert.this.kdmFile.getParent().refreshLocal(1, null);
					} catch (Exception e1) {
						MoDiscoLogger.logError(e1,
								KdmToUml2Activator.getDefault());
					}
				}
				return result;
			}
		};

		// triggers opening of the uml model as soon as it is saved
		job.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(final IJobChangeEvent event) {
				// access UI resources so that we can obtain the current eclipse
				// workbench activePage
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						try {
							IWorkspaceRoot root = ResourcesPlugin
									.getWorkspace().getRoot();
							IFile ifile = root.getFileForLocation(umlModelPath);
							if (ifile.exists()) {
								IWorkbenchPage page = Convert.this.workbench
										.getSite().getPage();
								// programmatically opens the uml model using
								// default editor
								IDE.openEditor(page, ifile);
							}
						} catch (PartInitException e) {
							MoDiscoLogger.logError(e,
									KdmToUml2Activator.getDefault());
						}
					}
				});
			}
		});

		job.schedule();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(final IAction action,
			final ISelection selection) {
		this.kdmFile = (IFile) ((IStructuredSelection) selection)
				.getFirstElement();
	}

}