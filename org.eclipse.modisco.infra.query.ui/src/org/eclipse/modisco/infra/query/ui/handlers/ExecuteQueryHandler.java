/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software)
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.query.ui.handlers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ui.Activator;
import org.eclipse.modisco.infra.query.ui.views.queryExecution.internal.QueryExecutionView;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Opens the "Query Execution" view, and sets its context to the list of
 * currently selected {@link EObject}s.
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class ExecuteQueryHandler extends AbstractHandler {

	public ExecuteQueryHandler() {
		//
	}

	private IViewPart openQueryExecutionView() {
		try {
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			if (window != null) {
				IWorkbenchPage activePage = window.getActivePage();
				if (activePage != null) {
					return activePage.showView(QueryExecutionView.ID);
				}
			}
		} catch (final PartInitException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		return null;
	}

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);

		List<EObject> selectedEObjects = new ArrayList<EObject>();
		List<ModelQuery> selectedQueries = new ArrayList<ModelQuery>();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Iterator<?> iterator = structuredSelection.iterator();
			while (iterator.hasNext()) {
				Object selectedElement = iterator.next();
				if (selectedElement instanceof ModelQuery
						&& "modisco".equals(((ModelQuery) selectedElement).eResource().getURI().scheme())) { //$NON-NLS-1$
					ModelQuery query = (ModelQuery) selectedElement;
					selectedQueries.add(query);
				} else if (selectedElement instanceof EObject) {
					EObject element = (EObject) selectedElement;
					selectedEObjects.add(element);
				}
			}
		}
		IViewPart view = openQueryExecutionView();
		if (view instanceof QueryExecutionView) {
			QueryExecutionView queryExecutionView = (QueryExecutionView) view;
			if (selectedEObjects.size() > 0) {
				queryExecutionView.setContext(selectedEObjects);
			}
			if (selectedQueries.size() > 0) {
				queryExecutionView.setSelectedQueries(selectedQueries);

			}
		}
		return null;
	}
}
