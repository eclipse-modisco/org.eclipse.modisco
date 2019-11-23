/*******************************************************************************
 * Copyright (c) 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.uicore.internal.adapters;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

/**
 * Associates a unique integer with each model element (lazily, when the adapter is created)
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class ElementIDAdapter extends AdapterImpl implements ElementID {

	private static long lastID = 0;
	private final long id;

	public ElementIDAdapter() {
		this.id = ElementIDAdapter.lastID++;
	}

	@Override
	public boolean isAdapterForType(final Object type) {
		return (type == ElementID.class);
	}

	public long getID() {
		return this.id;
	}
}
