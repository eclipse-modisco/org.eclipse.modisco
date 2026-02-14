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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.util.Comparator;
import java.util.Stack;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.modisco.java.generation.tests.Messages;
import org.eclipse.osgi.util.NLS;

/**
 * TODO specific file comparator : neutralize JSP shape variations
 *
 */
public class JSPFileComparator implements Comparator<File>
{
	public final int compare(final File source, final File target) {
		if ("memory.jsp".equals(target.getName())) {
			System.err.println("Validation of " + source + " bypassed - see https://github.com/eclipse-modisco/org.eclipse.modisco/issues/1099");
			return 0;
		}
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
		String s0 = rawText.replaceAll(" ", "").replaceAll("\n", "").replaceAll("\t", "");
		
		String s11 = s0.replaceAll("<jsp:directive.pagefilename=\"myFileName\"/>", "<%@pagefilename=\"myFileName\"%>");
		
		
		String s21 = s11.replaceAll("<jsp:expression>", "<%=").replaceAll("</jsp:expression>", "%>");
		String s22 = s21.replaceAll("<jsp:declaration>", "<%!").replaceAll("</jsp:declaration>", "%>");
		String s23 = s22.replaceAll("<jsp:directive.", "<%@");
		String s24 = s23.replaceAll("<jsp:scriptlet>", "<%").replaceAll("</jsp:scriptlet>", "%>");
		// Special case irregularities in jspElement.jsp
		String s45 = s24.replace("att2='value2'", "att2=\"value2\"");
		String s46 = s45.replace("att3=value3", "att3=\"value3\"");
		
		

		String s47 = s46.replaceAll("<JSPACTIONSECTION></JSPACTIONSECTION>", "<JSPACTIONSECTION/>");
		String packedSource = s47.replaceAll("<fragmentJSPAction:actionisTagFragment=\"true\"/>></ATTRIBUTESECTION>", "<fragmentJSPAction:actionisTagFragment=\"true\"/>/>");
		

		
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
