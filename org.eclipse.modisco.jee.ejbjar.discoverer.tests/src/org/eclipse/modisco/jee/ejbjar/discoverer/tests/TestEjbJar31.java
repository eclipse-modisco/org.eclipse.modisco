/*****************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Guyomar (Mia-Software) - initial API and implementation
 *   Nicolas Bros (Mia-Software) - adapted to new discovery framework
 *****************************************************************************/
package org.eclipse.modisco.jee.ejbjar.discoverer.tests;

import java.io.File;

import junit.framework.Assert;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.jee.actions.AbstractDeploymentDescriptorDiscoverer;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.DocumentRoot;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJarType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EnterpriseBeansType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.EntityBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.MessageDrivenBeanType;
import org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType;
import org.eclipse.modisco.jee.ejbjar.discoverer.EjbJarDiscoverer2;
import org.junit.Before;
import org.junit.Test;

public class TestEjbJar31 {

	private static final String RESOURCES_TEST_XML = "/resources/ejb_jar_3_1.xml"; //$NON-NLS-1$
	private static final String VERSION = "3.1"; //$NON-NLS-1$

	private Resource resource;

	@Before
	public void initResource() throws Exception {
		if (this.resource == null) {

			String wsLocation = JUnitPlugin.getDefault().getBundle().getLocation();

			IPath path = new Path(wsLocation.replaceFirst("^reference:file:", "") //$NON-NLS-1$ //$NON-NLS-2$
					+ TestEjbJar31.RESOURCES_TEST_XML);

			File xmlFile = new File(path.toOSString());
			Assert.assertTrue("Count not find " + path.toString(), xmlFile.exists());

			EjbJarDiscoverer2 discoverer = (EjbJarDiscoverer2) IDiscoveryManager.INSTANCE
					.createDiscovererImpl(EjbJarDiscoverer2.ID);
			discoverer.discoverElement(xmlFile, new NullProgressMonitor());
			this.resource = discoverer.getTargetModel();

			Assert.assertTrue(AbstractDeploymentDescriptorDiscoverer.getDescXmlVersion(
					JUnitPlugin.getDefault(), xmlFile, EjbJarDiscoverer2.ROOT_NAME,
					EjbJarDiscoverer2.DTD_URL).equalsIgnoreCase(TestEjbJar31.VERSION));

			Assert.assertNotNull("Count not retrieve a XML model from " + path.toString(),
					this.resource);

		}
	}

	@Test
	public void test001() {
		if (this.resource != null) {

			Assert.assertFalse("Could not retrieve a xml model from file ", this.resource
					.getContents().isEmpty());

			EObject root = this.resource.getContents().get(0);
			DocumentRoot myEjbJarModel = (DocumentRoot) root;

			// Retrieve the body of the web.xml file
			EjbJarType ejbJar = myEjbJarModel.getEjbJar();

			EnterpriseBeansType entBean = ejbJar.getEnterpriseBeans();

			// Session Type Test
			SessionBeanType sessionType = entBean.getSession().get(0);
			Assert.assertTrue(sessionType.getEjbName().getValue().toString()
					.equalsIgnoreCase("ejb-name-example")); //$NON-NLS-1$
			Assert.assertTrue(sessionType.getServiceEndpoint().getValue().toString()
					.equalsIgnoreCase("service-endpoint-example")); //$NON-NLS-1$
			Assert.assertTrue(sessionType.getBusinessLocal().get(0).getValue().toString()
					.equalsIgnoreCase("business-local-example")); //$NON-NLS-1$
			Assert.assertTrue(sessionType.getBusinessRemote().get(0).getValue().toString()
					.equalsIgnoreCase("business-remote-example")); //$NON-NLS-1$
			Assert.assertTrue(sessionType.getEjbClass().getValue().toString()
					.equalsIgnoreCase("ejb-class-example")); //$NON-NLS-1$
			Assert.assertTrue(sessionType.getSessionType().getValue().toString()
					.equalsIgnoreCase("session-type-example")); //$NON-NLS-1$
			Assert.assertTrue(sessionType.getTransactionType().getValue().toString()
					.equalsIgnoreCase("transaction-type-example")); //$NON-NLS-1$

			// Message Driven Test
			MessageDrivenBeanType messageDriven = entBean.getMessageDriven().get(0);
			Assert.assertTrue(messageDriven.getEjbName().getValue().toString()
					.equalsIgnoreCase("ejb-name-example")); //$NON-NLS-1$
			Assert.assertTrue(messageDriven.getEjbClass().getValue().toString()
					.equalsIgnoreCase("ejb-class-example")); //$NON-NLS-1$
			Assert.assertTrue(messageDriven.getMessagingType().getValue().toString()
					.equalsIgnoreCase("messaging-type-example")); //$NON-NLS-1$
			Assert.assertTrue(messageDriven.getTransactionType().getValue().toString()
					.equalsIgnoreCase("transaction-type-example")); //$NON-NLS-1$
			Assert.assertTrue(messageDriven.getMessageDestinationType().getValue().toString()
					.equalsIgnoreCase("message-destination-type-example")); //$NON-NLS-1$
			Assert.assertTrue(messageDriven.getMessageDestinationLink().getValue().toString()
					.equalsIgnoreCase("message-destination-link-example")); //$NON-NLS-1$
			Assert.assertTrue(messageDriven.getResourceRef().get(0).getResRefName().getValue()
					.toString().equalsIgnoreCase("res-ref-name-example")); //$NON-NLS-1$
			Assert.assertTrue(messageDriven.getResourceRef().get(0).getResType().getValue()
					.toString().equalsIgnoreCase("res-type-example")); //$NON-NLS-1$

			// Entity Type Test
			EntityBeanType entityType = entBean.getEntity().get(0);
			Assert.assertTrue(entityType.getEjbName().getValue().toString()
					.equalsIgnoreCase("ejb-name-example")); //$NON-NLS-1$
			Assert.assertTrue(entityType.getLocalHome().getValue().toString()
					.equalsIgnoreCase("local-home-example")); //$NON-NLS-1$

			Assert.assertTrue(entityType.getPersistenceType().getValue().toString()
					.equalsIgnoreCase("persistence-type-example")); //$NON-NLS-1$

			Assert.assertTrue(entityType.getLocal().getValue().toString()
					.equalsIgnoreCase("local-example")); //$NON-NLS-1$

			Assert.assertTrue(entityType.getPersistenceType().getValue().toString()
					.equalsIgnoreCase("persistence-type-example")); //$NON-NLS-1$
			Assert.assertTrue(entityType.getPrimKeyClass().getValue().toString()
					.equalsIgnoreCase("prim-key-class-example")); //$NON-NLS-1$

			Assert.assertTrue(entityType.getCmpVersion().getValue().toString()
					.equalsIgnoreCase("cmp-version-example")); //$NON-NLS-1$
			Assert.assertTrue(entityType.getAbstractSchemaName().getValue().toString()
					.equalsIgnoreCase("abstract-schema-name-example")); //$NON-NLS-1$
			Assert.assertTrue(entityType.getCmpField().get(0).getFieldName().getValue().toString()
					.equalsIgnoreCase("field-name-example")); //$NON-NLS-1$

			Assert.assertTrue(entityType.getQuery().get(0).getQueryMethod().getMethodName()
					.getValue().toString().equalsIgnoreCase("method-name-example")); //$NON-NLS-1$
			Assert.assertTrue(entityType.getQuery().get(0).getQueryMethod().getMethodParams()
					.getMethodParam().get(0).getValue().toString()
					.equalsIgnoreCase("method-param-example")); //$NON-NLS-1$
			Assert.assertTrue(entityType.getQuery().get(0).getEjbQl().getValue().toString()
					.equalsIgnoreCase("ejb-ql-example")); //$NON-NLS-1$

		}
	}

}
