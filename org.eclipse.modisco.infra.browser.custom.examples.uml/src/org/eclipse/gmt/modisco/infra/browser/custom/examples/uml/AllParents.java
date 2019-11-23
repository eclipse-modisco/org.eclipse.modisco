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
import java.util.Iterator;
import java.util.List;

import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.gmt.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.uml2.uml.Classifier;

/**
 * @author Gregoire DUPE (Mia-Software)
 */
public class AllParents implements
		IJavaModelQuery<Classifier, List<Classifier>> {

	public List<Classifier> evaluate(final Classifier context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		List<Classifier> parents = new Parents().evaluate(context, null);
		List<Classifier> allParents = new ArrayList<Classifier>();
		for (Iterator<Classifier> i = parents.iterator(); i.hasNext();) {
			Classifier parent = i.next();
			if (!allParents.contains(parent)) {
				for (Iterator<Classifier> j = this.evaluate(parent, null)
						.iterator(); j
						.hasNext();) {
					Classifier element = j.next();
					if (!allParents.contains(element)) {
						allParents.add(element);
					}
				}
				allParents.add(parent);
			}
		}
		return allParents;
	}

}
