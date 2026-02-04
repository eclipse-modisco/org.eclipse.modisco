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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.queries.SelectedQueriesManager;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ui.dialogs.QuerySelectionDialog;
import org.eclipse.modisco.infra.query.ui.filters.QueryScopeFilter;
import org.eclipse.swt.widgets.Shell;

/**
 * Select a query (or several) to be shown on each occurrence of the selected
 * model element(s)
 */
public class SelectQueryAction extends Action {

	private final IBrowserActionBarContributor browserActionBarContributor;

	public SelectQueryAction(final IBrowserActionBarContributor browserActionBarContributor) {
		super(Messages.SelectQueryAction_addQueryOnElement);
		this.browserActionBarContributor = browserActionBarContributor;
	}

	@Override
	public void run() {
		Shell shell = this.browserActionBarContributor.getBrowser().getSite().getShell();
		List<EObject> selectedModelElements = new ArrayList<EObject>();

		ISelection selection = this.browserActionBarContributor.getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Iterator<?> iterator = structuredSelection.iterator();
			while (iterator.hasNext()) {
				Object selectedElement = iterator.next();
				if (selectedElement instanceof ModelElementItem) {
					ModelElementItem item = (ModelElementItem) selectedElement;
					selectedModelElements.add(item.getEObject());
				}
			}

			// filter out non-applicable queries
			List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
			for (EObject eObject : selectedModelElements) {
				filters.add(new QueryScopeFilter(eObject.eClass()));
			}

			QuerySelectionDialog querySelectionDialog = new QuerySelectionDialog(shell, true, null,
					filters);

			if (querySelectionDialog.open() == Window.OK) {
				List<ModelQuery> selectedQueries = querySelectionDialog.getSelectedQueries();
				SelectedQueriesManager selectedQueriesManager = this.browserActionBarContributor
						.getBrowser().getBrowserConfiguration().getSelectedQueriesManager();

				for (EObject eObject : selectedModelElements) {
					for (ModelQuery selectedQuery : selectedQueries) {
						selectedQueriesManager.add(eObject, selectedQuery);
					}
				}
			}
		}
	}
}
