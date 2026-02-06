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
package org.eclipse.modisco.java.generation.files;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.java.*;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.emf.util.JavaSwitch;
import org.eclipse.modisco.java.generation.utils.IndentingStringBuilder;

/**
 * @since 1.6
 */
@SuppressWarnings("nls")
public class JavaModel2JavaTextUtils extends JavaSwitch<Object>
{
	private IndentingStringBuilder indentingStringBuilder = null;
	private Map<String, String> file2text = new HashMap<>();

	protected void append(boolean value) {
		append(Boolean.toString(value));
	}

	protected void append(String string) {
		indentingStringBuilder.append(string);
	}

	protected void appendBodyDeclarations(List<BodyDeclaration> bodyDeclarations) {
		if (!bodyDeclarations.isEmpty()) {
			boolean gotOne = false;
			for (BodyDeclaration jBodyDeclaration : bodyDeclarations) {
				if (!jBodyDeclaration.isProxy()) {
					if (!gotOne) {
						gotOne = true;
						pushIndentation();
						appendSoftNewLine();			// Prefix
					}
					else {
						append("\n");			// Separator maybe post-Suffix
					}
					appendNode(jBodyDeclaration);
					appendSoftNewLine();				// Suffix maybe pre-Separator
				}
			}
			if (gotOne) {
				popIndentation();
			}
		}
	}
	
	protected void appendBrackets(int d) {
		if (d == 1) {
			append("[]");
		}
		if (d > 1) {
			for (int i = 1; i <= d; i++) {
				append("[]");
			}
		}
	}

	protected void appendEndLine() {
		indentingStringBuilder.appendEndLine();
	}

	protected void appendJavaKeyword(AbstractTypeDeclaration jAbstractTypeDeclaration) {
		if (jAbstractTypeDeclaration instanceof ClassDeclaration) {
			append("class");
		}
		else if (jAbstractTypeDeclaration instanceof InterfaceDeclaration) {
			append("interface");
		}
		else if (jAbstractTypeDeclaration instanceof EnumDeclaration) {
			append("enum");
		}
		else if (jAbstractTypeDeclaration instanceof AnnotationTypeDeclaration) {
			append("@interface");
		}
		else {
			append("Missing javaKeyword " + jAbstractTypeDeclaration.eClass().getName() + "\n");
		}
	}

	protected void appendMethodHeader(AbstractMethodInvocation jAbstractMethodInvocation) {
		appendWrappedNodes(null, jAbstractMethodInvocation.getTypeArguments(), ", ", null);
		append(jAbstractMethodInvocation.getMethod().getName());
		appendWrappedNodes("(", jAbstractMethodInvocation.getArguments(), ", ", ")");
	}

	protected void appendModifier(Modifier modifier) {
		if (modifier != null) {
			appendNode(modifier);
		}
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
		int classifierID = eClass.getClassifierID();
		doSwitch(classifierID, jNode);				// TODO short cut eases debug single stepping
	//	doSwitch(jNode);
		if (eClassName2coverage != null) {
			String eClassName = eClass.getName();
			eClassName2coverage.put(eClassName, eClassName2coverage.getOrDefault(eClassName, 0).intValue()+1);
		}
		return true;
	}

	protected void appendNodes(List<? extends ASTNode> jNodes) {
		for (ASTNode jNode : jNodes) {
			appendNode(jNode);
		}
	}

	protected void appendOptionalWrappedNodes(String prefix, List<? extends ASTNode> jNodes, String separator, String suffix) {
		if (jNodes.size() > 0) {
			appendWrappedNodes(prefix, jNodes, separator, suffix);
		}
	}

	protected void appendQualifiedName(NamedElement jNamedElement) {
		if (jNamedElement instanceof AbstractTypeDeclaration) {			// XXX there are two AbstractTypeDeclaration classes
			AbstractTypeDeclaration jAbstractTypeDeclaration = (AbstractTypeDeclaration)jNamedElement;
			if (jAbstractTypeDeclaration.getPackage() != null) {
				appendQualifiedName(jAbstractTypeDeclaration.getPackage());
				append(".");
			}	
			if (jAbstractTypeDeclaration.getAbstractTypeDeclaration() != null) {
				appendQualifiedName(jAbstractTypeDeclaration.getAbstractTypeDeclaration());
				append(".");
			}	
		}
		else if (jNamedElement instanceof BodyDeclaration) {			// XXX occluded by AbstractTypeDeclaration
			BodyDeclaration jBodyDeclaration = (BodyDeclaration)jNamedElement;
			if (jBodyDeclaration.getAbstractTypeDeclaration() != null) {
				appendQualifiedName(jBodyDeclaration.getAbstractTypeDeclaration());
				append(".");
			}	
		}
		else if (jNamedElement instanceof VariableDeclarationFragment) {			// XXX occluded by AbstractTypeDeclaration
			VariableDeclarationFragment jVariableDeclarationFragment = (VariableDeclarationFragment)jNamedElement;
			AbstractVariablesContainer jVariablesContainer = jVariableDeclarationFragment.getVariablesContainer();
			if (jVariablesContainer instanceof FieldDeclaration) {
				FieldDeclaration jFieldDeclaration = (FieldDeclaration)jVariablesContainer;
				if (jFieldDeclaration.getAbstractTypeDeclaration() != null) {
					appendQualifiedName(jFieldDeclaration.getAbstractTypeDeclaration());
					append(".");
				}	
			}	
		}
		else if (jNamedElement instanceof CompilationUnit) {
			CompilationUnit jCompilationUnit = (CompilationUnit)jNamedElement;
			if (jCompilationUnit.getPackage() != null) {
				appendQualifiedName(jCompilationUnit.getPackage());
				append(".");
			}
		}
		else if (jNamedElement instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package)jNamedElement;
			if (jPackage.getPackage() != null) {
				appendQualifiedName(jPackage.getPackage());
				append(".");
			}
		}
		append(jNamedElement.getName());
	}

	protected void appendSoftNewLine() {
		indentingStringBuilder.appendSoftNewLine();
	}

	protected void appendSoftSpace() {
		indentingStringBuilder.appendSoftSpace();
	}
	
	protected void appendTypeHeader(TypeDeclaration jTypeDeclaration) {
		appendNodes(jTypeDeclaration.getAnnotations());
		appendNode(jTypeDeclaration.getModifier());
		appendJavaKeyword(jTypeDeclaration);
		append(" ");
		append(jTypeDeclaration.getName());
		appendOptionalWrappedNodes("<", jTypeDeclaration.getTypeParameters(), ", ", ">");
	}

	/**
	 * If jNode non-null, append the text appropriate for jNode returning true, else retutn false.
	 * If prefix is non-null it prefixes the text, likewise a non-null suffix suffixes.
	 */
	protected boolean appendWrappedNode(String prefix, ASTNode jNode, String suffix) {
		if (jNode == null) {
			return false;
		}
		append(prefix);
		appendNode(jNode);
		append(suffix);
		return true;
	}

	protected void appendWrappedNodes(String prefix, List<? extends ASTNode> jNodes, String separator, String suffix) {
		append(prefix);
		String nextSeparator = null;
		for (ASTNode jNode : jNodes) {
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
			appendNode((ASTNode) eChild);
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

	protected String getQualifiedPath(StringBuilder s, NamedElement jNamedElement) {
		if (jNamedElement instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package)jNamedElement;
			if (jPackage.getPackage() != null) {
				getQualifiedPath(s, jPackage.getPackage());
				s.append("/");
			}
		}
		else if (jNamedElement instanceof CompilationUnit) {
			CompilationUnit jCompilationUnit = (CompilationUnit)jNamedElement;
			if (jCompilationUnit.getPackage() != null) {
				getQualifiedPath(s, jCompilationUnit.getPackage());
				s.append("/");
			}
		}
		s.append(jNamedElement.getName());
		return s.toString();
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

	/**
	 * Manage comments before the element.
	 */
	public void wc(ASTNode jNode) {
		for (Comment jComment : jNode.getComments()) {
			if (jComment.isPrefixOfParent()) {
				appendNode(jComment);
			}
		}
	}
	
	/**
	 * Manage comments after the element.
	 */
	public void wca(ASTNode jNode) {
		for (Comment jComment : jNode.getComments()) {
			if (!jComment.isEnclosedByParent() && !jComment.isPrefixOfParent()) {
			//	append("\n");
				appendNode(jComment);
			}
		}
	}
	
	/**
	 * Manage comments inside the element, specially for element that have a "body".
	 */
	public void wci(ASTNode jNode) {
		boolean hasCommentInside = false;
		for (Comment jComment : jNode.getComments()) {
			if (jComment.isEnclosedByParent()) {
			//	append("\n");
				appendNode(jComment);
				hasCommentInside = true;
			}
		}
		if (hasCommentInside) {
			append("\n");
		}
	}

	@Override
	public String toString() {
		return indentingStringBuilder.toString();
	}
}