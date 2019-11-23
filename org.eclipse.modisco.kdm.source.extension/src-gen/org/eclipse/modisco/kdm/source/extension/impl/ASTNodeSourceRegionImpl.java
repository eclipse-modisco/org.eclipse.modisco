/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.kdm.source.extension.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion;
import org.eclipse.modisco.kdm.source.extension.CodeUnit2File;
import org.eclipse.modisco.kdm.source.extension.ExtensionPackage;
import org.eclipse.modisco.omg.kdm.source.impl.SourceRegionImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>AST Node Source Region</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.kdm.source.extension.impl.ASTNodeSourceRegionImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.modisco.kdm.source.extension.impl.ASTNodeSourceRegionImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class ASTNodeSourceRegionImpl extends SourceRegionImpl
		implements ASTNodeSourceRegion {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EObject node;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ASTNodeSourceRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionPackage.Literals.AST_NODE_SOURCE_REGION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getNode() {
		if (this.node != null && this.node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject)this.node;
			this.node = eResolveProxy(oldNode);
			if (this.node != oldNode) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionPackage.AST_NODE_SOURCE_REGION__NODE, oldNode, this.node));
				}
			}
		}
		return this.node;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetNode() {
		return this.node;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(final EObject newNode) {
		EObject oldNode = this.node;
		this.node = newNode;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.AST_NODE_SOURCE_REGION__NODE, oldNode, this.node));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CodeUnit2File getParent() {
		if (eContainerFeatureID() != ExtensionPackage.AST_NODE_SOURCE_REGION__PARENT) {
			return null;
		}
		return (CodeUnit2File)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(final CodeUnit2File newParent,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ExtensionPackage.AST_NODE_SOURCE_REGION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(final CodeUnit2File newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ExtensionPackage.AST_NODE_SOURCE_REGION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			}
			NotificationChain msgs = null;
			if (eInternalContainer() != null) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (newParent != null) {
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ExtensionPackage.CODE_UNIT2_FILE__CHILDREN, CodeUnit2File.class, msgs);
			}
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		}
		else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.AST_NODE_SOURCE_REGION__PARENT, newParent, newParent));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(final InternalEObject otherEnd,
			final int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionPackage.AST_NODE_SOURCE_REGION__PARENT:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetParent((CodeUnit2File)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd,
			final int featureID, final NotificationChain msgs) {
		switch (featureID) {
			case ExtensionPackage.AST_NODE_SOURCE_REGION__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			final NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ExtensionPackage.AST_NODE_SOURCE_REGION__PARENT:
				return eInternalContainer().eInverseRemove(this, ExtensionPackage.CODE_UNIT2_FILE__CHILDREN, CodeUnit2File.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
			case ExtensionPackage.AST_NODE_SOURCE_REGION__NODE:
				if (resolve) {
					return getNode();
				}
				return basicGetNode();
			case ExtensionPackage.AST_NODE_SOURCE_REGION__PARENT:
				return getParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
			case ExtensionPackage.AST_NODE_SOURCE_REGION__NODE:
				setNode((EObject)newValue);
				return;
			case ExtensionPackage.AST_NODE_SOURCE_REGION__PARENT:
				setParent((CodeUnit2File)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
			case ExtensionPackage.AST_NODE_SOURCE_REGION__NODE:
				setNode((EObject)null);
				return;
			case ExtensionPackage.AST_NODE_SOURCE_REGION__PARENT:
				setParent((CodeUnit2File)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
			case ExtensionPackage.AST_NODE_SOURCE_REGION__NODE:
				return this.node != null;
			case ExtensionPackage.AST_NODE_SOURCE_REGION__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

} // ASTNodeSourceRegionImpl
