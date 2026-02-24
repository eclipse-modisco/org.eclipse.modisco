/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *     Nicolas Guyomar (Mia-Software) - Bug 333652 Extension point offering the possibility to declare an EPackage browser
 *******************************************************************************/
package org.eclipse.modisco.facet.common.core.internal.utils;

/**
 * A string pattern matcher. Supports '*' and '?' wildcards.
 * 
 * FIXME yet another duplicated version of StringMatcher (Bug 269424)
 */
@Deprecated /* @deprecated use org.eclipse.modisco.common.core.strings.StringMatcher */
public class StringMatcher extends org.eclipse.modisco.common.core.strings.StringMatcher
{
	@Deprecated
	public static class Position extends org.eclipse.modisco.common.core.strings.StringMatcher.Position {
		@Deprecated
		public Position(final int start, final int end) {
			super(start, end);
		}
	}

	@Deprecated
	public StringMatcher(final String pattern, final boolean ignoreCase,
			final boolean ignoreWildCards) {
		super(pattern, ignoreCase, ignoreWildCards);
	}
}
