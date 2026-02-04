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

import org.eclipse.modisco.omg.gastm.CatchBlock;
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.Statement;
import org.eclipse.modisco.omg.gastm.TryStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.TryStatementImpl#getGuardedStatement <em>Guarded Statement</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.TryStatementImpl#getCatchBlocks <em>Catch Blocks</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.TryStatementImpl#getFinalStatement <em>Final Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TryStatementImpl extends StatementImpl implements TryStatement {
	/**
	 * The cached value of the '{@link #getGuardedStatement() <em>Guarded Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardedStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement guardedStatement;

	/**
	 * The cached value of the '{@link #getCatchBlocks() <em>Catch Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<CatchBlock> catchBlocks;

	/**
	 * The cached value of the '{@link #getFinalStatement() <em>Final Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement finalStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TryStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getTryStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getGuardedStatement() {
		return guardedStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuardedStatement(Statement newGuardedStatement, NotificationChain msgs) {
		Statement oldGuardedStatement = guardedStatement;
		guardedStatement = newGuardedStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.TRY_STATEMENT__GUARDED_STATEMENT, oldGuardedStatement, newGuardedStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardedStatement(Statement newGuardedStatement) {
		if (newGuardedStatement != guardedStatement) {
			NotificationChain msgs = null;
			if (guardedStatement != null)
				msgs = ((InternalEObject)guardedStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.TRY_STATEMENT__GUARDED_STATEMENT, null, msgs);
			if (newGuardedStatement != null)
				msgs = ((InternalEObject)newGuardedStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.TRY_STATEMENT__GUARDED_STATEMENT, null, msgs);
			msgs = basicSetGuardedStatement(newGuardedStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.TRY_STATEMENT__GUARDED_STATEMENT, newGuardedStatement, newGuardedStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CatchBlock> getCatchBlocks() {
		if (catchBlocks == null) {
			catchBlocks = new EObjectContainmentEList<CatchBlock>(CatchBlock.class, this, GASTMPackage.TRY_STATEMENT__CATCH_BLOCKS);
		}
		return catchBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getFinalStatement() {
		return finalStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalStatement(Statement newFinalStatement, NotificationChain msgs) {
		Statement oldFinalStatement = finalStatement;
		finalStatement = newFinalStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.TRY_STATEMENT__FINAL_STATEMENT, oldFinalStatement, newFinalStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalStatement(Statement newFinalStatement) {
		if (newFinalStatement != finalStatement) {
			NotificationChain msgs = null;
			if (finalStatement != null)
				msgs = ((InternalEObject)finalStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.TRY_STATEMENT__FINAL_STATEMENT, null, msgs);
			if (newFinalStatement != null)
				msgs = ((InternalEObject)newFinalStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.TRY_STATEMENT__FINAL_STATEMENT, null, msgs);
			msgs = basicSetFinalStatement(newFinalStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.TRY_STATEMENT__FINAL_STATEMENT, newFinalStatement, newFinalStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.TRY_STATEMENT__GUARDED_STATEMENT:
				return basicSetGuardedStatement(null, msgs);
			case GASTMPackage.TRY_STATEMENT__CATCH_BLOCKS:
				return ((InternalEList<?>)getCatchBlocks()).basicRemove(otherEnd, msgs);
			case GASTMPackage.TRY_STATEMENT__FINAL_STATEMENT:
				return basicSetFinalStatement(null, msgs);
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
			case GASTMPackage.TRY_STATEMENT__GUARDED_STATEMENT:
				return getGuardedStatement();
			case GASTMPackage.TRY_STATEMENT__CATCH_BLOCKS:
				return getCatchBlocks();
			case GASTMPackage.TRY_STATEMENT__FINAL_STATEMENT:
				return getFinalStatement();
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
			case GASTMPackage.TRY_STATEMENT__GUARDED_STATEMENT:
				setGuardedStatement((Statement)newValue);
				return;
			case GASTMPackage.TRY_STATEMENT__CATCH_BLOCKS:
				getCatchBlocks().clear();
				getCatchBlocks().addAll((Collection<? extends CatchBlock>)newValue);
				return;
			case GASTMPackage.TRY_STATEMENT__FINAL_STATEMENT:
				setFinalStatement((Statement)newValue);
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
			case GASTMPackage.TRY_STATEMENT__GUARDED_STATEMENT:
				setGuardedStatement((Statement)null);
				return;
			case GASTMPackage.TRY_STATEMENT__CATCH_BLOCKS:
				getCatchBlocks().clear();
				return;
			case GASTMPackage.TRY_STATEMENT__FINAL_STATEMENT:
				setFinalStatement((Statement)null);
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
			case GASTMPackage.TRY_STATEMENT__GUARDED_STATEMENT:
				return guardedStatement != null;
			case GASTMPackage.TRY_STATEMENT__CATCH_BLOCKS:
				return catchBlocks != null && !catchBlocks.isEmpty();
			case GASTMPackage.TRY_STATEMENT__FINAL_STATEMENT:
				return finalStatement != null;
		}
		return super.eIsSet(featureID);
	}

} //TryStatementImpl
