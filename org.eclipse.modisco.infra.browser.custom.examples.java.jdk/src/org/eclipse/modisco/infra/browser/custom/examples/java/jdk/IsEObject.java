/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Nicolas Guyomar (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.examples.java.jdk;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeDeclaration;

public class IsEObject implements IJavaModelQuery<TypeDeclaration, Boolean> {

	public Boolean evaluate(final TypeDeclaration context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		TypeDeclaration typeDeclaration = context;
		for (TypeAccess ta : typeDeclaration.getSuperInterfaces()) {
			if (ta.getType().getName().equals("EObject")) { //$NON-NLS-1$
				return new Boolean(true);
			}
		}
		return new Boolean(false);
	}


}
