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
package org.eclipse.gmt.modisco.java.queries.text;

import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.gmt.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;

public class GetFieldDeclarationText implements IJavaModelQuery<FieldDeclaration, String> {

	public String evaluate(final FieldDeclaration context, final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {

		StringBuilder builder = new StringBuilder();

		if (context.getModifier() != null && context.getModifier().getVisibility() != null) {
			builder.append(context.getModifier().getVisibility().getName()).append(" "); //$NON-NLS-1$
		}

		if (context.getType() != null && context.getType().getType() != null) {
			if (context.getType().getType().getName() != null) {
				builder.append(context.getType().getType().getName() + " "); //$NON-NLS-1$
			}
		}

		if (context.getName() != null) {
			builder.append(context.getName());
		} else if (context.getFragments() != null && context.getFragments().size() > 0) {
			VariableDeclarationFragment variableDeclarationFragment = context.getFragments().get(0);
			if (variableDeclarationFragment != null) {
				builder.append(variableDeclarationFragment.getName());
			}
		}

		return builder.toString();
	}

}
