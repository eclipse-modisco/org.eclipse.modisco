/*
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.java.composition.discoverer.tests.compatibility;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.NamedElement;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.modisco.java.discoverer.tests.utils.JavaProjectFactory;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.java.composition.discoverer.DiscoverKDMSourceAndJavaModel;
import org.eclipse.modisco.java.composition.discoverer.tests.JUnitPlugin;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.eclipse.modisco.java.composition.ui.strategies.StrategySourceJava;
import org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author GBarbier
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474718
 */
@Deprecated
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

		DiscoverKDMSourceAndJavaModel discoverer = new DiscoverKDMSourceAndJavaModel();
		Assert.assertNotNull(discoverer);
		Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
		parameters.put(DefaultDiscoverer.PARAMETER_SILENT_MODE, Boolean.TRUE);
		parameters
				.put(DefaultDiscoverer.PARAMETER_BROWSE_RESULT, Boolean.FALSE);
		discoverer.discoverElement(javaProject, parameters);
		Resource output = (Resource) parameters
				.get(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);
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
