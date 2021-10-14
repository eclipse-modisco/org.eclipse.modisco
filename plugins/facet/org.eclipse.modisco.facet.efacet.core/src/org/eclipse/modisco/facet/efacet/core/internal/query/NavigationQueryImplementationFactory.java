/**
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 366055 - NavigationQuery
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Nicolas Bros (Mia-Software) - Bug 376941 - [EFacet] Facet operation arguments in Facet model
 */
package org.eclipse.modisco.facet.efacet.core.internal.query;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.facet.efacet.core.IDerivedTypedElementManager;
import org.eclipse.modisco.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.modisco.facet.efacet.core.query.IQueryImplementation;
import org.eclipse.modisco.facet.efacet.core.query.IQueryImplementationFactory;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.extensible.Query;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.query.QueryPackage;
import org.osgi.framework.Bundle;

public class NavigationQueryImplementationFactory implements IQueryImplementationFactory {

	public EClass getManagedQueryType() {
		return QueryPackage.eINSTANCE.getNavigationQuery();
	}

	public IQueryImplementation create(final Query query, final Bundle queryBundle, final IDerivedTypedElementManager manager) throws DerivedTypedElementException {
		final NavigationQueryImplementation evaluator = new NavigationQueryImplementation();
		evaluator.setCheckResultType(true);
		return evaluator;
	}
}
