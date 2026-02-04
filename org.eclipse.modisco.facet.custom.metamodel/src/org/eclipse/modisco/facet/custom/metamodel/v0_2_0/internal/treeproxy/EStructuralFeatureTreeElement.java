/**
 * Copyright (c) 2012,2019 Mia-Software and others.
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
package org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EStructural Feature Tree Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EStructuralFeatureTreeElement#getEStructuralFeature <em>EStructural Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage#getEStructuralFeatureTreeElement()
 * @model abstract="true"
 * @generated
 */
public interface EStructuralFeatureTreeElement extends TreeElement {
	/**
	 * Returns the value of the '<em><b>EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EStructural Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EStructural Feature</em>' reference.
	 * @see #setEStructuralFeature(EStructuralFeature)
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage#getEStructuralFeatureTreeElement_EStructuralFeature()
	 * @model derived="true"
	 * @generated
	 */
	EStructuralFeature getEStructuralFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EStructuralFeatureTreeElement#getEStructuralFeature <em>EStructural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EStructural Feature</em>' reference.
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	void setEStructuralFeature(EStructuralFeature value);

} // EStructuralFeatureTreeElement
