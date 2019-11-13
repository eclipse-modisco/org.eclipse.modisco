/*******************************************************************************
 * Copyright (c) 2017 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 516254 - CatalogManager must not return workspace entries from closed project
 *    Thomas Cicognani (Mia-Software) - Bug 521883 - Cannot get IProject from URI if name contains spaces
 *******************************************************************************/
package org.eclipse.emf.facet.util.emf.core.internal.catalog.v2;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public final class EmfUtils {

	private EmfUtils() {
		// Must not be used
	}

	public static boolean isDataAccessible(final EObject eObject) {
		boolean result = true;
		final URI uri = EcoreUtil.getURI(eObject);
		if (uri.isPlatformResource()) {
			final IProject project = getProject(uri);
			result = project.isOpen();
		}
		return result;
	}

	public static IProject getProject(final URI uri) {
		IProject result = null;
		final String prjName = uri.segment(1);
		result = getProject(prjName);
		if (result == null || !result.exists()) {
			final String decodedPrjName = URI.decode(prjName);
			result = getProject(decodedPrjName);
		}
		return result;
	}

	private static IProject getProject(final String prjName) {
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IWorkspaceRoot root = workspace.getRoot();
		return root.getProject(prjName);
	}
}
