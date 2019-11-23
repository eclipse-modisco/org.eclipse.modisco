/**
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.browser.custom.emf.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.browser.custom.*;
import org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage;

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
 * @see org.eclipse.modisco.infra.browser.custom.emf.UicustomPackage
 * @generated
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
@SuppressWarnings("all")
public class UicustomSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UicustomPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UicustomSwitch() {
		if (modelPackage == null) {
			modelPackage = UicustomPackage.eINSTANCE;
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
			case UicustomPackage.METAMODEL_VIEW: {
				MetamodelView metamodelView = (MetamodelView)theEObject;
				T result = caseMetamodelView(metamodelView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UicustomPackage.TYPE_VIEW: {
				TypeView typeView = (TypeView)theEObject;
				T result = caseTypeView(typeView);
				if (result == null) result = caseCustomView(typeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UicustomPackage.ATTRIBUTE_VIEW: {
				AttributeView attributeView = (AttributeView)theEObject;
				T result = caseAttributeView(attributeView);
				if (result == null) result = caseCustomView(attributeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UicustomPackage.REFERENCE_VIEW: {
				ReferenceView referenceView = (ReferenceView)theEObject;
				T result = caseReferenceView(referenceView);
				if (result == null) result = caseCustomView(referenceView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UicustomPackage.CUSTOM_VIEW: {
				CustomView customView = (CustomView)theEObject;
				T result = caseCustomView(customView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UicustomPackage.CUSTOM_VIEW_FEATURE: {
				CustomViewFeature customViewFeature = (CustomViewFeature)theEObject;
				T result = caseCustomViewFeature(customViewFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UicustomPackage.FEATURE_VALUE_CASE: {
				FeatureValueCase featureValueCase = (FeatureValueCase)theEObject;
				T result = caseFeatureValueCase(featureValueCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UicustomPackage.FEATURE_VALUE: {
				FeatureValue featureValue = (FeatureValue)theEObject;
				T result = caseFeatureValue(featureValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UicustomPackage.STATIC_FEATURE_VALUE: {
				StaticFeatureValue staticFeatureValue = (StaticFeatureValue)theEObject;
				T result = caseStaticFeatureValue(staticFeatureValue);
				if (result == null) result = caseFeatureValue(staticFeatureValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UicustomPackage.DERIVED_FEATURE_VALUE: {
				DerivedFeatureValue derivedFeatureValue = (DerivedFeatureValue)theEObject;
				T result = caseDerivedFeatureValue(derivedFeatureValue);
				if (result == null) result = caseFeatureValue(derivedFeatureValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelView(MetamodelView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeView(TypeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeView(AttributeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceView(ReferenceView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomView(CustomView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom View Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom View Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomViewFeature(CustomViewFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Value Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Value Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureValueCase(FeatureValueCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureValue(FeatureValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Feature Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Feature Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticFeatureValue(StaticFeatureValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Feature Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Feature Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedFeatureValue(DerivedFeatureValue object) {
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

} //UicustomSwitch
