/*******************************************************************************
 * Copyright (c) 2009, 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.uicore.internal.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;

/**
 * General utility functions
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public final class Util {

	private Util() {
		// make this class non-instantiable
	}

	/**
	 * Build a valid Windows filename from the given name (replaces invalid
	 * characters by underscores)
	 *
	 * @param name
	 *            a non-empty name that can contain illegal file name characters
	 * @return a valid Windows filename
	 */
	public static String deriveSanitizedFileName(final String name) {
		if (name.length() == 0) {
			throw new IllegalArgumentException("name is empty"); //$NON-NLS-1$
		}

		final char[] invalidCharacters = new char[] { '\\', '/', ':', '*', '?', '\"', '<', '>', '|' };

		final StringBuilder result = new StringBuilder();

		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);

			for (final char invalidChar : invalidCharacters) {
				if (c == invalidChar) {
					c = '_';
				}
			}

			result.append(c);
		}

		return result.toString();
	}

	/**
	 * If the given file already exists, then derive a new filename with an
	 * incremental suffix, and return the next unexisting file with the same
	 * base name and location
	 */
	public static IFile nextUniqueFile(final IFile file) {
		// if the file already exists, then find a new name
		int n = 1;
		final String extension = file.getFileExtension();
		final String name = file.getFullPath().removeFileExtension().lastSegment();

		IFile newFile = file;
		while (newFile.exists()) {
			newFile = newFile.getParent().getFile(new Path(name + "_" + n++ + "." + extension)); //$NON-NLS-1$ //$NON-NLS-2$
		}
		return newFile;
	}

	public static boolean safeEquals(final Object o1, final Object o2) {
		if (o1 == null) {
			return o2 == null;
		}
		return o1.equals(o2);
	}
}
