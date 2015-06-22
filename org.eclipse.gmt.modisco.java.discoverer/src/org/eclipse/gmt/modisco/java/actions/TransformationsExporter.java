/*
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */

package org.eclipse.gmt.modisco.java.actions;

import java.io.InputStream;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.AbstractDiscovererImpl;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.JavaActivator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * @author Gabriel Barbier
 * @deprecated the whole plug-in is replaced by
 *             "org.eclipse.modisco.java.discoverer" (without the "gmt" part),
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public class TransformationsExporter extends AbstractDiscovererImpl {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer#discoverElement
	 * (java.lang.Object, java.util.Map)
	 */
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		IPath ipath = (IPath) source;
		exportJavaToKdmTransformation(ipath);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer#isApplicableTo
	 * (java.lang.Object)
	 */
	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		if (source instanceof IPath) {
			// should we test file extension ?
			result = true;
		}
		return result;
	}

	public void exportJavaToKdmTransformation(final IPath pathParameter) {
		final InputStream transfoFileStream = this.getClass().getResourceAsStream(
				"resources/transformations/javaToKdm.atl"); //$NON-NLS-1$
		IPath path = pathParameter;
		if (path.getFileExtension() == null || !path.getFileExtension().equals("atl")) { //$NON-NLS-1$
			path = path.addFileExtension("atl"); //$NON-NLS-1$
		}
		final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		final IProject destinationProject = file.getProject();
		Job job = new Job("exporting ATL transformation") { //$NON-NLS-1$
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					/*
					 * whatever method is used, the transfoFileStream flow will
					 * be correctly closed
					 */
					if (file.exists()) {
						file.setContents(transfoFileStream, IResource.FORCE, monitor);
					} else {
						file.create(transfoFileStream, IResource.FORCE, monitor);
					}
				} catch (CoreException e) {
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
		};
		// when copy job is done, open the file
		job.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(final IJobChangeEvent event) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						try {
							destinationProject.refreshLocal(IResource.DEPTH_INFINITE,
									new NullProgressMonitor());
							IWorkbenchPage page = PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow().getActivePage();
							IDE.openEditor(page, file);
						} catch (Exception e) {
							MoDiscoLogger.logError(e, JavaActivator.getDefault());
						}
					}
				});
			}
		});
		job.schedule();
	}
}
