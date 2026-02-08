/**
 *  Copyright (c) 2010, 2026 Mia-Software and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *
 *  Contributors:
 *   Fabien Giquel (Mia-Software) - initial API and dummy implementation
 *   E.D.Willink - Initial API and implementation
 */
package org.eclipse.modisco.jee.jsp.generation.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Comparator;

import org.eclipse.modisco.java.generation.tests.Messages;
import org.eclipse.osgi.util.NLS;

/**
 * TODO specific file comparator : neutralize JSP shape variations
 *
 */
public class JSPFileComparator implements Comparator<File> {

//	public int compare(final File source, final File target) {
//		if (!source.getName().equals(target.getName())) {
//			return -1;
//		}
//		return 0;
//	}

	public final int compare(final File source, final File target) {
		boolean result = true;
		if (!source.getName().equals(target.getName())) {
			result = false;
//		} else if (source.getName().equalsIgnoreCase("Comments.java")) { //$NON-NLS-1$
//			result = true;
//			// misc case of comments which cannot be generated back at the same
//			// place
		}
		else {
			try {
				String sourceText = readFile(source);
				String targetText = readFile(target);
				String packedSource = normalize(sourceText);
				String packedTarget = normalize(targetText);
			//	FileReader targetReader = new FileReader(target);
			//	int sourceChar = nextChar(sourceReader);
			//	int targetChar = nextChar(targetReader);
			//	s.append((char)sourceChar);
			//	t.append((char)targetChar);
			//	while ((sourceChar != -1) && (targetChar != -1)) {
			//		result = result && (sourceChar == targetChar);
			//		sourceChar = nextChar(sourceReader);
			//		targetChar = nextChar(targetReader);
			//		s.append((char)sourceChar);
			//		t.append((char)targetChar);
			//	}
				if (packedSource.length() != packedTarget.length()) {
					result = false;
					System.err
							.println(Messages.JavaFileComparator_wrong_number_1
									+ Messages.JavaFileComparator_wrong_number_2);
				}
				else {
					result = packedSource.equals(packedTarget);
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
	
	protected String normalize(String rawText) {
		String s1 = rawText.replaceAll("<jsp:expression>", "<%=").replaceAll("</jsp:expression>", "%>");
		String s2 = s1.replaceAll("<jsp:declaration>", "<%!").replaceAll("</jsp:declaration>", "%>");
		String s3 = s2.replaceAll("<jsp:directive.", "<%@");
		String s4 = s3.replaceAll("<jsp:scriptlet>", "<%").replaceAll("</jsp:scriptlet>", "%>");
		String packedSource = s4.replaceAll(" ", "").replaceAll("\n", "").replaceAll("\t", "");
		return packedSource;
	}

	public static String readFile(File file) throws IOException {
		LineNumberReader lineReader = new LineNumberReader(new FileReader(file));
		StringBuilder s = new StringBuilder();
		for (String line; (line = lineReader.readLine()) != null; ) {
			s.append(line);
			s.append("\n");
		}
		lineReader.close();
		return s.toString();
	}
}
