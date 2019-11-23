/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Guyomar (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.jee.queries.tests;

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
import org.eclipse.modisco.infra.query.core.exception.ModelQueryException;
import org.eclipse.modisco.java.ClassDeclaration;
import org.junit.Assert;
import org.junit.Test;

public class JeeServletAnnotations {

	private final String name = "jeeServletAnnotations"; //$NON-NLS-1$

	private final ResourceSet resourceSet = new ResourceSetImpl();

	@SuppressWarnings("boxing")
	@Test
	public void test() throws ModelQueryException {
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();

		ModelQuerySet querySet = catalog.getModelQuerySet(this.name);
		Assert.assertNotNull(querySet);

		// Retrieving some the queries for further testing
		ModelQuery queryIsMultipartConfig = querySet.getQuery("IsMultipartConfig"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsMultipartConfig);

		// Retrieving some the queries for further testing
		ModelQuery queryIsWebFilter = querySet.getQuery("IsWebFilter"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsWebFilter);

		// Retrieving some the queries for further testing
		ModelQuery queryIsWebInitParam = querySet.getQuery("IsWebInitParam"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsWebInitParam);

		// Retrieving some the queries for further testing
		ModelQuery queryIsWebListener = querySet.getQuery("IsWebListener"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsWebListener);

		// Retrieving some the queries for further testing
		ModelQuery queryIsWebServlet = querySet.getQuery("IsWebServlet"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsWebServlet);



		URI modelUri = URI
				.createURI("platform:/plugin/org.eclipse.modisco.jee.queries.tests/resources/AnnotationServlet.javaxmi"); //$NON-NLS-1$

		Resource myModel = this.resourceSet.getResource(modelUri, true);

		TreeIterator<EObject> treeIterator = myModel.getAllContents();
		while (treeIterator.hasNext()) {
			EObject eObject = treeIterator.next();

			AbstractModelQuery modelQueryImpl;
			Boolean result;

			if (eObject instanceof ClassDeclaration) {
				ClassDeclaration classDecl = (ClassDeclaration) eObject;
				if (classDecl.getName() != null) {
					if (classDecl.getName()
							.equalsIgnoreCase("InheritFilter")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsWebFilter);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(classDecl);
						Assert.assertTrue(result);
					} else if (classDecl.getName()
							.equalsIgnoreCase("InheritGenericServlet")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsWebServlet);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(classDecl);
						Assert.assertTrue(result);
					} else if (classDecl.getName()
							.equalsIgnoreCase("InheritServletContextListener")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsWebListener);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(classDecl);
						Assert.assertTrue(result);
					} else if (classDecl.getName()
							.equalsIgnoreCase("IsMultipartConfig")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsMultipartConfig);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(classDecl);
						Assert.assertTrue(result);
					} else if (classDecl.getName()
							.equalsIgnoreCase("IsWebFilter")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsWebFilter);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(classDecl);
						Assert.assertTrue(result);
					} else if (classDecl.getName()
							.equalsIgnoreCase("IsWebInitParam")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsWebInitParam);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(classDecl);
						Assert.assertTrue(result);
					} else if (classDecl.getName()
							.equalsIgnoreCase("IsWebListener")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsWebListener);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(classDecl);
						Assert.assertTrue(result);
					} else if (classDecl.getName()
							.equalsIgnoreCase("IsWebServlet")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsWebServlet);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(classDecl);
						Assert.assertTrue(result);
					}
				}
			}
		}

	}
}
