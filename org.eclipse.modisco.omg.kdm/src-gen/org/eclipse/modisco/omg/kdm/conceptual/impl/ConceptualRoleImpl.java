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
package org.eclipse.modisco.omg.kdm.conceptual.impl;

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
import org.eclipse.modisco.omg.kdm.conceptual.AbstractConceptualElement;
import org.eclipse.modisco.omg.kdm.conceptual.AbstractConceptualRelationship;
import org.eclipse.modisco.omg.kdm.conceptual.ConceptualPackage;
import org.eclipse.modisco.omg.kdm.conceptual.ConceptualRole;
import org.eclipse.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl;
import org.eclipse.modisco.omg.kdm.source.SourceRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.conceptual.impl.ConceptualRoleImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.conceptual.impl.ConceptualRoleImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.conceptual.impl.ConceptualRoleImpl#getConceptualRelation <em>Conceptual Relation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.conceptual.impl.ConceptualRoleImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.conceptual.impl.ConceptualRoleImpl#getConceptualElement <em>Conceptual Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptualRoleImpl extends KDMEntityImpl implements ConceptualRole {
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
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<KDMEntity> implementation;

	/**
	 * The cached value of the '{@link #getConceptualRelation() <em>Conceptual Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptualRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConceptualRelationship> conceptualRelation;

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
	 * The cached value of the '{@link #getConceptualElement() <em>Conceptual Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptualElement()
	 * @generated
	 * @ordered
	 */
	protected AbstractConceptualElement conceptualElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptualRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptualPackage.Literals.CONCEPTUAL_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, ConceptualPackage.CONCEPTUAL_ROLE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KDMEntity> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<KDMEntity>(KDMEntity.class, this, ConceptualPackage.CONCEPTUAL_ROLE__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConceptualRelationship> getConceptualRelation() {
		if (conceptualRelation == null) {
			conceptualRelation = new EObjectContainmentEList<AbstractConceptualRelationship>(AbstractConceptualRelationship.class, this, ConceptualPackage.CONCEPTUAL_ROLE__CONCEPTUAL_RELATION);
		}
		return conceptualRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionElement> getAbstraction() {
		if (abstraction == null) {
			abstraction = new EObjectContainmentEList<ActionElement>(ActionElement.class, this, ConceptualPackage.CONCEPTUAL_ROLE__ABSTRACTION);
		}
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConceptualElement getConceptualElement() {
		if (conceptualElement != null && conceptualElement.eIsProxy()) {
			InternalEObject oldConceptualElement = (InternalEObject)conceptualElement;
			conceptualElement = (AbstractConceptualElement)eResolveProxy(oldConceptualElement);
			if (conceptualElement != oldConceptualElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConceptualPackage.CONCEPTUAL_ROLE__CONCEPTUAL_ELEMENT, oldConceptualElement, conceptualElement));
			}
		}
		return conceptualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConceptualElement basicGetConceptualElement() {
		return conceptualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceptualElement(AbstractConceptualElement newConceptualElement) {
		AbstractConceptualElement oldConceptualElement = conceptualElement;
		conceptualElement = newConceptualElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptualPackage.CONCEPTUAL_ROLE__CONCEPTUAL_ELEMENT, oldConceptualElement, conceptualElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptualPackage.CONCEPTUAL_ROLE__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case ConceptualPackage.CONCEPTUAL_ROLE__CONCEPTUAL_RELATION:
				return ((InternalEList<?>)getConceptualRelation()).basicRemove(otherEnd, msgs);
			case ConceptualPackage.CONCEPTUAL_ROLE__ABSTRACTION:
				return ((InternalEList<?>)getAbstraction()).basicRemove(otherEnd, msgs);
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
			case ConceptualPackage.CONCEPTUAL_ROLE__SOURCE:
				return getSource();
			case ConceptualPackage.CONCEPTUAL_ROLE__IMPLEMENTATION:
				return getImplementation();
			case ConceptualPackage.CONCEPTUAL_ROLE__CONCEPTUAL_RELATION:
				return getConceptualRelation();
			case ConceptualPackage.CONCEPTUAL_ROLE__ABSTRACTION:
				return getAbstraction();
			case ConceptualPackage.CONCEPTUAL_ROLE__CONCEPTUAL_ELEMENT:
				if (resolve) return getConceptualElement();
				return basicGetConceptualElement();
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
			case ConceptualPackage.CONCEPTUAL_ROLE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_ROLE__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends KDMEntity>)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_ROLE__CONCEPTUAL_RELATION:
				getConceptualRelation().clear();
				getConceptualRelation().addAll((Collection<? extends AbstractConceptualRelationship>)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_ROLE__ABSTRACTION:
				getAbstraction().clear();
				getAbstraction().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case ConceptualPackage.CONCEPTUAL_ROLE__CONCEPTUAL_ELEMENT:
				setConceptualElement((AbstractConceptualElement)newValue);
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
			case ConceptualPackage.CONCEPTUAL_ROLE__SOURCE:
				getSource().clear();
				return;
			case ConceptualPackage.CONCEPTUAL_ROLE__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case ConceptualPackage.CONCEPTUAL_ROLE__CONCEPTUAL_RELATION:
				getConceptualRelation().clear();
				return;
			case ConceptualPackage.CONCEPTUAL_ROLE__ABSTRACTION:
				getAbstraction().clear();
				return;
			case ConceptualPackage.CONCEPTUAL_ROLE__CONCEPTUAL_ELEMENT:
				setConceptualElement((AbstractConceptualElement)null);
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
			case ConceptualPackage.CONCEPTUAL_ROLE__SOURCE:
				return source != null && !source.isEmpty();
			case ConceptualPackage.CONCEPTUAL_ROLE__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
			case ConceptualPackage.CONCEPTUAL_ROLE__CONCEPTUAL_RELATION:
				return conceptualRelation != null && !conceptualRelation.isEmpty();
			case ConceptualPackage.CONCEPTUAL_ROLE__ABSTRACTION:
				return abstraction != null && !abstraction.isEmpty();
			case ConceptualPackage.CONCEPTUAL_ROLE__CONCEPTUAL_ELEMENT:
				return conceptualElement != null;
		}
		return super.eIsSet(featureID);
	}

} //ConceptualRoleImpl
