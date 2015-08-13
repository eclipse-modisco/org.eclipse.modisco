/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.gmt.modisco.kdm.uml2converter;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IModel;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=474827
 */
@Deprecated
public interface KdmToUmlConverter {

	/**
	 * Conversion from KDM to UML
	 * 
	 * @param kdmModelUri
	 * @param generateTraces
	 * @return a Resource Array: first Resource is the output model resource, second one is the
	 *         trace (can be null)
	 * @throws IOException
	 * @throws ATLCoreException
	 */
	public Resource[] getUML2ModelFromKDMModel(Resource kdmModelUri, boolean generateTraces,
			URI umlTargetModelUri) throws IOException, ATLCoreException;

	/**
	 * Conversion from KDM to UML
	 * 
	 * @param kdm_Model
	 * @param generateTraces
	 * @return a Resource Array: first Resource is the output model resource, second one is the
	 *         trace (can be null)
	 * @throws IOException
	 * @throws ATLCoreException
	 */
	public Resource[] getUML2ModelFromKDMModelWithCustomTransformation(URI kdmSourceModelUri,
			boolean generateTraces, final URL transformation, URI umlTargetModelUri)
			throws IOException, ATLCoreException;

	public void exportKdmToUmlTransformation(final IPath pathParameter);

	public IFile instrumentAtlTranformationWithTraceability(InputStream sourceTransformation,
			URI atlFileUri) throws ATLCoreException;

	public IFile parseFromModel(final IModel transformationModel, URI atlFileUri)
			throws IOException;

}