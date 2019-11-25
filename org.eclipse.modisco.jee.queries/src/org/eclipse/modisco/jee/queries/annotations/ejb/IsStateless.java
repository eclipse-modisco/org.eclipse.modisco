/**
 *  Copyright (c) 2010, 2019 Mia-Software and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *
 *  Contributors:
 *
 *  	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.queries.annotations.ejb;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.jee.queries.annotations.internal.EvaluateAnnotation;
import org.eclipse.modisco.jee.queries.annotations.internal.ResolveInheritance;

public class IsStateless implements IJavaModelQuery<ClassDeclaration, Boolean> {

	static final String ANNOTATION_NAME = "Stateless"; //$NON-NLS-1$
	static final String ANNOTATION_CLASS_NAME = "SessionBean"; //$NON-NLS-1$

	public Boolean evaluate(final ClassDeclaration context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {

		if (EvaluateAnnotation.evaluate(context,
				IsStateless.ANNOTATION_NAME).equals(
				Boolean.TRUE)) {
			return Boolean.TRUE;
		}
		return new ResolveInheritance().evaluate(context,
				IsStateless.ANNOTATION_CLASS_NAME);
	}

}