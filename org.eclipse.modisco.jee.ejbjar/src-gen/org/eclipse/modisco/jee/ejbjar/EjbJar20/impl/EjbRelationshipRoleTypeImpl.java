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
package org.eclipse.modisco.jee.ejbjar.EjbJar20.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.modisco.jee.ejbjar.EjbJar20.CascadeDeleteType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.CmrFieldType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.DescriptionType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbJar20Package;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleNameType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.EjbRelationshipRoleType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.MultiplicityType;
import org.eclipse.modisco.jee.ejbjar.EjbJar20.RelationshipRoleSourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ejb Relationship Role Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationshipRoleTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationshipRoleTypeImpl#getEjbRelationshipRoleName <em>Ejb Relationship Role Name</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationshipRoleTypeImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationshipRoleTypeImpl#getCascadeDelete <em>Cascade Delete</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationshipRoleTypeImpl#getRelationshipRoleSource <em>Relationship Role Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationshipRoleTypeImpl#getCmrField <em>Cmr Field</em>}</li>
 *   <li>{@link org.eclipse.modisco.jee.ejbjar.EjbJar20.impl.EjbRelationshipRoleTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EjbRelationshipRoleTypeImpl extends EObjectImpl implements EjbRelationshipRoleType {
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
	 * The cached value of the '{@link #getEjbRelationshipRoleName() <em>Ejb Relationship Role Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjbRelationshipRoleName()
	 * @generated
	 * @ordered
	 */
	protected EjbRelationshipRoleNameType ejbRelationshipRoleName;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected MultiplicityType multiplicity;

	/**
	 * The cached value of the '{@link #getCascadeDelete() <em>Cascade Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascadeDelete()
	 * @generated
	 * @ordered
	 */
	protected CascadeDeleteType cascadeDelete;

	/**
	 * The cached value of the '{@link #getRelationshipRoleSource() <em>Relationship Role Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipRoleSource()
	 * @generated
	 * @ordered
	 */
	protected RelationshipRoleSourceType relationshipRoleSource;

	/**
	 * The cached value of the '{@link #getCmrField() <em>Cmr Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmrField()
	 * @generated
	 * @ordered
	 */
	protected CmrFieldType cmrField;

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
	protected EjbRelationshipRoleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjbJar20Package.Literals.EJB_RELATIONSHIP_ROLE_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjbRelationshipRoleNameType getEjbRelationshipRoleName() {
		return ejbRelationshipRoleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbRelationshipRoleName(EjbRelationshipRoleNameType newEjbRelationshipRoleName, NotificationChain msgs) {
		EjbRelationshipRoleNameType oldEjbRelationshipRoleName = ejbRelationshipRoleName;
		ejbRelationshipRoleName = newEjbRelationshipRoleName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__EJB_RELATIONSHIP_ROLE_NAME, oldEjbRelationshipRoleName, newEjbRelationshipRoleName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbRelationshipRoleName(EjbRelationshipRoleNameType newEjbRelationshipRoleName) {
		if (newEjbRelationshipRoleName != ejbRelationshipRoleName) {
			NotificationChain msgs = null;
			if (ejbRelationshipRoleName != null)
				msgs = ((InternalEObject)ejbRelationshipRoleName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__EJB_RELATIONSHIP_ROLE_NAME, null, msgs);
			if (newEjbRelationshipRoleName != null)
				msgs = ((InternalEObject)newEjbRelationshipRoleName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__EJB_RELATIONSHIP_ROLE_NAME, null, msgs);
			msgs = basicSetEjbRelationshipRoleName(newEjbRelationshipRoleName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__EJB_RELATIONSHIP_ROLE_NAME, newEjbRelationshipRoleName, newEjbRelationshipRoleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityType getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiplicity(MultiplicityType newMultiplicity, NotificationChain msgs) {
		MultiplicityType oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__MULTIPLICITY, oldMultiplicity, newMultiplicity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(MultiplicityType newMultiplicity) {
		if (newMultiplicity != multiplicity) {
			NotificationChain msgs = null;
			if (multiplicity != null)
				msgs = ((InternalEObject)multiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__MULTIPLICITY, null, msgs);
			if (newMultiplicity != null)
				msgs = ((InternalEObject)newMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__MULTIPLICITY, null, msgs);
			msgs = basicSetMultiplicity(newMultiplicity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__MULTIPLICITY, newMultiplicity, newMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CascadeDeleteType getCascadeDelete() {
		return cascadeDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCascadeDelete(CascadeDeleteType newCascadeDelete, NotificationChain msgs) {
		CascadeDeleteType oldCascadeDelete = cascadeDelete;
		cascadeDelete = newCascadeDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CASCADE_DELETE, oldCascadeDelete, newCascadeDelete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCascadeDelete(CascadeDeleteType newCascadeDelete) {
		if (newCascadeDelete != cascadeDelete) {
			NotificationChain msgs = null;
			if (cascadeDelete != null)
				msgs = ((InternalEObject)cascadeDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CASCADE_DELETE, null, msgs);
			if (newCascadeDelete != null)
				msgs = ((InternalEObject)newCascadeDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CASCADE_DELETE, null, msgs);
			msgs = basicSetCascadeDelete(newCascadeDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CASCADE_DELETE, newCascadeDelete, newCascadeDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipRoleSourceType getRelationshipRoleSource() {
		return relationshipRoleSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationshipRoleSource(RelationshipRoleSourceType newRelationshipRoleSource, NotificationChain msgs) {
		RelationshipRoleSourceType oldRelationshipRoleSource = relationshipRoleSource;
		relationshipRoleSource = newRelationshipRoleSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__RELATIONSHIP_ROLE_SOURCE, oldRelationshipRoleSource, newRelationshipRoleSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipRoleSource(RelationshipRoleSourceType newRelationshipRoleSource) {
		if (newRelationshipRoleSource != relationshipRoleSource) {
			NotificationChain msgs = null;
			if (relationshipRoleSource != null)
				msgs = ((InternalEObject)relationshipRoleSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__RELATIONSHIP_ROLE_SOURCE, null, msgs);
			if (newRelationshipRoleSource != null)
				msgs = ((InternalEObject)newRelationshipRoleSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__RELATIONSHIP_ROLE_SOURCE, null, msgs);
			msgs = basicSetRelationshipRoleSource(newRelationshipRoleSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__RELATIONSHIP_ROLE_SOURCE, newRelationshipRoleSource, newRelationshipRoleSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmrFieldType getCmrField() {
		return cmrField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmrField(CmrFieldType newCmrField, NotificationChain msgs) {
		CmrFieldType oldCmrField = cmrField;
		cmrField = newCmrField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CMR_FIELD, oldCmrField, newCmrField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmrField(CmrFieldType newCmrField) {
		if (newCmrField != cmrField) {
			NotificationChain msgs = null;
			if (cmrField != null)
				msgs = ((InternalEObject)cmrField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CMR_FIELD, null, msgs);
			if (newCmrField != null)
				msgs = ((InternalEObject)newCmrField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CMR_FIELD, null, msgs);
			msgs = basicSetCmrField(newCmrField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CMR_FIELD, newCmrField, newCmrField));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__EJB_RELATIONSHIP_ROLE_NAME:
				return basicSetEjbRelationshipRoleName(null, msgs);
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__MULTIPLICITY:
				return basicSetMultiplicity(null, msgs);
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CASCADE_DELETE:
				return basicSetCascadeDelete(null, msgs);
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__RELATIONSHIP_ROLE_SOURCE:
				return basicSetRelationshipRoleSource(null, msgs);
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CMR_FIELD:
				return basicSetCmrField(null, msgs);
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
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__DESCRIPTION:
				return getDescription();
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__EJB_RELATIONSHIP_ROLE_NAME:
				return getEjbRelationshipRoleName();
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__MULTIPLICITY:
				return getMultiplicity();
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CASCADE_DELETE:
				return getCascadeDelete();
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__RELATIONSHIP_ROLE_SOURCE:
				return getRelationshipRoleSource();
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CMR_FIELD:
				return getCmrField();
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__ID:
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
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__EJB_RELATIONSHIP_ROLE_NAME:
				setEjbRelationshipRoleName((EjbRelationshipRoleNameType)newValue);
				return;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__MULTIPLICITY:
				setMultiplicity((MultiplicityType)newValue);
				return;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CASCADE_DELETE:
				setCascadeDelete((CascadeDeleteType)newValue);
				return;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__RELATIONSHIP_ROLE_SOURCE:
				setRelationshipRoleSource((RelationshipRoleSourceType)newValue);
				return;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CMR_FIELD:
				setCmrField((CmrFieldType)newValue);
				return;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__ID:
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
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__EJB_RELATIONSHIP_ROLE_NAME:
				setEjbRelationshipRoleName((EjbRelationshipRoleNameType)null);
				return;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__MULTIPLICITY:
				setMultiplicity((MultiplicityType)null);
				return;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CASCADE_DELETE:
				setCascadeDelete((CascadeDeleteType)null);
				return;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__RELATIONSHIP_ROLE_SOURCE:
				setRelationshipRoleSource((RelationshipRoleSourceType)null);
				return;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CMR_FIELD:
				setCmrField((CmrFieldType)null);
				return;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__ID:
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
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__DESCRIPTION:
				return description != null;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__EJB_RELATIONSHIP_ROLE_NAME:
				return ejbRelationshipRoleName != null;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__MULTIPLICITY:
				return multiplicity != null;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CASCADE_DELETE:
				return cascadeDelete != null;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__RELATIONSHIP_ROLE_SOURCE:
				return relationshipRoleSource != null;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__CMR_FIELD:
				return cmrField != null;
			case EjbJar20Package.EJB_RELATIONSHIP_ROLE_TYPE__ID:
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

} //EjbRelationshipRoleTypeImpl
