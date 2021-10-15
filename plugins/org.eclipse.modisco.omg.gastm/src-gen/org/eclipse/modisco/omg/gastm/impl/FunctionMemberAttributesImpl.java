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

import java.lang.Boolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.modisco.omg.gastm.FunctionMemberAttributes;
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.VirtualSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Member Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.FunctionMemberAttributesImpl#getIsFriend <em>Is Friend</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.FunctionMemberAttributesImpl#getIsInLine <em>Is In Line</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.FunctionMemberAttributesImpl#getIsThisConst <em>Is This Const</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.FunctionMemberAttributesImpl#getVirtualSpecifier <em>Virtual Specifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionMemberAttributesImpl extends MinorSyntaxObjectImpl implements FunctionMemberAttributes {
	/**
	 * The default value of the '{@link #getIsFriend() <em>Is Friend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFriend()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_FRIEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsFriend() <em>Is Friend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFriend()
	 * @generated
	 * @ordered
	 */
	protected Boolean isFriend = IS_FRIEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsInLine() <em>Is In Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInLine()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_IN_LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsInLine() <em>Is In Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInLine()
	 * @generated
	 * @ordered
	 */
	protected Boolean isInLine = IS_IN_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsThisConst() <em>Is This Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsThisConst()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_THIS_CONST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsThisConst() <em>Is This Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsThisConst()
	 * @generated
	 * @ordered
	 */
	protected Boolean isThisConst = IS_THIS_CONST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVirtualSpecifier() <em>Virtual Specifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSpecifier()
	 * @generated
	 * @ordered
	 */
	protected VirtualSpecification virtualSpecifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionMemberAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getFunctionMemberAttributes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsFriend() {
		return isFriend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFriend(Boolean newIsFriend) {
		Boolean oldIsFriend = isFriend;
		isFriend = newIsFriend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__IS_FRIEND, oldIsFriend, isFriend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsInLine() {
		return isInLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInLine(Boolean newIsInLine) {
		Boolean oldIsInLine = isInLine;
		isInLine = newIsInLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__IS_IN_LINE, oldIsInLine, isInLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsThisConst() {
		return isThisConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsThisConst(Boolean newIsThisConst) {
		Boolean oldIsThisConst = isThisConst;
		isThisConst = newIsThisConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__IS_THIS_CONST, oldIsThisConst, isThisConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSpecification getVirtualSpecifier() {
		return virtualSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVirtualSpecifier(VirtualSpecification newVirtualSpecifier, NotificationChain msgs) {
		VirtualSpecification oldVirtualSpecifier = virtualSpecifier;
		virtualSpecifier = newVirtualSpecifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__VIRTUAL_SPECIFIER, oldVirtualSpecifier, newVirtualSpecifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualSpecifier(VirtualSpecification newVirtualSpecifier) {
		if (newVirtualSpecifier != virtualSpecifier) {
			NotificationChain msgs = null;
			if (virtualSpecifier != null)
				msgs = ((InternalEObject)virtualSpecifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__VIRTUAL_SPECIFIER, null, msgs);
			if (newVirtualSpecifier != null)
				msgs = ((InternalEObject)newVirtualSpecifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__VIRTUAL_SPECIFIER, null, msgs);
			msgs = basicSetVirtualSpecifier(newVirtualSpecifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__VIRTUAL_SPECIFIER, newVirtualSpecifier, newVirtualSpecifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__VIRTUAL_SPECIFIER:
				return basicSetVirtualSpecifier(null, msgs);
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
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__IS_FRIEND:
				return getIsFriend();
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__IS_IN_LINE:
				return getIsInLine();
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__IS_THIS_CONST:
				return getIsThisConst();
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__VIRTUAL_SPECIFIER:
				return getVirtualSpecifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__IS_FRIEND:
				setIsFriend((Boolean)newValue);
				return;
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__IS_IN_LINE:
				setIsInLine((Boolean)newValue);
				return;
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__IS_THIS_CONST:
				setIsThisConst((Boolean)newValue);
				return;
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__VIRTUAL_SPECIFIER:
				setVirtualSpecifier((VirtualSpecification)newValue);
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
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__IS_FRIEND:
				setIsFriend(IS_FRIEND_EDEFAULT);
				return;
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__IS_IN_LINE:
				setIsInLine(IS_IN_LINE_EDEFAULT);
				return;
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__IS_THIS_CONST:
				setIsThisConst(IS_THIS_CONST_EDEFAULT);
				return;
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__VIRTUAL_SPECIFIER:
				setVirtualSpecifier((VirtualSpecification)null);
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
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__IS_FRIEND:
				return IS_FRIEND_EDEFAULT == null ? isFriend != null : !IS_FRIEND_EDEFAULT.equals(isFriend);
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__IS_IN_LINE:
				return IS_IN_LINE_EDEFAULT == null ? isInLine != null : !IS_IN_LINE_EDEFAULT.equals(isInLine);
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__IS_THIS_CONST:
				return IS_THIS_CONST_EDEFAULT == null ? isThisConst != null : !IS_THIS_CONST_EDEFAULT.equals(isThisConst);
			case GASTMPackage.FUNCTION_MEMBER_ATTRIBUTES__VIRTUAL_SPECIFIER:
				return virtualSpecifier != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isFriend: "); //$NON-NLS-1$
		result.append(isFriend);
		result.append(", isInLine: "); //$NON-NLS-1$
		result.append(isInLine);
		result.append(", isThisConst: "); //$NON-NLS-1$
		result.append(isThisConst);
		result.append(')');
		return result.toString();
	}

} //FunctionMemberAttributesImpl
