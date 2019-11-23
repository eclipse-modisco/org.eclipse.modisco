/*****************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software and others.
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

import java.io.File;

import junit.framework.Assert;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.jee.actions.AbstractDeploymentDescriptorDiscoverer;
import org.eclipse.modisco.jee.webapp.discoverer.WebXmlDiscoverer2;
import org.eclipse.modisco.jee.webapp.webapp23.ContextParamType;
import org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot;
import org.eclipse.modisco.jee.webapp.webapp23.EjbRefType;
import org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType;
import org.eclipse.modisco.jee.webapp.webapp23.ErrorPageType;
import org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType;
import org.eclipse.modisco.jee.webapp.webapp23.ServletType;
import org.eclipse.modisco.jee.webapp.webapp23.WebAppType;
import org.junit.Before;
import org.junit.Test;

/**
 * Test of discovering a WEB.XML model 2.3
 *
 */
public class TestWebXml23 {

	private static final String RESOURCES_TEST_XML = "/resources/TestWebXml23.xml"; //$NON-NLS-1$
	private static final String VERSION = "2.3"; //$NON-NLS-1$
	private Resource resource;

	@Before
	public void initResource() throws Exception {
		if (this.resource == null) {

			String wsLocation = JUnitPlugin.getDefault().getBundle().getLocation();

			IPath path = new Path(wsLocation.replaceFirst("^reference:file:", "") //$NON-NLS-1$ //$NON-NLS-2$
					+ TestWebXml23.RESOURCES_TEST_XML);

			File xmlFile = new File(path.toOSString());
			Assert.assertTrue("Count not find " + path.toString(), xmlFile.exists());

			WebXmlDiscoverer2 discoverer = (WebXmlDiscoverer2) IDiscoveryManager.INSTANCE
					.createDiscovererImpl(WebXmlDiscoverer2.ID);
			discoverer.discoverElement(xmlFile, new NullProgressMonitor());
			this.resource = discoverer.getTargetModel();

			Assert.assertTrue(AbstractDeploymentDescriptorDiscoverer.getDescXmlVersion(
					JUnitPlugin.getDefault(), xmlFile, WebXmlDiscoverer2.ROOT_NAME,
					WebXmlDiscoverer2.DTD_URL).equalsIgnoreCase(TestWebXml23.VERSION));

			Assert.assertNotNull("Count not retrieve a XML model from " + path.toString(),
					this.resource);
		}
	}

	@Test
	public void test001() {
		if (this.resource != null) {

			Assert.assertFalse("Count not retrieve XML model", this.resource.getContents()
					.isEmpty());

			EObject root = this.resource.getContents().get(0);
			DocumentRoot myWebXmlModel = (DocumentRoot) root;

			// Retrieve the body of the web.xml file
			WebAppType webApp = myWebXmlModel.getWebApp();

			// <!-- TEST Modisco context-param-->
			ContextParamType context = webApp.getContextParam().get(0);
			Assert.assertTrue(context.getDescription().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("description-example")); //$NON-NLS-1$
			Assert.assertTrue(context.getParamName().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("param-name-example")); //$NON-NLS-1$
			Assert.assertTrue(context.getParamValue().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("param-value-example")); //$NON-NLS-1$

			// <!-- TEST Modisco Description-->
			Assert.assertTrue(webApp.getDescription().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("description-example")); //$NON-NLS-1$

			// <!-- TEST Modisco display-name-->
			Assert.assertTrue(webApp.getDisplayName().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("display-name-example")); //$NON-NLS-1$

			// <!--TEST Modisco ejb-ref-->
			EjbRefType ejbRefType = webApp.getEjbRef().get(0);
			Assert.assertTrue(ejbRefType.getDescription().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("description-example")); //$NON-NLS-1$
			Assert.assertTrue(ejbRefType.getEjbRefName().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("ejb-ref-name-example")); //$NON-NLS-1$
			Assert.assertTrue(ejbRefType.getEjbRefType().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("ejb-ref-type-example")); //$NON-NLS-1$
			Assert.assertTrue(ejbRefType.getHome().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("home-example")); //$NON-NLS-1$
			Assert.assertTrue(ejbRefType.getRemote().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("remote-example")); //$NON-NLS-1$
			Assert.assertTrue(ejbRefType.getEjbLink().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("ejb-link-example")); //$NON-NLS-1$

			// <!--TEST Modisco env-entry-->
			EnvEntryType envEntry = webApp.getEnvEntry().get(0);
			Assert.assertTrue(envEntry.getDescription().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("description-example")); //$NON-NLS-1$
			Assert.assertTrue(envEntry.getEnvEntryName().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("env-entry-name-example")); //$NON-NLS-1$
			Assert.assertTrue(envEntry.getEnvEntryValue().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("env-entry-value-example")); //$NON-NLS-1$
			Assert.assertTrue(envEntry.getEnvEntryType().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("env-entry-type-example")); //$NON-NLS-1$

			// <!-- TEST Modisco error-page -->
			ErrorPageType errorPage = webApp.getErrorPage().get(0);
			Assert.assertTrue(errorPage.getErrorCode().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("error-code")); //$NON-NLS-1$
			Assert.assertTrue(errorPage.getExceptionType().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("exception-type-example")); //$NON-NLS-1$
			Assert.assertTrue(errorPage.getLocation().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("location-example")); //$NON-NLS-1$

			// <!-- TEST Modisco security-constraint-->
			SecurityConstraintType secu = webApp.getSecurityConstraint().get(0);
			Assert.assertTrue(secu.getWebResourceCollection().get(0).getWebResourceName()
					.getMixed().getValue(0).toString()
					.equalsIgnoreCase("web-resource-name-example")); //$NON-NLS-1$
			Assert.assertTrue(secu.getWebResourceCollection().get(0).getDescription().getMixed()
					.getValue(0).toString().equalsIgnoreCase("description-example")); //$NON-NLS-1$
			Assert.assertTrue(secu.getWebResourceCollection().get(0).getUrlPattern().get(0)
					.getMixed().getValue(0).toString().equalsIgnoreCase("url-pattern-example")); //$NON-NLS-1$
			Assert.assertTrue(secu.getWebResourceCollection().get(0).getHttpMethod().get(0)
					.getMixed().getValue(0).toString().equalsIgnoreCase("http-method-example")); //$NON-NLS-1$
			Assert.assertTrue(secu.getAuthConstraint().getDescription().getMixed().get(0)
					.getValue().toString().equalsIgnoreCase("description-example")); //$NON-NLS-1$
			Assert.assertTrue(secu.getAuthConstraint().getRoleName().get(0).getMixed().get(0)
					.getValue().toString().equalsIgnoreCase("role-name-example")); //$NON-NLS-1$
			Assert.assertTrue(secu.getUserDataConstraint().getDescription().getMixed().get(0)
					.getValue().toString().equalsIgnoreCase("description-example")); //$NON-NLS-1$

			// <!-- TEST Modisco servlet -->
			ServletType servlet = webApp.getServlet().get(0);
			Assert.assertTrue(servlet.getDescription().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("description-example")); //$NON-NLS-1$
			Assert.assertTrue(servlet.getDisplayName().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("display-name-example")); //$NON-NLS-1$
			Assert.assertTrue(servlet.getServletName().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("servlet-name-example")); //$NON-NLS-1$
			Assert.assertTrue(servlet.getServletClass().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("servlet-class-example")); //$NON-NLS-1$
			Assert.assertTrue(servlet.getLoadOnStartup().getMixed().get(0).getValue().toString()
					.equalsIgnoreCase("load-on-startup-example")); //$NON-NLS-1$
			Assert.assertTrue(servlet.getIcon().getLargeIcon().getMixed().get(0).getValue()
					.toString().equalsIgnoreCase("large-icon-example")); //$NON-NLS-1$
			Assert.assertTrue(servlet.getIcon().getSmallIcon().getMixed().get(0).getValue()
					.toString().equalsIgnoreCase("small-icon-example")); //$NON-NLS-1$
			Assert.assertTrue(servlet.getSecurityRoleRef().get(0).getDescription().getMixed()
					.get(0).getValue().toString().equalsIgnoreCase("description-example")); //$NON-NLS-1$
			Assert.assertTrue(servlet.getSecurityRoleRef().get(0).getRoleName().getMixed().get(0)
					.getValue().toString().equalsIgnoreCase("role-name-example")); //$NON-NLS-1$
			Assert.assertTrue(servlet.getSecurityRoleRef().get(0).getRoleLink().getMixed().get(0)
					.getValue().toString().equalsIgnoreCase("role-link-example")); //$NON-NLS-1$

		}
	}
}
