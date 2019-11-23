/**
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Guyomar (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */

package org.eclipse.modisco.java.queries.text;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.FieldDeclaration;
import org.eclipse.modisco.java.Initializer;
import org.eclipse.modisco.java.NamedElement;
import org.eclipse.modisco.java.internal.util.JavaUtil;

public class GetQualifiedName implements IJavaModelQuery<NamedElement, String> {

	public String evaluate(final NamedElement context, final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		if (context instanceof FieldDeclaration || context instanceof Initializer) {
			return ""; // TODO temporary fix, see 305662 //$NON-NLS-1$
		}
		return JavaUtil.getQualifiedName(context);
	}
}
