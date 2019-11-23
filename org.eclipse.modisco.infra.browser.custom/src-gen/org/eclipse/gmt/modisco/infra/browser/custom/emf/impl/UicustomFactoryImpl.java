/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.infra.browser.custom.emf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gmt.modisco.infra.browser.custom.*;
import org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomFactory;
import org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
@SuppressWarnings("all")
public class UicustomFactoryImpl extends EFactoryImpl implements UicustomFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UicustomFactory init() {
		try {
			UicustomFactory theUicustomFactory = (UicustomFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/MoDisco/infra/browser/custom/0.8"); 
			if (theUicustomFactory != null) {
				return theUicustomFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UicustomFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UicustomFactoryImpl() {
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
			case UicustomPackage.METAMODEL_VIEW: return createMetamodelView();
			case UicustomPackage.TYPE_VIEW: return createTypeView();
			case UicustomPackage.ATTRIBUTE_VIEW: return createAttributeView();
			case UicustomPackage.REFERENCE_VIEW: return createReferenceView();
			case UicustomPackage.CUSTOM_VIEW_FEATURE: return createCustomViewFeature();
			case UicustomPackage.FEATURE_VALUE_CASE: return createFeatureValueCase();
			case UicustomPackage.STATIC_FEATURE_VALUE: return createStaticFeatureValue();
			case UicustomPackage.DERIVED_FEATURE_VALUE: return createDerivedFeatureValue();
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
			case UicustomPackage.CUSTOMIZABLE_FEATURES:
				return createCustomizableFeaturesFromString(eDataType, initialValue);
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
			case UicustomPackage.CUSTOMIZABLE_FEATURES:
				return convertCustomizableFeaturesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelView createMetamodelView() {
		MetamodelViewImpl metamodelView = new MetamodelViewImpl();
		return metamodelView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeView createTypeView() {
		TypeViewImpl typeView = new TypeViewImpl();
		return typeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeView createAttributeView() {
		AttributeViewImpl attributeView = new AttributeViewImpl();
		return attributeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceView createReferenceView() {
		ReferenceViewImpl referenceView = new ReferenceViewImpl();
		return referenceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomViewFeature createCustomViewFeature() {
		CustomViewFeatureImpl customViewFeature = new CustomViewFeatureImpl();
		return customViewFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValueCase createFeatureValueCase() {
		FeatureValueCaseImpl featureValueCase = new FeatureValueCaseImpl();
		return featureValueCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticFeatureValue createStaticFeatureValue() {
		StaticFeatureValueImpl staticFeatureValue = new StaticFeatureValueImpl();
		return staticFeatureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedFeatureValue createDerivedFeatureValue() {
		DerivedFeatureValueImpl derivedFeatureValue = new DerivedFeatureValueImpl();
		return derivedFeatureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomizableFeatures createCustomizableFeaturesFromString(EDataType eDataType, String initialValue) {
		CustomizableFeatures result = CustomizableFeatures.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCustomizableFeaturesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UicustomPackage getUicustomPackage() {
		return (UicustomPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UicustomPackage getPackage() {
		return UicustomPackage.eINSTANCE;
	}

} //UicustomFactoryImpl
