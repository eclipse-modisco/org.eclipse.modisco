/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.java.queries.text;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.SingleVariableAccess;

public class GetSingleVariableAccessText implements IJavaModelQuery<SingleVariableAccess, String> {

	public String evaluate(final SingleVariableAccess context,
			final ParameterValueList parameterValues) throws ModelQueryExecutionException {
		if (context != null && context.getVariable() != null) {
			return context.getVariable().getName();
		}
		return ""; //$NON-NLS-1$
	}

}
