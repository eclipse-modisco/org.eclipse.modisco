/**
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Fabien Giquel (Mia-Software) - design and implementation
 * 
 */
package org.eclipse.modisco.infra.discovery.catalog.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.infra.discovery.catalog.CatalogPackage;
import org.eclipse.modisco.infra.discovery.catalog.DirectionKind;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.osgi.framework.Bundle;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Discoverer Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererDescriptionImpl#getParameterDefinitions <em>Parameter Definitions</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererDescriptionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererDescriptionImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererDescriptionImpl#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link org.eclipse.modisco.infra.discovery.catalog.impl.DiscovererDescriptionImpl#getImplementationBundle <em>Implementation Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscovererDescriptionImpl extends EObjectImpl implements
		DiscovererDescription {
	/**
	 * The cached value of the '{@link #getParameterDefinitions()
	 * <em>Parameter Definitions</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParameterDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<DiscovererParameter> parameterDefinitions;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected Class<?> sourceType;

	/**
	 * The cached value of the '{@link #getImplementationType() <em>Implementation Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getImplementationType()
	 * @generated
	 * @ordered
	 */
	protected Class<?> implementationType;

	/**
	 * The default value of the '{@link #getImplementationBundle() <em>Implementation Bundle</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getImplementationBundle()
	 * @generated
	 * @ordered
	 */
	protected static final Bundle IMPLEMENTATION_BUNDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationBundle() <em>Implementation Bundle</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getImplementationBundle()
	 * @generated
	 * @ordered
	 */
	protected Bundle implementationBundle = IMPLEMENTATION_BUNDLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscovererDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.DISCOVERER_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiscovererParameter> getParameterDefinitions() {
		if (parameterDefinitions == null) {
			parameterDefinitions = new EObjectContainmentWithInverseEList<DiscovererParameter>(DiscovererParameter.class, this, CatalogPackage.DISCOVERER_DESCRIPTION__PARAMETER_DEFINITIONS, CatalogPackage.DISCOVERER_PARAMETER__DISCOVERER);
		}
		return parameterDefinitions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DISCOVERER_DESCRIPTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getSourceType() {
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(Class<?> newSourceType) {
		Class<?> oldSourceType = sourceType;
		sourceType = newSourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DISCOVERER_DESCRIPTION__SOURCE_TYPE, oldSourceType, sourceType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getImplementationType() {
		return implementationType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationType(Class<?> newImplementationType) {
		Class<?> oldImplementationType = implementationType;
		implementationType = newImplementationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DISCOVERER_DESCRIPTION__IMPLEMENTATION_TYPE, oldImplementationType, implementationType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle getImplementationBundle() {
		return implementationBundle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationBundle(Bundle newImplementationBundle) {
		Bundle oldImplementationBundle = implementationBundle;
		implementationBundle = newImplementationBundle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DISCOVERER_DESCRIPTION__IMPLEMENTATION_BUNDLE, oldImplementationBundle, implementationBundle));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public DiscovererParameter getParameterDefinition(final String parameterName) {
		DiscovererParameter discovererParameter = null;
		for (DiscovererParameter aParameter : getParameterDefinitions()) {
			if (aParameter.getId().equals(parameterName)) {
				discovererParameter = aParameter;
			}
		}
		return discovererParameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CatalogPackage.DISCOVERER_DESCRIPTION__PARAMETER_DEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterDefinitions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CatalogPackage.DISCOVERER_DESCRIPTION__PARAMETER_DEFINITIONS:
				return ((InternalEList<?>)getParameterDefinitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CatalogPackage.DISCOVERER_DESCRIPTION__PARAMETER_DEFINITIONS:
				return getParameterDefinitions();
			case CatalogPackage.DISCOVERER_DESCRIPTION__ID:
				return getId();
			case CatalogPackage.DISCOVERER_DESCRIPTION__SOURCE_TYPE:
				return getSourceType();
			case CatalogPackage.DISCOVERER_DESCRIPTION__IMPLEMENTATION_TYPE:
				return getImplementationType();
			case CatalogPackage.DISCOVERER_DESCRIPTION__IMPLEMENTATION_BUNDLE:
				return getImplementationBundle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CatalogPackage.DISCOVERER_DESCRIPTION__PARAMETER_DEFINITIONS:
				getParameterDefinitions().clear();
				getParameterDefinitions().addAll((Collection<? extends DiscovererParameter>)newValue);
				return;
			case CatalogPackage.DISCOVERER_DESCRIPTION__ID:
				setId((String)newValue);
				return;
			case CatalogPackage.DISCOVERER_DESCRIPTION__SOURCE_TYPE:
				setSourceType((Class<?>)newValue);
				return;
			case CatalogPackage.DISCOVERER_DESCRIPTION__IMPLEMENTATION_TYPE:
				setImplementationType((Class<?>)newValue);
				return;
			case CatalogPackage.DISCOVERER_DESCRIPTION__IMPLEMENTATION_BUNDLE:
				setImplementationBundle((Bundle)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CatalogPackage.DISCOVERER_DESCRIPTION__PARAMETER_DEFINITIONS:
				getParameterDefinitions().clear();
				return;
			case CatalogPackage.DISCOVERER_DESCRIPTION__ID:
				setId(ID_EDEFAULT);
				return;
			case CatalogPackage.DISCOVERER_DESCRIPTION__SOURCE_TYPE:
				setSourceType((Class<?>)null);
				return;
			case CatalogPackage.DISCOVERER_DESCRIPTION__IMPLEMENTATION_TYPE:
				setImplementationType((Class<?>)null);
				return;
			case CatalogPackage.DISCOVERER_DESCRIPTION__IMPLEMENTATION_BUNDLE:
				setImplementationBundle(IMPLEMENTATION_BUNDLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CatalogPackage.DISCOVERER_DESCRIPTION__PARAMETER_DEFINITIONS:
				return parameterDefinitions != null && !parameterDefinitions.isEmpty();
			case CatalogPackage.DISCOVERER_DESCRIPTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CatalogPackage.DISCOVERER_DESCRIPTION__SOURCE_TYPE:
				return sourceType != null;
			case CatalogPackage.DISCOVERER_DESCRIPTION__IMPLEMENTATION_TYPE:
				return implementationType != null;
			case CatalogPackage.DISCOVERER_DESCRIPTION__IMPLEMENTATION_BUNDLE:
				return IMPLEMENTATION_BUNDLE_EDEFAULT == null ? implementationBundle != null : !IMPLEMENTATION_BUNDLE_EDEFAULT.equals(implementationBundle);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", sourceType: ");
		result.append(sourceType);
		result.append(", implementationType: ");
		result.append(implementationType);
		result.append(", implementationBundle: ");
		result.append(implementationBundle);
		result.append(')');
		return result.toString();
	}

	/**
	 * @return the parameters that the user can provide (in or inout
	 *         parameters).
	 * 
	 * @generated NOT
	 */
	public List<DiscovererParameter> getExpectedInputParameters() {
		List<DiscovererParameter> inParameters = new ArrayList<DiscovererParameter>();
		Collection<DiscovererParameter> params = getParameterDefinitions();
		for (DiscovererParameter param : params) {
			if (param.getDirection() == DirectionKind.IN
					|| param.getDirection() == DirectionKind.INOUT) {
				inParameters.add(param);
			}
		}
		return inParameters;
	}

} // DiscovererDescriptionImpl
