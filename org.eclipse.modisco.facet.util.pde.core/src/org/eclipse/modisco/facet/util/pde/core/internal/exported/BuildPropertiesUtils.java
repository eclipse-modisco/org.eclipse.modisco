/*******************************************************************************
 * Copyright (c) 2012, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 387470 - [EFacet][Custom] Editors
 *******************************************************************************/
package org.eclipse.modisco.facet.util.pde.core.internal.exported;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.pde.core.build.IBuildModel;
import org.eclipse.pde.core.plugin.IPluginModelBase;

/**
 * @since 0.3
 */
public final class BuildPropertiesUtils {

	private BuildPropertiesUtils() {
		// Must not be used
	}

	public static void addToBuild(final IFile file) throws CoreException {
		org.eclipse.modisco.facet.util.pde.core.internal.BuildPropertiesUtils
				.addToBuild(file);
	}

	public static IBuildModel getBuildModel(final IPluginModelBase model)
			throws CoreException {
		return org.eclipse.modisco.facet.util.pde.core.internal.BuildPropertiesUtils
				.getBuildModel(model);
	}
}
