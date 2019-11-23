/**
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.java.queries.tests;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.core.AbstractModelQuery;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.modisco.java.CatchClause;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.junit.Assert;
import org.junit.Test;

public class Bug308303Test {

	private final String name = "textJavaQueries"; //$NON-NLS-1$

	private final ResourceSet resourceSet = new ResourceSetImpl();

	@Test
	public void textJavaQueriesTest() throws Exception {
			ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();

			ModelQuerySet querySet = catalog.getModelQuerySet(this.name);
			Assert.assertNotNull(querySet);

			ModelQuery queryGetQualifiedName = querySet
					.getQuery("getQualifiedName"); //$NON-NLS-1$
			Assert.assertNotNull(queryGetQualifiedName);

			URI modelUri = URI
					.createURI("platform:/plugin/org.eclipse.modisco.java.queries.tests/completeModel.javaxmi"); //$NON-NLS-1$

			Resource myModel = this.resourceSet.getResource(modelUri, true);

			TreeIterator<EObject> treeIterator = myModel.getAllContents();
			while (treeIterator.hasNext()) {
				EObject eObject = treeIterator.next();

				AbstractModelQuery modelQueryImpl;

				if (eObject instanceof CatchClause) {
					// catch (Exception theException) {...}
					SingleVariableDeclaration exceptionVariable = ((CatchClause) eObject).getException();

					modelQueryImpl = catalog
								.getModelQueryImpl(queryGetQualifiedName);
					String qName = (String) modelQueryImpl.basicEvaluate(exceptionVariable);
					Assert.assertTrue(qName != null && qName.equals("theException")); // qname must be "e" //$NON-NLS-1$

				}
			}
	}

}
