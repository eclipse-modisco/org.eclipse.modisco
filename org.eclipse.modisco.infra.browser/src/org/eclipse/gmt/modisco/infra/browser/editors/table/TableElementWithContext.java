/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.editors.table;

import org.eclipse.emf.ecore.EObject;

public class TableElementWithContext extends TableElement {
	private final EObject context;

	public TableElementWithContext(final Object element, final EObject context) {
		super(element);
		this.context = context;
	}

	public EObject getContext() {
		return this.context;
	}
}
