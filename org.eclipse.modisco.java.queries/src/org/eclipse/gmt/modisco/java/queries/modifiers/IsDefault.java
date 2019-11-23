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

package org.eclipse.gmt.modisco.java.queries.modifiers;

import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.gmt.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.VisibilityKind;

public class IsDefault implements IJavaModelQuery<BodyDeclaration, Boolean> {

	public Boolean evaluate(final BodyDeclaration context, final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		if (context.getModifier() != null && context.getModifier().getVisibility() != null) {
			return context.getModifier().getVisibility().equals(VisibilityKind.NONE);
		}
		return true;
	}
}
