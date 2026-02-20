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
package org.eclipse.modisco.jee.ejbjar.discoverer.tests;

import java.io.File;

import org.junit.Assert;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.jee.actions.AbstractDeploymentDescriptorDiscoverer;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType;
import org.eclipse.modisco.jee.ejbjar.discoverer.EjbJarDiscoverer2;
import org.junit.Before;
import org.junit.Test;

public class TestEjbJar20 {

	private static final String RESOURCES_TEST_XML = "/resources/ejb_jar_2_0.xml"; //$NON-NLS-1$
	private static final String VERSION = "2.0"; //$NON-NLS-1$

	private Resource resource;

	@Before
	public void initResource() throws Exception {
		if (this.resource == null) {

			String wsLocation = JUnitPlugin.getDefault().getBundle().getLocation();

			IPath path = new Path(wsLocation.replaceFirst("^reference:file:", "") //$NON-NLS-1$ //$NON-NLS-2$
					+ TestEjbJar20.RESOURCES_TEST_XML);

			File xmlFile = new File(path.toOSString());
			Assert.assertTrue("Could not find " + path.toString(), xmlFile.exists());

			EjbJarDiscoverer2 discoverer = (EjbJarDiscoverer2) IDiscoveryManager.INSTANCE
					.createDiscovererImpl(EjbJarDiscoverer2.ID);
			discoverer.discoverElement(xmlFile, new NullProgressMonitor());
			this.resource = discoverer.getTargetModel();

			Assert.assertTrue(AbstractDeploymentDescriptorDiscoverer.getDescXmlVersion(
					JUnitPlugin.getDefault(), xmlFile, EjbJarDiscoverer2.ROOT_NAME,
					EjbJarDiscoverer2.DTD_URL).equalsIgnoreCase(TestEjbJar20.VERSION));

			Assert.assertNotNull("Count not retrieve a XML model from " + path.toString(),
					this.resource);
		}
	}

	@Test
	public void test001() {
		if (this.resource != null) {

			Assert.assertFalse("Could not retrieve a xml model from file ", this.resource.getContents().isEmpty());

			EObject root = this.resource.getContents().get(0);
			DocumentRoot myEjbJarModel = (DocumentRoot) root;

			// Retrieve the body of the web.xml file
			EjbJarType ejbJar = myEjbJarModel.getEjbJar();

			EnterpriseBeansType entBean = ejbJar.getEnterpriseBeans();

			// Session Type Test
			SessionType sessionType = entBean.getSession().get(0);
			Assert.assertTrue(sessionType.getEjbName().getMixed().getValue(0).toString()
					.equalsIgnoreCase("ejb-name-example")); //$NON-NLS-1$
			Assert.assertTrue(sessionType.getHome().getMixed().getValue(0).toString()
					.equalsIgnoreCase("home-example")); //$NON-NLS-1$
			Assert.assertTrue(sessionType.getRemote().getMixed().getValue(0).toString()
					.equalsIgnoreCase("remote-example")); //$NON-NLS-1$
			Assert.assertTrue(sessionType.getEjbClass().getMixed().getValue(0).toString()
					.equalsIgnoreCase("ejb-class-example")); //$NON-NLS-1$
			Assert.assertTrue(sessionType.getSessionType().getMixed().getValue(0).toString()
					.equalsIgnoreCase("session-type-example")); //$NON-NLS-1$
			Assert.assertTrue(sessionType.getTransactionType().getMixed().getValue(0).toString()
					.equalsIgnoreCase("transaction-type-example")); //$NON-NLS-1$
			Assert.assertTrue(sessionType.getDescription().getMixed().getValue(0).toString()
					.equalsIgnoreCase("description-example")); //$NON-NLS-1$

			// Entity Type Test
			EntityType entityType = entBean.getEntity().get(0);
			Assert.assertTrue(entityType.getEjbName().getMixed().getValue(0).toString()
					.equalsIgnoreCase("ejb-name-example")); //$NON-NLS-1$
			Assert.assertTrue(entityType.getHome().getMixed().getValue(0).toString()
					.equalsIgnoreCase("home-example")); //$NON-NLS-1$
			Assert.assertTrue(entityType.getRemote().getMixed().getValue(0).toString()
					.equalsIgnoreCase("remote-example")); //$NON-NLS-1$
			Assert.assertTrue(entityType.getEjbClass().getMixed().getValue(0).toString()
					.equalsIgnoreCase("ejb-class-example")); //$NON-NLS-1$
			Assert.assertTrue(entityType.getPersistenceType().getMixed().getValue(0).toString()
					.equalsIgnoreCase("persistence-type-example")); //$NON-NLS-1$
			Assert.assertTrue(entityType.getPrimKeyClass().getMixed().getValue(0).toString()
					.equalsIgnoreCase("prim-key-class-example")); //$NON-NLS-1$
			Assert.assertTrue(entityType.getReentrant().getMixed().getValue(0).toString()
					.equalsIgnoreCase("True")); //$NON-NLS-1$

		}
	}

}
