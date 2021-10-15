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

import org.eclipse.modisco.omg.gastm.FormalParameterDefinition;
import org.eclipse.modisco.omg.gastm.FunctionDefinition;
import org.eclipse.modisco.omg.gastm.FunctionMemberAttributes;
import org.eclipse.modisco.omg.gastm.FunctionScope;
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.Statement;
import org.eclipse.modisco.omg.gastm.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.FunctionDefinitionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.FunctionDefinitionImpl#getFormalParameters <em>Formal Parameters</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.FunctionDefinitionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.FunctionDefinitionImpl#getFunctionMemberAttributes <em>Function Member Attributes</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.FunctionDefinitionImpl#getOpensScope <em>Opens Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionDefinitionImpl extends DefinitionImpl implements FunctionDefinition {
	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected TypeReference returnType;

	/**
	 * The cached value of the '{@link #getFormalParameters() <em>Formal Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<FormalParameterDefinition> formalParameters;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> body;

	/**
	 * The cached value of the '{@link #getFunctionMemberAttributes() <em>Function Member Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionMemberAttributes()
	 * @generated
	 * @ordered
	 */
	protected FunctionMemberAttributes functionMemberAttributes;

	/**
	 * The cached value of the '{@link #getOpensScope() <em>Opens Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpensScope()
	 * @generated
	 * @ordered
	 */
	protected FunctionScope opensScope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getFunctionDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(TypeReference newReturnType, NotificationChain msgs) {
		TypeReference oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.FUNCTION_DEFINITION__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(TypeReference newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.FUNCTION_DEFINITION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.FUNCTION_DEFINITION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.FUNCTION_DEFINITION__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormalParameterDefinition> getFormalParameters() {
		if (formalParameters == null) {
			formalParameters = new EObjectContainmentEList<FormalParameterDefinition>(FormalParameterDefinition.class, this, GASTMPackage.FUNCTION_DEFINITION__FORMAL_PARAMETERS);
		}
		return formalParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<Statement>(Statement.class, this, GASTMPackage.FUNCTION_DEFINITION__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionMemberAttributes getFunctionMemberAttributes() {
		return functionMemberAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionMemberAttributes(FunctionMemberAttributes newFunctionMemberAttributes, NotificationChain msgs) {
		FunctionMemberAttributes oldFunctionMemberAttributes = functionMemberAttributes;
		functionMemberAttributes = newFunctionMemberAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES, oldFunctionMemberAttributes, newFunctionMemberAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionMemberAttributes(FunctionMemberAttributes newFunctionMemberAttributes) {
		if (newFunctionMemberAttributes != functionMemberAttributes) {
			NotificationChain msgs = null;
			if (functionMemberAttributes != null)
				msgs = ((InternalEObject)functionMemberAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES, null, msgs);
			if (newFunctionMemberAttributes != null)
				msgs = ((InternalEObject)newFunctionMemberAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES, null, msgs);
			msgs = basicSetFunctionMemberAttributes(newFunctionMemberAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES, newFunctionMemberAttributes, newFunctionMemberAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionScope getOpensScope() {
		if (opensScope != null && opensScope.eIsProxy()) {
			InternalEObject oldOpensScope = (InternalEObject)opensScope;
			opensScope = (FunctionScope)eResolveProxy(oldOpensScope);
			if (opensScope != oldOpensScope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GASTMPackage.FUNCTION_DEFINITION__OPENS_SCOPE, oldOpensScope, opensScope));
			}
		}
		return opensScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionScope basicGetOpensScope() {
		return opensScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpensScope(FunctionScope newOpensScope) {
		FunctionScope oldOpensScope = opensScope;
		opensScope = newOpensScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.FUNCTION_DEFINITION__OPENS_SCOPE, oldOpensScope, opensScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.FUNCTION_DEFINITION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case GASTMPackage.FUNCTION_DEFINITION__FORMAL_PARAMETERS:
				return ((InternalEList<?>)getFormalParameters()).basicRemove(otherEnd, msgs);
			case GASTMPackage.FUNCTION_DEFINITION__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
			case GASTMPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES:
				return basicSetFunctionMemberAttributes(null, msgs);
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
			case GASTMPackage.FUNCTION_DEFINITION__RETURN_TYPE:
				return getReturnType();
			case GASTMPackage.FUNCTION_DEFINITION__FORMAL_PARAMETERS:
				return getFormalParameters();
			case GASTMPackage.FUNCTION_DEFINITION__BODY:
				return getBody();
			case GASTMPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES:
				return getFunctionMemberAttributes();
			case GASTMPackage.FUNCTION_DEFINITION__OPENS_SCOPE:
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
			case GASTMPackage.FUNCTION_DEFINITION__RETURN_TYPE:
				setReturnType((TypeReference)newValue);
				return;
			case GASTMPackage.FUNCTION_DEFINITION__FORMAL_PARAMETERS:
				getFormalParameters().clear();
				getFormalParameters().addAll((Collection<? extends FormalParameterDefinition>)newValue);
				return;
			case GASTMPackage.FUNCTION_DEFINITION__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends Statement>)newValue);
				return;
			case GASTMPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES:
				setFunctionMemberAttributes((FunctionMemberAttributes)newValue);
				return;
			case GASTMPackage.FUNCTION_DEFINITION__OPENS_SCOPE:
				setOpensScope((FunctionScope)newValue);
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
			case GASTMPackage.FUNCTION_DEFINITION__RETURN_TYPE:
				setReturnType((TypeReference)null);
				return;
			case GASTMPackage.FUNCTION_DEFINITION__FORMAL_PARAMETERS:
				getFormalParameters().clear();
				return;
			case GASTMPackage.FUNCTION_DEFINITION__BODY:
				getBody().clear();
				return;
			case GASTMPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES:
				setFunctionMemberAttributes((FunctionMemberAttributes)null);
				return;
			case GASTMPackage.FUNCTION_DEFINITION__OPENS_SCOPE:
				setOpensScope((FunctionScope)null);
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
			case GASTMPackage.FUNCTION_DEFINITION__RETURN_TYPE:
				return returnType != null;
			case GASTMPackage.FUNCTION_DEFINITION__FORMAL_PARAMETERS:
				return formalParameters != null && !formalParameters.isEmpty();
			case GASTMPackage.FUNCTION_DEFINITION__BODY:
				return body != null && !body.isEmpty();
			case GASTMPackage.FUNCTION_DEFINITION__FUNCTION_MEMBER_ATTRIBUTES:
				return functionMemberAttributes != null;
			case GASTMPackage.FUNCTION_DEFINITION__OPENS_SCOPE:
				return opensScope != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionDefinitionImpl
