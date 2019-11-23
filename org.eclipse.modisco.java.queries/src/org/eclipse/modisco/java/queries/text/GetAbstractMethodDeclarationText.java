/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.java.queries.text;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.SingleVariableDeclaration;

public class GetAbstractMethodDeclarationText implements
		IJavaModelQuery<AbstractMethodDeclaration, String> {

	public String evaluate(final AbstractMethodDeclaration context,
			final ParameterValueList parameterValues) throws ModelQueryExecutionException {
		StringBuilder builder = new StringBuilder();
		if (context != null && context.getName() != null && context.getName().length() > 0) {
			builder.append(context.getName());
			if (context.getParameters() != null) {
				builder.append("("); //$NON-NLS-1$
				for (int i = 0; i < context.getParameters().size(); i++) {
					SingleVariableDeclaration param = context.getParameters().get(i);
					if (param != null && param.getType() != null
							&& param.getType().getType() != null) {
						builder.append(param.getType().getType().getName());
						builder.append(" ").append(param.getName()); //$NON-NLS-1$
					}
					if (i != context.getParameters().size() - 1) {
						builder.append(", "); //$NON-NLS-1$
					}
				}
				builder.append(")"); //$NON-NLS-1$
			}
		}
		return builder.toString();
	}
}
