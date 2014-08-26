/** 
 * Copyright (c) 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 470962 - Add shortcuts to activate customs
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.handlers;

public class HideDerivedReferencesToggleState extends
		AbstractFacetSetActivatorToggleState {

	private static final String CUSTOM_ID = "org.eclipse.modisco.infra.browser.ecore.core.hideDerivedReferences"; //$NON-NLS-1$
	
	public HideDerivedReferencesToggleState() {
		super(CUSTOM_ID);
	}

}
