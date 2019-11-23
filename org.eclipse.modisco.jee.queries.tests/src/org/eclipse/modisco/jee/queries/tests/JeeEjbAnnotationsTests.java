/*******************************************************************************
 * Copyright (c) 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
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
import org.eclipse.modisco.java.MethodDeclaration;
import org.junit.Assert;
import org.junit.Test;

public class JeeEjbAnnotationsTests {

	private final String name = "jeeEjbAnnotations"; //$NON-NLS-1$

	private final ResourceSet resourceSet = new ResourceSetImpl();

	@SuppressWarnings("boxing")
	@Test
	public void test() throws ModelQueryException {
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();

		ModelQuerySet querySet = catalog.getModelQuerySet(this.name);
		Assert.assertNotNull(querySet);

		// Retrieving some the queries for further testing
		ModelQuery queryIsStateful = querySet.getQuery("IsStateful"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsStateful);

		ModelQuery queryIsRemote = querySet.getQuery("IsRemote"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsRemote);

		ModelQuery queryIsStateless = querySet.getQuery("IsStateless"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsStateless);

		ModelQuery queryIsRemove = querySet.getQuery("IsRemove"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsRemove);

		ModelQuery queryIsPreDestroy = querySet.getQuery("IsPreDestroy"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsPreDestroy);

		ModelQuery queryIsInit = querySet.getQuery("IsInit"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsInit);

		ModelQuery queryIsApplicationException = querySet.getQuery("IsApplicationException"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsApplicationException);

		ModelQuery queryIsMessageDriven = querySet.getQuery("IsMessageDriven"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsMessageDriven);

		URI modelUri = URI
				.createURI("platform:/plugin/org.eclipse.modisco.jee.queries.tests/resources/AnnotationEJB.javaxmi"); //$NON-NLS-1$

		Resource myModel = this.resourceSet.getResource(modelUri, true);

		TreeIterator<EObject> treeIterator = myModel.getAllContents();
		while (treeIterator.hasNext()) {
			EObject eObject = treeIterator.next();

			AbstractModelQuery modelQueryImpl;
			Boolean result;

			if (eObject instanceof MethodDeclaration) {

				MethodDeclaration methDecl = (MethodDeclaration) eObject;
				if (methDecl.getName() != null) {
					if (methDecl.getName().equalsIgnoreCase("methodRemove")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsRemove);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(methDecl);
						Assert.assertTrue(result);
					} else if (methDecl.getName().equalsIgnoreCase(
							"methodPreDestroy")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsPreDestroy);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(methDecl);
						Assert.assertTrue(result);
					} else if (methDecl.getName()
							.equalsIgnoreCase("methodInit")) { //$NON-NLS-1$
						modelQueryImpl = catalog.getModelQueryImpl(queryIsInit);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(methDecl);
						Assert.assertTrue(result);
					}
				}
			} else if (eObject instanceof ClassDeclaration) {
				ClassDeclaration classDecl = (ClassDeclaration) eObject;
				if (classDecl.getName() != null) {
					if (classDecl.getName()
							.equalsIgnoreCase("AnnotationRemote")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsRemote);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(classDecl);
						Assert.assertTrue(result);
					} else if (classDecl.getName().equalsIgnoreCase(
							"AnnotationStateful")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsStateful);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(classDecl);
						Assert.assertTrue(result);
					} else if (classDecl.getName().equalsIgnoreCase(
							"AnnotationStateless")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsStateless);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(classDecl);
						Assert.assertTrue(result);
					} else if (classDecl.getName().equalsIgnoreCase(
							"InheritEJBException")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsApplicationException);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(classDecl);
						Assert.assertTrue(result);
					} else if (classDecl.getName().equalsIgnoreCase(
							"InheritMessageDrivenBean")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsMessageDriven);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(classDecl);
						Assert.assertTrue(result);
					}
				}
			}
		}
	}
}
