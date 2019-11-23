/**
 * Copyright (c) 2012,2014 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 379683 - customizable Tree content provider
 *    Gregoire Dupe (Mia-Software) - Bug 386387 - [CustomizedTreeContentProvider] The TreeElements are not preserved between two calls to getElements() 
 *    Thomas Cicognani (Soft-Maint) - Bug 441321 - isVisible customisation doesn't work after refreshing a tree
 */
package org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject Tree Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a model element in a tree view
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement#getEObject <em>EObject</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage#getEObjectTreeElement()
 * @model
 * @generated
 */
public interface EObjectTreeElement extends TreeElement {
	/**
	 * Returns the value of the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model element represented by this tree element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EObject</em>' reference.
	 * @see #setEObject(EObject)
	 * @see org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage#getEObjectTreeElement_EObject()
	 * @model
	 * @generated
	 */
	EObject getEObject();

	/**
	 * Sets the value of the '{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.EObjectTreeElement#getEObject <em>EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EObject</em>' reference.
	 * @see #getEObject()
	 * @generated
	 */
	void setEObject(EObject value);

} // EObjectTreeElement
