/*******************************************************************************
 * Copyright (c) 2008, 2009, 2026 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Guyomar (Mia-Software) - Bug 340339 - Need some Utils class for Folder/File/Project management
 *    Nicolas Guyomar (Mia-Software) - Bug 342451 - To be able to edit derived facet attributes and derived facet references in a table
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Thomas Cicognani (Soft-Maint) - Bug 398079 - org.eclipse.modisco.facet.util.core.internal.exported.FileUtils.copyFolderFromBundle 
 *******************************************************************************/
package org.eclipse.modisco.facet.util.core.internal.exported;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.osgi.framework.Bundle;

/**
 * @since 0.2
 */
@Deprecated /* @deprecated use org.eclipse.modisco.common.core.files.FileUtils, or org.eclipse.modisco.common.tests.TestFileUtils */
public final class FileUtils extends org.eclipse.modisco.common.core.files.FileUtils
{
	private FileUtils() {
		// Nothing
	}
	
	/**
	 * Copy a folder contents from a bundle
	 * 
	 * @param folderPath
	 *            Folder path to copy
	 * @param project
	 *            Copy folder into this {@link IProject}
	 * @param destinationPath
	 *            Destination path
	 * @param bundleContainingResources
	 *            Bundle which has resources to copy
	 * @param recurse
	 *            <code>true</code> to copy recursively
	 * @throws IOException
	 * @throws CoreException
	 * @since 0.3
	 */
	@Deprecated /* @deprecated not used - use TestFileUtils */
	public static void copyFolderFromBundle(final String folderPath, final IProject project,
			final String destinationPath, final Bundle bundleContainingResources, final boolean recurse) throws Exception {
		@SuppressWarnings("unchecked")
		// @SuppressWarnings("unchecked") findEntries returns a raw type.
		final Enumeration<URL> files = bundleContainingResources.findEntries(folderPath, "*.*", recurse); //$NON-NLS-1$
		while (files.hasMoreElements()) {
			final URL element = files.nextElement();
			String filename = element.getFile().replace(folderPath, ""); //$NON-NLS-1$
			if (!filename.startsWith("/")) { //$NON-NLS-1$
				filename = "/" + filename; //$NON-NLS-1$
			}
			copyFileFromBundle(element.getFile(), project, destinationPath + filename, bundleContainingResources);
			org.eclipse.modisco.common.core.files.FileUtils.copyFileFromBundle(bundleContainingResources, element.getFile(), project, destinationPath + filename);
		}
	}

	@Deprecated /* @deprecated not used - use TestFileUtils */
	public static IFile copyFileFromBundle(final String sourcePath, final IProject project,
			final String destinationPath, final Bundle bundleContainingResources) throws Exception {
		return org.eclipse.modisco.common.core.files.FileUtils.copyFileFromBundle(bundleContainingResources, sourcePath, project, destinationPath);
	}
}
