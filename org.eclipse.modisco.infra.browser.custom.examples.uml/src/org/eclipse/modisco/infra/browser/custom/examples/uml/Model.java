/*******************************************************************************
 * Copyright (c) 2009 Mia-Software and others.
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
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Package;

/**
 * @author Gregoire DUPE (Mia-Software)
 */
public class Model implements
		IJavaModelQuery<Classifier, org.eclipse.uml2.uml.Package> {

	public Package evaluate(final Classifier context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		org.eclipse.uml2.uml.Package parent = context.getPackage();
		while (parent.getNestingPackage() != null) {
			parent = parent.getNestingPackage();
		}
		return parent;
	}

}
