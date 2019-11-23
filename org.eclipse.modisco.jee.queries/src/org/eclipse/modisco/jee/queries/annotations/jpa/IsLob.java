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
package org.eclipse.modisco.jee.queries.annotations.jpa;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.jee.queries.annotations.internal.EvaluateAnnotation;

public class IsLob implements IJavaModelQuery<BodyDeclaration, Boolean> {

	static final String ANNOTATION_NAME = "Lob"; //$NON-NLS-1$

	public Boolean evaluate(final BodyDeclaration context,
            final ParameterValueList parameterValues)
    throws ModelQueryExecutionException {

        return EvaluateAnnotation.evaluate(context,
				IsLob.ANNOTATION_NAME);
	}

}