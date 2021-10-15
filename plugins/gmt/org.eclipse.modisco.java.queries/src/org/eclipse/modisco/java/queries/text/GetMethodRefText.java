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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.MethodRef;
import org.eclipse.modisco.java.TagElement;

public class GetMethodRefText implements IJavaModelQuery<MethodRef, String> {

	public String evaluate(final MethodRef context, final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {

		StringBuilder builder = new StringBuilder();

		if (context != null) {
			EObject eContainer = context.eContainer();
			if (eContainer instanceof TagElement) {
				TagElement tagElement = (TagElement) eContainer;
				builder.append(tagElement.getTagName()).append(" on "); //$NON-NLS-1$
				if (context.getMethod() != null && context.getMethod().getName() != null) {
					builder.append(context.getMethod().getName());
				}
			}
		}
		return builder.toString();
	}

}
