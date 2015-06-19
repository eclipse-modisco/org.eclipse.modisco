/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.query.ui.filters;

import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.gmt.modisco.infra.query.ModelQuery;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class QueryReturnTypeFilter extends ViewerFilter {

	private final List<Class<?>> expectedReturnTypes;

	public QueryReturnTypeFilter(final List<Class<?>> expectedReturnTypes) {
		this.expectedReturnTypes = expectedReturnTypes;
	}

	@Override
	public boolean select(final Viewer viewer, final Object parentElement, final Object element) {
		if (element instanceof ModelQuery) {
			ModelQuery modelQuery = (ModelQuery) element;
			return hasExpectedReturnType(modelQuery);
		}
		return true;
	}

	private boolean hasExpectedReturnType(final ModelQuery modelQuery) {
		// check return type
		EClassifier returnType = modelQuery.getReturnType();
		if (returnType == null) {
			return this.expectedReturnTypes.isEmpty();
		}
		Class<?> returnTypeClass = returnType.getInstanceClass();
		return this.expectedReturnTypes.contains(returnTypeClass);
	}
}
