/*******************************************************************************
 * Copyright (c) 2008, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public final class PathUtils {

	private PathUtils() {
		// Nothing
	}

	/**
	 * Get a file from a Workspace project or an installed bundle.
	 *
	 * @param resourcePath
	 *            path to the file. The first segment is the project name or
	 *            bundle id.
	 * @return an input stream on the file or <code>null</code> if not found
	 */
	public static InputStream getResourceStream(final IPath resourcePath) {
		if (resourcePath.segmentCount() < 2) {
			return null;
		}

		String bundleID = resourcePath.segment(0);
		IPath path = resourcePath.removeFirstSegments(1);

		// first, look in a Workspace project
		IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(resourcePath);
		if (resource instanceof IFile) {
			IFile file = (IFile) resource;
			try {
				return file.getContents();
			} catch (CoreException e) {
				return null;
			}
		}

		// then if that fails, look in installed bundles
		Bundle bundle = Platform.getBundle(bundleID);
		if (bundle == null) {
			return null;
		}

		URL resourceURL = bundle.getResource(path.toString());
		if (resourceURL == null) {
			return null;
		}
		try {
			return resourceURL.openStream();
		} catch (IOException e) {
			return null;
		}
	}
}
