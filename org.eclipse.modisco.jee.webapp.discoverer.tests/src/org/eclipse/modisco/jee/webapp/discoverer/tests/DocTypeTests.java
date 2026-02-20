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
package org.eclipse.modisco.jee.webapp.discoverer.tests;

import java.net.URL;
import java.util.Set;
import java.util.Stack;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.jee.actions.AbstractDeploymentDescriptorDiscoverer;
import org.eclipse.modisco.jee.webapp.discoverer.WebXmlDiscoverer2;
import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.Bundle;

import com.google.common.collect.Sets;

/**
 * Test of discovering a WEB.XML model 2.4 The specified file does not contain a
 * declaration of xsd, only the version
 *
 */
public class DocTypeTests
{
	protected static Resource discoverSourceURI(URI sourceURI, String version) throws DiscoveryException {
		WebXmlDiscoverer2 discoverer = (WebXmlDiscoverer2) IDiscoveryManager.INSTANCE
				.createDiscovererImpl(WebXmlDiscoverer2.ID);
		discoverer.discoverResource(sourceURI);
		Stack<Set<IStatus>> residualExpectedStatuses = Logger.resetExpectedStatuses();
		Assert.assertNull("Not all expected status messages logged", residualExpectedStatuses);
	
		Resource resource = discoverer.getTargetModel();
	
		Assert.assertTrue(AbstractDeploymentDescriptorDiscoverer.getDescXmlVersion(
				JUnitPlugin.getDefault(), sourceURI, WebXmlDiscoverer2.ROOT_NAME,
				WebXmlDiscoverer2.DTD_URL).equalsIgnoreCase(version));
	
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
		WebXmlDiscoverer2 discoverer = (WebXmlDiscoverer2) IDiscoveryManager.INSTANCE
				.createDiscovererImpl(WebXmlDiscoverer2.ID);
		return discoverSourceURI(sourceURI, version);
	}

	@SuppressWarnings("static-method")
	@Test
	public void testCommentedDocType() throws Exception {
		initResource("/resources/TestCommentedDocType.xml", "2.2", null);
	}

	@SuppressWarnings("static-method")
	@Test
	public void testNoUri() throws Exception {
		String symbolicName = "org.eclipse.modisco.jee.webapp.discoverer"; //bundle.getSymbolicName();
	//	String prefix = "In plug-in=\"" + symbolicName + "\"; extension=\"org.eclipse.modisco.infra.discovery.ui.discoverer\": attribute discovererID=\"";
	//	String suffix = "\" doesn't refer to an existing discoverer.)";
		Status status = new Status(IStatus.WARNING, symbolicName, "Unknown feature detected:org.eclipse.emf.ecore.xml.type.impl.AnyTypeImpl", null);
		Set<IStatus> expectedStatuses = Sets.newHashSet(status);
		initResource("/resources/TestNoUri.xml", "2.4", expectedStatuses);
	}

	@SuppressWarnings("static-method")
	@Test
	public void testNoVersion() throws Exception {
		initResource("/resources/TestNoVersion.xml", "2.5", null);
	}

	@SuppressWarnings("static-method")
	@Test
	public void testWebXml22() throws Exception {
		Resource resource = initResource("/resources/TestWebXml22.xml", "2.2", null);
		Assert.assertFalse("Could not retrieve a xml model from resource", resource.getContents().isEmpty());

		EObject root = resource.getContents().get(0);
		org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot myWebXmlModel = (org.eclipse.modisco.jee.webapp.webapp22.DocumentRoot) root;

		// Retrieve the body of the web.xml file
		org.eclipse.modisco.jee.webapp.webapp22.WebAppType webApp = myWebXmlModel.getWebApp();

		// <!-- TEST Modisco context-param-->
		org.eclipse.modisco.jee.webapp.webapp22.ContextParamType context = webApp.getContextParam().get(0);
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
		org.eclipse.modisco.jee.webapp.webapp22.EjbRefType ejbRefType = webApp.getEjbRef().get(0);
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
		org.eclipse.modisco.jee.webapp.webapp22.EnvEntryType envEntry = webApp.getEnvEntry().get(0);
		Assert.assertTrue(envEntry.getDescription().getMixed().get(0).getValue().toString()
				.equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(envEntry.getEnvEntryName().getMixed().get(0).getValue().toString()
				.equalsIgnoreCase("env-entry-name-example")); //$NON-NLS-1$
		Assert.assertTrue(envEntry.getEnvEntryValue().getMixed().get(0).getValue().toString()
				.equalsIgnoreCase("env-entry-value-example")); //$NON-NLS-1$
		Assert.assertTrue(envEntry.getEnvEntryType().getMixed().get(0).getValue().toString()
				.equalsIgnoreCase("env-entry-type-example")); //$NON-NLS-1$

		// <!-- TEST Modisco error-page -->
		org.eclipse.modisco.jee.webapp.webapp22.ErrorPageType errorPage = webApp.getErrorPage().get(0);
		Assert.assertTrue(errorPage.getErrorCode().getMixed().get(0).getValue().toString()
				.equalsIgnoreCase("error-code-example")); //$NON-NLS-1$
		Assert.assertTrue(errorPage.getExceptionType().getMixed().get(0).getValue().toString()
				.equalsIgnoreCase("exception-type-example")); //$NON-NLS-1$
		Assert.assertTrue(errorPage.getLocation().getMixed().get(0).getValue().toString()
				.equalsIgnoreCase("location-example")); //$NON-NLS-1$

		// <!-- TEST Modisco security-constraint-->
		org.eclipse.modisco.jee.webapp.webapp22.SecurityConstraintType secu = webApp.getSecurityConstraint().get(0);
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
		org.eclipse.modisco.jee.webapp.webapp22.ServletType servlet = webApp.getServlet().get(0);
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

	@SuppressWarnings("static-method")
	@Test
	public void testWebXml23() throws Exception {
		Resource resource = initResource("/resources/TestWebXml23.xml", "2.3", null);
		Assert.assertFalse("Could not retrieve XML model", resource.getContents().isEmpty());

		EObject root = resource.getContents().get(0);
		org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot myWebXmlModel = (org.eclipse.modisco.jee.webapp.webapp23.DocumentRoot) root;

		// Retrieve the body of the web.xml file
		org.eclipse.modisco.jee.webapp.webapp23.WebAppType webApp = myWebXmlModel.getWebApp();

		// <!-- TEST Modisco context-param-->
		org.eclipse.modisco.jee.webapp.webapp23.ContextParamType context = webApp.getContextParam().get(0);
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
		org.eclipse.modisco.jee.webapp.webapp23.EjbRefType ejbRefType = webApp.getEjbRef().get(0);
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
		org.eclipse.modisco.jee.webapp.webapp23.EnvEntryType envEntry = webApp.getEnvEntry().get(0);
		Assert.assertTrue(envEntry.getDescription().getMixed().get(0).getValue().toString()
				.equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(envEntry.getEnvEntryName().getMixed().get(0).getValue().toString()
				.equalsIgnoreCase("env-entry-name-example")); //$NON-NLS-1$
		Assert.assertTrue(envEntry.getEnvEntryValue().getMixed().get(0).getValue().toString()
				.equalsIgnoreCase("env-entry-value-example")); //$NON-NLS-1$
		Assert.assertTrue(envEntry.getEnvEntryType().getMixed().get(0).getValue().toString()
				.equalsIgnoreCase("env-entry-type-example")); //$NON-NLS-1$

		// <!-- TEST Modisco error-page -->
		org.eclipse.modisco.jee.webapp.webapp23.ErrorPageType errorPage = webApp.getErrorPage().get(0);
		Assert.assertTrue(errorPage.getErrorCode().getMixed().get(0).getValue().toString()
				.equalsIgnoreCase("error-code")); //$NON-NLS-1$
		Assert.assertTrue(errorPage.getExceptionType().getMixed().get(0).getValue().toString()
				.equalsIgnoreCase("exception-type-example")); //$NON-NLS-1$
		Assert.assertTrue(errorPage.getLocation().getMixed().get(0).getValue().toString()
				.equalsIgnoreCase("location-example")); //$NON-NLS-1$

		// <!-- TEST Modisco security-constraint-->
		org.eclipse.modisco.jee.webapp.webapp23.SecurityConstraintType secu = webApp.getSecurityConstraint().get(0);
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
		org.eclipse.modisco.jee.webapp.webapp23.ServletType servlet = webApp.getServlet().get(0);
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

	@SuppressWarnings("static-method")
	@Test
	public void testWebXml24() throws Exception {
		Resource resource = initResource("/resources/TestWebXml24.xml", "2.4", null);
		Assert.assertFalse("Could not retrieve a xml model from resource", resource.getContents().isEmpty());

		EObject root = resource.getContents().get(0);
		org.eclipse.modisco.jee.webapp.webapp24.DocumentRoot myWebXmlModel = (org.eclipse.modisco.jee.webapp.webapp24.DocumentRoot) root;

		// Retrieve the body of the web.xml file
		org.eclipse.modisco.jee.webapp.webapp24.WebAppType webApp = myWebXmlModel.getWebApp();

		// <!-- TEST Modisco context-param-->
		org.eclipse.modisco.jee.webapp.webapp24.ParamValueType context = webApp.getContextParam().get(0);
		Assert.assertTrue(context.getDescription().get(0).getValue().toString()
				.equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(context.getParamName().getValue().toString()
				.equalsIgnoreCase("param-name-example")); //$NON-NLS-1$
		Assert.assertTrue(context.getParamValue().getValue().toString()
				.equalsIgnoreCase("param-value-example")); //$NON-NLS-1$

		// <!-- TEST Modisco Description-->
		Assert.assertTrue(webApp.getDescription().get(0).getValue().toString()
				.equalsIgnoreCase("description-example")); //$NON-NLS-1$

		// <!-- TEST Modisco display-name-->
		Assert.assertTrue(webApp.getDisplayName().get(0).getValue().toString()
				.equalsIgnoreCase("display-name-example")); //$NON-NLS-1$

		// <!--TEST Modisco ejb-ref-->
		org.eclipse.modisco.jee.webapp.webapp24.EjbRefType ejbRefType = webApp.getEjbRef().get(0);
		Assert.assertTrue(ejbRefType.getDescription().get(0).getValue().toString()
				.equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(ejbRefType.getEjbRefName().getValue().toString()
				.equalsIgnoreCase("ejb-ref-name-example")); //$NON-NLS-1$
		Assert.assertTrue(ejbRefType.getEjbRefType().getValue().toString()
				.equalsIgnoreCase("ejb-ref-type-example")); //$NON-NLS-1$
		Assert.assertTrue(ejbRefType.getHome().getValue().toString()
				.equalsIgnoreCase("home-example")); //$NON-NLS-1$
		Assert.assertTrue(ejbRefType.getRemote().getValue().toString()
				.equalsIgnoreCase("remote-example")); //$NON-NLS-1$
		Assert.assertTrue(ejbRefType.getEjbLink().getValue().toString()
				.equalsIgnoreCase("ejb-link-example")); //$NON-NLS-1$

		// <!--TEST Modisco env-entry-->
		org.eclipse.modisco.jee.webapp.webapp24.EnvEntryType envEntry = webApp.getEnvEntry().get(0);
		Assert.assertTrue(envEntry.getDescription().get(0).getValue().toString()
				.equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(envEntry.getEnvEntryName().getValue().toString()
				.equalsIgnoreCase("env-entry-name-example")); //$NON-NLS-1$
		Assert.assertTrue(envEntry.getEnvEntryValue().getValue().toString()
				.equalsIgnoreCase("env-entry-value-example")); //$NON-NLS-1$
		Assert.assertTrue(envEntry.getEnvEntryType().getValue().toString()
				.equalsIgnoreCase("env-entry-type-example")); //$NON-NLS-1$

		// <!-- TEST Modisco error-page -->
		org.eclipse.modisco.jee.webapp.webapp24.ErrorPageType errorPage = webApp.getErrorPage().get(0);
		Assert.assertTrue(errorPage.getErrorCode().getValue().toString().equalsIgnoreCase("10")); //$NON-NLS-1$
		Assert.assertTrue(errorPage.getExceptionType().getValue().toString()
				.equalsIgnoreCase("exception-type-example")); //$NON-NLS-1$
		Assert.assertTrue(errorPage.getLocation().getValue().toString()
				.equalsIgnoreCase("location-example")); //$NON-NLS-1$

		// <!-- TEST Modisco security-constraint-->
		org.eclipse.modisco.jee.webapp.webapp24.SecurityConstraintType secu = webApp.getSecurityConstraint().get(0);
		Assert.assertTrue(secu.getWebResourceCollection().get(0).getWebResourceName()
				.getValue().toString().equalsIgnoreCase("web-resource-name-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getWebResourceCollection().get(0).getDescription().get(0)
				.getValue().toString().equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getWebResourceCollection().get(0).getUrlPattern().get(0)
				.getValue().toString().equalsIgnoreCase("url-pattern-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getWebResourceCollection().get(0).getHttpMethod().get(0)
				.getValue().toString().equalsIgnoreCase("http-method-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getAuthConstraint().getDescription().get(0).getValue()
				.toString().equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getAuthConstraint().getRoleName().get(0).getValue().toString()
				.equalsIgnoreCase("role-name-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getUserDataConstraint().getDescription().get(0).getValue()
				.toString().equalsIgnoreCase("description-example")); //$NON-NLS-1$

		// <!-- TEST Modisco servlet -->
		org.eclipse.modisco.jee.webapp.webapp24.ServletType servlet = webApp.getServlet().get(0);
		Assert.assertTrue(servlet.getDescription().get(0).getValue().toString()
				.equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getDisplayName().get(0).getValue().toString()
				.equalsIgnoreCase("display-name-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getServletName().getValue().toString()
				.equalsIgnoreCase("servlet-name-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getServletClass().getValue().toString()
				.equalsIgnoreCase("servlet-class-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getLoadOnStartup().getValue().toString()
				.equalsIgnoreCase("10")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getIcon().get(0).getLargeIcon().getValue().toString()
				.equalsIgnoreCase("large-icon-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getIcon().get(0).getSmallIcon().getValue().toString()
				.equalsIgnoreCase("small-icon-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getSecurityRoleRef().get(0).getDescription().get(0)
				.getValue().toString().equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getSecurityRoleRef().get(0).getRoleName().getValue()
				.toString().equalsIgnoreCase("role-name-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getSecurityRoleRef().get(0).getRoleLink().getValue()
				.toString().equalsIgnoreCase("role-link-example")); //$NON-NLS-1$
	}


	@SuppressWarnings("static-method")
	@Test
	public void testWebXml25() throws Exception {
		Resource resource = initResource("/resources/TestWebXml25.xml", "2.5", null);
		Assert.assertFalse("Could not retrieve a xml model from resource", resource.getContents().isEmpty());

		EObject root = resource.getContents().get(0);
		org.eclipse.modisco.jee.webapp.webapp25.DocumentRoot myWebXmlModel = (org.eclipse.modisco.jee.webapp.webapp25.DocumentRoot) root;

		// Retrieve the body of the web.xml file
		org.eclipse.modisco.jee.webapp.webapp25.WebAppType webApp = myWebXmlModel.getWebApp();

		// <!-- TEST Modisco context-param-->
		org.eclipse.modisco.jee.webapp.webapp25.ParamValueType context = webApp.getContextParam().get(0);
		Assert.assertTrue(context.getDescription().get(0).getValue().toString()
				.equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(context.getParamName().getValue().toString()
				.equalsIgnoreCase("param-name-example")); //$NON-NLS-1$
		Assert.assertTrue(context.getParamValue().getValue().toString()
				.equalsIgnoreCase("param-value-example")); //$NON-NLS-1$

		// <!-- TEST Modisco Description-->
		Assert.assertTrue(webApp.getDescription().get(0).getValue().toString()
				.equalsIgnoreCase("description-example")); //$NON-NLS-1$

		// <!-- TEST Modisco display-name-->
		Assert.assertTrue(webApp.getDisplayName().get(0).getValue().toString()
				.equalsIgnoreCase("display-name-example")); //$NON-NLS-1$

		// <!--TEST Modisco ejb-ref-->
		org.eclipse.modisco.jee.webapp.webapp25.EjbRefType ejbRefType = webApp.getEjbRef().get(0);
		Assert.assertTrue(ejbRefType.getDescription().get(0).getValue().toString()
				.equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(ejbRefType.getEjbRefName().getValue().toString()
				.equalsIgnoreCase("ejb-ref-name-example")); //$NON-NLS-1$
		Assert.assertTrue(ejbRefType.getEjbRefType().getValue().toString()
				.equalsIgnoreCase("ejb-ref-type-example")); //$NON-NLS-1$
		Assert.assertTrue(ejbRefType.getHome().getValue().toString()
				.equalsIgnoreCase("home-example")); //$NON-NLS-1$
		Assert.assertTrue(ejbRefType.getRemote().getValue().toString()
				.equalsIgnoreCase("remote-example")); //$NON-NLS-1$
		Assert.assertTrue(ejbRefType.getEjbLink().getValue().toString()
				.equalsIgnoreCase("ejb-link-example")); //$NON-NLS-1$

		// <!--TEST Modisco env-entry-->
		org.eclipse.modisco.jee.webapp.webapp25.EnvEntryType envEntry = webApp.getEnvEntry().get(0);
		Assert.assertTrue(envEntry.getDescription().get(0).getValue().toString()
				.equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(envEntry.getEnvEntryName().getValue().toString()
				.equalsIgnoreCase("env-entry-name-example")); //$NON-NLS-1$
		Assert.assertTrue(envEntry.getEnvEntryValue().getValue().toString()
				.equalsIgnoreCase("env-entry-value-example")); //$NON-NLS-1$
		Assert.assertTrue(envEntry.getEnvEntryType().getValue().toString()
				.equalsIgnoreCase("env-entry-type-example")); //$NON-NLS-1$

		// <!-- TEST Modisco error-page -->
		org.eclipse.modisco.jee.webapp.webapp25.ErrorPageType errorPage = webApp.getErrorPage().get(0);
		Assert.assertTrue(errorPage.getErrorCode().getValue().toString().equalsIgnoreCase("10")); //$NON-NLS-1$
		Assert.assertTrue(errorPage.getExceptionType().getValue().toString()
				.equalsIgnoreCase("exception-type-example")); //$NON-NLS-1$
		Assert.assertTrue(errorPage.getLocation().getValue().toString()
				.equalsIgnoreCase("location-example")); //$NON-NLS-1$

		// <!-- TEST Modisco security-constraint-->
		org.eclipse.modisco.jee.webapp.webapp25.SecurityConstraintType secu = webApp.getSecurityConstraint().get(0);
		Assert.assertTrue(secu.getWebResourceCollection().get(0).getWebResourceName()
				.getValue().toString().equalsIgnoreCase("web-resource-name-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getWebResourceCollection().get(0).getDescription().get(0)
				.getValue().toString().equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getWebResourceCollection().get(0).getUrlPattern().get(0)
				.getValue().toString().equalsIgnoreCase("url-pattern-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getWebResourceCollection().get(0).getHttpMethod().get(0)
				.toString().equalsIgnoreCase("http-method-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getAuthConstraint().getDescription().get(0).getValue()
				.toString().equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getAuthConstraint().getRoleName().get(0).getValue().toString()
				.equalsIgnoreCase("role-name-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getUserDataConstraint().getDescription().get(0).getValue()
				.toString().equalsIgnoreCase("description-example")); //$NON-NLS-1$

		// <!-- TEST Modisco servlet -->
		org.eclipse.modisco.jee.webapp.webapp25.ServletType servlet = webApp.getServlet().get(0);
		Assert.assertTrue(servlet.getDescription().get(0).getValue().toString()
				.equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getDisplayName().get(0).getValue().toString()
				.equalsIgnoreCase("display-name-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getServletName().getValue().toString()
				.equalsIgnoreCase("servlet-name-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getServletClass().getValue().toString()
				.equalsIgnoreCase("servlet-class-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getLoadOnStartup().toString().equalsIgnoreCase("10")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getIcon().get(0).getLargeIcon().getValue().toString()
				.equalsIgnoreCase("large-icon-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getIcon().get(0).getSmallIcon().getValue().toString()
				.equalsIgnoreCase("small-icon-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getSecurityRoleRef().get(0).getDescription().get(0)
				.getValue().toString().equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getSecurityRoleRef().get(0).getRoleName().getValue()
				.toString().equalsIgnoreCase("role-name-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getSecurityRoleRef().get(0).getRoleLink().getValue()
				.toString().equalsIgnoreCase("role-link-example")); //$NON-NLS-1$
	}

	@SuppressWarnings("static-method")
	@Test
	public void testWebXml30() throws Exception {
		Resource resource = initResource("/resources/TestWebXml30.xml", "3.0", null);
		Assert.assertFalse("Could not retrieve a xml model from resource", resource.getContents().isEmpty());

		EObject root = resource.getContents().get(0);
		org.eclipse.modisco.jee.webapp.webapp30.DocumentRoot myWebXmlModel = (org.eclipse.modisco.jee.webapp.webapp30.DocumentRoot) root;

		// Retrieve the body of the web.xml file
		org.eclipse.modisco.jee.webapp.webapp30.WebAppType webApp = myWebXmlModel.getWebApp();

		// <!-- TEST Modisco context-param-->
		org.eclipse.modisco.jee.webapp.webapp30.ParamValueType context = webApp.getContextParam().get(0);
		Assert.assertTrue(context.getDescription().get(0).getValue().toString()
				.equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(context.getParamName().getValue().toString()
				.equalsIgnoreCase("param-name-example")); //$NON-NLS-1$
		Assert.assertTrue(context.getParamValue().getValue().toString()
				.equalsIgnoreCase("param-value-example")); //$NON-NLS-1$

		// <!-- TEST Modisco Description-->
		Assert.assertTrue(webApp.getDescription().get(0).getValue().toString()
				.equalsIgnoreCase("description-example")); //$NON-NLS-1$

		// <!-- TEST Modisco display-name-->
		Assert.assertTrue(webApp.getDisplayName().get(0).getValue().toString()
				.equalsIgnoreCase("display-name-example")); //$NON-NLS-1$

		// <!--TEST Modisco ejb-ref-->
		org.eclipse.modisco.jee.webapp.webapp30.EjbRefType ejbRefType = webApp.getEjbRef().get(0);
		Assert.assertTrue(ejbRefType.getDescription().get(0).getValue().toString()
				.equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(ejbRefType.getEjbRefName().getValue().toString()
				.equalsIgnoreCase("ejb-ref-name-example")); //$NON-NLS-1$
		Assert.assertTrue(ejbRefType.getEjbRefType().getValue().toString()
				.equalsIgnoreCase("ejb-ref-type-example")); //$NON-NLS-1$
		Assert.assertTrue(ejbRefType.getHome().getValue().toString()
				.equalsIgnoreCase("home-example")); //$NON-NLS-1$
		Assert.assertTrue(ejbRefType.getRemote().getValue().toString()
				.equalsIgnoreCase("remote-example")); //$NON-NLS-1$
		Assert.assertTrue(ejbRefType.getEjbLink().getValue().toString()
				.equalsIgnoreCase("ejb-link-example")); //$NON-NLS-1$

		// <!--TEST Modisco env-entry-->
		org.eclipse.modisco.jee.webapp.webapp30.EnvEntryType envEntry = webApp.getEnvEntry().get(0);
		Assert.assertTrue(envEntry.getDescription().get(0).getValue().toString()
				.equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(envEntry.getEnvEntryName().getValue().toString()
				.equalsIgnoreCase("env-entry-name-example")); //$NON-NLS-1$
		Assert.assertTrue(envEntry.getEnvEntryValue().getValue().toString()
				.equalsIgnoreCase("env-entry-value-example")); //$NON-NLS-1$
		Assert.assertTrue(envEntry.getEnvEntryType().getValue().toString()
				.equalsIgnoreCase("env-entry-type-example")); //$NON-NLS-1$

		// <!-- TEST Modisco error-page -->
		org.eclipse.modisco.jee.webapp.webapp30.ErrorPageType errorPage = webApp.getErrorPage().get(0);
		Assert.assertTrue(errorPage.getErrorCode().getValue().toString().equalsIgnoreCase("10")); //$NON-NLS-1$
		Assert.assertTrue(errorPage.getExceptionType().getValue().toString()
				.equalsIgnoreCase("exception-type-example")); //$NON-NLS-1$
		Assert.assertTrue(errorPage.getLocation().getValue().toString()
				.equalsIgnoreCase("location-example")); //$NON-NLS-1$

		// <!-- TEST Modisco security-constraint-->
		org.eclipse.modisco.jee.webapp.webapp30.SecurityConstraintType secu = webApp.getSecurityConstraint().get(0);
		Assert.assertTrue(secu.getWebResourceCollection().get(0).getWebResourceName()
				.getValue().toString().equalsIgnoreCase("web-resource-name-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getWebResourceCollection().get(0).getDescription().get(0)
				.getValue().toString().equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getWebResourceCollection().get(0).getUrlPattern().get(0)
				.getValue().toString().equalsIgnoreCase("url-pattern-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getWebResourceCollection().get(0).getHttpMethod().get(0)
				.toString().equalsIgnoreCase("http-method-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getAuthConstraint().getDescription().get(0).getValue()
				.toString().equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getAuthConstraint().getRoleName().get(0).getValue().toString()
				.equalsIgnoreCase("role-name-example")); //$NON-NLS-1$
		Assert.assertTrue(secu.getUserDataConstraint().getDescription().get(0).getValue()
				.toString().equalsIgnoreCase("description-example")); //$NON-NLS-1$

		// <!-- TEST Modisco servlet -->
		org.eclipse.modisco.jee.webapp.webapp30.ServletType servlet = webApp.getServlet().get(0);
		Assert.assertTrue(servlet.getDescription().get(0).getValue().toString()
				.equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getDisplayName().get(0).getValue().toString()
				.equalsIgnoreCase("display-name-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getServletName().getValue().toString()
				.equalsIgnoreCase("servlet-name-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getServletClass().getValue().toString()
				.equalsIgnoreCase("servlet-class-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getLoadOnStartup().toString().equalsIgnoreCase("10")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getIcon().get(0).getLargeIcon().getValue().toString()
				.equalsIgnoreCase("large-icon-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getIcon().get(0).getSmallIcon().getValue().toString()
				.equalsIgnoreCase("small-icon-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getSecurityRoleRef().get(0).getDescription().get(0)
				.getValue().toString().equalsIgnoreCase("description-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getSecurityRoleRef().get(0).getRoleName().getValue()
				.toString().equalsIgnoreCase("role-name-example")); //$NON-NLS-1$
		Assert.assertTrue(servlet.getSecurityRoleRef().get(0).getRoleLink().getValue()
				.toString().equalsIgnoreCase("role-link-example")); //$NON-NLS-1$
	}
}