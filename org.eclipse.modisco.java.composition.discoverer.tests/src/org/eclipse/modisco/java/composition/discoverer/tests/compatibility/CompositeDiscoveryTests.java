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

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.modisco.java.discoverer.tests.utils.JavaProjectFactory;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.java.composition.discoverer.DiscoverKDMSourceAndJavaModel;
import org.eclipse.modisco.java.composition.discoverer.tests.JUnitPlugin;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author GBarbier
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474718
 */
@Deprecated
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
