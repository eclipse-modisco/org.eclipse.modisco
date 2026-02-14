/**
 * Copyright (c) 2026 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 */
package org.eclipse.modisco.jee.jsp.discoverer.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.modisco.jee.jsp.Model;
import org.eclipse.modisco.jee.jsp.Page;
import org.eclipse.modisco.jee.jsp.discoverer.DiscoverJspModelFromResource;
import org.eclipse.modisco.xml.Attribute;
import org.eclipse.modisco.xml.Element;
import org.eclipse.modisco.xml.Node;
import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.Bundle;

/**
 * This test generates the org.eclipse.modisco.jee.jsp.discoverer.tests.jspxmi comprising all the test sources, drops a copy
 * in the junit-workspace and verifies that it matches the manually cached version in org.eclipse.modisco.jee.jsp.generation.tests/resources.
 */
public class TestSaveAll {

	public static class DiscoverJspModelFromResourceWithSave extends DiscoverJspModelFromResource
	{
		@Override
		public void saveTargetModel() throws IOException {
			super.saveTargetModel();
		}
	}

	private static final String[] RESOURCES_TESTs = {
			"about.html",
			"resources/1.jsp",
			"resources/jspAction.jsp",
			"resources/jspElement.jsp",
			"resources/memory.jsp",
			"resources/nonASCIIcharacters.jsp",
			"resources/testHtml.html"};

	private static final String targetFileName = "org.eclipse.modisco.jee.jsp.discoverer.tests.jspxmi";
	private static final String referenceFileName = "org.eclipse.modisco.jee.jsp.generation.tests/resources/org.eclipse.modisco.jee.jsp.discoverer.tests.jspxmi";

	private Resource resource;

	private IFile initResource() throws Exception {
		assert (this.resource == null);

			IProject oldProject = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(Activator.PLUGIN_ID);
			if (oldProject.exists()) {
				oldProject.delete(true, true, new NullProgressMonitor());
			}
			Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);

			IProject project = null;

			project = ProjectUtils.importPlugin(bundle);

			if (project == null) {
				throw new NullPointerException();
			}

			DiscoverJspModelFromResourceWithSave discoverer = new DiscoverJspModelFromResourceWithSave();
			for (String resourceName : RESOURCES_TESTs) {
				IFile jspFile = project.getFile(resourceName);
				assertTrue("Could not access test file :" + jspFile.getName(), jspFile.exists());
				discoverer.discoverElement(jspFile, new NullProgressMonitor());
				Resource resource = discoverer.getTargetModel();
				for (EObject eObject : resource.getContents()) {
					if (eObject instanceof Model) {
						for (Page jPage : ((Model)eObject).getPages()) {
							if (jPage.getOriginalFilePath().replace("\\", "/").endsWith(resourceName)) {
								jPage.setName(resourceName);				// project-relative to avoid embedding build computer dependence
								jPage.setOriginalFilePath(resourceName);	// project-relative to avoid suit generation testing
							}
						}
					}
				}
			}
			Resource targetResource = discoverer.getTargetModel();
			List<EObject> allContents = new ArrayList<>();
			Model allModel = null;
			List<Page> allPages = new ArrayList<>();
			List<EObject> rootContents = targetResource.getContents();
			for (EObject eObject : rootContents) {
				if (eObject instanceof Model) {
					if (allModel == null) {
						allModel = (Model)eObject;
						allContents.add(eObject);
					}
					for (Page jPage : ((Model)eObject).getPages()) {
						allPages.add(jPage);
					}
				}
				else {
					allContents.add(eObject);
				}
			}
			targetResource.getContents().clear();
			targetResource.getContents().addAll(allContents);
			if (allModel != null) {
				allModel.getPages().clear();
				allModel.getPages().addAll(allPages);
			}
			URI uri = URI.createPlatformResourceURI(project.getName() + "/" + targetFileName, true);
			discoverer.setTargetURI(uri);
			discoverer.setSerializeTarget(true);
			discoverer.saveTargetModel();
			this.resource = targetResource;
			IFile jspFile = project.getFile(targetFileName);
			return jspFile;
	//	}
	}

	@Test(timeout = 5 * 60 * 1000)
	public void testSaveAll() throws Exception {
		IFile targetIFile = initResource();
		Assert.assertNotNull(this.resource);
		Assert.assertFalse(this.resource.getContents().isEmpty());
		//
		File targetFile = new File(targetIFile.getLocation().toString());
		String targetText = readFile(targetFile);
		//
		File referenceFile = new File("../" + referenceFileName);
		String referenceText = readFile(referenceFile);
		//
		if (!referenceText.equals(targetText)) {
			Assert.assertTrue(referenceFile.getCanonicalPath() + " is stale wrt " + targetFile.toString(), false);
		// referenceFile is supposed to be manually copied from targetFile once 'better; targetFile confirmed.
		}
	}

	public static String readFile(File file) throws IOException {
		LineNumberReader lineReader = new LineNumberReader(new FileReader(file));
		StringBuilder s = new StringBuilder();
		for (String line; (line = lineReader.readLine()) != null; ) {
			s.append(line);
			s.append("\n");
		}
		lineReader.close();
		return s.toString();
	}
}
