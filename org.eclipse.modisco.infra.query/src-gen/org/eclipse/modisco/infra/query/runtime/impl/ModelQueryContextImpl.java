/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - meta-model design
 *     Gregoire DUPE (Mia-Software) - design and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.query.runtime.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.modisco.infra.query.runtime.ModelQueryContext;
import org.eclipse.modisco.infra.query.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Query Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.query.runtime.impl.ModelQueryContextImpl#getSelectedModelElements <em>Selected Model Elements</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.query.runtime.impl.ModelQueryContextImpl#getSelectedModels <em>Selected Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class ModelQueryContextImpl extends EObjectImpl implements ModelQueryContext {
	/**
	 * The cached value of the '{@link #getSelectedModelElements() <em>Selected Model Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedModelElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> selectedModelElements;

	/**
	 * The cached value of the '{@link #getSelectedModels() <em>Selected Models</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> selectedModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelQueryContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.MODEL_QUERY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSelectedModelElements() {
		if (selectedModelElements == null) {
			selectedModelElements = new EObjectResolvingEList<EObject>(EObject.class, this, RuntimePackage.MODEL_QUERY_CONTEXT__SELECTED_MODEL_ELEMENTS);
		}
		return selectedModelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getSelectedModels() {
		if (selectedModels == null) {
			selectedModels = new EDataTypeUniqueEList<Resource>(Resource.class, this, RuntimePackage.MODEL_QUERY_CONTEXT__SELECTED_MODELS);
		}
		return selectedModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.MODEL_QUERY_CONTEXT__SELECTED_MODEL_ELEMENTS:
				return getSelectedModelElements();
			case RuntimePackage.MODEL_QUERY_CONTEXT__SELECTED_MODELS:
				return getSelectedModels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RuntimePackage.MODEL_QUERY_CONTEXT__SELECTED_MODEL_ELEMENTS:
				getSelectedModelElements().clear();
				getSelectedModelElements().addAll((Collection<? extends EObject>)newValue);
				return;
			case RuntimePackage.MODEL_QUERY_CONTEXT__SELECTED_MODELS:
				getSelectedModels().clear();
				getSelectedModels().addAll((Collection<? extends Resource>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RuntimePackage.MODEL_QUERY_CONTEXT__SELECTED_MODEL_ELEMENTS:
				getSelectedModelElements().clear();
				return;
			case RuntimePackage.MODEL_QUERY_CONTEXT__SELECTED_MODELS:
				getSelectedModels().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RuntimePackage.MODEL_QUERY_CONTEXT__SELECTED_MODEL_ELEMENTS:
				return selectedModelElements != null && !selectedModelElements.isEmpty();
			case RuntimePackage.MODEL_QUERY_CONTEXT__SELECTED_MODELS:
				return selectedModels != null && !selectedModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (selectedModels: "); //$NON-NLS-1$
		result.append(selectedModels);
		result.append(')');
		return result.toString();
	}

} //ModelQueryContextImpl
