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
 *   E.D.Willink - folded into single shared test file
 *****************************************************************************/
package org.eclipse.modisco.jee.ejbjar.discoverer.tests;

import java.net.URL;
import java.util.Set;
import java.util.Stack;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.jee.actions.AbstractDeploymentDescriptorDiscoverer;
import org.eclipse.modisco.jee.ejbjar.discoverer.EjbJarDiscoverer2;
import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class EjbJarTests
{
	protected static Resource discoverSourceURI(URI sourceURI, String version) throws DiscoveryException {
		EjbJarDiscoverer2 discoverer = (EjbJarDiscoverer2) IDiscoveryManager.INSTANCE
				.createDiscovererImpl(EjbJarDiscoverer2.ID);
		discoverer.discoverResource(sourceURI);
		Stack<Set<IStatus>> residualExpectedStatuses = Logger.resetExpectedStatuses();
		Assert.assertNull("Not all expected status messages logged", residualExpectedStatuses);
	
		Resource resource = discoverer.getTargetModel();
	
		Assert.assertTrue(AbstractDeploymentDescriptorDiscoverer.getDescXmlVersion(
				JUnitPlugin.getDefault(), sourceURI, EjbJarDiscoverer2.ROOT_NAME,
				EjbJarDiscoverer2.DTD_URL).equalsIgnoreCase(version));
	
		Assert.assertNotNull("Could not retrieve a XML model from " + sourceURI.toString(), resource);
		return resource;
	}

	protected static URI getSourceURI(String testResource) {
		URL resultURL = JUnitPlugin.class.getResource("JUnitPlugin.class"); //$NON-NLS-1$
		String baseURL = resultURL.toExternalForm();
		int index = baseURL.indexOf("/org/"); //$NON-NLS-1$
		if (index != -1) {
			baseURL = baseURL.substring(0, index);
		}
		URI sourceURI = URI.createURI(baseURL + testResource, true);
		Bundle bundle = JUnitPlugin.getDefault().getBundle();
		boolean exists = URIConverter.INSTANCE.exists(sourceURI, null);
		Assert.assertTrue("Could not find " + sourceURI.toString() + " for " + bundle.getLocation(), exists);
		return sourceURI;
	}

	protected static Resource initResource(String testResource, String version, Set<IStatus> expectedStatuses) throws Exception {
		URI sourceURI = getSourceURI(testResource);

		if (expectedStatuses != null) {
			Logger.addExpectedStatuses(expectedStatuses);
		}
		@SuppressWarnings("unused")
		EjbJarDiscoverer2 discoverer = (EjbJarDiscoverer2) IDiscoveryManager.INSTANCE
				.createDiscovererImpl(EjbJarDiscoverer2.ID);
		return discoverSourceURI(sourceURI, version);
	}

	@SuppressWarnings("static-method")
	@Test
	public void testEjbJar11() throws Exception {
		Resource resource = initResource("/resources/ejb_jar_1_1.xml", "1.1", null);
		Assert.assertFalse("Could not retrieve a xml model from file ", resource.getContents().isEmpty());

		EObject root = resource.getContents().get(0);
		org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot myEjbJarModel = (org.eclipse.modisco.jee.ejbjar.EjbJar11.DocumentRoot) root;

		// Retrieve the body of the web.xml file
		org.eclipse.modisco.jee.ejbjar.EjbJar11.EjbJarType ejbJar = myEjbJarModel.getEjbJar();

		org.eclipse.modisco.jee.ejbjar.EjbJar11.EnterpriseBeansType entBean = ejbJar.getEnterpriseBeans();

		// Session Type Test
		org.eclipse.modisco.jee.ejbjar.EjbJar11.SessionType sessionType = entBean.getSession().get(0);
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
		org.eclipse.modisco.jee.ejbjar.EjbJar11.EntityType entityType = entBean.getEntity().get(0);
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

	@SuppressWarnings("static-method")
	@Test
	public void testEjbJar20() throws Exception {
		Resource resource = initResource("/resources/ejb_jar_2_0.xml", "2.0", null);
		Assert.assertFalse("Could not retrieve a xml model from file ", resource.getContents().isEmpty());

		EObject root = resource.getContents().get(0);
		org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot myEjbJarModel = (org.eclipse.modisco.jee.ejbjar.EjbJar20.DocumentRoot) root;

		// Retrieve the body of the web.xml file
		org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJarType ejbJar = myEjbJarModel.getEjbJar();

		org.eclipse.modisco.jee.ejbjar.EjbJar20.EnterpriseBeansType entBean = ejbJar.getEnterpriseBeans();

		// Session Type Test
		org.eclipse.modisco.jee.ejbjar.EjbJar20.SessionType sessionType = entBean.getSession().get(0);
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
		org.eclipse.modisco.jee.ejbjar.EjbJar20.EntityType entityType = entBean.getEntity().get(0);
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

	@SuppressWarnings("static-method")
	@Test
	public void testEjbJar21() throws Exception {
		Resource resource = initResource("/resources/ejb_jar_2_1.xml", "2.1", null);
		Assert.assertFalse("Could not retrieve a xml model from file ", resource.getContents().isEmpty());

		EObject root = resource.getContents().get(0);
		org.eclipse.modisco.jee.ejbjar.EjbJar21.DocumentRoot myEjbJarModel = (org.eclipse.modisco.jee.ejbjar.EjbJar21.DocumentRoot) root;

		// Retrieve the body of the web.xml file
		org.eclipse.modisco.jee.ejbjar.EjbJar21.EjbJarType ejbJar = myEjbJarModel.getEjbJar();

		org.eclipse.modisco.jee.ejbjar.EjbJar21.EnterpriseBeansType entBean = ejbJar.getEnterpriseBeans();

		// Session Type Test
		org.eclipse.modisco.jee.ejbjar.EjbJar21.SessionBeanType sessionType = entBean.getSession().get(0);
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
		org.eclipse.modisco.jee.ejbjar.EjbJar21.EntityBeanType entityType = entBean.getEntity().get(0);
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

	@SuppressWarnings("static-method")
	@Test
	public void testEjbJar30() throws Exception {
		Resource resource = initResource("/resources/ejb_jar_3_0.xml", "3.0", null);
		Assert.assertFalse("Could not retrieve a xml model from file ", resource.getContents().isEmpty());

		EObject root = resource.getContents().get(0);
		org.eclipse.modisco.jee.ejbjar.EjbJar30.DocumentRoot myEjbJarModel = (org.eclipse.modisco.jee.ejbjar.EjbJar30.DocumentRoot) root;

		// Retrieve the body of the web.xml file
		org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJarType ejbJar = myEjbJarModel.getEjbJar();

		org.eclipse.modisco.jee.ejbjar.EjbJar30.EnterpriseBeansType entBean = ejbJar.getEnterpriseBeans();

		// Session Type Test
		org.eclipse.modisco.jee.ejbjar.EjbJar30.SessionBeanType sessionType = entBean.getSession().get(0);
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
		org.eclipse.modisco.jee.ejbjar.EjbJar30.MessageDrivenBeanType messageDriven = entBean.getMessageDriven().get(0);
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
		org.eclipse.modisco.jee.ejbjar.EjbJar30.EntityBeanType entityType = entBean.getEntity().get(0);
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

	@SuppressWarnings("static-method")
	@Test
	public void testEjbJar31() throws Exception {
		Resource resource = initResource("/resources/ejb_jar_3_1.xml", "3.1", null);
		Assert.assertFalse("Could not retrieve a xml model from file ", resource.getContents().isEmpty());

		EObject root = resource.getContents().get(0);
		org.eclipse.modisco.jee.ejbjar.EjbJar31.DocumentRoot myEjbJarModel = (org.eclipse.modisco.jee.ejbjar.EjbJar31.DocumentRoot) root;

		// Retrieve the body of the web.xml file
		org.eclipse.modisco.jee.ejbjar.EjbJar31.EjbJarType ejbJar = myEjbJarModel.getEjbJar();

		org.eclipse.modisco.jee.ejbjar.EjbJar31.EnterpriseBeansType entBean = ejbJar.getEnterpriseBeans();

		// Session Type Test
		org.eclipse.modisco.jee.ejbjar.EjbJar31.SessionBeanType sessionType = entBean.getSession().get(0);
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
		org.eclipse.modisco.jee.ejbjar.EjbJar31.MessageDrivenBeanType messageDriven = entBean.getMessageDriven().get(0);
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
		org.eclipse.modisco.jee.ejbjar.EjbJar31.EntityBeanType entityType = entBean.getEntity().get(0);
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
