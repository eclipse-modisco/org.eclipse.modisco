/*******************************************************************************
 * Copyright (c) 2019 Mia-Software and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Unknown - initial API and implementation
 *******************************************************************************/
/**
 *  Copyright (c) 2010 Mia-Software and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *
 *  Contributors:
 *
 *  	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */package org.eclipse.modisco.jee.queries.annotations.ejb;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.jee.queries.annotations.internal.EvaluateAnnotation;

public class IsRunAs implements IJavaModelQuery<ClassDeclaration, Boolean> {

	static final String ANNOTATION_NAME = "RunAs"; //$NON-NLS-1$

	public Boolean evaluate(final ClassDeclaration context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {

		return EvaluateAnnotation.evaluate(context,
				IsRunAs.ANNOTATION_NAME);
	}

}
