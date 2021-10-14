/**
 * *******************************************************************************
 * Copyright (c) 2008, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.data.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.omg.kdm.action.ActionElement;
import org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl;
import org.eclipse.modisco.omg.kdm.data.AbstractDataRelationship;
import org.eclipse.modisco.omg.kdm.data.DataAction;
import org.eclipse.modisco.omg.kdm.data.DataEvent;
import org.eclipse.modisco.omg.kdm.data.DataPackage;
import org.eclipse.modisco.omg.kdm.source.SourceRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.data.impl.DataActionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.data.impl.DataActionImpl#getDataRelation <em>Data Relation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.data.impl.DataActionImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.data.impl.DataActionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.data.impl.DataActionImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.data.impl.DataActionImpl#getDataElement <em>Data Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataActionImpl extends KDMEntityImpl implements DataAction {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceRef> source;

	/**
	 * The cached value of the '{@link #getDataRelation() <em>Data Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDataRelationship> dataRelation;

	/**
	 * The cached value of the '{@link #getAbstraction() <em>Abstraction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstraction()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionElement> abstraction;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionElement> implementation;

	/**
	 * The cached value of the '{@link #getDataElement() <em>Data Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DataEvent> dataElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, DataPackage.DATA_ACTION__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractDataRelationship> getDataRelation() {
		if (dataRelation == null) {
			dataRelation = new EObjectContainmentEList<AbstractDataRelationship>(AbstractDataRelationship.class, this, DataPackage.DATA_ACTION__DATA_RELATION);
		}
		return dataRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionElement> getAbstraction() {
		if (abstraction == null) {
			abstraction = new EObjectContainmentEList<ActionElement>(ActionElement.class, this, DataPackage.DATA_ACTION__ABSTRACTION);
		}
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_ACTION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionElement> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<ActionElement>(ActionElement.class, this, DataPackage.DATA_ACTION__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataEvent> getDataElement() {
		if (dataElement == null) {
			dataElement = new EObjectContainmentEList<DataEvent>(DataEvent.class, this, DataPackage.DATA_ACTION__DATA_ELEMENT);
		}
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.DATA_ACTION__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case DataPackage.DATA_ACTION__DATA_RELATION:
				return ((InternalEList<?>)getDataRelation()).basicRemove(otherEnd, msgs);
			case DataPackage.DATA_ACTION__ABSTRACTION:
				return ((InternalEList<?>)getAbstraction()).basicRemove(otherEnd, msgs);
			case DataPackage.DATA_ACTION__DATA_ELEMENT:
				return ((InternalEList<?>)getDataElement()).basicRemove(otherEnd, msgs);
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
			case DataPackage.DATA_ACTION__SOURCE:
				return getSource();
			case DataPackage.DATA_ACTION__DATA_RELATION:
				return getDataRelation();
			case DataPackage.DATA_ACTION__ABSTRACTION:
				return getAbstraction();
			case DataPackage.DATA_ACTION__KIND:
				return getKind();
			case DataPackage.DATA_ACTION__IMPLEMENTATION:
				return getImplementation();
			case DataPackage.DATA_ACTION__DATA_ELEMENT:
				return getDataElement();
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
			case DataPackage.DATA_ACTION__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case DataPackage.DATA_ACTION__DATA_RELATION:
				getDataRelation().clear();
				getDataRelation().addAll((Collection<? extends AbstractDataRelationship>)newValue);
				return;
			case DataPackage.DATA_ACTION__ABSTRACTION:
				getAbstraction().clear();
				getAbstraction().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case DataPackage.DATA_ACTION__KIND:
				setKind((String)newValue);
				return;
			case DataPackage.DATA_ACTION__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case DataPackage.DATA_ACTION__DATA_ELEMENT:
				getDataElement().clear();
				getDataElement().addAll((Collection<? extends DataEvent>)newValue);
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
			case DataPackage.DATA_ACTION__SOURCE:
				getSource().clear();
				return;
			case DataPackage.DATA_ACTION__DATA_RELATION:
				getDataRelation().clear();
				return;
			case DataPackage.DATA_ACTION__ABSTRACTION:
				getAbstraction().clear();
				return;
			case DataPackage.DATA_ACTION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case DataPackage.DATA_ACTION__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case DataPackage.DATA_ACTION__DATA_ELEMENT:
				getDataElement().clear();
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
			case DataPackage.DATA_ACTION__SOURCE:
				return source != null && !source.isEmpty();
			case DataPackage.DATA_ACTION__DATA_RELATION:
				return dataRelation != null && !dataRelation.isEmpty();
			case DataPackage.DATA_ACTION__ABSTRACTION:
				return abstraction != null && !abstraction.isEmpty();
			case DataPackage.DATA_ACTION__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case DataPackage.DATA_ACTION__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case DataPackage.DATA_ACTION__DATA_ELEMENT:
				return dataElement != null && !dataElement.isEmpty();
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
		result.append(" (kind: "); //$NON-NLS-1$
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //DataActionImpl
