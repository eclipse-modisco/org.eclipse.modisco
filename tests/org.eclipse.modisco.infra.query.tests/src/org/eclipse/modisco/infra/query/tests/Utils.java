/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.query.tests;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;

/**
 * @author Gregoire DUPE (Mia-Software)
 * 
 */
public final class Utils {
	private Plugin plugin;

	public Utils(final Plugin plugin) {
		this.plugin = plugin;
	}

	public EPackage getEcorePackage() {
		URI ecoreMmUri = URI.createURI("http://www.eclipse.org/emf/2002/Ecore"); //$NON-NLS-1$
		Resource ecoreMmResource = new ResourceSetImpl().getResource(
				ecoreMmUri, true);
		return (EPackage) ecoreMmResource.getContents().get(0);
	}

	public IProject createProject(final String projectName) throws Exception {
		return ProjectUtils.createTestProject(projectName, this.plugin
				.getBundle(), "."); //$NON-NLS-1$
	}
}
