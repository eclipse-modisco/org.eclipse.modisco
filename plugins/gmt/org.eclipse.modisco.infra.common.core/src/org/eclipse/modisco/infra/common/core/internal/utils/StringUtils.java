/*******************************************************************************
 * Copyright (c) 2008, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/

package org.eclipse.modisco.infra.common.core.internal.utils;

import org.eclipse.modisco.infra.common.core.internal.Messages;

import com.ibm.icu.lang.UCharacter;

/**
 * @author Gabriel Barbier
 */
public final class StringUtils {
	public static final String ELLIPSIS = Messages.StringUtils_ellipsis;
	private static final int TRUNCATE_AFTER = 150;

	private StringUtils() {
		// prevent instantiation
	}

	public static String firstLetterToLowerCase(final String source) {
		String result;
		if (source.length() == 0) {
			result = source;
		} else if (source.length() == 1) {
			result = source.toLowerCase();
		} else {
			result = source.substring(0, 1).toLowerCase() + source.substring(1);
		}
		return result;
	}

	public static String firstLetterToUpperCase(final String source) {
		String result;
		if (source.length() == 0) {
			result = source;
		} else if (source.length() == 1) {
			result = source.toUpperCase();
		} else {
			result = source.substring(0, 1).toUpperCase() + source.substring(1);
		}
		return result;
	}

	/**
	 * Truncate the given String before the first newline or a maximum number of
	 * characters, whichever comes first. Adds an ellipsis ("...") if it was
	 * effectively truncated.
	 *
	 * @param str
	 *            the string to truncate
	 * @return the part of the given string before the first newline
	 */
	public static String truncateBeforeNewline(final String str) {
		int endIndex = str.indexOf('\r');
		if (endIndex == -1) {
			endIndex = str.indexOf('\n');
		}
		if (endIndex != -1 && endIndex <= StringUtils.TRUNCATE_AFTER) {
			return str.substring(0, endIndex) + StringUtils.ELLIPSIS;
		}
		if (endIndex == -1) {
			endIndex = str.length();
		}

		if (endIndex > StringUtils.TRUNCATE_AFTER) {
			return str.substring(0, StringUtils.TRUNCATE_AFTER / 2) + StringUtils.ELLIPSIS
					+ str.substring(endIndex - StringUtils.TRUNCATE_AFTER / 2, endIndex);
		}
		return str;
	}

	/**
	 * Get a name suitable for a Java class from the given name. Capitalizes the
	 * first letter and each letter after a space, and removes spaces.
	 */
	public static String inferJavaClassName(final String name) {
		String upperName = StringUtils.firstLetterToUpperCase(name.trim());
		StringBuilder javaName = new StringBuilder();
		boolean space = false;
		for (int i = 0; i < upperName.length(); i++) {
			char c = upperName.charAt(i);
			if (c == ' ') {
				space = true;
			} else if (space) {
				javaName.append(UCharacter.toUpperCase(c));
				space = false;
			} else {
				javaName.append(c);
			}
		}
		return javaName.toString();
	}

	/**
	 * Escape a list of characters in the given string so that they don't appear
	 * in the result string anymore, by replacing each occurrence of a character
	 * in <code>charsToEscape</code> by <code>escapeChar</code> followed by the
	 * corresponding character from <code>replacementChars</code>. If
	 * <code>escapeChar</code> is present in the input string, it is doubled.
	 *
	 * @param str
	 *            the string to escape
	 * @param escapeChar
	 *            the character meaning to escape the next character
	 * @param charsToEscape
	 *            the characters that must be escaped
	 * @param replacementChars
	 *            what to replace the escaped characters by (must be the same
	 *            length as <code>charsToEscape</code>)
	 */
	public static String escape(final String str, final char escapeChar,
			final char[] charsToEscape, final char[] replacementChars) {
		if (charsToEscape.length != replacementChars.length) {
			throw new IllegalArgumentException(
					"charsToEscape and replacementChars must have the same length"); //$NON-NLS-1$
		}
		StringBuilder builder = new StringBuilder(str.length());
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			boolean escaped = false;
			for (int j = 0; j < charsToEscape.length; j++) {
				if (c == charsToEscape[j]) {
					builder.append(escapeChar).append(replacementChars[j]);
					escaped = true;
					break;
				}
			}
			if (!escaped) {
				if (c == escapeChar) {
					builder.append(escapeChar).append(escapeChar);
				} else {
					builder.append(c);
				}
			}
		}
		return builder.toString();
	}

	/**
	 * Does the opposite of
	 * {@link StringUtils#escape(String, char, char[], char[]) escape} :
	 * <ul>
	 * <li>Double occurrences of <code>escapeChar</code> are replaced by a
	 * single occurrence
	 * <li><code>escapeChar</code> followed by a character from
	 * <code>replacementChars</code> is replaced by the corresponding character
	 * from <code>escapedChars</code>
	 * <li><code>escapeChar</code> before any another character is ignored
	 * </ul>
	 */
	public static String unescape(final String str, final char escapeChar,
			final char[] escapedChars, final char[] replacementChars) {
		if (escapedChars.length != replacementChars.length) {
			throw new IllegalArgumentException(
					"charsToEscape and replacementChars must have the same length"); //$NON-NLS-1$
		}
		StringBuilder builder = new StringBuilder(str.length());
		boolean nextIsEscaped = false;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (nextIsEscaped) {
				boolean unescaped = false;
				for (int j = 0; j < replacementChars.length; j++) {
					if (c == replacementChars[j]) {
						builder.append(escapedChars[j]);
						unescaped = true;
						break;
					}
				}
				if (!unescaped) {
					if (c == escapeChar) {
						builder.append(escapeChar);
					} else {
						// didn't need to be escaped => ignore escape
						builder.append(c);
					}
				}
				nextIsEscaped = false;
			} else if (c == escapeChar) {
				nextIsEscaped = true;
			} else {
				builder.append(c);
			}
		}
		return builder.toString();
	}
}
