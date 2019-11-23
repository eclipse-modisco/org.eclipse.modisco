/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.actions;

import java.util.Iterator;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.core.QueryItem;
import org.eclipse.modisco.infra.browser.queries.SelectedQueriesManager;

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
