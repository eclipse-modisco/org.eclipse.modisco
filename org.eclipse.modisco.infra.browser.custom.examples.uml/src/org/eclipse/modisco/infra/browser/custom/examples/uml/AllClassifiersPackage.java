/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.examples.uml;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

/**
 * @author Gregoire DUPE (Mia-Software)
 */
public class AllClassifiersPackage implements
		IJavaModelQuery<org.eclipse.uml2.uml.Package, List<Classifier>> {

	public List<Classifier> evaluate(final Package context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		List<Classifier> allClassifiers = new ArrayList<Classifier>();
		for (Element ownedElement : context.getOwnedElements()) {
			if (ownedElement instanceof Classifier) {
				Classifier ownedClassifier = (Classifier) ownedElement;
				allClassifiers.add(ownedClassifier);
			}
		}
		// for (Type classifier : context.getOwnedTypes()){
		// allClassifiers.addAll(new
		// AllClassifiers_Classifier().evaluate(classifier));
		// }
		for (Package package1 : context.getNestedPackages()) {
			allClassifiers.addAll(new AllClassifiersPackage().evaluate(
					package1, null));
		}
		return allClassifiers;
	}

}
