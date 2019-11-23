/**
 *  Copyright (c) 2010 Mia-Software.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *
 *  	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.queries.annotations.servlet;

import java.util.ArrayList;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.jee.queries.annotations.internal.EvaluateAnnotation;
import org.eclipse.modisco.jee.queries.annotations.internal.ResolveInheritance;

public class IsWebServlet implements IJavaModelQuery<ClassDeclaration, Boolean> {

	static final String ANNOTATION_NAME = "WebServlet"; //$NON-NLS-1$
	private  ArrayList<String> annotationClassName = null;

	public Boolean evaluate(final ClassDeclaration context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {

		if (EvaluateAnnotation.evaluate(context,
				IsWebServlet.ANNOTATION_NAME).equals(
				Boolean.TRUE)) {
			return Boolean.TRUE;
		}
		this.annotationClassName = new ArrayList<String>();
		this.annotationClassName.add("HttpServlet"); //$NON-NLS-1$
		this.annotationClassName.add("GenericServlet"); //$NON-NLS-1$
		this.annotationClassName.add("Servlet"); //$NON-NLS-1$

		return new ResolveInheritance().evaluate(context,
				this.annotationClassName);
	}

}
