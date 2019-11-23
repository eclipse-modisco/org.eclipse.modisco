/**
 *  Copyright (c) 2010 Mia-Software.
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

import java.util.ArrayList;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.jee.queries.annotations.internal.EvaluateAnnotation;
import org.eclipse.modisco.jee.queries.annotations.internal.ResolveInheritance;

public class IsApplicationException implements
		IJavaModelQuery<ClassDeclaration, Boolean> {

	static final String ANNOTATION_NAME = "ApplicationException"; //$NON-NLS-1$
	static final ArrayList<String> ANNOTATION_CLASS_NAME = new ArrayList<String>();

	public Boolean evaluate(final ClassDeclaration context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {

		if (EvaluateAnnotation.evaluate(context,
				IsApplicationException.ANNOTATION_NAME)
				.equals(Boolean.TRUE)) {
			return Boolean.TRUE;
		}

		IsApplicationException.ANNOTATION_CLASS_NAME.add("EJBException"); //$NON-NLS-1$
		IsApplicationException.ANNOTATION_CLASS_NAME.add("EJBCreateException"); //$NON-NLS-1$
		IsApplicationException.ANNOTATION_CLASS_NAME.add("RemoveException"); //$NON-NLS-1$
		IsApplicationException.ANNOTATION_CLASS_NAME.add("FinderException"); //$NON-NLS-1$

		return new ResolveInheritance().evaluate(context,
				IsApplicationException.ANNOTATION_CLASS_NAME);
	}

}