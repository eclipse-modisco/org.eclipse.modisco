/*******************************************************************************
 * Copyright (c) 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.java.composition.discoverer.tests;

import java.net.URL;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.modisco.java.discoverer.tests.utils.JavaProjectFactory;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.NamedElement;
import org.eclipse.modisco.java.composition.discoverer.DiscoverKDMSourceAndJavaModelFromJavaProject;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.eclipse.modisco.java.composition.ui.strategies.StrategySourceJava;
import org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StrategySourceJavaTests {

	private final String rootSourcesPath = "/workspace/"; //$NON-NLS-1$
	private final String projectName = "testCompositeDiscovery"; //$NON-NLS-1$

	private JavaProjectFactory javaProjectFactory;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.javaProjectFactory = new JavaProjectFactory(this.projectName);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		if (this.javaProjectFactory != null) {
			this.javaProjectFactory.dispose();
		}
	}

	@SuppressWarnings("null")
	@Test
	public void testBug332323_classInDefaultPackage() throws Exception {
		/*
		 * When looking for correspondig source file from an ast node, if it is
		 * located in default package the basic algorithm doesn't work.
		 */
		Assert.assertNotNull(this.javaProjectFactory);

		IJavaProject javaProject = this.javaProjectFactory.getJavaProject();
		Assert.assertNotNull(javaProject);

		String sourceFolderPath = this.rootSourcesPath + "bug332323/src"; //$NON-NLS-1$
		URL src = JUnitPlugin.getDefault().getBundle()
				.getEntry(sourceFolderPath);
		Assert.assertNotNull(src);
		this.javaProjectFactory.populateSourceFolder(sourceFolderPath,
				JUnitPlugin.getDefault());

		DiscoverKDMSourceAndJavaModelFromJavaProject discoverer = new DiscoverKDMSourceAndJavaModelFromJavaProject();
		discoverer.setSerializeTarget(true);
		discoverer.discoverElement(javaProject, new NullProgressMonitor());
		Resource output = discoverer.getTargetModel();
		Assert.assertNotNull(output);

		JavaApplication javaAppModel = null;
		for (EObject eobject : output.getContents()) {
			if (eobject instanceof JavaApplication) {
				javaAppModel = (JavaApplication) eobject;
			}
		}
		Assert.assertNotNull(javaAppModel);

		Assert.assertNotNull(javaAppModel.getJavaModel());

		Assert.assertNotNull(javaAppModel.getDeploymentModel());

		Assert.assertNotNull(javaAppModel.getJava2DirectoryChildren());
		Assert.assertEquals(2, javaAppModel.getJava2DirectoryChildren().size());

		/*
		 * To be able to test correctly this bug, we need to reload all
		 * resources in the same resource set, because it is not the case
		 * actually ... might be a bug.
		 *
		 * In java model, we will test every instances of ASTNode which are not
		 * proxies, to check corresponding source region.
		 */
		ResourceSet resourceSet = new ResourceSetImpl();
		output = resourceSet.getResource(output.getURI(), true);
		EcoreUtil.resolveAll(output);
		javaAppModel = null;
		for (EObject eobject : output.getContents()) {
			if (eobject instanceof JavaApplication) {
				javaAppModel = (JavaApplication) eobject;
			}
		}
		Assert.assertNotNull(javaAppModel);
		Assert.assertNotNull(javaAppModel.getJavaModel());
		Assert.assertNotNull(javaAppModel.getDeploymentModel());
		Assert.assertNotNull(javaAppModel.getJava2DirectoryChildren());
		Assert.assertEquals(2, javaAppModel.getJava2DirectoryChildren().size());
		TreeIterator<EObject> iterator = javaAppModel.getJavaModel()
				.eAllContents();
		Assert.assertNotNull(iterator);
		Assert.assertTrue(iterator.hasNext());
		while (iterator.hasNext()) {
			EObject eObject = iterator.next();
			Assert.assertTrue(eObject instanceof ASTNode);
			ASTNode astNode = (ASTNode) eObject;
			if (astNode instanceof NamedElement) {
				NamedElement namedElement = (NamedElement) astNode;
				if (!namedElement.isProxy()) {
					StrategySourceJava strategySourceJava = new StrategySourceJava();
					Assert.assertTrue(strategySourceJava
							.isApplicableTo(namedElement));
					if (namedElement.getOriginalCompilationUnit() != null) {
						ASTNodeSourceRegion sourceRegion = strategySourceJava
								.getASTNodeSourceRegion(namedElement);
						Assert.assertNotNull(sourceRegion);
					}
				}
			}
		}
	}
}
