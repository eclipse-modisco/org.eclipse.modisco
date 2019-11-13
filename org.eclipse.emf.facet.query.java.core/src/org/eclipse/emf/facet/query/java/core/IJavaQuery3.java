/**
 * Copyright (c) 2009, 2014 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Gregoire Dupe (Mia-Software) - initial API and implementation
 *     Emmanuelle RouillÃ© (Mia-Software) - Bug 352618 - To be able to use non derived facet structural features and save them values.
 *     Nicolas Bros (Mia-Software) - Bug 361612 - New core for new version of the Facet metamodel
 *     Nicolas Bros (Mia-Software) - Bug 362191 - [Restructuring] Query mechanism for eFacet2
 *     Gregoire Dupe (Mia-Software) - Bug 443682 - Access to the super facet
 */
package org.eclipse.emf.facet.query.java.core;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.DerivedTypedElement;

/**
 * This interface is implemented by each Java query (a Java query is a query written in Java).
 *
 * @param <T>
 *            the source type of the query
 * @param <R>
 *            the return type of the query
 * @since 0.5
 */
public interface IJavaQuery3<T extends EObject, R> {
	// This interface is a copy of
	// org.eclipse.emf.facet.infra.query.core.java.IJavaModelQuery<T, R>

	/**
	 * This method must be implemented by each sub class to implement query
	 * evaluation.
	 *
	 * @param source
	 *            The model element on which the query will be evaluated
	 * @param parameterValues
	 *            The query parameter values (only used for queries that implement operations)
	 * @return the result of the query
	 * @throws DerivedTypedElementException
	 */
	R evaluate(T source, IParameterValueList2 parameterValues, 
			IFacetManager facetManager, DerivedTypedElement feature)
			throws DerivedTypedElementException;
}
