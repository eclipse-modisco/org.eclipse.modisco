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
package org.eclipse.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a proxy element in a tree view
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage#getTreeElement()
 * @model abstract="true"
 * @generated
 */
public interface TreeElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TreeElement)
	 * @see org.eclipse.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage#getTreeElement_Parent()
	 * @see org.eclipse.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	TreeElement getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TreeElement value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage#getTreeElement_Children()
	 * @see org.eclipse.emf.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<TreeElement> getChildren();

} // TreeElement
