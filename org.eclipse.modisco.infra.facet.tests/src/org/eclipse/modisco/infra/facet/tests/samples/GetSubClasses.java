/**
 * Copyright (c) 2009, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.infra.facet.tests.samples;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;

public class GetSubClasses implements IJavaModelQuery<EClass, EList<EClass>> {

	public EList<EClass> evaluate(final EClass context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		EList<EClass> result = new BasicEList<EClass>();
		EClass contextEClass = context;
		TreeIterator<EObject> content = context.eResource().getAllContents();
		while (content.hasNext()) {
			EObject eObject = content.next();
			if (eObject instanceof EClass) {
				EClass currentEClass = (EClass) eObject;
				if (contextEClass.isSuperTypeOf(currentEClass)) {
					result.add(currentEClass);
				}
			}
		}
		return result;
	}

}
