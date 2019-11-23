/**
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.java.queries.modifiers;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.InheritanceKind;

public class IsAbstract implements IJavaModelQuery<BodyDeclaration, Boolean> {

	public Boolean evaluate(final BodyDeclaration context, final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		try {
			return context.getModifier().getInheritance().equals(InheritanceKind.ABSTRACT);
		} catch (Exception e) {
			return false;
		}
	}
}
