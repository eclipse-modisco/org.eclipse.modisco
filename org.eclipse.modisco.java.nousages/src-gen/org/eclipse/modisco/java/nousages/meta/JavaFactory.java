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
package org.eclipse.modisco.java.nousages.meta;

import org.eclipse.emf.ecore.EFactory;
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
import org.eclipse.modisco.java.PrefixExpression;
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
import org.eclipse.modisco.java.WhileStatement;
import org.eclipse.modisco.java.WildCardType;
import org.eclipse.modisco.java.YieldStatement;
import org.eclipse.modisco.java.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.java.nousages.meta.JavaPackage
 */
public interface JavaFactory extends
		org.eclipse.modisco.java.emf.JavaFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaFactory eINSTANCE = org.eclipse.modisco.java.nousages.impl.JavaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Archive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archive</em>'.
	 * @generated
	 */
	Archive createArchive();

	/**
	 * Returns a new object of class '<em>Assert Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert Statement</em>'.
	 * @generated
	 */
	AssertStatement createAssertStatement();

	/**
	 * Returns a new object of class '<em>Annotation Member Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Member Value Pair</em>'.
	 * @generated
	 */
	AnnotationMemberValuePair createAnnotationMemberValuePair();

	/**
	 * Returns a new object of class '<em>Annotation Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Type Declaration</em>'.
	 * @generated
	 */
	AnnotationTypeDeclaration createAnnotationTypeDeclaration();

	/**
	 * Returns a new object of class '<em>Annotation Type Member Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Type Member Declaration</em>'.
	 * @generated
	 */
	AnnotationTypeMemberDeclaration createAnnotationTypeMemberDeclaration();

	/**
	 * Returns a new object of class '<em>Anonymous Class Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymous Class Declaration</em>'.
	 * @generated
	 */
	AnonymousClassDeclaration createAnonymousClassDeclaration();

	/**
	 * Returns a new object of class '<em>Array Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Access</em>'.
	 * @generated
	 */
	ArrayAccess createArrayAccess();

	/**
	 * Returns a new object of class '<em>Array Creation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Creation</em>'.
	 * @generated
	 */
	ArrayCreation createArrayCreation();

	/**
	 * Returns a new object of class '<em>Array Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Initializer</em>'.
	 * @generated
	 */
	ArrayInitializer createArrayInitializer();

	/**
	 * Returns a new object of class '<em>Array Length Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Length Access</em>'.
	 * @generated
	 */
	ArrayLengthAccess createArrayLengthAccess();

	/**
	 * Returns a new object of class '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Type</em>'.
	 * @generated
	 */
	ArrayType createArrayType();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	Assignment createAssignment();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns a new object of class '<em>Block Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Comment</em>'.
	 * @generated
	 */
	BlockComment createBlockComment();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Break Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Break Statement</em>'.
	 * @generated
	 */
	BreakStatement createBreakStatement();

	/**
	 * Returns a new object of class '<em>Case Default Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Default Expression</em>'.
	 * @generated
	 */
	CaseDefaultExpression createCaseDefaultExpression();

	/**
	 * Returns a new object of class '<em>Cast Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cast Expression</em>'.
	 * @generated
	 */
	CastExpression createCastExpression();

	/**
	 * Returns a new object of class '<em>Catch Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catch Clause</em>'.
	 * @generated
	 */
	CatchClause createCatchClause();

	/**
	 * Returns a new object of class '<em>Character Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Literal</em>'.
	 * @generated
	 */
	CharacterLiteral createCharacterLiteral();

	/**
	 * Returns a new object of class '<em>Class File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class File</em>'.
	 * @generated
	 */
	ClassFile createClassFile();

	/**
	 * Returns a new object of class '<em>Class Instance Creation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Instance Creation</em>'.
	 * @generated
	 */
	ClassInstanceCreation createClassInstanceCreation();

	/**
	 * Returns a new object of class '<em>Constructor Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Declaration</em>'.
	 * @generated
	 */
	ConstructorDeclaration createConstructorDeclaration();

	/**
	 * Returns a new object of class '<em>Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Expression</em>'.
	 * @generated
	 */
	ConditionalExpression createConditionalExpression();

	/**
	 * Returns a new object of class '<em>Constructor Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Invocation</em>'.
	 * @generated
	 */
	ConstructorInvocation createConstructorInvocation();

	/**
	 * Returns a new object of class '<em>Class Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Declaration</em>'.
	 * @generated
	 */
	ClassDeclaration createClassDeclaration();

	/**
	 * Returns a new object of class '<em>Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compilation Unit</em>'.
	 * @generated
	 */
	CompilationUnit createCompilationUnit();

	/**
	 * Returns a new object of class '<em>Continue Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continue Statement</em>'.
	 * @generated
	 */
	ContinueStatement createContinueStatement();

	/**
	 * Returns a new object of class '<em>Creation Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creation Reference</em>'.
	 * @generated
	 */
	CreationReference createCreationReference();

	/**
	 * Returns a new object of class '<em>Do Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Do Statement</em>'.
	 * @generated
	 */
	DoStatement createDoStatement();

	/**
	 * Returns a new object of class '<em>Either Or Multi Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Either Or Multi Pattern</em>'.
	 * @generated
	 */
	EitherOrMultiPattern createEitherOrMultiPattern();

	/**
	 * Returns a new object of class '<em>Empty Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty Statement</em>'.
	 * @generated
	 */
	EmptyStatement createEmptyStatement();

	/**
	 * Returns a new object of class '<em>Enhanced For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enhanced For Statement</em>'.
	 * @generated
	 */
	EnhancedForStatement createEnhancedForStatement();

	/**
	 * Returns a new object of class '<em>Enum Constant Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Constant Declaration</em>'.
	 * @generated
	 */
	EnumConstantDeclaration createEnumConstantDeclaration();

	/**
	 * Returns a new object of class '<em>Enum Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Declaration</em>'.
	 * @generated
	 */
	EnumDeclaration createEnumDeclaration();

	/**
	 * Returns a new object of class '<em>Exports Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exports Directive</em>'.
	 * @generated
	 */
	ExportsDirective createExportsDirective();

	/**
	 * Returns a new object of class '<em>Expression Method Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Method Reference</em>'.
	 * @generated
	 */
	ExpressionMethodReference createExpressionMethodReference();

	/**
	 * Returns a new object of class '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Statement</em>'.
	 * @generated
	 */
	ExpressionStatement createExpressionStatement();

	/**
	 * Returns a new object of class '<em>Field Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Access</em>'.
	 * @generated
	 */
	FieldAccess createFieldAccess();

	/**
	 * Returns a new object of class '<em>Field Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Declaration</em>'.
	 * @generated
	 */
	FieldDeclaration createFieldDeclaration();

	/**
	 * Returns a new object of class '<em>For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Statement</em>'.
	 * @generated
	 */
	ForStatement createForStatement();

	/**
	 * Returns a new object of class '<em>Guarded Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guarded Pattern</em>'.
	 * @generated
	 */
	GuardedPattern createGuardedPattern();

	/**
	 * Returns a new object of class '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement</em>'.
	 * @generated
	 */
	IfStatement createIfStatement();

	/**
	 * Returns a new object of class '<em>Implicit Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implicit Type Declaration</em>'.
	 * @generated
	 */
	ImplicitTypeDeclaration createImplicitTypeDeclaration();

	/**
	 * Returns a new object of class '<em>Import Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Declaration</em>'.
	 * @generated
	 */
	ImportDeclaration createImportDeclaration();

	/**
	 * Returns a new object of class '<em>Infix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infix Expression</em>'.
	 * @generated
	 */
	InfixExpression createInfixExpression();

	/**
	 * Returns a new object of class '<em>Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initializer</em>'.
	 * @generated
	 */
	Initializer createInitializer();

	/**
	 * Returns a new object of class '<em>Instanceof Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instanceof Expression</em>'.
	 * @generated
	 */
	InstanceofExpression createInstanceofExpression();

	/**
	 * Returns a new object of class '<em>Interface Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Declaration</em>'.
	 * @generated
	 */
	InterfaceDeclaration createInterfaceDeclaration();

	/**
	 * Returns a new object of class '<em>Intersection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intersection Type</em>'.
	 * @generated
	 */
	IntersectionType createIntersectionType();

	/**
	 * Returns a new object of class '<em>Javadoc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Javadoc</em>'.
	 * @generated
	 */
	Javadoc createJavadoc();

	/**
	 * Returns a new object of class '<em>Doc Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doc Region</em>'.
	 * @generated
	 */
	JavaDocRegion createJavaDocRegion();

	/**
	 * Returns a new object of class '<em>Doc Text Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doc Text Element</em>'.
	 * @generated
	 */
	JavaDocTextElement createJavaDocTextElement();

	/**
	 * Returns a new object of class '<em>Labeled Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labeled Statement</em>'.
	 * @generated
	 */
	LabeledStatement createLabeledStatement();

	/**
	 * Returns a new object of class '<em>Lambda Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lambda Expression</em>'.
	 * @generated
	 */
	LambdaExpression createLambdaExpression();

	/**
	 * Returns a new object of class '<em>Line Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Comment</em>'.
	 * @generated
	 */
	LineComment createLineComment();

	/**
	 * Returns a new object of class '<em>Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manifest</em>'.
	 * @generated
	 */
	Manifest createManifest();

	/**
	 * Returns a new object of class '<em>Manifest Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manifest Attribute</em>'.
	 * @generated
	 */
	ManifestAttribute createManifestAttribute();

	/**
	 * Returns a new object of class '<em>Manifest Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manifest Entry</em>'.
	 * @generated
	 */
	ManifestEntry createManifestEntry();

	/**
	 * Returns a new object of class '<em>Member Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member Ref</em>'.
	 * @generated
	 */
	MemberRef createMemberRef();

	/**
	 * Returns a new object of class '<em>Method Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Declaration</em>'.
	 * @generated
	 */
	MethodDeclaration createMethodDeclaration();

	/**
	 * Returns a new object of class '<em>Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Invocation</em>'.
	 * @generated
	 */
	MethodInvocation createMethodInvocation();

	/**
	 * Returns a new object of class '<em>Method Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Ref</em>'.
	 * @generated
	 */
	MethodRef createMethodRef();

	/**
	 * Returns a new object of class '<em>Method Ref Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Ref Parameter</em>'.
	 * @generated
	 */
	MethodRefParameter createMethodRefParameter();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modifier</em>'.
	 * @generated
	 */
	Modifier createModifier();

	/**
	 * Returns a new object of class '<em>Module Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Declaration</em>'.
	 * @generated
	 */
	ModuleDeclaration createModuleDeclaration();

	/**
	 * Returns a new object of class '<em>Module Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Modifier</em>'.
	 * @generated
	 */
	ModuleModifier createModuleModifier();

	/**
	 * Returns a new object of class '<em>Module Qualified Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Qualified Name</em>'.
	 * @generated
	 */
	ModuleQualifiedName createModuleQualifiedName();

	/**
	 * Returns a new object of class '<em>Name Qualified Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Qualified Type</em>'.
	 * @generated
	 */
	NameQualifiedType createNameQualifiedType();

	/**
	 * Returns a new object of class '<em>Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Literal</em>'.
	 * @generated
	 */
	NumberLiteral createNumberLiteral();

	/**
	 * Returns a new object of class '<em>Null Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Literal</em>'.
	 * @generated
	 */
	NullLiteral createNullLiteral();

	/**
	 * Returns a new object of class '<em>Null Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Pattern</em>'.
	 * @generated
	 */
	NullPattern createNullPattern();

	/**
	 * Returns a new object of class '<em>Opens Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opens Directive</em>'.
	 * @generated
	 */
	OpensDirective createOpensDirective();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	org.eclipse.modisco.java.Package createPackage();

	/**
	 * Returns a new object of class '<em>Package Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Access</em>'.
	 * @generated
	 */
	PackageAccess createPackageAccess();

	/**
	 * Returns a new object of class '<em>Parameterized Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameterized Type</em>'.
	 * @generated
	 */
	ParameterizedType createParameterizedType();

	/**
	 * Returns a new object of class '<em>Parenthesized Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parenthesized Expression</em>'.
	 * @generated
	 */
	ParenthesizedExpression createParenthesizedExpression();

	/**
	 * Returns a new object of class '<em>Pattern Instanceof Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Instanceof Expression</em>'.
	 * @generated
	 */
	PatternInstanceofExpression createPatternInstanceofExpression();

	/**
	 * Returns a new object of class '<em>Postfix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postfix Expression</em>'.
	 * @generated
	 */
	PostfixExpression createPostfixExpression();

	/**
	 * Returns a new object of class '<em>Prefix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prefix Expression</em>'.
	 * @generated
	 */
	PrefixExpression createPrefixExpression();

	/**
	 * Returns a new object of class '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type</em>'.
	 * @generated
	 */
	PrimitiveType createPrimitiveType();

	/**
	 * Returns a new object of class '<em>Primitive Type Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Boolean</em>'.
	 * @generated
	 */
	PrimitiveTypeBoolean createPrimitiveTypeBoolean();

	/**
	 * Returns a new object of class '<em>Primitive Type Byte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Byte</em>'.
	 * @generated
	 */
	PrimitiveTypeByte createPrimitiveTypeByte();

	/**
	 * Returns a new object of class '<em>Primitive Type Char</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Char</em>'.
	 * @generated
	 */
	PrimitiveTypeChar createPrimitiveTypeChar();

	/**
	 * Returns a new object of class '<em>Primitive Type Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Double</em>'.
	 * @generated
	 */
	PrimitiveTypeDouble createPrimitiveTypeDouble();

	/**
	 * Returns a new object of class '<em>Primitive Type Short</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Short</em>'.
	 * @generated
	 */
	PrimitiveTypeShort createPrimitiveTypeShort();

	/**
	 * Returns a new object of class '<em>Primitive Type Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Float</em>'.
	 * @generated
	 */
	PrimitiveTypeFloat createPrimitiveTypeFloat();

	/**
	 * Returns a new object of class '<em>Primitive Type Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Int</em>'.
	 * @generated
	 */
	PrimitiveTypeInt createPrimitiveTypeInt();

	/**
	 * Returns a new object of class '<em>Primitive Type Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Long</em>'.
	 * @generated
	 */
	PrimitiveTypeLong createPrimitiveTypeLong();

	/**
	 * Returns a new object of class '<em>Primitive Type Void</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Void</em>'.
	 * @generated
	 */
	PrimitiveTypeVoid createPrimitiveTypeVoid();

	/**
	 * Returns a new object of class '<em>Provides Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provides Directive</em>'.
	 * @generated
	 */
	ProvidesDirective createProvidesDirective();

	/**
	 * Returns a new object of class '<em>Qualified Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualified Type</em>'.
	 * @generated
	 */
	QualifiedType createQualifiedType();

	/**
	 * Returns a new object of class '<em>Record Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Declaration</em>'.
	 * @generated
	 */
	RecordDeclaration createRecordDeclaration();

	/**
	 * Returns a new object of class '<em>Record Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Pattern</em>'.
	 * @generated
	 */
	RecordPattern createRecordPattern();

	/**
	 * Returns a new object of class '<em>Requires Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requires Directive</em>'.
	 * @generated
	 */
	RequiresDirective createRequiresDirective();

	/**
	 * Returns a new object of class '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Statement</em>'.
	 * @generated
	 */
	ReturnStatement createReturnStatement();

	/**
	 * Returns a new object of class '<em>Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Type</em>'.
	 * @generated
	 */
	SimpleType createSimpleType();

	/**
	 * Returns a new object of class '<em>Single Variable Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Variable Access</em>'.
	 * @generated
	 */
	SingleVariableAccess createSingleVariableAccess();

	/**
	 * Returns a new object of class '<em>Single Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Variable Declaration</em>'.
	 * @generated
	 */
	SingleVariableDeclaration createSingleVariableDeclaration();

	/**
	 * Returns a new object of class '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal</em>'.
	 * @generated
	 */
	StringLiteral createStringLiteral();

	/**
	 * Returns a new object of class '<em>Super Constructor Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super Constructor Invocation</em>'.
	 * @generated
	 */
	SuperConstructorInvocation createSuperConstructorInvocation();

	/**
	 * Returns a new object of class '<em>Super Field Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super Field Access</em>'.
	 * @generated
	 */
	SuperFieldAccess createSuperFieldAccess();

	/**
	 * Returns a new object of class '<em>Super Method Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super Method Invocation</em>'.
	 * @generated
	 */
	SuperMethodInvocation createSuperMethodInvocation();

	/**
	 * Returns a new object of class '<em>Super Method Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super Method Reference</em>'.
	 * @generated
	 */
	SuperMethodReference createSuperMethodReference();

	/**
	 * Returns a new object of class '<em>Switch Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Case</em>'.
	 * @generated
	 */
	SwitchCase createSwitchCase();

	/**
	 * Returns a new object of class '<em>Switch Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Expression</em>'.
	 * @generated
	 */
	SwitchExpression createSwitchExpression();

	/**
	 * Returns a new object of class '<em>Switch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Statement</em>'.
	 * @generated
	 */
	SwitchStatement createSwitchStatement();

	/**
	 * Returns a new object of class '<em>Synchronized Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronized Statement</em>'.
	 * @generated
	 */
	SynchronizedStatement createSynchronizedStatement();

	/**
	 * Returns a new object of class '<em>Tag Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag Element</em>'.
	 * @generated
	 */
	TagElement createTagElement();

	/**
	 * Returns a new object of class '<em>Tag Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag Property</em>'.
	 * @generated
	 */
	TagProperty createTagProperty();

	/**
	 * Returns a new object of class '<em>Text Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Block</em>'.
	 * @generated
	 */
	TextBlock createTextBlock();

	/**
	 * Returns a new object of class '<em>Text Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Element</em>'.
	 * @generated
	 */
	TextElement createTextElement();

	/**
	 * Returns a new object of class '<em>This Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>This Expression</em>'.
	 * @generated
	 */
	ThisExpression createThisExpression();

	/**
	 * Returns a new object of class '<em>Throw Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throw Statement</em>'.
	 * @generated
	 */
	ThrowStatement createThrowStatement();

	/**
	 * Returns a new object of class '<em>Try Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Try Statement</em>'.
	 * @generated
	 */
	TryStatement createTryStatement();

	/**
	 * Returns a new object of class '<em>Type Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Access</em>'.
	 * @generated
	 */
	TypeAccess createTypeAccess();

	/**
	 * Returns a new object of class '<em>Type Declaration Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Declaration Statement</em>'.
	 * @generated
	 */
	TypeDeclarationStatement createTypeDeclarationStatement();

	/**
	 * Returns a new object of class '<em>Type Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Literal</em>'.
	 * @generated
	 */
	TypeLiteral createTypeLiteral();

	/**
	 * Returns a new object of class '<em>Type Method Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Method Reference</em>'.
	 * @generated
	 */
	TypeMethodReference createTypeMethodReference();

	/**
	 * Returns a new object of class '<em>Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Parameter</em>'.
	 * @generated
	 */
	TypeParameter createTypeParameter();

	/**
	 * Returns a new object of class '<em>Type Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Pattern</em>'.
	 * @generated
	 */
	TypePattern createTypePattern();

	/**
	 * Returns a new object of class '<em>Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Type</em>'.
	 * @generated
	 */
	UnionType createUnionType();

	/**
	 * Returns a new object of class '<em>Unresolved Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Item</em>'.
	 * @generated
	 */
	UnresolvedItem createUnresolvedItem();

	/**
	 * Returns a new object of class '<em>Unresolved Item Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Item Access</em>'.
	 * @generated
	 */
	UnresolvedItemAccess createUnresolvedItemAccess();

	/**
	 * Returns a new object of class '<em>Unresolved Annotation Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Annotation Declaration</em>'.
	 * @generated
	 */
	UnresolvedAnnotationDeclaration createUnresolvedAnnotationDeclaration();

	/**
	 * Returns a new object of class '<em>Unresolved Annotation Type Member Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Annotation Type Member Declaration</em>'.
	 * @generated
	 */
	UnresolvedAnnotationTypeMemberDeclaration createUnresolvedAnnotationTypeMemberDeclaration();

	/**
	 * Returns a new object of class '<em>Unresolved Class Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Class Declaration</em>'.
	 * @generated
	 */
	UnresolvedClassDeclaration createUnresolvedClassDeclaration();

	/**
	 * Returns a new object of class '<em>Unresolved Enum Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Enum Declaration</em>'.
	 * @generated
	 */
	UnresolvedEnumDeclaration createUnresolvedEnumDeclaration();

	/**
	 * Returns a new object of class '<em>Unresolved Interface Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Interface Declaration</em>'.
	 * @generated
	 */
	UnresolvedInterfaceDeclaration createUnresolvedInterfaceDeclaration();

	/**
	 * Returns a new object of class '<em>Unresolved Labeled Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Labeled Statement</em>'.
	 * @generated
	 */
	UnresolvedLabeledStatement createUnresolvedLabeledStatement();

	/**
	 * Returns a new object of class '<em>Unresolved Method Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Method Declaration</em>'.
	 * @generated
	 */
	UnresolvedMethodDeclaration createUnresolvedMethodDeclaration();

	/**
	 * Returns a new object of class '<em>Unresolved Single Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Single Variable Declaration</em>'.
	 * @generated
	 */
	UnresolvedSingleVariableDeclaration createUnresolvedSingleVariableDeclaration();

	/**
	 * Returns a new object of class '<em>Unresolved Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Type</em>'.
	 * @generated
	 */
	UnresolvedType createUnresolvedType();

	/**
	 * Returns a new object of class '<em>Unresolved Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Type Declaration</em>'.
	 * @generated
	 */
	UnresolvedTypeDeclaration createUnresolvedTypeDeclaration();

	/**
	 * Returns a new object of class '<em>Unresolved Variable Declaration Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Variable Declaration Fragment</em>'.
	 * @generated
	 */
	UnresolvedVariableDeclarationFragment createUnresolvedVariableDeclarationFragment();

	/**
	 * Returns a new object of class '<em>Uses Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uses Directive</em>'.
	 * @generated
	 */
	UsesDirective createUsesDirective();

	/**
	 * Returns a new object of class '<em>Variable Declaration Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Declaration Expression</em>'.
	 * @generated
	 */
	VariableDeclarationExpression createVariableDeclarationExpression();

	/**
	 * Returns a new object of class '<em>Variable Declaration Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Declaration Fragment</em>'.
	 * @generated
	 */
	VariableDeclarationFragment createVariableDeclarationFragment();

	/**
	 * Returns a new object of class '<em>Variable Declaration Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Declaration Statement</em>'.
	 * @generated
	 */
	VariableDeclarationStatement createVariableDeclarationStatement();

	/**
	 * Returns a new object of class '<em>Wild Card Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wild Card Type</em>'.
	 * @generated
	 */
	WildCardType createWildCardType();

	/**
	 * Returns a new object of class '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Statement</em>'.
	 * @generated
	 */
	WhileStatement createWhileStatement();

	/**
	 * Returns a new object of class '<em>Yield Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Yield Statement</em>'.
	 * @generated
	 */
	YieldStatement createYieldStatement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaPackage getJavaPackage();

} //JavaFactory
