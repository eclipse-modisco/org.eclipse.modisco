/*
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 */
package org.eclipse.modisco.java.discoverer.tests;

import java.net.URL;
import java.util.Iterator;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.NamedElement;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.tests.utils.JavaProjectFactory;
import org.eclipse.modisco.java.internal.util.JavaUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParameterizedDiscovery {

	private final String rootSourcesPath = "/workspace/"; //$NON-NLS-1$
	private final String projectName = "test001"; //$NON-NLS-1$
	private JavaProjectFactory javaProjectFactory;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.javaProjectFactory = new JavaProjectFactory(this.projectName);
	}

	@After
	public void tearDown() throws Exception {
		if (this.javaProjectFactory != null) {
			this.javaProjectFactory.dispose();
		}
	}

	private static Model getJavaModel(final Resource javaResource) {
		Model aModel = null;
		EList<EObject> i = javaResource.getContents();
		for (Iterator<EObject> iterator = i.iterator(); iterator.hasNext()
				&& aModel == null;) {
			EObject eobject = iterator.next();
			if (eobject instanceof Model) {
				aModel = (Model) eobject;
			}
		}
		return aModel;
	}

	/**
	 * Test exclusion/inclusion regex parameter
	 */
	@Test
	public void testBug319606() throws Exception {
		Assert.assertNotNull(this.javaProjectFactory);

		IJavaProject javaProject = this.javaProjectFactory.getJavaProject();
		Assert.assertNotNull(javaProject);

		String sourceFolderPath = this.rootSourcesPath + this.projectName
				+ "/src"; //$NON-NLS-1$
		URL src = Activator.getDefault().getBundle().getEntry(sourceFolderPath);
		Assert.assertNotNull(src);
		this.javaProjectFactory.populateSourceFolder(sourceFolderPath,
				Activator.getDefault());

		DiscoverJavaModelFromJavaProject javaDiscoverer = new DiscoverJavaModelFromJavaProject();
		Assert.assertNotNull(javaDiscoverer);
		javaDiscoverer.setExcludedElementsRegEx("annotat[a-z]*"); //$NON-NLS-1$
		javaDiscoverer.discoverElement(javaProject, new NullProgressMonitor());
		Resource output = javaDiscoverer.getTargetModel();
		Assert.assertNotNull(output);

		Model javaModel = getJavaModel(output);
		NamedElement classAnnotation = JavaUtil.getNamedElementByQualifiedName(
				javaModel, "annotations.MyAnnotatedClass"); //$NON-NLS-1$
		Assert.assertNull(classAnnotation);

		Assert.assertTrue(!javaModel.getOwnedElements().isEmpty());

	}

}
