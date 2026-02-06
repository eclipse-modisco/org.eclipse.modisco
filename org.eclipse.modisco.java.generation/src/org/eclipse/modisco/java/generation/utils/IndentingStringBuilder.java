/**
 * Copyright (c) 2026 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 */
package org.eclipse.modisco.java.generation.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.java.*;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.emf.util.JavaSwitch;

/**
 * @since 1.6
 */
@SuppressWarnings("nls")
public class IndentingStringBuilder
{
	private static final char NOT_A_CHAR = 0;
	private static final char SOFT_NEW_LINE = '\r';
	private static final char HARD_NEW_LINE = '\n';
	private static final char HARD_SPACE = ' ';
	private static final char SOFT_SPACE = '»';
	private static final char INDENTATION = '\f';
	private static final String indentation = "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";

	/**
	 * The prevailing string content.
	 */
	private StringBuilder s = new StringBuilder();

	/**
	 * Convenience copy of the final character of the prevailing content.
	 */
	private char lastChar = NOT_A_CHAR;				// s.charAt(s.length()-1) - never SOFT_NEW_LINE nor SOFT_SPACE

	/**
	 * A character that should be appended to the prevailing content before any further content, but which may be adjusted to
	 * fold redundant soft spaces or new-lines. May also be 'the' indentation character comprising tabs to the push/pop depth.
	 */
	private char nextChar = NOT_A_CHAR;				// NOT_A_CHAR or SOFT_NEW_LINE or SOFT_SPACE or INDENTATION
	
	/**
	 * The push/pop indentation depth to be output between the next new line and non-whtespace.
	 */
	private int indentationDepth = 0;
	
	public void append(boolean value) {
		append(Boolean.toString(value));
	}

	public void append(char ch) {
		assert assertStateIsValid();
		assert (ch != NOT_A_CHAR) && (ch != SOFT_NEW_LINE) && (ch != SOFT_SPACE) && (ch != INDENTATION);
		if (ch == HARD_NEW_LINE) {
		//	if (nextChar == INDENTATION) {
				s.append("\n");
				lastChar = HARD_NEW_LINE;
		//	}
			nextChar = INDENTATION;
		}
		else if (ch == HARD_SPACE) {
			if (nextChar == NOT_A_CHAR) {
				s.append(ch);
				lastChar = ch;
			}
		}
		else {//if (ch != '\r') {
			appendNextChar(s);
			s.append(ch);
			nextChar = NOT_A_CHAR;
			lastChar = ch;
		}
		assertStateIsValid();
	}

	public void append(String string) {
		if (string != null) {
			for (int i = 0; i < string.length(); i++) {
				char ch = string.charAt(i);
				append(ch);
			}
		}
	}

	public void appendEndLine() {
		if (endsWithNonNewLine()) {
			append("\n");
		}
	}

	protected void appendNextChar(StringBuilder is) {
		assert nextChar != HARD_NEW_LINE;
		assert nextChar != HARD_SPACE;
		if (nextChar == INDENTATION) {
			assert (lastChar == NOT_A_CHAR) || (lastChar == HARD_NEW_LINE);
			for (int i = 0; i < indentationDepth; i++) {
				is.append("\t");
			}
		}
		else if (nextChar == SOFT_NEW_LINE) {
			if ((lastChar != NOT_A_CHAR) && (lastChar != HARD_NEW_LINE)) {
				is.append("\n");
			}
			for (int i = 0; i < indentationDepth; i++) {
				is.append("\t");
			}
		}
		else if (nextChar == SOFT_SPACE) {
			is.append(" ");
		}
		else {
			assert false;
		}
	}

	public void appendSoftNewLine() {
		if ((nextChar == SOFT_NEW_LINE) || (nextChar == HARD_NEW_LINE) || (nextChar == INDENTATION)) {
			return;
		}
		if (nextChar == NOT_A_CHAR) {
			if ((lastChar == SOFT_NEW_LINE) || (lastChar == HARD_NEW_LINE)) {
				return;
			}
		}
		nextChar = SOFT_NEW_LINE;
	}

	public void appendSoftSpace() {
		if ((nextChar == SOFT_NEW_LINE) || (nextChar == HARD_NEW_LINE) || (nextChar == SOFT_SPACE) || (nextChar == HARD_SPACE) || (nextChar == INDENTATION)) {
			return;
		}
		if (nextChar == NOT_A_CHAR) {
			if ((lastChar == SOFT_NEW_LINE) || (lastChar == HARD_NEW_LINE) || (nextChar == SOFT_SPACE) || (nextChar == HARD_SPACE)) {
				return;
			}
		}
		nextChar = SOFT_SPACE;
	}

	protected boolean assertStateIsValid() {
		assert lastChar == (s.length() >= 0 ? s.charAt(s.length()-1) : NOT_A_CHAR);
		assert (nextChar == NOT_A_CHAR) || (nextChar == SOFT_NEW_LINE) || (nextChar == SOFT_SPACE) || (nextChar == INDENTATION);
		assert (nextChar != INDENTATION) || ((lastChar == NOT_A_CHAR) || (lastChar == HARD_NEW_LINE));
		return true;
	}

	public void close() {
		assert indentationDepth == 0;
		assert nextChar == NOT_A_CHAR;
	}

	protected boolean endsWithNonNewLine() {
		if (nextChar == HARD_SPACE) return true;
		if (nextChar == SOFT_SPACE) return true;
		if (nextChar == HARD_NEW_LINE) return false;
		if (nextChar == SOFT_NEW_LINE) return false;
		if (nextChar == INDENTATION) return false;
		if (nextChar != NOT_A_CHAR) return true;
		//
		if (lastChar == HARD_SPACE) return true;
		if (lastChar == SOFT_SPACE) return true;
		if (lastChar == NOT_A_CHAR) return false;
		if (lastChar == HARD_NEW_LINE) return false;
		if (lastChar == SOFT_NEW_LINE) return false;
		return true;
	}

	protected boolean endsWithNonWhitespace() {
		if (nextChar == HARD_NEW_LINE) return false;
		if (nextChar == SOFT_NEW_LINE) return false;
		if (nextChar == HARD_SPACE) return false;
		if (nextChar == SOFT_SPACE) return false;
		if (nextChar == INDENTATION) return false;
		if (nextChar != NOT_A_CHAR) return true;
		//
		if (lastChar == NOT_A_CHAR) return false;
		if (lastChar == HARD_NEW_LINE) return false;
		if (lastChar == SOFT_NEW_LINE) return false;
		if (lastChar == HARD_SPACE) return false;
		return true;
	}

	public void popIndentation() {
		indentationDepth--;
	}

	public void pushIndentation() {
		indentationDepth++;
	}

	@Override
	public String toString() {
		if (nextChar == NOT_A_CHAR) {
			return s.toString();
		}
		StringBuilder sWithIndentation = new StringBuilder();
		sWithIndentation.append(s);
		sWithIndentation.append("║");
		appendNextChar(sWithIndentation);
		return sWithIndentation.toString();
	}
}