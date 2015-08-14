/*********************************************************************************
 * Copyright (c) 2010,2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - adapted to new discovery framework
 *********************************************************************************/
package org.eclipse.modisco.jee.webapp.discoverer.actions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.facet.util.emf.core.IBrowserRegistry;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.modisco.infra.discovery.ui.Activator;
import org.eclipse.modisco.jee.actions.DeploymentDescriptorDiscoverer;
import org.eclipse.modisco.jee.webapp.discoverer.WebXmlActivator;
import org.eclipse.modisco.jee.webapp.discoverer.WebXmlDiscoverer2;

/**
 * Discover web.xml generic model action.
 * 
 * @deprecated use {@link WebXmlDiscoverer2} instead, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=474893
 */
@Deprecated
public class WebXmlDiscoverer extends DeploymentDescriptorDiscoverer {

	private static String rootName = "web-app"; //$NON-NLS-1$		
	private static String dtdUrl = "http://java.sun.com/"; //$NON-NLS-1$	
	private static List<DiscoveryParameter> parametersKeys = null;

	private final WebXmlDiscoverer2 delegateDiscoverer = new WebXmlDiscoverer2();

	protected WebXmlDiscoverer2 getDelegateDiscoverer() {
		return this.delegateDiscoverer;
	}

	public boolean isApplicableTo(final Object source) {
		if (source instanceof IFile) {
			IFile iFile = (IFile) source;
			return getDelegateDiscoverer().isApplicableTo(iFile);
		}
		return false;
	}

	/**
	 * Discovers a generic WebXml model.
	 * 
	 * @param source
	 *            can be a workspace IFile or a java.io.File instance pointing
	 *            WebXml contents
	 * @param parameters
	 *            <ul>
	 *            <li>PARAMETER_SILENT_MODE : IN parameter; if is not set or set
	 *            to <code>false</code>, the discovered model will be opened in
	 *            an editor.
	 *            <li>PARAMETER_SERIALIZE_XMI :see
	 *            {@link XMLModelDiscoverer#PARAMETER_SERIALIZE_XMI}
	 *            <li>PARAMETER_TARGET_RESOURCE : OUT parameter; the discovered
	 *            model is stored with this key.
	 *            </ul>
	 */
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {

		Job job = new Job("discovering EjbJar model") { //$NON-NLS-1$
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					boolean serializeXMI = false;
					if (parameters != null
							&& parameters
									.get(DeploymentDescriptorDiscoverer.PARAMETER_SERIALIZE_XMI) != null) {
						serializeXMI = ((Boolean) parameters
								.get(DeploymentDescriptorDiscoverer.PARAMETER_SERIALIZE_XMI))
								.booleanValue();
					}
					boolean silent = false;
					if (parameters != null
							&& parameters.get(DeploymentDescriptorDiscoverer.PARAMETER_SILENT_MODE) != null) {
						silent = ((Boolean) parameters
								.get(DeploymentDescriptorDiscoverer.PARAMETER_SILENT_MODE))
								.booleanValue();
					}

					setResourceResult(null);
					getDelegateDiscoverer().setSerializeTarget(serializeXMI);

					if (source instanceof IFile) {
						IFile iFile = (IFile) source;
						getDelegateDiscoverer().setTargetURI(
								URI.createFileURI(iFile.getLocation()
										.addFileExtension(".xmi").toOSString())); //$NON-NLS-1$
						getDelegateDiscoverer().discoverElement(iFile, monitor);
					} else if (source instanceof File) {
						File file = (File) source;
						getDelegateDiscoverer().setTargetURI(
								URI.createFileURI(file.getAbsolutePath().concat(".xmi"))); //$NON-NLS-1$
						getDelegateDiscoverer().discoverElement(file, monitor);
					} else {
						throw new IllegalArgumentException("source is not a File or IFile"); //$NON-NLS-1$
					}

					setResourceResult(getDelegateDiscoverer().getTargetModel());
					if (!silent && getResourceResult() != null) {
						IBrowserRegistry.INSTANCE.browseResource(getResourceResult());
					}
				} catch (Exception e) {
					IStatus result = new Status(IStatus.ERROR, WebXmlActivator.PLUGIN_ID,
							"An error occured during model discovery from " //$NON-NLS-1$
									+ source.toString(), e);
					WebXmlActivator.getDefault().getLog().log(result);
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
			parameters.put(DeploymentDescriptorDiscoverer.PARAMETER_TARGET_RESOURCE,
					getResourceResult());
		}
	}

	public List<DiscoveryParameter> getDiscovererParameters() {
		if (WebXmlDiscoverer.parametersKeys == null) {
			WebXmlDiscoverer.parametersKeys = new ArrayList<DiscoveryParameter>();
			WebXmlDiscoverer.parametersKeys
					.add(DeploymentDescriptorDiscoverer.PARAMETER_SILENT_MODE);
			WebXmlDiscoverer.parametersKeys
					.add(DeploymentDescriptorDiscoverer.PARAMETER_TARGET_RESOURCE);
			WebXmlDiscoverer.parametersKeys
					.add(DeploymentDescriptorDiscoverer.PARAMETER_SERIALIZE_XMI);
		}
		return WebXmlDiscoverer.parametersKeys;
	}

	public static String getDtdUrl() {
		return WebXmlDiscoverer.dtdUrl;
	}

	public static String getRootName() {
		return WebXmlDiscoverer.rootName;
	}

}
