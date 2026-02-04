/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.infra.query.core.java;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;

/**
 * @author Gregoire DUPE (Mia-Software)
 * @param <T>
 *            the context type
 * @param <R>
 *            the return type
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public interface IJavaModelQuery<T extends EObject, R> {

	/**
	 * This method must be overridden by each sub class to implement query
	 * evaluation.
	 *
	 * @param context
	 *            The query evaluation context
	 * @param parameterValues
	 *            The query parameter values
	 * @return the result of the type R
	 * @throws ModelQueryExecutionException
	 */
	public R evaluate(final T context, final ParameterValueList parameterValues)
			throws ModelQueryExecutionException;

}
