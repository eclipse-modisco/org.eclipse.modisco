package org.eclipse.modisco.infra.query.tests.samples;
/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;

public class Test002 implements IJavaModelQuery<EObject, String> {

	public String evaluate(final EObject context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		return "Test002"; //$NON-NLS-1$
	}
}