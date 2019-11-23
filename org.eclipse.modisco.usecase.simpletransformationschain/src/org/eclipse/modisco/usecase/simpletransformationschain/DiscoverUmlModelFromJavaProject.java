/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.modisco.usecase.simpletransformationschain;

import java.net.URL;
import java.util.logging.Logger;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.m2m.atl.common.ATLLogger;
import org.eclipse.modisco.infra.common.core.internal.logging.MoDiscoLogHandler;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.discoverer.DiscoverKDMModelFromJavaProject;
import org.eclipse.modisco.kdm.uml2converter.internal.KdmToUmlConverter;

public class DiscoverUmlModelFromJavaProject extends AbstractModelDiscoverer<IJavaProject> {

	private static final String MODEL_FILE_SUFFIX = ".uml"; //$NON-NLS-1$

	private URL customTransformation = null;

	@Parameter(name = "CUSTOM_TRANSFORMATION", description = "A URL pointing to an ATL transformation that will be used instead of the default one.")
	public void setCustomTransformation(final URL customTransformation) {
		this.customTransformation = customTransformation;
	}

	protected URL getCustomTransformation() {
		return this.customTransformation;
	}

	public boolean isApplicableTo(final IJavaProject source) {
		return source.getProject().isAccessible();
	}

	static Resource getUML2ModelFromJavaProject(final IJavaProject javaProject,
			final URL customTransformation) throws DiscoveryException {
		Resource result = null;
		DiscoverKDMModelFromJavaProject kdmDiscoverer = new DiscoverKDMModelFromJavaProject();
		KdmToUmlConverter uml2Converter = new KdmToUmlConverter();
		try {
			kdmDiscoverer.discoverElement(javaProject, new NullProgressMonitor());
			Resource kdmModel = kdmDiscoverer.getTargetModel();
			Resource[] convertedModels;
			if (customTransformation == null) {
				convertedModels = uml2Converter.getUML2ModelFromKDMModel(kdmModel, false);
			} else {
				convertedModels = uml2Converter.getUML2ModelFromKDMModelWithCustomTransformation(
						kdmModel, false, customTransformation);
			}
			if ((convertedModels != null) && (convertedModels.length > 0)) {
				result = convertedModels[0];
			}
		} catch (Exception e) {
			throw new DiscoveryException(e);
		}
		return result;
	}

	@Override
	protected void basicDiscoverElement(final IJavaProject source, final IProgressMonitor monitor)
			throws DiscoveryException {
		IProject project = source.getProject();
		setDefaultTargetURI(URI.createPlatformResourceURI(
				project.getFullPath().append(project.getName())
						+ DiscoverUmlModelFromJavaProject.MODEL_FILE_SUFFIX, true));
		final Logger logger = Logger.getLogger(ATLLogger.LOGGER_ID);
		final MoDiscoLogHandler logHandler = new MoDiscoLogHandler(project.getLocation()
				.append(project.getName()).toString()
				+ ".log"); //$NON-NLS-1$
		logger.addHandler(logHandler);
		try {
			Resource uml2Model = getUML2ModelFromJavaProject(source, getCustomTransformation());
			setTargetModel(uml2Model);
		} catch (Exception e) {
			throw new DiscoveryException(e);
		} finally {
			logger.removeHandler(logHandler);
			logHandler.close();
		}
	}
}
