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
package org.eclipse.modisco.jee.queries.annotations.jpa;

import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.gmt.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.modisco.jee.queries.annotations.internal.EvaluateAnnotation;

public class IsAccess implements IJavaModelQuery<BodyDeclaration, Boolean> {

	static final String ANNOTATION_NAME = "Access"; //$NON-NLS-1$
	static final String ANNOTATION_CLASS_EQUIVALENCE = "EntityBean"; //$NON-NLS-1$

	public Boolean evaluate(final BodyDeclaration context,
            final ParameterValueList parameterValues)
    throws ModelQueryExecutionException {

		return EvaluateAnnotation.evaluate(context,
				IsAccess.ANNOTATION_NAME);

//        if (EvaluateAnnotation.evaluateAnnotation(context,
//				parameterValues, IsAccess.ANNOTATION_NAME).equals(Boolean.TRUE)) {
//        	return Boolean.TRUE;
//        }
//       return false;
       // return new ResolveInheritance().evaluateAnnotation(context, parameterValues, IsAccess.ANNOTATION_CLASS_EQUIVALENCE);

	}

}