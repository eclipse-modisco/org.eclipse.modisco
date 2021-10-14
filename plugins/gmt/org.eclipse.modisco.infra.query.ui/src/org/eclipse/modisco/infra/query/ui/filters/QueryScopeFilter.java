/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.query.ui.filters;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.modisco.infra.query.ModelQuery;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class QueryScopeFilter extends ViewerFilter {

	private final EClass expectedScope;

	public QueryScopeFilter(final EClass expectedScope) {
		this.expectedScope = expectedScope;
	}

	@Override
	public boolean select(final Viewer viewer, final Object parentElement, final Object element) {
		if (element instanceof ModelQuery) {
			ModelQuery modelQuery = (ModelQuery) element;
			return hasExpectedScope(modelQuery);
		}
		return true;
	}

	private boolean hasExpectedScope(final ModelQuery modelQuery) {
		EList<EClass> scope = modelQuery.getScope();
		if (scope.isEmpty()) {
			return true;
		}
		for (EClass aScope : scope) {
			// Bug 309436 - A query having EObject as scope should be applicable
			// to any model element
			if (aScope.isSuperTypeOf(this.expectedScope) || aScope == EcorePackage.Literals.EOBJECT) {
				return true;
			}
		}
		return false;
	}
}
