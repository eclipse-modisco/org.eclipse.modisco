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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
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
import org.eclipse.gmt.modisco.infra.common.core.internal.logging.MoDiscoLogHandler;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.kdm.uml2converter.KdmToUml2Activator;
import org.eclipse.gmt.modisco.kdm.uml2converter.KdmToUmlConverter;
import org.eclipse.gmt.modisco.kdm.uml2converter.impl.KdmtoUmlConverterImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.m2m.atl.common.ATLLogger;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.gmt.modisco.kdm.uml2converter.Messages;

/**
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474827
 */
@Deprecated
public class ConvertWithCustomTransformation implements IObjectActionDelegate {

	private final Logger logger = Logger.getLogger(ATLLogger.LOGGER_ID);
	private IFile kdmFile;
	private Shell shell;
	private IWorkbenchPart workbench;

	/**
	 * Constructor for Action1.
	 */
	public ConvertWithCustomTransformation() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(final IAction action,
			final IWorkbenchPart targetPart) {
		this.shell = targetPart.getSite().getShell();
		this.workbench = targetPart;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(final IAction action) {
		final IPath kdmModelPath = this.kdmFile.getFullPath();
		final IPath umlModelPath = this.kdmFile.getFullPath()
				.removeFileExtension().addFileExtension("uml"); //$NON-NLS-1$

		String customTransformation = ""; //$NON-NLS-1$

		// First Dialog: select the .asm transformation
		ILabelProvider lp = new WorkbenchLabelProvider();
		ITreeContentProvider cp = new WorkbenchContentProvider();
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
				this.shell, lp, cp);
		dialog.setValidator(null);
		dialog.setAllowMultiple(false);
		dialog.setTitle(Messages.ConvertWithCustomTransformation_2);
		dialog.setMessage(Messages.ConvertWithCustomTransformation_3);
		dialog.addFilter(new ViewerFilter() {

			@Override
			public boolean select(final Viewer viewer,
					final Object parentElement, final Object element) {
				if (element instanceof IFile) {
					return ((IFile) element).getFileExtension().equals("asm"); //$NON-NLS-1$
				}
				return true;

			}

		});
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		if (dialog.open() == Window.OK) {
			Object[] elements = dialog.getResult();
			if (elements.length == 1) {
				customTransformation = ((IResource) elements[0]).getLocation()
						.toString();
			}
		} else {
			return;
		}
		// final URL customTransformationUrl = new
		// File(customTransformation).toURI().toURL();
		try {
			final URL customTransformationUrl = new URL(
					"file:///" + customTransformation); //$NON-NLS-1$

			Job job = new Job(Messages.ConvertWithCustomTransformation_6
					+ umlModelPath.lastSegment()) {

				@Override
				protected IStatus run(final IProgressMonitor monitor) {
					IPath umlModelFilePath = ResourcesPlugin.getWorkspace()
							.getRoot().getLocation().append(umlModelPath);
					MoDiscoLogHandler logHandler = new MoDiscoLogHandler(
							umlModelFilePath.toString() + ".log"); //$NON-NLS-1$
					ConvertWithCustomTransformation.this.logger
							.addHandler(logHandler);
					try {
						KdmToUmlConverter transfo = new KdmtoUmlConverterImpl();
						URI outputURI = URI.createPlatformResourceURI(
								umlModelPath.toString(), true);
						transfo.getUML2ModelFromKDMModelWithCustomTransformation(
								URI.createPlatformResourceURI(
										kdmModelPath.toString(), true), false,
								customTransformationUrl, outputURI);
						return Status.OK_STATUS;
					} catch (Exception e) {
						MoDiscoLogger.logError(e,
								KdmToUml2Activator.getDefault());
						return Status.CANCEL_STATUS;
					} finally {
						try {
							ConvertWithCustomTransformation.this.logger
									.removeHandler(logHandler);
							logHandler.close();
							ConvertWithCustomTransformation.this.kdmFile
									.getParent().refreshLocal(1, null);
						} catch (Exception e1) {
							MoDiscoLogger.logError(e1,
									KdmToUml2Activator.getDefault());
						}
					}
				}
			};

			// triggers opening of the uml model as soon as it is saved
			job.addJobChangeListener(new JobChangeAdapter() {
				@Override
				public void done(final IJobChangeEvent event) {
					// access UI resources so that we can obtain the current
					// eclipse workbench activePage
					Display.getDefault().asyncExec(new Runnable() {
						public void run() {
							try {
								IWorkspaceRoot root = ResourcesPlugin
										.getWorkspace().getRoot();
								IFile ifile = root
										.getFileForLocation(ConvertWithCustomTransformation.this.kdmFile
												.getLocation()
												.removeFileExtension()
												.addFileExtension("uml")); //$NON-NLS-1$
								if (ifile.exists()) {
									IWorkbenchPage page = ConvertWithCustomTransformation.this.workbench
											.getSite().getPage();
									// programmatically opens the uml model
									// using default editor
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
		} catch (MalformedURLException e2) {
			MoDiscoLogger.logError(e2,
					Messages.ConvertWithCustomTransformation_9
							+ customTransformation,
					KdmToUml2Activator.getDefault());
		}

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