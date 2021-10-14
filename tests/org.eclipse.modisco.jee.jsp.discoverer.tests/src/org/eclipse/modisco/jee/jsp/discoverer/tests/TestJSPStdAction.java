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

import org.junit.Assert;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.modisco.jee.jsp.JSPComment;
import org.eclipse.modisco.jee.jsp.JSPDirective;
import org.eclipse.modisco.jee.jsp.JSPStdAction;
import org.eclipse.modisco.jee.jsp.Model;
import org.eclipse.modisco.jee.jsp.Page;
import org.eclipse.modisco.jee.jsp.discoverer.DiscoverJspModelFromResource;
import org.eclipse.modisco.xml.Attribute;
import org.eclipse.modisco.xml.Node;
import org.eclipse.modisco.xml.Text;
import org.junit.Ignore;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class TestJSPStdAction {

	private static final String RESOURCES_TEST = "/resources/jspAction.jsp"; //$NON-NLS-1$
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

			IFile jspFile = project.getFile(TestJSPStdAction.RESOURCES_TEST);
			Assert.assertTrue("test jsp file not found", jspFile.exists());

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

		// <jsp:element name="value" name1="value1" />
		JSPStdAction element1 = (JSPStdAction) page.getOwnedElements().get(0);
		Assert.assertTrue(element1.getName().equalsIgnoreCase("jsp:element")); //$NON-NLS-1$
		EList<Node> children = element1.getChildren();
		Attribute att1 = (Attribute) children.get(0);
		Assert.assertTrue(att1.getName().equalsIgnoreCase("name")); //$NON-NLS-1$
		Assert.assertTrue(att1.getValue().equalsIgnoreCase("value")); //$NON-NLS-1$

		// <jsp:element name="value" name1="value1" >
		// <%-- Comment JSP Element --%>
		// <%@ include name="value"%>
		// </jsp:element>
		JSPStdAction element2 = (JSPStdAction) page.getOwnedElements().get(1);
		Assert.assertTrue(element2.getName().equalsIgnoreCase("jsp:element")); //$NON-NLS-1$
		Assert.assertTrue(element2.getChildren().get(2) instanceof JSPComment);
		Assert.assertTrue(element2.getChildren().get(3) instanceof JSPDirective);

		// <jsp:root name="value" name1="value1" >
		// <%-- Comment JSP Root --%>
		// <%@ include name="value"%>
		// </jsp:root>
		JSPStdAction element3 = (JSPStdAction) page.getOwnedElements().get(2);
		Assert.assertTrue(element3.getName().equalsIgnoreCase("jsp:root")); //$NON-NLS-1$
		Assert.assertTrue(element3.getChildren().get(2) instanceof JSPComment);
		Assert.assertTrue(element3.getChildren().get(3) instanceof JSPDirective);

		// <jsp:include name="value" >
		// <jsp:param name="value" name1="value1" />
		// </jsp:include>
		JSPStdAction element4 = (JSPStdAction) page.getOwnedElements().get(3);
		Assert.assertTrue(element4.getName().equalsIgnoreCase("jsp:include")); //$NON-NLS-1$
		Assert.assertTrue(element4.getChildren().get(1) instanceof JSPStdAction);
		JSPStdAction jspParam = (JSPStdAction) element4.getChildren().get(1);
		Assert.assertTrue(jspParam.getName().equalsIgnoreCase("jsp:param")); //$NON-NLS-1$

		// <jsp:forward name="value" >
		// <%-- Comment JSP Forward --%>
		// <jsp:param name="value" name1="value1" />
		// </jsp:forward>
		JSPStdAction element5 = (JSPStdAction) page.getOwnedElements().get(4);
		Assert.assertTrue(element5.getName().equalsIgnoreCase("jsp:forward")); //$NON-NLS-1$
		Assert.assertTrue(element5.getChildren().get(1) instanceof JSPComment);
		Assert.assertTrue(element5.getChildren().get(2) instanceof JSPStdAction);

		// <jsp:plugin name="value" name1="value1">
		// <jsp:params>
		// <%-- Comment JSP Params --%>
		// <jsp:param name="value" name1="value1" />
		// </jsp:params>
		// <%-- Comment JSP Plugin --%>
		// <jsp:fallback>
		// <%-- Comment3 --%>
		// This is some content for the fallback tag
		// </jsp:fallback>
		// </jsp:plugin>
		JSPStdAction element6 = (JSPStdAction) page.getOwnedElements().get(5);
		Assert.assertTrue(element6.getName().equalsIgnoreCase("jsp:plugin")); //$NON-NLS-1$
		Assert.assertTrue(element6.getChildren().get(2) instanceof JSPStdAction);
		Assert.assertTrue(element6.getChildren().get(2).getName()
				.equalsIgnoreCase("jsp:params")); //$NON-NLS-1$
		Assert.assertTrue(element6.getChildren().get(3) instanceof JSPComment);
		Assert.assertTrue(element6.getChildren().get(4) instanceof JSPStdAction);
		Assert.assertTrue(element6.getChildren().get(4).getName()
				.equalsIgnoreCase("jsp:fallback")); //$NON-NLS-1$

		// <jsp:getProperty name="value1" name="value1" />
		JSPStdAction element7 = (JSPStdAction) page.getOwnedElements().get(6);
		Assert.assertTrue(element7.getName()
				.equalsIgnoreCase("jsp:getProperty")); //$NON-NLS-1$
		Assert.assertTrue(element7.getChildren().size() == 2);

		// <jsp:setProperty name="value1" name="value1" />
		JSPStdAction element8 = (JSPStdAction) page.getOwnedElements().get(7);
		Assert.assertTrue(element8.getName()
				.equalsIgnoreCase("jsp:setProperty")); //$NON-NLS-1$
		Assert.assertTrue(element8.getChildren().size() == 2);

		// <jsp:doBody name="value" name1="value1" />
		JSPStdAction element9 = (JSPStdAction) page.getOwnedElements().get(8);
		Assert.assertTrue(element9.getName().equalsIgnoreCase("jsp:doBody")); //$NON-NLS-1$
		Assert.assertTrue(element9.getChildren().size() == 2);

		// <jsp:output name="value" name1="value1" />
		JSPStdAction element10 = (JSPStdAction) page.getOwnedElements().get(9);
		Assert.assertTrue(element10.getName().equalsIgnoreCase("jsp:output")); //$NON-NLS-1$
		Assert.assertTrue(element10.getChildren().size() == 2);

		// <jsp:invoke name="value" name1="value1" />
		JSPStdAction element11 = (JSPStdAction) page.getOwnedElements().get(10);
		Assert.assertTrue(element11.getName().equalsIgnoreCase("jsp:invoke")); //$NON-NLS-1$
		Assert.assertTrue(element11.getChildren().size() == 2);

		// <jsp:body>
		// text on top of jspbody
		// <%@ include name="value"%>
		// text on bottom of jspbody
		// </jsp:body>
		JSPStdAction element12 = (JSPStdAction) page.getOwnedElements().get(11);
		Assert.assertTrue(element12.getName().equalsIgnoreCase("jsp:body")); //$NON-NLS-1$
		EList<Node> list12 = element12.getChildren();
		Assert.assertTrue(list12.get(0) instanceof Text);
		Assert.assertTrue(list12.get(1) instanceof JSPDirective);
		Assert.assertTrue(list12.get(2) instanceof Text);

		// <jsp:attribute name="value" name1="value1"/>
		JSPStdAction element13 = (JSPStdAction) page.getOwnedElements().get(12);
		Assert.assertTrue(element13.getName().equalsIgnoreCase("jsp:attribute")); //$NON-NLS-1$
		Assert.assertTrue(element13.getChildren().size() == 2);

		// <jsp:attribute name="value" name1="value1">
		// <%-- Comment JSP Root --%>
		// <%@ include name="value"%>
		// </jsp:attribute>
		JSPStdAction element14 = (JSPStdAction) page.getOwnedElements().get(13);
		Assert.assertTrue(element14.getName().equalsIgnoreCase("jsp:attribute")); //$NON-NLS-1$

		// <jsp:useBean name="value" name1="value1" />
		JSPStdAction element15 = (JSPStdAction) page.getOwnedElements().get(14);
		Assert.assertTrue(element15.getName().equalsIgnoreCase("jsp:useBean")); //$NON-NLS-1$
		Assert.assertTrue(element15.getChildren().size() == 2);

		// <jsp:text>This is some text to test the jsp:text function
		// </jsp:text>
		JSPStdAction element16 = (JSPStdAction) page.getOwnedElements().get(15);
		Assert.assertTrue(element16
				.getChildren()
				.get(0)
				.getName()
				.equalsIgnoreCase("This is some text to test the jsp:text function ")); //$NON-NLS-1$

	}
}
