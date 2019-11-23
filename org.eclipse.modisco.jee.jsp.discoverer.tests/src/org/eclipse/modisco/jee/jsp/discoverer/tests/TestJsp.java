/*********************************************************************************
 * Copyright (c) 2009,2011 Mia-Software and others.
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

import static org.junit.Assert.assertTrue;
import junit.framework.Assert;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.modisco.jee.jsp.ComposedAttribute;
import org.eclipse.modisco.jee.jsp.JSPAction;
import org.eclipse.modisco.jee.jsp.JSPComment;
import org.eclipse.modisco.jee.jsp.JSPDeclaration;
import org.eclipse.modisco.jee.jsp.JSPDirective;
import org.eclipse.modisco.jee.jsp.JSPExpression;
import org.eclipse.modisco.jee.jsp.JSPScriptlet;
import org.eclipse.modisco.jee.jsp.Model;
import org.eclipse.modisco.jee.jsp.Page;
import org.eclipse.modisco.jee.jsp.discoverer.DiscoverJspModelFromResource;
import org.eclipse.modisco.xml.Attribute;
import org.eclipse.modisco.xml.CDATA;
import org.eclipse.modisco.xml.Element;
import org.eclipse.modisco.xml.Node;
import org.eclipse.modisco.xml.Text;
import org.junit.Ignore;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class TestJsp {

	private static final String RESOURCES_TEST = "/resources/jspElement.jsp"; //$NON-NLS-1$
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
			IFile jspFile = project.getFile(TestJsp.RESOURCES_TEST);
			assertTrue("Could not access the test file :" + jspFile.getName(),
					jspFile.exists());

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
		EList<Node> elements = page.getOwnedElements();

		CDATA cdata = (CDATA) elements.get(1);
		Assert.assertTrue(cdata.getName().equalsIgnoreCase("<![CDATA[This is a CDATA tag]]>")); //$NON-NLS-1$

		// ###############################################################################################################
		// Attribute's test section
		// ###############################################################################################################
		Element tag1 = (Element) elements.get(3);
		Assert.assertTrue(tag1.getName().equalsIgnoreCase("ATTRIBUTESECTION")); //$NON-NLS-1$

		// att1="value1"
		Attribute att1 = (Attribute) tag1.getChildren().get(0);
		Assert.assertTrue(att1.getName().equalsIgnoreCase("att1")); //$NON-NLS-1$
		Assert.assertTrue(att1.getValue().equalsIgnoreCase("value1")); //$NON-NLS-1$

		// att2='value2'
		Attribute att2 = (Attribute) tag1.getChildren().get(1);
		Assert.assertTrue(att2.getName().equalsIgnoreCase("att2")); //$NON-NLS-1$
		Assert.assertTrue(att2.getValue().equalsIgnoreCase("value2")); //$NON-NLS-1$

		Attribute att3 = (Attribute) tag1.getChildren().get(2);
		Assert.assertTrue(att3.getName().equalsIgnoreCase("att3")); //$NON-NLS-1$
		Assert.assertTrue(att3.getValue().equalsIgnoreCase("value3")); //$NON-NLS-1$

		// att4=<myprefix:myaction att1="value1"/>
		ComposedAttribute att4 = (ComposedAttribute) tag1.getChildren().get(3);
		Assert.assertTrue(att4.getName().equalsIgnoreCase("att4")); //$NON-NLS-1$
		JSPAction jspAction1 = (JSPAction) att4.getChildren().get(0);
		jspAction1.getName().equalsIgnoreCase("myprefix:myaction"); //$NON-NLS-1$
		((Attribute) jspAction1.getChildren().get(0)).getName()
				.equalsIgnoreCase("att1"); //$NON-NLS-1$
		((Attribute) jspAction1.getChildren().get(0)).getValue()
				.equalsIgnoreCase("value1"); //$NON-NLS-1$

		// Tag Fragment Test
		// <fragmentJSPAction:action isTagFragment="true"/>
		JSPAction jspAction2 = (JSPAction) tag1.getChildren().get(4);
		Assert.assertTrue(jspAction2.isIsTagFragment());
		Assert.assertTrue(jspAction2.getName().equalsIgnoreCase("fragmentJSPAction:action")); //$NON-NLS-1$
		Assert.assertTrue(((Attribute) jspAction2.getChildren().get(0))
				.getName().equalsIgnoreCase("isTagFragment")); //$NON-NLS-1$
		Assert.assertTrue(((Attribute) jspAction2.getChildren().get(0))
				.getValue().equalsIgnoreCase("true")); //$NON-NLS-1$

		// ###############################################################################################################
		// JSP Element test section
		// ###############################################################################################################

		// <JSPELEMENTSECTION>
		Element jspElementSection = (Element) elements.get(4);
		Assert.assertTrue(jspElementSection.getName().equalsIgnoreCase("JSPELEMENTSECTION")); //$NON-NLS-1$

		// <DIRECTIVE>
		// <%@ include nameInclude="valueInclude"%>
		// <jsp:directive.page filename="myFileName" />
		// </DIRECTIVE>
		Element directiveSection = (Element) jspElementSection.getChildren()
				.get(0);

		JSPDirective jspDir1 = (JSPDirective) directiveSection.getChildren()
				.get(0);
		Assert.assertTrue(jspDir1.getName().equalsIgnoreCase("include")); //$NON-NLS-1$
		Assert.assertTrue(((Attribute) jspDir1.getChildren().get(0)).getName()
				.equalsIgnoreCase("nameInclude")); //$NON-NLS-1$
		Assert.assertTrue(((Attribute) jspDir1.getChildren().get(0)).getValue()
				.equalsIgnoreCase("valueInclude")); //$NON-NLS-1$

		JSPDirective jspDir2 = (JSPDirective) directiveSection.getChildren()
				.get(1);
		Assert.assertTrue(jspDir2.getName().equalsIgnoreCase("page")); //$NON-NLS-1$
		Assert.assertTrue(((Attribute) jspDir2.getChildren().get(0)).getName()
				.equalsIgnoreCase("filename")); //$NON-NLS-1$
		Assert.assertTrue(((Attribute) jspDir2.getChildren().get(0)).getValue()
				.equalsIgnoreCase("myFileName")); //$NON-NLS-1$

		// <EXPRESSION>
		// <%= myVariable %>
		// <jsp:expression> myVariable </jsp:expression>
		// </EXPRESSION>
		Element expressionSection = (Element) jspElementSection.getChildren()
				.get(1);

		JSPExpression jspExpr1 = (JSPExpression) expressionSection
				.getChildren().get(0);
		Assert.assertTrue(((Text) jspExpr1.getChildren().get(0)).getName()
				.equalsIgnoreCase("myVariable")); //$NON-NLS-1$
		JSPExpression jspExpr2 = (JSPExpression) expressionSection
				.getChildren().get(1);
		Assert.assertTrue(((Text) jspExpr2.getChildren().get(0)).getName()
				.equalsIgnoreCase("myVariable")); //$NON-NLS-1$

		// <SCRIPLET>
		// <%This is a JSP Scriplet%>
		// <jsp:scriptlet>This is a JSP Scriplet</jsp:scriptlet>
		// </SCRIPLET>
		Element scripletSection = (Element) jspElementSection.getChildren()
				.get(2);

		JSPScriptlet jspScriplet1 = (JSPScriptlet) scripletSection
				.getChildren().get(0);
		Assert.assertTrue(((Text) jspScriplet1.getChildren().get(0)).getName()
				.equalsIgnoreCase("This is a JSP Scriplet")); //$NON-NLS-1$

		JSPScriptlet jspScriplet2 = (JSPScriptlet) scripletSection
				.getChildren().get(1);
		Assert.assertTrue(((Text) jspScriplet2.getChildren().get(0)).getName()
				.equalsIgnoreCase("This is a JSP Scriplet")); //$NON-NLS-1$

		// <DECLARATION>
		// <%! int myVariable = 0; %>
		// <jsp:declaration> int myVariable = 0; </jsp:declaration>
		// </DECLARATION>
		Element declarationSection = (Element) jspElementSection.getChildren()
				.get(3);

		JSPDeclaration jspDecl1 = (JSPDeclaration) declarationSection
				.getChildren().get(0);
		Assert.assertTrue(((Text) jspDecl1.getChildren().get(0)).getName()
				.equalsIgnoreCase("int myVariable = 0;")); //$NON-NLS-1$

		JSPDeclaration jspDecl2 = (JSPDeclaration) declarationSection
				.getChildren().get(1);
		Assert.assertTrue(((Text) jspDecl2.getChildren().get(0)).getName()
				.equalsIgnoreCase("int myVariable = 0;")); //$NON-NLS-1$

		// <COMMENT>
		// <%-- This is a JSP Comment --%>
		// </COMMENT>
		Element commentSection = (Element) jspElementSection.getChildren().get(
				4);

		JSPComment jspComment1 = (JSPComment) commentSection.getChildren().get(
				0);
		Assert.assertTrue(jspComment1.getName().equalsIgnoreCase("<%--This is a JSP Comment--%>")); //$NON-NLS-1$

		// </JSPELEMENTSECTION>

		// ###############################################################################################################
		// JSP ACTION test section
		// ###############################################################################################################
		Element jspActionSection = (Element) elements.get(5);
		Assert.assertTrue(jspActionSection.getName().equalsIgnoreCase("JSPACTIONSECTION")); //$NON-NLS-1$

		Element javaScriptSection = (Element) elements.get(6);
		Assert.assertTrue(javaScriptSection.getName().equalsIgnoreCase("JAVASCRIPTSECTION")); //$NON-NLS-1$
		// <script language="java">

		// Some JavaScript
		// </script>
	}
}
