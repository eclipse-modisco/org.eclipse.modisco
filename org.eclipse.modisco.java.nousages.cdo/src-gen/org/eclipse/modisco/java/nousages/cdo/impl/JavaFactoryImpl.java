/**
 * *******************************************************************************
 * Copyright (c) 2009, 2026 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 * 
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.java.nousages.cdo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.modisco.java.AnnotationTypeMemberDeclaration;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.Archive;
import org.eclipse.modisco.java.ArrayAccess;
import org.eclipse.modisco.java.ArrayCreation;
import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.ArrayLengthAccess;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.AssertStatement;
import org.eclipse.modisco.java.Assignment;
import org.eclipse.modisco.java.AssignmentKind;
import org.eclipse.modisco.java.Block;
import org.eclipse.modisco.java.BlockComment;
import org.eclipse.modisco.java.BooleanLiteral;
import org.eclipse.modisco.java.BreakStatement;
import org.eclipse.modisco.java.CaseDefaultExpression;
import org.eclipse.modisco.java.CastExpression;
import org.eclipse.modisco.java.CatchClause;
import org.eclipse.modisco.java.CharacterLiteral;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.ClassFile;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.CompilationUnit;
import org.eclipse.modisco.java.ConditionalExpression;
import org.eclipse.modisco.java.ConstructorDeclaration;
import org.eclipse.modisco.java.ConstructorInvocation;
import org.eclipse.modisco.java.ContinueStatement;
import org.eclipse.modisco.java.CreationReference;
import org.eclipse.modisco.java.DoStatement;
import org.eclipse.modisco.java.EitherOrMultiPattern;
import org.eclipse.modisco.java.EmptyStatement;
import org.eclipse.modisco.java.EnhancedForStatement;
import org.eclipse.modisco.java.EnumConstantDeclaration;
import org.eclipse.modisco.java.EnumDeclaration;
import org.eclipse.modisco.java.ExportsDirective;
import org.eclipse.modisco.java.ExpressionMethodReference;
import org.eclipse.modisco.java.ExpressionStatement;
import org.eclipse.modisco.java.FieldAccess;
import org.eclipse.modisco.java.FieldDeclaration;
import org.eclipse.modisco.java.ForStatement;
import org.eclipse.modisco.java.GuardedPattern;
import org.eclipse.modisco.java.IfStatement;
import org.eclipse.modisco.java.ImplicitTypeDeclaration;
import org.eclipse.modisco.java.ImportDeclaration;
import org.eclipse.modisco.java.InfixExpression;
import org.eclipse.modisco.java.InfixExpressionKind;
import org.eclipse.modisco.java.InheritanceKind;
import org.eclipse.modisco.java.Initializer;
import org.eclipse.modisco.java.InstanceofExpression;
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.IntersectionType;
import org.eclipse.modisco.java.JavaDocRegion;
import org.eclipse.modisco.java.JavaDocTextElement;
import org.eclipse.modisco.java.Javadoc;
import org.eclipse.modisco.java.LabeledStatement;
import org.eclipse.modisco.java.LambdaExpression;
import org.eclipse.modisco.java.LineComment;
import org.eclipse.modisco.java.Manifest;
import org.eclipse.modisco.java.ManifestAttribute;
import org.eclipse.modisco.java.ManifestEntry;
import org.eclipse.modisco.java.MemberRef;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.MethodInvocation;
import org.eclipse.modisco.java.MethodRef;
import org.eclipse.modisco.java.MethodRefParameter;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.Modifier;
import org.eclipse.modisco.java.ModuleDeclaration;
import org.eclipse.modisco.java.ModuleModifier;
import org.eclipse.modisco.java.ModuleQualifiedName;
import org.eclipse.modisco.java.NameQualifiedType;
import org.eclipse.modisco.java.NullLiteral;
import org.eclipse.modisco.java.NullPattern;
import org.eclipse.modisco.java.NumberLiteral;
import org.eclipse.modisco.java.OpensDirective;
import org.eclipse.modisco.java.PackageAccess;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.ParenthesizedExpression;
import org.eclipse.modisco.java.PatternInstanceofExpression;
import org.eclipse.modisco.java.PostfixExpression;
import org.eclipse.modisco.java.PostfixExpressionKind;
import org.eclipse.modisco.java.PrefixExpression;
import org.eclipse.modisco.java.PrefixExpressionKind;
import org.eclipse.modisco.java.PrimitiveType;
import org.eclipse.modisco.java.PrimitiveTypeBoolean;
import org.eclipse.modisco.java.PrimitiveTypeByte;
import org.eclipse.modisco.java.PrimitiveTypeChar;
import org.eclipse.modisco.java.PrimitiveTypeDouble;
import org.eclipse.modisco.java.PrimitiveTypeFloat;
import org.eclipse.modisco.java.PrimitiveTypeInt;
import org.eclipse.modisco.java.PrimitiveTypeLong;
import org.eclipse.modisco.java.PrimitiveTypeShort;
import org.eclipse.modisco.java.PrimitiveTypeVoid;
import org.eclipse.modisco.java.ProvidesDirective;
import org.eclipse.modisco.java.QualifiedType;
import org.eclipse.modisco.java.RecordDeclaration;
import org.eclipse.modisco.java.RecordPattern;
import org.eclipse.modisco.java.RequiresDirective;
import org.eclipse.modisco.java.ReturnStatement;
import org.eclipse.modisco.java.SimpleType;
import org.eclipse.modisco.java.SingleVariableAccess;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.StringLiteral;
import org.eclipse.modisco.java.SuperConstructorInvocation;
import org.eclipse.modisco.java.SuperFieldAccess;
import org.eclipse.modisco.java.SuperMethodInvocation;
import org.eclipse.modisco.java.SuperMethodReference;
import org.eclipse.modisco.java.SwitchCase;
import org.eclipse.modisco.java.SwitchExpression;
import org.eclipse.modisco.java.SwitchStatement;
import org.eclipse.modisco.java.SynchronizedStatement;
import org.eclipse.modisco.java.TagElement;
import org.eclipse.modisco.java.TagProperty;
import org.eclipse.modisco.java.TextBlock;
import org.eclipse.modisco.java.TextElement;
import org.eclipse.modisco.java.ThisExpression;
import org.eclipse.modisco.java.ThrowStatement;
import org.eclipse.modisco.java.TryStatement;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeDeclarationStatement;
import org.eclipse.modisco.java.TypeLiteral;
import org.eclipse.modisco.java.TypeMethodReference;
import org.eclipse.modisco.java.TypeParameter;
import org.eclipse.modisco.java.TypePattern;
import org.eclipse.modisco.java.UnionType;
import org.eclipse.modisco.java.UnresolvedAnnotationDeclaration;
import org.eclipse.modisco.java.UnresolvedAnnotationTypeMemberDeclaration;
import org.eclipse.modisco.java.UnresolvedClassDeclaration;
import org.eclipse.modisco.java.UnresolvedEnumDeclaration;
import org.eclipse.modisco.java.UnresolvedInterfaceDeclaration;
import org.eclipse.modisco.java.UnresolvedItem;
import org.eclipse.modisco.java.UnresolvedItemAccess;
import org.eclipse.modisco.java.UnresolvedLabeledStatement;
import org.eclipse.modisco.java.UnresolvedMethodDeclaration;
import org.eclipse.modisco.java.UnresolvedSingleVariableDeclaration;
import org.eclipse.modisco.java.UnresolvedType;
import org.eclipse.modisco.java.UnresolvedTypeDeclaration;
import org.eclipse.modisco.java.UnresolvedVariableDeclarationFragment;
import org.eclipse.modisco.java.UsesDirective;
import org.eclipse.modisco.java.VariableDeclarationExpression;
import org.eclipse.modisco.java.VariableDeclarationFragment;
import org.eclipse.modisco.java.VariableDeclarationStatement;
import org.eclipse.modisco.java.VisibilityKind;
import org.eclipse.modisco.java.WhileStatement;
import org.eclipse.modisco.java.WildCardType;
import org.eclipse.modisco.java.YieldStatement;
import org.eclipse.modisco.java.*;
import org.eclipse.modisco.java.nousages.cdo.meta.JavaFactory;
import org.eclipse.modisco.java.nousages.cdo.meta.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaFactoryImpl extends EFactoryImpl implements JavaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavaFactory init() {
		try {
			JavaFactory theJavaFactory = (JavaFactory)EPackage.Registry.INSTANCE.getEFactory(JavaPackage.eNS_URI);
			if (theJavaFactory != null) {
				return theJavaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JavaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JavaPackage.ANNOTATION: return (EObject)createAnnotation();
			case JavaPackage.ARCHIVE: return (EObject)createArchive();
			case JavaPackage.ASSERT_STATEMENT: return (EObject)createAssertStatement();
			case JavaPackage.ANNOTATION_MEMBER_VALUE_PAIR: return (EObject)createAnnotationMemberValuePair();
			case JavaPackage.ANNOTATION_TYPE_DECLARATION: return (EObject)createAnnotationTypeDeclaration();
			case JavaPackage.ANNOTATION_TYPE_MEMBER_DECLARATION: return (EObject)createAnnotationTypeMemberDeclaration();
			case JavaPackage.ANONYMOUS_CLASS_DECLARATION: return (EObject)createAnonymousClassDeclaration();
			case JavaPackage.ARRAY_ACCESS: return (EObject)createArrayAccess();
			case JavaPackage.ARRAY_CREATION: return (EObject)createArrayCreation();
			case JavaPackage.ARRAY_INITIALIZER: return (EObject)createArrayInitializer();
			case JavaPackage.ARRAY_LENGTH_ACCESS: return (EObject)createArrayLengthAccess();
			case JavaPackage.ARRAY_TYPE: return (EObject)createArrayType();
			case JavaPackage.ASSIGNMENT: return (EObject)createAssignment();
			case JavaPackage.BLOCK: return (EObject)createBlock();
			case JavaPackage.BLOCK_COMMENT: return (EObject)createBlockComment();
			case JavaPackage.BOOLEAN_LITERAL: return (EObject)createBooleanLiteral();
			case JavaPackage.BREAK_STATEMENT: return (EObject)createBreakStatement();
			case JavaPackage.CASE_DEFAULT_EXPRESSION: return (EObject)createCaseDefaultExpression();
			case JavaPackage.CAST_EXPRESSION: return (EObject)createCastExpression();
			case JavaPackage.CATCH_CLAUSE: return (EObject)createCatchClause();
			case JavaPackage.CHARACTER_LITERAL: return (EObject)createCharacterLiteral();
			case JavaPackage.CLASS_DECLARATION: return (EObject)createClassDeclaration();
			case JavaPackage.CLASS_FILE: return (EObject)createClassFile();
			case JavaPackage.CLASS_INSTANCE_CREATION: return (EObject)createClassInstanceCreation();
			case JavaPackage.COMPILATION_UNIT: return (EObject)createCompilationUnit();
			case JavaPackage.CONDITIONAL_EXPRESSION: return (EObject)createConditionalExpression();
			case JavaPackage.CONSTRUCTOR_DECLARATION: return (EObject)createConstructorDeclaration();
			case JavaPackage.CONSTRUCTOR_INVOCATION: return (EObject)createConstructorInvocation();
			case JavaPackage.CONTINUE_STATEMENT: return (EObject)createContinueStatement();
			case JavaPackage.CREATION_REFERENCE: return (EObject)createCreationReference();
			case JavaPackage.DO_STATEMENT: return (EObject)createDoStatement();
			case JavaPackage.EITHER_OR_MULTI_PATTERN: return (EObject)createEitherOrMultiPattern();
			case JavaPackage.EMPTY_STATEMENT: return (EObject)createEmptyStatement();
			case JavaPackage.ENHANCED_FOR_STATEMENT: return (EObject)createEnhancedForStatement();
			case JavaPackage.ENUM_CONSTANT_DECLARATION: return (EObject)createEnumConstantDeclaration();
			case JavaPackage.ENUM_DECLARATION: return (EObject)createEnumDeclaration();
			case JavaPackage.EXPORTS_DIRECTIVE: return (EObject)createExportsDirective();
			case JavaPackage.EXPRESSION_METHOD_REFERENCE: return (EObject)createExpressionMethodReference();
			case JavaPackage.EXPRESSION_STATEMENT: return (EObject)createExpressionStatement();
			case JavaPackage.FIELD_ACCESS: return (EObject)createFieldAccess();
			case JavaPackage.FIELD_DECLARATION: return (EObject)createFieldDeclaration();
			case JavaPackage.FOR_STATEMENT: return (EObject)createForStatement();
			case JavaPackage.GUARDED_PATTERN: return (EObject)createGuardedPattern();
			case JavaPackage.IF_STATEMENT: return (EObject)createIfStatement();
			case JavaPackage.IMPLICIT_TYPE_DECLARATION: return (EObject)createImplicitTypeDeclaration();
			case JavaPackage.IMPORT_DECLARATION: return (EObject)createImportDeclaration();
			case JavaPackage.INFIX_EXPRESSION: return (EObject)createInfixExpression();
			case JavaPackage.INITIALIZER: return (EObject)createInitializer();
			case JavaPackage.INSTANCEOF_EXPRESSION: return (EObject)createInstanceofExpression();
			case JavaPackage.INTERFACE_DECLARATION: return (EObject)createInterfaceDeclaration();
			case JavaPackage.INTERSECTION_TYPE: return (EObject)createIntersectionType();
			case JavaPackage.JAVADOC: return (EObject)createJavadoc();
			case JavaPackage.JAVA_DOC_REGION: return (EObject)createJavaDocRegion();
			case JavaPackage.JAVA_DOC_TEXT_ELEMENT: return (EObject)createJavaDocTextElement();
			case JavaPackage.LABELED_STATEMENT: return (EObject)createLabeledStatement();
			case JavaPackage.LAMBDA_EXPRESSION: return (EObject)createLambdaExpression();
			case JavaPackage.LINE_COMMENT: return (EObject)createLineComment();
			case JavaPackage.MANIFEST: return (EObject)createManifest();
			case JavaPackage.MANIFEST_ATTRIBUTE: return (EObject)createManifestAttribute();
			case JavaPackage.MANIFEST_ENTRY: return (EObject)createManifestEntry();
			case JavaPackage.MEMBER_REF: return (EObject)createMemberRef();
			case JavaPackage.METHOD_DECLARATION: return (EObject)createMethodDeclaration();
			case JavaPackage.METHOD_INVOCATION: return (EObject)createMethodInvocation();
			case JavaPackage.METHOD_REF: return (EObject)createMethodRef();
			case JavaPackage.METHOD_REF_PARAMETER: return (EObject)createMethodRefParameter();
			case JavaPackage.MODEL: return (EObject)createModel();
			case JavaPackage.MODIFIER: return (EObject)createModifier();
			case JavaPackage.MODULE_DECLARATION: return (EObject)createModuleDeclaration();
			case JavaPackage.MODULE_MODIFIER: return (EObject)createModuleModifier();
			case JavaPackage.MODULE_QUALIFIED_NAME: return (EObject)createModuleQualifiedName();
			case JavaPackage.NAME_QUALIFIED_TYPE: return (EObject)createNameQualifiedType();
			case JavaPackage.NUMBER_LITERAL: return (EObject)createNumberLiteral();
			case JavaPackage.NULL_LITERAL: return (EObject)createNullLiteral();
			case JavaPackage.NULL_PATTERN: return (EObject)createNullPattern();
			case JavaPackage.OPENS_DIRECTIVE: return (EObject)createOpensDirective();
			case JavaPackage.PACKAGE: return (EObject)createPackage();
			case JavaPackage.PACKAGE_ACCESS: return (EObject)createPackageAccess();
			case JavaPackage.PARAMETERIZED_TYPE: return (EObject)createParameterizedType();
			case JavaPackage.PARENTHESIZED_EXPRESSION: return (EObject)createParenthesizedExpression();
			case JavaPackage.PATTERN_INSTANCEOF_EXPRESSION: return (EObject)createPatternInstanceofExpression();
			case JavaPackage.POSTFIX_EXPRESSION: return (EObject)createPostfixExpression();
			case JavaPackage.PREFIX_EXPRESSION: return (EObject)createPrefixExpression();
			case JavaPackage.PRIMITIVE_TYPE: return (EObject)createPrimitiveType();
			case JavaPackage.PRIMITIVE_TYPE_BOOLEAN: return (EObject)createPrimitiveTypeBoolean();
			case JavaPackage.PRIMITIVE_TYPE_BYTE: return (EObject)createPrimitiveTypeByte();
			case JavaPackage.PRIMITIVE_TYPE_CHAR: return (EObject)createPrimitiveTypeChar();
			case JavaPackage.PRIMITIVE_TYPE_DOUBLE: return (EObject)createPrimitiveTypeDouble();
			case JavaPackage.PRIMITIVE_TYPE_SHORT: return (EObject)createPrimitiveTypeShort();
			case JavaPackage.PRIMITIVE_TYPE_FLOAT: return (EObject)createPrimitiveTypeFloat();
			case JavaPackage.PRIMITIVE_TYPE_INT: return (EObject)createPrimitiveTypeInt();
			case JavaPackage.PRIMITIVE_TYPE_LONG: return (EObject)createPrimitiveTypeLong();
			case JavaPackage.PRIMITIVE_TYPE_VOID: return (EObject)createPrimitiveTypeVoid();
			case JavaPackage.PROVIDES_DIRECTIVE: return (EObject)createProvidesDirective();
			case JavaPackage.QUALIFIED_TYPE: return (EObject)createQualifiedType();
			case JavaPackage.RECORD_DECLARATION: return (EObject)createRecordDeclaration();
			case JavaPackage.RECORD_PATTERN: return (EObject)createRecordPattern();
			case JavaPackage.REQUIRES_DIRECTIVE: return (EObject)createRequiresDirective();
			case JavaPackage.RETURN_STATEMENT: return (EObject)createReturnStatement();
			case JavaPackage.SIMPLE_TYPE: return (EObject)createSimpleType();
			case JavaPackage.SINGLE_VARIABLE_ACCESS: return (EObject)createSingleVariableAccess();
			case JavaPackage.SINGLE_VARIABLE_DECLARATION: return (EObject)createSingleVariableDeclaration();
			case JavaPackage.STRING_LITERAL: return (EObject)createStringLiteral();
			case JavaPackage.SUPER_CONSTRUCTOR_INVOCATION: return (EObject)createSuperConstructorInvocation();
			case JavaPackage.SUPER_FIELD_ACCESS: return (EObject)createSuperFieldAccess();
			case JavaPackage.SUPER_METHOD_INVOCATION: return (EObject)createSuperMethodInvocation();
			case JavaPackage.SUPER_METHOD_REFERENCE: return (EObject)createSuperMethodReference();
			case JavaPackage.SWITCH_CASE: return (EObject)createSwitchCase();
			case JavaPackage.SWITCH_EXPRESSION: return (EObject)createSwitchExpression();
			case JavaPackage.SWITCH_STATEMENT: return (EObject)createSwitchStatement();
			case JavaPackage.SYNCHRONIZED_STATEMENT: return (EObject)createSynchronizedStatement();
			case JavaPackage.TAG_ELEMENT: return (EObject)createTagElement();
			case JavaPackage.TAG_PROPERTY: return (EObject)createTagProperty();
			case JavaPackage.TEXT_BLOCK: return (EObject)createTextBlock();
			case JavaPackage.TEXT_ELEMENT: return (EObject)createTextElement();
			case JavaPackage.THIS_EXPRESSION: return (EObject)createThisExpression();
			case JavaPackage.THROW_STATEMENT: return (EObject)createThrowStatement();
			case JavaPackage.TRY_STATEMENT: return (EObject)createTryStatement();
			case JavaPackage.TYPE_ACCESS: return (EObject)createTypeAccess();
			case JavaPackage.TYPE_DECLARATION_STATEMENT: return (EObject)createTypeDeclarationStatement();
			case JavaPackage.TYPE_LITERAL: return (EObject)createTypeLiteral();
			case JavaPackage.TYPE_METHOD_REFERENCE: return (EObject)createTypeMethodReference();
			case JavaPackage.TYPE_PARAMETER: return (EObject)createTypeParameter();
			case JavaPackage.TYPE_PATTERN: return (EObject)createTypePattern();
			case JavaPackage.UNION_TYPE: return (EObject)createUnionType();
			case JavaPackage.UNRESOLVED_ITEM: return (EObject)createUnresolvedItem();
			case JavaPackage.UNRESOLVED_ITEM_ACCESS: return (EObject)createUnresolvedItemAccess();
			case JavaPackage.UNRESOLVED_ANNOTATION_DECLARATION: return (EObject)createUnresolvedAnnotationDeclaration();
			case JavaPackage.UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION: return (EObject)createUnresolvedAnnotationTypeMemberDeclaration();
			case JavaPackage.UNRESOLVED_CLASS_DECLARATION: return (EObject)createUnresolvedClassDeclaration();
			case JavaPackage.UNRESOLVED_ENUM_DECLARATION: return (EObject)createUnresolvedEnumDeclaration();
			case JavaPackage.UNRESOLVED_INTERFACE_DECLARATION: return (EObject)createUnresolvedInterfaceDeclaration();
			case JavaPackage.UNRESOLVED_LABELED_STATEMENT: return (EObject)createUnresolvedLabeledStatement();
			case JavaPackage.UNRESOLVED_METHOD_DECLARATION: return (EObject)createUnresolvedMethodDeclaration();
			case JavaPackage.UNRESOLVED_SINGLE_VARIABLE_DECLARATION: return (EObject)createUnresolvedSingleVariableDeclaration();
			case JavaPackage.UNRESOLVED_TYPE: return (EObject)createUnresolvedType();
			case JavaPackage.UNRESOLVED_TYPE_DECLARATION: return (EObject)createUnresolvedTypeDeclaration();
			case JavaPackage.UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT: return (EObject)createUnresolvedVariableDeclarationFragment();
			case JavaPackage.USES_DIRECTIVE: return (EObject)createUsesDirective();
			case JavaPackage.VARIABLE_DECLARATION_EXPRESSION: return (EObject)createVariableDeclarationExpression();
			case JavaPackage.VARIABLE_DECLARATION_FRAGMENT: return (EObject)createVariableDeclarationFragment();
			case JavaPackage.VARIABLE_DECLARATION_STATEMENT: return (EObject)createVariableDeclarationStatement();
			case JavaPackage.WILD_CARD_TYPE: return (EObject)createWildCardType();
			case JavaPackage.WHILE_STATEMENT: return (EObject)createWhileStatement();
			case JavaPackage.YIELD_STATEMENT: return (EObject)createYieldStatement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JavaPackage.ASSIGNMENT_KIND:
				return createAssignmentKindFromString(eDataType, initialValue);
			case JavaPackage.INFIX_EXPRESSION_KIND:
				return createInfixExpressionKindFromString(eDataType, initialValue);
			case JavaPackage.INHERITANCE_KIND:
				return createInheritanceKindFromString(eDataType, initialValue);
			case JavaPackage.POSTFIX_EXPRESSION_KIND:
				return createPostfixExpressionKindFromString(eDataType, initialValue);
			case JavaPackage.PREFIX_EXPRESSION_KIND:
				return createPrefixExpressionKindFromString(eDataType, initialValue);
			case JavaPackage.VISIBILITY_KIND:
				return createVisibilityKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JavaPackage.ASSIGNMENT_KIND:
				return convertAssignmentKindToString(eDataType, instanceValue);
			case JavaPackage.INFIX_EXPRESSION_KIND:
				return convertInfixExpressionKindToString(eDataType, instanceValue);
			case JavaPackage.INHERITANCE_KIND:
				return convertInheritanceKindToString(eDataType, instanceValue);
			case JavaPackage.POSTFIX_EXPRESSION_KIND:
				return convertPostfixExpressionKindToString(eDataType, instanceValue);
			case JavaPackage.PREFIX_EXPRESSION_KIND:
				return convertPrefixExpressionKindToString(eDataType, instanceValue);
			case JavaPackage.VISIBILITY_KIND:
				return convertVisibilityKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Archive createArchive() {
		ArchiveImpl archive = new ArchiveImpl();
		return archive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssertStatement createAssertStatement() {
		AssertStatementImpl assertStatement = new AssertStatementImpl();
		return assertStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValuePair createAnnotationMemberValuePair() {
		AnnotationMemberValuePairImpl annotationMemberValuePair = new AnnotationMemberValuePairImpl();
		return annotationMemberValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeDeclaration createAnnotationTypeDeclaration() {
		AnnotationTypeDeclarationImpl annotationTypeDeclaration = new AnnotationTypeDeclarationImpl();
		return annotationTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeMemberDeclaration createAnnotationTypeMemberDeclaration() {
		AnnotationTypeMemberDeclarationImpl annotationTypeMemberDeclaration = new AnnotationTypeMemberDeclarationImpl();
		return annotationTypeMemberDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassDeclaration createAnonymousClassDeclaration() {
		AnonymousClassDeclarationImpl anonymousClassDeclaration = new AnonymousClassDeclarationImpl();
		return anonymousClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayAccess createArrayAccess() {
		ArrayAccessImpl arrayAccess = new ArrayAccessImpl();
		return arrayAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayCreation createArrayCreation() {
		ArrayCreationImpl arrayCreation = new ArrayCreationImpl();
		return arrayCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayInitializer createArrayInitializer() {
		ArrayInitializerImpl arrayInitializer = new ArrayInitializerImpl();
		return arrayInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayLengthAccess createArrayLengthAccess() {
		ArrayLengthAccessImpl arrayLengthAccess = new ArrayLengthAccessImpl();
		return arrayLengthAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayType createArrayType() {
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockComment createBlockComment() {
		BlockCommentImpl blockComment = new BlockCommentImpl();
		return blockComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BreakStatement createBreakStatement() {
		BreakStatementImpl breakStatement = new BreakStatementImpl();
		return breakStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseDefaultExpression createCaseDefaultExpression() {
		CaseDefaultExpressionImpl caseDefaultExpression = new CaseDefaultExpressionImpl();
		return caseDefaultExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CastExpression createCastExpression() {
		CastExpressionImpl castExpression = new CastExpressionImpl();
		return castExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatchClause createCatchClause() {
		CatchClauseImpl catchClause = new CatchClauseImpl();
		return catchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterLiteral createCharacterLiteral() {
		CharacterLiteralImpl characterLiteral = new CharacterLiteralImpl();
		return characterLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassFile createClassFile() {
		ClassFileImpl classFile = new ClassFileImpl();
		return classFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInstanceCreation createClassInstanceCreation() {
		ClassInstanceCreationImpl classInstanceCreation = new ClassInstanceCreationImpl();
		return classInstanceCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorDeclaration createConstructorDeclaration() {
		ConstructorDeclarationImpl constructorDeclaration = new ConstructorDeclarationImpl();
		return constructorDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalExpression createConditionalExpression() {
		ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
		return conditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorInvocation createConstructorInvocation() {
		ConstructorInvocationImpl constructorInvocation = new ConstructorInvocationImpl();
		return constructorInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclaration createClassDeclaration() {
		ClassDeclarationImpl classDeclaration = new ClassDeclarationImpl();
		return classDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompilationUnit createCompilationUnit() {
		CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
		return compilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinueStatement createContinueStatement() {
		ContinueStatementImpl continueStatement = new ContinueStatementImpl();
		return continueStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoStatement createDoStatement() {
		DoStatementImpl doStatement = new DoStatementImpl();
		return doStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EitherOrMultiPattern createEitherOrMultiPattern() {
		EitherOrMultiPatternImpl eitherOrMultiPattern = new EitherOrMultiPatternImpl();
		return eitherOrMultiPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmptyStatement createEmptyStatement() {
		EmptyStatementImpl emptyStatement = new EmptyStatementImpl();
		return emptyStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnhancedForStatement createEnhancedForStatement() {
		EnhancedForStatementImpl enhancedForStatement = new EnhancedForStatementImpl();
		return enhancedForStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumConstantDeclaration createEnumConstantDeclaration() {
		EnumConstantDeclarationImpl enumConstantDeclaration = new EnumConstantDeclarationImpl();
		return enumConstantDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumDeclaration createEnumDeclaration() {
		EnumDeclarationImpl enumDeclaration = new EnumDeclarationImpl();
		return enumDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExportsDirective createExportsDirective() {
		ExportsDirectiveImpl exportsDirective = new ExportsDirectiveImpl();
		return exportsDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionStatement createExpressionStatement() {
		ExpressionStatementImpl expressionStatement = new ExpressionStatementImpl();
		return expressionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccess createFieldAccess() {
		FieldAccessImpl fieldAccess = new FieldAccessImpl();
		return fieldAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldDeclaration createFieldDeclaration() {
		FieldDeclarationImpl fieldDeclaration = new FieldDeclarationImpl();
		return fieldDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForStatement createForStatement() {
		ForStatementImpl forStatement = new ForStatementImpl();
		return forStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuardedPattern createGuardedPattern() {
		GuardedPatternImpl guardedPattern = new GuardedPatternImpl();
		return guardedPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplicitTypeDeclaration createImplicitTypeDeclaration() {
		ImplicitTypeDeclarationImpl implicitTypeDeclaration = new ImplicitTypeDeclarationImpl();
		return implicitTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportDeclaration createImportDeclaration() {
		ImportDeclarationImpl importDeclaration = new ImportDeclarationImpl();
		return importDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfixExpression createInfixExpression() {
		InfixExpressionImpl infixExpression = new InfixExpressionImpl();
		return infixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Initializer createInitializer() {
		InitializerImpl initializer = new InitializerImpl();
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceofExpression createInstanceofExpression() {
		InstanceofExpressionImpl instanceofExpression = new InstanceofExpressionImpl();
		return instanceofExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceDeclaration createInterfaceDeclaration() {
		InterfaceDeclarationImpl interfaceDeclaration = new InterfaceDeclarationImpl();
		return interfaceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntersectionType createIntersectionType() {
		IntersectionTypeImpl intersectionType = new IntersectionTypeImpl();
		return intersectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Javadoc createJavadoc() {
		JavadocImpl javadoc = new JavadocImpl();
		return javadoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaDocRegion createJavaDocRegion() {
		JavaDocRegionImpl javaDocRegion = new JavaDocRegionImpl();
		return javaDocRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaDocTextElement createJavaDocTextElement() {
		JavaDocTextElementImpl javaDocTextElement = new JavaDocTextElementImpl();
		return javaDocTextElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledStatement createLabeledStatement() {
		LabeledStatementImpl labeledStatement = new LabeledStatementImpl();
		return labeledStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineComment createLineComment() {
		LineCommentImpl lineComment = new LineCommentImpl();
		return lineComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Manifest createManifest() {
		ManifestImpl manifest = new ManifestImpl();
		return manifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManifestAttribute createManifestAttribute() {
		ManifestAttributeImpl manifestAttribute = new ManifestAttributeImpl();
		return manifestAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManifestEntry createManifestEntry() {
		ManifestEntryImpl manifestEntry = new ManifestEntryImpl();
		return manifestEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberRef createMemberRef() {
		MemberRefImpl memberRef = new MemberRefImpl();
		return memberRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDeclaration createMethodDeclaration() {
		MethodDeclarationImpl methodDeclaration = new MethodDeclarationImpl();
		return methodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodInvocation createMethodInvocation() {
		MethodInvocationImpl methodInvocation = new MethodInvocationImpl();
		return methodInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodRef createMethodRef() {
		MethodRefImpl methodRef = new MethodRefImpl();
		return methodRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodRefParameter createMethodRefParameter() {
		MethodRefParameterImpl methodRefParameter = new MethodRefParameterImpl();
		return methodRefParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier createModifier() {
		ModifierImpl modifier = new ModifierImpl();
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleDeclaration createModuleDeclaration() {
		ModuleDeclarationImpl moduleDeclaration = new ModuleDeclarationImpl();
		return moduleDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleModifier createModuleModifier() {
		ModuleModifierImpl moduleModifier = new ModuleModifierImpl();
		return moduleModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleQualifiedName createModuleQualifiedName() {
		ModuleQualifiedNameImpl moduleQualifiedName = new ModuleQualifiedNameImpl();
		return moduleQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameQualifiedType createNameQualifiedType() {
		NameQualifiedTypeImpl nameQualifiedType = new NameQualifiedTypeImpl();
		return nameQualifiedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberLiteral createNumberLiteral() {
		NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
		return numberLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullLiteral createNullLiteral() {
		NullLiteralImpl nullLiteral = new NullLiteralImpl();
		return nullLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullPattern createNullPattern() {
		NullPatternImpl nullPattern = new NullPatternImpl();
		return nullPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpensDirective createOpensDirective() {
		OpensDirectiveImpl opensDirective = new OpensDirectiveImpl();
		return opensDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.modisco.java.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageAccess createPackageAccess() {
		PackageAccessImpl packageAccess = new PackageAccessImpl();
		return packageAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedType createParameterizedType() {
		ParameterizedTypeImpl parameterizedType = new ParameterizedTypeImpl();
		return parameterizedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParenthesizedExpression createParenthesizedExpression() {
		ParenthesizedExpressionImpl parenthesizedExpression = new ParenthesizedExpressionImpl();
		return parenthesizedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatternInstanceofExpression createPatternInstanceofExpression() {
		PatternInstanceofExpressionImpl patternInstanceofExpression = new PatternInstanceofExpressionImpl();
		return patternInstanceofExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostfixExpression createPostfixExpression() {
		PostfixExpressionImpl postfixExpression = new PostfixExpressionImpl();
		return postfixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrefixExpression createPrefixExpression() {
		PrefixExpressionImpl prefixExpression = new PrefixExpressionImpl();
		return prefixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeBoolean createPrimitiveTypeBoolean() {
		PrimitiveTypeBooleanImpl primitiveTypeBoolean = new PrimitiveTypeBooleanImpl();
		return primitiveTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeByte createPrimitiveTypeByte() {
		PrimitiveTypeByteImpl primitiveTypeByte = new PrimitiveTypeByteImpl();
		return primitiveTypeByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeChar createPrimitiveTypeChar() {
		PrimitiveTypeCharImpl primitiveTypeChar = new PrimitiveTypeCharImpl();
		return primitiveTypeChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeDouble createPrimitiveTypeDouble() {
		PrimitiveTypeDoubleImpl primitiveTypeDouble = new PrimitiveTypeDoubleImpl();
		return primitiveTypeDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeShort createPrimitiveTypeShort() {
		PrimitiveTypeShortImpl primitiveTypeShort = new PrimitiveTypeShortImpl();
		return primitiveTypeShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeFloat createPrimitiveTypeFloat() {
		PrimitiveTypeFloatImpl primitiveTypeFloat = new PrimitiveTypeFloatImpl();
		return primitiveTypeFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeInt createPrimitiveTypeInt() {
		PrimitiveTypeIntImpl primitiveTypeInt = new PrimitiveTypeIntImpl();
		return primitiveTypeInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeLong createPrimitiveTypeLong() {
		PrimitiveTypeLongImpl primitiveTypeLong = new PrimitiveTypeLongImpl();
		return primitiveTypeLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeVoid createPrimitiveTypeVoid() {
		PrimitiveTypeVoidImpl primitiveTypeVoid = new PrimitiveTypeVoidImpl();
		return primitiveTypeVoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidesDirective createProvidesDirective() {
		ProvidesDirectiveImpl providesDirective = new ProvidesDirectiveImpl();
		return providesDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualifiedType createQualifiedType() {
		QualifiedTypeImpl qualifiedType = new QualifiedTypeImpl();
		return qualifiedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordDeclaration createRecordDeclaration() {
		RecordDeclarationImpl recordDeclaration = new RecordDeclarationImpl();
		return recordDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordPattern createRecordPattern() {
		RecordPatternImpl recordPattern = new RecordPatternImpl();
		return recordPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiresDirective createRequiresDirective() {
		RequiresDirectiveImpl requiresDirective = new RequiresDirectiveImpl();
		return requiresDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnStatement createReturnStatement() {
		ReturnStatementImpl returnStatement = new ReturnStatementImpl();
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleType createSimpleType() {
		SimpleTypeImpl simpleType = new SimpleTypeImpl();
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableAccess createSingleVariableAccess() {
		SingleVariableAccessImpl singleVariableAccess = new SingleVariableAccessImpl();
		return singleVariableAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableDeclaration createSingleVariableDeclaration() {
		SingleVariableDeclarationImpl singleVariableDeclaration = new SingleVariableDeclarationImpl();
		return singleVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperConstructorInvocation createSuperConstructorInvocation() {
		SuperConstructorInvocationImpl superConstructorInvocation = new SuperConstructorInvocationImpl();
		return superConstructorInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperFieldAccess createSuperFieldAccess() {
		SuperFieldAccessImpl superFieldAccess = new SuperFieldAccessImpl();
		return superFieldAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperMethodInvocation createSuperMethodInvocation() {
		SuperMethodInvocationImpl superMethodInvocation = new SuperMethodInvocationImpl();
		return superMethodInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperMethodReference createSuperMethodReference() {
		SuperMethodReferenceImpl superMethodReference = new SuperMethodReferenceImpl();
		return superMethodReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwitchCase createSwitchCase() {
		SwitchCaseImpl switchCase = new SwitchCaseImpl();
		return switchCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwitchExpression createSwitchExpression() {
		SwitchExpressionImpl switchExpression = new SwitchExpressionImpl();
		return switchExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwitchStatement createSwitchStatement() {
		SwitchStatementImpl switchStatement = new SwitchStatementImpl();
		return switchStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynchronizedStatement createSynchronizedStatement() {
		SynchronizedStatementImpl synchronizedStatement = new SynchronizedStatementImpl();
		return synchronizedStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagElement createTagElement() {
		TagElementImpl tagElement = new TagElementImpl();
		return tagElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagProperty createTagProperty() {
		TagPropertyImpl tagProperty = new TagPropertyImpl();
		return tagProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextBlock createTextBlock() {
		TextBlockImpl textBlock = new TextBlockImpl();
		return textBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextElement createTextElement() {
		TextElementImpl textElement = new TextElementImpl();
		return textElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThisExpression createThisExpression() {
		ThisExpressionImpl thisExpression = new ThisExpressionImpl();
		return thisExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThrowStatement createThrowStatement() {
		ThrowStatementImpl throwStatement = new ThrowStatementImpl();
		return throwStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TryStatement createTryStatement() {
		TryStatementImpl tryStatement = new TryStatementImpl();
		return tryStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess createTypeAccess() {
		TypeAccessImpl typeAccess = new TypeAccessImpl();
		return typeAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDeclarationStatement createTypeDeclarationStatement() {
		TypeDeclarationStatementImpl typeDeclarationStatement = new TypeDeclarationStatementImpl();
		return typeDeclarationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeLiteral createTypeLiteral() {
		TypeLiteralImpl typeLiteral = new TypeLiteralImpl();
		return typeLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeMethodReference createTypeMethodReference() {
		TypeMethodReferenceImpl typeMethodReference = new TypeMethodReferenceImpl();
		return typeMethodReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeParameter createTypeParameter() {
		TypeParameterImpl typeParameter = new TypeParameterImpl();
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypePattern createTypePattern() {
		TypePatternImpl typePattern = new TypePatternImpl();
		return typePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedItem createUnresolvedItem() {
		UnresolvedItemImpl unresolvedItem = new UnresolvedItemImpl();
		return unresolvedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedItemAccess createUnresolvedItemAccess() {
		UnresolvedItemAccessImpl unresolvedItemAccess = new UnresolvedItemAccessImpl();
		return unresolvedItemAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedAnnotationDeclaration createUnresolvedAnnotationDeclaration() {
		UnresolvedAnnotationDeclarationImpl unresolvedAnnotationDeclaration = new UnresolvedAnnotationDeclarationImpl();
		return unresolvedAnnotationDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedAnnotationTypeMemberDeclaration createUnresolvedAnnotationTypeMemberDeclaration() {
		UnresolvedAnnotationTypeMemberDeclarationImpl unresolvedAnnotationTypeMemberDeclaration = new UnresolvedAnnotationTypeMemberDeclarationImpl();
		return unresolvedAnnotationTypeMemberDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedClassDeclaration createUnresolvedClassDeclaration() {
		UnresolvedClassDeclarationImpl unresolvedClassDeclaration = new UnresolvedClassDeclarationImpl();
		return unresolvedClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedEnumDeclaration createUnresolvedEnumDeclaration() {
		UnresolvedEnumDeclarationImpl unresolvedEnumDeclaration = new UnresolvedEnumDeclarationImpl();
		return unresolvedEnumDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedInterfaceDeclaration createUnresolvedInterfaceDeclaration() {
		UnresolvedInterfaceDeclarationImpl unresolvedInterfaceDeclaration = new UnresolvedInterfaceDeclarationImpl();
		return unresolvedInterfaceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedLabeledStatement createUnresolvedLabeledStatement() {
		UnresolvedLabeledStatementImpl unresolvedLabeledStatement = new UnresolvedLabeledStatementImpl();
		return unresolvedLabeledStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedMethodDeclaration createUnresolvedMethodDeclaration() {
		UnresolvedMethodDeclarationImpl unresolvedMethodDeclaration = new UnresolvedMethodDeclarationImpl();
		return unresolvedMethodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedSingleVariableDeclaration createUnresolvedSingleVariableDeclaration() {
		UnresolvedSingleVariableDeclarationImpl unresolvedSingleVariableDeclaration = new UnresolvedSingleVariableDeclarationImpl();
		return unresolvedSingleVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedType createUnresolvedType() {
		UnresolvedTypeImpl unresolvedType = new UnresolvedTypeImpl();
		return unresolvedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedTypeDeclaration createUnresolvedTypeDeclaration() {
		UnresolvedTypeDeclarationImpl unresolvedTypeDeclaration = new UnresolvedTypeDeclarationImpl();
		return unresolvedTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedVariableDeclarationFragment createUnresolvedVariableDeclarationFragment() {
		UnresolvedVariableDeclarationFragmentImpl unresolvedVariableDeclarationFragment = new UnresolvedVariableDeclarationFragmentImpl();
		return unresolvedVariableDeclarationFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsesDirective createUsesDirective() {
		UsesDirectiveImpl usesDirective = new UsesDirectiveImpl();
		return usesDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationExpression createVariableDeclarationExpression() {
		VariableDeclarationExpressionImpl variableDeclarationExpression = new VariableDeclarationExpressionImpl();
		return variableDeclarationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationFragment createVariableDeclarationFragment() {
		VariableDeclarationFragmentImpl variableDeclarationFragment = new VariableDeclarationFragmentImpl();
		return variableDeclarationFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationStatement createVariableDeclarationStatement() {
		VariableDeclarationStatementImpl variableDeclarationStatement = new VariableDeclarationStatementImpl();
		return variableDeclarationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WildCardType createWildCardType() {
		WildCardTypeImpl wildCardType = new WildCardTypeImpl();
		return wildCardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YieldStatement createYieldStatement() {
		YieldStatementImpl yieldStatement = new YieldStatementImpl();
		return yieldStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentKind createAssignmentKindFromString(EDataType eDataType, String initialValue) {
		AssignmentKind result = AssignmentKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssignmentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfixExpressionKind createInfixExpressionKindFromString(EDataType eDataType, String initialValue) {
		InfixExpressionKind result = InfixExpressionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInfixExpressionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceKind createInheritanceKindFromString(EDataType eDataType, String initialValue) {
		InheritanceKind result = InheritanceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInheritanceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostfixExpressionKind createPostfixExpressionKindFromString(EDataType eDataType, String initialValue) {
		PostfixExpressionKind result = PostfixExpressionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPostfixExpressionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixExpressionKind createPrefixExpressionKindFromString(EDataType eDataType, String initialValue) {
		PrefixExpressionKind result = PrefixExpressionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrefixExpressionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue) {
		VisibilityKind result = VisibilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaPackage getJavaPackage() {
		return (JavaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JavaPackage getPackage() {
		return JavaPackage.eINSTANCE;
	}

	@Override
	public CreationReference createCreationReference() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ExpressionMethodReference createExpressionMethodReference() {
		throw new UnsupportedOperationException();
	}

	@Override
	public LambdaExpression createLambdaExpression() {
		throw new UnsupportedOperationException();
	}

	@Override
	public UnionType createUnionType() {
		throw new UnsupportedOperationException();
	}

} //JavaFactoryImpl
