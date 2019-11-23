/*
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */

package org.eclipse.modisco.examples.modelplex.custom;

import org.eclipse.modisco.examples.modelplex.GetAllPotentialTypes;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.VariableDeclaration;

/**
 * @author Gabriel Barbier
 *
 */
public class HasPotentialTypes implements IJavaModelQuery<VariableDeclaration, Boolean> {

	public Boolean evaluate(final VariableDeclaration context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		GetAllPotentialTypes originalQuery = new GetAllPotentialTypes();
		return new Boolean(!originalQuery.getAllPotentialTypes(context)
				.isEmpty());
	}
}
