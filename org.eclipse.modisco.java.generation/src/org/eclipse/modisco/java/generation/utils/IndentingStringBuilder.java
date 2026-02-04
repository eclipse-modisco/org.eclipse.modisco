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
	protected final Stack<String> indentation = new Stack<>();
	private StringBuilder s = new StringBuilder();
	private char lastChar = 0;
	private boolean indentationPending = false;
	
	public IndentingStringBuilder() {
		indentation.push("");
	}

	protected void append(boolean value) {
		append(Boolean.toString(value));
	}

	public void append(String string) {
		if (string != null) {
			for (int i = 0; i < string.length(); i++) {
				char ch = string.charAt(i);
				if (ch == '\n') {
					if (indentationPending) {
						s.append("\n");
					}
					lastChar = ch;
					indentationPending = true;
				}
				else if (ch != '\r') {
					if (indentationPending) {
						s.append("\n");
						s.append(indentation.peek());
						indentationPending = false;
					}
					s.append(ch);
					lastChar = ch;
				}
			}
		}
	}

	public void appendSoftNewLine() {
		if ((lastChar >= 0) && (lastChar != '\n')) {
			append("\n");
		}
	}

	public void appendSoftSpace() {
		if ((lastChar >= 0) && (lastChar != ' ') && (lastChar != '\n')) {
			append(" ");
		}
	}

	public void close() {
		assert indentation.isEmpty();
	}

	public void popIndentation() {
		indentation.pop();
	}

	public void pushIndentation() {
		indentation.push(indentation.peek() + "\t");
	}

	@Override
	public String toString() {
		return s.toString();
	}
}