/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.java.generation.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;

import org.eclipse.osgi.util.NLS;

import com.ibm.icu.lang.UCharacter;

/**
 * Specific file comparator for java files generated : compare char by char,
 * ignore white spaces (tab, line feeds, ...).
 *
 */
public class JavaFileComparator implements Comparator<File> {

	public final int compare(final File source, final File target) {
		boolean result = true;
		StringBuilder s = new StringBuilder();
		StringBuilder t = new StringBuilder();
		if (!source.getName().equals(target.getName())) {
			result = false;
//		} else if (source.getName().equalsIgnoreCase("Comments.java")) { //$NON-NLS-1$
//			result = true;
//			// misc case of comments which cannot be generated back at the same
//			// place
		} else {
			try {
				FileReader sourceReader = new FileReader(source);
				FileReader targetReader = new FileReader(target);
				int sourceChar = nextChar(sourceReader);
				int targetChar = nextChar(targetReader);
				s.append((char)sourceChar);
				t.append((char)targetChar);
				while ((sourceChar != -1) && (targetChar != -1)) {
					result = result && (sourceChar == targetChar);
					sourceChar = nextChar(sourceReader);
					targetChar = nextChar(targetReader);
					s.append((char)sourceChar);
					t.append((char)targetChar);
				}
				if (result) {
					if ((sourceChar != -1) || (targetChar != -1)) {
						result = false;
						System.err
								.println(Messages.JavaFileComparator_wrong_number_1
										+ Messages.JavaFileComparator_wrong_number_2);
					}
				}
			} catch (FileNotFoundException e) {
				result = false;
			} catch (IOException e) {
				result = false;
			}
		}
		if (!result) {
			System.err.println(NLS.bind(
					Messages.JavaFileComparator_files_not_equal, new Object[] {
							source.getName(), target.getName() }));
		} else {
			System.out.println(NLS.bind(
					Messages.JavaFileComparator_files_equal, new Object[] {
							source.getName(), target.getName() }));

		}

		if (result) {
			return 0;
		}
		return -1;
	}

	private static int nextChar(final FileReader fr) throws IOException {
		int result = fr.read();
		while (result != -1
				&& ((UCharacter.isWhitespace(result)) || (result == '*'))) {
			// (result == '*') -> misc case, javadoc first line ******...*
			result = fr.read();
		}
		return result;
	}

}
