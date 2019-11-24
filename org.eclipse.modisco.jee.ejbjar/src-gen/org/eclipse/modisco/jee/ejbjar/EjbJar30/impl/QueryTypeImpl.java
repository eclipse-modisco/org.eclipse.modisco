/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v2.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 *    
 *    Contributors:
 *    
 *    	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.ejbjar.EjbJar30.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.ejbjar.EjbJar30.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.EjbJar30Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryMethodType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.QueryType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.ResultTypeMappingType;
import org.eclipse.modisco.jee.ejbjar.EjbJar30.XsdStringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.QueryTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.QueryTypeImpl#getQueryMethod <em>Query Method</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.QueryTypeImpl#getResultTypeMapping <em>Result Type Mapping</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.QueryTypeImpl#getEjbQl <em>Ejb Ql</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar30.impl.QueryTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryTypeImpl extends EObjectImpl implements QueryType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DescriptionType description;

	/**
	 * The cached value of the '{@link #getQueryMethod() <em>Query Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryMethod()
	 * @generated
	 * @ordered
	 */
	protected QueryMethodType queryMethod;

	/**
	 * The cached value of the '{@link #getResultTypeMapping() <em>Result Type Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultTypeMapping()
	 * @generated
	 * @ordered
	 */
	protected ResultTypeMappingType resultTypeMapping;

	/**
	 * The cached value of the '{@link #getEjbQl() <em>Ejb Ql</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbQl()
	 * @generated
	 * @ordered
	 */
	protected XsdStringType ejbQl;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar30Package.eINSTANCE.getQueryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		DescriptionType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.QUERY_TYPE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.QUERY_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.QUERY_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.QUERY_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryMethodType getQueryMethod() {
		return queryMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryMethod(QueryMethodType newQueryMethod, NotificationChain msgs) {
		QueryMethodType oldQueryMethod = queryMethod;
		queryMethod = newQueryMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.QUERY_TYPE__QUERY_METHOD, oldQueryMethod, newQueryMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryMethod(QueryMethodType newQueryMethod) {
		if (newQueryMethod != queryMethod) {
			NotificationChain msgs = null;
			if (queryMethod != null)
				msgs = ((InternalEObject)queryMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.QUERY_TYPE__QUERY_METHOD, null, msgs);
			if (newQueryMethod != null)
				msgs = ((InternalEObject)newQueryMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.QUERY_TYPE__QUERY_METHOD, null, msgs);
			msgs = basicSetQueryMethod(newQueryMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.QUERY_TYPE__QUERY_METHOD, newQueryMethod, newQueryMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultTypeMappingType getResultTypeMapping() {
		return resultTypeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultTypeMapping(ResultTypeMappingType newResultTypeMapping, NotificationChain msgs) {
		ResultTypeMappingType oldResultTypeMapping = resultTypeMapping;
		resultTypeMapping = newResultTypeMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.QUERY_TYPE__RESULT_TYPE_MAPPING, oldResultTypeMapping, newResultTypeMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultTypeMapping(ResultTypeMappingType newResultTypeMapping) {
		if (newResultTypeMapping != resultTypeMapping) {
			NotificationChain msgs = null;
			if (resultTypeMapping != null)
				msgs = ((InternalEObject)resultTypeMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.QUERY_TYPE__RESULT_TYPE_MAPPING, null, msgs);
			if (newResultTypeMapping != null)
				msgs = ((InternalEObject)newResultTypeMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.QUERY_TYPE__RESULT_TYPE_MAPPING, null, msgs);
			msgs = basicSetResultTypeMapping(newResultTypeMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.QUERY_TYPE__RESULT_TYPE_MAPPING, newResultTypeMapping, newResultTypeMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XsdStringType getEjbQl() {
		return ejbQl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbQl(XsdStringType newEjbQl, NotificationChain msgs) {
		XsdStringType oldEjbQl = ejbQl;
		ejbQl = newEjbQl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar30Package.QUERY_TYPE__EJB_QL, oldEjbQl, newEjbQl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbQl(XsdStringType newEjbQl) {
		if (newEjbQl != ejbQl) {
			NotificationChain msgs = null;
			if (ejbQl != null)
				msgs = ((InternalEObject)ejbQl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.QUERY_TYPE__EJB_QL, null, msgs);
			if (newEjbQl != null)
				msgs = ((InternalEObject)newEjbQl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar30Package.QUERY_TYPE__EJB_QL, null, msgs);
			msgs = basicSetEjbQl(newEjbQl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.QUERY_TYPE__EJB_QL, newEjbQl, newEjbQl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar30Package.QUERY_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar30Package.QUERY_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EjbJar30Package.QUERY_TYPE__QUERY_METHOD:
				return basicSetQueryMethod(null, msgs);
			case EjbJar30Package.QUERY_TYPE__RESULT_TYPE_MAPPING:
				return basicSetResultTypeMapping(null, msgs);
			case EjbJar30Package.QUERY_TYPE__EJB_QL:
				return basicSetEjbQl(null, msgs);
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
			case EjbJar30Package.QUERY_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar30Package.QUERY_TYPE__QUERY_METHOD:
				return getQueryMethod();
			case EjbJar30Package.QUERY_TYPE__RESULT_TYPE_MAPPING:
				return getResultTypeMapping();
			case EjbJar30Package.QUERY_TYPE__EJB_QL:
				return getEjbQl();
			case EjbJar30Package.QUERY_TYPE__ID:
				return getId();
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
			case EjbJar30Package.QUERY_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case EjbJar30Package.QUERY_TYPE__QUERY_METHOD:
				setQueryMethod((QueryMethodType)newValue);
				return;
			case EjbJar30Package.QUERY_TYPE__RESULT_TYPE_MAPPING:
				setResultTypeMapping((ResultTypeMappingType)newValue);
				return;
			case EjbJar30Package.QUERY_TYPE__EJB_QL:
				setEjbQl((XsdStringType)newValue);
				return;
			case EjbJar30Package.QUERY_TYPE__ID:
				setId((String)newValue);
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
			case EjbJar30Package.QUERY_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case EjbJar30Package.QUERY_TYPE__QUERY_METHOD:
				setQueryMethod((QueryMethodType)null);
				return;
			case EjbJar30Package.QUERY_TYPE__RESULT_TYPE_MAPPING:
				setResultTypeMapping((ResultTypeMappingType)null);
				return;
			case EjbJar30Package.QUERY_TYPE__EJB_QL:
				setEjbQl((XsdStringType)null);
				return;
			case EjbJar30Package.QUERY_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case EjbJar30Package.QUERY_TYPE__DESCRIPTION:
				return description != null;
			case EjbJar30Package.QUERY_TYPE__QUERY_METHOD:
				return queryMethod != null;
			case EjbJar30Package.QUERY_TYPE__RESULT_TYPE_MAPPING:
				return resultTypeMapping != null;
			case EjbJar30Package.QUERY_TYPE__EJB_QL:
				return ejbQl != null;
			case EjbJar30Package.QUERY_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //QueryTypeImpl
