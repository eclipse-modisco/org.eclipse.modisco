/**
 * Copyright (c) 2012,2014 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 379683 - customizable Tree content provider
 *    Gregoire Dupe (Mia-Software) - Bug 386387 - [CustomizedTreeContentProvider] The TreeElements are not preserved between two calls to getElements() 
 *    Thomas Cicognani (Soft-Maint) - Bug 441321 - isVisible customisation doesn't work after refreshing a tree
 */
package org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EAttributeTreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAttribute Tree Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.EAttributeTreeElementImpl#getEAttribute <em>EAttribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EAttributeTreeElementImpl extends EStructuralFeatureTreeElementImpl implements EAttributeTreeElement {
	/**
	 * The cached setting delegate for the '{@link #getEAttribute() <em>EAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EATTRIBUTE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TreeproxyPackage.Literals.EATTRIBUTE_TREE_ELEMENT__EATTRIBUTE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAttributeTreeElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TreeproxyPackage.Literals.EATTRIBUTE_TREE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAttribute() {
		return (EAttribute)EATTRIBUTE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetEAttribute() {
		return (EAttribute)EATTRIBUTE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TreeproxyPackage.EATTRIBUTE_TREE_ELEMENT__EATTRIBUTE:
				if (resolve) return getEAttribute();
				return basicGetEAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TreeproxyPackage.EATTRIBUTE_TREE_ELEMENT__EATTRIBUTE:
				return EATTRIBUTE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //EAttributeTreeElementImpl
