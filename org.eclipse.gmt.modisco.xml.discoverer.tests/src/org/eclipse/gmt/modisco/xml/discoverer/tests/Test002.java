/**
 * *******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 */
package org.eclipse.gmt.modisco.xml.discoverer.tests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.FileUtils;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.xml.CDATA;
import org.eclipse.gmt.modisco.xml.Element;
import org.eclipse.gmt.modisco.xml.Namespace;
import org.eclipse.gmt.modisco.xml.Root;
import org.eclipse.gmt.modisco.xml.discoverer.actions.XMLModelDiscoverer;
import org.junit.Before;
import org.junit.Test;

/**
 * Basic test of discovering a XML model and testing root, attributes
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470885
 */
@Deprecated
public class Test002 {
	private static final int MAGIC_NUMBER = 3;
	private static final String TEST2_XML = "Test002.xml"; //$NON-NLS-1$
	private static final String RESOURCES_TEST2_XML = "resources/" + Test002.TEST2_XML; //$NON-NLS-1$
	private Resource resource;

	@Before
	public void initResource() throws CoreException, IOException {
		if (this.resource == null) {

			String projectName = "xml" + this.getClass().getName(); //$NON-NLS-1$
			IWorkspace ws = ResourcesPlugin.getWorkspace();
			ws.getRoot().refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());
			IProject project = ws.getRoot().getProject(projectName);
			project.create(new NullProgressMonitor());
			project.open(new NullProgressMonitor());

			FileUtils.copyFileFromBundle(Test002.RESOURCES_TEST2_XML, project,
					Test002.TEST2_XML, JUnitPlugin.getDefault().getBundle());
			Path path = new Path(Test002.TEST2_XML);
			IFile iFile = project.getFile(path);
			File xmlFile = iFile.getLocation().toFile();
			if (xmlFile != null && xmlFile.exists()) {
				Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
				parameters.put(XMLModelDiscoverer.PARAMETER_SILENT_MODE, true);
				parameters.put(XMLModelDiscoverer.PARAMETER_IGNORE_WHITESPACES,
						false);
				parameters.put(XMLModelDiscoverer.PARAMETER_LIGHTWEIGHT_MODEL,
						false);

				Discoverer xmlDiscoverer = new XMLModelDiscoverer();
				xmlDiscoverer.discoverElement(xmlFile, parameters);

				this.resource = (Resource) parameters
						.get(XMLModelDiscoverer.PARAMETER_TARGET_RESOURCE);

				Assert.assertNotNull(
						"Could not retrieve a xml model from file : " //$NON-NLS-1$
								+ path.toString(), this.resource);
			} else {
				Assert.fail("Could not access to the test file : " //$NON-NLS-1$
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

			String namespaces = ""; //$NON-NLS-1$
			for (Namespace ns : ((Root) root).getNamespaces()) {
				namespaces += ns.getName() + ";"; //$NON-NLS-1$
			}
			Assert
					.assertEquals(
							"Incorrect namespaces number attached to Root. Namespaces found are " + namespaces, //$NON-NLS-1$
							Test002.MAGIC_NUMBER, ((Root) root).getNamespaces()
									.size());

			Assert.assertTrue(((Root) root).getNamespaces().get(0).getName()
					.equalsIgnoreCase("ns1")); //$NON-NLS-1$
			Assert.assertTrue(((Root) root).getNamespaces().get(0).getValue()
					.equalsIgnoreCase("http://eclipse.org/modisco/ns1Test")); //$NON-NLS-1$
			Assert.assertTrue(((Root) root).getNamespaces().get(2).getName()
					.equals("")); //$NON-NLS-1$

			EObject child = ((Root) root).getChildren().get(
					Test002.MAGIC_NUMBER); // writers
			Assert.assertTrue(child instanceof Element);
			child = ((Element) child).getChildren().get(1); // writer
			Assert.assertTrue(child instanceof Element);
			child = ((Element) child).getChildren().get(2); // name
			Assert.assertTrue(child instanceof Element);
			child = ((Element) child).getChildren().get(0); // CDATA

			Assert.assertTrue(child instanceof CDATA);
			Assert.assertTrue(((CDATA) child).getName().equalsIgnoreCase(
					"<bold>Tolkien</bold>")); //$NON-NLS-1$

		}
	}
}
