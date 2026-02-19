/*****************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   Nicolas Guyomar (Mia-Software) - initial API and implementation
 *   Nicolas Bros (Mia-Software) - adapted to new discovery framework
 *****************************************************************************/
package org.eclipse.modisco.jee.webapp.discoverer.tests;

import com.google.common.collect.Sets;
import java.io.File;
import java.util.Collections;
import java.util.Set;
import java.util.Stack;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.jee.actions.AbstractDeploymentDescriptorDiscoverer;
import org.eclipse.modisco.jee.webapp.discoverer.WebXmlDiscoverer2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test of discovering a WEB.XML model 2.4 The specified file does not contain a
 * declaration of xsd, only the version
 *
 */
public class TestNoUri {

	private static final String RESOURCES_TEST1_XML = "/resources/TestNoUri.xml"; //$NON-NLS-1$
	private static final String VERSION = "2.4"; //$NON-NLS-1$
	private Resource resource;

	@Before
	public void initResource() throws Exception {
		if (this.resource == null) {

			String wsLocation = JUnitPlugin.getDefault().getBundle().getLocation();

			IPath path = new Path(wsLocation.replaceFirst("^reference:file:", "") //$NON-NLS-1$ //$NON-NLS-2$
					+ TestNoUri.RESOURCES_TEST1_XML);

			File xmlFile = new File(path.toOSString());
			Assert.assertTrue("Could not find " + path.toString(), xmlFile.exists());

		//	Bundle bundle = CommonModiscoActivator.getDefault().getBundle();
			String symbolicName = "org.eclipse.modisco.jee.webapp.discoverer"; //bundle.getSymbolicName();
			String prefix = "In plug-in=\"" + symbolicName + "\"; extension=\"org.eclipse.modisco.infra.discovery.ui.discoverer\": attribute discovererID=\"";
			String suffix = "\" doesn't refer to an existing discoverer.)";
			Status status1 = new Status(IStatus.WARNING, symbolicName, "Unknown feature detected:org.eclipse.emf.ecore.xml.type.impl.AnyTypeImpl", null);
			Logger.addExpectedStatuses(Sets.newHashSet(status1));
			
			WebXmlDiscoverer2 discoverer = (WebXmlDiscoverer2) IDiscoveryManager.INSTANCE
					.createDiscovererImpl(WebXmlDiscoverer2.ID);
			discoverer.discoverElement(xmlFile, new NullProgressMonitor());
			Stack<Set<IStatus>> residualExpectedStatuses = Logger.resetExpectedStatuses();
			Assert.assertNull("Not all expected status messages logged", residualExpectedStatuses);

			this.resource = discoverer.getTargetModel();

			Assert.assertTrue(AbstractDeploymentDescriptorDiscoverer.getDescXmlVersion(
					JUnitPlugin.getDefault(), xmlFile, WebXmlDiscoverer2.ROOT_NAME,
					WebXmlDiscoverer2.DTD_URL).equalsIgnoreCase(TestNoUri.VERSION));

			Assert.assertNotNull("Could not retrieve a XML model from " + path.toString(),
					this.resource);
		}
	}

	@Test
	public void test001() {
		//
	}
}