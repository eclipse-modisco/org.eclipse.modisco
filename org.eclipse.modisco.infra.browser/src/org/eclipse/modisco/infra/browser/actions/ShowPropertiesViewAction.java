/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

/** This action opens the "Properties" view. */
public class ShowPropertiesViewAction extends Action {

	/** The ID of the "Properties" view */
	private static final String PROPERTY_SHEET_ID = "org.eclipse.ui.views.PropertySheet"; //$NON-NLS-1$

	public ShowPropertiesViewAction() {
		super(Messages.EcoreActionBarContributor_showPropertiesView);
	}

	@Override
	public void run() {
		try {
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			if (window != null) {
				IWorkbenchPage activePage = window.getActivePage();
				if (activePage != null) {
					activePage.showView(ShowPropertiesViewAction.PROPERTY_SHEET_ID);
				}
			}
		} catch (final PartInitException exception) {
			MoDiscoBrowserPlugin.logException(exception);
		}
	}

}
