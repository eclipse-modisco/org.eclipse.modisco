/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.examples.uml;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.uml2.uml.Property;

/**
 * @author Gregoire DUPE (Mia-Software)
 */
public class IsStringProperty implements IJavaModelQuery<Property, Boolean> {

	public Boolean evaluate(final Property context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		return new Boolean(context.getType().getName().equals("String")); //$NON-NLS-1$
	}

}
