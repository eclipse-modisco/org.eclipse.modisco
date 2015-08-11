/*******************************************************************************
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

package org.eclipse.gmt.modisco.usecase.simpletransformationschain;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.m2m.atl.core.ATLCoreException;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *  cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474680
 */
@Deprecated
public interface KnowledgeDiscoveryInterface {

	public Resource getUML2ModelFromJavaSource(IJavaProject javaProject, URI umlTargetModelUri)
			throws ATLCoreException;

	public Resource detectPatternsFromJavaSource(IJavaProject javaProject, Resource patternModel,
			IFile patternDetectionRules);

	public Resource detectBidirectionalAssociationsInUmlModel(IFile sourceModel,
			URI umlTargetModelUri) throws ATLCoreException;

}