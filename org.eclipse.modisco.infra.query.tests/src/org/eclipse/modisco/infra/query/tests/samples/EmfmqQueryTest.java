package org.eclipse.modisco.infra.query.tests.samples;

import java.util.Collections;
/**
 * Copyright (c) 2009,2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;

public class EmfmqQueryTest implements
		IJavaModelQuery<EPackage, Set<? extends EObject>> {

	public Set<? extends EObject> evaluate(final EPackage context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
/*	Functionality removed in accordance with Bug 583470
 * 		EPackage ePackage = context;
		SELECT statement = new SELECT(new FROM(ePackage.getEClassifiers()),
				new WHERE(new EObjectAttributeValueCondition(
						EcorePackage.eINSTANCE.getENamedElement_Name(),
						new SubStringValue("EC")))); //$NON-NLS-1$
		return statement.execute().getEObjects(); */
		return Collections.emptySet();
	}
}