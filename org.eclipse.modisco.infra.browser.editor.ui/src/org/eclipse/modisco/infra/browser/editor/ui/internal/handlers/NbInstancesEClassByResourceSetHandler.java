/** 
 * Copyright (c) 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471447 - [New Browser] Add a customization counting instances by EClass
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class NbInstancesEClassByResourceSetHandler extends
		AbstractFacetSetActivatorHandler {

	private static final String CUSTOM_ID = "org.eclipse.modisco.infra.browser.ecore.ui.nbInstancesEClassByResourceSet"; //$NON-NLS-1$

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		return execute(event, CUSTOM_ID);
	}

}
