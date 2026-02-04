/**
 * 
 * Copyright (c) 2009, 2019 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.platform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.modisco.omg.kdm.action.ActionElement;
import org.eclipse.modisco.omg.kdm.code.AbstractCodeElement;
import org.eclipse.modisco.omg.kdm.core.impl.KDMEntityImpl;
import org.eclipse.modisco.omg.kdm.platform.AbstractPlatformElement;
import org.eclipse.modisco.omg.kdm.platform.AbstractPlatformRelationship;
import org.eclipse.modisco.omg.kdm.platform.PlatformPackage;
import org.eclipse.modisco.omg.kdm.source.SourceRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Platform Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.modisco.omg.kdm.platform.impl.AbstractPlatformElementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.platform.impl.AbstractPlatformElementImpl#getPlatformRelation <em>Platform Relation</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.platform.impl.AbstractPlatformElementImpl#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link org.eclipse.modisco.omg.kdm.platform.impl.AbstractPlatformElementImpl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractPlatformElementImpl extends KDMEntityImpl implements AbstractPlatformElement {
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
	 * The cached value of the '{@link #getPlatformRelation() <em>Platform Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPlatformRelationship> platformRelation;

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
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCodeElement> implementation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPlatformElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.ABSTRACT_PLATFORM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceRef> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceRef>(SourceRef.class, this, PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPlatformRelationship> getPlatformRelation() {
		if (platformRelation == null) {
			platformRelation = new EObjectContainmentEList<AbstractPlatformRelationship>(AbstractPlatformRelationship.class, this, PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__PLATFORM_RELATION);
		}
		return platformRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionElement> getAbstraction() {
		if (abstraction == null) {
			abstraction = new EObjectContainmentEList<ActionElement>(ActionElement.class, this, PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION);
		}
		return abstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractCodeElement> getImplementation() {
		if (implementation == null) {
			implementation = new EObjectResolvingEList<AbstractCodeElement>(AbstractCodeElement.class, this, PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__IMPLEMENTATION);
		}
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__PLATFORM_RELATION:
				return ((InternalEList<?>)getPlatformRelation()).basicRemove(otherEnd, msgs);
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION:
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
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__SOURCE:
				return getSource();
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__PLATFORM_RELATION:
				return getPlatformRelation();
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION:
				return getAbstraction();
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__IMPLEMENTATION:
				return getImplementation();
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
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceRef>)newValue);
				return;
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__PLATFORM_RELATION:
				getPlatformRelation().clear();
				getPlatformRelation().addAll((Collection<? extends AbstractPlatformRelationship>)newValue);
				return;
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION:
				getAbstraction().clear();
				getAbstraction().addAll((Collection<? extends ActionElement>)newValue);
				return;
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends AbstractCodeElement>)newValue);
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
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__SOURCE:
				getSource().clear();
				return;
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__PLATFORM_RELATION:
				getPlatformRelation().clear();
				return;
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION:
				getAbstraction().clear();
				return;
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__IMPLEMENTATION:
				getImplementation().clear();
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
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__SOURCE:
				return source != null && !source.isEmpty();
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__PLATFORM_RELATION:
				return platformRelation != null && !platformRelation.isEmpty();
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__ABSTRACTION:
				return abstraction != null && !abstraction.isEmpty();
			case PlatformPackage.ABSTRACT_PLATFORM_ELEMENT__IMPLEMENTATION:
				return implementation != null && !implementation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractPlatformElementImpl
