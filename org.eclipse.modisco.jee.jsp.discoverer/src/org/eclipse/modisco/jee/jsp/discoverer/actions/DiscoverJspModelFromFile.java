/*********************************************************************************
 * Copyright (c) 2009,2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - adapted to new discovery framework (Bug 335003)
 *********************************************************************************/
package org.eclipse.modisco.jee.jsp.discoverer.actions;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.facet.util.emf.core.IBrowserRegistry;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.modisco.infra.discovery.ui.Activator;
import org.eclipse.modisco.jee.jsp.discoverer.AbstractJspDiscoverer;
import org.eclipse.modisco.jee.jsp.discoverer.DiscoverJspModelFromJavaElement;
import org.eclipse.modisco.jee.jsp.discoverer.DiscoverJspModelFromResource;
import org.eclipse.modisco.jee.jsp.discoverer.JspActivator;

/**
 * @deprecated use {@link DiscoverJspModelFromResource} or {@link DiscoverJspModelFromJavaElement}
 *             instead, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474894
 */
@Deprecated
public class DiscoverJspModelFromFile extends DefaultDiscoverer {

	private static List<DiscoveryParameter> parametersKeys = null;

	/**
	 * Method called when the user right clicks on a file to know whether to display this discoverer
	 */
	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		if (source instanceof IFile && ((IFile) source).exists()) {
			IFile myFile = (IFile) source;
			result = (myFile.getFileExtension() != null)
					&& AbstractJspDiscoverer.isJspExtension(myFile.getFileExtension());
		}
		return result;
	}

	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {

		Job job = new Job("discovering Jsp model") { //$NON-NLS-1$
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					final DiscoverJspModelFromResource delegateDiscoverer = new DiscoverJspModelFromResource();

					boolean serializeXMI = false;
					if (parameters != null
							&& parameters.get(DefaultDiscoverer.PARAMETER_SERIALIZE_XMI) != null) {
						serializeXMI = ((Boolean) parameters
								.get(DefaultDiscoverer.PARAMETER_SERIALIZE_XMI)).booleanValue();
					}
					boolean silent = false;
					if (parameters != null
							&& parameters.get(DefaultDiscoverer.PARAMETER_SILENT_MODE) != null) {
						silent = ((Boolean) parameters.get(DefaultDiscoverer.PARAMETER_SILENT_MODE))
								.booleanValue();
					}

					setResourceResult(null);
					delegateDiscoverer.setSerializeTarget(serializeXMI);

					if (source instanceof IFile) {
						IFile ifile = (IFile) source;
						IProject project = ifile.getProject();
						delegateDiscoverer.setTargetURI(URI.createPlatformResourceURI(project
								.getFullPath().append(project.getName())
								.addFileExtension("jspxmi").toOSString(), true)); //$NON-NLS-1$
						delegateDiscoverer.discoverElement(ifile, monitor);
					} else if (source instanceof File) {
						File file = (File) source;
						delegateDiscoverer.setTargetURI(URI.createFileURI(file.getAbsolutePath()
								.concat(".xmi"))); //$NON-NLS-1$
						delegateDiscoverer.discoverElement(file, monitor);
					} else {
						throw new IllegalArgumentException();
					}

					setResourceResult(delegateDiscoverer.getTargetModel());
					if (!silent && getResourceResult() != null) {
						IBrowserRegistry.INSTANCE.browseResource(getResourceResult());
					}
				} catch (Exception e) {
					MoDiscoLogger.logError(e, "An error occured during model discovery from " //$NON-NLS-1$
							+ source.toString(), JspActivator.getDefault());
				}
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		try {
			job.join();
		} catch (InterruptedException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}

		if (parameters != null) {
			parameters.put(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE, getResourceResult());
		}
	}

	public Resource discoverElement(final Object source, final URI target) {
		Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();

		parameters.put(DefaultDiscoverer.PARAMETER_SILENT_MODE, new Boolean(false));
		parameters.put(DefaultDiscoverer.PARAMETER_SERIALIZE_XMI, new Boolean(false));

		discoverElement(source, parameters);
		return (Resource) parameters.get(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
	}

	public List<DiscoveryParameter> getDiscovererParameters() {
		if (DiscoverJspModelFromFile.parametersKeys == null) {
			DiscoverJspModelFromFile.parametersKeys = new ArrayList<DiscoveryParameter>();
			DiscoverJspModelFromFile.parametersKeys.add(DefaultDiscoverer.PARAMETER_SILENT_MODE);
			DiscoverJspModelFromFile.parametersKeys
					.add(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
			DiscoverJspModelFromFile.parametersKeys.add(DefaultDiscoverer.PARAMETER_SERIALIZE_XMI);
		}
		return DiscoverJspModelFromFile.parametersKeys;
	}

}
