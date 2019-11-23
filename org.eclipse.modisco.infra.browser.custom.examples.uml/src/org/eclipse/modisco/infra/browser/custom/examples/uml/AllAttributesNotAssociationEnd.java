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
package org.eclipse.modisco.infra.browser.custom.examples.uml;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;

/**
 * @author Gregoire DUPE (Mia-Software)
 */
public class AllAttributesNotAssociationEnd implements
		IJavaModelQuery<Classifier, List<Property>> {

	/**
	 * Returns all the attributes: firstly the attributes owned by the parent
	 * class Renvoie tous les attributs : d'abord les attributs des classes
	 * meres (allParents), puis ceux de la classe
	 */
	public List<Property> evaluate(final Classifier context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		List<Classifier> allParents = new AllParents().evaluate(context, null);
		List<Property> allAttributes = new ArrayList<Property>();
		for (Iterator<Classifier> i = allParents.iterator(); i.hasNext();) {
			org.eclipse.uml2.uml.Classifier parent = i.next();
			allAttributes.addAll(new AttributesNotAssociationEnds().evaluate(
					parent, null));
		}
		allAttributes.addAll(new AttributesNotAssociationEnds().evaluate(
				context, null));
		return allAttributes;
	}

}
