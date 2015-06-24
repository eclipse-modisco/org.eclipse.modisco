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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.gmt.modisco.java.actions.DiscoverJavaModelFromJavaProject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public class JavaConverter {

	private final IJavaProject javaProject;
	private final IPath path;

	public JavaConverter(final IJavaProject javaProjectParameter) throws JavaModelException {
		this.javaProject = javaProjectParameter;

		this.path = this.javaProject.getCorrespondingResource().getLocation()
				.addTrailingSeparator().append(this.javaProject.getElementName());

	}

	public Resource convertJavaProjectToJavaModel() {
		Resource result = null;

		final IPath javaModelPath = this.path.addFileExtension("javaxmi"); //$NON-NLS-1$

		/* first step */
		URI javaModelUri = URI.createFileURI(javaModelPath.toString());

		/*
		 * We will make a specific treatment to improve performances: global reverse of project
		 * should be done only once. So, if it already exists, we will use the java model located on
		 * the root of the project, other else we have to create it.
		 */
		// for compatibility reason, we have to check that java model
		// has been correctly loaded ...
		if (javaModelPath.toFile().exists()) {
			try {
				ResourceSet resourceSet = new ResourceSetImpl();
				result = resourceSet.getResource(javaModelUri, true);
			} catch (Exception ioe) {
				javaModelPath.toFile().delete();
			}
		}
		if (!javaModelPath.toFile().exists()) {
			DiscoverJavaModelFromJavaProject javaDiscoverer = new DiscoverJavaModelFromJavaProject();
			Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
			parameters.put(DefaultDiscoverer.PARAMETER_SILENT_MODE, new Boolean(true));
			javaDiscoverer.discoverElement(this.javaProject, parameters);
			result = (Resource) parameters.get(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);

		}
		return result;
	}

}
