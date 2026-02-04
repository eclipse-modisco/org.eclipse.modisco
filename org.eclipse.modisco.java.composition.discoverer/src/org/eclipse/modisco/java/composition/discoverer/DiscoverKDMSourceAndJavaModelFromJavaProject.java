/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.java.composition.discoverer;

import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.annotations.ParameterInitialValue;
import org.eclipse.modisco.java.discoverer.AbstractDiscoverJavaModelFromProject;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
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
public class DiscoverKDMSourceAndJavaModelFromJavaProject extends
		AbstractDiscoverKDMSourceAndJavaModel<IJavaProject> {

	public boolean isApplicableTo(final IJavaProject source) {
		return source.getProject().isAccessible();
	}

	@Override
	protected IProject getProject(final IJavaProject source) {
		return source.getProject();
	}

	@Override
	protected AbstractDiscoverJavaModelFromProject<IJavaProject> initJavaDiscoverer() {
		return new DiscoverJavaModelFromJavaProject();
	}

	@ParameterInitialValue(name = "ELEMENTS_TO_ANALYZE")
	public static ElementsToAnalyze getElementsToAnalyzeInitialValue(final IJavaProject source) {
		if (source == null) {
			return null;
		}
		return new ElementsToAnalyze(source);
	}
}