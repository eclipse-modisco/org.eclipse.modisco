/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
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
package org.eclipse.modisco.omg.gastm.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.omg.gastm.AccessKind;
import org.eclipse.modisco.omg.gastm.ActualParameter;
import org.eclipse.modisco.omg.gastm.ActualParameterExpression;
import org.eclipse.modisco.omg.gastm.Add;
import org.eclipse.modisco.omg.gastm.AddressOf;
import org.eclipse.modisco.omg.gastm.AggregateExpression;
import org.eclipse.modisco.omg.gastm.AggregateScope;
import org.eclipse.modisco.omg.gastm.AggregateType;
import org.eclipse.modisco.omg.gastm.AggregateTypeDeclaration;
import org.eclipse.modisco.omg.gastm.AggregateTypeDefinition;
import org.eclipse.modisco.omg.gastm.And;
import org.eclipse.modisco.omg.gastm.AnnotationExpression;
import org.eclipse.modisco.omg.gastm.AnnotationType;
import org.eclipse.modisco.omg.gastm.ArrayAccess;
import org.eclipse.modisco.omg.gastm.ArrayType;
import org.eclipse.modisco.omg.gastm.Assign;
import org.eclipse.modisco.omg.gastm.BinaryExpression;
import org.eclipse.modisco.omg.gastm.BinaryOperator;
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
import org.eclipse.modisco.omg.gastm.ConstructedType;
import org.eclipse.modisco.omg.gastm.ContinueStatement;
import org.eclipse.modisco.omg.gastm.DataDefinition;
import org.eclipse.modisco.omg.gastm.DataType;
import org.eclipse.modisco.omg.gastm.Declaration;
import org.eclipse.modisco.omg.gastm.DeclarationOrDefinition;
import org.eclipse.modisco.omg.gastm.DeclarationOrDefinitionStatement;
import org.eclipse.modisco.omg.gastm.Decrement;
import org.eclipse.modisco.omg.gastm.DefaultBlock;
import org.eclipse.modisco.omg.gastm.Definition;
import org.eclipse.modisco.omg.gastm.DefinitionObject;
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
import org.eclipse.modisco.omg.gastm.Expression;
import org.eclipse.modisco.omg.gastm.ExpressionStatement;
import org.eclipse.modisco.omg.gastm.External;
import org.eclipse.modisco.omg.gastm.FileLocal;
import org.eclipse.modisco.omg.gastm.ForCheckAfterStatement;
import org.eclipse.modisco.omg.gastm.ForCheckBeforeStatement;
import org.eclipse.modisco.omg.gastm.ForStatement;
import org.eclipse.modisco.omg.gastm.FormalParameterDeclaration;
import org.eclipse.modisco.omg.gastm.FormalParameterDefinition;
import org.eclipse.modisco.omg.gastm.FormalParameterType;
import org.eclipse.modisco.omg.gastm.FunctionCallExpression;
import org.eclipse.modisco.omg.gastm.FunctionDeclaration;
import org.eclipse.modisco.omg.gastm.FunctionDefinition;
import org.eclipse.modisco.omg.gastm.FunctionMemberAttributes;
import org.eclipse.modisco.omg.gastm.FunctionPersistent;
import org.eclipse.modisco.omg.gastm.FunctionScope;
import org.eclipse.modisco.omg.gastm.FunctionType;
import org.eclipse.modisco.omg.gastm.GASTMObject;
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.GASTMSemanticObject;
import org.eclipse.modisco.omg.gastm.GASTMSourceObject;
import org.eclipse.modisco.omg.gastm.GASTMSyntaxObject;
import org.eclipse.modisco.omg.gastm.GlobalScope;
import org.eclipse.modisco.omg.gastm.Greater;
import org.eclipse.modisco.omg.gastm.IdentifierReference;
import org.eclipse.modisco.omg.gastm.IfStatement;
import org.eclipse.modisco.omg.gastm.IncludeUnit;
import org.eclipse.modisco.omg.gastm.Increment;
import org.eclipse.modisco.omg.gastm.IntegerLiteral;
import org.eclipse.modisco.omg.gastm.IntegralType;
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
import org.eclipse.modisco.omg.gastm.MinorSyntaxObject;
import org.eclipse.modisco.omg.gastm.MissingActualParameter;
import org.eclipse.modisco.omg.gastm.Modulus;
import org.eclipse.modisco.omg.gastm.Multiply;
import org.eclipse.modisco.omg.gastm.Name;
import org.eclipse.modisco.omg.gastm.NameReference;
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
import org.eclipse.modisco.omg.gastm.NumberType;
import org.eclipse.modisco.omg.gastm.OperatorAssign;
import org.eclipse.modisco.omg.gastm.Or;
import org.eclipse.modisco.omg.gastm.PerClassMember;
import org.eclipse.modisco.omg.gastm.PointerType;
import org.eclipse.modisco.omg.gastm.PostDecrement;
import org.eclipse.modisco.omg.gastm.PostIncrement;
import org.eclipse.modisco.omg.gastm.PreprocessorElement;
import org.eclipse.modisco.omg.gastm.PrimitiveType;
import org.eclipse.modisco.omg.gastm.Private;
import org.eclipse.modisco.omg.gastm.ProgramScope;
import org.eclipse.modisco.omg.gastm.Project;
import org.eclipse.modisco.omg.gastm.Protected;
import org.eclipse.modisco.omg.gastm.Public;
import org.eclipse.modisco.omg.gastm.QualifiedIdentifierReference;
import org.eclipse.modisco.omg.gastm.QualifiedOverData;
import org.eclipse.modisco.omg.gastm.QualifiedOverPointer;
import org.eclipse.modisco.omg.gastm.RangeExpression;
import org.eclipse.modisco.omg.gastm.RangeType;
import org.eclipse.modisco.omg.gastm.Real;
import org.eclipse.modisco.omg.gastm.RealLiteral;
import org.eclipse.modisco.omg.gastm.RealType;
import org.eclipse.modisco.omg.gastm.ReferenceType;
import org.eclipse.modisco.omg.gastm.ReturnStatement;
import org.eclipse.modisco.omg.gastm.Scope;
import org.eclipse.modisco.omg.gastm.ShortInteger;
import org.eclipse.modisco.omg.gastm.SourceFile;
import org.eclipse.modisco.omg.gastm.SourceFileReference;
import org.eclipse.modisco.omg.gastm.SourceLocation;
import org.eclipse.modisco.omg.gastm.Statement;
import org.eclipse.modisco.omg.gastm.StorageSpecification;
import org.eclipse.modisco.omg.gastm.StringLiteral;
import org.eclipse.modisco.omg.gastm.StructureType;
import org.eclipse.modisco.omg.gastm.Subtract;
import org.eclipse.modisco.omg.gastm.SwitchCase;
import org.eclipse.modisco.omg.gastm.SwitchStatement;
import org.eclipse.modisco.omg.gastm.TerminateStatement;
import org.eclipse.modisco.omg.gastm.ThrowStatement;
import org.eclipse.modisco.omg.gastm.TryStatement;
import org.eclipse.modisco.omg.gastm.Type;
import org.eclipse.modisco.omg.gastm.TypeDeclaration;
import org.eclipse.modisco.omg.gastm.TypeDefinition;
import org.eclipse.modisco.omg.gastm.TypeQualifiedIdentifierReference;
import org.eclipse.modisco.omg.gastm.TypeReference;
import org.eclipse.modisco.omg.gastm.TypesCatchBlock;
import org.eclipse.modisco.omg.gastm.UnaryExpression;
import org.eclipse.modisco.omg.gastm.UnaryMinus;
import org.eclipse.modisco.omg.gastm.UnaryOperator;
import org.eclipse.modisco.omg.gastm.UnaryPlus;
import org.eclipse.modisco.omg.gastm.UnionType;
import org.eclipse.modisco.omg.gastm.UnnamedTypeReference;
import org.eclipse.modisco.omg.gastm.VariableCatchBlock;
import org.eclipse.modisco.omg.gastm.VariableDeclaration;
import org.eclipse.modisco.omg.gastm.VariableDefinition;
import org.eclipse.modisco.omg.gastm.Virtual;
import org.eclipse.modisco.omg.gastm.VirtualSpecification;
import org.eclipse.modisco.omg.gastm.WhileStatement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.omg.gastm.GASTMPackage
 * @generated
 */
public class GASTMSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GASTMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GASTMSwitch() {
		if (modelPackage == null) {
			modelPackage = GASTMPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GASTMPackage.GASTM_OBJECT: {
				GASTMObject gastmObject = (GASTMObject)theEObject;
				T result = caseGASTMObject(gastmObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.GASTM_SOURCE_OBJECT: {
				GASTMSourceObject gastmSourceObject = (GASTMSourceObject)theEObject;
				T result = caseGASTMSourceObject(gastmSourceObject);
				if (result == null) result = caseGASTMObject(gastmSourceObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.GASTM_SEMANTIC_OBJECT: {
				GASTMSemanticObject gastmSemanticObject = (GASTMSemanticObject)theEObject;
				T result = caseGASTMSemanticObject(gastmSemanticObject);
				if (result == null) result = caseGASTMObject(gastmSemanticObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.GASTM_SYNTAX_OBJECT: {
				GASTMSyntaxObject gastmSyntaxObject = (GASTMSyntaxObject)theEObject;
				T result = caseGASTMSyntaxObject(gastmSyntaxObject);
				if (result == null) result = caseGASTMObject(gastmSyntaxObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.SOURCE_FILE: {
				SourceFile sourceFile = (SourceFile)theEObject;
				T result = caseSourceFile(sourceFile);
				if (result == null) result = caseGASTMSourceObject(sourceFile);
				if (result == null) result = caseGASTMObject(sourceFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.SOURCE_LOCATION: {
				SourceLocation sourceLocation = (SourceLocation)theEObject;
				T result = caseSourceLocation(sourceLocation);
				if (result == null) result = caseGASTMSourceObject(sourceLocation);
				if (result == null) result = caseGASTMObject(sourceLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.COMPILATION_UNIT: {
				CompilationUnit compilationUnit = (CompilationUnit)theEObject;
				T result = caseCompilationUnit(compilationUnit);
				if (result == null) result = caseSourceFile(compilationUnit);
				if (result == null) result = caseGASTMSourceObject(compilationUnit);
				if (result == null) result = caseGASTMObject(compilationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.SOURCE_FILE_REFERENCE: {
				SourceFileReference sourceFileReference = (SourceFileReference)theEObject;
				T result = caseSourceFileReference(sourceFileReference);
				if (result == null) result = caseSourceFile(sourceFileReference);
				if (result == null) result = caseGASTMSourceObject(sourceFileReference);
				if (result == null) result = caseGASTMObject(sourceFileReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = caseGASTMSemanticObject(project);
				if (result == null) result = caseGASTMObject(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.SCOPE: {
				Scope scope = (Scope)theEObject;
				T result = caseScope(scope);
				if (result == null) result = caseGASTMSemanticObject(scope);
				if (result == null) result = caseGASTMObject(scope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.PROGRAM_SCOPE: {
				ProgramScope programScope = (ProgramScope)theEObject;
				T result = caseProgramScope(programScope);
				if (result == null) result = caseScope(programScope);
				if (result == null) result = caseGASTMSemanticObject(programScope);
				if (result == null) result = caseGASTMObject(programScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.FUNCTION_SCOPE: {
				FunctionScope functionScope = (FunctionScope)theEObject;
				T result = caseFunctionScope(functionScope);
				if (result == null) result = caseScope(functionScope);
				if (result == null) result = caseGASTMSemanticObject(functionScope);
				if (result == null) result = caseGASTMObject(functionScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.AGGREGATE_SCOPE: {
				AggregateScope aggregateScope = (AggregateScope)theEObject;
				T result = caseAggregateScope(aggregateScope);
				if (result == null) result = caseScope(aggregateScope);
				if (result == null) result = caseGASTMSemanticObject(aggregateScope);
				if (result == null) result = caseGASTMObject(aggregateScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BLOCK_SCOPE: {
				BlockScope blockScope = (BlockScope)theEObject;
				T result = caseBlockScope(blockScope);
				if (result == null) result = caseScope(blockScope);
				if (result == null) result = caseGASTMSemanticObject(blockScope);
				if (result == null) result = caseGASTMObject(blockScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.GLOBAL_SCOPE: {
				GlobalScope globalScope = (GlobalScope)theEObject;
				T result = caseGlobalScope(globalScope);
				if (result == null) result = caseScope(globalScope);
				if (result == null) result = caseGASTMSemanticObject(globalScope);
				if (result == null) result = caseGASTMObject(globalScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.PREPROCESSOR_ELEMENT: {
				PreprocessorElement preprocessorElement = (PreprocessorElement)theEObject;
				T result = casePreprocessorElement(preprocessorElement);
				if (result == null) result = caseGASTMSyntaxObject(preprocessorElement);
				if (result == null) result = caseGASTMObject(preprocessorElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.DEFINITION_OBJECT: {
				DefinitionObject definitionObject = (DefinitionObject)theEObject;
				T result = caseDefinitionObject(definitionObject);
				if (result == null) result = caseGASTMSyntaxObject(definitionObject);
				if (result == null) result = caseGASTMObject(definitionObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseGASTMSyntaxObject(type);
				if (result == null) result = caseGASTMObject(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseGASTMSyntaxObject(expression);
				if (result == null) result = caseGASTMObject(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = caseGASTMSyntaxObject(statement);
				if (result == null) result = caseGASTMObject(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.MINOR_SYNTAX_OBJECT: {
				MinorSyntaxObject minorSyntaxObject = (MinorSyntaxObject)theEObject;
				T result = caseMinorSyntaxObject(minorSyntaxObject);
				if (result == null) result = caseGASTMSyntaxObject(minorSyntaxObject);
				if (result == null) result = caseGASTMObject(minorSyntaxObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.DIMENSION: {
				Dimension dimension = (Dimension)theEObject;
				T result = caseDimension(dimension);
				if (result == null) result = caseMinorSyntaxObject(dimension);
				if (result == null) result = caseGASTMSyntaxObject(dimension);
				if (result == null) result = caseGASTMObject(dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.NAME: {
				Name name = (Name)theEObject;
				T result = caseName(name);
				if (result == null) result = caseMinorSyntaxObject(name);
				if (result == null) result = caseGASTMSyntaxObject(name);
				if (result == null) result = caseGASTMObject(name);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.SWITCH_CASE: {
				SwitchCase switchCase = (SwitchCase)theEObject;
				T result = caseSwitchCase(switchCase);
				if (result == null) result = caseMinorSyntaxObject(switchCase);
				if (result == null) result = caseGASTMSyntaxObject(switchCase);
				if (result == null) result = caseGASTMObject(switchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.CATCH_BLOCK: {
				CatchBlock catchBlock = (CatchBlock)theEObject;
				T result = caseCatchBlock(catchBlock);
				if (result == null) result = caseMinorSyntaxObject(catchBlock);
				if (result == null) result = caseGASTMSyntaxObject(catchBlock);
				if (result == null) result = caseGASTMObject(catchBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.UNARY_OPERATOR: {
				UnaryOperator unaryOperator = (UnaryOperator)theEObject;
				T result = caseUnaryOperator(unaryOperator);
				if (result == null) result = caseMinorSyntaxObject(unaryOperator);
				if (result == null) result = caseGASTMSyntaxObject(unaryOperator);
				if (result == null) result = caseGASTMObject(unaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BINARY_OPERATOR: {
				BinaryOperator binaryOperator = (BinaryOperator)theEObject;
				T result = caseBinaryOperator(binaryOperator);
				if (result == null) result = caseMinorSyntaxObject(binaryOperator);
				if (result == null) result = caseGASTMSyntaxObject(binaryOperator);
				if (result == null) result = caseGASTMObject(binaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.STORAGE_SPECIFICATION: {
				StorageSpecification storageSpecification = (StorageSpecification)theEObject;
				T result = caseStorageSpecification(storageSpecification);
				if (result == null) result = caseMinorSyntaxObject(storageSpecification);
				if (result == null) result = caseGASTMSyntaxObject(storageSpecification);
				if (result == null) result = caseGASTMObject(storageSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.VIRTUAL_SPECIFICATION: {
				VirtualSpecification virtualSpecification = (VirtualSpecification)theEObject;
				T result = caseVirtualSpecification(virtualSpecification);
				if (result == null) result = caseMinorSyntaxObject(virtualSpecification);
				if (result == null) result = caseGASTMSyntaxObject(virtualSpecification);
				if (result == null) result = caseGASTMObject(virtualSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.ACCESS_KIND: {
				AccessKind accessKind = (AccessKind)theEObject;
				T result = caseAccessKind(accessKind);
				if (result == null) result = caseMinorSyntaxObject(accessKind);
				if (result == null) result = caseGASTMSyntaxObject(accessKind);
				if (result == null) result = caseGASTMObject(accessKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.ACTUAL_PARAMETER: {
				ActualParameter actualParameter = (ActualParameter)theEObject;
				T result = caseActualParameter(actualParameter);
				if (result == null) result = caseMinorSyntaxObject(actualParameter);
				if (result == null) result = caseGASTMSyntaxObject(actualParameter);
				if (result == null) result = caseGASTMObject(actualParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES: {
				FunctionMemberAttributes functionMemberAttributes = (FunctionMemberAttributes)theEObject;
				T result = caseFunctionMemberAttributes(functionMemberAttributes);
				if (result == null) result = caseMinorSyntaxObject(functionMemberAttributes);
				if (result == null) result = caseGASTMSyntaxObject(functionMemberAttributes);
				if (result == null) result = caseGASTMObject(functionMemberAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.DERIVES_FROM: {
				DerivesFrom derivesFrom = (DerivesFrom)theEObject;
				T result = caseDerivesFrom(derivesFrom);
				if (result == null) result = caseMinorSyntaxObject(derivesFrom);
				if (result == null) result = caseGASTMSyntaxObject(derivesFrom);
				if (result == null) result = caseGASTMObject(derivesFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.MEMBER_OBJECT: {
				MemberObject memberObject = (MemberObject)theEObject;
				T result = caseMemberObject(memberObject);
				if (result == null) result = caseMinorSyntaxObject(memberObject);
				if (result == null) result = caseGASTMSyntaxObject(memberObject);
				if (result == null) result = caseGASTMObject(memberObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.DECLARATION_OR_DEFINITION: {
				DeclarationOrDefinition declarationOrDefinition = (DeclarationOrDefinition)theEObject;
				T result = caseDeclarationOrDefinition(declarationOrDefinition);
				if (result == null) result = caseDefinitionObject(declarationOrDefinition);
				if (result == null) result = caseGASTMSyntaxObject(declarationOrDefinition);
				if (result == null) result = caseGASTMObject(declarationOrDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.TYPE_DEFINITION: {
				TypeDefinition typeDefinition = (TypeDefinition)theEObject;
				T result = caseTypeDefinition(typeDefinition);
				if (result == null) result = caseDefinitionObject(typeDefinition);
				if (result == null) result = caseGASTMSyntaxObject(typeDefinition);
				if (result == null) result = caseGASTMObject(typeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.NAME_SPACE_DEFINITION: {
				NameSpaceDefinition nameSpaceDefinition = (NameSpaceDefinition)theEObject;
				T result = caseNameSpaceDefinition(nameSpaceDefinition);
				if (result == null) result = caseDefinitionObject(nameSpaceDefinition);
				if (result == null) result = caseGASTMSyntaxObject(nameSpaceDefinition);
				if (result == null) result = caseGASTMObject(nameSpaceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.LABEL_DEFINITION: {
				LabelDefinition labelDefinition = (LabelDefinition)theEObject;
				T result = caseLabelDefinition(labelDefinition);
				if (result == null) result = caseDefinitionObject(labelDefinition);
				if (result == null) result = caseGASTMSyntaxObject(labelDefinition);
				if (result == null) result = caseGASTMObject(labelDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.TYPE_DECLARATION: {
				TypeDeclaration typeDeclaration = (TypeDeclaration)theEObject;
				T result = caseTypeDeclaration(typeDeclaration);
				if (result == null) result = caseDefinitionObject(typeDeclaration);
				if (result == null) result = caseGASTMSyntaxObject(typeDeclaration);
				if (result == null) result = caseGASTMObject(typeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.DEFINITION: {
				Definition definition = (Definition)theEObject;
				T result = caseDefinition(definition);
				if (result == null) result = caseDeclarationOrDefinition(definition);
				if (result == null) result = caseDefinitionObject(definition);
				if (result == null) result = caseGASTMSyntaxObject(definition);
				if (result == null) result = caseGASTMObject(definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.DECLARATION: {
				Declaration declaration = (Declaration)theEObject;
				T result = caseDeclaration(declaration);
				if (result == null) result = caseDeclarationOrDefinition(declaration);
				if (result == null) result = caseDefinitionObject(declaration);
				if (result == null) result = caseGASTMSyntaxObject(declaration);
				if (result == null) result = caseGASTMObject(declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.FUNCTION_DEFINITION: {
				FunctionDefinition functionDefinition = (FunctionDefinition)theEObject;
				T result = caseFunctionDefinition(functionDefinition);
				if (result == null) result = caseDefinition(functionDefinition);
				if (result == null) result = caseDeclarationOrDefinition(functionDefinition);
				if (result == null) result = caseDefinitionObject(functionDefinition);
				if (result == null) result = caseGASTMSyntaxObject(functionDefinition);
				if (result == null) result = caseGASTMObject(functionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.ENTRY_DEFINITION: {
				EntryDefinition entryDefinition = (EntryDefinition)theEObject;
				T result = caseEntryDefinition(entryDefinition);
				if (result == null) result = caseDefinition(entryDefinition);
				if (result == null) result = caseDeclarationOrDefinition(entryDefinition);
				if (result == null) result = caseDefinitionObject(entryDefinition);
				if (result == null) result = caseGASTMSyntaxObject(entryDefinition);
				if (result == null) result = caseGASTMObject(entryDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.DATA_DEFINITION: {
				DataDefinition dataDefinition = (DataDefinition)theEObject;
				T result = caseDataDefinition(dataDefinition);
				if (result == null) result = caseDefinition(dataDefinition);
				if (result == null) result = caseDeclarationOrDefinition(dataDefinition);
				if (result == null) result = caseDefinitionObject(dataDefinition);
				if (result == null) result = caseGASTMSyntaxObject(dataDefinition);
				if (result == null) result = caseGASTMObject(dataDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.ENUM_LITERAL_DEFINITION: {
				EnumLiteralDefinition enumLiteralDefinition = (EnumLiteralDefinition)theEObject;
				T result = caseEnumLiteralDefinition(enumLiteralDefinition);
				if (result == null) result = caseDefinition(enumLiteralDefinition);
				if (result == null) result = caseDeclarationOrDefinition(enumLiteralDefinition);
				if (result == null) result = caseDefinitionObject(enumLiteralDefinition);
				if (result == null) result = caseGASTMSyntaxObject(enumLiteralDefinition);
				if (result == null) result = caseGASTMObject(enumLiteralDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.FUNCTION_DECLARATION: {
				FunctionDeclaration functionDeclaration = (FunctionDeclaration)theEObject;
				T result = caseFunctionDeclaration(functionDeclaration);
				if (result == null) result = caseDeclaration(functionDeclaration);
				if (result == null) result = caseDeclarationOrDefinition(functionDeclaration);
				if (result == null) result = caseDefinitionObject(functionDeclaration);
				if (result == null) result = caseGASTMSyntaxObject(functionDeclaration);
				if (result == null) result = caseGASTMObject(functionDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.VARIABLE_DECLARATION: {
				VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
				T result = caseVariableDeclaration(variableDeclaration);
				if (result == null) result = caseDeclaration(variableDeclaration);
				if (result == null) result = caseDeclarationOrDefinition(variableDeclaration);
				if (result == null) result = caseDefinitionObject(variableDeclaration);
				if (result == null) result = caseGASTMSyntaxObject(variableDeclaration);
				if (result == null) result = caseGASTMObject(variableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.FORMAL_PARAMETER_DECLARATION: {
				FormalParameterDeclaration formalParameterDeclaration = (FormalParameterDeclaration)theEObject;
				T result = caseFormalParameterDeclaration(formalParameterDeclaration);
				if (result == null) result = caseDeclaration(formalParameterDeclaration);
				if (result == null) result = caseDeclarationOrDefinition(formalParameterDeclaration);
				if (result == null) result = caseDefinitionObject(formalParameterDeclaration);
				if (result == null) result = caseGASTMSyntaxObject(formalParameterDeclaration);
				if (result == null) result = caseGASTMObject(formalParameterDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.EXTERNAL: {
				External external = (External)theEObject;
				T result = caseExternal(external);
				if (result == null) result = caseStorageSpecification(external);
				if (result == null) result = caseMinorSyntaxObject(external);
				if (result == null) result = caseGASTMSyntaxObject(external);
				if (result == null) result = caseGASTMObject(external);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.FUNCTION_PERSISTENT: {
				FunctionPersistent functionPersistent = (FunctionPersistent)theEObject;
				T result = caseFunctionPersistent(functionPersistent);
				if (result == null) result = caseStorageSpecification(functionPersistent);
				if (result == null) result = caseMinorSyntaxObject(functionPersistent);
				if (result == null) result = caseGASTMSyntaxObject(functionPersistent);
				if (result == null) result = caseGASTMObject(functionPersistent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.FILE_LOCAL: {
				FileLocal fileLocal = (FileLocal)theEObject;
				T result = caseFileLocal(fileLocal);
				if (result == null) result = caseStorageSpecification(fileLocal);
				if (result == null) result = caseMinorSyntaxObject(fileLocal);
				if (result == null) result = caseGASTMSyntaxObject(fileLocal);
				if (result == null) result = caseGASTMObject(fileLocal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.PER_CLASS_MEMBER: {
				PerClassMember perClassMember = (PerClassMember)theEObject;
				T result = casePerClassMember(perClassMember);
				if (result == null) result = caseStorageSpecification(perClassMember);
				if (result == null) result = caseMinorSyntaxObject(perClassMember);
				if (result == null) result = caseGASTMSyntaxObject(perClassMember);
				if (result == null) result = caseGASTMObject(perClassMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.NO_DEF: {
				NoDef noDef = (NoDef)theEObject;
				T result = caseNoDef(noDef);
				if (result == null) result = caseStorageSpecification(noDef);
				if (result == null) result = caseMinorSyntaxObject(noDef);
				if (result == null) result = caseGASTMSyntaxObject(noDef);
				if (result == null) result = caseGASTMObject(noDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.VIRTUAL: {
				Virtual virtual = (Virtual)theEObject;
				T result = caseVirtual(virtual);
				if (result == null) result = caseVirtualSpecification(virtual);
				if (result == null) result = caseMinorSyntaxObject(virtual);
				if (result == null) result = caseGASTMSyntaxObject(virtual);
				if (result == null) result = caseGASTMObject(virtual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.VARIABLE_DEFINITION: {
				VariableDefinition variableDefinition = (VariableDefinition)theEObject;
				T result = caseVariableDefinition(variableDefinition);
				if (result == null) result = caseDataDefinition(variableDefinition);
				if (result == null) result = caseDefinition(variableDefinition);
				if (result == null) result = caseDeclarationOrDefinition(variableDefinition);
				if (result == null) result = caseDefinitionObject(variableDefinition);
				if (result == null) result = caseGASTMSyntaxObject(variableDefinition);
				if (result == null) result = caseGASTMObject(variableDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.FORMAL_PARAMETER_DEFINITION: {
				FormalParameterDefinition formalParameterDefinition = (FormalParameterDefinition)theEObject;
				T result = caseFormalParameterDefinition(formalParameterDefinition);
				if (result == null) result = caseDataDefinition(formalParameterDefinition);
				if (result == null) result = caseDefinition(formalParameterDefinition);
				if (result == null) result = caseDeclarationOrDefinition(formalParameterDefinition);
				if (result == null) result = caseDefinitionObject(formalParameterDefinition);
				if (result == null) result = caseGASTMSyntaxObject(formalParameterDefinition);
				if (result == null) result = caseGASTMObject(formalParameterDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BIT_FIELD_DEFINITION: {
				BitFieldDefinition bitFieldDefinition = (BitFieldDefinition)theEObject;
				T result = caseBitFieldDefinition(bitFieldDefinition);
				if (result == null) result = caseDataDefinition(bitFieldDefinition);
				if (result == null) result = caseDefinition(bitFieldDefinition);
				if (result == null) result = caseDeclarationOrDefinition(bitFieldDefinition);
				if (result == null) result = caseDefinitionObject(bitFieldDefinition);
				if (result == null) result = caseGASTMSyntaxObject(bitFieldDefinition);
				if (result == null) result = caseGASTMObject(bitFieldDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.NAMED_TYPE_DEFINITION: {
				NamedTypeDefinition namedTypeDefinition = (NamedTypeDefinition)theEObject;
				T result = caseNamedTypeDefinition(namedTypeDefinition);
				if (result == null) result = caseTypeDefinition(namedTypeDefinition);
				if (result == null) result = caseDefinitionObject(namedTypeDefinition);
				if (result == null) result = caseGASTMSyntaxObject(namedTypeDefinition);
				if (result == null) result = caseGASTMObject(namedTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.AGGREGATE_TYPE_DEFINITION: {
				AggregateTypeDefinition aggregateTypeDefinition = (AggregateTypeDefinition)theEObject;
				T result = caseAggregateTypeDefinition(aggregateTypeDefinition);
				if (result == null) result = caseTypeDefinition(aggregateTypeDefinition);
				if (result == null) result = caseDefinitionObject(aggregateTypeDefinition);
				if (result == null) result = caseGASTMSyntaxObject(aggregateTypeDefinition);
				if (result == null) result = caseGASTMObject(aggregateTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.ENUM_TYPE_DEFINITION: {
				EnumTypeDefinition enumTypeDefinition = (EnumTypeDefinition)theEObject;
				T result = caseEnumTypeDefinition(enumTypeDefinition);
				if (result == null) result = caseTypeDefinition(enumTypeDefinition);
				if (result == null) result = caseDefinitionObject(enumTypeDefinition);
				if (result == null) result = caseGASTMSyntaxObject(enumTypeDefinition);
				if (result == null) result = caseGASTMObject(enumTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.AGGREGATE_TYPE_DECLARATION: {
				AggregateTypeDeclaration aggregateTypeDeclaration = (AggregateTypeDeclaration)theEObject;
				T result = caseAggregateTypeDeclaration(aggregateTypeDeclaration);
				if (result == null) result = caseTypeDeclaration(aggregateTypeDeclaration);
				if (result == null) result = caseDefinitionObject(aggregateTypeDeclaration);
				if (result == null) result = caseGASTMSyntaxObject(aggregateTypeDeclaration);
				if (result == null) result = caseGASTMObject(aggregateTypeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.ENUM_TYPE_DECLARATION: {
				EnumTypeDeclaration enumTypeDeclaration = (EnumTypeDeclaration)theEObject;
				T result = caseEnumTypeDeclaration(enumTypeDeclaration);
				if (result == null) result = caseTypeDeclaration(enumTypeDeclaration);
				if (result == null) result = caseDefinitionObject(enumTypeDeclaration);
				if (result == null) result = caseGASTMSyntaxObject(enumTypeDeclaration);
				if (result == null) result = caseGASTMObject(enumTypeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.INCLUDE_UNIT: {
				IncludeUnit includeUnit = (IncludeUnit)theEObject;
				T result = caseIncludeUnit(includeUnit);
				if (result == null) result = casePreprocessorElement(includeUnit);
				if (result == null) result = caseGASTMSyntaxObject(includeUnit);
				if (result == null) result = caseGASTMObject(includeUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.MACRO_CALL: {
				MacroCall macroCall = (MacroCall)theEObject;
				T result = caseMacroCall(macroCall);
				if (result == null) result = casePreprocessorElement(macroCall);
				if (result == null) result = caseGASTMSyntaxObject(macroCall);
				if (result == null) result = caseGASTMObject(macroCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.MACRO_DEFINITION: {
				MacroDefinition macroDefinition = (MacroDefinition)theEObject;
				T result = caseMacroDefinition(macroDefinition);
				if (result == null) result = casePreprocessorElement(macroDefinition);
				if (result == null) result = caseGASTMSyntaxObject(macroDefinition);
				if (result == null) result = caseGASTMObject(macroDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = casePreprocessorElement(comment);
				if (result == null) result = caseGASTMSyntaxObject(comment);
				if (result == null) result = caseGASTMObject(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.FUNCTION_TYPE: {
				FunctionType functionType = (FunctionType)theEObject;
				T result = caseFunctionType(functionType);
				if (result == null) result = caseType(functionType);
				if (result == null) result = caseGASTMSyntaxObject(functionType);
				if (result == null) result = caseGASTMObject(functionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseType(dataType);
				if (result == null) result = caseGASTMSyntaxObject(dataType);
				if (result == null) result = caseGASTMObject(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.LABEL_TYPE: {
				LabelType labelType = (LabelType)theEObject;
				T result = caseLabelType(labelType);
				if (result == null) result = caseType(labelType);
				if (result == null) result = caseGASTMSyntaxObject(labelType);
				if (result == null) result = caseGASTMObject(labelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.NAME_SPACE_TYPE: {
				NameSpaceType nameSpaceType = (NameSpaceType)theEObject;
				T result = caseNameSpaceType(nameSpaceType);
				if (result == null) result = caseType(nameSpaceType);
				if (result == null) result = caseGASTMSyntaxObject(nameSpaceType);
				if (result == null) result = caseGASTMObject(nameSpaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.TYPE_REFERENCE: {
				TypeReference typeReference = (TypeReference)theEObject;
				T result = caseTypeReference(typeReference);
				if (result == null) result = caseType(typeReference);
				if (result == null) result = caseGASTMSyntaxObject(typeReference);
				if (result == null) result = caseGASTMObject(typeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseDataType(primitiveType);
				if (result == null) result = caseType(primitiveType);
				if (result == null) result = caseGASTMSyntaxObject(primitiveType);
				if (result == null) result = caseGASTMObject(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.ENUM_TYPE: {
				EnumType enumType = (EnumType)theEObject;
				T result = caseEnumType(enumType);
				if (result == null) result = caseDataType(enumType);
				if (result == null) result = caseType(enumType);
				if (result == null) result = caseGASTMSyntaxObject(enumType);
				if (result == null) result = caseGASTMObject(enumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.CONSTRUCTED_TYPE: {
				ConstructedType constructedType = (ConstructedType)theEObject;
				T result = caseConstructedType(constructedType);
				if (result == null) result = caseDataType(constructedType);
				if (result == null) result = caseType(constructedType);
				if (result == null) result = caseGASTMSyntaxObject(constructedType);
				if (result == null) result = caseGASTMObject(constructedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.AGGREGATE_TYPE: {
				AggregateType aggregateType = (AggregateType)theEObject;
				T result = caseAggregateType(aggregateType);
				if (result == null) result = caseDataType(aggregateType);
				if (result == null) result = caseType(aggregateType);
				if (result == null) result = caseGASTMSyntaxObject(aggregateType);
				if (result == null) result = caseGASTMObject(aggregateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.EXCEPTION_TYPE: {
				ExceptionType exceptionType = (ExceptionType)theEObject;
				T result = caseExceptionType(exceptionType);
				if (result == null) result = caseDataType(exceptionType);
				if (result == null) result = caseType(exceptionType);
				if (result == null) result = caseGASTMSyntaxObject(exceptionType);
				if (result == null) result = caseGASTMObject(exceptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.FORMAL_PARAMETER_TYPE: {
				FormalParameterType formalParameterType = (FormalParameterType)theEObject;
				T result = caseFormalParameterType(formalParameterType);
				if (result == null) result = caseDataType(formalParameterType);
				if (result == null) result = caseType(formalParameterType);
				if (result == null) result = caseGASTMSyntaxObject(formalParameterType);
				if (result == null) result = caseGASTMObject(formalParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.NAMED_TYPE: {
				NamedType namedType = (NamedType)theEObject;
				T result = caseNamedType(namedType);
				if (result == null) result = caseDataType(namedType);
				if (result == null) result = caseType(namedType);
				if (result == null) result = caseGASTMSyntaxObject(namedType);
				if (result == null) result = caseGASTMObject(namedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.NUMBER_TYPE: {
				NumberType numberType = (NumberType)theEObject;
				T result = caseNumberType(numberType);
				if (result == null) result = casePrimitiveType(numberType);
				if (result == null) result = caseDataType(numberType);
				if (result == null) result = caseType(numberType);
				if (result == null) result = caseGASTMSyntaxObject(numberType);
				if (result == null) result = caseGASTMObject(numberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.VOID: {
				org.eclipse.modisco.omg.gastm.Void void_ = (org.eclipse.modisco.omg.gastm.Void)theEObject;
				T result = caseVoid(void_);
				if (result == null) result = casePrimitiveType(void_);
				if (result == null) result = caseDataType(void_);
				if (result == null) result = caseType(void_);
				if (result == null) result = caseGASTMSyntaxObject(void_);
				if (result == null) result = caseGASTMObject(void_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BOOLEAN: {
				org.eclipse.modisco.omg.gastm.Boolean boolean_ = (org.eclipse.modisco.omg.gastm.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = casePrimitiveType(boolean_);
				if (result == null) result = caseDataType(boolean_);
				if (result == null) result = caseType(boolean_);
				if (result == null) result = caseGASTMSyntaxObject(boolean_);
				if (result == null) result = caseGASTMObject(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.INTEGRAL_TYPE: {
				IntegralType integralType = (IntegralType)theEObject;
				T result = caseIntegralType(integralType);
				if (result == null) result = caseNumberType(integralType);
				if (result == null) result = casePrimitiveType(integralType);
				if (result == null) result = caseDataType(integralType);
				if (result == null) result = caseType(integralType);
				if (result == null) result = caseGASTMSyntaxObject(integralType);
				if (result == null) result = caseGASTMObject(integralType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.REAL_TYPE: {
				RealType realType = (RealType)theEObject;
				T result = caseRealType(realType);
				if (result == null) result = caseNumberType(realType);
				if (result == null) result = casePrimitiveType(realType);
				if (result == null) result = caseDataType(realType);
				if (result == null) result = caseType(realType);
				if (result == null) result = caseGASTMSyntaxObject(realType);
				if (result == null) result = caseGASTMObject(realType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BYTE: {
				org.eclipse.modisco.omg.gastm.Byte byte_ = (org.eclipse.modisco.omg.gastm.Byte)theEObject;
				T result = caseByte(byte_);
				if (result == null) result = caseNumberType(byte_);
				if (result == null) result = casePrimitiveType(byte_);
				if (result == null) result = caseDataType(byte_);
				if (result == null) result = caseType(byte_);
				if (result == null) result = caseGASTMSyntaxObject(byte_);
				if (result == null) result = caseGASTMObject(byte_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.CHARACTER: {
				org.eclipse.modisco.omg.gastm.Character character = (org.eclipse.modisco.omg.gastm.Character)theEObject;
				T result = caseCharacter(character);
				if (result == null) result = caseNumberType(character);
				if (result == null) result = casePrimitiveType(character);
				if (result == null) result = caseDataType(character);
				if (result == null) result = caseType(character);
				if (result == null) result = caseGASTMSyntaxObject(character);
				if (result == null) result = caseGASTMObject(character);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.SHORT_INTEGER: {
				ShortInteger shortInteger = (ShortInteger)theEObject;
				T result = caseShortInteger(shortInteger);
				if (result == null) result = caseIntegralType(shortInteger);
				if (result == null) result = caseNumberType(shortInteger);
				if (result == null) result = casePrimitiveType(shortInteger);
				if (result == null) result = caseDataType(shortInteger);
				if (result == null) result = caseType(shortInteger);
				if (result == null) result = caseGASTMSyntaxObject(shortInteger);
				if (result == null) result = caseGASTMObject(shortInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.INTEGER: {
				org.eclipse.modisco.omg.gastm.Integer integer = (org.eclipse.modisco.omg.gastm.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = caseIntegerLiteral(integer);
				if (result == null) result = caseLiteral(integer);
				if (result == null) result = caseExpression(integer);
				if (result == null) result = caseGASTMSyntaxObject(integer);
				if (result == null) result = caseGASTMObject(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.LONG_INTEGER: {
				LongInteger longInteger = (LongInteger)theEObject;
				T result = caseLongInteger(longInteger);
				if (result == null) result = caseIntegralType(longInteger);
				if (result == null) result = caseNumberType(longInteger);
				if (result == null) result = casePrimitiveType(longInteger);
				if (result == null) result = caseDataType(longInteger);
				if (result == null) result = caseType(longInteger);
				if (result == null) result = caseGASTMSyntaxObject(longInteger);
				if (result == null) result = caseGASTMObject(longInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.REAL: {
				Real real = (Real)theEObject;
				T result = caseReal(real);
				if (result == null) result = caseRealType(real);
				if (result == null) result = caseNumberType(real);
				if (result == null) result = casePrimitiveType(real);
				if (result == null) result = caseDataType(real);
				if (result == null) result = caseType(real);
				if (result == null) result = caseGASTMSyntaxObject(real);
				if (result == null) result = caseGASTMObject(real);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.DOUBLE: {
				org.eclipse.modisco.omg.gastm.Double double_ = (org.eclipse.modisco.omg.gastm.Double)theEObject;
				T result = caseDouble(double_);
				if (result == null) result = caseRealType(double_);
				if (result == null) result = caseNumberType(double_);
				if (result == null) result = casePrimitiveType(double_);
				if (result == null) result = caseDataType(double_);
				if (result == null) result = caseType(double_);
				if (result == null) result = caseGASTMSyntaxObject(double_);
				if (result == null) result = caseGASTMObject(double_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.LONG_DOUBLE: {
				LongDouble longDouble = (LongDouble)theEObject;
				T result = caseLongDouble(longDouble);
				if (result == null) result = caseRealType(longDouble);
				if (result == null) result = caseNumberType(longDouble);
				if (result == null) result = casePrimitiveType(longDouble);
				if (result == null) result = caseDataType(longDouble);
				if (result == null) result = caseType(longDouble);
				if (result == null) result = caseGASTMSyntaxObject(longDouble);
				if (result == null) result = caseGASTMObject(longDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.COLLECTION_TYPE: {
				CollectionType collectionType = (CollectionType)theEObject;
				T result = caseCollectionType(collectionType);
				if (result == null) result = caseConstructedType(collectionType);
				if (result == null) result = caseDataType(collectionType);
				if (result == null) result = caseType(collectionType);
				if (result == null) result = caseGASTMSyntaxObject(collectionType);
				if (result == null) result = caseGASTMObject(collectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.POINTER_TYPE: {
				PointerType pointerType = (PointerType)theEObject;
				T result = casePointerType(pointerType);
				if (result == null) result = caseConstructedType(pointerType);
				if (result == null) result = caseDataType(pointerType);
				if (result == null) result = caseType(pointerType);
				if (result == null) result = caseGASTMSyntaxObject(pointerType);
				if (result == null) result = caseGASTMObject(pointerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.REFERENCE_TYPE: {
				ReferenceType referenceType = (ReferenceType)theEObject;
				T result = caseReferenceType(referenceType);
				if (result == null) result = caseConstructedType(referenceType);
				if (result == null) result = caseDataType(referenceType);
				if (result == null) result = caseType(referenceType);
				if (result == null) result = caseGASTMSyntaxObject(referenceType);
				if (result == null) result = caseGASTMObject(referenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.RANGE_TYPE: {
				RangeType rangeType = (RangeType)theEObject;
				T result = caseRangeType(rangeType);
				if (result == null) result = caseConstructedType(rangeType);
				if (result == null) result = caseDataType(rangeType);
				if (result == null) result = caseType(rangeType);
				if (result == null) result = caseGASTMSyntaxObject(rangeType);
				if (result == null) result = caseGASTMObject(rangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.ARRAY_TYPE: {
				ArrayType arrayType = (ArrayType)theEObject;
				T result = caseArrayType(arrayType);
				if (result == null) result = caseConstructedType(arrayType);
				if (result == null) result = caseDataType(arrayType);
				if (result == null) result = caseType(arrayType);
				if (result == null) result = caseGASTMSyntaxObject(arrayType);
				if (result == null) result = caseGASTMObject(arrayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.STRUCTURE_TYPE: {
				StructureType structureType = (StructureType)theEObject;
				T result = caseStructureType(structureType);
				if (result == null) result = caseAggregateType(structureType);
				if (result == null) result = caseDataType(structureType);
				if (result == null) result = caseType(structureType);
				if (result == null) result = caseGASTMSyntaxObject(structureType);
				if (result == null) result = caseGASTMObject(structureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.UNION_TYPE: {
				UnionType unionType = (UnionType)theEObject;
				T result = caseUnionType(unionType);
				if (result == null) result = caseAggregateType(unionType);
				if (result == null) result = caseDataType(unionType);
				if (result == null) result = caseType(unionType);
				if (result == null) result = caseGASTMSyntaxObject(unionType);
				if (result == null) result = caseGASTMObject(unionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.CLASS_TYPE: {
				ClassType classType = (ClassType)theEObject;
				T result = caseClassType(classType);
				if (result == null) result = caseAggregateType(classType);
				if (result == null) result = caseDataType(classType);
				if (result == null) result = caseType(classType);
				if (result == null) result = caseGASTMSyntaxObject(classType);
				if (result == null) result = caseGASTMObject(classType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.ANNOTATION_TYPE: {
				AnnotationType annotationType = (AnnotationType)theEObject;
				T result = caseAnnotationType(annotationType);
				if (result == null) result = caseAggregateType(annotationType);
				if (result == null) result = caseDataType(annotationType);
				if (result == null) result = caseType(annotationType);
				if (result == null) result = caseGASTMSyntaxObject(annotationType);
				if (result == null) result = caseGASTMObject(annotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BY_VALUE_FORMAL_PARAMETER_TYPE: {
				ByValueFormalParameterType byValueFormalParameterType = (ByValueFormalParameterType)theEObject;
				T result = caseByValueFormalParameterType(byValueFormalParameterType);
				if (result == null) result = caseFormalParameterType(byValueFormalParameterType);
				if (result == null) result = caseDataType(byValueFormalParameterType);
				if (result == null) result = caseType(byValueFormalParameterType);
				if (result == null) result = caseGASTMSyntaxObject(byValueFormalParameterType);
				if (result == null) result = caseGASTMObject(byValueFormalParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BY_REFERENCE_FORMAL_PARAMETER_TYPE: {
				ByReferenceFormalParameterType byReferenceFormalParameterType = (ByReferenceFormalParameterType)theEObject;
				T result = caseByReferenceFormalParameterType(byReferenceFormalParameterType);
				if (result == null) result = caseFormalParameterType(byReferenceFormalParameterType);
				if (result == null) result = caseDataType(byReferenceFormalParameterType);
				if (result == null) result = caseType(byReferenceFormalParameterType);
				if (result == null) result = caseGASTMSyntaxObject(byReferenceFormalParameterType);
				if (result == null) result = caseGASTMObject(byReferenceFormalParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.PUBLIC: {
				Public public_ = (Public)theEObject;
				T result = casePublic(public_);
				if (result == null) result = caseAccessKind(public_);
				if (result == null) result = caseMinorSyntaxObject(public_);
				if (result == null) result = caseGASTMSyntaxObject(public_);
				if (result == null) result = caseGASTMObject(public_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.PROTECTED: {
				Protected protected_ = (Protected)theEObject;
				T result = caseProtected(protected_);
				if (result == null) result = caseAccessKind(protected_);
				if (result == null) result = caseMinorSyntaxObject(protected_);
				if (result == null) result = caseGASTMSyntaxObject(protected_);
				if (result == null) result = caseGASTMObject(protected_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.PRIVATE: {
				Private private_ = (Private)theEObject;
				T result = casePrivate(private_);
				if (result == null) result = caseAccessKind(private_);
				if (result == null) result = caseMinorSyntaxObject(private_);
				if (result == null) result = caseGASTMSyntaxObject(private_);
				if (result == null) result = caseGASTMObject(private_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.UNNAMED_TYPE_REFERENCE: {
				UnnamedTypeReference unnamedTypeReference = (UnnamedTypeReference)theEObject;
				T result = caseUnnamedTypeReference(unnamedTypeReference);
				if (result == null) result = caseTypeReference(unnamedTypeReference);
				if (result == null) result = caseType(unnamedTypeReference);
				if (result == null) result = caseGASTMSyntaxObject(unnamedTypeReference);
				if (result == null) result = caseGASTMObject(unnamedTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.NAMED_TYPE_REFERENCE: {
				NamedTypeReference namedTypeReference = (NamedTypeReference)theEObject;
				T result = caseNamedTypeReference(namedTypeReference);
				if (result == null) result = caseTypeReference(namedTypeReference);
				if (result == null) result = caseType(namedTypeReference);
				if (result == null) result = caseGASTMSyntaxObject(namedTypeReference);
				if (result == null) result = caseGASTMObject(namedTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.EXPRESSION_STATEMENT: {
				ExpressionStatement expressionStatement = (ExpressionStatement)theEObject;
				T result = caseExpressionStatement(expressionStatement);
				if (result == null) result = caseStatement(expressionStatement);
				if (result == null) result = caseGASTMSyntaxObject(expressionStatement);
				if (result == null) result = caseGASTMObject(expressionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.JUMP_STATEMENT: {
				JumpStatement jumpStatement = (JumpStatement)theEObject;
				T result = caseJumpStatement(jumpStatement);
				if (result == null) result = caseStatement(jumpStatement);
				if (result == null) result = caseGASTMSyntaxObject(jumpStatement);
				if (result == null) result = caseGASTMObject(jumpStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BREAK_STATEMENT: {
				BreakStatement breakStatement = (BreakStatement)theEObject;
				T result = caseBreakStatement(breakStatement);
				if (result == null) result = caseStatement(breakStatement);
				if (result == null) result = caseGASTMSyntaxObject(breakStatement);
				if (result == null) result = caseGASTMObject(breakStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.CONTINUE_STATEMENT: {
				ContinueStatement continueStatement = (ContinueStatement)theEObject;
				T result = caseContinueStatement(continueStatement);
				if (result == null) result = caseStatement(continueStatement);
				if (result == null) result = caseGASTMSyntaxObject(continueStatement);
				if (result == null) result = caseGASTMObject(continueStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.LABELED_STATEMENT: {
				LabeledStatement labeledStatement = (LabeledStatement)theEObject;
				T result = caseLabeledStatement(labeledStatement);
				if (result == null) result = caseStatement(labeledStatement);
				if (result == null) result = caseGASTMSyntaxObject(labeledStatement);
				if (result == null) result = caseGASTMObject(labeledStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BLOCK_STATEMENT: {
				BlockStatement blockStatement = (BlockStatement)theEObject;
				T result = caseBlockStatement(blockStatement);
				if (result == null) result = caseStatement(blockStatement);
				if (result == null) result = caseGASTMSyntaxObject(blockStatement);
				if (result == null) result = caseGASTMObject(blockStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.EMPTY_STATEMENT: {
				EmptyStatement emptyStatement = (EmptyStatement)theEObject;
				T result = caseEmptyStatement(emptyStatement);
				if (result == null) result = caseStatement(emptyStatement);
				if (result == null) result = caseGASTMSyntaxObject(emptyStatement);
				if (result == null) result = caseGASTMObject(emptyStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.IF_STATEMENT: {
				IfStatement ifStatement = (IfStatement)theEObject;
				T result = caseIfStatement(ifStatement);
				if (result == null) result = caseStatement(ifStatement);
				if (result == null) result = caseGASTMSyntaxObject(ifStatement);
				if (result == null) result = caseGASTMObject(ifStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.SWITCH_STATEMENT: {
				SwitchStatement switchStatement = (SwitchStatement)theEObject;
				T result = caseSwitchStatement(switchStatement);
				if (result == null) result = caseStatement(switchStatement);
				if (result == null) result = caseGASTMSyntaxObject(switchStatement);
				if (result == null) result = caseGASTMObject(switchStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.RETURN_STATEMENT: {
				ReturnStatement returnStatement = (ReturnStatement)theEObject;
				T result = caseReturnStatement(returnStatement);
				if (result == null) result = caseStatement(returnStatement);
				if (result == null) result = caseGASTMSyntaxObject(returnStatement);
				if (result == null) result = caseGASTMObject(returnStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.LOOP_STATEMENT: {
				LoopStatement loopStatement = (LoopStatement)theEObject;
				T result = caseLoopStatement(loopStatement);
				if (result == null) result = caseStatement(loopStatement);
				if (result == null) result = caseGASTMSyntaxObject(loopStatement);
				if (result == null) result = caseGASTMObject(loopStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.TRY_STATEMENT: {
				TryStatement tryStatement = (TryStatement)theEObject;
				T result = caseTryStatement(tryStatement);
				if (result == null) result = caseStatement(tryStatement);
				if (result == null) result = caseGASTMSyntaxObject(tryStatement);
				if (result == null) result = caseGASTMObject(tryStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.DECLARATION_OR_DEFINITION_STATEMENT: {
				DeclarationOrDefinitionStatement declarationOrDefinitionStatement = (DeclarationOrDefinitionStatement)theEObject;
				T result = caseDeclarationOrDefinitionStatement(declarationOrDefinitionStatement);
				if (result == null) result = caseStatement(declarationOrDefinitionStatement);
				if (result == null) result = caseGASTMSyntaxObject(declarationOrDefinitionStatement);
				if (result == null) result = caseGASTMObject(declarationOrDefinitionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.THROW_STATEMENT: {
				ThrowStatement throwStatement = (ThrowStatement)theEObject;
				T result = caseThrowStatement(throwStatement);
				if (result == null) result = caseStatement(throwStatement);
				if (result == null) result = caseGASTMSyntaxObject(throwStatement);
				if (result == null) result = caseGASTMObject(throwStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.DELETE_STATEMENT: {
				DeleteStatement deleteStatement = (DeleteStatement)theEObject;
				T result = caseDeleteStatement(deleteStatement);
				if (result == null) result = caseStatement(deleteStatement);
				if (result == null) result = caseGASTMSyntaxObject(deleteStatement);
				if (result == null) result = caseGASTMObject(deleteStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.TERMINATE_STATEMENT: {
				TerminateStatement terminateStatement = (TerminateStatement)theEObject;
				T result = caseTerminateStatement(terminateStatement);
				if (result == null) result = caseStatement(terminateStatement);
				if (result == null) result = caseGASTMSyntaxObject(terminateStatement);
				if (result == null) result = caseGASTMObject(terminateStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.CASE_BLOCK: {
				CaseBlock caseBlock = (CaseBlock)theEObject;
				T result = caseCaseBlock(caseBlock);
				if (result == null) result = caseSwitchCase(caseBlock);
				if (result == null) result = caseMinorSyntaxObject(caseBlock);
				if (result == null) result = caseGASTMSyntaxObject(caseBlock);
				if (result == null) result = caseGASTMObject(caseBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.DEFAULT_BLOCK: {
				DefaultBlock defaultBlock = (DefaultBlock)theEObject;
				T result = caseDefaultBlock(defaultBlock);
				if (result == null) result = caseSwitchCase(defaultBlock);
				if (result == null) result = caseMinorSyntaxObject(defaultBlock);
				if (result == null) result = caseGASTMSyntaxObject(defaultBlock);
				if (result == null) result = caseGASTMObject(defaultBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.WHILE_STATEMENT: {
				WhileStatement whileStatement = (WhileStatement)theEObject;
				T result = caseWhileStatement(whileStatement);
				if (result == null) result = caseLoopStatement(whileStatement);
				if (result == null) result = caseStatement(whileStatement);
				if (result == null) result = caseGASTMSyntaxObject(whileStatement);
				if (result == null) result = caseGASTMObject(whileStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.DO_WHILE_STATEMENT: {
				DoWhileStatement doWhileStatement = (DoWhileStatement)theEObject;
				T result = caseDoWhileStatement(doWhileStatement);
				if (result == null) result = caseLoopStatement(doWhileStatement);
				if (result == null) result = caseStatement(doWhileStatement);
				if (result == null) result = caseGASTMSyntaxObject(doWhileStatement);
				if (result == null) result = caseGASTMObject(doWhileStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.FOR_STATEMENT: {
				ForStatement forStatement = (ForStatement)theEObject;
				T result = caseForStatement(forStatement);
				if (result == null) result = caseLoopStatement(forStatement);
				if (result == null) result = caseStatement(forStatement);
				if (result == null) result = caseGASTMSyntaxObject(forStatement);
				if (result == null) result = caseGASTMObject(forStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.FOR_CHECK_BEFORE_STATEMENT: {
				ForCheckBeforeStatement forCheckBeforeStatement = (ForCheckBeforeStatement)theEObject;
				T result = caseForCheckBeforeStatement(forCheckBeforeStatement);
				if (result == null) result = caseForStatement(forCheckBeforeStatement);
				if (result == null) result = caseLoopStatement(forCheckBeforeStatement);
				if (result == null) result = caseStatement(forCheckBeforeStatement);
				if (result == null) result = caseGASTMSyntaxObject(forCheckBeforeStatement);
				if (result == null) result = caseGASTMObject(forCheckBeforeStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.FOR_CHECK_AFTER_STATEMENT: {
				ForCheckAfterStatement forCheckAfterStatement = (ForCheckAfterStatement)theEObject;
				T result = caseForCheckAfterStatement(forCheckAfterStatement);
				if (result == null) result = caseForStatement(forCheckAfterStatement);
				if (result == null) result = caseLoopStatement(forCheckAfterStatement);
				if (result == null) result = caseStatement(forCheckAfterStatement);
				if (result == null) result = caseGASTMSyntaxObject(forCheckAfterStatement);
				if (result == null) result = caseGASTMObject(forCheckAfterStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.TYPES_CATCH_BLOCK: {
				TypesCatchBlock typesCatchBlock = (TypesCatchBlock)theEObject;
				T result = caseTypesCatchBlock(typesCatchBlock);
				if (result == null) result = caseCatchBlock(typesCatchBlock);
				if (result == null) result = caseMinorSyntaxObject(typesCatchBlock);
				if (result == null) result = caseGASTMSyntaxObject(typesCatchBlock);
				if (result == null) result = caseGASTMObject(typesCatchBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.VARIABLE_CATCH_BLOCK: {
				VariableCatchBlock variableCatchBlock = (VariableCatchBlock)theEObject;
				T result = caseVariableCatchBlock(variableCatchBlock);
				if (result == null) result = caseCatchBlock(variableCatchBlock);
				if (result == null) result = caseMinorSyntaxObject(variableCatchBlock);
				if (result == null) result = caseGASTMSyntaxObject(variableCatchBlock);
				if (result == null) result = caseGASTMObject(variableCatchBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseExpression(literal);
				if (result == null) result = caseGASTMSyntaxObject(literal);
				if (result == null) result = caseGASTMObject(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.CAST_EXPRESSION: {
				CastExpression castExpression = (CastExpression)theEObject;
				T result = caseCastExpression(castExpression);
				if (result == null) result = caseExpression(castExpression);
				if (result == null) result = caseGASTMSyntaxObject(castExpression);
				if (result == null) result = caseGASTMObject(castExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.AGGREGATE_EXPRESSION: {
				AggregateExpression aggregateExpression = (AggregateExpression)theEObject;
				T result = caseAggregateExpression(aggregateExpression);
				if (result == null) result = caseExpression(aggregateExpression);
				if (result == null) result = caseGASTMSyntaxObject(aggregateExpression);
				if (result == null) result = caseGASTMObject(aggregateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = caseGASTMSyntaxObject(unaryExpression);
				if (result == null) result = caseGASTMObject(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				T result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseExpression(binaryExpression);
				if (result == null) result = caseGASTMSyntaxObject(binaryExpression);
				if (result == null) result = caseGASTMObject(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.CONDITIONAL_EXPRESSION: {
				ConditionalExpression conditionalExpression = (ConditionalExpression)theEObject;
				T result = caseConditionalExpression(conditionalExpression);
				if (result == null) result = caseExpression(conditionalExpression);
				if (result == null) result = caseGASTMSyntaxObject(conditionalExpression);
				if (result == null) result = caseGASTMObject(conditionalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.RANGE_EXPRESSION: {
				RangeExpression rangeExpression = (RangeExpression)theEObject;
				T result = caseRangeExpression(rangeExpression);
				if (result == null) result = caseExpression(rangeExpression);
				if (result == null) result = caseGASTMSyntaxObject(rangeExpression);
				if (result == null) result = caseGASTMObject(rangeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.FUNCTION_CALL_EXPRESSION: {
				FunctionCallExpression functionCallExpression = (FunctionCallExpression)theEObject;
				T result = caseFunctionCallExpression(functionCallExpression);
				if (result == null) result = caseExpression(functionCallExpression);
				if (result == null) result = caseGASTMSyntaxObject(functionCallExpression);
				if (result == null) result = caseGASTMObject(functionCallExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.NEW_EXPRESSION: {
				NewExpression newExpression = (NewExpression)theEObject;
				T result = caseNewExpression(newExpression);
				if (result == null) result = caseExpression(newExpression);
				if (result == null) result = caseGASTMSyntaxObject(newExpression);
				if (result == null) result = caseGASTMObject(newExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.NAME_REFERENCE: {
				NameReference nameReference = (NameReference)theEObject;
				T result = caseNameReference(nameReference);
				if (result == null) result = caseExpression(nameReference);
				if (result == null) result = caseGASTMSyntaxObject(nameReference);
				if (result == null) result = caseGASTMObject(nameReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.LABEL_ACCESS: {
				LabelAccess labelAccess = (LabelAccess)theEObject;
				T result = caseLabelAccess(labelAccess);
				if (result == null) result = caseExpression(labelAccess);
				if (result == null) result = caseGASTMSyntaxObject(labelAccess);
				if (result == null) result = caseGASTMObject(labelAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.ARRAY_ACCESS: {
				ArrayAccess arrayAccess = (ArrayAccess)theEObject;
				T result = caseArrayAccess(arrayAccess);
				if (result == null) result = caseExpression(arrayAccess);
				if (result == null) result = caseGASTMSyntaxObject(arrayAccess);
				if (result == null) result = caseGASTMObject(arrayAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.ANNOTATION_EXPRESSION: {
				AnnotationExpression annotationExpression = (AnnotationExpression)theEObject;
				T result = caseAnnotationExpression(annotationExpression);
				if (result == null) result = caseExpression(annotationExpression);
				if (result == null) result = caseGASTMSyntaxObject(annotationExpression);
				if (result == null) result = caseGASTMObject(annotationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.COLLECTION_EXPRESSION: {
				CollectionExpression collectionExpression = (CollectionExpression)theEObject;
				T result = caseCollectionExpression(collectionExpression);
				if (result == null) result = caseExpression(collectionExpression);
				if (result == null) result = caseGASTMSyntaxObject(collectionExpression);
				if (result == null) result = caseGASTMObject(collectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.IDENTIFIER_REFERENCE: {
				IdentifierReference identifierReference = (IdentifierReference)theEObject;
				T result = caseIdentifierReference(identifierReference);
				if (result == null) result = caseNameReference(identifierReference);
				if (result == null) result = caseExpression(identifierReference);
				if (result == null) result = caseGASTMSyntaxObject(identifierReference);
				if (result == null) result = caseGASTMObject(identifierReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.QUALIFIED_IDENTIFIER_REFERENCE: {
				QualifiedIdentifierReference qualifiedIdentifierReference = (QualifiedIdentifierReference)theEObject;
				T result = caseQualifiedIdentifierReference(qualifiedIdentifierReference);
				if (result == null) result = caseNameReference(qualifiedIdentifierReference);
				if (result == null) result = caseExpression(qualifiedIdentifierReference);
				if (result == null) result = caseGASTMSyntaxObject(qualifiedIdentifierReference);
				if (result == null) result = caseGASTMObject(qualifiedIdentifierReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.TYPE_QUALIFIED_IDENTIFIER_REFERENCE: {
				TypeQualifiedIdentifierReference typeQualifiedIdentifierReference = (TypeQualifiedIdentifierReference)theEObject;
				T result = caseTypeQualifiedIdentifierReference(typeQualifiedIdentifierReference);
				if (result == null) result = caseNameReference(typeQualifiedIdentifierReference);
				if (result == null) result = caseExpression(typeQualifiedIdentifierReference);
				if (result == null) result = caseGASTMSyntaxObject(typeQualifiedIdentifierReference);
				if (result == null) result = caseGASTMObject(typeQualifiedIdentifierReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.QUALIFIED_OVER_POINTER: {
				QualifiedOverPointer qualifiedOverPointer = (QualifiedOverPointer)theEObject;
				T result = caseQualifiedOverPointer(qualifiedOverPointer);
				if (result == null) result = caseQualifiedIdentifierReference(qualifiedOverPointer);
				if (result == null) result = caseNameReference(qualifiedOverPointer);
				if (result == null) result = caseExpression(qualifiedOverPointer);
				if (result == null) result = caseGASTMSyntaxObject(qualifiedOverPointer);
				if (result == null) result = caseGASTMObject(qualifiedOverPointer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.QUALIFIED_OVER_DATA: {
				QualifiedOverData qualifiedOverData = (QualifiedOverData)theEObject;
				T result = caseQualifiedOverData(qualifiedOverData);
				if (result == null) result = caseQualifiedIdentifierReference(qualifiedOverData);
				if (result == null) result = caseNameReference(qualifiedOverData);
				if (result == null) result = caseExpression(qualifiedOverData);
				if (result == null) result = caseGASTMSyntaxObject(qualifiedOverData);
				if (result == null) result = caseGASTMObject(qualifiedOverData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.INTEGER_LITERAL: {
				IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
				T result = caseIntegerLiteral(integerLiteral);
				if (result == null) result = caseLiteral(integerLiteral);
				if (result == null) result = caseExpression(integerLiteral);
				if (result == null) result = caseGASTMSyntaxObject(integerLiteral);
				if (result == null) result = caseGASTMObject(integerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.CHAR_LITERAL: {
				CharLiteral charLiteral = (CharLiteral)theEObject;
				T result = caseCharLiteral(charLiteral);
				if (result == null) result = caseLiteral(charLiteral);
				if (result == null) result = caseExpression(charLiteral);
				if (result == null) result = caseGASTMSyntaxObject(charLiteral);
				if (result == null) result = caseGASTMObject(charLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.REAL_LITERAL: {
				RealLiteral realLiteral = (RealLiteral)theEObject;
				T result = caseRealLiteral(realLiteral);
				if (result == null) result = caseLiteral(realLiteral);
				if (result == null) result = caseExpression(realLiteral);
				if (result == null) result = caseGASTMSyntaxObject(realLiteral);
				if (result == null) result = caseGASTMObject(realLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.STRING_LITERAL: {
				StringLiteral stringLiteral = (StringLiteral)theEObject;
				T result = caseStringLiteral(stringLiteral);
				if (result == null) result = caseLiteral(stringLiteral);
				if (result == null) result = caseExpression(stringLiteral);
				if (result == null) result = caseGASTMSyntaxObject(stringLiteral);
				if (result == null) result = caseGASTMObject(stringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseLiteral(booleanLiteral);
				if (result == null) result = caseExpression(booleanLiteral);
				if (result == null) result = caseGASTMSyntaxObject(booleanLiteral);
				if (result == null) result = caseGASTMObject(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BIT_LITERAL: {
				BitLiteral bitLiteral = (BitLiteral)theEObject;
				T result = caseBitLiteral(bitLiteral);
				if (result == null) result = caseLiteral(bitLiteral);
				if (result == null) result = caseExpression(bitLiteral);
				if (result == null) result = caseGASTMSyntaxObject(bitLiteral);
				if (result == null) result = caseGASTMObject(bitLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.ENUM_LITERAL: {
				EnumLiteral enumLiteral = (EnumLiteral)theEObject;
				T result = caseEnumLiteral(enumLiteral);
				if (result == null) result = caseLiteral(enumLiteral);
				if (result == null) result = caseExpression(enumLiteral);
				if (result == null) result = caseGASTMSyntaxObject(enumLiteral);
				if (result == null) result = caseGASTMObject(enumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.UNARY_PLUS: {
				UnaryPlus unaryPlus = (UnaryPlus)theEObject;
				T result = caseUnaryPlus(unaryPlus);
				if (result == null) result = caseUnaryOperator(unaryPlus);
				if (result == null) result = caseMinorSyntaxObject(unaryPlus);
				if (result == null) result = caseGASTMSyntaxObject(unaryPlus);
				if (result == null) result = caseGASTMObject(unaryPlus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.UNARY_MINUS: {
				UnaryMinus unaryMinus = (UnaryMinus)theEObject;
				T result = caseUnaryMinus(unaryMinus);
				if (result == null) result = caseUnaryOperator(unaryMinus);
				if (result == null) result = caseMinorSyntaxObject(unaryMinus);
				if (result == null) result = caseGASTMSyntaxObject(unaryMinus);
				if (result == null) result = caseGASTMObject(unaryMinus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.NOT: {
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseUnaryOperator(not);
				if (result == null) result = caseMinorSyntaxObject(not);
				if (result == null) result = caseGASTMSyntaxObject(not);
				if (result == null) result = caseGASTMObject(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BIT_NOT: {
				BitNot bitNot = (BitNot)theEObject;
				T result = caseBitNot(bitNot);
				if (result == null) result = caseUnaryOperator(bitNot);
				if (result == null) result = caseMinorSyntaxObject(bitNot);
				if (result == null) result = caseGASTMSyntaxObject(bitNot);
				if (result == null) result = caseGASTMObject(bitNot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.ADDRESS_OF: {
				AddressOf addressOf = (AddressOf)theEObject;
				T result = caseAddressOf(addressOf);
				if (result == null) result = caseUnaryOperator(addressOf);
				if (result == null) result = caseMinorSyntaxObject(addressOf);
				if (result == null) result = caseGASTMSyntaxObject(addressOf);
				if (result == null) result = caseGASTMObject(addressOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.DEREF: {
				Deref deref = (Deref)theEObject;
				T result = caseDeref(deref);
				if (result == null) result = caseUnaryOperator(deref);
				if (result == null) result = caseMinorSyntaxObject(deref);
				if (result == null) result = caseGASTMSyntaxObject(deref);
				if (result == null) result = caseGASTMObject(deref);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.INCREMENT: {
				Increment increment = (Increment)theEObject;
				T result = caseIncrement(increment);
				if (result == null) result = caseUnaryOperator(increment);
				if (result == null) result = caseMinorSyntaxObject(increment);
				if (result == null) result = caseGASTMSyntaxObject(increment);
				if (result == null) result = caseGASTMObject(increment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.DECREMENT: {
				Decrement decrement = (Decrement)theEObject;
				T result = caseDecrement(decrement);
				if (result == null) result = caseUnaryOperator(decrement);
				if (result == null) result = caseMinorSyntaxObject(decrement);
				if (result == null) result = caseGASTMSyntaxObject(decrement);
				if (result == null) result = caseGASTMObject(decrement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.POST_INCREMENT: {
				PostIncrement postIncrement = (PostIncrement)theEObject;
				T result = casePostIncrement(postIncrement);
				if (result == null) result = caseUnaryOperator(postIncrement);
				if (result == null) result = caseMinorSyntaxObject(postIncrement);
				if (result == null) result = caseGASTMSyntaxObject(postIncrement);
				if (result == null) result = caseGASTMObject(postIncrement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.POST_DECREMENT: {
				PostDecrement postDecrement = (PostDecrement)theEObject;
				T result = casePostDecrement(postDecrement);
				if (result == null) result = caseUnaryOperator(postDecrement);
				if (result == null) result = caseMinorSyntaxObject(postDecrement);
				if (result == null) result = caseGASTMSyntaxObject(postDecrement);
				if (result == null) result = caseGASTMObject(postDecrement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.ADD: {
				Add add = (Add)theEObject;
				T result = caseAdd(add);
				if (result == null) result = caseBinaryOperator(add);
				if (result == null) result = caseMinorSyntaxObject(add);
				if (result == null) result = caseGASTMSyntaxObject(add);
				if (result == null) result = caseGASTMObject(add);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.SUBTRACT: {
				Subtract subtract = (Subtract)theEObject;
				T result = caseSubtract(subtract);
				if (result == null) result = caseBinaryOperator(subtract);
				if (result == null) result = caseMinorSyntaxObject(subtract);
				if (result == null) result = caseGASTMSyntaxObject(subtract);
				if (result == null) result = caseGASTMObject(subtract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.MULTIPLY: {
				Multiply multiply = (Multiply)theEObject;
				T result = caseMultiply(multiply);
				if (result == null) result = caseBinaryOperator(multiply);
				if (result == null) result = caseMinorSyntaxObject(multiply);
				if (result == null) result = caseGASTMSyntaxObject(multiply);
				if (result == null) result = caseGASTMObject(multiply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.DIVIDE: {
				Divide divide = (Divide)theEObject;
				T result = caseDivide(divide);
				if (result == null) result = caseBinaryOperator(divide);
				if (result == null) result = caseMinorSyntaxObject(divide);
				if (result == null) result = caseGASTMSyntaxObject(divide);
				if (result == null) result = caseGASTMObject(divide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.MODULUS: {
				Modulus modulus = (Modulus)theEObject;
				T result = caseModulus(modulus);
				if (result == null) result = caseBinaryOperator(modulus);
				if (result == null) result = caseMinorSyntaxObject(modulus);
				if (result == null) result = caseGASTMSyntaxObject(modulus);
				if (result == null) result = caseGASTMObject(modulus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.EXPONENT: {
				Exponent exponent = (Exponent)theEObject;
				T result = caseExponent(exponent);
				if (result == null) result = caseBinaryOperator(exponent);
				if (result == null) result = caseMinorSyntaxObject(exponent);
				if (result == null) result = caseGASTMSyntaxObject(exponent);
				if (result == null) result = caseGASTMObject(exponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseBinaryOperator(and);
				if (result == null) result = caseMinorSyntaxObject(and);
				if (result == null) result = caseGASTMSyntaxObject(and);
				if (result == null) result = caseGASTMObject(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseBinaryOperator(or);
				if (result == null) result = caseMinorSyntaxObject(or);
				if (result == null) result = caseGASTMSyntaxObject(or);
				if (result == null) result = caseGASTMObject(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.EQUAL: {
				Equal equal = (Equal)theEObject;
				T result = caseEqual(equal);
				if (result == null) result = caseBinaryOperator(equal);
				if (result == null) result = caseMinorSyntaxObject(equal);
				if (result == null) result = caseGASTMSyntaxObject(equal);
				if (result == null) result = caseGASTMObject(equal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.NOT_EQUAL: {
				NotEqual notEqual = (NotEqual)theEObject;
				T result = caseNotEqual(notEqual);
				if (result == null) result = caseBinaryOperator(notEqual);
				if (result == null) result = caseMinorSyntaxObject(notEqual);
				if (result == null) result = caseGASTMSyntaxObject(notEqual);
				if (result == null) result = caseGASTMObject(notEqual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.GREATER: {
				Greater greater = (Greater)theEObject;
				T result = caseGreater(greater);
				if (result == null) result = caseBinaryOperator(greater);
				if (result == null) result = caseMinorSyntaxObject(greater);
				if (result == null) result = caseGASTMSyntaxObject(greater);
				if (result == null) result = caseGASTMObject(greater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.NOT_GREATER: {
				NotGreater notGreater = (NotGreater)theEObject;
				T result = caseNotGreater(notGreater);
				if (result == null) result = caseBinaryOperator(notGreater);
				if (result == null) result = caseMinorSyntaxObject(notGreater);
				if (result == null) result = caseGASTMSyntaxObject(notGreater);
				if (result == null) result = caseGASTMObject(notGreater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.LESS: {
				Less less = (Less)theEObject;
				T result = caseLess(less);
				if (result == null) result = caseBinaryOperator(less);
				if (result == null) result = caseMinorSyntaxObject(less);
				if (result == null) result = caseGASTMSyntaxObject(less);
				if (result == null) result = caseGASTMObject(less);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.NOT_LESS: {
				NotLess notLess = (NotLess)theEObject;
				T result = caseNotLess(notLess);
				if (result == null) result = caseBinaryOperator(notLess);
				if (result == null) result = caseMinorSyntaxObject(notLess);
				if (result == null) result = caseGASTMSyntaxObject(notLess);
				if (result == null) result = caseGASTMObject(notLess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BIT_AND: {
				BitAnd bitAnd = (BitAnd)theEObject;
				T result = caseBitAnd(bitAnd);
				if (result == null) result = caseBinaryOperator(bitAnd);
				if (result == null) result = caseMinorSyntaxObject(bitAnd);
				if (result == null) result = caseGASTMSyntaxObject(bitAnd);
				if (result == null) result = caseGASTMObject(bitAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BIT_OR: {
				BitOr bitOr = (BitOr)theEObject;
				T result = caseBitOr(bitOr);
				if (result == null) result = caseBinaryOperator(bitOr);
				if (result == null) result = caseMinorSyntaxObject(bitOr);
				if (result == null) result = caseGASTMSyntaxObject(bitOr);
				if (result == null) result = caseGASTMObject(bitOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BIT_XOR: {
				BitXor bitXor = (BitXor)theEObject;
				T result = caseBitXor(bitXor);
				if (result == null) result = caseBinaryOperator(bitXor);
				if (result == null) result = caseMinorSyntaxObject(bitXor);
				if (result == null) result = caseGASTMSyntaxObject(bitXor);
				if (result == null) result = caseGASTMObject(bitXor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BIT_LEFT_SHIFT: {
				BitLeftShift bitLeftShift = (BitLeftShift)theEObject;
				T result = caseBitLeftShift(bitLeftShift);
				if (result == null) result = caseBinaryOperator(bitLeftShift);
				if (result == null) result = caseMinorSyntaxObject(bitLeftShift);
				if (result == null) result = caseGASTMSyntaxObject(bitLeftShift);
				if (result == null) result = caseGASTMObject(bitLeftShift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BIT_RIGHT_SHIFT: {
				BitRightShift bitRightShift = (BitRightShift)theEObject;
				T result = caseBitRightShift(bitRightShift);
				if (result == null) result = caseBinaryOperator(bitRightShift);
				if (result == null) result = caseMinorSyntaxObject(bitRightShift);
				if (result == null) result = caseGASTMSyntaxObject(bitRightShift);
				if (result == null) result = caseGASTMObject(bitRightShift);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.ASSIGN: {
				Assign assign = (Assign)theEObject;
				T result = caseAssign(assign);
				if (result == null) result = caseBinaryOperator(assign);
				if (result == null) result = caseMinorSyntaxObject(assign);
				if (result == null) result = caseGASTMSyntaxObject(assign);
				if (result == null) result = caseGASTMObject(assign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.OPERATOR_ASSIGN: {
				OperatorAssign operatorAssign = (OperatorAssign)theEObject;
				T result = caseOperatorAssign(operatorAssign);
				if (result == null) result = caseBinaryOperator(operatorAssign);
				if (result == null) result = caseMinorSyntaxObject(operatorAssign);
				if (result == null) result = caseGASTMSyntaxObject(operatorAssign);
				if (result == null) result = caseGASTMObject(operatorAssign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.ACTUAL_PARAMETER_EXPRESSION: {
				ActualParameterExpression actualParameterExpression = (ActualParameterExpression)theEObject;
				T result = caseActualParameterExpression(actualParameterExpression);
				if (result == null) result = caseActualParameter(actualParameterExpression);
				if (result == null) result = caseMinorSyntaxObject(actualParameterExpression);
				if (result == null) result = caseGASTMSyntaxObject(actualParameterExpression);
				if (result == null) result = caseGASTMObject(actualParameterExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.MISSING_ACTUAL_PARAMETER: {
				MissingActualParameter missingActualParameter = (MissingActualParameter)theEObject;
				T result = caseMissingActualParameter(missingActualParameter);
				if (result == null) result = caseActualParameter(missingActualParameter);
				if (result == null) result = caseMinorSyntaxObject(missingActualParameter);
				if (result == null) result = caseGASTMSyntaxObject(missingActualParameter);
				if (result == null) result = caseGASTMObject(missingActualParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BY_VALUE_ACTUAL_PARAMETER_EXPRESSION: {
				ByValueActualParameterExpression byValueActualParameterExpression = (ByValueActualParameterExpression)theEObject;
				T result = caseByValueActualParameterExpression(byValueActualParameterExpression);
				if (result == null) result = caseActualParameterExpression(byValueActualParameterExpression);
				if (result == null) result = caseActualParameter(byValueActualParameterExpression);
				if (result == null) result = caseMinorSyntaxObject(byValueActualParameterExpression);
				if (result == null) result = caseGASTMSyntaxObject(byValueActualParameterExpression);
				if (result == null) result = caseGASTMObject(byValueActualParameterExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GASTMPackage.BY_REFERENCE_ACTUAL_PARAMETER_EXPRESSION: {
				ByReferenceActualParameterExpression byReferenceActualParameterExpression = (ByReferenceActualParameterExpression)theEObject;
				T result = caseByReferenceActualParameterExpression(byReferenceActualParameterExpression);
				if (result == null) result = caseActualParameterExpression(byReferenceActualParameterExpression);
				if (result == null) result = caseActualParameter(byReferenceActualParameterExpression);
				if (result == null) result = caseMinorSyntaxObject(byReferenceActualParameterExpression);
				if (result == null) result = caseGASTMSyntaxObject(byReferenceActualParameterExpression);
				if (result == null) result = caseGASTMObject(byReferenceActualParameterExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGASTMObject(GASTMObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGASTMSourceObject(GASTMSourceObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGASTMSemanticObject(GASTMSemanticObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Syntax Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Syntax Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGASTMSyntaxObject(GASTMSyntaxObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceFile(SourceFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceLocation(SourceLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnit(CompilationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source File Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source File Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceFileReference(SourceFileReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScope(Scope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramScope(ProgramScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionScope(FunctionScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateScope(AggregateScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockScope(BlockScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalScope(GlobalScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preprocessor Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preprocessor Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreprocessorElement(PreprocessorElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionObject(DefinitionObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minor Syntax Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minor Syntax Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinorSyntaxObject(MinorSyntaxObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension(Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseName(Name object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchCase(SwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchBlock(CatchBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryOperator(UnaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOperator(BinaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageSpecification(StorageSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualSpecification(VirtualSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessKind(AccessKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualParameter(ActualParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Member Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Member Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionMemberAttributes(FunctionMemberAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derives From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derives From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivesFrom(DerivesFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberObject(MemberObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration Or Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration Or Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclarationOrDefinition(DeclarationOrDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefinition(TypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Space Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Space Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameSpaceDefinition(NameSpaceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelDefinition(LabelDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeclaration(TypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDefinition(FunctionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryDefinition(EntryDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDefinition(DataDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumLiteralDefinition(EnumLiteralDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDeclaration(FunctionDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Parameter Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Parameter Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalParameterDeclaration(FormalParameterDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternal(External object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Persistent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Persistent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionPersistent(FunctionPersistent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Local</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Local</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileLocal(FileLocal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Per Class Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Per Class Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerClassMember(PerClassMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoDef(NoDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtual(Virtual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDefinition(VariableDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Parameter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalParameterDefinition(FormalParameterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Field Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Field Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitFieldDefinition(BitFieldDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedTypeDefinition(NamedTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateTypeDefinition(AggregateTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumTypeDefinition(EnumTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateTypeDeclaration(AggregateTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumTypeDeclaration(EnumTypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludeUnit(IncludeUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Macro Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Macro Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacroCall(MacroCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Macro Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Macro Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacroDefinition(MacroDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionType(FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelType(LabelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Space Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Space Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameSpaceType(NameSpaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReference(TypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumType(EnumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructed Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructed Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructedType(ConstructedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateType(AggregateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionType(ExceptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalParameterType(FormalParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedType(NamedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberType(NumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoid(org.eclipse.modisco.omg.gastm.Void object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(org.eclipse.modisco.omg.gastm.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integral Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integral Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegralType(IntegralType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealType(RealType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Byte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Byte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByte(org.eclipse.modisco.omg.gastm.Byte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacter(org.eclipse.modisco.omg.gastm.Character object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortInteger(ShortInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(org.eclipse.modisco.omg.gastm.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongInteger(LongInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReal(Real object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouble(org.eclipse.modisco.omg.gastm.Double object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongDouble(LongDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionType(CollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointerType(PointerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeType(RangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayType(ArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructureType(StructureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionType(UnionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassType(ClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationType(AnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>By Value Formal Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>By Value Formal Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByValueFormalParameterType(ByValueFormalParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>By Reference Formal Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>By Reference Formal Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByReferenceFormalParameterType(ByReferenceFormalParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublic(Public object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protected</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protected</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtected(Protected object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivate(Private object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unnamed Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unnamed Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnnamedTypeReference(UnnamedTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedTypeReference(NamedTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionStatement(ExpressionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumpStatement(JumpStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakStatement(BreakStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinueStatement(ContinueStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledStatement(LabeledStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockStatement(BlockStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyStatement(EmptyStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchStatement(SwitchStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnStatement(ReturnStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopStatement(LoopStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Try Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Try Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTryStatement(TryStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration Or Definition Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration Or Definition Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclarationOrDefinitionStatement(DeclarationOrDefinitionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrowStatement(ThrowStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteStatement(DeleteStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminate Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminate Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminateStatement(TerminateStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseBlock(CaseBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultBlock(DefaultBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileStatement(WhileStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do While Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoWhileStatement(DoWhileStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForStatement(ForStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Check Before Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Check Before Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForCheckBeforeStatement(ForCheckBeforeStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Check After Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Check After Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForCheckAfterStatement(ForCheckAfterStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Types Catch Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types Catch Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypesCatchBlock(TypesCatchBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Catch Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Catch Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableCatchBlock(VariableCatchBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCastExpression(CastExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateExpression(AggregateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalExpression(ConditionalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeExpression(RangeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Call Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionCallExpression(FunctionCallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewExpression(NewExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameReference(NameReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelAccess(LabelAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayAccess(ArrayAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationExpression(AnnotationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionExpression(CollectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierReference(IdentifierReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Identifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Identifier Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiedIdentifierReference(QualifiedIdentifierReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Qualified Identifier Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Qualified Identifier Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeQualifiedIdentifierReference(TypeQualifiedIdentifierReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Over Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Over Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiedOverPointer(QualifiedOverPointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Over Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Over Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiedOverData(QualifiedOverData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLiteral(IntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharLiteral(CharLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealLiteral(RealLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitLiteral(BitLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumLiteral(EnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryPlus(UnaryPlus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryMinus(UnaryMinus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitNot(BitNot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressOf(AddressOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeref(Deref object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Increment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Increment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncrement(Increment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decrement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decrement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecrement(Decrement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Increment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Increment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostIncrement(PostIncrement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Decrement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Decrement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostDecrement(PostDecrement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdd(Add object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtract(Subtract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiply(Multiply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivide(Divide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modulus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modulus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModulus(Modulus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExponent(Exponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqual(Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotEqual(NotEqual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreater(Greater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Greater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Greater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotGreater(NotGreater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLess(Less object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Less</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Less</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotLess(NotLess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitAnd(BitAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitOr(BitOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Xor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Xor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitXor(BitXor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Left Shift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Left Shift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitLeftShift(BitLeftShift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Right Shift</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Right Shift</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitRightShift(BitRightShift object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssign(Assign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatorAssign(OperatorAssign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Parameter Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualParameterExpression(ActualParameterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Missing Actual Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Missing Actual Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissingActualParameter(MissingActualParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>By Value Actual Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>By Value Actual Parameter Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByValueActualParameterExpression(ByValueActualParameterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>By Reference Actual Parameter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>By Reference Actual Parameter Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByReferenceActualParameterExpression(ByReferenceActualParameterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //GASTMSwitch
