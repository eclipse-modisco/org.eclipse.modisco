/**
 * Copyright (c) 2011, 2026 Mia-Software and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *  Gr�goire Dup� (Soft-Maint) - Bug 387470 - [EFacet][Custom] Editors
 */
package org.eclipse.modisco.facet.util.pde.core.internal.exported;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.modisco.common.core.files.ProjectUtils;
import org.eclipse.modisco.facet.util.core.internal.exported.IFilter;
import org.osgi.framework.Bundle;

/**
 * @since 0.4
 */
@Deprecated /* not used */
public final class PluginUtils {

	private PluginUtils() {
		// Must not be used.
	}

	@Deprecated /* not used */
	public static boolean isInPluginProject(final IPath path)
			throws CoreException {
		return org.eclipse.modisco.facet.util.pde.core.internal.PluginUtils
				.isInPluginProject(path);
	}

	@Deprecated /* not used */
	public static void register(final IFile file,
			final String extensionPointId, final String elementName) {
		org.eclipse.modisco.facet.util.pde.core.internal.PluginUtils.register(file,
				extensionPointId, elementName);
	}

	@Deprecated /* not used */
	public static boolean isRegistered(final IFile iFile,
			final String extensionPointId) {
		return org.eclipse.modisco.facet.util.pde.core.internal.PluginUtils
				.isRegistered(iFile, extensionPointId);
	}

	@Deprecated /* not used */
	public static void configureAsPluginProject(final IProject project)
			throws CoreException, IOException {
		org.eclipse.modisco.facet.util.pde.core.internal.PluginUtils
				.configureAsPluginProject(project);
	}

	@Deprecated /* not used */
	public static boolean isPluginProject(final IProject project)
			throws CoreException {
		return org.eclipse.modisco.facet.util.pde.core.internal.PluginUtils
				.isPluginProject(project);
	}

	@Deprecated /* not used */
	public static IProject importPlugin(final Bundle bundle, final IFilter<String> filter) throws CoreException, IOException {
		return ProjectUtils.importPlugin(bundle, new org.eclipse.modisco.common.core.files.IFilter()
		{
			@Override
			public boolean filter(Object object) {
				return filter.filter((String) object);
			}
		});
	}

	@Deprecated /* not used */
	public static IProject importPlugin(final Bundle bundle) throws CoreException, IOException {
		return ProjectUtils.importPlugin(bundle);
	}
}
