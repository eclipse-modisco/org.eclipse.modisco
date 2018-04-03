/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 * 
 *
 * $Id$
 */
package org.eclipse.gmt.modisco.infra.browser.custom.emf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.gmt.modisco.infra.browser.custom.TypeView;
import org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.infra.browser.custom.emf.impl.MetamodelViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.browser.custom.emf.impl.MetamodelViewImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.browser.custom.emf.impl.MetamodelViewImpl#getMetamodelURI <em>Metamodel URI</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.browser.custom.emf.impl.MetamodelViewImpl#isAllQuerySetsAvailable <em>All Query Sets Available</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.browser.custom.emf.impl.MetamodelViewImpl#getAvailableQuerySets <em>Available Query Sets</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.browser.custom.emf.impl.MetamodelViewImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class MetamodelViewImpl extends EObjectImpl implements MetamodelView {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeView> types;

	/**
	 * The default value of the '{@link #getMetamodelURI() <em>Metamodel URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelURI()
	 * @generated
	 * @ordered
	 */
	protected static final String METAMODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetamodelURI() <em>Metamodel URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelURI()
	 * @generated
	 * @ordered
	 */
	protected String metamodelURI = METAMODEL_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllQuerySetsAvailable() <em>All Query Sets Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllQuerySetsAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_QUERY_SETS_AVAILABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAllQuerySetsAvailable() <em>All Query Sets Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllQuerySetsAvailable()
	 * @generated
	 * @ordered
	 */
	protected boolean allQuerySetsAvailable = ALL_QUERY_SETS_AVAILABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAvailableQuerySets() <em>Available Query Sets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableQuerySets()
	 * @generated
	 * @ordered
	 */
	protected EList<String> availableQuerySets;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UicustomPackage.eINSTANCE.getMetamodelView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * @return the name of the customization, derived from the resource uri.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		Resource eResource = eResource();
		if(eResource == null) {
			return null;
		}
		String lastSegment = eResource.getURI().lastSegment();
		String name;
		if (lastSegment.endsWith(".uiCustom"))
			name = lastSegment.substring(0, lastSegment.length() - 9);
		else
			name = lastSegment;
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetamodelURI() {
		return metamodelURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodelURI(String newMetamodelURI) {
		String oldMetamodelURI = metamodelURI;
		metamodelURI = newMetamodelURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UicustomPackage.METAMODEL_VIEW__METAMODEL_URI, oldMetamodelURI, metamodelURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllQuerySetsAvailable() {
		return allQuerySetsAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllQuerySetsAvailable(boolean newAllQuerySetsAvailable) {
		boolean oldAllQuerySetsAvailable = allQuerySetsAvailable;
		allQuerySetsAvailable = newAllQuerySetsAvailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UicustomPackage.METAMODEL_VIEW__ALL_QUERY_SETS_AVAILABLE, oldAllQuerySetsAvailable, allQuerySetsAvailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAvailableQuerySets() {
		if (availableQuerySets == null) {
			availableQuerySets = new EDataTypeUniqueEList<String>(String.class, this, UicustomPackage.METAMODEL_VIEW__AVAILABLE_QUERY_SETS);
		}
		return availableQuerySets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UicustomPackage.METAMODEL_VIEW__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UicustomPackage.METAMODEL_VIEW__TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeView> getTypes() {
		if (types == null) {
			types = new EObjectContainmentWithInverseEList<TypeView>(TypeView.class, this, UicustomPackage.METAMODEL_VIEW__TYPES, UicustomPackage.TYPE_VIEW__METAMODEL_VIEW);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UicustomPackage.METAMODEL_VIEW__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case UicustomPackage.METAMODEL_VIEW__NAME:
				return getName();
			case UicustomPackage.METAMODEL_VIEW__TYPES:
				return getTypes();
			case UicustomPackage.METAMODEL_VIEW__METAMODEL_URI:
				return getMetamodelURI();
			case UicustomPackage.METAMODEL_VIEW__ALL_QUERY_SETS_AVAILABLE:
				return isAllQuerySetsAvailable();
			case UicustomPackage.METAMODEL_VIEW__AVAILABLE_QUERY_SETS:
				return getAvailableQuerySets();
			case UicustomPackage.METAMODEL_VIEW__LOCATION:
				return getLocation();
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
			case UicustomPackage.METAMODEL_VIEW__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends TypeView>)newValue);
				return;
			case UicustomPackage.METAMODEL_VIEW__METAMODEL_URI:
				setMetamodelURI((String)newValue);
				return;
			case UicustomPackage.METAMODEL_VIEW__ALL_QUERY_SETS_AVAILABLE:
				setAllQuerySetsAvailable((Boolean)newValue);
				return;
			case UicustomPackage.METAMODEL_VIEW__AVAILABLE_QUERY_SETS:
				getAvailableQuerySets().clear();
				getAvailableQuerySets().addAll((Collection<? extends String>)newValue);
				return;
			case UicustomPackage.METAMODEL_VIEW__LOCATION:
				setLocation((String)newValue);
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
			case UicustomPackage.METAMODEL_VIEW__TYPES:
				getTypes().clear();
				return;
			case UicustomPackage.METAMODEL_VIEW__METAMODEL_URI:
				setMetamodelURI(METAMODEL_URI_EDEFAULT);
				return;
			case UicustomPackage.METAMODEL_VIEW__ALL_QUERY_SETS_AVAILABLE:
				setAllQuerySetsAvailable(ALL_QUERY_SETS_AVAILABLE_EDEFAULT);
				return;
			case UicustomPackage.METAMODEL_VIEW__AVAILABLE_QUERY_SETS:
				getAvailableQuerySets().clear();
				return;
			case UicustomPackage.METAMODEL_VIEW__LOCATION:
				setLocation(LOCATION_EDEFAULT);
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
			case UicustomPackage.METAMODEL_VIEW__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case UicustomPackage.METAMODEL_VIEW__TYPES:
				return types != null && !types.isEmpty();
			case UicustomPackage.METAMODEL_VIEW__METAMODEL_URI:
				return METAMODEL_URI_EDEFAULT == null ? metamodelURI != null : !METAMODEL_URI_EDEFAULT.equals(metamodelURI);
			case UicustomPackage.METAMODEL_VIEW__ALL_QUERY_SETS_AVAILABLE:
				return allQuerySetsAvailable != ALL_QUERY_SETS_AVAILABLE_EDEFAULT;
			case UicustomPackage.METAMODEL_VIEW__AVAILABLE_QUERY_SETS:
				return availableQuerySets != null && !availableQuerySets.isEmpty();
			case UicustomPackage.METAMODEL_VIEW__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
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
		result.append(" (metamodelURI: ");
		result.append(metamodelURI);
		result.append(", allQuerySetsAvailable: ");
		result.append(allQuerySetsAvailable);
		result.append(", availableQuerySets: ");
		result.append(availableQuerySets);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //MetamodelViewImpl
