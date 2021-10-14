/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
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
import org.eclipse.modisco.infra.query.core.exception.ModelQueryException;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.FieldDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.TypeAccess;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("boxing")
public class ModifierJavaQueriesTest {

	private final String name = "modifierJavaQueries"; //$NON-NLS-1$

	private final ResourceSet resourceSet = new ResourceSetImpl();

	@Test
	public void modifierJavaQueriesTest() throws ModelQueryException {
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();

		ModelQuerySet querySet = catalog.getModelQuerySet(this.name);
		Assert.assertNotNull(querySet);

		// Retrieving all the queries for further testing
		ModelQuery queryIsAbstract = querySet.getQuery("isAbstract"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsAbstract);

		ModelQuery queryIsAccess = querySet.getQuery("isAccess"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsAccess);

		ModelQuery queryIsDefault = querySet.getQuery("isDefault"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsDefault);

		ModelQuery queryIsDeprecated = querySet.getQuery("isDeprecated"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsDeprecated);

		ModelQuery queryIsFinal = querySet.getQuery("isFinal"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsFinal);

		ModelQuery queryIsGenerated = querySet.getQuery("isGenerated"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsGenerated);

		ModelQuery queryIsNative = querySet.getQuery("isNative"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsNative);

		ModelQuery queryIsOverridden = querySet.getQuery("isOverridden"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsOverridden);

		ModelQuery queryIsPrivate = querySet.getQuery("isPrivate"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsPrivate);

		ModelQuery queryIsProtected = querySet.getQuery("isProtected"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsProtected);

		ModelQuery queryIsPublic = querySet.getQuery("isPublic"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsPublic);

		ModelQuery queryIsStatic = querySet.getQuery("isStatic"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsStatic);

		ModelQuery queryIsSupressWarning = querySet
				.getQuery("isSuppressWarnings"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsSupressWarning);

		ModelQuery queryIsSynchronized = querySet.getQuery("isSynchronized"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsSynchronized);

		ModelQuery queryIsTransient = querySet.getQuery("isTransient"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsTransient);

		ModelQuery queryIsUnresolved = querySet.getQuery("isUnresolved"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsUnresolved);

		ModelQuery queryIsVolatile = querySet.getQuery("isVolatile"); //$NON-NLS-1$
		Assert.assertNotNull(queryIsVolatile);

		URI modelUri = URI
				.createURI("platform:/plugin/org.eclipse.modisco.java.queries.tests/completeModel.javaxmi"); //$NON-NLS-1$

		Resource myModel = this.resourceSet.getResource(modelUri, true);

		TreeIterator<EObject> treeIterator = myModel.getAllContents();
		while (treeIterator.hasNext()) {
			EObject eObject = treeIterator.next();

			AbstractModelQuery modelQueryImpl;
			Boolean result;

			if (eObject instanceof MethodDeclaration) {
				MethodDeclaration methDecl = (MethodDeclaration) eObject;
				if (methDecl.getName() != null) {
					if (methDecl.getName().equalsIgnoreCase(
							"protectedFinalStaticSynchro")) { //$NON-NLS-1$

						// Test query isProtected
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsProtected);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(methDecl);
						Assert.assertEquals(result, true);

						// Test query isFinal
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsFinal);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(methDecl);
						Assert.assertEquals(result, true);

						// Test query isStatic
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsStatic);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(methDecl);
						Assert.assertEquals(result, true);

						// Test query isSynchronized
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsSynchronized);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(methDecl);
						Assert.assertEquals(result, true);

					} else if (methDecl.getName().equalsIgnoreCase(
							"myGeneratedMethod")) { //$NON-NLS-1$
						// Test query isGenerated
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsGenerated);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(methDecl);
						Assert.assertEquals(result, true);

						// Test query isSuppressWarning
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsSupressWarning);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(methDecl);
						Assert.assertEquals(result, true);

						// Test query isPublic
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsPublic);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(methDecl);
						Assert.assertEquals(result, true);
					} else if (methDecl.getName().equalsIgnoreCase(
							"privateNative")) { //$NON-NLS-1$
						// Test query isNative
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsNative);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(methDecl);
						Assert.assertEquals(result, true);

						// Test query isDeprecated
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsDeprecated);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(methDecl);
						Assert.assertEquals(result, true);
					} else if (methDecl.getName().equalsIgnoreCase(
							"publicAbstractMethod")) { //$NON-NLS-1$
						// Test query isAbstract
						modelQueryImpl = catalog
								.getModelQueryImpl(queryIsAbstract);
						result = (Boolean) modelQueryImpl
								.basicEvaluate(methDecl);
						Assert.assertEquals(result, true);
					} else if (methDecl.getName().equalsIgnoreCase(
							"protectedAbstract")) { //$NON-NLS-1$
						ClassDeclaration classDecl = (ClassDeclaration) methDecl
								.eContainer();
						if (classDecl.getName().equalsIgnoreCase("MyIconList")) { //$NON-NLS-1$
							// Test query isOverride
							modelQueryImpl = catalog
									.getModelQueryImpl(queryIsOverridden);
							result = (Boolean) modelQueryImpl
									.basicEvaluate(methDecl);
							Assert.assertEquals(result, true);
						}
					}
				}
			} else if (eObject instanceof TypeAccess) {
				TypeAccess typeAccess = (TypeAccess) eObject;
				// Test query isAccess
				modelQueryImpl = catalog.getModelQueryImpl(queryIsAccess);
				result = (Boolean) modelQueryImpl.basicEvaluate(typeAccess);
				Assert.assertEquals(result, true);
			} else if (eObject instanceof FieldDeclaration) {
				FieldDeclaration fieldDecl = (FieldDeclaration) eObject;
				if (!fieldDecl.getFragments().isEmpty()) {
					if (fieldDecl.getFragments().get(0).getName() != null) {
						if (fieldDecl.getFragments().get(0).getName()
								.equalsIgnoreCase("privateVolatileField")) { //$NON-NLS-1$

							// Test query isPrivate
							modelQueryImpl = catalog
									.getModelQueryImpl(queryIsPrivate);
							result = (Boolean) modelQueryImpl
									.basicEvaluate(fieldDecl);
							Assert.assertEquals(result, true);

							// Test query isVolatile
							modelQueryImpl = catalog
									.getModelQueryImpl(queryIsVolatile);
							result = (Boolean) modelQueryImpl
									.basicEvaluate(fieldDecl);
							Assert.assertEquals(result, true);
						} else if (fieldDecl.getFragments().get(0).getName()
								.equalsIgnoreCase("transientField")) { //$NON-NLS-1$
							// Test query isTransient
							modelQueryImpl = catalog
									.getModelQueryImpl(queryIsTransient);
							result = (Boolean) modelQueryImpl
									.basicEvaluate(fieldDecl);
							Assert.assertEquals(result, true);

							// Test query isDefault
							modelQueryImpl = catalog
									.getModelQueryImpl(queryIsDefault);
							result = (Boolean) modelQueryImpl
									.basicEvaluate(fieldDecl);
							Assert.assertEquals(result, true);
						}
					}
				}
			}
		}
	}

}
