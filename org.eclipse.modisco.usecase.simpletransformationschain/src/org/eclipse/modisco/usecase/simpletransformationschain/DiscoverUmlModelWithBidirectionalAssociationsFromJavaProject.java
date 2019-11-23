/**
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.modisco.usecase.simpletransformationschain;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.m2m.atl.common.ATLLogger;
import org.eclipse.modisco.infra.common.core.internal.logging.MoDiscoLogHandler;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.kdm.uml2converter.internal.KdmToUmlConverter;
import org.eclipse.modisco.util.atl.core.internal.AtlLaunchHelper;
import org.eclipse.modisco.util.atl.core.internal.AtlLaunchHelper.ModelInfo;

public class DiscoverUmlModelWithBidirectionalAssociationsFromJavaProject extends
		AbstractModelDiscoverer<IJavaProject> {

	private static final String MODEL_FILE_SUFFIX = "_BidirectionalAssociations.uml"; //$NON-NLS-1$

	private static final String UML_MM_URI = "http://www.eclipse.org/uml2/2.1.0/UML"; //$NON-NLS-1$

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

	@Override
	protected void basicDiscoverElement(final IJavaProject source, final IProgressMonitor monitor)
			throws DiscoveryException {
		IProject project = source.getProject();
		setDefaultTargetURI(URI.createPlatformResourceURI(
				project.getFullPath().append(project.getName()) + DiscoverUmlModelWithBidirectionalAssociationsFromJavaProject.MODEL_FILE_SUFFIX, true));
		final Logger logger = Logger.getLogger(ATLLogger.LOGGER_ID);
		final MoDiscoLogHandler logHandler = new MoDiscoLogHandler(project.getLocation()
				.append(project.getName()).toString()
				+ ".log"); //$NON-NLS-1$
		logger.addHandler(logHandler);
		try {
			Resource uml2Model = DiscoverUmlModelFromJavaProject.getUML2ModelFromJavaProject(
					source, getCustomTransformation());

			final List<ModelInfo> inputModels = new ArrayList<ModelInfo>();
			final List<ModelInfo> outputModels = new ArrayList<ModelInfo>();
			final ModelInfo inputModel = new ModelInfo(
					"umlInput", uml2Model.getURI(), uml2Model, "uml", //$NON-NLS-1$ //$NON-NLS-2$
					URI.createURI(DiscoverUmlModelWithBidirectionalAssociationsFromJavaProject.UML_MM_URI));
			inputModels.add(inputModel);
			final ModelInfo outputModel = new ModelInfo(
					"umlOutput", URI.createURI("memory://umlTargetModel"), null, "uml", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					URI.createURI(KdmToUmlConverter.UML_MM_URI));
			outputModels.add(outputModel);

			AtlLaunchHelper atlHelper = new AtlLaunchHelper();
			final URL transformation = this.getClass().getResource("transformations/UML2Copy.asm"); //$NON-NLS-1$
			final URL superimposedTransformation = this.getClass().getResource(
					"transformations/BidirectionalAssociation.asm"); //$NON-NLS-1$
			ArrayList<URL> superimposedTransformations = new ArrayList<URL>();
			superimposedTransformations.add(superimposedTransformation);
			List<Resource> results = atlHelper.runTransformation(transformation, inputModels,
					outputModels, superimposedTransformations);

			if (results.size() > 0) {
				setTargetModel(results.get(0));
			}
		} catch (Exception e) {
			throw new DiscoveryException(e);
		} finally {
			logger.removeHandler(logHandler);
			logHandler.close();
		}
	}
}
