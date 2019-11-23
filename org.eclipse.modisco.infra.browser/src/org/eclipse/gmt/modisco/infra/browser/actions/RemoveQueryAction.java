/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.actions;

import java.util.Iterator;

import org.eclipse.gmt.modisco.infra.browser.Messages;
import org.eclipse.gmt.modisco.infra.browser.core.QueryItem;
import org.eclipse.gmt.modisco.infra.browser.queries.SelectedQueriesManager;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

/** Removes the selected query(-ies) */
public class RemoveQueryAction extends Action {

	private final IBrowserActionBarContributor browserActionBarContributor;

	public RemoveQueryAction(final IBrowserActionBarContributor browserActionBarContributor) {
		super(Messages.RemoveQueryAction_removeQuery);
		this.browserActionBarContributor = browserActionBarContributor;
	}

	@Override
	public void run() {
		ISelection selection = this.browserActionBarContributor.getSelection();
		SelectedQueriesManager selectedQueriesManager = this.browserActionBarContributor
				.getBrowser().getBrowserConfiguration().getSelectedQueriesManager();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Iterator<?> iterator = structuredSelection.iterator();
			while (iterator.hasNext()) {
				Object selectedElement = iterator.next();
				if (selectedElement instanceof QueryItem) {
					QueryItem queryItem = (QueryItem) selectedElement;
					selectedQueriesManager.remove(queryItem.getQuery());
				}
			}
		}
	}
}
