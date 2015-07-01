/** 
 * Copyright (c) 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471597 - [New Browser] Add a customization to display subclasses from an EClass
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.handlers;

public class HierarchicalEClassFacetToggleState extends
		AbstractFacetSetActivatorToggleState {

	private static final String CUSTOM_ID = "org.eclipse.modisco.infra.browser.ecore.core.hierarchicalEClass.facet"; //$NON-NLS-1$
	
	public HierarchicalEClassFacetToggleState() {
		super(CUSTOM_ID);
	}

}
