/**
 * <copyright>
 * Copyright (c) 2009, 2019 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Adolfo Sanchez-Barbudo Herrera - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.modisco.omg.gastm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.omg.gastm.BlockScope;
import org.eclipse.modisco.omg.gastm.BlockStatement;
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.BlockStatementImpl#getSubStatements <em>Sub Statements</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.BlockStatementImpl#getOpensScope <em>Opens Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockStatementImpl extends StatementImpl implements BlockStatement {
	/**
	 * The cached value of the '{@link #getSubStatements() <em>Sub Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> subStatements;

	/**
	 * The cached value of the '{@link #getOpensScope() <em>Opens Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpensScope()
	 * @generated
	 * @ordered
	 */
	protected BlockScope opensScope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getBlockStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getSubStatements() {
		if (subStatements == null) {
			subStatements = new EObjectContainmentEList<Statement>(Statement.class, this, GASTMPackage.BLOCK_STATEMENT__SUB_STATEMENTS);
		}
		return subStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockScope getOpensScope() {
		if (opensScope != null && opensScope.eIsProxy()) {
			InternalEObject oldOpensScope = (InternalEObject)opensScope;
			opensScope = (BlockScope)eResolveProxy(oldOpensScope);
			if (opensScope != oldOpensScope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GASTMPackage.BLOCK_STATEMENT__OPENS_SCOPE, oldOpensScope, opensScope));
			}
		}
		return opensScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockScope basicGetOpensScope() {
		return opensScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpensScope(BlockScope newOpensScope) {
		BlockScope oldOpensScope = opensScope;
		opensScope = newOpensScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.BLOCK_STATEMENT__OPENS_SCOPE, oldOpensScope, opensScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.BLOCK_STATEMENT__SUB_STATEMENTS:
				return ((InternalEList<?>)getSubStatements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GASTMPackage.BLOCK_STATEMENT__SUB_STATEMENTS:
				return getSubStatements();
			case GASTMPackage.BLOCK_STATEMENT__OPENS_SCOPE:
				if (resolve) return getOpensScope();
				return basicGetOpensScope();
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
			case GASTMPackage.BLOCK_STATEMENT__SUB_STATEMENTS:
				getSubStatements().clear();
				getSubStatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case GASTMPackage.BLOCK_STATEMENT__OPENS_SCOPE:
				setOpensScope((BlockScope)newValue);
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
			case GASTMPackage.BLOCK_STATEMENT__SUB_STATEMENTS:
				getSubStatements().clear();
				return;
			case GASTMPackage.BLOCK_STATEMENT__OPENS_SCOPE:
				setOpensScope((BlockScope)null);
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
			case GASTMPackage.BLOCK_STATEMENT__SUB_STATEMENTS:
				return subStatements != null && !subStatements.isEmpty();
			case GASTMPackage.BLOCK_STATEMENT__OPENS_SCOPE:
				return opensScope != null;
		}
		return super.eIsSet(featureID);
	}

} //BlockStatementImpl
