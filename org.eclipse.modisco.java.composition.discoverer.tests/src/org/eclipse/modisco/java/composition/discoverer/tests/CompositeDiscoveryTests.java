/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.java.composition.discoverer.DiscoverKDMSourceAndJavaModelFromJavaProject;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.eclipse.modisco.java.discoverer.tests.utils.JavaProjectFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CompositeDiscoveryTests {

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
	public void testBug332068_packageinfos() throws Exception {
		Assert.assertNotNull(this.javaProjectFactory);

		IJavaProject javaProject = this.javaProjectFactory.getJavaProject();
		Assert.assertNotNull(javaProject);

		String sourceFolderPath = this.rootSourcesPath + "bug332068/src"; //$NON-NLS-1$
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
		Assert.assertTrue(javaAppModel.getJava2DirectoryChildren().isEmpty());

		// but a model Package2Directory_java2kdm.xmi should exist in folder
		// java2kdmFragments
		IResource packageModelResource = this.javaProjectFactory
				.getJavaProject().getProject()
				.findMember("java2kdmFragments/Package2Directory_java2kdm.xmi");
		Assert.assertTrue(packageModelResource.exists());

		ResourceSet resourceSet = new ResourceSetImpl();
		URI testResourceUri = URI.createPlatformResourceURI(
				packageModelResource.getFullPath().toString(), true);
		Resource testResource = resourceSet.getResource(testResourceUri, true);
		Assert.assertNotNull(testResource);
		testResource.load(null);

		Assert.assertTrue(testResource.getContents().isEmpty());
	}
}
