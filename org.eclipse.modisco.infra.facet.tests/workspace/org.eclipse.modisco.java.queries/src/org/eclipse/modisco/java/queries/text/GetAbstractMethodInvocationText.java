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
import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.SingleVariableDeclaration;

public class GetAbstractMethodInvocationText implements
		IJavaModelQuery<AbstractMethodInvocation, String> {

	public String evaluate(final AbstractMethodInvocation context,
			final ParameterValueList parameterValues) throws ModelQueryExecutionException {
		StringBuilder builder = new StringBuilder();
		if (context != null && context.getMethod() != null && context.getMethod().getName() != null) {
			builder.append(context.getMethod().getName());

			if (context.getMethod().getParameters() != null) {
				builder.append("("); //$NON-NLS-1$
				for (int i = 0; i < context.getMethod().getParameters().size(); i++) {
					SingleVariableDeclaration param = context.getMethod().getParameters().get(i);
					if (param != null && param.getType() != null
							&& param.getType().getType() != null) {
						builder.append(param.getType().getType().getName());
						builder.append(" ").append(param.getName()); //$NON-NLS-1$
					}
					if (i != context.getMethod().getParameters().size() - 1) {
						builder.append(", "); //$NON-NLS-1$
					}
				}
				builder.append(")"); //$NON-NLS-1$
			}
		}
		return builder.toString();
	}
}
