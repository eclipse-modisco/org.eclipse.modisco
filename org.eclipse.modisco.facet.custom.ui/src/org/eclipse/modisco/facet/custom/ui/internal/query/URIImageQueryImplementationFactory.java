/**
 *  Copyright (c) 2013, 2019 Soft-Maint.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 * 		David Couvrand (Soft-Maint) - Bug 402725 - Need a query to get an image from an URI
 *  	Nicolas Rault (Soft-Maint) - Bug 402725 - Need a query to get an image from an URI
 */

package org.eclipse.modisco.facet.custom.ui.internal.query;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.facet.custom.metamodel.v0_3_0.query.QueryPackage;
import org.eclipse.modisco.facet.custom.ui.internal.querytype.URIImageQueryEvaluator;
import org.eclipse.modisco.facet.efacet.core.IDerivedTypedElementManager;
import org.eclipse.modisco.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.modisco.facet.efacet.core.query.IQueryImplementation;
import org.eclipse.modisco.facet.efacet.core.query.IQueryImplementationFactory;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.extensible.Query;
import org.osgi.framework.Bundle;

public class URIImageQueryImplementationFactory implements
		IQueryImplementationFactory {

	public IQueryImplementation create(final Query query,
			final Bundle queryBundle, final IDerivedTypedElementManager manager)
			throws DerivedTypedElementException {
		return new URIImageQueryEvaluator();
	}

	public EClass getManagedQueryType() {
		return QueryPackage.eINSTANCE.getURIImageQuery();
	}

}
