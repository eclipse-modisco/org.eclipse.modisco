/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
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
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.junit.Assert;
import org.junit.Test;

public class JeeJpaAnnotations {

	private final String name = "jeeJpaAnnotations"; //$NON-NLS-1$

	private final ResourceSet resourceSet = new ResourceSetImpl();

	@SuppressWarnings("boxing")
	@Test
	public void test() throws ModelQueryException {
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();

		ModelQuerySet querySet = catalog.getModelQuerySet(this.name);
		Assert.assertNotNull(querySet);

		// Retrieving some the queries for further testing
		ModelQuery queryIsCacheable = querySet.getQuery("IsCacheable"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsCacheable);

		ModelQuery queryIsEntityResult = querySet.getQuery("IsEntityResult"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsEntityResult);

		ModelQuery queryIsTable = querySet.getQuery("IsTable"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsTable);

		ModelQuery queryIsGeneratedValue = querySet
				.getQuery("IsGeneratedValue"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsGeneratedValue);

		URI modelUri = URI
				.createURI("platform:/plugin/org.eclipse.modisco.jee.queries.tests/resources/AnnotationJPA.javaxmi"); //$NON-NLS-1$

		Resource myModel = this.resourceSet.getResource(modelUri, true);

		TreeIterator<EObject> treeIterator = myModel.getAllContents();

		while (treeIterator.hasNext()) {
			EObject eObject = treeIterator.next();

			AbstractModelQuery modelQueryImpl;
			Boolean result;

			if (eObject instanceof MethodDeclaration) {
				MethodDeclaration methDecl = (MethodDeclaration) eObject;

				if (methDecl.getName() != null) {
					if (methDecl.getName().equalsIgnoreCase("MethodAnnotated")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsGeneratedValue);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(methDecl);
						Assert.assertTrue(result);
					}
				}
			} else if (eObject instanceof ClassDeclaration) {
				ClassDeclaration classDecl = (ClassDeclaration) eObject;
				if (classDecl.getName() != null) {
					if (classDecl.getName().equalsIgnoreCase(
							"AnnotationCacheable")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsCacheable);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(classDecl);
						Assert.assertTrue(result);
					} else if (classDecl.getName().equalsIgnoreCase(
							"AnnotationEntityResult")) { //$NON-NLS-1$
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsEntityResult);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(classDecl);
						Assert.assertTrue(result);
					}

				} else if (eObject instanceof InterfaceDeclaration) {
					InterfaceDeclaration interDecl = (InterfaceDeclaration) eObject;
					if (interDecl.getName() != null) {
						if (interDecl.getName().equalsIgnoreCase(
								"AnnotationTable")) { //$NON-NLS-1$
							modelQueryImpl = catalog
									.getModelQueryImpl(queryIsTable);
							result = (Boolean) modelQueryImpl
									.basicEvaluate(interDecl);
							Assert.assertTrue(result);
						}
					}
				}

			}
		}
	}
}
