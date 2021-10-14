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
package org.eclipse.modisco.infra.browser.custom.tests.queries;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;

public class DoesEClassNameStartWithEP implements
		IJavaModelQuery<EClass, Boolean> {
	public Boolean evaluate(final EClass context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		return new Boolean(context.getName().startsWith("EP")); //$NON-NLS-1$
	}
}
