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

import java.util.List;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.java.*;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.emf.util.JavaSwitch;

/**
 * @since 1.6
 */
@SuppressWarnings("nls")
public class JavaModel2JavaTextSwitch extends JavaModel2JavaTextUtils
{
	protected final String absoluteOutputPath;
	
	public JavaModel2JavaTextSwitch(String absoluteOutputPath) {
		this.absoluteOutputPath = absoluteOutputPath;
	}

	@Override
	public Object caseASTNode(ASTNode jASTNode) {		// Should be overridden
		return errorCase(jASTNode);
	}

	@Override
	public Object caseAbstractMethodDeclaration(AbstractMethodDeclaration jAbstractMethodDeclaration) {
		wc(jAbstractMethodDeclaration);
		appendNodes(jAbstractMethodDeclaration.getAnnotations()) ;
		appendModifier(jAbstractMethodDeclaration.getModifier());
		appendOptionalWrappedNodes("<", jAbstractMethodDeclaration.getTypeParameters(), ", ", "> ");
		if (jAbstractMethodDeclaration instanceof MethodDeclaration) {
			TypeAccess returnType = ((MethodDeclaration)jAbstractMethodDeclaration).getReturnType();
			if (returnType != null) {
				appendNode(returnType);
			}
			else {
				append("void");
			}
			append(" ");
		}
		append(jAbstractMethodDeclaration.getName());
		appendWrappedNodes("(", jAbstractMethodDeclaration.getParameters(), ", ", ")");
		appendOptionalWrappedNodes(" throws ", jAbstractMethodDeclaration.getThrownExceptions(), ",", null);
		if (jAbstractMethodDeclaration.getBody() != null) {
			appendNode(jAbstractMethodDeclaration.getBody());
		}
		else {
			append(";");
		}
		wca(jAbstractMethodDeclaration);
		appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseAbstractMethodInvocation(AbstractMethodInvocation jAbstractMethodInvocation) {		// Should be overridden
		return errorCase(jAbstractMethodInvocation);
	}

	@Override
	public Object caseAbstractTypeDeclaration(AbstractTypeDeclaration jAbstractTypeDeclaration) {		// Should be overridden
		return errorCase(jAbstractTypeDeclaration);
	}

	@Override
	public Object caseAbstractTypeQualifiedExpression(AbstractTypeQualifiedExpression jAbstractTypeQualifiedExpression) {		// Should be overridden
		return errorCase(jAbstractTypeQualifiedExpression);
	}


	@Override
	public Object caseAbstractVariablesContainer(AbstractVariablesContainer jAbstractVariablesContainer) {		// Should be overridden
		return errorCase(jAbstractVariablesContainer);
	}

	@Override
	public Object caseAnnotation(Annotation jAnnotation) {
		wc(jAnnotation);
		append("@");
		appendNode(jAnnotation.getType());
		appendOptionalWrappedNodes("(", jAnnotation.getValues(), ", ", ")");
		wca(jAnnotation);
		append("\n");
		return this;
	}

	@Override
	public Object caseAnnotationMemberValuePair(AnnotationMemberValuePair jAnnotationMemberValuePair) {
		wc(jAnnotationMemberValuePair);
		AnnotationTypeMemberDeclaration jMember = jAnnotationMemberValuePair.getMember();
		if (jMember != null) {
			append(jMember.getName());
			append(" = ");
		}
		appendNode(jAnnotationMemberValuePair.getValue());
		wca(jAnnotationMemberValuePair);
		return this;
	}

	@Override
	public Object caseAnnotationTypeDeclaration(AnnotationTypeDeclaration jAnnotationTypeDeclaration) {
		wc(jAnnotationTypeDeclaration);
		appendNodes(jAnnotationTypeDeclaration.getAnnotations());
		appendModifier(jAnnotationTypeDeclaration.getModifier());
		appendJavaKeyword(jAnnotationTypeDeclaration);
		append(" ");
		append(jAnnotationTypeDeclaration.getName());
		append(" {");
		pushIndentation();
		append("\n");
		for (BodyDeclaration jBodyDeclaration : jAnnotationTypeDeclaration.getBodyDeclarations()) {
			if (!jBodyDeclaration.isProxy()) {
				appendNode(jBodyDeclaration);			// an implicit constructor may exist as proxy
			}
		}
		wci(jAnnotationTypeDeclaration);
		popIndentation();
		append("}");
		wca(jAnnotationTypeDeclaration);
		return this;
	}

	@Override
	public Object caseAnnotationTypeMemberDeclaration(AnnotationTypeMemberDeclaration jAnnotationTypeMemberDeclaration) {
		wc(jAnnotationTypeMemberDeclaration);
		appendNodes(jAnnotationTypeMemberDeclaration.getAnnotations());
		appendModifier(jAnnotationTypeMemberDeclaration.getModifier());
		appendWrappedNode(null, jAnnotationTypeMemberDeclaration.getType(), " ");
		append(jAnnotationTypeMemberDeclaration.getName());
		append("()");
		appendWrappedNode(" default ", jAnnotationTypeMemberDeclaration.getDefault(), null);
		append(";");
		appendSoftNewLine();
		wca(jAnnotationTypeMemberDeclaration);
		return this;
	}

	@Override
	public Object caseAnonymousClassDeclaration(AnonymousClassDeclaration jAnonymousClassDeclaration) {
		wc(jAnonymousClassDeclaration);
		appendSoftSpace();
		append("{");
		pushIndentation();
		append("\n");
		for (BodyDeclaration jBodyDeclaration : jAnonymousClassDeclaration.getBodyDeclarations()) {
			if (!jBodyDeclaration.isProxy()) {
				appendNode(jBodyDeclaration);			// an implicit constructor may exist as proxy
			}
		}
		wci(jAnonymousClassDeclaration);
		popIndentation();
		append("}");
		wca(jAnonymousClassDeclaration);
		return this;
	}

	@Override
	public Object caseArchive(Archive jArchive) {
		return errorCase(jArchive);					// should never be called
	}

	@Override
	public Object caseArrayAccess(ArrayAccess jArrayAccess) {
		wc(jArrayAccess);
		appendNode(jArrayAccess.getArray());
		appendWrappedNode("[", jArrayAccess.getIndex(), "]");
		wca(jArrayAccess);
		return this;
	}

	@Override
	public Object caseArrayCreation(ArrayCreation jArrayCreation) {
		wc(jArrayCreation);
		append("new ");
		ArrayType jArrayType = (ArrayType)jArrayCreation.getType().getType();
		appendNode(jArrayType.getElementType());
		int size = jArrayCreation.getDimensions().size();
		if (size > 0) {
			appendWrappedNodes("[", jArrayCreation.getDimensions(), "][", "]");
		}
		appendBrackets(jArrayType.getDimensions() - size); // example of result : (3)(2)()()
		appendNode(jArrayCreation.getInitializer());
		wca(jArrayCreation);
		return this;
	}

	@Override
	public Object caseArrayInitializer(ArrayInitializer jArrayInitializer) {
		wc(jArrayInitializer);
		appendWrappedNodes("{ ", jArrayInitializer.getExpressions(), ", ", " }");
		wca(jArrayInitializer);
		return this;
	}

	@Override
	public Object caseArrayLengthAccess(ArrayLengthAccess jArrayLengthAccess) {
		wc(jArrayLengthAccess);
		appendNode(jArrayLengthAccess.getArray());
		append(".length");
		wca(jArrayLengthAccess);
		return this;
	}

	@Override
	public Object caseArrayType(ArrayType jArrayType) {
		wc(jArrayType);
		appendNode(jArrayType.getElementType());
		appendBrackets(jArrayType.getDimensions());
		wca(jArrayType);
		return this;
	}

	@Override
	public Object caseAssertStatement(AssertStatement jAssertStatement) {
		wc(jAssertStatement);
		append("assert ");
		appendNode(jAssertStatement.getExpression());
		appendWrappedNode(" : ", jAssertStatement.getMessage(), null);
		append(";");
		appendSoftNewLine();
		wca(jAssertStatement);
		return this;
	}

	@Override
	public Object caseAssignment(Assignment jAssignment) {
		wc(jAssignment);
		appendNode(jAssignment.getLeftHandSide());
		appendSoftSpace();
		append(jAssignment.getOperator().toString());
		appendSoftSpace();
		appendNode(jAssignment.getRightHandSide());
		wca(jAssignment);
		return this;
	}

	@Override
	public Object caseBlock(Block jBlock) {
		wc(jBlock);
		appendSoftSpace();
		append("{\n");
		pushIndentation();
		appendWrappedNodes(null, jBlock.getStatements(), "\n", null);
		wci(jBlock);
		popIndentation();
		append("}\n");				// XXX ?? pre-new-line
		wca(jBlock);
		return this;
	}

	@Override
	public Object caseBlockComment(BlockComment jBlockComment) {
		append(jBlockComment.getContent());
		return this;
	}

	@Override
	public Object caseBodyDeclaration(BodyDeclaration jBodyDeclaration) {		// Should be overridden
		return errorCase(jBodyDeclaration);
	}

	@Override
	public Object caseBooleanLiteral(BooleanLiteral jBooleanLiteral) {
		wc(jBooleanLiteral);
		append(jBooleanLiteral.isValue());
		wca(jBooleanLiteral);
		return this;
	}

	@Override
	public Object caseBreakStatement(BreakStatement jBreakStatement) {
		wc(jBreakStatement);
		append("break");
		if (jBreakStatement.getLabel() != null) {
			appendSoftSpace();
			append(jBreakStatement.getLabel().getName());
		}
		append(";");
		appendSoftNewLine();
		wca(jBreakStatement);
		return this;
	}

	@Override
	public Object caseCastExpression(CastExpression jCastExpression) {
		wc(jCastExpression);
		appendWrappedNode("(", jCastExpression.getType(), ")");
	//	appendSoftSpace();
		appendNode(jCastExpression.getExpression());
		wca(jCastExpression);
		return this;
	}

	@Override
	public Object caseCatchClause(CatchClause jCatchClause) {
		appendSoftNewLine();
		wc(jCatchClause);
		appendWrappedNode("catch (", jCatchClause.getException(), ")");
		appendNode(jCatchClause.getBody());
		wca(jCatchClause);
		return this;
	}

	@Override
	public Object caseCharacterLiteral(CharacterLiteral jCharacterLiteral) {
		wc(jCharacterLiteral);
		append(jCharacterLiteral.getEscapedValue());
		wca(jCharacterLiteral);
		return this;
	}

	@Override
	public Object caseClassDeclaration(ClassDeclaration jClassDeclaration) {
		appendSoftNewLine();
		wc(jClassDeclaration);
		appendTypeHeader(jClassDeclaration);
		appendWrappedNode(" extends ", jClassDeclaration.getSuperClass(), null);
		appendOptionalWrappedNodes(" implements ", jClassDeclaration.getSuperInterfaces(), ", ", null);
		appendSoftSpace();
		append("{");
		appendBodyDeclarations(jClassDeclaration.getBodyDeclarations());
		wci(jClassDeclaration);
		append("}");				// XXX ?? pre-new-line
		wca(jClassDeclaration);
	//	appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseClassFile(ClassFile jClassFile) {
		return errorCase(jClassFile);					// should never be called
	}

	@Override
	public Object caseClassInstanceCreation(ClassInstanceCreation jClassInstanceCreation) {
		wc(jClassInstanceCreation);
		appendWrappedNode(null, jClassInstanceCreation.getExpression(), ".");
		append("new ");
		appendNode(jClassInstanceCreation.getType());
		appendWrappedNodes("(", jClassInstanceCreation.getArguments(), ", ", ")");
		appendNode(jClassInstanceCreation.getAnonymousClassDeclaration());
		wca(jClassInstanceCreation);
		return this;
	}

	@Override
	public Object caseComment(Comment object) {			// Should be overridden
		return errorCase(object);
	}

	@Override
	public Object caseCompilationUnit(CompilationUnit jCompilationUnit) {
		StringBuilder sFile = new StringBuilder();
		sFile.append(absoluteOutputPath);
		sFile.append("/");
		String fileKey = getQualifiedPath(sFile, jCompilationUnit);
		pushFile();
		wc(jCompilationUnit);
		appendNode(jCompilationUnit.getPackage());
		appendOptionalWrappedNodes("\n", jCompilationUnit.getImports(), null, null);
		append("\n");
		wci(jCompilationUnit);
		appendNodes( jCompilationUnit.getTypes());
		wca(jCompilationUnit);
		popFile(fileKey);
		return this;
	}

/*	@Override
	public Object caseConstructorDeclaration(ConstructorDeclaration object) { => AbstractMethodDeclaration
		return super.caseConstructorDeclaration(object);
	} */

	@Override
	public Object caseConditionalExpression(ConditionalExpression jConditionalExpression) {
		wc(jConditionalExpression);
		appendNode(jConditionalExpression.getExpression());
		append(" ? ");
		appendNode(jConditionalExpression.getThenExpression());
		append(" : ");
		appendNode(jConditionalExpression.getElseExpression());
		wca(jConditionalExpression);
		return this;
	}

	@Override
	public Object caseConstructorInvocation(ConstructorInvocation jConstructorInvocation) {
		wc(jConstructorInvocation);
		appendOptionalWrappedNodes("<", jConstructorInvocation.getTypeArguments(), ", ", ">");
		append("this");
		appendWrappedNodes("(", jConstructorInvocation.getArguments(), ", ", ")");
		append(";");
		appendSoftNewLine();
		wca(jConstructorInvocation);
		return this;
	}

	@Override
	public Object caseContinueStatement(ContinueStatement jContinueStatement) {
		wc(jContinueStatement);
		append("continue");
		if (jContinueStatement.getLabel() != null) {
			appendSoftSpace();
			append(jContinueStatement.getLabel().getName());
		}
		append(";");
		wca(jContinueStatement);
		appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseDoStatement(DoStatement jDoStatement) {
		wc(jDoStatement);
		append("do ");
		appendNode(jDoStatement.getBody());
		appendSoftNewLine();
		appendWrappedNode("while (", jDoStatement.getExpression(), ");");
		appendSoftNewLine();
		wca(jDoStatement);
//		appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseEmptyStatement(EmptyStatement jEmptyStatement) {
		wc(jEmptyStatement);
		append(";");
		wca(jEmptyStatement);
		appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseEnhancedForStatement(EnhancedForStatement jEnhancedForStatement) {
		wc(jEnhancedForStatement);
		append("for (");
		appendNode(jEnhancedForStatement.getParameter());
		appendSoftSpace();
		append(":");
		appendSoftSpace();
		appendNode(jEnhancedForStatement.getExpression());
		append(")");
		appendSoftSpace();
		appendNode(jEnhancedForStatement.getBody());
		wca(jEnhancedForStatement);
		appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseEnumConstantDeclaration(EnumConstantDeclaration jEnumConstantDeclaration) {
		wc(jEnumConstantDeclaration);
		appendNodes(jEnumConstantDeclaration.getAnnotations());
		appendNode(jEnumConstantDeclaration.getModifier());
	//	append(" ");
		append(jEnumConstantDeclaration.getName());
		appendWrappedNodes("(", jEnumConstantDeclaration.getArguments(), ",", ")");
		wca(jEnumConstantDeclaration);
		return this;
	}

	@Override
	public Object caseEnumDeclaration(EnumDeclaration jEnumDeclaration) {
		appendSoftNewLine();
		wc(jEnumDeclaration);
		appendNodes(jEnumDeclaration.getAnnotations());
		appendNode(jEnumDeclaration.getModifier());
		appendJavaKeyword(jEnumDeclaration);
		append(" ");
		append(jEnumDeclaration.getName());
		appendOptionalWrappedNodes(" implements ", jEnumDeclaration.getSuperInterfaces(), ", ", null);
		appendSoftSpace();
		append("{\n");
		pushIndentation();
		appendWrappedNodes(null, jEnumDeclaration.getEnumConstants(), ",\n", ";");
		appendSoftNewLine();
		for (BodyDeclaration jBodyDeclaration : jEnumDeclaration.getBodyDeclarations()) {
			if (!jBodyDeclaration.isProxy()) {
				appendNode(jBodyDeclaration);				// an implicit constructor may exist as proxy
			}
		}
		wci(jEnumDeclaration);
		popIndentation();
		append("}");				// XXX ?? pre-new-line
		wca(jEnumDeclaration);
	//	appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseExpression(Expression jExpression) {		// Should be overridden
		return errorCase(jExpression);
	}


	@Override
	public Object caseExpressionStatement(ExpressionStatement jExpressionStatement) {
		wc(jExpressionStatement);
		appendNode(jExpressionStatement.getExpression());
		append(";");
		appendSoftNewLine();
		wca(jExpressionStatement);
		return this;
	}

	@Override
	public Object caseFieldAccess(FieldAccess jFieldAccess) {
		wc(jFieldAccess);
		appendNode(jFieldAccess.getExpression());
		append(".");
		appendNode(jFieldAccess.getField());
		wca(jFieldAccess);
		return this;
	}

	@Override
	public Object caseFieldDeclaration(FieldDeclaration jFieldDeclaration) {
		wc(jFieldDeclaration);
		appendNodes(jFieldDeclaration.getAnnotations());
		wci(jFieldDeclaration);
		appendModifier(jFieldDeclaration.getModifier());
		appendWrappedNode(null, jFieldDeclaration.getType(), " ");
		appendWrappedNodes(null, jFieldDeclaration.getFragments(), ", ", null);
		append(";");
		appendSoftNewLine();
		wca(jFieldDeclaration);
		return this;
	}

	@Override
	public Object caseForStatement(ForStatement jForStatement) {
		wc(jForStatement);
		append("for (");
		appendWrappedNodes(null, jForStatement.getInitializers(), ", ", null);
		append("; ");
		appendNode(jForStatement.getExpression());
		append("; ");
		appendWrappedNodes(null, jForStatement.getUpdaters(), ", ", null);
		append(") ");
		appendNode(jForStatement.getBody());
		wca(jForStatement);
		appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseIfStatement(IfStatement jIfStatement) {
		wc(jIfStatement);
		appendWrappedNode("if (", jIfStatement.getExpression(), ")");
		appendSoftSpace();
		appendNode(jIfStatement.getThenStatement());
		appendSoftNewLine();
		if (jIfStatement.getElseStatement() != null) {
			append("else");
			appendSoftSpace();
			appendNode(jIfStatement.getElseStatement());
			appendSoftNewLine();
		}
		wca(jIfStatement);
		return this;
	}

	@Override
	public Object caseImportDeclaration(ImportDeclaration jImportDeclaration) {
		appendSoftNewLine();
		wc(jImportDeclaration);
		append("import");
		if (jImportDeclaration.isStatic()) {
			append(" static");
		}
		append(" ");
		NamedElement jImportedElement = jImportDeclaration.getImportedElement();
		appendQualifiedName(jImportedElement);
		if (jImportedElement instanceof org.eclipse.modisco.java.Package) {
			append(".*");
		}
		if (jImportedElement instanceof AbstractTypeDeclaration && jImportDeclaration.isStatic()) {
			append(".*");
		}
		append(";\n");
		wca(jImportDeclaration);
		return this;
	}

	@Override
	public Object caseInfixExpression(InfixExpression jInfixExpression) {
		wc(jInfixExpression);
		appendNode(jInfixExpression.getLeftOperand());
		appendSoftSpace();
		append(jInfixExpression.getOperator().toString());
		appendSoftSpace();
		appendNode(jInfixExpression.getRightOperand());
		appendOptionalWrappedNodes(" ", jInfixExpression.getExtendedOperands(), " ", null);
		wca(jInfixExpression);
		return this;
	}

	@Override
	public Object caseInitializer(Initializer jInitializer) {
		wc(jInitializer);
		appendNodes(jInitializer.getAnnotations());
		appendNode(jInitializer.getModifier());
		appendNode(jInitializer.getBody());
		wca(jInitializer);
		return this;
	}

	@Override
	public Object caseInstanceofExpression(InstanceofExpression jInstanceofExpression) {
		wc(jInstanceofExpression);
		appendNode(jInstanceofExpression.getLeftOperand());
		append(" instanceof ");
		appendNode(jInstanceofExpression.getRightOperand());
		wca(jInstanceofExpression);
		return this;
	}

	@Override
	public Object caseInterfaceDeclaration(InterfaceDeclaration jInterfaceDeclaration) {
		appendSoftNewLine();
		wc(jInterfaceDeclaration);
		appendTypeHeader(jInterfaceDeclaration);
		appendOptionalWrappedNodes(" extends ", jInterfaceDeclaration.getSuperInterfaces(), ", ", null);
		appendSoftSpace();
		append("{");
		appendBodyDeclarations(jInterfaceDeclaration.getBodyDeclarations());
		wci(jInterfaceDeclaration);
		append("}");
		wca(jInterfaceDeclaration);
		return this;
	}

	// comment in the case of javadoc withe tag elements, we have
	//  to consider two cases:
	//  1. the tag element correspond to a simple text (nothing special to do)
	//  2. the tag element has a key, then we have to add a space before /]
	@Override
	public Object caseJavadoc(Javadoc jJavadoc) {
		List<TagElement> jTags = jJavadoc.getTags();
		if (jTags.size() > 0) {
			appendSoftNewLine();
			append("/**");
			for (TagElement jTag : jTags) {
				append("\n * ");
				appendNode(jTag);
			}
			append("\n */\n");
		}
		else {
			append(jJavadoc.getContent());
			append("\n");
		}
		return this;
	}

	@Override
	public Object caseLabeledStatement(LabeledStatement jLabeledStatement) {
		wc(jLabeledStatement);
		append(jLabeledStatement.getName());
		append(" : ");
		appendNode(jLabeledStatement.getBody());
		wca(jLabeledStatement);
		return this;
	}

	@Override
	public Object caseLineComment(LineComment jLineComment) {
		append(jLineComment.getContent());
		append("\n");
		return this;
	}

	@Override
	public Object caseManifest(Manifest jManifest) {
		return errorCase(jManifest);					// should never be called
	}

	@Override
	public Object caseManifestAttribute(ManifestAttribute jManifestAttribute) {
		return errorCase(jManifestAttribute);					// should never be called
	}

	@Override
	public Object caseManifestEntry(ManifestEntry jManifestEntry) {
		return errorCase(jManifestEntry);					// should never be called
	}

	@Override
	public Object caseMemberRef(MemberRef jMemberRef) {	// XXX No unit testing
		wc(jMemberRef);
		appendWrappedNode(null, jMemberRef.getQualifier(), "#");
		append(jMemberRef.getMember().getName());
		wca(jMemberRef);
		return this;
	}

	@Override
	public Object caseMethodInvocation(MethodInvocation jMethodInvocation) {
		wc(jMethodInvocation);
		appendWrappedNode(null, jMethodInvocation.getExpression(), ".");
		appendMethodHeader(jMethodInvocation) ;
		wca(jMethodInvocation);
		return this;
	}

	@Override
	public Object caseMethodRef(MethodRef jMethodRef) {
		appendNode(jMethodRef.getQualifier());
		append("#");
		append(jMethodRef.getMethod().getName());
		appendWrappedNodes("(", jMethodRef.getParameters(), ", ", ")");
		wca(jMethodRef);
		return this;
	}

	@Override
	public Object caseMethodRefParameter(MethodRefParameter jMethodRefParameter) {
		appendNode(jMethodRefParameter.getType());
		if (jMethodRefParameter.isVarargs()) {
			append("...");
		}
		append(" ");
		append(jMethodRefParameter.getName());
		wca(jMethodRefParameter);
		return this;
	}

	@Override
	public Object caseModel(Model jModel) {
		appendNodes(jModel.getCompilationUnits());
		return this;
	}

	@Override
	public Object caseModifier(Modifier jModifier) {
		wc(jModifier);
		if (jModifier.getVisibility() == VisibilityKind.PUBLIC) {
			append("public ");
		}
		else if (jModifier.getVisibility() == VisibilityKind.PRIVATE) {
			append("private ");
		}
		else if (jModifier.getVisibility() == VisibilityKind.PROTECTED) {
			append("protected ");
		}
		if (jModifier.getInheritance() == InheritanceKind.ABSTRACT) {
			append("abstract ");
		}
		if (jModifier.isStatic()) {
			append("static ");
		}
		if (jModifier.getInheritance() == InheritanceKind.FINAL) {
			append("final ");
		}
		if (jModifier.isTransient()) {
			append("transient ");
		}
		if (jModifier.isVolatile()) {
			append("volatile ");
		}
		if (jModifier.isSynchronized()) {
			append("synchronized ");
		}
		if (jModifier.isNative()) {
			append("native ");
		}
		if (jModifier.isStrictfp()) {
			append("strictfp ");
		}
		wca(jModifier);
		return this;
	}

	@Override
	public Object caseNamedElement(NamedElement jNamedElement) {		// Should be overridden
		return errorCase(jNamedElement);
	}

	@Override
	public Object caseNamespaceAccess(NamespaceAccess jNamespaceAccess) {			// Should be overridden
		return errorCase(jNamespaceAccess);
	}

	@Override
	public Object caseNumberLiteral(NumberLiteral jNumberLiteral) {
		wc(jNumberLiteral);
		append(jNumberLiteral.getTokenValue());
		wca(jNumberLiteral);
		return this;
	}

	@Override
	public Object caseNullLiteral(NullLiteral jNullLiteral) {
		wc(jNullLiteral);
		append("null");
		wca(jNullLiteral);
		return this;
	}

	@Override
	public Object casePackage(org.eclipse.modisco.java.Package jPackage) {
		wc(jPackage);
		append("package ");
		appendQualifiedName(jPackage);
		wca(jPackage);
		append(";\n");
		return this;
	}

	@Override
	public Object casePackageAccess(PackageAccess jPackageAccess) {
		wc(jPackageAccess);
		appendWrappedNode(null, jPackageAccess.getQualifier(), ".");
		append(jPackageAccess.getPackage().getName());
		wca(jPackageAccess);
		return this;
	}

	@Override
	public Object caseParameterizedType(ParameterizedType jParameterizedType) {
		wc(jParameterizedType);
		appendNode(jParameterizedType.getType());
		appendWrappedNodes("<", jParameterizedType.getTypeArguments(), ", ", ">");
		wca(jParameterizedType);
		return this;
	}

	@Override
	public Object caseParenthesizedExpression(ParenthesizedExpression jParenthesizedExpression) {
		wc(jParenthesizedExpression);
		appendWrappedNode("(", jParenthesizedExpression.getExpression(), ")");
		wca(jParenthesizedExpression);
		return this;
	}

	@Override
	public Object casePostfixExpression(PostfixExpression jPostfixExpression) {
		wc(jPostfixExpression);
		appendNode(jPostfixExpression.getOperand());
		append(jPostfixExpression.getOperator().toString());
		wca(jPostfixExpression);
		return this;
	}

	@Override
	public Object casePrefixExpression(PrefixExpression jPrefixExpression) {
		wc(jPrefixExpression);
		append(jPrefixExpression.getOperator().toString());
		appendNode(jPrefixExpression.getOperand());
		wca(jPrefixExpression);
		return this;
	}

	@Override
	public Object casePrimitiveType(PrimitiveType jPrimitiveType) {				// Should be overridden
		return errorCase(jPrimitiveType);
	}

	@Override
	public Object casePrimitiveTypeBoolean(PrimitiveTypeBoolean jPrimitiveType) {	// Only used as an orphan type
		append("boolean");
		wca(jPrimitiveType);
		return this;
	}

	@Override
	public Object casePrimitiveTypeByte(PrimitiveTypeByte jPrimitiveType) {	// Only used as an orphan type
		append("byte");
		wca(jPrimitiveType);
		return this;
	}

	@Override
	public Object casePrimitiveTypeChar(PrimitiveTypeChar jPrimitiveType) {	// Only used as an orphan type
		append("char");
		wca(jPrimitiveType);
		return this;
	}

	@Override
	public Object casePrimitiveTypeDouble(PrimitiveTypeDouble jPrimitiveType) {	// Only used as an orphan type
		append("double");
		wca(jPrimitiveType);
		return this;
	}

	@Override
	public Object casePrimitiveTypeFloat(PrimitiveTypeFloat jPrimitiveType) {	// Only used as an orphan type
		append("float");
		wca(jPrimitiveType);
		return this;
	}

	@Override
	public Object casePrimitiveTypeInt(PrimitiveTypeInt jPrimitiveType) {	// Only used as an orphan type
		append("int");
		wca(jPrimitiveType);
		return this;
	}

	@Override
	public Object casePrimitiveTypeLong(PrimitiveTypeLong jPrimitiveType) {	// Only used as an orphan type
		append("long");
		wca(jPrimitiveType);
		return this;
	}

	@Override
	public Object casePrimitiveTypeShort(PrimitiveTypeShort jPrimitiveType) {	// Only used as an orphan type
		append("short");
		wca(jPrimitiveType);
		return this;
	}

	@Override
	public Object casePrimitiveTypeVoid(PrimitiveTypeVoid jPrimitiveType) {	// Only used as an orphan type
		append("void");
		wca(jPrimitiveType);
		return this;
	}

	@Override
	public Object caseReturnStatement(ReturnStatement jReturnStatement) {
		wc(jReturnStatement);
		append("return");
		appendWrappedNode(" ", jReturnStatement.getExpression(), null);
		append(";");
		appendSoftNewLine();
		wca(jReturnStatement);
		return this;
	}

	@Override
	public Object caseSingleVariableAccess(SingleVariableAccess jSingleVariableAccess) {
		wc(jSingleVariableAccess);
		appendWrappedNode(null, jSingleVariableAccess.getQualifier(), ".");
		append(jSingleVariableAccess.getVariable().getName());
		wca(jSingleVariableAccess);
		return this;
	}

	@Override
	public Object caseSingleVariableDeclaration(SingleVariableDeclaration jSingleVariableDeclaration) {
		wc(jSingleVariableDeclaration);
		appendNodes(jSingleVariableDeclaration.getAnnotations());
		appendModifier(jSingleVariableDeclaration.getModifier());
		appendWrappedNode(null, jSingleVariableDeclaration.getType(), " ");
		if (jSingleVariableDeclaration.isVarargs()) {
			append("... ");
		}
		append(jSingleVariableDeclaration.getName());
		appendBrackets(jSingleVariableDeclaration.getExtraArrayDimensions());
		appendWrappedNode("=", jSingleVariableDeclaration.getInitializer(), null);
		wca(jSingleVariableDeclaration);
		return this;
	}

	@Override
	public Object caseStatement(Statement jStatement) {		// Should be overridden
		return errorCase(jStatement);
	}

	@Override
	public Object caseStringLiteral(StringLiteral jStringLiteral) {
		wc(jStringLiteral);
		append(jStringLiteral.getEscapedValue());
		wca(jStringLiteral);
		return this;
	}

	@Override
	public Object caseSuperConstructorInvocation(SuperConstructorInvocation jSuperConstructorInvocation) {
		wc(jSuperConstructorInvocation);
		appendWrappedNode(null, jSuperConstructorInvocation.getExpression(), ".");
		appendOptionalWrappedNodes("<", jSuperConstructorInvocation.getTypeArguments(), ", ", ">");
		append("super");
		appendWrappedNodes("(", jSuperConstructorInvocation.getArguments(), ", ", ")");
		append(";");
		appendSoftNewLine();
		wca(jSuperConstructorInvocation);
		return this;
	}

	@Override
	public Object caseSuperFieldAccess(SuperFieldAccess jSuperFieldAccess) {
		wc(jSuperFieldAccess);
		appendWrappedNode("", jSuperFieldAccess.getQualifier(), ".");
		append("super.");
		appendNode(jSuperFieldAccess.getField());
		wca(jSuperFieldAccess);
		return this;
	}

	@Override
	public Object caseSuperMethodInvocation(SuperMethodInvocation jSuperMethodInvocation) {
		wc(jSuperMethodInvocation);
		append("super.");
		appendMethodHeader(jSuperMethodInvocation);
		wca(jSuperMethodInvocation);
		return this;
	}

	@Override
	public Object caseSwitchCase(SwitchCase jSwitchCase) {
		appendSoftNewLine();
		wc(jSwitchCase);
		if (jSwitchCase.isDefault()) {
			append("default");
		}
		else {
			appendWrappedNode("case ", jSwitchCase.getExpression(), null);
		}
		append(": ");
	//	appendWrappedNode(" : ", jSwitchCase.getExpression(), null);
		wca(jSwitchCase);
	//	appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseSwitchStatement(SwitchStatement jSwitchStatement) {
		wc(jSwitchStatement);
		appendWrappedNode("switch (", jSwitchStatement.getExpression(), ") {\n");
		pushIndentation();
		appendNodes(jSwitchStatement.getStatements());
		appendSoftNewLine();
		popIndentation();
		append("}");
		wca(jSwitchStatement);
		appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseSynchronizedStatement(SynchronizedStatement jSynchronizedStatement) {
		wc(jSynchronizedStatement);
		appendWrappedNode("synchronized (", jSynchronizedStatement.getExpression(), ")");
		appendSoftSpace();
		appendNode(jSynchronizedStatement.getBody());
		wca(jSynchronizedStatement);
		return this;
	}

	@Override
	public Object caseTagElement(TagElement jTagElement) {
		if (jTagElement.getTagName() != null) {
			append(jTagElement.getTagName());
			String separator = " ";
			for (ASTNode jNode : jTagElement.getFragments()) {
				append(separator);				// XXX soft space
				if (jNode instanceof TagElement) {
					append("{");
					appendNode(jNode);
					append("}");
				}
				else {
					appendNode(jNode);
				}
			}
		}
		else {
			String separator = null;
			for (ASTNode jNode : jTagElement.getFragments()) {
				append(separator);
				if (jNode instanceof TagElement) {
					append("{");
					appendNode(jNode);
					append("}");
				}
				else {
					appendNode(jNode);
				}
				separator = " ";
			}
		}
		return this;
	}

	@Override
	public Object caseTextElement(TextElement jTextElement) {
		append(jTextElement.getText());
		return this;
	}

	@Override
	public Object caseThisExpression(ThisExpression jThisExpression) {
		wc(jThisExpression);
		appendWrappedNode("", jThisExpression.getQualifier(), ".");
		append("this");
		wca(jThisExpression);
		return this;
	}

	@Override
	public Object caseThrowStatement(ThrowStatement jThrowStatement) {
		wc(jThrowStatement);
		appendWrappedNode("throw ", jThrowStatement.getExpression(), ";");
		appendSoftNewLine();
		wca(jThrowStatement);
		return this;
	}

	@Override
	public Object caseTryStatement(TryStatement jTryStatement) {
		wc(jTryStatement);
		append("try ");
		appendNode(jTryStatement.getBody());
		appendNodes(jTryStatement.getCatchClauses());
		appendWrappedNode("finally ", jTryStatement.getFinally(), null);
		wca(jTryStatement);
		return this;
	}

	@Override
	public Object caseType(Type jType) {		// Should be overridden
		return errorCase(jType);
	}

	@Override
	public Object caseTypeAccess(TypeAccess jTypeAccess) {
		wc(jTypeAccess);
		appendWrappedNode(null, jTypeAccess.getQualifier(), ".");
		Type jType = jTypeAccess.getType();
		if (jType instanceof ArrayType || jType instanceof ParameterizedType || jType instanceof WildCardType) {
			appendNode(jType);
		}
		else {
			append(jType.getName());
		}
		wca(jTypeAccess);
		return this;
	}

	@Override
	public Object caseTypeDeclaration(TypeDeclaration jTypeDeclaration) {		// Should be overridden
		return errorCase(jTypeDeclaration);
	}

	@Override
	public Object caseTypeDeclarationStatement(TypeDeclarationStatement jTypeDeclarationStatement) {
		wc(jTypeDeclarationStatement);
		appendNode(jTypeDeclarationStatement.getDeclaration());
		wca(jTypeDeclarationStatement);
		appendSoftNewLine();
		return this;
	}

	@Override
	public Object caseTypeLiteral(TypeLiteral jTypeLiteral) {
		wc(jTypeLiteral);
		if (!appendWrappedNode(null, jTypeLiteral.getType(), ".class")) {
			append("void.class");
		}
		wca(jTypeLiteral);
		return this;
	}

	@Override
	public Object caseTypeParameter(TypeParameter jTypeParameter) {
		wc(jTypeParameter);
		append(jTypeParameter.getName());
		appendOptionalWrappedNodes(" extends ", jTypeParameter.getBounds(), " & ", null);
		wca(jTypeParameter);
		return this;
	}

	@Override
	public Object caseUnresolvedAnnotationDeclaration(UnresolvedAnnotationDeclaration jUnresolvedAnnotationDeclaration) {	// XXX No unit testing
		wc(jUnresolvedAnnotationDeclaration);
		append(jUnresolvedAnnotationDeclaration.getName());
		wca(jUnresolvedAnnotationDeclaration);
		return this;
	}

	@Override
	public Object caseUnresolvedAnnotationTypeMemberDeclaration(UnresolvedAnnotationTypeMemberDeclaration jUnresolvedAnnotationTypeMemberDeclaration) {	// XXX No unit testing
		wc(jUnresolvedAnnotationTypeMemberDeclaration);
		append(jUnresolvedAnnotationTypeMemberDeclaration.getName());
		wca(jUnresolvedAnnotationTypeMemberDeclaration);
		return this;
	}

	@Override
	public Object caseUnresolvedClassDeclaration(UnresolvedClassDeclaration jUnresolvedClassDeclaration) {	// XXX No unit testing
		wc(jUnresolvedClassDeclaration);
		append(jUnresolvedClassDeclaration.getName());
		wca(jUnresolvedClassDeclaration);
		return this;
	}

	@Override
	public Object caseUnresolvedEnumDeclaration(UnresolvedEnumDeclaration jUnresolvedEnumDeclaration) {	// XXX No unit testing
		wc(jUnresolvedEnumDeclaration);
		append(jUnresolvedEnumDeclaration.getName());
		wca(jUnresolvedEnumDeclaration);
		return this;
	}

	@Override
	public Object caseUnresolvedInterfaceDeclaration(UnresolvedInterfaceDeclaration jUnresolvedInterfaceDeclaration) {	// XXX No unit testing
		wc(jUnresolvedInterfaceDeclaration);
		append(jUnresolvedInterfaceDeclaration.getName());
		wca(jUnresolvedInterfaceDeclaration);
		return this;
	}

	@Override
	public Object caseUnresolvedItem(UnresolvedItem jUnresolvedItem) {
		wc(jUnresolvedItem);
		append(jUnresolvedItem.getName());
		wca(jUnresolvedItem);
		return this;
	}

	@Override
	public Object caseUnresolvedItemAccess(UnresolvedItemAccess jUnresolvedItemAccess) {
		wc(jUnresolvedItemAccess);
		appendWrappedNode(null, jUnresolvedItemAccess.getQualifier(), ".");
		appendNode(jUnresolvedItemAccess.getElement());
		wca(jUnresolvedItemAccess);
		return this;
	}

	@Override
	public Object caseUnresolvedLabeledStatement(UnresolvedLabeledStatement jUnresolvedLabeledStatement) {	// XXX No unit testing
		wc(jUnresolvedLabeledStatement);
		append(jUnresolvedLabeledStatement.getName());
		wca(jUnresolvedLabeledStatement);
		return this;
	}

	@Override
	public Object caseUnresolvedMethodDeclaration(UnresolvedMethodDeclaration jUnresolvedMethodDeclaration) {	// XXX No unit testing
		wc(jUnresolvedMethodDeclaration);
		append(jUnresolvedMethodDeclaration.getName());
		wca(jUnresolvedMethodDeclaration);
		return this;
	}

	@Override
	public Object caseUnresolvedSingleVariableDeclaration(UnresolvedSingleVariableDeclaration jUnresolvedSingleVariableDeclaration) {	// XXX No unit testing
		wc(jUnresolvedSingleVariableDeclaration);
		append(jUnresolvedSingleVariableDeclaration.getName());
		wca(jUnresolvedSingleVariableDeclaration);
		return this;
	}

	@Override
	public Object caseUnresolvedType(UnresolvedType jUnresolvedType) {	// XXX No unit testing
		wc(jUnresolvedType);
		append(jUnresolvedType.getName());
		wca(jUnresolvedType);
		return this;
	}

	@Override
	public Object caseUnresolvedTypeDeclaration(UnresolvedTypeDeclaration jUnresolvedTypeDeclaration) {
		wc(jUnresolvedTypeDeclaration);
		append(jUnresolvedTypeDeclaration.getName());
		wca(jUnresolvedTypeDeclaration);
		return this;
	}

/*	@Override
	public Object caseUnresolvedVariableDeclarationFragment(UnresolvedVariableDeclarationFragment object) {
		return super.caseUnresolvedVariableDeclarationFragment(object);
	} */

	@Override
	public Object caseVariableDeclaration(VariableDeclaration jVariableDeclaration) {			// Should be overridden
		return errorCase(jVariableDeclaration);
	}

	@Override
	public Object caseVariableDeclarationExpression(VariableDeclarationExpression jVariableDeclarationExpression) {
		wc(jVariableDeclarationExpression);
		appendNodes(jVariableDeclarationExpression.getAnnotations());
		appendNode(jVariableDeclarationExpression.getModifier());
		appendNode(jVariableDeclarationExpression.getType());
		append(" ");
		appendWrappedNodes(null, jVariableDeclarationExpression.getFragments(), ",", null);
		wca(jVariableDeclarationExpression);
		return this;
	}

	@Override
	public Object caseVariableDeclarationFragment(VariableDeclarationFragment jVariableDeclarationFragment) {
		wc(jVariableDeclarationFragment);
		append(jVariableDeclarationFragment.getName());
		appendBrackets(jVariableDeclarationFragment.getExtraArrayDimensions());
		appendWrappedNode(" = ", jVariableDeclarationFragment.getInitializer(), null);
		wca(jVariableDeclarationFragment);
		return this;
	}

	@Override
	public Object caseVariableDeclarationStatement(VariableDeclarationStatement jVariableDeclarationStatement) {
		wc(jVariableDeclarationStatement);
		appendNodes(jVariableDeclarationStatement.getAnnotations());
		appendModifier(jVariableDeclarationStatement.getModifier());
		appendNode(jVariableDeclarationStatement.getType());
		appendBrackets(jVariableDeclarationStatement.getExtraArrayDimensions());
		append(" ");
		appendWrappedNodes(null, jVariableDeclarationStatement.getFragments(), ",", null);
		append(";");
		appendSoftNewLine();
		wca(jVariableDeclarationStatement);
		return this;
	}

	@Override
	public Object caseWhileStatement(WhileStatement jWhileStatement) {
		wc(jWhileStatement);
		appendWrappedNode("while (", jWhileStatement.getExpression(), ") ");
		appendNode(jWhileStatement.getBody());
		wca(jWhileStatement);
		return this;
	}

	@Override
	public Object caseWildCardType(WildCardType jWildCardType) {
		wc(jWildCardType);
		append("?");
		appendWrappedNode(jWildCardType.isUpperBound() ? " extends " : " super ", jWildCardType.getBound(), null);
		wca(jWildCardType);
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