/**
 * *******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 * 	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 */
package org.eclipse.modisco.jee.jsp.discoverer.tests.compatibility;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.modisco.jee.jsp.Model;
import org.eclipse.modisco.jee.jsp.Page;
import org.eclipse.modisco.jee.jsp.discoverer.actions.DefaultDiscoverer;
import org.eclipse.modisco.jee.jsp.discoverer.actions.DiscoverJspModelFromFile;
import org.eclipse.modisco.jee.jsp.discoverer.tests.Activator;
import org.junit.Test;
import org.osgi.framework.Bundle;
/**
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474894
 */
@Deprecated
public class TestHtml {

	private static final String RESOURCES_TEST = "/resources/testHtml.html"; //$NON-NLS-1$
	private Resource resource;

	private void initResource() throws Exception {
		debugPrint("TestHtml#initResource");
		if (this.resource == null) {

			debugPrint("TestHtml#deleteProject");
			IProject oldProject = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(Activator.PLUGIN_ID);
			if (oldProject.exists()) {
				oldProject.delete(true, true, new NullProgressMonitor());
			}

			// Bundle bundle =
			// Platform.getPlugin(JUnitPlugin.PLUGIN_ID).getBundle();
			Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);

			IProject project = null;

			debugPrint("TestHtml#importPlugin");
			project = ProjectUtils.importPlugin(bundle);

			if (project == null) {
				throw new NullPointerException();
			}
			IFile jspFile = project.getFile(TestHtml.RESOURCES_TEST);

			if (jspFile.exists()) {
				Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
				parameters.put(DefaultDiscoverer.PARAMETER_SILENT_MODE,
						new Boolean(true));

				DiscoverJspModelFromFile jspDiscoverer = new DiscoverJspModelFromFile();
				debugPrint("TestHtml#discoverElement");
				jspDiscoverer.discoverElement(jspFile, parameters);

				this.resource = (Resource) parameters
						.get(DefaultDiscoverer.PARAMETER_TARGET_RESOURCE);

			} else {
				Assert.fail("Could not access the test file :"
						+ jspFile.getName());
			}
		}
	}

	@Test(timeout = 5 * 60 * 1000)
	public void test1() throws Exception {
		initResource();
		debugPrint("TestHtml#test1");
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

	private void debugPrint(final String msg) {
		System.out.println(msg);
		MoDiscoLogger.logInfo(msg, Activator.getDefault());
	}
}
