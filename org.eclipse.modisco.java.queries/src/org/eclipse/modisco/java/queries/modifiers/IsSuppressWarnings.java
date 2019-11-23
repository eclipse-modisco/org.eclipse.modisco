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
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.BodyDeclaration;

public class IsSuppressWarnings implements IJavaModelQuery<BodyDeclaration, Boolean> {

	public Boolean evaluate(final BodyDeclaration context, final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		try {
			if (context.getAnnotations() != null) {
				for (Annotation annotation : context.getAnnotations()) {
					if (annotation != null && annotation.getType() != null
							&& annotation.getType().getType() != null) {
						if ("SuppressWarnings".equalsIgnoreCase(annotation.getType().getType().getName())) { //$NON-NLS-1$
							return true;
						}
					}
				}
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}
}
