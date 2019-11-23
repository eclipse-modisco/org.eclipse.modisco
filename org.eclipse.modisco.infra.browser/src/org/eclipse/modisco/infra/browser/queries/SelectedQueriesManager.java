/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.queries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.browser.uicore.ChangeListener;
import org.eclipse.modisco.infra.query.ModelQuery;

/**
 * Contains the information about queries that have been added to model
 * elements. Supports adding and removing selected queries, with notifications
 * to listeners.
 */
public class SelectedQueriesManager {
	/** Associations between model elements and queries */
	private final Map<EObject, List<SelectedQuery>> selectedQueries = new HashMap<EObject, List<SelectedQuery>>();

	public void add(final EObject eObject, final ModelQuery modelQuery) {
		if (modelQuery == null) {
			throw new IllegalArgumentException("modelQuery is null"); //$NON-NLS-1$
		}

		List<SelectedQuery> list = this.selectedQueries.get(eObject);
		if (list == null) {
			list = new ArrayList<SelectedQuery>();
			this.selectedQueries.put(eObject, list);
		}
		for (SelectedQuery selectedQuery : list) {
			if (selectedQuery.getModelQuery() == modelQuery) {
				// don't duplicate the query
				return;
			}
		}
		SelectedQuery selectedQuery = new SelectedQuery(modelQuery, eObject, this);
		list.add(selectedQuery);
		fireChangeNotification();
	}

	public void remove(final SelectedQuery selectedQuery) {
		boolean changed = false;
		Collection<List<SelectedQuery>> values = this.selectedQueries.values();
		for (List<SelectedQuery> list : values) {
			ListIterator<SelectedQuery> listIterator = list.listIterator();
			while (listIterator.hasNext()) {
				if (listIterator.next() == selectedQuery) {
					changed = true;
					listIterator.remove();
				}
			}
		}
		if (changed) {
			fireChangeNotification();
		}
	}

	public void clear() {
		this.selectedQueries.clear();
		fireChangeNotification();
	}

	/**
	 * Returns the queries selected for the given model element.
	 *
	 * @return a list of selected queries (which can be empty) or
	 *         <code>null</code>
	 */
	public List<SelectedQuery> getSelectedQueriesFor(final EObject eObject) {
		return this.selectedQueries.get(eObject);
	}

	private final List<ChangeListener> changeListeners = new ArrayList<ChangeListener>();

	public void addChangeListener(final ChangeListener listener) {
		if (!this.changeListeners.contains(listener)) {
			this.changeListeners.add(listener);
		}
	}

	public void removeChangeListener(final ChangeListener listener) {
		this.changeListeners.remove(listener);
	}

	public void fireChangeNotification() {
		for (final ChangeListener changeListener : this.changeListeners) {
			changeListener.changed();
		}
	}

}
