/**
 * Copyright (c) 2026 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 */
package org.eclipse.modisco.jee.jsp.generation.files;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.java.*;
import org.eclipse.modisco.jee.jsp.ComposedAttribute;
import org.eclipse.modisco.jee.jsp.JSPAction;
import org.eclipse.modisco.jee.jsp.JSPComment;
import org.eclipse.modisco.jee.jsp.JSPDeclaration;
import org.eclipse.modisco.jee.jsp.JSPDirective;
import org.eclipse.modisco.jee.jsp.JSPExpression;
import org.eclipse.modisco.jee.jsp.JSPScript;
import org.eclipse.modisco.jee.jsp.JSPScriptlet;
import org.eclipse.modisco.jee.jsp.JSPStdAction;
import org.eclipse.modisco.jee.jsp.JSPTagLib;
import org.eclipse.modisco.jee.jsp.JavaScript;
import org.eclipse.modisco.jee.jsp.Model;
import org.eclipse.modisco.jee.jsp.Page;
import org.eclipse.modisco.xml.Attribute;
import org.eclipse.modisco.xml.CDATA;
import org.eclipse.modisco.xml.Comment;
import org.eclipse.modisco.xml.DocumentTypeDeclaration;
import org.eclipse.modisco.xml.Element;
import org.eclipse.modisco.xml.Namespace;
import org.eclipse.modisco.xml.Node;
import org.eclipse.modisco.xml.ProcessingInstruction;
import org.eclipse.modisco.xml.Root;
import org.eclipse.modisco.xml.Text;

/**
 * @since 1.6
 */
@SuppressWarnings("nls")
public class JspModel2JspTextSwitch extends JspModel2JspTextUtils
{
	protected final String absoluteOutputPath;
	
	public JspModel2JspTextSwitch(String absoluteOutputPath) {
		this.absoluteOutputPath = absoluteOutputPath;
	}

	@Override
	public Object caseComposedAttribute(ComposedAttribute jComposedAttribute) {
		append(jComposedAttribute.getName());
		append("=");
		appendNodes(jComposedAttribute.getChildren());
		return this;
	}

	@Override
	public Object caseElement(Element object) {
		// TODO Auto-generated method stub
		return super.caseElement(object);
	}

	@Override
	public Object caseJSPAction(JSPAction jspAction) {
		String name = jspAction.getName();
		List<Node> children = jspAction.getChildren();
		List<EObject> attributes = new ArrayList<>();
		List<EObject> elements = new ArrayList<>();
		for (EObject eObject : children) {
			if ((eObject instanceof Attribute) || (eObject instanceof ComposedAttribute)) {
				attributes.add(eObject);
			}
			else {
				elements.add(eObject);
			}
		}
		if (elements.size() > 0) {
			append("<");
			append(name);
			appendOptionalWrappedNodes(" ", attributes, " ", null);
			append(">\n");
			pushIndentation();
			appendNodes(elements);
			popIndentation();
			append("</");
			append(name);
			append(">\n");
		}
		else {
			append("<");
			append(name);
			appendOptionalWrappedNodes(" ", attributes, " ", null);
			append("/>\n");
		}
		append("\n");
	//	appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseJSPComment(JSPComment jspComment) {
		append(jspComment.getName());
		appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseJSPDeclaration(JSPDeclaration jspDeclaration) {
		append("<%! ");
		appendWrappedNodes(null, jspDeclaration.getChildren(), " ", null);
		append(" %>");
		appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseJSPDirective(JSPDirective jspDirective) {
		append("<%@ ");
		append(jspDirective.getName());
		for (EObject eObject : jspDirective.getChildren()) {
			if ((eObject instanceof ComposedAttribute) || (eObject instanceof Attribute)) {
				appendWrappedNode(" ", eObject, null);
			}
		}
		append("%>");
		appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseJSPExpression(JSPExpression jspExpression) {
		append("<%=");
		append(jspExpression.getName());
		append("%>");
		return this;
	}

	@Override
	public Object caseJSPScript(JSPScript object) {			// Should be overridden
		return errorCase(object);
	}

	@Override
	public Object caseJSPScriptlet(JSPScriptlet jspScriptlet) {
		append("<% ");
		append(jspScriptlet.getName());
		append(" %>");
		appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseJSPStdAction(JSPStdAction jspStdAction) {
		List<Node> children = jspStdAction.getChildren();
		List<EObject> attributes = new ArrayList<>();
		List<EObject> elements = new ArrayList<>();
		for (EObject eObject : children) {
			if ((eObject instanceof Attribute) || (eObject instanceof ComposedAttribute)) {
				attributes.add(eObject);
			}
			else {
				elements.add(eObject);
			}
		}
		if (elements.size() > 0) {
			append("<");
			append(jspStdAction.getName());
			appendOptionalWrappedNodes(" ", attributes, " ", null);
			append(">\n");
			pushIndentation();
			appendNodes(elements);
			popIndentation();
			append("</");
			append(jspStdAction.getName());
			append(">\n");
		}
		else {
			append("<");
			append(jspStdAction.getName());
			appendOptionalWrappedNodes(" ", attributes, " ", null);
			append("/>\n");
		}
		append("\n");
	//	appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseJSPTagLib(JSPTagLib object) {
		// TODO Auto-generated method stub
		return super.caseJSPTagLib(object);
	}

	@Override
	public Object caseJavaScript(JavaScript jJavaScript) {
		append("<script ");
		append(jJavaScript.getName());
		append(" >\n");
		for (EObject eObject : jJavaScript.getChildren()) {
			if (!(eObject instanceof Attribute) && ! (eObject instanceof ComposedAttribute)) {
				appendNode(eObject);
				appendSoftNewLine();
			}
		}
		append("</script>\n");
		appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseModel(Model jModel) {
		appendNodes(jModel.getPages());
		return this;
	}

	@Override
	public Object caseNode(Node jNode) {		// Should be overridden
		return errorCase(jNode);
	}

	@Override
	public Object casePage(Page jPage) {
		String name = jPage.getName();
		StringBuilder sFile = new StringBuilder();
		sFile.append(absoluteOutputPath);
		if (!name.startsWith("/")) {
			sFile.append("/");
		}
		sFile.append(name);
		String fileKey = sFile.toString();
		pushFile();
		String xmlDeclaration = jPage.getXmlDeclaration();
		if ((xmlDeclaration != null) && (xmlDeclaration.length() > 0)) {
			append(xmlDeclaration);
			append("\n");
		}
		String doctype = jPage.getDoctype();
		if ((doctype != null) && (doctype.length() > 0)) {
			appendRaw(doctype);
			append("\n");
		}
		for (EObject eObject : jPage.getOwnedElements()) {
			appendNode(eObject);
			appendSoftNewLine();
		}
		popFile(fileKey);
		return this;
	}

	@Override
	public Object caseXmlAttribute(Attribute xmlAttribute) {
		append(xmlAttribute.getName());
		append("=\"");
		append(xmlAttribute.getValue());
		append("\"");
		return this;
	}

	@Override
	public Object caseXmlCDATA(CDATA object) {
		// TODO Auto-generated method stub
		return super.caseXmlCDATA(object);
	}

	@Override
	public Object caseXmlComment(Comment xmlComment) {
		append(xmlComment.getName());
		return this;
	}

	@Override
	public Object caseXmlDocumentTypeDeclaration(DocumentTypeDeclaration object) {
		// TODO Auto-generated method stub
		return super.caseXmlDocumentTypeDeclaration(object);
	}

	@Override
	public Object caseXmlElement(Element xmlElement) {
		String name = xmlElement.getName();
		List<Node> children = xmlElement.getChildren();
		List<EObject> attributes = new ArrayList<>();
		List<EObject> elements = new ArrayList<>();
		for (EObject eObject : children) {
			if ((eObject instanceof Attribute) || (eObject instanceof ComposedAttribute)) {
				attributes.add(eObject);
			}
			else {
				elements.add(eObject);
			}
		}
		if (elements.size() > 0) {
			append("<");
			append(name);
			appendOptionalWrappedNodes(" ", attributes, " ", null);
			append(">");
		//	pushIndentation();
			appendNodes(elements);
		//	popIndentation();
			append("</");
			append(name);
			append(">");
		}
		else {
			append("<");
			append(name);
			appendOptionalWrappedNodes(" ", attributes, " ", null);
			append("/>");
		}
	//	appendSoftNewLine();
		return this;
	}

/*[template public write(o : xml::Element)]
  [if (o.children->size() - o.children->select(n | n.oclIsKindOf(xml::Attribute))->size() - o.children->select(n | n.oclIsKindOf(jsp::ComposedAttribute))->size() > 0)]
    <[o.name/][for (n : xml::Node | o.children)][if (n.oclIsKindOf(jsp::ComposedAttribute) or n.oclIsKindOf(xml::Attribute))] [n.write()/][/if][if (n.oclIsKindOf(jsp::JSPScript))][if (n.oclAsType(jsp::JSPScript).isTagFragment = true)][n.write()/][/if][/if][if (n.oclIsKindOf(jsp::JSPAction))][if (n.oclAsType(jsp::JSPAction).isTagFragment = true)][n.write()/][/if][/if][/for]>
    [for (c : xml::Node | o.children)]
      [if (c.oclIsKindOf(jsp::JSPScript))]
        [if (c.oclAsType(jsp::JSPScript).isTagFragment = false)]
          	[c.write()/]
        [/if]
      [elseif (c.oclIsKindOf(jsp::JSPAction))]
        [if (c.oclAsType(jsp::JSPAction).isTagFragment = false)]
          	[c.write()/]
        [/if]
      [elseif (not c.oclIsKindOf(jsp::ComposedAttribute) and not c.oclIsTypeOf(xml::Attribute))]
        	[c.write()/]
      [/if]
    [/for]
    </[o.name/]>
  [else]	<[o.name/][for (n : xml::Node | o.children)][if (n.oclIsKindOf(jsp::ComposedAttribute) or n.oclIsKindOf(xml::Attribute))] [n.write()/][/if][if (n.oclIsKindOf(jsp::JSPScript))][if (n.oclAsType(jsp::JSPScript).isTagFragment = true)][n.write()/][/if][/if][if (n.oclIsKindOf(jsp::JSPAction))][if (n.oclAsType(jsp::JSPAction).isTagFragment = true)][n.write()/][/if][/if][/for] />[/if][/template]
*/
	@Override
	public Object caseXmlNamespace(Namespace object) {
		// TODO Auto-generated method stub
		return super.caseXmlNamespace(object);
	}

	@Override
	public Object caseXmlNode(Node object) {
		// TODO Auto-generated method stub
		return super.caseXmlNode(object);
	}

	@Override
	public Object caseXmlProcessingInstruction(ProcessingInstruction object) {
		// TODO Auto-generated method stub
		return super.caseXmlProcessingInstruction(object);
	}

	@Override
	public Object caseXmlRoot(Root object) {
		// TODO Auto-generated method stub
		return super.caseXmlRoot(object);
	}

	@Override
	public Object caseXmlText(Text xmlText) {
		String name = xmlText.getName();
		if (!name.equalsIgnoreCase("\n") && !name.equalsIgnoreCase(" ") && !name.equalsIgnoreCase("\t") && !name.equalsIgnoreCase("\r")) {
			appendRaw(name);
		}
		return this;
	}

	@Override
	public Object defaultCase(EObject eObject) {
		System.err.println("Missing case" + eObject.eClass().getName());			// XXX
		append("Missing case" + eObject.eClass().getName() + "\n");
		doChildren(eObject, true);
		return null;
	}

	public Object errorCase(EObject eObject) {
		System.err.println("Missing override case" + eObject.eClass().getName());			// XXX
		append("Missing override case" + eObject.eClass().getName() + "\n");
		doChildren(eObject, true);
		return null;
	}
}