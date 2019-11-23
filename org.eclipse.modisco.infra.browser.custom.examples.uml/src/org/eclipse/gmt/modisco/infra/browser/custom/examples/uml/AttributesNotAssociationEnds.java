/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.custom.examples.uml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.gmt.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;

/**
 * @author Gregoire DUPE (Mia-Software)
 */
public class AttributesNotAssociationEnds implements
		IJavaModelQuery<Classifier, Collection<? extends Property>> {

	public Collection<? extends Property> evaluate(final Classifier context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		List<Property> result = new ArrayList<Property>();
		for (Property property : context.getAttributes()) {
			if (new IsAssociationEnd().evaluate(property, null).booleanValue()) {
				result.add(property);
			}
		}
		return result;
	}

}
