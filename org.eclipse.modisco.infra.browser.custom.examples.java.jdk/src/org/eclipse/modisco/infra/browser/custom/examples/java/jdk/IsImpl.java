/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Nicolas Guyomar (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.examples.java.jdk;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.ClassDeclaration;

public class IsImpl implements IJavaModelQuery<ClassDeclaration, Boolean> {

	public Boolean evaluate(final ClassDeclaration context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {

		return new Boolean(new IsIndirectEObject().evaluate(context,
				parameterValues).booleanValue()
				&& context.getName().matches(".*Impl")); //$NON-NLS-1$
	}
}
