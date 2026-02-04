/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *    Grégoire Dupé (Mia-Software) - Bug 472194 - DiscoveryException in AbstractDiscoverer.discoverElement (70)
 *******************************************************************************/
package org.eclipse.modisco.java.composition.discoverer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.discovery.core.annotations.ParameterInitialValue;
import org.eclipse.modisco.java.discoverer.AbstractDiscoverJavaModelFromProject;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromProject;
import org.eclipse.modisco.java.discoverer.ElementsToAnalyze;

/**
 *
 * This Class provides a way of weaving a MoDisco Java Model with a MoDisco KDM Source one. Both
 * models are discovered independently and then read to weave some instances like Archive,
 * Compilation Unit ...
 *
 * See Help contents or http://wiki.eclipse.org/MoDisco/Components/Java/Composition
 *
 */
public class DiscoverKDMSourceAndJavaModelFromProject extends
		AbstractDiscoverKDMSourceAndJavaModel<IProject> {

	public boolean isApplicableTo(final IProject source) {
		boolean isJavaProject = false;
		try {
			isJavaProject = source.hasNature(JavaCore.NATURE_ID);
		} catch (CoreException e) {
			final String messages = String.format(
					"Something wrong happend when testing the nature of %s. We assum that this project is not a JDT (Java) project.", //$NON-NLS-1$
					source.getName()
				);
			Logger.logError(e, messages, Activator.getDefault());
		}
		return source.isAccessible() && isJavaProject;
	}

	@Override
	protected IProject getProject(final IProject source) {
		return source;
	}

	@Override
	protected AbstractDiscoverJavaModelFromProject<IProject> initJavaDiscoverer() {
		return new DiscoverJavaModelFromProject();
	}

	@ParameterInitialValue(name = "ELEMENTS_TO_ANALYZE")
	public static ElementsToAnalyze getElementsToAnalyzeInitialValue(final IProject source) {
		if (source == null) {
			return null;
		}
		return new ElementsToAnalyze(JavaCore.create(source));
	}
}