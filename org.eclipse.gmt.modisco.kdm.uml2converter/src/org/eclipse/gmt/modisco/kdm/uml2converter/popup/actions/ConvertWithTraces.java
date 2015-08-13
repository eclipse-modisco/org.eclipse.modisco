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

import java.io.IOException;
import java.net.URL;
import java.util.logging.Logger;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.gmt.modisco.infra.common.core.internal.logging.MoDiscoLogHandler;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.kdm.uml2converter.KdmToUml2Activator;
import org.eclipse.gmt.modisco.kdm.uml2converter.KdmToUmlConverter;
import org.eclipse.gmt.modisco.kdm.uml2converter.impl.KdmtoUmlConverterImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.common.ATLLogger;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.gmt.modisco.kdm.uml2converter.Messages;

/**
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474827
 */
@Deprecated
public class ConvertWithTraces implements IObjectActionDelegate {

	private final Logger logger = Logger.getLogger(ATLLogger.LOGGER_ID);
	private IFile kdmFile;

	/**
	 * Constructor for Action1.
	 */
	public ConvertWithTraces() {

		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(final IAction action,
			final IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(final IAction action) {
		final String kdmModelPath = this.kdmFile.getFullPath().toString();
		final String umlModelPath = this.kdmFile.getFullPath().toString()
				.replace(".kdm", ".uml"); //$NON-NLS-1$ //$NON-NLS-2$

		Job job = new Job(Messages.ConvertWithTraces_2 + this.kdmFile.getName()
				+ ".uml") { //$NON-NLS-1$

			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				MoDiscoLogHandler logHandler = new MoDiscoLogHandler(
						umlModelPath + ".log"); //$NON-NLS-1$
				ConvertWithTraces.this.logger.addHandler(logHandler);
				try {
					URL kdmModelurl = new URL("file:///" + kdmModelPath); //$NON-NLS-1$
					KdmToUmlConverter transfo = new KdmtoUmlConverterImpl();
					Resource kdmModel = new XMIResourceImpl();
					kdmModel.setURI(URI.createPlatformResourceURI(kdmModelPath,
							true));
					kdmModel.load(kdmModelurl.openStream(), null);
					URI outputURI = URI.createPlatformResourceURI(umlModelPath,
							true);

					Resource[] out = transfo.getUML2ModelFromKDMModel(kdmModel,
							true, outputURI);
					Resource outputTrace = out[1];

					outputTrace.setURI(URI.createPlatformResourceURI(
							umlModelPath.replace(".uml", ".amw"), true)); //$NON-NLS-1$ //$NON-NLS-2$
					outputTrace.save(null);

					return Status.OK_STATUS;
				} catch (IOException e) {
					MoDiscoLogger.logError(e, KdmToUml2Activator.getDefault());
					return Status.CANCEL_STATUS;
				} catch (Exception e) {
					return Status.CANCEL_STATUS;
				} finally {
					try {
						ConvertWithTraces.this.logger.removeHandler(logHandler);
						logHandler.close();
						ConvertWithTraces.this.kdmFile.getParent()
								.refreshLocal(1, null);
					} catch (Exception e1) {
						MoDiscoLogger.logError(e1,
								KdmToUml2Activator.getDefault());
					}
				}
			}
		};

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
