/*******************************************************************************
 * Copyright (c) 2012, 2019 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 376941 - [EFacet] Facet operation arguments in Facet model
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.core.query;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.facet.efacet.core.IDerivedTypedElementManager;
import org.eclipse.modisco.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.extensible.Query;
import org.osgi.framework.Bundle;

/**
 * This factory allows clients to create a {@link IQueryImplementation} for queries corresponding to this type of
 * factory.
 * 
 * @since 0.2
 */
public interface IQueryImplementationFactory {

	/**
	 * Create a query implementation for the given query.
	 * 
	 * @param query
	 *            the query to create an implementation for
	 * @param queryBundle
	 *            the bundle in which the query is defined. May be <code>null</code> if the query is not defined in a
	 *            {@link Bundle}.
	 */
	IQueryImplementation create(Query query, Bundle queryBundle, IDerivedTypedElementManager manager)
			throws DerivedTypedElementException;

	/**
	 * Return the type of query handled by this implementation.
	 * 
	 * @return the type of query this implementation handles.
	 */
	EClass getManagedQueryType();
}
