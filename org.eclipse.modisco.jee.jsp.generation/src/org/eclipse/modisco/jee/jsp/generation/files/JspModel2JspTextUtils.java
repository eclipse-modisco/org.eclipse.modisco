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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.java.*;
import org.eclipse.modisco.java.generation.utils.IndentingStringBuilder;
import org.eclipse.modisco.jee.jsp.JspPackage;
import org.eclipse.modisco.jee.jsp.util.JspSwitch;
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
import org.eclipse.modisco.xml.emf.MoDiscoXMLPackage;
import org.eclipse.modisco.xml.emf.util.MoDiscoXMLSwitch;

/**
 * @since 1.6
 */
@SuppressWarnings("nls")
public class JspModel2JspTextUtils extends JspSwitch<Object>
{
	public final class DelegatingXMLSwitch extends MoDiscoXMLSwitch
	{
		@Override
		public Object caseAttribute(Attribute object) {
			return JspModel2JspTextUtils.this.caseXmlAttribute(object);
		}

		@Override
		public Object caseCDATA(CDATA object) {
			return JspModel2JspTextUtils.this.caseXmlCDATA(object);
		}

		@Override
		public Object caseElement(Element object) {
			return JspModel2JspTextUtils.this.caseXmlElement(object);
		}

		@Override
		public Object caseComment(Comment object) {
			return JspModel2JspTextUtils.this.caseXmlComment(object);
		}

		@Override
		public Object caseDocumentTypeDeclaration(DocumentTypeDeclaration object) {
			return JspModel2JspTextUtils.this.caseXmlDocumentTypeDeclaration(object);
		}

		@Override
		public Object caseNamespace(Namespace object) {
			return JspModel2JspTextUtils.this.caseXmlNamespace(object);
		}

		@Override
		public Object caseNode(Node object) {
			return JspModel2JspTextUtils.this.caseXmlNode(object);
		}

		@Override
		public Object caseProcessingInstruction(ProcessingInstruction object) {
			return JspModel2JspTextUtils.this.caseXmlProcessingInstruction(object);
		}

		@Override
		public Object caseRoot(Root object) {
			return JspModel2JspTextUtils.this.caseXmlRoot(object);
		}

		@Override
		public Object caseText(Text object) {
			return JspModel2JspTextUtils.this.caseXmlText(object);
		}

		@Override
		public Object defaultCase(EObject object) {
			return JspModel2JspTextUtils.this.defaultCase(object);
		}

		@Override
		public Object doSwitch(int classifierID, EObject theEObject) {
			return super.doSwitch(classifierID, theEObject);
		}
	}

	private DelegatingXMLSwitch xmlSwitch = new DelegatingXMLSwitch();
	private IndentingStringBuilder indentingStringBuilder = null;
	private Map<String, String> file2text = new HashMap<>();

	protected void append(boolean value) {
		append(Boolean.toString(value));
	}

	protected void append(String string) {
		indentingStringBuilder.append(string);
	}

	protected void appendEndLine() {
		indentingStringBuilder.appendEndLine();
	}
	
	public static Map<String, Integer> eClassName2coverage = null;			// Assign a Map to a ctivate coverage instrumentation

	/**
	 * If jNode non-null, append the text appropriate for jNode returning true,else retutn false.
	 */
	protected boolean appendNode(EObject jNode) {
		if (jNode == null) {
			return false;
		}
		EClass eClass = jNode.eClass();
		EObject eContainer = eClass.eContainer();
		if (eContainer == JspPackage.eINSTANCE) {
			int classifierID = eClass.getClassifierID();
			doSwitch(classifierID, jNode);				// TODO short cut eases debug single stepping
		}
		else if (eContainer == MoDiscoXMLPackage.eINSTANCE) {
			int classifierID = eClass.getClassifierID();
			xmlSwitch.doSwitch(classifierID, jNode);
		}
		else {
			doSwitch(eClass, jNode);
		}
		if (eClassName2coverage != null) {
			String eClassName = eClass.getName();
			eClassName2coverage.put(eClassName, eClassName2coverage.getOrDefault(eClassName, 0).intValue()+1);
		}
		return true;
	}

	protected void appendNodes(List<? extends EObject> jNodes) {
		for (EObject jNode : jNodes) {
			appendNode(jNode);
		}
	}

	protected void appendOptionalWrappedNodes(String prefix, List<? extends EObject> jNodes, String separator, String suffix) {
		if (jNodes.size() > 0) {
			appendWrappedNodes(prefix, jNodes, separator, suffix);
		}
	}

	protected void appendRaw(String string) {
		indentingStringBuilder.appendRaw(string);
	}

	protected void appendSoftNewLine() {
		indentingStringBuilder.appendSoftNewLine();
	}

	protected void appendSoftSpace() {
		indentingStringBuilder.appendSoftSpace();
	}

	/**
	 * If jNode non-null, append the text appropriate for jNode returning true, else retutn false.
	 * If prefix is non-null it prefixes the text, likewise a non-null suffix suffixes.
	 */
	protected boolean appendWrappedNode(String prefix, EObject jNode, String suffix) {
		if (jNode == null) {
			return false;
		}
		append(prefix);
		appendNode(jNode);
		append(suffix);
		return true;
	}

	protected void appendWrappedNodes(String prefix, List<? extends EObject> jNodes, String separator, String suffix) {
		append(prefix);
		String nextSeparator = null;
		for (EObject jNode : jNodes) {
			append(nextSeparator);
			appendNode(jNode);
			nextSeparator = separator;
		}
		append(suffix);
	}

	protected void doChildren(EObject jObject, boolean withIndentation) {
		if (withIndentation) {
			pushIndentation();
		}
		for (EObject eChild : jObject.eContents()) {
			appendNode((Node) eChild);
		}
		if (withIndentation) {
			popIndentation();
		}
	}

	public Map<String, String> generate(Iterable<Resource> resources) {
		for (Resource resource : resources) {
			for (EObject eObject : resource.getContents()) {
				appendNode(eObject);
			}
		}
		return file2text;
	}

	public void popFile(String fileKey) {
		indentingStringBuilder.close();
		file2text.put(fileKey, indentingStringBuilder.toString());
		indentingStringBuilder = null;
	}

	protected void popIndentation() {
		indentingStringBuilder.popIndentation();
	}

	public void pushFile() {
		assert indentingStringBuilder == null;
		indentingStringBuilder = new IndentingStringBuilder();
	}

	protected void pushIndentation() {
		indentingStringBuilder.pushIndentation();
	}

	@Override
	public String toString() {
		return indentingStringBuilder.toString();
	}

	public Object caseXmlAttribute(Attribute object) {
		return null;
	}

	public Object caseXmlCDATA(CDATA object) {
		return null;
	}

	public Object caseXmlElement(Element object) {
		return null;
	}

	public Object caseXmlComment(Comment object) {
		return null;
	}

	public Object caseXmlDocumentTypeDeclaration(DocumentTypeDeclaration object) {
		return null;
	}

	public Object caseXmlNamespace(Namespace object) {
		return null;
	}

	public Object caseXmlNode(Node object) {
		return null;
	}

	public Object caseXmlProcessingInstruction(ProcessingInstruction object) {
		return null;
	}

	public Object caseXmlRoot(Root object) {
		return null;
	}

	public Object caseXmlText(Text object) {
		return null;
	}
}