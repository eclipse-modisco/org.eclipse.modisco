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
package org.eclipse.modisco.jee.ejbjar.discoverer.tests.compatibility;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.modisco.jee.actions.DeploymentDescriptorDiscoverer;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.DocumentRoot;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EnterpriseBeansType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType;
import org.eclipse.modisco.jee.ejbjar.discoverer.actions.EjbJarDiscoverer;
import org.eclipse.modisco.jee.ejbjar.discoverer.tests.JUnitPlugin;
import org.junit.Before;
import org.junit.Test;

/**
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474891
 */
@Deprecated
public class TestEjbJar21 {

	private static final String RESOURCES_TEST_XML = "/resources/ejb_jar_2_1.xml"; //$NON-NLS-1$
	private static final String VERSION = "2.1"; //$NON-NLS-1$

	private Resource resource;

	@Before
	public void initResource() {
		if (this.resource == null) {

			String wsLocation = JUnitPlugin.getDefault().getBundle().getLocation();

			IPath path = new Path(wsLocation.replaceFirst("^reference:file:", "") //$NON-NLS-1$ //$NON-NLS-2$
					+ TestEjbJar21.RESOURCES_TEST_XML);

			File xmlFile = new File(path.toOSString());

			if (xmlFile.exists()) {
				Map<DiscoveryParameter, Object> parameters = new HashMap<DiscoveryParameter, Object>();
				parameters.put(DeploymentDescriptorDiscoverer.PARAMETER_SILENT_MODE, new Boolean(
						true));

				Discoverer xmlDiscoverer = new EjbJarDiscoverer();
				xmlDiscoverer.discoverElement(xmlFile, parameters);

				Assert.assertTrue(DeploymentDescriptorDiscoverer.getDescXmlVersion(
						JUnitPlugin.getDefault(), xmlFile, EjbJarDiscoverer.getRootName(),
						EjbJarDiscoverer.getDtdUrl()).equalsIgnoreCase(TestEjbJar21.VERSION));

				this.resource = (Resource) parameters
						.get(DeploymentDescriptorDiscoverer.PARAMETER_TARGET_RESOURCE);

				Assert.assertNotNull("Could not retrieve a xml model from file " + path.toString(), this.resource);
			} else {
				Assert.fail("Could not access test file: " + path.toString());
			}
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
			SessionBeanType sessionType = entBean.getSession().get(0);
			Assert.assertTrue(sessionType.getEjbName().getValue().toString()
					.equalsIgnoreCase("ejb-name-example")); //$NON-NLS-1$
			Assert.assertTrue(sessionType.getHome().getValue().toString()
					.equalsIgnoreCase("home-example")); //$NON-NLS-1$
			Assert.assertTrue(sessionType.getRemote().getValue().toString()
					.equalsIgnoreCase("remote-example")); //$NON-NLS-1$
			Assert.assertTrue(sessionType.getEjbClass().getValue().toString()
					.equalsIgnoreCase("ejb-class-example")); //$NON-NLS-1$
			Assert.assertTrue(sessionType.getSessionType().getValue().toString()
					.equalsIgnoreCase("session-type-example")); //$NON-NLS-1$			
			Assert.assertTrue(sessionType.getTransactionType().getValue().toString()
					.equalsIgnoreCase("transaction-type-example")); //$NON-NLS-1$

			// Entity Type Test
			EntityBeanType entityType = entBean.getEntity().get(0);
			Assert.assertTrue(entityType.getEjbName().getValue().toString()
					.equalsIgnoreCase("ejb-name-example")); //$NON-NLS-1$
			Assert.assertTrue(entityType.getHome().getValue().toString()
					.equalsIgnoreCase("home-example")); //$NON-NLS-1$
			Assert.assertTrue(entityType.getRemote().getValue().toString()
					.equalsIgnoreCase("remote-example")); //$NON-NLS-1$
			Assert.assertTrue(entityType.getEjbClass().getValue().toString()
					.equalsIgnoreCase("ejb-class-example")); //$NON-NLS-1$
			Assert.assertTrue(entityType.getPersistenceType().getValue().toString()
					.equalsIgnoreCase("persistence-type-example")); //$NON-NLS-1$
			Assert.assertTrue(entityType.getPrimKeyClass().getValue().toString()
					.equalsIgnoreCase("prim-key-class-example")); //$NON-NLS-1$			

		}
	}
}
