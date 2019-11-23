/**
 * *******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 */
package org.eclipse.modisco.kdm.source.extension.ui.utils;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.modisco.kdm.source.extension.CodeUnit2File;
import org.eclipse.modisco.omg.kdm.source.SourceRegion;

public final class Utils {

	/**
	 * Return the File which contain the sourceRegion
	 *
	 * @param sourceRegion
	 *            a sourceRegion we need to find an IFile for
	 * @return
	 */
	public static IFile getIFileFromSourceRegion(final SourceRegion sourceRegion) {
		if (BrowseCodeUtils.DEBUG) {
			System.out.println("Utils.getIFileFromASTNodeSourceRegion()"); //$NON-NLS-1$
		}
		String path = null;
		if (sourceRegion != null) {

			if (sourceRegion.eContainer() instanceof CodeUnit2File) {
				CodeUnit2File codeUnit2File = (CodeUnit2File) sourceRegion
						.eContainer();
				if (codeUnit2File.getFile() != null) {
					path = codeUnit2File.getFile().getPath();
				} else {
					if (BrowseCodeUtils.DEBUG) {
						System.out
								.println("=> codeUnit2File.getFile() is null"); //$NON-NLS-1$
					}
				}
			}

			if (path == null) {
				if (sourceRegion.getFile() != null) {
					path = sourceRegion.getFile().getPath();
				} else {
					if (BrowseCodeUtils.DEBUG) {
						System.out.println("=> sourceRegion.getFile() is null"); //$NON-NLS-1$
					}
				}
				// The path could be directly contained in the
				// ASTNodeSourceRegion
				if (path == null) {
					path = sourceRegion.getPath();
				}

			}
		} else {
			if (BrowseCodeUtils.DEBUG) {
				System.out.println("=> sourceRegion is null"); //$NON-NLS-1$
			}
		}

		if (path == null) {
			if (BrowseCodeUtils.DEBUG) {
				System.out.println("=> path is null"); //$NON-NLS-1$
			}
			return null;
		}
		IFile file = ResourcesPlugin.getWorkspace().getRoot()
				.getFileForLocation(new Path(path));
		return file;
	}

	private Utils() {
		// Not instantiable
	}
}
