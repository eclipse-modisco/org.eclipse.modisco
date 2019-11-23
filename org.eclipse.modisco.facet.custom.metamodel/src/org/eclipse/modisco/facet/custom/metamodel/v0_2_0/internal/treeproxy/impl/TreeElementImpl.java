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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeElement;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.TreeproxyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeElementImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.modisco.facet.custom.metamodel.v0_2_0.internal.treeproxy.impl.TreeElementImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TreeElementImpl extends EObjectImpl implements TreeElement {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<TreeElement> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TreeproxyPackage.Literals.TREE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeElement getParent() {
		if (eContainerFeatureID() != TreeproxyPackage.TREE_ELEMENT__PARENT) return null;
		return (TreeElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TreeElement newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, TreeproxyPackage.TREE_ELEMENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TreeElement newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != TreeproxyPackage.TREE_ELEMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, TreeproxyPackage.TREE_ELEMENT__CHILDREN, TreeElement.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TreeproxyPackage.TREE_ELEMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TreeElement> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<TreeElement>(TreeElement.class, this, TreeproxyPackage.TREE_ELEMENT__CHILDREN, TreeproxyPackage.TREE_ELEMENT__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TreeproxyPackage.TREE_ELEMENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TreeElement)otherEnd, msgs);
			case TreeproxyPackage.TREE_ELEMENT__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TreeproxyPackage.TREE_ELEMENT__PARENT:
				return basicSetParent(null, msgs);
			case TreeproxyPackage.TREE_ELEMENT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TreeproxyPackage.TREE_ELEMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, TreeproxyPackage.TREE_ELEMENT__CHILDREN, TreeElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TreeproxyPackage.TREE_ELEMENT__PARENT:
				return getParent();
			case TreeproxyPackage.TREE_ELEMENT__CHILDREN:
				return getChildren();
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
			case TreeproxyPackage.TREE_ELEMENT__PARENT:
				setParent((TreeElement)newValue);
				return;
			case TreeproxyPackage.TREE_ELEMENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends TreeElement>)newValue);
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
			case TreeproxyPackage.TREE_ELEMENT__PARENT:
				setParent((TreeElement)null);
				return;
			case TreeproxyPackage.TREE_ELEMENT__CHILDREN:
				getChildren().clear();
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
			case TreeproxyPackage.TREE_ELEMENT__PARENT:
				return getParent() != null;
			case TreeproxyPackage.TREE_ELEMENT__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TreeElementImpl
