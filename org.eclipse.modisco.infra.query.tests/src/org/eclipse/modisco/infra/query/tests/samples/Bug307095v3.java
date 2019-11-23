/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.query.tests.samples;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.infra.query.tests.samples.bug307095.HelperBug307095v3;

public class Bug307095v3 implements IJavaModelQuery<EObject, String> {



	public String evaluate(final EObject context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		return HelperBug307095v3.RESULT;
	}

}
