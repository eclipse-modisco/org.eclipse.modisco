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

package org.eclipse.modisco.java.queries.modifiers;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.VisibilityKind;

public class IsPrivate implements IJavaModelQuery<BodyDeclaration, Boolean> {

	public Boolean evaluate(final BodyDeclaration context, final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		try {
			if (context.getModifier() != null) {
				return VisibilityKind.PRIVATE.equals(context.getModifier().getVisibility());
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}
}
