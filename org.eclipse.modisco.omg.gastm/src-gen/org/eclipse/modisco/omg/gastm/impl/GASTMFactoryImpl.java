/**
 * <copyright>
 * Copyright (c) 2009, 2019 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.modisco.omg.gastm.AccessKind;
import org.eclipse.modisco.omg.gastm.Add;
import org.eclipse.modisco.omg.gastm.AddressOf;
import org.eclipse.modisco.omg.gastm.AggregateExpression;
import org.eclipse.modisco.omg.gastm.AggregateScope;
import org.eclipse.modisco.omg.gastm.AggregateTypeDeclaration;
import org.eclipse.modisco.omg.gastm.AggregateTypeDefinition;
import org.eclipse.modisco.omg.gastm.And;
import org.eclipse.modisco.omg.gastm.AnnotationExpression;
import org.eclipse.modisco.omg.gastm.AnnotationType;
import org.eclipse.modisco.omg.gastm.ArrayAccess;
import org.eclipse.modisco.omg.gastm.ArrayType;
import org.eclipse.modisco.omg.gastm.Assign;
import org.eclipse.modisco.omg.gastm.BinaryExpression;
import org.eclipse.modisco.omg.gastm.BitAnd;
import org.eclipse.modisco.omg.gastm.BitFieldDefinition;
import org.eclipse.modisco.omg.gastm.BitLeftShift;
import org.eclipse.modisco.omg.gastm.BitLiteral;
import org.eclipse.modisco.omg.gastm.BitNot;
import org.eclipse.modisco.omg.gastm.BitOr;
import org.eclipse.modisco.omg.gastm.BitRightShift;
import org.eclipse.modisco.omg.gastm.BitXor;
import org.eclipse.modisco.omg.gastm.BlockScope;
import org.eclipse.modisco.omg.gastm.BlockStatement;
import org.eclipse.modisco.omg.gastm.BooleanLiteral;
import org.eclipse.modisco.omg.gastm.BreakStatement;
import org.eclipse.modisco.omg.gastm.ByReferenceActualParameterExpression;
import org.eclipse.modisco.omg.gastm.ByReferenceFormalParameterType;
import org.eclipse.modisco.omg.gastm.ByValueActualParameterExpression;
import org.eclipse.modisco.omg.gastm.ByValueFormalParameterType;
import org.eclipse.modisco.omg.gastm.CaseBlock;
import org.eclipse.modisco.omg.gastm.CastExpression;
import org.eclipse.modisco.omg.gastm.CatchBlock;
import org.eclipse.modisco.omg.gastm.CharLiteral;
import org.eclipse.modisco.omg.gastm.ClassType;
import org.eclipse.modisco.omg.gastm.CollectionExpression;
import org.eclipse.modisco.omg.gastm.CollectionType;
import org.eclipse.modisco.omg.gastm.Comment;
import org.eclipse.modisco.omg.gastm.CompilationUnit;
import org.eclipse.modisco.omg.gastm.ConditionalExpression;
import org.eclipse.modisco.omg.gastm.ContinueStatement;
import org.eclipse.modisco.omg.gastm.DeclarationOrDefinitionStatement;
import org.eclipse.modisco.omg.gastm.Decrement;
import org.eclipse.modisco.omg.gastm.DefaultBlock;
import org.eclipse.modisco.omg.gastm.DeleteStatement;
import org.eclipse.modisco.omg.gastm.Deref;
import org.eclipse.modisco.omg.gastm.DerivesFrom;
import org.eclipse.modisco.omg.gastm.Dimension;
import org.eclipse.modisco.omg.gastm.Divide;
import org.eclipse.modisco.omg.gastm.DoWhileStatement;
import org.eclipse.modisco.omg.gastm.EmptyStatement;
import org.eclipse.modisco.omg.gastm.EntryDefinition;
import org.eclipse.modisco.omg.gastm.EnumLiteral;
import org.eclipse.modisco.omg.gastm.EnumLiteralDefinition;
import org.eclipse.modisco.omg.gastm.EnumType;
import org.eclipse.modisco.omg.gastm.EnumTypeDeclaration;
import org.eclipse.modisco.omg.gastm.EnumTypeDefinition;
import org.eclipse.modisco.omg.gastm.Equal;
import org.eclipse.modisco.omg.gastm.ExceptionType;
import org.eclipse.modisco.omg.gastm.Exponent;
import org.eclipse.modisco.omg.gastm.ExpressionStatement;
import org.eclipse.modisco.omg.gastm.External;
import org.eclipse.modisco.omg.gastm.FileLocal;
import org.eclipse.modisco.omg.gastm.ForCheckAfterStatement;
import org.eclipse.modisco.omg.gastm.ForCheckBeforeStatement;
import org.eclipse.modisco.omg.gastm.FormalParameterDeclaration;
import org.eclipse.modisco.omg.gastm.FormalParameterDefinition;
import org.eclipse.modisco.omg.gastm.FunctionCallExpression;
import org.eclipse.modisco.omg.gastm.FunctionDeclaration;
import org.eclipse.modisco.omg.gastm.FunctionDefinition;
import org.eclipse.modisco.omg.gastm.FunctionMemberAttributes;
import org.eclipse.modisco.omg.gastm.FunctionPersistent;
import org.eclipse.modisco.omg.gastm.FunctionScope;
import org.eclipse.modisco.omg.gastm.FunctionType;
import org.eclipse.modisco.omg.gastm.GASTMFactory;
import org.eclipse.modisco.omg.gastm.GASTMObject;
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.GlobalScope;
import org.eclipse.modisco.omg.gastm.Greater;
import org.eclipse.modisco.omg.gastm.IdentifierReference;
import org.eclipse.modisco.omg.gastm.IfStatement;
import org.eclipse.modisco.omg.gastm.IncludeUnit;
import org.eclipse.modisco.omg.gastm.Increment;
import org.eclipse.modisco.omg.gastm.IntegerLiteral;
import org.eclipse.modisco.omg.gastm.JumpStatement;
import org.eclipse.modisco.omg.gastm.LabelAccess;
import org.eclipse.modisco.omg.gastm.LabelDefinition;
import org.eclipse.modisco.omg.gastm.LabelType;
import org.eclipse.modisco.omg.gastm.LabeledStatement;
import org.eclipse.modisco.omg.gastm.Less;
import org.eclipse.modisco.omg.gastm.Literal;
import org.eclipse.modisco.omg.gastm.LongDouble;
import org.eclipse.modisco.omg.gastm.LongInteger;
import org.eclipse.modisco.omg.gastm.LoopStatement;
import org.eclipse.modisco.omg.gastm.MacroCall;
import org.eclipse.modisco.omg.gastm.MacroDefinition;
import org.eclipse.modisco.omg.gastm.MemberObject;
import org.eclipse.modisco.omg.gastm.MissingActualParameter;
import org.eclipse.modisco.omg.gastm.Modulus;
import org.eclipse.modisco.omg.gastm.Multiply;
import org.eclipse.modisco.omg.gastm.Name;
import org.eclipse.modisco.omg.gastm.NameSpaceDefinition;
import org.eclipse.modisco.omg.gastm.NameSpaceType;
import org.eclipse.modisco.omg.gastm.NamedType;
import org.eclipse.modisco.omg.gastm.NamedTypeDefinition;
import org.eclipse.modisco.omg.gastm.NamedTypeReference;
import org.eclipse.modisco.omg.gastm.NewExpression;
import org.eclipse.modisco.omg.gastm.NoDef;
import org.eclipse.modisco.omg.gastm.Not;
import org.eclipse.modisco.omg.gastm.NotEqual;
import org.eclipse.modisco.omg.gastm.NotGreater;
import org.eclipse.modisco.omg.gastm.NotLess;
import org.eclipse.modisco.omg.gastm.OperatorAssign;
import org.eclipse.modisco.omg.gastm.Or;
import org.eclipse.modisco.omg.gastm.PerClassMember;
import org.eclipse.modisco.omg.gastm.PointerType;
import org.eclipse.modisco.omg.gastm.PostDecrement;
import org.eclipse.modisco.omg.gastm.PostIncrement;
import org.eclipse.modisco.omg.gastm.Private;
import org.eclipse.modisco.omg.gastm.ProgramScope;
import org.eclipse.modisco.omg.gastm.Project;
import org.eclipse.modisco.omg.gastm.Protected;
import org.eclipse.modisco.omg.gastm.Public;
import org.eclipse.modisco.omg.gastm.QualifiedOverData;
import org.eclipse.modisco.omg.gastm.QualifiedOverPointer;
import org.eclipse.modisco.omg.gastm.RangeExpression;
import org.eclipse.modisco.omg.gastm.RangeType;
import org.eclipse.modisco.omg.gastm.Real;
import org.eclipse.modisco.omg.gastm.RealLiteral;
import org.eclipse.modisco.omg.gastm.ReferenceType;
import org.eclipse.modisco.omg.gastm.ReturnStatement;
import org.eclipse.modisco.omg.gastm.Scope;
import org.eclipse.modisco.omg.gastm.ShortInteger;
import org.eclipse.modisco.omg.gastm.SourceFile;
import org.eclipse.modisco.omg.gastm.SourceFileReference;
import org.eclipse.modisco.omg.gastm.SourceLocation;
import org.eclipse.modisco.omg.gastm.StringLiteral;
import org.eclipse.modisco.omg.gastm.StructureType;
import org.eclipse.modisco.omg.gastm.Subtract;
import org.eclipse.modisco.omg.gastm.SwitchCase;
import org.eclipse.modisco.omg.gastm.SwitchStatement;
import org.eclipse.modisco.omg.gastm.TerminateStatement;
import org.eclipse.modisco.omg.gastm.ThrowStatement;
import org.eclipse.modisco.omg.gastm.TryStatement;
import org.eclipse.modisco.omg.gastm.TypeDeclaration;
import org.eclipse.modisco.omg.gastm.TypeDefinition;
import org.eclipse.modisco.omg.gastm.TypeQualifiedIdentifierReference;
import org.eclipse.modisco.omg.gastm.TypesCatchBlock;
import org.eclipse.modisco.omg.gastm.UnaryExpression;
import org.eclipse.modisco.omg.gastm.UnaryMinus;
import org.eclipse.modisco.omg.gastm.UnaryPlus;
import org.eclipse.modisco.omg.gastm.UnionType;
import org.eclipse.modisco.omg.gastm.UnnamedTypeReference;
import org.eclipse.modisco.omg.gastm.VariableCatchBlock;
import org.eclipse.modisco.omg.gastm.VariableDeclaration;
import org.eclipse.modisco.omg.gastm.VariableDefinition;
import org.eclipse.modisco.omg.gastm.Virtual;
import org.eclipse.modisco.omg.gastm.WhileStatement;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class GASTMFactoryImpl extends EFactoryImpl implements GASTMFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static GASTMFactory init() {
		try {
			GASTMFactory theGASTMFactory = (GASTMFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.eclipse.org/MoDisco/GASTM/1.0.Beta2/gastm"); //$NON-NLS-1$ 
			if (theGASTMFactory != null) {
				return theGASTMFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GASTMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public GASTMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GASTMPackage.GASTM_OBJECT:
			return createGASTMObject();
		case GASTMPackage.SOURCE_FILE:
			return createSourceFile();
		case GASTMPackage.SOURCE_LOCATION:
			return createSourceLocation();
		case GASTMPackage.COMPILATION_UNIT:
			return createCompilationUnit();
		case GASTMPackage.SOURCE_FILE_REFERENCE:
			return createSourceFileReference();
		case GASTMPackage.PROJECT:
			return createProject();
		case GASTMPackage.SCOPE:
			return createScope();
		case GASTMPackage.PROGRAM_SCOPE:
			return createProgramScope();
		case GASTMPackage.FUNCTION_SCOPE:
			return createFunctionScope();
		case GASTMPackage.AGGREGATE_SCOPE:
			return createAggregateScope();
		case GASTMPackage.BLOCK_SCOPE:
			return createBlockScope();
		case GASTMPackage.GLOBAL_SCOPE:
			return createGlobalScope();
		case GASTMPackage.DIMENSION:
			return createDimension();
		case GASTMPackage.NAME:
			return createName();
		case GASTMPackage.SWITCH_CASE:
			return createSwitchCase();
		case GASTMPackage.CATCH_BLOCK:
			return createCatchBlock();
		case GASTMPackage.ACCESS_KIND:
			return createAccessKind();
		case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES:
			return createFunctionMemberAttributes();
		case GASTMPackage.DERIVES_FROM:
			return createDerivesFrom();
		case GASTMPackage.MEMBER_OBJECT:
			return createMemberObject();
		case GASTMPackage.TYPE_DEFINITION:
			return createTypeDefinition();
		case GASTMPackage.NAME_SPACE_DEFINITION:
			return createNameSpaceDefinition();
		case GASTMPackage.LABEL_DEFINITION:
			return createLabelDefinition();
		case GASTMPackage.TYPE_DECLARATION:
			return createTypeDeclaration();
		case GASTMPackage.FUNCTION_DEFINITION:
			return createFunctionDefinition();
		case GASTMPackage.ENTRY_DEFINITION:
			return createEntryDefinition();
		case GASTMPackage.ENUM_LITERAL_DEFINITION:
			return createEnumLiteralDefinition();
		case GASTMPackage.FUNCTION_DECLARATION:
			return createFunctionDeclaration();
		case GASTMPackage.VARIABLE_DECLARATION:
			return createVariableDeclaration();
		case GASTMPackage.FORMAL_PARAMETER_DECLARATION:
			return createFormalParameterDeclaration();
		case GASTMPackage.EXTERNAL:
			return createExternal();
		case GASTMPackage.FUNCTION_PERSISTENT:
			return createFunctionPersistent();
		case GASTMPackage.FILE_LOCAL:
			return createFileLocal();
		case GASTMPackage.PER_CLASS_MEMBER:
			return createPerClassMember();
		case GASTMPackage.NO_DEF:
			return createNoDef();
		case GASTMPackage.VIRTUAL:
			return createVirtual();
		case GASTMPackage.VARIABLE_DEFINITION:
			return createVariableDefinition();
		case GASTMPackage.FORMAL_PARAMETER_DEFINITION:
			return createFormalParameterDefinition();
		case GASTMPackage.BIT_FIELD_DEFINITION:
			return createBitFieldDefinition();
		case GASTMPackage.NAMED_TYPE_DEFINITION:
			return createNamedTypeDefinition();
		case GASTMPackage.AGGREGATE_TYPE_DEFINITION:
			return createAggregateTypeDefinition();
		case GASTMPackage.ENUM_TYPE_DEFINITION:
			return createEnumTypeDefinition();
		case GASTMPackage.AGGREGATE_TYPE_DECLARATION:
			return createAggregateTypeDeclaration();
		case GASTMPackage.ENUM_TYPE_DECLARATION:
			return createEnumTypeDeclaration();
		case GASTMPackage.INCLUDE_UNIT:
			return createIncludeUnit();
		case GASTMPackage.MACRO_CALL:
			return createMacroCall();
		case GASTMPackage.MACRO_DEFINITION:
			return createMacroDefinition();
		case GASTMPackage.COMMENT:
			return createComment();
		case GASTMPackage.FUNCTION_TYPE:
			return createFunctionType();
		case GASTMPackage.LABEL_TYPE:
			return createLabelType();
		case GASTMPackage.NAME_SPACE_TYPE:
			return createNameSpaceType();
		case GASTMPackage.ENUM_TYPE:
			return createEnumType();
		case GASTMPackage.EXCEPTION_TYPE:
			return createExceptionType();
		case GASTMPackage.NAMED_TYPE:
			return createNamedType();
		case GASTMPackage.VOID:
			return createVoid();
		case GASTMPackage.BOOLEAN:
			return createBoolean();
		case GASTMPackage.BYTE:
			return createByte();
		case GASTMPackage.CHARACTER:
			return createCharacter();
		case GASTMPackage.SHORT_INTEGER:
			return createShortInteger();
		case GASTMPackage.INTEGER:
			return createInteger();
		case GASTMPackage.LONG_INTEGER:
			return createLongInteger();
		case GASTMPackage.REAL:
			return createReal();
		case GASTMPackage.DOUBLE:
			return createDouble();
		case GASTMPackage.LONG_DOUBLE:
			return createLongDouble();
		case GASTMPackage.COLLECTION_TYPE:
			return createCollectionType();
		case GASTMPackage.POINTER_TYPE:
			return createPointerType();
		case GASTMPackage.REFERENCE_TYPE:
			return createReferenceType();
		case GASTMPackage.RANGE_TYPE:
			return createRangeType();
		case GASTMPackage.ARRAY_TYPE:
			return createArrayType();
		case GASTMPackage.STRUCTURE_TYPE:
			return createStructureType();
		case GASTMPackage.UNION_TYPE:
			return createUnionType();
		case GASTMPackage.CLASS_TYPE:
			return createClassType();
		case GASTMPackage.ANNOTATION_TYPE:
			return createAnnotationType();
		case GASTMPackage.BY_VALUE_FORMAL_PARAMETER_TYPE:
			return createByValueFormalParameterType();
		case GASTMPackage.BY_REFERENCE_FORMAL_PARAMETER_TYPE:
			return createByReferenceFormalParameterType();
		case GASTMPackage.PUBLIC:
			return createPublic();
		case GASTMPackage.PROTECTED:
			return createProtected();
		case GASTMPackage.PRIVATE:
			return createPrivate();
		case GASTMPackage.UNNAMED_TYPE_REFERENCE:
			return createUnnamedTypeReference();
		case GASTMPackage.NAMED_TYPE_REFERENCE:
			return createNamedTypeReference();
		case GASTMPackage.EXPRESSION_STATEMENT:
			return createExpressionStatement();
		case GASTMPackage.JUMP_STATEMENT:
			return createJumpStatement();
		case GASTMPackage.BREAK_STATEMENT:
			return createBreakStatement();
		case GASTMPackage.CONTINUE_STATEMENT:
			return createContinueStatement();
		case GASTMPackage.LABELED_STATEMENT:
			return createLabeledStatement();
		case GASTMPackage.BLOCK_STATEMENT:
			return createBlockStatement();
		case GASTMPackage.EMPTY_STATEMENT:
			return createEmptyStatement();
		case GASTMPackage.IF_STATEMENT:
			return createIfStatement();
		case GASTMPackage.SWITCH_STATEMENT:
			return createSwitchStatement();
		case GASTMPackage.RETURN_STATEMENT:
			return createReturnStatement();
		case GASTMPackage.LOOP_STATEMENT:
			return createLoopStatement();
		case GASTMPackage.TRY_STATEMENT:
			return createTryStatement();
		case GASTMPackage.DECLARATION_OR_DEFINITION_STATEMENT:
			return createDeclarationOrDefinitionStatement();
		case GASTMPackage.THROW_STATEMENT:
			return createThrowStatement();
		case GASTMPackage.DELETE_STATEMENT:
			return createDeleteStatement();
		case GASTMPackage.TERMINATE_STATEMENT:
			return createTerminateStatement();
		case GASTMPackage.CASE_BLOCK:
			return createCaseBlock();
		case GASTMPackage.DEFAULT_BLOCK:
			return createDefaultBlock();
		case GASTMPackage.WHILE_STATEMENT:
			return createWhileStatement();
		case GASTMPackage.DO_WHILE_STATEMENT:
			return createDoWhileStatement();
		case GASTMPackage.FOR_CHECK_BEFORE_STATEMENT:
			return createForCheckBeforeStatement();
		case GASTMPackage.FOR_CHECK_AFTER_STATEMENT:
			return createForCheckAfterStatement();
		case GASTMPackage.TYPES_CATCH_BLOCK:
			return createTypesCatchBlock();
		case GASTMPackage.VARIABLE_CATCH_BLOCK:
			return createVariableCatchBlock();
		case GASTMPackage.LITERAL:
			return createLiteral();
		case GASTMPackage.CAST_EXPRESSION:
			return createCastExpression();
		case GASTMPackage.AGGREGATE_EXPRESSION:
			return createAggregateExpression();
		case GASTMPackage.UNARY_EXPRESSION:
			return createUnaryExpression();
		case GASTMPackage.BINARY_EXPRESSION:
			return createBinaryExpression();
		case GASTMPackage.CONDITIONAL_EXPRESSION:
			return createConditionalExpression();
		case GASTMPackage.RANGE_EXPRESSION:
			return createRangeExpression();
		case GASTMPackage.FUNCTION_CALL_EXPRESSION:
			return createFunctionCallExpression();
		case GASTMPackage.NEW_EXPRESSION:
			return createNewExpression();
		case GASTMPackage.LABEL_ACCESS:
			return createLabelAccess();
		case GASTMPackage.ARRAY_ACCESS:
			return createArrayAccess();
		case GASTMPackage.ANNOTATION_EXPRESSION:
			return createAnnotationExpression();
		case GASTMPackage.COLLECTION_EXPRESSION:
			return createCollectionExpression();
		case GASTMPackage.IDENTIFIER_REFERENCE:
			return createIdentifierReference();
		case GASTMPackage.TYPE_QUALIFIED_IDENTIFIER_REFERENCE:
			return createTypeQualifiedIdentifierReference();
		case GASTMPackage.QUALIFIED_OVER_POINTER:
			return createQualifiedOverPointer();
		case GASTMPackage.QUALIFIED_OVER_DATA:
			return createQualifiedOverData();
		case GASTMPackage.INTEGER_LITERAL:
			return createIntegerLiteral();
		case GASTMPackage.CHAR_LITERAL:
			return createCharLiteral();
		case GASTMPackage.REAL_LITERAL:
			return createRealLiteral();
		case GASTMPackage.STRING_LITERAL:
			return createStringLiteral();
		case GASTMPackage.BOOLEAN_LITERAL:
			return createBooleanLiteral();
		case GASTMPackage.BIT_LITERAL:
			return createBitLiteral();
		case GASTMPackage.ENUM_LITERAL:
			return createEnumLiteral();
		case GASTMPackage.UNARY_PLUS:
			return createUnaryPlus();
		case GASTMPackage.UNARY_MINUS:
			return createUnaryMinus();
		case GASTMPackage.NOT:
			return createNot();
		case GASTMPackage.BIT_NOT:
			return createBitNot();
		case GASTMPackage.ADDRESS_OF:
			return createAddressOf();
		case GASTMPackage.DEREF:
			return createDeref();
		case GASTMPackage.INCREMENT:
			return createIncrement();
		case GASTMPackage.DECREMENT:
			return createDecrement();
		case GASTMPackage.POST_INCREMENT:
			return createPostIncrement();
		case GASTMPackage.POST_DECREMENT:
			return createPostDecrement();
		case GASTMPackage.ADD:
			return createAdd();
		case GASTMPackage.SUBTRACT:
			return createSubtract();
		case GASTMPackage.MULTIPLY:
			return createMultiply();
		case GASTMPackage.DIVIDE:
			return createDivide();
		case GASTMPackage.MODULUS:
			return createModulus();
		case GASTMPackage.EXPONENT:
			return createExponent();
		case GASTMPackage.AND:
			return createAnd();
		case GASTMPackage.OR:
			return createOr();
		case GASTMPackage.EQUAL:
			return createEqual();
		case GASTMPackage.NOT_EQUAL:
			return createNotEqual();
		case GASTMPackage.GREATER:
			return createGreater();
		case GASTMPackage.NOT_GREATER:
			return createNotGreater();
		case GASTMPackage.LESS:
			return createLess();
		case GASTMPackage.NOT_LESS:
			return createNotLess();
		case GASTMPackage.BIT_AND:
			return createBitAnd();
		case GASTMPackage.BIT_OR:
			return createBitOr();
		case GASTMPackage.BIT_XOR:
			return createBitXor();
		case GASTMPackage.BIT_LEFT_SHIFT:
			return createBitLeftShift();
		case GASTMPackage.BIT_RIGHT_SHIFT:
			return createBitRightShift();
		case GASTMPackage.ASSIGN:
			return createAssign();
		case GASTMPackage.OPERATOR_ASSIGN:
			return createOperatorAssign();
		case GASTMPackage.MISSING_ACTUAL_PARAMETER:
			return createMissingActualParameter();
		case GASTMPackage.BY_VALUE_ACTUAL_PARAMETER_EXPRESSION:
			return createByValueActualParameterExpression();
		case GASTMPackage.BY_REFERENCE_ACTUAL_PARAMETER_EXPRESSION:
			return createByReferenceActualParameterExpression();
		default:
			throw new IllegalArgumentException(
					"The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GASTMObject createGASTMObject() {
		GASTMObjectImpl gastmObject = new GASTMObjectImpl();
		return gastmObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SourceFile createSourceFile() {
		SourceFileImpl sourceFile = new SourceFileImpl();
		return sourceFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SourceLocation createSourceLocation() {
		SourceLocationImpl sourceLocation = new SourceLocationImpl();
		return sourceLocation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CompilationUnit createCompilationUnit() {
		CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
		return compilationUnit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SourceFileReference createSourceFileReference() {
		SourceFileReferenceImpl sourceFileReference = new SourceFileReferenceImpl();
		return sourceFileReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Scope createScope() {
		ScopeImpl scope = new ScopeImpl();
		return scope;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProgramScope createProgramScope() {
		ProgramScopeImpl programScope = new ProgramScopeImpl();
		return programScope;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionScope createFunctionScope() {
		FunctionScopeImpl functionScope = new FunctionScopeImpl();
		return functionScope;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AggregateScope createAggregateScope() {
		AggregateScopeImpl aggregateScope = new AggregateScopeImpl();
		return aggregateScope;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BlockScope createBlockScope() {
		BlockScopeImpl blockScope = new BlockScopeImpl();
		return blockScope;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GlobalScope createGlobalScope() {
		GlobalScopeImpl globalScope = new GlobalScopeImpl();
		return globalScope;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Name createName() {
		NameImpl name = new NameImpl();
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SwitchCase createSwitchCase() {
		SwitchCaseImpl switchCase = new SwitchCaseImpl();
		return switchCase;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CatchBlock createCatchBlock() {
		CatchBlockImpl catchBlock = new CatchBlockImpl();
		return catchBlock;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AccessKind createAccessKind() {
		AccessKindImpl accessKind = new AccessKindImpl();
		return accessKind;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionMemberAttributes createFunctionMemberAttributes() {
		FunctionMemberAttributesImpl functionMemberAttributes = new FunctionMemberAttributesImpl();
		return functionMemberAttributes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DerivesFrom createDerivesFrom() {
		DerivesFromImpl derivesFrom = new DerivesFromImpl();
		return derivesFrom;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MemberObject createMemberObject() {
		MemberObjectImpl memberObject = new MemberObjectImpl();
		return memberObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TypeDefinition createTypeDefinition() {
		TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NameSpaceDefinition createNameSpaceDefinition() {
		NameSpaceDefinitionImpl nameSpaceDefinition = new NameSpaceDefinitionImpl();
		return nameSpaceDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LabelDefinition createLabelDefinition() {
		LabelDefinitionImpl labelDefinition = new LabelDefinitionImpl();
		return labelDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TypeDeclaration createTypeDeclaration() {
		TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
		return typeDeclaration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionDefinition createFunctionDefinition() {
		FunctionDefinitionImpl functionDefinition = new FunctionDefinitionImpl();
		return functionDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntryDefinition createEntryDefinition() {
		EntryDefinitionImpl entryDefinition = new EntryDefinitionImpl();
		return entryDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnumLiteralDefinition createEnumLiteralDefinition() {
		EnumLiteralDefinitionImpl enumLiteralDefinition = new EnumLiteralDefinitionImpl();
		return enumLiteralDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionDeclaration createFunctionDeclaration() {
		FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
		return functionDeclaration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FormalParameterDeclaration createFormalParameterDeclaration() {
		FormalParameterDeclarationImpl formalParameterDeclaration = new FormalParameterDeclarationImpl();
		return formalParameterDeclaration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public External createExternal() {
		ExternalImpl external = new ExternalImpl();
		return external;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionPersistent createFunctionPersistent() {
		FunctionPersistentImpl functionPersistent = new FunctionPersistentImpl();
		return functionPersistent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FileLocal createFileLocal() {
		FileLocalImpl fileLocal = new FileLocalImpl();
		return fileLocal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PerClassMember createPerClassMember() {
		PerClassMemberImpl perClassMember = new PerClassMemberImpl();
		return perClassMember;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NoDef createNoDef() {
		NoDefImpl noDef = new NoDefImpl();
		return noDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Virtual createVirtual() {
		VirtualImpl virtual = new VirtualImpl();
		return virtual;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VariableDefinition createVariableDefinition() {
		VariableDefinitionImpl variableDefinition = new VariableDefinitionImpl();
		return variableDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FormalParameterDefinition createFormalParameterDefinition() {
		FormalParameterDefinitionImpl formalParameterDefinition = new FormalParameterDefinitionImpl();
		return formalParameterDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BitFieldDefinition createBitFieldDefinition() {
		BitFieldDefinitionImpl bitFieldDefinition = new BitFieldDefinitionImpl();
		return bitFieldDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NamedTypeDefinition createNamedTypeDefinition() {
		NamedTypeDefinitionImpl namedTypeDefinition = new NamedTypeDefinitionImpl();
		return namedTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AggregateTypeDefinition createAggregateTypeDefinition() {
		AggregateTypeDefinitionImpl aggregateTypeDefinition = new AggregateTypeDefinitionImpl();
		return aggregateTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnumTypeDefinition createEnumTypeDefinition() {
		EnumTypeDefinitionImpl enumTypeDefinition = new EnumTypeDefinitionImpl();
		return enumTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AggregateTypeDeclaration createAggregateTypeDeclaration() {
		AggregateTypeDeclarationImpl aggregateTypeDeclaration = new AggregateTypeDeclarationImpl();
		return aggregateTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnumTypeDeclaration createEnumTypeDeclaration() {
		EnumTypeDeclarationImpl enumTypeDeclaration = new EnumTypeDeclarationImpl();
		return enumTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IncludeUnit createIncludeUnit() {
		IncludeUnitImpl includeUnit = new IncludeUnitImpl();
		return includeUnit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MacroCall createMacroCall() {
		MacroCallImpl macroCall = new MacroCallImpl();
		return macroCall;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MacroDefinition createMacroDefinition() {
		MacroDefinitionImpl macroDefinition = new MacroDefinitionImpl();
		return macroDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionType createFunctionType() {
		FunctionTypeImpl functionType = new FunctionTypeImpl();
		return functionType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LabelType createLabelType() {
		LabelTypeImpl labelType = new LabelTypeImpl();
		return labelType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NameSpaceType createNameSpaceType() {
		NameSpaceTypeImpl nameSpaceType = new NameSpaceTypeImpl();
		return nameSpaceType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnumType createEnumType() {
		EnumTypeImpl enumType = new EnumTypeImpl();
		return enumType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExceptionType createExceptionType() {
		ExceptionTypeImpl exceptionType = new ExceptionTypeImpl();
		return exceptionType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NamedType createNamedType() {
		NamedTypeImpl namedType = new NamedTypeImpl();
		return namedType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.modisco.omg.gastm.Void createVoid() {
		VoidImpl void_ = new VoidImpl();
		return void_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.modisco.omg.gastm.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.modisco.omg.gastm.Byte createByte() {
		ByteImpl byte_ = new ByteImpl();
		return byte_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.modisco.omg.gastm.Character createCharacter() {
		CharacterImpl character = new CharacterImpl();
		return character;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ShortInteger createShortInteger() {
		ShortIntegerImpl shortInteger = new ShortIntegerImpl();
		return shortInteger;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.modisco.omg.gastm.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LongInteger createLongInteger() {
		LongIntegerImpl longInteger = new LongIntegerImpl();
		return longInteger;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Real createReal() {
		RealImpl real = new RealImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.modisco.omg.gastm.Double createDouble() {
		DoubleImpl double_ = new DoubleImpl();
		return double_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LongDouble createLongDouble() {
		LongDoubleImpl longDouble = new LongDoubleImpl();
		return longDouble;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CollectionType createCollectionType() {
		CollectionTypeImpl collectionType = new CollectionTypeImpl();
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PointerType createPointerType() {
		PointerTypeImpl pointerType = new PointerTypeImpl();
		return pointerType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RangeType createRangeType() {
		RangeTypeImpl rangeType = new RangeTypeImpl();
		return rangeType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ArrayType createArrayType() {
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StructureType createStructureType() {
		StructureTypeImpl structureType = new StructureTypeImpl();
		return structureType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnionType createUnionType() {
		UnionTypeImpl unionType = new UnionTypeImpl();
		return unionType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClassType createClassType() {
		ClassTypeImpl classType = new ClassTypeImpl();
		return classType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AnnotationType createAnnotationType() {
		AnnotationTypeImpl annotationType = new AnnotationTypeImpl();
		return annotationType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ByValueFormalParameterType createByValueFormalParameterType() {
		ByValueFormalParameterTypeImpl byValueFormalParameterType = new ByValueFormalParameterTypeImpl();
		return byValueFormalParameterType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ByReferenceFormalParameterType createByReferenceFormalParameterType() {
		ByReferenceFormalParameterTypeImpl byReferenceFormalParameterType = new ByReferenceFormalParameterTypeImpl();
		return byReferenceFormalParameterType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Public createPublic() {
		PublicImpl public_ = new PublicImpl();
		return public_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Protected createProtected() {
		ProtectedImpl protected_ = new ProtectedImpl();
		return protected_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Private createPrivate() {
		PrivateImpl private_ = new PrivateImpl();
		return private_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnnamedTypeReference createUnnamedTypeReference() {
		UnnamedTypeReferenceImpl unnamedTypeReference = new UnnamedTypeReferenceImpl();
		return unnamedTypeReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NamedTypeReference createNamedTypeReference() {
		NamedTypeReferenceImpl namedTypeReference = new NamedTypeReferenceImpl();
		return namedTypeReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExpressionStatement createExpressionStatement() {
		ExpressionStatementImpl expressionStatement = new ExpressionStatementImpl();
		return expressionStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public JumpStatement createJumpStatement() {
		JumpStatementImpl jumpStatement = new JumpStatementImpl();
		return jumpStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BreakStatement createBreakStatement() {
		BreakStatementImpl breakStatement = new BreakStatementImpl();
		return breakStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ContinueStatement createContinueStatement() {
		ContinueStatementImpl continueStatement = new ContinueStatementImpl();
		return continueStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LabeledStatement createLabeledStatement() {
		LabeledStatementImpl labeledStatement = new LabeledStatementImpl();
		return labeledStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BlockStatement createBlockStatement() {
		BlockStatementImpl blockStatement = new BlockStatementImpl();
		return blockStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EmptyStatement createEmptyStatement() {
		EmptyStatementImpl emptyStatement = new EmptyStatementImpl();
		return emptyStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SwitchStatement createSwitchStatement() {
		SwitchStatementImpl switchStatement = new SwitchStatementImpl();
		return switchStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReturnStatement createReturnStatement() {
		ReturnStatementImpl returnStatement = new ReturnStatementImpl();
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LoopStatement createLoopStatement() {
		LoopStatementImpl loopStatement = new LoopStatementImpl();
		return loopStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TryStatement createTryStatement() {
		TryStatementImpl tryStatement = new TryStatementImpl();
		return tryStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DeclarationOrDefinitionStatement createDeclarationOrDefinitionStatement() {
		DeclarationOrDefinitionStatementImpl declarationOrDefinitionStatement = new DeclarationOrDefinitionStatementImpl();
		return declarationOrDefinitionStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ThrowStatement createThrowStatement() {
		ThrowStatementImpl throwStatement = new ThrowStatementImpl();
		return throwStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DeleteStatement createDeleteStatement() {
		DeleteStatementImpl deleteStatement = new DeleteStatementImpl();
		return deleteStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TerminateStatement createTerminateStatement() {
		TerminateStatementImpl terminateStatement = new TerminateStatementImpl();
		return terminateStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CaseBlock createCaseBlock() {
		CaseBlockImpl caseBlock = new CaseBlockImpl();
		return caseBlock;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DefaultBlock createDefaultBlock() {
		DefaultBlockImpl defaultBlock = new DefaultBlockImpl();
		return defaultBlock;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DoWhileStatement createDoWhileStatement() {
		DoWhileStatementImpl doWhileStatement = new DoWhileStatementImpl();
		return doWhileStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ForCheckBeforeStatement createForCheckBeforeStatement() {
		ForCheckBeforeStatementImpl forCheckBeforeStatement = new ForCheckBeforeStatementImpl();
		return forCheckBeforeStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ForCheckAfterStatement createForCheckAfterStatement() {
		ForCheckAfterStatementImpl forCheckAfterStatement = new ForCheckAfterStatementImpl();
		return forCheckAfterStatement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TypesCatchBlock createTypesCatchBlock() {
		TypesCatchBlockImpl typesCatchBlock = new TypesCatchBlockImpl();
		return typesCatchBlock;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VariableCatchBlock createVariableCatchBlock() {
		VariableCatchBlockImpl variableCatchBlock = new VariableCatchBlockImpl();
		return variableCatchBlock;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CastExpression createCastExpression() {
		CastExpressionImpl castExpression = new CastExpressionImpl();
		return castExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AggregateExpression createAggregateExpression() {
		AggregateExpressionImpl aggregateExpression = new AggregateExpressionImpl();
		return aggregateExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConditionalExpression createConditionalExpression() {
		ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
		return conditionalExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RangeExpression createRangeExpression() {
		RangeExpressionImpl rangeExpression = new RangeExpressionImpl();
		return rangeExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FunctionCallExpression createFunctionCallExpression() {
		FunctionCallExpressionImpl functionCallExpression = new FunctionCallExpressionImpl();
		return functionCallExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NewExpression createNewExpression() {
		NewExpressionImpl newExpression = new NewExpressionImpl();
		return newExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LabelAccess createLabelAccess() {
		LabelAccessImpl labelAccess = new LabelAccessImpl();
		return labelAccess;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ArrayAccess createArrayAccess() {
		ArrayAccessImpl arrayAccess = new ArrayAccessImpl();
		return arrayAccess;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AnnotationExpression createAnnotationExpression() {
		AnnotationExpressionImpl annotationExpression = new AnnotationExpressionImpl();
		return annotationExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CollectionExpression createCollectionExpression() {
		CollectionExpressionImpl collectionExpression = new CollectionExpressionImpl();
		return collectionExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IdentifierReference createIdentifierReference() {
		IdentifierReferenceImpl identifierReference = new IdentifierReferenceImpl();
		return identifierReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TypeQualifiedIdentifierReference createTypeQualifiedIdentifierReference() {
		TypeQualifiedIdentifierReferenceImpl typeQualifiedIdentifierReference = new TypeQualifiedIdentifierReferenceImpl();
		return typeQualifiedIdentifierReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public QualifiedOverPointer createQualifiedOverPointer() {
		QualifiedOverPointerImpl qualifiedOverPointer = new QualifiedOverPointerImpl();
		return qualifiedOverPointer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public QualifiedOverData createQualifiedOverData() {
		QualifiedOverDataImpl qualifiedOverData = new QualifiedOverDataImpl();
		return qualifiedOverData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IntegerLiteral createIntegerLiteral() {
		IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
		return integerLiteral;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CharLiteral createCharLiteral() {
		CharLiteralImpl charLiteral = new CharLiteralImpl();
		return charLiteral;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RealLiteral createRealLiteral() {
		RealLiteralImpl realLiteral = new RealLiteralImpl();
		return realLiteral;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BitLiteral createBitLiteral() {
		BitLiteralImpl bitLiteral = new BitLiteralImpl();
		return bitLiteral;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnumLiteral createEnumLiteral() {
		EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnaryPlus createUnaryPlus() {
		UnaryPlusImpl unaryPlus = new UnaryPlusImpl();
		return unaryPlus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UnaryMinus createUnaryMinus() {
		UnaryMinusImpl unaryMinus = new UnaryMinusImpl();
		return unaryMinus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BitNot createBitNot() {
		BitNotImpl bitNot = new BitNotImpl();
		return bitNot;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AddressOf createAddressOf() {
		AddressOfImpl addressOf = new AddressOfImpl();
		return addressOf;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Deref createDeref() {
		DerefImpl deref = new DerefImpl();
		return deref;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Increment createIncrement() {
		IncrementImpl increment = new IncrementImpl();
		return increment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Decrement createDecrement() {
		DecrementImpl decrement = new DecrementImpl();
		return decrement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PostIncrement createPostIncrement() {
		PostIncrementImpl postIncrement = new PostIncrementImpl();
		return postIncrement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PostDecrement createPostDecrement() {
		PostDecrementImpl postDecrement = new PostDecrementImpl();
		return postDecrement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Subtract createSubtract() {
		SubtractImpl subtract = new SubtractImpl();
		return subtract;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Multiply createMultiply() {
		MultiplyImpl multiply = new MultiplyImpl();
		return multiply;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Divide createDivide() {
		DivideImpl divide = new DivideImpl();
		return divide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Modulus createModulus() {
		ModulusImpl modulus = new ModulusImpl();
		return modulus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Exponent createExponent() {
		ExponentImpl exponent = new ExponentImpl();
		return exponent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Equal createEqual() {
		EqualImpl equal = new EqualImpl();
		return equal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotEqual createNotEqual() {
		NotEqualImpl notEqual = new NotEqualImpl();
		return notEqual;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Greater createGreater() {
		GreaterImpl greater = new GreaterImpl();
		return greater;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotGreater createNotGreater() {
		NotGreaterImpl notGreater = new NotGreaterImpl();
		return notGreater;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Less createLess() {
		LessImpl less = new LessImpl();
		return less;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotLess createNotLess() {
		NotLessImpl notLess = new NotLessImpl();
		return notLess;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BitAnd createBitAnd() {
		BitAndImpl bitAnd = new BitAndImpl();
		return bitAnd;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BitOr createBitOr() {
		BitOrImpl bitOr = new BitOrImpl();
		return bitOr;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BitXor createBitXor() {
		BitXorImpl bitXor = new BitXorImpl();
		return bitXor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BitLeftShift createBitLeftShift() {
		BitLeftShiftImpl bitLeftShift = new BitLeftShiftImpl();
		return bitLeftShift;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BitRightShift createBitRightShift() {
		BitRightShiftImpl bitRightShift = new BitRightShiftImpl();
		return bitRightShift;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Assign createAssign() {
		AssignImpl assign = new AssignImpl();
		return assign;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperatorAssign createOperatorAssign() {
		OperatorAssignImpl operatorAssign = new OperatorAssignImpl();
		return operatorAssign;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MissingActualParameter createMissingActualParameter() {
		MissingActualParameterImpl missingActualParameter = new MissingActualParameterImpl();
		return missingActualParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ByValueActualParameterExpression createByValueActualParameterExpression() {
		ByValueActualParameterExpressionImpl byValueActualParameterExpression = new ByValueActualParameterExpressionImpl();
		return byValueActualParameterExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ByReferenceActualParameterExpression createByReferenceActualParameterExpression() {
		ByReferenceActualParameterExpressionImpl byReferenceActualParameterExpression = new ByReferenceActualParameterExpressionImpl();
		return byReferenceActualParameterExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GASTMPackage getGASTMPackage() {
		return (GASTMPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GASTMPackage getPackage() {
		return GASTMPackage.eINSTANCE;
	}

} // GASTMFactoryImpl
