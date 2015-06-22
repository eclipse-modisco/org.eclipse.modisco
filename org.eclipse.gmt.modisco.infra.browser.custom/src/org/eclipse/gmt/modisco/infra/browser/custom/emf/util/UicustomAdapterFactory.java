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
package org.eclipse.gmt.modisco.infra.browser.custom.emf.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.infra.browser.custom.*;
import org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomPackage
 * @generated
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
@SuppressWarnings("all")
public class UicustomAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UicustomPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UicustomAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UicustomPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UicustomSwitch<Adapter> modelSwitch =
		new UicustomSwitch<Adapter>() {
			@Override
			public Adapter caseMetamodelView(MetamodelView object) {
				return createMetamodelViewAdapter();
			}
			@Override
			public Adapter caseTypeView(TypeView object) {
				return createTypeViewAdapter();
			}
			@Override
			public Adapter caseAttributeView(AttributeView object) {
				return createAttributeViewAdapter();
			}
			@Override
			public Adapter caseReferenceView(ReferenceView object) {
				return createReferenceViewAdapter();
			}
			@Override
			public Adapter caseCustomView(CustomView object) {
				return createCustomViewAdapter();
			}
			@Override
			public Adapter caseCustomViewFeature(CustomViewFeature object) {
				return createCustomViewFeatureAdapter();
			}
			@Override
			public Adapter caseFeatureValueCase(FeatureValueCase object) {
				return createFeatureValueCaseAdapter();
			}
			@Override
			public Adapter caseFeatureValue(FeatureValue object) {
				return createFeatureValueAdapter();
			}
			@Override
			public Adapter caseStaticFeatureValue(StaticFeatureValue object) {
				return createStaticFeatureValueAdapter();
			}
			@Override
			public Adapter caseDerivedFeatureValue(DerivedFeatureValue object) {
				return createDerivedFeatureValueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.infra.browser.custom.MetamodelView <em>Metamodel View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.MetamodelView
	 * @generated
	 */
	public Adapter createMetamodelViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.infra.browser.custom.TypeView <em>Type View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.TypeView
	 * @generated
	 */
	public Adapter createTypeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.infra.browser.custom.AttributeView <em>Attribute View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.AttributeView
	 * @generated
	 */
	public Adapter createAttributeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.infra.browser.custom.ReferenceView <em>Reference View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.ReferenceView
	 * @generated
	 */
	public Adapter createReferenceViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.infra.browser.custom.CustomView <em>Custom View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.CustomView
	 * @generated
	 */
	public Adapter createCustomViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.infra.browser.custom.CustomViewFeature <em>Custom View Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.CustomViewFeature
	 * @generated
	 */
	public Adapter createCustomViewFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.infra.browser.custom.FeatureValueCase <em>Feature Value Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.FeatureValueCase
	 * @generated
	 */
	public Adapter createFeatureValueCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.infra.browser.custom.FeatureValue <em>Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.FeatureValue
	 * @generated
	 */
	public Adapter createFeatureValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.infra.browser.custom.StaticFeatureValue <em>Static Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.StaticFeatureValue
	 * @generated
	 */
	public Adapter createStaticFeatureValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmt.modisco.infra.browser.custom.DerivedFeatureValue <em>Derived Feature Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmt.modisco.infra.browser.custom.DerivedFeatureValue
	 * @generated
	 */
	public Adapter createDerivedFeatureValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UicustomAdapterFactory
