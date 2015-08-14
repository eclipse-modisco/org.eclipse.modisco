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
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 */
package org.eclipse.modisco.jee.webapp.discoverer.tests.compatibility;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.modisco.jee.actions.DeploymentDescriptorDiscoverer;
import org.eclipse.modisco.jee.webapp.discoverer.actions.WebXmlDiscoverer;
import org.eclipse.modisco.jee.webapp.discoverer.tests.JUnitPlugin;
import org.junit.Before;
import org.junit.Test;

/**
 * Test of discovering a WEB.XML model 2.4 The specified file does not contain a
 * declaration of xsd, only the version
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474893
 */
@Deprecated
public class TestCommentedDocType {

	private static final String RESOURCES_TEST1_XML = "/resources/TestCommentedDocType.xml"; //$NON-NLS-1$
	private static final String VERSION = "2.2"; //$NON-NLS-1$
	private Resource resource;

	@Before
	public void initResource() {
		if (this.resource == null) {

			String wsLocation = JUnitPlugin.getDefault().getBundle().getLocation();

			IPath path = new Path(wsLocation.replaceFirst("^reference:file:", "") //$NON-NLS-1$ //$NON-NLS-2$
					+ TestCommentedDocType.RESOURCES_TEST1_XML);

			File xmlFile = new File(path.toOSString());

			if (xmlFile.exists()) {
				Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
				parameters.put(DeploymentDescriptorDiscoverer.PARAMETER_SILENT_MODE, new Boolean(
						true));

				Discoverer xmlDiscoverer = new WebXmlDiscoverer();
				xmlDiscoverer.discoverElement(xmlFile, parameters);

				Assert.assertTrue(((WebXmlDiscoverer) xmlDiscoverer).getDescXmlVersion(
						JUnitPlugin.getDefault(), xmlFile, WebXmlDiscoverer.getRootName(),
						WebXmlDiscoverer.getDtdUrl())
						.equalsIgnoreCase(TestCommentedDocType.VERSION));

				this.resource = (Resource) parameters
						.get(DeploymentDescriptorDiscoverer.PARAMETER_TARGET_RESOURCE);

				Assert.assertNotNull("Count not retrieve a XML model from " + path.toString(),
						this.resource);
			} else {
				Assert.fail("Count not find " + path.toString());
			}
		}
	}

	@Test
	public void test001() {
		//
	}
}