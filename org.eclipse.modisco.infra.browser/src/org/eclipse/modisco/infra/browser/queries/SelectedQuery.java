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
package org.eclipse.modisco.infra.browser.queries;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.browser.uicore.internal.Activator;
import org.eclipse.modisco.infra.browser.uicore.internal.Messages;
import org.eclipse.modisco.infra.browser.uicore.internal.util.EMFUtil;
import org.eclipse.modisco.infra.browser.uicore.internal.util.QueryUtil;
import org.eclipse.modisco.infra.browser.uicore.internal.util.Util;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.osgi.util.NLS;

/**
 * Represents a query that has been associated to a model element and can be
 * executed in the model browser
 */
public class SelectedQuery {

	private final ModelQuery modelQuery;
	private final EObject context;
	private boolean executed = false;
	private Object result;
	private final SelectedQueriesManager selectedQueriesManager;

	public SelectedQuery(final ModelQuery modelQuery, final EObject context,
			final SelectedQueriesManager selectedQueriesManager) {
		this.modelQuery = modelQuery;
		this.context = context;
		this.selectedQueriesManager = selectedQueriesManager;
	}

	/** Execute the query */
	public void executeQuery() {
		if (EMFUtil.tryResolve(this.modelQuery)) {
			this.result = QueryUtil.basicEvaluate(this.modelQuery, this.context);
			this.executed = true;
			this.selectedQueriesManager.fireChangeNotification();
		} else {
			MoDiscoLogger.logError(NLS.bind(Messages.unresolvedQuery, EMFUtil
					.proxyURI(this.modelQuery)), Activator.getDefault());
		}
	}

	public boolean isExecuted() {
		return this.executed;
	}

	public Object getResult() {
		if (!isExecuted()) {
			executeQuery();
		}
		return this.result;
	}

	public ModelQuery getModelQuery() {
		return this.modelQuery;
	}

	public EObject getContext() {
		return this.context;
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof SelectedQuery) {
			final SelectedQuery other = (SelectedQuery) obj;
			return Util.safeEquals(this.modelQuery, other.modelQuery)
					&& Util.safeEquals(this.context, other.context);
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int hashPrime1 = 47;
		final int hashPrime2 = 13;

		final int queryHashCode = this.modelQuery.hashCode() + hashPrime2;
		if (this.context != null) {
			return this.context.hashCode() * hashPrime1 + queryHashCode;
		}
		return queryHashCode;
	}
}
