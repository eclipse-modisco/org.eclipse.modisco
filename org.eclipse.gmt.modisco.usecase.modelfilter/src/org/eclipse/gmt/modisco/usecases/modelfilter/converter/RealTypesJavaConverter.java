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
 */

package org.eclipse.gmt.modisco.usecases.modelfilter.converter;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmt.modisco.infra.common.core.internal.logging.MoDiscoLogHandler;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.gmt.modisco.java.actions.DiscoverKdmModelFromJavaProject;
import org.eclipse.gmt.modisco.kdm.uml2converter.KdmToUmlConverter;
import org.eclipse.gmt.modisco.kdm.uml2converter.impl.KdmtoUmlConverterImpl;
import org.eclipse.gmt.modisco.usecases.modelfilter.ModelFilterActivator;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.m2m.atl.common.ATLLogger;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public class RealTypesJavaConverter {

	private final Logger logger = Logger.getLogger(ATLLogger.LOGGER_ID);
	private final IJavaProject javaProject;
	private final IPath path;
	private final URL umlTransformation;

	public RealTypesJavaConverter(final IJavaProject javaProjectParameter)
			throws JavaModelException {
		this.javaProject = javaProjectParameter;

		this.path = this.javaProject.getCorrespondingResource().getLocation()
				.addTrailingSeparator().append(this.javaProject.getElementName());
		this.umlTransformation = this.getClass().getResource("transformations/RealTypeUML.asm"); //$NON-NLS-1$
	}

	public Resource convertJavaProjectToUml2() throws JavaModelException {
		Resource result = null;

		final IPath logPath = this.path.addFileExtension("log"); //$NON-NLS-1$
		final IPath kdmModelPath = this.path.addFileExtension("kdm"); //$NON-NLS-1$
		final IPath umlModelPath = this.javaProject.getCorrespondingResource().getLocation()
				.addTrailingSeparator()
				.append(this.javaProject.getElementName() + "RealTypes").addFileExtension("uml"); //$NON-NLS-1$ //$NON-NLS-2$

		// transformations chain

		MoDiscoLogHandler logHandler = new MoDiscoLogHandler(logPath.toString());
		RealTypesJavaConverter.this.logger.addHandler(logHandler);
		try {
			/* first step */
			URI kdmModelUri = URI.createFileURI(kdmModelPath.toString());

			/*
			 * We will make a specific treatment to improve performances: global reverse of project
			 * should be done only once. So, if it already exists, we will use the kdm model located
			 * on the root of the project, other else we have to create it.
			 */
			// for compatibility reason, we have to check that java model
			// has been correctly loaded ...
			if (kdmModelPath.toFile().exists()) {
				try {
					ResourceSet resourceSet = new ResourceSetImpl();
					resourceSet.getResource(kdmModelUri, true);
				} catch (Exception ioe) {
					kdmModelPath.toFile().delete();
				}
			}
			boolean forceUmlTransformation = false;
			if (!kdmModelPath.toFile().exists()) {
				forceUmlTransformation = true;
				DiscoverKdmModelFromJavaProject javaDiscoverer = new DiscoverKdmModelFromJavaProject();
				Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
				parameters.put(DefaultDiscoverer.PARAMETER_SILENT_MODE, true);
				javaDiscoverer.discoverElement(this.javaProject, parameters);
				// for instance, the uri of kdm model has been statically computed from name of java
				// project
			}

			/* second step */
			KdmToUmlConverter converter = new KdmtoUmlConverterImpl();
			URI outputURI = URI.createFileURI(URI.decode(umlModelPath.toString()));
			forceUmlTransformation = forceUmlTransformation || (!umlModelPath.toFile().exists());
			if (forceUmlTransformation) {
				converter.getUML2ModelFromKDMModelWithCustomTransformation(kdmModelUri, false,
						RealTypesJavaConverter.this.umlTransformation, outputURI);

				/* third step, management of bidirectional links */
				BidirectionalUmlConverter wgConverter = new BidirectionalUmlConverter();
				wgConverter.manageBidirectionalAssociations(outputURI);
			}

			// load result resources ...
			result = ModelUtils.loadModel(outputURI);
		} catch (Exception e) {
			MoDiscoLogger.logError(e, ModelFilterActivator.getDefault());
		}

		RealTypesJavaConverter.this.logger.removeHandler(logHandler);
		logHandler.close();
		try {
			RealTypesJavaConverter.this.javaProject.getCorrespondingResource().refreshLocal(1,
					new NullProgressMonitor());
		} catch (Exception e1) {
			MoDiscoLogger.logError(e1, ModelFilterActivator.getDefault());
		}
		return result;
	}
}
