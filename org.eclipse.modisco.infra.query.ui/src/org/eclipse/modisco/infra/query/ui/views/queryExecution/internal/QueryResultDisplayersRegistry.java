/*******************************************************************************
 * Copyright (c) 2008, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.query.ui.views.queryExecution.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.modisco.infra.common.core.internal.extensions.AbstractRegistry;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.query.ui.Activator;
import org.eclipse.modisco.infra.query.ui.views.queryExecution.QueryResultDisplayer;
import org.eclipse.osgi.util.NLS;

/**
 * The singleton registry of {@link QueryResultDisplayer}s, which initializes
 * the registry by reading extensions when first accessed.
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class QueryResultDisplayersRegistry extends AbstractRegistry {

	private static final String EXTENSION_POINT_NAMESPACE = "org.eclipse.gmt.modisco.infra.query.ui"; //$NON-NLS-1$
	private static final String EXTENSION_POINT_NAME = "queryResultDisplay"; //$NON-NLS-1$
	private static final String ELEMENT_QUERY_RESULT_DISPLAYER = "queryResultDisplayer"; //$NON-NLS-1$
	private static final String ATTRIBUTE_CLASS = "class"; //$NON-NLS-1$
	private static final String ATTRIBUTE_NAME = "name"; //$NON-NLS-1$

	private static QueryResultDisplayersRegistry instance = null;

	public class NamedQueryResultDisplayer {
		private final String name;
		private final QueryResultDisplayer displayer;

		public NamedQueryResultDisplayer(final String name, final QueryResultDisplayer displayer) {
			this.name = name;
			this.displayer = displayer;
		}

		public String getName() {
			return this.name;
		}

		public QueryResultDisplayer getDisplayer() {
			return this.displayer;
		}
	}

	private final List<QueryResultDisplayersRegistry.NamedQueryResultDisplayer> queryResultDisplayers;

	public QueryResultDisplayersRegistry() {
		this.queryResultDisplayers = new ArrayList<QueryResultDisplayersRegistry.NamedQueryResultDisplayer>();
		initialize();
	}

	public static QueryResultDisplayersRegistry getInstance() {
		if (QueryResultDisplayersRegistry.instance == null) {
			QueryResultDisplayersRegistry.instance = new QueryResultDisplayersRegistry();
		}
		return QueryResultDisplayersRegistry.instance;
	}

	public List<QueryResultDisplayersRegistry.NamedQueryResultDisplayer> getQueryResultDisplayers() {
		return this.queryResultDisplayers;
	}

	public NamedQueryResultDisplayer getQueryResultDisplayer(final String name) {
		for (NamedQueryResultDisplayer namedQueryResultDisplayer : this.queryResultDisplayers) {
			if (name.equals(namedQueryResultDisplayer.getName())) {
				return namedQueryResultDisplayer;
			}
		}
		return null;
	}

	@Override
	protected String getExtensionPointName() {
		return QueryResultDisplayersRegistry.EXTENSION_POINT_NAME;
	}

	@Override
	protected String getExtensionPointNamespace() {
		return QueryResultDisplayersRegistry.EXTENSION_POINT_NAMESPACE;
	}

	@Override
	protected void handleRootElement(final IConfigurationElement configurationElement) {
		final String name = configurationElement.getName();
		if (name.equalsIgnoreCase(QueryResultDisplayersRegistry.ELEMENT_QUERY_RESULT_DISPLAYER)) {
			readQueryResultDisplayer(configurationElement);
		} else {
			logUnknownElement(configurationElement);
		}
	}

	private void readQueryResultDisplayer(final IConfigurationElement configurationElement) {
		String nameAttribute = configurationElement
				.getAttribute(QueryResultDisplayersRegistry.ATTRIBUTE_NAME);
		if (nameAttribute == null) {
			logMissingAttribute(configurationElement, QueryResultDisplayersRegistry.ATTRIBUTE_NAME);
			return;
		}

		Object queryResultDisplayerObject = null;
		try {
			queryResultDisplayerObject = configurationElement
					.createExecutableExtension(QueryResultDisplayersRegistry.ATTRIBUTE_CLASS);
		} catch (final CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		if (queryResultDisplayerObject == null) {
			logMissingAttribute(configurationElement, QueryResultDisplayersRegistry.ATTRIBUTE_CLASS);
			return;
		}

		if (queryResultDisplayerObject instanceof QueryResultDisplayer) {
			QueryResultDisplayer queryResultDisplayer = (QueryResultDisplayer) queryResultDisplayerObject;
			this.queryResultDisplayers.add(new NamedQueryResultDisplayer(nameAttribute,
					queryResultDisplayer));
		} else {
			logError(configurationElement, NLS.bind("The given class is not a {0}.", //$NON-NLS-1$
					QueryResultDisplayer.class.getSimpleName()));
		}

	}
}
