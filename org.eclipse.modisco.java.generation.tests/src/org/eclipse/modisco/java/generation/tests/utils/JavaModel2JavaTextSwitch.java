package org.eclipse.modisco.java.generation.tests.utils;

import java.util.List;
import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.java.*;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.emf.util.JavaSwitch;

public class JavaModel2JavaTextSwitch extends JavaModel2JavaTextUtils
{
	protected final String absoluteOutputPath;
	
	public JavaModel2JavaTextSwitch(String absoluteOutputPath) {
		this.absoluteOutputPath = absoluteOutputPath;
	}

//	@Override
//	public Object caseASTNode(ASTNode object) {
//		return super.caseASTNode(object);
//	}

	@Override
	public Object caseAbstractMethodDeclaration(AbstractMethodDeclaration jAbstractMethodDeclaration) {
		wc(jAbstractMethodDeclaration);
		appendNodes(jAbstractMethodDeclaration.getAnnotations()) ;
	//	wci(jAbstractMethodDeclaration);
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
			append(";\n");
		}
		wca(jAbstractMethodDeclaration);
		return this;
	}

	@Override
	public Object caseAbstractMethodInvocation(AbstractMethodInvocation object) {
		// TODO Auto-generated method stub
		return super.caseAbstractMethodInvocation(object);
	}

	@Override
	public Object caseAbstractTypeDeclaration(AbstractTypeDeclaration object) {
		// TODO Auto-generated method stub
		return super.caseAbstractTypeDeclaration(object);
	}

	@Override
	public Object caseAbstractTypeQualifiedExpression(AbstractTypeQualifiedExpression object) {
		// TODO Auto-generated method stub
		return super.caseAbstractTypeQualifiedExpression(object);
	}

	@Override
	public Object caseAbstractVariablesContainer(AbstractVariablesContainer object) {
		// TODO Auto-generated method stub
		return super.caseAbstractVariablesContainer(object);
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
		append("}\n");
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
		append(";\n");
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
	public Object caseArchive(Archive object) {
		// TODO Auto-generated method stub
		return super.caseArchive(object);
	}

	@Override
	public Object caseArrayAccess(ArrayAccess object) {
		// TODO Auto-generated method stub
		return super.caseArrayAccess(object);
	}

	@Override
	public Object caseArrayCreation(ArrayCreation object) {
		// TODO Auto-generated method stub
		return super.caseArrayCreation(object);
	}

	@Override
	public Object caseArrayInitializer(ArrayInitializer object) {
		// TODO Auto-generated method stub
		return super.caseArrayInitializer(object);
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
	public Object caseAssertStatement(AssertStatement object) {
		// TODO Auto-generated method stub
		return super.caseAssertStatement(object);
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
		appendNodes(jBlock.getStatements());
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
	public Object caseBodyDeclaration(BodyDeclaration object) {
		// TODO Auto-generated method stub
		return super.caseBodyDeclaration(object);
	}

	@Override
	public Object caseBooleanLiteral(BooleanLiteral jBooleanLiteral) {
		wc(jBooleanLiteral);
		append(jBooleanLiteral.isValue());
		wca(jBooleanLiteral);
		return this;
	}

	@Override
	public Object caseBreakStatement(BreakStatement object) {
		// TODO Auto-generated method stub
		return super.caseBreakStatement(object);
	}

	@Override
	public Object caseCastExpression(CastExpression object) {
		// TODO Auto-generated method stub
		return super.caseCastExpression(object);
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
	public Object caseCharacterLiteral(CharacterLiteral object) {
		// TODO Auto-generated method stub
		return super.caseCharacterLiteral(object);
	}

	@Override
	public Object caseClassDeclaration(ClassDeclaration jClassDeclaration) {
		append("\n");		// perhaps in package
		wc(jClassDeclaration);
		appendTypeHeader(jClassDeclaration);
		appendWrappedNode(" extends ", jClassDeclaration.getSuperClass(), null);
		appendOptionalWrappedNodes(" implements ", jClassDeclaration.getSuperInterfaces(), ", ", null);
		appendSoftSpace();
		append("{");
		pushIndentation();
		append("\n");
		for (BodyDeclaration jBodyDeclaration : jClassDeclaration.getBodyDeclarations()) {
			if (!jBodyDeclaration.isProxy()) {
				appendNode(jBodyDeclaration);
			}
		}
		wci(jClassDeclaration);
		popIndentation();
		append("}\n");				// XXX ?? pre-new-line
		wca(jClassDeclaration);
		append("\n");				// XXX ?? pre-new-line
		return this;
	}

	@Override
	public Object caseClassFile(ClassFile object) {
		// TODO Auto-generated method stub
		return super.caseClassFile(object);
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
		StringBuilder s = new StringBuilder();
		s.append(absoluteOutputPath);
		s.append("/");
		String fileKey = getQualifiedPath(s, jCompilationUnit);
		pushFile();
		wc(jCompilationUnit);
		appendNode(jCompilationUnit.getPackage());
		appendNodes(jCompilationUnit.getImports());
		wci(jCompilationUnit);
		appendNodes( jCompilationUnit.getTypes());
		wca(jCompilationUnit);
		popFile(fileKey);
		return this;
	}

	@Override
	public Object caseConstructorDeclaration(ConstructorDeclaration object) {
		// TODO Auto-generated method stub
		return super.caseConstructorDeclaration(object);
	}

	@Override
	public Object caseConditionalExpression(ConditionalExpression object) {
		// TODO Auto-generated method stub
		return super.caseConditionalExpression(object);
	}

	@Override
	public Object caseConstructorInvocation(ConstructorInvocation jConstructorInvocation) {
		wc(jConstructorInvocation);
		appendOptionalWrappedNodes("<", jConstructorInvocation.getTypeArguments(), ", ", ">");
		append("this");
		appendWrappedNodes("(", jConstructorInvocation.getArguments(), ", ", ")");
		append(";\n");
		wca(jConstructorInvocation);
		return this;
	}

	@Override
	public Object caseContinueStatement(ContinueStatement object) {
		// TODO Auto-generated method stub
		return super.caseContinueStatement(object);
	}

	@Override
	public Object caseDoStatement(DoStatement object) {
		// TODO Auto-generated method stub
		return super.caseDoStatement(object);
	}

	@Override
	public Object caseEmptyStatement(EmptyStatement object) {
		// TODO Auto-generated method stub
		return super.caseEmptyStatement(object);
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
		append("\n");		// perhaps in package
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
		appendWrappedNodes(null, jEnumDeclaration.getEnumConstants(), ",\n", ";\n");
		for (BodyDeclaration jBodyDeclaration : jEnumDeclaration.getBodyDeclarations()) {
			if (!jBodyDeclaration.isProxy()) {
				appendNode(jBodyDeclaration);				// an implicit constructor may exist as proxy
			}
		}
		wci(jEnumDeclaration);
		popIndentation();
		append("}\n");				// XXX ?? pre-new-line
		wca(jEnumDeclaration);
		append("\n");				// XXX ?? pre-new-line
		return this;
	}

	@Override
	public Object caseExpression(Expression object) {
		// TODO Auto-generated method stub
		return super.caseExpression(object);
	}

	@Override
	public Object caseExpressionStatement(ExpressionStatement jExpressionStatement) {
		wc(jExpressionStatement);
		appendNode(jExpressionStatement.getExpression());
		append(";\n");
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
		append(";\n");
		wca(jFieldDeclaration);
		return this;
	}

	@Override
	public Object caseForStatement(ForStatement object) {
		// TODO Auto-generated method stub
		return super.caseForStatement(object);
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
	public Object caseInstanceofExpression(InstanceofExpression object) {
		// TODO Auto-generated method stub
		return super.caseInstanceofExpression(object);
	}

	@Override
	public Object caseInterfaceDeclaration(InterfaceDeclaration jInterfaceDeclaration) {
		append("\n");		// perhaps in package
		wc(jInterfaceDeclaration);
		appendTypeHeader(jInterfaceDeclaration);
		appendOptionalWrappedNodes(" extends ", jInterfaceDeclaration.getSuperInterfaces(), ", ", null);
		appendSoftSpace();
		append("{");
		pushIndentation();
		append("\n");
		for (BodyDeclaration jBodyDeclaration : jInterfaceDeclaration.getBodyDeclarations()) {
			if (!jBodyDeclaration.isProxy()) {
				appendNode(jBodyDeclaration);				// an implicit constructor may exist as proxy
			}
		}
		wci(jInterfaceDeclaration);
		popIndentation();
		append("}\n");				// XXX ?? pre-new-line
		wca(jInterfaceDeclaration);
		append("\n");				// XXX ?? pre-new-line
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
	public Object caseLabeledStatement(LabeledStatement object) {
		// TODO Auto-generated method stub
		return super.caseLabeledStatement(object);
	}

	@Override
	public Object caseLineComment(LineComment jLineComment) {
		append(jLineComment.getContent());
		append("\n");
		return this;
	}

	@Override
	public Object caseManifest(Manifest object) {
		// TODO Auto-generated method stub
		return super.caseManifest(object);
	}

	@Override
	public Object caseManifestAttribute(ManifestAttribute object) {
		// TODO Auto-generated method stub
		return super.caseManifestAttribute(object);
	}

	@Override
	public Object caseManifestEntry(ManifestEntry object) {
		// TODO Auto-generated method stub
		return super.caseManifestEntry(object);
	}

	@Override
	public Object caseMemberRef(MemberRef object) {
		// TODO Auto-generated method stub
		return super.caseMemberRef(object);
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
	public Object caseMethodRefParameter(MethodRefParameter object) {
		// TODO Auto-generated method stub
		return super.caseMethodRefParameter(object);
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
	public Object caseNamedElement(NamedElement object) {
		// TODO Auto-generated method stub
		return super.caseNamedElement(object);
	}

	@Override
	public Object caseNamespaceAccess(NamespaceAccess object) {
		// TODO Auto-generated method stub
		return super.caseNamespaceAccess(object);
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
	public Object caseParenthesizedExpression(ParenthesizedExpression object) {
		// TODO Auto-generated method stub
		return super.caseParenthesizedExpression(object);
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
	public Object casePrefixExpression(PrefixExpression object) {
		// TODO Auto-generated method stub
		return super.casePrefixExpression(object);
	}

	@Override
	public Object casePrimitiveType(PrimitiveType object) {
		// TODO Auto-generated method stub
		return super.casePrimitiveType(object);
	}

	@Override
	public Object casePrimitiveTypeBoolean(PrimitiveTypeBoolean object) {
		// TODO Auto-generated method stub
		return super.casePrimitiveTypeBoolean(object);
	}

	@Override
	public Object casePrimitiveTypeByte(PrimitiveTypeByte object) {
		// TODO Auto-generated method stub
		return super.casePrimitiveTypeByte(object);
	}

	@Override
	public Object casePrimitiveTypeChar(PrimitiveTypeChar object) {
		// TODO Auto-generated method stub
		return super.casePrimitiveTypeChar(object);
	}

	@Override
	public Object casePrimitiveTypeDouble(PrimitiveTypeDouble object) {
		// TODO Auto-generated method stub
		return super.casePrimitiveTypeDouble(object);
	}

	@Override
	public Object casePrimitiveTypeShort(PrimitiveTypeShort object) {
		// TODO Auto-generated method stub
		return super.casePrimitiveTypeShort(object);
	}

	@Override
	public Object casePrimitiveTypeFloat(PrimitiveTypeFloat object) {
		// TODO Auto-generated method stub
		return super.casePrimitiveTypeFloat(object);
	}

	@Override
	public Object casePrimitiveTypeInt(PrimitiveTypeInt object) {
		// TODO Auto-generated method stub
		return super.casePrimitiveTypeInt(object);
	}

	@Override
	public Object casePrimitiveTypeLong(PrimitiveTypeLong object) {
		// TODO Auto-generated method stub
		return super.casePrimitiveTypeLong(object);
	}

	@Override
	public Object casePrimitiveTypeVoid(PrimitiveTypeVoid object) {
		// TODO Auto-generated method stub
		return super.casePrimitiveTypeVoid(object);
	}

	@Override
	public Object caseReturnStatement(ReturnStatement jReturnStatement) {
		wc(jReturnStatement);
		append("return ");
		appendNode(jReturnStatement.getExpression());
		append(";\n");
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
	//	wci(jSingleVariableDeclaration);
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
	public Object caseStatement(Statement object) {
		// TODO Auto-generated method stub
		return super.caseStatement(object);
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
		append(";\n");
		wca(jSuperConstructorInvocation);
		return this;
	}

	@Override
	public Object caseSuperFieldAccess(SuperFieldAccess object) {
		// TODO Auto-generated method stub
		return super.caseSuperFieldAccess(object);
	}

	@Override
	public Object caseSuperMethodInvocation(SuperMethodInvocation jSuperMethodInvocation) {
		wc(jSuperMethodInvocation);
		appendMethodHeader(jSuperMethodInvocation);
		wca(jSuperMethodInvocation);
		return this;
	}

	@Override
	public Object caseSwitchCase(SwitchCase object) {
		// TODO Auto-generated method stub
		return super.caseSwitchCase(object);
	}

	@Override
	public Object caseSwitchStatement(SwitchStatement object) {
		// TODO Auto-generated method stub
		return super.caseSwitchStatement(object);
	}

	@Override
	public Object caseSynchronizedStatement(SynchronizedStatement object) {
		// TODO Auto-generated method stub
		return super.caseSynchronizedStatement(object);
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
	public Object caseThisExpression(ThisExpression object) {
		// TODO Auto-generated method stub
		return super.caseThisExpression(object);
	}

	@Override
	public Object caseThrowStatement(ThrowStatement jThrowStatement) {
		wc(jThrowStatement);
		appendWrappedNode("throw ", jThrowStatement.getExpression(), ";\n");
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
	public Object caseType(Type object) {
		// TODO Auto-generated method stub
		return super.caseType(object);
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
	public Object caseTypeDeclaration(TypeDeclaration object) {
		// TODO Auto-generated method stub
		return super.caseTypeDeclaration(object);
	}

	@Override
	public Object caseTypeDeclarationStatement(TypeDeclarationStatement object) {
		// TODO Auto-generated method stub
		return super.caseTypeDeclarationStatement(object);
	}

	@Override
	public Object caseTypeLiteral(TypeLiteral object) {
		// TODO Auto-generated method stub
		return super.caseTypeLiteral(object);
	}

	@Override
	public Object caseTypeParameter(TypeParameter jTypeParameter) {
		wc(jTypeParameter);
		append(jTypeParameter.getName());
		appendOptionalWrappedNodes(" extends ", jTypeParameter.getBounds(), " & ", null);
		wca(jTypeParameter);
		return this;
	}

	/*	@Override
	public Object caseUnresolvedAnnotationDeclaration(UnresolvedAnnotationDeclaration object) {
		return super.caseUnresolvedAnnotationDeclaration(object);
	} */

	/*	@Override
	public Object caseUnresolvedAnnotationTypeMemberDeclaration(UnresolvedAnnotationTypeMemberDeclaration object) {
		return super.caseUnresolvedAnnotationTypeMemberDeclaration(object);
	} */

	/*	@Override
	public Object caseUnresolvedClassDeclaration(UnresolvedClassDeclaration object) {
		return super.caseUnresolvedClassDeclaration(object);
	} */

	/*	@Override
	public Object caseUnresolvedEnumDeclaration(UnresolvedEnumDeclaration object) {
		return super.caseUnresolvedEnumDeclaration(object);
	} */

	/*	@Override
	public Object caseUnresolvedInterfaceDeclaration(UnresolvedInterfaceDeclaration object) {
		return super.caseUnresolvedInterfaceDeclaration(object);
	} */

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

	/*	@Override
	public Object caseUnresolvedLabeledStatement(UnresolvedLabeledStatement object) {
		return super.caseUnresolvedLabeledStatement(object);
	} */

	@Override
	public Object caseUnresolvedMethodDeclaration(UnresolvedMethodDeclaration jUnresolvedMethodDeclaration) {
		wc(jUnresolvedMethodDeclaration);
		append(jUnresolvedMethodDeclaration.getName());
		wca(jUnresolvedMethodDeclaration);
		return this;
	}

/*	@Override
	public Object caseUnresolvedSingleVariableDeclaration(UnresolvedSingleVariableDeclaration object) {
		return super.caseUnresolvedSingleVariableDeclaration(object);
	} */

	/*	@Override
	public Object caseUnresolvedType(UnresolvedType object) {
		return super.caseUnresolvedType(object);
	} */

/*	@Override
	public Object caseUnresolvedTypeDeclaration(UnresolvedTypeDeclaration object) {
		return super.caseUnresolvedTypeDeclaration(object);
	} */

/*	@Override
	public Object caseUnresolvedVariableDeclarationFragment(UnresolvedVariableDeclarationFragment object) {
		return super.caseUnresolvedVariableDeclarationFragment(object);
	} */

	@Override
	public Object caseVariableDeclaration(VariableDeclaration object) {
		// TODO Auto-generated method stub
		return super.caseVariableDeclaration(object);
	}

	@Override
	public Object caseVariableDeclarationExpression(VariableDeclarationExpression object) {
		// TODO Auto-generated method stub
		return super.caseVariableDeclarationExpression(object);
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
		append(";\n");
		wca(jVariableDeclarationStatement);
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
	public Object caseWhileStatement(WhileStatement object) {
		// TODO Auto-generated method stub
		return super.caseWhileStatement(object);
	}

	@Override
	public Object defaultCase(EObject eObject) {
		System.err.println("Missing case" + eObject.eClass().getName());			// XXX
		append("Missing case" + eObject.eClass().getName() + "\n");
		doChildren(eObject, true);
		return null;
	}

	public Object errorCase(EObject eObject) {
		append("Missing override case" + eObject.eClass().getName() + "\n");
		doChildren(eObject, true);
		return null;
	}
}