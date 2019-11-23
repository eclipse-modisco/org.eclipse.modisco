/*********************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - refactored tests for new XML Discoverer
 *        on top of the new discovery framework
 *********************************************************************************/
package org.eclipse.modisco.xml.discoverer.tests;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.common.core.internal.utils.FileUtils;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.xml.Attribute;
import org.eclipse.modisco.xml.Element;
import org.eclipse.modisco.xml.ProcessingInstruction;
import org.eclipse.modisco.xml.Root;
import org.eclipse.modisco.xml.discoverer.XMLModelDiscoverer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** Basic test of discovering a XML model and testing root, element, comments */
public class Test001 {

	private static final String TEST1_XML = "Test001.xml"; //$NON-NLS-1$
	private static final String RESOURCES_TEST1_XML = "resources/" + Test001.TEST1_XML; //$NON-NLS-1$
	private Resource resource;

	@Before
	public void initResource() throws Exception {
		if (this.resource == null) {
			String projectName = "xml" + this.getClass().getName(); //$NON-NLS-1$
			IWorkspace ws = ResourcesPlugin.getWorkspace();
			ws.getRoot().refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());
			IProject project = ws.getRoot().getProject(projectName);
			project.create(new NullProgressMonitor());
			project.open(new NullProgressMonitor());

			FileUtils.copyFileFromBundle(Test001.RESOURCES_TEST1_XML, project,
					Test001.TEST1_XML, Activator.getDefault().getBundle());
			Path path = new Path(Test001.TEST1_XML);
			IFile iFile = project.getFile(path);
			File xmlFile = iFile.getLocation().toFile();
			if (xmlFile != null && xmlFile.exists()) {
				XMLModelDiscoverer discoverer = (XMLModelDiscoverer) IDiscoveryManager.INSTANCE
						.createDiscovererImpl(XMLModelDiscoverer.ID);
				discoverer.setIgnoreWhitespace(false);
				discoverer.setLightweightModel(false);
				discoverer.discoverElement(xmlFile, new NullProgressMonitor());
				this.resource = discoverer.getTargetModel();

				Assert.assertNotNull(
						"Could not retrieve a xml model from file : " //$NON-NLS-1$
								+ path.toString(), this.resource);
			} else {
				Assert.fail("Could not access the test file : " //$NON-NLS-1$
						+ path.toString());
			}
		}
	}

	@Test
	public void test001() {
		if (this.resource != null) {
			Assert.assertFalse("Could not retrieve a xml model from file", //$NON-NLS-1$
					this.resource.getContents().isEmpty());
			EObject root = this.resource.getContents().get(0);
			Assert.assertTrue("Top level object is not a Root", //$NON-NLS-1$
					root instanceof Root);

			Assert.assertTrue(((Root) root).getChildren().size() > 2);
			EObject child1 = ((Root) root).getChildren().get(1);

			Assert.assertTrue(child1 instanceof Element);
			Assert.assertTrue(((Element) child1).getName()
					.contains("extension")); //$NON-NLS-1$
			Assert.assertTrue(((Element) child1).getChildren().size() > 0);
			Assert.assertTrue(((Element) child1).getChildren().get(0) instanceof Attribute);
			Attribute anAttribute = (Attribute) ((Element) child1)
					.getChildren().get(0);
			Assert.assertTrue(anAttribute.getValue().equalsIgnoreCase(
					"MoDiscoTest")); //$NON-NLS-1$

			Assert.assertTrue(((Root) root).getLeadingPIs().size() > 0);
			ProcessingInstruction pi = ((Root) root).getLeadingPIs().get(0);

			Assert.assertTrue(pi.getName().equalsIgnoreCase("eclipse")); //$NON-NLS-1$
			Assert.assertTrue(pi.getData().equalsIgnoreCase("version=\"3.0\"")); //$NON-NLS-1$
		}
	}
}
