/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Frederic Madiot (Mia-Software) - meta-model design
 *     Gregoire DUPE (Mia-Software) - design and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.modisco.infra.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.modisco.infra.query.JavaModelQuery;
import org.eclipse.modisco.infra.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Model Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.query.impl.JavaModelQueryImpl#getImplementationClassName <em>Implementation Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class JavaModelQueryImpl extends ModelQueryImpl implements JavaModelQuery {
	/**
	 * The default value of the '{@link #getImplementationClassName() <em>Implementation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationClassName() <em>Implementation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationClassName()
	 * @generated
	 * @ordered
	 */
	protected String implementationClassName = IMPLEMENTATION_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaModelQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.JAVA_MODEL_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementationClassName() {
		return implementationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationClassName(String newImplementationClassName) {
		String oldImplementationClassName = implementationClassName;
		implementationClassName = newImplementationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.JAVA_MODEL_QUERY__IMPLEMENTATION_CLASS_NAME, oldImplementationClassName, implementationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.JAVA_MODEL_QUERY__IMPLEMENTATION_CLASS_NAME:
				return getImplementationClassName();
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
			case QueryPackage.JAVA_MODEL_QUERY__IMPLEMENTATION_CLASS_NAME:
				setImplementationClassName((String)newValue);
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
			case QueryPackage.JAVA_MODEL_QUERY__IMPLEMENTATION_CLASS_NAME:
				setImplementationClassName(IMPLEMENTATION_CLASS_NAME_EDEFAULT);
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
			case QueryPackage.JAVA_MODEL_QUERY__IMPLEMENTATION_CLASS_NAME:
				return IMPLEMENTATION_CLASS_NAME_EDEFAULT == null ? implementationClassName != null : !IMPLEMENTATION_CLASS_NAME_EDEFAULT.equals(implementationClassName);
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
		result.append(" (implementationClassName: ");
		result.append(implementationClassName);
		result.append(')');
		return result.toString();
	}

} //JavaModelQueryImpl
