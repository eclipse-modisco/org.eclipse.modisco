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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.modisco.omg.gastm.Expression;
import org.eclipse.modisco.omg.gastm.ForStatement;
import org.eclipse.modisco.omg.gastm.GASTMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.ForStatementImpl#getInitBody <em>Init Body</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.ForStatementImpl#getIterationBody <em>Iteration Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ForStatementImpl extends LoopStatementImpl implements ForStatement {
	/**
	 * The cached value of the '{@link #getInitBody() <em>Init Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> initBody;

	/**
	 * The cached value of the '{@link #getIterationBody() <em>Iteration Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterationBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> iterationBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getForStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getInitBody() {
		if (initBody == null) {
			initBody = new EObjectContainmentEList<Expression>(Expression.class, this, GASTMPackage.FOR_STATEMENT__INIT_BODY);
		}
		return initBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getIterationBody() {
		if (iterationBody == null) {
			iterationBody = new EObjectContainmentEList<Expression>(Expression.class, this, GASTMPackage.FOR_STATEMENT__ITERATION_BODY);
		}
		return iterationBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.FOR_STATEMENT__INIT_BODY:
				return ((InternalEList<?>)getInitBody()).basicRemove(otherEnd, msgs);
			case GASTMPackage.FOR_STATEMENT__ITERATION_BODY:
				return ((InternalEList<?>)getIterationBody()).basicRemove(otherEnd, msgs);
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
			case GASTMPackage.FOR_STATEMENT__INIT_BODY:
				return getInitBody();
			case GASTMPackage.FOR_STATEMENT__ITERATION_BODY:
				return getIterationBody();
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
			case GASTMPackage.FOR_STATEMENT__INIT_BODY:
				getInitBody().clear();
				getInitBody().addAll((Collection<? extends Expression>)newValue);
				return;
			case GASTMPackage.FOR_STATEMENT__ITERATION_BODY:
				getIterationBody().clear();
				getIterationBody().addAll((Collection<? extends Expression>)newValue);
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
			case GASTMPackage.FOR_STATEMENT__INIT_BODY:
				getInitBody().clear();
				return;
			case GASTMPackage.FOR_STATEMENT__ITERATION_BODY:
				getIterationBody().clear();
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
			case GASTMPackage.FOR_STATEMENT__INIT_BODY:
				return initBody != null && !initBody.isEmpty();
			case GASTMPackage.FOR_STATEMENT__ITERATION_BODY:
				return iterationBody != null && !iterationBody.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForStatementImpl
