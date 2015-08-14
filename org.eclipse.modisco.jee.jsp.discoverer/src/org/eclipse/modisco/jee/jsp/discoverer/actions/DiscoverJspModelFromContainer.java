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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.facet.util.emf.core.IBrowserRegistry;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.jdt.core.IPackageFragment;
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
public class DiscoverJspModelFromContainer extends DefaultDiscoverer {

	private static List<DiscoveryParameter> parametersKeys = null;

	/**
	 * Method called when the user right click on a file to know whether or not displaying this
	 * discoverer
	 */
	public boolean isApplicableTo(final Object source) {
		if (source instanceof IFolder) {
			return true;
		} else if (source instanceof IPackageFragment) {
			return true;
		}
		return false;
	}

	/**
	 * This method retrieves the project, lists all JSP files in it and creates a first model. Then
	 * it matches every Node with the Modisco JSP Model.
	 */
	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {

		Job job = new Job("discovering Jsp model") { //$NON-NLS-1$
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					final AbstractJspDiscoverer<?> delegateDiscoverer;
					if (source instanceof IFolder) {
						delegateDiscoverer = new DiscoverJspModelFromResource();
						IProject project = ((IFolder) source).getProject();
						delegateDiscoverer.setTargetURI(URI.createPlatformResourceURI(project
								.getFullPath().append(project.getName())
								.addFileExtension("jspxmi").toOSString(), true)); //$NON-NLS-1$
					} else if (source instanceof IPackageFragment) {
						delegateDiscoverer = new DiscoverJspModelFromJavaElement();
						IProject project = ((IPackageFragment) source).getResource().getProject();
						delegateDiscoverer.setTargetURI(URI.createPlatformResourceURI(project
								.getFullPath().append(project.getName())
								.addFileExtension("jspxmi").toOSString(), true)); //$NON-NLS-1$
					} else {
						throw new IllegalArgumentException();
					}

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
					@SuppressWarnings("unchecked")
					AbstractJspDiscoverer<Object> delegateDiscovererObj = ((AbstractJspDiscoverer<Object>) delegateDiscoverer);
					delegateDiscovererObj.discoverElement(source, new NullProgressMonitor());

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

	/**
	 * Discovers a generic Java Server Pages model and open MoDisco editor or default editor. This
	 * discoverer does not create additional physical artifacts.
	 * 
	 * @param source
	 *            a IFile instance pointing Container
	 * @param target
	 *            should be null here.
	 */
	public Resource discoverElement(final Object source, final URI target) {
		Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();

		parameters.put(DefaultDiscoverer.PARAMETER_SILENT_MODE, new Boolean(false));
		parameters.put(DefaultDiscoverer.PARAMETER_SERIALIZE_XMI, new Boolean(false));

		discoverElement(source, parameters);
		return (Resource) parameters.get(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
	}

	public List<DiscoveryParameter> getDiscovererParameters() {
		if (DiscoverJspModelFromContainer.parametersKeys == null) {
			DiscoverJspModelFromContainer.parametersKeys = new ArrayList<DiscoveryParameter>();
			DiscoverJspModelFromContainer.parametersKeys
					.add(DefaultDiscoverer.PARAMETER_SILENT_MODE);
			DiscoverJspModelFromContainer.parametersKeys
					.add(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
			DiscoverJspModelFromContainer.parametersKeys
					.add(DefaultDiscoverer.PARAMETER_SERIALIZE_XMI);
		}
		return DiscoverJspModelFromContainer.parametersKeys;
	}

}
