/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.query.core.propertyTesters;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.query.ModelQuery;
import org.eclipse.gmt.modisco.infra.query.ModelQuerySet;
import org.eclipse.gmt.modisco.infra.query.core.ModelQuerySetCatalog;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class QueryPropertyTester extends PropertyTester {

	public static final String QUERY = "isMoDiscoQuery"; //$NON-NLS-1$
	public static final String QUERY_SET = "isMoDiscoQuerySet"; //$NON-NLS-1$
	public static final String WORKSPACE_QUERY = "isWorkspaceQuery"; //$NON-NLS-1$
	public static final String WORKSPACE_QUERY_SET = "isWorkspaceQuerySet"; //$NON-NLS-1$

	public QueryPropertyTester() {
		//
	}

	public boolean test(final Object receiver, final String property, final Object[] args,
			final Object expectedValue) {
		if (!(expectedValue instanceof Boolean)) {
			throw new IllegalArgumentException("expectedValue must be a Boolean"); //$NON-NLS-1$
		}

		if (QueryPropertyTester.QUERY.equals(property)) {
			return new Boolean(receiver instanceof ModelQuery).equals(expectedValue);
		} else if (QueryPropertyTester.QUERY_SET.equals(property)) {
			return new Boolean(receiver instanceof ModelQuerySet).equals(expectedValue);
		} else if (QueryPropertyTester.WORKSPACE_QUERY.equals(property)) {
			if (receiver instanceof ModelQuery) {
				ModelQuery modelQuery = (ModelQuery) receiver;
				Resource resource = modelQuery.eResource();
				URI uri = resource.getURI();
				return new Boolean(uri.isPlatformResource()).equals(expectedValue);
			}
			return false;
		} else if (QueryPropertyTester.WORKSPACE_QUERY_SET.equals(property)) {
			// if this is a query set, is it editable
			if (receiver instanceof ModelQuerySet) {
				ModelQuerySet modelQuerySet = (ModelQuerySet) receiver;
				Resource resource = modelQuerySet.eResource();
				URI uri = resource.getURI();
				if (uri.isPlatform()) {
					return new Boolean(uri.isPlatformResource()).equals(expectedValue);
				}
				URI realUri = ModelQuerySetCatalog.getSingleton().getURI(modelQuerySet.getName());
				return new Boolean(realUri.isPlatformResource()).equals(expectedValue);
			}
		}

		// let another filter decide
		return true;
	}

}
