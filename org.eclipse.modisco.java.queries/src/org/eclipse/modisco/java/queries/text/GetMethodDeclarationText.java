/**
 * Copyright (c) 2009, 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Guyomar (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software)
 */
package org.eclipse.modisco.java.queries.text;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.SingleVariableDeclaration;

public class GetMethodDeclarationText implements IJavaModelQuery<MethodDeclaration, String> {

	public String evaluate(final MethodDeclaration context, final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		StringBuilder completeMethodName = new StringBuilder();
		if (context.getModifier() != null) {
			if (!context.getModifier().getVisibility().getName().equalsIgnoreCase("none")) { //$NON-NLS-1$
				completeMethodName.append(context.getModifier().getVisibility().getName());
				completeMethodName.append(" "); //$NON-NLS-1$
			}
		}
		if (context.getName() != null) {
			completeMethodName.append(context.getName());
		}
		if (context.getParameters() != null) {
			completeMethodName.append("("); //$NON-NLS-1$
			for (int i = 0; i < context.getParameters().size(); i++) {
				SingleVariableDeclaration var = context.getParameters().get(i);
				if (var.getType() != null && var.getType().getType() != null) {
					completeMethodName.append(var.getType().getType().getName())
							.append(" ").append(var.getName()); //$NON-NLS-1$
				}
				if (i != context.getParameters().size() - 1) {
					completeMethodName.append(", "); //$NON-NLS-1$
				}
			}
			completeMethodName.append(")"); //$NON-NLS-1$
		}
		return completeMethodName.toString();
	}

}
