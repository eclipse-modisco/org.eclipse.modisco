/**
 * 
 * Copyright (c) 2009, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.code.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.modisco.omg.kdm.action.ActionPackage;
import org.eclipse.modisco.omg.kdm.action.impl.ActionPackageImpl;
import org.eclipse.modisco.omg.kdm.build.BuildPackage;
import org.eclipse.modisco.omg.kdm.build.impl.BuildPackageImpl;
import org.eclipse.modisco.omg.kdm.code.AbstractCodeElement;
import org.eclipse.modisco.omg.kdm.code.AbstractCodeRelationship;
import org.eclipse.modisco.omg.kdm.code.ArrayType;
import org.eclipse.modisco.omg.kdm.code.BagType;
import org.eclipse.modisco.omg.kdm.code.BitType;
import org.eclipse.modisco.omg.kdm.code.BitstringType;
import org.eclipse.modisco.omg.kdm.code.BooleanType;
import org.eclipse.modisco.omg.kdm.code.CallableKind;
import org.eclipse.modisco.omg.kdm.code.CallableUnit;
import org.eclipse.modisco.omg.kdm.code.CharType;
import org.eclipse.modisco.omg.kdm.code.ChoiceType;
import org.eclipse.modisco.omg.kdm.code.ClassUnit;
import org.eclipse.modisco.omg.kdm.code.CodeAssembly;
import org.eclipse.modisco.omg.kdm.code.CodeElement;
import org.eclipse.modisco.omg.kdm.code.CodeFactory;
import org.eclipse.modisco.omg.kdm.code.CodeItem;
import org.eclipse.modisco.omg.kdm.code.CodeModel;
import org.eclipse.modisco.omg.kdm.code.CodePackage;
import org.eclipse.modisco.omg.kdm.code.CodeRelationship;
import org.eclipse.modisco.omg.kdm.code.CommentUnit;
import org.eclipse.modisco.omg.kdm.code.CompilationUnit;
import org.eclipse.modisco.omg.kdm.code.CompositeType;
import org.eclipse.modisco.omg.kdm.code.ComputationalObject;
import org.eclipse.modisco.omg.kdm.code.ConditionalDirective;
import org.eclipse.modisco.omg.kdm.code.ControlElement;
import org.eclipse.modisco.omg.kdm.code.DataElement;
import org.eclipse.modisco.omg.kdm.code.Datatype;
import org.eclipse.modisco.omg.kdm.code.DateType;
import org.eclipse.modisco.omg.kdm.code.DecimalType;
import org.eclipse.modisco.omg.kdm.code.DefinedType;
import org.eclipse.modisco.omg.kdm.code.DerivedType;
import org.eclipse.modisco.omg.kdm.code.EnumeratedType;
import org.eclipse.modisco.omg.kdm.code.Expands;
import org.eclipse.modisco.omg.kdm.code.ExportKind;
import org.eclipse.modisco.omg.kdm.code.Extends;
import org.eclipse.modisco.omg.kdm.code.FloatType;
import org.eclipse.modisco.omg.kdm.code.GeneratedFrom;
import org.eclipse.modisco.omg.kdm.code.HasType;
import org.eclipse.modisco.omg.kdm.code.HasValue;
import org.eclipse.modisco.omg.kdm.code.ImplementationOf;
import org.eclipse.modisco.omg.kdm.code.Implements;
import org.eclipse.modisco.omg.kdm.code.Imports;
import org.eclipse.modisco.omg.kdm.code.IncludeDirective;
import org.eclipse.modisco.omg.kdm.code.Includes;
import org.eclipse.modisco.omg.kdm.code.IndexUnit;
import org.eclipse.modisco.omg.kdm.code.InstanceOf;
import org.eclipse.modisco.omg.kdm.code.IntegerType;
import org.eclipse.modisco.omg.kdm.code.InterfaceUnit;
import org.eclipse.modisco.omg.kdm.code.ItemUnit;
import org.eclipse.modisco.omg.kdm.code.LanguageUnit;
import org.eclipse.modisco.omg.kdm.code.MacroDirective;
import org.eclipse.modisco.omg.kdm.code.MacroKind;
import org.eclipse.modisco.omg.kdm.code.MacroUnit;
import org.eclipse.modisco.omg.kdm.code.MemberUnit;
import org.eclipse.modisco.omg.kdm.code.MethodKind;
import org.eclipse.modisco.omg.kdm.code.MethodUnit;
import org.eclipse.modisco.omg.kdm.code.Module;
import org.eclipse.modisco.omg.kdm.code.Namespace;
import org.eclipse.modisco.omg.kdm.code.OctetType;
import org.eclipse.modisco.omg.kdm.code.OctetstringType;
import org.eclipse.modisco.omg.kdm.code.OrdinalType;
import org.eclipse.modisco.omg.kdm.code.ParameterKind;
import org.eclipse.modisco.omg.kdm.code.ParameterTo;
import org.eclipse.modisco.omg.kdm.code.ParameterUnit;
import org.eclipse.modisco.omg.kdm.code.PointerType;
import org.eclipse.modisco.omg.kdm.code.PreprocessorDirective;
import org.eclipse.modisco.omg.kdm.code.PrimitiveType;
import org.eclipse.modisco.omg.kdm.code.RangeType;
import org.eclipse.modisco.omg.kdm.code.RecordType;
import org.eclipse.modisco.omg.kdm.code.Redefines;
import org.eclipse.modisco.omg.kdm.code.ScaledType;
import org.eclipse.modisco.omg.kdm.code.SequenceType;
import org.eclipse.modisco.omg.kdm.code.SetType;
import org.eclipse.modisco.omg.kdm.code.SharedUnit;
import org.eclipse.modisco.omg.kdm.code.Signature;
import org.eclipse.modisco.omg.kdm.code.StorableKind;
import org.eclipse.modisco.omg.kdm.code.StorableUnit;
import org.eclipse.modisco.omg.kdm.code.StringType;
import org.eclipse.modisco.omg.kdm.code.SynonymUnit;
import org.eclipse.modisco.omg.kdm.code.TemplateParameter;
import org.eclipse.modisco.omg.kdm.code.TemplateType;
import org.eclipse.modisco.omg.kdm.code.TemplateUnit;
import org.eclipse.modisco.omg.kdm.code.TimeType;
import org.eclipse.modisco.omg.kdm.code.TypeUnit;
import org.eclipse.modisco.omg.kdm.code.Value;
import org.eclipse.modisco.omg.kdm.code.ValueElement;
import org.eclipse.modisco.omg.kdm.code.ValueList;
import org.eclipse.modisco.omg.kdm.code.VariantTo;
import org.eclipse.modisco.omg.kdm.code.VisibleIn;
import org.eclipse.modisco.omg.kdm.code.VoidType;
import org.eclipse.modisco.omg.kdm.conceptual.ConceptualPackage;
import org.eclipse.modisco.omg.kdm.conceptual.impl.ConceptualPackageImpl;
import org.eclipse.modisco.omg.kdm.core.CorePackage;
import org.eclipse.modisco.omg.kdm.core.impl.CorePackageImpl;
import org.eclipse.modisco.omg.kdm.data.DataPackage;
import org.eclipse.modisco.omg.kdm.data.impl.DataPackageImpl;
import org.eclipse.modisco.omg.kdm.event.EventPackage;
import org.eclipse.modisco.omg.kdm.event.impl.EventPackageImpl;
import org.eclipse.modisco.omg.kdm.kdm.KdmPackage;
import org.eclipse.modisco.omg.kdm.kdm.impl.KdmPackageImpl;
import org.eclipse.modisco.omg.kdm.platform.PlatformPackage;
import org.eclipse.modisco.omg.kdm.platform.impl.PlatformPackageImpl;
import org.eclipse.modisco.omg.kdm.source.SourcePackage;
import org.eclipse.modisco.omg.kdm.source.impl.SourcePackageImpl;
import org.eclipse.modisco.omg.kdm.structure.StructurePackage;
import org.eclipse.modisco.omg.kdm.structure.impl.StructurePackageImpl;
import org.eclipse.modisco.omg.kdm.ui.UiPackage;
import org.eclipse.modisco.omg.kdm.ui.impl.UiPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodePackageImpl extends EPackageImpl implements CodePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCodeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCodeRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computationalObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

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
	private EClass sharedUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeAssemblyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callableUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storableUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueListEClass = null;

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
	private EClass booleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordinalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaledTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitstringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass octetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass octetstringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedTypeEClass = null;

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
	private EClass pointerTypeEClass = null;

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
	private EClass bagTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synonymUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preprocessorDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macroUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macroDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expandsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatedFromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibleInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum callableKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum methodKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exportKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum storableKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum macroKindEEnum = null;

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
	 * @see org.eclipse.modisco.omg.kdm.code.CodePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodePackageImpl() {
		super(eNS_URI, CodeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CodePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodePackage init() {
		if (isInited) return (CodePackage)EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);

		// Obtain or create and register package
		CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CodePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		KdmPackageImpl theKdmPackage = (KdmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KdmPackage.eNS_URI) instanceof KdmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KdmPackage.eNS_URI) : KdmPackage.eINSTANCE);
		SourcePackageImpl theSourcePackage = (SourcePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI) instanceof SourcePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI) : SourcePackage.eINSTANCE);
		ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) : PlatformPackage.eINSTANCE);
		BuildPackageImpl theBuildPackage = (BuildPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BuildPackage.eNS_URI) instanceof BuildPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BuildPackage.eNS_URI) : BuildPackage.eINSTANCE);
		ConceptualPackageImpl theConceptualPackage = (ConceptualPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI) instanceof ConceptualPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConceptualPackage.eNS_URI) : ConceptualPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		EventPackageImpl theEventPackage = (EventPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) instanceof EventPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI) : EventPackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		theCodePackage.createPackageContents();
		theCorePackage.createPackageContents();
		theKdmPackage.createPackageContents();
		theSourcePackage.createPackageContents();
		theActionPackage.createPackageContents();
		thePlatformPackage.createPackageContents();
		theBuildPackage.createPackageContents();
		theConceptualPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theEventPackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theCodePackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theKdmPackage.initializePackageContents();
		theSourcePackage.initializePackageContents();
		theActionPackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();
		theBuildPackage.initializePackageContents();
		theConceptualPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theEventPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodePackage.eNS_URI, theCodePackage);
		return theCodePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeModel() {
		return codeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeModel_CodeElement() {
		return (EReference)codeModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCodeElement() {
		return abstractCodeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCodeElement_Source() {
		return (EReference)abstractCodeElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCodeElement_Comment() {
		return (EReference)abstractCodeElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCodeElement_CodeRelation() {
		return (EReference)abstractCodeElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCodeElement_EntryFlow() {
		return (EReference)abstractCodeElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCodeRelationship() {
		return abstractCodeRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeItem() {
		return codeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputationalObject() {
		return computationalObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatype() {
		return datatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_CodeElement() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationUnit() {
		return compilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedUnit() {
		return sharedUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageUnit() {
		return languageUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeAssembly() {
		return codeAssemblyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlElement() {
		return controlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlElement_Type() {
		return (EReference)controlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlElement_CodeElement() {
		return (EReference)controlElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallableUnit() {
		return callableUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallableUnit_Kind() {
		return (EAttribute)callableUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodUnit() {
		return methodUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodUnit_Kind() {
		return (EAttribute)methodUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodUnit_Export() {
		return (EAttribute)methodUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataElement() {
		return dataElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Type() {
		return (EReference)dataElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_Ext() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElement_Size() {
		return (EAttribute)dataElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_CodeElement() {
		return (EReference)dataElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorableUnit() {
		return storableUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorableUnit_Kind() {
		return (EAttribute)storableUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemUnit() {
		return itemUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexUnit() {
		return indexUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberUnit() {
		return memberUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemberUnit_Export() {
		return (EAttribute)memberUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterUnit() {
		return parameterUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterUnit_Kind() {
		return (EAttribute)parameterUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterUnit_Pos() {
		return (EAttribute)parameterUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueElement() {
		return valueElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueList() {
		return valueListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueList_ValueElement() {
		return (EReference)valueListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanType() {
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharType() {
		return charTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrdinalType() {
		return ordinalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateType() {
		return dateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeType() {
		return timeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerType() {
		return integerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalType() {
		return decimalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScaledType() {
		return scaledTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatType() {
		return floatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoidType() {
		return voidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringType() {
		return stringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitType() {
		return bitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitstringType() {
		return bitstringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOctetType() {
		return octetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOctetstringType() {
		return octetstringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeratedType() {
		return enumeratedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedType_Value() {
		return (EReference)enumeratedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedType_CodeElement() {
		return (EReference)enumeratedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeType() {
		return compositeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeType_ItemUnit() {
		return (EReference)compositeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoiceType() {
		return choiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordType() {
		return recordTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedType() {
		return derivedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedType_ItemUnit() {
		return (EReference)derivedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayType() {
		return arrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayType_Size() {
		return (EAttribute)arrayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayType_IndexUnit() {
		return (EReference)arrayTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointerType() {
		return pointerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeType() {
		return rangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeType_Lower() {
		return (EAttribute)rangeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeType_Upper() {
		return (EAttribute)rangeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBagType() {
		return bagTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBagType_Size() {
		return (EAttribute)bagTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetType() {
		return setTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetType_Size() {
		return (EAttribute)setTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceType() {
		return sequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceType_Size() {
		return (EAttribute)sequenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignature() {
		return signatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_ParameterUnit() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinedType() {
		return definedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinedType_Type() {
		return (EReference)definedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinedType_CodeElement() {
		return (EReference)definedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeUnit() {
		return typeUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynonymUnit() {
		return synonymUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassUnit() {
		return classUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassUnit_IsAbstract() {
		return (EAttribute)classUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassUnit_CodeElement() {
		return (EReference)classUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceUnit() {
		return interfaceUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceUnit_CodeElement() {
		return (EReference)interfaceUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateUnit() {
		return templateUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateUnit_CodeElement() {
		return (EReference)templateUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateParameter() {
		return templateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateType() {
		return templateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceOf() {
		return instanceOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceOf_To() {
		return (EReference)instanceOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceOf_From() {
		return (EReference)instanceOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterTo() {
		return parameterToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterTo_To() {
		return (EReference)parameterToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterTo_From() {
		return (EReference)parameterToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplements() {
		return implementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplements_To() {
		return (EReference)implementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplements_From() {
		return (EReference)implementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationOf() {
		return implementationOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationOf_To() {
		return (EReference)implementationOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationOf_From() {
		return (EReference)implementationOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasType() {
		return hasTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasType_To() {
		return (EReference)hasTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasType_From() {
		return (EReference)hasTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasValue() {
		return hasValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasValue_To() {
		return (EReference)hasValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasValue_From() {
		return (EReference)hasValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtends() {
		return extendsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtends_To() {
		return (EReference)extendsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtends_From() {
		return (EReference)extendsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreprocessorDirective() {
		return preprocessorDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreprocessorDirective_CodeElement() {
		return (EReference)preprocessorDirectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacroUnit() {
		return macroUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacroUnit_Kind() {
		return (EAttribute)macroUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacroDirective() {
		return macroDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludeDirective() {
		return includeDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalDirective() {
		return conditionalDirectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpands() {
		return expandsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpands_To() {
		return (EReference)expandsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpands_From() {
		return (EReference)expandsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratedFrom() {
		return generatedFromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratedFrom_To() {
		return (EReference)generatedFromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratedFrom_From() {
		return (EReference)generatedFromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludes() {
		return includesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludes_To() {
		return (EReference)includesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludes_From() {
		return (EReference)includesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariantTo() {
		return variantToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariantTo_To() {
		return (EReference)variantToEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariantTo_From() {
		return (EReference)variantToEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefines() {
		return redefinesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefines_To() {
		return (EReference)redefinesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefines_From() {
		return (EReference)redefinesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentUnit() {
		return commentUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentUnit_Text() {
		return (EAttribute)commentUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_GroupedCode() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibleIn() {
		return visibleInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibleIn_To() {
		return (EReference)visibleInEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisibleIn_From() {
		return (EReference)visibleInEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImports() {
		return importsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImports_To() {
		return (EReference)importsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImports_From() {
		return (EReference)importsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeElement() {
		return codeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeRelationship() {
		return codeRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeRelationship_To() {
		return (EReference)codeRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeRelationship_From() {
		return (EReference)codeRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCallableKind() {
		return callableKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMethodKind() {
		return methodKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExportKind() {
		return exportKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStorableKind() {
		return storableKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterKind() {
		return parameterKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMacroKind() {
		return macroKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeFactory getCodeFactory() {
		return (CodeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		codeModelEClass = createEClass(CODE_MODEL);
		createEReference(codeModelEClass, CODE_MODEL__CODE_ELEMENT);

		abstractCodeElementEClass = createEClass(ABSTRACT_CODE_ELEMENT);
		createEReference(abstractCodeElementEClass, ABSTRACT_CODE_ELEMENT__SOURCE);
		createEReference(abstractCodeElementEClass, ABSTRACT_CODE_ELEMENT__COMMENT);
		createEReference(abstractCodeElementEClass, ABSTRACT_CODE_ELEMENT__CODE_RELATION);
		createEReference(abstractCodeElementEClass, ABSTRACT_CODE_ELEMENT__ENTRY_FLOW);

		abstractCodeRelationshipEClass = createEClass(ABSTRACT_CODE_RELATIONSHIP);

		codeItemEClass = createEClass(CODE_ITEM);

		computationalObjectEClass = createEClass(COMPUTATIONAL_OBJECT);

		datatypeEClass = createEClass(DATATYPE);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__CODE_ELEMENT);

		compilationUnitEClass = createEClass(COMPILATION_UNIT);

		sharedUnitEClass = createEClass(SHARED_UNIT);

		languageUnitEClass = createEClass(LANGUAGE_UNIT);

		codeAssemblyEClass = createEClass(CODE_ASSEMBLY);

		packageEClass = createEClass(PACKAGE);

		controlElementEClass = createEClass(CONTROL_ELEMENT);
		createEReference(controlElementEClass, CONTROL_ELEMENT__TYPE);
		createEReference(controlElementEClass, CONTROL_ELEMENT__CODE_ELEMENT);

		callableUnitEClass = createEClass(CALLABLE_UNIT);
		createEAttribute(callableUnitEClass, CALLABLE_UNIT__KIND);

		methodUnitEClass = createEClass(METHOD_UNIT);
		createEAttribute(methodUnitEClass, METHOD_UNIT__KIND);
		createEAttribute(methodUnitEClass, METHOD_UNIT__EXPORT);

		dataElementEClass = createEClass(DATA_ELEMENT);
		createEReference(dataElementEClass, DATA_ELEMENT__TYPE);
		createEAttribute(dataElementEClass, DATA_ELEMENT__EXT);
		createEAttribute(dataElementEClass, DATA_ELEMENT__SIZE);
		createEReference(dataElementEClass, DATA_ELEMENT__CODE_ELEMENT);

		storableUnitEClass = createEClass(STORABLE_UNIT);
		createEAttribute(storableUnitEClass, STORABLE_UNIT__KIND);

		itemUnitEClass = createEClass(ITEM_UNIT);

		indexUnitEClass = createEClass(INDEX_UNIT);

		memberUnitEClass = createEClass(MEMBER_UNIT);
		createEAttribute(memberUnitEClass, MEMBER_UNIT__EXPORT);

		parameterUnitEClass = createEClass(PARAMETER_UNIT);
		createEAttribute(parameterUnitEClass, PARAMETER_UNIT__KIND);
		createEAttribute(parameterUnitEClass, PARAMETER_UNIT__POS);

		valueElementEClass = createEClass(VALUE_ELEMENT);

		valueEClass = createEClass(VALUE);

		valueListEClass = createEClass(VALUE_LIST);
		createEReference(valueListEClass, VALUE_LIST__VALUE_ELEMENT);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		booleanTypeEClass = createEClass(BOOLEAN_TYPE);

		charTypeEClass = createEClass(CHAR_TYPE);

		ordinalTypeEClass = createEClass(ORDINAL_TYPE);

		dateTypeEClass = createEClass(DATE_TYPE);

		timeTypeEClass = createEClass(TIME_TYPE);

		integerTypeEClass = createEClass(INTEGER_TYPE);

		decimalTypeEClass = createEClass(DECIMAL_TYPE);

		scaledTypeEClass = createEClass(SCALED_TYPE);

		floatTypeEClass = createEClass(FLOAT_TYPE);

		voidTypeEClass = createEClass(VOID_TYPE);

		stringTypeEClass = createEClass(STRING_TYPE);

		bitTypeEClass = createEClass(BIT_TYPE);

		bitstringTypeEClass = createEClass(BITSTRING_TYPE);

		octetTypeEClass = createEClass(OCTET_TYPE);

		octetstringTypeEClass = createEClass(OCTETSTRING_TYPE);

		enumeratedTypeEClass = createEClass(ENUMERATED_TYPE);
		createEReference(enumeratedTypeEClass, ENUMERATED_TYPE__VALUE);
		createEReference(enumeratedTypeEClass, ENUMERATED_TYPE__CODE_ELEMENT);

		compositeTypeEClass = createEClass(COMPOSITE_TYPE);
		createEReference(compositeTypeEClass, COMPOSITE_TYPE__ITEM_UNIT);

		choiceTypeEClass = createEClass(CHOICE_TYPE);

		recordTypeEClass = createEClass(RECORD_TYPE);

		derivedTypeEClass = createEClass(DERIVED_TYPE);
		createEReference(derivedTypeEClass, DERIVED_TYPE__ITEM_UNIT);

		arrayTypeEClass = createEClass(ARRAY_TYPE);
		createEAttribute(arrayTypeEClass, ARRAY_TYPE__SIZE);
		createEReference(arrayTypeEClass, ARRAY_TYPE__INDEX_UNIT);

		pointerTypeEClass = createEClass(POINTER_TYPE);

		rangeTypeEClass = createEClass(RANGE_TYPE);
		createEAttribute(rangeTypeEClass, RANGE_TYPE__LOWER);
		createEAttribute(rangeTypeEClass, RANGE_TYPE__UPPER);

		bagTypeEClass = createEClass(BAG_TYPE);
		createEAttribute(bagTypeEClass, BAG_TYPE__SIZE);

		setTypeEClass = createEClass(SET_TYPE);
		createEAttribute(setTypeEClass, SET_TYPE__SIZE);

		sequenceTypeEClass = createEClass(SEQUENCE_TYPE);
		createEAttribute(sequenceTypeEClass, SEQUENCE_TYPE__SIZE);

		signatureEClass = createEClass(SIGNATURE);
		createEReference(signatureEClass, SIGNATURE__PARAMETER_UNIT);

		definedTypeEClass = createEClass(DEFINED_TYPE);
		createEReference(definedTypeEClass, DEFINED_TYPE__TYPE);
		createEReference(definedTypeEClass, DEFINED_TYPE__CODE_ELEMENT);

		typeUnitEClass = createEClass(TYPE_UNIT);

		synonymUnitEClass = createEClass(SYNONYM_UNIT);

		classUnitEClass = createEClass(CLASS_UNIT);
		createEAttribute(classUnitEClass, CLASS_UNIT__IS_ABSTRACT);
		createEReference(classUnitEClass, CLASS_UNIT__CODE_ELEMENT);

		interfaceUnitEClass = createEClass(INTERFACE_UNIT);
		createEReference(interfaceUnitEClass, INTERFACE_UNIT__CODE_ELEMENT);

		templateUnitEClass = createEClass(TEMPLATE_UNIT);
		createEReference(templateUnitEClass, TEMPLATE_UNIT__CODE_ELEMENT);

		templateParameterEClass = createEClass(TEMPLATE_PARAMETER);

		templateTypeEClass = createEClass(TEMPLATE_TYPE);

		instanceOfEClass = createEClass(INSTANCE_OF);
		createEReference(instanceOfEClass, INSTANCE_OF__TO);
		createEReference(instanceOfEClass, INSTANCE_OF__FROM);

		parameterToEClass = createEClass(PARAMETER_TO);
		createEReference(parameterToEClass, PARAMETER_TO__TO);
		createEReference(parameterToEClass, PARAMETER_TO__FROM);

		implementsEClass = createEClass(IMPLEMENTS);
		createEReference(implementsEClass, IMPLEMENTS__TO);
		createEReference(implementsEClass, IMPLEMENTS__FROM);

		implementationOfEClass = createEClass(IMPLEMENTATION_OF);
		createEReference(implementationOfEClass, IMPLEMENTATION_OF__TO);
		createEReference(implementationOfEClass, IMPLEMENTATION_OF__FROM);

		hasTypeEClass = createEClass(HAS_TYPE);
		createEReference(hasTypeEClass, HAS_TYPE__TO);
		createEReference(hasTypeEClass, HAS_TYPE__FROM);

		hasValueEClass = createEClass(HAS_VALUE);
		createEReference(hasValueEClass, HAS_VALUE__TO);
		createEReference(hasValueEClass, HAS_VALUE__FROM);

		extendsEClass = createEClass(EXTENDS);
		createEReference(extendsEClass, EXTENDS__TO);
		createEReference(extendsEClass, EXTENDS__FROM);

		preprocessorDirectiveEClass = createEClass(PREPROCESSOR_DIRECTIVE);
		createEReference(preprocessorDirectiveEClass, PREPROCESSOR_DIRECTIVE__CODE_ELEMENT);

		macroUnitEClass = createEClass(MACRO_UNIT);
		createEAttribute(macroUnitEClass, MACRO_UNIT__KIND);

		macroDirectiveEClass = createEClass(MACRO_DIRECTIVE);

		includeDirectiveEClass = createEClass(INCLUDE_DIRECTIVE);

		conditionalDirectiveEClass = createEClass(CONDITIONAL_DIRECTIVE);

		expandsEClass = createEClass(EXPANDS);
		createEReference(expandsEClass, EXPANDS__TO);
		createEReference(expandsEClass, EXPANDS__FROM);

		generatedFromEClass = createEClass(GENERATED_FROM);
		createEReference(generatedFromEClass, GENERATED_FROM__TO);
		createEReference(generatedFromEClass, GENERATED_FROM__FROM);

		includesEClass = createEClass(INCLUDES);
		createEReference(includesEClass, INCLUDES__TO);
		createEReference(includesEClass, INCLUDES__FROM);

		variantToEClass = createEClass(VARIANT_TO);
		createEReference(variantToEClass, VARIANT_TO__TO);
		createEReference(variantToEClass, VARIANT_TO__FROM);

		redefinesEClass = createEClass(REDEFINES);
		createEReference(redefinesEClass, REDEFINES__TO);
		createEReference(redefinesEClass, REDEFINES__FROM);

		commentUnitEClass = createEClass(COMMENT_UNIT);
		createEAttribute(commentUnitEClass, COMMENT_UNIT__TEXT);

		namespaceEClass = createEClass(NAMESPACE);
		createEReference(namespaceEClass, NAMESPACE__GROUPED_CODE);

		visibleInEClass = createEClass(VISIBLE_IN);
		createEReference(visibleInEClass, VISIBLE_IN__TO);
		createEReference(visibleInEClass, VISIBLE_IN__FROM);

		importsEClass = createEClass(IMPORTS);
		createEReference(importsEClass, IMPORTS__TO);
		createEReference(importsEClass, IMPORTS__FROM);

		codeElementEClass = createEClass(CODE_ELEMENT);

		codeRelationshipEClass = createEClass(CODE_RELATIONSHIP);
		createEReference(codeRelationshipEClass, CODE_RELATIONSHIP__TO);
		createEReference(codeRelationshipEClass, CODE_RELATIONSHIP__FROM);

		// Create enums
		callableKindEEnum = createEEnum(CALLABLE_KIND);
		methodKindEEnum = createEEnum(METHOD_KIND);
		exportKindEEnum = createEEnum(EXPORT_KIND);
		storableKindEEnum = createEEnum(STORABLE_KIND);
		parameterKindEEnum = createEEnum(PARAMETER_KIND);
		macroKindEEnum = createEEnum(MACRO_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		KdmPackage theKdmPackage = (KdmPackage)EPackage.Registry.INSTANCE.getEPackage(KdmPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		SourcePackage theSourcePackage = (SourcePackage)EPackage.Registry.INSTANCE.getEPackage(SourcePackage.eNS_URI);
		ActionPackage theActionPackage = (ActionPackage)EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		codeModelEClass.getESuperTypes().add(theKdmPackage.getKDMModel());
		abstractCodeElementEClass.getESuperTypes().add(theCorePackage.getKDMEntity());
		abstractCodeRelationshipEClass.getESuperTypes().add(theCorePackage.getKDMRelationship());
		codeItemEClass.getESuperTypes().add(this.getAbstractCodeElement());
		computationalObjectEClass.getESuperTypes().add(this.getCodeItem());
		datatypeEClass.getESuperTypes().add(this.getCodeItem());
		moduleEClass.getESuperTypes().add(this.getCodeItem());
		compilationUnitEClass.getESuperTypes().add(this.getModule());
		sharedUnitEClass.getESuperTypes().add(this.getCompilationUnit());
		languageUnitEClass.getESuperTypes().add(this.getModule());
		codeAssemblyEClass.getESuperTypes().add(this.getModule());
		packageEClass.getESuperTypes().add(this.getModule());
		controlElementEClass.getESuperTypes().add(this.getComputationalObject());
		callableUnitEClass.getESuperTypes().add(this.getControlElement());
		methodUnitEClass.getESuperTypes().add(this.getControlElement());
		dataElementEClass.getESuperTypes().add(this.getComputationalObject());
		storableUnitEClass.getESuperTypes().add(this.getDataElement());
		itemUnitEClass.getESuperTypes().add(this.getDataElement());
		indexUnitEClass.getESuperTypes().add(this.getDataElement());
		memberUnitEClass.getESuperTypes().add(this.getDataElement());
		parameterUnitEClass.getESuperTypes().add(this.getDataElement());
		valueElementEClass.getESuperTypes().add(this.getDataElement());
		valueEClass.getESuperTypes().add(this.getValueElement());
		valueListEClass.getESuperTypes().add(this.getValueElement());
		primitiveTypeEClass.getESuperTypes().add(this.getDatatype());
		booleanTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		charTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		ordinalTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		dateTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		timeTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		integerTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		decimalTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		scaledTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		floatTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		voidTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		stringTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		bitTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		bitstringTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		octetTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		octetstringTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		enumeratedTypeEClass.getESuperTypes().add(this.getDatatype());
		compositeTypeEClass.getESuperTypes().add(this.getDatatype());
		choiceTypeEClass.getESuperTypes().add(this.getCompositeType());
		recordTypeEClass.getESuperTypes().add(this.getCompositeType());
		derivedTypeEClass.getESuperTypes().add(this.getDatatype());
		arrayTypeEClass.getESuperTypes().add(this.getDerivedType());
		pointerTypeEClass.getESuperTypes().add(this.getDerivedType());
		rangeTypeEClass.getESuperTypes().add(this.getDerivedType());
		bagTypeEClass.getESuperTypes().add(this.getDerivedType());
		setTypeEClass.getESuperTypes().add(this.getDerivedType());
		sequenceTypeEClass.getESuperTypes().add(this.getDerivedType());
		signatureEClass.getESuperTypes().add(this.getDatatype());
		definedTypeEClass.getESuperTypes().add(this.getDatatype());
		typeUnitEClass.getESuperTypes().add(this.getDefinedType());
		synonymUnitEClass.getESuperTypes().add(this.getDefinedType());
		classUnitEClass.getESuperTypes().add(this.getDatatype());
		interfaceUnitEClass.getESuperTypes().add(this.getDatatype());
		templateUnitEClass.getESuperTypes().add(this.getDatatype());
		templateParameterEClass.getESuperTypes().add(this.getDatatype());
		templateTypeEClass.getESuperTypes().add(this.getDatatype());
		instanceOfEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		parameterToEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		implementsEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		implementationOfEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		hasTypeEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		hasValueEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		extendsEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		preprocessorDirectiveEClass.getESuperTypes().add(this.getAbstractCodeElement());
		macroUnitEClass.getESuperTypes().add(this.getPreprocessorDirective());
		macroDirectiveEClass.getESuperTypes().add(this.getPreprocessorDirective());
		includeDirectiveEClass.getESuperTypes().add(this.getPreprocessorDirective());
		conditionalDirectiveEClass.getESuperTypes().add(this.getPreprocessorDirective());
		expandsEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		generatedFromEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		includesEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		variantToEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		redefinesEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		commentUnitEClass.getESuperTypes().add(theCorePackage.getModelElement());
		namespaceEClass.getESuperTypes().add(this.getCodeItem());
		visibleInEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		importsEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		codeElementEClass.getESuperTypes().add(this.getCodeItem());
		codeRelationshipEClass.getESuperTypes().add(this.getAbstractCodeRelationship());

		// Initialize classes and features; add operations and parameters
		initEClass(codeModelEClass, CodeModel.class, "CodeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCodeModel_CodeElement(), this.getAbstractCodeElement(), null, "codeElement", null, 0, -1, CodeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(abstractCodeElementEClass, AbstractCodeElement.class, "AbstractCodeElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAbstractCodeElement_Source(), theSourcePackage.getSourceRef(), null, "source", null, 0, -1, AbstractCodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAbstractCodeElement_Comment(), this.getCommentUnit(), null, "comment", null, 0, -1, AbstractCodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAbstractCodeElement_CodeRelation(), this.getAbstractCodeRelationship(), null, "codeRelation", null, 0, -1, AbstractCodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAbstractCodeElement_EntryFlow(), theActionPackage.getEntryFlow(), null, "entryFlow", null, 0, -1, AbstractCodeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(abstractCodeRelationshipEClass, AbstractCodeRelationship.class, "AbstractCodeRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(codeItemEClass, CodeItem.class, "CodeItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(computationalObjectEClass, ComputationalObject.class, "ComputationalObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(datatypeEClass, Datatype.class, "Datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getModule_CodeElement(), this.getAbstractCodeElement(), null, "codeElement", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(compilationUnitEClass, CompilationUnit.class, "CompilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(sharedUnitEClass, SharedUnit.class, "SharedUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(languageUnitEClass, LanguageUnit.class, "LanguageUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(codeAssemblyEClass, CodeAssembly.class, "CodeAssembly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(packageEClass, org.eclipse.modisco.omg.kdm.code.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(controlElementEClass, ControlElement.class, "ControlElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getControlElement_Type(), this.getDatatype(), null, "type", null, 0, 1, ControlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getControlElement_CodeElement(), this.getAbstractCodeElement(), null, "codeElement", null, 0, -1, ControlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(callableUnitEClass, CallableUnit.class, "CallableUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCallableUnit_Kind(), this.getCallableKind(), "kind", null, 0, 1, CallableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(methodUnitEClass, MethodUnit.class, "MethodUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMethodUnit_Kind(), this.getMethodKind(), "kind", null, 0, 1, MethodUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getMethodUnit_Export(), this.getExportKind(), "export", null, 0, 1, MethodUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(dataElementEClass, DataElement.class, "DataElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDataElement_Type(), this.getDatatype(), null, "type", null, 1, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_Ext(), theCorePackage.getString(), "ext", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataElement_Size(), theCorePackage.getInteger(), "size", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDataElement_CodeElement(), this.getDatatype(), null, "codeElement", null, 0, -1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(storableUnitEClass, StorableUnit.class, "StorableUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStorableUnit_Kind(), this.getStorableKind(), "kind", null, 0, 1, StorableUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(itemUnitEClass, ItemUnit.class, "ItemUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(indexUnitEClass, IndexUnit.class, "IndexUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(memberUnitEClass, MemberUnit.class, "MemberUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMemberUnit_Export(), this.getExportKind(), "export", null, 0, 1, MemberUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(parameterUnitEClass, ParameterUnit.class, "ParameterUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getParameterUnit_Kind(), this.getParameterKind(), "kind", null, 0, 1, ParameterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getParameterUnit_Pos(), theCorePackage.getInteger(), "pos", null, 0, 1, ParameterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(valueElementEClass, ValueElement.class, "ValueElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(valueListEClass, ValueList.class, "ValueList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getValueList_ValueElement(), this.getValueElement(), null, "valueElement", null, 0, -1, ValueList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(charTypeEClass, CharType.class, "CharType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(ordinalTypeEClass, OrdinalType.class, "OrdinalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(dateTypeEClass, DateType.class, "DateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(timeTypeEClass, TimeType.class, "TimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(integerTypeEClass, IntegerType.class, "IntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(decimalTypeEClass, DecimalType.class, "DecimalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(scaledTypeEClass, ScaledType.class, "ScaledType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(floatTypeEClass, FloatType.class, "FloatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(voidTypeEClass, VoidType.class, "VoidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(bitTypeEClass, BitType.class, "BitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(bitstringTypeEClass, BitstringType.class, "BitstringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(octetTypeEClass, OctetType.class, "OctetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(octetstringTypeEClass, OctetstringType.class, "OctetstringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(enumeratedTypeEClass, EnumeratedType.class, "EnumeratedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEnumeratedType_Value(), this.getValue(), null, "value", null, 0, -1, EnumeratedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEnumeratedType_CodeElement(), this.getCodeItem(), null, "codeElement", null, 0, -1, EnumeratedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(compositeTypeEClass, CompositeType.class, "CompositeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCompositeType_ItemUnit(), this.getItemUnit(), null, "itemUnit", null, 0, -1, CompositeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(choiceTypeEClass, ChoiceType.class, "ChoiceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(recordTypeEClass, RecordType.class, "RecordType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(derivedTypeEClass, DerivedType.class, "DerivedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDerivedType_ItemUnit(), this.getItemUnit(), null, "itemUnit", null, 1, 1, DerivedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(arrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getArrayType_Size(), theCorePackage.getInteger(), "size", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArrayType_IndexUnit(), this.getIndexUnit(), null, "indexUnit", null, 1, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(pointerTypeEClass, PointerType.class, "PointerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(rangeTypeEClass, RangeType.class, "RangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getRangeType_Lower(), theCorePackage.getInteger(), "lower", null, 0, 1, RangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getRangeType_Upper(), theCorePackage.getInteger(), "upper", null, 0, 1, RangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(bagTypeEClass, BagType.class, "BagType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getBagType_Size(), theCorePackage.getInteger(), "size", null, 0, 1, BagType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(setTypeEClass, SetType.class, "SetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSetType_Size(), theCorePackage.getInteger(), "size", null, 0, 1, SetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(sequenceTypeEClass, SequenceType.class, "SequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSequenceType_Size(), theCorePackage.getInteger(), "size", null, 0, 1, SequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(signatureEClass, Signature.class, "Signature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSignature_ParameterUnit(), this.getParameterUnit(), null, "parameterUnit", null, 0, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(definedTypeEClass, DefinedType.class, "DefinedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDefinedType_Type(), this.getDatatype(), null, "type", null, 1, 1, DefinedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getDefinedType_CodeElement(), this.getDatatype(), null, "codeElement", null, 0, 1, DefinedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(typeUnitEClass, TypeUnit.class, "TypeUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(synonymUnitEClass, SynonymUnit.class, "SynonymUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(classUnitEClass, ClassUnit.class, "ClassUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getClassUnit_IsAbstract(), theCorePackage.getBoolean(), "isAbstract", null, 0, 1, ClassUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClassUnit_CodeElement(), this.getCodeItem(), null, "codeElement", null, 0, -1, ClassUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(interfaceUnitEClass, InterfaceUnit.class, "InterfaceUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInterfaceUnit_CodeElement(), this.getCodeItem(), null, "codeElement", null, 0, -1, InterfaceUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(templateUnitEClass, TemplateUnit.class, "TemplateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTemplateUnit_CodeElement(), this.getCodeItem(), null, "codeElement", null, 0, -1, TemplateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(templateParameterEClass, TemplateParameter.class, "TemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(templateTypeEClass, TemplateType.class, "TemplateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(instanceOfEClass, InstanceOf.class, "InstanceOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInstanceOf_To(), this.getTemplateUnit(), null, "to", null, 1, 1, InstanceOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getInstanceOf_From(), this.getAbstractCodeElement(), null, "from", null, 1, 1, InstanceOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(parameterToEClass, ParameterTo.class, "ParameterTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getParameterTo_To(), this.getCodeItem(), null, "to", null, 1, 1, ParameterTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getParameterTo_From(), this.getAbstractCodeElement(), null, "from", null, 1, 1, ParameterTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(implementsEClass, Implements.class, "Implements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getImplements_To(), this.getCodeItem(), null, "to", null, 1, 1, Implements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getImplements_From(), this.getCodeItem(), null, "from", null, 1, 1, Implements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(implementationOfEClass, ImplementationOf.class, "ImplementationOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getImplementationOf_To(), this.getCodeItem(), null, "to", null, 1, 1, ImplementationOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getImplementationOf_From(), this.getCodeItem(), null, "from", null, 1, 1, ImplementationOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(hasTypeEClass, HasType.class, "HasType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getHasType_To(), this.getDatatype(), null, "to", null, 1, 1, HasType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getHasType_From(), this.getCodeItem(), null, "from", null, 1, 1, HasType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(hasValueEClass, HasValue.class, "HasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getHasValue_To(), this.getAbstractCodeElement(), null, "to", null, 1, 1, HasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getHasValue_From(), this.getCodeItem(), null, "from", null, 1, 1, HasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(extendsEClass, Extends.class, "Extends", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExtends_To(), this.getDatatype(), null, "to", null, 1, 1, Extends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getExtends_From(), this.getDatatype(), null, "from", null, 1, 1, Extends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(preprocessorDirectiveEClass, PreprocessorDirective.class, "PreprocessorDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPreprocessorDirective_CodeElement(), this.getAbstractCodeElement(), null, "codeElement", null, 0, -1, PreprocessorDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(macroUnitEClass, MacroUnit.class, "MacroUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMacroUnit_Kind(), this.getMacroKind(), "kind", null, 0, 1, MacroUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(macroDirectiveEClass, MacroDirective.class, "MacroDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(includeDirectiveEClass, IncludeDirective.class, "IncludeDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(conditionalDirectiveEClass, ConditionalDirective.class, "ConditionalDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(expandsEClass, Expands.class, "Expands", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getExpands_To(), this.getMacroUnit(), null, "to", null, 1, 1, Expands.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getExpands_From(), this.getPreprocessorDirective(), null, "from", null, 1, 1, Expands.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(generatedFromEClass, GeneratedFrom.class, "GeneratedFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getGeneratedFrom_To(), this.getPreprocessorDirective(), null, "to", null, 1, 1, GeneratedFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getGeneratedFrom_From(), this.getAbstractCodeElement(), null, "from", null, 1, 1, GeneratedFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(includesEClass, Includes.class, "Includes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getIncludes_To(), this.getAbstractCodeElement(), null, "to", null, 1, 1, Includes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getIncludes_From(), this.getPreprocessorDirective(), null, "from", null, 1, 1, Includes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(variantToEClass, VariantTo.class, "VariantTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getVariantTo_To(), this.getPreprocessorDirective(), null, "to", null, 1, 1, VariantTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVariantTo_From(), this.getPreprocessorDirective(), null, "from", null, 1, 1, VariantTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(redefinesEClass, Redefines.class, "Redefines", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRedefines_To(), this.getMacroUnit(), null, "to", null, 1, 1, Redefines.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getRedefines_From(), this.getPreprocessorDirective(), null, "from", null, 1, 1, Redefines.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(commentUnitEClass, CommentUnit.class, "CommentUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getCommentUnit_Text(), theCorePackage.getString(), "text", null, 0, 1, CommentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getNamespace_GroupedCode(), this.getCodeItem(), null, "groupedCode", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(visibleInEClass, VisibleIn.class, "VisibleIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getVisibleIn_To(), this.getCodeItem(), null, "to", null, 1, 1, VisibleIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getVisibleIn_From(), this.getCodeItem(), null, "from", null, 1, 1, VisibleIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(importsEClass, Imports.class, "Imports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getImports_To(), this.getCodeItem(), null, "to", null, 1, 1, Imports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getImports_From(), this.getCodeItem(), null, "from", null, 1, 1, Imports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(codeElementEClass, CodeElement.class, "CodeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(codeRelationshipEClass, CodeRelationship.class, "CodeRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCodeRelationship_To(), theCorePackage.getKDMEntity(), null, "to", null, 1, 1, CodeRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getCodeRelationship_From(), this.getCodeItem(), null, "from", null, 1, 1, CodeRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(callableKindEEnum, CallableKind.class, "CallableKind"); //$NON-NLS-1$
		addEEnumLiteral(callableKindEEnum, CallableKind.EXTERNAL);
		addEEnumLiteral(callableKindEEnum, CallableKind.REGULAR);
		addEEnumLiteral(callableKindEEnum, CallableKind.OPERATOR);
		addEEnumLiteral(callableKindEEnum, CallableKind.STORED);
		addEEnumLiteral(callableKindEEnum, CallableKind.UNKNOWN);

		initEEnum(methodKindEEnum, MethodKind.class, "MethodKind"); //$NON-NLS-1$
		addEEnumLiteral(methodKindEEnum, MethodKind.METHOD);
		addEEnumLiteral(methodKindEEnum, MethodKind.CONSTRUCTOR);
		addEEnumLiteral(methodKindEEnum, MethodKind.DESTRUCTOR);
		addEEnumLiteral(methodKindEEnum, MethodKind.OPERATOR);
		addEEnumLiteral(methodKindEEnum, MethodKind.VIRTUAL);
		addEEnumLiteral(methodKindEEnum, MethodKind.ABSTRACT);
		addEEnumLiteral(methodKindEEnum, MethodKind.UNKNOWN);

		initEEnum(exportKindEEnum, ExportKind.class, "ExportKind"); //$NON-NLS-1$
		addEEnumLiteral(exportKindEEnum, ExportKind.PUBLIC);
		addEEnumLiteral(exportKindEEnum, ExportKind.PRIVATE);
		addEEnumLiteral(exportKindEEnum, ExportKind.PROTECTED);
		addEEnumLiteral(exportKindEEnum, ExportKind.FINAL);
		addEEnumLiteral(exportKindEEnum, ExportKind.UNKNOWN);

		initEEnum(storableKindEEnum, StorableKind.class, "StorableKind"); //$NON-NLS-1$
		addEEnumLiteral(storableKindEEnum, StorableKind.GLOBAL);
		addEEnumLiteral(storableKindEEnum, StorableKind.LOCAL);
		addEEnumLiteral(storableKindEEnum, StorableKind.STATIC);
		addEEnumLiteral(storableKindEEnum, StorableKind.EXTERNAL);
		addEEnumLiteral(storableKindEEnum, StorableKind.REGISTER);
		addEEnumLiteral(storableKindEEnum, StorableKind.UNKNOWN);

		initEEnum(parameterKindEEnum, ParameterKind.class, "ParameterKind"); //$NON-NLS-1$
		addEEnumLiteral(parameterKindEEnum, ParameterKind.BY_VALUE);
		addEEnumLiteral(parameterKindEEnum, ParameterKind.BY_NAME);
		addEEnumLiteral(parameterKindEEnum, ParameterKind.BY_REFERENCE);
		addEEnumLiteral(parameterKindEEnum, ParameterKind.VARIADIC);
		addEEnumLiteral(parameterKindEEnum, ParameterKind.RETURN);
		addEEnumLiteral(parameterKindEEnum, ParameterKind.THROWS);
		addEEnumLiteral(parameterKindEEnum, ParameterKind.EXCEPTION);
		addEEnumLiteral(parameterKindEEnum, ParameterKind.CATCHALL);
		addEEnumLiteral(parameterKindEEnum, ParameterKind.UNKNOWN);

		initEEnum(macroKindEEnum, MacroKind.class, "MacroKind"); //$NON-NLS-1$
		addEEnumLiteral(macroKindEEnum, MacroKind.REGULAR);
		addEEnumLiteral(macroKindEEnum, MacroKind.OPTION);
		addEEnumLiteral(macroKindEEnum, MacroKind.UNDEFINED);
		addEEnumLiteral(macroKindEEnum, MacroKind.EXTERNAL);
		addEEnumLiteral(macroKindEEnum, MacroKind.UNKNOWN);

		// Create resource
		createResource(eNS_URI);
	}

} //CodePackageImpl
