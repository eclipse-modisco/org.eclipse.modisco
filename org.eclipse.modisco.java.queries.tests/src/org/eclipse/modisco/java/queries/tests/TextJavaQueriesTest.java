/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Guyomar (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software)
 *     Nicolas Bros (Mia-Software)
 */
package org.eclipse.modisco.java.queries.tests;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.modisco.infra.facet.tests.FacetTests;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.core.AbstractModelQuery;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.modisco.java.ConstructorDeclaration;
import org.eclipse.modisco.java.FieldDeclaration;
import org.eclipse.modisco.java.ImportDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.SingleVariableAccess;
import org.eclipse.modisco.java.SuperConstructorInvocation;
import org.eclipse.modisco.java.Type;
import org.junit.Assert;
import org.junit.Test;

public class TextJavaQueriesTest {

	private static final String DEFAULT_PACKAGE_MY_ICON_LIST_MY_ICON_LIST = "org.eclipse.gmt.java.sample.MyIconList.MyIconList()"; //$NON-NLS-1$
	private static final String NONE_INT_VOLATILE_FIELD = "none int volatileField"; //$NON-NLS-1$
	private static final String MY_ICON_LIST = "MyIconList()"; //$NON-NLS-1$
	private static final String NONE_NATIVE_INT_PARAM1_INT_PARAM2 = "noneNative(int param1, int param2)"; //$NON-NLS-1$
	private static final String NONE_FINAL = "noneFinal()"; //$NON-NLS-1$
	private static final String PROXY_INVOCATION_HANDLER_ARG0 = "Proxy(InvocationHandler arg0)"; //$NON-NLS-1$

	private final String name = "textJavaQueries"; //$NON-NLS-1$

	private final ResourceSet resourceSet = new ResourceSetImpl();

	/**
	 * Call a unit test which imports org.eclipse.modisco.java.queries
	 * before to call the test textJavaQueriesTest().
	 *
	 * @throws Exception
	 */
	@Test
	public void bug310838() throws Exception {
		if (Platform.inDebugMode()) {
			System.out.println("--- Bug 310838:  new FacetTests().bug307715(); ---"); //$NON-NLS-1$
		}
		new FacetTests().bug307715();
		if (Platform.inDebugMode()) {
			System.out.println("--- Bug 310838:  textJavaQueriesTest(); ---"); //$NON-NLS-1$
		}
		textJavaQueriesTest();
		if (Platform.inDebugMode()) {
			System.out.println("--- Bug 310838:  End ---"); //$NON-NLS-1$
		}
	}

	@Test
	public void textJavaQueriesTest() throws Exception {
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		catalog.waitUntilBuilt();
		ModelQuerySet querySet = catalog.getModelQuerySet(this.name);
		if (catalog.getURI(this.name).isPlatformResource()) {
			String projectName = catalog.getURI(this.name).segments()[1];
			ResourcesPlugin.getWorkspace().getRoot().getProject(projectName).delete(true,
					new NullProgressMonitor());
			catalog.waitUntilBuilt();
			if (Platform.inDebugMode()) {
				System.out.println("Getting a new querySet."); //$NON-NLS-1$
			}
			ModelQuerySet querySet2 = catalog.getModelQuerySet(this.name);
			Assert.assertFalse(querySet == querySet2);
			querySet = querySet2;
		}
		Assert.assertTrue(catalog.getURI(this.name).isPlatformPlugin());
		Assert.assertNotNull(querySet);

		// Retrieving all the queries for further testing
		ModelQuery queryGetMethodDeclarationText = querySet.getQuery("getMethodDeclarationText"); //$NON-NLS-1$
		Assert.assertNotNull(queryGetMethodDeclarationText);

		ModelQuery queryGetFieldDeclarationText = querySet.getQuery("getFieldDeclarationText"); //$NON-NLS-1$
		Assert.assertNotNull(queryGetFieldDeclarationText);

		ModelQuery queryGetAbstractMethodInvocationText = querySet
				.getQuery("getAbstractMethodInvocationText"); //$NON-NLS-1$
		Assert.assertNotNull(queryGetAbstractMethodInvocationText);

		ModelQuery queryGetConstructorDeclarationText = querySet
				.getQuery("getConstructorDeclarationText"); //$NON-NLS-1$
		Assert.assertNotNull(queryGetConstructorDeclarationText);

		ModelQuery queryGetMethodRefText = querySet.getQuery("getMethodRefText"); //$NON-NLS-1$
		Assert.assertNotNull(queryGetMethodRefText);

		ModelQuery queryGetSingleVariableAccessText = querySet
				.getQuery("getSingleVariableAccessText"); //$NON-NLS-1$
		Assert.assertNotNull(queryGetSingleVariableAccessText);

		ModelQuery queryGetAbstractMethodDeclarationText = querySet
				.getQuery("getAbstractMethodDeclarationText"); //$NON-NLS-1$
		Assert.assertNotNull(queryGetAbstractMethodDeclarationText);

		ModelQuery queryGetImportedElementName = querySet.getQuery("getImportedElementName"); //$NON-NLS-1$
		Assert.assertNotNull(queryGetImportedElementName);

		ModelQuery querygetAttributeMethodName = querySet.getQuery("getAttributeMethodName"); //$NON-NLS-1$
		Assert.assertNotNull(querygetAttributeMethodName);

		ModelQuery queryGetName = querySet.getQuery("getName"); //$NON-NLS-1$
		Assert.assertNotNull(queryGetName);

		ModelQuery queryGetQualifiedName = querySet.getQuery("getQualifiedName"); //$NON-NLS-1$
		Assert.assertNotNull(queryGetQualifiedName);

		ModelQuery queryGetTypeRef = querySet.getQuery("getTypeRef"); //$NON-NLS-1$
		Assert.assertNotNull(queryGetTypeRef);

		URI modelUri = URI
				.createURI("platform:/plugin/org.eclipse.modisco.java.queries.tests/completeModel.javaxmi"); //$NON-NLS-1$

		Resource myModel = this.resourceSet.getResource(modelUri, true);

		TreeIterator<EObject> treeIterator = myModel.getAllContents();
		while (treeIterator.hasNext()) {
			EObject eObject = treeIterator.next();

			AbstractModelQuery modelQueryImpl;
			String result;

			if (eObject instanceof SuperConstructorInvocation) {
				SuperConstructorInvocation superConstInv = (SuperConstructorInvocation) eObject;
				if (superConstInv.getMethod().getName().equals("Proxy")) { //$NON-NLS-1$
					// Test query GetAbstractMethodInvocationText
					modelQueryImpl = catalog
							.getModelQueryImpl(queryGetAbstractMethodInvocationText);
					result = (String) modelQueryImpl.basicEvaluate(superConstInv);
					Assert.assertEquals(TextJavaQueriesTest.PROXY_INVOCATION_HANDLER_ARG0, result);

					// Test query GetAttributeMethodName
					modelQueryImpl = catalog.getModelQueryImpl(querygetAttributeMethodName);
					result = (String) modelQueryImpl.basicEvaluate(superConstInv);
					Assert.assertEquals("Proxy", result); //$NON-NLS-1$
				}

			} else if (eObject instanceof MethodDeclaration) {
				MethodDeclaration methDecl = (MethodDeclaration) eObject;

				if (methDecl.getName().equalsIgnoreCase("noneFinal")) { //$NON-NLS-1$
					// Test query GetAbstractMethodDeclarationText
					modelQueryImpl = catalog
							.getModelQueryImpl(queryGetAbstractMethodDeclarationText);
					result = (String) modelQueryImpl.basicEvaluate(methDecl);
					Assert.assertEquals(TextJavaQueriesTest.NONE_FINAL, result);

					modelQueryImpl = catalog.getModelQueryImpl(queryGetMethodDeclarationText);
					result = (String) modelQueryImpl.basicEvaluate(methDecl);
					Assert.assertEquals(TextJavaQueriesTest.NONE_FINAL, result);
				} else if (methDecl.getName().equalsIgnoreCase("noneNative")) { //$NON-NLS-1$
					// Test query GetAbstractMethodDeclarationText
					modelQueryImpl = catalog
							.getModelQueryImpl(queryGetAbstractMethodDeclarationText);
					result = (String) modelQueryImpl.basicEvaluate(methDecl);
					Assert.assertEquals(result,
							TextJavaQueriesTest.NONE_NATIVE_INT_PARAM1_INT_PARAM2);

					modelQueryImpl = catalog.getModelQueryImpl(queryGetMethodDeclarationText);
					result = (String) modelQueryImpl.basicEvaluate(methDecl);
					Assert.assertEquals(result,
							TextJavaQueriesTest.NONE_NATIVE_INT_PARAM1_INT_PARAM2);
				}
			} else if (eObject instanceof ConstructorDeclaration) {
				ConstructorDeclaration constDecl = (ConstructorDeclaration) eObject;
				if (constDecl.getName().equalsIgnoreCase("MyIconList")) { //$NON-NLS-1$
					// Test query GetConstructorDeclarationText
					modelQueryImpl = catalog.getModelQueryImpl(queryGetConstructorDeclarationText);
					result = (String) modelQueryImpl.basicEvaluate(constDecl);
					Assert.assertEquals(TextJavaQueriesTest.MY_ICON_LIST, result);

					// Test query GetQualifiedName
					modelQueryImpl = catalog.getModelQueryImpl(queryGetQualifiedName);
					result = (String) modelQueryImpl.basicEvaluate(constDecl);
					Assert.assertEquals(result,
							TextJavaQueriesTest.DEFAULT_PACKAGE_MY_ICON_LIST_MY_ICON_LIST);

				} else if (constDecl.getName().equalsIgnoreCase("Proxy")) { //$NON-NLS-1$
					// Test query GetConstructorDeclarationText
					modelQueryImpl = catalog.getModelQueryImpl(queryGetConstructorDeclarationText);
					result = (String) modelQueryImpl.basicEvaluate(constDecl);
					Assert.assertEquals(TextJavaQueriesTest.PROXY_INVOCATION_HANDLER_ARG0, result);
				}

			} else if (eObject instanceof FieldDeclaration) {
				FieldDeclaration fieldDecl = (FieldDeclaration) eObject;
				if (!fieldDecl.getFragments().isEmpty()) {
					if (fieldDecl.getFragments().get(0).getName() != null) {
						if (fieldDecl.getFragments().get(0).getName().equalsIgnoreCase("PI")) { //$NON-NLS-1$
							// Test query getFieldDeclarationText
							modelQueryImpl = catalog
									.getModelQueryImpl(queryGetFieldDeclarationText);
							result = (String) modelQueryImpl.basicEvaluate(fieldDecl);
							Assert.assertEquals("PI", result); //$NON-NLS-1$
						} else if (fieldDecl.getFragments().get(0).getName().equalsIgnoreCase(
								"volatileField")) { //$NON-NLS-1$
							// Test query getFieldDeclarationText
							modelQueryImpl = catalog
									.getModelQueryImpl(queryGetFieldDeclarationText);
							result = (String) modelQueryImpl.basicEvaluate(fieldDecl);
							Assert.assertEquals(TextJavaQueriesTest.NONE_INT_VOLATILE_FIELD, result);

							// Test query getTypeRef
							modelQueryImpl = catalog.getModelQueryImpl(queryGetTypeRef);
							Type result2 = (Type) modelQueryImpl.basicEvaluate(fieldDecl);
							Assert.assertEquals("int", result2.getName()); //$NON-NLS-1$

						}
					}
				}
			} else if (eObject instanceof ImportDeclaration) {
				ImportDeclaration importDecl = (ImportDeclaration) eObject;
				if (importDecl.getImportedElement() != null) {
					if (importDecl.getImportedElement().getName() != null) {
						if (importDecl.getImportedElement().getName().equalsIgnoreCase("PI")) { //$NON-NLS-1$
							// Test query getImportText
							modelQueryImpl = catalog.getModelQueryImpl(queryGetImportedElementName);
							result = (String) modelQueryImpl.basicEvaluate(importDecl);
							Assert.assertEquals("PI", result); //$NON-NLS-1$
						}
					}
				}
			} else if (eObject instanceof SingleVariableAccess) {
				SingleVariableAccess singleVarAccess = (SingleVariableAccess) eObject;
				if (singleVarAccess.getVariable().getName().equalsIgnoreCase("arg0")) { //$NON-NLS-1$
					// Test query getSingleVariableAccessText
					modelQueryImpl = catalog.getModelQueryImpl(queryGetSingleVariableAccessText);
					result = (String) modelQueryImpl.basicEvaluate(singleVarAccess);
					Assert.assertEquals("arg0", result); //$NON-NLS-1$
				}
			}
		}
	}

}
