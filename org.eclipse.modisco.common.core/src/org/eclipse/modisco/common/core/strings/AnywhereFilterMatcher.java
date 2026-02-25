/*******************************************************************************
 * Copyright (c) 2010, 2026 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.common.core.strings;

import org.eclipse.ui.dialogs.FilteredList.FilterMatcher;

/** This is a matcher that matches anywhere, not just at the beginning.
 * 
 * The de-duplicated version of StringMatcher (Bug 269424)
 */
public class AnywhereFilterMatcher implements FilterMatcher {
	private StringMatcher fMatcher;

	@Override
	public void setFilter(final String pattern, final boolean ignoreCase,
			final boolean ignoreWildCards) {
		this.fMatcher = new StringMatcher('*' + pattern + '*', ignoreCase, ignoreWildCards);
	}

	@Override
	public boolean match(final Object element) {
		return this.fMatcher.match(element.toString());
	}
}
