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

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.modisco.omg.gastm.GASTMFactory;
import org.eclipse.modisco.omg.gastm.GASTMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GASTMPackageImpl extends EPackageImpl implements GASTMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "gastm.ecore"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gastmObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gastmSourceObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gastmSemanticObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gastmSyntaxObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFileReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preprocessorElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minorSyntaxObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catchBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionMemberAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivesFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationOrDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameSpaceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumLiteralDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalParameterDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionPersistentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileLocalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perClassMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalParameterDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitFieldDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macroCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macroDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameSpaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integralTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byValueFormalParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byReferenceFormalParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protectedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unnamedTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jumpStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continueStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tryStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationOrDefinitionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminateStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doWhileStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forCheckBeforeStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forCheckAfterStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesCatchBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableCatchBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass castExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionCallExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedIdentifierReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeQualifiedIdentifierReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedOverPointerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedOverDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryPlusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryMinusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitNotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incrementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decrementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postIncrementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postDecrementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notGreaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notLessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitXorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitLeftShiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitRightShiftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorAssignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualParameterExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missingActualParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byValueActualParameterExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byReferenceActualParameterExpressionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.modisco.omg.gastm.GASTMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GASTMPackageImpl() {
		super(eNS_URI, GASTMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GASTMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static GASTMPackage init() {
		if (isInited) return (GASTMPackage)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI);

		// Obtain or create and register package
		GASTMPackageImpl theGASTMPackage = (GASTMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GASTMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GASTMPackageImpl());

		isInited = true;

		// Load packages
		theGASTMPackage.loadPackage();

		// Fix loaded packages
		theGASTMPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theGASTMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GASTMPackage.eNS_URI, theGASTMPackage);
		return theGASTMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGASTMObject() {
		if (gastmObjectEClass == null) {
			gastmObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(0);
		}
		return gastmObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGASTMSourceObject() {
		if (gastmSourceObjectEClass == null) {
			gastmSourceObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(1);
		}
		return gastmSourceObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGASTMSemanticObject() {
		if (gastmSemanticObjectEClass == null) {
			gastmSemanticObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(2);
		}
		return gastmSemanticObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGASTMSyntaxObject() {
		if (gastmSyntaxObjectEClass == null) {
			gastmSyntaxObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(3);
		}
		return gastmSyntaxObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGASTMSyntaxObject_LocationInfo() {
        return (EReference)getGASTMSyntaxObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGASTMSyntaxObject_PreProcessorElements() {
        return (EReference)getGASTMSyntaxObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGASTMSyntaxObject_Annotations() {
        return (EReference)getGASTMSyntaxObject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceFile() {
		if (sourceFileEClass == null) {
			sourceFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(4);
		}
		return sourceFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceFile_Path() {
        return (EAttribute)getSourceFile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceLocation() {
		if (sourceLocationEClass == null) {
			sourceLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(5);
		}
		return sourceLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceLocation_StartLine() {
        return (EAttribute)getSourceLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceLocation_StartPosition() {
        return (EAttribute)getSourceLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceLocation_EndLine() {
        return (EAttribute)getSourceLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceLocation_EndPosition() {
        return (EAttribute)getSourceLocation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceLocation_InSourceFile() {
        return (EReference)getSourceLocation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationUnit() {
		if (compilationUnitEClass == null) {
			compilationUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(6);
		}
		return compilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompilationUnit_Language() {
        return (EAttribute)getCompilationUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_Fragments() {
        return (EReference)getCompilationUnit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_OpensScope() {
        return (EReference)getCompilationUnit().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceFileReference() {
		if (sourceFileReferenceEClass == null) {
			sourceFileReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(7);
		}
		return sourceFileReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceFileReference_LocationInfo() {
        return (EReference)getSourceFileReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceFileReference_OfSourceFile() {
        return (EReference)getSourceFileReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		if (projectEClass == null) {
			projectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(8);
		}
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Files() {
        return (EReference)getProject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_OuterScope() {
        return (EReference)getProject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScope() {
		if (scopeEClass == null) {
			scopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(9);
		}
		return scopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScope_DefinitionObject() {
        return (EReference)getScope().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScope_ChildScope() {
        return (EReference)getScope().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramScope() {
		if (programScopeEClass == null) {
			programScopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(10);
		}
		return programScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionScope() {
		if (functionScopeEClass == null) {
			functionScopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(11);
		}
		return functionScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateScope() {
		if (aggregateScopeEClass == null) {
			aggregateScopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(12);
		}
		return aggregateScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockScope() {
		if (blockScopeEClass == null) {
			blockScopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(13);
		}
		return blockScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalScope() {
		if (globalScopeEClass == null) {
			globalScopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(14);
		}
		return globalScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreprocessorElement() {
		if (preprocessorElementEClass == null) {
			preprocessorElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(15);
		}
		return preprocessorElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionObject() {
		if (definitionObjectEClass == null) {
			definitionObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(16);
		}
		return definitionObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		if (typeEClass == null) {
			typeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(17);
		}
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_IsConst() {
        return (EAttribute)getType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		if (expressionEClass == null) {
			expressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(18);
		}
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_ExpressionType() {
        return (EReference)getExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		if (statementEClass == null) {
			statementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(19);
		}
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinorSyntaxObject() {
		if (minorSyntaxObjectEClass == null) {
			minorSyntaxObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(20);
		}
		return minorSyntaxObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimension() {
		if (dimensionEClass == null) {
			dimensionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(21);
		}
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimension_LowBound() {
        return (EReference)getDimension().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimension_HighBound() {
        return (EReference)getDimension().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getName_() {
		if (nameEClass == null) {
			nameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(22);
		}
		return nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getName_NameString() {
        return (EAttribute)getName_().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchCase() {
		if (switchCaseEClass == null) {
			switchCaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(23);
		}
		return switchCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchCase_IsEvaluateAllCases() {
        return (EAttribute)getSwitchCase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchCase_Body() {
        return (EReference)getSwitchCase().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatchBlock() {
		if (catchBlockEClass == null) {
			catchBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(24);
		}
		return catchBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatchBlock_Body() {
        return (EReference)getCatchBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryOperator() {
		if (unaryOperatorEClass == null) {
			unaryOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(25);
		}
		return unaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryOperator() {
		if (binaryOperatorEClass == null) {
			binaryOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(26);
		}
		return binaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageSpecification() {
		if (storageSpecificationEClass == null) {
			storageSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(27);
		}
		return storageSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualSpecification() {
		if (virtualSpecificationEClass == null) {
			virtualSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(28);
		}
		return virtualSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessKind() {
		if (accessKindEClass == null) {
			accessKindEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(29);
		}
		return accessKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualParameter() {
		if (actualParameterEClass == null) {
			actualParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(30);
		}
		return actualParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionMemberAttributes() {
		if (functionMemberAttributesEClass == null) {
			functionMemberAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(31);
		}
		return functionMemberAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMemberAttributes_IsFriend() {
        return (EAttribute)getFunctionMemberAttributes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMemberAttributes_IsInLine() {
        return (EAttribute)getFunctionMemberAttributes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionMemberAttributes_IsThisConst() {
        return (EAttribute)getFunctionMemberAttributes().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionMemberAttributes_VirtualSpecifier() {
        return (EReference)getFunctionMemberAttributes().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivesFrom() {
		if (derivesFromEClass == null) {
			derivesFromEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(32);
		}
		return derivesFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivesFrom_VirtualSpecifier() {
        return (EReference)getDerivesFrom().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivesFrom_AccessKind() {
        return (EReference)getDerivesFrom().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivesFrom_ClassName() {
        return (EReference)getDerivesFrom().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberObject() {
		if (memberObjectEClass == null) {
			memberObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(33);
		}
		return memberObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberObject_Offset() {
        return (EAttribute)getMemberObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberObject_Member() {
        return (EReference)getMemberObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclarationOrDefinition() {
		if (declarationOrDefinitionEClass == null) {
			declarationOrDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(34);
		}
		return declarationOrDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclarationOrDefinition_StorageSpecifiers() {
        return (EReference)getDeclarationOrDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclarationOrDefinition_AccessKind() {
        return (EReference)getDeclarationOrDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeclarationOrDefinition_LinkageSpecifier() {
        return (EAttribute)getDeclarationOrDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinition() {
		if (typeDefinitionEClass == null) {
			typeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(35);
		}
		return typeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinition_TypeName() {
        return (EReference)getTypeDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameSpaceDefinition() {
		if (nameSpaceDefinitionEClass == null) {
			nameSpaceDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(36);
		}
		return nameSpaceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameSpaceDefinition_NameSpace() {
        return (EReference)getNameSpaceDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameSpaceDefinition_Body() {
        return (EReference)getNameSpaceDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameSpaceDefinition_NameSpaceType() {
        return (EReference)getNameSpaceDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelDefinition() {
		if (labelDefinitionEClass == null) {
			labelDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(37);
		}
		return labelDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelDefinition_LabelName() {
        return (EReference)getLabelDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelDefinition_LabelType() {
        return (EReference)getLabelDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDeclaration() {
		if (typeDeclarationEClass == null) {
			typeDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(38);
		}
		return typeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDeclaration_TypeRef() {
        return (EReference)getTypeDeclaration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinition() {
		if (definitionEClass == null) {
			definitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(39);
		}
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_IdentifierName() {
        return (EReference)getDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinition_DefinitionType() {
        return (EReference)getDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaration() {
		if (declarationEClass == null) {
			declarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(40);
		}
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_DefRef() {
        return (EReference)getDeclaration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_IdentifierName() {
        return (EReference)getDeclaration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_DeclarationType() {
        return (EReference)getDeclaration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDefinition() {
		if (functionDefinitionEClass == null) {
			functionDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(41);
		}
		return functionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_ReturnType() {
        return (EReference)getFunctionDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_FormalParameters() {
        return (EReference)getFunctionDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_Body() {
        return (EReference)getFunctionDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_FunctionMemberAttributes() {
        return (EReference)getFunctionDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_OpensScope() {
        return (EReference)getFunctionDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryDefinition() {
		if (entryDefinitionEClass == null) {
			entryDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(42);
		}
		return entryDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryDefinition_FormalParameters() {
        return (EReference)getEntryDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryDefinition_Body() {
        return (EReference)getEntryDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDefinition() {
		if (dataDefinitionEClass == null) {
			dataDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(43);
		}
		return dataDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDefinition_InitialValue() {
        return (EReference)getDataDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDefinition_IsMutable() {
        return (EAttribute)getDataDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumLiteralDefinition() {
		if (enumLiteralDefinitionEClass == null) {
			enumLiteralDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(44);
		}
		return enumLiteralDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumLiteralDefinition_Value() {
        return (EReference)getEnumLiteralDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDeclaration() {
		if (functionDeclarationEClass == null) {
			functionDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(45);
		}
		return functionDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDeclaration_FormalParameters() {
        return (EReference)getFunctionDeclaration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDeclaration_FunctionMemberAttributes() {
        return (EReference)getFunctionDeclaration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclaration() {
		if (variableDeclarationEClass == null) {
			variableDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(46);
		}
		return variableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDeclaration_IsMutable() {
        return (EAttribute)getVariableDeclaration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalParameterDeclaration() {
		if (formalParameterDeclarationEClass == null) {
			formalParameterDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(47);
		}
		return formalParameterDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternal() {
		if (externalEClass == null) {
			externalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(48);
		}
		return externalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionPersistent() {
		if (functionPersistentEClass == null) {
			functionPersistentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(49);
		}
		return functionPersistentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileLocal() {
		if (fileLocalEClass == null) {
			fileLocalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(50);
		}
		return fileLocalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerClassMember() {
		if (perClassMemberEClass == null) {
			perClassMemberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(51);
		}
		return perClassMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoDef() {
		if (noDefEClass == null) {
			noDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(52);
		}
		return noDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtual() {
		if (virtualEClass == null) {
			virtualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(53);
		}
		return virtualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDefinition() {
		if (variableDefinitionEClass == null) {
			variableDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(54);
		}
		return variableDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalParameterDefinition() {
		if (formalParameterDefinitionEClass == null) {
			formalParameterDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(55);
		}
		return formalParameterDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitFieldDefinition() {
		if (bitFieldDefinitionEClass == null) {
			bitFieldDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(56);
		}
		return bitFieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitFieldDefinition_BitFieldSize() {
        return (EReference)getBitFieldDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedTypeDefinition() {
		if (namedTypeDefinitionEClass == null) {
			namedTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(57);
		}
		return namedTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedTypeDefinition_DefinitionType() {
        return (EReference)getNamedTypeDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateTypeDefinition() {
		if (aggregateTypeDefinitionEClass == null) {
			aggregateTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(58);
		}
		return aggregateTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateTypeDefinition_AggregateType() {
        return (EReference)getAggregateTypeDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumTypeDefinition() {
		if (enumTypeDefinitionEClass == null) {
			enumTypeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(59);
		}
		return enumTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumTypeDefinition_DefinitionType() {
        return (EReference)getEnumTypeDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateTypeDeclaration() {
		if (aggregateTypeDeclarationEClass == null) {
			aggregateTypeDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(60);
		}
		return aggregateTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumTypeDeclaration() {
		if (enumTypeDeclarationEClass == null) {
			enumTypeDeclarationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(61);
		}
		return enumTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludeUnit() {
		if (includeUnitEClass == null) {
			includeUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(62);
		}
		return includeUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludeUnit_File() {
        return (EReference)getIncludeUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacroCall() {
		if (macroCallEClass == null) {
			macroCallEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(63);
		}
		return macroCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMacroCall_RefersTo() {
        return (EReference)getMacroCall().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacroDefinition() {
		if (macroDefinitionEClass == null) {
			macroDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(64);
		}
		return macroDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacroDefinition_MacroName() {
        return (EAttribute)getMacroDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacroDefinition_Body() {
        return (EAttribute)getMacroDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		if (commentEClass == null) {
			commentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(65);
		}
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Body() {
        return (EAttribute)getComment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionType() {
		if (functionTypeEClass == null) {
			functionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(66);
		}
		return functionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_ReturnType() {
        return (EReference)getFunctionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_ParameterTypes() {
        return (EReference)getFunctionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		if (dataTypeEClass == null) {
			dataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(67);
		}
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelType() {
		if (labelTypeEClass == null) {
			labelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(68);
		}
		return labelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameSpaceType() {
		if (nameSpaceTypeEClass == null) {
			nameSpaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(69);
		}
		return nameSpaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReference() {
		if (typeReferenceEClass == null) {
			typeReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(70);
		}
		return typeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		if (primitiveTypeEClass == null) {
			primitiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(71);
		}
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumType() {
		if (enumTypeEClass == null) {
			enumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(72);
		}
		return enumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumType_EnumLiterals() {
        return (EReference)getEnumType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructedType() {
		if (constructedTypeEClass == null) {
			constructedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(73);
		}
		return constructedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructedType_BaseType() {
        return (EReference)getConstructedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateType() {
		if (aggregateTypeEClass == null) {
			aggregateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(74);
		}
		return aggregateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateType_Members() {
        return (EReference)getAggregateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateType_OpensScope() {
        return (EReference)getAggregateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionType() {
		if (exceptionTypeEClass == null) {
			exceptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(75);
		}
		return exceptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalParameterType() {
		if (formalParameterTypeEClass == null) {
			formalParameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(76);
		}
		return formalParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalParameterType_Type() {
        return (EReference)getFormalParameterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedType() {
		if (namedTypeEClass == null) {
			namedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(77);
		}
		return namedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedType_Body() {
        return (EReference)getNamedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberType() {
		if (numberTypeEClass == null) {
			numberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(78);
		}
		return numberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_IsSigned() {
        return (EAttribute)getNumberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoid() {
		if (voidEClass == null) {
			voidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(79);
		}
		return voidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean() {
		if (booleanEClass == null) {
			booleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(80);
		}
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegralType() {
		if (integralTypeEClass == null) {
			integralTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(81);
		}
		return integralTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegralType_Size() {
        return (EAttribute)getIntegralType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealType() {
		if (realTypeEClass == null) {
			realTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(82);
		}
		return realTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Precision() {
        return (EAttribute)getRealType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByte() {
		if (byteEClass == null) {
			byteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(83);
		}
		return byteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter() {
		if (characterEClass == null) {
			characterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(84);
		}
		return characterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShortInteger() {
		if (shortIntegerEClass == null) {
			shortIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(85);
		}
		return shortIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger() {
		if (integerEClass == null) {
			integerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(86);
		}
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongInteger() {
		if (longIntegerEClass == null) {
			longIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(87);
		}
		return longIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReal() {
		if (realEClass == null) {
			realEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(88);
		}
		return realEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble() {
		if (doubleEClass == null) {
			doubleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(89);
		}
		return doubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongDouble() {
		if (longDoubleEClass == null) {
			longDoubleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(90);
		}
		return longDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionType() {
		if (collectionTypeEClass == null) {
			collectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(91);
		}
		return collectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointerType() {
		if (pointerTypeEClass == null) {
			pointerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(92);
		}
		return pointerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointerType_Size() {
        return (EAttribute)getPointerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceType() {
		if (referenceTypeEClass == null) {
			referenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(93);
		}
		return referenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeType() {
		if (rangeTypeEClass == null) {
			rangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(94);
		}
		return rangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayType() {
		if (arrayTypeEClass == null) {
			arrayTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(95);
		}
		return arrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayType_Ranks() {
        return (EReference)getArrayType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureType() {
		if (structureTypeEClass == null) {
			structureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(96);
		}
		return structureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionType() {
		if (unionTypeEClass == null) {
			unionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(97);
		}
		return unionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassType() {
		if (classTypeEClass == null) {
			classTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(98);
		}
		return classTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassType_DerivesFrom() {
        return (EReference)getClassType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationType() {
		if (annotationTypeEClass == null) {
			annotationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(99);
		}
		return annotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByValueFormalParameterType() {
		if (byValueFormalParameterTypeEClass == null) {
			byValueFormalParameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(100);
		}
		return byValueFormalParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByReferenceFormalParameterType() {
		if (byReferenceFormalParameterTypeEClass == null) {
			byReferenceFormalParameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(101);
		}
		return byReferenceFormalParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublic() {
		if (publicEClass == null) {
			publicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(102);
		}
		return publicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtected() {
		if (protectedEClass == null) {
			protectedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(103);
		}
		return protectedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivate() {
		if (privateEClass == null) {
			privateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(104);
		}
		return privateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnnamedTypeReference() {
		if (unnamedTypeReferenceEClass == null) {
			unnamedTypeReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(105);
		}
		return unnamedTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnnamedTypeReference_Type() {
        return (EReference)getUnnamedTypeReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedTypeReference() {
		if (namedTypeReferenceEClass == null) {
			namedTypeReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(106);
		}
		return namedTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedTypeReference_TypeName() {
        return (EReference)getNamedTypeReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedTypeReference_Type() {
        return (EReference)getNamedTypeReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionStatement() {
		if (expressionStatementEClass == null) {
			expressionStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(107);
		}
		return expressionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionStatement_Expression() {
        return (EReference)getExpressionStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJumpStatement() {
		if (jumpStatementEClass == null) {
			jumpStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(108);
		}
		return jumpStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJumpStatement_Target() {
        return (EReference)getJumpStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreakStatement() {
		if (breakStatementEClass == null) {
			breakStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(109);
		}
		return breakStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakStatement_Target() {
        return (EReference)getBreakStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinueStatement() {
		if (continueStatementEClass == null) {
			continueStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(110);
		}
		return continueStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContinueStatement_Target() {
        return (EReference)getContinueStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabeledStatement() {
		if (labeledStatementEClass == null) {
			labeledStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(111);
		}
		return labeledStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabeledStatement_Label() {
        return (EReference)getLabeledStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabeledStatement_Statement() {
        return (EReference)getLabeledStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockStatement() {
		if (blockStatementEClass == null) {
			blockStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(112);
		}
		return blockStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockStatement_SubStatements() {
        return (EReference)getBlockStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockStatement_OpensScope() {
        return (EReference)getBlockStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyStatement() {
		if (emptyStatementEClass == null) {
			emptyStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(113);
		}
		return emptyStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStatement() {
		if (ifStatementEClass == null) {
			ifStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(114);
		}
		return ifStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Condition() {
        return (EReference)getIfStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_ThenBody() {
        return (EReference)getIfStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_ElseBody() {
        return (EReference)getIfStatement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchStatement() {
		if (switchStatementEClass == null) {
			switchStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(115);
		}
		return switchStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchStatement_SwitchExpression() {
        return (EReference)getSwitchStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchStatement_Cases() {
        return (EReference)getSwitchStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnStatement() {
		if (returnStatementEClass == null) {
			returnStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(116);
		}
		return returnStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnStatement_ReturnValue() {
        return (EReference)getReturnStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopStatement() {
		if (loopStatementEClass == null) {
			loopStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(117);
		}
		return loopStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopStatement_Condition() {
        return (EReference)getLoopStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopStatement_Body() {
        return (EReference)getLoopStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTryStatement() {
		if (tryStatementEClass == null) {
			tryStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(118);
		}
		return tryStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTryStatement_GuardedStatement() {
        return (EReference)getTryStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTryStatement_CatchBlocks() {
        return (EReference)getTryStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTryStatement_FinalStatement() {
        return (EReference)getTryStatement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclarationOrDefinitionStatement() {
		if (declarationOrDefinitionStatementEClass == null) {
			declarationOrDefinitionStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(119);
		}
		return declarationOrDefinitionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclarationOrDefinitionStatement_DeclOrDefn() {
        return (EReference)getDeclarationOrDefinitionStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrowStatement() {
		if (throwStatementEClass == null) {
			throwStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(120);
		}
		return throwStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThrowStatement_Exception() {
        return (EReference)getThrowStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteStatement() {
		if (deleteStatementEClass == null) {
			deleteStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(121);
		}
		return deleteStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteStatement_Operand() {
        return (EReference)getDeleteStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminateStatement() {
		if (terminateStatementEClass == null) {
			terminateStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(122);
		}
		return terminateStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseBlock() {
		if (caseBlockEClass == null) {
			caseBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(123);
		}
		return caseBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaseBlock_CaseExpressions() {
        return (EReference)getCaseBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultBlock() {
		if (defaultBlockEClass == null) {
			defaultBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(124);
		}
		return defaultBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileStatement() {
		if (whileStatementEClass == null) {
			whileStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(125);
		}
		return whileStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoWhileStatement() {
		if (doWhileStatementEClass == null) {
			doWhileStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(126);
		}
		return doWhileStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForStatement() {
		if (forStatementEClass == null) {
			forStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(127);
		}
		return forStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_InitBody() {
        return (EReference)getForStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_IterationBody() {
        return (EReference)getForStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForCheckBeforeStatement() {
		if (forCheckBeforeStatementEClass == null) {
			forCheckBeforeStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(128);
		}
		return forCheckBeforeStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForCheckAfterStatement() {
		if (forCheckAfterStatementEClass == null) {
			forCheckAfterStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(129);
		}
		return forCheckAfterStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypesCatchBlock() {
		if (typesCatchBlockEClass == null) {
			typesCatchBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(130);
		}
		return typesCatchBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypesCatchBlock_Exceptions() {
        return (EReference)getTypesCatchBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableCatchBlock() {
		if (variableCatchBlockEClass == null) {
			variableCatchBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(131);
		}
		return variableCatchBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableCatchBlock_ExceptionVariable() {
        return (EReference)getVariableCatchBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		if (literalEClass == null) {
			literalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(132);
		}
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Value() {
        return (EAttribute)getLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCastExpression() {
		if (castExpressionEClass == null) {
			castExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(133);
		}
		return castExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCastExpression_CastType() {
        return (EReference)getCastExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCastExpression_Expression() {
        return (EReference)getCastExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateExpression() {
		if (aggregateExpressionEClass == null) {
			aggregateExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(134);
		}
		return aggregateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregateExpression_SubExpressions() {
        return (EReference)getAggregateExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		if (unaryExpressionEClass == null) {
			unaryExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(135);
		}
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Operator() {
        return (EReference)getUnaryExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Operand() {
        return (EReference)getUnaryExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		if (binaryExpressionEClass == null) {
			binaryExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(136);
		}
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Operator() {
        return (EReference)getBinaryExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_LeftOperand() {
        return (EReference)getBinaryExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_RightOperand() {
        return (EReference)getBinaryExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalExpression() {
		if (conditionalExpressionEClass == null) {
			conditionalExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(137);
		}
		return conditionalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_Condition() {
        return (EReference)getConditionalExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_OnTrueOperand() {
        return (EReference)getConditionalExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_OnFalseOperand() {
        return (EReference)getConditionalExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeExpression() {
		if (rangeExpressionEClass == null) {
			rangeExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(138);
		}
		return rangeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeExpression_FromExpression() {
        return (EReference)getRangeExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeExpression_ToExpression() {
        return (EReference)getRangeExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionCallExpression() {
		if (functionCallExpressionEClass == null) {
			functionCallExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(139);
		}
		return functionCallExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionCallExpression_CalledFunction() {
        return (EReference)getFunctionCallExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionCallExpression_ActualParams() {
        return (EReference)getFunctionCallExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewExpression() {
		if (newExpressionEClass == null) {
			newExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(140);
		}
		return newExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewExpression_NewType() {
        return (EReference)getNewExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewExpression_ActualParams() {
        return (EReference)getNewExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameReference() {
		if (nameReferenceEClass == null) {
			nameReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(141);
		}
		return nameReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameReference_Name() {
        return (EReference)getNameReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameReference_RefersTo() {
        return (EReference)getNameReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelAccess() {
		if (labelAccessEClass == null) {
			labelAccessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(142);
		}
		return labelAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelAccess_LabelName() {
        return (EReference)getLabelAccess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelAccess_LabelDefinition() {
        return (EReference)getLabelAccess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayAccess() {
		if (arrayAccessEClass == null) {
			arrayAccessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(143);
		}
		return arrayAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayAccess_ArrayName() {
        return (EReference)getArrayAccess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayAccess_Subscripts() {
        return (EReference)getArrayAccess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationExpression() {
		if (annotationExpressionEClass == null) {
			annotationExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(144);
		}
		return annotationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationExpression_AnnotationType() {
        return (EReference)getAnnotationExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationExpression_MemberValues() {
        return (EReference)getAnnotationExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionExpression() {
		if (collectionExpressionEClass == null) {
			collectionExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(145);
		}
		return collectionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionExpression_ExpressionList() {
        return (EReference)getCollectionExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifierReference() {
		if (identifierReferenceEClass == null) {
			identifierReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(146);
		}
		return identifierReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedIdentifierReference() {
		if (qualifiedIdentifierReferenceEClass == null) {
			qualifiedIdentifierReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(147);
		}
		return qualifiedIdentifierReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedIdentifierReference_Qualifiers() {
        return (EReference)getQualifiedIdentifierReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedIdentifierReference_Member() {
        return (EReference)getQualifiedIdentifierReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeQualifiedIdentifierReference() {
		if (typeQualifiedIdentifierReferenceEClass == null) {
			typeQualifiedIdentifierReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(148);
		}
		return typeQualifiedIdentifierReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeQualifiedIdentifierReference_AggregateType() {
        return (EReference)getTypeQualifiedIdentifierReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeQualifiedIdentifierReference_Member() {
        return (EReference)getTypeQualifiedIdentifierReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedOverPointer() {
		if (qualifiedOverPointerEClass == null) {
			qualifiedOverPointerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(149);
		}
		return qualifiedOverPointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedOverData() {
		if (qualifiedOverDataEClass == null) {
			qualifiedOverDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(150);
		}
		return qualifiedOverDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerLiteral() {
		if (integerLiteralEClass == null) {
			integerLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(151);
		}
		return integerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharLiteral() {
		if (charLiteralEClass == null) {
			charLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(152);
		}
		return charLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealLiteral() {
		if (realLiteralEClass == null) {
			realLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(153);
		}
		return realLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringLiteral() {
		if (stringLiteralEClass == null) {
			stringLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(154);
		}
		return stringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanLiteral() {
		if (booleanLiteralEClass == null) {
			booleanLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(155);
		}
		return booleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitLiteral() {
		if (bitLiteralEClass == null) {
			bitLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(156);
		}
		return bitLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumLiteral() {
		if (enumLiteralEClass == null) {
			enumLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(157);
		}
		return enumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryPlus() {
		if (unaryPlusEClass == null) {
			unaryPlusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(158);
		}
		return unaryPlusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryMinus() {
		if (unaryMinusEClass == null) {
			unaryMinusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(159);
		}
		return unaryMinusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		if (notEClass == null) {
			notEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(160);
		}
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitNot() {
		if (bitNotEClass == null) {
			bitNotEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(161);
		}
		return bitNotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressOf() {
		if (addressOfEClass == null) {
			addressOfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(162);
		}
		return addressOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeref() {
		if (derefEClass == null) {
			derefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(163);
		}
		return derefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncrement() {
		if (incrementEClass == null) {
			incrementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(164);
		}
		return incrementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecrement() {
		if (decrementEClass == null) {
			decrementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(165);
		}
		return decrementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostIncrement() {
		if (postIncrementEClass == null) {
			postIncrementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(166);
		}
		return postIncrementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostDecrement() {
		if (postDecrementEClass == null) {
			postDecrementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(167);
		}
		return postDecrementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdd() {
		if (addEClass == null) {
			addEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(168);
		}
		return addEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtract() {
		if (subtractEClass == null) {
			subtractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(169);
		}
		return subtractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiply() {
		if (multiplyEClass == null) {
			multiplyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(170);
		}
		return multiplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivide() {
		if (divideEClass == null) {
			divideEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(171);
		}
		return divideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModulus() {
		if (modulusEClass == null) {
			modulusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(172);
		}
		return modulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExponent() {
		if (exponentEClass == null) {
			exponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(173);
		}
		return exponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		if (andEClass == null) {
			andEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(174);
		}
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		if (orEClass == null) {
			orEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(175);
		}
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqual() {
		if (equalEClass == null) {
			equalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(176);
		}
		return equalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotEqual() {
		if (notEqualEClass == null) {
			notEqualEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(177);
		}
		return notEqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreater() {
		if (greaterEClass == null) {
			greaterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(178);
		}
		return greaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotGreater() {
		if (notGreaterEClass == null) {
			notGreaterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(179);
		}
		return notGreaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLess() {
		if (lessEClass == null) {
			lessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(180);
		}
		return lessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotLess() {
		if (notLessEClass == null) {
			notLessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(181);
		}
		return notLessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitAnd() {
		if (bitAndEClass == null) {
			bitAndEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(182);
		}
		return bitAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitOr() {
		if (bitOrEClass == null) {
			bitOrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(183);
		}
		return bitOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitXor() {
		if (bitXorEClass == null) {
			bitXorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(184);
		}
		return bitXorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitLeftShift() {
		if (bitLeftShiftEClass == null) {
			bitLeftShiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(185);
		}
		return bitLeftShiftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitRightShift() {
		if (bitRightShiftEClass == null) {
			bitRightShiftEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(186);
		}
		return bitRightShiftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssign() {
		if (assignEClass == null) {
			assignEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(187);
		}
		return assignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorAssign() {
		if (operatorAssignEClass == null) {
			operatorAssignEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(188);
		}
		return operatorAssignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatorAssign_Operator() {
        return (EReference)getOperatorAssign().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualParameterExpression() {
		if (actualParameterExpressionEClass == null) {
			actualParameterExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(189);
		}
		return actualParameterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActualParameterExpression_Value() {
        return (EReference)getActualParameterExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMissingActualParameter() {
		if (missingActualParameterEClass == null) {
			missingActualParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(190);
		}
		return missingActualParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByValueActualParameterExpression() {
		if (byValueActualParameterExpressionEClass == null) {
			byValueActualParameterExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(191);
		}
		return byValueActualParameterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByReferenceActualParameterExpression() {
		if (byReferenceActualParameterExpressionEClass == null) {
			byReferenceActualParameterExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GASTMPackage.eNS_URI).getEClassifiers().get(192);
		}
		return byReferenceActualParameterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GASTMFactory getGASTMFactory() {
		return (GASTMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename); //$NON-NLS-1$
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.eclipse.modisco.omg.gastm." + eClassifier.getName()); //$NON-NLS-1$
			setGeneratedClassName(eClassifier);
		}
	}

} //GASTMPackageImpl
