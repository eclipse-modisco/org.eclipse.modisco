<<<<<<< HEAD   (3a7127 Bug 474680 - [Deprecated] org.eclipse.gmt.modisco.usecase.si)
=======
/*******************************************************************************
 * Copyright (c) 2008, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Hugo Bruneliere (INRIA) - initial API and implementation
 *    Sebastien Minguet (Mia-Software) - initial API and implementation
 *    Frederic Madiot (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.gmt.modisco.usecase.simpletransformationschain;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.gmt.modisco.java.actions.DiscoverKdmModelFromJavaProject;
import org.eclipse.gmt.modisco.kdm.uml2converter.KdmToUmlConverter;
import org.eclipse.gmt.modisco.kdm.uml2converter.impl.KdmtoUmlConverterImpl;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.BidirectionalAssociationDiscoverer;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.impl.BidirectionalAssociationDiscovererImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.m2m.atl.core.ATLCoreException;

/**
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *  cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474680
 */
@Deprecated
public class ModelplexKnowledgeDiscoveryFramework implements KnowledgeDiscoveryInterface {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain. KnowledgeDiscoveryInterface
	 * #getUML2ModelFromJavaSource(org.eclipse.jdt.core.IJavaProject,
	 * org.eclipse.emf.common.util.URI)
	 */
	public Resource getUML2ModelFromJavaSource(final IJavaProject javaProject,
			final URI umlTargetModelUri) throws ATLCoreException {
		Resource result = null;
		DiscoverKdmModelFromJavaProject javaDiscoverer = new DiscoverKdmModelFromJavaProject();
		KdmToUmlConverter uml2Converter = new KdmtoUmlConverterImpl();
		try {
			// File existingFile;
			// IPath intermediateJavaFilePath =
			// javaProject.getCorrespondingResource().getLocation().addTrailingSeparator().append(javaProject.getElementName()).addFileExtension("kdm");

			// existingFile = intermediateJavaFilePath.toFile();
			// if (existingFile.exists()) {
			// existingFile.delete();
			// }

			String kdmModelPath = umlTargetModelUri.trimFileExtension()
					.appendFileExtension("kdm").toFileString(); //$NON-NLS-1$
			// existingFile = new File(kdmModelPath);
			// if (existingFile.exists()) {
			// existingFile.delete();
			// }

			// String umlModelPath = umlTargetModelUri.toFileString();
			// existingFile = new File(umlModelPath);
			// if (existingFile.exists()) {
			// existingFile.delete();
			// }
			javaProject.getCorrespondingResource().refreshLocal(1, null);

			Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
			parameters.put(DefaultDiscoverer.PARAMETER_SILENT_MODE, Boolean.TRUE);
			parameters.put(DefaultDiscoverer.PARAMETER_BROWSE_RESULT, Boolean.FALSE);
			javaDiscoverer.discoverElement(javaProject, parameters);
			Resource kdmModel = (Resource) parameters
					.get(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
			// Resource kdmModel = javaDiscoverer.discoverElement(javaProject,
			// (URI) null);
			javaProject.getCorrespondingResource().refreshLocal(1, null);
			kdmModel.setURI(URI.createFileURI(kdmModelPath));
			kdmModel.save(null);
			javaProject.getCorrespondingResource().refreshLocal(1, null);

			Resource[] convertedModels = uml2Converter.getUML2ModelFromKDMModel(kdmModel, false,
					umlTargetModelUri);
			// System.out.println("verification of the UML model: " +
			// ((convertedModels != null) && (convertedModels.length>0)));
			if ((convertedModels != null) && (convertedModels.length > 0)) {
				result = convertedModels[0];
			}
			javaProject.getCorrespondingResource().refreshLocal(1, null);
		} catch (IOException e) {
			MoDiscoLogger.logError(e, ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
		} catch (JavaModelException e) {
			MoDiscoLogger.logError(e, ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain. KnowledgeDiscoveryInterface
	 * #detectPatternsFromJavaSource(org.eclipse.jdt.core.IJavaProject,
	 * org.eclipse.emf.ecore.resource.Resource, org.eclipse.core.resources.IFile)
	 */
	public Resource detectPatternsFromJavaSource(final IJavaProject javaProject,
			final Resource patternModel, final IFile patternDetectionRules) {
		/*
		 * TODO Not implemented yet
		 */
		return null;
	}

	/**
	 * @param csharpProject
	 * @param patternModel
	 * @param patternDetectionRules
	 * @return
	 */
	public Resource detectPatternsFromCSharpSource(final IFolder csharpProject,
			final Resource patternModel, final IFile patternDetectionRules) {
		/*
		 * TODO Not implemented yet
		 */
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.usecase.simpletransformationschain. KnowledgeDiscoveryInterface
	 * #detectBidirectionalAssociationsInUmlModel(org. eclipse.core.resources.IFile,
	 * org.eclipse.emf.common.util.URI)
	 */
	public Resource detectBidirectionalAssociationsInUmlModel(final IFile sourceModel,
			final URI umlTargetModelUri) throws ATLCoreException {
		final BidirectionalAssociationDiscoverer discoverer = new BidirectionalAssociationDiscovererImpl();
		Resource result = null;
		URI umlSourceUri = URI.createPlatformResourceURI(sourceModel.getFullPath().toString(),
				false);
		URI umlTargetUri = null;
		if (umlTargetModelUri != null) {
			umlTargetUri = umlTargetModelUri;
		} else {
			umlTargetUri = umlSourceUri;
		}
		discoverer.discoverBidirectionalAssociations(umlSourceUri, umlTargetUri);
		try {
			result = ModelUtils.loadModel(umlTargetUri);
		} catch (IOException e) {
			MoDiscoLogger.logError(e, ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
		}
		return result;
	}

}
>>>>>>> BRANCH (6b51ed Merge remote-tracking branch 'origin/maintenance-0.13')
