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

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
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

public class TestnonASCIIcharacters {

	private static final String RESOURCES_TEST = "/resources/nonASCIIcharacters.jsp"; //$NON-NLS-1$
	private Resource resource;

	private void initResource() throws Exception {
		if (this.resource == null) {

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
			IFile jspFile = project.getFile(TestnonASCIIcharacters.RESOURCES_TEST);

			assertTrue("Could not access the test file :" + jspFile.getName(),
					jspFile.exists());

			DiscoverJspModelFromResource discoverer = new DiscoverJspModelFromResource();
			discoverer.discoverElement(jspFile, new NullProgressMonitor());
			this.resource = discoverer.getTargetModel();
		}
	}

	@Test(timeout = 5 * 60 * 1000)
	public void test1() throws Exception {
		initResource();
		Assert.assertNotNull(this.resource);
		Assert.assertFalse(this.resource.getContents().isEmpty());
		EObject root = this.resource.getContents().get(0);
		Model jspModel = (Model) root;

		Page page = jspModel.getPages().get(0);
		Assert.assertNull(page.getXmlDeclaration());
		Assert.assertNull(page.getDoctype());
		List<Node> ownedElements0 = page.getOwnedElements();
		Assert.assertEquals(ownedElements0.size(), 1);
		Element element0 = (Element)ownedElements0.get(0);
		Assert.assertEquals("html", element0.getName());
		List<Node> children0 = element0.getChildren();
		Assert.assertEquals(children0.size(), 1);
		Element element1 = (Element)children0.get(0);
		Assert.assertEquals("unite", element1.getName());
		List<Node> children1 = element1.getChildren();
		Attribute attribute = (Attribute)children1.get(0);
		Assert.assertEquals("unites", attribute.getName());
		Assert.assertEquals("kg/m³|lb/ft³|kg/m³/kg/cm²(a)|PSI(a)|BAR(a)", attribute.getValue());
	}
}
