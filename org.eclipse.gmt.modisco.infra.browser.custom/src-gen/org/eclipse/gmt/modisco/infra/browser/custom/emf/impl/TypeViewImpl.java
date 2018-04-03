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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmt.modisco.infra.browser.custom.AttributeView;
import org.eclipse.gmt.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.gmt.modisco.infra.browser.custom.ReferenceView;
import org.eclipse.gmt.modisco.infra.browser.custom.TypeView;
import org.eclipse.gmt.modisco.infra.browser.custom.emf.UicustomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmt.modisco.infra.browser.custom.emf.impl.TypeViewImpl#getMetaclassName <em>Metaclass Name</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.browser.custom.emf.impl.TypeViewImpl#isAppliesToSubInstances <em>Applies To Sub Instances</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.browser.custom.emf.impl.TypeViewImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.browser.custom.emf.impl.TypeViewImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.eclipse.gmt.modisco.infra.browser.custom.emf.impl.TypeViewImpl#getMetamodelView <em>Metamodel View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class TypeViewImpl extends CustomViewImpl implements TypeView {
	/**
	 * The default value of the '{@link #getMetaclassName() <em>Metaclass Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclassName()
	 * @generated
	 * @ordered
	 */
	protected static final String METACLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaclassName() <em>Metaclass Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclassName()
	 * @generated
	 * @ordered
	 */
	protected String metaclassName = METACLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isAppliesToSubInstances() <em>Applies To Sub Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAppliesToSubInstances()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLIES_TO_SUB_INSTANCES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAppliesToSubInstances() <em>Applies To Sub Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAppliesToSubInstances()
	 * @generated
	 * @ordered
	 */
	protected boolean appliesToSubInstances = APPLIES_TO_SUB_INSTANCES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeView> attributes;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceView> references;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UicustomPackage.eINSTANCE.getTypeView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaclassName() {
		return metaclassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaclassName(String newMetaclassName) {
		String oldMetaclassName = metaclassName;
		metaclassName = newMetaclassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UicustomPackage.TYPE_VIEW__METACLASS_NAME, oldMetaclassName, metaclassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppliesToSubInstances() {
		return appliesToSubInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliesToSubInstances(boolean newAppliesToSubInstances) {
		boolean oldAppliesToSubInstances = appliesToSubInstances;
		appliesToSubInstances = newAppliesToSubInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UicustomPackage.TYPE_VIEW__APPLIES_TO_SUB_INSTANCES, oldAppliesToSubInstances, appliesToSubInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeView> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentWithInverseEList<AttributeView>(AttributeView.class, this, UicustomPackage.TYPE_VIEW__ATTRIBUTES, UicustomPackage.ATTRIBUTE_VIEW__TYPE);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceView> getReferences() {
		if (references == null) {
			references = new EObjectContainmentWithInverseEList<ReferenceView>(ReferenceView.class, this, UicustomPackage.TYPE_VIEW__REFERENCES, UicustomPackage.REFERENCE_VIEW__TYPE);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelView getMetamodelView() {
		if (eContainerFeatureID() != UicustomPackage.TYPE_VIEW__METAMODEL_VIEW) return null;
		return (MetamodelView)eContainer();
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
			case UicustomPackage.TYPE_VIEW__ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
			case UicustomPackage.TYPE_VIEW__REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferences()).basicAdd(otherEnd, msgs);
			case UicustomPackage.TYPE_VIEW__METAMODEL_VIEW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, UicustomPackage.TYPE_VIEW__METAMODEL_VIEW, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UicustomPackage.TYPE_VIEW__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case UicustomPackage.TYPE_VIEW__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case UicustomPackage.TYPE_VIEW__METAMODEL_VIEW:
				return eBasicSetContainer(null, UicustomPackage.TYPE_VIEW__METAMODEL_VIEW, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UicustomPackage.TYPE_VIEW__METAMODEL_VIEW:
				return eInternalContainer().eInverseRemove(this, UicustomPackage.METAMODEL_VIEW__TYPES, MetamodelView.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UicustomPackage.TYPE_VIEW__METACLASS_NAME:
				return getMetaclassName();
			case UicustomPackage.TYPE_VIEW__APPLIES_TO_SUB_INSTANCES:
				return isAppliesToSubInstances();
			case UicustomPackage.TYPE_VIEW__ATTRIBUTES:
				return getAttributes();
			case UicustomPackage.TYPE_VIEW__REFERENCES:
				return getReferences();
			case UicustomPackage.TYPE_VIEW__METAMODEL_VIEW:
				return getMetamodelView();
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
			case UicustomPackage.TYPE_VIEW__METACLASS_NAME:
				setMetaclassName((String)newValue);
				return;
			case UicustomPackage.TYPE_VIEW__APPLIES_TO_SUB_INSTANCES:
				setAppliesToSubInstances((Boolean)newValue);
				return;
			case UicustomPackage.TYPE_VIEW__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeView>)newValue);
				return;
			case UicustomPackage.TYPE_VIEW__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends ReferenceView>)newValue);
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
			case UicustomPackage.TYPE_VIEW__METACLASS_NAME:
				setMetaclassName(METACLASS_NAME_EDEFAULT);
				return;
			case UicustomPackage.TYPE_VIEW__APPLIES_TO_SUB_INSTANCES:
				setAppliesToSubInstances(APPLIES_TO_SUB_INSTANCES_EDEFAULT);
				return;
			case UicustomPackage.TYPE_VIEW__ATTRIBUTES:
				getAttributes().clear();
				return;
			case UicustomPackage.TYPE_VIEW__REFERENCES:
				getReferences().clear();
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
			case UicustomPackage.TYPE_VIEW__METACLASS_NAME:
				return METACLASS_NAME_EDEFAULT == null ? metaclassName != null : !METACLASS_NAME_EDEFAULT.equals(metaclassName);
			case UicustomPackage.TYPE_VIEW__APPLIES_TO_SUB_INSTANCES:
				return appliesToSubInstances != APPLIES_TO_SUB_INSTANCES_EDEFAULT;
			case UicustomPackage.TYPE_VIEW__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case UicustomPackage.TYPE_VIEW__REFERENCES:
				return references != null && !references.isEmpty();
			case UicustomPackage.TYPE_VIEW__METAMODEL_VIEW:
				return getMetamodelView() != null;
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
		result.append(" (metaclassName: ");
		result.append(metaclassName);
		result.append(", appliesToSubInstances: ");
		result.append(appliesToSubInstances);
		result.append(')');
		return result.toString();
	}

} //TypeViewImpl
