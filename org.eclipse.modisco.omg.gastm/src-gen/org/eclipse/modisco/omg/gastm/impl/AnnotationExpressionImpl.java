/**
 * <copyright>
 * Copyright (c) 2009, 2010 Open Canarias, S.L.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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

import org.eclipse.modisco.omg.gastm.AnnotationExpression;
import org.eclipse.modisco.omg.gastm.Expression;
import org.eclipse.modisco.omg.gastm.GASTMPackage;
import org.eclipse.modisco.omg.gastm.TypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.AnnotationExpressionImpl#getAnnotationType <em>Annotation Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.gastm.impl.AnnotationExpressionImpl#getMemberValues <em>Member Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationExpressionImpl extends ExpressionImpl implements AnnotationExpression {
	/**
	 * The cached value of the '{@link #getAnnotationType() <em>Annotation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationType()
	 * @generated
	 * @ordered
	 */
	protected TypeReference annotationType;

	/**
	 * The cached value of the '{@link #getMemberValues() <em>Member Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> memberValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GASTMPackage.eINSTANCE.getAnnotationExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getAnnotationType() {
		return annotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotationType(TypeReference newAnnotationType, NotificationChain msgs) {
		TypeReference oldAnnotationType = annotationType;
		annotationType = newAnnotationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GASTMPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE, oldAnnotationType, newAnnotationType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationType(TypeReference newAnnotationType) {
		if (newAnnotationType != annotationType) {
			NotificationChain msgs = null;
			if (annotationType != null)
				msgs = ((InternalEObject)annotationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE, null, msgs);
			if (newAnnotationType != null)
				msgs = ((InternalEObject)newAnnotationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GASTMPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE, null, msgs);
			msgs = basicSetAnnotationType(newAnnotationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GASTMPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE, newAnnotationType, newAnnotationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getMemberValues() {
		if (memberValues == null) {
			memberValues = new EObjectContainmentEList<Expression>(Expression.class, this, GASTMPackage.ANNOTATION_EXPRESSION__MEMBER_VALUES);
		}
		return memberValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GASTMPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE:
				return basicSetAnnotationType(null, msgs);
			case GASTMPackage.ANNOTATION_EXPRESSION__MEMBER_VALUES:
				return ((InternalEList<?>)getMemberValues()).basicRemove(otherEnd, msgs);
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
			case GASTMPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE:
				return getAnnotationType();
			case GASTMPackage.ANNOTATION_EXPRESSION__MEMBER_VALUES:
				return getMemberValues();
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
			case GASTMPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE:
				setAnnotationType((TypeReference)newValue);
				return;
			case GASTMPackage.ANNOTATION_EXPRESSION__MEMBER_VALUES:
				getMemberValues().clear();
				getMemberValues().addAll((Collection<? extends Expression>)newValue);
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
			case GASTMPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE:
				setAnnotationType((TypeReference)null);
				return;
			case GASTMPackage.ANNOTATION_EXPRESSION__MEMBER_VALUES:
				getMemberValues().clear();
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
			case GASTMPackage.ANNOTATION_EXPRESSION__ANNOTATION_TYPE:
				return annotationType != null;
			case GASTMPackage.ANNOTATION_EXPRESSION__MEMBER_VALUES:
				return memberValues != null && !memberValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnnotationExpressionImpl
