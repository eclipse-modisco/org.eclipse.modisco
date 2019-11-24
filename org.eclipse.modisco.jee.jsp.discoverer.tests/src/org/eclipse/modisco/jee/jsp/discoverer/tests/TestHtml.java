/*********************************************************************************
 * Copyright (c) 2009,2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - adapted to new discovery framework (Bug 335003)
 *********************************************************************************/
package org.eclipse.modisco.jee.jsp.discoverer.tests;

import static org.junit.Assert.assertTrue;
import org.junit.Assert;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.modisco.jee.jsp.Model;
import org.eclipse.modisco.jee.jsp.Page;
import org.eclipse.modisco.jee.jsp.discoverer.DiscoverJspModelFromResource;
import org.junit.Ignore;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class TestHtml {

	private static final String RESOURCES_TEST = "/resources/testHtml.html"; //$NON-NLS-1$
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
			IFile jspFile = project.getFile(TestHtml.RESOURCES_TEST);

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
		page.getXmlDeclaration().equalsIgnoreCase("<?xml version=\"1.0\" encoding=\"|ISO-8859-1|\"?>"); //$NON-NLS-1$
		page.getDoctype()
				.equalsIgnoreCase(
						"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">"); //$NON-NLS-1$
	}
}
