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
package org.eclipse.modisco.jee.queries.annotations.ejb;

import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.gmt.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.modisco.jee.queries.annotations.internal.EvaluateAnnotation;
import org.eclipse.modisco.jee.queries.annotations.internal.ResolveInheritance;

public class IsRemote implements IJavaModelQuery<ClassDeclaration, Boolean> {

	static final String ANNOTATION_NAME = "Remote"; //$NON-NLS-1$
	static final String ANNOTATION_CLASS_NAME = "EJBObject"; //$NON-NLS-1$

	public Boolean evaluate(final ClassDeclaration context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {

		if (EvaluateAnnotation.evaluate(context,
				IsRemote.ANNOTATION_NAME).equals(Boolean.TRUE)) {
			return Boolean.TRUE;
		}
		return new ResolveInheritance().evaluate(context,
				IsRemote.ANNOTATION_CLASS_NAME);
	}

}