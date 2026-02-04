package org.eclipse.modisco.java.generation.tests.utils;

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

public class JavaModel2JavaTextUtils extends JavaSwitch<Object>
{
	protected final Stack<StringBuilder> files = new Stack<>();
	protected final Stack<String> indentation = new Stack<>();
	private StringBuilder s = null;
	private char lastChar = 0;
	private boolean indentationPending = false;
	private Map<String, String> file2text = new HashMap<>();
	
	protected JavaModel2JavaTextUtils() {
		indentation.push("");
	//	files.push(s = new StringBuilder());
	}

	protected void append(boolean value) {
		append(Boolean.toString(value));
	}

	protected void append(String string) {
		if (string != null) {
			for (int i = 0; i < string.length(); i++) {
				char ch = string.charAt(i);
				if (ch == '\n') {
					if (indentationPending) {
						s.append("\n");
					}
					lastChar = ch;
					indentationPending = true;
				}
				else if (ch != '\r') {
					if (indentationPending) {
						s.append("\n");
						s.append(indentation.peek());
						indentationPending = false;
					}
					s.append(ch);
					lastChar = ch;
				}
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
		if ((lastChar >= 0) && (lastChar != '\n')) {
			append("\n");
		}
	}

	protected void appendSoftSpace() {
		if ((lastChar >= 0) && (lastChar != ' ') && (lastChar != '\n')) {
			append(" ");
		}
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

	public Map<String, String> generate(Iterable<Resource> resources) {
		for (Resource resource : resources) {
			for (EObject eObject : resource.getContents()) {
				appendNode(eObject);
			}
		}
	//	StringBuilder s = files.pop();
		assert files.isEmpty();
	//	if (s.length() > 0) {
	//		file2text.put(null,  s.toString());
	//	}
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

	protected void popFile(String fileKey) {
		assert files.size() == 1;
		assert indentation.size() == 1;
		file2text.put(fileKey, files.pop().toString());
		s = null;
	}

	protected void popIndentation() {
		indentation.pop();
	}

	protected void pushFile() {
		assert files.size() == 0;
		files.push(s = new StringBuilder());
		indentationPending = false;
		lastChar = 0;
	}

	protected void pushIndentation() {
		indentation.push(indentation.peek() + "\t");
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

	@Override
	public String toString() {
		return s.toString();
	}
}